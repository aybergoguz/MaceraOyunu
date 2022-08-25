public abstract class Magaza{

    private String id;
    private int  para;
    
    public Magaza(String id, int para) {
        this.id = id;
        this.para = para;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPara() {
        return para;
    }

    public void setPara(int para) {
        this.para = para;
    }
    
}