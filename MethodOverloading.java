public class MethodOverloading {
    public static void main(String[] args) {
public class MethodOverloading {
    //... (main method)...
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }
}
public class MethodOverloading {
    //... (main and other printValue methods)...
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
public class MethodOverloading {
    public static void main(String args) {
        printValue(10);
        printValue(3.14);
        printValue("Hello!");
    }
    //... (printValue methods)...
}


    }
}