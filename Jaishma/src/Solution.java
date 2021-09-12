
import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
		Employee obj1=new Employee();
        Manager obj2=new Manager();
        obj1.name="Rohit";
        obj1.age=22;
        obj1.address="Bangalore";
        obj1.phn_no="4969853921";
        obj1.salary=30000;
        obj2.name="Ravivarma";
        obj2.age=40;
        obj2.address="Mumbai";
        obj2.phn_no="9873922107";
        obj2.salary=50000;
        System.out.println("salary of members:");
        obj1.printSalary();
        obj2.printSalary();
        obj1.printAll();
        obj2.printAll();
	}
}

class Member
{
    String name,address,phn_no;
    int age,salary;
    public void printSalary()
    {
        System.out.println(name+":"+salary);
    }

}

class Employee extends Member
{
    String speci;
    public void printAll()
    {
        System.out.println("\n"+"employee details:");
        System.out.println("name: "+name+"\n"+"age: "+age+"\n"+"phn_no: "+phn_no+"\n"+"address: "+address+"\n"+"salary: "+salary+"\n");
    }
}

class Manager extends Member
{
    String depart;
    public void printAll()
    {
        System.out.println("manager details:");
        System.out.println("name: "+name+"\n"+"age: "+age+"\n"+"phn_no: "+phn_no+"\n"+"address: "+address+"\n"+"salary: "+salary);
    }
}