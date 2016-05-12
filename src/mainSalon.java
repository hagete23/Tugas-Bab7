import java.util.Scanner;

public class mainSalon {
   
    public static void main(String[] args) {
        Salon member;
        String ulang;
        
        Scanner input = new Scanner(System.in);
        
        do {
        System.out.println("==============================================");
        System.out.println("\t\tMy Salon\t\t");
        System.out.println("==============================================\n");
        System.out.println("Pilih jenis member :");
        System.out.println("1. Premium ");
        System.out.println("2. Gold ");
        System.out.println("3. Silver ");
        System.out.print("Masukkan pilihan anda: ");
        int pil = input.nextInt();
        
            if (pil == 1) {
            member = new Premium();
            member.HargaTotal();
        }
            
        else if (pil == 2) {
            member = new Gold();
            member.HargaTotal();
        }
        else if (pil == 3) {
            member = new Silver();
            member.HargaTotal();
        }
            System.out.println("Ulangi ? (y/n)");
            ulang = input.next();
        }while(ulang.equalsIgnoreCase("Y"));
    }
}