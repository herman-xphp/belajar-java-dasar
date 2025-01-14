public class MethodParameter {

    public static void main(String[] args) {
        sayHello("Rahmat", "Hidayat");
        sayHello("Ariadi", "Ahmad");
        sayHello("Muhammad", "Nawar");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
