package bridgePattern;

class DVDDevice implements Device {
    public void powerOn() {
        System.out.println("DVD Player is ON.");
    }

    public void powerOff() {
        System.out.println("DVD Player is OFF.");
    }

    public void setChannel(int channel) {
        System.out.println("DVD Player doesn't support channel setting.");
    }

    public void setVolume(int volume) {
        System.out.println("DVD Player volume set to: " + volume);
    }
}
