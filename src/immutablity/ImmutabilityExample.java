package immutablity;

public final class ImmutabilityExample {
    private final Integer empid;
    private final String empname;
    private final String address;
    private final Long salary;

    public Integer getEmpid() {
        return empid;
    }

    public String getEmpname() {
        return empname;
    }

    public String getAddress() {
        return address;
    }

    public Long getSalary() {
        return salary;
    }

    ImmutabilityExample (Integer empid, String empname, String address, Long salary ){
        this.empid = empid;
        this.empname= empname;
        this.address = address;
        this.salary = salary;
    }
}
