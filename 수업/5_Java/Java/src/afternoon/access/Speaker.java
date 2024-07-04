package afternoon.access;

public class Speaker {
    private int volume = 20;
    private int max_Volume = 100;
    private int min_Volume = 0;

    Speaker() {}

    public int volumeUp() {
        if (volume >= max_Volume) {
            System.out.println("더 이상 볼륨 조절이 불가능합니다.");
            return volume;
        }
        else {
            return volume++;
        }
    }

    public int volumeDown() {
        if (volume <= min_Volume) {
            System.out.println("더 이상 볼륨 조절이 불가능합니다.");
            return volume;
        }
        else {
            return volume--;
        }
    }

    public void mute() {
        this.volume = 0;
        System.out.println("스피커가 Mute 되었습니다");
    }

    public void getVolume() {
        System.out.println("현재 볼륨 : " + volume);
    }
}
