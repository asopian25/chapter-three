package com.sopian.chapterthree

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Auth(
    val username: String,
    val password: String,
): Parcelable
