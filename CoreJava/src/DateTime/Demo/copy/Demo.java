package Demo.copy;
//import java.time.LocalDate;
//import java.util.stream.Collectors;
//
//public class Demo {
//    public static void main(String[] args) {
//
//        // Current date
//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        
//        // Specific date
//        LocalDate custom = LocalDate.of(2026, 1, 22);
//        System.out.println(custom);
//        
//        // Get fields
//        System.out.println(today.getYear());
//        System.out.println(today.getMonth());
//        System.out.println(today.getDayOfMonth());
//
//        // Add / Subtract
//        System.out.println(today.plusDays(10));
//        System.out.println(today.minusMonths(2));
//        System.out.println(today.datesUntil(LocalDate.parse("2026-04-06")).count());
//        // Compare
//        System.out.println(today.isAfter(custom));
//        System.out.println(today.isBefore(custom));
//        System.out.println(today.compareTo(custom));
//    }
//}


//import java.time.LocalTime;
//
//class Demo {
//    public static void main(String[] args) {
//
//        LocalTime now = LocalTime.now();
//        System.out.println(now);
//
//        LocalTime custom = LocalTime.of(14, 30, 15);
//        System.out.println(custom);
//
//        System.out.println(now.plusHours(2));
//        System.out.println(now.minusMinutes(15));
//        System.out.println(custom.isAfter(now));
//        System.out.println(LocalTime.parse("00:59:58"));//string to time
//        System.out.println(now.compareTo(custom));// return -1,0,or 1
//    }
//}


//import java.time.LocalDateTime;
//
//public class Demo {
//    public static void main(String[] args) {
//
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//
//        LocalDateTime custom = LocalDateTime.of(2026, 2, 22, 10, 30);
//
//        System.out.println(now.plusDays(5));
//        System.out.println(now.minusHours(3));
//        System.out.println(LocalDateTime.parse("2026-02-21T10:56"));
//        System.out.println(now.isAfter(custom));
//        System.out.println(now.compareTo(custom));//comparing
//        System.out.println(now.getDayOfWeek().name());//returns an ENUM
//    }
//}

//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class Demo {
//    public static void main(String[] args) {
//    	//date
//        LocalDate date = LocalDate.now();
//
//        DateTimeFormatter formatter =
//                DateTimeFormatter.ofPattern("dd-MM-yyyy");
//
//        String formatted = date.format(formatter);
//        System.out.println(formatted);
//
//        // Parsing string to date
//        LocalDate parsed = LocalDate.parse("22-02-2026", formatter);
//        System.out.println(parsed);
//        
//        //dateTime
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        DateTimeFormatter formatter2 =
//                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
//
//        String formatted2 = dateTime.format(formatter2);
//        System.out.println(formatted2);
//
//        // Parsing string to date
//        LocalDateTime parsed2 = LocalDateTime.parse("22-02-2026 11:19", formatter2);
//        System.out.println(parsed2.format(formatter2));
//        
//        DateTimeFormatter formatter3 =
//                DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm");
//
//        String formatted3 = dateTime.format(formatter3);
//        System.out.println(formatted3);
//
//        // Parsing string to date
//        LocalDateTime parsed3 = LocalDateTime.parse("22-Jan-2026 11:19", formatter3);
//        System.out.println(parsed3.format(formatter3));
//        
//    }
//}


//period
//import java.time.*;
//
//public class Demo {
//    public static void main(String[] args) {
//
//        LocalDate birthDate = LocalDate.of(2004, 1, 20);
//        LocalDate today = LocalDate.now();
//
//        Period age = Period.between(birthDate, today.plusDays(1));
//        System.out.println("Years: " + age.getYears());
//        System.out.println("Months: " + age.getMonths());
//        System.out.println("Days: " + age.getDays());
//    }
//}

//duration
//import java.time.*;
//
//public class Demo {
//    public static void main(String[] args) {
//
//        LocalTime start = LocalTime.of(10, 0);
//        LocalTime end = LocalTime.of(12, 30);
//
//        Duration duration = Duration.between(start, end);
//        System.out.println(duration.toSeconds());
//        System.out.println("Minutes: " + duration.toMinutes());
//        System.out.println("Hours: " + duration.toHours());
//    }
//}


//ZonedDateTime
import java.time.ZonedDateTime;
import java.time.ZoneId;
public class Demo{
	public static void main(String[] args) {
		ZonedDateTime indiaTime =
			    ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

			ZonedDateTime usTime =
			    ZonedDateTime.now(ZoneId.of("America/New_York"));

		System.out.println(indiaTime);
		System.out.println(usTime);
		
		ZonedDateTime indiaTime1 =
			    ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

			ZonedDateTime usTime1 =
			    indiaTime1.withZoneSameInstant(
			        ZoneId.of("America/New_York")
			    );

			System.out.println("India: " + indiaTime1);
			System.out.println("US: " + usTime1);
			//withZoneSameInstant()
			//Same moment, different zone
			
			ZonedDateTime meeting =
				    ZonedDateTime.of(
				        2026, 2, 22,
				        8, 0, 0, 0,
				        ZoneId.of("Asia/Kolkata")
				    );

				System.out.println(meeting);
				ZonedDateTime usTime2 =
					    meeting.withZoneSameInstant(
					        ZoneId.of("America/New_York")
					    );

					System.out.println("India: " + meeting);
					System.out.println("US: " + usTime2);
	}

}