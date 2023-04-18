package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String nome;
	private WorkerLevel level;
	private Double baseSalario;

	private Departament departamento;
	private List<HourContract> contratos = new ArrayList<>();

	public Worker() {
	}

	public Worker(String nome, WorkerLevel level, Double baseSalario, Departament departamento) {
		this.nome = nome;
		this.level = level;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departament getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departament departamento) {
		this.departamento = departamento;
	}

	public List<HourContract> getContratos() {
		return contratos;
	}

	public void addContrato(HourContract contract) {
		contratos.add(contract);
	}

	public void removeContrato(HourContract contract) {
		contratos.remove(contract);
	}

	public double income(int year, int month) {
		double sum = baseSalario;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contratos) {
			cal.setTime(c.getdata());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.AtualizaSalario();
			}
		}
		return sum;
	}
}
