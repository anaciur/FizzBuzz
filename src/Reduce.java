public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        while (n > 0){
            if (n % 2 == 0){
                // if n is even, divide by 2
                n = n / 2;
            }
            else {
                // if n is odd, subtract by 1
                n = n -1;
            }
            count += 1;
        }
    System.out.println("Number of steps to reach 0 from 100: " + count);}
}
