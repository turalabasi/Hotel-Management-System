package helper;

import model.Customer;
import model.Hotel;
import model.Reservation;
import model.Room;
import util.InputUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static data.GlobalData.*;
import static javax.print.attribute.Size2DSyntax.MM;


public class ServiceHelper {
    static long roomId=0;
    static long hotelId=0;
    static long customerId=0;
    static long reservationId=0;

    public  static Room fillRoom(){
        try {
            int roomNumber = InputUtil.getInstance().inputInt("Enter the roomNumber : ");
            String roomType =InputUtil.getInstance().inputString("Enter the roomType : ");

            Double price = InputUtil.getInstance().inputDouble("Enter the price : ");

            return new Room(++roomId,roomNumber,roomType, (byte) 0,price);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Hotel fillHotel(){
        try {
            return new Hotel(++hotelId,"FourSeason","Georgia",9000000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Reservation fillReservation() {
        try {
            String customerEmail = InputUtil.getInstance().inputString("enter the customer email : ");
            int roomNumber = InputUtil.getInstance().inputInt("enter the roomNumber : ");
  for (Customer customer : customerLIst){
      for (Room room : roomList) {
          if (room.getSituationStatus() == 0 && roomNumber == room.getRoomNumber()) {


              room.setSituationStatus((byte) 1);
              double customerMoneyAccount = customer.getMoneyAccount();
              double transferMoney = room.getPrice();
              int restedMoney = (int) (customerMoneyAccount - transferMoney);

              customer.setMoneyAccount(restedMoney);
              System.out.println("rested money in your balance : " + restedMoney);

              for (Hotel hotel : hotelList) {
                  int hotelAccount = hotel.getBankAccount();
                  int toHotelAccount = (int) (transferMoney + hotelAccount);
                  hotel.setBankAccount(toHotelAccount);

                  System.out.println("update hotel banaAccount: " + toHotelAccount);
  }

            double roomPrice = InputUtil.getInstance().inputDouble("enter the roomPrice : ");
            LocalDateTime reservationDate = LocalDateTime.now();
            LocalDateTime endReservationDate = LocalDateTime.now().plusDays(1);

            return new Reservation(++reservationId,customerEmail,roomNumber,roomPrice,reservationDate,endReservationDate);
        } }}}catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public static Customer fillCustomer(){
        try {
            String name = InputUtil.getInstance().inputString("Enter the customer name : ");
            String surname = InputUtil.getInstance().inputString("Enter the customer surname : ");
            String phoneNumber = InputUtil.getInstance().inputString("Enter the customer phoneNumber : ");
            String email = InputUtil.getInstance().inputString("Enter the customer email : ");
            String password = InputUtil.getInstance().inputString("Enter the customer password : ");
            LocalDateTime registerDate = LocalDateTime.now();


            return  new Customer(++customerId,name,surname,phoneNumber,email,password,7800,null,null,registerDate,null,0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
