package com.thoughtworks.kotlin_basic.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows


class LabelUtilTest {
    private val labelUtil = LabelUtil()

    @Test
    fun `should convert number to letters array`() {

        assertArrayEquals(arrayOf("A"), labelUtil.convertNumberToColumnLabelArray(1,1))
        assertArrayEquals(arrayOf("AA"), labelUtil.convertNumberToColumnLabelArray(27,1 ))
        assertArrayEquals(arrayOf("ZZZ"), labelUtil.convertNumberToColumnLabelArray(18278, 1))
        assertArrayEquals(arrayOf("A", "B"), labelUtil.convertNumberToColumnLabelArray(1, 2))
        assertArrayEquals(arrayOf("Z", "AA", "AB"), labelUtil.convertNumberToColumnLabelArray(26, 3))
    }

    @Test
    fun `should throw error when start or count is not illegal`() {
        assertThrows<IllegalArgumentException> {
            labelUtil.convertNumberToColumnLabelArray(-1,1)
        }
        assertThrows<IllegalArgumentException> {
            labelUtil.convertNumberToColumnLabelArray(1,-1)
        }
        assertThrows<IllegalArgumentException> {
            labelUtil.convertNumberToColumnLabelArray(18278, 2)
        }
    }
}