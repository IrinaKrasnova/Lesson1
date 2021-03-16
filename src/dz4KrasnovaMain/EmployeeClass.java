package dz4KrasnovaMain;

public class EmployeeClass {
   private  String position;
  private  String name;
   private String telnumber;
   private int age;
    private int salary;

    EmployeeClass(String name, String position, String telnumber, int age, int salary){
    this.name =  name;
     this.position =  position;
      this.telnumber = telnumber;
     this.age=  age;
      this.salary = salary;
    }
    public String getPosition() {
        return  position;
    }
    public  String getName() {
        return name;
    }
    public String getTelnumber(){
        return telnumber;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }

}