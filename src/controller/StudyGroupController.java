package controller;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import service.StudyGroupService;

import java.util.List;

public class StudyGroupController {
    private StudyGroupService studyGroupService = new StudyGroupService();

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }
}