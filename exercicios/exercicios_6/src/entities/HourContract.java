package entities;

import java.util.Date;

public class HourContract {
	private Date data;
	private Double valorPorHora;
	private Integer horas;

	public HourContract() {
	}

	public HourContract(Date data, Double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Date getdata() {
		return data;
	}

	public void setdata(Date data) {
		this.data = data;
	}

	public Double getvalorPorHora() {
		return valorPorHora;
	}

	public void setvalorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer gethoras() {
		return horas;
	}

	public void sethoras(Integer horas) {
		this.horas = horas;
	}

	public double AtualizaSalario() {
		return (valorPorHora * horas);
	}
}
