public class Silahlar extends Magaza{

    private int hasar;

    public Silahlar(String id, int para, int hasar) {
        super(id, para);
        //TODO Auto-generated constructor stub
        this.hasar=hasar;
    }

    public int getHasar() {
        return hasar;
    }
    public void setHasar(int hasar) {
        this.hasar = hasar;
    }


}