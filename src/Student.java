public class Student {
    // Attributes are private for data security and integrity purposes
    private String studentID;
    private String name;
    private String batch;
    private String programme;
    private float gpa;
    private float cgpa;

    // Overloading Consructors
    // No-Argument Constructor
    public Student() {
        this.studentID = "B000001B";
        this.name = "Jane Doe";
        this.batch = "B24-B";
    }

    // Parameterized Constructor
    public Student(String studentID, String name, String batch) {
        this.studentID = studentID;
        this.name = name;
        this.batch = batch;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public String getProgramme() {
        return programme;
    }

    public float getGpa() {
        return gpa;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public void introduce() {
        System.out.println("Bonjour!");
        System.out.println("My name is " + name);
        System.out.println("My student ID is " + studentID + " batch " + batch);
        System.out.println("I study in " + programme);
    }
}
