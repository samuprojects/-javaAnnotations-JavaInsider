package theory;

@SuppressWarnings("ALL")
public class RestrictingAnnotations {

    /*
    *
    * Normalmente quando se cria uma annotation há um interesse em restringir em que tipo de elementos será utilizada.
    * Por exemplo a primeira annotation que criamos @Id não possui nenhuma restrição podendo ser utilizada em qualquer lugar:
    * atributo, na classe, no construtor, ou em uma variável local.
    *
    * Para restringir precisamos utilizar uma meta annotation, que é uma annotation da annotation, ou seja, só pode utilizar na criação de annotations
    * Por exemplo a annotation @Target possui um value() que pode ser utilizado e é definido como um array de ElementType[]
    * O ElementType são alguns elementos que pode ser aplicado como FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, ANNOTATION_TYPE, RECORD_COMPONENTE, etc.
    * Com isso a annotation @Id restrita com a meta annotation @Target(ElementType.FIELD), por exemplo, permitirá uso do @Id apenas em atributos
    * Se quiser acrescentar métodos basta colocar uma vírgula e a IDE já preencherá com chaves caracterizando um array de elementos ficando conforme a seguir:
    * @Target({ ElementType.FIELD, ElementType.METHOD })
    *
    *
    * */
}
