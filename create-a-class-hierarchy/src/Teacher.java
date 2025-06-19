public class Teacher extends Employee {
    String qualification;
    String subject;

    Teacher(String qualification, String subject, Date dateOfAppointment, String name, Date dob) {
        this.qualification = qualification;
        this.subject = subject;
        this.dateOfAppointment = dateOfAppointment;
        this.name = name;
        this.dob = dob;
    }

    @Override
    public void getDetails() {
        System.out.println("Name of Teacher: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Date of Appointment: " + this.dateOfAppointment.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualifications: " + this.qualification);
        System.out.println("Salary: " + this.getSalary());
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }
}
