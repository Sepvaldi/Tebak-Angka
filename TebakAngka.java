import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkapilihan = 777;
        int percobaan = 0;
        int angka;
        
        do {System.out.println("Masukkan angka tebakan: ");
        angka = input.nextInt();
        percobaan++;

        if (angka < angkapilihan) {
            System.out.println("Angka terlalu kecil");
        } else if (angka > angkapilihan) {
            System.out.println("Angka terlalu besar");
        } else {
            System.out.println("Anda menebak angka dengan benar");
            System.out.println("Dengan percobaan: " + percobaan + " kali");
        }
        }while (angka != angkapilihan);
            
        }
}

