public class Silahlar{

    private String name;
    private int id;
    private int hasar;
    private int para;
    
    public Silahlar(String name, int id, int hasar, int para) {
        this.name = name;
        this.id = id;
        this.hasar = hasar;
        this.para = para;
    }

    public static Silahlar [] silahlars(){

        Silahlar [] silahlarList = new Silahlar[3];
        silahlarList[0] = new Silahlar("Tabanca", 1, 2, 25);
        silahlarList[1] = new Silahlar("Kilic", 2, 3, 35);
        silahlarList[2] = new Silahlar("Tufek", 3, 7, 45);

        return silahlarList;
    }

    public static Silahlar getSilahlarObjBYID(int id){

        for(Silahlar w : silahlars()){
            if(w.getId() == id){
                return w;
            }
        }
        return null;
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

    public int getPara() {
        return para;
    }

    public void setPara(int para) {
        this.para = para;
    }
    
}