import java.util.*;
public class ArraysCreator {
    public static void main(String[] args){
        // System.out.println(arrays1(3,3));
        for(int[] i : generate(7,3)){
            System.out.println(Arrays.toString(i));
        }
    }

    public static int arrays1(int size, int n){
        int count = 0;
        int[] nums = new int[n];
        for(int k = 0; k < n; k++){
            nums[k] = k + 1;
        }
        int temp = 0;

        for(long i = 0; i < Math.pow(n, size); i++){
            int[] arr = new int[size];
            //crear un contador para que no haya mas de dos mismos número seguidos
            for(int u = 0; u < size; u++){
                arr[u] = nums[temp % n];
                if(u > 1 && arr[u - 1] == arr[u - 2] && arr[u] == arr[u - 1]){
                    u--;
                    temp++;
                }
                //crear un loop que haga que cada vez que el contador alcance 2, tome un número de nums diferente a los dos anteriores
                //crear un if que si hay más de dos números igualse seguidos, count--
            }
            System.out.println(Arrays.toString(arr));

            count++;
        }
        return count;
    }

    public static List<int[]> generate(int n, int r) {
        List<int[]> combinations = new ArrayList<>();
        int[] combination = new int[r];

        // initialize with lowest lexicographic combination
        for (int i = 0; i < r; i++) {
            combination[i] = i;
        }

        while (combination[r - 1] < n) {
            combinations.add(combination.clone());

            // generate next combination in lexicographic order
            int t = r - 1;
            while (t != 0 && combination[t] == n - r + t) {
                t--;
            }
            combination[t]++;
            for (int i = t + 1; i < r; i++) {
                combination[i] = combination[i - 1] + 1;
            }
        }

        return combinations;
    }

    // public static int arrays(int size, int n){
    //     if((size >= 1 && size <= 9) && (n >= 1 && n <= 10)){
    //         int result = (int) Math.pow(n, size);
    //         if (size > 2) {
    //             int diff = (int) Math.pow(size, size - 2) * (size - 2);
    //             result -= diff;
    //         }
    //         return result;
    //     }
    //     else{
    //         return -1;
    //     }
    // }

    public static int arrays(int size, int n){
        ArrayList<Integer> range = new ArrayList<Integer>(); 
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < 2; j++){
                range.add(i);
            }
        }
        for(int m : range){
            System.out.println(m);
        }

        return 0;
    }
}
