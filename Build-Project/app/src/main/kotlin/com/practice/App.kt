/**
    - Pada saat membuat project biasanya akan ada 2 jenis kode yang akan dapat dibuat, kode program-nya, dan kode
      testing-nya.
    - Gradle pun mendukung kedua hal tersebut.
    - 'gradle classes' digunakan untuk compile program baik itu file kotlin atau pun bahasa pemrograman lainnya.
    - 'gradle test' digunakan untuk menjalankan unit test-nya.
 */
package com.practice

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
