package OopTeacherStudentConsole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        menu();
        while(true){
            System.out.println("--------");
            System.out.print("Seciminizi edin: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addTeacher();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    addTeacherStudent();
                    break;
                case 4:
                    Database.showDataTeacher();
                    break;
                case 5:
                    Database.showDataStudent();
                    break;
                case 6:
                    Database.showTeacherLessonStudent();
                    break;
                case 7:
                    Database.showStudentTeachTeacher();
                    break;
                case 8:
                    System.out.println("Sistemden çıxılır...");
                    System.exit(0);
                default:
                    System.out.println("Qardas yanlis secim etmisiniz :/");
                    System.out.println("Yeniden secim et :/");
                    break;
            }

        }

    }

    public static void menu(){
        System.out.println("Sagird-Muellim SISTEMI!!!");
        System.out.println("1.Yeni muellim yaratmaq.");
        System.out.println("2.Yeni sagird yaratmaq.");
        System.out.println("3.Yeni teacher student əlaqəsi yaratmaq.");
        System.out.println("4.Mövcud müəllimləri görmək.");
        System.out.println("5.Mövcud şagirdləri görmək.");
        System.out.println("6.Bir şagirdə dərs keçən müəllimləri görmək.");
        System.out.println("7.Bir müəllimin dərs dediyi şagirdləri görmək.");
        System.out.println("8.Sistemden cixmaq.");
    }
    public static Teacher addTeacher(){
        Scanner scanner = new Scanner(System.in);
        long teacherId = Database.getTeacherIndex();
        System.out.print("Muellimin adin daxil edin: "); String teacherName = scanner.next();
        System.out.print("Muellimin soyadin daxil edin: "); String teacherSurname = scanner.next();
        System.out.print("Muellimin dogum tarixin daxil edin(gun-ay-il): "); String teacherBirthDate = scanner.next();
        System.out.print("Muellimin gmailin daxil edin: "); String teacherGmail = scanner.next();
        Teacher teacher = new Teacher(teacherId,teacherName,teacherSurname,teacherBirthDate,teacherGmail);
        Database.addDataTeacher(teacher);
        return teacher;
    }
    public static Student addStudent(){
        Scanner scanner = new Scanner(System.in);
        long sagirdId = Database.getStudentIndex();
        System.out.print("Sagirdin adin daxil edin: "); String studentName = scanner.next();
        System.out.print("Sagirdin soyadin daxil edin: "); String studentSurname = scanner.next();
        System.out.print("Sagirdin dogum tarixin daxil edin(gun-ay-il): "); String studentBirthDate = scanner.next();
        System.out.print("Sagirdin gmailin daxil edin: "); String studentGmail = scanner.next();
        Student student = new Student(sagirdId,studentName,studentSurname,studentBirthDate,studentGmail);
        Database.addDataStudent(student);
        return student;
    }
    public static TeacherStudent addTeacherStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Database-de olan Muellim ve Sagirdler!!!");
        long teacherStudentIndex = Database.getTeacherStudentIndex();
        System.out.println("Muellimler: "); Database.showDataTeacher();
        System.out.println("-----");
        System.out.println("Sagirdler: "); Database.showDataStudent();
        System.out.println("-----");
        System.out.print("Secdiyiniz sagirdin id daxil edin: "); int indexS = scanner.nextInt();
        System.out.print("Hemin sagirde ders keçən muellimin id daxil edin: "); int indexT = scanner.nextInt();
        System.out.print("Fennin adin daxil edin: "); String subject = scanner.next();
        System.out.print("Sinifi nomresin daxil edin: "); String classNumber = scanner.next();
        TeacherStudent teacherStudent = new TeacherStudent(teacherStudentIndex,Database.getTeachers()[indexT], Database.getStudents()[indexS],subject,classNumber );
        Database.addTeacherStudent(teacherStudent);
        return teacherStudent;
    }

}

