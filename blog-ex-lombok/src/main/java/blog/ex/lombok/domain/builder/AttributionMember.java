package blog.ex.lombok.domain.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder(builderClassName = "MemberBuilder", builderMethodName = "memberBuilder", buildMethodName = "memberBuild",
        toBuilder = true, access = AccessLevel.PROTECTED, setterPrefix = "member")
@AllArgsConstructor
@Getter
public class AttributionMember {
    private String email;
    private String name;
}
