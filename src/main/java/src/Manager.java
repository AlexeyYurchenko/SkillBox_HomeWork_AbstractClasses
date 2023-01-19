package src;

public class Manager implements Employee {

    private int monthSalary;
    private int randomSalary;

    public Manager() {
        this.monthSalary = getMonthSalary();
    }

    @Override
    public int getMonthSalary() {
        randomSalary = (int) ((Math.random() * ((140000 - 115000) + 1)) + 115000);
        monthSalary = (int) (randomSalary * 0.05 + FIXED_SALARY_MANAGER);
        return monthSalary;
    }

    @Override
    public String toString() {
        return "Manager " + monthSalary + " руб.";
    }

    public int getIncomeForCompany() {
        return randomSalary;
    }
}