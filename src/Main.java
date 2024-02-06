import controller.StudyGroupController;
import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем преподавателя
        Teacher teacher = new Teacher("T001", "Ivan Ivanov");

        // Создаем список студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("S001", "Petr Petrov"));
        students.add(new Student("S002", "Sidor Sidorov"));
        students.add(new Student("S003", "Anna Ivanova"));

        // Создаем учебную группу через контроллер
        StudyGroupController controller = new StudyGroupController();
        StudyGroup studyGroup = controller.createStudyGroup(teacher, students);

        // Выводим информацию о учебной группе
        System.out.println("Учебная группа:");
        System.out.println("Преподаватель: " + studyGroup.getTeacher().getName());
        System.out.println("Студенты:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(" - " + student.getName());
        }
    }
}