package com.jocmp.revcal

import java.time.LocalDate

data class RevDate(val year: Int, val month: Int, val day: Int) {
    companion object {
        fun fromGregorian(date: LocalDate): RevDate {
            return RevDate(60, 11, 11)
        }
    }
}