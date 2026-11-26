package DAY2.Session3;
import java.util.Scanner;

public class Prg12ReportCard {

    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public static char getGrade(double average) {
        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';
        return 'F';
    }

    public static boolean isPassed(char grade) {
        return grade != 'F';
    }

    public static void printReport(String name, int[] marks) {
        double avg = calculateAverage(marks);
        char grade = getGrade(avg);
        boolean passed = isPassed(grade);
        System.out.printf("Name=%s, Average=%.2f, Grade=%c, Passed=%b%n", name, avg, grade, passed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String name = sc.next();
            int[] marks = new int[5];
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }
            printReport(name, marks);
        }
        sc.close();
    }
}
