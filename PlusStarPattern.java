public class PlusStarPattern {
    public static void main(String[] args) {
        int n = 5; // change the value of n to change the size of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
