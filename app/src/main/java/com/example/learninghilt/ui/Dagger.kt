package com.example.learninghilt.ui

import androidx.compose.ui.graphics.Color
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppInterface {
    val car : CarStats
}

@Module
object AppModule {

    @Provides
    fun provideCar(
        markCar: MarkCar,
        colorCar: ColorCar,
        kmCar: KmCar
    ) : CarStats {
        return CarStats(
            markCar = MarkCar(),
            colorCar = ColorCar(),
            kmCar = KmCar()
        )
    }

    @Provides
    fun provideMarkCar() : MarkCar{
        return MarkCar()
    }

    @Provides
    fun provideColorCar() : ColorCar{
        return ColorCar()
    }

    @Provides
    fun provideKmCar() : KmCar{
        return KmCar()
    }
}