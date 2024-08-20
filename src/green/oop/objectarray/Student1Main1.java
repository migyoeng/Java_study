package green.oop.objectarray;

public class Student1Main1 {

    public static void main(String[] args) {
        //객체 배열
        //Student1 클래스 같이

        Student1 student1 = new Student1("학생1", 80, 90, 100);
        Student1 student2 = new Student1("학생2", 100, 100, 95);
        Student1 student3 = new Student1("학생3", 75, 100, 60);

        student1.calculateAverage();
        student2.calculateAverage();
        student3.calculateAverage();

        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
    }
}
