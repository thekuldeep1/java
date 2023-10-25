public class SalaryCalculator {
    public static void main(String[] args) {
        double basicSalary = 50000.0;
        double bonus = 10000.0;
        double taxRate = 0.1;
        double tdsRate = 0.05;
        double netSalary = calculateNetSalary(basicSalary, bonus, taxRate, tdsRate);
        System.out.println("Net salary: " + netSalary);
    }

    public static double calculateNetSalary(double basicSalary, double bonus, double taxRate, double tdsRate) {
        double grossSalary = basicSalary + bonus;
        double totalSalary = grossSalary * (1 + taxRate);
        double tds = totalSalary * tdsRate;
        double netSalary = totalSalary - tds - basicSalary;
        return netSalary;
    }
}
