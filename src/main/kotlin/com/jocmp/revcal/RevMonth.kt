package com.jocmp.revcal

enum class RevMonth {
    VENDEMIAIRE, // Vendémiaire
    BRUMAIRE,
    FRIMAIRE,
    NIVOSE, // Nivôse
    PLUVIOSE, // Pluviose
    VENTOSE, // Ventôse
    GERMINAL,
    FLOREAL, // Floréal
    PRAIRIAL,
    MESSIDOR,
    THERMIDOR,
    FRUCTIDOR,
    SANSCULOTTIDES;

    companion object {
        fun from(month: Int): RevMonth {
            return RevMonth.values()[month - 1]
        }
    }
}

