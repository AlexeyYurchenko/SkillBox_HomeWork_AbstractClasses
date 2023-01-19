package src;

public class Operator implements Employee {

    private int monthSalary;

    public Operator() {
        this.monthSalary = getMonthSalary();
    }

    @Override
    public int getMonthSalary() {
        monthSalary = FIXED_SALARY_OPERATOR;
        return monthSalary;
    }

    @Override
    public String toString() {
        return "Operator " + monthSalary + " руб.";
    }
}