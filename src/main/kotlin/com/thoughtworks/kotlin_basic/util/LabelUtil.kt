package com.thoughtworks.kotlin_basic.util

class LabelUtil {
    fun convertNumberToColumnLabel(start: Int): String {
        var label = 'A' + (start - 1) % 26
        return label.toString();
    }
}
