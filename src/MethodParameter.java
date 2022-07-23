public class MethodParameter {
  public static void main(String[] args) {
    sayHello("Herman", "Xphp");
    sayHello("Budi", "Nugraha");
  }

  static void sayHello(String firstName, String lastName) {
    System.out.println("Hello " + firstName + " " + lastName);
  }
}
