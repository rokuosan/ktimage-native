package io.github.rokuosan.ktimage

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands
import io.github.rokuosan.ktimage.commands.Install

fun main(args: Array<String>){
    KtImage()
        .subcommands(Install())
        .main(args)
}

class KtImage: CliktCommand() {
    override fun run() {
        println("Hello, world!")
    }
}