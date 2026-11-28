/*
Program 2: Student Rank Sorter (Medium)
Problem Statement:
A school ranking system sorts students by their total marks. Given an array of student marks:
1. Implement selection sort to sort in descending order (highest marks first).
2. Implement bubble sort to sort in ascending order.
3. Print rank numbers (1st, 2nd, 3rd...) with the sorted marks.
4. Also sort using Arrays.sort() and show it produces the same ascending result.
Examples:
• Input: marks=[64, 25, 12, 22, 11].
• Selection sort (desc): [64, 25, 22, 12, 11]. Rank 1: 64, Rank 2: 25, etc.
• Bubble sort (asc): [11, 12, 22, 25, 64].
• Arrays.sort: [11, 12, 22, 25, 64].
*/

package DAY4.Session1;
import java.util.*;

public class Prg24RankSorter {
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
           
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
            }
        }

        public static void bubbleSortAscending(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void printRanks(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Rank " + (i + 1) + ": " + arr[i]);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of students: ");
            int n = scanner.nextInt();
            int[] marks = new int[n];

            System.out.println("Enter marks of students:");
            for (int i = 0; i < n; i++) {
                marks[i] = scanner.nextInt();
            }

            // Selection sort in descending order
            selectionSortDescending(marks);
            System.out.println("\nSelection Sort (Descending):");
            printRanks(marks);

            // Bubble sort in ascending order
            bubbleSortAscending(marks);
            System.out.println("\nBubble Sort (Ascending):");
            printRanks(marks);

            // Arrays.sort() in ascending order
            Arrays.sort(marks);
            System.out.println("\nArrays.sort() (Ascending):");
            printRanks(marks);
        }
    }
    

