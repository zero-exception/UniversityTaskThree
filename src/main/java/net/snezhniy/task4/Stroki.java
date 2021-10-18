/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.task4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Stroki {
    String value;

    public Stroki(String s) {
        this.value = s.trim();
    }

    public int wordCount() {
        return value.split("\\s+").length;
    }

    public String reverse() {
        return new StringBuilder(value).reverse().toString();
    }

    public String sortAlphabetically() {
        return Arrays.stream(value.split("\\s+"))
                .sorted()
                .collect(Collectors.joining(" "));
    }
}
