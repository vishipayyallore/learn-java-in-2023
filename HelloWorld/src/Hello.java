import java.text.MessageFormat;

public class Hello {

    public static void main(String[] args){

        int value1 = 10;
        int value2 = 20;
        int sum = value1 + value2;

        System.out.println("Hello World !!");
        System.out.println("Hello World Second Time !!");

        System.out.println(MessageFormat.format("{0} + {1} = {2}", value1, value2, sum));

        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println(MessageFormat.format("Int Min Value:{0} :: Int Max Value{1}", intMinValue, intMaxValue));

    }
}
