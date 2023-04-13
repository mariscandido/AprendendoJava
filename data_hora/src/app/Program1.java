package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.now();
		LocalDateTime dh01 = LocalDateTime.now();
		Instant dg01 = Instant.now();

		System.out.println("Data local: " + d01.toString());
		System.out.println("Data-Hora local: " + dh01.toString());
		System.out.println("Data-Hora global: " + dg01.toString());

		LocalDate d02 = LocalDate.parse("2023-04-12");
		LocalDateTime dh02 = LocalDateTime.parse("2022-04-12T01:30:26");
		Instant dg02 = Instant.parse("2022-04-12T01:30:26Z");
		Instant dg03 = Instant.parse("2022-04-12T01:30:26-03:00");

		System.out.println();	
		System.out.println("Data local: " + d02.toString());
		System.out.println("Data-Hora local: " + dh02.toString());
		System.out.println("Data-Hora global: " + dg02.toString());
		System.out.println("Data-Hora global (-3:00): " + dg03.toString());
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate d03 = LocalDate.parse("12/04/2023", fmt1);
		LocalDateTime dh03 = LocalDateTime.parse("12/04/2023 01:30", fmt2);
		
		System.out.println();	
		System.out.println("Data local Formatada: " + d03.toString());
		System.out.println("Data-Hora local Formatada: " + dh03.toString());
		
		
		LocalDate d04 = LocalDate.of(2023, 04, 12);
		LocalDateTime dh04 = LocalDateTime.of(2023, 04, 12, 19, 47);

		System.out.println();	
		System.out.println("Data local of: " + d04.toString());
		System.out.println("Data-Hora local of: " + dh04.toString());
		
	}

}
