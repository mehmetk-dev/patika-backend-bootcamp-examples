package Hafta2.OOP.MaaşÖdevi;

public class Employee {
    protected String nameSurname;
    protected double salary;
    protected int workHours;
    protected int hireYear;

    public Employee(String nameSurname, double salary, int workHours, int hireYear) {
        this.nameSurname = nameSurname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double raiseSalary(){
        int year = 2021 - hireYear;
        if (year <= 9){
            return salary * 0.05;
        }
        else if(year >= 10 && year <=19){
            return salary * 0.10;
        }
        else{
            return salary * 0.15;
        }
    }
    public double bonus(){
        if (workHours >= 40){
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public double tax(){
        if (salary <= 1000){
            return 0;
        } else{
            return salary * 0.03;
        }
    }

    @Override
    public String toString() {
        double taxAmount = tax();
        double bonusAmount = bonus();
        double raiseAmount = raiseSalary();
        double salaryWithTaxAndBonus = salary - taxAmount + bonusAmount;
        double totalSalary = salaryWithTaxAndBonus + raiseAmount;
        return
                "Adı : '" + nameSurname +
                "\nMaaşı : " + salary +
                "\nÇalışma Saati : " + workHours +
                "\nBaşlangıç Yılı : " + hireYear +
                "\nVergi : " + taxAmount +
                "\nBonus : " + bonusAmount +
                "\nMaaş Artışı : " + raiseAmount +
                "\nVergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxAndBonus +
                "\nToplam Maaş : " + totalSalary;
    }

    public static void main(String[] args) {
        Employee calisan = new Employee("MehmetKerem",2000,45,1985);
        System.out.println(calisan);
    }
}


