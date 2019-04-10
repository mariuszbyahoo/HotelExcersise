package Data.equipment;

public class TV extends Equipment {

    private int size;
    private int resolution;

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
        return "TV{" +
                "size=" + size +
                ", resolution=" + resolution +
                ", refNumber='" + refNumber + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
