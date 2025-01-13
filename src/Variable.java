public class Variable {

    public static void main(String[] args) {

        String name;
        name = "Herman";

        System.out.println(name);

        int age = 24;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Rahmat";
        System.out.println(name);

        var firstName = "Herman"; // boleh

        // var company; // error tidak bisa
        // company = "MuslimDev";

        final var application = "Belajar Java";

        // application = "Belajar PHP"; // error
    }
}
