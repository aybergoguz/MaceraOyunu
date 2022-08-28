public class Magaza extends Mekanlar{


    public Magaza(Player player) {
        super(player,"Magaza");
    }

    @Override
    public boolean onLocation(){
        System.out.println("\nMagazaya Hosgeldiniiz\n\n");
        boolean menuGoster = true;
        while(menuGoster){
        System.out.println("Yapmak Istediginiz Islemi Seciniz\n");
        System.out.println("1-\t Silahlar\n");
        System.out.println("2-\t Zirhlar\n");
        System.out.println("3-\t Cikis Yap\n");
        System.out.print("Seciminiz : \t");
        int select = scanner.nextInt();
        while(select < 1 || select > 3){
            System.out.println("\nGecersiz Giris Yaptiniz Tekrar Giris Yapiniz");
            select = scanner.nextInt();
            }
        switch(select){
            case 1 :
                silahGoster();
                silahSatinAl();
                break;
            case 2 :
                zirhGoster();
                zirhSatinAl();
                break;
            case 3 :
                System.out.println("\nHer Zaman Burdayiz");
                menuGoster =false;
                break;  
            }
        
        }
        return true;
    }

    public void silahGoster(){

        System.out.println("\nSilah Goster");
        System.out.println();
        for(Silahlar silah : Silahlar.silahlars()){

            System.out.println( "\nSilahin Ozellikleri :\tID :\t" + silah.getId() + 
            "\t Silah :\t" + silah.getName() + 
            "\t=>\tHasar :\t" + silah.getHasar() + 
            "\tPara :\t" + silah.getPara());
        }
        System.out.println("\n0 - Cikis Yap");
       
    }
    public void silahSatinAl(){

        System.out.print("\nBir Silah Seciniz :\t");
        int selectSilahID = scanner.nextInt();
        while(selectSilahID<0 || selectSilahID >Silahlar.silahlars().length){
            System.out.println("\nGecersiz Giris Yaptiniz Tekrar Giris Yapiniz\n");
            selectSilahID = scanner.nextInt();
        }

        if(selectSilahID != 0){

            Silahlar secilenSilah = Silahlar.getSilahlarObjBYID(selectSilahID);

            if(Silahlar.getSilahlarObjBYID(selectSilahID) != null){
                if(Silahlar.getSilahlarObjBYID(selectSilahID).getPara() > this.getPlayer().getPara()){
                    System.out.println("\nYeterli Paraniz bulunmamaktadir.");
                }else{
                    System.out.println("\n" + secilenSilah.getName() + " silahini satin aldiniz.\n");
                    int balance = this.getPlayer().getPara() - secilenSilah.getPara();
                    this.getPlayer().setPara(balance);
                    System.out.println("Kalan paraniz :\t" + this.getPlayer().getPara() + "\n");
                    System.out.println("Onceki Silahiniz :\t" + this.getPlayer().getEnvanter().getSilah().getName() + "\n");
                    this.getPlayer().getEnvanter().setSilah(secilenSilah);
                    System.out.println("Yeni Silahiniz :\t" + this.getPlayer().getEnvanter().getSilah().getName());
                }
            }
        }
   


    }

    public void zirhGoster(){

        System.out.println("\nZirhlari Goster");
        System.out.println();
        for(Zirhlar zirh : Zirhlar.zirhlars()){

            System.out.println( "\nZirhin Ozellikleri :\tID :\t" + zirh.getId() + 
            "\t Zirh :\t" + zirh.getName() + 
            "\t=>\tEngelleme :\t" + zirh.getEngelleme() + 
            "\tPara :\t" + zirh.getPara());
        }
        System.out.println("\n0 - Cikis Yap");
    }

    public void zirhSatinAl(){

        System.out.print("\nBir Zirh Seciniz :\t");
        int selectZirhID = scanner.nextInt();
        while(selectZirhID<0 || selectZirhID >Zirhlar.zirhlars().length){
            System.out.println("\nGecersiz Giris Yaptiniz Tekrar Giris Yapiniz\n");
            selectZirhID = scanner.nextInt();
        }
        if(selectZirhID != 0){

            Zirhlar secilenZirh = Zirhlar.getZirhlarObjBYID(selectZirhID);

            if(Zirhlar.getZirhlarObjBYID(selectZirhID) != null){
                if(Zirhlar.getZirhlarObjBYID(selectZirhID).getPara() > this.getPlayer().getPara()){
                    System.out.println("\nYeterli Paraniz bulunmamaktadir.");
                }else{
                    System.out.println("\n" + secilenZirh.getName() + " zirhini satin aldiniz.\n");
                    int balance = this.getPlayer().getPara() - secilenZirh.getPara();
                    this.getPlayer().setPara(balance);
                    System.out.println("Kalan paraniz :\t" + this.getPlayer().getPara() + "\n");
                    System.out.println("Onceki Zirhiniz :\t" + this.getPlayer().getEnvanter().getZirh().getName() + "\n");
                    this.getPlayer().getEnvanter().setZirh(secilenZirh);
                    System.out.println("Yeni Zirhiniz :\t\t" + this.getPlayer().getEnvanter().getZirh().getName());
                }
            }        
    
        }

    }
}