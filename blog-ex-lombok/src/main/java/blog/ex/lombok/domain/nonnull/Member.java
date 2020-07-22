package blog.ex.lombok.domain.nonnull;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class Member {
    @NonNull
    private String email;
}
