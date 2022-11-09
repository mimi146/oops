package Structural.adapter.Payementgateway.payementAdapter;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
//step1; create common adapter interface ;
public class Request_payment {
   private float amount;
  private   String phone;
   private String name;
   private String email;
}
