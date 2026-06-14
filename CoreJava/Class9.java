class Student{
    int rollNo;
    String name;
    int marks;
}
public class Class9 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Navin";s1.marks = 88;

       Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Harsh";
        s2.marks = 77;

        Student s3 = new Student();
        s3.rollNo = 1;
        s3.name = "Kiran";
        s3.marks = 67;
//
        Student[] student = new Student[3];
//        student[0] = s1;
//        student[1] = s2;
//        student[2] = s3;
//
//        System.out.println(s1);
//        for(int i = 0; i < student.length;i++){
//            System.out.println(student[i].name + " : "+ student[i].rollNo);
//        }

//        int[] nums = new int[4];
//        nums[0] = 4;
//        nums[1] = 8;
//        nums[2] = 3;
//        nums[3] = 9;
//        for (int x : nums) {
//            System.out.print(x + " ");
//        }
    }
}