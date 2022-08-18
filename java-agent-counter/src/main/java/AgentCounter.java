import java.lang.instrument.Instrumentation;

public class AgentCounter {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Hello! I`m AgentCounter");
        ClazzTransformer transformer = new ClazzTransformer();
        inst.addTransformer(transformer);
    }
}
