package associationexample;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainClass {

    public static void main(String[] args) {
         Employee e1 = new Employee("MR. Asik",123456);
         e1.setContact(new EmpContactInfo("012452", "MR.asik@gmail.com", "Dhaka", "1216") );
         e1.setDepartmet(new EmpDepartmentInfo("Android Developer", "MR. Rahim", "Senior"));
         e1.setSalary(new EmpSalaryInfo(12000.00, 15000.00, 14000.00));
         
         e1.setProjects(new ArrayList<EmpProjectInfo>());
         e1.getProjects().add(new EmpProjectInfo( "E-commerce", 12, 2000000.000));
         e1.getProjects().add(new EmpProjectInfo("Home management", 24, 2000000.0));
         e1.getProjects().add(new EmpProjectInfo("Custom Camera", 4, 1200000.0));
         e1.getProjects().add(new EmpProjectInfo("Pathao Clone", 6, 1600000.0));
         
         Employee e2 = new Employee("Mr. Rajjak", 12344);
         e2.setContact(new EmpContactInfo("01722621", "Mr.Rajjak", "Savar", "1215"));
         e2.setDepartmet(new EmpDepartmentInfo("WEB Developent", "MR. Nasir", "Junior"));
         e2.setSalary(new EmpSalaryInfo(12000.0, 1500.00, 1540.0));
         
         e2.setProjects(new ArrayList<EmpProjectInfo>());
         e2.getProjects().add(new EmpProjectInfo("Ebay", 26, 8215322.0));
         e2.getProjects().add(new EmpProjectInfo("Facebook", 18, 53202.0));
         e2.getProjects().add(new EmpProjectInfo("Youtube", 19, 465354.0));
         e2.getProjects().add(new EmpProjectInfo("Alibaba", 20, 458645.0));
         
         System.out.println(e1+"\n"+e2);
         System.out.println(" ");
         
         ArrayList<Employee> employees = new ArrayList<Employee>();
         employees.add(e1);
         employees.add(e2);
         for(Employee e: employees ){
             System.out.println(e);
         }
         
         
         System.out.println(" ");
         for(EmpProjectInfo p : e1.getProjects()){
           System.out.println(p.getProjectName());  
         }   
         
         System.out.println(" ");
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
         String today  = sdf.format(new Date());
         System.out.println(today);
    }  
}
