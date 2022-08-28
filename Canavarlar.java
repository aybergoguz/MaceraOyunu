public class Canavarlar{

    private int id;
    private String name;
    private int hasar;
    private int saglik;
    private int kazanilackPara;
    private int orjinalSaglık;

    public Canavarlar(int id ,String name, int hasar, int saglik,int kazanilackPara) {
        
        this.id = id;
        this.name=name;
        this.hasar = hasar;
        this.saglik = saglik;
        this.kazanilackPara = kazanilackPara;
        this.orjinalSaglık = saglik;
     
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getHasar() {
        return hasar;
    }
    public void setHasar(int hasar) {
        this.hasar = hasar;
    }
    public int getSaglik() {
        return saglik;
    }
    public void setSaglik(int saglik) {
        if(saglik < 0){
            saglik=0;
        }
        this.saglik = saglik;
    }

    public int getKazanilackPara() {
        return kazanilackPara;
    }

    public void setKazanilackPara(int kazanilackPara) {
        this.kazanilackPara = kazanilackPara;
    }
       
    public int getOrjinalSaglık() {
        return orjinalSaglık;
    }

    public void setDefSaglık(int orjinalSaglık) {
        this.orjinalSaglık = orjinalSaglık;
    }

    

    


}