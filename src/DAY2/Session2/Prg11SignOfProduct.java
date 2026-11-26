package DAY2.Session2;

class ProductSign {
    public int arraySign(int[] nums) {
        int len = nums.length;
        int n=0;
        for (int i=0;i<len;i++) {
            if (nums[i]==0) return 0;
            if (nums[i]<0) n++;
        }
        if ((n%2)==0) return 1;
        else return -1;
    }
}

public class Prg11SignOfProduct {
    public static void main(String[] args) {
        ProductSign productSign = new ProductSign();
        int[] nums = {-1, -2, -3, 4}; 
        int result = productSign.arraySign(nums);
        System.out.println("Sign of the product: " + result);
    }
    
}
