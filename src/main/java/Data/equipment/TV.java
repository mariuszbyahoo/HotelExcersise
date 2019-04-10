package Data.equipment;

public class TV extends Equipment {

    private int size;
    private int resolution;
    private StringBuilder builder;

    public TV(String refNumber, String model, int size, int resolution) {
        super(refNumber, model);
        this.size = size;
        this.resolution = resolution;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        builder = new StringBuilder();
        builder.append("TV{");
        builder.append("size=");
        builder.append(size);
        builder.append(", resolution=");
        builder.append(resolution);
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
