package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program4 {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		LocalDate d04 = LocalDate.now();
		LocalDateTime d05 = LocalDateTime.now();
		Instant d06 = Instant.now();

		LocalDate pastWeekDate = d04.minusDays(7);
		LocalDate nextWeekDate = d04.plusDays(7);

		LocalDateTime pastWeekLocalDate = d05.minusDays(7);
		LocalDateTime nextWeekLocalDate = d05.plusDays(7);

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

		System.out.println("Semana anterior = " + pastWeekDate.format(fmt1));
		System.out.println("Proxima semana = " + nextWeekDate.format(fmt1));

		System.out.println();
		System.out.println("Semana anterior = " + pastWeekLocalDate.format(fmt2));
		System.out.println("Proxima semana = " + nextWeekLocalDate.format(fmt2));

		System.out.println();
		System.out.println("Semana anterior = " + fmt3.format(pastWeekInstant));
		System.out.println("Proxima semana = " + fmt3.format(nextWeekInstant));

		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay()); /// Converte Date para DateTime
		Duration t2 = Duration.between(pastWeekLocalDate, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println();
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}