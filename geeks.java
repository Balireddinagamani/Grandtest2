import java.util.Scanner;
public class geeks{
  public static main(String[] args){
    int upper=0,lower=0,number=0,special=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String s=sc.nextLine();
    String res=" ";
    for(int i=0;i<s.length();i+=2)
      res+=s.charAt(i);
      res+="";
    for(int i=1;i<s.length();i+=2)
      res+=s.charAt(i);
  }
  System.out.println(res.toString());
}
}
  