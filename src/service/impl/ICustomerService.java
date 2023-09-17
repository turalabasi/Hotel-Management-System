package service.impl;

import data.GlobalData;
import helper.ServiceHelper;
import model.Customer;
import service.CustomerService;
import util.InputUtil;

import static data.GlobalData.customerLIst;

public class ICustomerService implements CustomerService {
    @Override
    public void signUP() {
        int count = InputUtil.getInstance().inputInt("Enter count to register : ");
        for (int i = 0; i < count; i++) {
            Customer customer = ServiceHelper.fillCustomer();
            if (customer != null){
                customerLIst.add(customer);
            }

        }
    }

    @Override
    public void showCustomer() {
        for (Customer customer : customerLIst){
            System.out.println(customer);
        }

    }

    @Override
    public void searchCustomer() {
        String key = InputUtil.getInstance().inputString("enter the key word");
        boolean isFind = false;
        for (Customer customer:customerLIst
        ) {
            if (customer.getEmail().equals(key)){
                System.out.println(customer);
                isFind= true;

            }

        }
        if (isFind){
            System.out.println("Register successfully ");


        }


    }

    }

