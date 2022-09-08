package com.example.pixaby.model

data class PixabyModel(

    val total : Int,
    val totalHits : Int,
    val hits : List<ImageModel>

)

data class ImageModel(
    val largeImageURL: String
)

