package theory;

@SuppressWarnings("ALL")
public class AnnotationsBehavior {

    /*
    *
    * A meta annotation @Retention define qual será o comportamento da annotation a ser utilizada
    * É necessário passar um value() com o tipo RetentionPolicy (que é um enum) com três opções: CLASS, RUNTIME, SOURCE
    *
    * CLASS quando o código é compilado a informação de que determinado elemento está anotado com @Id é armazenado no bytecode (no arquivo .class)
    * Na verdade esse é o comportamento padrão quando não se coloca uma Retention específica.
    *
    * RetentionPolicy.SOURCE significa que o compilador descartará a annotation na compilação
    * É utilizada quando a annotation é relacionada mais para o lado do desenvolvimento
    * Por exemplo algumas IDEs tem alguns toolkits, algumas classes, alguns elementos que pode utilizar ajudando a IDE no processo de compilação, após não é necessário, ou seja nesse cenário pode ser descartado
    *
    * RetentionPolicy.RUNTIME funciona semelhante ao CLASS, onde o @Id ficará armazenado no bytecode, porém, quando a aplicação iniciar a execução (JVM)
    * a informação da annotation ficará disponível em tempo de execução
    * Isso significa que, utilizando a Reflection API do Java (usada para investigar os elementos presentes em Runtime), será possível determinador se o elemento tem uma annotation ou não
    * Os Frameworks utilizam muito esse conceito, por exemplo, anotar um determinado método com alguma coisa, essa coisa vai acontecer durante a execução
    * Esse tipo de situação só é possível se determinada annotation for lida durante o tempo de execução, ou seja, precisa do RetentionPolicy.RUNTIME
    *
    * */
}
