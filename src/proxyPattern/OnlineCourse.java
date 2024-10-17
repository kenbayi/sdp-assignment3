package proxyPattern;

import java.util.ArrayList;
import java.util.List;

class OnlineCourse {
    private List<VideoLecture> lectures = new ArrayList<>();

    public void addLecture(VideoLecture lecture) {
        lectures.add(lecture);
    }

    public void playLecture(int index) {
        if (index < lectures.size()) {
            lectures.get(index).play();
        } else {
            System.out.println("Invalid lecture index.");
        }
    }

    public void showLectures() {
        for (VideoLecture lecture : lectures) {
            lecture.getInfo();
        }
    }
}

