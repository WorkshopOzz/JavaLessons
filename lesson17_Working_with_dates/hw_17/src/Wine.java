import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public class Wine {
   private String label;
    private String name;
    private String countryOfOrigin;
    private String bottlingDate;
    private String description;
    private LocalDate date; // задать можно с помощью LocalDate.of(2001,1,1)

   public String infoWineAging () {
       String infoWinAging = "Нет данных";
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       LocalDate bottlingDate = LocalDate.parse(getBottlingDate(),formatter);
       LocalDate now = LocalDate.now();
       Period dif = Period.between(bottlingDate, now);
        int days = dif.getDays();
        int mounths = dif.getMonths();
        int years = dif.getYears();
        if (days > 0 && mounths > 0 && years > 1) {
            infoWinAging = "Выдержка вина " + getName() + " составляет " + days + " дн. " + mounths + " мес. " + years + " г." ;
             }
        else if (days > 0 && mounths > 0 && years == 0) {
            infoWinAging = "Выдержка вина " + getName() + " составляет: " + days + " дн. " + mounths + " мес.";
        }

       return  infoWinAging;
   }
   public void winePeriod(LocalDate now) {
       int years = Period.between(date,now).getYears();
       System.out.println("Выдержка вина " + getName());
   }
    public Wine() {
    }

    public Wine(String lable, String name, String countryOfOrigin, String bottlingDate, String description) {
        this.label = lable;
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.bottlingDate = bottlingDate;
        this.description = description;
    }
    public String info(){
     String info = "Марка вина: " + getLabel() + "\n" + "Название вина: " + getName() + "\n" + "Дата сбора урожая: " + getBottlingDate() + "\n" + "Страна происхождения: " + getCountryOfOrigin() + "\n" + "Описание: " + getDescription();
   return info;
   }



    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getBottlingDate() {
        return bottlingDate;
    }

    public void setBottlingDate(String bottlingDate) {
        this.bottlingDate = bottlingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
