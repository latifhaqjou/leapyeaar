package darspk;

import java.util.Scanner;

public class Darsc {
    public static void main(String[] args) {
     Scanner cab=new Scanner(System.in);
     System.out.print("inter a year  :  ");
     int cab1=cab.nextInt();
   
     boolean res=((cab1%4==0 && cab1%100!=0) || (cab1%4==0 && cab1%100==0 && cab1%400==0));
     if(res==true)
     {
        System.out.println("its a leep year");
     }
     else
    {
         System.out.println("its not a leap year");
    } 
    }
}
