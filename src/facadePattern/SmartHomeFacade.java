package facadePattern;

class SmartHomeFacade {
    private Light light;
    private SecuritySystem securitySystem;

    public SmartHomeFacade() {
        this.light = new Light();
        this.securitySystem = new SecuritySystem();
    }

    public void leaveHome() {
        light.turnOff();
        securitySystem.arm();
        System.out.println("Leaving home, all systems set.");
    }

    public void arriveHome() {
        light.turnOn();
        securitySystem.disarm();
        System.out.println("Arriving home, welcome!");
    }

    public void nightMode() {
        light.turnOff();
        securitySystem.arm();
        System.out.println("Night mode activated.");
    }

    public void movieMode() {
        light.turnOff();
        System.out.println("Movie mode activated.");
    }
}
