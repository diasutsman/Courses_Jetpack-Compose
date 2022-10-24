package com.dias.courses.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResource: Int,
    val unitCount: Int,
    @DrawableRes val imageResource: Int,
)