package dramaplays;

import java.util.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {

    @Test
    public void test_invoice_get_instance() {
        List<Performance> performances = new ArrayList<>();
        Invoice inv  = new Invoice("cust", performances);
        assertTrue(inv.customer == "cust" && inv.performances == performances);
    }

    @Test 
    public void test_invoice_equlity() {
        String cust1 = "Pouya";
        List<Performance> performances1 = new ArrayList<>();
        performances1.add(new Performance("1", 10));
        Invoice inv1 = new Invoice(cust1, performances1);
        String cust2 = "Shariar";
        List<Performance> performances2 = new ArrayList<>();
        performances2.add(new Performance("2", 11));
        Invoice inv2 = new Invoice(cust2, performances2);
        assertFalse(inv1.customer == inv2.customer && inv1.performances == inv2.performances);
    }
    
    @Test
    public void test_invoice_equlity2() {
        String cust1 = "Pouya";
        List<Performance> performances1 = new ArrayList<>();
        performances1.add(new Performance("1", 10));
        Invoice inv1 = new Invoice(cust1, performances1);
        String cust2 = "Pouya";
        List<Performance> performances2 = new ArrayList<>();
        performances2.add(new Performance("1", 10));
        Invoice inv2 = new Invoice(cust2, performances2);
        assertTrue(inv1.customer == inv2.customer);
    }
}