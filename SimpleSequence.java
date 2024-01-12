import java.util.*;
public class SimpleSequence {
    public static void main(String[] args){
        System.out.println(sequence(545422));

    }

    public static int sequence2(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        int a = 3;
        for (int i = 2; list.size() <= n; i++) {
            for (int j = 0; j < 2; j++) {
                list.add(a);
                list.add(a + 1);
            }
            a += 2;
        }
        for (int q : list) {
            System.out.println(q);
        }
        System.out.println("size: " + list.size());
        return list.get(n);
    }

    public static long sequence(long n) {
        if (n <= 100) {
            return (long) (sequence2((int) n));
        } else {
            if (n % 2 == 0) {
                return (long) (n / 2) + 1;
            } else {
                return (long) Math.floor((float) n / 2) + 2;
            }
        }
    }

    public static long sequence1(long n) {
        ArrayList<Long> list = new ArrayList<Long>();
        list.add((long) 1);
        list.add((long) 2);
        int seq = 3;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                list.add((long) seq);
                list.add((long) (seq + 1));
            }
            seq += 2;
        }
        return list.get((int) n);
    }

    public static int sequence3(long n) {
        if(n == 0){
            return 1;
        }
        else if(n == 1){
            return 2;
        }
        int a = 3;
        int b = 4;
        int idk = 0;
        for (int i = 2; i <= n; i++) {
            if (i == 2) {
                continue;
            } 
            else if (i == 3) {
                continue;
            }
            else if(idk < 2){
                idk++;
                a++;
            }
            else if(idk < 4){
                idk++;
                b++;
                if(idk == 4){
                    idk = 0;
                }
            }
        }
        if (n % 2 == 0) {
            System.out.println("a");
            return a;
        } else {
            System.out.println("b");
            return b;
        }
    }

}
