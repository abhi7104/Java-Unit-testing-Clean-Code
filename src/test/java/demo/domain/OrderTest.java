package demo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order=new Order(3,"Potato",2400);
    @Test
    void getQuantity() {
        assertEquals(3,order.getQuantity());
    }

    @Test
    void setQuantity() {
        int quantity=5;
        order.setQuantity(quantity);
        assertEquals(quantity,order.getQuantity());
    }

    @Test
    void getItemName() {
        assertEquals("Potato",order.getItemName());
    }

    @Test
    void setItemName() {
        String itemName="Tomato";
        order.setItemName(itemName);
        assertEquals(itemName,order.getItemName());
    }

    @Test
    void getPrice() {
        assertEquals(2400,order.getPrice());
    }

    @Test
    void setPrice() {
        Double price= 3000.0;
        order.setPrice(price);
        assertEquals(price,order.getPrice());
    }
    @Test
    void setPriceWithTex() {
        double priceWithTax=3100.10;
        order.setPriceWithTex(priceWithTax);
        assertEquals(priceWithTax,order.getPriceWithTex());
    }
}