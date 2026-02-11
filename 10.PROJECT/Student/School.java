package Student;

interface School {
    String schoolName = "Moulana Higher Secondary School";
    void studentDetails();
    String studentResult();
    void studentGrade();
    // static method
    static void schoolDetails(){
        System.out.println("MHSS\nPerambalur\nTamilnadu");
    }
    // default methed
    default void CoEduOrNot(){
        System.out.println("This is Co-Education School");
    }
}
