import java.lang.instrument.Instrumentation;

public class JavaAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Hello! I`m java agent");
    }
}
