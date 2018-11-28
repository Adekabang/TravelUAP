public class mobil {
    private String idMobil, platNomor, namaSupir;
    private int jumlahMaks;
    private double totalJarakTempuh;

    public mobil(String idMobil, String platNomor, String namaSupir, int jumlahMaks) {
        this.idMobil = idMobil;
        this.platNomor = platNomor;
        this.namaSupir = namaSupir;
        this.jumlahMaks = jumlahMaks;
    }

    public void addTotalJarakTempuh(double totalJarakTempuh) {
        this.totalJarakTempuh += totalJarakTempuh;
    }
    
    public void displayData(){
        System.out.println("ID : " +idMobil);
        System.out.println("Plat Nomor : " +platNomor);
        System.out.println("Nama Supir : " +namaSupir);
        System.out.println("Jumlah Penumpang : " +jumlahMaks);
        System.out.println("Total Jarak Tempuh : " +totalJarakTempuh);
    }
    
}
