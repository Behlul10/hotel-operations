public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private float payRate;
    private float hoursWorked;

    public Employee(float payRate, float hoursWorked){
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public float getTotalPay() {
        return this.payRate * this.hoursWorked;
    }

    public float getRegularHours() {
        if (this.hoursWorked >= 40) {
            return 40;
        } else {
            return  this.hoursWorked;
        }
    }

    public float getOvertimeHours() {
        if (this.hoursWorked >= 40){
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }


}
