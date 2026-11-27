package DAY3.Session1;

public class Prg15MinSpeedBinarySearch {
    public static int speed (int arr[], int h){
        int low = 0;
        int high = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > high) {
                high = arr[i];
            }
        }
        int speed = 0;
        while(low<=high){
            int mid =(low+high)/2;
            int totalhours = 0;
            for(int arr1: arr){
                totalhours += (arr1+mid-1)/mid;
            }
            if(totalhours <= h){
                speed = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return speed;
    }

    public static void main(String[] args) {
        int arr[] = {3,6,7,11};
        int h = 8;
        System.out.println("The minimum speed to finish the work in given hours is: " + speed(arr,h));
    }
    
}
