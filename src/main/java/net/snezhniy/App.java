package net.snezhniy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String selectedSolution = (args.length >= 1) ? args[0] : "1";
        String classPath = "net.snezhniy.task" + selectedSolution + ".Main";

        Class<?> cls;
        try {
            cls = Class.forName(classPath);
        } catch (ClassNotFoundException e) {
            System.out.printf("Вы указали некорректный номер задания, класс %s не найден.\n", classPath);
            return;
        }

        Object obj = cls.getDeclaredConstructor().newInstance();
        Method run = cls.getDeclaredMethod("run");
        run.invoke(obj);
    }
}
