package com.example.learninghilt.ui

import androidx.compose.ui.graphics.Color
import com.example.learninghilt.MainActivity
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppComponent{
    fun inject(activity: MainActivity) // Для injecta зависимостей

    val comp: ComputerConfig
}

@Module
object AppModule{

    @Provides
    fun provideComputerConfig(
        videoCardInfo: VideoCardInfo,
        processorInfo: ProcessorInfo,
        gpuInfo: GPUInfo
    ) : ComputerConfig{
        return ComputerConfig(
            videoCard = videoCardInfo,
            processorInfo = processorInfo,
            gpuInfo = gpuInfo
        )
    }

    @Provides
    fun provideVideoCard() : VideoCardInfo{
        return VideoCardInfo()
    }

    @Provides
    fun provideProcessorInfo() : ProcessorInfo{
        return ProcessorInfo()
    }

    @Provides
    fun provideGPUInfo() : GPUInfo{
        return GPUInfo()
    }
}