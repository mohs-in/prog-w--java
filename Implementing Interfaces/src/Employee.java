class Employee extends Person implements EmployeeInterface {
    private int basicPay;
    Employee(String name, int age, int basic) {
        this.name = name;
        this.age = age;
        this.basicPay = basic;
    }
    @Override
    public double computeSalary() {
        double salary;
        salary = this.basicPay + 0.5*this.basicPay;
        return salary;
    }
    @Override
    public double computeTax() {
        double tax;
        tax = 0.1*this.basicPay;
        return tax;
    }
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Basic Pay: " + this.basicPay);
        System.out.println("Salary: " + computeSalary());
        System.out.println("Tax: " + computeTax());
    }
}