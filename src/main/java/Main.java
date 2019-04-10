import Data.Place.Hotel;
import Data.Place.Restaurant;
import Data.Place.Room;
import Data.equipment.AirConditioner;
import Data.equipment.Equipment;
import Data.equipment.TV;

public class Main {
    public static void main (String [] args){

        Equipment[] eq = new Equipment[2];
        eq[0] = new TV("REF://112", "Samsung bambung", 2400, 4000);
        eq[1] = new AirConditioner("REF://113", "Huawei 5", 150, 20);

        Equipment[] vipEq = new Equipment[3];
        vipEq[0] = new TV("REF://221", "Lux Malina", 4800, 8000);
        vipEq[1] = new TV("REF://222", "Miodzio Lux", 4800, 9600);
        vipEq[2] = new AirConditioner("REF://223", "Zimna klima że aż huk!", 300, 10);

        Room[] rooms = new Room[6];
        rooms[0] = new Room("numer 0", 0, eq);
        rooms[1] = new Room("numer 1", 0, eq);
        rooms[2] = new Room("numer 2", 1, eq);
        rooms[3] = new Room("numer 3", 1, eq);
        rooms[4] = new Room("VIP Numer 1", 2, vipEq);
        rooms[5] = new Room("VIP Numer 2", 2, vipEq);



        System.out.println("Mamy hotel: \"Marysieńka\"");
        Hotel hotel = new Hotel("Marysieńka", "Dolna 5", rooms, null);
        Restaurant restaurant = new Restaurant("Obiady u Marii", "10-20", null);

        System.out.println("I teraz hotel bez restauracji: ");
        System.out.println(hotel.toString());
        try{
            hotel.setRestaurant(restaurant);
            System.out.println("Teraz juz mamy ustawioną restaurację i hotel no i teraz to drukujemy: ");
            System.out.println(hotel.toString());
        }catch (StackOverflowError error){
            error.printStackTrace();
        }
    }
}
