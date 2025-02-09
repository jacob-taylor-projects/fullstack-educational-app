package com.project.education_app;

import com.project.education_app.entities.*;
import com.project.education_app.repos.*;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.project.education_app.Assignment1to4Seeder.*;
import static com.project.education_app.Seeder.*;

@Component
@Order(7)
@Data
public class ProjectSeeder implements CommandLineRunner {
    private final FacultyRepo facultyRepo;
    private final SyllabusRepo syllabusRepo;
    private final StudentRepo studentRepo;
    private final CourseRepo courseRepo;
    private final ProjectRepo projectRepo;
    private final ProblemAnswerRepo problemAnswerRepo;
    private final StudentAnswerRepo studentAnswerRepo;
    private final SubmissionRepo submissionRepo;
    private final GradeRepo gradeRepo;
    private final CourseGradeRepo courseGradeRepo;
    private final FeedbackRepo feedbackRepo;

    @Override
    public void run(String... args) throws Exception {
        Faculty faculty1 = facultyRepo.findById(1);
        Faculty faculty2 = facultyRepo.findById(2);
        Faculty faculty3 = facultyRepo.findById(3);
        Faculty faculty4 = facultyRepo.findById(4);
        Faculty faculty5 = facultyRepo.findById(5);
        Syllabus syllabus1 = syllabusRepo.findById(1);
        Syllabus syllabus2 = syllabusRepo.findById(2);
        Syllabus syllabus3 = syllabusRepo.findById(3);
        Syllabus syllabus4 = syllabusRepo.findById(4);
        Syllabus syllabus5 = syllabusRepo.findById(5);
        Syllabus syllabus6 = syllabusRepo.findById(6);
        Syllabus syllabus7 = syllabusRepo.findById(7);
        Syllabus syllabus8 = syllabusRepo.findById(8);
        Syllabus syllabus9 = syllabusRepo.findById(9);
        Syllabus syllabus10 = syllabusRepo.findById(10);
        Syllabus syllabus11 = syllabusRepo.findById(11);
        Syllabus syllabus12 = syllabusRepo.findById(12);
        Syllabus syllabus13 = syllabusRepo.findById(13);
        Syllabus syllabus14 = syllabusRepo.findById(14);
        Syllabus syllabus15 = syllabusRepo.findById(15);
        Syllabus syllabus16 = syllabusRepo.findById(16);
        Syllabus syllabus17 = syllabusRepo.findById(17);
        Syllabus syllabus18 = syllabusRepo.findById(18);
        Syllabus syllabus19 = syllabusRepo.findById(19);
        Syllabus syllabus20 = syllabusRepo.findById(20);
        Student student1 = studentRepo.findById(1);
        Student student2 = studentRepo.findById(2);
        Student student3 = studentRepo.findById(3);
        Student student4 = studentRepo.findById(4);
        Student student5 = studentRepo.findById(5);
        Student student6 = studentRepo.findById(6);
        Student student7 = studentRepo.findById(7);
        Student student8 = studentRepo.findById(8);
        Student student9 = studentRepo.findById(9);
        Student student10 = studentRepo.findById(10);
        Course course1 = courseRepo.findById(1);
        Course course2 = courseRepo.findById(2);
        Course course3 = courseRepo.findById(3);
        Course course4 = courseRepo.findById(4);
        Course course5 = courseRepo.findById(5);
        Course course6 = courseRepo.findById(6);
        Course course7 = courseRepo.findById(7);
        Course course8 = courseRepo.findById(8);
        Course course9 = courseRepo.findById(9);
        Course course10 = courseRepo.findById(10);
        Course course11 = courseRepo.findById(11);
        Course course12 = courseRepo.findById(12);
        Course course13 = courseRepo.findById(13);
        Course course14 = courseRepo.findById(14);
        Course course15 = courseRepo.findById(15);
        Course course16 = courseRepo.findById(16);
        Course course17 = courseRepo.findById(17);
        Course course18 = courseRepo.findById(18);
        Course course19 = courseRepo.findById(19);
        Course course20 = courseRepo.findById(20);

        Project project1a = createProject("Variables Project", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        Project project1b = createProject("Data Types Project", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        Project project1c = createProject("Control Structures Project", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        Project project1d = createProject("Functions Project", faculty1, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        Project project1e = createProject("Modules Project", faculty1, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        Project project1f = createProject("Libraries Project", faculty1, Date.from(LocalDate.of(2030, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        Project project2a = createProject("Arrays Project", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        Project project2b = createProject("Linked Lists Project", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        Project project2c = createProject("Stacks Project", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        Project project2d = createProject("Queues Project", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        Project project2e = createProject("Trees Project", faculty2, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        Project project2f = createProject("Graphs Project", faculty2, Date.from(LocalDate.of(2030, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        Project project3a = createProject("Sorting Project", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);
        Project project3b = createProject("Searching Project", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);
        Project project3c = createProject("Graph Algorithms Project", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);
        Project project3d = createProject("Dynamic Programming Project", faculty3, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);
        Project project4a = createProject("Relational Databases Project", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);
        Project project4b = createProject("SQL Project", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);
        Project project4c = createProject("Transactions Project", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);
        Project project4d = createProject("Database Design Project", faculty4, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);
        Project project5a = createProject("Processes Project", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        Project project5b = createProject("Memory Management Project", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        Project project5c = createProject("File Systems Project", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        Project project5d = createProject("Scheduling Project", faculty5, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        Project project6a = createProject("OSI Model Project", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        Project project6b = createProject("TCP/IP Project", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        Project project6c = createProject("Network Protocols Project", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        Project project6d = createProject("Routing Project", faculty1, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        Project project6e = createProject("Switching Project", faculty1, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        Project project7a = createProject("SDLC Project", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        Project project7b = createProject("Agile Project", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        Project project7c = createProject("Waterfall Project", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        Project project7d = createProject("Project Management Project", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        Project project8a = createProject("HTML Project", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        Project project8b = createProject("CSS Project", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        Project project8c = createProject("JavaScript Project", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        Project project8d = createProject("React Project", faculty3, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        Project project8e = createProject("Backend Integration Project", faculty3, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        Project project9a = createProject("Machine Learning Project", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);
        Project project9b = createProject("Neural Networks Project", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);
        Project project9c = createProject("Natural Language Processing Project", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);
        Project project10a = createProject("Threat Analysis Project", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        Project project10b = createProject("Encryption Project", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        Project project10c = createProject("Network Security Project", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        Project project10d = createProject("Secure Coding Project", faculty5, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        Project project11a = createProject("Limits Project", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        Project project11b = createProject("Derivatives Project", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        Project project11c = createProject("Integrals Project", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        Project project11d = createProject("Applications of Calculus Project", faculty1, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        Project project12a = createProject("Vectors Project", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        Project project12b = createProject("Matrices Project", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        Project project12c = createProject("Determinants Project", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        Project project12d = createProject("Eigenvalues Project", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        Project project12e = createProject("Eigenvectors Project", faculty2, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        Project project13a = createProject("Sequences and Series Project", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        Project project13b = createProject("Techniques of Integration Project", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        Project project13c = createProject("Multivariable Functions Project", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        Project project13d = createProject("Vector Calculus Project", faculty3, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        Project project14a = createProject("Logic Project", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        Project project14b = createProject("Set Theory Project", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        Project project14c = createProject("Graph Theory Project", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        Project project14d = createProject("Combinatorics Project", faculty4, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        Project project15a = createProject("Newton's Laws Project", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);
        Project project15b = createProject("Energy Principles Project", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);
        Project project15c = createProject("Motion Project", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);
        Project project16a = createProject("Atomic Structure Project", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);
        Project project16b = createProject("Chemical Bonding Project", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);
        Project project16c = createProject("Reactions Project", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);
        Project project17a = createProject("Cell Structure Project", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        Project project17b = createProject("Genetics Project", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        Project project17c = createProject("Evolution Project", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        Project project17d = createProject("Ecology Project", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        Project project18a = createProject("Engineering Disciplines Project", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);
        Project project18b = createProject("Problem-Solving Project", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);
        Project project18c = createProject("Design Process Project", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);
        Project project19a = createProject("Circuit Analysis Project", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);
        Project project19b = createProject("Signal Processing Project", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);
        Project project19c = createProject("Systems Theory Project", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);
        Project project20a = createProject("Statics Project", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        Project project20b = createProject("Dynamics Project", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        Project project20c = createProject("Thermodynamics Project", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        Project project20d = createProject("Material Science Project", faculty5, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        projectRepo.saveAllAndFlush(Arrays.asList(project1a, project1b, project1c, project1d, project1e, project1f, project2a, project2b, project2c, project2d, project2e, project2f, project3a, project3b, project3c, project3d, project4a, project4b, project4c, project4d, project5a, project5b, project5c, project5d, project6a, project6b, project6c, project6d, project6e, project7a, project7b, project7c, project7d, project8a, project8b, project8c, project8d, project8e, project9a, project9b, project9c, project10a, project10b, project10c, project10d, project11a, project11b, project11c, project11d, project12a, project12b, project12c, project12d, project12e, project13a, project13b, project13c, project13d,
                project14a, project14b, project14c, project14d, project15a, project15b, project15c, project16a, project16b, project16c, project17a, project17b, project17c, project17d, project18a, project18b, project18c, project19a, project19b, project19c, project20a, project20b, project20c, project20d));

        ProblemAnswer pa1a_project = createProblemAnswer("What is the significance of variables in programming?", "Variables are essential for storing and manipulating data, allowing programmers to create dynamic and flexible programs.");
        addProjectToProblemAnswer(pa1a_project, project1a);
        System.out.println("Project for 'Variables' unit created with associated problem answer.");
        addStudentToProject(project1a, student1);
        addStudentToProject(project1a, student2);

        ProblemAnswer pa1b_project = createProblemAnswer("How do different data types impact program functionality?", "Different data types allow for the representation and manipulation of various forms of data, ensuring the correct handling and processing in programs.");
        addProjectToProblemAnswer(pa1b_project, project1b);
        System.out.println("Project for 'Data Types' unit created with associated problem answer.");
        addStudentToProject(project1b, student1);
        addStudentToProject(project1b, student2);

        ProblemAnswer pa1c_project = createProblemAnswer("Why are control structures important in programming?", "Control structures like loops and conditionals enable the flow control of a program, allowing for repeated actions and decision-making based on conditions.");
        addProjectToProblemAnswer(pa1c_project, project1c);
        System.out.println("Project for 'Control Structures' unit created with associated problem answer.");
        addStudentToProject(project1c, student1);
        addStudentToProject(project1c, student2);

        ProblemAnswer pa1d_project = createProblemAnswer("What is the role of functions in programming?", "Functions allow for code reuse and modularity, making programs more organized, readable, and maintainable.");
        addProjectToProblemAnswer(pa1d_project, project1d);
        System.out.println("Project for 'Functions' unit created with associated problem answer.");
        addStudentToProject(project1d, student1);
        addStudentToProject(project1d, student2);

        ProblemAnswer pa1e_project = createProblemAnswer("How do modules enhance Python programming?", "Modules allow for the modularization of code, making it more manageable and reusable, and enable the use of built-in and custom functionalities.");
        addProjectToProblemAnswer(pa1e_project, project1e);
        System.out.println("Project for 'Modules' unit created with associated problem answer.");
        addStudentToProject(project1e, student1);
        addStudentToProject(project1e, student2);

        ProblemAnswer pa1f_project = createProblemAnswer("What is the significance of libraries in Python programming?", "Libraries provide pre-written code that extends the functionality of programs, allowing developers to perform complex tasks efficiently.");
        addProjectToProblemAnswer(pa1f_project, project1f);
        System.out.println("Project for 'Libraries' unit created with associated problem answer.");
        addStudentToProject(project1f, student1);
        addStudentToProject(project1f, student2);

        ProblemAnswer pa2a_project = createProblemAnswer("What are the advantages of using arrays?", "Arrays provide a way to store multiple elements of the same type in a contiguous block of memory, allowing for efficient indexing and traversal.");
        addProjectToProblemAnswer(pa2a_project, project2a);
        System.out.println("Project for 'Arrays' unit created with associated problem answer.");
        addStudentToProject(project2a, student1);
        addStudentToProject(project2a, student2);

        ProblemAnswer pa2b_project = createProblemAnswer("What are the advantages of using linked lists?", "Linked lists allow for efficient insertions and deletions at any position in the list, providing more flexibility than arrays.");
        addProjectToProblemAnswer(pa2b_project, project2b);
        System.out.println("Project for 'Linked Lists' unit created with associated problem answer.");
        addStudentToProject(project2b, student1);
        addStudentToProject(project2b, student2);

        ProblemAnswer pa2c_project = createProblemAnswer("What are the common uses of stacks?", "Stacks are commonly used for function call management, expression evaluation, and depth-first search algorithms.");
        addProjectToProblemAnswer(pa2c_project, project2c);
        System.out.println("Project for 'Stacks' unit created with associated problem answer.");
        addStudentToProject(project2c, student1);
        addStudentToProject(project2c, student2);

        ProblemAnswer pa2d_project = createProblemAnswer("What are the applications of queues?", "Queues are used in scheduling algorithms, buffering data streams, and breadth-first search algorithms.");
        addProjectToProblemAnswer(pa2d_project, project2d);
        System.out.println("Project for 'Queues' unit created with associated problem answer.");
        addStudentToProject(project2d, student1);
        addStudentToProject(project2d, student2);

        ProblemAnswer pa2e_project = createProblemAnswer("Why are trees important in data structures?", "Trees provide a hierarchical structure for organizing data, enabling efficient search, insertion, and deletion operations.");
        addProjectToProblemAnswer(pa2e_project, project2e);
        System.out.println("Project for 'Trees' unit created with associated problem answer.");
        addStudentToProject(project2e, student1);
        addStudentToProject(project2e, student2);

        ProblemAnswer pa2f_project = createProblemAnswer("What are the applications of graphs?", "Graphs are used to represent relationships between entities in various fields such as social networks, transportation systems, and computer networks.");
        addProjectToProblemAnswer(pa2f_project, project2f);
        System.out.println("Project for 'Graphs' unit created with associated problem answer.");
        addStudentToProject(project2f, student1);
        addStudentToProject(project2f, student2);

        ProblemAnswer pa3a_project = createProblemAnswer("What are the benefits of using efficient sorting algorithms?", "Efficient sorting algorithms improve the performance of applications by reducing the time complexity of sorting operations, leading to faster data processing.");
        addProjectToProblemAnswer(pa3a_project, project3a);
        System.out.println("Project for 'Sorting' unit created with associated problem answer.");
        addStudentToProject(project3a, student1);
        addStudentToProject(project3a, student2);

        ProblemAnswer pa3b_project = createProblemAnswer("Why is binary search more efficient than linear search?", "Binary search significantly reduces the time complexity by dividing the search space in half with each step, making it much faster for large datasets compared to linear search.");
        addProjectToProblemAnswer(pa3b_project, project3b);
        System.out.println("Project for 'Searching' unit created with associated problem answer.");
        addStudentToProject(project3b, student1);
        addStudentToProject(project3b, student2);

        ProblemAnswer pa3c_project = createProblemAnswer("How do graph algorithms benefit network analysis?", "Graph algorithms like DFS and BFS are crucial for analyzing network structures, identifying connectivity, and optimizing routes and connections in various fields, such as social networks and transportation.");
        addProjectToProblemAnswer(pa3c_project, project3c);
        System.out.println("Project for 'Graph Algorithms' unit created with associated problem answer.");
        addStudentToProject(project3c, student1);
        addStudentToProject(project3c, student2);

        ProblemAnswer pa3d_project = createProblemAnswer("What is the importance of dynamic programming in problem-solving?", "Dynamic programming optimizes the solution of complex problems by breaking them down into simpler subproblems, reducing redundancy and improving efficiency.");
        addProjectToProblemAnswer(pa3d_project, project3d);
        System.out.println("Project for 'Dynamic Programming' unit created with associated problem answer.");
        addStudentToProject(project3d, student1);
        addStudentToProject(project3d, student2);

        ProblemAnswer pa4a_project = createProblemAnswer("What is the importance of relational databases?", "Relational databases organize data efficiently and establish clear relationships between data points, ensuring data integrity and ease of access.");
        addProjectToProblemAnswer(pa4a_project, project4a);
        System.out.println("Project for 'Relational Databases' unit created with associated problem answer.");
        addStudentToProject(project4a, student1);
        addStudentToProject(project4a, student2);

        ProblemAnswer pa4b_project = createProblemAnswer("How does SQL enhance database management?", "SQL allows for efficient querying and manipulation of data, enabling users to create, read, update, and delete records with precision and ease.");

        addProjectToProblemAnswer(pa4b_project, project4b);
        System.out.println("Project for 'SQL' unit created with associated problem answer.");
        addStudentToProject(project4b, student1);
        addStudentToProject(project4b, student2);

        ProblemAnswer pa4c_project = createProblemAnswer("Why are transactions critical in databases?", "Transactions ensure data integrity and consistency by adhering to ACID properties, allowing for safe and reliable database operations.");
        addProjectToProblemAnswer(pa4c_project, project4c);
        System.out.println("Project for 'Transactions' unit created with associated problem answer.");
        addStudentToProject(project4c, student1);
        addStudentToProject(project4c, student2);

        ProblemAnswer pa4d_project = createProblemAnswer("What are the best practices in database design?", "Best practices in database design include normalization, efficient schema creation, and data modeling to ensure optimal performance and data integrity.");
        addProjectToProblemAnswer(pa4d_project, project4d);
        System.out.println("Project for 'Database Design' unit created with associated problem answer.");
        addStudentToProject(project4d, student1);
        addStudentToProject(project4d, student2);

        ProblemAnswer pa5a_project = createProblemAnswer("Why is process management important in operating systems?", "Process management ensures efficient execution of processes, maintains system stability, and allows for multitasking and resource sharing.");
        addProjectToProblemAnswer(pa5a_project, project5a);
        System.out.println("Project for 'Processes' unit created with associated problem answer.");
        addStudentToProject(project5a, student3);
        addStudentToProject(project5a, student4);

        ProblemAnswer pa5b_project = createProblemAnswer("How does memory management enhance system performance?", "Memory management techniques like paging, segmentation, and virtual memory optimize resource allocation and improve system efficiency.");

        addProjectToProblemAnswer(pa5b_project, project5b);
        System.out.println("Project for 'Memory Management' unit created with associated problem answer.");
        addStudentToProject(project5b, student3);
        addStudentToProject(project5b, student4);

        ProblemAnswer pa5c_project = createProblemAnswer("What role do file systems play in operating systems?", "File systems organize and manage data storage, providing a structured way to store, retrieve, and manage files efficiently.");

        addProjectToProblemAnswer(pa5c_project, project5c);
        System.out.println("Project for 'File Systems' unit created with associated problem answer.");
        addStudentToProject(project5c, student3);
        addStudentToProject(project5c, student4);

        ProblemAnswer pa5d_project = createProblemAnswer("Why are CPU scheduling algorithms essential?", "CPU scheduling algorithms optimize process execution, improve system responsiveness, and ensure efficient utilization of CPU resources.");
        addProjectToProblemAnswer(pa5d_project, project5d);
        System.out.println("Project for 'Scheduling' unit created with associated problem answer.");
        addStudentToProject(project5d, student3);
        addStudentToProject(project5d, student4);

        ProblemAnswer pa6a_project = createProblemAnswer("Why is the OSI model important in networking?", "The OSI model standardizes network functions, enabling interoperability between different systems and technologies.");
        addProjectToProblemAnswer(pa6a_project, project6a);
        System.out.println("Project for 'OSI Model' unit created with associated problem answer.");
        addStudentToProject(project6a, student3);
        addStudentToProject(project6a, student4);

        ProblemAnswer pa6b_project = createProblemAnswer("How does the TCP/IP model facilitate internet communication?", "The TCP/IP model provides a robust and scalable framework for data transmission, ensuring reliable communication between networked devices.");
        addProjectToProblemAnswer(pa6b_project, project6b);
        System.out.println("Project for 'TCP/IP' unit created with associated problem answer.");
        addStudentToProject(project6b, student3);
        addStudentToProject(project6b, student4);

        ProblemAnswer pa6c_project = createProblemAnswer("What is the role of network protocols in data exchange?", "Network protocols govern the rules and conventions for communication between devices, ensuring secure and efficient data exchange.");
        addProjectToProblemAnswer(pa6c_project, project6c);
        System.out.println("Project for 'Network Protocols' unit created with associated problem answer.");
        addStudentToProject(project6c, student3);
        addStudentToProject(project6c, student4);

        ProblemAnswer pa6d_project = createProblemAnswer("Why is routing essential in networking?", "Routing determines the optimal paths for data packets, ensuring efficient and reliable data delivery across complex networks.");
        addProjectToProblemAnswer(pa6d_project, project6d);
        System.out.println("Project for 'Routing' unit created with associated problem answer.");
        addStudentToProject(project6d, student3);
        addStudentToProject(project6d, student4);

        ProblemAnswer pa6e_project = createProblemAnswer("What is the significance of switching in network design?", "Switching efficiently forwards data packets within a network, enhancing communication speed and reducing latency.");
        addProjectToProblemAnswer(pa6e_project, project6e);
        System.out.println("Project for 'Switching' unit created with associated problem answer.");
        addStudentToProject(project6e, student3);
        addStudentToProject(project6e, student4);

        ProblemAnswer pa7a_project = createProblemAnswer("Why is the Software Development Life Cycle (SDLC) important in software development?", "The SDLC provides a structured approach to planning, creating, testing, and deploying software, ensuring quality and efficiency throughout the development process.");
        addProjectToProblemAnswer(pa7a_project, project7a);
        System.out.println("Project for 'Software Development Life Cycle' unit created with associated problem answer.");
        addStudentToProject(project7a, student3);
        addStudentToProject(project7a, student4);

        ProblemAnswer pa7b_project = createProblemAnswer("What are the key benefits of using Agile methodology?", "Agile methodology enhances flexibility, customer feedback, and iterative progress, allowing for adaptive and efficient software development.");
        addProjectToProblemAnswer(pa7b_project, project7b);
        System.out.println("Project for 'Agile' unit created with associated problem answer.");
        addStudentToProject(project7b, student3);
        addStudentToProject(project7b, student4);

        ProblemAnswer pa7c_project = createProblemAnswer("How does the Waterfall model structure software development?", "The Waterfall model follows a linear and sequential approach, ensuring each phase of development is completed before moving on to the next, promoting thorough documentation and planning.");
        addProjectToProblemAnswer(pa7c_project, project7c);
        System.out.println("Project for 'Waterfall' unit created with associated problem answer.");
        addStudentToProject(project7c, student3);
        addStudentToProject(project7c, student4);

        ProblemAnswer pa7d_project = createProblemAnswer("What are the essential project management techniques for software development?", "Effective project management involves planning, scheduling, resource allocation, risk management, and quality assurance, ensuring successful project completion.");
        addProjectToProblemAnswer(pa7d_project, project7d);
        System.out.println("Project for 'Project Management' unit created with associated problem answer.");
        addStudentToProject(project7d, student3);
        addStudentToProject(project7d, student4);

        ProblemAnswer pa8a_project = createProblemAnswer("What is the significance of HTML in web development?", "HTML is the foundational language for creating web pages, providing the structure and layout for web content.");
        addProjectToProblemAnswer(pa8a_project, project8a);
        System.out.println("Project for 'HTML' unit created with associated problem answer.");
        addStudentToProject(project8a, student3);
        addStudentToProject(project8a, student4);

        ProblemAnswer pa8b_project = createProblemAnswer("How does CSS enhance web page design?", "CSS enhances web page design by allowing developers to style and layout HTML content, improving the visual appeal and user experience.");
        addProjectToProblemAnswer(pa8b_project, project8b);
        System.out.println("Project for 'CSS' unit created with associated problem answer.");
        addStudentToProject(project8b, student3);
        addStudentToProject(project8b, student4);

        ProblemAnswer pa8c_project = createProblemAnswer("What role does JavaScript play in web development?", "JavaScript adds interactivity and dynamic behavior to web pages, allowing developers to create engaging and responsive user experiences.");
        addProjectToProblemAnswer(pa8c_project, project8c);
        System.out.println("Project for 'JavaScript' unit created with associated problem answer.");
        addStudentToProject(project8c, student3);
        addStudentToProject(project8c, student4);

        ProblemAnswer pa8d_project = createProblemAnswer("Why is React popular for building user interfaces?", "React's component-based architecture and efficient rendering make it ideal for building complex, interactive user interfaces in a scalable and maintainable way.");
        addProjectToProblemAnswer(pa8d_project, project8d);
        System.out.println("Project for 'React' unit created with associated problem answer.");
        addStudentToProject(project8d, student3);
        addStudentToProject(project8d, student4);

        ProblemAnswer pa8e_project = createProblemAnswer("What is the importance of backend integration in web development?", "Backend integration allows front-end applications to interact with servers and databases, enabling dynamic data fetching, user authentication, and seamless full-stack functionality.");
        addProjectToProblemAnswer(pa8e_project, project8e);
        System.out.println("Project for 'Backend Integration' unit created with associated problem answer.");
        addStudentToProject(project8e, student3);
        addStudentToProject(project8e, student4);

        ProblemAnswer pa9a_project = createProblemAnswer("What are the applications of machine learning?", "Machine learning is used in various fields such as healthcare, finance, and marketing to make predictions, automate processes, and gain insights from data.");
        addProjectToProblemAnswer(pa9a_project, project9a);
        System.out.println("Project for 'Machine Learning' unit created with associated problem answer.");
        addStudentToProject(project9a, student5);
        addStudentToProject(project9a, student6);

        ProblemAnswer pa9b_project = createProblemAnswer("How do neural networks mimic the human brain?", "Neural networks use interconnected layers of nodes (neurons) to process information, similar to the way neurons in the human brain work, enabling them to learn and make decisions.");
        addProjectToProblemAnswer(pa9b_project, project9b);
        System.out.println("Project for 'Neural Networks' unit created with associated problem answer.");
        addStudentToProject(project9b, student5);
        addStudentToProject(project9b, student6);

        ProblemAnswer pa9c_project = createProblemAnswer("What is the significance of natural language processing (NLP)?", "NLP enables computers to understand, interpret, and generate human language, facilitating applications such as chatbots, language translation, and sentiment analysis.");
        addProjectToProblemAnswer(pa9c_project, project9c);
        System.out.println("Project for 'Natural Language Processing' unit created with associated problem answer.");
        addStudentToProject(project9c, student5);
        addStudentToProject(project9c, student6);

        ProblemAnswer pa10a_project = createProblemAnswer("Why is threat analysis important in cybersecurity?", "Threat analysis helps identify potential security threats and vulnerabilities, allowing organizations to implement strategies to mitigate these risks and protect their systems.");
        addProjectToProblemAnswer(pa10a_project, project10a);
        System.out.println("Project for 'Threat Analysis' unit created with associated problem answer.");
        addStudentToProject(project10a, student5);
        addStudentToProject(project10a, student6);

        ProblemAnswer pa10b_project = createProblemAnswer("How does encryption protect sensitive data?", "Encryption converts information into a secure format, preventing unauthorized access and ensuring the confidentiality and integrity of data.");
        addProjectToProblemAnswer(pa10b_project, project10b);
        System.out.println("Project for 'Encryption' unit created with associated problem answer.");
        addStudentToProject(project10b, student5);
        addStudentToProject(project10b, student6);

        ProblemAnswer pa10c_project = createProblemAnswer("What measures are used to protect data during transmission across networks?", "Measures such as firewalls, intrusion detection systems, and encryption protocols safeguard networks and ensure secure data transmission.");
        addProjectToProblemAnswer(pa10c_project, project10c);
        System.out.println("Project for 'Network Security' unit created with associated problem answer.");
        addStudentToProject(project10c, student5);
        addStudentToProject(project10c, student6);

        ProblemAnswer pa10d_project = createProblemAnswer("What are the best practices for secure coding?", "Secure coding practices involve writing code that is free of vulnerabilities, using techniques such as input validation, error handling, and regular security testing.");
        addProjectToProblemAnswer(pa10d_project, project10d);
        System.out.println("Project for 'Secure Coding' unit created with associated problem answer.");
        addStudentToProject(project10d, student5);
        addStudentToProject(project10d, student6);

        ProblemAnswer pa11a_project = createProblemAnswer("What is the significance of limits in calculus?", "Limits are fundamental to calculus, serving as the foundation for defining continuity, derivatives, and integrals.");
        addProjectToProblemAnswer(pa11a_project, project11a);
        System.out.println("Project for 'Limits' unit created with associated problem answer.");
        addStudentToProject(project11a, student5);
        addStudentToProject(project11a, student6);

        ProblemAnswer pa11b_project = createProblemAnswer("How do derivatives help solve real-world problems?", "Derivatives measure how a function changes as its input changes, enabling the analysis and optimization of various physical and economic systems.");
        addProjectToProblemAnswer(pa11b_project, project11b);
        System.out.println("Project for 'Derivatives' unit created with associated problem answer.");
        addStudentToProject(project11b, student5);
        addStudentToProject(project11b, student6);

        ProblemAnswer pa11c_project = createProblemAnswer("What are the applications of integrals in various fields?", "Integrals are used to calculate areas, volumes, and the accumulation of quantities, making them essential in fields like physics, engineering, and economics.");
        addProjectToProblemAnswer(pa11c_project, project11c);
        System.out.println("Project for 'Integrals' unit created with associated problem answer.");
        addStudentToProject(project11c, student5);
        addStudentToProject(project11c, student6);

        ProblemAnswer pa11d_project = createProblemAnswer("How is calculus applied to model and solve real-world problems?", "Calculus is used to model and analyze dynamic systems, optimize processes, and solve complex problems in science, engineering, and economics.");
        addProjectToProblemAnswer(pa11d_project, project11d);
        System.out.println("Project for 'Applications of Calculus' unit created with associated problem answer.");
        addStudentToProject(project11d, student5);
        addStudentToProject(project11d, student6);

        ProblemAnswer pa12a_project = createProblemAnswer("What are the applications of vectors in various fields?", "Vectors are used in physics, engineering, and computer graphics to represent quantities that have both magnitude and direction.");
        addProjectToProblemAnswer(pa12a_project, project12a);
        System.out.println("Project for 'Vectors' unit created with associated problem answer.");
        addStudentToProject(project12a, student5);
        addStudentToProject(project12a, student6);

        ProblemAnswer pa12b_project = createProblemAnswer("How do matrices help solve linear equations?", "Matrices provide a structured way to represent and solve systems of linear equations, enabling efficient computation and transformations.");
        addProjectToProblemAnswer(pa12b_project, project12b);
        System.out.println("Project for 'Matrices' unit created with associated problem answer.");
        addStudentToProject(project12b, student5);
        addStudentToProject(project12b, student6);

        ProblemAnswer pa12c_project = createProblemAnswer("What role do determinants play in solving linear systems?", "Determinants help determine the solvability of a system of linear equations and are used to find the inverse of a matrix.");
        addProjectToProblemAnswer(pa12c_project, project12c);
        System.out.println("Project for 'Determinants' unit created with associated problem answer.");
        addStudentToProject(project12c, student5);
        addStudentToProject(project12c, student6);

        ProblemAnswer pa12d_project = createProblemAnswer("What is the significance of eigenvalues in mathematical problems?", "Eigenvalues provide insights into the properties of linear transformations and are used in various applications, including stability analysis and vibration analysis.");
        addProjectToProblemAnswer(pa12d_project, project12d);
        System.out.println("Project for 'Eigenvalues' unit created with associated problem answer.");
        addStudentToProject(project12d, student5);
        addStudentToProject(project12d, student6);

        ProblemAnswer pa12e_project = createProblemAnswer("How do eigenvectors relate to eigenvalues?", "Eigenvectors are vectors that remain in the same direction under a linear transformation, corresponding to their eigenvalues, and are used in matrix diagonalization and solving systems of linear equations.");
        addProjectToProblemAnswer(pa12e_project, project12e);
        System.out.println("Project for 'Eigenvectors' unit created with associated problem answer.");
        addStudentToProject(project12e, student5);
        addStudentToProject(project12e, student6);

        ProblemAnswer pa13a_project = createProblemAnswer("Why are sequences and series important in mathematics?", "Sequences and series are fundamental in analyzing the behavior of mathematical functions and in solving problems in calculus and other areas of mathematics.");
        addProjectToProblemAnswer(pa13a_project, project13a);
        System.out.println("Project for 'Sequences and Series' unit created with associated problem answer.");
        addStudentToProject(project13a, student7);
        addStudentToProject(project13a, student8);

        ProblemAnswer pa13b_project = createProblemAnswer("What are the applications of advanced integration techniques?", "Advanced integration techniques allow for the evaluation of complex integrals, which are essential in solving real-world problems in physics, engineering, and economics.");
        addProjectToProblemAnswer(pa13b_project, project13b);
        System.out.println("Project for 'Techniques of Integration' unit created with associated problem answer.");
        addStudentToProject(project13b, student7);
        addStudentToProject(project13b, student8);

        ProblemAnswer pa13c_project = createProblemAnswer("How do multivariable functions apply to various fields?", "Multivariable functions are used to model and analyze systems with multiple variables, such as in physics, engineering, and economics.");
        addProjectToProblemAnswer(pa13c_project, project13c);
        System.out.println("Project for 'Multivariable Functions' unit created with associated problem answer.");
        addStudentToProject(project13c, student7);
        addStudentToProject(project13c, student8);

        ProblemAnswer pa13d_project = createProblemAnswer("What is the importance of vector calculus in analyzing vector fields?", "Vector calculus provides tools to analyze and solve problems involving vector fields, such as fluid dynamics, electromagnetism, and other applications in physics and engineering.");
        addProjectToProblemAnswer(pa13d_project, project13d);
        System.out.println("Project for 'Vector Calculus' unit created with associated problem answer.");
        addStudentToProject(project13d, student7);
        addStudentToProject(project13d, student8);

        ProblemAnswer pa14a_project = createProblemAnswer("Why is logic important in problem-solving?", "Logic provides a foundation for forming sound arguments and reasoning, enabling effective problem-solving and decision-making.");
        addProjectToProblemAnswer(pa14a_project, project14a);
        System.out.println("Project for 'Logic' unit created with associated problem answer.");
        addStudentToProject(project14a, student7);
        addStudentToProject(project14a, student8);

        ProblemAnswer pa14b_project = createProblemAnswer("What are the applications of set theory in mathematics?", "Set theory provides a framework for understanding collections of objects, and is fundamental in areas such as probability, statistics, and algebra.");
        addProjectToProblemAnswer(pa14b_project, project14b);
        System.out.println("Project for 'Set Theory' unit created with associated problem answer.");
        addStudentToProject(project14b, student7);
        addStudentToProject(project14b, student8);

        ProblemAnswer pa14c_project = createProblemAnswer("Why is graph theory significant in modeling relationships?", "Graph theory allows for the modeling of pairwise relations between objects, facilitating the analysis of networks, paths, and connectivity in various fields.");
        addProjectToProblemAnswer(pa14c_project, project14c);
        System.out.println("Project for 'Graph Theory' unit created with associated problem answer.");
        addStudentToProject(project14c, student7);
        addStudentToProject(project14c, student8);

        ProblemAnswer pa14d_project = createProblemAnswer("How does combinatorics aid in solving counting problems?", "Combinatorics provides techniques for counting, arrangement, and combination of objects, essential in fields such as computer science, cryptography, and optimization.");
        addProjectToProblemAnswer(pa14d_project, project14d);
        System.out.println("Project for 'Combinatorics' unit created with associated problem answer.");
        addStudentToProject(project14d, student7);
        addStudentToProject(project14d, student8);

        ProblemAnswer pa15a_project = createProblemAnswer("How do Newton's laws of motion explain the behavior of objects?", "Newton's laws describe the relationship between forces and the motion of objects, providing a foundation for understanding mechanics and solving problems in physics.");
        addProjectToProblemAnswer(pa15a_project, project15a);
        System.out.println("Project for 'Newton's Laws' unit created with associated problem answer.");
        addStudentToProject(project15a, student7);
        addStudentToProject(project15a, student8);

        ProblemAnswer pa15b_project = createProblemAnswer("What are the key principles of energy and work in physics?", "The principles of energy, including kinetic and potential energy, and the conservation of energy, are fundamental to understanding work, power, and efficiency in physical systems.");
        addProjectToProblemAnswer(pa15b_project, project15b);
        System.out.println("Project for 'Energy Principles' unit created with associated problem answer.");
        addStudentToProject(project15b, student7);
        addStudentToProject(project15b, student8);

        ProblemAnswer pa15c_project = createProblemAnswer("How are concepts of motion analyzed in physics?", "Concepts of motion, including linear, projectile, and circular motion, are analyzed using velocity, acceleration, and the equations of motion to understand and predict the behavior of moving objects.");
        addProjectToProblemAnswer(pa15c_project, project15c);
        System.out.println("Project for 'Motion' unit created with associated problem answer.");
        addStudentToProject(project15c, student7);
        addStudentToProject(project15c, student8);

        ProblemAnswer pa16a_project = createProblemAnswer("Why is understanding atomic structure important in chemistry?", "Understanding atomic structure is fundamental to chemistry as it defines the properties of elements and their interactions, laying the groundwork for studying chemical behavior.");
        addProjectToProblemAnswer(pa16a_project, project16a);
        System.out.println("Project for 'Atomic Structure' unit created with associated problem answer.");
        addStudentToProject(project16a, student7);
        addStudentToProject(project16a, student8);

        ProblemAnswer pa16b_project = createProblemAnswer("How do chemical bonds influence the properties of substances?", "Chemical bonds determine the structure and stability of molecules and compounds, influencing their physical and chemical properties.");
        addProjectToProblemAnswer(pa16b_project, project16b);
        System.out.println("Project for 'Chemical Bonding' unit created with associated problem answer.");
        addStudentToProject(project16b, student7);
        addStudentToProject(project16b, student8);

        ProblemAnswer pa16c_project = createProblemAnswer("What factors influence chemical reactions?", "Chemical reactions are influenced by factors such as temperature, concentration, pressure, catalysts, and the nature of the reactants, affecting reaction rates and equilibrium.");
        addProjectToProblemAnswer(pa16c_project, project16c);
        System.out.println("Project for 'Reactions' unit created with associated problem answer.");
        addStudentToProject(project16c, student7);
        addStudentToProject(project16c, student8);

        ProblemAnswer pa17a_project = createProblemAnswer("Why is understanding cell structure important in biology?", "Understanding cell structure is fundamental to biology as it provides insights into the function and organization of all living organisms.");
        addProjectToProblemAnswer(pa17a_project, project17a);
        System.out.println("Project for 'Cell Structure' unit created with associated problem answer.");
        addStudentToProject(project17a, student9);
        addStudentToProject(project17a, student10);

        ProblemAnswer pa17b_project = createProblemAnswer("What is the significance of genetics in understanding heredity?", "Genetics helps explain how traits are passed from one generation to the next, providing a foundation for studying biological variation and inheritance.");
        addProjectToProblemAnswer(pa17b_project, project17b);
        System.out.println("Project for 'Genetics' unit created with associated problem answer.");
        addStudentToProject(project17b, student9);
        addStudentToProject(project17b, student10);

        ProblemAnswer pa17c_project = createProblemAnswer("How does the theory of evolution explain the diversity of life?", "The theory of evolution explains the diversity of life through the processes of natural selection and genetic variation, providing evidence for the common ancestry of all species.");
        addProjectToProblemAnswer(pa17c_project, project17c);
        System.out.println("Project for 'Evolution' unit created with associated problem answer.");
        addStudentToProject(project17c, student9);
        addStudentToProject(project17c, student10);

        ProblemAnswer pa17d_project = createProblemAnswer("What is the role of ecology in understanding environmental interactions?", "Ecology studies the interactions between organisms and their environment, providing insights into ecosystem dynamics, biodiversity, and the impact of human activities on the natural world.");
        addProjectToProblemAnswer(pa17d_project, project17d);
        System.out.println("Project for 'Ecology' unit created with associated problem answer.");
        addStudentToProject(project17d, student9);
        addStudentToProject(project17d, student10);

        ProblemAnswer pa18a_project = createProblemAnswer("What are the diverse applications of different engineering disciplines?", "Engineering disciplines such as civil, mechanical, electrical, and chemical engineering have diverse applications, ranging from infrastructure development to technological innovations in various industries.");
        addProjectToProblemAnswer(pa18a_project, project18a);
        System.out.println("Project for 'Engineering Disciplines' unit created with associated problem answer.");
        addStudentToProject(project18a, student9);
        addStudentToProject(project18a, student10);

        ProblemAnswer pa18b_project = createProblemAnswer("Why are problem-solving techniques crucial in engineering?", "Problem-solving techniques are crucial in engineering as they enable engineers to identify and address challenges efficiently, leading to innovative solutions and improved processes.");
        addProjectToProblemAnswer(pa18b_project, project18b);
        System.out.println("Project for 'Problem-Solving' unit created with associated problem answer.");
        addStudentToProject(project18b, student9);
        addStudentToProject(project18b, student10);

        ProblemAnswer pa18c_project = createProblemAnswer("How does the engineering design process facilitate problem-solving?", "The engineering design process provides a systematic approach to problem-solving, guiding engineers through stages such as defining requirements, brainstorming, prototyping, testing, and iteration to develop effective solutions.");
        addProjectToProblemAnswer(pa18c_project, project18c);
        System.out.println("Project for 'Design Process' unit created with associated problem answer.");
        addStudentToProject(project18c, student9);
        addStudentToProject(project18c, student10);

        ProblemAnswer pa19a_project = createProblemAnswer("What are the fundamental principles of circuit analysis?", "Circuit analysis involves principles such as Ohm's law, Kirchhoff's laws, and various techniques for analyzing DC and AC circuits, essential for understanding voltage, current, and resistance in electrical systems.");
        addProjectToProblemAnswer(pa19a_project, project19a);
        System.out.println("Project for 'Circuit Analysis' unit created with associated problem answer.");
        addStudentToProject(project19a, student9);
        addStudentToProject(project19a, student10);

        ProblemAnswer pa19b_project = createProblemAnswer("How does signal processing enhance communication systems?", "Signal processing involves the analysis and manipulation of signals using techniques like Fourier transforms and filtering, which are crucial for improving communication systems and digital signal processing (DSP).");
        addProjectToProblemAnswer(pa19b_project, project19b);
        System.out.println("Project for 'Signal Processing' unit created with associated problem answer.");
        addStudentToProject(project19b, student9);
        addStudentToProject(project19b, student10);

        ProblemAnswer pa19c_project = createProblemAnswer("What is the importance of systems theory in electrical engineering?", "Systems theory helps in understanding and modeling the behavior of complex systems through concepts such as feedback and control systems, which are essential for analyzing and designing efficient electrical systems.");
        addProjectToProblemAnswer(pa19c_project, project19c);
        System.out.println("Project for 'Systems Theory' unit created with associated problem answer.");
        addStudentToProject(project19c, student9);
        addStudentToProject(project19c, student10);

        ProblemAnswer pa20a_project = createProblemAnswer("What is the importance of analyzing force systems?", "Analyzing force systems is crucial for understanding the equilibrium and stability of structures, ensuring safety and reliability in engineering applications.");
        addProjectToProblemAnswer(pa20a_project, project20a);
        System.out.println("Project for 'Statics' unit created with associated problem answer.");
        addStudentToProject(project20a, student9);
        addStudentToProject(project20a, student10);

        ProblemAnswer pa20b_project = createProblemAnswer("How do Newton's laws of motion apply to dynamics?", "Newton's laws of motion provide the foundation for analyzing the motion of particles and rigid bodies, allowing engineers to predict and optimize their behavior.");
        addProjectToProblemAnswer(pa20b_project, project20b);
        System.out.println("Project for 'Dynamics' unit created with associated problem answer.");
        addStudentToProject(project20b, student9);
        addStudentToProject(project20b, student10);

        ProblemAnswer pa20c_project = createProblemAnswer("What is the significance of thermodynamics in engineering?", "Thermodynamics principles are essential for understanding energy transfer, heat, and the behavior of gases and liquids, which are crucial for solving engineering problems involving energy and work.");
        addProjectToProblemAnswer(pa20c_project, project20c);
        System.out.println("Project for 'Thermodynamics' unit created with associated problem answer.");
        addStudentToProject(project20c, student9);
        addStudentToProject(project20c, student10);

        ProblemAnswer pa20d_project = createProblemAnswer("Why is material selection important in engineering applications?", "Material selection determines the performance, durability, and cost-effectiveness of engineering designs, ensuring that materials meet specific requirements and application needs.");
        addProjectToProblemAnswer(pa20d_project, project20d);
        System.out.println("Project for 'Material Science' unit created with associated problem answer.");
        addStudentToProject(project20d, student9);
        addStudentToProject(project20d, student10);
        problemAnswerRepo.saveAllAndFlush(Arrays.asList(pa1a_project, pa1b_project, pa1c_project, pa1d_project, pa1e_project, pa1f_project, pa2a_project, pa2b_project, pa2c_project, pa2d_project, pa2e_project, pa2f_project, pa3a_project, pa3b_project, pa3c_project, pa3d_project, pa4a_project, pa4b_project, pa4c_project, pa4d_project, pa5a_project, pa5b_project, pa5c_project, pa5d_project, pa6a_project, pa6b_project, pa6c_project, pa6d_project, pa6e_project, pa7a_project, pa7b_project, pa7c_project, pa7d_project, pa8a_project, pa8b_project, pa8c_project, pa8d_project, pa8e_project, pa9a_project, pa9b_project, pa9c_project, pa10a_project, pa10b_project, pa10c_project, pa10d_project, pa11a_project, pa11b_project, pa11c_project, pa11d_project, pa12a_project, pa12b_project, pa12c_project, pa12d_project, pa12e_project, pa13a_project, pa13b_project, pa13c_project, pa13d_project, pa14a_project, pa14b_project, pa14c_project, pa14d_project, pa15a_project, pa15b_project, pa15c_project, pa16a_project, pa16b_project, pa16c_project, pa17a_project, pa17b_project, pa17c_project, pa17d_project, pa18a_project, pa18b_project, pa18c_project, pa19a_project, pa19b_project, pa19c_project, pa20a_project, pa20b_project, pa20c_project, pa20d_project));

        // Creating StudentAnswer instances for student1
        StudentAnswer sa1a_project_student1 = createStudentAnswer(student1, pa1a_project, "Variables are essential for storing and manipulating data, allowing programmers to create dynamic and flexible programs.");
        addStudentAnswerToProblemAnswer(pa1a_project, sa1a_project_student1);

        StudentAnswer sa1b_project_student1 = createStudentAnswer(student1, pa1b_project, "Different data types allow for the representation and manipulation of various forms of data, ensuring the correct handling and processing in programs.");
        addStudentAnswerToProblemAnswer(pa1b_project, sa1b_project_student1);

        StudentAnswer sa1c_project_student1 = createStudentAnswer(student1, pa1c_project, "Control structures like loops and conditionals enable the flow control of a program, allowing for repeated actions and decision-making based on conditions.");
        addStudentAnswerToProblemAnswer(pa1c_project, sa1c_project_student1);

        StudentAnswer sa1d_project_student1 = createStudentAnswer(student1, pa1d_project, "Functions allow for code reuse and modularity, making programs more organized, readable, and maintainable.");
        addStudentAnswerToProblemAnswer(pa1d_project, sa1d_project_student1);

        StudentAnswer sa1e_project_student1 = createStudentAnswer(student1, pa1e_project, "Modules allow for the modularization of code, making it more manageable and reusable, and enable the use of built-in and custom functionalities.");
        addStudentAnswerToProblemAnswer(pa1e_project, sa1e_project_student1);

        StudentAnswer sa1f_project_student1 = createStudentAnswer(student1, pa1f_project, "Libraries provide pre-written code that extends the functionality of programs, allowing developers to perform complex tasks efficiently.");
        addStudentAnswerToProblemAnswer(pa1f_project, sa1f_project_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa1a_project_student2 = createStudentAnswer(student2, pa1a_project, "Variables are essential for storing and manipulating data, allowing programmers to create dynamic and flexible programs.");
        addStudentAnswerToProblemAnswer(pa1a_project, sa1a_project_student2);

        StudentAnswer sa1b_project_student2 = createStudentAnswer(student2, pa1b_project, "Different data types allow for the representation and manipulation of various forms of data, ensuring the correct handling and processing in programs.");
        addStudentAnswerToProblemAnswer(pa1b_project, sa1b_project_student2);

        StudentAnswer sa1c_project_student2 = createStudentAnswer(student2, pa1c_project, "Control structures like loops and conditionals enable the flow control of a program, allowing for repeated actions and decision-making based on conditions.");
        addStudentAnswerToProblemAnswer(pa1c_project, sa1c_project_student2);

        StudentAnswer sa1d_project_student2 = createStudentAnswer(student2, pa1d_project, "Functions allow for code reuse and modularity, making programs more organized, readable, and maintainable.");
        addStudentAnswerToProblemAnswer(pa1d_project, sa1d_project_student2);

        StudentAnswer sa1e_project_student2 = createStudentAnswer(student2, pa1e_project, "Modules allow for the modularization of code, making it more manageable and reusable, and enable the use of built-in and custom functionalities.");
        addStudentAnswerToProblemAnswer(pa1e_project, sa1e_project_student2);

        StudentAnswer sa1f_project_student2 = createStudentAnswer(student2, pa1f_project, "Libraries provide pre-written code that extends the functionality of programs, allowing developers to perform complex tasks efficiently.");
        addStudentAnswerToProblemAnswer(pa1f_project, sa1f_project_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all project-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa2a_project_student1 = createStudentAnswer(student1, pa2a_project, "Arrays provide a way to store multiple elements of the same type in a contiguous block of memory, allowing for efficient indexing and traversal.");
        addStudentAnswerToProblemAnswer(pa2a_project, sa2a_project_student1);

        StudentAnswer sa2b_project_student1 = createStudentAnswer(student1, pa2b_project, "Linked lists allow for efficient insertions and deletions at any position in the list, providing more flexibility than arrays.");
        addStudentAnswerToProblemAnswer(pa2b_project, sa2b_project_student1);

        StudentAnswer sa2c_project_student1 = createStudentAnswer(student1, pa2c_project, "Stacks are commonly used for function call management, expression evaluation, and depth-first search algorithms.");
        addStudentAnswerToProblemAnswer(pa2c_project, sa2c_project_student1);

        StudentAnswer sa2d_project_student1 = createStudentAnswer(student1, pa2d_project, "Queues are used in scheduling algorithms, buffering data streams, and breadth-first search algorithms.");
        addStudentAnswerToProblemAnswer(pa2d_project, sa2d_project_student1);

        StudentAnswer sa2e_project_student1 = createStudentAnswer(student1, pa2e_project, "Trees provide a hierarchical structure for organizing data, enabling efficient search, insertion, and deletion operations.");
        addStudentAnswerToProblemAnswer(pa2e_project, sa2e_project_student1);

        StudentAnswer sa2f_project_student1 = createStudentAnswer(student1, pa2f_project, "Graphs are used to represent relationships between entities in various fields such as social networks, transportation systems, and computer networks.");
        addStudentAnswerToProblemAnswer(pa2f_project, sa2f_project_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa2a_project_student2 = createStudentAnswer(student2, pa2a_project, "Arrays provide a way to store multiple elements of the same type in a contiguous block of memory, allowing for efficient indexing and traversal.");
        addStudentAnswerToProblemAnswer(pa2a_project, sa2a_project_student2);

        StudentAnswer sa2b_project_student2 = createStudentAnswer(student2, pa2b_project, "Linked lists allow for efficient insertions and deletions at any position in the list, providing more flexibility than arrays.");
        addStudentAnswerToProblemAnswer(pa2b_project, sa2b_project_student2);

        StudentAnswer sa2c_project_student2 = createStudentAnswer(student2, pa2c_project, "Stacks are commonly used for function call management, expression evaluation, and depth-first search algorithms.");
        addStudentAnswerToProblemAnswer(pa2c_project, sa2c_project_student2);

        StudentAnswer sa2d_project_student2 = createStudentAnswer(student2, pa2d_project, "Queues are used in scheduling algorithms, buffering data streams, and breadth-first search algorithms.");
        addStudentAnswerToProblemAnswer(pa2d_project, sa2d_project_student2);

        StudentAnswer sa2e_project_student2 = createStudentAnswer(student2, pa2e_project, "Trees provide a hierarchical structure for organizing data, enabling efficient search, insertion, and deletion operations.");
        addStudentAnswerToProblemAnswer(pa2e_project, sa2e_project_student2);

        StudentAnswer sa2f_project_student2 = createStudentAnswer(student2, pa2f_project, "Graphs are used to represent relationships between entities in various fields such as social networks, transportation systems, and computer networks.");
        addStudentAnswerToProblemAnswer(pa2f_project, sa2f_project_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all project-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa3a_project_student1 = createStudentAnswer(student1, pa3a_project, "Efficient sorting algorithms improve the performance of applications by reducing the time complexity of sorting operations, leading to faster data processing.");
        addStudentAnswerToProblemAnswer(pa3a_project, sa3a_project_student1);

        StudentAnswer sa3b_project_student1 = createStudentAnswer(student1, pa3b_project, "Binary search significantly reduces the time complexity by dividing the search space in half with each step, making it much faster for large datasets compared to linear search.");
        addStudentAnswerToProblemAnswer(pa3b_project, sa3b_project_student1);

        StudentAnswer sa3c_project_student1 = createStudentAnswer(student1, pa3c_project, "Graph algorithms like DFS and BFS are crucial for analyzing network structures, identifying connectivity, and optimizing routes and connections in various fields, such as social networks and transportation.");
        addStudentAnswerToProblemAnswer(pa3c_project, sa3c_project_student1);

        StudentAnswer sa3d_project_student1 = createStudentAnswer(student1, pa3d_project, "Dynamic programming optimizes the solution of complex problems by breaking them down into simpler subproblems, reducing redundancy and improving efficiency.");
        addStudentAnswerToProblemAnswer(pa3d_project, sa3d_project_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa3a_project_student2 = createStudentAnswer(student2, pa3a_project, "Efficient sorting algorithms improve the performance of applications by reducing the time complexity of sorting operations, leading to faster data processing.");
        addStudentAnswerToProblemAnswer(pa3a_project, sa3a_project_student2);

        StudentAnswer sa3b_project_student2 = createStudentAnswer(student2, pa3b_project, "Binary search significantly reduces the time complexity by dividing the search space in half with each step, making it much faster for large datasets compared to linear search.");
        addStudentAnswerToProblemAnswer(pa3b_project, sa3b_project_student2);

        StudentAnswer sa3c_project_student2 = createStudentAnswer(student2, pa3c_project, "Graph algorithms like DFS and BFS are crucial for analyzing network structures, identifying connectivity, and optimizing routes and connections in various fields, such as social networks and transportation.");
        addStudentAnswerToProblemAnswer(pa3c_project, sa3c_project_student2);

        StudentAnswer sa3d_project_student2 = createStudentAnswer(student2, pa3d_project, "Dynamic programming optimizes the solution of complex problems by breaking them down into simpler subproblems, reducing redundancy and improving efficiency.");
        addStudentAnswerToProblemAnswer(pa3d_project, sa3d_project_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all project-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa4a_project_student1 = createStudentAnswer(student1, pa4a_project, "Relational databases organize data efficiently and establish clear relationships between data points, ensuring data integrity and ease of access.");
        addStudentAnswerToProblemAnswer(pa4a_project, sa4a_project_student1);

        StudentAnswer sa4b_project_student1 = createStudentAnswer(student1, pa4b_project, "SQL allows for efficient querying and manipulation of data, enabling users to create, read, update, and delete records with precision and ease.");
        addStudentAnswerToProblemAnswer(pa4b_project, sa4b_project_student1);

        StudentAnswer sa4c_project_student1 = createStudentAnswer(student1, pa4c_project, "Transactions ensure data integrity and consistency by adhering to ACID properties, allowing for safe and reliable database operations.");
        addStudentAnswerToProblemAnswer(pa4c_project, sa4c_project_student1);

        StudentAnswer sa4d_project_student1 = createStudentAnswer(student1, pa4d_project, "Best practices in database design include normalization, efficient schema creation, and data modeling to ensure optimal performance and data integrity.");
        addStudentAnswerToProblemAnswer(pa4d_project, sa4d_project_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa4a_project_student2 = createStudentAnswer(student2, pa4a_project, "Relational databases organize data efficiently and establish clear relationships between data points, ensuring data integrity and ease of access.");
        addStudentAnswerToProblemAnswer(pa4a_project, sa4a_project_student2);

        StudentAnswer sa4b_project_student2 = createStudentAnswer(student2, pa4b_project, "SQL allows for efficient querying and manipulation of data, enabling users to create, read, update, and delete records with precision and ease.");
        addStudentAnswerToProblemAnswer(pa4b_project, sa4b_project_student2);

        StudentAnswer sa4c_project_student2 = createStudentAnswer(student2, pa4c_project, "Transactions ensure data integrity and consistency by adhering to ACID properties, allowing for safe and reliable database operations.");
        addStudentAnswerToProblemAnswer(pa4c_project, sa4c_project_student2);

        StudentAnswer sa4d_project_student2 = createStudentAnswer(student2, pa4d_project, "Best practices in database design include normalization, efficient schema creation, and data modeling to ensure optimal performance and data integrity.");
        addStudentAnswerToProblemAnswer(pa4d_project, sa4d_project_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all project-related problem answers.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa5a_project_student3 = createStudentAnswer(student3, pa5a_project, "Process management ensures efficient execution of processes, maintains system stability, and allows for multitasking and resource sharing.");
        addStudentAnswerToProblemAnswer(pa5a_project, sa5a_project_student3);

        StudentAnswer sa5b_project_student3 = createStudentAnswer(student3, pa5b_project, "Memory management techniques like paging, segmentation, and virtual memory optimize resource allocation and improve system efficiency.");
        addStudentAnswerToProblemAnswer(pa5b_project, sa5b_project_student3);

        StudentAnswer sa5c_project_student3 = createStudentAnswer(student3, pa5c_project, "File systems organize and manage data storage, providing a structured way to store, retrieve, and manage files efficiently.");
        addStudentAnswerToProblemAnswer(pa5c_project, sa5c_project_student3);

        StudentAnswer sa5d_project_student3 = createStudentAnswer(student3, pa5d_project, "CPU scheduling algorithms optimize process execution, improve system responsiveness, and ensure efficient utilization of CPU resources.");
        addStudentAnswerToProblemAnswer(pa5d_project, sa5d_project_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa5a_project_student4 = createStudentAnswer(student4, pa5a_project, "Process management ensures efficient execution of processes, maintains system stability, and allows for multitasking and resource sharing.");
        addStudentAnswerToProblemAnswer(pa5a_project, sa5a_project_student4);

        StudentAnswer sa5b_project_student4 = createStudentAnswer(student4, pa5b_project, "Memory management techniques like paging, segmentation, and virtual memory optimize resource allocation and improve system efficiency.");
        addStudentAnswerToProblemAnswer(pa5b_project, sa5b_project_student4);

        StudentAnswer sa5c_project_student4 = createStudentAnswer(student4, pa5c_project, "File systems organize and manage data storage, providing a structured way to store, retrieve, and manage files efficiently.");
        addStudentAnswerToProblemAnswer(pa5c_project, sa5c_project_student4);

        StudentAnswer sa5d_project_student4 = createStudentAnswer(student4, pa5d_project, "CPU scheduling algorithms optimize process execution, improve system responsiveness, and ensure efficient utilization of CPU resources.");
        addStudentAnswerToProblemAnswer(pa5d_project, sa5d_project_student4);

// Output for confirmation
        System.out.println("Student answers created and added for student3 and student4 for all project-related problem answers.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa6a_project_student3 = createStudentAnswer(student3, pa6a_project, "The OSI model standardizes network functions, enabling interoperability between different systems and technologies.");
        addStudentAnswerToProblemAnswer(pa6a_project, sa6a_project_student3);

        StudentAnswer sa6b_project_student3 = createStudentAnswer(student3, pa6b_project, "The TCP/IP model provides a robust and scalable framework for data transmission, ensuring reliable communication between networked devices.");
        addStudentAnswerToProblemAnswer(pa6b_project, sa6b_project_student3);

        StudentAnswer sa6c_project_student3 = createStudentAnswer(student3, pa6c_project, "Network protocols govern the rules and conventions for communication between devices, ensuring secure and efficient data exchange.");
        addStudentAnswerToProblemAnswer(pa6c_project, sa6c_project_student3);

        StudentAnswer sa6d_project_student3 = createStudentAnswer(student3, pa6d_project, "Routing determines the optimal paths for data packets, ensuring efficient and reliable data delivery across complex networks.");
        addStudentAnswerToProblemAnswer(pa6d_project, sa6d_project_student3);

        StudentAnswer sa6e_project_student3 = createStudentAnswer(student3, pa6e_project, "Switching efficiently forwards data packets within a network, enhancing communication speed and reducing latency.");
        addStudentAnswerToProblemAnswer(pa6e_project, sa6e_project_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa6a_project_student4 = createStudentAnswer(student4, pa6a_project, "The OSI model standardizes network functions, enabling interoperability between different systems and technologies.");
        addStudentAnswerToProblemAnswer(pa6a_project, sa6a_project_student4);

        StudentAnswer sa6b_project_student4 = createStudentAnswer(student4, pa6b_project, "The TCP/IP model provides a robust and scalable framework for data transmission, ensuring reliable communication between networked devices.");
        addStudentAnswerToProblemAnswer(pa6b_project, sa6b_project_student4);

        StudentAnswer sa6c_project_student4 = createStudentAnswer(student4, pa6c_project, "Network protocols govern the rules and conventions for communication between devices, ensuring secure and efficient data exchange.");
        addStudentAnswerToProblemAnswer(pa6c_project, sa6c_project_student4);

        StudentAnswer sa6d_project_student4 = createStudentAnswer(student4, pa6d_project, "Routing determines the optimal paths for data packets, ensuring efficient and reliable data delivery across complex networks.");
        addStudentAnswerToProblemAnswer(pa6d_project, sa6d_project_student4);

        StudentAnswer sa6e_project_student4 = createStudentAnswer(student4, pa6e_project, "Switching efficiently forwards data packets within a network, enhancing communication speed and reducing latency.");
        addStudentAnswerToProblemAnswer(pa6e_project, sa6e_project_student4);

// Output for confirmation
        System.out.println("Student answers created and added for student3 and student4 for all project-related problem answers.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa7a_project_student3 = createStudentAnswer(student3, pa7a_project, "The SDLC provides a structured approach to planning, creating, testing, and deploying software, ensuring quality and efficiency throughout the development process.");
        addStudentAnswerToProblemAnswer(pa7a_project, sa7a_project_student3);

        StudentAnswer sa7b_project_student3 = createStudentAnswer(student3, pa7b_project, "Agile methodology enhances flexibility, customer feedback, and iterative progress, allowing for adaptive and efficient software development.");
        addStudentAnswerToProblemAnswer(pa7b_project, sa7b_project_student3);

        StudentAnswer sa7c_project_student3 = createStudentAnswer(student3, pa7c_project, "The Waterfall model follows a linear and sequential approach, ensuring each phase of development is completed before moving on to the next, promoting thorough documentation and planning.");
        addStudentAnswerToProblemAnswer(pa7c_project, sa7c_project_student3);

        StudentAnswer sa7d_project_student3 = createStudentAnswer(student3, pa7d_project, "Effective project management involves planning, scheduling, resource allocation, risk management, and quality assurance, ensuring successful project completion.");
        addStudentAnswerToProblemAnswer(pa7d_project, sa7d_project_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa7a_project_student4 = createStudentAnswer(student4, pa7a_project, "The SDLC provides a structured approach to planning, creating, testing, and deploying software, ensuring quality and efficiency throughout the development process.");
        addStudentAnswerToProblemAnswer(pa7a_project, sa7a_project_student4);

        StudentAnswer sa7b_project_student4 = createStudentAnswer(student4, pa7b_project, "Agile methodology enhances flexibility, customer feedback, and iterative progress, allowing for adaptive and efficient software development.");
        addStudentAnswerToProblemAnswer(pa7b_project, sa7b_project_student4);

        StudentAnswer sa7c_project_student4 = createStudentAnswer(student4, pa7c_project, "The Waterfall model follows a linear and sequential approach, ensuring each phase of development is completed before moving on to the next, promoting thorough documentation and planning.");
        addStudentAnswerToProblemAnswer(pa7c_project, sa7c_project_student4);

        StudentAnswer sa7d_project_student4 = createStudentAnswer(student4, pa7d_project, "Effective project management involves planning, scheduling, resource allocation, risk management, and quality assurance, ensuring successful project completion.");
        addStudentAnswerToProblemAnswer(pa7d_project, sa7d_project_student4);

// Output for confirmation
        System.out.println("Student answers created and added for student3 and student4 for all project-related problem answers.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa8a_project_student3 = createStudentAnswer(student3, pa8a_project, "HTML is the foundational language for creating web pages, providing the structure and layout for web content.");
        addStudentAnswerToProblemAnswer(pa8a_project, sa8a_project_student3);

        StudentAnswer sa8b_project_student3 = createStudentAnswer(student3, pa8b_project, "CSS enhances web page design by allowing developers to style and layout HTML content, improving the visual appeal and user experience.");
        addStudentAnswerToProblemAnswer(pa8b_project, sa8b_project_student3);

        StudentAnswer sa8c_project_student3 = createStudentAnswer(student3, pa8c_project, "JavaScript adds interactivity and dynamic behavior to web pages, allowing developers to create engaging and responsive user experiences.");
        addStudentAnswerToProblemAnswer(pa8c_project, sa8c_project_student3);

        StudentAnswer sa8d_project_student3 = createStudentAnswer(student3, pa8d_project, "React's component-based architecture and efficient rendering make it ideal for building complex, interactive user interfaces in a scalable and maintainable way.");
        addStudentAnswerToProblemAnswer(pa8d_project, sa8d_project_student3);

        StudentAnswer sa8e_project_student3 = createStudentAnswer(student3, pa8e_project, "Backend integration allows front-end applications to interact with servers and databases, enabling dynamic data fetching, user authentication, and seamless full-stack functionality.");
        addStudentAnswerToProblemAnswer(pa8e_project, sa8e_project_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa8a_project_student4 = createStudentAnswer(student4, pa8a_project, "HTML is the foundational language for creating web pages, providing the structure and layout for web content.");
        addStudentAnswerToProblemAnswer(pa8a_project, sa8a_project_student4);

        StudentAnswer sa8b_project_student4 = createStudentAnswer(student4, pa8b_project, "CSS enhances web page design by allowing developers to style and layout HTML content, improving the visual appeal and user experience.");
        addStudentAnswerToProblemAnswer(pa8b_project, sa8b_project_student4);

        StudentAnswer sa8c_project_student4 = createStudentAnswer(student4, pa8c_project, "JavaScript adds interactivity and dynamic behavior to web pages, allowing developers to create engaging and responsive user experiences.");
        addStudentAnswerToProblemAnswer(pa8c_project, sa8c_project_student4);

        StudentAnswer sa8d_project_student4 = createStudentAnswer(student4, pa8d_project, "React's component-based architecture and efficient rendering make it ideal for building complex, interactive user interfaces in a scalable and maintainable way.");
        addStudentAnswerToProblemAnswer(pa8d_project, sa8d_project_student4);

        StudentAnswer sa8e_project_student4 = createStudentAnswer(student4, pa8e_project, "Backend integration allows front-end applications to interact with servers and databases, enabling dynamic data fetching, user authentication, and seamless full-stack functionality.");
        addStudentAnswerToProblemAnswer(pa8e_project, sa8e_project_student4);

// Output for confirmation
        System.out.println("Student answers created and added for student3 and student4 for all project-related problem answers.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa9a_project_student5 = createStudentAnswer(student5, pa9a_project, "Machine learning is used in various fields such as healthcare, finance, and marketing to make predictions, automate processes, and gain insights from data.");
        addStudentAnswerToProblemAnswer(pa9a_project, sa9a_project_student5);

        StudentAnswer sa9b_project_student5 = createStudentAnswer(student5, pa9b_project, "Neural networks use interconnected layers of nodes (neurons) to process information, similar to the way neurons in the human brain work, enabling them to learn and make decisions.");
        addStudentAnswerToProblemAnswer(pa9b_project, sa9b_project_student5);

        StudentAnswer sa9c_project_student5 = createStudentAnswer(student5, pa9c_project, "NLP enables computers to understand, interpret, and generate human language, facilitating applications such as chatbots, language translation, and sentiment analysis.");
        addStudentAnswerToProblemAnswer(pa9c_project, sa9c_project_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa9a_project_student6 = createStudentAnswer(student6, pa9a_project, "Machine learning is used in various fields such as healthcare, finance, and marketing to make predictions, automate processes, and gain insights from data.");
        addStudentAnswerToProblemAnswer(pa9a_project, sa9a_project_student6);

        StudentAnswer sa9b_project_student6 = createStudentAnswer(student6, pa9b_project, "Neural networks use interconnected layers of nodes (neurons) to process information, similar to the way neurons in the human brain work, enabling them to learn and make decisions.");
        addStudentAnswerToProblemAnswer(pa9b_project, sa9b_project_student6);

        StudentAnswer sa9c_project_student6 = createStudentAnswer(student6, pa9c_project, "NLP enables computers to understand, interpret, and generate human language, facilitating applications such as chatbots, language translation, and sentiment analysis.");
        addStudentAnswerToProblemAnswer(pa9c_project, sa9c_project_student6);

// Output for confirmation
        System.out.println("Student answers created and added for student5 and student6 for all project-related problem answers.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa10a_project_student5 = createStudentAnswer(student5, pa10a_project, "Threat analysis helps identify potential security threats and vulnerabilities, allowing organizations to implement strategies to mitigate these risks and protect their systems.");
        addStudentAnswerToProblemAnswer(pa10a_project, sa10a_project_student5);

        StudentAnswer sa10b_project_student5 = createStudentAnswer(student5, pa10b_project, "Encryption converts information into a secure format, preventing unauthorized access and ensuring the confidentiality and integrity of data.");
        addStudentAnswerToProblemAnswer(pa10b_project, sa10b_project_student5);

        StudentAnswer sa10c_project_student5 = createStudentAnswer(student5, pa10c_project, "Measures such as firewalls, intrusion detection systems, and encryption protocols safeguard networks and ensure secure data transmission.");
        addStudentAnswerToProblemAnswer(pa10c_project, sa10c_project_student5);

        StudentAnswer sa10d_project_student5 = createStudentAnswer(student5, pa10d_project, "Secure coding practices involve writing code that is free of vulnerabilities, using techniques such as input validation, error handling, and regular security testing.");
        addStudentAnswerToProblemAnswer(pa10d_project, sa10d_project_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa10a_project_student6 = createStudentAnswer(student6, pa10a_project, "Threat analysis helps identify potential security threats and vulnerabilities, allowing organizations to implement strategies to mitigate these risks and protect their systems.");
        addStudentAnswerToProblemAnswer(pa10a_project, sa10a_project_student6);

        StudentAnswer sa10b_project_student6 = createStudentAnswer(student6, pa10b_project, "Encryption converts information into a secure format, preventing unauthorized access and ensuring the confidentiality and integrity of data.");
        addStudentAnswerToProblemAnswer(pa10b_project, sa10b_project_student6);

        StudentAnswer sa10c_project_student6 = createStudentAnswer(student6, pa10c_project, "Measures such as firewalls, intrusion detection systems, and encryption protocols safeguard networks and ensure secure data transmission.");
        addStudentAnswerToProblemAnswer(pa10c_project, sa10c_project_student6);

        StudentAnswer sa10d_project_student6 = createStudentAnswer(student6, pa10d_project, "Secure coding practices involve writing code that is free of vulnerabilities, using techniques such as input validation, error handling, and regular security testing.");
        addStudentAnswerToProblemAnswer(pa10d_project, sa10d_project_student6);

// Output for confirmation
        System.out.println("Student answers created and added for student5 and student6 for all project-related problem answers.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa11a_project_student5 = createStudentAnswer(student5, pa11a_project, "Limits are fundamental to calculus, serving as the foundation for defining continuity, derivatives, and integrals.");
        addStudentAnswerToProblemAnswer(pa11a_project, sa11a_project_student5);

        StudentAnswer sa11b_project_student5 = createStudentAnswer(student5, pa11b_project, "Derivatives measure how a function changes as its input changes, enabling the analysis and optimization of various physical and economic systems.");
        addStudentAnswerToProblemAnswer(pa11b_project, sa11b_project_student5);

        StudentAnswer sa11c_project_student5 = createStudentAnswer(student5, pa11c_project, "Integrals are used to calculate areas, volumes, and the accumulation of quantities, making them essential in fields like physics, engineering, and economics.");
        addStudentAnswerToProblemAnswer(pa11c_project, sa11c_project_student5);

        StudentAnswer sa11d_project_student5 = createStudentAnswer(student5, pa11d_project, "Calculus is used to model and analyze dynamic systems, optimize processes, and solve complex problems in science, engineering, and economics.");
        addStudentAnswerToProblemAnswer(pa11d_project, sa11d_project_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa11a_project_student6 = createStudentAnswer(student6, pa11a_project, "Limits are fundamental to calculus, serving as the foundation for defining continuity, derivatives, and integrals.");
        addStudentAnswerToProblemAnswer(pa11a_project, sa11a_project_student6);

        StudentAnswer sa11b_project_student6 = createStudentAnswer(student6, pa11b_project, "Derivatives measure how a function changes as its input changes, enabling the analysis and optimization of various physical and economic systems.");
        addStudentAnswerToProblemAnswer(pa11b_project, sa11b_project_student6);

        StudentAnswer sa11c_project_student6 = createStudentAnswer(student6, pa11c_project, "Integrals are used to calculate areas, volumes, and the accumulation of quantities, making them essential in fields like physics, engineering, and economics.");
        addStudentAnswerToProblemAnswer(pa11c_project, sa11c_project_student6);

        StudentAnswer sa11d_project_student6 = createStudentAnswer(student6, pa11d_project, "Calculus is used to model and analyze dynamic systems, optimize processes, and solve complex problems in science, engineering, and economics.");
        addStudentAnswerToProblemAnswer(pa11d_project, sa11d_project_student6);

// Output for confirmation
        System.out.println("Student answers created and added for student5 and student6 for all project-related problem answers.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa12a_project_student5 = createStudentAnswer(student5, pa12a_project, "Vectors are used in physics, engineering, and computer graphics to represent quantities that have both magnitude and direction.");
        addStudentAnswerToProblemAnswer(pa12a_project, sa12a_project_student5);

        StudentAnswer sa12b_project_student5 = createStudentAnswer(student5, pa12b_project, "Matrices provide a structured way to represent and solve systems of linear equations, enabling efficient computation and transformations.");
        addStudentAnswerToProblemAnswer(pa12b_project, sa12b_project_student5);

        StudentAnswer sa12c_project_student5 = createStudentAnswer(student5, pa12c_project, "Determinants help determine the solvability of a system of linear equations and are used to find the inverse of a matrix.");
        addStudentAnswerToProblemAnswer(pa12c_project, sa12c_project_student5);

        StudentAnswer sa12d_project_student5 = createStudentAnswer(student5, pa12d_project, "Eigenvalues provide insights into the properties of linear transformations and are used in various applications, including stability analysis and vibration analysis.");
        addStudentAnswerToProblemAnswer(pa12d_project, sa12d_project_student5);

        StudentAnswer sa12e_project_student5 = createStudentAnswer(student5, pa12e_project, "Eigenvectors are vectors that remain in the same direction under a linear transformation, corresponding to their eigenvalues, and are used in matrix diagonalization and solving systems of linear equations.");
        addStudentAnswerToProblemAnswer(pa12e_project, sa12e_project_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa12a_project_student6 = createStudentAnswer(student6, pa12a_project, "Vectors are used in physics, engineering, and computer graphics to represent quantities that have both magnitude and direction.");
        addStudentAnswerToProblemAnswer(pa12a_project, sa12a_project_student6);

        StudentAnswer sa12b_project_student6 = createStudentAnswer(student6, pa12b_project, "Matrices provide a structured way to represent and solve systems of linear equations, enabling efficient computation and transformations.");
        addStudentAnswerToProblemAnswer(pa12b_project, sa12b_project_student6);

        StudentAnswer sa12c_project_student6 = createStudentAnswer(student6, pa12c_project, "Determinants help determine the solvability of a system of linear equations and are used to find the inverse of a matrix.");
        addStudentAnswerToProblemAnswer(pa12c_project, sa12c_project_student6);

        StudentAnswer sa12d_project_student6 = createStudentAnswer(student6, pa12d_project, "Eigenvalues provide insights into the properties of linear transformations and are used in various applications, including stability analysis and vibration analysis.");
        addStudentAnswerToProblemAnswer(pa12d_project, sa12d_project_student6);

        StudentAnswer sa12e_project_student6 = createStudentAnswer(student6, pa12e_project, "Eigenvectors are vectors that remain in the same direction under a linear transformation, corresponding to their eigenvalues, and are used in matrix diagonalization and solving systems of linear equations.");
        addStudentAnswerToProblemAnswer(pa12e_project, sa12e_project_student6);

// Output for confirmation
        System.out.println("Student answers created and added for student5 and student6 for all project-related problem answers.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa13a_project_student7 = createStudentAnswer(student7, pa13a_project, "Sequences and series are fundamental in analyzing the behavior of mathematical functions and in solving problems in calculus and other areas of mathematics.");
        addStudentAnswerToProblemAnswer(pa13a_project, sa13a_project_student7);

        StudentAnswer sa13b_project_student7 = createStudentAnswer(student7, pa13b_project, "Advanced integration techniques allow for the evaluation of complex integrals, which are essential in solving real-world problems in physics, engineering, and economics.");
        addStudentAnswerToProblemAnswer(pa13b_project, sa13b_project_student7);

        StudentAnswer sa13c_project_student7 = createStudentAnswer(student7, pa13c_project, "Multivariable functions are used to model and analyze systems with multiple variables, such as in physics, engineering, and economics.");
        addStudentAnswerToProblemAnswer(pa13c_project, sa13c_project_student7);

        StudentAnswer sa13d_project_student7 = createStudentAnswer(student7, pa13d_project, "Vector calculus provides tools to analyze and solve problems involving vector fields, such as fluid dynamics, electromagnetism, and other applications in physics and engineering.");
        addStudentAnswerToProblemAnswer(pa13d_project, sa13d_project_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa13a_project_student8 = createStudentAnswer(student8, pa13a_project, "Sequences and series are fundamental in analyzing the behavior of mathematical functions and in solving problems in calculus and other areas of mathematics.");
        addStudentAnswerToProblemAnswer(pa13a_project, sa13a_project_student8);

        StudentAnswer sa13b_project_student8 = createStudentAnswer(student8, pa13b_project, "Advanced integration techniques allow for the evaluation of complex integrals, which are essential in solving real-world problems in physics, engineering, and economics.");
        addStudentAnswerToProblemAnswer(pa13b_project, sa13b_project_student8);

        StudentAnswer sa13c_project_student8 = createStudentAnswer(student8, pa13c_project, "Multivariable functions are used to model and analyze systems with multiple variables, such as in physics, engineering, and economics.");
        addStudentAnswerToProblemAnswer(pa13c_project, sa13c_project_student8);

        StudentAnswer sa13d_project_student8 = createStudentAnswer(student8, pa13d_project, "Vector calculus provides tools to analyze and solve problems involving vector fields, such as fluid dynamics, electromagnetism, and other applications in physics and engineering.");
        addStudentAnswerToProblemAnswer(pa13d_project, sa13d_project_student8);
// Creating StudentAnswer instances for student7
        StudentAnswer sa14a_project_student7 = createStudentAnswer(student7, pa14a_project, "Logic provides a foundation for forming sound arguments and reasoning, enabling effective problem-solving and decision-making.");
        addStudentAnswerToProblemAnswer(pa14a_project, sa14a_project_student7);

        StudentAnswer sa14b_project_student7 = createStudentAnswer(student7, pa14b_project, "Set theory provides a framework for understanding collections of objects, and is fundamental in areas such as probability, statistics, and algebra.");
        addStudentAnswerToProblemAnswer(pa14b_project, sa14b_project_student7);

        StudentAnswer sa14c_project_student7 = createStudentAnswer(student7, pa14c_project, "Graph theory allows for the modeling of pairwise relations between objects, facilitating the analysis of networks, paths, and connectivity in various fields.");
        addStudentAnswerToProblemAnswer(pa14c_project, sa14c_project_student7);

        StudentAnswer sa14d_project_student7 = createStudentAnswer(student7, pa14d_project, "Combinatorics provides techniques for counting, arrangement, and combination of objects, essential in fields such as computer science, cryptography, and optimization.");
        addStudentAnswerToProblemAnswer(pa14d_project, sa14d_project_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa14a_project_student8 = createStudentAnswer(student8, pa14a_project, "Logic provides a foundation for forming sound arguments and reasoning, enabling effective problem-solving and decision-making.");
        addStudentAnswerToProblemAnswer(pa14a_project, sa14a_project_student8);

        StudentAnswer sa14b_project_student8 = createStudentAnswer(student8, pa14b_project, "Set theory provides a framework for understanding collections of objects, and is fundamental in areas such as probability, statistics, and algebra.");
        addStudentAnswerToProblemAnswer(pa14b_project, sa14b_project_student8);

        StudentAnswer sa14c_project_student8 = createStudentAnswer(student8, pa14c_project, "Graph theory allows for the modeling of pairwise relations between objects, facilitating the analysis of networks, paths, and connectivity in various fields.");
        addStudentAnswerToProblemAnswer(pa14c_project, sa14c_project_student8);

        StudentAnswer sa14d_project_student8 = createStudentAnswer(student8, pa14d_project, "Combinatorics provides techniques for counting, arrangement, and combination of objects, essential in fields such as computer science, cryptography, and optimization.");
        addStudentAnswerToProblemAnswer(pa14d_project, sa14d_project_student8);

// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all project-related problem answers.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa15a_project_student7 = createStudentAnswer(student7, pa15a_project, "Newton's laws describe the relationship between forces and the motion of objects, providing a foundation for understanding mechanics and solving problems in physics.");
        addStudentAnswerToProblemAnswer(pa15a_project, sa15a_project_student7);

        StudentAnswer sa15b_project_student7 = createStudentAnswer(student7, pa15b_project, "The principles of energy, including kinetic and potential energy, and the conservation of energy, are fundamental to understanding work, power, and efficiency in physical systems.");
        addStudentAnswerToProblemAnswer(pa15b_project, sa15b_project_student7);

        StudentAnswer sa15c_project_student7 = createStudentAnswer(student7, pa15c_project, "Concepts of motion, including linear, projectile, and circular motion, are analyzed using velocity, acceleration, and the equations of motion to understand and predict the behavior of moving objects.");
        addStudentAnswerToProblemAnswer(pa15c_project, sa15c_project_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa15a_project_student8 = createStudentAnswer(student8, pa15a_project, "Newton's laws describe the relationship between forces and the motion of objects, providing a foundation for understanding mechanics and solving problems in physics.");
        addStudentAnswerToProblemAnswer(pa15a_project, sa15a_project_student8);

        StudentAnswer sa15b_project_student8 = createStudentAnswer(student8, pa15b_project, "The principles of energy, including kinetic and potential energy, and the conservation of energy, are fundamental to understanding work, power, and efficiency in physical systems.");
        addStudentAnswerToProblemAnswer(pa15b_project, sa15b_project_student8);

        StudentAnswer sa15c_project_student8 = createStudentAnswer(student8, pa15c_project, "Concepts of motion, including linear, projectile, and circular motion, are analyzed using velocity, acceleration, and the equations of motion to understand and predict the behavior of moving objects.");
        addStudentAnswerToProblemAnswer(pa15c_project, sa15c_project_student8);

// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all project-related problem answers.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa16a_project_student7 = createStudentAnswer(student7, pa16a_project, "Understanding atomic structure is fundamental to chemistry as it defines the properties of elements and their interactions, laying the groundwork for studying chemical behavior.");
        addStudentAnswerToProblemAnswer(pa16a_project, sa16a_project_student7);

        StudentAnswer sa16b_project_student7 = createStudentAnswer(student7, pa16b_project, "Chemical bonds determine the structure and stability of molecules and compounds, influencing their physical and chemical properties.");
        addStudentAnswerToProblemAnswer(pa16b_project, sa16b_project_student7);

        StudentAnswer sa16c_project_student7 = createStudentAnswer(student7, pa16c_project, "Chemical reactions are influenced by factors such as temperature, concentration, pressure, catalysts, and the nature of the reactants, affecting reaction rates and equilibrium.");
        addStudentAnswerToProblemAnswer(pa16c_project, sa16c_project_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa16a_project_student8 = createStudentAnswer(student8, pa16a_project, "Understanding atomic structure is fundamental to chemistry as it defines the properties of elements and their interactions, laying the groundwork for studying chemical behavior.");
        addStudentAnswerToProblemAnswer(pa16a_project, sa16a_project_student8);

        StudentAnswer sa16b_project_student8 = createStudentAnswer(student8, pa16b_project, "Chemical bonds determine the structure and stability of molecules and compounds, influencing their physical and chemical properties.");
        addStudentAnswerToProblemAnswer(pa16b_project, sa16b_project_student8);

        StudentAnswer sa16c_project_student8 = createStudentAnswer(student8, pa16c_project, "Chemical reactions are influenced by factors such as temperature, concentration, pressure, catalysts, and the nature of the reactants, affecting reaction rates and equilibrium.");
        addStudentAnswerToProblemAnswer(pa16c_project, sa16c_project_student8);

// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all project-related problem answers.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa17a_project_student9 = createStudentAnswer(student9, pa17a_project, "Understanding cell structure is fundamental to biology as it provides insights into the function and organization of all living organisms.");
        addStudentAnswerToProblemAnswer(pa17a_project, sa17a_project_student9);

        StudentAnswer sa17b_project_student9 = createStudentAnswer(student9, pa17b_project, "Genetics helps explain how traits are passed from one generation to the next, providing a foundation for studying biological variation and inheritance.");
        addStudentAnswerToProblemAnswer(pa17b_project, sa17b_project_student9);

        StudentAnswer sa17c_project_student9 = createStudentAnswer(student9, pa17c_project, "The theory of evolution explains the diversity of life through the processes of natural selection and genetic variation, providing evidence for the common ancestry of all species.");
        addStudentAnswerToProblemAnswer(pa17c_project, sa17c_project_student9);

        StudentAnswer sa17d_project_student9 = createStudentAnswer(student9, pa17d_project, "Ecology studies the interactions between organisms and their environment, providing insights into ecosystem dynamics, biodiversity, and the impact of human activities on the natural world.");
        addStudentAnswerToProblemAnswer(pa17d_project, sa17d_project_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa17a_project_student10 = createStudentAnswer(student10, pa17a_project, "Understanding cell structure is fundamental to biology as it provides insights into the function and organization of all living organisms.");
        addStudentAnswerToProblemAnswer(pa17a_project, sa17a_project_student10);

        StudentAnswer sa17b_project_student10 = createStudentAnswer(student10, pa17b_project, "Genetics helps explain how traits are passed from one generation to the next, providing a foundation for studying biological variation and inheritance.");
        addStudentAnswerToProblemAnswer(pa17b_project, sa17b_project_student10);

        StudentAnswer sa17c_project_student10 = createStudentAnswer(student10, pa17c_project, "The theory of evolution explains the diversity of life through the processes of natural selection and genetic variation, providing evidence for the common ancestry of all species.");
        addStudentAnswerToProblemAnswer(pa17c_project, sa17c_project_student10);

        StudentAnswer sa17d_project_student10 = createStudentAnswer(student10, pa17d_project, "Ecology studies the interactions between organisms and their environment, providing insights into ecosystem dynamics, biodiversity, and the impact of human activities on the natural world.");
        addStudentAnswerToProblemAnswer(pa17d_project, sa17d_project_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all project-related problem answers.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa18a_project_student9 = createStudentAnswer(student9, pa18a_project, "Engineering disciplines such as civil, mechanical, electrical, and chemical engineering have diverse applications, ranging from infrastructure development to technological innovations in various industries.");
        addStudentAnswerToProblemAnswer(pa18a_project, sa18a_project_student9);

        StudentAnswer sa18b_project_student9 = createStudentAnswer(student9, pa18b_project, "Problem-solving techniques are crucial in engineering as they enable engineers to identify and address challenges efficiently, leading to innovative solutions and improved processes.");
        addStudentAnswerToProblemAnswer(pa18b_project, sa18b_project_student9);

        StudentAnswer sa18c_project_student9 = createStudentAnswer(student9, pa18c_project, "The engineering design process provides a systematic approach to problem-solving, guiding engineers through stages such as defining requirements, brainstorming, prototyping, testing, and iteration to develop effective solutions.");
        addStudentAnswerToProblemAnswer(pa18c_project, sa18c_project_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa18a_project_student10 = createStudentAnswer(student10, pa18a_project, "Engineering disciplines such as civil, mechanical, electrical, and chemical engineering have diverse applications, ranging from infrastructure development to technological innovations in various industries.");
        addStudentAnswerToProblemAnswer(pa18a_project, sa18a_project_student10);

        StudentAnswer sa18b_project_student10 = createStudentAnswer(student10, pa18b_project, "Problem-solving techniques are crucial in engineering as they enable engineers to identify and address challenges efficiently, leading to innovative solutions and improved processes.");
        addStudentAnswerToProblemAnswer(pa18b_project, sa18b_project_student10);

        StudentAnswer sa18c_project_student10 = createStudentAnswer(student10, pa18c_project, "The engineering design process provides a systematic approach to problem-solving, guiding engineers through stages such as defining requirements, brainstorming, prototyping, testing, and iteration to develop effective solutions.");
        addStudentAnswerToProblemAnswer(pa18c_project, sa18c_project_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all project-related problem answers.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa19a_project_student9 = createStudentAnswer(student9, pa19a_project, "Circuit analysis involves principles such as Ohm's law, Kirchhoff's laws, and various techniques for analyzing DC and AC circuits, essential for understanding voltage, current, and resistance in electrical systems.");
        addStudentAnswerToProblemAnswer(pa19a_project, sa19a_project_student9);

        StudentAnswer sa19b_project_student9 = createStudentAnswer(student9, pa19b_project, "Signal processing involves the analysis and manipulation of signals using techniques like Fourier transforms and filtering, which are crucial for improving communication systems and digital signal processing (DSP).");
        addStudentAnswerToProblemAnswer(pa19b_project, sa19b_project_student9);

        StudentAnswer sa19c_project_student9 = createStudentAnswer(student9, pa19c_project, "Systems theory helps in understanding and modeling the behavior of complex systems through concepts such as feedback and control systems, which are essential for analyzing and designing efficient electrical systems.");
        addStudentAnswerToProblemAnswer(pa19c_project, sa19c_project_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa19a_project_student10 = createStudentAnswer(student10, pa19a_project, "Circuit analysis involves principles such as Ohm's law, Kirchhoff's laws, and various techniques for analyzing DC and AC circuits, essential for understanding voltage, current, and resistance in electrical systems.");
        addStudentAnswerToProblemAnswer(pa19a_project, sa19a_project_student10);

        StudentAnswer sa19b_project_student10 = createStudentAnswer(student10, pa19b_project, "Signal processing involves the analysis and manipulation of signals using techniques like Fourier transforms and filtering, which are crucial for improving communication systems and digital signal processing (DSP).");
        addStudentAnswerToProblemAnswer(pa19b_project, sa19b_project_student10);

        StudentAnswer sa19c_project_student10 = createStudentAnswer(student10, pa19c_project, "Systems theory helps in understanding and modeling the behavior of complex systems through concepts such as feedback and control systems, which are essential for analyzing and designing efficient electrical systems.");
        addStudentAnswerToProblemAnswer(pa19c_project, sa19c_project_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all project-related problem answers.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa20a_project_student9 = createStudentAnswer(student9, pa20a_project, "Analyzing force systems is crucial for understanding the equilibrium and stability of structures, ensuring safety and reliability in engineering applications.");
        addStudentAnswerToProblemAnswer(pa20a_project, sa20a_project_student9);

        StudentAnswer sa20b_project_student9 = createStudentAnswer(student9, pa20b_project, "Newton's laws of motion provide the foundation for analyzing the motion of particles and rigid bodies, allowing engineers to predict and optimize their behavior.");
        addStudentAnswerToProblemAnswer(pa20b_project, sa20b_project_student9);

        StudentAnswer sa20c_project_student9 = createStudentAnswer(student9, pa20c_project, "Thermodynamics principles are essential for understanding energy transfer, heat, and the behavior of gases and liquids, which are crucial for solving engineering problems involving energy and work.");
        addStudentAnswerToProblemAnswer(pa20c_project, sa20c_project_student9);

        StudentAnswer sa20d_project_student9 = createStudentAnswer(student9, pa20d_project, "Material selection determines the performance, durability, and cost-effectiveness of engineering designs, ensuring that materials meet specific requirements and application needs.");
        addStudentAnswerToProblemAnswer(pa20d_project, sa20d_project_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa20a_project_student10 = createStudentAnswer(student10, pa20a_project, "Analyzing force systems is crucial for understanding the equilibrium and stability of structures, ensuring safety and reliability in engineering applications.");
        addStudentAnswerToProblemAnswer(pa20a_project, sa20a_project_student10);

        StudentAnswer sa20b_project_student10 = createStudentAnswer(student10, pa20b_project, "Newton's laws of motion provide the foundation for analyzing the motion of particles and rigid bodies, allowing engineers to predict and optimize their behavior.");
        addStudentAnswerToProblemAnswer(pa20b_project, sa20b_project_student10);

        StudentAnswer sa20c_project_student10 = createStudentAnswer(student10, pa20c_project, "Thermodynamics principles are essential for understanding energy transfer, heat, and the behavior of gases and liquids, which are crucial for solving engineering problems involving energy and work.");
        addStudentAnswerToProblemAnswer(pa20c_project, sa20c_project_student10);

        StudentAnswer sa20d_project_student10 = createStudentAnswer(student10, pa20d_project, "Material selection determines the performance, durability, and cost-effectiveness of engineering designs, ensuring that materials meet specific requirements and application needs.");
        addStudentAnswerToProblemAnswer(pa20d_project, sa20d_project_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all project-related problem answers.");
        studentAnswerRepo.saveAllAndFlush(Arrays.asList(sa1a_project_student1, sa1b_project_student1, sa1c_project_student1, sa1d_project_student1, sa1e_project_student1, sa1f_project_student1, sa2a_project_student1, sa2b_project_student1, sa2c_project_student1, sa2d_project_student1, sa2e_project_student1, sa2f_project_student1, sa3a_project_student1, sa3b_project_student1, sa3c_project_student1, sa3d_project_student1, sa4a_project_student1, sa4b_project_student1, sa4c_project_student1, sa4d_project_student1, sa1a_project_student2, sa1b_project_student2, sa1c_project_student2, sa1d_project_student2, sa1e_project_student2, sa1f_project_student2, sa2a_project_student2, sa2b_project_student2, sa2c_project_student2, sa2d_project_student2, sa2e_project_student2, sa2f_project_student2, sa3a_project_student2, sa3b_project_student2, sa3c_project_student2, sa3d_project_student2, sa4a_project_student2, sa4b_project_student2, sa4c_project_student2, sa4d_project_student2,
                sa5a_project_student3, sa5b_project_student3, sa5c_project_student3, sa5d_project_student3, sa6a_project_student3, sa6b_project_student3, sa6c_project_student3, sa6d_project_student3, sa6e_project_student3, sa7a_project_student3, sa7b_project_student3, sa7c_project_student3, sa7d_project_student3, sa8a_project_student3, sa8b_project_student3, sa8c_project_student3, sa8d_project_student3, sa8e_project_student3, sa5a_project_student4, sa5b_project_student4, sa5c_project_student4, sa5d_project_student4, sa6a_project_student4, sa6b_project_student4, sa6c_project_student4, sa6d_project_student4, sa6e_project_student4, sa7a_project_student4, sa7b_project_student4, sa7c_project_student4, sa7d_project_student4, sa8a_project_student4, sa8b_project_student4, sa8c_project_student4, sa8d_project_student4, sa8e_project_student4, sa9a_project_student5, sa9b_project_student5, sa9c_project_student5, sa10a_project_student5, sa10b_project_student5, sa10c_project_student5, sa10d_project_student5, sa11a_project_student5, sa11b_project_student5, sa11c_project_student5, sa11d_project_student5, sa12a_project_student5, sa12b_project_student5, sa12c_project_student5, sa12d_project_student5, sa12e_project_student5,
                sa9a_project_student6, sa9b_project_student6, sa9c_project_student6, sa10a_project_student6, sa10b_project_student6, sa10c_project_student6, sa10d_project_student6, sa11a_project_student6, sa11b_project_student6, sa11c_project_student6, sa11d_project_student6, sa12a_project_student6, sa12b_project_student6, sa12c_project_student6, sa12d_project_student6, sa12e_project_student6, sa13a_project_student7, sa13b_project_student7, sa13c_project_student7, sa13d_project_student7, sa14a_project_student7, sa14b_project_student7, sa14c_project_student7, sa14d_project_student7, sa15a_project_student7, sa15b_project_student7, sa15c_project_student7, sa16a_project_student7, sa16b_project_student7, sa16c_project_student7, sa13a_project_student8, sa13b_project_student8, sa13c_project_student8, sa13d_project_student8, sa14a_project_student8, sa14b_project_student8, sa14c_project_student8, sa14d_project_student8, sa15a_project_student8, sa15b_project_student8, sa15c_project_student8, sa16a_project_student8, sa16b_project_student8, sa16c_project_student8,
                sa17a_project_student9, sa17b_project_student9, sa17c_project_student9, sa17d_project_student9, sa18a_project_student9, sa18b_project_student9, sa18c_project_student9, sa19a_project_student9, sa19b_project_student9, sa19c_project_student9, sa20a_project_student9, sa20b_project_student9, sa20c_project_student9, sa20d_project_student9, sa17a_project_student10, sa17b_project_student10, sa17c_project_student10, sa17d_project_student10, sa18a_project_student10, sa18b_project_student10, sa18c_project_student10, sa19a_project_student10, sa19b_project_student10, sa19c_project_student10, sa20a_project_student10, sa20b_project_student10, sa20c_project_student10, sa20d_project_student10));


// Creating submission for student1 with project answers for 1a
        Submission submission1a_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1a_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa1a_project_student1, submission1a_project_1);

// Creating submission for student2 with project answers for 1a
        Submission submission1a_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1a_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa1a_project_student2, submission1a_project_2);

// Creating submission for student1 with project answers for 1b
        Submission submission1b_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1b_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa1b_project_student1, submission1b_project_1);

// Creating submission for student2 with project answers for 1b
        Submission submission1b_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1b_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa1b_project_student2, submission1b_project_2);
// Creating submission for student1 with project answers for 1c
        Submission submission1c_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1c_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa1c_project_student1, submission1c_project_1);

// Creating submission for student2 with project answers for 1c
        Submission submission1c_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1c_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa1c_project_student2, submission1c_project_2);
// Creating submission for student1 with project answers for 1d
        Submission submission1d_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1d_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa1d_project_student1, submission1d_project_1);

// Creating submission for student2 with project answers for 1d
        Submission submission1d_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1d_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa1d_project_student2, submission1d_project_2);
// Creating submission for student1 with project answers for 1e
        Submission submission1e_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1e_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa1e_project_student1, submission1e_project_1);

// Creating submission for student2 with project answers for 1e
        Submission submission1e_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1e_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa1e_project_student2, submission1e_project_2);
// Creating submission for student1 with project answers for 1f
        Submission submission1f_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1f_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa1f_project_student1, submission1f_project_1);

// Creating submission for student2 with project answers for 1f
        Submission submission1f_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1f_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa1f_project_student2, submission1f_project_2);
// Creating submission for student1 with project answers for 2a
        Submission submission2a_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2a_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa2a_project_student1, submission2a_project_1);

// Creating submission for student2 with project answers for 2a
        Submission submission2a_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2a_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa2a_project_student2, submission2a_project_2);
// Creating submission for student1 with project answers for 2b
        Submission submission2b_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2b_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa2b_project_student1, submission2b_project_1);

// Creating submission for student2 with project answers for 2b
        Submission submission2b_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2b_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa2b_project_student2, submission2b_project_2);
// Creating submission for student1 with project answers for 2c
        Submission submission2c_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2c_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa2c_project_student1, submission2c_project_1);

// Creating submission for student2 with project answers for 2c
        Submission submission2c_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2c_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa2c_project_student2, submission2c_project_2);
// Creating submission for student1 with project answers for 2d
        Submission submission2d_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2d_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa2d_project_student1, submission2d_project_1);

// Creating submission for student2 with project answers for 2d
        Submission submission2d_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2d_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa2d_project_student2, submission2d_project_2);
// Creating submission for student1 with project answers for 2e
        Submission submission2e_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2e_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa2e_project_student1, submission2e_project_1);

// Creating submission for student2 with project answers for 2e
        Submission submission2e_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2e_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa2e_project_student2, submission2e_project_2);
// Creating submission for student1 with project answers for 2f
        Submission submission2f_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2f_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa2f_project_student1, submission2f_project_1);

// Creating submission for student2 with project answers for 2f
        Submission submission2f_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2f_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa2f_project_student2, submission2f_project_2);
// Creating submission for student1 with project answers for 3a
        Submission submission3a_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3a_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa3a_project_student1, submission3a_project_1);

// Creating submission for student2 with project answers for 3a
        Submission submission3a_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3a_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa3a_project_student2, submission3a_project_2);
// Creating submission for student1 with project answers for 3b
        Submission submission3b_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3b_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa3b_project_student1, submission3b_project_1);

// Creating submission for student2 with project answers for 3b
        Submission submission3b_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3b_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa3b_project_student2, submission3b_project_2);
// Creating submission for student1 with project answers for 3c
        Submission submission3c_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3c_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa3c_project_student1, submission3c_project_1);

// Creating submission for student2 with project answers for 3c
        Submission submission3c_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3c_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa3c_project_student2, submission3c_project_2);
// Creating submission for student1 with project answers for 3d
        Submission submission3d_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3d_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa3d_project_student1, submission3d_project_1);

// Creating submission for student2 with project answers for 3d
        Submission submission3d_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3d_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa3d_project_student2, submission3d_project_2);
// Creating submission for student1 with project answers for 4a
        Submission submission4a_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4a_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa4a_project_student1, submission4a_project_1);

// Creating submission for student2 with project answers for 4a
        Submission submission4a_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4a_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa4a_project_student2, submission4a_project_2);
// Creating submission for student1 with project answers for 4b
        Submission submission4b_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4b_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa4b_project_student1, submission4b_project_1);

// Creating submission for student2 with project answers for 4b
        Submission submission4b_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4b_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa4b_project_student2, submission4b_project_2);
// Creating submission for student1 with project answers for 4c
        Submission submission4c_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4c_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa4c_project_student1, submission4c_project_1);

// Creating submission for student2 with project answers for 4c
        Submission submission4c_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4c_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa4c_project_student2, submission4c_project_2);
// Creating submission for student1 with project answers for 4d
        Submission submission4d_project_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4d_project_student1
        ));

// Adding the submission to the project answer for student1
        addSubmissionToStudentAnswer(sa4d_project_student1, submission4d_project_1);

// Creating submission for student2 with project answers for 4d
        Submission submission4d_project_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4d_project_student2
        ));

// Adding the submission to the project answer for student2
        addSubmissionToStudentAnswer(sa4d_project_student2, submission4d_project_2);
// Creating submission for student3 with project answers for 5a
        Submission submission5a_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5a_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa5a_project_student3, submission5a_project_3);

// Creating submission for student4 with project answers for 5a
        Submission submission5a_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5a_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa5a_project_student4, submission5a_project_4);
// Creating submission for student3 with project answers for 5b
        Submission submission5b_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5b_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa5b_project_student3, submission5b_project_3);

// Creating submission for student4 with project answers for 5b
        Submission submission5b_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5b_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa5b_project_student4, submission5b_project_4);
// Creating submission for student3 with project answers for 5c
        Submission submission5c_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5c_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa5c_project_student3, submission5c_project_3);

// Creating submission for student4 with project answers for 5c
        Submission submission5c_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5c_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa5c_project_student4, submission5c_project_4);
// Creating submission for student3 with project answers for 5d
        Submission submission5d_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5d_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa5d_project_student3, submission5d_project_3);

// Creating submission for student4 with project answers for 5d
        Submission submission5d_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5d_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa5d_project_student4, submission5d_project_4);
// Creating submission for student3 with project answers for 6a
        Submission submission6a_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6a_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa6a_project_student3, submission6a_project_3);

// Creating submission for student4 with project answers for 6a
        Submission submission6a_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6a_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa6a_project_student4, submission6a_project_4);
// Creating submission for student3 with project answers for 6b
        Submission submission6b_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6b_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa6b_project_student3, submission6b_project_3);

// Creating submission for student4 with project answers for 6b
        Submission submission6b_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6b_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa6b_project_student4, submission6b_project_4);
// Creating submission for student3 with project answers for 6c
        Submission submission6c_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6c_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa6c_project_student3, submission6c_project_3);

// Creating submission for student4 with project answers for 6c
        Submission submission6c_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6c_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa6c_project_student4, submission6c_project_4);
// Creating submission for student3 with project answers for 6d
        Submission submission6d_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6d_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa6d_project_student3, submission6d_project_3);

// Creating submission for student4 with project answers for 6d
        Submission submission6d_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6d_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa6d_project_student4, submission6d_project_4);
// Creating submission for student3 with project answers for 6e
        Submission submission6e_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6e_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa6e_project_student3, submission6e_project_3);

// Creating submission for student4 with project answers for 6e
        Submission submission6e_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6e_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa6e_project_student4, submission6e_project_4);
// Creating submission for student3 with project answers for 7a
        Submission submission7a_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7a_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa7a_project_student3, submission7a_project_3);

// Creating submission for student4 with project answers for 7a
        Submission submission7a_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7a_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa7a_project_student4, submission7a_project_4);
// Creating submission for student3 with project answers for 7b
        Submission submission7b_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7b_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa7b_project_student3, submission7b_project_3);

// Creating submission for student4 with project answers for 7b
        Submission submission7b_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7b_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa7b_project_student4, submission7b_project_4);
// Creating submission for student3 with project answers for 7c
        Submission submission7c_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7c_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa7c_project_student3, submission7c_project_3);

// Creating submission for student4 with project answers for 7c
        Submission submission7c_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7c_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa7c_project_student4, submission7c_project_4);
// Creating submission for student3 with project answers for 7d
        Submission submission7d_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7d_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa7d_project_student3, submission7d_project_3);

// Creating submission for student4 with project answers for 7d
        Submission submission7d_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7d_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa7d_project_student4, submission7d_project_4);
// Creating submission for student3 with project answers for 8a
        Submission submission8a_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8a_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa8a_project_student3, submission8a_project_3);

// Creating submission for student4 with project answers for 8a
        Submission submission8a_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8a_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa8a_project_student4, submission8a_project_4);
// Creating submission for student3 with project answers for 8b
        Submission submission8b_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8b_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa8b_project_student3, submission8b_project_3);

// Creating submission for student4 with project answers for 8b
        Submission submission8b_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8b_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa8b_project_student4, submission8b_project_4);
// Creating submission for student3 with project answers for 8c
        Submission submission8c_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8c_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa8c_project_student3, submission8c_project_3);

// Creating submission for student4 with project answers for 8c
        Submission submission8c_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8c_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa8c_project_student4, submission8c_project_4);
// Creating submission for student3 with project answers for 8d
        Submission submission8d_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8d_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa8d_project_student3, submission8d_project_3);

// Creating submission for student4 with project answers for 8d
        Submission submission8d_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8d_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa8d_project_student4, submission8d_project_4);
// Creating submission for student3 with project answers for 8e
        Submission submission8e_project_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8e_project_student3
        ));

// Adding the submission to the project answer for student3
        addSubmissionToStudentAnswer(sa8e_project_student3, submission8e_project_3);

// Creating submission for student4 with project answers for 8e
        Submission submission8e_project_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8e_project_student4
        ));

// Adding the submission to the project answer for student4
        addSubmissionToStudentAnswer(sa8e_project_student4, submission8e_project_4);
// Creating submission for student5 with project answers for 9a
        Submission submission9a_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9a_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa9a_project_student5, submission9a_project_5);

// Creating submission for student6 with project answers for 9a
        Submission submission9a_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9a_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa9a_project_student6, submission9a_project_6);
// Creating submission for student5 with project answers for 9b
        Submission submission9b_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9b_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa9b_project_student5, submission9b_project_5);

// Creating submission for student6 with project answers for 9b
        Submission submission9b_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9b_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa9b_project_student6, submission9b_project_6);
// Creating submission for student5 with project answers for 9c
        Submission submission9c_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9c_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa9c_project_student5, submission9c_project_5);

// Creating submission for student6 with project answers for 9c
        Submission submission9c_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9c_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa9c_project_student6, submission9c_project_6);
// Creating submission for student5 with project answers for 10a
        Submission submission10a_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10a_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa10a_project_student5, submission10a_project_5);

// Creating submission for student6 with project answers for 10a
        Submission submission10a_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10a_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa10a_project_student6, submission10a_project_6);
// Creating submission for student5 with project answers for 10b
        Submission submission10b_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10b_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa10b_project_student5, submission10b_project_5);

// Creating submission for student6 with project answers for 10b
        Submission submission10b_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10b_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa10b_project_student6, submission10b_project_6);
// Creating submission for student5 with project answers for 10c
        Submission submission10c_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10c_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa10c_project_student5, submission10c_project_5);

// Creating submission for student6 with project answers for 10c
        Submission submission10c_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10c_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa10c_project_student6, submission10c_project_6);
// Creating submission for student5 with project answers for 10d
        Submission submission10d_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10d_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa10d_project_student5, submission10d_project_5);

// Creating submission for student6 with project answers for 10d
        Submission submission10d_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10d_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa10d_project_student6, submission10d_project_6);
// Creating submission for student5 with project answers for 11a
        Submission submission11a_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11a_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa11a_project_student5, submission11a_project_5);

// Creating submission for student6 with project answers for 11a
        Submission submission11a_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11a_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa11a_project_student6, submission11a_project_6);
// Creating submission for student5 with project answers for 11b
        Submission submission11b_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11b_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa11b_project_student5, submission11b_project_5);

// Creating submission for student6 with project answers for 11b
        Submission submission11b_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11b_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa11b_project_student6, submission11b_project_6);
// Creating submission for student5 with project answers for 11c
        Submission submission11c_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11c_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa11c_project_student5, submission11c_project_5);

// Creating submission for student6 with project answers for 11c
        Submission submission11c_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11c_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa11c_project_student6, submission11c_project_6);
// Creating submission for student5 with project answers for 11d
        Submission submission11d_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11d_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa11d_project_student5, submission11d_project_5);

// Creating submission for student6 with project answers for 11d
        Submission submission11d_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11d_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa11d_project_student6, submission11d_project_6);
// Creating submission for student5 with project answers for 12a
        Submission submission12a_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12a_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa12a_project_student5, submission12a_project_5);

// Creating submission for student6 with project answers for 12a
        Submission submission12a_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12a_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa12a_project_student6, submission12a_project_6);
// Creating submission for student5 with project answers for 12b
        Submission submission12b_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12b_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa12b_project_student5, submission12b_project_5);

// Creating submission for student6 with project answers for 12b
        Submission submission12b_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12b_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa12b_project_student6, submission12b_project_6);
// Creating submission for student5 with project answers for 12c
        Submission submission12c_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12c_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa12c_project_student5, submission12c_project_5);

// Creating submission for student6 with project answers for 12c
        Submission submission12c_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12c_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa12c_project_student6, submission12c_project_6);
// Creating submission for student5 with project answers for 12d
        Submission submission12d_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12d_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa12d_project_student5, submission12d_project_5);

// Creating submission for student6 with project answers for 12d
        Submission submission12d_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12d_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa12d_project_student6, submission12d_project_6);
// Creating submission for student5 with project answers for 12e
        Submission submission12e_project_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12e_project_student5
        ));

// Adding the submission to the project answer for student5
        addSubmissionToStudentAnswer(sa12e_project_student5, submission12e_project_5);

// Creating submission for student6 with project answers for 12e
        Submission submission12e_project_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12e_project_student6
        ));

// Adding the submission to the project answer for student6
        addSubmissionToStudentAnswer(sa12e_project_student6, submission12e_project_6);
// Creating submission for student7 with project answers for 13a
        Submission submission13a_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13a_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa13a_project_student7, submission13a_project_7);

// Creating submission for student8 with project answers for 13a
        Submission submission13a_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13a_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa13a_project_student8, submission13a_project_8);
// Creating submission for student7 with project answers for 13b
        Submission submission13b_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13b_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa13b_project_student7, submission13b_project_7);

// Creating submission for student8 with project answers for 13b
        Submission submission13b_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13b_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa13b_project_student8, submission13b_project_8);
// Creating submission for student7 with project answers for 13c
        Submission submission13c_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13c_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa13c_project_student7, submission13c_project_7);

// Creating submission for student8 with project answers for 13c
        Submission submission13c_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13c_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa13c_project_student8, submission13c_project_8);
// Creating submission for student7 with project answers for 13d
        Submission submission13d_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13d_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa13d_project_student7, submission13d_project_7);

// Creating submission for student8 with project answers for 13d
        Submission submission13d_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13d_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa13d_project_student8, submission13d_project_8);
// Creating submission for student7 with project answers for 14a
        Submission submission14a_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14a_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa14a_project_student7, submission14a_project_7);

// Creating submission for student8 with project answers for 14a
        Submission submission14a_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14a_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa14a_project_student8, submission14a_project_8);
// Creating submission for student7 with project answers for 14b
        Submission submission14b_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14b_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa14b_project_student7, submission14b_project_7);

// Creating submission for student8 with project answers for 14b
        Submission submission14b_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14b_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa14b_project_student8, submission14b_project_8);
// Creating submission for student7 with project answers for 14c
        Submission submission14c_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14c_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa14c_project_student7, submission14c_project_7);

// Creating submission for student8 with project answers for 14c
        Submission submission14c_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14c_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa14c_project_student8, submission14c_project_8);
// Creating submission for student7 with project answers for 14d
        Submission submission14d_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14d_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa14d_project_student7, submission14d_project_7);

// Creating submission for student8 with project answers for 14d
        Submission submission14d_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14d_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa14d_project_student8, submission14d_project_8);
// Creating submission for student7 with project answers for 15a
        Submission submission15a_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15a_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa15a_project_student7, submission15a_project_7);

// Creating submission for student8 with project answers for 15a
        Submission submission15a_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15a_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa15a_project_student8, submission15a_project_8);
// Creating submission for student7 with project answers for 15b
        Submission submission15b_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15b_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa15b_project_student7, submission15b_project_7);

// Creating submission for student8 with project answers for 15b
        Submission submission15b_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15b_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa15b_project_student8, submission15b_project_8);
// Creating submission for student7 with project answers for 15c
        Submission submission15c_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15c_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa15c_project_student7, submission15c_project_7);

// Creating submission for student8 with project answers for 15c
        Submission submission15c_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15c_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa15c_project_student8, submission15c_project_8);
// Creating submission for student7 with project answers for 16a
        Submission submission16a_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16a_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa16a_project_student7, submission16a_project_7);

// Creating submission for student8 with project answers for 16a
        Submission submission16a_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16a_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa16a_project_student8, submission16a_project_8);
// Creating submission for student7 with project answers for 16b
        Submission submission16b_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16b_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa16b_project_student7, submission16b_project_7);

// Creating submission for student8 with project answers for 16b
        Submission submission16b_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16b_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa16b_project_student8, submission16b_project_8);
// Creating submission for student7 with project answers for 16c
        Submission submission16c_project_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16c_project_student7
        ));

// Adding the submission to the project answer for student7
        addSubmissionToStudentAnswer(sa16c_project_student7, submission16c_project_7);

// Creating submission for student8 with project answers for 16c
        Submission submission16c_project_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16c_project_student8
        ));

// Adding the submission to the project answer for student8
        addSubmissionToStudentAnswer(sa16c_project_student8, submission16c_project_8);
// Creating submission for student9 with project answers for 17a
        Submission submission17a_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17a_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa17a_project_student9, submission17a_project_9);

// Creating submission for student10 with project answers for 17a
        Submission submission17a_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17a_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa17a_project_student10, submission17a_project_10);
// Creating submission for student9 with project answers for 17b
        Submission submission17b_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17b_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa17b_project_student9, submission17b_project_9);

// Creating submission for student10 with project answers for 17b
        Submission submission17b_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17b_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa17b_project_student10, submission17b_project_10);
// Creating submission for student9 with project answers for 17c
        Submission submission17c_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17c_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa17c_project_student9, submission17c_project_9);

// Creating submission for student10 with project answers for 17c
        Submission submission17c_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17c_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa17c_project_student10, submission17c_project_10);
// Creating submission for student9 with project answers for 17d
        Submission submission17d_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17d_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa17d_project_student9, submission17d_project_9);

// Creating submission for student10 with project answers for 17d
        Submission submission17d_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17d_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa17d_project_student10, submission17d_project_10);
// Creating submission for student9 with project answers for 18a
        Submission submission18a_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18a_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa18a_project_student9, submission18a_project_9);

// Creating submission for student10 with project answers for 18a
        Submission submission18a_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18a_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa18a_project_student10, submission18a_project_10);
// Creating submission for student9 with project answers for 18b
        Submission submission18b_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18b_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa18b_project_student9, submission18b_project_9);

// Creating submission for student10 with project answers for 18b
        Submission submission18b_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18b_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa18b_project_student10, submission18b_project_10);
// Creating submission for student9 with project answers for 18c
        Submission submission18c_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18c_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa18c_project_student9, submission18c_project_9);

// Creating submission for student10 with project answers for 18c
        Submission submission18c_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18c_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa18c_project_student10, submission18c_project_10);
// Creating submission for student9 with project answers for 19a
        Submission submission19a_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19a_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa19a_project_student9, submission19a_project_9);

// Creating submission for student10 with project answers for 19a
        Submission submission19a_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19a_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa19a_project_student10, submission19a_project_10);
// Creating submission for student9 with project answers for 19b
        Submission submission19b_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19b_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa19b_project_student9, submission19b_project_9);

// Creating submission for student10 with project answers for 19b
        Submission submission19b_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19b_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa19b_project_student10, submission19b_project_10);
// Creating submission for student9 with project answers for 19c
        Submission submission19c_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19c_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa19c_project_student9, submission19c_project_9);

// Creating submission for student10 with project answers for 19c
        Submission submission19c_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19c_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa19c_project_student10, submission19c_project_10);
// Creating submission for student9 with project answers for 20a
        Submission submission20a_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20a_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa20a_project_student9, submission20a_project_9);

// Creating submission for student10 with project answers for 20a
        Submission submission20a_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20a_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa20a_project_student10, submission20a_project_10);
// Creating submission for student9 with project answers for 20b
        Submission submission20b_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20b_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa20b_project_student9, submission20b_project_9);

// Creating submission for student10 with project answers for 20b
        Submission submission20b_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20b_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa20b_project_student10, submission20b_project_10);
// Creating submission for student9 with project answers for 20c
        Submission submission20c_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20c_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa20c_project_student9, submission20c_project_9);

// Creating submission for student10 with project answers for 20c
        Submission submission20c_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20c_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa20c_project_student10, submission20c_project_10);
// Creating submission for student9 with project answers for 20d
        Submission submission20d_project_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20d_project_student9
        ));

// Adding the submission to the project answer for student9
        addSubmissionToStudentAnswer(sa20d_project_student9, submission20d_project_9);

// Creating submission for student10 with project answers for 20d
        Submission submission20d_project_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20d_project_student10
        ));

// Adding the submission to the project answer for student10
        addSubmissionToStudentAnswer(sa20d_project_student10, submission20d_project_10);
        submissionRepo.saveAllAndFlush(Arrays.asList(submission1a_project_1, submission1b_project_1, submission1c_project_1, submission1d_project_1, submission1e_project_1, submission1f_project_1, submission2a_project_1, submission2b_project_1, submission2c_project_1, submission2d_project_1, submission2e_project_1, submission2f_project_1, submission3a_project_1, submission3b_project_1, submission3c_project_1, submission3d_project_1, submission4a_project_1, submission4b_project_1, submission4c_project_1, submission4d_project_1, submission1a_project_2, submission1b_project_2, submission1c_project_2, submission1d_project_2, submission1e_project_2, submission1f_project_2, submission2a_project_2, submission2b_project_2, submission2c_project_2, submission2d_project_2, submission2e_project_2, submission2f_project_2, submission3a_project_2, submission3b_project_2, submission3c_project_2, submission3d_project_2, submission4a_project_2, submission4b_project_2, submission4c_project_2, submission4d_project_2, submission5a_project_3, submission5b_project_3, submission5c_project_3, submission5d_project_3, submission6a_project_3, submission6b_project_3, submission6c_project_3, submission6d_project_3, submission6e_project_3, submission7a_project_3, submission7b_project_3, submission7c_project_3, submission7d_project_3, submission8a_project_3, submission8b_project_3, submission8c_project_3, submission8d_project_3, submission8e_project_3,
                submission5a_project_4, submission5b_project_4, submission5c_project_4, submission5d_project_4, submission6a_project_4, submission6b_project_4, submission6c_project_4, submission6d_project_4, submission6e_project_4, submission7a_project_4, submission7b_project_4, submission7c_project_4, submission7d_project_4, submission8a_project_4, submission8b_project_4, submission8c_project_4, submission8d_project_4, submission8e_project_4, submission9a_project_5, submission9b_project_5, submission9c_project_5, submission10a_project_5, submission10b_project_5, submission10c_project_5, submission10d_project_5, submission11a_project_5, submission11b_project_5, submission11c_project_5, submission11d_project_5, submission12a_project_5, submission12b_project_5, submission12c_project_5, submission12d_project_5, submission12e_project_5, submission9a_project_6, submission9b_project_6, submission9c_project_6, submission10a_project_6, submission10b_project_6, submission10c_project_6, submission10d_project_6, submission11a_project_6, submission11b_project_6, submission11c_project_6, submission11d_project_6, submission12a_project_6, submission12b_project_6, submission12c_project_6, submission12d_project_6, submission12e_project_6, submission13a_project_7, submission13b_project_7, submission13c_project_7, submission13d_project_7, submission14a_project_7, submission14b_project_7, submission14c_project_7, submission14d_project_7, submission15a_project_7, submission15b_project_7, submission15c_project_7, submission16a_project_7, submission16b_project_7, submission16c_project_7,
                submission13a_project_8, submission13b_project_8, submission13c_project_8, submission13d_project_8, submission14a_project_8, submission14b_project_8, submission14c_project_8, submission14d_project_8, submission15a_project_8, submission15b_project_8, submission15c_project_8, submission16a_project_8, submission16b_project_8, submission16c_project_8, submission17a_project_9, submission17b_project_9, submission17c_project_9, submission17d_project_9, submission18a_project_9, submission18b_project_9, submission18c_project_9, submission19a_project_9, submission19b_project_9, submission19c_project_9, submission20a_project_9, submission20b_project_9, submission20c_project_9, submission20d_project_9, submission17a_project_10, submission17b_project_10, submission17c_project_10, submission17d_project_10, submission18a_project_10, submission18b_project_10, submission18c_project_10, submission19a_project_10, submission19b_project_10, submission19c_project_10, submission20a_project_10, submission20b_project_10, submission20c_project_10, submission20d_project_10));


        Grade grade1a_1 = createGrade(88.5, student1, faculty1, course1, submission1a_project_1);
        Grade grade1a_2 = createGrade(86.7, student2, faculty1, course1, submission1a_project_2);
        Grade grade1b_1 = createGrade(87.3, student1, faculty1, course1, submission1b_project_1);
        Grade grade1b_2 = createGrade(89.1, student2, faculty1, course1, submission1b_project_2);
        Grade grade1c_1 = createGrade(86.9, student1, faculty1, course1, submission1c_project_1);
        Grade grade1c_2 = createGrade(88.4, student2, faculty1, course1, submission1c_project_2);
        Grade grade1d_1 = createGrade(85.8, student1, faculty1, course1, submission1d_project_1);
        Grade grade1d_2 = createGrade(89.0, student2, faculty1, course1, submission1d_project_2);
        Grade grade1e_1 = createGrade(88.2, student1, faculty1, course1, submission1e_project_1);
        Grade grade1e_2 = createGrade(87.6, student2, faculty1, course1, submission1e_project_2);
        Grade grade1f_1 = createGrade(85.7, student1, faculty1, course1, submission1f_project_1);
        Grade grade1f_2 = createGrade(87.9, student2, faculty1, course1, submission1f_project_2);

        Grade grade2a_1 = createGrade(87.9, student1, faculty2, course2, submission2a_project_1);
        Grade grade2a_2 = createGrade(86.5, student2, faculty2, course2, submission2a_project_2);
        Grade grade2b_1 = createGrade(89.3, student1, faculty2, course2, submission2b_project_1);
        Grade grade2b_2 = createGrade(88.7, student2, faculty2, course2, submission2b_project_2);
        Grade grade2c_1 = createGrade(87.5, student1, faculty2, course2, submission2c_project_1);
        Grade grade2c_2 = createGrade(86.3, student2, faculty2, course2, submission2c_project_2);
        Grade grade2d_1 = createGrade(88.6, student1, faculty2, course2, submission2d_project_1);
        Grade grade2d_2 = createGrade(87.8, student2, faculty2, course2, submission2d_project_2);
        Grade grade2e_1 = createGrade(89.1, student1, faculty2, course2, submission2e_project_1);
        Grade grade2e_2 = createGrade(87.7, student2, faculty2, course2, submission2e_project_2);
        Grade grade2f_1 = createGrade(88.2, student1, faculty2, course2, submission2f_project_1);
        Grade grade2f_2 = createGrade(86.9, student2, faculty2, course2, submission2f_project_2);

        Grade grade3a_1 = createGrade(88.7, student1, faculty3, course3, submission3a_project_1);
        Grade grade3a_2 = createGrade(86.4, student2, faculty3, course3, submission3a_project_2);
        Grade grade3b_1 = createGrade(87.9, student1, faculty3, course3, submission3b_project_1);
        Grade grade3b_2 = createGrade(89.5, student2, faculty3, course3, submission3b_project_2);
        Grade grade3c_1 = createGrade(86.8, student1, faculty3, course3, submission3c_project_1);
        Grade grade3c_2 = createGrade(88.2, student2, faculty3, course3, submission3c_project_2);
        Grade grade3d_1 = createGrade(85.6, student1, faculty3, course3, submission3d_project_1);
        Grade grade3d_2 = createGrade(87.3, student2, faculty3, course3, submission3d_project_2);

        Grade grade4a_1 = createGrade(88.2, student1, faculty4, course4, submission4a_project_1);
        Grade grade4a_2 = createGrade(86.7, student2, faculty4, course4, submission4a_project_2);
        Grade grade4b_1 = createGrade(89.5, student1, faculty4, course4, submission4b_project_1);
        Grade grade4b_2 = createGrade(87.1, student2, faculty4, course4, submission4b_project_2);
        Grade grade4c_1 = createGrade(85.9, student1, faculty4, course4, submission4c_project_1);
        Grade grade4c_2 = createGrade(88.6, student2, faculty4, course4, submission4c_project_2);
        Grade grade4d_1 = createGrade(87.3, student1, faculty4, course4, submission4d_project_1);
        Grade grade4d_2 = createGrade(89.4, student2, faculty4, course4, submission4d_project_2);

        Grade grade5a_3 = createGrade(87.2, student3, faculty5, course5, submission5a_project_3);
        Grade grade5a_4 = createGrade(85.9, student4, faculty5, course5, submission5a_project_4);
        Grade grade5b_3 = createGrade(88.7, student3, faculty5, course5, submission5b_project_3);
        Grade grade5b_4 = createGrade(89.1, student4, faculty5, course5, submission5b_project_4);
        Grade grade5c_3 = createGrade(86.3, student3, faculty5, course5, submission5c_project_3);
        Grade grade5c_4 = createGrade(87.8, student4, faculty5, course5, submission5c_project_4);
        Grade grade5d_3 = createGrade(85.6, student3, faculty5, course5, submission5d_project_3);
        Grade grade5d_4 = createGrade(88.1, student4, faculty5, course5, submission5d_project_4);

        Grade grade6a_3 = createGrade(88.5, student3, faculty1, course6, submission6a_project_3);
        Grade grade6a_4 = createGrade(86.9, student4, faculty1, course6, submission6a_project_4);
        Grade grade6b_3 = createGrade(89.2, student3, faculty1, course6, submission6b_project_3);
        Grade grade6b_4 = createGrade(87.6, student4, faculty1, course6, submission6b_project_4);
        Grade grade6c_3 = createGrade(86.4, student3, faculty1, course6, submission6c_project_3);
        Grade grade6c_4 = createGrade(88.8, student4, faculty1, course6, submission6c_project_4);
        Grade grade6d_3 = createGrade(87.3, student3, faculty1, course6, submission6d_project_3);
        Grade grade6d_4 = createGrade(89.1, student4, faculty1, course6, submission6d_project_4);
        Grade grade6e_3 = createGrade(86.2, student3, faculty1, course6, submission6e_project_3);
        Grade grade6e_4 = createGrade(88.3, student4, faculty1, course6, submission6e_project_4);

        Grade grade7a_3 = createGrade(88.9, student3, faculty2, course7, submission7a_project_3);
        Grade grade7a_4 = createGrade(87.1, student4, faculty2, course7, submission7a_project_4);
        Grade grade7b_3 = createGrade(89.6, student3, faculty2, course7, submission7b_project_3);
        Grade grade7b_4 = createGrade(88.4, student4, faculty2, course7, submission7b_project_4);
        Grade grade7c_3 = createGrade(87.7, student3, faculty2, course7, submission7c_project_3);
        Grade grade7c_4 = createGrade(89.3, student4, faculty2, course7, submission7c_project_4);
        Grade grade7d_3 = createGrade(86.9, student3, faculty2, course7, submission7d_project_3);
        Grade grade7d_4 = createGrade(88.6, student4, faculty2, course7, submission7d_project_4);

        Grade grade8a_3 = createGrade(87.1, student3, faculty3, course8, submission8a_project_3);
        Grade grade8a_4 = createGrade(88.7, student4, faculty3, course8, submission8a_project_4);
        Grade grade8b_3 = createGrade(86.8, student3, faculty3, course8, submission8b_project_3);
        Grade grade8b_4 = createGrade(89.5, student4, faculty3, course8, submission8b_project_4);
        Grade grade8c_3 = createGrade(85.9, student3, faculty3, course8, submission8c_project_3);
        Grade grade8c_4 = createGrade(88.2, student4, faculty3, course8, submission8c_project_4);
        Grade grade8d_3 = createGrade(87.4, student3, faculty3, course8, submission8d_project_3);
        Grade grade8d_4 = createGrade(89.1, student4, faculty3, course8, submission8d_project_4);
        Grade grade8e_3 = createGrade(86.5, student3, faculty3, course8, submission8e_project_3);
        Grade grade8e_4 = createGrade(88.6, student4, faculty3, course8, submission8e_project_4);

        Grade grade9a_5 = createGrade(87.5, student5, faculty4, course9, submission9a_project_5);
        Grade grade9a_6 = createGrade(88.9, student6, faculty4, course9, submission9a_project_6);
        Grade grade9b_5 = createGrade(86.8, student5, faculty4, course9, submission9b_project_5);
        Grade grade9b_6 = createGrade(89.1, student6, faculty4, course9, submission9b_project_6);
        Grade grade9c_5 = createGrade(88.4, student5, faculty4, course9, submission9c_project_5);
        Grade grade9c_6 = createGrade(87.2, student6, faculty4, course9, submission9c_project_6);

        Grade grade10a_5 = createGrade(86.9, student5, faculty5, course10, submission10a_project_5);
        Grade grade10a_6 = createGrade(88.5, student6, faculty5, course10, submission10a_project_6);
        Grade grade10b_5 = createGrade(87.3, student5, faculty5, course10, submission10b_project_5);
        Grade grade10b_6 = createGrade(89.1, student6, faculty5, course10, submission10b_project_6);
        Grade grade10c_5 = createGrade(86.8, student5, faculty5, course10, submission10c_project_5);
        Grade grade10c_6 = createGrade(87.9, student6, faculty5, course10, submission10c_project_6);
        Grade grade10d_5 = createGrade(86.8, student5, faculty5, course10, submission10d_project_5);
        Grade grade10d_6 = createGrade(87.9, student6, faculty5, course10, submission10d_project_6);


        Grade grade11a_5 = createGrade(88.3, student5, faculty1, course11, submission11a_project_5);
        Grade grade11a_6 = createGrade(86.5, student6, faculty1, course11, submission11a_project_6);
        Grade grade11b_5 = createGrade(87.9, student5, faculty1, course11, submission11b_project_5);
        Grade grade11b_6 = createGrade(89.1, student6, faculty1, course11, submission11b_project_6);
        Grade grade11c_5 = createGrade(86.7, student5, faculty1, course11, submission11c_project_5);
        Grade grade11c_6 = createGrade(88.2, student6, faculty1, course11, submission11c_project_6);
        Grade grade11d_5 = createGrade(87.3, student5, faculty1, course11, submission11d_project_5);
        Grade grade11d_6 = createGrade(89.4, student6, faculty1, course11, submission11d_project_6);

        Grade grade12a_5 = createGrade(87.3, student5, faculty2, course12, submission12a_project_5);
        Grade grade12a_6 = createGrade(86.8, student6, faculty2, course12, submission12a_project_6);
        Grade grade12b_5 = createGrade(89.1, student5, faculty2, course12, submission12b_project_5);
        Grade grade12b_6 = createGrade(88.4, student6, faculty2, course12, submission12b_project_6);
        Grade grade12c_5 = createGrade(86.9, student5, faculty2, course12, submission12c_project_5);
        Grade grade12c_6 = createGrade(88.7, student6, faculty2, course12, submission12c_project_6);
        Grade grade12d_5 = createGrade(87.2, student5, faculty2, course12, submission12d_project_5);
        Grade grade12d_6 = createGrade(86.5, student6, faculty2, course12, submission12d_project_6);
        Grade grade12e_5 = createGrade(88.3, student5, faculty2, course12, submission12e_project_5);
        Grade grade12e_6 = createGrade(86.6, student6, faculty2, course12, submission12e_project_6);

        Grade grade13a_7 = createGrade(88.2, student7, faculty3, course13, submission13a_project_7);
        Grade grade13a_8 = createGrade(86.7, student8, faculty3, course13, submission13a_project_8);
        Grade grade13b_7 = createGrade(89.1, student7, faculty3, course13, submission13b_project_7);
        Grade grade13b_8 = createGrade(87.3, student8, faculty3, course13, submission13b_project_8);
        Grade grade13c_7 = createGrade(88.7, student7, faculty3, course13, submission13c_project_7);
        Grade grade13c_8 = createGrade(87.9, student8, faculty3, course13, submission13c_project_8);
        Grade grade13d_7 = createGrade(86.4, student7, faculty3, course13, submission13d_project_7);
        Grade grade13d_8 = createGrade(88.5, student8, faculty3, course13, submission13d_project_8);

        Grade grade14a_7 = createGrade(88.5, student7, faculty4, course14, submission14a_project_7);
        Grade grade14a_8 = createGrade(87.1, student8, faculty4, course14, submission14a_project_8);
        Grade grade14b_7 = createGrade(89.2, student7, faculty4, course14, submission14b_project_7);
        Grade grade14b_8 = createGrade(88.7, student8, faculty4, course14, submission14b_project_8);
        Grade grade14c_7 = createGrade(87.6, student7, faculty4, course14, submission14c_project_7);
        Grade grade14c_8 = createGrade(89.1, student8, faculty4, course14, submission14c_project_8);
        Grade grade14d_7 = createGrade(88.4, student7, faculty4, course14, submission14d_project_7);
        Grade grade14d_8 = createGrade(87.9, student8, faculty4, course14, submission14d_project_8);

        Grade grade15a_7 = createGrade(87.4, student7, faculty5, course15, submission15a_project_7);
        Grade grade15a_8 = createGrade(88.7, student8, faculty5, course15, submission15a_project_8);
        Grade grade15b_7 = createGrade(86.9, student7, faculty5, course15, submission15b_project_7);
        Grade grade15b_8 = createGrade(87.6, student8, faculty5, course15, submission15b_project_8);
        Grade grade15c_7 = createGrade(88.2, student7, faculty5, course15, submission15c_project_7);
        Grade grade15c_8 = createGrade(86.5, student8, faculty5, course15, submission15c_project_8);

        Grade grade16a_7 = createGrade(88.3, student7, faculty1, course16, submission16a_project_7);
        Grade grade16a_8 = createGrade(87.1, student8, faculty1, course16, submission16a_project_8);
        Grade grade16b_7 = createGrade(89.2, student7, faculty1, course16, submission16b_project_7);
        Grade grade16b_8 = createGrade(88.4, student8, faculty1, course16, submission16b_project_8);
        Grade grade16c_7 = createGrade(87.9, student7, faculty1, course16, submission16c_project_7);
        Grade grade16c_8 = createGrade(89.5, student8, faculty1, course16, submission16c_project_8);

        Grade grade17a_9 = createGrade(88.4, student9, faculty2, course17, submission17a_project_9);
        Grade grade17a_10 = createGrade(87.6, student10, faculty2, course17, submission17a_project_10);
        Grade grade17b_9 = createGrade(88.7, student9, faculty2, course17, submission17b_project_9);
        Grade grade17b_10 = createGrade(89.2, student10, faculty2, course17, submission17b_project_10);
        Grade grade17c_9 = createGrade(87.9, student9, faculty2, course17, submission17c_project_9);
        Grade grade17c_10 = createGrade(88.5, student10, faculty2, course17, submission17c_project_10);
        Grade grade17d_9 = createGrade(89.1, student9, faculty2, course17, submission17d_project_9);
        Grade grade17d_10 = createGrade(86.8, student10, faculty2, course17, submission17d_project_10);

        Grade grade18a_9 = createGrade(87.6, student9, faculty3, course18, submission18a_project_9);
        Grade grade18a_10 = createGrade(89.1, student10, faculty3, course18, submission18a_project_10);
        Grade grade18b_9 = createGrade(88.4, student9, faculty3, course18, submission18b_project_9);
        Grade grade18b_10 = createGrade(86.7, student10, faculty3, course18, submission18b_project_10);
        Grade grade18c_9 = createGrade(88.7, student9, faculty3, course18, submission18c_project_9);
        Grade grade18c_10 = createGrade(87.8, student10, faculty3, course18, submission18c_project_10);

        Grade grade19a_9 = createGrade(87.3, student9, faculty4, course19, submission19a_project_9);
        Grade grade19a_10 = createGrade(88.7, student10, faculty4, course19, submission19a_project_10);
        Grade grade19b_9 = createGrade(87.9, student9, faculty4, course19, submission19b_project_9);
        Grade grade19b_10 = createGrade(86.4, student10, faculty4, course19, submission19b_project_10);
        Grade grade19c_9 = createGrade(88.5, student9, faculty4, course19, submission19c_project_9);
        Grade grade19c_10 = createGrade(87.1, student10, faculty4, course19, submission19c_project_10);

        Grade grade20a_9 = createGrade(88.3, student9, faculty5, course20, submission20a_project_9);
        Grade grade20a_10 = createGrade(87.6, student10, faculty5, course20, submission20a_project_10);
        Grade grade20b_9 = createGrade(89.1, student9, faculty5, course20, submission20b_project_9);
        Grade grade20b_10 = createGrade(86.9, student10, faculty5, course20, submission20b_project_10);
        Grade grade20c_9 = createGrade(88.7, student9, faculty5, course20, submission20c_project_9);
        Grade grade20c_10 = createGrade(87.2, student10, faculty5, course20, submission20c_project_10);
        Grade grade20d_9 = createGrade(89.4, student9, faculty5, course20, submission20d_project_9);
        Grade grade20d_10 = createGrade(88.1, student10, faculty5, course20, submission20d_project_10);
        gradeRepo.saveAllAndFlush(Arrays.asList(grade1a_1, grade1b_1, grade1c_1, grade1d_1, grade1e_1, grade1f_1, grade2a_1, grade2b_1, grade2c_1, grade2d_1, grade2e_1, grade2f_1, grade3a_1, grade3b_1, grade3c_1, grade3d_1, grade4a_1, grade4b_1, grade4c_1, grade4d_1, grade1a_2, grade1b_2, grade1c_2, grade1d_2, grade1e_2, grade1f_2, grade2a_2, grade2b_2, grade2c_2, grade2d_2, grade2e_2, grade2f_2, grade3a_2, grade3b_2, grade3c_2, grade3d_2, grade4a_2, grade4b_2, grade4c_2, grade4d_2, grade5a_3, grade5b_3, grade5c_3, grade5d_3, grade6a_3, grade6b_3, grade6c_3, grade6d_3, grade6e_3, grade7a_3, grade7b_3, grade7c_3, grade7d_3, grade8a_3, grade8b_3, grade8c_3, grade8d_3, grade8e_3, grade5a_4, grade5b_4, grade5c_4, grade5d_4, grade6a_4, grade6b_4, grade6c_4, grade6d_4, grade6e_4, grade7a_4, grade7b_4, grade7c_4, grade7d_4, grade8a_4, grade8b_4, grade8c_4, grade8d_4, grade8e_4, grade9a_5, grade9b_5, grade9c_5, grade10a_5, grade10b_5, grade10c_5, grade10d_5, grade11a_5, grade11b_5, grade11c_5, grade11d_5, grade12a_5, grade12b_5, grade12c_5, grade12d_5, grade12e_5,
                grade9a_6, grade9b_6, grade9c_6, grade10a_6, grade10b_6, grade10c_6, grade10d_6, grade11a_6, grade11b_6, grade11c_6, grade11d_6, grade12a_6, grade12b_6, grade12c_6, grade12d_6, grade12e_6, grade13a_7, grade13b_7, grade13c_7, grade13d_7, grade14a_7, grade14b_7, grade14c_7, grade14d_7, grade15a_7, grade15b_7, grade15c_7, grade16a_7, grade16b_7, grade16c_7, grade13a_8, grade13b_8, grade13c_8, grade13d_8, grade14a_8, grade14b_8, grade14c_8, grade14d_8, grade15a_8, grade15b_8, grade15c_8, grade16a_8, grade16b_8, grade16c_8, grade17a_9, grade17b_9, grade17c_9, grade17d_9, grade18a_9, grade18b_9, grade18c_9, grade19a_9, grade19b_9, grade19c_9, grade20a_9, grade20b_9, grade20c_9, grade20d_9, grade17a_10, grade17b_10, grade17c_10, grade17d_10, grade18a_10, grade18b_10, grade18c_10, grade19a_10, grade19b_10, grade19c_10, grade20a_10, grade20b_10, grade20c_10, grade20d_10));


        CourseGrade courseGrade1a_project_1 = createCourseGrade(student1, course1, 87.4, Arrays.asList(grade1a_1, grade1b_1, grade1c_1, grade1d_1, grade1e_1, grade1f_1));
        CourseGrade courseGrade1a_project_2 = createCourseGrade(student2, course1, 88.12, Arrays.asList(grade1a_2, grade1b_2, grade1c_2, grade1d_2, grade1e_2, grade1f_2));

        CourseGrade courseGrade2a_project_1 = createCourseGrade(student1, course2, 87.93, Arrays.asList(grade2a_1, grade2b_1, grade2c_1, grade2d_1, grade2e_1, grade2f_1));
        CourseGrade courseGrade2a_project_2 = createCourseGrade(student2, course2, 87.32, Arrays.asList(grade2a_2, grade2b_2, grade2c_2, grade2d_2, grade2e_2, grade2f_2));

        CourseGrade courseGrade3a_project_1 = createCourseGrade(student1, course3, 87.12, Arrays.asList(grade3a_1, grade3b_1, grade3c_1, grade3d_1));
        CourseGrade courseGrade3a_project_2 = createCourseGrade(student2, course3, 87.05, Arrays.asList(grade3a_2, grade3b_2, grade3c_2, grade3d_2));

        CourseGrade courseGrade4a_project_1 = createCourseGrade(student1, course4, 87.325, Arrays.asList(grade4a_1, grade4b_1, grade4c_1, grade4d_1));
        CourseGrade courseGrade4a_project_2 = createCourseGrade(student2, course4, 87.95, Arrays.asList(grade4a_2, grade4b_2, grade4c_2, grade4d_2));

        CourseGrade courseGrade5a_project_3 = createCourseGrade(student3, course5, 86.45, Arrays.asList(grade5a_3, grade5b_3, grade5c_3, grade5d_3));
        CourseGrade courseGrade5a_project_4 = createCourseGrade(student4, course5, 87.725, Arrays.asList(grade5a_4, grade5b_4, grade5c_4, grade5d_4));

        CourseGrade courseGrade6a_project_3 = createCourseGrade(student3, course6, 87.32, Arrays.asList(grade6a_3, grade6b_3, grade6c_3, grade6d_3, grade6e_3));
        CourseGrade courseGrade6a_project_4 = createCourseGrade(student4, course6, 88.14, Arrays.asList(grade6a_4, grade6b_4, grade6c_4, grade6d_4, grade6e_4));

        CourseGrade courseGrade7a_project_3 = createCourseGrade(student3, course7, 88.28, Arrays.asList(grade7a_3, grade7b_3, grade7c_3, grade7d_3));
        CourseGrade courseGrade7a_project_4 = createCourseGrade(student4, course7, 88.35, Arrays.asList(grade7a_4, grade7b_4, grade7c_4, grade7d_4));

        CourseGrade courseGrade8a_project_3 = createCourseGrade(student3, course8, 86.74, Arrays.asList(grade8a_3, grade8b_3, grade8c_3, grade8d_3, grade8e_3));
        CourseGrade courseGrade8a_project_4 = createCourseGrade(student4, course8, 88.62, Arrays.asList(grade8a_4, grade8b_4, grade8c_4, grade8d_4, grade8e_4));

        CourseGrade courseGrade9a_project_5 = createCourseGrade(student5, course9, 87.57, Arrays.asList(grade9a_5, grade9b_5, grade9c_5));
        CourseGrade courseGrade9a_project_6 = createCourseGrade(student6, course9, 88.4, Arrays.asList(grade9a_6, grade9b_6, grade9c_6));

        CourseGrade courseGrade10a_project_5 = createCourseGrade(student5, course10, 87.42, Arrays.asList(grade10a_5, grade10b_5, grade10c_5));
        CourseGrade courseGrade10a_project_6 = createCourseGrade(student6, course10, 88.5, Arrays.asList(grade10a_6, grade10b_6, grade10c_6));

        CourseGrade courseGrade11a_project_5 = createCourseGrade(student5, course11, 87.55, Arrays.asList(grade11a_5, grade11b_5, grade11c_5, grade11d_5));
        CourseGrade courseGrade11a_project_6 = createCourseGrade(student6, course11, 88.3, Arrays.asList(grade11a_6, grade11b_6, grade11c_6, grade11d_6));

        CourseGrade courseGrade12a_project_5 = createCourseGrade(student5, course12, 87.76, Arrays.asList(grade12a_5, grade12b_5, grade12c_5, grade12d_5, grade12e_5));
        CourseGrade courseGrade12a_project_6 = createCourseGrade(student6, course12, 87.4, Arrays.asList(grade12a_6, grade12b_6, grade12c_6, grade12d_6, grade12e_6));

        CourseGrade courseGrade13a_project_7 = createCourseGrade(student7, course13, 88.1, Arrays.asList(grade13a_7, grade13b_7, grade13c_7, grade13d_7));
        CourseGrade courseGrade13a_project_8 = createCourseGrade(student8, course13, 87.6, Arrays.asList(grade13a_8, grade13b_8, grade13c_8, grade13d_8));

        CourseGrade courseGrade14a_project_7 = createCourseGrade(student7, course14, 88.425, Arrays.asList(grade14a_7, grade14b_7, grade14c_7, grade14d_7));
        CourseGrade courseGrade14a_project_8 = createCourseGrade(student8, course14, 88.2, Arrays.asList(grade14a_8, grade14b_8, grade14c_8, grade14d_8));

        CourseGrade courseGrade15a_project_7 = createCourseGrade(student7, course15, 87.5, Arrays.asList(grade15a_7, grade15b_7, grade15c_7));
        CourseGrade courseGrade15a_project_8 = createCourseGrade(student8, course15, 87.6, Arrays.asList(grade15a_8, grade15b_8, grade15c_8));

        CourseGrade courseGrade16a_project_7 = createCourseGrade(student7, course16, 88.47, Arrays.asList(grade16a_7, grade16b_7, grade16c_7));
        CourseGrade courseGrade16a_project_8 = createCourseGrade(student8, course16, 88.33, Arrays.asList(grade16a_8, grade16b_8, grade16c_8));

        CourseGrade courseGrade17a_project_9 = createCourseGrade(student9, course17, 88.53, Arrays.asList(grade17a_9, grade17b_9, grade17c_9, grade17d_9));
        CourseGrade courseGrade17a_project_10 = createCourseGrade(student10, course17, 88.03, Arrays.asList(grade17a_10, grade17b_10, grade17c_10, grade17d_10));

        CourseGrade courseGrade18a_project_9 = createCourseGrade(student9, course18, 88.23, Arrays.asList(grade18a_9, grade18b_9, grade18c_9));
        CourseGrade courseGrade18a_project_10 = createCourseGrade(student10, course18, 87.87, Arrays.asList(grade18a_10, grade18b_10, grade18c_10));

        CourseGrade courseGrade19a_project_9 = createCourseGrade(student9, course19, 87.9, Arrays.asList(grade19a_9, grade19b_9, grade19c_9));
        CourseGrade courseGrade19a_project_10 = createCourseGrade(student10, course19, 87.4, Arrays.asList(grade19a_10, grade19b_10, grade19c_10));

        CourseGrade courseGrade20a_project_9 = createCourseGrade(student9, course20, 88.88, Arrays.asList(grade20a_9, grade20b_9, grade20c_9, grade20d_9));
        CourseGrade courseGrade20a_project_10 = createCourseGrade(student10, course20, 87.45, Arrays.asList(grade20a_10, grade20b_10, grade20c_10, grade20d_10));
        courseGradeRepo.saveAllAndFlush(Arrays.asList(courseGrade1a_project_1, courseGrade2a_project_1, courseGrade3a_project_1, courseGrade4a_project_1, courseGrade1a_project_2, courseGrade2a_project_2, courseGrade3a_project_2, courseGrade4a_project_2, courseGrade5a_project_3, courseGrade6a_project_3, courseGrade7a_project_3, courseGrade8a_project_3, courseGrade5a_project_4, courseGrade6a_project_4, courseGrade7a_project_4, courseGrade8a_project_4, courseGrade9a_project_5, courseGrade10a_project_5, courseGrade11a_project_5, courseGrade12a_project_5, courseGrade9a_project_6, courseGrade10a_project_6, courseGrade11a_project_6, courseGrade12a_project_6, courseGrade13a_project_7, courseGrade14a_project_7, courseGrade15a_project_7, courseGrade16a_project_7, courseGrade13a_project_8, courseGrade14a_project_8, courseGrade15a_project_8, courseGrade16a_project_8, courseGrade17a_project_9, courseGrade18a_project_9, courseGrade19a_project_9, courseGrade20a_project_9, courseGrade17a_project_10, courseGrade18a_project_10, courseGrade19a_project_10, courseGrade20a_project_10));


        Feedback feedback1a_project_1 = createFeedback("Great project submission, student1!", submission1a_project_1);
        Feedback feedback1a_project_2 = createFeedback("Well done, student2!", submission1a_project_2);

        Feedback feedback1b_project_1 = createFeedback("Excellent effort, student1.", submission1b_project_1);
        Feedback feedback1b_project_2 = createFeedback("Nice project work, student2.", submission1b_project_2);

        Feedback feedback1c_project_1 = createFeedback("Good job, student1.", submission1c_project_1);
        Feedback feedback1c_project_2 = createFeedback("Strong performance, student2.", submission1c_project_2);

        Feedback feedback1d_project_1 = createFeedback("Well written, student1.", submission1d_project_1);
        Feedback feedback1d_project_2 = createFeedback("Great job, student2.", submission1d_project_2);

        Feedback feedback1e_project_1 = createFeedback("Impressive work, student1!", submission1e_project_1);
        Feedback feedback1e_project_2 = createFeedback("Solid project submission, student2.", submission1e_project_2);

        Feedback feedback1f_project_1 = createFeedback("Very good effort, student1.", submission1f_project_1);
        Feedback feedback1f_project_2 = createFeedback("Nice job, student2.", submission1f_project_2);

        Feedback feedback2a_project_1 = createFeedback("Great project submission, student1!", submission2a_project_1);
        Feedback feedback2a_project_2 = createFeedback("Well done, student2!", submission2a_project_2);

        Feedback feedback2b_project_1 = createFeedback("Excellent effort, student1.", submission2b_project_1);
        Feedback feedback2b_project_2 = createFeedback("Nice project work, student2.", submission2b_project_2);

        Feedback feedback2c_project_1 = createFeedback("Good job, student1.", submission2c_project_1);
        Feedback feedback2c_project_2 = createFeedback("Strong performance, student2.", submission2c_project_2);

        Feedback feedback2d_project_1 = createFeedback("Well written, student1.", submission2d_project_1);
        Feedback feedback2d_project_2 = createFeedback("Great job, student2.", submission2d_project_2);

        Feedback feedback2e_project_1 = createFeedback("Impressive work, student1!", submission2e_project_1);
        Feedback feedback2e_project_2 = createFeedback("Solid project submission, student2.", submission2e_project_2);

        Feedback feedback2f_project_1 = createFeedback("Very good effort, student1.", submission2f_project_1);
        Feedback feedback2f_project_2 = createFeedback("Nice job, student2.", submission2f_project_2);

        Feedback feedback3a_project_1 = createFeedback("Great project submission, student1!", submission3a_project_1);
        Feedback feedback3a_project_2 = createFeedback("Well done, student2!", submission3a_project_2);

        Feedback feedback3b_project_1 = createFeedback("Excellent effort, student1.", submission3b_project_1);
        Feedback feedback3b_project_2 = createFeedback("Nice project work, student2.", submission3b_project_2);

        Feedback feedback3c_project_1 = createFeedback("Good job, student1.", submission3c_project_1);
        Feedback feedback3c_project_2 = createFeedback("Strong performance, student2.", submission3c_project_2);

        Feedback feedback3d_project_1 = createFeedback("Well written, student1.", submission3d_project_1);
        Feedback feedback3d_project_2 = createFeedback("Great job, student2.", submission3d_project_2);

        Feedback feedback4a_project_1 = createFeedback("Great project submission, student1!", submission4a_project_1);
        Feedback feedback4a_project_2 = createFeedback("Well done, student2!", submission4a_project_2);

        Feedback feedback4b_project_1 = createFeedback("Excellent effort, student1.", submission4b_project_1);
        Feedback feedback4b_project_2 = createFeedback("Nice project work, student2.", submission4b_project_2);

        Feedback feedback4c_project_1 = createFeedback("Good job, student1.", submission4c_project_1);
        Feedback feedback4c_project_2 = createFeedback("Strong performance, student2.", submission4c_project_2);

        Feedback feedback4d_project_1 = createFeedback("Well written, student1.", submission4d_project_1);
        Feedback feedback4d_project_2 = createFeedback("Great job, student2.", submission4d_project_2);

        Feedback feedback5a_project_3 = createFeedback("Great project submission, student3!", submission5a_project_3);
        Feedback feedback5a_project_4 = createFeedback("Well done, student4!", submission5a_project_4);

        Feedback feedback5b_project_3 = createFeedback("Excellent effort, student3.", submission5b_project_3);
        Feedback feedback5b_project_4 = createFeedback("Nice project work, student4.", submission5b_project_4);

        Feedback feedback5c_project_3 = createFeedback("Good job, student3.", submission5c_project_3);
        Feedback feedback5c_project_4 = createFeedback("Strong performance, student4.", submission5c_project_4);

        Feedback feedback5d_project_3 = createFeedback("Well written, student3.", submission5d_project_3);
        Feedback feedback5d_project_4 = createFeedback("Great job, student4.", submission5d_project_4);

        Feedback feedback6a_project_3 = createFeedback("Great project submission, student3!", submission6a_project_3);
        Feedback feedback6a_project_4 = createFeedback("Well done, student4!", submission6a_project_4);

        Feedback feedback6b_project_3 = createFeedback("Excellent effort, student3.", submission6b_project_3);
        Feedback feedback6b_project_4 = createFeedback("Nice project work, student4.", submission6b_project_4);

        Feedback feedback6c_project_3 = createFeedback("Good job, student3.", submission6c_project_3);
        Feedback feedback6c_project_4 = createFeedback("Strong performance, student4.", submission6c_project_4);

        Feedback feedback6d_project_3 = createFeedback("Well written, student3.", submission6d_project_3);
        Feedback feedback6d_project_4 = createFeedback("Great job, student4.", submission6d_project_4);

        Feedback feedback6e_project_3 = createFeedback("Impressive work, student3!", submission6e_project_3);
        Feedback feedback6e_project_4 = createFeedback("Solid project submission, student4.", submission6e_project_4);

        Feedback feedback7a_project_3 = createFeedback("Great project submission, student3!", submission7a_project_3);
        Feedback feedback7a_project_4 = createFeedback("Well done, student4!", submission7a_project_4);

        Feedback feedback7b_project_3 = createFeedback("Excellent effort, student3.", submission7b_project_3);
        Feedback feedback7b_project_4 = createFeedback("Nice project work, student4.", submission7b_project_4);

        Feedback feedback7c_project_3 = createFeedback("Good job, student3.", submission7c_project_3);
        Feedback feedback7c_project_4 = createFeedback("Strong performance, student4.", submission7c_project_4);

        Feedback feedback7d_project_3 = createFeedback("Well written, student3.", submission7d_project_3);
        Feedback feedback7d_project_4 = createFeedback("Great job, student4.", submission7d_project_4);

        Feedback feedback8a_project_3 = createFeedback("Great project submission, student3!", submission8a_project_3);
        Feedback feedback8a_project_4 = createFeedback("Well done, student4!", submission8a_project_4);

        Feedback feedback8b_project_3 = createFeedback("Excellent effort, student3.", submission8b_project_3);
        Feedback feedback8b_project_4 = createFeedback("Nice project work, student4.", submission8b_project_4);

        Feedback feedback8c_project_3 = createFeedback("Good job, student3.", submission8c_project_3);
        Feedback feedback8c_project_4 = createFeedback("Strong performance, student4.", submission8c_project_4);

        Feedback feedback8d_project_3 = createFeedback("Well written, student3.", submission8d_project_3);
        Feedback feedback8d_project_4 = createFeedback("Great job, student4.", submission8d_project_4);

        Feedback feedback8e_project_3 = createFeedback("Impressive work, student3!", submission8e_project_3);
        Feedback feedback8e_project_4 = createFeedback("Solid project submission, student4.", submission8e_project_4);

        Feedback feedback9a_project_5 = createFeedback("Great project submission, student5!", submission9a_project_5);
        Feedback feedback9a_project_6 = createFeedback("Well done, student6!", submission9a_project_6);

        Feedback feedback9b_project_5 = createFeedback("Excellent effort, student5.", submission9b_project_5);
        Feedback feedback9b_project_6 = createFeedback("Nice project work, student6.", submission9b_project_6);

        Feedback feedback9c_project_5 = createFeedback("Good job, student5.", submission9c_project_5);
        Feedback feedback9c_project_6 = createFeedback("Strong performance, student6.", submission9c_project_6);

        Feedback feedback10a_project_5 = createFeedback("Great project submission, student5!", submission10a_project_5);
        Feedback feedback10a_project_6 = createFeedback("Well done, student6!", submission10a_project_6);

        Feedback feedback10b_project_5 = createFeedback("Excellent effort, student5.", submission10b_project_5);
        Feedback feedback10b_project_6 = createFeedback("Nice project work, student6.", submission10b_project_6);

        Feedback feedback10c_project_5 = createFeedback("Good job, student5.", submission10c_project_5);
        Feedback feedback10c_project_6 = createFeedback("Strong performance, student6.", submission10c_project_6);

        Feedback feedback10d_project_5 = createFeedback("Well written, student5.", submission10d_project_5);
        Feedback feedback10d_project_6 = createFeedback("Great job, student6.", submission10d_project_6);

        Feedback feedback11a_project_5 = createFeedback("Great project submission, student5!", submission11a_project_5);
        Feedback feedback11a_project_6 = createFeedback("Well done, student6!", submission11a_project_6);

        Feedback feedback11b_project_5 = createFeedback("Excellent effort, student5.", submission11b_project_5);
        Feedback feedback11b_project_6 = createFeedback("Nice project work, student6.", submission11b_project_6);

        Feedback feedback11c_project_5 = createFeedback("Good job, student5.", submission11c_project_5);
        Feedback feedback11c_project_6 = createFeedback("Strong performance, student6.", submission11c_project_6);

        Feedback feedback11d_project_5 = createFeedback("Well written, student5.", submission11d_project_5);
        Feedback feedback11d_project_6 = createFeedback("Great job, student6.", submission11d_project_6);

        Feedback feedback12a_project_5 = createFeedback("Great project submission, student5!", submission12a_project_5);
        Feedback feedback12a_project_6 = createFeedback("Well done, student6!", submission12a_project_6);

        Feedback feedback12b_project_5 = createFeedback("Excellent effort, student5.", submission12b_project_5);
        Feedback feedback12b_project_6 = createFeedback("Nice project work, student6.", submission12b_project_6);

        Feedback feedback12c_project_5 = createFeedback("Good job, student5.", submission12c_project_5);
        Feedback feedback12c_project_6 = createFeedback("Strong performance, student6.", submission12c_project_6);

        Feedback feedback12d_project_5 = createFeedback("Well written, student5.", submission12d_project_5);
        Feedback feedback12d_project_6 = createFeedback("Great job, student6.", submission12d_project_6);

        Feedback feedback12e_project_5 = createFeedback("Impressive work, student5!", submission12e_project_5);
        Feedback feedback12e_project_6 = createFeedback("Solid project submission, student6.", submission12e_project_6);

        Feedback feedback13a_project_7 = createFeedback("Great project submission, student7!", submission13a_project_7);
        Feedback feedback13a_project_8 = createFeedback("Well done, student8!", submission13a_project_8);

        Feedback feedback13b_project_7 = createFeedback("Excellent effort, student7.", submission13b_project_7);
        Feedback feedback13b_project_8 = createFeedback("Nice project work, student8.", submission13b_project_8);

        Feedback feedback13c_project_7 = createFeedback("Good job, student7.", submission13c_project_7);
        Feedback feedback13c_project_8 = createFeedback("Strong performance, student8.", submission13c_project_8);

        Feedback feedback13d_project_7 = createFeedback("Well written, student7.", submission13d_project_7);
        Feedback feedback13d_project_8 = createFeedback("Great job, student8.", submission13d_project_8);

        Feedback feedback14a_project_7 = createFeedback("Great project submission, student7!", submission14a_project_7);
        Feedback feedback14a_project_8 = createFeedback("Well done, student8!", submission14a_project_8);

        Feedback feedback14b_project_7 = createFeedback("Excellent effort, student7.", submission14b_project_7);
        Feedback feedback14b_project_8 = createFeedback("Nice project work, student8.", submission14b_project_8);

        Feedback feedback14c_project_7 = createFeedback("Good job, student7.", submission14c_project_7);
        Feedback feedback14c_project_8 = createFeedback("Strong performance, student8.", submission14c_project_8);

        Feedback feedback14d_project_7 = createFeedback("Well written, student7.", submission14d_project_7);
        Feedback feedback14d_project_8 = createFeedback("Great job, student8.", submission14d_project_8);

        Feedback feedback15a_project_7 = createFeedback("Great project submission, student7!", submission15a_project_7);
        Feedback feedback15a_project_8 = createFeedback("Well done, student8!", submission15a_project_8);

        Feedback feedback15b_project_7 = createFeedback("Excellent effort, student7.", submission15b_project_7);
        Feedback feedback15b_project_8 = createFeedback("Nice project work, student8.", submission15b_project_8);

        Feedback feedback15c_project_7 = createFeedback("Good job, student7.", submission15c_project_7);
        Feedback feedback15c_project_8 = createFeedback("Strong performance, student8.", submission15c_project_8);

        Feedback feedback16a_project_7 = createFeedback("Great project submission, student7!", submission16a_project_7);
        Feedback feedback16a_project_8 = createFeedback("Well done, student8!", submission16a_project_8);

        Feedback feedback16b_project_7 = createFeedback("Excellent effort, student7.", submission16b_project_7);
        Feedback feedback16b_project_8 = createFeedback("Nice project work, student8.", submission16b_project_8);

        Feedback feedback16c_project_7 = createFeedback("Good job, student7.", submission16c_project_7);
        Feedback feedback16c_project_8 = createFeedback("Strong performance, student8.", submission16c_project_8);

        Feedback feedback17a_project_9 = createFeedback("Great project submission, student9!", submission17a_project_9);
        Feedback feedback17a_project_10 = createFeedback("Well done, student10!", submission17a_project_10);

        Feedback feedback17b_project_9 = createFeedback("Excellent effort, student9.", submission17b_project_9);
        Feedback feedback17b_project_10 = createFeedback("Nice project work, student10.", submission17b_project_10);

        Feedback feedback17c_project_9 = createFeedback("Good job, student9.", submission17c_project_9);
        Feedback feedback17c_project_10 = createFeedback("Strong performance, student10.", submission17c_project_10);

        Feedback feedback17d_project_9 = createFeedback("Well written, student9.", submission17d_project_9);
        Feedback feedback17d_project_10 = createFeedback("Great job, student10.", submission17d_project_10);

        Feedback feedback18a_project_9 = createFeedback("Great project submission, student9!", submission18a_project_9);
        Feedback feedback18a_project_10 = createFeedback("Well done, student10!", submission18a_project_10);

        Feedback feedback18b_project_9 = createFeedback("Excellent effort, student9.", submission18b_project_9);
        Feedback feedback18b_project_10 = createFeedback("Nice project work, student10.", submission18b_project_10);

        Feedback feedback18c_project_9 = createFeedback("Good job, student9.", submission18c_project_9);
        Feedback feedback18c_project_10 = createFeedback("Strong performance, student10.", submission18c_project_10);

        Feedback feedback19a_project_9 = createFeedback("Great project submission, student9!", submission19a_project_9);
        Feedback feedback19a_project_10 = createFeedback("Well done, student10!", submission19a_project_10);

        Feedback feedback19b_project_9 = createFeedback("Excellent effort, student9.", submission19b_project_9);
        Feedback feedback19b_project_10 = createFeedback("Nice project work, student10.", submission19b_project_10);

        Feedback feedback19c_project_9 = createFeedback("Good job, student9.", submission19c_project_9);
        Feedback feedback19c_project_10 = createFeedback("Strong performance, student10.", submission19c_project_10);

        Feedback feedback20a_project_9 = createFeedback("Great project submission, student9!", submission20a_project_9);
        Feedback feedback20a_project_10 = createFeedback("Well done, student10!", submission20a_project_10);

        Feedback feedback20b_project_9 = createFeedback("Excellent effort, student9.", submission20b_project_9);
        Feedback feedback20b_project_10 = createFeedback("Nice project work, student10.", submission20b_project_10);

        Feedback feedback20c_project_9 = createFeedback("Good job, student9.", submission20c_project_9);
        Feedback feedback20c_project_10 = createFeedback("Strong performance, student10.", submission20c_project_10);

        Feedback feedback20d_project_9 = createFeedback("Well written, student9.", submission20d_project_9);
        Feedback feedback20d_project_10 = createFeedback("Great job, student10.", submission20d_project_10);
        feedbackRepo.saveAllAndFlush(Arrays.asList(feedback1a_project_1, feedback1b_project_1, feedback1c_project_1, feedback1d_project_1, feedback1e_project_1, feedback1f_project_1, feedback2a_project_1, feedback2b_project_1, feedback2c_project_1, feedback2d_project_1, feedback2e_project_1, feedback2f_project_1, feedback3a_project_1, feedback3b_project_1, feedback3c_project_1, feedback3d_project_1, feedback4a_project_1, feedback4b_project_1, feedback4c_project_1, feedback4d_project_1, feedback1a_project_2, feedback1b_project_2, feedback1c_project_2, feedback1d_project_2, feedback1e_project_2, feedback1f_project_2, feedback2a_project_2, feedback2b_project_2, feedback2c_project_2, feedback2d_project_2, feedback2e_project_2, feedback2f_project_2, feedback3a_project_2, feedback3b_project_2, feedback3c_project_2, feedback3d_project_2, feedback4a_project_2, feedback4b_project_2, feedback4c_project_2, feedback4d_project_2, feedback5a_project_3, feedback5b_project_3, feedback5c_project_3, feedback5d_project_3, feedback6a_project_3, feedback6b_project_3, feedback6c_project_3, feedback6d_project_3, feedback6e_project_3, feedback7a_project_3, feedback7b_project_3, feedback7c_project_3, feedback7d_project_3, feedback8a_project_3, feedback8b_project_3, feedback8c_project_3, feedback8d_project_3, feedback8e_project_3, feedback5a_project_4, feedback5b_project_4, feedback5c_project_4, feedback5d_project_4, feedback6a_project_4, feedback6b_project_4, feedback6c_project_4, feedback6d_project_4, feedback6e_project_4, feedback7a_project_4, feedback7b_project_4, feedback7c_project_4, feedback7d_project_4, feedback8a_project_4, feedback8b_project_4, feedback8c_project_4, feedback8d_project_4, feedback8e_project_4, feedback9a_project_5, feedback9b_project_5, feedback9c_project_5, feedback10a_project_5, feedback10b_project_5, feedback10c_project_5, feedback10d_project_5, feedback11a_project_5, feedback11b_project_5, feedback11c_project_5, feedback11d_project_5, feedback12a_project_5, feedback12b_project_5, feedback12c_project_5, feedback12d_project_5, feedback12e_project_5, feedback9a_project_6, feedback9b_project_6, feedback9c_project_6, feedback10a_project_6, feedback10b_project_6, feedback10c_project_6, feedback10d_project_6, feedback11a_project_6, feedback11b_project_6, feedback11c_project_6, feedback11d_project_6, feedback12a_project_6, feedback12b_project_6, feedback12c_project_6, feedback12d_project_6, feedback12e_project_6, feedback13a_project_7, feedback13b_project_7, feedback13c_project_7, feedback13d_project_7, feedback14a_project_7, feedback14b_project_7, feedback14c_project_7, feedback14d_project_7, feedback15a_project_7, feedback15b_project_7, feedback15c_project_7, feedback16a_project_7, feedback16b_project_7, feedback16c_project_7, feedback13a_project_8, feedback13b_project_8, feedback13c_project_8, feedback13d_project_8, feedback14a_project_8, feedback14b_project_8, feedback14c_project_8, feedback14d_project_8, feedback15a_project_8, feedback15b_project_8, feedback15c_project_8, feedback16a_project_8, feedback16b_project_8, feedback16c_project_8, feedback17a_project_9, feedback17b_project_9, feedback17c_project_9, feedback17d_project_9, feedback18a_project_9, feedback18b_project_9, feedback18c_project_9, feedback19a_project_9, feedback19b_project_9, feedback19c_project_9, feedback20a_project_9, feedback20b_project_9, feedback20c_project_9, feedback20d_project_9, feedback17a_project_10, feedback17b_project_10, feedback17c_project_10, feedback17d_project_10, feedback18a_project_10, feedback18b_project_10, feedback18c_project_10, feedback19a_project_10, feedback19b_project_10, feedback19c_project_10, feedback19c_project_10, feedback20a_project_10, feedback20b_project_10, feedback20c_project_10, feedback20d_project_10));

        // Set one grade per course for the first 10 courses

        // Set two grades per course for the first 20 courses

        course1.setGrades(Arrays.asList(grade1a_1, grade1a_2));
        course2.setGrades(Arrays.asList(grade2a_1, grade2a_2));
        course3.setGrades(Arrays.asList(grade3a_1, grade3a_2));
        course4.setGrades(Arrays.asList(grade4a_1, grade4a_2));
        course5.setGrades(Arrays.asList(grade5a_3, grade5a_4));
        course6.setGrades(Arrays.asList(grade6a_3, grade6a_4));
        course7.setGrades(Arrays.asList(grade7a_3, grade7a_4));
        course8.setGrades(Arrays.asList(grade8a_3, grade8a_4));
        course9.setGrades(Arrays.asList(grade9a_5, grade9a_6));
        course10.setGrades(Arrays.asList(grade10a_5, grade10a_6));
        course11.setGrades(Arrays.asList(grade11a_5, grade11a_6));
        course12.setGrades(Arrays.asList(grade12a_5, grade12a_6));
        course13.setGrades(Arrays.asList(grade13a_7, grade13a_8));
        course14.setGrades(Arrays.asList(grade14a_7, grade14a_8));
        course15.setGrades(Arrays.asList(grade15a_7, grade15a_8));
        course16.setGrades(Arrays.asList(grade16a_7, grade16a_8));
        course17.setGrades(Arrays.asList(grade17a_9, grade17a_10));
        course18.setGrades(Arrays.asList(grade18a_9, grade18a_10));
        course19.setGrades(Arrays.asList(grade19a_9, grade19a_10));
        course20.setGrades(Arrays.asList(grade20a_9, grade20a_10));


        // Set course grades for all courses

        course1.setCourseGrades(Arrays.asList(courseGrade1a_project_1, courseGrade1a_project_2));
        course2.setCourseGrades(Arrays.asList(courseGrade2a_project_1, courseGrade2a_project_2));
        course3.setCourseGrades(Arrays.asList(courseGrade3a_project_1, courseGrade3a_project_2));
        course4.setCourseGrades(Arrays.asList(courseGrade4a_project_1, courseGrade4a_project_2));
        course5.setCourseGrades(Arrays.asList(courseGrade5a_project_3, courseGrade5a_project_4));
        course6.setCourseGrades(Arrays.asList(courseGrade6a_project_3, courseGrade6a_project_4));
        course7.setCourseGrades(Arrays.asList(courseGrade7a_project_3, courseGrade7a_project_4));
        course8.setCourseGrades(Arrays.asList(courseGrade8a_project_3, courseGrade8a_project_4));
        course9.setCourseGrades(Arrays.asList(courseGrade9a_project_5, courseGrade9a_project_6));
        course10.setCourseGrades(Arrays.asList(courseGrade10a_project_5, courseGrade10a_project_6));
        course11.setCourseGrades(Arrays.asList(courseGrade11a_project_5, courseGrade11a_project_6));
        course12.setCourseGrades(Arrays.asList(courseGrade12a_project_5, courseGrade12a_project_6));
        course13.setCourseGrades(Arrays.asList(courseGrade13a_project_7, courseGrade13a_project_8));
        course14.setCourseGrades(Arrays.asList(courseGrade14a_project_7, courseGrade14a_project_8));
        course15.setCourseGrades(Arrays.asList(courseGrade15a_project_7, courseGrade15a_project_8));
        course16.setCourseGrades(Arrays.asList(courseGrade16a_project_7, courseGrade16a_project_8));
        course17.setCourseGrades(Arrays.asList(courseGrade17a_project_9, courseGrade17a_project_10));
        course18.setCourseGrades(Arrays.asList(courseGrade18a_project_9, courseGrade18a_project_10));
        course19.setCourseGrades(Arrays.asList(courseGrade19a_project_9, courseGrade19a_project_10));
        course20.setCourseGrades(Arrays.asList(courseGrade20a_project_9, courseGrade20a_project_10));

        createFacultyWithProject(faculty1, Arrays.asList(grade1a_1, grade1a_2, grade1b_1, grade1b_2, grade1c_1, grade1c_2, grade1d_1, grade1d_2, grade1e_1, grade1e_2, grade1f_1, grade1f_2), Arrays.asList(project1a, project1b, project1c, project1d, project1e, project1f));
        createFacultyWithProject(faculty2, Arrays.asList(grade2a_1, grade2a_2, grade2b_1, grade2b_2, grade2c_1, grade2c_2, grade2d_1, grade2d_2, grade2e_1, grade2e_2, grade2f_1, grade2f_2), Arrays.asList(project2a, project2b, project2c, project2d, project2e, project2f));
        createFacultyWithProject(faculty3, Arrays.asList(grade3a_1, grade3a_2, grade3b_1, grade3b_2, grade3c_1, grade3c_2, grade3d_1, grade3d_2), Arrays.asList(project3a, project3b, project3c, project3d));
        createFacultyWithProject(faculty4, Arrays.asList(grade4a_1, grade4a_2, grade4b_1, grade4b_2, grade4c_1, grade4c_2, grade4d_1, grade4d_2), Arrays.asList(project4a, project4b, project4c, project4d));
        createFacultyWithProject(faculty5, Arrays.asList(grade5a_3, grade5a_4, grade5b_3, grade5b_4, grade5c_3, grade5c_4, grade5d_3, grade5d_4), Arrays.asList(project5a, project5b, project5c, project5d));
        createFacultyWithProject(faculty1, Arrays.asList(grade6a_3, grade6a_4, grade6b_3, grade6b_4, grade6c_3, grade6c_4, grade6d_3, grade6d_4, grade6e_3, grade6e_4), Arrays.asList(project6a, project6b, project6c, project6d, project6e));
        createFacultyWithProject(faculty2, Arrays.asList(grade7a_3, grade7a_4, grade7b_3, grade7b_4, grade7c_3, grade7c_4, grade7d_3, grade7d_4), Arrays.asList(project7a, project7b, project7c, project7d));
        createFacultyWithProject(faculty3, Arrays.asList(grade8a_3, grade8a_4, grade8b_3, grade8b_4, grade8c_3, grade8c_4, grade8d_3, grade8d_4, grade8e_3, grade8e_4), Arrays.asList(project8a, project8b, project8c, project8d, project8e));
        createFacultyWithProject(faculty4, Arrays.asList(grade9a_5, grade9a_6, grade9b_5, grade9b_6, grade9c_5, grade9c_6), Arrays.asList(project9a, project9b, project9c));
        createFacultyWithProject(faculty5, Arrays.asList(grade10a_5, grade10a_6, grade10b_5, grade10b_6, grade10c_5, grade10c_6, grade10d_5, grade10d_6), Arrays.asList(project10a, project10b, project10c, project10d));
        createFacultyWithProject(faculty1, Arrays.asList(grade11a_5, grade11a_6, grade11b_5, grade11b_6, grade11c_5, grade11c_6, grade11d_5, grade11d_6), Arrays.asList(project11a, project11b, project11c, project11d));
        createFacultyWithProject(faculty2, Arrays.asList(grade12a_5, grade12a_6, grade12b_5, grade12b_6, grade12c_5, grade12c_6, grade12d_5, grade12d_6, grade12e_5, grade12e_6), Arrays.asList(project12a, project12b, project12c, project12d, project12e));
        createFacultyWithProject(faculty3, Arrays.asList(grade13a_7, grade13a_8, grade13b_7, grade13b_8, grade13c_7, grade13c_8, grade13d_7, grade13d_8), Arrays.asList(project13a, project13b, project13c, project13d));
        createFacultyWithProject(faculty4, Arrays.asList(grade14a_7, grade14a_8, grade14b_7, grade14b_8, grade14c_7, grade14c_8, grade14d_7, grade14d_8), Arrays.asList(project14a, project14b, project14c, project14d));
        createFacultyWithProject(faculty5, Arrays.asList(grade15a_7, grade15a_8, grade15b_7, grade15b_8, grade15c_7, grade15c_8), Arrays.asList(project15a, project15b, project15c));
        createFacultyWithProject(faculty1, Arrays.asList(grade16a_7, grade16a_8, grade16b_7, grade16b_8, grade16c_7, grade16c_8), Arrays.asList(project16a, project16b, project16c));
        createFacultyWithProject(faculty2, Arrays.asList(grade17a_9, grade17a_10, grade17b_9, grade17b_10, grade17c_9, grade17c_10, grade17d_9, grade17d_10), Arrays.asList(project17a, project17b, project17c, project17d));
        createFacultyWithProject(faculty3, Arrays.asList(grade18a_9, grade18a_10, grade18b_9, grade18b_10, grade18c_9, grade18c_10), Arrays.asList(project18a, project18b, project18c));
        createFacultyWithProject(faculty4, Arrays.asList(grade19a_9, grade19a_10, grade19b_9, grade19b_10, grade19c_9, grade19c_10), Arrays.asList(project19a, project19b, project19c));
        createFacultyWithProject(faculty5, Arrays.asList(grade20a_9, grade20a_10, grade20b_9, grade20b_10, grade20c_9, grade20c_10, grade20d_9, grade20d_10), Arrays.asList(project20a, project20b, project20c, project20d));

        linkSubmissionDetails(submission1a_project_1, student1, grade1a_1, feedback1a_project_1, Arrays.asList(sa1a_project_student1));
        linkSubmissionDetails(submission1a_project_2, student2, grade1a_2, feedback1a_project_2, Arrays.asList(sa1a_project_student2));
        linkSubmissionDetails(submission1a_project_1, student1, grade1a_1, feedback1a_project_1, Arrays.asList(sa1a_project_student1));
        linkSubmissionDetails(submission1a_project_2, student2, grade1a_2, feedback1a_project_2, Arrays.asList(sa1a_project_student2));
        linkSubmissionDetails(submission1b_project_1, student1, grade1b_1, feedback1b_project_1, Arrays.asList(sa1b_project_student1));
        linkSubmissionDetails(submission1b_project_2, student2, grade1b_2, feedback1b_project_2, Arrays.asList(sa1b_project_student2));
        linkSubmissionDetails(submission1c_project_1, student1, grade1c_1, feedback1c_project_1, Arrays.asList(sa1c_project_student1));
        linkSubmissionDetails(submission1c_project_2, student2, grade1c_2, feedback1c_project_2, Arrays.asList(sa1c_project_student2));
        linkSubmissionDetails(submission1d_project_1, student1, grade1d_1, feedback1d_project_1, Arrays.asList(sa1d_project_student1));
        linkSubmissionDetails(submission1d_project_2, student2, grade1d_2, feedback1d_project_2, Arrays.asList(sa1d_project_student2));
        linkSubmissionDetails(submission1e_project_1, student1, grade1e_1, feedback1e_project_1, Arrays.asList(sa1e_project_student1));
        linkSubmissionDetails(submission1e_project_2, student2, grade1e_2, feedback1e_project_2, Arrays.asList(sa1e_project_student2));
        linkSubmissionDetails(submission1f_project_1, student1, grade1f_1, feedback1f_project_1, Arrays.asList(sa1f_project_student1));
        linkSubmissionDetails(submission1f_project_2, student2, grade1f_2, feedback1f_project_2, Arrays.asList(sa1f_project_student2));

        linkSubmissionDetails(submission2a_project_1, student1, grade2a_1, feedback2a_project_1, Arrays.asList(sa2a_project_student1));
        linkSubmissionDetails(submission2a_project_2, student2, grade2a_2, feedback2a_project_2, Arrays.asList(sa2a_project_student2));
        linkSubmissionDetails(submission2b_project_1, student1, grade2b_1, feedback2b_project_1, Arrays.asList(sa2b_project_student1));
        linkSubmissionDetails(submission2b_project_2, student2, grade2b_2, feedback2b_project_2, Arrays.asList(sa2b_project_student2));
        linkSubmissionDetails(submission2c_project_1, student1, grade2c_1, feedback2c_project_1, Arrays.asList(sa2c_project_student1));
        linkSubmissionDetails(submission2c_project_2, student2, grade2c_2, feedback2c_project_2, Arrays.asList(sa2c_project_student2));
        linkSubmissionDetails(submission2d_project_1, student1, grade2d_1, feedback2d_project_1, Arrays.asList(sa2d_project_student1));
        linkSubmissionDetails(submission2d_project_2, student2, grade2d_2, feedback2d_project_2, Arrays.asList(sa2d_project_student2));
        linkSubmissionDetails(submission2e_project_1, student1, grade2e_1, feedback2e_project_1, Arrays.asList(sa2e_project_student1));
        linkSubmissionDetails(submission2e_project_2, student2, grade2e_2, feedback2e_project_2, Arrays.asList(sa2e_project_student2));
        linkSubmissionDetails(submission2f_project_1, student1, grade2f_1, feedback2f_project_1, Arrays.asList(sa2f_project_student1));
        linkSubmissionDetails(submission2f_project_2, student2, grade2f_2, feedback2f_project_2, Arrays.asList(sa2f_project_student2));

        linkSubmissionDetails(submission3a_project_1, student1, grade3a_1, feedback3a_project_1, Arrays.asList(sa3a_project_student1));
        linkSubmissionDetails(submission3a_project_2, student2, grade3a_2, feedback3a_project_2, Arrays.asList(sa3a_project_student2));
        linkSubmissionDetails(submission3b_project_1, student1, grade3b_1, feedback3b_project_1, Arrays.asList(sa3b_project_student1));
        linkSubmissionDetails(submission3b_project_2, student2, grade3b_2, feedback3b_project_2, Arrays.asList(sa3b_project_student2));
        linkSubmissionDetails(submission3c_project_1, student1, grade3c_1, feedback3c_project_1, Arrays.asList(sa3c_project_student1));
        linkSubmissionDetails(submission3c_project_2, student2, grade3c_2, feedback3c_project_2, Arrays.asList(sa3c_project_student2));
        linkSubmissionDetails(submission3d_project_1, student1, grade3d_1, feedback3d_project_1, Arrays.asList(sa3d_project_student1));
        linkSubmissionDetails(submission3d_project_2, student2, grade3d_2, feedback3d_project_2, Arrays.asList(sa3d_project_student2));

        linkSubmissionDetails(submission4a_project_1, student1, grade4a_1, feedback4a_project_1, Arrays.asList(sa4a_project_student1));
        linkSubmissionDetails(submission4a_project_2, student2, grade4a_2, feedback4a_project_2, Arrays.asList(sa4a_project_student2));
        linkSubmissionDetails(submission4b_project_1, student1, grade4b_1, feedback4b_project_1, Arrays.asList(sa4b_project_student1));
        linkSubmissionDetails(submission4b_project_2, student2, grade4b_2, feedback4b_project_2, Arrays.asList(sa4b_project_student2));
        linkSubmissionDetails(submission4c_project_1, student1, grade4c_1, feedback4c_project_1, Arrays.asList(sa4c_project_student1));
        linkSubmissionDetails(submission4c_project_2, student2, grade4c_2, feedback4c_project_2, Arrays.asList(sa4c_project_student2));
        linkSubmissionDetails(submission4d_project_1, student1, grade4d_1, feedback4d_project_1, Arrays.asList(sa4d_project_student1));
        linkSubmissionDetails(submission4d_project_2, student2, grade4d_2, feedback4d_project_2, Arrays.asList(sa4d_project_student2));

        linkSubmissionDetails(submission5a_project_3, student3, grade5a_3, feedback5a_project_3, Arrays.asList(sa5a_project_student3));
        linkSubmissionDetails(submission5a_project_4, student4, grade5a_4, feedback5a_project_4, Arrays.asList(sa5a_project_student4));
        linkSubmissionDetails(submission5b_project_3, student3, grade5b_3, feedback5b_project_3, Arrays.asList(sa5b_project_student3));
        linkSubmissionDetails(submission5b_project_4, student4, grade5b_4, feedback5b_project_4, Arrays.asList(sa5b_project_student4));
        linkSubmissionDetails(submission5c_project_3, student3, grade5c_3, feedback5c_project_3, Arrays.asList(sa5c_project_student3));
        linkSubmissionDetails(submission5c_project_4, student4, grade5c_4, feedback5c_project_4, Arrays.asList(sa5c_project_student4));
        linkSubmissionDetails(submission5d_project_3, student3, grade5d_3, feedback5d_project_3, Arrays.asList(sa5d_project_student3));
        linkSubmissionDetails(submission5d_project_4, student4, grade5d_4, feedback5d_project_4, Arrays.asList(sa5d_project_student4));

        linkSubmissionDetails(submission6a_project_3, student3, grade6a_3, feedback6a_project_3, Arrays.asList(sa6a_project_student3));
        linkSubmissionDetails(submission6a_project_4, student4, grade6a_4, feedback6a_project_4, Arrays.asList(sa6a_project_student4));
        linkSubmissionDetails(submission6b_project_3, student3, grade6b_3, feedback6b_project_3, Arrays.asList(sa6b_project_student3));
        linkSubmissionDetails(submission6b_project_4, student4, grade6b_4, feedback6b_project_4, Arrays.asList(sa6b_project_student4));
        linkSubmissionDetails(submission6c_project_3, student3, grade6c_3, feedback6c_project_3, Arrays.asList(sa6c_project_student3));
        linkSubmissionDetails(submission6c_project_4, student4, grade6c_4, feedback6c_project_4, Arrays.asList(sa6c_project_student4));
        linkSubmissionDetails(submission6d_project_3, student3, grade6d_3, feedback6d_project_3, Arrays.asList(sa6d_project_student3));
        linkSubmissionDetails(submission6d_project_4, student4, grade6d_4, feedback6d_project_4, Arrays.asList(sa6d_project_student4));
        linkSubmissionDetails(submission6e_project_3, student3, grade6e_3, feedback6e_project_3, Arrays.asList(sa6e_project_student3));
        linkSubmissionDetails(submission6e_project_4, student4, grade6e_4, feedback6e_project_4, Arrays.asList(sa6e_project_student4));

        linkSubmissionDetails(submission7a_project_3, student3, grade7a_3, feedback7a_project_3, Arrays.asList(sa7a_project_student3));
        linkSubmissionDetails(submission7a_project_4, student4, grade7a_4, feedback7a_project_4, Arrays.asList(sa7a_project_student4));
        linkSubmissionDetails(submission7b_project_3, student3, grade7b_3, feedback7b_project_3, Arrays.asList(sa7b_project_student3));
        linkSubmissionDetails(submission7b_project_4, student4, grade7b_4, feedback7b_project_4, Arrays.asList(sa7b_project_student4));
        linkSubmissionDetails(submission7c_project_3, student3, grade7c_3, feedback7c_project_3, Arrays.asList(sa7c_project_student3));
        linkSubmissionDetails(submission7c_project_4, student4, grade7c_4, feedback7c_project_4, Arrays.asList(sa7c_project_student4));
        linkSubmissionDetails(submission7d_project_3, student3, grade7d_3, feedback7d_project_3, Arrays.asList(sa7d_project_student3));
        linkSubmissionDetails(submission7d_project_4, student4, grade7d_4, feedback7d_project_4, Arrays.asList(sa7d_project_student4));

        linkSubmissionDetails(submission8a_project_3, student3, grade8a_3, feedback8a_project_3, Arrays.asList(sa8a_project_student3));
        linkSubmissionDetails(submission8a_project_4, student4, grade8a_4, feedback8a_project_4, Arrays.asList(sa8a_project_student4));
        linkSubmissionDetails(submission8b_project_3, student3, grade8b_3, feedback8b_project_3, Arrays.asList(sa8b_project_student3));
        linkSubmissionDetails(submission8b_project_4, student4, grade8b_4, feedback8b_project_4, Arrays.asList(sa8b_project_student4));
        linkSubmissionDetails(submission8c_project_3, student3, grade8c_3, feedback8c_project_3, Arrays.asList(sa8c_project_student3));
        linkSubmissionDetails(submission8c_project_4, student4, grade8c_4, feedback8c_project_4, Arrays.asList(sa8c_project_student4));
        linkSubmissionDetails(submission8d_project_3, student3, grade8d_3, feedback8d_project_3, Arrays.asList(sa8d_project_student3));
        linkSubmissionDetails(submission8d_project_4, student4, grade8d_4, feedback8d_project_4, Arrays.asList(sa8d_project_student4));
        linkSubmissionDetails(submission8e_project_3, student3, grade8e_3, feedback8e_project_3, Arrays.asList(sa8e_project_student3));
        linkSubmissionDetails(submission8e_project_4, student4, grade8e_4, feedback8e_project_4, Arrays.asList(sa8e_project_student4));

        linkSubmissionDetails(submission9a_project_5, student5, grade9a_5, feedback9a_project_5, Arrays.asList(sa9a_project_student5));
        linkSubmissionDetails(submission9a_project_6, student6, grade9a_6, feedback9a_project_6, Arrays.asList(sa9a_project_student6));
        linkSubmissionDetails(submission9b_project_5, student5, grade9b_5, feedback9b_project_5, Arrays.asList(sa9b_project_student5));
        linkSubmissionDetails(submission9b_project_6, student6, grade9b_6, feedback9b_project_6, Arrays.asList(sa9b_project_student6));
        linkSubmissionDetails(submission9c_project_5, student5, grade9c_5, feedback9c_project_5, Arrays.asList(sa9c_project_student5));
        linkSubmissionDetails(submission9c_project_6, student6, grade9c_6, feedback9c_project_6, Arrays.asList(sa9c_project_student6));

        linkSubmissionDetails(submission10a_project_5, student5, grade10a_5, feedback10a_project_5, Arrays.asList(sa10a_project_student5));
        linkSubmissionDetails(submission10a_project_6, student6, grade10a_6, feedback10a_project_6, Arrays.asList(sa10a_project_student6));
        linkSubmissionDetails(submission10b_project_5, student5, grade10b_5, feedback10b_project_5, Arrays.asList(sa10b_project_student5));
        linkSubmissionDetails(submission10b_project_6, student6, grade10b_6, feedback10b_project_6, Arrays.asList(sa10b_project_student6));
        linkSubmissionDetails(submission10c_project_5, student5, grade10c_5, feedback10c_project_5, Arrays.asList(sa10c_project_student5));
        linkSubmissionDetails(submission10c_project_6, student6, grade10c_6, feedback10c_project_6, Arrays.asList(sa10c_project_student6));
        linkSubmissionDetails(submission10d_project_5, student5, grade10d_5, feedback10d_project_5, Arrays.asList(sa10d_project_student5));
        linkSubmissionDetails(submission10d_project_6, student6, grade10d_6, feedback10d_project_6, Arrays.asList(sa10d_project_student6));

        linkSubmissionDetails(submission11a_project_5, student5, grade11a_5, feedback11a_project_5, Arrays.asList(sa11a_project_student5));
        linkSubmissionDetails(submission11a_project_6, student6, grade11a_6, feedback11a_project_6, Arrays.asList(sa11a_project_student6));
        linkSubmissionDetails(submission11b_project_5, student5, grade11b_5, feedback11b_project_5, Arrays.asList(sa11b_project_student5));
        linkSubmissionDetails(submission11b_project_6, student6, grade11b_6, feedback11b_project_6, Arrays.asList(sa11b_project_student6));
        linkSubmissionDetails(submission11c_project_5, student5, grade11c_5, feedback11c_project_5, Arrays.asList(sa11c_project_student5));
        linkSubmissionDetails(submission11c_project_6, student6, grade11c_6, feedback11c_project_6, Arrays.asList(sa11c_project_student6));
        linkSubmissionDetails(submission11d_project_5, student5, grade11d_5, feedback11d_project_5, Arrays.asList(sa11d_project_student5));
        linkSubmissionDetails(submission11d_project_6, student6, grade11d_6, feedback11d_project_6, Arrays.asList(sa11d_project_student6));

        linkSubmissionDetails(submission12a_project_5, student5, grade12a_5, feedback12a_project_5, Arrays.asList(sa12a_project_student5));
        linkSubmissionDetails(submission12a_project_6, student6, grade12a_6, feedback12a_project_6, Arrays.asList(sa12a_project_student6));
        linkSubmissionDetails(submission12b_project_5, student5, grade12b_5, feedback12b_project_5, Arrays.asList(sa12b_project_student5));
        linkSubmissionDetails(submission12b_project_6, student6, grade12b_6, feedback12b_project_6, Arrays.asList(sa12b_project_student6));
        linkSubmissionDetails(submission12c_project_5, student5, grade12c_5, feedback12c_project_5, Arrays.asList(sa12c_project_student5));
        linkSubmissionDetails(submission12c_project_6, student6, grade12c_6, feedback12c_project_6, Arrays.asList(sa12c_project_student6));
        linkSubmissionDetails(submission12d_project_5, student5, grade12d_5, feedback12d_project_5, Arrays.asList(sa12d_project_student5));
        linkSubmissionDetails(submission12d_project_6, student6, grade12d_6, feedback12d_project_6, Arrays.asList(sa12d_project_student6));
        linkSubmissionDetails(submission12e_project_5, student5, grade12e_5, feedback12e_project_5, Arrays.asList(sa12e_project_student5));
        linkSubmissionDetails(submission12e_project_6, student6, grade12e_6, feedback12e_project_6, Arrays.asList(sa12e_project_student6));

        linkSubmissionDetails(submission13a_project_7, student7, grade13a_7, feedback13a_project_7, Arrays.asList(sa13a_project_student7));
        linkSubmissionDetails(submission13a_project_8, student8, grade13a_8, feedback13a_project_8, Arrays.asList(sa13a_project_student8));
        linkSubmissionDetails(submission13b_project_7, student7, grade13b_7, feedback13b_project_7, Arrays.asList(sa13b_project_student7));
        linkSubmissionDetails(submission13b_project_8, student8, grade13b_8, feedback13b_project_8, Arrays.asList(sa13b_project_student8));
        linkSubmissionDetails(submission13c_project_7, student7, grade13c_7, feedback13c_project_7, Arrays.asList(sa13c_project_student7));
        linkSubmissionDetails(submission13c_project_8, student8, grade13c_8, feedback13c_project_8, Arrays.asList(sa13c_project_student8));
        linkSubmissionDetails(submission13d_project_7, student7, grade13d_7, feedback13d_project_7, Arrays.asList(sa13d_project_student7));
        linkSubmissionDetails(submission13d_project_8, student8, grade13d_8, feedback13d_project_8, Arrays.asList(sa13d_project_student8));

        linkSubmissionDetails(submission14a_project_7, student7, grade14a_7, feedback14a_project_7, Arrays.asList(sa14a_project_student7));
        linkSubmissionDetails(submission14a_project_8, student8, grade14a_8, feedback14a_project_8, Arrays.asList(sa14a_project_student8));
        linkSubmissionDetails(submission14b_project_7, student7, grade14b_7, feedback14b_project_7, Arrays.asList(sa14b_project_student7));
        linkSubmissionDetails(submission14b_project_8, student8, grade14b_8, feedback14b_project_8, Arrays.asList(sa14b_project_student8));
        linkSubmissionDetails(submission14c_project_7, student7, grade14c_7, feedback14c_project_7, Arrays.asList(sa14c_project_student7));
        linkSubmissionDetails(submission14c_project_8, student8, grade14c_8, feedback14c_project_8, Arrays.asList(sa14c_project_student8));
        linkSubmissionDetails(submission14d_project_7, student7, grade14d_7, feedback14d_project_7, Arrays.asList(sa14d_project_student7));
        linkSubmissionDetails(submission14d_project_8, student8, grade14d_8, feedback14d_project_8, Arrays.asList(sa14d_project_student8));

        linkSubmissionDetails(submission15a_project_7, student7, grade15a_7, feedback15a_project_7, Arrays.asList(sa15a_project_student7));
        linkSubmissionDetails(submission15a_project_8, student8, grade15a_8, feedback15a_project_8, Arrays.asList(sa15a_project_student8));
        linkSubmissionDetails(submission15b_project_7, student7, grade15b_7, feedback15b_project_7, Arrays.asList(sa15b_project_student7));
        linkSubmissionDetails(submission15b_project_8, student8, grade15b_8, feedback15b_project_8, Arrays.asList(sa15b_project_student8));
        linkSubmissionDetails(submission15c_project_7, student7, grade15c_7, feedback15c_project_7, Arrays.asList(sa15c_project_student7));
        linkSubmissionDetails(submission15c_project_8, student8, grade15c_8, feedback15c_project_8, Arrays.asList(sa15c_project_student8));

        linkSubmissionDetails(submission16a_project_7, student7, grade16a_7, feedback16a_project_7, Arrays.asList(sa16a_project_student7));
        linkSubmissionDetails(submission16a_project_8, student8, grade16a_8, feedback16a_project_8, Arrays.asList(sa16a_project_student8));
        linkSubmissionDetails(submission16b_project_7, student7, grade16b_7, feedback16b_project_7, Arrays.asList(sa16b_project_student7));
        linkSubmissionDetails(submission16b_project_8, student8, grade16b_8, feedback16b_project_8, Arrays.asList(sa16b_project_student8));
        linkSubmissionDetails(submission16c_project_7, student7, grade16c_7, feedback16c_project_7, Arrays.asList(sa16c_project_student7));
        linkSubmissionDetails(submission16c_project_8, student8, grade16c_8, feedback16c_project_8, Arrays.asList(sa16c_project_student8));

        linkSubmissionDetails(submission17a_project_9, student9, grade17a_9, feedback17a_project_9, Arrays.asList(sa17a_project_student9));
        linkSubmissionDetails(submission17a_project_10, student10, grade17a_10, feedback17a_project_10, Arrays.asList(sa17a_project_student10));
        linkSubmissionDetails(submission17b_project_9, student9, grade17b_9, feedback17b_project_9, Arrays.asList(sa17b_project_student9));
        linkSubmissionDetails(submission17b_project_10, student10, grade17b_10, feedback17b_project_10, Arrays.asList(sa17b_project_student10));
        linkSubmissionDetails(submission17c_project_9, student9, grade17c_9, feedback17c_project_9, Arrays.asList(sa17c_project_student9));
        linkSubmissionDetails(submission17c_project_10, student10, grade17c_10, feedback17c_project_10, Arrays.asList(sa17c_project_student10));
        linkSubmissionDetails(submission17d_project_9, student9, grade17d_9, feedback17d_project_9, Arrays.asList(sa17d_project_student9));
        linkSubmissionDetails(submission17d_project_10, student10, grade17d_10, feedback17d_project_10, Arrays.asList(sa17d_project_student10));

        linkSubmissionDetails(submission18a_project_9, student9, grade18a_9, feedback18a_project_9, Arrays.asList(sa18a_project_student9));
        linkSubmissionDetails(submission18a_project_10, student10, grade18a_10, feedback18a_project_10, Arrays.asList(sa18a_project_student10));
        linkSubmissionDetails(submission18b_project_9, student9, grade18b_9, feedback18b_project_9, Arrays.asList(sa18b_project_student9));
        linkSubmissionDetails(submission18b_project_10, student10, grade18b_10, feedback18b_project_10, Arrays.asList(sa18b_project_student10));
        linkSubmissionDetails(submission18c_project_9, student9, grade18c_9, feedback18c_project_9, Arrays.asList(sa18c_project_student9));
        linkSubmissionDetails(submission18c_project_10, student10, grade18c_10, feedback18c_project_10, Arrays.asList(sa18c_project_student10));

        linkSubmissionDetails(submission19a_project_9, student9, grade19a_9, feedback19a_project_9, Arrays.asList(sa19a_project_student9));
        linkSubmissionDetails(submission19a_project_10, student10, grade19a_10, feedback19a_project_10, Arrays.asList(sa19a_project_student10));
        linkSubmissionDetails(submission19b_project_9, student9, grade19b_9, feedback19b_project_9, Arrays.asList(sa19b_project_student9));
        linkSubmissionDetails(submission19b_project_10, student10, grade19b_10, feedback19b_project_10, Arrays.asList(sa19b_project_student10));
        linkSubmissionDetails(submission19c_project_9, student9, grade19c_9, feedback19c_project_9, Arrays.asList(sa19c_project_student9));
        linkSubmissionDetails(submission19c_project_10, student10, grade19c_10, feedback19c_project_10, Arrays.asList(sa19c_project_student10));

        linkSubmissionDetails(submission20a_project_9, student9, grade20a_9, feedback20a_project_9, Arrays.asList(sa20a_project_student9));
        linkSubmissionDetails(submission20a_project_10, student10, grade20a_10, feedback20a_project_10, Arrays.asList(sa20a_project_student10));
        linkSubmissionDetails(submission20b_project_9, student9, grade20b_9, feedback20b_project_9, Arrays.asList(sa20b_project_student9));
        linkSubmissionDetails(submission20b_project_10, student10, grade20b_10, feedback20b_project_10, Arrays.asList(sa20b_project_student10));
        linkSubmissionDetails(submission20c_project_9, student9, grade20c_9, feedback20c_project_9, Arrays.asList(sa20c_project_student9));
        linkSubmissionDetails(submission20c_project_10, student10, grade20c_10, feedback20c_project_10, Arrays.asList(sa20c_project_student10));
        linkSubmissionDetails(submission20d_project_9, student9, grade20d_9, feedback20d_project_9, Arrays.asList(sa20d_project_student9));
        linkSubmissionDetails(submission20d_project_10, student10, grade20d_10, feedback20d_project_10, Arrays.asList(sa20d_project_student10));

        syllabus1.setProjects(Arrays.asList(project1a, project1b, project1c, project1d, project1e, project1f));
        syllabus2.setProjects(Arrays.asList(project2a, project2b, project2c, project2d, project2e, project2f));
        syllabus3.setProjects(Arrays.asList(project3a, project3b, project3c, project3d));
        syllabus4.setProjects(Arrays.asList(project4a, project4b, project4c, project4d));
        syllabus5.setProjects(Arrays.asList(project5a, project5b, project5c, project5d));
        syllabus6.setProjects(Arrays.asList(project6a, project6b, project6c, project6d, project6e));
        syllabus7.setProjects(Arrays.asList(project7a, project7b, project7c, project7d));
        syllabus8.setProjects(Arrays.asList(project8a, project8b, project8c, project8d, project8e));
        syllabus9.setProjects(Arrays.asList(project9a, project9b, project9c));
        syllabus10.setProjects(Arrays.asList(project10a, project10b, project10c, project10d));
        syllabus11.setProjects(Arrays.asList(project11a, project11b, project11c, project11d));
        syllabus12.setProjects(Arrays.asList(project12a, project12b, project12c, project12d, project12e));
        syllabus13.setProjects(Arrays.asList(project13a, project13b, project13c, project13d));
        syllabus14.setProjects(Arrays.asList(project14a, project14b, project14c, project14d));
        syllabus15.setProjects(Arrays.asList(project15a, project15b, project15c));
        syllabus16.setProjects(Arrays.asList(project16a, project16b, project16c));
        syllabus17.setProjects(Arrays.asList(project17a, project17b, project17c, project17d));
        syllabus18.setProjects(Arrays.asList(project18a, project18b, project18c));
        syllabus19.setProjects(Arrays.asList(project19a, project19b, project19c));
        syllabus20.setProjects(Arrays.asList(project20a, project20b, project20c, project20d));

        studentProject(student1, Arrays.asList(grade1a_1, grade1b_1, grade1c_1, grade1d_1, grade1e_1, grade1f_1, grade2a_1, grade2b_1, grade2c_1, grade2d_1, grade2e_1, grade2f_1, grade3a_1, grade3b_1, grade3c_1, grade3d_1, grade4a_1, grade4b_1, grade4c_1, grade4d_1), Arrays.asList(courseGrade1a_project_1, courseGrade2a_project_1, courseGrade3a_project_1, courseGrade4a_project_1), Arrays.asList(project1a, project1b, project1c, project1d, project1e, project1f, project2a, project2b, project2c, project2d, project2e, project2f, project3a, project3b, project3c, project3d, project4a, project4b, project4c, project4d));
        studentProject(student2, Arrays.asList(grade1a_2, grade1b_2, grade1c_2, grade1d_2, grade1e_2, grade1f_2, grade2a_2, grade2b_2, grade2c_2, grade2d_2, grade2e_2, grade2f_2, grade3a_2, grade3b_2, grade3c_2, grade3d_2, grade4a_2, grade4b_2, grade4c_2, grade4d_2), Arrays.asList(courseGrade1a_project_2, courseGrade2a_project_2, courseGrade3a_project_2, courseGrade4a_project_2), Arrays.asList(project1a, project1b, project1c, project1d, project1e, project1f, project2a, project2b, project2c, project2d, project2e, project2f, project3a, project3b, project3c, project3d, project4a, project4b, project4c, project4d));
        studentProject(student3, Arrays.asList(grade5a_3, grade5b_3, grade5c_3, grade5d_3, grade6a_3, grade6b_3, grade6c_3, grade6d_3, grade6e_3, grade7a_3, grade7b_3, grade7c_3, grade7d_3, grade8a_3, grade8b_3, grade8c_3, grade8d_3, grade8e_3), Arrays.asList(courseGrade5a_project_3, courseGrade6a_project_3, courseGrade7a_project_3, courseGrade8a_project_3), Arrays.asList(project5a, project5b, project5c, project5d, project6a, project6b, project6c, project6d, project6e, project7a, project7b, project7c, project7d, project8a, project8b, project8c, project8d, project8e));
        studentProject(student4, Arrays.asList(grade5a_4, grade5b_4, grade5c_4, grade5d_4, grade6a_4, grade6b_4, grade6c_4, grade6d_4, grade6e_4, grade7a_4, grade7b_4, grade7c_4, grade7d_4, grade8a_4, grade8b_4, grade8c_4, grade8d_4, grade8e_4), Arrays.asList(courseGrade5a_project_4, courseGrade6a_project_4, courseGrade7a_project_4, courseGrade8a_project_4), Arrays.asList(project5a, project5b, project5c, project5d, project6a, project6b, project6c, project6d, project6e, project7a, project7b, project7c, project7d, project8a, project8b, project8c, project8d, project8e));
        studentProject(student5, Arrays.asList(grade9a_5, grade9b_5, grade9c_5, grade10a_5, grade10b_5, grade10c_5, grade10d_5, grade11a_5, grade11b_5, grade11c_5, grade11d_5, grade12a_5, grade12b_5, grade12c_5, grade12d_5, grade12e_5), Arrays.asList(courseGrade9a_project_5, courseGrade10a_project_5, courseGrade11a_project_5, courseGrade12a_project_5), Arrays.asList(project9a, project9b, project9c, project10a, project10b, project10c, project10d, project11a, project11b, project11c, project11d, project12a, project12b, project12c, project12d, project12e));
        studentProject(student6, Arrays.asList(grade9a_6, grade9b_6, grade9c_6, grade10a_6, grade10b_6, grade10c_6, grade10d_6, grade11a_6, grade11b_6, grade11c_6, grade11d_6, grade12a_6, grade12b_6, grade12c_6, grade12d_6, grade12e_6), Arrays.asList(courseGrade9a_project_6, courseGrade10a_project_6, courseGrade11a_project_6, courseGrade12a_project_6), Arrays.asList(project9a, project9b, project9c, project10a, project10b, project10c, project10d, project11a, project11b, project11c, project11d, project12a, project12b, project12c, project12d, project12e));
        studentProject(student7, Arrays.asList(grade13a_7, grade13b_7, grade13c_7, grade13d_7, grade14a_7, grade14b_7, grade14c_7, grade14d_7, grade15a_7, grade15b_7, grade15c_7, grade16a_7, grade16b_7, grade16c_7), Arrays.asList(courseGrade13a_project_7, courseGrade14a_project_7, courseGrade15a_project_7, courseGrade16a_project_7), Arrays.asList(project13a, project13b, project13c, project13d, project14a, project14b, project14c, project14d, project15a, project15b, project15c, project16a, project16b, project16c));
        studentProject(student8, Arrays.asList(grade13a_8, grade13b_8, grade13c_8, grade13d_8, grade14a_8, grade14b_8, grade14c_8, grade14d_8, grade15a_8, grade15b_8, grade15c_8, grade16a_8, grade16b_8, grade16c_8), Arrays.asList(courseGrade13a_project_8, courseGrade14a_project_8, courseGrade15a_project_8, courseGrade16a_project_8), Arrays.asList(project13a, project13b, project13c, project13d, project14a, project14b, project14c, project14d, project15a, project15b, project15c, project16a, project16b, project16c));
        studentProject(student9, Arrays.asList(grade17a_9, grade17b_9, grade17c_9, grade17d_9, grade18a_9, grade18b_9, grade18c_9, grade19a_9, grade19b_9, grade19c_9, grade20a_9, grade20b_9, grade20c_9, grade20d_9), Arrays.asList(courseGrade17a_project_9, courseGrade18a_project_9, courseGrade19a_project_9, courseGrade20a_project_9), Arrays.asList(project17a, project17b, project17c, project17d, project18a, project18b, project18c, project19a, project19b, project19c, project20a, project20b, project20c, project20d));
        studentProject(student10, Arrays.asList(grade17a_10, grade17b_10, grade17c_10, grade17d_10, grade18a_10, grade18b_10, grade18c_10, grade19a_10, grade19b_10, grade19c_10, grade20a_10, grade20b_10, grade20c_10, grade20d_10), Arrays.asList(courseGrade17a_project_10, courseGrade18a_project_10, courseGrade19a_project_10, courseGrade20a_project_10), Arrays.asList(project17a, project17b, project17c, project17d, project18a, project18b, project18c, project19a, project19b, project19c, project20a, project20b, project20c, project20d));

        facultyRepo.saveAllAndFlush(Arrays.asList(faculty1, faculty2, faculty3, faculty4, faculty5));
        syllabusRepo.saveAllAndFlush(Arrays.asList(syllabus1, syllabus2, syllabus3, syllabus4, syllabus5, syllabus6, syllabus7, syllabus8, syllabus9, syllabus10, syllabus11, syllabus12, syllabus13, syllabus14, syllabus15, syllabus16, syllabus17, syllabus18, syllabus19, syllabus20));
        studentRepo.saveAllAndFlush(Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10));
        courseRepo.saveAllAndFlush(Arrays.asList(course1, course2, course3, course4, course5, course6, course7, course8, course9, course10, course11, course12, course13, course14, course15, course16, course17, course18, course19, course20));
        projectRepo.saveAllAndFlush(Arrays.asList(project1a, project1b, project1c, project1d, project1e, project1f, project2a, project2b, project2c, project2d, project2e, project2f, project3a, project3b, project3c, project3d, project4a, project4b, project4c, project4d, project5a, project5b, project5c, project5d, project6a, project6b, project6c, project6d, project6e, project7a, project7b, project7c, project7d, project8a, project8b, project8c, project8d, project8e, project9a, project9b, project9c, project10a, project10b, project10c, project10d, project11a, project11b, project11c, project11d, project12a, project12b, project12c, project12d, project12e, project13a, project13b, project13c, project13d,
                project14a, project14b, project14c, project14d, project15a, project15b, project15c, project16a, project16b, project16c, project17a, project17b, project17c, project17d, project18a, project18b, project18c, project19a, project19b, project19c, project20a, project20b, project20c, project20d));
        problemAnswerRepo.saveAllAndFlush(Arrays.asList(pa1a_project, pa1b_project, pa1c_project, pa1d_project, pa1e_project, pa1f_project, pa2a_project, pa2b_project, pa2c_project, pa2d_project, pa2e_project, pa2f_project, pa3a_project, pa3b_project, pa3c_project, pa3d_project, pa4a_project, pa4b_project, pa4c_project, pa4d_project, pa5a_project, pa5b_project, pa5c_project, pa5d_project, pa6a_project, pa6b_project, pa6c_project, pa6d_project, pa6e_project, pa7a_project, pa7b_project, pa7c_project, pa7d_project, pa8a_project, pa8b_project, pa8c_project, pa8d_project, pa8e_project, pa9a_project, pa9b_project, pa9c_project, pa10a_project, pa10b_project, pa10c_project, pa10d_project, pa11a_project, pa11b_project, pa11c_project, pa11d_project, pa12a_project, pa12b_project, pa12c_project, pa12d_project, pa12e_project, pa13a_project, pa13b_project, pa13c_project, pa13d_project, pa14a_project, pa14b_project, pa14c_project, pa14d_project, pa15a_project, pa15b_project, pa15c_project, pa16a_project, pa16b_project, pa16c_project, pa17a_project, pa17b_project, pa17c_project, pa17d_project, pa18a_project, pa18b_project, pa18c_project, pa19a_project, pa19b_project, pa19c_project, pa20a_project, pa20b_project, pa20c_project, pa20d_project));
        studentAnswerRepo.saveAllAndFlush(Arrays.asList(sa1a_project_student1, sa1b_project_student1, sa1c_project_student1, sa1d_project_student1, sa1e_project_student1, sa1f_project_student1, sa2a_project_student1, sa2b_project_student1, sa2c_project_student1, sa2d_project_student1, sa2e_project_student1, sa2f_project_student1, sa3a_project_student1, sa3b_project_student1, sa3c_project_student1, sa3d_project_student1, sa4a_project_student1, sa4b_project_student1, sa4c_project_student1, sa4d_project_student1, sa1a_project_student2, sa1b_project_student2, sa1c_project_student2, sa1d_project_student2, sa1e_project_student2, sa1f_project_student2, sa2a_project_student2, sa2b_project_student2, sa2c_project_student2, sa2d_project_student2, sa2e_project_student2, sa2f_project_student2, sa3a_project_student2, sa3b_project_student2, sa3c_project_student2, sa3d_project_student2, sa4a_project_student2, sa4b_project_student2, sa4c_project_student2, sa4d_project_student2,
                sa5a_project_student3, sa5b_project_student3, sa5c_project_student3, sa5d_project_student3, sa6a_project_student3, sa6b_project_student3, sa6c_project_student3, sa6d_project_student3, sa6e_project_student3, sa7a_project_student3, sa7b_project_student3, sa7c_project_student3, sa7d_project_student3, sa8a_project_student3, sa8b_project_student3, sa8c_project_student3, sa8d_project_student3, sa8e_project_student3, sa5a_project_student4, sa5b_project_student4, sa5c_project_student4, sa5d_project_student4, sa6a_project_student4, sa6b_project_student4, sa6c_project_student4, sa6d_project_student4, sa6e_project_student4, sa7a_project_student4, sa7b_project_student4, sa7c_project_student4, sa7d_project_student4, sa8a_project_student4, sa8b_project_student4, sa8c_project_student4, sa8d_project_student4, sa8e_project_student4, sa9a_project_student5, sa9b_project_student5, sa9c_project_student5, sa10a_project_student5, sa10b_project_student5, sa10c_project_student5, sa10d_project_student5, sa11a_project_student5, sa11b_project_student5, sa11c_project_student5, sa11d_project_student5, sa12a_project_student5, sa12b_project_student5, sa12c_project_student5, sa12d_project_student5, sa12e_project_student5,
                sa9a_project_student6, sa9b_project_student6, sa9c_project_student6, sa10a_project_student6, sa10b_project_student6, sa10c_project_student6, sa10d_project_student6, sa11a_project_student6, sa11b_project_student6, sa11c_project_student6, sa11d_project_student6, sa12a_project_student6, sa12b_project_student6, sa12c_project_student6, sa12d_project_student6, sa12e_project_student6, sa13a_project_student7, sa13b_project_student7, sa13c_project_student7, sa13d_project_student7, sa14a_project_student7, sa14b_project_student7, sa14c_project_student7, sa14d_project_student7, sa15a_project_student7, sa15b_project_student7, sa15c_project_student7, sa16a_project_student7, sa16b_project_student7, sa16c_project_student7, sa13a_project_student8, sa13b_project_student8, sa13c_project_student8, sa13d_project_student8, sa14a_project_student8, sa14b_project_student8, sa14c_project_student8, sa14d_project_student8, sa15a_project_student8, sa15b_project_student8, sa15c_project_student8, sa16a_project_student8, sa16b_project_student8, sa16c_project_student8,
                sa17a_project_student9, sa17b_project_student9, sa17c_project_student9, sa17d_project_student9, sa18a_project_student9, sa18b_project_student9, sa18c_project_student9, sa19a_project_student9, sa19b_project_student9, sa19c_project_student9, sa20a_project_student9, sa20b_project_student9, sa20c_project_student9, sa20d_project_student9, sa17a_project_student10, sa17b_project_student10, sa17c_project_student10, sa17d_project_student10, sa18a_project_student10, sa18b_project_student10, sa18c_project_student10, sa19a_project_student10, sa19b_project_student10, sa19c_project_student10, sa20a_project_student10, sa20b_project_student10, sa20c_project_student10, sa20d_project_student10));
        submissionRepo.saveAllAndFlush(Arrays.asList(submission1a_project_1, submission1b_project_1, submission1c_project_1, submission1d_project_1, submission1e_project_1, submission1f_project_1, submission2a_project_1, submission2b_project_1, submission2c_project_1, submission2d_project_1, submission2e_project_1, submission2f_project_1, submission3a_project_1, submission3b_project_1, submission3c_project_1, submission3d_project_1, submission4a_project_1, submission4b_project_1, submission4c_project_1, submission4d_project_1, submission1a_project_2, submission1b_project_2, submission1c_project_2, submission1d_project_2, submission1e_project_2, submission1f_project_2, submission2a_project_2, submission2b_project_2, submission2c_project_2, submission2d_project_2, submission2e_project_2, submission2f_project_2, submission3a_project_2, submission3b_project_2, submission3c_project_2, submission3d_project_2, submission4a_project_2, submission4b_project_2, submission4c_project_2, submission4d_project_2, submission5a_project_3, submission5b_project_3, submission5c_project_3, submission5d_project_3, submission6a_project_3, submission6b_project_3, submission6c_project_3, submission6d_project_3, submission6e_project_3, submission7a_project_3, submission7b_project_3, submission7c_project_3, submission7d_project_3, submission8a_project_3, submission8b_project_3, submission8c_project_3, submission8d_project_3, submission8e_project_3,
                submission5a_project_4, submission5b_project_4, submission5c_project_4, submission5d_project_4, submission6a_project_4, submission6b_project_4, submission6c_project_4, submission6d_project_4, submission6e_project_4, submission7a_project_4, submission7b_project_4, submission7c_project_4, submission7d_project_4, submission8a_project_4, submission8b_project_4, submission8c_project_4, submission8d_project_4, submission8e_project_4, submission9a_project_5, submission9b_project_5, submission9c_project_5, submission10a_project_5, submission10b_project_5, submission10c_project_5, submission10d_project_5, submission11a_project_5, submission11b_project_5, submission11c_project_5, submission11d_project_5, submission12a_project_5, submission12b_project_5, submission12c_project_5, submission12d_project_5, submission12e_project_5, submission9a_project_6, submission9b_project_6, submission9c_project_6, submission10a_project_6, submission10b_project_6, submission10c_project_6, submission10d_project_6, submission11a_project_6, submission11b_project_6, submission11c_project_6, submission11d_project_6, submission12a_project_6, submission12b_project_6, submission12c_project_6, submission12d_project_6, submission12e_project_6, submission13a_project_7, submission13b_project_7, submission13c_project_7, submission13d_project_7, submission14a_project_7, submission14b_project_7, submission14c_project_7, submission14d_project_7, submission15a_project_7, submission15b_project_7, submission15c_project_7, submission16a_project_7, submission16b_project_7, submission16c_project_7,
                submission13a_project_8, submission13b_project_8, submission13c_project_8, submission13d_project_8, submission14a_project_8, submission14b_project_8, submission14c_project_8, submission14d_project_8, submission15a_project_8, submission15b_project_8, submission15c_project_8, submission16a_project_8, submission16b_project_8, submission16c_project_8, submission17a_project_9, submission17b_project_9, submission17c_project_9, submission17d_project_9, submission18a_project_9, submission18b_project_9, submission18c_project_9, submission19a_project_9, submission19b_project_9, submission19c_project_9, submission20a_project_9, submission20b_project_9, submission20c_project_9, submission20d_project_9, submission17a_project_10, submission17b_project_10, submission17c_project_10, submission17d_project_10, submission18a_project_10, submission18b_project_10, submission18c_project_10, submission19a_project_10, submission19b_project_10, submission19c_project_10, submission20a_project_10, submission20b_project_10, submission20c_project_10, submission20d_project_10));
        gradeRepo.saveAllAndFlush(Arrays.asList(grade1a_1, grade1b_1, grade1c_1, grade1d_1, grade1e_1, grade1f_1, grade2a_1, grade2b_1, grade2c_1, grade2d_1, grade2e_1, grade2f_1, grade3a_1, grade3b_1, grade3c_1, grade3d_1, grade4a_1, grade4b_1, grade4c_1, grade4d_1, grade1a_2, grade1b_2, grade1c_2, grade1d_2, grade1e_2, grade1f_2, grade2a_2, grade2b_2, grade2c_2, grade2d_2, grade2e_2, grade2f_2, grade3a_2, grade3b_2, grade3c_2, grade3d_2, grade4a_2, grade4b_2, grade4c_2, grade4d_2, grade5a_3, grade5b_3, grade5c_3, grade5d_3, grade6a_3, grade6b_3, grade6c_3, grade6d_3, grade6e_3, grade7a_3, grade7b_3, grade7c_3, grade7d_3, grade8a_3, grade8b_3, grade8c_3, grade8d_3, grade8e_3, grade5a_4, grade5b_4, grade5c_4, grade5d_4, grade6a_4, grade6b_4, grade6c_4, grade6d_4, grade6e_4, grade7a_4, grade7b_4, grade7c_4, grade7d_4, grade8a_4, grade8b_4, grade8c_4, grade8d_4, grade8e_4, grade9a_5, grade9b_5, grade9c_5, grade10a_5, grade10b_5, grade10c_5, grade10d_5, grade11a_5, grade11b_5, grade11c_5, grade11d_5, grade12a_5, grade12b_5, grade12c_5, grade12d_5, grade12e_5,
                grade9a_6, grade9b_6, grade9c_6, grade10a_6, grade10b_6, grade10c_6, grade10d_6, grade11a_6, grade11b_6, grade11c_6, grade11d_6, grade12a_6, grade12b_6, grade12c_6, grade12d_6, grade12e_6, grade13a_7, grade13b_7, grade13c_7, grade13d_7, grade14a_7, grade14b_7, grade14c_7, grade14d_7, grade15a_7, grade15b_7, grade15c_7, grade16a_7, grade16b_7, grade16c_7, grade13a_8, grade13b_8, grade13c_8, grade13d_8, grade14a_8, grade14b_8, grade14c_8, grade14d_8, grade15a_8, grade15b_8, grade15c_8, grade16a_8, grade16b_8, grade16c_8, grade17a_9, grade17b_9, grade17c_9, grade17d_9, grade18a_9, grade18b_9, grade18c_9, grade19a_9, grade19b_9, grade19c_9, grade20a_9, grade20b_9, grade20c_9, grade20d_9, grade17a_10, grade17b_10, grade17c_10, grade17d_10, grade18a_10, grade18b_10, grade18c_10, grade19a_10, grade19b_10, grade19c_10, grade20a_10, grade20b_10, grade20c_10, grade20d_10));
        courseGradeRepo.saveAllAndFlush(Arrays.asList(courseGrade1a_project_1, courseGrade2a_project_1, courseGrade3a_project_1, courseGrade4a_project_1, courseGrade1a_project_2, courseGrade2a_project_2, courseGrade3a_project_2, courseGrade4a_project_2, courseGrade5a_project_3, courseGrade6a_project_3, courseGrade7a_project_3, courseGrade8a_project_3, courseGrade5a_project_4, courseGrade6a_project_4, courseGrade7a_project_4, courseGrade8a_project_4, courseGrade9a_project_5, courseGrade10a_project_5, courseGrade11a_project_5, courseGrade12a_project_5, courseGrade9a_project_6, courseGrade10a_project_6, courseGrade11a_project_6, courseGrade12a_project_6, courseGrade13a_project_7, courseGrade14a_project_7, courseGrade15a_project_7, courseGrade16a_project_7, courseGrade13a_project_8, courseGrade14a_project_8, courseGrade15a_project_8, courseGrade16a_project_8, courseGrade17a_project_9, courseGrade18a_project_9, courseGrade19a_project_9, courseGrade20a_project_9, courseGrade17a_project_10, courseGrade18a_project_10, courseGrade19a_project_10, courseGrade20a_project_10));
        feedbackRepo.saveAllAndFlush(Arrays.asList(feedback1a_project_1, feedback1b_project_1, feedback1c_project_1, feedback1d_project_1, feedback1e_project_1, feedback1f_project_1, feedback2a_project_1, feedback2b_project_1, feedback2c_project_1, feedback2d_project_1, feedback2e_project_1, feedback2f_project_1, feedback3a_project_1, feedback3b_project_1, feedback3c_project_1, feedback3d_project_1, feedback4a_project_1, feedback4b_project_1, feedback4c_project_1, feedback4d_project_1, feedback1a_project_2, feedback1b_project_2, feedback1c_project_2, feedback1d_project_2, feedback1e_project_2, feedback1f_project_2, feedback2a_project_2, feedback2b_project_2, feedback2c_project_2, feedback2d_project_2, feedback2e_project_2, feedback2f_project_2, feedback3a_project_2, feedback3b_project_2, feedback3c_project_2, feedback3d_project_2, feedback4a_project_2, feedback4b_project_2, feedback4c_project_2, feedback4d_project_2, feedback5a_project_3, feedback5b_project_3, feedback5c_project_3, feedback5d_project_3, feedback6a_project_3, feedback6b_project_3, feedback6c_project_3, feedback6d_project_3, feedback6e_project_3, feedback7a_project_3, feedback7b_project_3, feedback7c_project_3, feedback7d_project_3, feedback8a_project_3, feedback8b_project_3, feedback8c_project_3, feedback8d_project_3, feedback8e_project_3, feedback5a_project_4, feedback5b_project_4, feedback5c_project_4, feedback5d_project_4, feedback6a_project_4, feedback6b_project_4, feedback6c_project_4, feedback6d_project_4, feedback6e_project_4, feedback7a_project_4, feedback7b_project_4, feedback7c_project_4, feedback7d_project_4, feedback8a_project_4, feedback8b_project_4, feedback8c_project_4, feedback8d_project_4, feedback8e_project_4, feedback9a_project_5, feedback9b_project_5, feedback9c_project_5, feedback10a_project_5, feedback10b_project_5, feedback10c_project_5, feedback10d_project_5, feedback11a_project_5, feedback11b_project_5, feedback11c_project_5, feedback11d_project_5, feedback12a_project_5, feedback12b_project_5, feedback12c_project_5, feedback12d_project_5, feedback12e_project_5, feedback9a_project_6, feedback9b_project_6, feedback9c_project_6, feedback10a_project_6, feedback10b_project_6, feedback10c_project_6, feedback10d_project_6, feedback11a_project_6, feedback11b_project_6, feedback11c_project_6, feedback11d_project_6, feedback12a_project_6, feedback12b_project_6, feedback12c_project_6, feedback12d_project_6, feedback12e_project_6, feedback13a_project_7, feedback13b_project_7, feedback13c_project_7, feedback13d_project_7, feedback14a_project_7, feedback14b_project_7, feedback14c_project_7, feedback14d_project_7, feedback15a_project_7, feedback15b_project_7, feedback15c_project_7, feedback16a_project_7, feedback16b_project_7, feedback16c_project_7, feedback13a_project_8, feedback13b_project_8, feedback13c_project_8, feedback13d_project_8, feedback14a_project_8, feedback14b_project_8, feedback14c_project_8, feedback14d_project_8, feedback15a_project_8, feedback15b_project_8, feedback15c_project_8, feedback16a_project_8, feedback16b_project_8, feedback16c_project_8, feedback17a_project_9, feedback17b_project_9, feedback17c_project_9, feedback17d_project_9, feedback18a_project_9, feedback18b_project_9, feedback18c_project_9, feedback19a_project_9, feedback19b_project_9, feedback19c_project_9, feedback20a_project_9, feedback20b_project_9, feedback20c_project_9, feedback20d_project_9, feedback17a_project_10, feedback17b_project_10, feedback17c_project_10, feedback17d_project_10, feedback18a_project_10, feedback18b_project_10, feedback18c_project_10, feedback19a_project_10, feedback19b_project_10, feedback19c_project_10, feedback19c_project_10, feedback20a_project_10, feedback20b_project_10, feedback20c_project_10, feedback20d_project_10));

    }

    public static Project createProject(String name, Faculty teacher, Date dueDate, Syllabus syllabus, boolean completed) {
        Project project = new Project();
        project.setName(name);
        project.setTeacher(teacher);
        project.setDueDate(dueDate);
        project.setSyllabus(syllabus);
        project.setCompleted(completed);
        return project;
    }

    public static Faculty createFacultyWithProject(Faculty faculty, List<Grade> grades, List<Project> projects) {
        faculty.setGrades(grades);
        faculty.setProjects(projects);
        return faculty;
    }

    public static void addStudentToProject(Project project, Student student) {
        project.getStudents().add(student);
    }
}
