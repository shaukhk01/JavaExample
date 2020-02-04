package p2;

class OtherPackage extends p1.Protection//it is alow valid
//class OtherPackage
{
    OtherPackage()
    {
       // p1.Protection o = new p1.Protection();

        System.out.println("derived other package constructor");
        //System.out.println("n_pro   ="+n_pro);
        //System.out.println("n_pro  ="+o.n_pro);//it will not access if ur using p1.protection
        System.out.println("n_pro  ="+n_pro);
        System.out.println("n_pub  ="+n_pub);
    }
    public static void main(String[]args)
    {
        OtherPackage p = new OtherPackage();
}
}

