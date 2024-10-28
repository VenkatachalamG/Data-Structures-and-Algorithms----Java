import java.util.Arrays;

public class NumProdExceptItself {
    public static void main(String[] args) {
        int[] arr= {5,4,0,8};
        int[] ans = numProdExcItself(arr, arr.length);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] numProdExcItself(int[] arr, int n) {
        int[] output = new int[arr.length];
        int val = 1, zeroCount = 0;
        for (int j : arr) {
            if (j == 0) {
                zeroCount++;
            } else {
                val *= j;
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1){
                output[i] = 0;
            }
            else if (zeroCount == 1){
                output[i] = (arr[i] == 0)? val : 0;
            }
            else{
                output[i] = val / arr[i];
            }
        }
        return output;
    }
}
