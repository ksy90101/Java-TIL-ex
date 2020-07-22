package blog.ex.lombok.domain.equalsandhashcode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@AllArgsConstructor
@EqualsAndHashCode(of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
public class AttributionMember extends SuperMember{
    private String email;
    private String name;
    private int age;
}
