package blog.ex.lombok.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.METHOD, ElementType.PARAMETER})
public @interface BasicAnnotation {
}
