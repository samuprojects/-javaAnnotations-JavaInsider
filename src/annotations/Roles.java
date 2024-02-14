package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@SuppressWarnings("ALL")

@Target(ElementType.METHOD)
public @interface Roles {

    Role[] value();
}
