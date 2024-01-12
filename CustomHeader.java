public class CustomHeader {
    public static void main(String[] args){
        System.out.println(header("MNOQ", 22421));
    }

    public static String header(String letters, int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int index = (n - 1) % letters.length();
            sb.append(letters.charAt(index));
            n = (n - 1) / letters.length();
        }
        return sb.reverse().toString();
    }
}
