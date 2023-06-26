import java.util.Scanner;
public class Cricketpgm6{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    String s = scanner.nextLine();
    scanner.close();
    if(checkSuperstition(s))
    {
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
  public static boolean checkSuperstition(String s)
  {
    if(s.length()!=3)
    {
      return false;
      char[] chars=s.toCharArray();
      if(chars[0]==chars[1]||chars[1]==chars[2]||chars[0]==chars[2])
      {
        return false;
      }
      return true;
    }
  }
      
    