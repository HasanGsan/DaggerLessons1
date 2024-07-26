package com.example.learninghilt.ui

interface IntConverter{
    fun toInt(): Int
}

class MarkCar(){
    override fun toString() = "Lada"
}

class ColorCar(){
    override fun toString() = "White"
}

class KmCar() : IntConverter{
    override fun toInt() = 10000
}

data class CarStats(
    val markCar: MarkCar,
    val colorCar: ColorCar,
    val kmCar: KmCar
)