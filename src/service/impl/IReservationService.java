package service.impl;

import data.GlobalData;
import helper.ServiceHelper;
import model.Customer;
import model.Hotel;
import model.Reservation;
import model.Room;
import service.ReservationService;
import util.InputUtil;

import static data.GlobalData.*;

public class IReservationService implements ReservationService {
    @Override
    public void reservation() {


        String email = InputUtil.getInstance().inputString("enter the mail : ");
        String password = InputUtil.getInstance().inputString("enter the password : ");
        for (Customer customer : GlobalData.customerLIst) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                String roomType = InputUtil.getInstance().inputString("enter the roomType : ");
                for (Room room : GlobalData.roomList) {

                    if (room.getRoomType().equals(roomType) && room.getSituationStatus() == 0) {

                        System.out.println(room);
                    }


                }

                int count = InputUtil.getInstance().inputInt("Enter count for reservation : ");
                            for (int i = 0; i < count; i++) {
                                Reservation reservation = ServiceHelper.fillReservation();
                                if (reservation != null) {
                                    reservationList.add(reservation);

                                }
                            }

                        }

                    }


                }




        }








