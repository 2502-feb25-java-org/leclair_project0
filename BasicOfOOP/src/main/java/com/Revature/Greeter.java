//Naming convention:
/*
Packages: samll.case
Classes: ProperCase, always use nouns
Interface: ProperCase
Variable: lowercase, camelCase ($ and _ are viable naming conventions)
Methods: lowercase, camelCase, names are verbs
CONSTANTS: always use caps (entire name-> SALARY)
*/

package com.Revature;

class Greeter
{
    private String name;

    public Greeter(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}//end Greeter

class Addresss
{
    String addressLine1;
    String addressLine2;
    String city;
    
}
abstract class Person
{
    String name;
    String ssn;
    final String SPECIES= "Homo Sapiens"; //constant

    public Person(String name, String ssn)
    {
        this.name = name;
        this.ssn = ssn;
    }

    abstract String getMoreDetails(); //method declaration

    String getDetails()
    {
        return name + " " + ssn + " " + SPECIES;
    }
}//end Person

class Employee extends Person
{
    String salary;
    public Employee(String name, String ssn, String salary)
    {
        super(name, ssn);
        this.salary = salary;
    }

    @Override
    String getDetails()
    {
        String str = "Name: " + name + "\nSSN: " + ssn + "\nSpecies: " + SPECIES + "\nSalary: $" + salary;
        return str;
    }
    
    @Override
    String getMoreDetails()
    {
        String str = "Name: " + name + "\nSSN: " + ssn + "\nSpecies: " + SPECIES + "\nSalary: $" + salary;
        return str;
    }

}//end Person