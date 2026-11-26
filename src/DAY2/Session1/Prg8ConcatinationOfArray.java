package DAY2.Session1;

public class Prg8ConcatinationOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
            result[i + n] = arr[i];
        }

        System.out.print("Concatenated Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}
