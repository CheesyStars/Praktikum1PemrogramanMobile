package Kuliah
import java.util.Scanner

fun main() {
    println("Case Calculator Use 'when' Logic")

    val scan = Scanner(System.`in`)

    print("Masukkan Nilai 1     : ")
    val n1 = scan.nextDouble()
    print("Masukkan Nilai 2     : ")
    val n2 = scan.nextDouble()
    print("Masukkan Nilai 3     : ")
    val n3 = scan.nextDouble()

    print("Masukkan Opsi Anda : ")
    var opsi = scan.next()

    when (opsi) {
        "a", "A" -> println("Penjumlahan Bilangan 2 & 3     = " +(n2 + n3))
        "b", "B" -> println("Pengurangan Bilangan 3 & 1     = " +(n3 - n1))
        "c", "C" -> println("Pembagian Bilangan 2 & 3       = " +(n2 / n3))
        "d", "D" -> println("Perkalian Bilangan 1 & 3       = " +(n1 * n3))
        else -> println("Inputan Salah")
    }

}