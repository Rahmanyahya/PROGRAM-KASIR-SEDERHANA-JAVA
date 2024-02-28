import java.util.*;
public class tes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Laporan laporan = new Laporan();
    Barang barang = new Barang();
    Transaksi transaksi = new Transaksi();
    Member member = new Member();
    Karyawan karyawan = new Karyawan();

    laporan.laporan(barang);
    laporan.laporan(member);
    System.out.println();
    laporan.laporan(transaksi, barang);

   transaksi.prosesTransaksi(member, transaksi, barang);
   laporan.laporan(transaksi, barang);
   laporan.laporan(barang);
  laporan.laporan(member);
  }
}
