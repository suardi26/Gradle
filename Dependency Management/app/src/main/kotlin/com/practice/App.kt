/**
    - Project aplikasi jarang sekali berdiri sendiri, biasanya membutuhkan dukungan dari pihak lain, seperti tool atau
      library.
    - Tanpa build tool seperti Gradle, untuk menambahkan library dari luar, kita harus melakukannya secara manual.
    - Gradle mendukung dependency management, dimana kita tidak perlu manage secara manual proses penambahan dependency
      (tool atau library) ke dalam project aplikasi.
    - Menambahkan repository dapat dilakukan pada file 'build.gradle.kts' didalam block code 'repositories{...}'

    Dependency configuration
    - Secara garis besar ada 2 jenis configuration untuk dependency pada Gradle (sebenarnya masih banyak, cuma yang biasa
      digunakan ada 2)
        - implementation, adalah dependency yang digunakan oleh kode program.
        - testImplementation, adalah dependency yang digunakan oleh kode unit test.
    - Konfigurasi Dependency 'testImplementation' hanya dapat digunakan pada Unit Test, sedangkan dengan konfigurasi
      Dependency 'implementation' dapat digunakan pada source code project serta Unit Testnya.

    - Menambahkan dependency dapat dilakukan pada file 'build.gradle.kts' didalam block code 'dependencies{...}'
    - Untuk mencari dependency dapat menggunakan link "https://search.maven.org/"
 */
package com.practice

import com.google.gson.Gson

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)

    // Menggunakan library/dependency dari gson.
    val gson: Gson = Gson()
}
