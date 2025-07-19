public class Program4 {
    public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        int[] count = new int[10]; 

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[j] % i == 0) {
                    count[i]++;
                }
            }
        }  
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + count[i]);
        }
    }
}
