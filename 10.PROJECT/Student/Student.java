package Student;

public class Student implements School{

    // properties
    private int studentId;
    private String studentStandard;
    private String studentName;
    private double studentMark;

    // constructor
    public Student(int studentId, String studentStandard, String studentName, double studentMark){
        this.studentId = studentId;
        this.studentStandard = studentStandard;
        this.studentName = studentName;
        this.studentMark = studentMark;
        // call static and defualt methods
        //System.out.println("..."+School.schoolName+"...");
        //School.schoolDetails();
    }

    // getter & setter for studentId
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public int getStudentId(){
        return this.studentId;
    }
    // getter & setter for studentStandard
    public void setStudentStandard(String studentStandard){
        this.studentStandard = studentStandard;
    }
    public String getStudentStandard(){
        return this.studentStandard;
    }
    // getter & setter for studentName
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public String getStudentName(){
        return this.studentName;
    }
    // getter & setter for studentMark
    public void setStudentMark(double studentMark){
        this.studentMark = studentMark;
    }
    public double getStudentMark(){
        return this.studentMark;
    }

    // student behaviour - studentDetails(), studentResult(), studentGrade()
    // student details
    public void studentDetails(){
        System.out.println(
                "Student ID : "+this.studentId+"\n"+
                "Student Standard : "+this.studentStandard+"\n"+
                "Student Name : "+this.studentName+"\n"+
                "student Mark : "+this.studentMark
        );
    }
    // student result
    public String studentResult(){
        return ((this.studentMark>=0) && (this.studentMark<=40))?"Student is fail...":"Student is pass...";
    }
    // student grade
    public void studentGrade(){
        if((this.studentMark>=0) && (this.studentMark<=40)){
            System.out.println("Student grade is : 'F' ");
        }else if((this.studentMark>40) && (this.studentMark<=60)){
            System.out.println("Student grade is : 'C' ");
        }else if((this.studentMark>60) && (this.studentMark<=75)){
            System.out.println("Student grade is : 'B' ");
        }else if((this.studentMark>75) && (this.studentMark<=100)){
            System.out.println("Student grade is : 'A' ");
        }else{
            System.out.println("Mark is invalid...");
        }
    }

}
