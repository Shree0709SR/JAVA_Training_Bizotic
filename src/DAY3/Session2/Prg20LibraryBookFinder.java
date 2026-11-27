/*
Program 1: Library Book Finder (Easy)
Problem Statement:
A library search system helps users find books. Given a sorted array of book IDs and a target book 
ID, implement iterative binary search to find the book's position. If found, print "BOOK FOUND AT 
POSITION X" (1-indexed). If not found, print "BOOK NOT FOUND".
Examples:
• Input: bookIDs=[101, 203, 305, 407, 509], target=305. Output: BOOK FOUND AT 
POSITION 3.
• Input: bookIDs=[101, 203, 305, 407, 509], target=400. Output: BOOK NOT FOUND */
package DAY3.Session2;
import java.util.Scanner;

public class Prg20LibraryBookFinder {
    public static int binarySearch(int[] bookIDs, int target) {
        int left = 0;
        int right = bookIDs.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (bookIDs[mid] == target) {
                return mid + 1; 
            } else if (bookIDs[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        int[] bookIDs = new int[n];
        System.out.println("Enter the book IDs: ");
        for (int i = 0; i < n; i++) {
            bookIDs[i] = sc.nextInt();
        }
        System.out.print("Enter the target book ID: ");
        int target = sc.nextInt();

        int position = binarySearch(bookIDs, target);
        if (position != -1) {
            System.out.println("BOOK FOUND AT POSITION " + position);
        } else {
            System.out.println("BOOK NOT FOUND");
        }
    }
    
}
