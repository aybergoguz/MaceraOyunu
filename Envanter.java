public class Envanter {

    private Silahlar silah;
    private Zirhlar zirh;
    private String  [] oyunBitirecekEsyalar; 
    private String [] eldeEdilenEsya;
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String [] getEldeEdilenEsya() {
        return eldeEdilenEsya;
    }

    public void setEldeEdilenEsya(String [] eldeEdilenEsya) {
        this.eldeEdilenEsya = eldeEdilenEsya;
    }

    public String[] getOyunBitirecekEsyalar() {
        return oyunBitirecekEsyalar;
    }

    public void setOyunBitirecekEsyalar(String[] oyunBitirecekEsyalar) {
        this.oyunBitirecekEsyalar = oyunBitirecekEsyalar;
       
    }

    public Envanter(String [] eldeEdilenEsya) {
        this.silah = new Silahlar("Yumruk", -1, 0, 0);
        this.zirh = new Zirhlar(-1, "atlet", 0, 0);
        this.oyunBitirecekEsyalar = new String [] {"Yemek","Odun","Su"};
        this.eldeEdilenEsya = new String [3];
        this.index=0;
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