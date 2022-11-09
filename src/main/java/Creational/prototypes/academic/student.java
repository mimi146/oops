package Creational.prototypes.academic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
public class student extends User {
    private Integer student_id;
    private Integer psp;

//    @Override
//    public Integer getPsp(){ return  this.psp;}
   public student(String name, Integer student_id,Integer psp,UserType type){
         super(name,type);
         this.student_id = student_id;
         this.psp = psp;

    }

    @Override
    public student Clone() {
        return  new student(this.getName(),this.getStudent_id(),this.getPsp(),this.getType());
    }
}
