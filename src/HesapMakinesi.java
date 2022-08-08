class HesapMakinesi
{

    //Değişkenler
    private String name;
    protected int yearOfProduction;
    double pi;

    //KurucuMetodlar
    HesapMakinesi()
    {

    }

    HesapMakinesi(String name)
    {
        this.name = name;
    }

    HesapMakinesi(String name, int yearOfProduction, double pi)
    {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.pi = pi;
    }

    //Metodlar

    public void whoAmI()
    {
        System.out.println("Mynameis" + name);
    }

    public int add(int a, int b)
    {
        return a + b;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

}
