/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.task1;

public class Calculator<T extends Number> {
    T a;
    T b;

    public Calculator(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public double sum() {
        return a.doubleValue() + b.doubleValue();
    }

    public double diff() {
        return a.doubleValue() - b.doubleValue();
    }

    public double multiply() {
        return a.doubleValue() * b.doubleValue();
    }
}
