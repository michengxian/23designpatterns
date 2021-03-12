package decorator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CoffeeBar {

    public static void main(String[] args) {
//        Drink order;
//        order = new Decaf();
//        System.out.println("order1 price:" + order.cost());
//        System.out.println("order1 desc:" + order.getDescription());
//        System.out.println("****************");
//        order = new Milk(order);
//        System.out.println("order2 price:" + order.cost());
//        System.out.println("order2 desc:" + order.getDescription());

        String messageDate = showMessageViewDate();
        System.out.println(messageDate);
        String res = "为了您的账号安全，"+messageDate+"后，务必及时上传营业执照进行认证";
        System.out.println(res);
    }

    public final static String HOME_PAGE_MESSAGE_OVER_CLOSE_TIME = "2020-11-01";

    private static String showMessageViewDate(){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(HOME_PAGE_MESSAGE_OVER_CLOSE_TIME);
            DateFormat format1 = new SimpleDateFormat("yyyy-M-d日");
            return format1.format(date);
        } catch (ParseException e) {
            return "12月1日";
        }
    }

}
