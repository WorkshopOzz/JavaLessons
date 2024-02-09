import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        //        Класс Date

        Date date = new Date();
        System.out.println(date);
        //    long time = date.getTime(); отсчёт в мс с 1970 г.

        Date date1 = new Date(1000000); //Можно задать дату вписав количество мс прошедших с 1970
        date.setMonth(0); //Отсчёт месяцев как в массиве с 0
        date.setMonth(Calendar.JANUARY);
        date.setYear(2008); // setYear = 1900 + 2008 = 3908
        date.setDate(10);
        date.setMonth(Calendar.JANUARY);
        date.setYear(108);
        System.out.println(date.equals(date1)); //сравнение дат date.after(before)(date1));

//        Класс Calendar

        Calendar date2 = Calendar.getInstance();
        date2.set(2008,Calendar.FEBRUARY,10);
        date2.add(Calendar.YEAR,2);
        date2.add(Calendar.MONTH, 2);

//        Next third classes LocalDate
        LocalDate date3 = LocalDate.now();
        System.out.println(date3);
        LocalDate date4 = LocalDate.of(2008, 2,10);
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        date3.isAfter(date4);
        date3 = date3.plusDays(10);
      //Ввод даты из строки
//        String input = new Scanner(System.in).nextLine();
        DateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm"); // Задаем формат ввода даты
//        Date parse = dataFormat.parse(input);
//        System.out.println(parse);
        Date date5 = new Date();
        System.out.println(dataFormat.format(date5));
//        Localdate формат вывода даты

        LocalDate date6 = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(formatter.format(date6));





    }
}