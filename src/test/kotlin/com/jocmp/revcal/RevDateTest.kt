package com.jocmp.revcal

import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

internal class RevDateTest {
    @Test
    fun `Test election of Napolean III`() {
        // https://en.wikipedia.org/wiki/1851_French_coup_d%27%C3%A9tat
        val date = RevDate.fromGregorian(LocalDate.of(1851, 12, 2))
        val expected = RevDate(60, 11, 11)

        assertEquals(expected, date)
    }
}