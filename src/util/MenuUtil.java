package util;


public class MenuUtil {

    private static MenuUtil instance;
    private MenuUtil() {

    }

    public static MenuUtil getInstance() {
        return instance == null
                ? instance = new MenuUtil() : instance;
    }
    public  int entryApp(){
        System.out.println(
                                "[0]-> exit \n" +
                                "[1]-> Admin \n" +
                                "[2]-> Reservation \n" +
                                "[3]-> Customer \n");



        return InputUtil.getInstance().inputByte("enter the option");
    }
    public  int customerMenu(){
        System.out.println(
                        "[0]-> exit \n" +
                        "[1]-> back \n" +
                        "[2]-> Sign up \n" +
                        "[3]-> Login \n");



        return InputUtil.getInstance().inputByte("enter the option");
    }
    public  int loginMenu(){
        System.out.println(
                        "[0].-> Exit \n" +
                        "[1].-> Back \n" +
                        "[2].-> Show reservation \n" +
                        "[3].-> End date update  \n" +
                        "[4].-> Increase moneyAccount \n" +
                        "[5].-> Cancel to reservation \n" );



        return InputUtil.getInstance().inputInt("enter the option: ");
    }
    public  int adminMenu(){
        System.out.println(
                        "[0].-> Exit \n" +
                        "[1].-> Back \n" +
                        "[2].-> RegisterRoom \n"+
                                "[3].-> RegisterHotel \n" +
                        "[4].-> Show customer info  \n" +
                        "[5].->  Show room info \n" +
                        "[6].-> Show reservation  \n" +
                        "[7].->  Show hotel info \n" +
                        "[8].-> Search customer username(email) \n" );



        return InputUtil.getInstance().inputInt("enter the option: ");
    }



}



