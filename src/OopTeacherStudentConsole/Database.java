package OopTeacherStudentConsole;

import java.util.Scanner;

public class Database {
    private static Teacher[] teachers = new Teacher[30];
    private static Student[] students = new Student[30];
    private static TeacherStudent[] teacherStudents = new TeacherStudent[50];
    private static int studentIndex = 1;
    private static int teacherIndex = 1;
    private static int teacherStudentIndex = 1;


    public static void addDataTeacher(Teacher teacher) {
        teachers[teacherIndex] = teacher;
        teacherIndex++;
        System.out.println("Muellim dataya elave edildi.");
    }

    public static void addDataStudent(Student student) {
        students[studentIndex] = student;
        studentIndex++;
        System.out.println("Sagird dataya elave edildi.");
    }

    public static void addTeacherStudent(TeacherStudent teacherStudent) {
        teacherStudents[teacherStudentIndex] = teacherStudent;
        teacherStudentIndex++;
        System.out.println("Muellim-sagird elaqesi dataya elave edildi.");
    }

    public static void showDataTeacher() {
        if (teacherIndex == 0) {
            System.out.println("Hal-Hazirda datada muellim yoxdur.");
        }
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println("id: " + teacher.getId() + " -- " + teacher.getName() + " " + teacher.getSurname());
            }
        }
    }

    public static void showDataStudent() {
        if (studentIndex == 0) {
            System.out.println("Hal-Hazirda datada sagird yoxdur.");
        }
        for (Student student : students) {
            if (student != null) {
                System.out.println("id: " + student.getId() + " -- " + student.getName() + " " + student.getSurname());
            }
        }
    }

    public static void showTeacherLessonStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sagirdler: ");
        showDataStudent();
        System.out.println("-----");
        System.out.print("Secdiyiniz sagirdin id daxil edin: ");
        int indexS = scanner.nextInt();
        System.out.println("Hemin sagirde ders kecen Muellimler: ");
        for (TeacherStudent teacherStudent : teacherStudents) {
            if (teacherStudent != null) {
                if (teacherStudent.getStudent().getId() == indexS) {
                    System.out.println(teacherStudent.getTeacher().getName() + " " + teacherStudent.getTeacher().getSurname());
                    System.out.println("Fennin adi: " + teacherStudent.getSubject());
                    System.out.println("-");
                }
            }
        }
    }

    public static void showStudentTeachTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Muellimler ");
        showDataTeacher();
        System.out.println("-----");
        System.out.print("Secdiyiniz muellimin id daxil edin: ");
        int indexT = scanner.nextInt();
        System.out.println("Hemin muellimin ders kecdiyi sagirdler: ");
        for (TeacherStudent teacherStudent : teacherStudents) {
            if (teacherStudent != null) {
                if (teacherStudent.getTeacher().getId() == indexT) {
                    System.out.println(teacherStudent.getStudent().getName() + " " + teacherStudent.getStudent().getSurname());
                    System.out.println("Sinif nomresi: " + teacherStudent.getClassNumber());
                    System.out.println("-");
                }
            }
        }
    }


    public static Teacher[] getTeachers() {
        return teachers;
    }

    public static Student[] getStudents() {
        return students;
    }

    public static int getTeacherIndex() {
        return teacherIndex;
    }

    public static int getStudentIndex() {
        return studentIndex;
    }

    public static int getTeacherStudentIndex() {
        return teacherStudentIndex;
    }

    public static TeacherStudent[] getTeacherStudents() {
        return teacherStudents;
    }

}

