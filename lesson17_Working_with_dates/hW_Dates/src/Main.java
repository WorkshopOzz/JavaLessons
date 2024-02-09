//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

       Wine caberne = new Wine("Inkerman","Caberne","Russia", "12-07-2020","Самый прекрасный букет вкуса");

//       System.out.println("Марка вина: " + caberne.getLabel() + "\n" + "Название вина: " + caberne.getName() + "\n" + "Дата сбора урожая: " + caberne.getBottlingDate() + "\n" + "Страна происхождения: " + caberne.getCountryOfOrigin() + "\n" + "Описание: " + caberne.getDescription() );
        System.out.println(caberne.info());
       System.out.println(caberne.infoWineAging());
    }
}