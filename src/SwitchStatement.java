public class SwitchStatement {
  public static void main(String[] args) {

    var nilai = "A";

    switch (nilai) {
      case "A":
        System.out.println("Wow, Anda Lulus Dengan Baik");
        break;
      case "B":
      case "C":
        System.out.println("Nilai Anda Baik");
        break;
      case "D":
        System.out.println("Anda Tidak Lulus");
        break;
      default:
        System.out.println("Mungkin Anda Salah Jurusan");
    }

    // switch lambda -> java 14
    switch (nilai) {
      case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
      case "B", "C" -> System.out.println("Nilai Anda Baik");
      case "D" -> System.out.println("Anda Tidak Lulus");
      default -> System.out.println("Mungkin Anda Salah Jurusan");

    } // switch lambda tanpa yield
    String ucapan;
    switch (nilai) {
      case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
      case "B", "C" -> ucapan = "Nilai Anda Baik";
      case "D" -> ucapan = "Anda Tidak Lulus";
      default -> ucapan = "Mungkin Anda Salah Jurusan";
    }

    System.out.println(ucapan);

    // switch lambda dengan yield -> java 14
    ucapan = switch (nilai) {
      case "A":
        yield "Wow, Anda Lulus Dengan Baik";
      case "B", "C":
        yield "Nilai Anda Baik";
      case "D":
        yield "Anda Tidak Lulus";
      default:
        yield "Mungkin Anda Salah Jurusan";
    };

    System.out.println(ucapan);


  }
}
