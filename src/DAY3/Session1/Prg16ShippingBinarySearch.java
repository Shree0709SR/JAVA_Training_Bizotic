package DAY3.Session1;

public class Prg16ShippingBinarySearch {
    public static int minCapacity(int arr[], int days) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > low) {
                low = arr[i];
            }
            high += arr[i];
        }
        int capacity = 0;
        while(low<=high){
            int mid =(low+high)/2;
            int totaldays = 1;
            int currentLoad = 0;
            for(int arr1: arr){
                if(currentLoad + arr1 > mid){
                    totaldays++;
                    currentLoad = arr1;
                } else {
                    currentLoad += arr1;
                }
            }
            if(totaldays <= days){
                capacity = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return capacity;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println("The minimum capacity to ship the packages in given days is: " + minCapacity(arr,days));
    }
}
