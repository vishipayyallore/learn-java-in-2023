package IntTypeDemo;

public class IntDemos {

    public static void main(String[] args) {
        System.out.println("Integer Data Type Demo.");

        int age = 18;
        String name = "Sam";
        System.out.println(String.format("%s is %d years old.", name, age));

        age = 18 + 1;
        name = "John";
        System.out.println(String.format("%s is %d years old.", name, age));

        age = (10 + 5) + (2 * 10);
        name = "Sarah";
        System.out.println(String.format("%s is %d years old.", name, age));
    }
}
