public class Scope {
  public static void main(String[] args) {

    sayHello("Herman");
    sayHello("");
  }

  static void sayHello(String name) {
    String hello = "Hello " + name;

    if (!name.isBlank()) {
      String hi = "Hi " + name;
      System.out.println(hi);
    } else {
      System.out.println(hello);
    }

    // System.out.println(hi); // error
  }
}
