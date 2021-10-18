/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.task1;

import net.snezhniy.TaskEntrypoint;
import net.snezhniy.Utils;

import java.util.Scanner;

/*
№1. Написать программу arifmometr, которая запрашивает с консоли 2 числа и
выдает:
1.1. Сумму этих чисел
1.2. Разность этих чисел
1.3. Произведение этих чисел
Программу написать в объектно-ориентированном стиле, т.е. создать класс
calculator, в котором описать 3 метода класса: подсчет суммы, разности,
произведения. В главном классе вести 2 числа с консоли, создать объект класса
calculator используя методы класса, провести нужные вычисления.
*/
public class Main implements TaskEntrypoint {
    public void run() {
        Scanner scan = Utils.makeScanner();

        System.out.print("Введите первое число: ");
        double a = Double.parseDouble(scan.nextLine().trim());

        System.out.print("Введите второе число: ");
        double b = Double.parseDouble(scan.nextLine().trim());

        Calculator<Double> calc = new Calculator<>(a, b);
        double sum = calc.sum();
        double diff = calc.diff();
        double multiplied = calc.multiply();

        String msg = String.format("Сумма A и B: %s\nРазность A и B: %s\nПроизведение A и B: %s", sum, diff, multiplied);
        System.out.println(msg);
    }

}
