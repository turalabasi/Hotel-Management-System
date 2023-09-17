package service.impl;

import helper.ServiceHelper;
import model.Hotel;
import model.Reservation;
import model.Room;
import service.HotelService;
import util.InputUtil;

import static data.GlobalData.*;

public class IHotelservice implements HotelService {


    @Override
    public void registerHotel() {
        int count = InputUtil.getInstance().inputInt("Enter count to register : ");
        for (int i = 0; i < count; i++) {
            Hotel hotel = ServiceHelper.fillHotel();
            if (hotel != null){
                hotelList.add(hotel);
                System.out.println("register successfully");
    }
        }
    }

    @Override
    public void showHotelInfo() {

        for (Hotel hotel : hotelList) {


                    System.out.println(hotel);
                }
            }




    @Override
    public void showReservation() {
        for (Reservation reservation : reservationList){
            System.out.println(reservation);
        }

    }

}
