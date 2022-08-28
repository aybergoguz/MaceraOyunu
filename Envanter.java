public class Envanter {

    private Silahlar silah;
    private Zirhlar zirh;
    private String  [] oyunBitirecekEsyalar ={"yemek","odun","su"};

    public String[] getOyunBitirecekEsyalar() {
        return oyunBitirecekEsyalar;
    }

    public void setOyunBitirecekEsyalar(String[] oyunBitirecekEsyalar) {
        this.oyunBitirecekEsyalar = oyunBitirecekEsyalar;
    }

    public Envanter(Silahlar silah ) {
        this.silah = new Silahlar("Yumruk", -1, 0, 0);
        this.zirh = new Zirhlar(-1, "atlet", 0, 0);
    }

    public Silahlar getSilah() {
        return silah;
    }
    
    public void setSilah(Silahlar silah) {
        this.silah = silah;
    }
    
    public Zirhlar getZirh() {
        return zirh;
    }

    public void setZirh(Zirhlar zirh) {
        this.zirh = zirh;
    }


    
}