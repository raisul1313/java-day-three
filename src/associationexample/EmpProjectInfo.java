package associationexample;

public class EmpProjectInfo {
    private String projectName;
    private int projectDuration;
    private double projectbudget;

    public EmpProjectInfo(String projectName, int projectDuration, double projectbudget) {
        this.projectName = projectName;
        this.projectDuration = projectDuration;
        this.projectbudget = projectbudget;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(int projectDuration) {
        this.projectDuration = projectDuration;
    }

    public double getProjectbudget() {
        return projectbudget;
    }

    public void setProjectbudget(double projectbudget) {
        this.projectbudget = projectbudget;
    }

    @Override
    public String toString() {
        return "EmpProjectInfo{" + "projectName=" + projectName + ", projectDuration=" + projectDuration + ", projectbudget=" + projectbudget + '}';
    }
    
}
