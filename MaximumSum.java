public class MaximumSum {
    public static void main(String[] args){
        int[] test = new int[]{ 0, 7, 1, -10, 2, -4, -1, 3, -2, 10, -2, -6, -9, 9, 1, 10, 3, -2, 0, 9, 6, -5, 10, -10,
                -2, -5, -5, 7, -6, -10, 2, 2, -5, -3, 8, 0, 3, 4, -2, -9, -8, -1, -5, -9, -3, -10, 7, -3, -9, 4, 0, 1,
                0, -9, -8, 6, -5, 1, -6, -1, 0, 9, -10, -9, -4, 5, 5, 5, -1, -9, 1, -7, -5, -4, 0, 7, -7, 0, 6, 7, 8,
                -2, 0, -6, -6, -2, 2, 5, 0, -4, 6, -6, 10, -8, -5, -5, 7, 0, 7, -9};
        System.out.println(max(test));
    }

    public static int max(int[] arr){
        int max = -50000000;
        int result = -1;
        for(int j = 0; j < arr.length; j++){
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != arr[j]){
                    sum += arr[i];
                }
            }
            if (sum > max || (sum == max && result < arr[j])) {
                max = sum;
                result = arr[j];
            }

        }
        return result;
    }
}
