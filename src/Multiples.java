public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i ++){
            boolean multof3 = i % 3 == 0;
            boolean multof5 = i % 5 == 0;
            // check if the number i is divisible by either 3 or 5
            if (multof3 || multof5) {
                count++;
            }
        }
        System.out.println("The count of positive numbers divisible by either 3 or 5 below 1000 is: " + count);
    }
}
