public class Application {

    public static void main(String[] args) {

        Employee employee1=new Employee(001,8131357,"Hashir Muhammadh","971032340V","ANP649");

        Employee employee2=new Employee(002,8131384,"Core Lenovo","200022526223","ANP655");

        Employee employee3=new Employee(001,8131357,"Hashir Muhammadh","971032340V","ANP649");

        System.out.println(employee1.equals(employee2));

        System.out.println("Employee 1 : "+employee1);
        System.out.println("Employee 2 :"+employee2);
        System.out.println("Employee 3 :"+employee3);

        System.out.println(employee1.equals(employee3));

        employee2.setEmpId(001);
        employee2.setEmpCode(8131357);

        System.out.println(employee1.equals(employee2));

        System.out.println("Employee 1 : "+employee1);
        System.out.println("Employee 2 :"+employee2);
        System.out.println("Employee 3 :"+employee3);
    }

}