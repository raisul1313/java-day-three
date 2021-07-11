package associationexample;

public class EmpSalaryInfo {
    private double basicSalary;
    private double bouns;
    private double allowance;

    public EmpSalaryInfo(double basicSalary, double bouns, double allowance) {
        this.basicSalary = basicSalary;
        this.bouns = bouns;
        this.allowance = allowance;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "EmpSalaryInfo{" + "basicSalary=" + basicSalary + ", bouns=" + bouns + ", allowance=" + allowance + '}';
    }
    
}
