public class Employee extends Person {
    private String employeeId;
    private String jobTitle = " Project Manager ";

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        System.out.println(" The employee name is " + super.getLastName() + " and their job title is " + jobTitle);
        return " The employee name is " + super.getLastName() + " and their job title is " + jobTitle;
    }
}
