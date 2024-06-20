package afternoon.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker1 = new Speaker();
        speaker1.volumeUp();
        speaker1.volumeDown();
        speaker1.mute();
        speaker1.volumeDown();
        speaker1.getVolume();
    }
}
