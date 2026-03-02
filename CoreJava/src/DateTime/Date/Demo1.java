package DateTime.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		LocalDateTime dateBefore = LocalDateTime.now();
		LocalDate dateAfter = LocalDate.of(2026, Month.MARCH, 25);
//		Period p=Period.between(dateBefore, dateAfter);
//		long diffInDays = ChronoUnit.DAYS.between(dateBefore, dateAfter);
//		long diffInMonths = ChronoUnit.MONTHS.between(dateBefore, dateAfter);
//		long diffInYears = ChronoUnit.YEARS.between(dateBefore, dateAfter)
//		System.out.println(diffInDays);
//		System.out.println(dateBefore);
		LocalDateTime t=LocalDateTime.now();
		System.out.println(t.getNano());
		DateTimeFormatter dF=DateTimeFormatter.ofPattern("Dd-Mm-yYy HH:Mm:Ss");
		System.out.println(t.format(dF));

	}

}
