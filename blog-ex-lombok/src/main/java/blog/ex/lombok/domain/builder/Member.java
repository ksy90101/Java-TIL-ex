package blog.ex.lombok.domain.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@lombok.Builder()
@AllArgsConstructor
@Getter
public class Member {
    private String email;
    private String name;
}
