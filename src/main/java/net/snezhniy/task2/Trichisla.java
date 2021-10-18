/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.task2;

public class Trichisla {
    int a;
    int b;
    int c;

    public Trichisla(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum() {
        return Math.addExact(a, Math.addExact(b, c));
    }

    public int multiply() {
        return Math.multiplyExact(a, Math.multiplyExact(b, c));
    }

    public int max() {
        return Math.max(a, Math.max(b, c));
    }
}
