package main.java.app;

import main.java.app.service.Service;
import main.java.app.service.ServiceRepo;
import main.java.app.user.User;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {


        Service service = new Service();
        service.setName("aa");
        service.setPrice(new BigDecimal(12));
        service.setDescription("qqq");
        ServiceRepo.save(service);

        Service ser2 = new Service();
        ser2.setName("bb");
        ser2.setPrice(new BigDecimal(12));
        ser2.setDescription("qqq");
        ServiceRepo.save(ser2);


    }
}
