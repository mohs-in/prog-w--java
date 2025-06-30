class Student extends Person implements StudentInterface {
    private String subject;
    private int marks;

    Student(String name, int age, String subject, int marks) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.marks = marks;
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Subject: " + this.subject + "\nMarks: " + this.marks);
    }

    @Override
    public void result() {
        if(this.marks>50)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }

    @Override
    public void fee(int fee) {
        System.out.println("Student has paid: " + fee);
    }
}