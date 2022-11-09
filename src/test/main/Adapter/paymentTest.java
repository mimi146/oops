package Adapter;

import Structural.adapter.Payementgateway.payementAdapter.Razorpay_payemntProvider;
import Structural.adapter.Payementgateway.payementAdapter.Request_payment;
import Structural.adapter.Payementgateway.payementAdapter.payUpayemnt_provider;
import Structural.adapter.Payementgateway.payementAdapter.paymentprovider;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class paymentTest {
   private paymentprovider provider1 ;
   private paymentprovider provider2 ;

   @Before
   public void setup() {
      provider1 = new Razorpay_payemntProvider();
      provider2 = new payUpayemnt_provider();
   }

   @Test
   public void testlink1() {
      String link = provider1.makelink();
      assertEquals("if link is called", "links",link);
   }
   @Test
   public void testlink2() {
      String link = provider2.makelink();
      assertEquals("if link is called", "links",link);
   }

   @Test
   public void testpayment1(){
      Request_payment request = Request_payment.builder()
              .amount(100)
              .name("Milan")
              .phone("7005608598")
              .email("mimikiki64@gmail.com")
              .build();
      String id = provider1.do_payemnt(request);
      assertEquals("id",id);
   }

   @Test
   public void testpayment2(){
      Request_payment request = Request_payment.builder()
              .amount(100)
              .name("Milan")
              .phone("7005608598")
              .email("mimikiki64@gmail.com")
              .build();
      String id = provider2.do_payemnt(request);
      assertEquals("id",id);
   }


}
