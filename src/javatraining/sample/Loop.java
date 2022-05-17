package javatraining.sample;
import java.util.ArrayList;
import java.util.List;


public class Loop {
    public static void main(String [] args){
        Student stud1 = new Student();
        stud1.setName("Sasi");
        stud1.setAge(25);
        stud1.setAddress("Ongole");


        Student stud2 = new Student();
        stud2.setName("Sai");
        stud2.setAge(21);
        stud2.setAddress("delhi");

        Student stud3 = new Student();
        stud3.setName("Samantha");
        stud3.setAge(35);
        stud3.setAddress("puri");
        List <Student> list= new ArrayList<>();
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);

for (Student N:list)
{
    if (N.getAge() > 20) {

        System.out.println("Names are :"+N.getName() +" " +N.getAddress()+" " +N.getAge());
    }
}
    }
}
