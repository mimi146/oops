package Structural.adapter.Payementgateway.payementAdapter;

import Structural.adapter.Payementgateway.externeal.RazorPay;
import Structural.adapter.Payementgateway.externeal.payementStatus;

// step:2 ctreate concreate adaptee sub-class
public class Razorpay_payemntProvider implements paymentprovider {
    private RazorPay api = new RazorPay();
    @Override
    public String makelink() {
        return api.createpayementLink();
    }

    @Override
    public String do_payemnt(Request_payment request) {
        return api.makepayemnt(request.getAmount(),request.getName());
    }

    @Override
    public payemnt_status getStatus(Integer payemntId) {
        return toPayemntStatus(api.checkstatus(payemntId));
    }
            private payemnt_status toPayemntStatus(payementStatus checkstatus) { // wrapper/ converter

                if(checkstatus == payementStatus.failure ) {
                    return payemnt_status.ERROR;  // this type of return is called EARLY RETURN
                }
                else {
                    return payemnt_status.OK;
                }
            }
}
