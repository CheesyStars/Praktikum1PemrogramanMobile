package Kuliah
import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    print("Masukkan Bulan Ke : ")
//    val angka = scan.nextInt()
    val angka = readLine()

    when (Integer.valueOf(angka)) {
        3, 4, 5, 6 -> println("It Is Summer Season")
        7, 8, 9, 10 -> println("It Is Rainy Season")
        11, 12, 1, 2 -> println("It Is Winter Season")
        else -> println("Invalid Input")
    }
}