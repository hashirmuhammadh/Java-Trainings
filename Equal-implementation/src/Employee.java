import java.util.Objects;

public class Employee {

    private int empId;

    public Employee(int empId, int empCode, String name, String nic, String address) {
        this.empId = empId;
        this.empCode = empCode;
        this.name = name;
        this.nic = nic;
        this.address = address;
    }

    private int empCode;
    private String name;
    private String nic;
    private String address;




    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object object) {

        Employee obj=(Employee) object;

        if(obj.getEmpId()==this.empId){
            return true;
        }else{

            if (obj.getEmpCode()==this.empCode){

                return true;
            }else{

                return false;
            }

        }

    }

    @Override
    public String toString() {
        return "{" +
                "empId=" + empId +
                ", empCode=" + empCode +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}