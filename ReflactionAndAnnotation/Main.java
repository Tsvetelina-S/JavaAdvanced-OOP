import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> reflection = Reflection.class;
        Constructor<Reflection> ctr = reflection.getConstructor();
        System.out.println(ctr);
        

    }
}