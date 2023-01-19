package src;

import java.util.*;

public class Company {

    private String companyName;
    private final ArrayList<Employee> EMPLOYEES_LIST = new ArrayList<>();
    private int income;

    public Company() {
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void hire(Employee employee) {
        EMPLOYEES_LIST.add(employee);
        if (employee instanceof Manager) {
            income += ((Manager) employee).getIncomeForCompany();
        }
    }

    public void hireAll(Collection<Employee> employees) {
        getEMPLOYEES_LIST().remove(employees);
    }

    public void fire(Employee employee) {
        this.EMPLOYEES_LIST.remove(employee);

    }

    public List<Employee> getTopSalaryStaff(int count) {
        return getFilteredLimitedList(count, (o1, o2) -> o2.getMonthSalary() - o1.getMonthSalary());
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return getFilteredLimitedList(count, (o1, o2) -> o1.getMonthSalary() - o2.getMonthSalary());
    }

    private List<Employee> getFilteredLimitedList(int count, Comparator<Employee> comparator) {
        List<Employee> copyList = new ArrayList<>(EMPLOYEES_LIST);
        Collections.sort(copyList, comparator);
        List<Employee> result = new ArrayList<>();
        for (int i = 0; i < count; i++) result.add(copyList.get(i));
        return result;
    }

    public int countEmployeesList() {
        return EMPLOYEES_LIST.size();
    }

    public ArrayList<Employee> getEMPLOYEES_LIST() {
        return EMPLOYEES_LIST;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getIncome() {
        return income;
    }
}