package annotations;

@SuppressWarnings("ALL")
public @interface Date {
    String format(); // o public é assumido por padrão, o default não pode ser null

    boolean enable() default true; // podemos definir um valor padrão usando default e
    // no atributo não precisamos informar nada, somente se for o false no caso do exemplo, para sobrescrever o padrão true


}
