import java.util.Arrays;
import java.util.Random;

public abstract class SavasAlani extends Mekanlar{

    private Canavarlar canavarlar;
    private String odul;
    private int maxCanavar;

    public SavasAlani(Player player, String name,Canavarlar canavarlar, String odul,
                      int maxCanavar) {
        super(player, name);
        this.canavarlar = canavarlar;
        this.odul = odul;
        this.maxCanavar = maxCanavar;

    }

    @Override
    boolean onLocation() {
        int canavarSayisi = this.randomCanavarSayisi();
   
        System.out.println("\nSuan burdasiniz:\t" + this.getName());
        System.out.println("\nDikkatli ol burda  " + canavarSayisi + " tane " 
                                + this.getCanavarlar().getName() + "  yasiyor.");
        System.out.print("\nSecimini Yap : \t <S> : Savas veya <K> Kac\t");
        String secim = scanner.nextLine().toUpperCase();
        if(secim.equals("S") && savasma(canavarSayisi)){
           
            System.out.println("\n" + this.getName() + "tum dusmalari yendiniz.");

            return true;
            
        }
        if(this.getPlayer().getSaglik() <= 0){
            System.out.println("\nOldunuz !");
            return false;
        }
        return true;
    }

    public boolean savasma(int canavarSayisi){

        for(int i = 1; i <=canavarSayisi; i++){
            this.getCanavarlar().setSaglik(this.getCanavarlar().getOrjinalSaglık());
            playerDurumu();
            canavarDurumu(i);
            while(this.getPlayer().getSaglik() >0 && this.canavarlar.getSaglik()>0){
                System.out.print("\n<V> Vur veya <K> Kac  !\t");
                String secim = scanner.nextLine().toUpperCase();
                if(secim.equals("V")){
                    Random  rnd = new Random();
                    int sansFaktoru = rnd.nextInt(100)+1;
                    if(sansFaktoru <51){
                    System.out.println("\nSiz vurdunuz !");
                    this.getCanavarlar().setSaglik(this.getCanavarlar().getSaglik() - this.getPlayer().getHasar());
                    afterHit();
                    if(this.getCanavarlar().getSaglik() > 0){
                        System.out.println("\nCanavar size vurdu !");
                        this.getPlayer().setSaglik(this.getPlayer().getSaglik() - this.getCanavarlar().getHasar());
                        afterHit();
                    }
                }
                else{
                    System.out.println("\nCanavar size vurdu !");
                        this.getPlayer().setSaglik(this.getPlayer().getSaglik() - this.getCanavarlar().getHasar());
                        afterHit();
                        if(this.getCanavarlar().getSaglik() > 0){
                            System.out.println("\nSiz vurdunuz !");
                    this.getCanavarlar().setSaglik(this.getCanavarlar().getSaglik() - this.getPlayer().getHasar());
                    afterHit();
                        }

                }
                } else {
                    return false;
                    }
            
            }
            
            if(this.getCanavarlar().getSaglik() < this.getPlayer().getSaglik()){
                System.out.println("Dusmani Yendiniz !");
                if(this.getCanavarlar().getName() == "Yilan"){
                    yilandanHediyeler();
                }else{
                System.out.println(this.getCanavarlar().getKazanilackPara() + "para kazandiniz.");
                this.getPlayer().setPara(this.getPlayer().getPara()+this.getCanavarlar().getKazanilackPara());
                System.out.println("Guncel paraniz:\t" + this.getPlayer().getPara());
                
                String [] oyunBittimi = getPlayer().getEnvanter().getOyunBitirecekEsyalar();
                String [] konrolBittimi =getPlayer().getEnvanter().getEldeEdilenEsya();
                String odul = this.getOdul();
                Arrays.fill( konrolBittimi , odul );
                
                for(String  a : oyunBittimi){
                    System.out.println("\nGerekenler:\t" + a);
                }
                for(String b : konrolBittimi){
                    System.out.println("\nSizdekiler\t" + b);
                }
                if(Arrays.equals(oyunBittimi, konrolBittimi)){
                    System.out.println("Oyunu Kazandiniz");
                    System.out.println("Tebrikler");
                    System.out.println("Tebrikler");
                    System.out.println("Tebrikler");
                    
                }
                
            }
            }else {
                return false;
            }
        }

        return true;
    }

    public void yilandanHediyeler(){

        Random rnd = new Random();
        int olasilik = rnd.nextInt(100)+1;
        int olasilik1 = rnd.nextInt(100)+1;;
        if(olasilik<46){
            System.out.println("Hiç Birşey Kazanamadiniz !");
        }
        else if(olasilik >45 && olasilik <61){
            System.out.println("Silah Kazanacaksiniz");
                if(olasilik1<51){
                    //this.getPlayer().getEnvanter().setSilah(Silahlar.getSilahlarObjBYID(1));
                }
                else if(olasilik1>70){
                    //kiliv
                }
                else{
                    //tüfek
                }

        }
        else if(olasilik>75){
            System.out.println("Para Kazanacaksiniz");
            if(olasilik1<51){
                //tabanca
            }
            else if(olasilik1>70){
                //kiliv
            }
            else{
                //tüfek
            }
        }
        else {
            System.out.println("Zirh Kazanacaksiniz");
            if(olasilik1<51){
                //tabanca
            }
            else if(olasilik1>70){
                //kiliv
            }
            else{
                //tüfek
            }
        }
    }

    public void afterHit(){

        System.out.println("\nCaniniz :\t" + this.getPlayer().getSaglik());
        System.out.println("\n" + this.getCanavarlar().getName() + "Cani:\t" + this.getCanavarlar().getSaglik());
    }

    public void playerDurumu(){

        System.out.println("\nOyuncu Degerleri:\n\nSaglık : \t" + this.getPlayer().getSaglik()              
                                            + "\nHasar : \t" + this.getPlayer().getToplamHasar()
                                            + "\nPara : \t" + this.getPlayer().getPara());
        System.out.println("Silah : \t" + this.getPlayer().getEnvanter().getSilah().getName());
        System.out.println("Zirh : \t" + this.getPlayer().getEnvanter().getZirh().getName());
        
    }

    public void canavarDurumu(int i){
        System.out.println("\n" + i + ". " + this.getCanavarlar().getName() 
                        + " Degerleri:\n\nSaglik:\t" + this.getCanavarlar().getSaglik() 
                        + "\nHasar:\t" + this.getCanavarlar().getHasar()
                        + "\nKazanilack Para:\t" + this.getCanavarlar().getKazanilackPara());
    }

    public int randomCanavarSayisi(){
        Random random =new Random();
        return random.nextInt(this.getMaxCanavar())+1;
    }

    public String getOdul() {
        return odul;
    }

    public void setOdul(String odul) {
        this.odul = odul;
    }

    public Canavarlar getCanavarlar() {
        return canavarlar;
    }

    public void setCanavarlar(Canavarlar canavarlar) {
        this.canavarlar = canavarlar;
    }

    public int getMaxCanavar() {
        return maxCanavar;
    }

    public void setMaxCanavar(int maxCanavar) {
        this.maxCanavar = maxCanavar;
    }

    




}