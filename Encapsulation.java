package com.encapsulation;

 class Data
{
    private int id;
    private String value;
    private String name;
    public int getid()
    {
        return id;
    }
    public void setid(int id)
    {
        if(id<0)
            throw new IllegalArgumentException("id can't be negative");

        this.id = id;
    }
    public String getvalue()
    {
        return value;
    }
    public void setvalue(String value)
    {
        this.value = value;
    }
    public void info()
    {
        System.out.println("process name: " +name);
        System.out.println(getid());
        System.out.println(getvalue());
        
    }
    public String getName()
    {
        return name;
    }
    public void setName(String value)
    {
        this.name = value;
    }
}

class Execute
{
    public static void main(String[]args)
    {  
        Data db = new Data();
        db.setName("chrome");
        db.setid(-532343);
        db.setvalue("pid:4332");
        db.info();
        
        
    }
}

