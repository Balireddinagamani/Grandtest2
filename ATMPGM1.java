import java.util.Scanner;
public class ATMPGM1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int amount,notes500,notes200,notes100;
    System.out.println(" enter the  ATM amount withdraw");
    amount =sc.nextInt();
    if(amount%100!=0){
      System.out.println("found amount! enter a multiple of 100");
      return;
    }
    notes500=amount/500;
    amount=amount%500;
    notes200=amount/200;
    amount=amount%200;
    notes100=amount/100;
    System.out.println("500:" +notes500);
    System.out.println("200:" +notes200);
    System.out.println("100:" +notes100);
  }
}