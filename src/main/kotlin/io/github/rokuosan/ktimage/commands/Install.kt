package io.github.rokuosan.ktimage.commands

import com.github.ajalt.clikt.core.CliktCommand
import java.net.URI

class Install: CliktCommand(
    help = """
        Install the specified type of server.
    """.trimIndent()
) {
    override fun run() {
        val connection = URI.create("https://example.com/")
            .toURL()
            .openConnection() as java.net.HttpURLConnection
        connection.requestMethod = "GET"

        println(connection.responseCode)
    }
}