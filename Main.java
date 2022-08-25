import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
    
        Samuray samuray=new Samuray("samuray", "1", 5, 21, 15);
        Okcu okcu =new Okcu("okcu", "2", 7, 18, 20);
        Sovalye sovalye =new Sovalye("sovalye", "3", 8, 24, 5);
        Karakter [] karakterler ={samuray,okcu,sovalye};


        int canavarsayisi=1; //random sayi 1-3
        Orman orman=new Orman("orman", canavarsayisi, "odun");
        Nehir nehir =new Nehir("nehir", canavarsayisi, "su");
        Magara magara =new Magara("magara",canavarsayisi,"yemek");
        Mekanlar [] mekanlar ={orman, nehir, magara};

        System.out.println("\t\tOyuna Hos Geldiniz !");

        System.out.println("\t\tKarakterinizi Seciniz !");
        Secim.karakterSecimi(karakterler);
        System.out.print("\t\t Secim :");
        Scanner scanner =new Scanner(System.in);
        int karakterSecimi1=scanner.nextInt();
        System.out.println("Karakter secimi: \t" + karakterler[karakterSecimi1-1].getName());         
        

        System.out.println("\t\tMekani Seciniz !");
        Secim.mekanSecimi(mekanlar);
        System.out.print("\t\t Secim :");
        int mekanSecimi=scanner.nextInt();           
        System.out.println("Mekan seciminiz:\t" + mekanlar[mekanSecimi-1].getName());

        scanner.close();

    }
}