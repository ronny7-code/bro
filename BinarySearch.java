import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Binary search is only used if the array is sorted

        int num;

        System.out.print("Enter a number you want to find in the array: ");
        num = scanner.nextInt();

        int[] arr = {2, 3, 5, 7, 9, 11, 16, 19, 23, 25};
        int target = num;

        int ans = binarySearch(arr, target);

        if(ans == -1){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index " + ans);
        }

        scanner.close();
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(target >= 0){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1 ;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
