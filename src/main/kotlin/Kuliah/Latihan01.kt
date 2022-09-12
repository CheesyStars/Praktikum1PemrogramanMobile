package Kuliah

fun main() {
    print("Masukkan Nama Anda           : ")
    var nama = readLine()
    print("Masukkan Bilangan Pertama    : ")
    var bil1 = readLine()!!.toDouble()
    print("Masukkan Bilangan Kedua      : ")
    var bil2 = readLine()!!.toDouble()

    println("Nama Anda Adalah $nama")
    println("Operasi Penjumlahan    : " + (bil1 + bil2))
    println("Operasi pengurangan    : " + (bil1 - bil2))
    println("Operasi Perkalian      : " + (bil1 * bil2))
    println("Operasi Pembagian      : " + (bil1 / bil2))
}