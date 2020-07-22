package blog.ex.lombok.domain.tostring;

import lombok.ToString;

@ToString(callSuper = true, of = {"age", "email"}, includeFieldNames = false, doNotUseGetters = true)
public class AttributesMember extends SuperMember {
    private final String email;
    private final String name;
    private final int age;

    public AttributesMember(Long id, String email, String name, int age) {
        super(id);
        this.email = email;
        this.name = name;
        this.age = age;
    }
}
