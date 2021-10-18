/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.task4;

import net.snezhniy.TaskEntrypoint;
import net.snezhniy.Utils;

import java.util.Scanner;

/*
№4. Создать класс Stroki. В этом классе должны быть определен конструктор,
принимающий в качестве параметра произвольную строку. Кроме того, в
классе должны быть определены следующие методы:
 4.1. Подсчет количества слов в строке
 4.2. Инверсия строки (перезапись строки задом-наперед)
 4.3. Сортировка слов строки (по возрастанию, т.е. по алфавиту от а до я)
На базе класса Stroki создать класс-потомок Dopstroki, в котором
переопределен метод сортировки слов – слова должны выдаваться по
убыванию (т.е. по алфавиту от я до а)
Продемонстрировать работу данных классов на основе произвольно введенной
строки.
*/
public class Main implements TaskEntrypoint {
    public void run() {
        Scanner scan = Utils.makeScanner();

        System.out.print("Введите строку: ");
        Stroki stroki = new Stroki(scan.nextLine());

        System.out.printf("Слов в строке: %s\n", stroki.wordCount());
        System.out.printf("Перевёрнутая строка: %s\n", stroki.reverse());
        System.out.printf("Алфавитная сортировка: %s\n", stroki.sortAlphabetically());
    }
}
