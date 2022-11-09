package Factory.abstrct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class BiologyTeacher extends Teacher {

    public BiologyTeacher(String name, String grade) {
        super(name, grade);
    }
}
