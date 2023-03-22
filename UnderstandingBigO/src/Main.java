public class Main {
    public static void main(String[] args) {

        printItems(10);

        printItemsV1(10);

        System.out.println("Hello world!");
    }

    // O(n). - Drop Constants - O(n) == O(n)
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

}