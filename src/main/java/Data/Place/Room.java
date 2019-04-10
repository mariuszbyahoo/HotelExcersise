package Data.Place;

import Data.equipment.Equipment;

import java.util.Arrays;

public class Room {
    private String name;
    private int floorNumber;
    private Equipment[] equipment;

    public Room(String name, int floorNumber, Equipment[] equipment) {
        this.name = name;
        this.floorNumber = floorNumber;
        this.equipment = equipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Equipment[] getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment[] equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", floorNumber=" + floorNumber +
                ", equipment=" + Arrays.toString(equipment) +
                "}\n";
    }
}
