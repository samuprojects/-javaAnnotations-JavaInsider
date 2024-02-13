package theory;

@SuppressWarnings("ALL")
public class AnnotationsConcept {

    /*
    *
    * Annotations
    *
    * É uma sintaxe do Java que permite adicionar "alguma coisa" que tem algum significado para "alguém"
    * Serve para avisar de algo que está prestes a acontecer
    *
    * Por exemplo a annotation @Override aplicada no método toString vai informar para o Java que trata-se de uma sobrescrita de método
    * Outro exemplo é o @SuppressWarnings para eliminar alguns alertas do compilador
    * A annotation @FunctionalInterface que você define quando possui uma interface com apenas um método, permitindo, por exemplo, para ser utilizada
    * como fonte de expressão lambda
    *
    * Existem situações em que é possível criar suas próprias annotations, quando no desenvolvimento de uma biblioteca, ou API, ou um Framework.
    * Fora dos cenários apresentados, dificilmente é utilizado no desenvolvimento "normal" (implementação comum) de uma aplicação, mas é uma possibilidade.
    *
    * Para este módulo vamos inicialmente criar annotations para a classe Book do projeto
    *
    * No intellij ao selecionar New Java Class será possível escolher a opção Annotation, onde já será criado uma estrutura com @interface e o nome da annotation
    * É como se estivesse criando uma interface porém com um arroba para indicar que é annotation não confundir com a criação de uma interface
    *
    * */
}
