package blog.ex.lombok.domain.constructor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@RequiredArgsConstructor(onConstructor = @__(@NonNull))
@AllArgsConstructor(staticName = "create", access = AccessLevel.PROTECTED)
public class AttributionMember {
    private final String email;
    private final String name;
    private int age;
}
