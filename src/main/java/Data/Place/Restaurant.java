package Data.Place;

public class Restaurant {
    private String name;
    private String openHours;
    private Hotel hotel;
    private StringBuilder builder;

    public Restaurant(String name, String openHours, Hotel hotel) {
        this.name = name;
        this.openHours = openHours;
        this.hotel = hotel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        builder = new StringBuilder();
        builder.append("Restaurant{");
        builder.append("name=");
        builder.append(name);
        builder.append(", open hours=");
        builder.append(openHours);
        builder.append(", Hotel='");
        builder.append(this.getHotel().getName());
        builder.append('}');

        return builder.toString();
    }
}
