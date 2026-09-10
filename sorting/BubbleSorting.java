/*[40,10,30,20]
before
bubble takes 2 elemnt n so on,compare and shift it
pass=arr.length-1
so outer loop i<arr.length-1,give i=0,1,2
inner loop j<arr.length-1-i,give j<3,j=0,1,2
so 1st pass 40,10 i=0,j<3
[10,40,30,20]
 40,30
[10,30,40,20]
 40,20
[10,30,20,40]
2nd pass i=1,j<2
10,30
[10,30,20,40]
30,20
[10,20,30,40]
3rd pass i=2,j<1
10,20
[10,20,30,40]
pass 3pass.so 0,1,2
Best Case	O(n)	Array already sorted
Average Case	O(n²)	Multiple comparisons + swaps
Worst Case	O(n²)	Array is reverse sorted
Space	O(1)	Only temp is used
* Important: O(n) best case is only for the optimized Bubble Sort with a swapped flag.
The exact program we used does not have that optimization, so its best case is also O(n²).
*/

class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {40, 10, 30, 20};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
