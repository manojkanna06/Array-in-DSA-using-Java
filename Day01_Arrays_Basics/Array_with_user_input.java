import java.util.*;
public class Array_with_user_input {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array declaration and input
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter array values:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // Traversal
        System.out.println("Original array:");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        // Insertion
        System.out.print("\nEnter position to insert: ");
        int position = sc.nextInt();
        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();
        for (int i = n; i > position; i--){
            arr[i] = arr[i - 1];
        }
        arr[position] = value;
        n++;
        System.out.println("After insertion:");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        // Deletion
        System.out.print("\nEnter position to delete: ");
        position = sc.nextInt();
        for (int i = position; i < n - 1; i++){
            arr[i] = arr[i + 1];
        }
        n--;
        System.out.println("After deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        //searching
            System.out.println("Value to search");
            int key=sc.nextInt();
            for(int i=0;i<=arr.length();i++){
                  if(arr[i]==key){
                        System.out.println("Element found at"+arr[i]);
                  }
            }
        //max
        int max = arr[0];
        for (int i = 1; i <=arr.length-1; i++){     
               if (arr[i] > max) {
                     max=arr[i];
    }
}
            System.out.println("Maximum=" + max);
       //min
            int min=arr[0];
            for(int i=0;i<=arr.length;i++){
                  if(arr[i]<min){
                        min=arr[i];
                  }
            }
            System.out.println("Minimum="+min);     
    }
}
