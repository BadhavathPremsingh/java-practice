import java.time.*;
import javax.swing.plaf.synth.SynthSplitPaneUI;
class DaTi2
{
 public static void main(String[] args)
 {
  LocalDate date=LocalDate.now();
  System.out.println(date);
  int day=date.getDayOfMonth();
  int year=date.getYear();
  int month=date.getMonthValue();
  System.out.println(day+year+month);
 }
}