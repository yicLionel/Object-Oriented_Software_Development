public class studentTest {
    public static void main(String[] args) {
        Student stu = new Student(132424, "Alice", 20, 180, "SWEN20003");


        stu.printStudent();
        System.out.println("\n");
        stu.printStudent(12345,"Allen", 180);
    }

}
