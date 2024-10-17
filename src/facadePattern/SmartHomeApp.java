package facadePattern;

class SmartHomeApp {
    public static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();

        smartHome.arriveHome();
        smartHome.movieMode();
        smartHome.nightMode();
        smartHome.leaveHome();
    }
}

