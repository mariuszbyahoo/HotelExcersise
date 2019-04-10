package Data.equipment;

public class AirConditioner extends Equipment{
    private int power;
    private int noiceLevel;

    public AirConditioner(String refNumber, String model, int power, int noiceLevel) {
        super(refNumber, model);
        this.power = power;
        this.noiceLevel = noiceLevel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNoiceLevel() {
        return noiceLevel;
    }

    public void setNoiceLevel(int noiceLevel) {
        this.noiceLevel = noiceLevel;
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "power=" + power +
                ", noiceLevel=" + noiceLevel +
                ", refNumber='" + refNumber + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
