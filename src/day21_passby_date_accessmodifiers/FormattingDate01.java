package day21_passby_date_accessmodifiers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingDate01 {

	public static void main(String[] args) {
		
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        
		LocalDate date = LocalDate.now();

		System.out.println(dtf.format(date)); // 10-Mar-2020

	}

}
