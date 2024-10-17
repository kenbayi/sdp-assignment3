package proxyPattern;

class RealVideoLecture implements VideoLecture {
    private String fileName;

    public RealVideoLecture(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading video: " + fileName);
    }

    public void getInfo() {
        System.out.println("Video: " + fileName);
    }

    public void play() {
        System.out.println("Playing video: " + fileName);
    }
}

