public class Q3 {
    public static void main(String[] args) {
        int[] numbers = { 19, 26, 34, 444, 95 };
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println( max);


    }
}
