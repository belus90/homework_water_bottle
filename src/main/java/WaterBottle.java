public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void drink(){
        this.volume = this.volume - 10;
    }

    public void emptyBottle(){
        this.volume = 0;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
