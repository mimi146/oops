package Creational.prototypes.academic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
public class Intructor extends User {
    private  Integer emp_id;

//    @Override
//    public Integer getPsp() {
//        return  this.emp_id;
//    }
    public Intructor(String name, Integer emp_id, UserType type) {
        super(name,type);
        this.emp_id =emp_id;
    }
    @Override
    public Intructor Clone() {
        return  new Intructor(this.getName(),this.emp_id,this.getType());

    }
}
