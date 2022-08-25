public class Zirhlar extends Magaza{

    private int engelleme;

    public Zirhlar(String id, int para,int engelleme) {
        super(id, para);
        //TODO Auto-generated constructor stub
        this.engelleme=engelleme;
    }

    public int getEngelleme() {
        return engelleme;
    }
    public void setEngelleme(int engelleme) {
        this.engelleme = engelleme;
    }

    
}