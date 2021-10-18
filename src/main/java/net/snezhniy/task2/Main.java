package net.snezhniy.task2;

import net.snezhniy.TaskEntrypoint;
import net.snezhniy.Utils;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
№2. Создать класс Trichisla. В этом классе должны быть определен
конструктор, принимающий в качестве входных параметров три целых числа.
Кроме того, в классе должны быть определены следующие методы:
 2.1. Суммирование трех чисел
 2.2. Перемножение трех чисел
 2.3. Нахождение наибольшего числа

На базе класса Trichisla создать класс-потомок Trplus, в котором определены
следующие дополнительные методы:
 2.4. Выдать на консоль информацию о том, могут ли эти числа быть
 сторонами треугольника
 2.5. Выдать на консоль эти три числа в порядке возрастания
 Продемонстрировать работу данных классов на основе произвольно введенных
 3 чисел.
*/
public class Main implements TaskEntrypoint {
    public void run() {
        Scanner scan = Utils.makeScanner();

        System.out.println("Введите три целых числа: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        Trichisla trichisla = new Trichisla(a, b, c);
        int max = trichisla.max();
        int sum = trichisla.sum();
        int multiplied = trichisla.multiply();

        System.out.printf("Наибольшее число: %s\n", max);
        System.out.printf("Сумма всех чисел: %s\n", sum);
        System.out.printf("Произведение всех чисел: %s\n", multiplied);

        Trplus trplus = new Trplus(a, b, c);
        String joined = trplus.sortedStream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        if (trplus.isValidTriangle()) {
            System.out.printf("Числа %s являются верными сторонами треугольника.\n", joined);
        } else {
            System.out.printf("Числа %s являются неверными сторонами треугольника.\n", joined);
        }
    }
}
