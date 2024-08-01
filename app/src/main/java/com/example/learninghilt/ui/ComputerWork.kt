package com.example.learninghilt.ui

class VideoCardInfo{
    override fun toString() = "RTX3050"
}

class ProcessorInfo{
    override fun toString() = "Intel Core I5"
}

class GPUInfo{
    override fun toString() = "16GB"
}

data class ComputerConfig(
    val videoCard: VideoCardInfo,
    val processorInfo: ProcessorInfo,
    val gpuInfo: GPUInfo
)