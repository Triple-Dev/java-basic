package model;

import java.time.LocalDate;

//as same as the Customer class, follow that first
public class Employee extends Person{


    private LocalDate startingDate;
    private double totalSale;
    private double workTime;
    private double salary;
    private String status;


    public Employee() {
    }

    public Employee(int id, String name, Address address, String email, LocalDate startingDate, double totalSale, double workTime, double salary, String status) {
        super(id, name, address, email);
        this.startingDate = startingDate;
        this.totalSale = totalSale;
        this.workTime = workTime;
        this.salary = salary;
        this.status = status;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "startingDate=" + startingDate +
                ", totalSale=" + totalSale +
                ", workTime=" + workTime +
                ", salary=" + salary +
                ", status='" + status + '\'' +
                '}';
    }
}
