package annotations;


@SuppressWarnings("ALL")
@SecurityConfig(allowed = { @Group("admin"), @Group("user") }) // aplicação da annotation com a definição do allowed que é uma sequência de Groups ->
public class ExSecurityConfig { // -> ou seja, podemos passar um array, um conjunto de elementos de outro tipo de annotation
    // é um exemplo claro de annotation que utiliza outras annotations dentro dela


}
