import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;

public class AgentTester {
    public static void main(String[] args) {
        printObjectSize(new Object());
        printObjectSize(new A());
        printObjectSize(1);
        printObjectSize("string");
        printObjectSize(Calendar.getInstance());
        printObjectSize(new BigDecimal("999999999999999.999"));
        printObjectSize(new ArrayList<String>());
        printObjectSize(new Integer[100]);
    }

    public static void printObjectSize(Object obj) {
        Class<?> aClass = obj.getClass();
        System.out.println(aClass.getSimpleName() + " size = " + AgentMemoryCounter.getSize(obj));
    }
}

class A {
    Integer id;
    String name;
}