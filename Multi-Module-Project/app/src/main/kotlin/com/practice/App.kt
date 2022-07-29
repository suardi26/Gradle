/**
    - Pada saat aplikasi kita sudah sangat besar, kadang ada baiknya kita buat aplikasi dalam bentuk modular artinya
      dipisah-pisah.
    - Misalnya kita pisahkan module model, controller, view, service, repository, dll.
    - Gradle mendukung pembuatan project multi module.
    - Untuk membuat module baru, didalam project yang sudah ada, kita hanya tinggal membuat folder baru, lalu buat
      gradle project baru menggunakan perintah 'gradle init'.
    - Namun ketika membuat module baru,  maka type projectnya bukan lagi application melainkan library.
    - Manambahkan modul ke project utama dengan menambahkan : 'include("nama-module")' pada
      file 'settings.gradle.kts' di project Utama.
    - Untuk dapat mengakses Modul yang baru dibuat dapat menambahkan ke Dependency project yang membutuhkan Module
      project lainnya. contoh : implementation(project(":namaModuleProject"))

    - Dan untuk menjalankan task spesifik untuk module tertentu, kita dapat menambahkan nama module diikuti
      dengan :namatasks, contoh : 'gradle namaModule:nama-task'


 */
package com.practice
import multi.module.model.Product
import multi.module.util.StringUtil


class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
    val product1: Product = Product("B001", "Baygon")
    val toUpper: String = StringUtil.upper(product1.name)
    println("Product 1 : ${product1.id}")
    println("Nama Produk : $toUpper")


}
