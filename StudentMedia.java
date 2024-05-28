package POO;

import Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var a = new Student();
        System.out.print("Nome do Aluno: ");
        a.name = sc.nextLine();
        System.out.print("Nota 1: ");
        a.av1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        a.av2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        a.av3 = sc.nextDouble();
        a.mediaStudent();
        sc.close();
    }
}
