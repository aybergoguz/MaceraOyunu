public class GuvenliEv extends Mekanlar{

    public GuvenliEv(Player player) {
        super(player, "Guvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Guvenli Evdesiniz");
        System.out.println("Caniniz Yenilendi.");
        this.getPlayer().setSaglik(this.getPlayer().getOrjinalSaglik());
        return true;
    }


}