package Structural.adapter.Payementgateway.payementAdapter;

public interface paymentprovider {

    public String makelink();
    public  String do_payemnt(Request_payment request);
    public payemnt_status getStatus(Integer payemntId);

}
