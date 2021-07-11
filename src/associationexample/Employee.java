package associationexample;

import java.util.ArrayList;

public class Employee {
    private String empName;
    private long nid;          
    private EmpContactInfo contact;
    private EmpDepartmentInfo departmet;
    private EmpSalaryInfo salary;
    private ArrayList<EmpProjectInfo> projects;

    public Employee(String empName, long nid) {
        this.empName = empName;
        this.nid = nid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public long getNid() {
        return nid;
    }

    public void setNid(long nid) {
        this.nid = nid;
    }

    public EmpContactInfo getContact() {
        return contact;
    }

    public void setContact(EmpContactInfo contact) {
        this.contact = contact;
    }

    public EmpDepartmentInfo getDepartmet() {
        return departmet;
    }

    public void setDepartmet(EmpDepartmentInfo departmet) {
        this.departmet = departmet;
    }

    public EmpSalaryInfo getSalary() {
        return salary;
    }

    public void setSalary(EmpSalaryInfo salary) {
        this.salary = salary;
    }

    public ArrayList<EmpProjectInfo> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<EmpProjectInfo> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" + "empName=" + empName + ", nid=" + nid + ", contact=" + contact + ", departmet=" + departmet + ", salary=" + salary + ", projects=" + projects + '}';
    }
    
}
