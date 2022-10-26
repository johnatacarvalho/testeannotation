# Java Annotations

## Categorias

* Marker
* Single Value
* Full
* Type
* Repeating


### Marker

* Não possui valores especificos.
* A presença, ou não, já é suficiente.

Ex: `@Override`

### Single Value

* Possui apenas um dado de valor
* Caso não exista default, valor deve ser informado

Ex: `@MinhaAnnotation("valor aqui")`

### Full
* Possui mais de um dado de valor
* Necessário inserir nome do dado de valor antes do valor

Ex: `@MinhaAnnotation(mensagem="valor aqui", prioridade=0)`

### Type Annotation

* Pode ser inserida em qualquer lugar que seja definido, sejam métodos, classes, construtores ou atributos.

### Repeating
* Pode ser usada uma ou mais vezes no mesmo local
