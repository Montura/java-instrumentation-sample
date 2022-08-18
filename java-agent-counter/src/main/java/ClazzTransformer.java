import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

public class ClazzTransformer implements ClassFileTransformer {
    private static int count = 0;

    @Override
    public byte[] transform(ClassLoader loader,
                            String className,
                            Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) {
        System.out.println("load class: " + className.replaceAll("/", "."));
        System.out.printf("loaded %s classes%n", ++count);
        return classfileBuffer;
    }
}
