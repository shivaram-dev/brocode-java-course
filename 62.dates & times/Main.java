import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) {

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        // LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        // LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        
        // System.out.println(date);
        System.out.println(time);
        // System.out.println(dateTime);
        System.out.println(instant);
        
        // Custom format
        LocalDateTime datetime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = datetime.format(formatter);

        System.out.println(newDateTime);

        LocalDate date = LocalDate.of(2024, 12, 25);
        // LocalDateTime dateTime1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        // LocalDateTime dateTime1 = LocalDateTime.of(2025, 1, 2, 0, 0, 0);
        LocalDateTime dateTime1 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        System.out.println(date);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

        if(dateTime1.isBefore(dateTime2)) {
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        }
        else if(dateTime1.isAfter(dateTime2)) {
            System.out.println(dateTime1 + " is later than " + dateTime2);
        }
        else if(dateTime1.isEqual(dateTime2)) {
            System.out.println(dateTime1 + " is equal to " + dateTime2);
        }
    }
}
