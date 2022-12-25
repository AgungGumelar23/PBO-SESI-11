import java.util.Scanner;

import FileHandling.Create;
import FileHandling.Read;
import FileHandling.Write;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Tulis Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Exit");
            System.out.print("Masukan Menu : ");
            int menu = input.nextInt();
            input.nextLine();
            switch (menu) {
                case 1:
                    String nama, nim, jurusan, ttl;
                    Create file = new Create();
                    System.out.print("Nama : ");
                    nama = input.nextLine();
                    System.out.print("NIM : ");
                    nim = input.nextLine();
                    System.out.print("Jurusan : ");
                    jurusan = input.nextLine();
                    System.out.print("Tempat, tanggal lahir : ");
                    ttl = input.nextLine();
                    Write writeFile = new Write(nama, nim, jurusan, ttl);
                    break;
                case 2:
                    Read readFile = new Read();
                    break;
                case 3:
                    input.close();
                    System.out.println("Program berhenti!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu Tidak ada!");
            }

        }
    }
}