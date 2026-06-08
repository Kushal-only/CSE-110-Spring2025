// Task 16
public class Task16 {
  public static void main(String [] args) {
    float minutes = 3456789;
    int years = (int)minutes/(24*60*365);
    float year = minutes/(24*60*365);
    float day = year-years;
    float days = day*365;
    int tdays = (int)days;    
 System.out.println(years+" years and "+tdays +" days");
  }
}
    
  