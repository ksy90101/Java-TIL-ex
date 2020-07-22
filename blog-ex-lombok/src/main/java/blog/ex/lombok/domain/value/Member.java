package blog.ex.lombok.domain.value;

import lombok.AccessLevel;
import lombok.Value;
import lombok.With;

@Value
public class Member {
    @With(AccessLevel.PRIVATE)
    String email;
}
