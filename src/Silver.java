public class Silver extends Salon{
    protected double sha;
    protected double con;
    protected double pijat;
    public double hargaShampoo(){
        sha = shampoo;
        return sha;
    }
    public double hargaConditioner(){
        con = conditioner;
        return con;
    }
    @Override
    public void HargaTotal() {
        this.diskon=this.hargaAwal*20/100;
        this.membayar=this.hargaAwal-this.diskon;
        System.out.println("Anda adalah member Silver");
        System.out.println("Total Pembayaran : Rp"+this.membayar);  
    }
}