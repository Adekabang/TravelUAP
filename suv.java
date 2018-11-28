public class suv extends mobil implements iPayable{
    
    public suv(String idMobil, String platNomor, String namaSupir, int jumlahMaks) {
        super(idMobil, platNomor, namaSupir, jumlahMaks);
    }

    @Override
    public int hargaSewaAwal() {
    int hargaAwal = 100000;
    return hargaAwal;
    }

    @Override
    public int hargaSewaPerJam() {
    return 20000;
    }
    
}
