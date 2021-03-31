package com.company;

import java.util.Random;

public class Main {

    /*
    Задание 8.1
        Приведите пример использование хеш-таблиц.
        У меня есть склад вещей. каждая вещь прогоняется через функцию и выдает число,
        которое я храню в массиве. Так проще хранить и доставать информацию, а главное
        это очень быстро. Это так же предоставляет сохранность данных от не друга.

    Задание 8.2
        Приведите примеры ключей и коллизий.
        Привер ключя может быть, Логин, пароль, наименование товара, имя пользователя
        пример коллизей, в поиск пишешь огурец, а код должен искать цену. и тебе
        выводит стоимость огурца 20 000, но это цена холодильника. а цену холодильника
        выводит тоже 20 000, так как хэш огурца и холодильника один.

    Задание 8.3
        Приведите примеры популярных и эффективных хеш-функций.
        1 - String s = "Tests";
        System.out.println(s.hashCode());
        2 - умножение число(например порядковый номер буквы) на какое либо число в степени ,
        степень которого, которая уменьшается
        в зависимости от длины слова и все это складывается. применяется формула сокращения
        или разделения на ячейки массива данное число для хранения.

        Задание 8.5
        Сравните отличительные черты двух алгоритмов.
        двойное хэширование заполняет таблицу более кучно и это наиболее лучший способ избегать
        колизии.
     */

    public static void main(String[] args) {

        Item aData;
        int aKey;
        int size = 30;

        HashTable hashTable = new HashTable(size);
        for (int i = 0; i < 15; i++) {
            aKey = new Random().nextInt(199);
            aData = new Item(aKey);
            hashTable.insert(aData);
        }

        hashTable.display();
    }
}
