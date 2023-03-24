public class Main {
    public static void main(String[] args) {

        printItems(10);

        printItemsV1(10);

        printItemsV2(10);

        System.out.println(addItems(100));

        System.out.println("Hello world!");
    }

    // O(log n) ==== 2^3 = 8 === log 2 (8) = 3

    // O(1) - Constant Time
    public static int addItems(int n) {
        return n + n + n;
    }

    // O(n^2 + n) - Drop Non-Dominants - O(n^2)
    public static void printItemsV2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { // n * n === O(n^2)
                System.out.println(i + " " + j);
            }
        }

        for (int k = 0; k < n; k++) { // O(n)
            System.out.println(k);
        }
    }

    // O(n). - Drop Constants - O(2n) == O(n)
    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }

    // O(n). - O(n^2)
    public static void printItemsV1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { // n * n === O(n^2)
                for (int k = 0; k < n; k++) { // n * n * n === O(n^3) === O(n^2)
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    // O(n + m) - O(n * m)
    public static void printItemsV3(int n, int m) {
        for (int i = 0; i < n; i++) { // O(n)
            System.out.println(i);
        }

        for (int j = 0; j < m; j++) { // O(m)
            System.out.println(j);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { // n * m === O(n * m)
                System.out.println(i + " " + j);
            }
        }
    }

}