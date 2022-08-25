public abstract class Mekanlar{

    private int canavarsayisi;
    private String odul;
    
    public Mekanlar(int canavarsayisi, String odul) {
        this.canavarsayisi = canavarsayisi;
        this.odul = odul;
    }

    public int getCanavarsayisi() {
        return canavarsayisi;
    }

    public void setCanavarsayisi(int canavarsayisi) {
        this.canavarsayisi = canavarsayisi;
    }

    public String getOdul() {
        return odul;
    }

    public void setOdul(String odul) {
        this.odul = odul;
    }
} 