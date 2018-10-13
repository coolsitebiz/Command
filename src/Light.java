public class Light {

    private boolean turnedOn;

    public Light() {
        this.turnedOn = false;
    }

    private boolean isTurnedOn() {
        return turnedOn;
    }

    public void on() {
        if (!isTurnedOn()) {
            turnedOn = true;
            System.out.println("Light turned on");
        }
        else {
            System.out.println("Light was already on");
        }
    }

    public void off() {
        if (isTurnedOn()) {
            turnedOn = false;
            System.out.println("Light turned off");
        }
        else {
            System.out.println("Light was already off");
        }
    }
}
