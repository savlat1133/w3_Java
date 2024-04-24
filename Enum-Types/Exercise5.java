// 5. Write a Java program that defines an enum called "Months" with constants representing the months of the year.

 public class Main {
   public enum Months {
     JANUARY,
     FEBRUARY,
     MARCH,
     APRIL,
     MAY,
     JUNE,
     JULY,
     AUGUST,
     SEPTEMBER,
     OCTOBER,
     NOVEMBER,
     DECEMBER
   }

   public static void main(String[] args) {
     Months currentMonth = Months.MAY;
     System.out.println("Current month: " + currentMonth);
   }
 }
