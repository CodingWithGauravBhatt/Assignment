package Class;

class Employer {
    long employeeId;
    String employeeName;
    String employeeAddress;
    Long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    public Employer(long employeeId, String employeeName, String employeeAddress, Long employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    public void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        System.out.println("Salary of " + employeeName + " is: " + salary);
    }

    public void calculateTransportAllowance() {
        double transportAllowance = 0.10 * basicSalary;
        System.out.println("Transport Allowance of " + employeeName + " is: " + transportAllowance);
    }
}

class Manager extends Employer {
    public Manager(long employeeId, String employeeName, String employeeAddress, Long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        this.basicSalary = basicSalary;
    }

    @Override
    public void calculateTransportAllowance() {
        double transportAllowance = 0.15 * basicSalary;
        System.out.println("Transport Allowance of " + employeeName + " is: " + transportAllowance);
    }
}

class Trainee extends Employer {
    public Trainee(long employeeId, String employeeName, String employeeAddress, Long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        this.basicSalary = basicSalary;
    }
}

public class InheritanceActivity {
    public static void main(String[] args) {
        Manager manager = new Manager(126534, "Peter", "Chennai India", 237844L, 65000);
        manager.calculateSalary();
        manager.calculateTransportAllowance();

        Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085L, 45000);
        trainee.calculateSalary();
        trainee.calculateTransportAllowance();
    }
}
