package bridgePattern;

class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.powerOn();
        basicRemote.setChannel(1);
        basicRemote.setVolume(10);
        basicRemote.powerOff();

        Device dvd = new DVDDevice();
        AdvancedRemote advancedRemote = new AdvancedRemote(dvd);
        advancedRemote.powerOn();
        advancedRemote.setVolume(2);
        advancedRemote.mute();
        advancedRemote.powerOff();
    }
}
