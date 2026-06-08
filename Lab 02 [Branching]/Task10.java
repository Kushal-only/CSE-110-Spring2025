// Task10
import java.util.Scanner;
public class Task10 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka): ");
    int pay = sc.nextInt();
    System.out.println("Enter the amount, customer gave(Taka): ");
    int gave = sc.nextInt();
    int ret = gave-pay;
    int noteCountFor100Tk = 0;
    int noteCountFor50Tk = 0;
    int noteCountFor20Tk = 0;
    int noteCountFor10Tk = 0;
    int noteCountFor5TkCoin = 0;
    int noteCountFor2TkCoin = 0;
    int noteCountFor1TkCoin = 0;
    int temp100 = 0;
    int temp50 = 0;
    int temp20 = 0;
    int temp10 = 0;
    int temp5 = 0;
    int temp2 = 0;
    int temp1 = 0;
    if(ret == 0)
    {
      System.out.println("The returned amount is 0 taka");
    }
    else if(ret<0)
    {
      System.out.println("Please give "+(ret*-1)+" tk more");
    }
    else if(ret>0)
    {
      System.out.println("The returned amount is "+ret);
      noteCountFor100Tk = ret/100;
      System.out.println("100 taka note: "+noteCountFor100Tk);
      temp100 = ret%100;
    
      noteCountFor50Tk = temp100/50;
      System.out.println("50 taka note: "+noteCountFor50Tk);
      temp50 = temp100%50;
    
      noteCountFor20Tk = temp50/20;
      System.out.println("20 taka note: "+noteCountFor20Tk);
      temp20 = temp50%20;
      
      noteCountFor10Tk = temp20/10;
      System.out.println("10 taka note: "+noteCountFor10Tk);
      temp10 = temp20%10;
    
      noteCountFor5TkCoin = temp10/5;
      System.out.println("5 taka coin: "+noteCountFor5TkCoin);
      temp5 = temp10%5;
    
      noteCountFor2TkCoin = temp5/2;
      System.out.println("2 taka coin: "+noteCountFor2TkCoin);
      temp2 = temp5%2;
    
      noteCountFor1TkCoin = temp2/1;
      System.out.println("1 taka coin: "+noteCountFor1TkCoin);
    }
    
    
  }
}

                         