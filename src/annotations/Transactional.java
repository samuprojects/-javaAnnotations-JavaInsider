package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@SuppressWarnings("ALL")
@Target({CONSTRUCTOR, METHOD})
@Retention(RUNTIME)
public @interface Transactional {

    /*
    *
    * Criar annotation @Transactional com os requisitos:
    * Somente aplicada em construtores e métodos
    * Somente lida durante a execução da aplicação via Reflection API
    * Possuir atributo booleano "rollback" com valor false por padrão
    *
    * */

    boolean rollback() default false;

}
