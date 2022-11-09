package Factory.abstrct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public abstract class Teacher implements Users {
    String name;
    String grade;
}
