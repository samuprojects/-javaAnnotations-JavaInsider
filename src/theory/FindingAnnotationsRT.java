package theory;

@SuppressWarnings("ALL")
public class FindingAnnotationsRT {

    /*
    *
    * Para encontrar as annotations em tempo de execução, processar de alguma forma no código Java. Para isso será usado um pouco da Reflection API
    *
    * Por exemplo, para saber quais as annotations da Classe Book
    * e utilizar a Reflection API a porta de entrada é sempre o objeto class da Classe
    * quando utilizamos Book.class temos acesso ao objeto class que representa a classe Book.
    * Esse objeto class permite investigar os elementos da classe como as annotations.
    * Com isso podemos chamar o método getAnnotations para recuperar o array de annotations que faz parte dessa classe Book
    * No exemplo utilizamos Stream API e method reference para exibir as informações no console, além de incluir a RetentionPolicy.RUNTIME para liberar as informações em tempo de execução
    *
    * Outro exemplo: recuperar o @MaxLength do tittle para ver as annotations dele
    * novamente usamos a Reflection API chamando o método getDeclaredField() para buscar um atributo que foi declarado na classe (passando o atributo)
    * lançamos opcionalmente a exceção desse método para fora e chamamos o getAnnotations como no exemplo anterior
    *
    * se quiser acessar o value do MaxLength pode repetir os passos anteriores porém ao invés de chamar um array com todas, traz somente 1 com o getAnnotation
    * passando o objeto class do que se está buscando nesse exemplo é .getAnnotation(MaxLength.class), que vai retornar o MaxLength permitindo imprimir no console
    *
    * */
}
