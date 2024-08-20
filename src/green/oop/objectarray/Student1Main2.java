package green.oop.objectarray;

public class Student1Main2 {

    public static void main(String[] args) {
        //객체 배열
        //Student1 클래스 같이

        Student1 student1 = new Student1("학생1", 80, 90, 100);
        Student1 student2 = new Student1("학생2", 100, 100, 95);
        Student1 student3 = new Student1("학생3", 75, 100, 60);

        Student1[] students = {student1, student2, student3};

        //배열로 한번에
        for(int i=0; i<students.length; i++){
            students[i].calculateAverage();
            students[i].printStudent();
        }

        for (Student1 student : students) {
            student.calculateAverage();
            student.printStudent();
        }

//        students[0].calculateAverage();
//        students[1].calculateAverage();
//        students[2].calculateAverage();
//
//        students[0].printStudent();
//        students[1].printStudent();
//        students[2].printStudent();
    }
}
