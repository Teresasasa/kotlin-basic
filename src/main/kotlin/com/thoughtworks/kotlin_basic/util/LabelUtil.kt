package com.thoughtworks.kotlin_basic.util

class LabelUtil {
    fun convertNumberToColumnLabel(start: Int): Array<String> {
        var n = start
        val label = StringBuilder()

        while (n > 0) {
            n -= 1
            label.append('A' + n % 26)
            n /= 26
        }

        return arrayOf(label.reverse().toString());
    }
}
