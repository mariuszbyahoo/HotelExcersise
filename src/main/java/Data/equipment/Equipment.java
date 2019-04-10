package Data.equipment;

public abstract class Equipment {
    String refNumber;
    String model;

    public Equipment(String refNumber, String model) {
        this.refNumber = refNumber;
        this.model = model;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
