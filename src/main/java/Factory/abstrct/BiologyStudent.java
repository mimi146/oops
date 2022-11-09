package Factory.abstrct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BiologyStudent extends Student {

    public BiologyStudent(String name, String standard) {
        super(name,standard);
    }
}
