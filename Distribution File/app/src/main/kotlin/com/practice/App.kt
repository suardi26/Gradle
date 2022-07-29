/**
    - Hal terakhir yang akan kita lakukan setelah aplikasi kita selesai adalah membuat distribution file.
    - Distribution file ini yang nanti akan kita distribusikan untuk di install di komputer client atau server misalnya.
    - Mempackage (Packaging) Binary File menjadi Distribution File Misalnya pada java dan kotlin ada :
      '.jar' (Java Archive), '.ear' (Enterprise Archive), '.war' (Web Archive), dan packaging ini dapat di otomatisasi
      dengan Build Automation dan tidak perlu manual.

    Membuat Distribution File :
        - gradle distTar adalah perintah yang digunakan untuk Membuat distribution file, dan menjadikan semua file .jar
          pada aplikasi dan semua dependency yang dibutuhkan akan dibundle dalam satu file .tar.

        - gradle distZip adalah perintah yang digunakan untuk Membuat distribution file, dan menjadikan semua file .jar
          pada aplikasi dan semua dependency yang dibutuhkan akan dibundle dalam satu file .zip.

        - yang dibundle adalah source code program, file-file, library, tools-tools yang dibutuhkan untuk membuat program.

    - Hasil dari distribution file dapat kita lihat di direktori build/distributions.
    - ketika selesai diekstrak maka terdapat 2 file yaitu :
        - bin adalah direktori yang digunakan untuk menjalankan program-nya, terdapat 2 file yaitu
            - namaFile     untuk linux dan macintos.
            - namaFile.bat untuk windows.
        - lib adalah direktori yang digunakan untuk menampung program dan library yang dibutuhkan.

    - Tempat menjalankan aplikasi dari distribution file harus ada java-nya.
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
