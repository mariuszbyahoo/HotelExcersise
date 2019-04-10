package Data.Place;

import java.util.Arrays;

public class Hotel {

    private String name;
    private String adress;
    private Room[] rooms;
    private Restaurant restaurant;

    public Hotel(String name, String adress, Room[] rooms, Restaurant restaurant) {
        this.name = name;
        this.adress = adress;
        this.rooms = rooms;
        this.restaurant = restaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
        restaurant.setHotel(this);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", rooms=" + Arrays.toString(rooms) +
                ", restaurant=" + restaurant +
                "}\n";
    }
}
