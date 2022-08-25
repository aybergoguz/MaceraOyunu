public abstract class Canavarlar{

    private String id;
    private int hasar;
    private int saglik;
    private int para;
    
    public Canavarlar(String id, int hasar, int saglik,int para) {
       
        this.id = id;
        this.hasar = hasar;
        this.saglik = saglik;
        this.para=para;
    }
 
    public String getId() {
        return id;
    }
    public void setId(String id) {
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
        this.saglik = saglik;
    }

    public int getPara() {
        return para;
    }

    public void setPara(int para) {
        this.para = para;
    }


}