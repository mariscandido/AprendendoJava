package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contrato, int meses) {

		double parcelaBasica = contrato.getTotalValue() / meses;

		for (int i = 1; i <= meses; i++) {

			LocalDate dueDate = contrato.getDate().plusMonths(i);

			double juros = onlinePaymentService.interest(parcelaBasica, i);
			double taxa = onlinePaymentService.paymentFee(parcelaBasica + juros);
			double parcela = parcelaBasica + juros + taxa;

			contrato.getInstallment().add(new Installment(dueDate, parcela));

		}
	}

}
