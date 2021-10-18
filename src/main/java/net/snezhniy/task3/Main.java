/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.task3;

import net.snezhniy.TaskEntrypoint;
import net.snezhniy.Utils;

import java.util.Scanner;

/*
Создать класс Slovo. В этом классе должны быть определен конструктор,
принимающий в качестве параметра произвольную строку, состоящую из
одного слова. Кроме того, в классе должны быть определены следующие
методы:
  4.1. Определение - перевертыш ли введенное слово.
  4.2. Подсчет количества букв в слове.
  4.3. Инверсия (перезапись слова задом-наперед).
Продемонстрировать работу данного класса на основе произвольно введенного
слова.
 */
public class Main implements TaskEntrypoint {
    public void run() {
        Scanner scan = Utils.makeScanner();

        System.out.print("Введите слово: ");
        String word = scan.nextLine().trim();

        Slovo slovo = new Slovo(word);
        System.out.printf("В слове %s букв\n", slovo.count());

        if (slovo.isPalindrome()) {
            System.out.println("Оно является словом-перевёртышем");
        } else {
            System.out.println("Оно не является словом-перевёртышем");
        }
    }
}
