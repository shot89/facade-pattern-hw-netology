# Задача Двоичный фасад

## Описание
В этом задании попрактикуемся с шаблоном *Facade* (*Фасад*). Вы уже знаете, что джава даёт нам много возможностей для вычислений, в том числе для парсинга чисел из произвольных систем счисления и обратно, произведения математических операций и так далее. Вам же надо написать простой класс-фасад к набору стандартных классов джавы, который будет уметь всего две вещи: складывать и перемножать числа в двоичной системе счисления:

```java
public class BinOps {
  public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
  }
  public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
  }
}
```