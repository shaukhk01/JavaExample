ASSOCIATION IS RELATION BETWEEN TWO SEPRATE CLASSES WHICH ESTABLISHES THROW THEIR OBJECT
Association Can be One to One,One to Many ,Many to Many In object Programming
Object Communicate to Other Object to use Functionality and Servies Provided by Object.

class BankName
{
    private bankname;
    BankName(String name)
    {
        this.bankname = name;
    }
    public String getName()
    {
        return bankname;
    }
}
class EmployeeName
{
    private String name;
    EmployeeName(String name)
    {
        this.name = name;
    }
    public String getemp()
    {
        return this.name;
    }
}
//association between both classes in main method as you can see.
class Association
{
    public static void main(String[]args)
    {
        BankName     bank_name = BankName();
        EmployeeName emp_name = EmployeeName();

        System.out.println(bank_name.getemp()+" is employee of+"+emp_name.getName());
    }
}

