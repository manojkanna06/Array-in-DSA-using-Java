/*[40,10,30,20]
before
bubble takes 2 elemnt n so on,compare and shift it
pass=arr.length-1
so 1st pass 40,10
[10,40,30,20]
 40,30
[10,30,40,20]
 40,20
[10,30,20,40]
2nd pass
10,30
[10,30,20,40]
30,20
[10,20,30,40]
3rd pass
10,20
[10,20,30,40]
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
