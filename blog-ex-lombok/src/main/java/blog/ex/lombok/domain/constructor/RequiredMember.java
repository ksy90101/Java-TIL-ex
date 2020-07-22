package blog.ex.lombok.domain.constructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RequiredMember {
    private final String name;
    @NonNull
    private String email;
    private int age;
}
