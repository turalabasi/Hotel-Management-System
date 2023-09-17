package service.impl;

import service.AdminManagement;
import service.AdminService;
import util.InputUtil;
import util.MenuUtil;

import java.util.Objects;

public class IAdminService implements AdminService {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "adminpassword";
    @Override
    public void adminLogin() {
        String username = InputUtil.getInstance().inputString("enter the username : ");
        String password = InputUtil.getInstance().inputString("enter the password : ");
        AdminManagement adminManagement = new IAdminManagement();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)){
            adminManagement.management();

        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }
    }

}

