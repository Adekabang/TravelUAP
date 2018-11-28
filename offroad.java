public class offroad extends mobil implements iPayable{
    
    public offroad(String idMobil, String platNomor, String namaSupir, int jumlahMaks) {
        super(idMobil, platNomor, namaSupir, jumlahMaks);
    }

    @Override
    public int hargaSewaAwal() {
    int hargaAwal = 100000;
    return hargaAwal*115/100;
    }

    @Override
    public int hargaSewaPerJam() {
    return 35000;
    }
    
}
