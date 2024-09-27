package com.fisi.a30daysapp.data

import com.fisi.a30daysapp.R
import com.fisi.a30daysapp.model.Receta

class Datasource() {
    fun loadRecetas(): List<Receta> {
        return listOf<Receta>(
            Receta(R.string.dia1, R.string.title1,R.drawable.image1,R.string.ingredients1),
            Receta(R.string.dia2, R.string.title2,R.drawable.image1,R.string.ingredients2),
            Receta(R.string.dia3, R.string.title3,R.drawable.image1,R.string.ingredients3),
            Receta(R.string.dia4, R.string.title4,R.drawable.image1,R.string.ingredients4),
            Receta(R.string.dia5, R.string.title5,R.drawable.image1,R.string.ingredients5),
            Receta(R.string.dia6, R.string.title6,R.drawable.image1,R.string.ingredients6),
            Receta(R.string.dia7, R.string.title7,R.drawable.image1,R.string.ingredients7),
            Receta(R.string.dia8, R.string.title8,R.drawable.image1,R.string.ingredients8),
            Receta(R.string.dia9, R.string.title9,R.drawable.image1,R.string.ingredients9),
            Receta(R.string.dia10, R.string.title10,R.drawable.image1,R.string.ingredients10),
            Receta(R.string.dia11, R.string.title11,R.drawable.image1,R.string.ingredients11),
            Receta(R.string.dia12, R.string.title12,R.drawable.image1,R.string.ingredients12),
            Receta(R.string.dia13, R.string.title13,R.drawable.image1,R.string.ingredients13),
            Receta(R.string.dia14, R.string.title14,R.drawable.image1,R.string.ingredients14),
            Receta(R.string.dia15, R.string.title15,R.drawable.image1,R.string.ingredients15),
            Receta(R.string.dia16, R.string.title16,R.drawable.image1,R.string.ingredients16),
            Receta(R.string.dia17, R.string.title17,R.drawable.image1,R.string.ingredients17),
            Receta(R.string.dia18, R.string.title18,R.drawable.image1,R.string.ingredients18),
            Receta(R.string.dia19, R.string.title19,R.drawable.image1,R.string.ingredients19),
            Receta(R.string.dia20, R.string.title20,R.drawable.image1,R.string.ingredients20),
            Receta(R.string.dia21, R.string.title21,R.drawable.image1,R.string.ingredients21),
            Receta(R.string.dia22, R.string.title22,R.drawable.image1,R.string.ingredients22),
            Receta(R.string.dia23, R.string.title23,R.drawable.image1,R.string.ingredients23),
            Receta(R.string.dia24, R.string.title24,R.drawable.image1,R.string.ingredients24),
            Receta(R.string.dia25, R.string.title25,R.drawable.image1,R.string.ingredients25),
            Receta(R.string.dia26, R.string.title26,R.drawable.image1,R.string.ingredients26),
            Receta(R.string.dia27, R.string.title27,R.drawable.image1,R.string.ingredients27),
            Receta(R.string.dia28, R.string.title28,R.drawable.image1,R.string.ingredients28),
            Receta(R.string.dia29, R.string.title29,R.drawable.image1,R.string.ingredients29),
            Receta(R.string.dia30, R.string.title30,R.drawable.image1,R.string.ingredients30)
        )
    }
}