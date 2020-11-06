package com.platzi.conf.view.adapter

import com.platzi.conf.model.Speaker

interface SpeakerListener {
    fun onSpeakerClicked(conference: Speaker, position: Int)
}