package com.islamzada.geminiaichatbot

import android.graphics.Bitmap
import com.islamzada.geminiaichatbot.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)