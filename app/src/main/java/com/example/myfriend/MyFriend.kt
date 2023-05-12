package com.example.myfriend

import androidx.room.PrimaryKey

data class MyFriend(
    @PrimaryKey(autoGenerate = true)
    val temanId: Int? = null,
    val nama : String,
    val kelamin : String,
    val email : String,
    val telp : String,
    val alamat : String
)
