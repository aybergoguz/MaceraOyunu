import java.util.Random;

public class Yilan extends Canavarlar{

    public Yilan() {
        
        super(5, "Yilan", Yilan.vurusAraligi(), 12, 0);
        
    }

    public static int vurusAraligi(){

        Random random = new Random();
        int min =3;
        int max =6;

        int randomVurus = random.nextInt((max -min ) +1) + min;
        
        return randomVurus;
    }

   

}