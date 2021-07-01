package odevler.SalaryProgram;

public class Employee {
    String name;
    int salary,workHours,hireYear;

    public Employee(String name,int salary,int workHours,int hireYear){
        if(name == ""|| salary == 0 || workHours == 0 || (hireYear > 2021 && hireYear < 1920)){
            System.out.println("Bazı bilgiler gerçersiz");
        }else{
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }
    }

    public int tax(){
        int a=this.salary;
        if(a < 1000)
            return 0;
        return (int) (a*0.03);
    }
    public int bonus(){
        int a = this.workHours;
        if(a > 40)
            return (a-40)*30;
        return 0 ;
    }
    public int raiseSalary(){
        int a=this.salary,result=0;
        if(2021-this.hireYear > 19) result = (int) (a * 0.15);
        if(2021-this.hireYear > 9 &&  2021-this.hireYear <= 19) result = (int) (a * 0.1);
        if(2021-this.hireYear < 10) result = (int) (a * 0.05);
        return result;
    }
    public String toString(){
        int salary = this.salary-tax()+bonus();
        int total=salary+raiseSalary();
        String a = "Ad:\t"+this.name+"\nMaaş:\t"+this.salary+
                "\nÇalışma Saati:\t"+workHours+"\nBaşlangıç yılı:\t"+this.hireYear+"\nVergi:\t"+tax()+
                "\nBonus:\t"+bonus()+"\nZam:\t"+raiseSalary()+"\nVergi ve Bonuslarla toplam maaş:\t"+salary+"\nToplam maaş:\t"+total;
        return a;
    }
}
