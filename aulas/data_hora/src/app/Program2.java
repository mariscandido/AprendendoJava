package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

	public static void main(String[] args) {

		LocalDate d02 = LocalDate.parse("2023-04-12");
		LocalDateTime dh02 = LocalDateTime.parse("2022-04-12T01:30:26");
		Instant dg02 = Instant.parse("2022-04-12T01:30:26Z");

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		System.out.println("dd/MM/yyyy = " + d02.format(fmt1));
		System.out.println("dd/MM/yyyy = " + fmt1.format(d02));
		System.out.println("dd/MM/yyyy = " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println("dd/MM/yyyy = " + dh02.format(fmt1));
		System.out.println("dd/MM/yyyy HH:mm = " + dh02.format(fmt2));
		System.out.println("ISO_DATE_TIME = " + dh02.format(fmt4));

		System.out.println("dd/MM/yyyy HH:mm (fuso local) = " + fmt3.format(dg02));
		System.out.println("ISO_INSTANT = " + fmt5.format(dg02));
		System.out.println("toString = " + dg02.toString());

	}

}
