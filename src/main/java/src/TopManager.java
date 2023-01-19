package src;

public class TopManager implements Employee {

    private int monthSalary;
    private final int incomeTop;


    public TopManager(Company company) {
        this.monthSalary = getMonthSalary();
        incomeTop = company.getIncome();
    }

    @Override
    public int getMonthSalary() {

        if (incomeTop > 10000000) {
            monthSalary = (int) (FIXED_SALARY_TOP * 2.5);
        } else {
            monthSalary = FIXED_SALARY_TOP;
        }
        return monthSalary;
    }

    @Override
    public String toString() {
        return "TopManager " + monthSalary + " руб.";
    }
}