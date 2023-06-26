import java.util.Scanner;
public class oddindexCharacters{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string to encrypt");
    String a = sc.nextLine();
    String encrypted="";
    for(int i=0; i< a.length(); i +=2)
      {
        encrypted +=a.charAt(i);
      }
    for(int i = 1; i < a.length(); i +=2)
      {
        encrypted +=a.charAt(i);
        System.out.println("encrypted string:" +encrypted);
      }
  }
        
    