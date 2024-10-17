package proxyPattern;

class ProxyVideoLecture implements VideoLecture {
    private RealVideoLecture realVideoLecture;
    private String fileName;

    public ProxyVideoLecture(String fileName) {
        this.fileName = fileName;
    }

    public void getInfo() {
        System.out.println("Video: " + fileName);
    }

    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(fileName);
        }
        realVideoLecture.play();
    }
}

