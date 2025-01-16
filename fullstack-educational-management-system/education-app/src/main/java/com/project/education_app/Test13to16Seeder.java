package com.project.education_app;

import com.project.education_app.entities.*;
import com.project.education_app.repos.CourseRepo;
import com.project.education_app.repos.FacultyRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.repos.SyllabusRepo;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.project.education_app.Assignment1to4Seeder.*;
import static com.project.education_app.Assignment1to4Seeder.addStudentAnswerToProblemAnswer;
import static com.project.education_app.Seeder.*;
import static com.project.education_app.Seeder.createGrade;
import static com.project.education_app.Test1to4Seeder.*;


@Component
@Data
public class Test13to16Seeder implements CommandLineRunner {
    private final FacultyRepo facultyRepo;
    private final SyllabusRepo syllabusRepo;
    private final StudentRepo studentRepo;
    private final CourseRepo courseRepo;

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

        // Creating the test for Unit 1: Sequences and Series
        Test test13a = createTest("Sequences and Series Test", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        addStudentToTest(test13a, student7);
        addStudentToTest(test13a, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa13a_1 = createProblemAnswer("What is a sequence?", "A sequence is an ordered list of numbers that follows a specific pattern or rule. Each number in the sequence is called a term.");
        addTestToProblemAnswer(pa13a_1, test13a);
        addProblemAnswerToTest(test13a, pa13a_1);

        ProblemAnswer pa13a_2 = createProblemAnswer("What is a series?", "A series is the sum of the terms of a sequence. It can be finite or infinite, depending on the number of terms being summed.");
        addTestToProblemAnswer(pa13a_2, test13a);
        addProblemAnswerToTest(test13a, pa13a_2);

        ProblemAnswer pa13a_3 = createProblemAnswer("What is a convergent series?", "A convergent series is a series whose terms approach a finite limit as the number of terms increases. The series converges to this limit.");
        addTestToProblemAnswer(pa13a_3, test13a);
        addProblemAnswerToTest(test13a, pa13a_3);

        ProblemAnswer pa13a_4 = createProblemAnswer("What is a divergent series?", "A divergent series is a series whose terms do not approach a finite limit as the number of terms increases. The series either increases without bound or oscillates indefinitely.");
        addTestToProblemAnswer(pa13a_4, test13a);
        addProblemAnswerToTest(test13a, pa13a_4);

        ProblemAnswer pa13a_5 = createProblemAnswer("What is a power series?", "A power series is an infinite series of the form Σ(an)(x^n), where an are coefficients and x is the variable. Power series can represent functions within a certain interval of convergence.");
        addTestToProblemAnswer(pa13a_5, test13a);
        addProblemAnswerToTest(test13a, pa13a_5);


// Output for confirmation
        System.out.println("Test for 'Sequences and Series' unit created with 10 problem answers.");
// Creating the test for Unit 2: Techniques of Integration
        Test test13b = createTest("Techniques of Integration Test", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        addStudentToTest(test13b, student7);
        addStudentToTest(test13b, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa13b_1 = createProblemAnswer("What is integration by parts?", "Integration by parts is a technique used to integrate the product of two functions. It is based on the product rule of differentiation and is given by the formula: ∫u dv = uv - ∫v du.");
        addTestToProblemAnswer(pa13b_1, test13b);
        addProblemAnswerToTest(test13b, pa13b_1);

        ProblemAnswer pa13b_2 = createProblemAnswer("What is partial fractions integration?", "Partial fractions integration is a method used to integrate rational functions by expressing them as a sum of simpler fractions. This technique involves decomposing the rational function into partial fractions and then integrating each fraction separately.");
        addTestToProblemAnswer(pa13b_2, test13b);
        addProblemAnswerToTest(test13b, pa13b_2);

        ProblemAnswer pa13b_3 = createProblemAnswer("How do you integrate trigonometric functions?", "To integrate trigonometric functions, you can use trigonometric identities, substitution, and integration formulas. Common techniques include using identities to simplify the integrand and applying specific integration formulas for trigonometric functions.");
        addTestToProblemAnswer(pa13b_3, test13b);
        addProblemAnswerToTest(test13b, pa13b_3);

        ProblemAnswer pa13b_4 = createProblemAnswer("What are improper integrals?", "Improper integrals are integrals that have infinite limits of integration or integrands with infinite discontinuities. They are evaluated as limits, such as ∫[a, ∞] f(x) dx = lim(b→∞) ∫[a, b] f(x) dx.");
        addTestToProblemAnswer(pa13b_4, test13b);
        addProblemAnswerToTest(test13b, pa13b_4);

        ProblemAnswer pa13b_5 = createProblemAnswer("What is the substitution method in integration?", "The substitution method, also known as u-substitution, is used to simplify integrals by substituting a part of the integrand with a new variable. This technique often makes the integral easier to evaluate.");
        addTestToProblemAnswer(pa13b_5, test13b);
        addProblemAnswerToTest(test13b, pa13b_5);

// Output for confirmation
        System.out.println("Test for 'Techniques of Integration' unit created with 10 problem answers.");
// Creating the test for Unit 3: Multivariable Functions
        Test test13c = createTest("Multivariable Functions Test", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        addStudentToTest(test13c, student7);
        addStudentToTest(test13c, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa13c_1 = createProblemAnswer("What is a multivariable function?", "A multivariable function is a function that has more than one input variable. It maps a set of input variables to a single output value.");
        addTestToProblemAnswer(pa13c_1, test13c);
        addProblemAnswerToTest(test13c, pa13c_1);

        ProblemAnswer pa13c_2 = createProblemAnswer("What is a partial derivative?", "A partial derivative is the derivative of a multivariable function with respect to one of its variables, while keeping the other variables constant. It measures how the function changes as that variable changes.");
        addTestToProblemAnswer(pa13c_2, test13c);
        addProblemAnswerToTest(test13c, pa13c_2);

        ProblemAnswer pa13c_3 = createProblemAnswer("What is a gradient vector?", "A gradient vector is a vector that contains all the partial derivatives of a multivariable function. It points in the direction of the steepest ascent of the function.");
        addTestToProblemAnswer(pa13c_3, test13c);
        addProblemAnswerToTest(test13c, pa13c_3);

        ProblemAnswer pa13c_4 = createProblemAnswer("What is a level curve?", "A level curve is a curve on a graph where the function has a constant value. It represents points in the domain of the function where the function's value is the same.");
        addTestToProblemAnswer(pa13c_4, test13c);
        addProblemAnswerToTest(test13c, pa13c_4);

        ProblemAnswer pa13c_5 = createProblemAnswer("What is a multiple integral?", "A multiple integral is an integral that involves more than one variable. It is used to calculate the volume under a surface or the accumulation of a quantity over a region.");
        addTestToProblemAnswer(pa13c_5, test13c);
        addProblemAnswerToTest(test13c, pa13c_5);

// Output for confirmation
        System.out.println("Test for 'Multivariable Functions' unit created with 10 problem answers.");
// Creating the test for Unit 4: Vector Calculus
        Test test13d = createTest("Vector Calculus Test", faculty3, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);
        addStudentToTest(test13d, student7);
        addStudentToTest(test13d, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa13d_1 = createProblemAnswer("What is a vector field?", "A vector field is a function that assigns a vector to every point in a space. It represents the direction and magnitude of a vector quantity, such as velocity or force, at each point.");
        addTestToProblemAnswer(pa13d_1, test13d);
        addProblemAnswerToTest(test13d, pa13d_1);

        ProblemAnswer pa13d_2 = createProblemAnswer("What is a line integral?", "A line integral is an integral that evaluates the work done by a vector field along a curve. It is given by the integral of the dot product of the vector field and the differential element of the curve.");
        addTestToProblemAnswer(pa13d_2, test13d);
        addProblemAnswerToTest(test13d, pa13d_2);

        ProblemAnswer pa13d_3 = createProblemAnswer("What is Green's Theorem?", "Green's Theorem relates the line integral around a simple closed curve to the double integral over the region enclosed by the curve. It is given by ∮C F ⋅ dr = ∬R (∂N/∂x - ∂M/∂y) dA, where F = (M, N) is the vector field.");
        addTestToProblemAnswer(pa13d_3, test13d);
        addProblemAnswerToTest(test13d, pa13d_3);

        ProblemAnswer pa13d_4 = createProblemAnswer("What is a surface integral?", "A surface integral is an integral that evaluates the flux of a vector field through a surface. It is given by the integral of the dot product of the vector field and the differential element of the surface.");
        addTestToProblemAnswer(pa13d_4, test13d);
        addProblemAnswerToTest(test13d, pa13d_4);

        ProblemAnswer pa13d_5 = createProblemAnswer("What is Stokes' Theorem?", "Stokes' Theorem relates the surface integral of the curl of a vector field over a surface to the line integral of the vector field around the boundary of the surface. It is given by ∬S curl(F) ⋅ dS = ∮C F ⋅ dr.");
        addTestToProblemAnswer(pa13d_5, test13d);
        addProblemAnswerToTest(test13d, pa13d_5);

// Output for confirmation
        System.out.println("Test for 'Vector Calculus' unit created with 10 problem answers.");
// Creating the test for Unit 1: Logic
        Test test14a = createTest("Logic Test", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        addStudentToTest(test14a, student7);
        addStudentToTest(test14a, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa14a_1 = createProblemAnswer("What is propositional logic?", "Propositional logic is a branch of logic that deals with propositions, which are statements that can be either true or false. It uses logical connectives such as AND, OR, and NOT to form complex logical expressions.");
        addTestToProblemAnswer(pa14a_1, test14a);
        addProblemAnswerToTest(test14a, pa14a_1);

        ProblemAnswer pa14a_2 = createProblemAnswer("What is predicate logic?", "Predicate logic, also known as first-order logic, is a branch of logic that extends propositional logic by dealing with predicates, which are functions that return true or false based on the values of their variables. It includes quantifiers such as 'forall' and 'exists'.");
        addTestToProblemAnswer(pa14a_2, test14a);
        addProblemAnswerToTest(test14a, pa14a_2);

        ProblemAnswer pa14a_3 = createProblemAnswer("What are logical connectives?", "Logical connectives are symbols or words used to connect propositions and form complex logical expressions. Common logical connectives include AND (∧), OR (∨), NOT (¬), IMPLIES (→), and IFF (↔).");
        addTestToProblemAnswer(pa14a_3, test14a);
        addProblemAnswerToTest(test14a, pa14a_3);

        ProblemAnswer pa14a_4 = createProblemAnswer("What is a truth table?", "A truth table is a tabular representation of all possible truth values of logical expressions. It lists all possible combinations of truth values for the variables involved and the resulting truth value of the expression for each combination.");
        addTestToProblemAnswer(pa14a_4, test14a);
        addProblemAnswerToTest(test14a, pa14a_4);

        ProblemAnswer pa14a_5 = createProblemAnswer("What is logical equivalence?", "Logical equivalence is a relationship between two logical expressions that have the same truth values in all possible scenarios. If two expressions are logically equivalent, they can be substituted for each other in logical arguments.");
        addTestToProblemAnswer(pa14a_5, test14a);
        addProblemAnswerToTest(test14a, pa14a_5);


// Output for confirmation
        System.out.println("Test for 'Logic' unit created with 10 problem answers.");
// Creating the test for Unit 2: Set Theory
        Test test14b = createTest("Set Theory Test", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        addStudentToTest(test14b, student7);
        addStudentToTest(test14b, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa14b_1 = createProblemAnswer("What is a set?", "A set is a collection of distinct objects, considered as an object in its own right. Sets are usually denoted by capital letters and their elements are listed within curly brackets, e.g., A = {1, 2, 3}.");
        addTestToProblemAnswer(pa14b_1, test14b);
        addProblemAnswerToTest(test14b, pa14b_1);

        ProblemAnswer pa14b_2 = createProblemAnswer("What is a subset?", "A subset is a set whose elements are all contained in another set. If A and B are sets, A is a subset of B if every element of A is also an element of B, denoted as A ⊆ B.");
        addTestToProblemAnswer(pa14b_2, test14b);
        addProblemAnswerToTest(test14b, pa14b_2);

        ProblemAnswer pa14b_3 = createProblemAnswer("What is the union of sets?", "The union of sets is a set containing all elements from the given sets. For sets A and B, the union is denoted as A ∪ B and consists of all elements that are in A, in B, or in both.");
        addTestToProblemAnswer(pa14b_3, test14b);
        addProblemAnswerToTest(test14b, pa14b_3);

        ProblemAnswer pa14b_4 = createProblemAnswer("What is the intersection of sets?", "The intersection of sets is a set containing only the elements that are common to the given sets. For sets A and B, the intersection is denoted as A ∩ B and consists of all elements that are in both A and B.");
        addTestToProblemAnswer(pa14b_4, test14b);
        addProblemAnswerToTest(test14b, pa14b_4);

        ProblemAnswer pa14b_5 = createProblemAnswer("What is the difference of sets?", "The difference of sets is a set containing the elements that are in one set but not in another. For sets A and B, the difference is denoted as A - B and consists of all elements that are in A but not in B.");
        addTestToProblemAnswer(pa14b_5, test14b);
        addProblemAnswerToTest(test14b, pa14b_5);

// Output for confirmation
        System.out.println("Test for 'Set Theory' unit created with 10 problem answers.");
// Creating the test for Unit 3: Graph Theory
        Test test14c = createTest("Graph Theory Test", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        addStudentToTest(test14c, student7);
        addStudentToTest(test14c, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa14c_1 = createProblemAnswer("What is a graph?", "A graph is a mathematical structure consisting of a set of vertices (nodes) and a set of edges (lines) that connect pairs of vertices. Graphs are used to model pairwise relations between objects.");
        addTestToProblemAnswer(pa14c_1, test14c);
        addProblemAnswerToTest(test14c, pa14c_1);

        ProblemAnswer pa14c_2 = createProblemAnswer("What is the difference between directed and undirected graphs?", "In a directed graph, edges have a direction, indicating a one-way relationship between vertices. In an undirected graph, edges have no direction, indicating a two-way relationship between vertices.");
        addTestToProblemAnswer(pa14c_2, test14c);
        addProblemAnswerToTest(test14c, pa14c_2);

        ProblemAnswer pa14c_3 = createProblemAnswer("What is a path in a graph?", "A path in a graph is a sequence of vertices connected by edges. A path can be simple (no repeated vertices) or general (vertices can be repeated). The length of a path is the number of edges it contains.");
        addTestToProblemAnswer(pa14c_3, test14c);
        addProblemAnswerToTest(test14c, pa14c_3);

        ProblemAnswer pa14c_4 = createProblemAnswer("What is a cycle in a graph?", "A cycle in a graph is a path that starts and ends at the same vertex, with no other repeated vertices. Cycles are used to study the connectivity and structure of graphs.");
        addTestToProblemAnswer(pa14c_4, test14c);
        addProblemAnswerToTest(test14c, pa14c_4);

        ProblemAnswer pa14c_5 = createProblemAnswer("What is a connected graph?", "A connected graph is a graph in which there is a path between every pair of vertices. In a connected graph, all vertices are reachable from any other vertex.");
        addTestToProblemAnswer(pa14c_5, test14c);
        addProblemAnswerToTest(test14c, pa14c_5);

// Output for confirmation
        System.out.println("Test for 'Graph Theory' unit created with 10 problem answers.");
// Creating the test for Unit 4: Combinatorics
        Test test14d = createTest("Combinatorics Test", faculty4, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);
        addStudentToTest(test14d, student7);
        addStudentToTest(test14d, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa14d_1 = createProblemAnswer("What is combinatorics?", "Combinatorics is the branch of mathematics that deals with counting, arrangement, and combination of objects. It involves studying finite structures and solving problems related to discrete objects.");
        addTestToProblemAnswer(pa14d_1, test14d);
        addProblemAnswerToTest(test14d, pa14d_1);

        ProblemAnswer pa14d_2 = createProblemAnswer("What is a permutation?", "A permutation is an arrangement of objects in a specific order. The number of permutations of n distinct objects is given by n!, where ! denotes factorial.");
        addTestToProblemAnswer(pa14d_2, test14d);
        addProblemAnswerToTest(test14d, pa14d_2);

        ProblemAnswer pa14d_3 = createProblemAnswer("What is a combination?", "A combination is a selection of objects without regard to order. The number of combinations of n objects taken r at a time is given by the binomial coefficient C(n, r) = n! / (r!(n - r)!).");
        addTestToProblemAnswer(pa14d_3, test14d);
        addProblemAnswerToTest(test14d, pa14d_3);

        ProblemAnswer pa14d_4 = createProblemAnswer("What is the principle of inclusion-exclusion?", "The principle of inclusion-exclusion is a method for counting the number of elements in the union of overlapping sets. It involves adding the sizes of individual sets and subtracting the sizes of their pairwise intersections, and so on.");
        addTestToProblemAnswer(pa14d_4, test14d);
        addProblemAnswerToTest(test14d, pa14d_4);

        ProblemAnswer pa14d_5 = createProblemAnswer("What is a binomial coefficient?", "A binomial coefficient, denoted C(n, r) or (n choose r), represents the number of ways to choose r objects from a set of n objects without regard to order. It is given by the formula C(n, r) = n! / (r!(n - r)!).");
        addTestToProblemAnswer(pa14d_5, test14d);
        addProblemAnswerToTest(test14d, pa14d_5);

// Output for confirmation
        System.out.println("Test for 'Combinatorics' unit created with 10 problem answers.");
// Creating the test for Unit 1: Newton's Laws
        Test test15a = createTest("Newton's Laws Test", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);
        addStudentToTest(test15a, student7);
        addStudentToTest(test15a, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa15a_1 = createProblemAnswer("What is Newton's First Law of Motion?", "Newton's First Law of Motion, also known as the Law of Inertia, states that an object will remain at rest or in uniform motion in a straight line unless acted upon by an external force.");
        addTestToProblemAnswer(pa15a_1, test15a);
        addProblemAnswerToTest(test15a, pa15a_1);

        ProblemAnswer pa15a_2 = createProblemAnswer("What is Newton's Second Law of Motion?", "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. It is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addTestToProblemAnswer(pa15a_2, test15a);
        addProblemAnswerToTest(test15a, pa15a_2);

        ProblemAnswer pa15a_3 = createProblemAnswer("What is Newton's Third Law of Motion?", "Newton's Third Law of Motion states that for every action, there is an equal and opposite reaction. This means that if one body exerts a force on another body, the second body exerts a force of equal magnitude but in the opposite direction on the first body.");
        addTestToProblemAnswer(pa15a_3, test15a);
        addProblemAnswerToTest(test15a, pa15a_3);

        ProblemAnswer pa15a_4 = createProblemAnswer("What is inertia?", "Inertia is the property of an object to resist changes in its state of motion. It is directly related to the mass of the object: the greater the mass, the greater the inertia.");
        addTestToProblemAnswer(pa15a_4, test15a);
        addProblemAnswerToTest(test15a, pa15a_4);

        ProblemAnswer pa15a_5 = createProblemAnswer("How does Newton's First Law apply to a car crash?", "In a car crash, the passengers inside the car continue moving at the car's speed due to inertia until an external force, such as a seatbelt or airbag, acts to decelerate them and bring them to a stop.");
        addTestToProblemAnswer(pa15a_5, test15a);
        addProblemAnswerToTest(test15a, pa15a_5);

// Output for confirmation
        System.out.println("Test for 'Newton's Laws' unit created with 10 problem answers.");
// Creating the test for Unit 2: Energy Principles
        Test test15b = createTest("Energy Principles Test", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);
        addStudentToTest(test15b, student7);
        addStudentToTest(test15b, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa15b_1 = createProblemAnswer("What is kinetic energy?", "Kinetic energy is the energy possessed by an object due to its motion. It is calculated using the formula KE = 1/2 mv^2, where m is the mass and v is the velocity of the object.");
        addTestToProblemAnswer(pa15b_1, test15b);
        addProblemAnswerToTest(test15b, pa15b_1);

        ProblemAnswer pa15b_2 = createProblemAnswer("What is potential energy?", "Potential energy is the energy stored in an object due to its position or configuration. Examples include gravitational potential energy (U = mgh) and elastic potential energy (U = 1/2 kx^2).");
        addTestToProblemAnswer(pa15b_2, test15b);
        addProblemAnswerToTest(test15b, pa15b_2);

        ProblemAnswer pa15b_3 = createProblemAnswer("What is the work-energy theorem?", "The work-energy theorem states that the work done on an object is equal to the change in its kinetic energy. It is expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        addTestToProblemAnswer(pa15b_3, test15b);
        addProblemAnswerToTest(test15b, pa15b_3);

        ProblemAnswer pa15b_4 = createProblemAnswer("What is the principle of conservation of energy?", "The principle of conservation of energy states that energy cannot be created or destroyed, only transformed from one form to another. The total energy in an isolated system remains constant.");
        addTestToProblemAnswer(pa15b_4, test15b);
        addProblemAnswerToTest(test15b, pa15b_4);

        ProblemAnswer pa15b_5 = createProblemAnswer("What is power?", "Power is the rate at which work is done or energy is transferred. It is calculated using the formula P = W/t, where P is power, W is work, and t is time. The unit of power is the watt (W).");
        addTestToProblemAnswer(pa15b_5, test15b);
        addProblemAnswerToTest(test15b, pa15b_5);

// Output for confirmation
        System.out.println("Test for 'Energy Principles' unit created with 10 problem answers.");
// Creating the test for Unit 3: Motion
        Test test15c = createTest("Motion Test", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);
        addStudentToTest(test15c, student7);
        addStudentToTest(test15c, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa15c_1 = createProblemAnswer("What is linear motion?", "Linear motion is the movement of an object along a straight line. It can be described by parameters such as displacement, velocity, and acceleration.");
        addTestToProblemAnswer(pa15c_1, test15c);
        addProblemAnswerToTest(test15c, pa15c_1);

        ProblemAnswer pa15c_2 = createProblemAnswer("What is projectile motion?", "Projectile motion is the curved path that an object follows when it is thrown or propelled near the surface of the Earth. It is influenced by gravity and can be analyzed using the equations of motion.");
        addTestToProblemAnswer(pa15c_2, test15c);
        addProblemAnswerToTest(test15c, pa15c_2);

        ProblemAnswer pa15c_3 = createProblemAnswer("What is circular motion?", "Circular motion is the movement of an object along a circular path. It can be characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        addTestToProblemAnswer(pa15c_3, test15c);
        addProblemAnswerToTest(test15c, pa15c_3);

        ProblemAnswer pa15c_4 = createProblemAnswer("What is velocity?", "Velocity is the rate of change of displacement with respect to time. It is a vector quantity with both magnitude and direction. The formula for velocity is v = Δx / Δt, where Δx is the displacement and Δt is the time interval.");
        addTestToProblemAnswer(pa15c_4, test15c);
        addProblemAnswerToTest(test15c, pa15c_4);

        ProblemAnswer pa15c_5 = createProblemAnswer("What is acceleration?", "Acceleration is the rate of change of velocity with respect to time. It is a vector quantity and can be positive (speeding up) or negative (slowing down). The formula for acceleration is a = Δv / Δt, where Δv is the change in velocity and Δt is the time interval.");
        addTestToProblemAnswer(pa15c_5, test15c);
        addProblemAnswerToTest(test15c, pa15c_5);

// Output for confirmation
        System.out.println("Test for 'Motion' unit created with 10 problem answers.");
// Creating the test for Unit 1: Atomic Structure
        Test test16a = createTest("Atomic Structure Test", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);
        addStudentToTest(test16a, student7);
        addStudentToTest(test16a, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa16a_1 = createProblemAnswer("What are the three main subatomic particles in an atom?", "The three main subatomic particles in an atom are protons, neutrons, and electrons. Protons and neutrons are located in the nucleus, while electrons orbit the nucleus.");
        addTestToProblemAnswer(pa16a_1, test16a);
        addProblemAnswerToTest(test16a, pa16a_1);

        ProblemAnswer pa16a_2 = createProblemAnswer("What is the atomic number of an element?", "The atomic number of an element is the number of protons in the nucleus of an atom. It determines the identity of the element and its position in the periodic table.");
        addTestToProblemAnswer(pa16a_2, test16a);
        addProblemAnswerToTest(test16a, pa16a_2);

        ProblemAnswer pa16a_3 = createProblemAnswer("What is the mass number of an atom?", "The mass number of an atom is the total number of protons and neutrons in its nucleus. It is represented as A and can be calculated as A = Z + N, where Z is the atomic number and N is the number of neutrons.");
        addTestToProblemAnswer(pa16a_3, test16a);
        addProblemAnswerToTest(test16a, pa16a_3);

        ProblemAnswer pa16a_4 = createProblemAnswer("What are isotopes?", "Isotopes are variants of a given chemical element that have the same number of protons but different numbers of neutrons. This results in different mass numbers for the isotopes.");
        addTestToProblemAnswer(pa16a_4, test16a);
        addProblemAnswerToTest(test16a, pa16a_4);

        ProblemAnswer pa16a_5 = createProblemAnswer("What is an electron configuration?", "An electron configuration is the distribution of electrons in an atom's orbitals. It follows the Aufbau principle, Hund's rule, and the Pauli exclusion principle to determine the most stable arrangement of electrons.");
        addTestToProblemAnswer(pa16a_5, test16a);
        addProblemAnswerToTest(test16a, pa16a_5);

// Output for confirmation
        System.out.println("Test for 'Atomic Structure' unit created with 10 problem answers.");
// Creating the test for Unit 2: Chemical Bonding
        Test test16b = createTest("Chemical Bonding Test", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);
        addStudentToTest(test16b, student7);
        addStudentToTest(test16b, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa16b_1 = createProblemAnswer("What is an ionic bond?", "An ionic bond is a type of chemical bond formed through the electrostatic attraction between oppositely charged ions. It typically occurs between a metal and a non-metal.");
        addTestToProblemAnswer(pa16b_1, test16b);
        addProblemAnswerToTest(test16b, pa16b_1);

        ProblemAnswer pa16b_2 = createProblemAnswer("What is a covalent bond?", "A covalent bond is a type of chemical bond where two atoms share one or more pairs of electrons. It usually occurs between non-metal atoms.");
        addTestToProblemAnswer(pa16b_2, test16b);
        addProblemAnswerToTest(test16b, pa16b_2);

        ProblemAnswer pa16b_3 = createProblemAnswer("What is a metallic bond?", "A metallic bond is a type of chemical bond found in metals, where electrons are shared and move freely among a lattice of metal atoms. This creates a 'sea of electrons' that contributes to the conductivity and malleability of metals.");
        addTestToProblemAnswer(pa16b_3, test16b);
        addProblemAnswerToTest(test16b, pa16b_3);

        ProblemAnswer pa16b_4 = createProblemAnswer("What is electronegativity?", "Electronegativity is a measure of an atom's ability to attract and hold onto electrons in a chemical bond. Elements with high electronegativity tend to attract electrons more strongly.");
        addTestToProblemAnswer(pa16b_4, test16b);
        addProblemAnswerToTest(test16b, pa16b_4);

        ProblemAnswer pa16b_5 = createProblemAnswer("What is a polar covalent bond?", "A polar covalent bond is a type of covalent bond in which the electrons are not shared equally between the atoms. This results in a partial positive charge on one atom and a partial negative charge on the other.");
        addTestToProblemAnswer(pa16b_5, test16b);
        addProblemAnswerToTest(test16b, pa16b_5);

// Output for confirmation
        System.out.println("Test for 'Chemical Bonding' unit created with 10 problem answers.");
// Creating the test for Unit 3: Reactions
        Test test16c = createTest("Reactions Test", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);
        addStudentToTest(test16c, student7);
        addStudentToTest(test16c, student8);

// Creating and adding problem answers to the test
        ProblemAnswer pa16c_1 = createProblemAnswer("What are chemical reactions?", "Chemical reactions are processes in which one or more substances (reactants) are converted into one or more different substances (products). They involve the breaking and forming of chemical bonds.");
        addTestToProblemAnswer(pa16c_1, test16c);
        addProblemAnswerToTest(test16c, pa16c_1);

        ProblemAnswer pa16c_2 = createProblemAnswer("What are the types of chemical reactions?", "The main types of chemical reactions include synthesis (combination), decomposition, single displacement (substitution), double displacement (metathesis), and combustion reactions.");
        addTestToProblemAnswer(pa16c_2, test16c);
        addProblemAnswerToTest(test16c, pa16c_2);

        ProblemAnswer pa16c_3 = createProblemAnswer("What is a synthesis reaction?", "A synthesis reaction is a type of chemical reaction in which two or more reactants combine to form a single product. It is represented by the general equation: A + B → AB.");
        addTestToProblemAnswer(pa16c_3, test16c);
        addProblemAnswerToTest(test16c, pa16c_3);

        ProblemAnswer pa16c_4 = createProblemAnswer("What is a decomposition reaction?", "A decomposition reaction is a type of chemical reaction in which a single compound breaks down into two or more simpler products. It is represented by the general equation: AB → A + B.");
        addTestToProblemAnswer(pa16c_4, test16c);
        addProblemAnswerToTest(test16c, pa16c_4);

        ProblemAnswer pa16c_5 = createProblemAnswer("What is a single displacement reaction?", "A single displacement reaction, also known as a substitution reaction, is a type of chemical reaction in which one element replaces another in a compound. It is represented by the general equation: A + BC → AC + B.");
        addTestToProblemAnswer(pa16c_5, test16c);
        addProblemAnswerToTest(test16c, pa16c_5);

        System.out.println("Test for 'Reactions' unit created with 10 problem answers.");

        // Creating StudentAnswer instances for student5
        StudentAnswer sa13a_1_student7 = createStudentAnswer(student7, pa13a_1, "A sequence is an ordered list of numbers that follows a specific pattern or rule. Each number in the sequence is called a term.");
        addStudentAnswerToProblemAnswer(pa13a_1, sa13a_1_student7);

        StudentAnswer sa13a_2_student7 = createStudentAnswer(student7, pa13a_2, "A series is the sum of the terms of a sequence. It can be finite or infinite, depending on the number of terms being summed.");
        addStudentAnswerToProblemAnswer(pa13a_2, sa13a_2_student7);

        StudentAnswer sa13a_3_student7 = createStudentAnswer(student7, pa13a_3, "A convergent series is a series whose terms approach a finite limit as the number of terms increases. The series converges to this limit.");
        addStudentAnswerToProblemAnswer(pa13a_3, sa13a_3_student7);

        StudentAnswer sa13a_4_student7 = createStudentAnswer(student7, pa13a_4, "A divergent series is a series whose terms do not approach a finite limit as the number of terms increases. The series either increases without bound or oscillates indefinitely.");
        addStudentAnswerToProblemAnswer(pa13a_4, sa13a_4_student7);

        StudentAnswer sa13a_5_student7 = createStudentAnswer(student7, pa13a_5, "A power series is an infinite series of the form Σ(an)(x^n), where an are coefficients and x is the variable. Power series can represent functions within a certain interval of convergence.");
        addStudentAnswerToProblemAnswer(pa13a_5, sa13a_5_student7);

// Creating StudentAnswer instances for student6
        StudentAnswer sa13a_1_student8 = createStudentAnswer(student8, pa13a_1, "A sequence is an ordered list of numbers that follows a specific pattern or rule. Each number in the sequence is called a term.");
        addStudentAnswerToProblemAnswer(pa13a_1, sa13a_1_student8);

        StudentAnswer sa13a_2_student8 = createStudentAnswer(student8, pa13a_2, "A series is the sum of the terms of a sequence. It can be finite or infinite, depending on the number of terms being summed.");
        addStudentAnswerToProblemAnswer(pa13a_2, sa13a_2_student8);

        StudentAnswer sa13a_3_student8 = createStudentAnswer(student8, pa13a_3, "A convergent series is a series whose terms approach a finite limit as the number of terms increases. The series converges to this limit.");
        addStudentAnswerToProblemAnswer(pa13a_3, sa13a_3_student8);

        StudentAnswer sa13a_4_student8 = createStudentAnswer(student8, pa13a_4, "A divergent series is a series whose terms do not approach a finite limit as the number of terms increases. The series either increases without bound or oscillates indefinitely.");
        addStudentAnswerToProblemAnswer(pa13a_4, sa13a_4_student8);

        StudentAnswer sa13a_5_student8 = createStudentAnswer(student8, pa13a_5, "A power series is an infinite series of the form Σ(an)(x^n), where an are coefficients and x is the variable. Power series can represent functions within a certain interval of convergence.");
        addStudentAnswerToProblemAnswer(pa13a_5, sa13a_5_student8);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa13b_1_student7 = createStudentAnswer(student7, pa13b_1, "Integration by parts is a technique used to integrate the product of two functions. It is based on the product rule of differentiation and is given by the formula: ∫u dv = uv - ∫v du.");
        addStudentAnswerToProblemAnswer(pa13b_1, sa13b_1_student7);

        StudentAnswer sa13b_2_student7 = createStudentAnswer(student7, pa13b_2, "Partial fractions integration is a method used to integrate rational functions by expressing them as a sum of simpler fractions. This technique involves decomposing the rational function into partial fractions and then integrating each fraction separately.");
        addStudentAnswerToProblemAnswer(pa13b_2, sa13b_2_student7);

        StudentAnswer sa13b_3_student7 = createStudentAnswer(student7, pa13b_3, "To integrate trigonometric functions, you can use trigonometric identities, substitution, and integration formulas. Common techniques include using identities to simplify the integrand and applying specific integration formulas for trigonometric functions.");
        addStudentAnswerToProblemAnswer(pa13b_3, sa13b_3_student7);

        StudentAnswer sa13b_4_student7 = createStudentAnswer(student7, pa13b_4, "Improper integrals are integrals that have infinite limits of integration or integrands with infinite discontinuities. They are evaluated as limits, such as ∫[a, ∞] f(x) dx = lim(b→∞) ∫[a, b] f(x) dx.");
        addStudentAnswerToProblemAnswer(pa13b_4, sa13b_4_student7);

        StudentAnswer sa13b_5_student7 = createStudentAnswer(student7, pa13b_5, "The substitution method, also known as u-substitution, is used to simplify integrals by substituting a part of the integrand with a new variable. This technique often makes the integral easier to evaluate.");
        addStudentAnswerToProblemAnswer(pa13b_5, sa13b_5_student7);

// Creating StudentAnswer instances for student6
        StudentAnswer sa13b_1_student8 = createStudentAnswer(student8, pa13b_1, "Integration by parts is a technique used to integrate the product of two functions. It is based on the product rule of differentiation and is given by the formula: ∫u dv = uv - ∫v du.");
        addStudentAnswerToProblemAnswer(pa13b_1, sa13b_1_student8);

        StudentAnswer sa13b_2_student8 = createStudentAnswer(student8, pa13b_2, "Partial fractions integration is a method used to integrate rational functions by expressing them as a sum of simpler fractions. This technique involves decomposing the rational function into partial fractions and then integrating each fraction separately.");
        addStudentAnswerToProblemAnswer(pa13b_2, sa13b_2_student8);

        StudentAnswer sa13b_3_student8 = createStudentAnswer(student8, pa13b_3, "To integrate trigonometric functions, you can use trigonometric identities, substitution, and integration formulas. Common techniques include using identities to simplify the integrand and applying specific integration formulas for trigonometric functions.");
        addStudentAnswerToProblemAnswer(pa13b_3, sa13b_3_student8);

        StudentAnswer sa13b_4_student8 = createStudentAnswer(student8, pa13b_4, "Improper integrals are integrals that have infinite limits of integration or integrands with infinite discontinuities. They are evaluated as limits, such as ∫[a, ∞] f(x) dx = lim(b→∞) ∫[a, b] f(x) dx.");
        addStudentAnswerToProblemAnswer(pa13b_4, sa13b_4_student8);

        StudentAnswer sa13b_5_student8 = createStudentAnswer(student8, pa13b_5, "The substitution method, also known as u-substitution, is used to simplify integrals by substituting a part of the integrand with a new variable. This technique often makes the integral easier to evaluate.");
        addStudentAnswerToProblemAnswer(pa13b_5, sa13b_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa13c_1_student7 = createStudentAnswer(student7, pa13c_1, "A multivariable function is a function that has more than one input variable. It maps a set of input variables to a single output value.");
        addStudentAnswerToProblemAnswer(pa13c_1, sa13c_1_student7);

        StudentAnswer sa13c_2_student7 = createStudentAnswer(student7, pa13c_2, "A partial derivative is the derivative of a multivariable function with respect to one of its variables, while keeping the other variables constant. It measures how the function changes as that variable changes.");
        addStudentAnswerToProblemAnswer(pa13c_2, sa13c_2_student7);

        StudentAnswer sa13c_3_student7 = createStudentAnswer(student7, pa13c_3, "A gradient vector is a vector that contains all the partial derivatives of a multivariable function. It points in the direction of the steepest ascent of the function.");
        addStudentAnswerToProblemAnswer(pa13c_3, sa13c_3_student7);

        StudentAnswer sa13c_4_student7 = createStudentAnswer(student7, pa13c_4, "A level curve is a curve on a graph where the function has a constant value. It represents points in the domain of the function where the function's value is the same.");
        addStudentAnswerToProblemAnswer(pa13c_4, sa13c_4_student7);

        StudentAnswer sa13c_5_student7 = createStudentAnswer(student7, pa13c_5, "A multiple integral is an integral that involves more than one variable. It is used to calculate the volume under a surface or the accumulation of a quantity over a region.");
        addStudentAnswerToProblemAnswer(pa13c_5, sa13c_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa13c_1_student8 = createStudentAnswer(student8, pa13c_1, "A multivariable function is a function that has more than one input variable. It maps a set of input variables to a single output value.");
        addStudentAnswerToProblemAnswer(pa13c_1, sa13c_1_student8);

        StudentAnswer sa13c_2_student8 = createStudentAnswer(student8, pa13c_2, "A partial derivative is the derivative of a multivariable function with respect to one of its variables, while keeping the other variables constant. It measures how the function changes as that variable changes.");
        addStudentAnswerToProblemAnswer(pa13c_2, sa13c_2_student8);

        StudentAnswer sa13c_3_student8 = createStudentAnswer(student8, pa13c_3, "A gradient vector is a vector that contains all the partial derivatives of a multivariable function. It points in the direction of the steepest ascent of the function.");
        addStudentAnswerToProblemAnswer(pa13c_3, sa13c_3_student8);

        StudentAnswer sa13c_4_student8 = createStudentAnswer(student8, pa13c_4, "A level curve is a curve on a graph where the function has a constant value. It represents points in the domain of the function where the function's value is the same.");
        addStudentAnswerToProblemAnswer(pa13c_4, sa13c_4_student8);

        StudentAnswer sa13c_5_student8 = createStudentAnswer(student8, pa13c_5, "A multiple integral is an integral that involves more than one variable. It is used to calculate the volume under a surface or the accumulation of a quantity over a region.");
        addStudentAnswerToProblemAnswer(pa13c_5, sa13c_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa13d_1_student7 = createStudentAnswer(student7, pa13d_1, "A vector field is a function that assigns a vector to every point in a space. It represents the direction and magnitude of a vector quantity, such as velocity or force, at each point.");
        addStudentAnswerToProblemAnswer(pa13d_1, sa13d_1_student7);

        StudentAnswer sa13d_2_student7 = createStudentAnswer(student7, pa13d_2, "A line integral is an integral that evaluates the work done by a vector field along a curve. It is given by the integral of the dot product of the vector field and the differential element of the curve.");
        addStudentAnswerToProblemAnswer(pa13d_2, sa13d_2_student7);

        StudentAnswer sa13d_3_student7 = createStudentAnswer(student7, pa13d_3, "Green's Theorem relates the line integral around a simple closed curve to the double integral over the region enclosed by the curve. It is given by ∮C F ⋅ dr = ∬R (∂N/∂x - ∂M/∂y) dA, where F = (M, N) is the vector field.");
        addStudentAnswerToProblemAnswer(pa13d_3, sa13d_3_student7);

        StudentAnswer sa13d_4_student7 = createStudentAnswer(student7, pa13d_4, "A surface integral is an integral that evaluates the flux of a vector field through a surface. It is given by the integral of the dot product of the vector field and the differential element of the surface.");
        addStudentAnswerToProblemAnswer(pa13d_4, sa13d_4_student7);

        StudentAnswer sa13d_5_student7 = createStudentAnswer(student7, pa13d_5, "Stokes' Theorem relates the surface integral of the curl of a vector field over a surface to the line integral of the vector field around the boundary of the surface. It is given by ∬S curl(F) ⋅ dS = ∮C F ⋅ dr.");
        addStudentAnswerToProblemAnswer(pa13d_5, sa13d_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa13d_1_student8 = createStudentAnswer(student8, pa13d_1, "A vector field is a function that assigns a vector to every point in a space. It represents the direction and magnitude of a vector quantity, such as velocity or force, at each point.");
        addStudentAnswerToProblemAnswer(pa13d_1, sa13d_1_student8);

        StudentAnswer sa13d_2_student8 = createStudentAnswer(student8, pa13d_2, "A line integral is an integral that evaluates the work done by a vector field along a curve. It is given by the integral of the dot product of the vector field and the differential element of the curve.");
        addStudentAnswerToProblemAnswer(pa13d_2, sa13d_2_student8);

        StudentAnswer sa13d_3_student8 = createStudentAnswer(student8, pa13d_3, "Green's Theorem relates the line integral around a simple closed curve to the double integral over the region enclosed by the curve. It is given by ∮C F ⋅ dr = ∬R (∂N/∂x - ∂M/∂y) dA, where F = (M, N) is the vector field.");
        addStudentAnswerToProblemAnswer(pa13d_3, sa13d_3_student8);

        StudentAnswer sa13d_4_student8 = createStudentAnswer(student8, pa13d_4, "A surface integral is an integral that evaluates the flux of a vector field through a surface. It is given by the integral of the dot product of the vector field and the differential element of the surface.");
        addStudentAnswerToProblemAnswer(pa13d_4, sa13d_4_student8);

        StudentAnswer sa13d_5_student8 = createStudentAnswer(student8, pa13d_5, "Stokes' Theorem relates the surface integral of the curl of a vector field over a surface to the line integral of the vector field around the boundary of the surface. It is given by ∬S curl(F) ⋅ dS = ∮C F ⋅ dr.");
        addStudentAnswerToProblemAnswer(pa13d_5, sa13d_5_student8);

// Creating StudentAnswer instances for student7
        StudentAnswer sa14a_1_student7 = createStudentAnswer(student7, pa14a_1, "Propositional logic is a branch of logic that deals with propositions, which are statements that can be either true or false. It uses logical connectives such as AND, OR, and NOT to form complex logical expressions.");
        addStudentAnswerToProblemAnswer(pa14a_1, sa14a_1_student7);

        StudentAnswer sa14a_2_student7 = createStudentAnswer(student7, pa14a_2, "Predicate logic, also known as first-order logic, is a branch of logic that extends propositional logic by dealing with predicates, which are functions that return true or false based on the values of their variables. It includes quantifiers such as 'forall' and 'exists'.");
        addStudentAnswerToProblemAnswer(pa14a_2, sa14a_2_student7);

        StudentAnswer sa14a_3_student7 = createStudentAnswer(student7, pa14a_3, "Logical connectives are symbols or words used to connect propositions and form complex logical expressions. Common logical connectives include AND (∧), OR (∨), NOT (¬), IMPLIES (→), and IFF (↔).");
        addStudentAnswerToProblemAnswer(pa14a_3, sa14a_3_student7);

        StudentAnswer sa14a_4_student7 = createStudentAnswer(student7, pa14a_4, "A truth table is a tabular representation of all possible truth values of logical expressions. It lists all possible combinations of truth values for the variables involved and the resulting truth value of the expression for each combination.");
        addStudentAnswerToProblemAnswer(pa14a_4, sa14a_4_student7);

        StudentAnswer sa14a_5_student7 = createStudentAnswer(student7, pa14a_5, "Logical equivalence is a relationship between two logical expressions that have the same truth values in all possible scenarios. If two expressions are logically equivalent, they can be substituted for each other in logical arguments.");
        addStudentAnswerToProblemAnswer(pa14a_5, sa14a_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa14a_1_student8 = createStudentAnswer(student8, pa14a_1, "Propositional logic is a branch of logic that deals with propositions, which are statements that can be either true or false. It uses logical connectives such as AND, OR, and NOT to form complex logical expressions.");
        addStudentAnswerToProblemAnswer(pa14a_1, sa14a_1_student8);

        StudentAnswer sa14a_2_student8 = createStudentAnswer(student8, pa14a_2, "Predicate logic, also known as first-order logic, is a branch of logic that extends propositional logic by dealing with predicates, which are functions that return true or false based on the values of their variables. It includes quantifiers such as 'forall' and 'exists'.");
        addStudentAnswerToProblemAnswer(pa14a_2, sa14a_2_student8);

        StudentAnswer sa14a_3_student8 = createStudentAnswer(student8, pa14a_3, "Logical connectives are symbols or words used to connect propositions and form complex logical expressions. Common logical connectives include AND (∧), OR (∨), NOT (¬), IMPLIES (→), and IFF (↔).");
        addStudentAnswerToProblemAnswer(pa14a_3, sa14a_3_student8);

        StudentAnswer sa14a_4_student8 = createStudentAnswer(student8, pa14a_4, "A truth table is a tabular representation of all possible truth values of logical expressions. It lists all possible combinations of truth values for the variables involved and the resulting truth value of the expression for each combination.");
        addStudentAnswerToProblemAnswer(pa14a_4, sa14a_4_student8);

        StudentAnswer sa14a_5_student8 = createStudentAnswer(student8, pa14a_5, "Logical equivalence is a relationship between two logical expressions that have the same truth values in all possible scenarios. If two expressions are logically equivalent, they can be substituted for each other in logical arguments.");
        addStudentAnswerToProblemAnswer(pa14a_5, sa14a_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa14b_1_student7 = createStudentAnswer(student7, pa14b_1, "A set is a collection of distinct objects, considered as an object in its own right. Sets are usually denoted by capital letters and their elements are listed within curly brackets, e.g., A = {1, 2, 3}.");
        addStudentAnswerToProblemAnswer(pa14b_1, sa14b_1_student7);

        StudentAnswer sa14b_2_student7 = createStudentAnswer(student7, pa14b_2, "A subset is a set whose elements are all contained in another set. If A and B are sets, A is a subset of B if every element of A is also an element of B, denoted as A ⊆ B.");
        addStudentAnswerToProblemAnswer(pa14b_2, sa14b_2_student7);

        StudentAnswer sa14b_3_student7 = createStudentAnswer(student7, pa14b_3, "The union of sets is a set containing all elements from the given sets. For sets A and B, the union is denoted as A ∪ B and consists of all elements that are in A, in B, or in both.");
        addStudentAnswerToProblemAnswer(pa14b_3, sa14b_3_student7);

        StudentAnswer sa14b_4_student7 = createStudentAnswer(student7, pa14b_4, "The intersection of sets is a set containing only the elements that are common to the given sets. For sets A and B, the intersection is denoted as A ∩ B and consists of all elements that are in both A and B.");
        addStudentAnswerToProblemAnswer(pa14b_4, sa14b_4_student7);

        StudentAnswer sa14b_5_student7 = createStudentAnswer(student7, pa14b_5, "The difference of sets is a set containing the elements that are in one set but not in another. For sets A and B, the difference is denoted as A - B and consists of all elements that are in A but not in B.");
        addStudentAnswerToProblemAnswer(pa14b_5, sa14b_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa14b_1_student8 = createStudentAnswer(student8, pa14b_1, "A set is a collection of distinct objects, considered as an object in its own right. Sets are usually denoted by capital letters and their elements are listed within curly brackets, e.g., A = {1, 2, 3}.");
        addStudentAnswerToProblemAnswer(pa14b_1, sa14b_1_student8);

        StudentAnswer sa14b_2_student8 = createStudentAnswer(student8, pa14b_2, "A subset is a set whose elements are all contained in another set. If A and B are sets, A is a subset of B if every element of A is also an element of B, denoted as A ⊆ B.");
        addStudentAnswerToProblemAnswer(pa14b_2, sa14b_2_student8);

        StudentAnswer sa14b_3_student8 = createStudentAnswer(student8, pa14b_3, "The union of sets is a set containing all elements from the given sets. For sets A and B, the union is denoted as A ∪ B and consists of all elements that are in A, in B, or in both.");
        addStudentAnswerToProblemAnswer(pa14b_3, sa14b_3_student8);

        StudentAnswer sa14b_4_student8 = createStudentAnswer(student8, pa14b_4, "The intersection of sets is a set containing only the elements that are common to the given sets. For sets A and B, the intersection is denoted as A ∩ B and consists of all elements that are in both A and B.");
        addStudentAnswerToProblemAnswer(pa14b_4, sa14b_4_student8);

        StudentAnswer sa14b_5_student8 = createStudentAnswer(student8, pa14b_5, "The difference of sets is a set containing the elements that are in one set but not in another. For sets A and B, the difference is denoted as A - B and consists of all elements that are in A but not in B.");
        addStudentAnswerToProblemAnswer(pa14b_5, sa14b_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa14c_1_student7 = createStudentAnswer(student7, pa14c_1, "A graph is a mathematical structure consisting of a set of vertices (nodes) and a set of edges (lines) that connect pairs of vertices. Graphs are used to model pairwise relations between objects.");
        addStudentAnswerToProblemAnswer(pa14c_1, sa14c_1_student7);

        StudentAnswer sa14c_2_student7 = createStudentAnswer(student7, pa14c_2, "In a directed graph, edges have a direction, indicating a one-way relationship between vertices. In an undirected graph, edges have no direction, indicating a two-way relationship between vertices.");
        addStudentAnswerToProblemAnswer(pa14c_2, sa14c_2_student7);

        StudentAnswer sa14c_3_student7 = createStudentAnswer(student7, pa14c_3, "A path in a graph is a sequence of vertices connected by edges. A path can be simple (no repeated vertices) or general (vertices can be repeated). The length of a path is the number of edges it contains.");
        addStudentAnswerToProblemAnswer(pa14c_3, sa14c_3_student7);

        StudentAnswer sa14c_4_student7 = createStudentAnswer(student7, pa14c_4, "A cycle in a graph is a path that starts and ends at the same vertex, with no other repeated vertices. Cycles are used to study the connectivity and structure of graphs.");
        addStudentAnswerToProblemAnswer(pa14c_4, sa14c_4_student7);

        StudentAnswer sa14c_5_student7 = createStudentAnswer(student7, pa14c_5, "A connected graph is a graph in which there is a path between every pair of vertices. In a connected graph, all vertices are reachable from any other vertex.");
        addStudentAnswerToProblemAnswer(pa14c_5, sa14c_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa14c_1_student8 = createStudentAnswer(student8, pa14c_1, "A graph is a mathematical structure consisting of a set of vertices (nodes) and a set of edges (lines) that connect pairs of vertices. Graphs are used to model pairwise relations between objects.");
        addStudentAnswerToProblemAnswer(pa14c_1, sa14c_1_student8);

        StudentAnswer sa14c_2_student8 = createStudentAnswer(student8, pa14c_2, "In a directed graph, edges have a direction, indicating a one-way relationship between vertices. In an undirected graph, edges have no direction, indicating a two-way relationship between vertices.");
        addStudentAnswerToProblemAnswer(pa14c_2, sa14c_2_student8);

        StudentAnswer sa14c_3_student8 = createStudentAnswer(student8, pa14c_3, "A path in a graph is a sequence of vertices connected by edges. A path can be simple (no repeated vertices) or general (vertices can be repeated). The length of a path is the number of edges it contains.");
        addStudentAnswerToProblemAnswer(pa14c_3, sa14c_3_student8);

        StudentAnswer sa14c_4_student8 = createStudentAnswer(student8, pa14c_4, "A cycle in a graph is a path that starts and ends at the same vertex, with no other repeated vertices. Cycles are used to study the connectivity and structure of graphs.");
        addStudentAnswerToProblemAnswer(pa14c_4, sa14c_4_student8);

        StudentAnswer sa14c_5_student8 = createStudentAnswer(student8, pa14c_5, "A connected graph is a graph in which there is a path between every pair of vertices. In a connected graph, all vertices are reachable from any other vertex.");
        addStudentAnswerToProblemAnswer(pa14c_5, sa14c_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa14d_1_student7 = createStudentAnswer(student7, pa14d_1, "Combinatorics is the branch of mathematics that deals with counting, arrangement, and combination of objects. It involves studying finite structures and solving problems related to discrete objects.");
        addStudentAnswerToProblemAnswer(pa14d_1, sa14d_1_student7);

        StudentAnswer sa14d_2_student7 = createStudentAnswer(student7, pa14d_2, "A permutation is an arrangement of objects in a specific order. The number of permutations of n distinct objects is given by n!, where ! denotes factorial.");
        addStudentAnswerToProblemAnswer(pa14d_2, sa14d_2_student7);

        StudentAnswer sa14d_3_student7 = createStudentAnswer(student7, pa14d_3, "A combination is a selection of objects without regard to order. The number of combinations of n objects taken r at a time is given by the binomial coefficient C(n, r) = n! / (r!(n - r)!).");
        addStudentAnswerToProblemAnswer(pa14d_3, sa14d_3_student7);

        StudentAnswer sa14d_4_student7 = createStudentAnswer(student7, pa14d_4, "The principle of inclusion-exclusion is a method for counting the number of elements in the union of overlapping sets. It involves adding the sizes of individual sets and subtracting the sizes of their pairwise intersections, and so on.");
        addStudentAnswerToProblemAnswer(pa14d_4, sa14d_4_student7);

        StudentAnswer sa14d_5_student7 = createStudentAnswer(student7, pa14d_5, "A binomial coefficient, denoted C(n, r) or (n choose r), represents the number of ways to choose r objects from a set of n objects without regard to order. It is given by the formula C(n, r) = n! / (r!(n - r)!).");
        addStudentAnswerToProblemAnswer(pa14d_5, sa14d_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa14d_1_student8 = createStudentAnswer(student8, pa14d_1, "Combinatorics is the branch of mathematics that deals with counting, arrangement, and combination of objects. It involves studying finite structures and solving problems related to discrete objects.");
        addStudentAnswerToProblemAnswer(pa14d_1, sa14d_1_student8);

        StudentAnswer sa14d_2_student8 = createStudentAnswer(student8, pa14d_2, "A permutation is an arrangement of objects in a specific order. The number of permutations of n distinct objects is given by n!, where ! denotes factorial.");
        addStudentAnswerToProblemAnswer(pa14d_2, sa14d_2_student8);

        StudentAnswer sa14d_3_student8 = createStudentAnswer(student8, pa14d_3, "A combination is a selection of objects without regard to order. The number of combinations of n objects taken r at a time is given by the binomial coefficient C(n, r) = n! / (r!(n - r)!).");
        addStudentAnswerToProblemAnswer(pa14d_3, sa14d_3_student8);

        StudentAnswer sa14d_4_student8 = createStudentAnswer(student8, pa14d_4, "The principle of inclusion-exclusion is a method for counting the number of elements in the union of overlapping sets. It involves adding the sizes of individual sets and subtracting the sizes of their pairwise intersections, and so on.");
        addStudentAnswerToProblemAnswer(pa14d_4, sa14d_4_student8);

        StudentAnswer sa14d_5_student8 = createStudentAnswer(student8, pa14d_5, "A binomial coefficient, denoted C(n, r) or (n choose r), represents the number of ways to choose r objects from a set of n objects without regard to order. It is given by the formula C(n, r) = n! / (r!(n - r)!).");
        addStudentAnswerToProblemAnswer(pa14d_5, sa14d_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa15a_1_student7 = createStudentAnswer(student7, pa15a_1, "Newton's First Law of Motion, also known as the Law of Inertia, states that an object will remain at rest or in uniform motion in a straight line unless acted upon by an external force.");
        addStudentAnswerToProblemAnswer(pa15a_1, sa15a_1_student7);

        StudentAnswer sa15a_2_student7 = createStudentAnswer(student7, pa15a_2, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. It is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addStudentAnswerToProblemAnswer(pa15a_2, sa15a_2_student7);

        StudentAnswer sa15a_3_student7 = createStudentAnswer(student7, pa15a_3, "Newton's Third Law of Motion states that for every action, there is an equal and opposite reaction. This means that if one body exerts a force on another body, the second body exerts a force of equal magnitude but in the opposite direction on the first body.");
        addStudentAnswerToProblemAnswer(pa15a_3, sa15a_3_student7);

        StudentAnswer sa15a_4_student7 = createStudentAnswer(student7, pa15a_4, "Inertia is the property of an object to resist changes in its state of motion. It is directly related to the mass of the object: the greater the mass, the greater the inertia.");
        addStudentAnswerToProblemAnswer(pa15a_4, sa15a_4_student7);

        StudentAnswer sa15a_5_student7 = createStudentAnswer(student7, pa15a_5, "In a car crash, the passengers inside the car continue moving at the car's speed due to inertia until an external force, such as a seatbelt or airbag, acts to decelerate them and bring them to a stop.");
        addStudentAnswerToProblemAnswer(pa15a_5, sa15a_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa15a_1_student8 = createStudentAnswer(student8, pa15a_1, "Newton's First Law of Motion, also known as the Law of Inertia, states that an object will remain at rest or in uniform motion in a straight line unless acted upon by an external force.");
        addStudentAnswerToProblemAnswer(pa15a_1, sa15a_1_student8);

        StudentAnswer sa15a_2_student8 = createStudentAnswer(student8, pa15a_2, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. It is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addStudentAnswerToProblemAnswer(pa15a_2, sa15a_2_student8);

        StudentAnswer sa15a_3_student8 = createStudentAnswer(student8, pa15a_3, "Newton's Third Law of Motion states that for every action, there is an equal and opposite reaction. This means that if one body exerts a force on another body, the second body exerts a force of equal magnitude but in the opposite direction on the first body.");
        addStudentAnswerToProblemAnswer(pa15a_3, sa15a_3_student8);

        StudentAnswer sa15a_4_student8 = createStudentAnswer(student8, pa15a_4, "Inertia is the property of an object to resist changes in its state of motion. It is directly related to the mass of the object: the greater the mass, the greater the inertia.");
        addStudentAnswerToProblemAnswer(pa15a_4, sa15a_4_student8);

        StudentAnswer sa15a_5_student8 = createStudentAnswer(student8, pa15a_5, "In a car crash, the passengers inside the car continue moving at the car's speed due to inertia until an external force, such as a seatbelt or airbag, acts to decelerate them and bring them to a stop.");
        addStudentAnswerToProblemAnswer(pa15a_5, sa15a_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa15b_1_student7 = createStudentAnswer(student7, pa15b_1, "Kinetic energy is the energy possessed by an object due to its motion. It is calculated using the formula KE = 1/2 mv^2, where m is the mass and v is the velocity of the object.");
        addStudentAnswerToProblemAnswer(pa15b_1, sa15b_1_student7);

        StudentAnswer sa15b_2_student7 = createStudentAnswer(student7, pa15b_2, "Potential energy is the energy stored in an object due to its position or configuration. Examples include gravitational potential energy (U = mgh) and elastic potential energy (U = 1/2 kx^2).");
        addStudentAnswerToProblemAnswer(pa15b_2, sa15b_2_student7);

        StudentAnswer sa15b_3_student7 = createStudentAnswer(student7, pa15b_3, "The work-energy theorem states that the work done on an object is equal to the change in its kinetic energy. It is expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        addStudentAnswerToProblemAnswer(pa15b_3, sa15b_3_student7);

        StudentAnswer sa15b_4_student7 = createStudentAnswer(student7, pa15b_4, "The principle of conservation of energy states that energy cannot be created or destroyed, only transformed from one form to another. The total energy in an isolated system remains constant.");
        addStudentAnswerToProblemAnswer(pa15b_4, sa15b_4_student7);

        StudentAnswer sa15b_5_student7 = createStudentAnswer(student7, pa15b_5, "Power is the rate at which work is done or energy is transferred. It is calculated using the formula P = W/t, where P is power, W is work, and t is time. The unit of power is the watt (W).");
        addStudentAnswerToProblemAnswer(pa15b_5, sa15b_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa15b_1_student8 = createStudentAnswer(student8, pa15b_1, "Kinetic energy is the energy possessed by an object due to its motion. It is calculated using the formula KE = 1/2 mv^2, where m is the mass and v is the velocity of the object.");
        addStudentAnswerToProblemAnswer(pa15b_1, sa15b_1_student8);

        StudentAnswer sa15b_2_student8 = createStudentAnswer(student8, pa15b_2, "Potential energy is the energy stored in an object due to its position or configuration. Examples include gravitational potential energy (U = mgh) and elastic potential energy (U = 1/2 kx^2).");
        addStudentAnswerToProblemAnswer(pa15b_2, sa15b_2_student8);

        StudentAnswer sa15b_3_student8 = createStudentAnswer(student8, pa15b_3, "The work-energy theorem states that the work done on an object is equal to the change in its kinetic energy. It is expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        addStudentAnswerToProblemAnswer(pa15b_3, sa15b_3_student8);

        StudentAnswer sa15b_4_student8 = createStudentAnswer(student8, pa15b_4, "The principle of conservation of energy states that energy cannot be created or destroyed, only transformed from one form to another. The total energy in an isolated system remains constant.");
        addStudentAnswerToProblemAnswer(pa15b_4, sa15b_4_student8);

        StudentAnswer sa15b_5_student8 = createStudentAnswer(student8, pa15b_5, "Power is the rate at which work is done or energy is transferred. It is calculated using the formula P = W/t, where P is power, W is work, and t is time. The unit of power is the watt (W).");
        addStudentAnswerToProblemAnswer(pa15b_5, sa15b_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa15c_1_student7 = createStudentAnswer(student7, pa15c_1, "Linear motion is the movement of an object along a straight line. It can be described by parameters such as displacement, velocity, and acceleration.");
        addStudentAnswerToProblemAnswer(pa15c_1, sa15c_1_student7);

        StudentAnswer sa15c_2_student7 = createStudentAnswer(student7, pa15c_2, "Projectile motion is the curved path that an object follows when it is thrown or propelled near the surface of the Earth. It is influenced by gravity and can be analyzed using the equations of motion.");
        addStudentAnswerToProblemAnswer(pa15c_2, sa15c_2_student7);

        StudentAnswer sa15c_3_student7 = createStudentAnswer(student7, pa15c_3, "Circular motion is the movement of an object along a circular path. It can be characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        addStudentAnswerToProblemAnswer(pa15c_3, sa15c_3_student7);

        StudentAnswer sa15c_4_student7 = createStudentAnswer(student7, pa15c_4, "Velocity is the rate of change of displacement with respect to time. It is a vector quantity with both magnitude and direction. The formula for velocity is v = Δx / Δt, where Δx is the displacement and Δt is the time interval.");
        addStudentAnswerToProblemAnswer(pa15c_4, sa15c_4_student7);

        StudentAnswer sa15c_5_student7 = createStudentAnswer(student7, pa15c_5, "Acceleration is the rate of change of velocity with respect to time. It is a vector quantity and can be positive (speeding up) or negative (slowing down). The formula for acceleration is a = Δv / Δt, where Δv is the change in velocity and Δt is the time interval.");
        addStudentAnswerToProblemAnswer(pa15c_5, sa15c_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa15c_1_student8 = createStudentAnswer(student8, pa15c_1, "Linear motion is the movement of an object along a straight line. It can be described by parameters such as displacement, velocity, and acceleration.");
        addStudentAnswerToProblemAnswer(pa15c_1, sa15c_1_student8);

        StudentAnswer sa15c_2_student8 = createStudentAnswer(student8, pa15c_2, "Projectile motion is the curved path that an object follows when it is thrown or propelled near the surface of the Earth. It is influenced by gravity and can be analyzed using the equations of motion.");
        addStudentAnswerToProblemAnswer(pa15c_2, sa15c_2_student8);

        StudentAnswer sa15c_3_student8 = createStudentAnswer(student8, pa15c_3, "Circular motion is the movement of an object along a circular path. It can be characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        addStudentAnswerToProblemAnswer(pa15c_3, sa15c_3_student8);

        StudentAnswer sa15c_4_student8 = createStudentAnswer(student8, pa15c_4, "Velocity is the rate of change of displacement with respect to time. It is a vector quantity with both magnitude and direction. The formula for velocity is v = Δx / Δt, where Δx is the displacement and Δt is the time interval.");
        addStudentAnswerToProblemAnswer(pa15c_4, sa15c_4_student8);

        StudentAnswer sa15c_5_student8 = createStudentAnswer(student8, pa15c_5, "Acceleration is the rate of change of velocity with respect to time. It is a vector quantity and can be positive (speeding up) or negative (slowing down). The formula for acceleration is a = Δv / Δt, where Δv is the change in velocity and Δt is the time interval.");
        addStudentAnswerToProblemAnswer(pa15c_5, sa15c_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa16a_1_student7 = createStudentAnswer(student7, pa16a_1, "The three main subatomic particles in an atom are protons, neutrons, and electrons. Protons and neutrons are located in the nucleus, while electrons orbit the nucleus.");
        addStudentAnswerToProblemAnswer(pa16a_1, sa16a_1_student7);

        StudentAnswer sa16a_2_student7 = createStudentAnswer(student7, pa16a_2, "The atomic number of an element is the number of protons in the nucleus of an atom. It determines the identity of the element and its position in the periodic table.");
        addStudentAnswerToProblemAnswer(pa16a_2, sa16a_2_student7);

        StudentAnswer sa16a_3_student7 = createStudentAnswer(student7, pa16a_3, "The mass number of an atom is the total number of protons and neutrons in its nucleus. It is represented as A and can be calculated as A = Z + N, where Z is the atomic number and N is the number of neutrons.");
        addStudentAnswerToProblemAnswer(pa16a_3, sa16a_3_student7);

        StudentAnswer sa16a_4_student7 = createStudentAnswer(student7, pa16a_4, "Isotopes are variants of a given chemical element that have the same number of protons but different numbers of neutrons. This results in different mass numbers for the isotopes.");
        addStudentAnswerToProblemAnswer(pa16a_4, sa16a_4_student7);

        StudentAnswer sa16a_5_student7 = createStudentAnswer(student7, pa16a_5, "An electron configuration is the distribution of electrons in an atom's orbitals. It follows the Aufbau principle, Hund's rule, and the Pauli exclusion principle to determine the most stable arrangement of electrons.");
        addStudentAnswerToProblemAnswer(pa16a_5, sa16a_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa16a_1_student8 = createStudentAnswer(student8, pa16a_1, "The three main subatomic particles in an atom are protons, neutrons, and electrons. Protons and neutrons are located in the nucleus, while electrons orbit the nucleus.");
        addStudentAnswerToProblemAnswer(pa16a_1, sa16a_1_student8);

        StudentAnswer sa16a_2_student8 = createStudentAnswer(student8, pa16a_2, "The atomic number of an element is the number of protons in the nucleus of an atom. It determines the identity of the element and its position in the periodic table.");
        addStudentAnswerToProblemAnswer(pa16a_2, sa16a_2_student8);

        StudentAnswer sa16a_3_student8 = createStudentAnswer(student8, pa16a_3, "The mass number of an atom is the total number of protons and neutrons in its nucleus. It is represented as A and can be calculated as A = Z + N, where Z is the atomic number and N is the number of neutrons.");
        addStudentAnswerToProblemAnswer(pa16a_3, sa16a_3_student8);

        StudentAnswer sa16a_4_student8 = createStudentAnswer(student8, pa16a_4, "Isotopes are variants of a given chemical element that have the same number of protons but different numbers of neutrons. This results in different mass numbers for the isotopes.");
        addStudentAnswerToProblemAnswer(pa16a_4, sa16a_4_student8);

        StudentAnswer sa16a_5_student8 = createStudentAnswer(student8, pa16a_5, "An electron configuration is the distribution of electrons in an atom's orbitals. It follows the Aufbau principle, Hund's rule, and the Pauli exclusion principle to determine the most stable arrangement of electrons.");
        addStudentAnswerToProblemAnswer(pa16a_5, sa16a_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa16b_1_student7 = createStudentAnswer(student7, pa16b_1, "An ionic bond is a type of chemical bond formed through the electrostatic attraction between oppositely charged ions. It typically occurs between a metal and a non-metal.");
        addStudentAnswerToProblemAnswer(pa16b_1, sa16b_1_student7);

        StudentAnswer sa16b_2_student7 = createStudentAnswer(student7, pa16b_2, "A covalent bond is a type of chemical bond where two atoms share one or more pairs of electrons. It usually occurs between non-metal atoms.");
        addStudentAnswerToProblemAnswer(pa16b_2, sa16b_2_student7);

        StudentAnswer sa16b_3_student7 = createStudentAnswer(student7, pa16b_3, "A metallic bond is a type of chemical bond found in metals, where electrons are shared and move freely among a lattice of metal atoms. This creates a 'sea of electrons' that contributes to the conductivity and malleability of metals.");
        addStudentAnswerToProblemAnswer(pa16b_3, sa16b_3_student7);

        StudentAnswer sa16b_4_student7 = createStudentAnswer(student7, pa16b_4, "Electronegativity is a measure of an atom's ability to attract and hold onto electrons in a chemical bond. Elements with high electronegativity tend to attract electrons more strongly.");
        addStudentAnswerToProblemAnswer(pa16b_4, sa16b_4_student7);

        StudentAnswer sa16b_5_student7 = createStudentAnswer(student7, pa16b_5, "A polar covalent bond is a type of covalent bond in which the electrons are not shared equally between the atoms. This results in a partial positive charge on one atom and a partial negative charge on the other.");
        addStudentAnswerToProblemAnswer(pa16b_5, sa16b_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa16b_1_student8 = createStudentAnswer(student8, pa16b_1, "An ionic bond is a type of chemical bond formed through the electrostatic attraction between oppositely charged ions. It typically occurs between a metal and a non-metal.");
        addStudentAnswerToProblemAnswer(pa16b_1, sa16b_1_student8);

        StudentAnswer sa16b_2_student8 = createStudentAnswer(student8, pa16b_2, "A covalent bond is a type of chemical bond where two atoms share one or more pairs of electrons. It usually occurs between non-metal atoms.");
        addStudentAnswerToProblemAnswer(pa16b_2, sa16b_2_student8);

        StudentAnswer sa16b_3_student8 = createStudentAnswer(student8, pa16b_3, "A metallic bond is a type of chemical bond found in metals, where electrons are shared and move freely among a lattice of metal atoms. This creates a 'sea of electrons' that contributes to the conductivity and malleability of metals.");
        addStudentAnswerToProblemAnswer(pa16b_3, sa16b_3_student8);

        StudentAnswer sa16b_4_student8 = createStudentAnswer(student8, pa16b_4, "Electronegativity is a measure of an atom's ability to attract and hold onto electrons in a chemical bond. Elements with high electronegativity tend to attract electrons more strongly.");
        addStudentAnswerToProblemAnswer(pa16b_4, sa16b_4_student8);

        StudentAnswer sa16b_5_student8 = createStudentAnswer(student8, pa16b_5, "A polar covalent bond is a type of covalent bond in which the electrons are not shared equally between the atoms. This results in a partial positive charge on one atom and a partial negative charge on the other.");
        addStudentAnswerToProblemAnswer(pa16b_5, sa16b_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa16c_1_student7 = createStudentAnswer(student7, pa16c_1, "Chemical reactions are processes in which one or more substances (reactants) are converted into one or more different substances (products). They involve the breaking and forming of chemical bonds.");
        addStudentAnswerToProblemAnswer(pa16c_1, sa16c_1_student7);

        StudentAnswer sa16c_2_student7 = createStudentAnswer(student7, pa16c_2, "The main types of chemical reactions include synthesis (combination), decomposition, single displacement (substitution), double displacement (metathesis), and combustion reactions.");
        addStudentAnswerToProblemAnswer(pa16c_2, sa16c_2_student7);

        StudentAnswer sa16c_3_student7 = createStudentAnswer(student7, pa16c_3, "A synthesis reaction is a type of chemical reaction in which two or more reactants combine to form a single product. It is represented by the general equation: A + B → AB.");
        addStudentAnswerToProblemAnswer(pa16c_3, sa16c_3_student7);

        StudentAnswer sa16c_4_student7 = createStudentAnswer(student7, pa16c_4, "A decomposition reaction is a type of chemical reaction in which a single compound breaks down into two or more simpler products. It is represented by the general equation: AB → A + B.");
        addStudentAnswerToProblemAnswer(pa16c_4, sa16c_4_student7);

        StudentAnswer sa16c_5_student7 = createStudentAnswer(student7, pa16c_5, "A single displacement reaction, also known as a substitution reaction, is a type of chemical reaction in which one element replaces another in a compound. It is represented by the general equation: A + BC → AC + B.");
        addStudentAnswerToProblemAnswer(pa16c_5, sa16c_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa16c_1_student8 = createStudentAnswer(student8, pa16c_1, "Chemical reactions are processes in which one or more substances (reactants) are converted into one or more different substances (products). They involve the breaking and forming of chemical bonds.");
        addStudentAnswerToProblemAnswer(pa16c_1, sa16c_1_student8);

        StudentAnswer sa16c_2_student8 = createStudentAnswer(student8, pa16c_2, "The main types of chemical reactions include synthesis (combination), decomposition, single displacement (substitution), double displacement (metathesis), and combustion reactions.");
        addStudentAnswerToProblemAnswer(pa16c_2, sa16c_2_student8);

        StudentAnswer sa16c_3_student8 = createStudentAnswer(student8, pa16c_3, "A synthesis reaction is a type of chemical reaction in which two or more reactants combine to form a single product. It is represented by the general equation: A + B → AB.");
        addStudentAnswerToProblemAnswer(pa16c_3, sa16c_3_student8);

        StudentAnswer sa16c_4_student8 = createStudentAnswer(student8, pa16c_4, "A decomposition reaction is a type of chemical reaction in which a single compound breaks down into two or more simpler products. It is represented by the general equation: AB → A + B.");
        addStudentAnswerToProblemAnswer(pa16c_4, sa16c_4_student8);

        StudentAnswer sa16c_5_student8 = createStudentAnswer(student8, pa16c_5, "A single displacement reaction, also known as a substitution reaction, is a type of chemical reaction in which one element replaces another in a compound. It is represented by the general equation: A + BC → AC + B.");
        addStudentAnswerToProblemAnswer(pa16c_5, sa16c_5_student8);


        // Creating submission for student7 with student answers for 13a
        Submission submission13a_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13a_1_student7, sa13a_2_student7, sa13a_3_student7, sa13a_4_student7, sa13a_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13a_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13a_7);
        }

// Creating submission for student8 with student answers for 13a
        Submission submission13a_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13a_1_student8, sa13a_2_student8, sa13a_3_student8, sa13a_4_student8, sa13a_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13a_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13a_8);
        }
// Creating submission for student7 with student answers for 13b
        Submission submission13b_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13b_1_student7, sa13b_2_student7, sa13b_3_student7, sa13b_4_student7, sa13b_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13b_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13b_7);
        }

// Creating submission for student8 with student answers for 13b
        Submission submission13b_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13b_1_student8, sa13b_2_student8, sa13b_3_student8, sa13b_4_student8, sa13b_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13b_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13b_8);
        }
// Creating submission for student7 with student answers for 13c
        Submission submission13c_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13c_1_student7, sa13c_2_student7, sa13c_3_student7, sa13c_4_student7, sa13c_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13c_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13c_7);
        }

// Creating submission for student8 with student answers for 13c
        Submission submission13c_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13c_1_student8, sa13c_2_student8, sa13c_3_student8, sa13c_4_student8, sa13c_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13c_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13c_8);
        }
// Creating submission for student7 with student answers for 13d
        Submission submission13d_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13d_1_student7, sa13d_2_student7, sa13d_3_student7, sa13d_4_student7, sa13d_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13d_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13d_7);
        }

// Creating submission for student8 with student answers for 13d
        Submission submission13d_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13d_1_student8, sa13d_2_student8, sa13d_3_student8, sa13d_4_student8, sa13d_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13d_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13d_8);
        }
// Creating submission for student7 with student answers for 14a
        Submission submission14a_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14a_1_student7, sa14a_2_student7, sa14a_3_student7, sa14a_4_student7, sa14a_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14a_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14a_7);
        }

// Creating submission for student8 with student answers for 14a
        Submission submission14a_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14a_1_student8, sa14a_2_student8, sa14a_3_student8, sa14a_4_student8, sa14a_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14a_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14a_8);
        }
// Creating submission for student7 with student answers for 14b
        Submission submission14b_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14b_1_student7, sa14b_2_student7, sa14b_3_student7, sa14b_4_student7, sa14b_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14b_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14b_7);
        }

// Creating submission for student8 with student answers for 14b
        Submission submission14b_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14b_1_student8, sa14b_2_student8, sa14b_3_student8, sa14b_4_student8, sa14b_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14b_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14b_8);
        }
// Creating submission for student7 with student answers for 14c
        Submission submission14c_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14c_1_student7, sa14c_2_student7, sa14c_3_student7, sa14c_4_student7, sa14c_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14c_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14c_7);
        }

// Creating submission for student8 with student answers for 14c
        Submission submission14c_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14c_1_student8, sa14c_2_student8, sa14c_3_student8, sa14c_4_student8, sa14c_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14c_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14c_8);
        }
// Creating submission for student7 with student answers for 14d
        Submission submission14d_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14d_1_student7, sa14d_2_student7, sa14d_3_student7, sa14d_4_student7, sa14d_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14d_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14d_7);
        }

// Creating submission for student8 with student answers for 14d
        Submission submission14d_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14d_1_student8, sa14d_2_student8, sa14d_3_student8, sa14d_4_student8, sa14d_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14d_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14d_8);
        }
// Creating submission for student7 with student answers for 15a
        Submission submission15a_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15a_1_student7, sa15a_2_student7, sa15a_3_student7, sa15a_4_student7, sa15a_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15a_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15a_7);
        }

// Creating submission for student8 with student answers for 15a
        Submission submission15a_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15a_1_student8, sa15a_2_student8, sa15a_3_student8, sa15a_4_student8, sa15a_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15a_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15a_8);
        }
// Creating submission for student7 with student answers for 15b
        Submission submission15b_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15b_1_student7, sa15b_2_student7, sa15b_3_student7, sa15b_4_student7, sa15b_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15b_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15b_7);
        }

// Creating submission for student8 with student answers for 15b
        Submission submission15b_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15b_1_student8, sa15b_2_student8, sa15b_3_student8, sa15b_4_student8, sa15b_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15b_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15b_8);
        }
// Creating submission for student7 with student answers for 15c
        Submission submission15c_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15c_1_student7, sa15c_2_student7, sa15c_3_student7, sa15c_4_student7, sa15c_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15c_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15c_7);
        }

// Creating submission for student8 with student answers for 15c
        Submission submission15c_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15c_1_student8, sa15c_2_student8, sa15c_3_student8, sa15c_4_student8, sa15c_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15c_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15c_8);
        }
// Creating submission for student7 with student answers for 16a
        Submission submission16a_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16a_1_student7, sa16a_2_student7, sa16a_3_student7, sa16a_4_student7, sa16a_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16a_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16a_7);
        }

// Creating submission for student8 with student answers for 16a
        Submission submission16a_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16a_1_student8, sa16a_2_student8, sa16a_3_student8, sa16a_4_student8, sa16a_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16a_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16a_8);
        }
// Creating submission for student7 with student answers for 16b
        Submission submission16b_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16b_1_student7, sa16b_2_student7, sa16b_3_student7, sa16b_4_student7, sa16b_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16b_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16b_7);
        }

// Creating submission for student8 with student answers for 16b
        Submission submission16b_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16b_1_student8, sa16b_2_student8, sa16b_3_student8, sa16b_4_student8, sa16b_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16b_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16b_8);
        }
// Creating submission for student7 with student answers for 16c
        Submission submission16c_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16c_1_student7, sa16c_2_student7, sa16c_3_student7, sa16c_4_student7, sa16c_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16c_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16c_7);
        }

// Creating submission for student8 with student answers for 16c
        Submission submission16c_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16c_1_student8, sa16c_2_student8, sa16c_3_student8, sa16c_4_student8, sa16c_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16c_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16c_8);
        }

        Grade grade13a_7 = createGrade(87.6, student7, faculty3, course13, submission13a_7);
        Grade grade13a_8 = createGrade(88.3, student8, faculty3, course13, submission13a_8);
        Grade grade13b_7 = createGrade(86.4, student7, faculty3, course13, submission13b_7);
        Grade grade13b_8 = createGrade(89.2, student8, faculty3, course13, submission13b_8);
        Grade grade13c_7 = createGrade(88.7, student7, faculty3, course13, submission13c_7);
        Grade grade13c_8 = createGrade(86.9, student8, faculty3, course13, submission13c_8);
        Grade grade13d_7 = createGrade(87.3, student7, faculty3, course13, submission13d_7);
        Grade grade13d_8 = createGrade(85.8, student8, faculty3, course13, submission13d_8);

        Grade grade14a_7 = createGrade(88.3, student7, faculty4, course14, submission14a_7);
        Grade grade14a_8 = createGrade(86.9, student8, faculty4, course14, submission14a_8);
        Grade grade14b_7 = createGrade(87.4, student7, faculty4, course14, submission14b_7);
        Grade grade14b_8 = createGrade(85.7, student8, faculty4, course14, submission14b_8);
        Grade grade14c_7 = createGrade(89.1, student7, faculty4, course14, submission14c_7);
        Grade grade14c_8 = createGrade(84.3, student8, faculty4, course14, submission14c_8);
        Grade grade14d_7 = createGrade(88.7, student7, faculty4, course14, submission14d_7);
        Grade grade14d_8 = createGrade(87.8, student8, faculty4, course14, submission14d_8);

        Grade grade15a_7 = createGrade(88.3, student7, faculty5, course15, submission15a_7);
        Grade grade15a_8 = createGrade(86.4, student8, faculty5, course15, submission15a_8);
        Grade grade15b_7 = createGrade(89.1, student7, faculty5, course15, submission15b_7);
        Grade grade15b_8 = createGrade(87.8, student8, faculty5, course15, submission15b_8);
        Grade grade15c_7 = createGrade(88.6, student7, faculty5, course15, submission15c_7);
        Grade grade15c_8 = createGrade(85.7, student8, faculty5, course15, submission15c_8);

        Grade grade16a_7 = createGrade(87.6, student7, faculty1, course16, submission16a_7);
        Grade grade16a_8 = createGrade(86.3, student8, faculty1, course16, submission16a_8);
        Grade grade16b_7 = createGrade(88.9, student7, faculty1, course16, submission16b_7);
        Grade grade16b_8 = createGrade(87.1, student8, faculty1, course16, submission16b_8);
        Grade grade16c_7 = createGrade(85.8, student7, faculty1, course16, submission16c_7);
        Grade grade16c_8 = createGrade(88.2, student8, faculty1, course16, submission16c_8);

        CourseGrade courseGrade13a_7 = createCourseGrade(student7, course13, 87.5, List.of(grade13a_7, grade13b_7, grade13c_7, grade13d_7));
        CourseGrade courseGrade13a_8 = createCourseGrade(student8, course13, 88.05, List.of(grade13a_8, grade13b_8, grade13c_8, grade13d_8));

        CourseGrade courseGrade14a_7 = createCourseGrade(student7, course14, 88.375, List.of(grade14a_7, grade14b_7, grade14c_7, grade14d_7));
        CourseGrade courseGrade14a_8 = createCourseGrade(student8, course14, 86.175, List.of(grade14a_8, grade14b_8, grade14c_8, grade14d_8));

        CourseGrade courseGrade15a_7 = createCourseGrade(student7, course15, 88.667, List.of(grade15a_7, grade15b_7, grade15c_7));
        CourseGrade courseGrade15a_8 = createCourseGrade(student8, course15, 86.633, List.of(grade15a_8, grade15b_8, grade15c_8));

        CourseGrade courseGrade16a_7 = createCourseGrade(student7, course16, 87.433, List.of(grade16a_7, grade16b_7, grade16c_7));
        CourseGrade courseGrade16a_8 = createCourseGrade(student8, course16, 87.2, List.of(grade16a_8, grade16b_8, grade16c_8));

        Feedback feedback13a_7 = createFeedback("Excellent work, student7!", submission13a_7);
        Feedback feedback13a_8 = createFeedback("Great effort, student8!", submission13a_8);

        Feedback feedback13b_7 = createFeedback("Impressive answers, student7.", submission13b_7);
        Feedback feedback13b_8 = createFeedback("Nice job, student8.", submission13b_8);

        Feedback feedback13c_7 = createFeedback("Well done on the answers, student7.", submission13c_7);
        Feedback feedback13c_8 = createFeedback("Good work, student8!", submission13c_8);

        Feedback feedback13d_7 = createFeedback("Great effort, student7!", submission13d_7);
        Feedback feedback13d_8 = createFeedback("Well done, student8!", submission13d_8);

        Feedback feedback14a_7 = createFeedback("Great job on the submission, student7!", submission14a_7);
        Feedback feedback14a_8 = createFeedback("Well done, student8!", submission14a_8);

        Feedback feedback14b_7 = createFeedback("Excellent effort, student7.", submission14b_7);
        Feedback feedback14b_8 = createFeedback("Nice work, student8.", submission14b_8);

        Feedback feedback14c_7 = createFeedback("Good answers, student7.", submission14c_7);
        Feedback feedback14c_8 = createFeedback("Strong performance, student8.", submission14c_8);

        Feedback feedback14d_7 = createFeedback("Well written, student7.", submission14d_7);
        Feedback feedback14d_8 = createFeedback("Great job, student8.", submission14d_8);

        Feedback feedback15a_7 = createFeedback("Great job on the submission, student7!", submission15a_7);
        Feedback feedback15a_8 = createFeedback("Well done, student8!", submission15a_8);

        Feedback feedback15b_7 = createFeedback("Excellent effort, student7.", submission15b_7);
        Feedback feedback15b_8 = createFeedback("Nice work, student8.", submission15b_8);

        Feedback feedback15c_7 = createFeedback("Good answers, student7.", submission15c_7);
        Feedback feedback15c_8 = createFeedback("Strong performance, student8.", submission15c_8);

        Feedback feedback16a_7 = createFeedback("Great job on the submission, student7!", submission16a_7);
        Feedback feedback16a_8 = createFeedback("Well done, student8!", submission16a_8);

        Feedback feedback16b_7 = createFeedback("Excellent effort, student7.", submission16b_7);
        Feedback feedback16b_8 = createFeedback("Nice work, student8.", submission16b_8);

        Feedback feedback16c_7 = createFeedback("Good answers, student7.", submission16c_7);
        Feedback feedback16c_8 = createFeedback("Strong performance, student8.", submission16c_8);

        course13.setGrades(List.of(grade13a_7, grade13a_8, grade13b_7, grade13b_8, grade13c_7, grade13c_8, grade13d_7, grade13d_8));
        course14.setGrades(List.of(grade14a_7, grade14a_8, grade14b_7, grade14b_8, grade14c_7, grade14c_8, grade14d_7, grade14d_8));
        course15.setGrades(List.of(grade15a_7, grade15a_8, grade15b_7, grade15b_8, grade15c_7, grade15c_8));
        course16.setGrades(List.of(grade16a_7, grade16a_8, grade16b_7, grade16b_8, grade16c_7, grade16c_8));

        createFacultyWithTest(faculty3, List.of(grade13a_7, grade13a_8, grade13b_7, grade13b_8, grade13c_7, grade13c_8, grade13d_7, grade13d_8), List.of(test13a, test13b, test13c, test13d));
        createFacultyWithTest(faculty4, List.of(grade14a_7, grade14a_8, grade14b_7, grade14b_8, grade14c_7, grade14c_8, grade14d_7, grade14d_8), List.of(test14a, test14b, test14c, test14d));
        createFacultyWithTest(faculty5, List.of(grade15a_7, grade15a_8, grade15b_7, grade15b_8, grade15c_7, grade15c_8), List.of(test15a, test15b, test15c));
        createFacultyWithTest(faculty1, List.of(grade16a_7, grade16a_8, grade16b_7, grade16b_8, grade16c_7, grade16c_8), List.of(test16a, test16b, test16c));


        course13.setCourseGrades(List.of(courseGrade13a_7, courseGrade13a_8));
        course14.setCourseGrades(List.of(courseGrade14a_7, courseGrade14a_8));
        course15.setCourseGrades(List.of(courseGrade15a_7, courseGrade15a_8));
        course16.setCourseGrades(List.of(courseGrade16a_7, courseGrade16a_8));

        linkSubmissionDetails(submission13a_7, student7, grade13a_7, feedback13a_7, List.of(sa13a_1_student7, sa13a_2_student7, sa13a_3_student7, sa13a_4_student7, sa13a_5_student7));
        linkSubmissionDetails(submission13a_8, student8, grade13a_8, feedback13a_8, List.of(sa13a_1_student8, sa13a_2_student8, sa13a_3_student8, sa13a_4_student8, sa13a_5_student8));
        linkSubmissionDetails(submission13b_7, student7, grade13b_7, feedback13b_7, List.of(sa13b_1_student7, sa13b_2_student7, sa13b_3_student7, sa13b_4_student7, sa13b_5_student7));
        linkSubmissionDetails(submission13b_8, student8, grade13b_8, feedback13b_8, List.of(sa13b_1_student8, sa13b_2_student8, sa13b_3_student8, sa13b_4_student8, sa13b_5_student8));
        linkSubmissionDetails(submission13c_7, student7, grade13c_7, feedback13c_7, List.of(sa13c_1_student7, sa13c_2_student7, sa13c_3_student7, sa13c_4_student7, sa13c_5_student7));
        linkSubmissionDetails(submission13c_8, student8, grade13c_8, feedback13c_8, List.of(sa13c_1_student8, sa13c_2_student8, sa13c_3_student8, sa13c_4_student8, sa13c_5_student8));
        linkSubmissionDetails(submission13d_7, student7, grade13d_7, feedback13d_7, List.of(sa13d_1_student7, sa13d_2_student7, sa13d_3_student7, sa13d_4_student7, sa13d_5_student7));
        linkSubmissionDetails(submission13d_8, student8, grade13d_8, feedback13d_8, List.of(sa13d_1_student8, sa13d_2_student8, sa13d_3_student8, sa13d_4_student8, sa13d_5_student8));

        linkSubmissionDetails(submission14a_7, student7, grade14a_7, feedback14a_7, List.of(sa14a_1_student7, sa14a_2_student7, sa14a_3_student7, sa14a_4_student7, sa14a_5_student7));
        linkSubmissionDetails(submission14a_8, student8, grade14a_8, feedback14a_8, List.of(sa14a_1_student8, sa14a_2_student8, sa14a_3_student8, sa14a_4_student8, sa14a_5_student8));
        linkSubmissionDetails(submission14b_7, student7, grade14b_7, feedback14b_7, List.of(sa14b_1_student7, sa14b_2_student7, sa14b_3_student7, sa14b_4_student7, sa14b_5_student7));
        linkSubmissionDetails(submission14b_8, student8, grade14b_8, feedback14b_8, List.of(sa14b_1_student8, sa14b_2_student8, sa14b_3_student8, sa14b_4_student8, sa14b_5_student8));
        linkSubmissionDetails(submission14c_7, student7, grade14c_7, feedback14c_7, List.of(sa14c_1_student7, sa14c_2_student7, sa14c_3_student7, sa14c_4_student7, sa14c_5_student7));
        linkSubmissionDetails(submission14c_8, student8, grade14c_8, feedback14c_8, List.of(sa14c_1_student8, sa14c_2_student8, sa14c_3_student8, sa14c_4_student8, sa14c_5_student8));
        linkSubmissionDetails(submission14d_7, student7, grade14d_7, feedback14d_7, List.of(sa14d_1_student7, sa14d_2_student7, sa14d_3_student7, sa14d_4_student7, sa14d_5_student7));
        linkSubmissionDetails(submission14d_8, student8, grade14d_8, feedback14d_8, List.of(sa14d_1_student8, sa14d_2_student8, sa14d_3_student8, sa14d_4_student8, sa14d_5_student8));

        linkSubmissionDetails(submission15a_7, student7, grade15a_7, feedback15a_7, List.of(sa15a_1_student7, sa15a_2_student7, sa15a_3_student7, sa15a_4_student7, sa15a_5_student7));
        linkSubmissionDetails(submission15a_8, student8, grade15a_8, feedback15a_8, List.of(sa15a_1_student8, sa15a_2_student8, sa15a_3_student8, sa15a_4_student8, sa15a_5_student8));
        linkSubmissionDetails(submission15b_7, student7, grade15b_7, feedback15b_7, List.of(sa15b_1_student7, sa15b_2_student7, sa15b_3_student7, sa15b_4_student7, sa15b_5_student7));
        linkSubmissionDetails(submission15b_8, student8, grade15b_8, feedback15b_8, List.of(sa15b_1_student8, sa15b_2_student8, sa15b_3_student8, sa15b_4_student8, sa15b_5_student8));
        linkSubmissionDetails(submission15c_7, student7, grade15c_7, feedback15c_7, List.of(sa15c_1_student7, sa15c_2_student7, sa15c_3_student7, sa15c_4_student7, sa15c_5_student7));
        linkSubmissionDetails(submission15c_8, student8, grade15c_8, feedback15c_8, List.of(sa15c_1_student8, sa15c_2_student8, sa15c_3_student8, sa15c_4_student8, sa15c_5_student8));

        linkSubmissionDetails(submission16a_7, student7, grade16a_7, feedback16a_7, List.of(sa16a_1_student7, sa16a_2_student7, sa16a_3_student7, sa16a_4_student7, sa16a_5_student7));
        linkSubmissionDetails(submission16a_8, student8, grade16a_8, feedback16a_8, List.of(sa16a_1_student8, sa16a_2_student8, sa16a_3_student8, sa16a_4_student8, sa16a_5_student8));
        linkSubmissionDetails(submission16b_7, student7, grade16b_7, feedback16b_7, List.of(sa16b_1_student7, sa16b_2_student7, sa16b_3_student7, sa16b_4_student7, sa16b_5_student7));
        linkSubmissionDetails(submission16b_8, student8, grade16b_8, feedback16b_8, List.of(sa16b_1_student8, sa16b_2_student8, sa16b_3_student8, sa16b_4_student8, sa16b_5_student8));
        linkSubmissionDetails(submission16c_7, student7, grade16c_7, feedback16c_7, List.of(sa16c_1_student7, sa16c_2_student7, sa16c_3_student7, sa16c_4_student7, sa16c_5_student7));
        linkSubmissionDetails(submission16c_8, student8, grade16c_8, feedback16c_8, List.of(sa16c_1_student8, sa16c_2_student8, sa16c_3_student8, sa16c_4_student8, sa16c_5_student8));

        syllabus13.setTests(List.of(test13a, test13b, test13c, test13d));
        syllabus14.setTests(List.of(test14a, test14b, test14c, test14d));
        syllabus15.setTests(List.of(test15a, test15b, test15c));
        syllabus16.setTests(List.of(test16a, test16b, test16c));

        studentTest(student7, List.of(grade13a_7, grade13b_7, grade13c_7, grade13d_7, grade14a_7, grade14b_7, grade14c_7, grade14d_7, grade15a_7, grade15b_7, grade15c_7, grade16a_7, grade16b_7, grade16c_7), List.of(courseGrade13a_7, courseGrade14a_7, courseGrade15a_7, courseGrade16a_7), List.of(test13a, test13b, test13c, test13d, test14a, test14b, test14c, test14d, test15a, test15b, test15c, test16a, test16b, test16c));
        studentTest(student8, List.of(grade13a_8, grade13b_8, grade13c_8, grade13d_8, grade14a_8, grade14b_8, grade14c_8, grade14d_8, grade15a_8, grade15b_8, grade15c_8, grade16a_8, grade16b_8, grade16c_8), List.of(courseGrade13a_8, courseGrade14a_8, courseGrade15a_8, courseGrade16a_8), List.of(test13a, test13b, test13c, test13d, test14a, test14b, test14c, test14d, test15a, test15b, test15c, test16a, test16b, test16c));

    }
}
