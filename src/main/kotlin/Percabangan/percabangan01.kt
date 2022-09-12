package Percabangan
import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    print("Masukkan Nama Anda       : ")
    var nama = scan.nextLine()
    print("Masukkan Nilai Anda      : ")
    var nilai = scan.nextInt()

    if (nilai >= 80) {
        println("Selamat $nama, Anda Lulus!")
    } else {
        println("Maaf $nama, Anda Belum Lulus, Coba Lagi :)")
    }

}