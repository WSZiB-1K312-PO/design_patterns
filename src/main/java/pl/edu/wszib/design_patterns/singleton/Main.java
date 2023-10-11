package pl.edu.wszib.design_patterns.singleton;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.get();
        System.out.println(singleton.toString());

        Singleton ohNo = ohNo();

        System.out.println(singleton == ohNo);

        System.out.println( TrueSingleton.INSTANCE.toString());
    }

    @SneakyThrows()
    public static Singleton ohNo() {
        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);

        Field instance = Singleton.class.getDeclaredField("INSTANCE");
        instance.setAccessible(true);
        Object temp = instance.get(null);
        instance.set(null, null);

        return declaredConstructor.newInstance("Oh no");
    }
}
