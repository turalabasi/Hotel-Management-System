package service.impl;

import data.GlobalData;
import model.Customer;
import service.CustomerLogin;
import service.LoginManagement;
import util.InputUtil;

public class ICustomerLogin implements CustomerLogin {
    @Override
    public void customerLogin() {
        String email = InputUtil.getInstance().inputString("enter the mail : ");
        String password = InputUtil.getInstance().inputString("enter the password : ");
        LoginManagement loginManagement = new ILoginManagement();
        for (Customer customer : GlobalData.customerLIst) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)){
                loginManagement.management();
            }
        }
    }
}
