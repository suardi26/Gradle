/**
    - Gradle mendukung konfigurasi menggunakan file gradle.properties.
    - Scara otomatis kita dapat mengambil data konfigurasi dari gradle.properties.
    - file gradle.properties adalah file untuk konfigurasi project bukan untuk aplikasi. karena file ini tidak akan
      di build ke dalam aplikasinya dan cuma buat project seperti menentukan versi kotlin yang akan digunakan,
      versi library yang akan digunakan, dll.
 */
package com.practice

import java.io.FileInputStream
import java.util.*

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
    // memanggil value dari gradle properties.
    val properties: Properties = Properties()
    properties.load(FileInputStream("gradle.properties"))
    val author = properties.getProperty("author")
    val ver = properties.getProperty("ver")
    println(ver)
    println(author)


}
