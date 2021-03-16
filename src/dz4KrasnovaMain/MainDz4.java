package dz4KrasnovaMain;

public class MainDz4 {
    public static void main(String[] args){
        EmployeeClass employee1 = new EmployeeClass("Ivanov Ivan Ivanovich","manager","8-910-026-57-48", 35, 45);

      System.out. println( "Ф.И.О. : " + employee1.getName());
      System.out. println( "Должность : "+employee1.getPosition());
System.out.println("____________________");
EmployeeClass[] collectiv = {
        new EmployeeClass("Алексей Алексеевич Алексеев", "директор", "   8-924-067-68-59   ", 42, 100),
        new EmployeeClass("Светлана Федоровна Курицина", "бухгалтер", "   8-910-560-78-90   ", 38, 60),
        new EmployeeClass("Иван Иванович Иванов", "менеджер", "   8-940-456-32-46   ", 35, 50),
        new EmployeeClass("Петр Петрович Петров", "специалист", "   8-920-453-76-87   ", 25, 40),
        new EmployeeClass("Олег Олегович Сидоров", "сторож", "   8-920-432-65-08   ", 48, 40)
        };
for (int i=0; i<collectiv.length; i++)
    if (collectiv[i].getAge()>40){
        System.out.println(collectiv[i].getName()+collectiv[i].getPosition()+collectiv[i].getTelnumber()+"возраст: "+collectiv[i].getAge()+"   зарплата:  "+collectiv[i].getSalary());
    }

}
   }


