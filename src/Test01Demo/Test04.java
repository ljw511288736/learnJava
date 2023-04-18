package Test01Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test04 {
    public static void main(String[] args) throws ParseException {
        //JDK7
        String birthday = "1997-10-31";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        long todayTime = System.currentTimeMillis();
        long time = todayTime - birthdayTime;
        System.out.println(time / 1000 / 3600 / 24);

        //JDK8
        LocalDate ld1 = LocalDate.of(1997, 10, 31);
        LocalDate ld2 = LocalDate.now();
        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);
    }
}
