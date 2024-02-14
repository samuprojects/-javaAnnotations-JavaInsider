package theory;

@SuppressWarnings("ALL")
public class InheritanceAnnotations {

    /*
    *
    * Annotations também são herdadas assim como as classes no Java?
    * Fazendo um teste em FictionBook para trazer a annotation @Item conforme executado com o Book
    * o resultado será um null, ou seja, o Java não reconhece uma annotation de uma classe herdada
    *
    * Esse comportamento pode ser alterado utilizando uma outra meta annotation chamada @Inherited (pode ser necessário em cenários de herança)
    * Isso vai indicar para o Java que essa annotation @Item do exemplo pode ser herdada, ou seja, levaa às subclasses
    *
    * Ao executar o teste novamente o resultado não será mais null
    *
    *
    * */
}
