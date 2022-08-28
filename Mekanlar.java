import java.util.Scanner;

public abstract class Mekanlar{

    private Player player;
    private String name;
    
    public static Scanner scanner =new Scanner(System.in);
    
    public Mekanlar(Player player, String name) {
        this.player = player;
        this.name=name;
    }

    abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

} 