package Structural.adapter.Payementgateway.externeal;

import static Structural.adapter.Payementgateway.externeal.payementStatus.success;

public class RazorPay {
    public String createpayementLink() {
        return "links";
    }
    public String  makepayemnt(float amount, String name) {
        return "id";
    }



    public payementStatus checkstatus(Integer paymentId) {

       return success;
    }

}
