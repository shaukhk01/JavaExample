package p1;
class SamePackage
{
    SamePackage()
    {
        System.out.println("same package constructor");
        Protection p = new Protection();
        System.out.println("n   ="+p.n);

//        System.out.println("n_pri   ="+p.n_pri);
        System.out.println("n_pro   ="+p.n_pro);
        System.out.println("n_pub   ="+p.n_pub);
        System.out.println();
    }
}
