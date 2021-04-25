package Java.Advanced;

class JavaSingletonPattern {

    public static String str;
    private static final JavaSingletonPattern instance = new JavaSingletonPattern();

    private JavaSingletonPattern() {
    }

    public static JavaSingletonPattern getSingleInstance() {
        return instance;
    }

}