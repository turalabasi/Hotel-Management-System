package service.impl;

import exception.EmptyListException;
import exception.InvalidOptionException;
import exception.WrongFormatException;
import service.*;
import util.MenuUtil;

import java.util.InputMismatchException;

public class IHotelManagement implements HotelManagement {
    @Override
    public void management() {
        while (true) {
            try {
                HotelService hotelService = new IHotelservice();
                AdminService adminService = new IAdminService();
                CustomerManagement customerManagement = new ICustomerManagement();
                ReservationService reservationService = new IReservationService();
                int option = MenuUtil.getInstance().entryApp();

                switch (option) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        adminService.adminLogin();
                        break;
                    case 2:
                        reservationService.reservation();
                        break;
                    case 3:
                        customerManagement.management();
                        break;
                    default:
                        System.out.println("Invalid option: ");
                }
            } catch (InvalidOptionException | WrongFormatException | EmptyListException |
                     InputMismatchException | NumberFormatException e) {
                System.err.println(e.getMessage());
            }

        }
    }
}
