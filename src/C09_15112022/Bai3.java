package C09_15112022;

public class Bai3 {
    static boolean checkSNT(double x){
        if(x < 2) return false;
        if(x != (int)x) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        double[] arr = {1, 2.2, 4, 5.6, 6, 7, 8, 9, 10, 11.1};
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(checkSNT(arr[i])){
                System.out.println(arr[i]);
                count ++;
            }
        }
        System.out.println(count);
    }
}
