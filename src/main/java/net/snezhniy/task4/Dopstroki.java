/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.task4;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Dopstroki extends Stroki {
    public Dopstroki(String s) {
        super(s);
    }

    public String sortReverseAlphabetically() {
        return Arrays.stream(value.split("\\s+"))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining(" "));
    }
}
