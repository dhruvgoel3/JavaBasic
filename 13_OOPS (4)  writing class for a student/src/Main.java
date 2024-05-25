class Student {
    public int roll;
    public char name;
    public char course;
    public int m1, m2, m3;


    public double total() {
        return (m1 + m2 + m2);
    }

    public double average() {
        return (float) total() / 100;
    }

    public char grade() {
        if (average() >= 60)
            return 'A';
        else
            return 'B';
    }
    public String details()
    {
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+course+"\n";
    }
}
public class Main {
    public static void main(String[] args)
    {
Student s = new Student();
s.roll = 10;
//s.name="Dhruv";
//s.course="CS";
s.m1 = 70;
s.m2 = 80;
s.m3 = 90;

        System.out.println("total: "+s.total());
        System.out.println("average: "+s.average());
        System.out.println("Details: "+s.details());




    }
}