import java.util.Scanner;

public class Player{
    private int hasar;
    private int saglik;
    private int orjinalSaglik;
    private int para;
    private String charName;
    private String name;
    private Scanner scanner = new Scanner(System.in);
    private Envanter envanter;

    public Player(String name) {
        this.name = name;
        this.envanter = new Envanter(null);
    }

    public void selectChar(){

        Karakter [] karakterList = {new Samuray(), new Okcu(), new Sovalye()};
        System.out.println("\n\t\t KARAKTERLER\n");

        for(Karakter karakters : karakterList){ 
        
        System.out.println("\nID :\t" + karakters.getId() + 
                           "\tKarakter :\t" + karakters.getAd() + 
                           "\t=>\tHasar :\t" + karakters.getHasar() + 
                           "\tSaglik :\t" + karakters.getSaglik() + 
                           "\tpara :\t" +  karakters.getPara());
        }

        System.out.print("\nbir karakter giriniz:\t");
        int selectChar = scanner.nextInt();
        
        switch(selectChar){
            case 1 :
                initPlayer(new Samuray());
                break;
            case 2:
                initPlayer(new Okcu());
                break;
            case 3:
                initPlayer(new Sovalye());
                break;
            default:
                initPlayer(new Samuray());
        }
       
    }
        
    public void initPlayer(Karakter karakter){
        this.setHasar(karakter.getHasar());
        this.setSaglik(karakter.getSaglik());
        this.setOrjinalSaglik(karakter.getSaglik());
        this.setPara(karakter.getPara());
        this.setCharName(karakter.getAd());
    }

    public void bilgiVer(){

        System.out.println( 
    "\nKarakterinizin Ozellikleri:\n\nSilahiniz\t=>\t" + this.getEnvanter().getSilah().getName() +
                                    "\nZirhiniz\t=>\t" + this.getEnvanter().getZirh().getName() + 
                                    "\nHasariniz\t=>\t" + this.getToplamHasar() + 
                                     "\nSagliginiz\t=>\t" + this.getSaglik() + 
                                      "\nKalan paraniz\t=>\t" +  this.getPara());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getToplamHasar() {
        return hasar + this.getEnvanter().getSilah().getHasar();
    }

    public int getHasar() {
        return hasar ;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

    public int getSaglik() {
        return saglik + this.getEnvanter().getZirh().getEngelleme();
    }

    public void setSaglik(int saglik) {
        this.saglik = saglik;
    }

    public int getPara() {
        return para;
    }

    public void setPara(int para) {
        this.para = para;
    }

    public Envanter getEnvanter() {
        return envanter;
    }

    public void setEnvanter(Envanter envanter) {
        this.envanter = envanter;
    }

    public void setOrjinalSaglik(int orjinalSaglik){

        this.orjinalSaglik=orjinalSaglik;

    }

    public int getOrjinalSaglik(){
        return orjinalSaglik;
    }

}