import service.AdminManagement;
import service.HotelManagement;
import service.impl.IHotelManagement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HotelManagement hotelManagement = new IHotelManagement();
        hotelManagement.management();

        }
    }
