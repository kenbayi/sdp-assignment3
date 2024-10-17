package proxyPattern;

class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();

        course.addLecture(new ProxyVideoLecture("Design Patterns Part 1"));
        course.addLecture(new ProxyVideoLecture("Design Patterns Part 2"));
        course.addLecture(new ProxyVideoLecture("Design Patterns Part 3"));

        course.showLectures();
        System.out.println("\nPlaying first lecture:");
        course.playLecture(0);
        System.out.println("\nPlaying second lecture:");
        course.playLecture(1);
    }
}

