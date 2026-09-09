import java.util.*;
public class ArrayBasic {
    public static void main(String[] args) {
        //decleration
      int[] arr=new int[5];
      arr=new int[]{10,20,30,40,50};
        //traversal
      for(int i=0;i<=arr.length-1;i++){
        System.out.print(arr[i]+" ");
      }
        //insertion
      int position=2;
      int value=35;
      for(int i=arr.length-1;i>position;i--){
        arr[i]=arr[i-1];
      }arr[position]=value;
      System.out.println();
      for(int i=0;i<=arr.length-1;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
