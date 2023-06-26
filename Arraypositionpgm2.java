import java.util.Arrays;
public class Arraypositionpgm2{
  public static void main(String[] args);
  int[] arr={1,2,3,4,5,6,7,8,9,10};
  int n=5;
  int m=3;
  int[] shiftedArr=new int [arr.length];
  for(int i=0;i<arr.length;i++)
  {
    shiftedArr[i-m+n*arr.length) %arr.length] = arr[i];
  }
System.out.println("original array" +Arrays.toString(arr));
System.out.println("shifted array:" +Arrays.toString(shiftedArr));
}
}
    
