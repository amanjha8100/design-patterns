// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.*;

class HelloWorld {
    public static void main(String[] args) {
        Student ob = new Student("Aman", 24);
        ob.addObservers(new Subscriber());
        ob.notifyObs();
    }
}

//Observer Pattern
class Student {
    String name;
    int age;
    List<Object> observers;
    
    Student() {}
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.observers = new ArrayList<Object>();
    }
    
    void addObservers(Object x) {
        this.observers.add(x);
    }
    
    Object removeObservers(Object y) {
        //find index
        int index = -1;
        int count = 0;
        for(Object observer: this.observers) {
            if(observer == y) {
                index = count;
                break;
            }
            count++;
        }
        
        if(index == -1) return new Object();
        Object t = this.observers.get(index);
        this.observers.remove(index);
        return t;
    }
    
    void notifyObs() {
        this.observers.stream().forEach(obs -> callReflectUpdate(obs) );
    }
    
    void callReflectUpdate(Object obs) {
        try {
            for(Method method: obs.getClass().getDeclaredMethods()) {
                System.out.println("Name: " + method.getName());
            }
            // System.out.println(obs.getClass().getDeclaredMethod("update"));
            Method method = obs.getClass().getDeclaredMethod("update");
            method.setAccessible(true);
            method.invoke(obs);
        } catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        } 
    }
}

class Subscriber {
    Subscriber() {}
    
    public void update() {
        System.out.println("Aman Prakash Jha");
    }
}



