package service.impl;

import data.GlobalData;
import model.Customer;
import model.Hotel;
import model.Reservation;
import model.Room;
import service.LoginService;
import util.InputUtil;

import java.time.LocalDateTime;

import static data.GlobalData.*;

public class ILoginService implements LoginService {
    @Override
    public void endDateUpdate() {
            long id = InputUtil.getInstance().inputLong("enter the reservation id : ");
            for (Reservation reservation : reservationList){
                if (reservation.getId() == id){
                    LocalDateTime endReservationDate = reservation.setEndReservationDate(LocalDateTime.now().plusDays(1));
                    for (Customer customer : customerLIst) {
                        for (Room room : roomList) {

                            double customerAccount = customer.getMoneyAccount();
                            double decreasedMoney = room.getPrice();
                            int restedAccount = (int) (customerAccount - decreasedMoney);

                            customer.setMoneyAccount(restedAccount);
                            System.out.println("rested money in your balance : " + restedAccount);

                            for (Hotel hotel : hotelList) {
                                int hotelAccount = hotel.getBankAccount();
                                int toHotelAccount = (int) (decreasedMoney + hotelAccount);
                                hotel.setBankAccount(toHotelAccount);

                                System.out.println("update hotel bankAccount: " + toHotelAccount);
                            }
                        }
                    }
                }
            }
    }

    @Override
    public void increaseMoneyAccount() {
        double increaseMoneyAccount = InputUtil.getInstance().inputDouble("enter the amount to increase : ");

        for (Customer customer : GlobalData.customerLIst) {
            double newMoneyAccount = customer.getMoneyAccount() + increaseMoneyAccount;
            customer.setMoneyAccount(newMoneyAccount);
            System.out.println("your new increased balance is : " + newMoneyAccount);
        }


    }

    @Override
    public void CancelToReservation() {
        long id = InputUtil.getInstance().inputByte("enter the reservation id : ");
        for (Reservation reservation : reservationList){
            if (reservation.getId() == id){
                reservationList.remove(reservation);
                for (Hotel hotel : hotelList){
                    for (Room room : roomList){

                        double bankAccount = hotel.getBankAccount();
                        double roomPrice = room.getPrice();
                        double newCustomerBankAccount = bankAccount - 0.2 *roomPrice;
                    }

                }

            }
        }

    }
}
