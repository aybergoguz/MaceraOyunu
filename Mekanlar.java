public abstract class Mekanlar{

    private String name;
    private int canavarsayisi;
    private String odul;
    
    public Mekanlar(String name, int canavarsayisi, String odul) {
        this.name=name;
        this.canavarsayisi = canavarsayisi;
        this.odul = odul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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