public class sport extends mobil implements iPayable{
    
    public sport(String idMobil, String platNomor, String namaSupir, int jumlahMaks) {
        super(idMobil, platNomor, namaSupir, jumlahMaks);
    }

    @Override
    public int hargaSewaAwal() {
    int hargaAwal = 100000;
    return hargaAwal*120/100;
    }

    @Override
    public int hargaSewaPerJam() {
    return 50000;
    }
    
    
}
