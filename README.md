## Magic box

**Реализовать класс MagicBox, который умеет выбирать случайным образом один из сохранённых в него объектов.**

В Main продемонстрируйте работу класса, создайте для этого магическую коробку для строк и вторую для чисел и продемонстрируйте на них работу методов. 

    Для создания массива с ячейками типа дженерик-параметра используйте: T[] items = (T[]) new Object[РАЗМЕР];.


* При конструировании объекта этого класса указывается, сколько объектов в него можно положить (механика похожа на решение задачи про Полиморфизм).

* Тип добавляемых объектов должен быть тип-параметром класса - т.е. сам класс должен быть дженерик-классом с одним тип-параметром.

* У вас должен быть метод добавления объекта `boolean add(T item)`. Если коробка ещё не полна, то элемент должен в ней сохраниться и метод вернуть true. Если полна, то коробка не должна измениться, а метод должен вернуть false.

      Для определения незаполненности кородки проверьте массив items на наличие null.

* Также нужно реализовать метод `T pick()`, работающий следующим образом:

    * Если коробка не полна, то он выкидывает `RuntimeException` с сообщением, что коробка не полна и осталось ещё столько-то ячеек заполнить.

    * Если коробка полна, то метод выбирает случайным образом (см. ниже) один из сохранённых элементов и возвращает его из метода (хранить сохранённые элементы предлагаем в массиве, как в задаче про Полиморфизм). 

* Массив создавать в конструкторе, размером который был указан в его параметре. 
* Для выбора случайного элемента воспользуйтесь классом Random (не забудьте заимпортить):
```java
1 Random random = new Random();
2 int randomInt = random.nextInt(ЧИСЛО); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
```
    Для выбора случайного элемента выберите случайное число-индекс массива и верните его содержимое.






