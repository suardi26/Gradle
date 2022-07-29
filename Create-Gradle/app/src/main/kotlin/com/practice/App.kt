/**
- Build Automation adalah proses meng-otomatisasi tahapan pembuatan software dan hal-hal yang berhubungan dengan
  pembuatan software. seperti : kompilasi source code menjadi binary code, melakukan package binary code menjadi
  distribution file misalnya pada java '.jar' (Java Archive), membuat dokumentasi, menjalankan automated
  test (jika mengimplementasi unit test) sampai manajemen dependency, dll.

- Mempackage (Packaging) Binary File menjadi Distribution File Misalnya pada java ada :
  '.jar' (Java Archive), '.ear' (Enterprise Archive), '.war' (Web Archive), dan packaging ini dapat di otomatisasi dengan
  Build Automation dan tidak perlu manual.

- Jadi pada java dapat dilakukan Compile Doc dari Source Code menjadi Documentation dari source code tersebut, namun
  Compile Doc ini dapat diotomatisasi dengan Build Automation dan tidak perlu manual, Di java adalah javadoc dan
  pada kotlin adalah kotlindoc.

- Build Automation dapat menjalankan automated Test, karena pada saat membuat aplikasi tidak hanya
  membuat source code aplikasi namun juga membuat source code unit testnya dan untuk proses testing
  akan dijalankan secara otomatis oleh build automation dan test resultnya dapat dilihat juga.

- Pada saat kita membuat aplikasi kita biasanya membutuhkan beberapa library/dependecies dan untuk
  mengaturnya secara otomatis baik dari download library-nya secara otomatis, dicombine bersama project
  yang dibuat dan dicompile serta di running secara otomatis, hal ini lebih mudah dibandingkan pada saat
  melakukannya secara manual seperti mendownload library berupa file jar secara manual dan di compile
 bersama project kita secara manual.

- Ada beberapa Build Automation Tool :
    - Apache Maven.
    - Apache Ivy.
    - Gradle.

Gradle
    - Gradle adalah salah satu build automation yang free dan open source.
    - Gradle menggunakan bahasa pemrograman Groovy atau Kotlin untuk mendefinisikan build scriptnya.
    - Gradle saat ini sangat populer di kalangan Developer Android.
    - Pada saat membuat project android pada Android Studio maka secara default projectnya dalam bentuk gradle Project.
    - Gradle menggunakan JVM sebagai fondasi dasar.
    - Untuk menggunakan Gradle cukup membutuhkan JDK minimal versi 8.

- Gradle Mendukung build automation untuk banyak teknologi, seperti :
    - JVM (Java, Groovy, Kotlin, Scala)
    - Android
    - C++
    - Swift

- Gradle mendukung banyak jenis tipe project, seperti Java, Kotlin, Scala, Groovy dan lain-lain.
- Gradle banyak digunakan oleh programmer Kotlin, terutama developer Android.

Membuat Kotlin project dengan Gradle
- Membuat Folder project, lalu masuk ke folder tersebut lewat terminal/Command Promp
- 'gradle init' adalah perintah yang digunakan untuk membuat project baru dengan Gradle.

Struktur Project Gradle
 - '.gradle' adalah temporary file yang digunakan oleh gradle. dan file ini tidak akan dicommit pada version control (GIT).
 - '.idea' adalah file bawaan Intellij Idea.
 - 'gradle' adalah folder yang berisikan informasi tentang gradle misalnya versinya gradle dan lain-lain.
 - 'src' adalah folder yang berisikan project-project yang dibuat. Dolam folder ini terdapat 2 folder lagi yang pertama
   'main' digunakan menyimpan source code program, 'test' digunakan untuk menyimpan Unit test.
        - Di dalam folder 'main' terdapat 2 folder lagi yang pertama adalah 'kotlin' digunakan untuk menyimpan file Kotlin,
          sedangkan 'resources' digunakan untuk menyimpan file-file resources seperti gambar, file konfigurasi, dll.
          di folder 'test' juga sama, terdapat 2 folder 'kotlin' dan 'resources' yang fungsinya sama dengan yang di folder
          Kotlin.
 - '.gitattributes' dan '.gitignore' adalah file konfigurasi bawaan dari version control GIT untuk project.
 - 'build.gradle.kts' adalah build script dari gradle.
 - 'gradlew' digunakan untuk mengeksekusi ketika tidak memiliki gradle. gradlew untuk bukan windows sedangkan gradlew.bat
   untuk windows.
 - 'settings.gradle.kts' digunakan untuk setting project gradle.
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
