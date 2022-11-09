package Factory.abstrct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Student  implements Users{
    String name;
    String standard;
}
