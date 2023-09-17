package service.impl;

import exception.EmptyListException;
import exception.InvalidOptionException;
import exception.WrongFormatException;
import service.*;

import java.util.InputMismatchException;


import static util.MenuUtil.getInstance;

public class IAdminManagement implements AdminManagement {
    @Override
    public void management() {
        while (true){

            try {
                int option= getInstance().adminMenu();
                AdminService adminService = new IAdminService();
                ReservationService reservationService = new IReservationService();
                HotelService hotelService = new IHotelservice();
                RoomService roomService= new IRoomService();
                CustomerService customerService=new ICustomerService();
                HotelManagement hotelManagement = new IHotelManagement();
                switch (option) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        hotelManagement.management();
                        break;
                    case 2:
                        roomService.RegisterRoom();
                        break;
                    case 3:
                        hotelService.registerHotel();
                        break;
                    case 4:
                        customerService.showCustomer();
                        break;
                    case 5:
                        roomService.showRoomInfo();
                        break;
                    case 6:
                        hotelService.showReservation();
                        break;
                    case 7:
                        hotelService.showHotelInfo();
                        break;
                    case 8:
                        customerService.searchCustomer();
                        break;
                    default:
                        throw new RuntimeException();
                }
            } catch (
                    InputMismatchException | EmptyListException | InvalidOptionException | WrongFormatException | NumberFormatException e){
                System.err.println(e.getMessage());

            }

        }

    }
}
