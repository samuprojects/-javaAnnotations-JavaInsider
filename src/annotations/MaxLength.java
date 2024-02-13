package annotations;

@SuppressWarnings("ALL")
public @interface MaxLength {

    int value(); // quando o seu atributo se chama value, e apenas nesse caso, o nome dele pode ser omitido no parâmetro da annotation E;
    // só pode omitir o value se for a única propriedade (atributo) que faz parte de determinada annotation
}
