package folder2;

import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class User1 {

    private int id;
    String name;
    private ArrayList<String> skills = new ArrayList<>();
}
