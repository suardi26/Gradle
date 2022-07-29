/**
    - Perintah-perintah di gradle itu berbasis tasks.
    - Kita dapat menjalankan task di gradle dengan menggunakan perintah : gradle namaTask
    - Jika kita ingin melihat daftar task yang tersedia pada gradle, kita dapat menggunakan perintah : gradle tasks --all

    - Gradle Menggunakan Kotlin sebagai DSL (Domain Specific Lenguage), maka dari itu kita juga dapat membuat task
      menggunakan bahasa kotlin.
    - Cukup dengan menambahkan task yang kita inginkan di file build.gradle.kts
 */
package com.practice

class App {
    val greeting: String
        get() {
            return "Hello Suardi !"
        }
}

fun main() {
    println(App().greeting)

}
