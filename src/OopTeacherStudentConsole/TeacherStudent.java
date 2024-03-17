package OopTeacherStudentConsole;

public class TeacherStudent {
    private long id;
    private OopTeacherStudentConsole.Teacher teacher;
    private OopTeacherStudentConsole.Student student;
    private String subject;
    private String classNumber;

    public TeacherStudent(long id, OopTeacherStudentConsole.Teacher teacher, OopTeacherStudentConsole.Student student, String subject, String classNumber) {
        this.id = id;
        this.teacher = teacher;
        this.student = student;
        this.subject = subject;
        this.classNumber = classNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public OopTeacherStudentConsole.Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(OopTeacherStudentConsole.Teacher teacher) {
        this.teacher = teacher;
    }

    public OopTeacherStudentConsole.Student getStudent() {
        return student;
    }

    public void setStudent(OopTeacherStudentConsole.Student student) {
        this.student = student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }
}

