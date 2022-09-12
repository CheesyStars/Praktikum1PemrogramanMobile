package Kuliah
import java.util.Scanner

fun main() {

//    var scan = Scanner(System.`in`)
//
//    print("Masukkan Nilai UTS Anda : " )
//    var nilaiUts = scan.nextInt()
//    print("Masukkan Nilai UAS Anda : ")
//    var nilaiUas = scan.nextInt()

    print("Masukkan Nilai UTS Anda : ")
    var nilaiUts = readLine()
    print("Masukkan Nilai UAS Anda : ")
    var nilaiUas = readLine()

    var nilaiAkhir = (nilaiUts!!.toInt() * 0.4) + (nilaiUas!!.toInt() * 0.6)

//    var nilaiAkhir = (0.4 * nilaiUts) + (0.6 * nilaiUas)

    if (nilaiAkhir > 80) {
        println("Selamat, Anda Naik Semester!")
    } else {
        println("Maaf, Anda Tidak Lulus dan Harus Cuti Semester!")
    }



}