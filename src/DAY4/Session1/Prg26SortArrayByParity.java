package DAY4.Session1;
import java.util.*;

public class Prg26SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++; 
            } else if (nums[right] % 2 != 0) {
                right--; 
            } else {
               
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Prg26SortArrayByParity solution = new Prg26SortArrayByParity();
        int[] sortedArray = solution.sortArrayByParity(nums);

        System.out.println("Sorted Array by Parity:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}


