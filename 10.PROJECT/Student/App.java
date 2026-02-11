package Student;

public class App {

    static void main() {

        Student student1 = new Student(1, "10'th", "Deva", 75.3);
        student1.studentDetails();
        School student2 = new Student(2,"11'th","DRS",14);
        System.out.println(student2.studentResult());

    }

}


























        /*
        System.out.println("Student result is : "+student1.studentResult());
        student1.studentGrade();

        student1.setStudentId(101);
        System.out.println("Student ID is : "+student1.getStudentId());

        student1.setStudentStandard("12'th");
        System.out.println("Student standard is : "+student1.getStudentStandard());

        student1.setStudentName("DRS");
        System.out.println("Student name is : "+student1.getStudentName());

        student1.setStudentMark(62);
        System.out.println("Student mark is : "+student1.getStudentMark());

    }

}
        */