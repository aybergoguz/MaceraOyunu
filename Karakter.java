public abstract class Karakter{
    private int id;
    private String ad;
    private int hasar;
    private int saglik;
    private int para;
    
    public Karakter(int id, String ad, int hasar, int saglik, int para) {
        
        this.id = id;
        this.ad = ad;
        this.hasar = hasar;
        this.saglik = saglik;
        this.para = para;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
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
        this.saglik = saglik;
    }
    public int getPara() {
        return para;
    }
    public void setPara(int para) {
        this.para = para;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}