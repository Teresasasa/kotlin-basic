package com.thoughtworks.kotlin_basic.util

class LabelUtil {
    fun convertNumberToColumnLabelArray(start: Int, count: Int): Array<String> {
        // the largest label is zzz and its number is 18278
        if (start < 1 || count < 1 || start + count > 18279) {
            throw IllegalArgumentException("start and count should be larger than 1")
        }

        return Array(count) { i ->
            val number = start + i
            convertNumberToLabel(number)
        }
    }

    private fun convertNumberToLabel(start: Int): String {
        var n = start
        val label = StringBuilder()

        while (n > 0) {
            n -= 1
            label.append('A' + n % 26)
            n /= 26
        }

        return label.reverse().toString();
    }
}
