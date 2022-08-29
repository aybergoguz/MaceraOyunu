import java.util.Scanner;

public class Game{
    
    private Scanner scanner=new Scanner(System.in);

    public void start(){

    System.out.println("\nMacera Oyununa Hos Geldiniz !\n");
    System.out.print("Lutfen Isminizi Giriniz:\t");
    String playerName = scanner.nextLine();
   
    Player player = new Player(playerName);
    
    System.out.println("\n\t" + player.getName() + " Macera Oyununa Hosgeldiniz \n");
    System.out.print("Oyuna baslamak icin karakter seciniz !\n");
    player.selectChar();

    Mekanlar mekan = null;
    while(true){
        player.bilgiVer();
        System.out.println("\n            Bolgeler\n");
        System.out.println("\n1- Güvenli Ev ==> Burda Dusman Yok !");
        System.out.println("\n2- Magaza ==> Silah veya Zırh Alabilirsinz !");
        System.out.println("\n3- Magara ==> Odul: 'Yemek' Ama Dikkat burda zombiler var!");
        System.out.println("\n4- Orman ==> Odul: 'Odun' Ama Dikkat burda vampirler var!");
        System.out.println("\n5- Nehir ==> Odul: 'Su' Ama Dikkat burda ayilar var!");
        System.out.println("\n6- Maden ==> Odul: 'Cesitli oduller' Ama Dikkat burda ayilar var!");
        System.out.println("\n0- Cikis Yap ==> Oyunu Sonlandir !");
        System.out.print("\nGitmek istediginiz yeri seciniz:\t");
        int selectloc = scanner.nextInt();
        switch(selectloc){
            case 0 :
                mekan = null;
                break;
            case 1 :
                mekan = new GuvenliEv(player);
                break;
            case 2 :
                mekan = new Magaza(player);
                break;
            case 3 :
                mekan = new Magara(player);
                break;
            case 4 :
                mekan = new Orman(player);
                break;
            case 5 :
                mekan = new Nehir(player);
                break;
            case 6 :
                mekan = new Maden(player);
                break;
            default : 
                mekan = new GuvenliEv(player);
        }
        if(mekan == null){
            System.out.println("Yeni Oyuna Bekleriz");
            break;
        }
        if(!mekan.onLocation()){

            System.out.println("\n\n\t \t GAME OVER ");
            break;
        }
    }


    
    }
}