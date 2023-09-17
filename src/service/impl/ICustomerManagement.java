package service.impl;

import exception.InvalidOptionException;
import exception.WrongFormatException;
import service.*;
import util.MenuUtil;

import java.util.InputMismatchException;

public class ICustomerManagement implements CustomerManagement {
    @Override
    public void management() {
        while (true){

            try {
        int option = MenuUtil.getInstance().customerMenu();
        HotelManagement hotelManagement = new IHotelManagement();
        CustomerService customerService = new ICustomerService();
        LoginManagement loginManagement = new ILoginManagement();
        CustomerLogin customerLogin = new ICustomerLogin();
        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1:
                hotelManagement.management();
                break;
            case 2:
                customerService.signUP();
                break;
            case 3:
                customerLogin.customerLogin();
                break;
            default:
                throw new RuntimeException();
        }
    } catch (
    InputMismatchException | InvalidOptionException | WrongFormatException | NumberFormatException e){
        System.err.println(e.getMessage());

    }

}

    }
}
