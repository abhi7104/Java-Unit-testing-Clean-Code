package service;
import org.junit.jupiter.api.Test;
import demo.domain.Order;
import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {
    EmailService emailService;
    @Test
    void getInstanceTest() {
      emailService = new EmailService();
        assertTrue(emailService instanceof EmailService);
    }

    @Test
    void sendEmail() {
       emailService=new EmailService();
        Order order= new Order();
        order.setItemName("Potato");
        order.setPrice(2400);
        order.setQuantity(2);
        assertThrows(RuntimeException.class, ()-> emailService.sendEmail(order));
    }

    @Test
    void testSendEmail() {
        emailService=new EmailService();
        Order order= new Order();
        order.setItemName("Potato");
        order.setPrice(2400);
        order.setQuantity(2);
        String emailStatus="Email sent";
        assertTrue(emailService.sendEmail(order,emailStatus));

    }
}