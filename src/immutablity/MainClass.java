package immutablity;

public class MainClass {
    public static void main(String[] args) {
        ImmutabilityExample ie = new ImmutabilityExample(121,"sasi","bengalore", 22000L);

        System.out.println(ie.getEmpid());
        System.out.println(ie.getEmpname());
        System.out.println(ie.getAddress());
        System.out.println(ie.getSalary());

    }
}
