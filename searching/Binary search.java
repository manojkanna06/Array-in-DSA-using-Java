class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 60;
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            }
            else if (target > arr[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
/*as int range from -2,148,483,647 to 2,147,483,647
start = 2,000,000,000
end   = 2,100,000,000
    2,000,000,000 + 2,100,000,000
= 4,100,000,000 ,exceed limit
so,use start+(end-start)/2*/
class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 60;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            } 
            else if (arr[mid] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}
