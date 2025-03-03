public class Student {
    int rollno;
    String name;
    int marks;
}

class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Arya";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Kinnu";
        s2.marks = 65;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Arpita";
        s3.marks = 60;

        Student s4 = new Student();
        s4.rollno = 4;
        s4.name = "Vanshika";
        s4.marks = 98;

        Student s5 = new Student();
        s5.rollno = 5;
        s5.name = "Palak";
        s5.marks = 88;

        Student[] stu = new Student[5];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;
        stu[3] = s4;
        stu[4] = s5;

        for (int i = 0; i < stu.length; i++) {
            if (stu[i].marks > 75) {
                System.out.println("rollno: " + stu[i].rollno + " name: " + stu[i].name + " marks: " + stu[i].marks);
            }
    }
}

}
