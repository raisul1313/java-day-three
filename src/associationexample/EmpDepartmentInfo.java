package associationexample;

public class EmpDepartmentInfo {
    private String departmentName;
    private String departmentHead;
    private String designation;

    public EmpDepartmentInfo(String departmentName, String departmentHead, String designation) {
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
        this.designation = designation;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "EmpDepartmentInfo{" + "departmentName=" + departmentName + ", departmentHead=" + departmentHead + ", designation=" + designation + '}';
    }
    
}
