package Structural.adapter.Payementgateway.payementAdapter;

import Structural.adapter.Payementgateway.externeal.PayUpayment;
import Structural.adapter.Payementgateway.externeal.payementStatusPayU;

public class payUpayemnt_provider implements paymentprovider{
    PayUpayment api = new PayUpayment();
    @Override
    public String makelink() {
        return api.makelink();
    }

    @Override
    public String do_payemnt(Request_payment request) {
        return api.createpayemnt(request.getAmount(),request.getName(),request.getPhone());
    }

    @Override
    public payemnt_status getStatus(Integer payemntId) {
        return toPayemnt_status(api.checkstatus(payemntId));
    }

    private payemnt_status toPayemnt_status(payementStatusPayU checkstatus) {
        if(checkstatus== payementStatusPayU.sucess) {
            return payemnt_status.OK;
        }
        else {
            return payemnt_status.ERROR;
        }
    }
}
