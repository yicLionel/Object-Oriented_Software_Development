public class Student {
    public int id;
    public String name;
    public int age;
    public int height;
    public String courseID;


    public Student(int id, String name, int age, int height, String courseID){
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.courseID = courseID;

    }

    public void printStudent() {
        System.out.println("id is:" + id + "\nname is:" + name
                            + "\nage is:" + age + "\nheight is:"
                            + height + "\ncourse id is:" + courseID);
    }

    public void printStudent(int id, String name, int height) {
        this.id = id;
        this.name = name;
        this.height = height;
        System.out.println("id is:" + id + "\nname is:" + name
                            + "\nheight is:"
                            + height);
    }
}
