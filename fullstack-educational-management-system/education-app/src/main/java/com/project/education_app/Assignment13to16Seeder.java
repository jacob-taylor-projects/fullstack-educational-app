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
import static com.project.education_app.Seeder.createGrade;

@Component
@Order(5)
@Data
public class Assignment13to16Seeder implements CommandLineRunner {
    private final FacultyRepo facultyRepo;
    private final SyllabusRepo syllabusRepo;
    private final StudentRepo studentRepo;
    private final CourseRepo courseRepo;
    private final AssignmentRepo assignmentRepo;
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

        // Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment13_1 = createAssignment("Sequences and Series Assignment", faculty3, Date.from(LocalDate.of(2029, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        Assignment assignment13_2 = createAssignment("Techniques of Integration Assignment", faculty3, Date.from(LocalDate.of(2029, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        Assignment assignment13_3 = createAssignment("Multivariable Functions Assignment", faculty3, Date.from(LocalDate.of(2029, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        Assignment assignment13_4 = createAssignment("Vector Calculus Assignment", faculty3, Date.from(LocalDate.of(2029, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        Assignment assignment14_1 = createAssignment("Logic Assignment", faculty4, Date.from(LocalDate.of(2029, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        Assignment assignment14_2 = createAssignment("Set Theory Assignment", faculty4, Date.from(LocalDate.of(2029, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        Assignment assignment14_3 = createAssignment("Graph Theory Assignment", faculty4, Date.from(LocalDate.of(2029, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        Assignment assignment14_4 = createAssignment("Combinatorics Assignment", faculty4, Date.from(LocalDate.of(2029, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        Assignment assignment15_1 = createAssignment("Newton's Laws Assignment", faculty5, Date.from(LocalDate.of(2029, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);
        Assignment assignment15_2 = createAssignment("Energy Principles Assignment", faculty5, Date.from(LocalDate.of(2029, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);
        Assignment assignment15_3 = createAssignment("Motion Assignment", faculty5, Date.from(LocalDate.of(2029, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);
        Assignment assignment16_1 = createAssignment("Atomic Structure Assignment", faculty1, Date.from(LocalDate.of(2029, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);
        Assignment assignment16_2 = createAssignment("Chemical Bonding Assignment", faculty1, Date.from(LocalDate.of(2029, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);
        Assignment assignment16_3 = createAssignment("Reactions Assignment", faculty1, Date.from(LocalDate.of(2029, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);
        assignmentRepo.saveAllAndFlush(Arrays.asList(assignment13_1, assignment13_2, assignment13_3, assignment13_4, assignment14_1, assignment14_2, assignment14_3, assignment14_4, assignment15_1, assignment15_2, assignment15_3, assignment16_1, assignment16_2, assignment16_3));

        addStudentToAssignment(assignment13_1, student7);
        addStudentToAssignment(assignment13_1, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_13_1_1 = createProblemAnswer("What is a sequence in mathematics?", "A sequence is an ordered list of numbers or terms that follow a specific pattern or rule. Each term in the sequence is identified by its position in the list.");
        addAssignmentToProblemAnswer(pa_13_1_1, assignment13_1);
        addProblemAnswerToAssignment(assignment13_1, pa_13_1_1);

        ProblemAnswer pa_13_1_2 = createProblemAnswer("What is a series?", "A series is the sum of the terms of a sequence. It can be finite (with a fixed number of terms) or infinite (with an infinite number of terms).");
        addAssignmentToProblemAnswer(pa_13_1_2, assignment13_1);
        addProblemAnswerToAssignment(assignment13_1, pa_13_1_2);

        ProblemAnswer pa_13_1_3 = createProblemAnswer("What is a convergent series?", "A convergent series is a series whose terms approach a specific value as the number of terms increases. In other words, the sum of the series approaches a finite limit.");
        addAssignmentToProblemAnswer(pa_13_1_3, assignment13_1);
        addProblemAnswerToAssignment(assignment13_1, pa_13_1_3);

        ProblemAnswer pa_13_1_4 = createProblemAnswer("What is a divergent series?", "A divergent series is a series whose terms do not approach a specific value as the number of terms increases. The sum of the series does not converge to a finite limit.");
        addAssignmentToProblemAnswer(pa_13_1_4, assignment13_1);
        addProblemAnswerToAssignment(assignment13_1, pa_13_1_4);

        ProblemAnswer pa_13_1_5 = createProblemAnswer("What is a power series?", "A power series is an infinite series of the form Σa_n(x-c)^n, where a_n are the coefficients, x is the variable, and c is the center of the series. Power series are used to represent functions in terms of their Taylor or Maclaurin series expansions.");
        addAssignmentToProblemAnswer(pa_13_1_5, assignment13_1);
        addProblemAnswerToAssignment(assignment13_1, pa_13_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Sequences and Series' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment13_2, student7);
        addStudentToAssignment(assignment13_2, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_13_2_1 = createProblemAnswer("What is integration by parts?", "Integration by parts is a method used to integrate the product of two functions. It is based on the formula ∫u dv = uv - ∫v du, where u and v are functions of x.");
        addAssignmentToProblemAnswer(pa_13_2_1, assignment13_2);
        addProblemAnswerToAssignment(assignment13_2, pa_13_2_1);

        ProblemAnswer pa_13_2_2 = createProblemAnswer("What is partial fraction decomposition?", "Partial fraction decomposition is a technique used to break down a complex rational function into simpler fractions that can be integrated individually. It is especially useful for integrating rational functions.");
        addAssignmentToProblemAnswer(pa_13_2_2, assignment13_2);
        addProblemAnswerToAssignment(assignment13_2, pa_13_2_2);

        ProblemAnswer pa_13_2_3 = createProblemAnswer("What are trigonometric integrals?", "Trigonometric integrals involve integrals of functions that include trigonometric functions such as sine, cosine, and tangent. Techniques for evaluating these integrals include using trigonometric identities and substitution.");
        addAssignmentToProblemAnswer(pa_13_2_3, assignment13_2);
        addProblemAnswerToAssignment(assignment13_2, pa_13_2_3);

        ProblemAnswer pa_13_2_4 = createProblemAnswer("What are improper integrals?", "Improper integrals are integrals with infinite limits of integration or integrands that approach infinity at some point within the interval of integration. They are evaluated by taking the limit of the integral as it approaches the problematic point.");
        addAssignmentToProblemAnswer(pa_13_2_4, assignment13_2);
        addProblemAnswerToAssignment(assignment13_2, pa_13_2_4);

        ProblemAnswer pa_13_2_5 = createProblemAnswer("What is the method of trigonometric substitution?", "Trigonometric substitution is a technique used to simplify integrals by substituting trigonometric functions for expressions involving square roots. It is particularly useful for integrals involving radicals.");
        addAssignmentToProblemAnswer(pa_13_2_5, assignment13_2);
        addProblemAnswerToAssignment(assignment13_2, pa_13_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Techniques of Integration' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment13_3, student7);
        addStudentToAssignment(assignment13_3, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_13_3_1 = createProblemAnswer("What are multivariable functions?", "Multivariable functions are functions that have more than one input variable. They are used to model relationships involving multiple quantities and are often represented as f(x, y, z), where x, y, and z are the variables.");
        addAssignmentToProblemAnswer(pa_13_3_1, assignment13_3);
        addProblemAnswerToAssignment(assignment13_3, pa_13_3_1);

        ProblemAnswer pa_13_3_2 = createProblemAnswer("What is a partial derivative?", "A partial derivative is the derivative of a multivariable function with respect to one of its variables, while keeping the other variables constant. It measures how the function changes as that variable changes.");
        addAssignmentToProblemAnswer(pa_13_3_2, assignment13_3);
        addProblemAnswerToAssignment(assignment13_3, pa_13_3_2);

        ProblemAnswer pa_13_3_3 = createProblemAnswer("How do you calculate the gradient of a multivariable function?", "The gradient of a multivariable function is a vector that points in the direction of the steepest ascent. It is calculated by taking the partial derivatives of the function with respect to each of its variables and combining them into a vector.");
        addAssignmentToProblemAnswer(pa_13_3_3, assignment13_3);
        addProblemAnswerToAssignment(assignment13_3, pa_13_3_3);

        ProblemAnswer pa_13_3_4 = createProblemAnswer("What is a multiple integral?", "A multiple integral is an integral that involves more than one variable. It is used to calculate volumes, areas, and other quantities in higher dimensions. Examples include double integrals and triple integrals.");
        addAssignmentToProblemAnswer(pa_13_3_4, assignment13_3);
        addProblemAnswerToAssignment(assignment13_3, pa_13_3_4);

        ProblemAnswer pa_13_3_5 = createProblemAnswer("What is the Jacobian matrix?", "The Jacobian matrix is a matrix of all the first-order partial derivatives of a multivariable function. It is used to analyze the behavior of the function and to perform coordinate transformations.");
        addAssignmentToProblemAnswer(pa_13_3_5, assignment13_3);
        addProblemAnswerToAssignment(assignment13_3, pa_13_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Multivariable Functions' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment13_4, student7);
        addStudentToAssignment(assignment13_4, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_13_4_1 = createProblemAnswer("What is vector calculus?", "Vector calculus is the study of vector fields and their applications. It involves operations such as differentiation and integration of vector functions, and is used to analyze and solve problems involving vector fields.");
        addAssignmentToProblemAnswer(pa_13_4_1, assignment13_4);
        addProblemAnswerToAssignment(assignment13_4, pa_13_4_1);

        ProblemAnswer pa_13_4_2 = createProblemAnswer("What is a line integral?", "A line integral is an integral that evaluates the sum of a function along a curve. It is used to calculate quantities such as work done by a force field along a path and circulation in fluid dynamics.");
        addAssignmentToProblemAnswer(pa_13_4_2, assignment13_4);
        addProblemAnswerToAssignment(assignment13_4, pa_13_4_2);

        ProblemAnswer pa_13_4_3 = createProblemAnswer("What is a surface integral?", "A surface integral is an integral that evaluates the sum of a function over a surface. It is used to calculate quantities such as flux through a surface and surface area in three-dimensional space.");
        addAssignmentToProblemAnswer(pa_13_4_3, assignment13_4);
        addProblemAnswerToAssignment(assignment13_4, pa_13_4_3);

        ProblemAnswer pa_13_4_4 = createProblemAnswer("What is Green's Theorem?", "Green's Theorem relates the line integral around a simple, closed curve to the double integral over the region enclosed by the curve. It is used to convert between line integrals and double integrals and to analyze two-dimensional vector fields.");
        addAssignmentToProblemAnswer(pa_13_4_4, assignment13_4);
        addProblemAnswerToAssignment(assignment13_4, pa_13_4_4);

        ProblemAnswer pa_13_4_5 = createProblemAnswer("What is Stokes' Theorem?", "Stokes' Theorem relates the surface integral of the curl of a vector field over a surface to the line integral of the vector field around the boundary of the surface. It generalizes Green's Theorem to three dimensions and is used to analyze vector fields in three-dimensional space.");
        addAssignmentToProblemAnswer(pa_13_4_5, assignment13_4);
        addProblemAnswerToAssignment(assignment13_4, pa_13_4_5);


// Output for confirmation
        System.out.println("Assignment for 'Vector Calculus' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment14_1, student7);
        addStudentToAssignment(assignment14_1, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_14_1_1 = createProblemAnswer("What is propositional logic?", "Propositional logic is a branch of logic that deals with propositions, which are statements that can be either true or false. It uses logical connectives such as AND, OR, NOT, and IMPLIES to form complex logical statements.");
        addAssignmentToProblemAnswer(pa_14_1_1, assignment14_1);
        addProblemAnswerToAssignment(assignment14_1, pa_14_1_1);

        ProblemAnswer pa_14_1_2 = createProblemAnswer("What is predicate logic?", "Predicate logic, also known as first-order logic, extends propositional logic by dealing with predicates, which are statements containing variables. It allows for more expressive logical statements by using quantifiers such as FOR ALL and THERE EXISTS.");
        addAssignmentToProblemAnswer(pa_14_1_2, assignment14_1);
        addProblemAnswerToAssignment(assignment14_1, pa_14_1_2);

        ProblemAnswer pa_14_1_3 = createProblemAnswer("What are logical connectives?", "Logical connectives are symbols or words used to connect propositions and form complex logical statements. Common logical connectives include AND (∧), OR (∨), NOT (¬), IMPLIES (→), and IF AND ONLY IF (↔).");
        addAssignmentToProblemAnswer(pa_14_1_3, assignment14_1);
        addProblemAnswerToAssignment(assignment14_1, pa_14_1_3);

        ProblemAnswer pa_14_1_4 = createProblemAnswer("What is a truth table?", "A truth table is a table used to determine the truth value of a logical expression based on all possible combinations of truth values for its components. It is a useful tool for analyzing and verifying logical statements.");
        addAssignmentToProblemAnswer(pa_14_1_4, assignment14_1);
        addProblemAnswerToAssignment(assignment14_1, pa_14_1_4);

        ProblemAnswer pa_14_1_5 = createProblemAnswer("What is a logical argument?", "A logical argument is a sequence of propositions, called premises, that lead to a conclusion. An argument is valid if the conclusion logically follows from the premises, and it is sound if the premises are true.");
        addAssignmentToProblemAnswer(pa_14_1_5, assignment14_1);
        addProblemAnswerToAssignment(assignment14_1, pa_14_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Logic' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment14_2, student7);
        addStudentToAssignment(assignment14_2, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_14_2_1 = createProblemAnswer("What is a set?", "A set is a collection of distinct objects, considered as an object in its own right. Sets are fundamental objects in mathematics and are used to define various mathematical concepts.");
        addAssignmentToProblemAnswer(pa_14_2_1, assignment14_2);
        addProblemAnswerToAssignment(assignment14_2, pa_14_2_1);

        ProblemAnswer pa_14_2_2 = createProblemAnswer("What is a subset?", "A subset is a set whose elements are all contained within another set. If A is a subset of B, then every element of A is also an element of B.");
        addAssignmentToProblemAnswer(pa_14_2_2, assignment14_2);
        addProblemAnswerToAssignment(assignment14_2, pa_14_2_2);

        ProblemAnswer pa_14_2_3 = createProblemAnswer("What is the union of two sets?", "The union of two sets is a set containing all the elements of both sets. The union of sets A and B is denoted by A ∪ B and includes all elements that are in A, in B, or in both.");
        addAssignmentToProblemAnswer(pa_14_2_3, assignment14_2);
        addProblemAnswerToAssignment(assignment14_2, pa_14_2_3);

        ProblemAnswer pa_14_2_4 = createProblemAnswer("What is the intersection of two sets?", "The intersection of two sets is a set containing only the elements that are common to both sets. The intersection of sets A and B is denoted by A ∩ B and includes all elements that are in both A and B.");
        addAssignmentToProblemAnswer(pa_14_2_4, assignment14_2);
        addProblemAnswerToAssignment(assignment14_2, pa_14_2_4);

        ProblemAnswer pa_14_2_5 = createProblemAnswer("What is the difference between two sets?", "The difference between two sets is a set containing the elements of one set that are not in the other set. The difference of sets A and B is denoted by A - B and includes all elements that are in A but not in B.");
        addAssignmentToProblemAnswer(pa_14_2_5, assignment14_2);
        addProblemAnswerToAssignment(assignment14_2, pa_14_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Set Theory' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment14_3, student7);
        addStudentToAssignment(assignment14_3, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_14_3_1 = createProblemAnswer("What is graph theory?", "Graph theory is the study of graphs as mathematical structures used to model pairwise relations between objects. It involves the analysis of vertices (nodes) and edges (connections) that form graphs.");
        addAssignmentToProblemAnswer(pa_14_3_1, assignment14_3);
        addProblemAnswerToAssignment(assignment14_3, pa_14_3_1);

        ProblemAnswer pa_14_3_2 = createProblemAnswer("What is a directed graph?", "A directed graph (or digraph) is a graph in which edges have a direction, indicated by arrows. The direction of an edge shows the relationship between two vertices, such as a one-way street or hierarchy.");
        addAssignmentToProblemAnswer(pa_14_3_2, assignment14_3);
        addProblemAnswerToAssignment(assignment14_3, pa_14_3_2);

        ProblemAnswer pa_14_3_3 = createProblemAnswer("What is an undirected graph?", "An undirected graph is a graph in which edges do not have a direction. The connections between vertices are bidirectional, meaning there is no distinction between the two endpoints of an edge.");
        addAssignmentToProblemAnswer(pa_14_3_3, assignment14_3);
        addProblemAnswerToAssignment(assignment14_3, pa_14_3_3);

        ProblemAnswer pa_14_3_4 = createProblemAnswer("What is a connected graph?", "A connected graph is a graph in which there is a path between any two vertices. In other words, all vertices in the graph are reachable from any other vertex.");
        addAssignmentToProblemAnswer(pa_14_3_4, assignment14_3);
        addProblemAnswerToAssignment(assignment14_3, pa_14_3_4);

        ProblemAnswer pa_14_3_5 = createProblemAnswer("What is a cycle in a graph?", "A cycle in a graph is a path that starts and ends at the same vertex, with all edges and vertices being distinct, except for the starting and ending vertex. Cycles are important in analyzing the structure and properties of graphs.");
        addAssignmentToProblemAnswer(pa_14_3_5, assignment14_3);
        addProblemAnswerToAssignment(assignment14_3, pa_14_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Graph Theory' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment14_4, student7);
        addStudentToAssignment(assignment14_4, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_14_4_1 = createProblemAnswer("What is combinatorics?", "Combinatorics is the study of counting, arrangement, and combination of objects. It deals with problems related to the enumeration and combination of discrete structures.");
        addAssignmentToProblemAnswer(pa_14_4_1, assignment14_4);
        addProblemAnswerToAssignment(assignment14_4, pa_14_4_1);

        ProblemAnswer pa_14_4_2 = createProblemAnswer("What are permutations?", "Permutations are arrangements of objects in a specific order. The number of permutations of n distinct objects is given by n! (n factorial), which is the product of all positive integers up to n.");
        addAssignmentToProblemAnswer(pa_14_4_2, assignment14_4);
        addProblemAnswerToAssignment(assignment14_4, pa_14_4_2);

        ProblemAnswer pa_14_4_3 = createProblemAnswer("What are combinations?", "Combinations are selections of objects without regard to order. The number of combinations of n objects taken r at a time is given by C(n, r) = n! / [r!(n-r)!], also known as binomial coefficients.");
        addAssignmentToProblemAnswer(pa_14_4_3, assignment14_4);
        addProblemAnswerToAssignment(assignment14_4, pa_14_4_3);

        ProblemAnswer pa_14_4_4 = createProblemAnswer("What is the principle of multiplication?", "The principle of multiplication states that if there are m ways to do one thing and n ways to do another, then there are m * n ways to do both. It is a fundamental rule in counting and combinatorics.");
        addAssignmentToProblemAnswer(pa_14_4_4, assignment14_4);
        addProblemAnswerToAssignment(assignment14_4, pa_14_4_4);

        ProblemAnswer pa_14_4_5 = createProblemAnswer("What is the principle of addition?", "The principle of addition states that if there are m ways to do one thing and n ways to do another, and the two events are mutually exclusive, then there are m + n ways to do either. It is used to combine disjoint sets.");
        addAssignmentToProblemAnswer(pa_14_4_5, assignment14_4);
        addProblemAnswerToAssignment(assignment14_4, pa_14_4_5);


// Output for confirmation
        System.out.println("Assignment for 'Combinatorics' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment15_1, student7);
        addStudentToAssignment(assignment15_1, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_15_1_1 = createProblemAnswer("What is Newton's First Law of Motion?", "Newton's First Law of Motion, also known as the law of inertia, states that an object will remain at rest or in uniform motion in a straight line unless acted upon by an external force.");
        addAssignmentToProblemAnswer(pa_15_1_1, assignment15_1);
        addProblemAnswerToAssignment(assignment15_1, pa_15_1_1);

        ProblemAnswer pa_15_1_2 = createProblemAnswer("What is Newton's Second Law of Motion?", "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. The law is mathematically expressed as F = ma, where F is the net force, m is the mass, and a is the acceleration.");
        addAssignmentToProblemAnswer(pa_15_1_2, assignment15_1);
        addProblemAnswerToAssignment(assignment15_1, pa_15_1_2);

        ProblemAnswer pa_15_1_3 = createProblemAnswer("What is Newton's Third Law of Motion?", "Newton's Third Law of Motion states that for every action, there is an equal and opposite reaction. This means that forces always occur in pairs; if one object exerts a force on another, the second object exerts an equal and opposite force on the first.");
        addAssignmentToProblemAnswer(pa_15_1_3, assignment15_1);
        addProblemAnswerToAssignment(assignment15_1, pa_15_1_3);

        ProblemAnswer pa_15_1_4 = createProblemAnswer("What is inertia?", "Inertia is the property of an object that resists changes to its state of motion. An object with greater mass has greater inertia and requires more force to change its motion.");
        addAssignmentToProblemAnswer(pa_15_1_4, assignment15_1);
        addProblemAnswerToAssignment(assignment15_1, pa_15_1_4);

        ProblemAnswer pa_15_1_5 = createProblemAnswer("What is the equation of motion for an object under constant acceleration?", "The equation of motion for an object under constant acceleration is given by the kinematic equations: \n1. v = u + at \n2. s = ut + 0.5at^2 \n3. v^2 = u^2 + 2as \nwhere u is the initial velocity, v is the final velocity, a is the acceleration, t is the time, and s is the displacement.");
        addAssignmentToProblemAnswer(pa_15_1_5, assignment15_1);
        addProblemAnswerToAssignment(assignment15_1, pa_15_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Newton's Laws' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment15_2, student7);
        addStudentToAssignment(assignment15_2, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_15_2_1 = createProblemAnswer("What is kinetic energy?", "Kinetic energy is the energy possessed by an object due to its motion. It is calculated using the formula KE = 0.5 * m * v^2, where m is the mass of the object and v is its velocity.");
        addAssignmentToProblemAnswer(pa_15_2_1, assignment15_2);
        addProblemAnswerToAssignment(assignment15_2, pa_15_2_1);

        ProblemAnswer pa_15_2_2 = createProblemAnswer("What is potential energy?", "Potential energy is the energy stored in an object due to its position or configuration. Gravitational potential energy, for example, is calculated using the formula PE = mgh, where m is the mass, g is the acceleration due to gravity, and h is the height above a reference level.");
        addAssignmentToProblemAnswer(pa_15_2_2, assignment15_2);
        addProblemAnswerToAssignment(assignment15_2, pa_15_2_2);

        ProblemAnswer pa_15_2_3 = createProblemAnswer("What is the work-energy principle?", "The work-energy principle states that the work done on an object is equal to the change in its kinetic energy. It is mathematically expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        addAssignmentToProblemAnswer(pa_15_2_3, assignment15_2);
        addProblemAnswerToAssignment(assignment15_2, pa_15_2_3);

        ProblemAnswer pa_15_2_4 = createProblemAnswer("What is the conservation of energy?", "The conservation of energy principle states that energy cannot be created or destroyed, only transferred or transformed from one form to another. The total energy of an isolated system remains constant over time.");
        addAssignmentToProblemAnswer(pa_15_2_4, assignment15_2);
        addProblemAnswerToAssignment(assignment15_2, pa_15_2_4);

        ProblemAnswer pa_15_2_5 = createProblemAnswer("What is mechanical energy?", "Mechanical energy is the sum of kinetic and potential energy in a system. It is the energy associated with the motion and position of an object. Mechanical energy can be conserved in the absence of non-conservative forces such as friction.");
        addAssignmentToProblemAnswer(pa_15_2_5, assignment15_2);
        addProblemAnswerToAssignment(assignment15_2, pa_15_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Energy Principles' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment15_3, student7);
        addStudentToAssignment(assignment15_3, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_15_3_1 = createProblemAnswer("What is linear motion?", "Linear motion is the movement of an object along a straight path. It is described by parameters such as displacement, velocity, and acceleration.");
        addAssignmentToProblemAnswer(pa_15_3_1, assignment15_3);
        addProblemAnswerToAssignment(assignment15_3, pa_15_3_1);

        ProblemAnswer pa_15_3_2 = createProblemAnswer("What is projectile motion?", "Projectile motion is the curved path an object follows when it is thrown or projected near the Earth's surface. It is influenced by gravity and initial velocity, and its motion can be analyzed using the equations of motion.");
        addAssignmentToProblemAnswer(pa_15_3_2, assignment15_3);
        addProblemAnswerToAssignment(assignment15_3, pa_15_3_2);

        ProblemAnswer pa_15_3_3 = createProblemAnswer("What is circular motion?", "Circular motion is the movement of an object along a circular path. It is characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        addAssignmentToProblemAnswer(pa_15_3_3, assignment15_3);
        addProblemAnswerToAssignment(assignment15_3, pa_15_3_3);

        ProblemAnswer pa_15_3_4 = createProblemAnswer("What is velocity?", "Velocity is a vector quantity that describes the rate of change of an object's displacement with respect to time. It has both magnitude and direction and is measured in meters per second (m/s).");
        addAssignmentToProblemAnswer(pa_15_3_4, assignment15_3);
        addProblemAnswerToAssignment(assignment15_3, pa_15_3_4);

        ProblemAnswer pa_15_3_5 = createProblemAnswer("What is acceleration?", "Acceleration is a vector quantity that describes the rate of change of an object's velocity with respect to time. It is measured in meters per second squared (m/s^2).");
        addAssignmentToProblemAnswer(pa_15_3_5, assignment15_3);
        addProblemAnswerToAssignment(assignment15_3, pa_15_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Motion' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment16_1, student7);
        addStudentToAssignment(assignment16_1, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_16_1_1 = createProblemAnswer("What are the main subatomic particles in an atom?", "The main subatomic particles in an atom are protons, neutrons, and electrons. Protons and neutrons are located in the nucleus, while electrons orbit the nucleus in electron shells.");
        addAssignmentToProblemAnswer(pa_16_1_1, assignment16_1);
        addProblemAnswerToAssignment(assignment16_1, pa_16_1_1);

        ProblemAnswer pa_16_1_2 = createProblemAnswer("What is the atomic number?", "The atomic number is the number of protons in the nucleus of an atom. It defines the element and its position in the periodic table. For example, the atomic number of hydrogen is 1, and the atomic number of carbon is 6.");
        addAssignmentToProblemAnswer(pa_16_1_2, assignment16_1);
        addProblemAnswerToAssignment(assignment16_1, pa_16_1_2);

        ProblemAnswer pa_16_1_3 = createProblemAnswer("What is the mass number?", "The mass number is the total number of protons and neutrons in the nucleus of an atom. It is used to distinguish between different isotopes of an element. For example, carbon-12 has a mass number of 12 (6 protons and 6 neutrons).");
        addAssignmentToProblemAnswer(pa_16_1_3, assignment16_1);
        addProblemAnswerToAssignment(assignment16_1, pa_16_1_3);

        ProblemAnswer pa_16_1_4 = createProblemAnswer("What are isotopes?", "Isotopes are atoms of the same element that have different numbers of neutrons and, therefore, different mass numbers. For example, carbon-12 and carbon-14 are isotopes of carbon.");
        addAssignmentToProblemAnswer(pa_16_1_4, assignment16_1);
        addProblemAnswerToAssignment(assignment16_1, pa_16_1_4);

        ProblemAnswer pa_16_1_5 = createProblemAnswer("What is the electron configuration?", "Electron configuration is the distribution of electrons in an atom's electron shells. It follows the Aufbau principle, Pauli exclusion principle, and Hund's rule. For example, the electron configuration of carbon is 1s^2 2s^2 2p^2.");
        addAssignmentToProblemAnswer(pa_16_1_5, assignment16_1);
        addProblemAnswerToAssignment(assignment16_1, pa_16_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Atomic Structure' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment16_2, student7);
        addStudentToAssignment(assignment16_2, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_16_2_1 = createProblemAnswer("What is a chemical bond?", "A chemical bond is a force of attraction that holds atoms together in a molecule or compound. It is formed by the sharing or transfer of electrons between atoms.");
        addAssignmentToProblemAnswer(pa_16_2_1, assignment16_2);
        addProblemAnswerToAssignment(assignment16_2, pa_16_2_1);

        ProblemAnswer pa_16_2_2 = createProblemAnswer("What is an ionic bond?", "An ionic bond is a type of chemical bond formed by the electrostatic attraction between oppositely charged ions. It occurs when one atom donates an electron to another, resulting in the formation of positive and negative ions.");
        addAssignmentToProblemAnswer(pa_16_2_2, assignment16_2);
        addProblemAnswerToAssignment(assignment16_2, pa_16_2_2);

        ProblemAnswer pa_16_2_3 = createProblemAnswer("What is a covalent bond?", "A covalent bond is a type of chemical bond formed by the sharing of electron pairs between atoms. It occurs when atoms have similar electronegativities and share electrons to achieve a stable electron configuration.");
        addAssignmentToProblemAnswer(pa_16_2_3, assignment16_2);
        addProblemAnswerToAssignment(assignment16_2, pa_16_2_3);

        ProblemAnswer pa_16_2_4 = createProblemAnswer("What is a metallic bond?", "A metallic bond is a type of chemical bond found in metals. It involves the attraction between positively charged metal ions and the sea of delocalized electrons that move freely throughout the metal lattice.");
        addAssignmentToProblemAnswer(pa_16_2_4, assignment16_2);
        addProblemAnswerToAssignment(assignment16_2, pa_16_2_4);

        ProblemAnswer pa_16_2_5 = createProblemAnswer("What is electronegativity?", "Electronegativity is a measure of an atom's ability to attract and hold onto electrons in a chemical bond. It determines the type of bond formed between atoms. For example, fluorine has the highest electronegativity, while francium has the lowest.");
        addAssignmentToProblemAnswer(pa_16_2_5, assignment16_2);
        addProblemAnswerToAssignment(assignment16_2, pa_16_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Chemical Bonding' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        addStudentToAssignment(assignment16_3, student7);
        addStudentToAssignment(assignment16_3, student8);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_16_3_1 = createProblemAnswer("What is a chemical reaction?", "A chemical reaction is a process in which substances (reactants) are transformed into different substances (products) through the breaking and forming of chemical bonds.");
        addAssignmentToProblemAnswer(pa_16_3_1, assignment16_3);
        addProblemAnswerToAssignment(assignment16_3, pa_16_3_1);

        ProblemAnswer pa_16_3_2 = createProblemAnswer("What are reactants and products?", "Reactants are the starting substances in a chemical reaction, while products are the substances formed as a result of the reaction. The reactants undergo chemical changes to form the products.");
        addAssignmentToProblemAnswer(pa_16_3_2, assignment16_3);
        addProblemAnswerToAssignment(assignment16_3, pa_16_3_2);

        ProblemAnswer pa_16_3_3 = createProblemAnswer("What is the law of conservation of mass?", "The law of conservation of mass states that mass is neither created nor destroyed in a chemical reaction. The total mass of the reactants is equal to the total mass of the products.");
        addAssignmentToProblemAnswer(pa_16_3_3, assignment16_3);
        addProblemAnswerToAssignment(assignment16_3, pa_16_3_3);

        ProblemAnswer pa_16_3_4 = createProblemAnswer("What are the different types of chemical reactions?", "Different types of chemical reactions include synthesis (combination), decomposition, single displacement, double displacement, combustion, and redox (oxidation-reduction) reactions.");
        addAssignmentToProblemAnswer(pa_16_3_4, assignment16_3);
        addProblemAnswerToAssignment(assignment16_3, pa_16_3_4);

        ProblemAnswer pa_16_3_5 = createProblemAnswer("What is a synthesis reaction?", "A synthesis reaction, also known as a combination reaction, occurs when two or more reactants combine to form a single product. The general form is A + B → AB.");
        addAssignmentToProblemAnswer(pa_16_3_5, assignment16_3);
        addProblemAnswerToAssignment(assignment16_3, pa_16_3_5);
        problemAnswerRepo.saveAllAndFlush(Arrays.asList(pa_13_1_1, pa_13_1_2, pa_13_1_3, pa_13_1_4, pa_13_1_5, pa_13_2_1, pa_13_2_2, pa_13_2_3, pa_13_2_4, pa_13_2_5, pa_13_3_1, pa_13_3_2, pa_13_3_3, pa_13_3_4, pa_13_3_5, pa_13_4_1, pa_13_4_2, pa_13_4_3, pa_13_4_4, pa_13_4_5, pa_14_1_1, pa_14_1_2, pa_14_1_3, pa_14_1_4, pa_14_1_5, pa_14_2_1, pa_14_2_2, pa_14_2_3, pa_14_2_4, pa_14_2_5, pa_14_3_1, pa_14_3_2, pa_14_3_3, pa_14_3_4, pa_14_3_5, pa_14_4_1, pa_14_4_2, pa_14_4_3, pa_14_4_4, pa_14_4_5, pa_15_1_1, pa_15_1_2, pa_15_1_3, pa_15_1_4, pa_15_1_5, pa_15_2_1, pa_15_2_2, pa_15_2_3, pa_15_2_4, pa_15_2_5, pa_15_3_1, pa_15_3_2, pa_15_3_3, pa_15_3_4, pa_15_3_5, pa_16_1_1, pa_16_1_2, pa_16_1_3, pa_16_1_4, pa_16_1_5, pa_16_2_1, pa_16_2_2, pa_16_2_3, pa_16_2_4, pa_16_2_5, pa_16_3_1, pa_16_3_2, pa_16_3_3, pa_16_3_4, pa_16_3_5));


        // Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment12_5.");
// Creating StudentAnswer instances for student7
        // Creating StudentAnswer instances for student7
        StudentAnswer sa13_1_1_student7 = createStudentAnswer(student7, pa_13_1_1, "A sequence is an ordered list of numbers or terms that follow a specific pattern or rule, with each term identified by its position in the list.");
        StudentAnswer sa13_1_2_student7 = createStudentAnswer(student7, pa_13_1_2, "A series is the sum of the terms of a sequence, which can be finite with a fixed number of terms or infinite with an infinite number of terms.");
        StudentAnswer sa13_1_3_student7 = createStudentAnswer(student7, pa_13_1_3, "A convergent series is a series whose terms approach a specific value as the number of terms increases, meaning the sum of the series approaches a finite limit.");
        StudentAnswer sa13_1_4_student7 = createStudentAnswer(student7, pa_13_1_4, "A divergent series is a series whose terms do not approach a specific value as the number of terms increases, meaning the sum of the series does not converge to a finite limit.");
        StudentAnswer sa13_1_5_student7 = createStudentAnswer(student7, pa_13_1_5, "A power series is an infinite series of the form Σa_n(x-c)^n, where a_n are the coefficients, x is the variable, and c is the center of the series, used to represent functions in terms of Taylor or Maclaurin series expansions.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa13_1_1_student8 = createStudentAnswer(student8, pa_13_1_1, "A sequence is an ordered list of numbers or terms that follow a specific pattern or rule, with each term identified by its position in the list.");
        StudentAnswer sa13_1_2_student8 = createStudentAnswer(student8, pa_13_1_2, "A series is the sum of the terms of a sequence, which can be finite with a fixed number of terms or infinite with an infinite number of terms.");
        StudentAnswer sa13_1_3_student8 = createStudentAnswer(student8, pa_13_1_3, "A convergent series is a series whose terms approach a specific value as the number of terms increases, meaning the sum of the series approaches a finite limit.");
        StudentAnswer sa13_1_4_student8 = createStudentAnswer(student8, pa_13_1_4, "A divergent series is a series whose terms do not approach a specific value as the number of terms increases, meaning the sum of the series does not converge to a finite limit.");
        StudentAnswer sa13_1_5_student8 = createStudentAnswer(student8, pa_13_1_5, "A power series is an infinite series of the form Σa_n(x-c)^n, where a_n are the coefficients, x is the variable, and c is the center of the series, used to represent functions in terms of Taylor or Maclaurin series expansions.");

// Creating StudentAnswer instances for student7
        StudentAnswer sa13_2_1_student7 = createStudentAnswer(student7, pa_13_2_1, "Integration by parts is a method used to integrate the product of two functions, based on the formula ∫u dv = uv - ∫v du, where u and v are functions of x.");
        StudentAnswer sa13_2_2_student7 = createStudentAnswer(student7, pa_13_2_2, "Partial fraction decomposition breaks down a complex rational function into simpler fractions that can be integrated individually, useful for integrating rational functions.");
        StudentAnswer sa13_2_3_student7 = createStudentAnswer(student7, pa_13_2_3, "Trigonometric integrals involve integrals of functions with trigonometric functions like sine, cosine, and tangent. Techniques include using trigonometric identities and substitution.");
        StudentAnswer sa13_2_4_student7 = createStudentAnswer(student7, pa_13_2_4, "Improper integrals have infinite limits of integration or integrands that approach infinity within the integration interval, evaluated by taking the limit of the integral as it approaches the problematic point.");
        StudentAnswer sa13_2_5_student7 = createStudentAnswer(student7, pa_13_2_5, "Trigonometric substitution simplifies integrals by substituting trigonometric functions for expressions with square roots, useful for integrals involving radicals.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa13_2_1_student8 = createStudentAnswer(student8, pa_13_2_1, "Integration by parts is a method used to integrate the product of two functions, based on the formula ∫u dv = uv - ∫v du, where u and v are functions of x.");
        StudentAnswer sa13_2_2_student8 = createStudentAnswer(student8, pa_13_2_2, "Partial fraction decomposition breaks down a complex rational function into simpler fractions that can be integrated individually, useful for integrating rational functions.");
        StudentAnswer sa13_2_3_student8 = createStudentAnswer(student8, pa_13_2_3, "Trigonometric integrals involve integrals of functions with trigonometric functions like sine, cosine, and tangent. Techniques include using trigonometric identities and substitution.");
        StudentAnswer sa13_2_4_student8 = createStudentAnswer(student8, pa_13_2_4, "Improper integrals have infinite limits of integration or integrands that approach infinity within the integration interval, evaluated by taking the limit of the integral as it approaches the problematic point.");
        StudentAnswer sa13_2_5_student8 = createStudentAnswer(student8, pa_13_2_5, "Trigonometric substitution simplifies integrals by substituting trigonometric functions for expressions with square roots, useful for integrals involving radicals.");


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment13_2.");
// Creating StudentAnswer instances for student7
        // Creating StudentAnswer instances for student7
        StudentAnswer sa13_3_1_student7 = createStudentAnswer(student7, pa_13_3_1, "Multivariable functions have more than one input variable and model relationships involving multiple quantities, often represented as f(x, y, z).");
        StudentAnswer sa13_3_2_student7 = createStudentAnswer(student7, pa_13_3_2, "A partial derivative is the derivative of a multivariable function with respect to one variable, while keeping the other variables constant, measuring how the function changes as that variable changes.");
        StudentAnswer sa13_3_3_student7 = createStudentAnswer(student7, pa_13_3_3, "The gradient of a multivariable function is a vector pointing in the direction of the steepest ascent, calculated by taking the partial derivatives with respect to each variable and combining them into a vector.");
        StudentAnswer sa13_3_4_student7 = createStudentAnswer(student7, pa_13_3_4, "A multiple integral involves more than one variable and is used to calculate volumes, areas, and other quantities in higher dimensions, such as double and triple integrals.");
        StudentAnswer sa13_3_5_student7 = createStudentAnswer(student7, pa_13_3_5, "The Jacobian matrix is a matrix of all first-order partial derivatives of a multivariable function, used to analyze the function's behavior and perform coordinate transformations.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa13_3_1_student8 = createStudentAnswer(student8, pa_13_3_1, "Multivariable functions have more than one input variable and model relationships involving multiple quantities, often represented as f(x, y, z).");
        StudentAnswer sa13_3_2_student8 = createStudentAnswer(student8, pa_13_3_2, "A partial derivative is the derivative of a multivariable function with respect to one variable, while keeping the other variables constant, measuring how the function changes as that variable changes.");
        StudentAnswer sa13_3_3_student8 = createStudentAnswer(student8, pa_13_3_3, "The gradient of a multivariable function is a vector pointing in the direction of the steepest ascent, calculated by taking the partial derivatives with respect to each variable and combining them into a vector.");
        StudentAnswer sa13_3_4_student8 = createStudentAnswer(student8, pa_13_3_4, "A multiple integral involves more than one variable and is used to calculate volumes, areas, and other quantities in higher dimensions, such as double and triple integrals.");
        StudentAnswer sa13_3_5_student8 = createStudentAnswer(student8, pa_13_3_5, "The Jacobian matrix is a matrix of all first-order partial derivatives of a multivariable function, used to analyze the function's behavior and perform coordinate transformations.");

// Output for confirmation
        System.out.println("Student answers created for student7 and student8 for all problem answers in assignment13_3.");

// Creating StudentAnswer instances for student7
        StudentAnswer sa13_4_1_student7 = createStudentAnswer(student7, pa_13_4_1, "Vector calculus is the study of vector fields and their applications, involving operations like differentiation and integration of vector functions to solve problems with vector fields.");
        StudentAnswer sa13_4_2_student7 = createStudentAnswer(student7, pa_13_4_2, "A line integral evaluates the sum of a function along a curve, used to calculate quantities like work done by a force field along a path and circulation in fluid dynamics.");
        StudentAnswer sa13_4_3_student7 = createStudentAnswer(student7, pa_13_4_3, "A surface integral evaluates the sum of a function over a surface, used to calculate quantities like flux through a surface and surface area in three-dimensional space.");
        StudentAnswer sa13_4_4_student7 = createStudentAnswer(student7, pa_13_4_4, "Green's Theorem relates the line integral around a simple, closed curve to the double integral over the enclosed region, converting between line integrals and double integrals to analyze two-dimensional vector fields.");
        StudentAnswer sa13_4_5_student7 = createStudentAnswer(student7, pa_13_4_5, "Stokes' Theorem relates the surface integral of the curl of a vector field over a surface to the line integral of the vector field around the surface's boundary, generalizing Green's Theorem to three dimensions.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa13_4_1_student8 = createStudentAnswer(student8, pa_13_4_1, "Vector calculus is the study of vector fields and their applications, involving operations like differentiation and integration of vector functions to solve problems with vector fields.");
        StudentAnswer sa13_4_2_student8 = createStudentAnswer(student8, pa_13_4_2, "A line integral evaluates the sum of a function along a curve, used to calculate quantities like work done by a force field along a path and circulation in fluid dynamics.");
        StudentAnswer sa13_4_3_student8 = createStudentAnswer(student8, pa_13_4_3, "A surface integral evaluates the sum of a function over a surface, used to calculate quantities like flux through a surface and surface area in three-dimensional space.");
        StudentAnswer sa13_4_4_student8 = createStudentAnswer(student8, pa_13_4_4, "Green's Theorem relates the line integral around a simple, closed curve to the double integral over the enclosed region, converting between line integrals and double integrals to analyze two-dimensional vector fields.");
        StudentAnswer sa13_4_5_student8 = createStudentAnswer(student8, pa_13_4_5, "Stokes' Theorem relates the surface integral of the curl of a vector field over a surface to the line integral of the vector field around the surface's boundary, generalizing Green's Theorem to three dimensions.");

// Output for confirmation
        System.out.println("Student answers created for student7 and student8 for all problem answers in assignment13_4.");


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment13_4.");
// Creating StudentAnswer instances for student7
        // Creating StudentAnswer instances for student7
        StudentAnswer sa14_1_1_student7 = createStudentAnswer(student7, pa_14_1_1, "Propositional logic deals with propositions, which are statements that can be true or false, and uses logical connectives like AND, OR, NOT, and IMPLIES to form complex statements.");
        StudentAnswer sa14_1_2_student7 = createStudentAnswer(student7, pa_14_1_2, "Predicate logic, or first-order logic, extends propositional logic by dealing with predicates, which are statements with variables, and uses quantifiers like FOR ALL and THERE EXISTS for more expressive statements.");
        StudentAnswer sa14_1_3_student7 = createStudentAnswer(student7, pa_14_1_3, "Logical connectives are symbols or words used to connect propositions and form complex logical statements. Common logical connectives include AND (∧), OR (∨), NOT (¬), IMPLIES (→), and IF AND ONLY IF (↔).");
        StudentAnswer sa14_1_4_student7 = createStudentAnswer(student7, pa_14_1_4, "A truth table determines the truth value of a logical expression based on all possible combinations of truth values for its components, useful for analyzing and verifying logical statements.");
        StudentAnswer sa14_1_5_student7 = createStudentAnswer(student7, pa_14_1_5, "A logical argument is a sequence of propositions leading to a conclusion. An argument is valid if the conclusion logically follows from the premises, and sound if the premises are true.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa14_1_1_student8 = createStudentAnswer(student8, pa_14_1_1, "Propositional logic deals with propositions, which are statements that can be true or false, and uses logical connectives like AND, OR, NOT, and IMPLIES to form complex statements.");
        StudentAnswer sa14_1_2_student8 = createStudentAnswer(student8, pa_14_1_2, "Predicate logic, or first-order logic, extends propositional logic by dealing with predicates, which are statements with variables, and uses quantifiers like FOR ALL and THERE EXISTS for more expressive statements.");
        StudentAnswer sa14_1_3_student8 = createStudentAnswer(student8, pa_14_1_3, "Logical connectives are symbols or words used to connect propositions and form complex logical statements. Common logical connectives include AND (∧), OR (∨), NOT (¬), IMPLIES (→), and IF AND ONLY IF (↔).");
        StudentAnswer sa14_1_4_student8 = createStudentAnswer(student8, pa_14_1_4, "A truth table determines the truth value of a logical expression based on all possible combinations of truth values for its components, useful for analyzing and verifying logical statements.");
        StudentAnswer sa14_1_5_student8 = createStudentAnswer(student8, pa_14_1_5, "A logical argument is a sequence of propositions leading to a conclusion. An argument is valid if the conclusion logically follows from the premises, and sound if the premises are true.");

// Output for confirmation
        System.out.println("Student answers created for student7 and student8 for all problem answers in assignment14_1.");

// Creating StudentAnswer instances for student7
        StudentAnswer sa14_2_1_student7 = createStudentAnswer(student7, pa_14_2_1, "A set is a collection of distinct objects, considered as an object in its own right, fundamental in mathematics and used to define various concepts.");
        StudentAnswer sa14_2_2_student7 = createStudentAnswer(student7, pa_14_2_2, "A subset is a set whose elements are all contained within another set. If A is a subset of B, every element of A is also an element of B.");
        StudentAnswer sa14_2_3_student7 = createStudentAnswer(student7, pa_14_2_3, "The union of two sets is a set containing all the elements of both sets. The union of sets A and B is denoted by A ∪ B and includes all elements in A, B, or both.");
        StudentAnswer sa14_2_4_student7 = createStudentAnswer(student7, pa_14_2_4, "The intersection of two sets is a set containing only the elements that are common to both sets. The intersection of sets A and B is denoted by A ∩ B and includes all elements in both A and B.");
        StudentAnswer sa14_2_5_student7 = createStudentAnswer(student7, pa_14_2_5, "The difference between two sets is a set containing the elements of one set that are not in the other. The difference of sets A and B is denoted by A - B and includes all elements in A but not in B.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa14_2_1_student8 = createStudentAnswer(student8, pa_14_2_1, "A set is a collection of distinct objects, considered as an object in its own right, fundamental in mathematics and used to define various concepts.");
        StudentAnswer sa14_2_2_student8 = createStudentAnswer(student8, pa_14_2_2, "A subset is a set whose elements are all contained within another set. If A is a subset of B, every element of A is also an element of B.");
        StudentAnswer sa14_2_3_student8 = createStudentAnswer(student8, pa_14_2_3, "The union of two sets is a set containing all the elements of both sets. The union of sets A and B is denoted by A ∪ B and includes all elements in A, B, or both.");
        StudentAnswer sa14_2_4_student8 = createStudentAnswer(student8, pa_14_2_4, "The intersection of two sets is a set containing only the elements that are common to both sets. The intersection of sets A and B is denoted by A ∩ B and includes all elements in both A and B.");
        StudentAnswer sa14_2_5_student8 = createStudentAnswer(student8, pa_14_2_5, "The difference between two sets is a set containing the elements of one set that are not in the other. The difference of sets A and B is denoted by A - B and includes all elements in A but not in B.");


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment14_2.");
// Creating StudentAnswer instances for student7
        // Creating StudentAnswer instances for student7
        StudentAnswer sa14_3_1_student7 = createStudentAnswer(student7, pa_14_3_1, "Graph theory is the study of graphs as mathematical structures used to model pairwise relations between objects, involving the analysis of vertices (nodes) and edges (connections) that form graphs.");
        StudentAnswer sa14_3_2_student7 = createStudentAnswer(student7, pa_14_3_2, "A directed graph (or digraph) is a graph in which edges have a direction, indicated by arrows, showing the relationship between two vertices, like a one-way street or hierarchy.");
        StudentAnswer sa14_3_3_student7 = createStudentAnswer(student7, pa_14_3_3, "An undirected graph is a graph in which edges do not have a direction. The connections between vertices are bidirectional, meaning there is no distinction between the two endpoints of an edge.");
        StudentAnswer sa14_3_4_student7 = createStudentAnswer(student7, pa_14_3_4, "A connected graph is a graph in which there is a path between any two vertices, meaning all vertices in the graph are reachable from any other vertex.");
        StudentAnswer sa14_3_5_student7 = createStudentAnswer(student7, pa_14_3_5, "A cycle in a graph is a path that starts and ends at the same vertex, with all edges and vertices being distinct except for the starting and ending vertex, important for analyzing graph structure and properties.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa14_3_1_student8 = createStudentAnswer(student8, pa_14_3_1, "Graph theory is the study of graphs as mathematical structures used to model pairwise relations between objects, involving the analysis of vertices (nodes) and edges (connections) that form graphs.");
        StudentAnswer sa14_3_2_student8 = createStudentAnswer(student8, pa_14_3_2, "A directed graph (or digraph) is a graph in which edges have a direction, indicated by arrows, showing the relationship between two vertices, like a one-way street or hierarchy.");
        StudentAnswer sa14_3_3_student8 = createStudentAnswer(student8, pa_14_3_3, "An undirected graph is a graph in which edges do not have a direction. The connections between vertices are bidirectional, meaning there is no distinction between the two endpoints of an edge.");
        StudentAnswer sa14_3_4_student8 = createStudentAnswer(student8, pa_14_3_4, "A connected graph is a graph in which there is a path between any two vertices, meaning all vertices in the graph are reachable from any other vertex.");
        StudentAnswer sa14_3_5_student8 = createStudentAnswer(student8, pa_14_3_5, "A cycle in a graph is a path that starts and ends at the same vertex, with all edges and vertices being distinct except for the starting and ending vertex, important for analyzing graph structure and properties.");

// Output for confirmation
        System.out.println("Student answers created for student7 and student8 for all problem answers in assignment14_3.");

// Creating StudentAnswer instances for student7
        StudentAnswer sa14_4_1_student7 = createStudentAnswer(student7, pa_14_4_1, "Combinatorics is the study of counting, arrangement, and combination of objects, dealing with problems related to enumeration and combination of discrete structures.");
        StudentAnswer sa14_4_2_student7 = createStudentAnswer(student7, pa_14_4_2, "Permutations are arrangements of objects in a specific order. The number of permutations of n distinct objects is given by n! (n factorial), the product of all positive integers up to n.");
        StudentAnswer sa14_4_3_student7 = createStudentAnswer(student7, pa_14_4_3, "Combinations are selections of objects without regard to order. The number of combinations of n objects taken r at a time is given by C(n, r) = n! / [r!(n-r)!], known as binomial coefficients.");
        StudentAnswer sa14_4_4_student7 = createStudentAnswer(student7, pa_14_4_4, "The principle of multiplication states that if there are m ways to do one thing and n ways to do another, there are m * n ways to do both, a fundamental rule in counting and combinatorics.");
        StudentAnswer sa14_4_5_student7 = createStudentAnswer(student7, pa_14_4_5, "The principle of addition states that if there are m ways to do one thing and n ways to do another, and the two events are mutually exclusive, there are m + n ways to do either, used to combine disjoint sets.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa14_4_1_student8 = createStudentAnswer(student8, pa_14_4_1, "Combinatorics is the study of counting, arrangement, and combination of objects, dealing with problems related to enumeration and combination of discrete structures.");
        StudentAnswer sa14_4_2_student8 = createStudentAnswer(student8, pa_14_4_2, "Permutations are arrangements of objects in a specific order. The number of permutations of n distinct objects is given by n! (n factorial), the product of all positive integers up to n.");
        StudentAnswer sa14_4_3_student8 = createStudentAnswer(student8, pa_14_4_3, "Combinations are selections of objects without regard to order. The number of combinations of n objects taken r at a time is given by C(n, r) = n! / [r!(n-r)!], known as binomial coefficients.");
        StudentAnswer sa14_4_4_student8 = createStudentAnswer(student8, pa_14_4_4, "The principle of multiplication states that if there are m ways to do one thing and n ways to do another, there are m * n ways to do both, a fundamental rule in counting and combinatorics.");
        StudentAnswer sa14_4_5_student8 = createStudentAnswer(student8, pa_14_4_5, "The principle of addition states that if there are m ways to do one thing and n ways to do another, and the two events are mutually exclusive, there are m + n ways to do either, used to combine disjoint sets.");

// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment14_4.");
// Creating StudentAnswer instances for student7
        // Creating StudentAnswer instances for student7
        StudentAnswer sa15_1_1_student7 = createStudentAnswer(student7, pa_15_1_1, "Newton's First Law of Motion, also known as the law of inertia, states that an object will remain at rest or in uniform motion in a straight line unless acted upon by an external force.");
        StudentAnswer sa15_1_2_student7 = createStudentAnswer(student7, pa_15_1_2, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. The law is mathematically expressed as F = ma, where F is the net force, m is the mass, and a is the acceleration.");
        StudentAnswer sa15_1_3_student7 = createStudentAnswer(student7, pa_15_1_3, "Newton's Third Law of Motion states that for every action, there is an equal and opposite reaction. This means that forces always occur in pairs; if one object exerts a force on another, the second object exerts an equal and opposite force on the first.");
        StudentAnswer sa15_1_4_student7 = createStudentAnswer(student7, pa_15_1_4, "Inertia is the property of an object that resists changes to its state of motion. An object with greater mass has greater inertia and requires more force to change its motion.");
        StudentAnswer sa15_1_5_student7 = createStudentAnswer(student7, pa_15_1_5, "The equation of motion for an object under constant acceleration is given by the kinematic equations: \n1. v = u + at \n2. s = ut + 0.5at^2 \n3. v^2 = u^2 + 2as \nwhere u is the initial velocity, v is the final velocity, a is the acceleration, t is the time, and s is the displacement.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa15_1_1_student8 = createStudentAnswer(student8, pa_15_1_1, "Newton's First Law of Motion, also known as the law of inertia, states that an object will remain at rest or in uniform motion in a straight line unless acted upon by an external force.");
        StudentAnswer sa15_1_2_student8 = createStudentAnswer(student8, pa_15_1_2, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. The law is mathematically expressed as F = ma, where F is the net force, m is the mass, and a is the acceleration.");
        StudentAnswer sa15_1_3_student8 = createStudentAnswer(student8, pa_15_1_3, "Newton's Third Law of Motion states that for every action, there is an equal and opposite reaction. This means that forces always occur in pairs; if one object exerts a force on another, the second object exerts an equal and opposite force on the first.");
        StudentAnswer sa15_1_4_student8 = createStudentAnswer(student8, pa_15_1_4, "Inertia is the property of an object that resists changes to its state of motion. An object with greater mass has greater inertia and requires more force to change its motion.");
        StudentAnswer sa15_1_5_student8 = createStudentAnswer(student8, pa_15_1_5, "The equation of motion for an object under constant acceleration is given by the kinematic equations: \n1. v = u + at \n2. s = ut + 0.5at^2 \n3. v^2 = u^2 + 2as \nwhere u is the initial velocity, v is the final velocity, a is the acceleration, t is the time, and s is the displacement.");

// Output for confirmation
        System.out.println("Student answers created for student7 and student8 for all problem answers in assignment15_1.");

// Creating StudentAnswer instances for student7
        StudentAnswer sa15_2_1_student7 = createStudentAnswer(student7, pa_15_2_1, "Kinetic energy is the energy possessed by an object due to its motion. It is calculated using the formula KE = 0.5 * m * v^2, where m is the mass of the object and v is its velocity.");
        StudentAnswer sa15_2_2_student7 = createStudentAnswer(student7, pa_15_2_2, "Potential energy is the energy stored in an object due to its position or configuration. Gravitational potential energy is calculated using the formula PE = mgh, where m is the mass, g is the acceleration due to gravity, and h is the height above a reference level.");
        StudentAnswer sa15_2_3_student7 = createStudentAnswer(student7, pa_15_2_3, "The work-energy principle states that the work done on an object is equal to the change in its kinetic energy. It is mathematically expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        StudentAnswer sa15_2_4_student7 = createStudentAnswer(student7, pa_15_2_4, "The conservation of energy principle states that energy cannot be created or destroyed, only transferred or transformed from one form to another. The total energy of an isolated system remains constant over time.");
        StudentAnswer sa15_2_5_student7 = createStudentAnswer(student7, pa_15_2_5, "Mechanical energy is the sum of kinetic and potential energy in a system. It is the energy associated with the motion and position of an object. Mechanical energy can be conserved in the absence of non-conservative forces such as friction.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa15_2_1_student8 = createStudentAnswer(student8, pa_15_2_1, "Kinetic energy is the energy possessed by an object due to its motion. It is calculated using the formula KE = 0.5 * m * v^2, where m is the mass of the object and v is its velocity.");
        StudentAnswer sa15_2_2_student8 = createStudentAnswer(student8, pa_15_2_2, "Potential energy is the energy stored in an object due to its position or configuration. Gravitational potential energy is calculated using the formula PE = mgh, where m is the mass, g is the acceleration due to gravity, and h is the height above a reference level.");
        StudentAnswer sa15_2_3_student8 = createStudentAnswer(student8, pa_15_2_3, "The work-energy principle states that the work done on an object is equal to the change in its kinetic energy. It is mathematically expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        StudentAnswer sa15_2_4_student8 = createStudentAnswer(student8, pa_15_2_4, "The conservation of energy principle states that energy cannot be created or destroyed, only transferred or transformed from one form to another. The total energy of an isolated system remains constant over time.");
        StudentAnswer sa15_2_5_student8 = createStudentAnswer(student8, pa_15_2_5, "Mechanical energy is the sum of kinetic and potential energy in a system. It is the energy associated with the motion and position of an object. Mechanical energy can be conserved in the absence of non-conservative forces such as friction.");

// Output for confirmation
        System.out.println("Student answers created for student7 and student8 for all problem answers in assignment15_2.");

        // Creating StudentAnswer instances for student7
        StudentAnswer sa15_3_1_student7 = createStudentAnswer(student7, pa_15_3_1, "Linear motion is the movement of an object along a straight path. It is described by parameters such as displacement, velocity, and acceleration.");
        StudentAnswer sa15_3_2_student7 = createStudentAnswer(student7, pa_15_3_2, "Projectile motion is the curved path an object follows when it is thrown or projected near the Earth's surface. It is influenced by gravity and initial velocity, and its motion can be analyzed using the equations of motion.");
        StudentAnswer sa15_3_3_student7 = createStudentAnswer(student7, pa_15_3_3, "Circular motion is the movement of an object along a circular path. It is characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        StudentAnswer sa15_3_4_student7 = createStudentAnswer(student7, pa_15_3_4, "Velocity is a vector quantity that describes the rate of change of an object's displacement with respect to time. It has both magnitude and direction and is measured in meters per second (m/s).");
        StudentAnswer sa15_3_5_student7 = createStudentAnswer(student7, pa_15_3_5, "Acceleration is a vector quantity that describes the rate of change of an object's velocity with respect to time. It is measured in meters per second squared (m/s^2).");

// Creating StudentAnswer instances for student8
        StudentAnswer sa15_3_1_student8 = createStudentAnswer(student8, pa_15_3_1, "Linear motion is the movement of an object along a straight path. It is described by parameters such as displacement, velocity, and acceleration.");
        StudentAnswer sa15_3_2_student8 = createStudentAnswer(student8, pa_15_3_2, "Projectile motion is the curved path an object follows when it is thrown or projected near the Earth's surface. It is influenced by gravity and initial velocity, and its motion can be analyzed using the equations of motion.");
        StudentAnswer sa15_3_3_student8 = createStudentAnswer(student8, pa_15_3_3, "Circular motion is the movement of an object along a circular path. It is characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        StudentAnswer sa15_3_4_student8 = createStudentAnswer(student8, pa_15_3_4, "Velocity is a vector quantity that describes the rate of change of an object's displacement with respect to time. It has both magnitude and direction and is measured in meters per second (m/s).");
        StudentAnswer sa15_3_5_student8 = createStudentAnswer(student8, pa_15_3_5, "Acceleration is a vector quantity that describes the rate of change of an object's velocity with respect to time. It is measured in meters per second squared (m/s^2).");

// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment15_3.");
// Creating StudentAnswer instances for student7
        // Creating StudentAnswer instances for student7
        StudentAnswer sa16_1_1_student7 = createStudentAnswer(student7, pa_16_1_1, "The main subatomic particles in an atom are protons, neutrons, and electrons. Protons and neutrons are located in the nucleus, while electrons orbit the nucleus in electron shells.");
        StudentAnswer sa16_1_2_student7 = createStudentAnswer(student7, pa_16_1_2, "The atomic number is the number of protons in the nucleus of an atom. It defines the element and its position in the periodic table. For example, the atomic number of hydrogen is 1, and the atomic number of carbon is 6.");
        StudentAnswer sa16_1_3_student7 = createStudentAnswer(student7, pa_16_1_3, "The mass number is the total number of protons and neutrons in the nucleus of an atom. It is used to distinguish between different isotopes of an element. For example, carbon-12 has a mass number of 12 (6 protons and 6 neutrons).");
        StudentAnswer sa16_1_4_student7 = createStudentAnswer(student7, pa_16_1_4, "Isotopes are atoms of the same element that have different numbers of neutrons and, therefore, different mass numbers. For example, carbon-12 and carbon-14 are isotopes of carbon.");
        StudentAnswer sa16_1_5_student7 = createStudentAnswer(student7, pa_16_1_5, "Electron configuration is the distribution of electrons in an atom's electron shells. It follows the Aufbau principle, Pauli exclusion principle, and Hund's rule. For example, the electron configuration of carbon is 1s^2 2s^2 2p^2.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa16_1_1_student8 = createStudentAnswer(student8, pa_16_1_1, "The main subatomic particles in an atom are protons, neutrons, and electrons. Protons and neutrons are located in the nucleus, while electrons orbit the nucleus in electron shells.");
        StudentAnswer sa16_1_2_student8 = createStudentAnswer(student8, pa_16_1_2, "The atomic number is the number of protons in the nucleus of an atom. It defines the element and its position in the periodic table. For example, the atomic number of hydrogen is 1, and the atomic number of carbon is 6.");
        StudentAnswer sa16_1_3_student8 = createStudentAnswer(student8, pa_16_1_3, "The mass number is the total number of protons and neutrons in the nucleus of an atom. It is used to distinguish between different isotopes of an element. For example, carbon-12 has a mass number of 12 (6 protons and 6 neutrons).");
        StudentAnswer sa16_1_4_student8 = createStudentAnswer(student8, pa_16_1_4, "Isotopes are atoms of the same element that have different numbers of neutrons and, therefore, different mass numbers. For example, carbon-12 and carbon-14 are isotopes of carbon.");
        StudentAnswer sa16_1_5_student8 = createStudentAnswer(student8, pa_16_1_5, "Electron configuration is the distribution of electrons in an atom's electron shells. It follows the Aufbau principle, Pauli exclusion principle, and Hund's rule. For example, the electron configuration of carbon is 1s^2 2s^2 2p^2.");

// Output for confirmation
        System.out.println("Student answers created for student7 and student8 for all problem answers in assignment16_1.");

// Creating StudentAnswer instances for student7
        StudentAnswer sa16_2_1_student7 = createStudentAnswer(student7, pa_16_2_1, "A chemical bond is a force of attraction that holds atoms together in a molecule or compound. It is formed by the sharing or transfer of electrons between atoms.");
        StudentAnswer sa16_2_2_student7 = createStudentAnswer(student7, pa_16_2_2, "An ionic bond is a type of chemical bond formed by the electrostatic attraction between oppositely charged ions. It occurs when one atom donates an electron to another, resulting in the formation of positive and negative ions.");
        StudentAnswer sa16_2_3_student7 = createStudentAnswer(student7, pa_16_2_3, "A covalent bond is a type of chemical bond formed by the sharing of electron pairs between atoms. It occurs when atoms have similar electronegativities and share electrons to achieve a stable electron configuration.");
        StudentAnswer sa16_2_4_student7 = createStudentAnswer(student7, pa_16_2_4, "A metallic bond is a type of chemical bond found in metals. It involves the attraction between positively charged metal ions and the sea of delocalized electrons that move freely throughout the metal lattice.");
        StudentAnswer sa16_2_5_student7 = createStudentAnswer(student7, pa_16_2_5, "Electronegativity is a measure of an atom's ability to attract and hold onto electrons in a chemical bond. It determines the type of bond formed between atoms. For example, fluorine has the highest electronegativity, while francium has the lowest.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa16_2_1_student8 = createStudentAnswer(student8, pa_16_2_1, "A chemical bond is a force of attraction that holds atoms together in a molecule or compound. It is formed by the sharing or transfer of electrons between atoms.");
        StudentAnswer sa16_2_2_student8 = createStudentAnswer(student8, pa_16_2_2, "An ionic bond is a type of chemical bond formed by the electrostatic attraction between oppositely charged ions. It occurs when one atom donates an electron to another, resulting in the formation of positive and negative ions.");
        StudentAnswer sa16_2_3_student8 = createStudentAnswer(student8, pa_16_2_3, "A covalent bond is a type of chemical bond formed by the sharing of electron pairs between atoms. It occurs when atoms have similar electronegativities and share electrons to achieve a stable electron configuration.");
        StudentAnswer sa16_2_4_student8 = createStudentAnswer(student8, pa_16_2_4, "A metallic bond is a type of chemical bond found in metals. It involves the attraction between positively charged metal ions and the sea of delocalized electrons that move freely throughout the metal lattice.");
        StudentAnswer sa16_2_5_student8 = createStudentAnswer(student8, pa_16_2_5, "Electronegativity is a measure of an atom's ability to attract and hold onto electrons in a chemical bond. It determines the type of bond formed between atoms. For example, fluorine has the highest electronegativity, while francium has the lowest.");


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment16_2.");
// Creating StudentAnswer instances for student7
        // Creating StudentAnswer instances for student7
        StudentAnswer sa16_3_1_student7 = createStudentAnswer(student7, pa_16_3_1, "A chemical reaction is a process in which substances (reactants) are transformed into different substances (products) through the breaking and forming of chemical bonds.");
        StudentAnswer sa16_3_2_student7 = createStudentAnswer(student7, pa_16_3_2, "Reactants are the starting substances in a chemical reaction, while products are the substances formed as a result of the reaction. The reactants undergo chemical changes to form the products.");
        StudentAnswer sa16_3_3_student7 = createStudentAnswer(student7, pa_16_3_3, "The law of conservation of mass states that mass is neither created nor destroyed in a chemical reaction. The total mass of the reactants is equal to the total mass of the products.");
        StudentAnswer sa16_3_4_student7 = createStudentAnswer(student7, pa_16_3_4, "Different types of chemical reactions include synthesis (combination), decomposition, single displacement, double displacement, combustion, and redox (oxidation-reduction) reactions.");
        StudentAnswer sa16_3_5_student7 = createStudentAnswer(student7, pa_16_3_5, "A synthesis reaction, also known as a combination reaction, occurs when two or more reactants combine to form a single product. The general form is A + B → AB.");

// Creating StudentAnswer instances for student8
        StudentAnswer sa16_3_1_student8 = createStudentAnswer(student8, pa_16_3_1, "A chemical reaction is a process in which substances (reactants) are transformed into different substances (products) through the breaking and forming of chemical bonds.");
        StudentAnswer sa16_3_2_student8 = createStudentAnswer(student8, pa_16_3_2, "Reactants are the starting substances in a chemical reaction, while products are the substances formed as a result of the reaction. The reactants undergo chemical changes to form the products.");
        StudentAnswer sa16_3_3_student8 = createStudentAnswer(student8, pa_16_3_3, "The law of conservation of mass states that mass is neither created nor destroyed in a chemical reaction. The total mass of the reactants is equal to the total mass of the products.");
        StudentAnswer sa16_3_4_student8 = createStudentAnswer(student8, pa_16_3_4, "Different types of chemical reactions include synthesis (combination), decomposition, single displacement, double displacement, combustion, and redox (oxidation-reduction) reactions.");
        StudentAnswer sa16_3_5_student8 = createStudentAnswer(student8, pa_16_3_5, "A synthesis reaction, also known as a combination reaction, occurs when two or more reactants combine to form a single product. The general form is A + B → AB.");

// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment16_3.");
        studentAnswerRepo.saveAllAndFlush(Arrays.asList(sa13_1_2_student7, sa13_1_3_student7, sa13_1_4_student7, sa13_1_5_student7, sa13_2_1_student7, sa13_2_2_student7, sa13_2_3_student7, sa13_2_4_student7, sa13_2_5_student7, sa13_3_1_student7, sa13_3_2_student7, sa13_3_3_student7, sa13_3_4_student7, sa13_3_5_student7, sa13_4_1_student7, sa13_4_2_student7, sa13_4_3_student7, sa13_4_4_student7, sa13_4_5_student7, sa13_1_1_student8, sa13_1_2_student8, sa13_1_3_student8, sa13_1_4_student8, sa13_1_5_student8, sa13_2_1_student8, sa13_2_2_student8, sa13_2_3_student8, sa13_2_4_student8, sa13_2_5_student8, sa13_3_1_student8, sa13_3_2_student8, sa13_3_3_student8, sa13_3_4_student8, sa13_3_5_student8, sa13_4_1_student8, sa13_4_2_student8, sa13_4_3_student8, sa13_4_4_student8, sa13_4_5_student8,
                sa14_1_1_student7, sa14_1_2_student7, sa14_1_3_student7, sa14_1_4_student7, sa14_1_5_student7, sa14_2_1_student7, sa14_2_2_student7, sa14_2_3_student7, sa14_2_4_student7, sa14_2_5_student7, sa14_3_1_student7, sa14_3_2_student7, sa14_3_3_student7, sa14_3_4_student7, sa14_3_5_student7, sa14_4_1_student7, sa14_4_2_student7, sa14_4_3_student7, sa14_4_4_student7, sa14_4_5_student7, sa14_1_1_student8, sa14_1_2_student8, sa14_1_3_student8, sa14_1_4_student8, sa14_1_5_student8, sa14_2_1_student8, sa14_2_2_student8, sa14_2_3_student8, sa14_2_4_student8, sa14_2_5_student8, sa14_3_1_student8, sa14_3_2_student8, sa14_3_3_student8, sa14_3_4_student8, sa14_3_5_student8, sa14_4_1_student8, sa14_4_2_student8, sa14_4_3_student8, sa14_4_4_student8, sa14_4_5_student8,
                sa15_1_1_student7, sa15_1_2_student7, sa15_1_3_student7, sa15_1_4_student7, sa15_1_5_student7, sa15_2_1_student7, sa15_2_2_student7, sa15_2_3_student7, sa15_2_4_student7, sa15_2_5_student7, sa15_3_1_student7, sa15_3_2_student7, sa15_3_3_student7, sa15_3_4_student7, sa15_3_5_student7, sa15_1_1_student8, sa15_1_2_student8, sa15_1_3_student8, sa15_1_4_student8, sa15_1_5_student8, sa15_2_1_student8, sa15_2_2_student8, sa15_2_3_student8, sa15_2_4_student8, sa15_2_5_student8, sa15_3_1_student8, sa15_3_2_student8, sa15_3_3_student8, sa15_3_4_student8, sa15_3_5_student8,
                sa16_1_1_student7, sa16_1_2_student7, sa16_1_3_student7, sa16_1_4_student7, sa16_1_5_student7, sa16_2_1_student7, sa16_2_2_student7, sa16_2_3_student7, sa16_2_4_student7, sa16_2_5_student7, sa16_3_1_student7, sa16_3_2_student7, sa16_3_3_student7, sa16_3_4_student7, sa16_3_5_student7, sa16_1_1_student8, sa16_1_2_student8, sa16_1_3_student8, sa16_1_4_student8, sa16_1_5_student8, sa16_2_1_student8, sa16_2_2_student8, sa16_2_3_student8, sa16_2_4_student8, sa16_2_5_student8, sa16_3_1_student8, sa16_3_2_student8, sa16_3_3_student8, sa16_3_4_student8, sa16_3_5_student8));
// Assignment 13
        addStudentAnswerToProblemAnswer(pa_13_1_1, sa13_1_1_student7);
        addStudentAnswerToProblemAnswer(pa_13_1_2, sa13_1_2_student7);
        addStudentAnswerToProblemAnswer(pa_13_1_3, sa13_1_3_student7);
        addStudentAnswerToProblemAnswer(pa_13_1_4, sa13_1_4_student7);
        addStudentAnswerToProblemAnswer(pa_13_1_5, sa13_1_5_student7);
        addStudentAnswerToProblemAnswer(pa_13_2_1, sa13_2_1_student7);
        addStudentAnswerToProblemAnswer(pa_13_2_2, sa13_2_2_student7);
        addStudentAnswerToProblemAnswer(pa_13_2_3, sa13_2_3_student7);
        addStudentAnswerToProblemAnswer(pa_13_2_4, sa13_2_4_student7);
        addStudentAnswerToProblemAnswer(pa_13_2_5, sa13_2_5_student7);
        addStudentAnswerToProblemAnswer(pa_13_3_1, sa13_3_1_student7);
        addStudentAnswerToProblemAnswer(pa_13_3_2, sa13_3_2_student7);
        addStudentAnswerToProblemAnswer(pa_13_3_3, sa13_3_3_student7);
        addStudentAnswerToProblemAnswer(pa_13_3_4, sa13_3_4_student7);
        addStudentAnswerToProblemAnswer(pa_13_3_5, sa13_3_5_student7);
        addStudentAnswerToProblemAnswer(pa_13_4_1, sa13_4_1_student7);
        addStudentAnswerToProblemAnswer(pa_13_4_2, sa13_4_2_student7);
        addStudentAnswerToProblemAnswer(pa_13_4_3, sa13_4_3_student7);
        addStudentAnswerToProblemAnswer(pa_13_4_4, sa13_4_4_student7);
        addStudentAnswerToProblemAnswer(pa_13_4_5, sa13_4_5_student7);
        // Assignment 14
        addStudentAnswerToProblemAnswer(pa_14_1_1, sa14_1_1_student7);
        addStudentAnswerToProblemAnswer(pa_14_1_2, sa14_1_2_student7);
        addStudentAnswerToProblemAnswer(pa_14_1_3, sa14_1_3_student7);
        addStudentAnswerToProblemAnswer(pa_14_1_4, sa14_1_4_student7);
        addStudentAnswerToProblemAnswer(pa_14_1_5, sa14_1_5_student7);
        addStudentAnswerToProblemAnswer(pa_14_2_1, sa14_2_1_student7);
        addStudentAnswerToProblemAnswer(pa_14_2_2, sa14_2_2_student7);
        addStudentAnswerToProblemAnswer(pa_14_2_3, sa14_2_3_student7);
        addStudentAnswerToProblemAnswer(pa_14_2_4, sa14_2_4_student7);
        addStudentAnswerToProblemAnswer(pa_14_2_5, sa14_2_5_student7);
        addStudentAnswerToProblemAnswer(pa_14_3_1, sa14_3_1_student7);
        addStudentAnswerToProblemAnswer(pa_14_3_2, sa14_3_2_student7);
        addStudentAnswerToProblemAnswer(pa_14_3_3, sa14_3_3_student7);
        addStudentAnswerToProblemAnswer(pa_14_3_4, sa14_3_4_student7);
        addStudentAnswerToProblemAnswer(pa_14_3_5, sa14_3_5_student7);
        addStudentAnswerToProblemAnswer(pa_14_4_1, sa14_4_1_student7);
        addStudentAnswerToProblemAnswer(pa_14_4_2, sa14_4_2_student7);
        addStudentAnswerToProblemAnswer(pa_14_4_3, sa14_4_3_student7);
        addStudentAnswerToProblemAnswer(pa_14_4_4, sa14_4_4_student7);
        addStudentAnswerToProblemAnswer(pa_14_4_5, sa14_4_5_student7);
        // Assignment 15
        addStudentAnswerToProblemAnswer(pa_15_1_1, sa15_1_1_student7);
        addStudentAnswerToProblemAnswer(pa_15_1_2, sa15_1_2_student7);
        addStudentAnswerToProblemAnswer(pa_15_1_3, sa15_1_3_student7);
        addStudentAnswerToProblemAnswer(pa_15_1_4, sa15_1_4_student7);
        addStudentAnswerToProblemAnswer(pa_15_1_5, sa15_1_5_student7);
        addStudentAnswerToProblemAnswer(pa_15_2_1, sa15_2_1_student7);
        addStudentAnswerToProblemAnswer(pa_15_2_2, sa15_2_2_student7);
        addStudentAnswerToProblemAnswer(pa_15_2_3, sa15_2_3_student7);
        addStudentAnswerToProblemAnswer(pa_15_2_4, sa15_2_4_student7);
        addStudentAnswerToProblemAnswer(pa_15_2_5, sa15_2_5_student7);
        addStudentAnswerToProblemAnswer(pa_15_3_1, sa15_3_1_student7);
        addStudentAnswerToProblemAnswer(pa_15_3_2, sa15_3_2_student7);
        addStudentAnswerToProblemAnswer(pa_15_3_3, sa15_3_3_student7);
        addStudentAnswerToProblemAnswer(pa_15_3_4, sa15_3_4_student7);
        addStudentAnswerToProblemAnswer(pa_15_3_5, sa15_3_5_student7);
        // Assignment 16
        addStudentAnswerToProblemAnswer(pa_16_1_1, sa16_1_1_student7);
        addStudentAnswerToProblemAnswer(pa_16_1_2, sa16_1_2_student7);
        addStudentAnswerToProblemAnswer(pa_16_1_3, sa16_1_3_student7);
        addStudentAnswerToProblemAnswer(pa_16_1_4, sa16_1_4_student7);
        addStudentAnswerToProblemAnswer(pa_16_1_5, sa16_1_5_student7);
        addStudentAnswerToProblemAnswer(pa_16_2_1, sa16_2_1_student7);
        addStudentAnswerToProblemAnswer(pa_16_2_2, sa16_2_2_student7);
        addStudentAnswerToProblemAnswer(pa_16_2_3, sa16_2_3_student7);
        addStudentAnswerToProblemAnswer(pa_16_2_4, sa16_2_4_student7);
        addStudentAnswerToProblemAnswer(pa_16_2_5, sa16_2_5_student7);
        addStudentAnswerToProblemAnswer(pa_16_3_1, sa16_3_1_student7);
        addStudentAnswerToProblemAnswer(pa_16_3_2, sa16_3_2_student7);
        addStudentAnswerToProblemAnswer(pa_16_3_3, sa16_3_3_student7);
        addStudentAnswerToProblemAnswer(pa_16_3_4, sa16_3_4_student7);
        addStudentAnswerToProblemAnswer(pa_16_3_5, sa16_3_5_student7);
// Assignment 13
        addStudentAnswerToProblemAnswer(pa_13_1_1, sa13_1_1_student8);
        addStudentAnswerToProblemAnswer(pa_13_1_2, sa13_1_2_student8);
        addStudentAnswerToProblemAnswer(pa_13_1_3, sa13_1_3_student8);
        addStudentAnswerToProblemAnswer(pa_13_1_4, sa13_1_4_student8);
        addStudentAnswerToProblemAnswer(pa_13_1_5, sa13_1_5_student8);
        addStudentAnswerToProblemAnswer(pa_13_2_1, sa13_2_1_student8);
        addStudentAnswerToProblemAnswer(pa_13_2_2, sa13_2_2_student8);
        addStudentAnswerToProblemAnswer(pa_13_2_3, sa13_2_3_student8);
        addStudentAnswerToProblemAnswer(pa_13_2_4, sa13_2_4_student8);
        addStudentAnswerToProblemAnswer(pa_13_2_5, sa13_2_5_student8);
        addStudentAnswerToProblemAnswer(pa_13_3_1, sa13_3_1_student8);
        addStudentAnswerToProblemAnswer(pa_13_3_2, sa13_3_2_student8);
        addStudentAnswerToProblemAnswer(pa_13_3_3, sa13_3_3_student8);
        addStudentAnswerToProblemAnswer(pa_13_3_4, sa13_3_4_student8);
        addStudentAnswerToProblemAnswer(pa_13_3_5, sa13_3_5_student8);
        addStudentAnswerToProblemAnswer(pa_13_4_1, sa13_4_1_student8);
        addStudentAnswerToProblemAnswer(pa_13_4_2, sa13_4_2_student8);
        addStudentAnswerToProblemAnswer(pa_13_4_3, sa13_4_3_student8);
        addStudentAnswerToProblemAnswer(pa_13_4_4, sa13_4_4_student8);
        addStudentAnswerToProblemAnswer(pa_13_4_5, sa13_4_5_student8);
        // Assignment 14
        addStudentAnswerToProblemAnswer(pa_14_1_1, sa14_1_1_student8);
        addStudentAnswerToProblemAnswer(pa_14_1_2, sa14_1_2_student8);
        addStudentAnswerToProblemAnswer(pa_14_1_3, sa14_1_3_student8);
        addStudentAnswerToProblemAnswer(pa_14_1_4, sa14_1_4_student8);
        addStudentAnswerToProblemAnswer(pa_14_1_5, sa14_1_5_student8);
        addStudentAnswerToProblemAnswer(pa_14_2_1, sa14_2_1_student8);
        addStudentAnswerToProblemAnswer(pa_14_2_2, sa14_2_2_student8);
        addStudentAnswerToProblemAnswer(pa_14_2_3, sa14_2_3_student8);
        addStudentAnswerToProblemAnswer(pa_14_2_4, sa14_2_4_student8);
        addStudentAnswerToProblemAnswer(pa_14_2_5, sa14_2_5_student8);
        addStudentAnswerToProblemAnswer(pa_14_3_1, sa14_3_1_student8);
        addStudentAnswerToProblemAnswer(pa_14_3_2, sa14_3_2_student8);
        addStudentAnswerToProblemAnswer(pa_14_3_3, sa14_3_3_student8);
        addStudentAnswerToProblemAnswer(pa_14_3_4, sa14_3_4_student8);
        addStudentAnswerToProblemAnswer(pa_14_3_5, sa14_3_5_student8);
        addStudentAnswerToProblemAnswer(pa_14_4_1, sa14_4_1_student8);
        addStudentAnswerToProblemAnswer(pa_14_4_2, sa14_4_2_student8);
        addStudentAnswerToProblemAnswer(pa_14_4_3, sa14_4_3_student8);
        addStudentAnswerToProblemAnswer(pa_14_4_4, sa14_4_4_student8);
        addStudentAnswerToProblemAnswer(pa_14_4_5, sa14_4_5_student8);
        // Assignment 15
        addStudentAnswerToProblemAnswer(pa_15_1_1, sa15_1_1_student8);
        addStudentAnswerToProblemAnswer(pa_15_1_2, sa15_1_2_student8);
        addStudentAnswerToProblemAnswer(pa_15_1_3, sa15_1_3_student8);
        addStudentAnswerToProblemAnswer(pa_15_1_4, sa15_1_4_student8);
        addStudentAnswerToProblemAnswer(pa_15_1_5, sa15_1_5_student8);
        addStudentAnswerToProblemAnswer(pa_15_2_1, sa15_2_1_student8);
        addStudentAnswerToProblemAnswer(pa_15_2_2, sa15_2_2_student8);
        addStudentAnswerToProblemAnswer(pa_15_2_3, sa15_2_3_student8);
        addStudentAnswerToProblemAnswer(pa_15_2_4, sa15_2_4_student8);
        addStudentAnswerToProblemAnswer(pa_15_2_5, sa15_2_5_student8);
        addStudentAnswerToProblemAnswer(pa_15_3_1, sa15_3_1_student8);
        addStudentAnswerToProblemAnswer(pa_15_3_2, sa15_3_2_student8);
        addStudentAnswerToProblemAnswer(pa_15_3_3, sa15_3_3_student8);
        addStudentAnswerToProblemAnswer(pa_15_3_4, sa15_3_4_student8);
        addStudentAnswerToProblemAnswer(pa_15_3_5, sa15_3_5_student8);
        // Assignment 16
        addStudentAnswerToProblemAnswer(pa_16_1_1, sa16_1_1_student8);
        addStudentAnswerToProblemAnswer(pa_16_1_2, sa16_1_2_student8);
        addStudentAnswerToProblemAnswer(pa_16_1_3, sa16_1_3_student8);
        addStudentAnswerToProblemAnswer(pa_16_1_4, sa16_1_4_student8);
        addStudentAnswerToProblemAnswer(pa_16_1_5, sa16_1_5_student8);
        addStudentAnswerToProblemAnswer(pa_16_2_1, sa16_2_1_student8);
        addStudentAnswerToProblemAnswer(pa_16_2_2, sa16_2_2_student8);
        addStudentAnswerToProblemAnswer(pa_16_2_3, sa16_2_3_student8);
        addStudentAnswerToProblemAnswer(pa_16_2_4, sa16_2_4_student8);
        addStudentAnswerToProblemAnswer(pa_16_2_5, sa16_2_5_student8);
        addStudentAnswerToProblemAnswer(pa_16_3_1, sa16_3_1_student8);
        addStudentAnswerToProblemAnswer(pa_16_3_2, sa16_3_2_student8);
        addStudentAnswerToProblemAnswer(pa_16_3_3, sa16_3_3_student8);
        addStudentAnswerToProblemAnswer(pa_16_3_4, sa16_3_4_student8);
        addStudentAnswerToProblemAnswer(pa_16_3_5, sa16_3_5_student8);


// Creating submission for student7 with student answers for 13_1
        Submission submission13_1_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13_1_1_student7, sa13_1_2_student7, sa13_1_3_student7, sa13_1_4_student7, sa13_1_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13_1_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_1_7);
        }

// Creating submission for student8 with student answers for 13_1
        Submission submission13_1_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13_1_1_student8, sa13_1_2_student8, sa13_1_3_student8, sa13_1_4_student8, sa13_1_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13_1_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_1_8);
        }
// Creating submission for student7 with student answers for 13_2
        Submission submission13_2_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13_2_1_student7, sa13_2_2_student7, sa13_2_3_student7, sa13_2_4_student7, sa13_2_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13_2_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_2_7);
        }

// Creating submission for student8 with student answers for 13_2
        Submission submission13_2_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13_2_1_student8, sa13_2_2_student8, sa13_2_3_student8, sa13_2_4_student8, sa13_2_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13_2_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_2_8);
        }
// Creating submission for student7 with student answers for 13_3
        Submission submission13_3_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13_3_1_student7, sa13_3_2_student7, sa13_3_3_student7, sa13_3_4_student7, sa13_3_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13_3_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_3_7);
        }

// Creating submission for student8 with student answers for 13_3
        Submission submission13_3_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13_3_1_student8, sa13_3_2_student8, sa13_3_3_student8, sa13_3_4_student8, sa13_3_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13_3_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_3_8);
        }
// Creating submission for student7 with student answers for 13_4
        Submission submission13_4_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13_4_1_student7, sa13_4_2_student7, sa13_4_3_student7, sa13_4_4_student7, sa13_4_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13_4_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_4_7);
        }

// Creating submission for student8 with student answers for 13_4
        Submission submission13_4_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13_4_1_student8, sa13_4_2_student8, sa13_4_3_student8, sa13_4_4_student8, sa13_4_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13_4_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_4_8);
        }
// Creating submission for student7 with student answers for 14_1
        Submission submission14_1_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14_1_1_student7, sa14_1_2_student7, sa14_1_3_student7, sa14_1_4_student7, sa14_1_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14_1_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_1_7);
        }

// Creating submission for student8 with student answers for 14_1
        Submission submission14_1_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14_1_1_student8, sa14_1_2_student8, sa14_1_3_student8, sa14_1_4_student8, sa14_1_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14_1_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_1_8);
        }
// Creating submission for student7 with student answers for 14_2
        Submission submission14_2_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14_2_1_student7, sa14_2_2_student7, sa14_2_3_student7, sa14_2_4_student7, sa14_2_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14_2_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_2_7);
        }

// Creating submission for student8 with student answers for 14_2
        Submission submission14_2_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14_2_1_student8, sa14_2_2_student8, sa14_2_3_student8, sa14_2_4_student8, sa14_2_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14_2_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_2_8);
        }
// Creating submission for student7 with student answers for 14_3
        Submission submission14_3_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14_3_1_student7, sa14_3_2_student7, sa14_3_3_student7, sa14_3_4_student7, sa14_3_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14_3_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_3_7);
        }

// Creating submission for student8 with student answers for 14_3
        Submission submission14_3_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14_3_1_student8, sa14_3_2_student8, sa14_3_3_student8, sa14_3_4_student8, sa14_3_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14_3_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_3_8);
        }
// Creating submission for student7 with student answers for 14_4
        Submission submission14_4_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14_4_1_student7, sa14_4_2_student7, sa14_4_3_student7, sa14_4_4_student7, sa14_4_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14_4_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_4_7);
        }

// Creating submission for student8 with student answers for 14_4
        Submission submission14_4_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14_4_1_student8, sa14_4_2_student8, sa14_4_3_student8, sa14_4_4_student8, sa14_4_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14_4_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_4_8);
        }
// Creating submission for student7 with student answers for 15_1
        Submission submission15_1_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15_1_1_student7, sa15_1_2_student7, sa15_1_3_student7, sa15_1_4_student7, sa15_1_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15_1_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_1_7);
        }

// Creating submission for student8 with student answers for 15_1
        Submission submission15_1_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15_1_1_student8, sa15_1_2_student8, sa15_1_3_student8, sa15_1_4_student8, sa15_1_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15_1_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_1_8);
        }
// Creating submission for student7 with student answers for 15_2
        Submission submission15_2_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15_2_1_student7, sa15_2_2_student7, sa15_2_3_student7, sa15_2_4_student7, sa15_2_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15_2_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_2_7);
        }

// Creating submission for student8 with student answers for 15_2
        Submission submission15_2_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15_2_1_student8, sa15_2_2_student8, sa15_2_3_student8, sa15_2_4_student8, sa15_2_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15_2_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_2_8);
        }
// Creating submission for student7 with student answers for 15_3
        Submission submission15_3_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15_3_1_student7, sa15_3_2_student7, sa15_3_3_student7, sa15_3_4_student7, sa15_3_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15_3_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_3_7);
        }

// Creating submission for student8 with student answers for 15_3
        Submission submission15_3_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15_3_1_student8, sa15_3_2_student8, sa15_3_3_student8, sa15_3_4_student8, sa15_3_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15_3_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_3_8);
        }
        // Creating submission for student7 with student answers for 16_1
        Submission submission16_1_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16_1_1_student7, sa16_1_2_student7, sa16_1_3_student7, sa16_1_4_student7, sa16_1_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16_1_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_1_7);
        }

// Creating submission for student8 with student answers for 16_1
        Submission submission16_1_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16_1_1_student8, sa16_1_2_student8, sa16_1_3_student8, sa16_1_4_student8, sa16_1_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16_1_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_1_8);
        }

// Creating submission for student7 with student answers for 16_2
        Submission submission16_2_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16_2_1_student7, sa16_2_2_student7, sa16_2_3_student7, sa16_2_4_student7, sa16_2_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16_2_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_2_7);
        }

// Creating submission for student8 with student answers for 16_2
        Submission submission16_2_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16_2_1_student8, sa16_2_2_student8, sa16_2_3_student8, sa16_2_4_student8, sa16_2_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16_2_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_2_8);
        }
// Creating submission for student7 with student answers for 16_3
        Submission submission16_3_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16_3_1_student7, sa16_3_2_student7, sa16_3_3_student7, sa16_3_4_student7, sa16_3_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16_3_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_3_7);
        }

// Creating submission for student8 with student answers for 16_3
        Submission submission16_3_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16_3_1_student8, sa16_3_2_student8, sa16_3_3_student8, sa16_3_4_student8, sa16_3_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16_3_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_3_8);
        }
        submissionRepo.saveAllAndFlush(Arrays.asList(submission13_1_7, submission13_1_8, submission13_2_7, submission13_2_8, submission13_3_7, submission13_3_8, submission13_4_7, submission13_4_8, submission14_1_7, submission14_1_8, submission14_2_7, submission14_2_8, submission14_3_7, submission14_3_8, submission14_4_7, submission14_4_8, submission15_1_7, submission15_1_8, submission15_2_7, submission15_2_8, submission15_3_7, submission15_3_8, submission16_1_7, submission16_1_8, submission16_2_7, submission16_2_8, submission16_3_7, submission16_3_8));

        Grade grade13_1_7 = createGrade(86.2, student7, faculty3, course13, submission13_1_7);
        Grade grade13_1_8 = createGrade(88.5, student8, faculty3, course13, submission13_1_8);
        Grade grade13_2_7 = createGrade(89.8, student7, faculty3, course13, submission13_2_7);
        Grade grade13_2_8 = createGrade(87.3, student8, faculty3, course13, submission13_2_8);
        Grade grade13_3_7 = createGrade(84.9, student7, faculty3, course13, submission13_3_7);
        Grade grade13_3_8 = createGrade(90.6, student8, faculty3, course13, submission13_3_8);
        Grade grade13_4_7 = createGrade(88.1, student7, faculty3, course13, submission13_4_7);
        Grade grade13_4_8 = createGrade(85.7, student8, faculty3, course13, submission13_4_8);

        Grade grade14_1_7 = createGrade(88.3, student7, faculty4, course14, submission14_1_7);
        Grade grade14_1_8 = createGrade(86.9, student8, faculty4, course14, submission14_1_8);
        Grade grade14_2_7 = createGrade(87.4, student7, faculty4, course14, submission14_2_7);
        Grade grade14_2_8 = createGrade(85.7, student8, faculty4, course14, submission14_2_8);
        Grade grade14_3_7 = createGrade(89.1, student7, faculty4, course14, submission14_3_7);
        Grade grade14_3_8 = createGrade(84.3, student8, faculty4, course14, submission14_3_8);
        Grade grade14_4_7 = createGrade(88.7, student7, faculty4, course14, submission14_4_7);
        Grade grade14_4_8 = createGrade(87.8, student8, faculty4, course14, submission14_4_8);

        Grade grade15_1_7 = createGrade(86.7, student7, faculty5, course15, submission15_1_7);
        Grade grade15_1_8 = createGrade(88.4, student8, faculty5, course15, submission15_1_8);
        Grade grade15_2_7 = createGrade(85.3, student7, faculty5, course15, submission15_2_7);
        Grade grade15_2_8 = createGrade(87.9, student8, faculty5, course15, submission15_2_8);
        Grade grade15_3_7 = createGrade(89.1, student7, faculty5, course15, submission15_3_7);
        Grade grade15_3_8 = createGrade(86.5, student8, faculty5, course15, submission15_3_8);

        Grade grade16_1_7 = createGrade(87.1, student7, faculty1, course16, submission16_1_7);
        Grade grade16_1_8 = createGrade(85.4, student8, faculty1, course16, submission16_1_8);
        Grade grade16_2_7 = createGrade(88.3, student7, faculty1, course16, submission16_2_7);
        Grade grade16_2_8 = createGrade(86.7, student8, faculty1, course16, submission16_2_8);
        Grade grade16_3_7 = createGrade(84.9, student7, faculty1, course16, submission16_3_7);
        Grade grade16_3_8 = createGrade(87.5, student8, faculty1, course16, submission16_3_8);
        gradeRepo.saveAllAndFlush(Arrays.asList(grade13_1_7, grade13_2_7, grade13_3_7, grade13_4_7, grade14_1_7, grade14_2_7, grade14_3_7, grade14_4_7, grade15_1_7, grade15_2_7, grade15_3_7, grade16_1_7, grade16_2_7, grade16_3_7, grade13_1_8, grade13_2_8, grade13_3_8, grade13_4_8, grade14_1_8, grade14_2_8, grade14_3_8, grade14_4_8, grade15_1_8, grade15_2_8, grade15_3_8, grade16_1_8, grade16_2_8, grade16_3_8));

        CourseGrade courseGrade13_1_7 = createCourseGrade(student7, course13, 87.25, Arrays.asList(grade13_1_7, grade13_2_7, grade13_3_7, grade13_4_7));
        CourseGrade courseGrade13_1_8 = createCourseGrade(student8, course13, 88.025, Arrays.asList(grade13_1_8, grade13_2_8, grade13_3_8, grade13_4_8));

        CourseGrade courseGrade14_1_7 = createCourseGrade(student7, course14, 88.375, Arrays.asList(grade14_1_7, grade14_2_7, grade14_3_7, grade14_4_7));
        CourseGrade courseGrade14_1_8 = createCourseGrade(student8, course14, 86.675, Arrays.asList(grade14_1_8, grade14_2_8, grade14_3_8, grade14_4_8));

        CourseGrade courseGrade15_1_7 = createCourseGrade(student7, course15, 87.0333, Arrays.asList(grade15_1_7, grade15_2_7, grade15_3_7));
        CourseGrade courseGrade15_1_8 = createCourseGrade(student8, course15, 87.6, Arrays.asList(grade15_1_8, grade15_2_8, grade15_3_8));

        CourseGrade courseGrade16_1_7 = createCourseGrade(student7, course16, 86.7667, Arrays.asList(grade16_1_7, grade16_2_7, grade16_3_7));
        CourseGrade courseGrade16_1_8 = createCourseGrade(student8, course16, 86.5333, Arrays.asList(grade16_1_8, grade16_2_8, grade16_3_8));
        courseGradeRepo.saveAllAndFlush(Arrays.asList(courseGrade13_1_7, courseGrade14_1_7, courseGrade15_1_7, courseGrade16_1_7, courseGrade13_1_8, courseGrade14_1_8, courseGrade15_1_8, courseGrade16_1_8));

        Feedback feedback13_1_7 = createFeedback("Excellent work, student7!", submission13_1_7);
        Feedback feedback13_1_8 = createFeedback("Great effort, student8!", submission13_1_8);

        Feedback feedback13_2_7 = createFeedback("Impressive answers, student7.", submission13_2_7);
        Feedback feedback13_2_8 = createFeedback("Nice job, student8.", submission13_2_8);

        Feedback feedback13_3_7 = createFeedback("Well done on the answers, student7.", submission13_3_7);
        Feedback feedback13_3_8 = createFeedback("Good work, student8!", submission13_3_8);

        Feedback feedback13_4_7 = createFeedback("Great effort, student7!", submission13_4_7);
        Feedback feedback13_4_8 = createFeedback("Well done, student8!", submission13_4_8);

        Feedback feedback14_1_7 = createFeedback("Excellent work, student7!", submission14_1_7);
        Feedback feedback14_1_8 = createFeedback("Great effort, student8!", submission14_1_8);

        Feedback feedback14_2_7 = createFeedback("Impressive answers, student7.", submission14_2_7);
        Feedback feedback14_2_8 = createFeedback("Nice job, student8.", submission14_2_8);

        Feedback feedback14_3_7 = createFeedback("Well done on the answers, student7.", submission14_3_7);
        Feedback feedback14_3_8 = createFeedback("Good work, student8!", submission14_3_8);

        Feedback feedback14_4_7 = createFeedback("Great effort, student7!", submission14_4_7);
        Feedback feedback14_4_8 = createFeedback("Well done, student8!", submission14_4_8);

        Feedback feedback15_1_7 = createFeedback("Excellent work, student7!", submission15_1_7);
        Feedback feedback15_1_8 = createFeedback("Great effort, student8!", submission15_1_8);

        Feedback feedback15_2_7 = createFeedback("Impressive answers, student7.", submission15_2_7);
        Feedback feedback15_2_8 = createFeedback("Nice job, student8.", submission15_2_8);

        Feedback feedback15_3_7 = createFeedback("Well done on the answers, student7.", submission15_3_7);
        Feedback feedback15_3_8 = createFeedback("Good work, student8!", submission15_3_8);

        Feedback feedback16_1_7 = createFeedback("Excellent work, student7!", submission16_1_7);
        Feedback feedback16_1_8 = createFeedback("Great effort, student8!", submission16_1_8);

        Feedback feedback16_2_7 = createFeedback("Impressive answers, student7.", submission16_2_7);
        Feedback feedback16_2_8 = createFeedback("Nice job, student8.", submission16_2_8);

        Feedback feedback16_3_7 = createFeedback("Well done on the answers, student7.", submission16_3_7);
        Feedback feedback16_3_8 = createFeedback("Good work, student8!", submission16_3_8);
        feedbackRepo.saveAllAndFlush(Arrays.asList(feedback13_1_7, feedback13_1_8, feedback13_2_7, feedback13_2_8, feedback13_3_7, feedback13_3_8, feedback13_4_7, feedback13_4_8, feedback14_1_7, feedback14_1_8, feedback14_2_7, feedback14_2_8, feedback14_3_7, feedback14_3_8, feedback14_4_7, feedback14_4_8, feedback15_1_7, feedback15_1_8, feedback15_2_7, feedback15_2_8, feedback15_3_7, feedback15_3_8, feedback16_1_7, feedback16_1_8, feedback16_2_7, feedback16_2_8, feedback16_3_7, feedback16_3_8));

        course13.setGrades(Arrays.asList(grade13_1_7, grade13_1_8, grade13_2_7, grade13_2_8, grade13_3_7, grade13_3_8, grade13_4_7, grade13_4_8));
        course14.setGrades(Arrays.asList(grade14_1_7, grade14_1_8, grade14_2_7, grade14_2_8, grade14_3_7, grade14_3_8, grade14_4_7, grade14_4_8));
        course15.setGrades(Arrays.asList(grade15_1_7, grade15_1_8, grade15_2_7, grade15_2_8, grade15_3_7, grade15_3_8));
        course16.setGrades(Arrays.asList(grade16_1_7, grade16_1_8, grade16_2_7, grade16_2_8, grade16_3_7, grade16_3_8));

        course13.setCourseGrades(Arrays.asList(courseGrade13_1_7, courseGrade13_1_8));
        course14.setCourseGrades(Arrays.asList(courseGrade14_1_7, courseGrade14_1_8));
        course15.setCourseGrades(Arrays.asList(courseGrade15_1_7, courseGrade15_1_8));
        course16.setCourseGrades(Arrays.asList(courseGrade16_1_7, courseGrade16_1_8));

        createFacultyWithAssignment(faculty3, Arrays.asList(grade13_1_7, grade13_1_8, grade13_2_7, grade13_2_8, grade13_3_7, grade13_3_8, grade13_4_7, grade13_4_8), Arrays.asList(assignment13_1, assignment13_2, assignment13_3, assignment13_4));
        createFacultyWithAssignment(faculty4, Arrays.asList(grade14_1_7, grade14_1_8, grade14_2_7, grade14_2_8, grade14_3_7, grade14_3_8, grade14_4_7, grade14_4_8), Arrays.asList(assignment14_1, assignment14_2, assignment14_3, assignment14_4));
        createFacultyWithAssignment(faculty5, Arrays.asList(grade15_1_7, grade15_1_8, grade15_2_7, grade15_2_8, grade15_3_7, grade15_3_8), Arrays.asList(assignment15_1, assignment15_2, assignment15_3));
        createFacultyWithAssignment(faculty1, Arrays.asList(grade16_1_7, grade16_1_8, grade16_2_7, grade16_2_8, grade16_3_7, grade16_3_8), Arrays.asList(assignment16_1, assignment16_2, assignment16_3));

        linkSubmissionDetails(submission13_1_7, student7, grade13_1_7, feedback13_1_7, Arrays.asList(sa13_1_1_student7, sa13_1_2_student7, sa13_1_3_student7, sa13_1_4_student7, sa13_1_5_student7));
        linkSubmissionDetails(submission13_1_8, student8, grade13_1_8, feedback13_1_8, Arrays.asList(sa13_1_1_student8, sa13_1_2_student8, sa13_1_3_student8, sa13_1_4_student8, sa13_1_5_student8));
        linkSubmissionDetails(submission13_2_7, student7, grade13_2_7, feedback13_2_7, Arrays.asList(sa13_2_1_student7, sa13_2_2_student7, sa13_2_3_student7, sa13_2_4_student7, sa13_2_5_student7));
        linkSubmissionDetails(submission13_2_8, student8, grade13_2_8, feedback13_2_8, Arrays.asList(sa13_2_1_student8, sa13_2_2_student8, sa13_2_3_student8, sa13_2_4_student8, sa13_2_5_student8));
        linkSubmissionDetails(submission13_3_7, student7, grade13_3_7, feedback13_3_7, Arrays.asList(sa13_3_1_student7, sa13_3_2_student7, sa13_3_3_student7, sa13_3_4_student7, sa13_3_5_student7));
        linkSubmissionDetails(submission13_3_8, student8, grade13_3_8, feedback13_3_8, Arrays.asList(sa13_3_1_student8, sa13_3_2_student8, sa13_3_3_student8, sa13_3_4_student8, sa13_3_5_student8));
        linkSubmissionDetails(submission13_4_7, student7, grade13_4_7, feedback13_4_7, Arrays.asList(sa13_4_1_student7, sa13_4_2_student7, sa13_4_3_student7, sa13_4_4_student7, sa13_4_5_student7));
        linkSubmissionDetails(submission13_4_8, student8, grade13_4_8, feedback13_4_8, Arrays.asList(sa13_4_1_student8, sa13_4_2_student8, sa13_4_3_student8, sa13_4_4_student8, sa13_4_5_student8));

        linkSubmissionDetails(submission14_1_7, student7, grade14_1_7, feedback14_1_7, Arrays.asList(sa14_1_1_student7, sa14_1_2_student7, sa14_1_3_student7, sa14_1_4_student7, sa14_1_5_student7));
        linkSubmissionDetails(submission14_1_8, student8, grade14_1_8, feedback14_1_8, Arrays.asList(sa14_1_1_student8, sa14_1_2_student8, sa14_1_3_student8, sa14_1_4_student8, sa14_1_5_student8));
        linkSubmissionDetails(submission14_2_7, student7, grade14_2_7, feedback14_2_7, Arrays.asList(sa14_2_1_student7, sa14_2_2_student7, sa14_2_3_student7, sa14_2_4_student7, sa14_2_5_student7));
        linkSubmissionDetails(submission14_2_8, student8, grade14_2_8, feedback14_2_8, Arrays.asList(sa14_2_1_student8, sa14_2_2_student8, sa14_2_3_student8, sa14_2_4_student8, sa14_2_5_student8));
        linkSubmissionDetails(submission14_3_7, student7, grade14_3_7, feedback14_3_7, Arrays.asList(sa14_3_1_student7, sa14_3_2_student7, sa14_3_3_student7, sa14_3_4_student7, sa14_3_5_student7));
        linkSubmissionDetails(submission14_3_8, student8, grade14_3_8, feedback14_3_8, Arrays.asList(sa14_3_1_student8, sa14_3_2_student8, sa14_3_3_student8, sa14_3_4_student8, sa14_3_5_student8));
        linkSubmissionDetails(submission14_4_7, student7, grade14_4_7, feedback14_4_7, Arrays.asList(sa14_4_1_student7, sa14_4_2_student7, sa14_4_3_student7, sa14_4_4_student7, sa14_4_5_student7));
        linkSubmissionDetails(submission14_4_8, student8, grade14_4_8, feedback14_4_8, Arrays.asList(sa14_4_1_student8, sa14_4_2_student8, sa14_4_3_student8, sa14_4_4_student8, sa14_4_5_student8));

        linkSubmissionDetails(submission15_1_7, student7, grade15_1_7, feedback15_1_7, Arrays.asList(sa15_1_1_student7, sa15_1_2_student7, sa15_1_3_student7, sa15_1_4_student7, sa15_1_5_student7));
        linkSubmissionDetails(submission15_1_8, student8, grade15_1_8, feedback15_1_8, Arrays.asList(sa15_1_1_student8, sa15_1_2_student8, sa15_1_3_student8, sa15_1_4_student8, sa15_1_5_student8));
        linkSubmissionDetails(submission15_2_7, student7, grade15_2_7, feedback15_2_7, Arrays.asList(sa15_2_1_student7, sa15_2_2_student7, sa15_2_3_student7, sa15_2_4_student7, sa15_2_5_student7));
        linkSubmissionDetails(submission15_2_8, student8, grade15_2_8, feedback15_2_8, Arrays.asList(sa15_2_1_student8, sa15_2_2_student8, sa15_2_3_student8, sa15_2_4_student8, sa15_2_5_student8));
        linkSubmissionDetails(submission15_3_7, student7, grade15_3_7, feedback15_3_7, Arrays.asList(sa15_3_1_student7, sa15_3_2_student7, sa15_3_3_student7, sa15_3_4_student7, sa15_3_5_student7));
        linkSubmissionDetails(submission15_3_8, student8, grade15_3_8, feedback15_3_8, Arrays.asList(sa15_3_1_student8, sa15_3_2_student8, sa15_3_3_student8, sa15_3_4_student8, sa15_3_5_student8));

        linkSubmissionDetails(submission16_1_7, student7, grade16_1_7, feedback16_1_7, Arrays.asList(sa16_1_1_student7, sa16_1_2_student7, sa16_1_3_student7, sa16_1_4_student7, sa16_1_5_student7));
        linkSubmissionDetails(submission16_1_8, student8, grade16_1_8, feedback16_1_8, Arrays.asList(sa16_1_1_student8, sa16_1_2_student8, sa16_1_3_student8, sa16_1_4_student8, sa16_1_5_student8));
        linkSubmissionDetails(submission16_2_7, student7, grade16_2_7, feedback16_2_7, Arrays.asList(sa16_2_1_student7, sa16_2_2_student7, sa16_2_3_student7, sa16_2_4_student7, sa16_2_5_student7));
        linkSubmissionDetails(submission16_2_8, student8, grade16_2_8, feedback16_2_8, Arrays.asList(sa16_2_1_student8, sa16_2_2_student8, sa16_2_3_student8, sa16_2_4_student8, sa16_2_5_student8));
        linkSubmissionDetails(submission16_3_7, student7, grade16_3_7, feedback16_3_7, Arrays.asList(sa16_3_1_student7, sa16_3_2_student7, sa16_3_3_student7, sa16_3_4_student7, sa16_3_5_student7));
        linkSubmissionDetails(submission16_3_8, student8, grade16_3_8, feedback16_3_8, Arrays.asList(sa16_3_1_student8, sa16_3_2_student8, sa16_3_3_student8, sa16_3_4_student8, sa16_3_5_student8));


        syllabus13.setAssignments(Arrays.asList(assignment13_1, assignment13_2, assignment13_3, assignment13_4));
        syllabus14.setAssignments(Arrays.asList(assignment14_1, assignment14_2, assignment14_3, assignment14_4));
        syllabus15.setAssignments(Arrays.asList(assignment15_1, assignment15_2, assignment15_3));
        syllabus16.setAssignments(Arrays.asList(assignment16_1, assignment16_2, assignment16_3));

        studentAssignment(student7, Arrays.asList(grade13_1_7, grade13_2_7, grade13_3_7, grade13_4_7, grade14_1_7, grade14_2_7, grade14_3_7, grade14_4_7, grade15_1_7, grade15_2_7, grade15_3_7, grade16_1_7, grade16_2_7, grade16_3_7), Arrays.asList(courseGrade13_1_7, courseGrade14_1_7, courseGrade15_1_7, courseGrade16_1_7), Arrays.asList(assignment13_1, assignment13_2, assignment13_3, assignment13_4, assignment14_1, assignment14_2, assignment14_3, assignment14_4, assignment15_1, assignment15_2, assignment15_3, assignment16_1, assignment16_2, assignment16_3));
        studentAssignment(student8, Arrays.asList(grade13_1_8, grade13_2_8, grade13_3_8, grade13_4_8, grade14_1_8, grade14_2_8, grade14_3_8, grade14_4_8, grade15_1_8, grade15_2_8, grade15_3_8, grade16_1_8, grade16_2_8, grade16_3_8), Arrays.asList(courseGrade13_1_8, courseGrade14_1_8, courseGrade15_1_8, courseGrade16_1_8), Arrays.asList(assignment13_1, assignment13_2, assignment13_3, assignment13_4, assignment14_1, assignment14_2, assignment14_3, assignment14_4, assignment15_1, assignment15_2, assignment15_3, assignment16_1, assignment16_2, assignment16_3));

        facultyRepo.saveAllAndFlush(Arrays.asList(faculty1, faculty2, faculty3, faculty4, faculty5));
        syllabusRepo.saveAllAndFlush(Arrays.asList(syllabus1, syllabus2, syllabus3, syllabus4, syllabus5, syllabus6, syllabus7, syllabus8, syllabus9, syllabus10, syllabus11, syllabus12, syllabus13, syllabus14, syllabus15, syllabus16, syllabus17, syllabus18, syllabus19, syllabus20));
        studentRepo.saveAllAndFlush(Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10));
        courseRepo.saveAllAndFlush(Arrays.asList(course1, course2, course3, course4, course5, course6, course7, course8, course9, course10, course11, course12, course13, course14, course15, course16, course17, course18, course19, course20));
        assignmentRepo.saveAllAndFlush(Arrays.asList(assignment13_1, assignment13_2, assignment13_3, assignment13_4, assignment14_1, assignment14_2, assignment14_3, assignment14_4, assignment15_1, assignment15_2, assignment15_3, assignment16_1, assignment16_2, assignment16_3));
        problemAnswerRepo.saveAllAndFlush(Arrays.asList(pa_13_1_1, pa_13_1_2, pa_13_1_3, pa_13_1_4, pa_13_1_5, pa_13_2_1, pa_13_2_2, pa_13_2_3, pa_13_2_4, pa_13_2_5, pa_13_3_1, pa_13_3_2, pa_13_3_3, pa_13_3_4, pa_13_3_5, pa_13_4_1, pa_13_4_2, pa_13_4_3, pa_13_4_4, pa_13_4_5, pa_14_1_1, pa_14_1_2, pa_14_1_3, pa_14_1_4, pa_14_1_5, pa_14_2_1, pa_14_2_2, pa_14_2_3, pa_14_2_4, pa_14_2_5, pa_14_3_1, pa_14_3_2, pa_14_3_3, pa_14_3_4, pa_14_3_5, pa_14_4_1, pa_14_4_2, pa_14_4_3, pa_14_4_4, pa_14_4_5, pa_15_1_1, pa_15_1_2, pa_15_1_3, pa_15_1_4, pa_15_1_5, pa_15_2_1, pa_15_2_2, pa_15_2_3, pa_15_2_4, pa_15_2_5, pa_15_3_1, pa_15_3_2, pa_15_3_3, pa_15_3_4, pa_15_3_5, pa_16_1_1, pa_16_1_2, pa_16_1_3, pa_16_1_4, pa_16_1_5, pa_16_2_1, pa_16_2_2, pa_16_2_3, pa_16_2_4, pa_16_2_5, pa_16_3_1, pa_16_3_2, pa_16_3_3, pa_16_3_4, pa_16_3_5));
        studentAnswerRepo.saveAllAndFlush(Arrays.asList(sa13_1_2_student7, sa13_1_3_student7, sa13_1_4_student7, sa13_1_5_student7, sa13_2_1_student7, sa13_2_2_student7, sa13_2_3_student7, sa13_2_4_student7, sa13_2_5_student7, sa13_3_1_student7, sa13_3_2_student7, sa13_3_3_student7, sa13_3_4_student7, sa13_3_5_student7, sa13_4_1_student7, sa13_4_2_student7, sa13_4_3_student7, sa13_4_4_student7, sa13_4_5_student7, sa13_1_1_student8, sa13_1_2_student8, sa13_1_3_student8, sa13_1_4_student8, sa13_1_5_student8, sa13_2_1_student8, sa13_2_2_student8, sa13_2_3_student8, sa13_2_4_student8, sa13_2_5_student8, sa13_3_1_student8, sa13_3_2_student8, sa13_3_3_student8, sa13_3_4_student8, sa13_3_5_student8, sa13_4_1_student8, sa13_4_2_student8, sa13_4_3_student8, sa13_4_4_student8, sa13_4_5_student8,
                sa14_1_1_student7, sa14_1_2_student7, sa14_1_3_student7, sa14_1_4_student7, sa14_1_5_student7, sa14_2_1_student7, sa14_2_2_student7, sa14_2_3_student7, sa14_2_4_student7, sa14_2_5_student7, sa14_3_1_student7, sa14_3_2_student7, sa14_3_3_student7, sa14_3_4_student7, sa14_3_5_student7, sa14_4_1_student7, sa14_4_2_student7, sa14_4_3_student7, sa14_4_4_student7, sa14_4_5_student7, sa14_1_1_student8, sa14_1_2_student8, sa14_1_3_student8, sa14_1_4_student8, sa14_1_5_student8, sa14_2_1_student8, sa14_2_2_student8, sa14_2_3_student8, sa14_2_4_student8, sa14_2_5_student8, sa14_3_1_student8, sa14_3_2_student8, sa14_3_3_student8, sa14_3_4_student8, sa14_3_5_student8, sa14_4_1_student8, sa14_4_2_student8, sa14_4_3_student8, sa14_4_4_student8, sa14_4_5_student8,
                sa15_1_1_student7, sa15_1_2_student7, sa15_1_3_student7, sa15_1_4_student7, sa15_1_5_student7, sa15_2_1_student7, sa15_2_2_student7, sa15_2_3_student7, sa15_2_4_student7, sa15_2_5_student7, sa15_3_1_student7, sa15_3_2_student7, sa15_3_3_student7, sa15_3_4_student7, sa15_3_5_student7, sa15_1_1_student8, sa15_1_2_student8, sa15_1_3_student8, sa15_1_4_student8, sa15_1_5_student8, sa15_2_1_student8, sa15_2_2_student8, sa15_2_3_student8, sa15_2_4_student8, sa15_2_5_student8, sa15_3_1_student8, sa15_3_2_student8, sa15_3_3_student8, sa15_3_4_student8, sa15_3_5_student8,
                sa16_1_1_student7, sa16_1_2_student7, sa16_1_3_student7, sa16_1_4_student7, sa16_1_5_student7, sa16_2_1_student7, sa16_2_2_student7, sa16_2_3_student7, sa16_2_4_student7, sa16_2_5_student7, sa16_3_1_student7, sa16_3_2_student7, sa16_3_3_student7, sa16_3_4_student7, sa16_3_5_student7, sa16_1_1_student8, sa16_1_2_student8, sa16_1_3_student8, sa16_1_4_student8, sa16_1_5_student8, sa16_2_1_student8, sa16_2_2_student8, sa16_2_3_student8, sa16_2_4_student8, sa16_2_5_student8, sa16_3_1_student8, sa16_3_2_student8, sa16_3_3_student8, sa16_3_4_student8, sa16_3_5_student8));
        submissionRepo.saveAllAndFlush(Arrays.asList(submission13_1_7, submission13_1_8, submission13_2_7, submission13_2_8, submission13_3_7, submission13_3_8, submission13_4_7, submission13_4_8, submission14_1_7, submission14_1_8, submission14_2_7, submission14_2_8, submission14_3_7, submission14_3_8, submission14_4_7, submission14_4_8, submission15_1_7, submission15_1_8, submission15_2_7, submission15_2_8, submission15_3_7, submission15_3_8, submission16_1_7, submission16_1_8, submission16_2_7, submission16_2_8, submission16_3_7, submission16_3_8));
        gradeRepo.saveAllAndFlush(Arrays.asList(grade13_1_7, grade13_2_7, grade13_3_7, grade13_4_7, grade14_1_7, grade14_2_7, grade14_3_7, grade14_4_7, grade15_1_7, grade15_2_7, grade15_3_7, grade16_1_7, grade16_2_7, grade16_3_7, grade13_1_8, grade13_2_8, grade13_3_8, grade13_4_8, grade14_1_8, grade14_2_8, grade14_3_8, grade14_4_8, grade15_1_8, grade15_2_8, grade15_3_8, grade16_1_8, grade16_2_8, grade16_3_8));
        courseGradeRepo.saveAllAndFlush(Arrays.asList(courseGrade13_1_7, courseGrade14_1_7, courseGrade15_1_7, courseGrade16_1_7, courseGrade13_1_8, courseGrade14_1_8, courseGrade15_1_8, courseGrade16_1_8));
        feedbackRepo.saveAllAndFlush(Arrays.asList(feedback13_1_7, feedback13_1_8, feedback13_2_7, feedback13_2_8, feedback13_3_7, feedback13_3_8, feedback13_4_7, feedback13_4_8, feedback14_1_7, feedback14_1_8, feedback14_2_7, feedback14_2_8, feedback14_3_7, feedback14_3_8, feedback14_4_7, feedback14_4_8, feedback15_1_7, feedback15_1_8, feedback15_2_7, feedback15_2_8, feedback15_3_7, feedback15_3_8, feedback16_1_7, feedback16_1_8, feedback16_2_7, feedback16_2_8, feedback16_3_7, feedback16_3_8));
    }
}
