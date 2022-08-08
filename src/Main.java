public class Main
{
    public static void main(String[] args)
    {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        HesapMakinesi hesapMakinesi2 = new HesapMakinesi("T-800");
        HesapMakinesi hesapMakinesi3 = new HesapMakinesi("Hesap Makinesi", 2005, 3.14);

        System.out.println(hesapMakinesi.yearOfProduction = 2000);
        System.out.println(hesapMakinesi.add(5,4));
        System.out.println(hesapMakinesi.subtract(4,10));
        System.out.println(hesapMakinesi.pi = 3);

        BilimselHesapMakinesi bilimselHesapMakinesi = new BilimselHesapMakinesi();

        System.out.println("------------");
        System.out.println(bilimselHesapMakinesi.squareRoot(5));
        bilimselHesapMakinesi.add(5,8);
    }
}
