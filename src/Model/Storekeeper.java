package Model;

public class Storekeeper extends Employee{
    public Storekeeper(){
        this.options = new Option[]{};
    }

    public Storekeeper(int id,String fistName,String lastName,String email,String phoneNumber,String address,double salary,String password){
        this.id=id;
        this.firstName=fistName;
        this.lastName=lastName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.salary=salary;
        this.password=password;
        this.options = new Option[]{};
    }
}