/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.task3;

public class Slovo {
    String value;

    public Slovo(String s) {
        if (s.trim().split("\\s+").length > 1) {
            throw new IllegalArgumentException("You must provide exactly one word.");
        }

        this.value = s;
    }

    public boolean isPalindrome() {
        return value.equalsIgnoreCase(reverse());
    }

    public int count() {
        return value.length();
    }

    public String reverse() {
        return new StringBuilder(value).reverse().toString();
    }
}
