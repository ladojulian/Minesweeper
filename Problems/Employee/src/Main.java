class Employee {

    private static final String UNKNOWN = "unknown";
    String name;
    int salary;
    String address;

    public Employee() {
        this.name = UNKNOWN;
        this.address = UNKNOWN;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.address = UNKNOWN;
    }

    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}