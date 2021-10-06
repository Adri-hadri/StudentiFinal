import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String izbor;
        do {
            System.out.println("Izbornik:");
            System.out.println("a) Upis studenta");
            System.out.println("b) Ispis studenta po ID broju");
            System.out.println("c) Brisanje studenta po ID broju");
            System.out.println("d) Promjena godine studija");
            System.out.println("e) Ispis svih studenata");
            System.out.println("f) Izlaz");
            System.out.println("Unesite odabir:");

            izbor = scanner.nextLine();
            switch (izbor) {
                case : "a"
                    studentList.add(addNewStudent());
                    break;
                case : "b"
                     int id = scanner.nextInt();
                    System.out.println(id);
                    break;
                case : "c"
                    studentList.remove(getStudent());
                    break;
            }
        }
    }
    public static Student addNewStudent(){
    List<Student> studenti = new ArrayList<>();
    //studenti.add(new Student("Pero","Bjelovar",1));

        studenti.get()
    Student prvi = new Student(123, "Đuro", 1);
    Student drugi = new Student(456, "Pero", 2);
    Student treci = new Student(789, "Slavko", 3);
    System.out.println(prvi);
}

public static Student getStudent(){
    System.out.println("b) Ispis studenta po ID broju");
    int id = scanner.
}

public static Student removeStudent() {

}

}
