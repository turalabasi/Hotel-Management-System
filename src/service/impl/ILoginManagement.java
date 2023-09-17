package service.impl;

import exception.InvalidOptionException;
import exception.WrongFormatException;
import service.*;
import util.MenuUtil;

import java.util.InputMismatchException;

import static util.MenuUtil.getInstance;

public class ILoginManagement implements LoginManagement {
    @Override
    public void management() {
        while (true) {

            try {
                int option = getInstance().loginMenu();
                AdminService adminService = new IAdminService();
                HotelService hotelService = new IHotelservice();
                RoomService roomService = new IRoomService();
                CustomerService customerService = new ICustomerService();
                LoginService loginService = new ILoginService();
                CustomerManagement customerManagement = new ICustomerManagement();

                switch (option) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        customerManagement.management();
                        break;
                    case 2:
                        hotelService.showReservation();
                        break;
                    case 3:
                        loginService.endDateUpdate();
                        break;
                    case 4:
                        loginService.increaseMoneyAccount();
                        break;
                    case 5:
                        loginService.CancelToReservation();
                        break;

                    default:
                        throw new RuntimeException();
                }
            } catch (
                     InputMismatchException | InvalidOptionException | WrongFormatException | NumberFormatException e) {
                System.err.println(e.getMessage());

            }
        }
    }
}
