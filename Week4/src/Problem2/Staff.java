package Problem2;

class Staff extends Person {
    private String school;
    private double pay;

    Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    String getSchool() {
        return school;
    }

    void setSchool(String school) {
        this.school = school;
    }

    double getPay() {
        return pay;
    }

    void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "\n" + "Staff[" + super.toString() + "School = " + school + " Pay = " + pay + "]" + "\n";
    }
}
