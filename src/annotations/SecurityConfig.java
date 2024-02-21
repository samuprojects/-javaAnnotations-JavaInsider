package annotations;

/*
*
* Criar annotation @SecurityConfig para anotar somente classes. Deve possuir atributo allowed
* Que representa 0 ou mais elementos do tipo @Group
* Annotation @Group deve ter obrigatoriamente um perfil de acesso associado (tipo String)
*
*
* */

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

@SuppressWarnings("ALL")
@Target(TYPE) // o TYPE também suporta interfaces, records, e outras declarações top level
public @interface SecurityConfig {

    Group[] allowed(); // atributo permitido, em um array de Groups o que permite ter 0 ou mais elementos de alguma coisa
}
