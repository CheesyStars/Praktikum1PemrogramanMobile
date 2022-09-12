package MasukkanKeluaran
import java.util.Scanner

fun main() {
//    println("Tekan enter untuk melanjutkan...")
//    readLine()
//    println("Terimakasih")

//    print("Masukkan Nama Anda : ")
//    var nama = readLine()
//    print("Masukkan Umur Anda : ")
//    var umur = readLine()
//    var umurBaru = Integer.valueOf(umur) + 2
//    var umurBaru2 = umur!!.toInt() + 2
//
//    println("Nama Saya $nama dan Saya Berusia $umurBaru2 Tahun")

    val scan = Scanner(System.`in`)
    print("Masukkan Nama Anda : ")
    val nama = scan.nextLine()
    print("Masukkan Umur Anda : ")
    val umur = scan.nextInt()

    println("Nama Saya $nama dan Saya Berusia $umur Tahun")

}