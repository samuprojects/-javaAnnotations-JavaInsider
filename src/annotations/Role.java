package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Repeatable(Roles.class)
public @interface Role {

    String value();
}
