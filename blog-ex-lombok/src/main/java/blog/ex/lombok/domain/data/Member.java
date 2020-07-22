package blog.ex.lombok.domain.data;

import lombok.Data;

@Data(staticConstructor = "create")
public class Member {
    private String email;
    private String name;
    private int age;
}
