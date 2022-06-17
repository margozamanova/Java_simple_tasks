// Создайте класс Employee с атрибутами ID, First Name, Last Name, Age, Salary, Occupation,
// которые должны задаваться в конструкторе.
// В данном классе также создайте метод увеличения зарплаты вдвое.
// Создайте второй класс EmployeeTest, в котором создайте 2 объекта класса Employee
// Увеличьте зарплату каждому работнику вдвое с помощью метода и выведите на экран значение новой зарплаты


package Homework.Lesson5;

public class Employee {
    int ID;
    String FirstName;
    String LastName;
    int Age;
    double Salary;
    String Occupation;

    Employee(int ID1, String FirstName1, String LastName1, int Age1, double Salary1, String Occupation1) {
        ID = ID1;
        FirstName = FirstName1;
        LastName = LastName1;
        Age = Age1;
        Salary = Salary1;
        Occupation = Occupation1;
    }

    double CashAward() {
        Salary *= 2;
        return Salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1068, "Margo", "Zamanova", 38, 286652.58, "Java developer");
        Employee emp2 = new Employee(2354, "Lily", "Pukhova", 41, 597325.54, "System analyst");

        emp1.CashAward();
        System.out.println("New Salary " + emp1.FirstName + " " + emp1.LastName + " (Id number: " + emp1.ID + ", position: " + emp1.Occupation + ") " + emp1.Salary + " USD");
        emp2.CashAward();
        System.out.println("New Salary " + emp2.FirstName + " " + emp2.LastName + " (Id number: " + emp2.ID + ", position: " + emp2.Occupation + ") " + emp2.Salary + " USD");

        // or

//        double NewSalary1 = emp1.CashAward();
//        System.out.println("New Salary " + emp1.FirstName + " " + emp1.LastName + " (Id number: " + emp1.ID + ", occupation: " + emp1.Occupation + ") " + NewSalary1 + " USD");
//
//        double NewSalary2 = emp2.CashAward();
//        System.out.println("New Salary " + emp2.FirstName + " " + emp2.LastName + " (Id number: " + emp2.ID + ", occupation: " + emp2.Occupation + ") " + NewSalary2 + " USD");



    }
}
