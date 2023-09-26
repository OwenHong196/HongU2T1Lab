public class Student {
    private String name;
    private double gpa;
    public Student(String studentName, double studentGpa){
        name = studentName;
        gpa = studentGpa;
    }
    public void introduction(){
        System.out.println("Hi, my name is " + name);
        System.out.print("My gpa is " + gpa);
        if (gpa>=3.5){
            System.out.print(", which is very good.");
        }else if (gpa>=3.0){
            System.out.print(", which is decent.");
        }else if (gpa>2.0){
            System.out.print(", which is okay.");
        }else if (gpa==2.0){
            System.out.print(", which is barely passing.");
        }else{
            System.out.print(", which is failing.");
        }
    }
}
