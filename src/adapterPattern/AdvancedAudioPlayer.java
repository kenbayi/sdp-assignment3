package adapterPattern;

class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
    public void playWAV(String fileName) {
        System.out.println("Playing WAV file. Name: " + fileName);
    }

    public void playAAC(String fileName) {
        System.out.println("Playing AAC file. Name: " + fileName);
    }
}
