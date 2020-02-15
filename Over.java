package overriding;
class Employee
{
    public String Emp_no(String empno,String salary)
    {
        return empno+"  "+salary;
    }
}
class Manager extends Employee
{
    public String Emp_no(String empno,String deptno)
    {
        return empno+"  "+deptno;
    }
    public static void main(String[]args)
    {
        Manager m = new Manager();

}
}
