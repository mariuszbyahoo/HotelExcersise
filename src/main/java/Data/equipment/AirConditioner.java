package Data.equipment;

public class AirConditioner extends Equipment{
    private int power;
    private int noiceLevel;
    StringBuilder builder;

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
        builder = new StringBuilder();
        builder.append("AirConditioner{");
        builder.append("power=");
        builder.append(power);
        builder.append(", noiceLevel=");
        builder.append(noiceLevel);
        builder.append(", refNumber='");
        builder.append(refNumber);
        builder.append('\'');
        builder.append(", model='");
        builder.append(model);
        builder.append('\'');
        builder.append('}');

        return builder.toString();
    }
}
