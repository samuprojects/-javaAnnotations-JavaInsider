package theory;

@SuppressWarnings("ALL")
public class RepeatingAnnotations {

    /*
    * Utilizando um exemplo de uma annotation Role para simular como se determinado método estivesse disponível para determinado tipo de usuário
    * Para repetir annotations no mesmo elemento (pois o Java não permite) sem usar um array, específico em alguns cenários, duas coisas são necessárias:
    * 1) Informar que a anotação pode ser repetida utilizando o @Repeatable que exige a presença de um container para agrupar tudo num lugar só
    * Para isso deve-se criar uma outra annotation (exmeplo Roles) que contenha um value com um array do tipo da annotation que se deseja repetir
    * Por exemplo Role[] value();
    * Na annotation a ser repetida incluir @Repeatable(Roles.class), importante que essas annotations tenham o mesmo @Target
    *
    *
    * */
}
