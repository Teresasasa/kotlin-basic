package com.thoughtworks.kotlin_basic.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LabelUtilTest {
    @Test
    fun `should convert number to letter`() {
        val labelUtil = LabelUtil()

        assertArrayEquals(arrayOf("A"), labelUtil.convertNumberToColumnLabel(1))
        assertArrayEquals(arrayOf("AA"), labelUtil.convertNumberToColumnLabel(27))
        assertArrayEquals(arrayOf("BA"), labelUtil.convertNumberToColumnLabel(53))
        assertArrayEquals(arrayOf("ZZ"), labelUtil.convertNumberToColumnLabel(702))
        assertArrayEquals(arrayOf("AAB"), labelUtil.convertNumberToColumnLabel(704))
        assertArrayEquals(arrayOf("ZZZ"), labelUtil.convertNumberToColumnLabel(18278))
    }
}