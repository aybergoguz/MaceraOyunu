public class Zirhlar{

    private int id;
    private String name;
    private int engelleme;
    private int para;
    
    public Zirhlar(int id, String name, int engelleme, int para) {
        this.id = id;
        this.name = name;
        this.engelleme = engelleme;
        this.para = para;
    }

    public static Zirhlar[] zirhlars(){

        Zirhlar [] zirhlarList = new Zirhlar[3];
        zirhlarList[0] = new Zirhlar(1, "Haifif", 1, 15);
        zirhlarList[1] = new Zirhlar(2, "Orta", 3, 25);
        zirhlarList[2] = new Zirhlar(3, "Agir", 5, 40);

        return zirhlarList;
    } 

    public static Zirhlar getZirhlarObjBYID(int id){

        for(Zirhlar w : zirhlars()){
            if(w.getId() == id){
                return w;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEngelleme() {
        return engelleme;
    }

    public void setEngelleme(int engelleme) {
        this.engelleme = engelleme;
    }

    public int getPara() {
        return para;
    }

    public void setPara(int para) {
        this.para = para;
    }

}