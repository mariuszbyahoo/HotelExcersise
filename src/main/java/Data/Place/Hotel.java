package Data.Place;

import java.util.Arrays;

public class Hotel {

    private String name;
    private String adress;
    private Room[] rooms;
    private Restaurant restaurant;
    private StringBuilder builder;

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
        builder = new StringBuilder();

        builder.append("Hotel{");
        builder.append("name=");
        builder.append(name);
        builder.append(", adress=");
        builder.append(adress);
        builder.append(", rooms=");
        builder.append(Arrays.toString(rooms));
        builder.append(", Restaurant='");
        builder.append(restaurant);
        builder.append('}');

        return builder.toString();
    }
}
