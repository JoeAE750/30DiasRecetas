package com.fisi.a30daysapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Receta(
    @StringRes val date: Int,
    @StringRes val titleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val ingredientsResourceId: Int,
)

