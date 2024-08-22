import java.util.Scanner;

class Employee {
    int empNo;
    String empName;
    String joinDate;
    String designationCode;
    String department;
    int basic;
    int hra;
    int it;

    public Employee(int empNo, String empName, String joinDate, String designationCode, String department, int basic, int hra, int it) {
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
}

class Designation {
    String code;
    String designation;
    int da;

    public Designation(String code, String designation, int da) {
        this.code = code;
        this.designation = designation;
        this.da = da;
    }
}

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Employee[] employees = {
            new Employee(1001, "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000),
            new Employee(1002, "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000),
            new Employee(1003, "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000),
            new Employee(1004, "Chahat", "29/01/2013", "r", "Front Desk", 12000, 6000, 2000),
            new Employee(1005, "Ranjan", "16/07/2005", "m", "Engg", 50000, 20000, 20000),
            new Employee(1006, "Suman", "01/01/2000", "e", "Manufacturing", 23000, 9000, 4400),
            new Employee(1007, "Tanmay", "12/06/2006", "c", "PM", 29000, 12000, 10000)
        };

        Designation[] designations = {
            new Designation("e", "Engineer", 20000),
            new Designation("c", "Consultant", 32000),
            new Designation("k", "Clerk", 12000),
            new Designation("r", "Receptionist", 15000),
            new Designation("m", "Manager", 40000)
        };

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();

        Employee emp = null;
        for (Employee e : employees) {
            if (e.empNo == empId) {
                emp = e;
                break;
            }
        }
        if (emp == null) {
            System.out.println("There is no employee with empid : " + empId);
        } else {
            Designation des = null;
            for (Designation d : designations) {
                if (d.code.equals(emp.designationCode)) {
                    des = d;
                    break;
                }
            }

            if (des != null) {
                int salary = emp.basic + emp.hra + des.da - emp.it;
                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(emp.empNo + "\t" + emp.empName + "\t"+"\t" + emp.department + "\t"+"\t" + des.designation + "\t" + salary);
            }
        }
    }
}

