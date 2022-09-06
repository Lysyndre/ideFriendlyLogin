package Entry;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Arrays;


public class Timer {

        public static void main(String[] args) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            //LocalDateTime Stringvalueof = now;
            System.out.println(now);
            //charAt();
            String tiem = String.valueOf(now);
            int year = Year.now().getValue();
            System.out.println(year);
            System.out.println(tiem);


        }


}
