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
import static com.project.education_app.Seeder.*;
import static com.project.education_app.Seeder.createGrade;

@Component
@Data
public class Assignment17to20Seeder implements CommandLineRunner {
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

        // Output for confirmation
        System.out.println("Assignment for 'Reactions' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment17_1 = createAssignment("Cell Structure Assignment", faculty2, Date.from(LocalDate.of(2029, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        addStudentToAssignment(assignment17_1, student9);
        addStudentToAssignment(assignment17_1, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_17_1_1 = createProblemAnswer("What is the cell membrane?", "The cell membrane is a thin, flexible barrier that surrounds the cell, regulating what enters and exits the cell. It is composed of a lipid bilayer with embedded proteins.");
        addAssignmentToProblemAnswer(pa_17_1_1, assignment17_1);
        addProblemAnswerToAssignment(assignment17_1, pa_17_1_1);

        ProblemAnswer pa_17_1_2 = createProblemAnswer("What is the function of the nucleus?", "The nucleus is the control center of the cell, containing the cell's genetic material (DNA). It regulates gene expression and controls cellular activities such as growth, metabolism, and reproduction.");
        addAssignmentToProblemAnswer(pa_17_1_2, assignment17_1);
        addProblemAnswerToAssignment(assignment17_1, pa_17_1_2);

        ProblemAnswer pa_17_1_3 = createProblemAnswer("What are organelles?", "Organelles are specialized structures within a cell that perform specific functions. Examples include the mitochondria (energy production), endoplasmic reticulum (protein and lipid synthesis), and Golgi apparatus (modifying, sorting, and packaging proteins).");
        addAssignmentToProblemAnswer(pa_17_1_3, assignment17_1);
        addProblemAnswerToAssignment(assignment17_1, pa_17_1_3);

        ProblemAnswer pa_17_1_4 = createProblemAnswer("What are the differences between prokaryotic and eukaryotic cells?", "Prokaryotic cells lack a true nucleus and membrane-bound organelles, while eukaryotic cells have a defined nucleus and various membrane-bound organelles. Prokaryotes include bacteria and archaea, while eukaryotes include plants, animals, fungi, and protists.");
        addAssignmentToProblemAnswer(pa_17_1_4, assignment17_1);
        addProblemAnswerToAssignment(assignment17_1, pa_17_1_4);

        ProblemAnswer pa_17_1_5 = createProblemAnswer("What is the role of mitochondria?", "Mitochondria are the powerhouse of the cell, responsible for producing energy through cellular respiration. They convert glucose and oxygen into ATP (adenosine triphosphate), the cell's main energy currency.");
        addAssignmentToProblemAnswer(pa_17_1_5, assignment17_1);
        addProblemAnswerToAssignment(assignment17_1, pa_17_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Cell Structure' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment17_2 = createAssignment("Genetics Assignment", faculty2, Date.from(LocalDate.of(2029, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        addStudentToAssignment(assignment17_2, student9);
        addStudentToAssignment(assignment17_2, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_17_2_1 = createProblemAnswer("What is genetics?", "Genetics is the study of heredity and the variation of inherited characteristics. It examines how traits are passed from one generation to the next through genes.");
        addAssignmentToProblemAnswer(pa_17_2_1, assignment17_2);
        addProblemAnswerToAssignment(assignment17_2, pa_17_2_1);

        ProblemAnswer pa_17_2_2 = createProblemAnswer("What are Mendelian genetics?", "Mendelian genetics is the study of the principles of inheritance discovered by Gregor Mendel. It includes the laws of segregation and independent assortment, which explain how traits are inherited through dominant and recessive alleles.");
        addAssignmentToProblemAnswer(pa_17_2_2, assignment17_2);
        addProblemAnswerToAssignment(assignment17_2, pa_17_2_2);

        ProblemAnswer pa_17_2_3 = createProblemAnswer("What is DNA?", "DNA (deoxyribonucleic acid) is the molecule that carries genetic information in living organisms. It is composed of two strands forming a double helix, with each strand made up of nucleotides containing a sugar, a phosphate group, and a nitrogenous base.");
        addAssignmentToProblemAnswer(pa_17_2_3, assignment17_2);
        addProblemAnswerToAssignment(assignment17_2, pa_17_2_3);

        ProblemAnswer pa_17_2_4 = createProblemAnswer("What is the structure of a gene?", "A gene is a segment of DNA that contains the instructions for building a specific protein. It includes coding regions called exons and non-coding regions called introns, as well as regulatory sequences that control gene expression.");
        addAssignmentToProblemAnswer(pa_17_2_4, assignment17_2);
        addProblemAnswerToAssignment(assignment17_2, pa_17_2_4);

        ProblemAnswer pa_17_2_5 = createProblemAnswer("What is DNA replication?", "DNA replication is the process by which a cell copies its DNA before cell division. It involves the unwinding of the double helix, the formation of a replication fork, and the synthesis of new DNA strands by DNA polymerase.");
        addAssignmentToProblemAnswer(pa_17_2_5, assignment17_2);
        addProblemAnswerToAssignment(assignment17_2, pa_17_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Genetics' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment17_3 = createAssignment("Evolution Assignment", faculty2, Date.from(LocalDate.of(2029, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        addStudentToAssignment(assignment17_3, student9);
        addStudentToAssignment(assignment17_3, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_17_3_1 = createProblemAnswer("What is the theory of evolution?", "The theory of evolution is the scientific explanation for the diversity of life on Earth. It states that all species of organisms have descended from common ancestors through a process of gradual change and natural selection.");
        addAssignmentToProblemAnswer(pa_17_3_1, assignment17_3);
        addProblemAnswerToAssignment(assignment17_3, pa_17_3_1);

        ProblemAnswer pa_17_3_2 = createProblemAnswer("What is natural selection?", "Natural selection is the process by which certain traits become more common in a population because they increase an organism's chances of survival and reproduction. It is a key mechanism of evolution.");
        addAssignmentToProblemAnswer(pa_17_3_2, assignment17_3);
        addProblemAnswerToAssignment(assignment17_3, pa_17_3_2);

        ProblemAnswer pa_17_3_3 = createProblemAnswer("What is genetic variation?", "Genetic variation refers to the differences in DNA sequences among individuals within a population. It is the raw material for evolution, as it provides the genetic diversity on which natural selection acts.");
        addAssignmentToProblemAnswer(pa_17_3_3, assignment17_3);
        addProblemAnswerToAssignment(assignment17_3, pa_17_3_3);

        ProblemAnswer pa_17_3_4 = createProblemAnswer("What is the evidence for evolution?", "Evidence for evolution comes from various fields, including paleontology (fossil record), comparative anatomy (homologous structures), molecular biology (DNA and protein similarities), biogeography (distribution of species), and embryology (developmental stages).");
        addAssignmentToProblemAnswer(pa_17_3_4, assignment17_3);
        addProblemAnswerToAssignment(assignment17_3, pa_17_3_4);

        ProblemAnswer pa_17_3_5 = createProblemAnswer("What is a fossil record?", "The fossil record is the collection of fossils that provides evidence of the history of life on Earth. It shows the progression of life forms over time and supports the idea of common ancestry and evolutionary change.");
        addAssignmentToProblemAnswer(pa_17_3_5, assignment17_3);
        addProblemAnswerToAssignment(assignment17_3, pa_17_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Evolution' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment17_4 = createAssignment("Ecology Assignment", faculty2, Date.from(LocalDate.of(2029, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        addStudentToAssignment(assignment17_4, student9);
        addStudentToAssignment(assignment17_4, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_17_4_1 = createProblemAnswer("What is ecology?", "Ecology is the study of interactions between organisms and their environment. It examines how organisms affect and are affected by their surroundings, including other organisms and physical factors.");
        addAssignmentToProblemAnswer(pa_17_4_1, assignment17_4);
        addProblemAnswerToAssignment(assignment17_4, pa_17_4_1);

        ProblemAnswer pa_17_4_2 = createProblemAnswer("What is an ecosystem?", "An ecosystem is a community of living organisms (plants, animals, and microbes) interacting with their physical environment (air, water, and soil). It includes both biotic (living) and abiotic (non-living) components.");
        addAssignmentToProblemAnswer(pa_17_4_2, assignment17_4);
        addProblemAnswerToAssignment(assignment17_4, pa_17_4_2);

        ProblemAnswer pa_17_4_3 = createProblemAnswer("What is a food web?", "A food web is a complex network of interconnected food chains that shows the feeding relationships between organisms in an ecosystem. It illustrates how energy and nutrients flow through different trophic levels.");
        addAssignmentToProblemAnswer(pa_17_4_3, assignment17_4);
        addProblemAnswerToAssignment(assignment17_4, pa_17_4_3);

        ProblemAnswer pa_17_4_4 = createProblemAnswer("What is energy flow in an ecosystem?", "Energy flow in an ecosystem refers to the transfer of energy from one trophic level to another, beginning with primary producers (plants) and moving through herbivores, carnivores, and decomposers. Energy is lost at each level through metabolic processes and heat.");
        addAssignmentToProblemAnswer(pa_17_4_4, assignment17_4);
        addProblemAnswerToAssignment(assignment17_4, pa_17_4_4);

        ProblemAnswer pa_17_4_5 = createProblemAnswer("What is the role of producers, consumers, and decomposers in an ecosystem?", "Producers (plants and algae) convert sunlight into chemical energy through photosynthesis. Consumers (herbivores, carnivores, and omnivores) obtain energy by eating other organisms. Decomposers (bacteria and fungi) break down dead organic matter, recycling nutrients back into the ecosystem.");
        addAssignmentToProblemAnswer(pa_17_4_5, assignment17_4);
        addProblemAnswerToAssignment(assignment17_4, pa_17_4_5);


// Output for confirmation
        System.out.println("Assignment for 'Ecology' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment18_1 = createAssignment("Engineering Disciplines Assignment", faculty3, Date.from(LocalDate.of(2029, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);
        addStudentToAssignment(assignment18_1, student9);
        addStudentToAssignment(assignment18_1, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_18_1_1 = createProblemAnswer("What is civil engineering?", "Civil engineering is the discipline that deals with the design, construction, and maintenance of the built environment. This includes infrastructure such as roads, bridges, dams, and buildings.");
        addAssignmentToProblemAnswer(pa_18_1_1, assignment18_1);
        addProblemAnswerToAssignment(assignment18_1, pa_18_1_1);

        ProblemAnswer pa_18_1_2 = createProblemAnswer("What is mechanical engineering?", "Mechanical engineering is the discipline that applies principles of physics and materials science for the design, analysis, manufacturing, and maintenance of mechanical systems. It involves the development of machines and tools.");
        addAssignmentToProblemAnswer(pa_18_1_2, assignment18_1);
        addProblemAnswerToAssignment(assignment18_1, pa_18_1_2);

        ProblemAnswer pa_18_1_3 = createProblemAnswer("What is electrical engineering?", "Electrical engineering is the discipline that focuses on the study and application of electricity, electronics, and electromagnetism. It includes the design and development of electrical circuits, devices, and systems.");
        addAssignmentToProblemAnswer(pa_18_1_3, assignment18_1);
        addProblemAnswerToAssignment(assignment18_1, pa_18_1_3);

        ProblemAnswer pa_18_1_4 = createProblemAnswer("What is chemical engineering?", "Chemical engineering is the discipline that combines principles of chemistry, physics, mathematics, and engineering to design and operate processes for producing, transforming, and using chemicals and materials.");
        addAssignmentToProblemAnswer(pa_18_1_4, assignment18_1);
        addProblemAnswerToAssignment(assignment18_1, pa_18_1_4);

        ProblemAnswer pa_18_1_5 = createProblemAnswer("What are the roles and responsibilities of civil engineers?", "Civil engineers are responsible for planning, designing, and overseeing construction projects. They ensure the safety, sustainability, and efficiency of infrastructure, including roads, bridges, water supply systems, and buildings.");
        addAssignmentToProblemAnswer(pa_18_1_5, assignment18_1);
        addProblemAnswerToAssignment(assignment18_1, pa_18_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Engineering Disciplines' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment18_2 = createAssignment("Problem-Solving Assignment", faculty3, Date.from(LocalDate.of(2029, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);
        addStudentToAssignment(assignment18_2, student9);
        addStudentToAssignment(assignment18_2, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_18_2_1 = createProblemAnswer("What is the engineering problem-solving process?", "The engineering problem-solving process involves identifying a problem, generating potential solutions, evaluating and selecting the best solution, and implementing and testing the solution. It is a systematic approach to addressing engineering challenges.");
        addAssignmentToProblemAnswer(pa_18_2_1, assignment18_2);
        addProblemAnswerToAssignment(assignment18_2, pa_18_2_1);

        ProblemAnswer pa_18_2_2 = createProblemAnswer("What are the steps in the engineering problem-solving process?", "The steps in the engineering problem-solving process include: \n1. Identifying the problem \n2. Defining the problem clearly \n3. Generating possible solutions \n4. Evaluating and selecting the best solution \n5. Implementing the solution \n6. Testing and refining the solution");
        addAssignmentToProblemAnswer(pa_18_2_2, assignment18_2);
        addProblemAnswerToAssignment(assignment18_2, pa_18_2_2);

        ProblemAnswer pa_18_2_3 = createProblemAnswer("What techniques are used for generating solutions?", "Techniques for generating solutions include brainstorming, using creativity tools such as mind maps and TRIZ (theory of inventive problem solving), and applying engineering principles and heuristics.");
        addAssignmentToProblemAnswer(pa_18_2_3, assignment18_2);
        addProblemAnswerToAssignment(assignment18_2, pa_18_2_3);

        ProblemAnswer pa_18_2_4 = createProblemAnswer("What is brainstorming?", "Brainstorming is a technique used to generate a large number of ideas in a short amount of time. It encourages open and creative thinking, allowing participants to propose solutions without criticism or evaluation during the session.");
        addAssignmentToProblemAnswer(pa_18_2_4, assignment18_2);
        addProblemAnswerToAssignment(assignment18_2, pa_18_2_4);

        ProblemAnswer pa_18_2_5 = createProblemAnswer("What is TRIZ (theory of inventive problem solving)?", "TRIZ is a problem-solving methodology based on the study of patterns in inventive solutions. It provides a systematic approach to identifying and overcoming contradictions in engineering problems and generating innovative solutions.");
        addAssignmentToProblemAnswer(pa_18_2_5, assignment18_2);
        addProblemAnswerToAssignment(assignment18_2, pa_18_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Problem-Solving' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment18_3 = createAssignment("Design Process Assignment", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);
        addStudentToAssignment(assignment18_3, student9);
        addStudentToAssignment(assignment18_3, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_18_3_1 = createProblemAnswer("What is the engineering design process?", "The engineering design process is a systematic approach to solving engineering problems. It involves defining the problem, generating ideas, developing solutions, testing and evaluating, and improving the design.");
        addAssignmentToProblemAnswer(pa_18_3_1, assignment18_3);
        addProblemAnswerToAssignment(assignment18_3, pa_18_3_1);

        ProblemAnswer pa_18_3_2 = createProblemAnswer("What are the stages of the design process?", "The stages of the design process include: \n1. Defining the problem \n2. Researching and gathering information \n3. Brainstorming and generating ideas \n4. Developing and prototyping solutions \n5. Testing and evaluating prototypes \n6. Refining and improving the design \n7. Communicating the final solution");
        addAssignmentToProblemAnswer(pa_18_3_2, assignment18_3);
        addProblemAnswerToAssignment(assignment18_3, pa_18_3_2);

        ProblemAnswer pa_18_3_3 = createProblemAnswer("How do engineers define requirements for a project?", "Engineers define requirements by identifying the needs and constraints of the project. This involves understanding the problem, considering the end-users, and establishing criteria for success. Requirements are often documented in a design brief or specification.");
        addAssignmentToProblemAnswer(pa_18_3_3, assignment18_3);
        addProblemAnswerToAssignment(assignment18_3, pa_18_3_3);

        ProblemAnswer pa_18_3_4 = createProblemAnswer("What is brainstorming?", "Brainstorming is a creative technique used to generate a wide range of ideas and solutions. It encourages open and free-flowing thinking, allowing participants to build on each other's ideas without judgment or criticism.");
        addAssignmentToProblemAnswer(pa_18_3_4, assignment18_3);
        addProblemAnswerToAssignment(assignment18_3, pa_18_3_4);

        ProblemAnswer pa_18_3_5 = createProblemAnswer("What is prototyping?", "Prototyping involves creating a physical or digital model of a solution to test and evaluate its functionality, design, and usability. Prototypes can range from simple sketches and mock-ups to fully functional models.");
        addAssignmentToProblemAnswer(pa_18_3_5, assignment18_3);
        addProblemAnswerToAssignment(assignment18_3, pa_18_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Design Process' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment19_1 = createAssignment("Circuit Analysis Assignment", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);
        addStudentToAssignment(assignment19_1, student9);
        addStudentToAssignment(assignment19_1, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_19_1_1 = createProblemAnswer("What is Ohm's Law?", "Ohm's Law states that the current through a conductor between two points is directly proportional to the voltage across the two points and inversely proportional to the resistance between them. It is mathematically expressed as V = IR, where V is the voltage, I is the current, and R is the resistance.");
        addAssignmentToProblemAnswer(pa_19_1_1, assignment19_1);
        addProblemAnswerToAssignment(assignment19_1, pa_19_1_1);

        ProblemAnswer pa_19_1_2 = createProblemAnswer("What is Kirchhoff's Current Law (KCL)?", "Kirchhoff's Current Law (KCL) states that the total current entering a junction in an electrical circuit is equal to the total current leaving the junction. This law is based on the principle of conservation of charge.");
        addAssignmentToProblemAnswer(pa_19_1_2, assignment19_1);
        addProblemAnswerToAssignment(assignment19_1, pa_19_1_2);

        ProblemAnswer pa_19_1_3 = createProblemAnswer("What is Kirchhoff's Voltage Law (KVL)?", "Kirchhoff's Voltage Law (KVL) states that the sum of the electrical potential differences (voltages) around any closed loop or mesh in a circuit is equal to zero. This law is based on the principle of conservation of energy.");
        addAssignmentToProblemAnswer(pa_19_1_3, assignment19_1);
        addProblemAnswerToAssignment(assignment19_1, pa_19_1_3);

        ProblemAnswer pa_19_1_4 = createProblemAnswer("How do you calculate total resistance in a series circuit?", "In a series circuit, the total resistance is the sum of the individual resistances. The formula is: R_total = R1 + R2 + R3 + ... + Rn, where R1, R2, R3, ..., Rn are the individual resistances.");
        addAssignmentToProblemAnswer(pa_19_1_4, assignment19_1);
        addProblemAnswerToAssignment(assignment19_1, pa_19_1_4);

        ProblemAnswer pa_19_1_5 = createProblemAnswer("How do you calculate total resistance in a parallel circuit?", "In a parallel circuit, the total resistance is calculated using the formula: 1/R_total = 1/R1 + 1/R2 + 1/R3 + ... + 1/Rn. The reciprocal of the sum of the reciprocals of the individual resistances gives the total resistance.");
        addAssignmentToProblemAnswer(pa_19_1_5, assignment19_1);
        addProblemAnswerToAssignment(assignment19_1, pa_19_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Circuit Analysis' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment19_2 = createAssignment("Signal Processing Assignment", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);
        addStudentToAssignment(assignment19_2, student9);
        addStudentToAssignment(assignment19_2, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_19_2_1 = createProblemAnswer("What is signal processing?", "Signal processing involves the analysis, manipulation, and interpretation of signals. It includes techniques for filtering, transforming, and extracting information from signals in various domains, such as time, frequency, and space.");
        addAssignmentToProblemAnswer(pa_19_2_1, assignment19_2);
        addProblemAnswerToAssignment(assignment19_2, pa_19_2_1);

        ProblemAnswer pa_19_2_2 = createProblemAnswer("What is a Fourier transform?", "A Fourier transform is a mathematical technique used to transform a signal from the time domain to the frequency domain. It decomposes a signal into its constituent frequencies, providing insights into the signal's frequency content.");
        addAssignmentToProblemAnswer(pa_19_2_2, assignment19_2);
        addProblemAnswerToAssignment(assignment19_2, pa_19_2_2);

        ProblemAnswer pa_19_2_3 = createProblemAnswer("What is filtering in signal processing?", "Filtering is the process of removing unwanted components from a signal or enhancing certain aspects of a signal. Filters can be designed to pass specific frequency ranges (passbands) while attenuating others (stopbands).");
        addAssignmentToProblemAnswer(pa_19_2_3, assignment19_2);
        addProblemAnswerToAssignment(assignment19_2, pa_19_2_3);

        ProblemAnswer pa_19_2_4 = createProblemAnswer("What are the types of filters?", "Common types of filters include low-pass filters, high-pass filters, band-pass filters, and band-stop filters. Each type of filter allows or attenuates different frequency ranges of a signal.");
        addAssignmentToProblemAnswer(pa_19_2_4, assignment19_2);
        addProblemAnswerToAssignment(assignment19_2, pa_19_2_4);

        ProblemAnswer pa_19_2_5 = createProblemAnswer("What is digital signal processing (DSP)?", "Digital signal processing (DSP) involves the use of digital techniques to analyze, modify, and synthesize signals. DSP techniques are widely used in communication systems, audio and video processing, radar, and control systems.");
        addAssignmentToProblemAnswer(pa_19_2_5, assignment19_2);
        addProblemAnswerToAssignment(assignment19_2, pa_19_2_5);

// Output for confirmation
        System.out.println("Assignment for 'Signal Processing' unit created with  problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment19_3 = createAssignment("Systems Theory Assignment", faculty4, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);
        addStudentToAssignment(assignment19_3, student9);
        addStudentToAssignment(assignment19_3, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_19_3_1 = createProblemAnswer("What is systems theory?", "Systems theory is the study of systems and their behavior, including how components of a system interact and how systems function as a whole. It is used to analyze and design complex systems across various disciplines.");
        addAssignmentToProblemAnswer(pa_19_3_1, assignment19_3);
        addProblemAnswerToAssignment(assignment19_3, pa_19_3_1);

        ProblemAnswer pa_19_3_2 = createProblemAnswer("What is system modeling?", "System modeling involves creating abstract representations of systems to understand, analyze, and predict their behavior. Models can be mathematical, graphical, or computational, and they help in designing and optimizing systems.");
        addAssignmentToProblemAnswer(pa_19_3_2, assignment19_3);
        addProblemAnswerToAssignment(assignment19_3, pa_19_3_2);

        ProblemAnswer pa_19_3_3 = createProblemAnswer("What is feedback in a system?", "Feedback is the process by which a system's output is returned as input to influence its behavior. Positive feedback amplifies changes, while negative feedback stabilizes a system by counteracting changes.");
        addAssignmentToProblemAnswer(pa_19_3_3, assignment19_3);
        addProblemAnswerToAssignment(assignment19_3, pa_19_3_3);

        ProblemAnswer pa_19_3_4 = createProblemAnswer("What are control systems?", "Control systems are systems designed to regulate and control processes or outputs. They use feedback mechanisms to maintain desired performance, such as temperature control in heating systems or speed control in vehicles.");
        addAssignmentToProblemAnswer(pa_19_3_4, assignment19_3);
        addProblemAnswerToAssignment(assignment19_3, pa_19_3_4);

        ProblemAnswer pa_19_3_5 = createProblemAnswer("What is open-loop control?", "Open-loop control is a type of control system that operates without feedback. It follows a predetermined set of instructions, regardless of the output, such as a washing machine's fixed cycle times.");
        addAssignmentToProblemAnswer(pa_19_3_5, assignment19_3);
        addProblemAnswerToAssignment(assignment19_3, pa_19_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Systems Theory' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment20_1 = createAssignment("Statics Assignment", faculty5, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        addStudentToAssignment(assignment20_1, student9);
        addStudentToAssignment(assignment20_1, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_20_1_1 = createProblemAnswer("What is statics?", "Statics is the branch of mechanics that deals with bodies at rest and forces in equilibrium. It involves analyzing force systems, calculating moments, and solving problems related to static equilibrium.");
        addAssignmentToProblemAnswer(pa_20_1_1, assignment20_1);
        addProblemAnswerToAssignment(assignment20_1, pa_20_1_1);

        ProblemAnswer pa_20_1_2 = createProblemAnswer("What is static equilibrium?", "Static equilibrium occurs when the sum of all forces and the sum of all moments acting on a body are zero, resulting in no motion. It is a state where the body is at rest or moving with constant velocity.");
        addAssignmentToProblemAnswer(pa_20_1_2, assignment20_1);
        addProblemAnswerToAssignment(assignment20_1, pa_20_1_2);

        ProblemAnswer pa_20_1_3 = createProblemAnswer("What is a force system?", "A force system is a collection of forces acting on a body. It includes concurrent, parallel, and non-concurrent force systems. Analyzing these systems helps determine the resultant force and its effect on the body.");
        addAssignmentToProblemAnswer(pa_20_1_3, assignment20_1);
        addProblemAnswerToAssignment(assignment20_1, pa_20_1_3);

        ProblemAnswer pa_20_1_4 = createProblemAnswer("What is a moment in statics?", "A moment is the measure of the tendency of a force to rotate an object about a point or axis. It is calculated as the product of the force and the perpendicular distance from the point or axis to the line of action of the force.");
        addAssignmentToProblemAnswer(pa_20_1_4, assignment20_1);
        addProblemAnswerToAssignment(assignment20_1, pa_20_1_4);

        ProblemAnswer pa_20_1_5 = createProblemAnswer("What are the conditions for static equilibrium?", "The conditions for static equilibrium are: \n1. The sum of all horizontal forces must be zero (ΣFx = 0). \n2. The sum of all vertical forces must be zero (ΣFy = 0). \n3. The sum of all moments about any point must be zero (ΣM = 0).");
        addAssignmentToProblemAnswer(pa_20_1_5, assignment20_1);
        addProblemAnswerToAssignment(assignment20_1, pa_20_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Statics' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment20_2 = createAssignment("Dynamics Assignment", faculty5, Date.from(LocalDate.of(2030, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        addStudentToAssignment(assignment20_2, student9);
        addStudentToAssignment(assignment20_2, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_20_2_1 = createProblemAnswer("What is dynamics?", "Dynamics is the branch of mechanics that deals with bodies in motion. It involves studying the kinematics and kinetics of particles and rigid bodies, and analyzing their motion under the influence of forces.");
        addAssignmentToProblemAnswer(pa_20_2_1, assignment20_2);
        addProblemAnswerToAssignment(assignment20_2, pa_20_2_1);

        ProblemAnswer pa_20_2_2 = createProblemAnswer("What is kinematics?", "Kinematics is the study of the motion of objects without considering the forces that cause the motion. It involves analyzing displacement, velocity, and acceleration of particles and rigid bodies.");
        addAssignmentToProblemAnswer(pa_20_2_2, assignment20_2);
        addProblemAnswerToAssignment(assignment20_2, pa_20_2_2);

        ProblemAnswer pa_20_2_3 = createProblemAnswer("What is kinetics?", "Kinetics is the study of the motion of objects by considering the forces that cause the motion. It involves analyzing the relationship between forces, mass, and acceleration using Newton's laws of motion.");
        addAssignmentToProblemAnswer(pa_20_2_3, assignment20_2);
        addProblemAnswerToAssignment(assignment20_2, pa_20_2_3);

        ProblemAnswer pa_20_2_4 = createProblemAnswer("What are Newton's laws of motion?", "Newton's laws of motion are three fundamental principles that describe the relationship between the motion of an object and the forces acting on it. They include:\n1. Newton's First Law (Law of Inertia) - An object at rest stays at rest, and an object in motion stays in motion unless acted upon by an external force.\n2. Newton's Second Law (Law of Acceleration) - The acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass (F = ma).\n3. Newton's Third Law (Law of Action and Reaction) - For every action, there is an equal and opposite reaction.");
        addAssignmentToProblemAnswer(pa_20_2_4, assignment20_2);
        addProblemAnswerToAssignment(assignment20_2, pa_20_2_4);

        ProblemAnswer pa_20_2_5 = createProblemAnswer("What is projectile motion?", "Projectile motion is the curved path an object follows when it is thrown or projected near the Earth's surface. It is influenced by gravity and initial velocity, and its motion can be analyzed using the equations of motion.");
        addAssignmentToProblemAnswer(pa_20_2_5, assignment20_2);
        addProblemAnswerToAssignment(assignment20_2, pa_20_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Dynamics' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment20_3 = createAssignment("Thermodynamics Assignment", faculty5, Date.from(LocalDate.of(2030, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        addStudentToAssignment(assignment20_3, student9);
        addStudentToAssignment(assignment20_3, student10);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_20_3_1 = createProblemAnswer("What is thermodynamics?", "Thermodynamics is the branch of physics that deals with the study of energy transfer, heat, and work. It involves analyzing the behavior of gases and liquids, and understanding the principles governing energy transformations.");
        addAssignmentToProblemAnswer(pa_20_3_1, assignment20_3);
        addProblemAnswerToAssignment(assignment20_3, pa_20_3_1);

        ProblemAnswer pa_20_3_2 = createProblemAnswer("What are the laws of thermodynamics?", "The laws of thermodynamics are fundamental principles that describe how energy is transferred and transformed:\n1. The First Law (Law of Energy Conservation) - Energy cannot be created or destroyed, only transferred or transformed.\n2. The Second Law - The total entropy of an isolated system always increases over time, and energy transformations are not 100% efficient.\n3. The Third Law - As the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value.");
        addAssignmentToProblemAnswer(pa_20_3_2, assignment20_3);
        addProblemAnswerToAssignment(assignment20_3, pa_20_3_2);

        ProblemAnswer pa_20_3_3 = createProblemAnswer("What is the First Law of Thermodynamics?", "The First Law of Thermodynamics, also known as the Law of Energy Conservation, states that energy cannot be created or destroyed, only transferred or transformed. It is mathematically expressed as ΔU = Q - W, where ΔU is the change in internal energy, Q is the heat added to the system, and W is the work done by the system.");
        addAssignmentToProblemAnswer(pa_20_3_3, assignment20_3);
        addProblemAnswerToAssignment(assignment20_3, pa_20_3_3);

        ProblemAnswer pa_20_3_4 = createProblemAnswer("What is the Second Law of Thermodynamics?", "The Second Law of Thermodynamics states that the total entropy of an isolated system always increases over time. It implies that energy transformations are not 100% efficient and that some energy is always lost as waste heat.");
        addAssignmentToProblemAnswer(pa_20_3_4, assignment20_3);
        addProblemAnswerToAssignment(assignment20_3, pa_20_3_4);

        ProblemAnswer pa_20_3_5 = createProblemAnswer("What is the Third Law of Thermodynamics?", "The Third Law of Thermodynamics states that as the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value. It implies that it is impossible to reach absolute zero through any finite number of processes.");
        addAssignmentToProblemAnswer(pa_20_3_5, assignment20_3);
        addProblemAnswerToAssignment(assignment20_3, pa_20_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Thermodynamics' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment20_4 = createAssignment("Material Science Assignment", faculty5, Date.from(LocalDate.of(2030, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        addStudentToAssignment(assignment20_4, student9);
        addStudentToAssignment(assignment20_4, student10);
// Creating and adding problem answers to the assignment
        ProblemAnswer pa_20_4_1 = createProblemAnswer("What is material science?", "Material science is the study of the properties and behavior of materials. It involves understanding the structure, processing, and performance of different materials, including metals, ceramics, polymers, and composites.");
        addAssignmentToProblemAnswer(pa_20_4_1, assignment20_4);
        addProblemAnswerToAssignment(assignment20_4, pa_20_4_1);

        ProblemAnswer pa_20_4_2 = createProblemAnswer("What are metals?", "Metals are materials that are typically hard, shiny, malleable, and conductive. They are used in a wide range of applications, including construction, transportation, electronics, and manufacturing. Examples include iron, aluminum, and copper.");
        addAssignmentToProblemAnswer(pa_20_4_2, assignment20_4);
        addProblemAnswerToAssignment(assignment20_4, pa_20_4_2);

        ProblemAnswer pa_20_4_3 = createProblemAnswer("What are ceramics?", "Ceramics are non-metallic, inorganic materials that are typically hard and brittle. They have high melting points and are used in applications such as pottery, glass, and advanced engineering materials. Examples include clay, porcelain, and silicon carbide.");
        addAssignmentToProblemAnswer(pa_20_4_3, assignment20_4);
        addProblemAnswerToAssignment(assignment20_4, pa_20_4_3);

        ProblemAnswer pa_20_4_4 = createProblemAnswer("What are polymers?", "Polymers are large molecules made up of repeating units called monomers. They have diverse properties and applications, ranging from plastics and rubber to textiles and biomedical devices. Examples include polyethylene, polystyrene, and DNA.");
        addAssignmentToProblemAnswer(pa_20_4_4, assignment20_4);
        addProblemAnswerToAssignment(assignment20_4, pa_20_4_4);

        ProblemAnswer pa_20_4_5 = createProblemAnswer("What are composites?", "Composites are materials made from two or more constituent materials with different properties. They combine the advantages of the individual materials to create a new material with enhanced performance. Examples include fiberglass, carbon fiber, and concrete.");
        addAssignmentToProblemAnswer(pa_20_4_5, assignment20_4);
        addProblemAnswerToAssignment(assignment20_4, pa_20_4_5);


// Output for confirmation
        System.out.println("Assignment for 'Material Science' unit created with 10 problem answers, due date, faculty, and syllabus.");

        // Creating StudentAnswer instances for student9
        StudentAnswer sa17_1_1_student9 = createStudentAnswer(student9, pa_17_1_1, "The cell membrane is a thin, flexible barrier that surrounds the cell, regulating what enters and exits the cell. It is composed of a lipid bilayer with embedded proteins.");
        addStudentAnswerToProblemAnswer(pa_17_1_1, sa17_1_1_student9);

        StudentAnswer sa17_1_2_student9 = createStudentAnswer(student9, pa_17_1_2, "The nucleus is the control center of the cell, containing the cell's genetic material (DNA). It regulates gene expression and controls cellular activities such as growth, metabolism, and reproduction.");
        addStudentAnswerToProblemAnswer(pa_17_1_2, sa17_1_2_student9);

        StudentAnswer sa17_1_3_student9 = createStudentAnswer(student9, pa_17_1_3, "Organelles are specialized structures within a cell that perform specific functions. Examples include the mitochondria (energy production), endoplasmic reticulum (protein and lipid synthesis), and Golgi apparatus (modifying, sorting, and packaging proteins).");
        addStudentAnswerToProblemAnswer(pa_17_1_3, sa17_1_3_student9);

        StudentAnswer sa17_1_4_student9 = createStudentAnswer(student9, pa_17_1_4, "Prokaryotic cells lack a true nucleus and membrane-bound organelles, while eukaryotic cells have a defined nucleus and various membrane-bound organelles. Prokaryotes include bacteria and archaea, while eukaryotes include plants, animals, fungi, and protists.");
        addStudentAnswerToProblemAnswer(pa_17_1_4, sa17_1_4_student9);

        StudentAnswer sa17_1_5_student9 = createStudentAnswer(student9, pa_17_1_5, "Mitochondria are the powerhouse of the cell, responsible for producing energy through cellular respiration. They convert glucose and oxygen into ATP (adenosine triphosphate), the cell's main energy currency.");
        addStudentAnswerToProblemAnswer(pa_17_1_5, sa17_1_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa17_1_1_student10 = createStudentAnswer(student10, pa_17_1_1, "The cell membrane is a thin, flexible barrier that surrounds the cell, regulating what enters and exits the cell. It is composed of a lipid bilayer with embedded proteins.");
        addStudentAnswerToProblemAnswer(pa_17_1_1, sa17_1_1_student10);

        StudentAnswer sa17_1_2_student10 = createStudentAnswer(student10, pa_17_1_2, "The nucleus is the control center of the cell, containing the cell's genetic material (DNA). It regulates gene expression and controls cellular activities such as growth, metabolism, and reproduction.");
        addStudentAnswerToProblemAnswer(pa_17_1_2, sa17_1_2_student10);

        StudentAnswer sa17_1_3_student10 = createStudentAnswer(student10, pa_17_1_3, "Organelles are specialized structures within a cell that perform specific functions. Examples include the mitochondria (energy production), endoplasmic reticulum (protein and lipid synthesis), and Golgi apparatus (modifying, sorting, and packaging proteins).");
        addStudentAnswerToProblemAnswer(pa_17_1_3, sa17_1_3_student10);

        StudentAnswer sa17_1_4_student10 = createStudentAnswer(student10, pa_17_1_4, "Prokaryotic cells lack a true nucleus and membrane-bound organelles, while eukaryotic cells have a defined nucleus and various membrane-bound organelles. Prokaryotes include bacteria and archaea, while eukaryotes include plants, animals, fungi, and protists.");
        addStudentAnswerToProblemAnswer(pa_17_1_4, sa17_1_4_student10);

        StudentAnswer sa17_1_5_student10 = createStudentAnswer(student10, pa_17_1_5, "Mitochondria are the powerhouse of the cell, responsible for producing energy through cellular respiration. They convert glucose and oxygen into ATP (adenosine triphosphate), the cell's main energy currency.");
        addStudentAnswerToProblemAnswer(pa_17_1_5, sa17_1_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment17_1.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa17_2_1_student9 = createStudentAnswer(student9, pa_17_2_1, "Genetics is the study of heredity and the variation of inherited characteristics. It examines how traits are passed from one generation to the next through genes.");
        addStudentAnswerToProblemAnswer(pa_17_2_1, sa17_2_1_student9);

        StudentAnswer sa17_2_2_student9 = createStudentAnswer(student9, pa_17_2_2, "Mendelian genetics is the study of the principles of inheritance discovered by Gregor Mendel. It includes the laws of segregation and independent assortment, which explain how traits are inherited through dominant and recessive alleles.");
        addStudentAnswerToProblemAnswer(pa_17_2_2, sa17_2_2_student9);

        StudentAnswer sa17_2_3_student9 = createStudentAnswer(student9, pa_17_2_3, "DNA (deoxyribonucleic acid) is the molecule that carries genetic information in living organisms. It is composed of two strands forming a double helix, with each strand made up of nucleotides containing a sugar, a phosphate group, and a nitrogenous base.");
        addStudentAnswerToProblemAnswer(pa_17_2_3, sa17_2_3_student9);

        StudentAnswer sa17_2_4_student9 = createStudentAnswer(student9, pa_17_2_4, "A gene is a segment of DNA that contains the instructions for building a specific protein. It includes coding regions called exons and non-coding regions called introns, as well as regulatory sequences that control gene expression.");
        addStudentAnswerToProblemAnswer(pa_17_2_4, sa17_2_4_student9);

        StudentAnswer sa17_2_5_student9 = createStudentAnswer(student9, pa_17_2_5, "DNA replication is the process by which a cell copies its DNA before cell division. It involves the unwinding of the double helix, the formation of a replication fork, and the synthesis of new DNA strands by DNA polymerase.");
        addStudentAnswerToProblemAnswer(pa_17_2_5, sa17_2_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa17_2_1_student10 = createStudentAnswer(student10, pa_17_2_1, "Genetics is the study of heredity and the variation of inherited characteristics. It examines how traits are passed from one generation to the next through genes.");
        addStudentAnswerToProblemAnswer(pa_17_2_1, sa17_2_1_student10);

        StudentAnswer sa17_2_2_student10 = createStudentAnswer(student10, pa_17_2_2, "Mendelian genetics is the study of the principles of inheritance discovered by Gregor Mendel. It includes the laws of segregation and independent assortment, which explain how traits are inherited through dominant and recessive alleles.");
        addStudentAnswerToProblemAnswer(pa_17_2_2, sa17_2_2_student10);

        StudentAnswer sa17_2_3_student10 = createStudentAnswer(student10, pa_17_2_3, "DNA (deoxyribonucleic acid) is the molecule that carries genetic information in living organisms. It is composed of two strands forming a double helix, with each strand made up of nucleotides containing a sugar, a phosphate group, and a nitrogenous base.");
        addStudentAnswerToProblemAnswer(pa_17_2_3, sa17_2_3_student10);

        StudentAnswer sa17_2_4_student10 = createStudentAnswer(student10, pa_17_2_4, "A gene is a segment of DNA that contains the instructions for building a specific protein. It includes coding regions called exons and non-coding regions called introns, as well as regulatory sequences that control gene expression.");
        addStudentAnswerToProblemAnswer(pa_17_2_4, sa17_2_4_student10);

        StudentAnswer sa17_2_5_student10 = createStudentAnswer(student10, pa_17_2_5, "DNA replication is the process by which a cell copies its DNA before cell division. It involves the unwinding of the double helix, the formation of a replication fork, and the synthesis of new DNA strands by DNA polymerase.");
        addStudentAnswerToProblemAnswer(pa_17_2_5, sa17_2_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment17_2.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa17_3_1_student9 = createStudentAnswer(student9, pa_17_3_1, "The theory of evolution is the scientific explanation for the diversity of life on Earth. It states that all species of organisms have descended from common ancestors through a process of gradual change and natural selection.");
        addStudentAnswerToProblemAnswer(pa_17_3_1, sa17_3_1_student9);

        StudentAnswer sa17_3_2_student9 = createStudentAnswer(student9, pa_17_3_2, "Natural selection is the process by which certain traits become more common in a population because they increase an organism's chances of survival and reproduction. It is a key mechanism of evolution.");
        addStudentAnswerToProblemAnswer(pa_17_3_2, sa17_3_2_student9);

        StudentAnswer sa17_3_3_student9 = createStudentAnswer(student9, pa_17_3_3, "Genetic variation refers to the differences in DNA sequences among individuals within a population. It is the raw material for evolution, as it provides the genetic diversity on which natural selection acts.");
        addStudentAnswerToProblemAnswer(pa_17_3_3, sa17_3_3_student9);

        StudentAnswer sa17_3_4_student9 = createStudentAnswer(student9, pa_17_3_4, "Evidence for evolution comes from various fields, including paleontology (fossil record), comparative anatomy (homologous structures), molecular biology (DNA and protein similarities), biogeography (distribution of species), and embryology (developmental stages).");
        addStudentAnswerToProblemAnswer(pa_17_3_4, sa17_3_4_student9);

        StudentAnswer sa17_3_5_student9 = createStudentAnswer(student9, pa_17_3_5, "The fossil record is the collection of fossils that provides evidence of the history of life on Earth. It shows the progression of life forms over time and supports the idea of common ancestry and evolutionary change.");
        addStudentAnswerToProblemAnswer(pa_17_3_5, sa17_3_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa17_3_1_student10 = createStudentAnswer(student10, pa_17_3_1, "The theory of evolution is the scientific explanation for the diversity of life on Earth. It states that all species of organisms have descended from common ancestors through a process of gradual change and natural selection.");
        addStudentAnswerToProblemAnswer(pa_17_3_1, sa17_3_1_student10);

        StudentAnswer sa17_3_2_student10 = createStudentAnswer(student10, pa_17_3_2, "Natural selection is the process by which certain traits become more common in a population because they increase an organism's chances of survival and reproduction. It is a key mechanism of evolution.");
        addStudentAnswerToProblemAnswer(pa_17_3_2, sa17_3_2_student10);

        StudentAnswer sa17_3_3_student10 = createStudentAnswer(student10, pa_17_3_3, "Genetic variation refers to the differences in DNA sequences among individuals within a population. It is the raw material for evolution, as it provides the genetic diversity on which natural selection acts.");
        addStudentAnswerToProblemAnswer(pa_17_3_3, sa17_3_3_student10);

        StudentAnswer sa17_3_4_student10 = createStudentAnswer(student10, pa_17_3_4, "Evidence for evolution comes from various fields, including paleontology (fossil record), comparative anatomy (homologous structures), molecular biology (DNA and protein similarities), biogeography (distribution of species), and embryology (developmental stages).");
        addStudentAnswerToProblemAnswer(pa_17_3_4, sa17_3_4_student10);

        StudentAnswer sa17_3_5_student10 = createStudentAnswer(student10, pa_17_3_5, "The fossil record is the collection of fossils that provides evidence of the history of life on Earth. It shows the progression of life forms over time and supports the idea of common ancestry and evolutionary change.");
        addStudentAnswerToProblemAnswer(pa_17_3_5, sa17_3_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment17_3.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa17_4_1_student9 = createStudentAnswer(student9, pa_17_4_1, "Ecology is the study of interactions between organisms and their environment. It examines how organisms affect and are affected by their surroundings, including other organisms and physical factors.");
        addStudentAnswerToProblemAnswer(pa_17_4_1, sa17_4_1_student9);

        StudentAnswer sa17_4_2_student9 = createStudentAnswer(student9, pa_17_4_2, "An ecosystem is a community of living organisms (plants, animals, and microbes) interacting with their physical environment (air, water, and soil). It includes both biotic (living) and abiotic (non-living) components.");
        addStudentAnswerToProblemAnswer(pa_17_4_2, sa17_4_2_student9);

        StudentAnswer sa17_4_3_student9 = createStudentAnswer(student9, pa_17_4_3, "A food web is a complex network of interconnected food chains that shows the feeding relationships between organisms in an ecosystem. It illustrates how energy and nutrients flow through different trophic levels.");
        addStudentAnswerToProblemAnswer(pa_17_4_3, sa17_4_3_student9);

        StudentAnswer sa17_4_4_student9 = createStudentAnswer(student9, pa_17_4_4, "Energy flow in an ecosystem refers to the transfer of energy from one trophic level to another, beginning with primary producers (plants) and moving through herbivores, carnivores, and decomposers. Energy is lost at each level through metabolic processes and heat.");
        addStudentAnswerToProblemAnswer(pa_17_4_4, sa17_4_4_student9);

        StudentAnswer sa17_4_5_student9 = createStudentAnswer(student9, pa_17_4_5, "Producers (plants and algae) convert sunlight into chemical energy through photosynthesis. Consumers (herbivores, carnivores, and omnivores) obtain energy by eating other organisms. Decomposers (bacteria and fungi) break down dead organic matter, recycling nutrients back into the ecosystem.");
        addStudentAnswerToProblemAnswer(pa_17_4_5, sa17_4_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa17_4_1_student10 = createStudentAnswer(student10, pa_17_4_1, "Ecology is the study of interactions between organisms and their environment. It examines how organisms affect and are affected by their surroundings, including other organisms and physical factors.");
        addStudentAnswerToProblemAnswer(pa_17_4_1, sa17_4_1_student10);

        StudentAnswer sa17_4_2_student10 = createStudentAnswer(student10, pa_17_4_2, "An ecosystem is a community of living organisms (plants, animals, and microbes) interacting with their physical environment (air, water, and soil). It includes both biotic (living) and abiotic (non-living) components.");
        addStudentAnswerToProblemAnswer(pa_17_4_2, sa17_4_2_student10);

        StudentAnswer sa17_4_3_student10 = createStudentAnswer(student10, pa_17_4_3, "A food web is a complex network of interconnected food chains that shows the feeding relationships between organisms in an ecosystem. It illustrates how energy and nutrients flow through different trophic levels.");
        addStudentAnswerToProblemAnswer(pa_17_4_3, sa17_4_3_student10);

        StudentAnswer sa17_4_4_student10 = createStudentAnswer(student10, pa_17_4_4, "Energy flow in an ecosystem refers to the transfer of energy from one trophic level to another, beginning with primary producers (plants) and moving through herbivores, carnivores, and decomposers. Energy is lost at each level through metabolic processes and heat.");
        addStudentAnswerToProblemAnswer(pa_17_4_4, sa17_4_4_student10);

        StudentAnswer sa17_4_5_student10 = createStudentAnswer(student10, pa_17_4_5, "Producers (plants and algae) convert sunlight into chemical energy through photosynthesis. Consumers (herbivores, carnivores, and omnivores) obtain energy by eating other organisms. Decomposers (bacteria and fungi) break down dead organic matter, recycling nutrients back into the ecosystem.");
        addStudentAnswerToProblemAnswer(pa_17_4_5, sa17_4_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment17_4.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa18_1_1_student9 = createStudentAnswer(student9, pa_18_1_1, "Civil engineering is the discipline that deals with the design, construction, and maintenance of the built environment. This includes infrastructure such as roads, bridges, dams, and buildings.");
        addStudentAnswerToProblemAnswer(pa_18_1_1, sa18_1_1_student9);

        StudentAnswer sa18_1_2_student9 = createStudentAnswer(student9, pa_18_1_2, "Mechanical engineering is the discipline that applies principles of physics and materials science for the design, analysis, manufacturing, and maintenance of mechanical systems. It involves the development of machines and tools.");
        addStudentAnswerToProblemAnswer(pa_18_1_2, sa18_1_2_student9);

        StudentAnswer sa18_1_3_student9 = createStudentAnswer(student9, pa_18_1_3, "Electrical engineering is the discipline that focuses on the study and application of electricity, electronics, and electromagnetism. It includes the design and development of electrical circuits, devices, and systems.");
        addStudentAnswerToProblemAnswer(pa_18_1_3, sa18_1_3_student9);

        StudentAnswer sa18_1_4_student9 = createStudentAnswer(student9, pa_18_1_4, "Chemical engineering is the discipline that combines principles of chemistry, physics, mathematics, and engineering to design and operate processes for producing, transforming, and using chemicals and materials.");
        addStudentAnswerToProblemAnswer(pa_18_1_4, sa18_1_4_student9);

        StudentAnswer sa18_1_5_student9 = createStudentAnswer(student9, pa_18_1_5, "Civil engineers are responsible for planning, designing, and overseeing construction projects. They ensure the safety, sustainability, and efficiency of infrastructure, including roads, bridges, water supply systems, and buildings.");
        addStudentAnswerToProblemAnswer(pa_18_1_5, sa18_1_5_student9);


        // Creating StudentAnswer instances for student10
        StudentAnswer sa18_1_1_student10 = createStudentAnswer(student10, pa_18_1_1, "Civil engineering is the discipline that deals with the design, construction, and maintenance of the built environment. This includes infrastructure such as roads, bridges, dams, and buildings.");
        addStudentAnswerToProblemAnswer(pa_18_1_1, sa18_1_1_student10);

        StudentAnswer sa18_1_2_student10 = createStudentAnswer(student10, pa_18_1_2, "Mechanical engineering is the discipline that applies principles of physics and materials science for the design, analysis, manufacturing, and maintenance of mechanical systems. It involves the development of machines and tools.");
        addStudentAnswerToProblemAnswer(pa_18_1_2, sa18_1_2_student10);

        StudentAnswer sa18_1_3_student10 = createStudentAnswer(student10, pa_18_1_3, "Electrical engineering is the discipline that focuses on the study and application of electricity, electronics, and electromagnetism. It includes the design and development of electrical circuits, devices, and systems.");
        addStudentAnswerToProblemAnswer(pa_18_1_3, sa18_1_3_student10);

        StudentAnswer sa18_1_4_student10 = createStudentAnswer(student10, pa_18_1_4, "Chemical engineering is the discipline that combines principles of chemistry, physics, mathematics, and engineering to design and operate processes for producing, transforming, and using chemicals and materials.");
        addStudentAnswerToProblemAnswer(pa_18_1_4, sa18_1_4_student10);

        StudentAnswer sa18_1_5_student10 = createStudentAnswer(student10, pa_18_1_5, "Civil engineers are responsible for planning, designing, and overseeing construction projects. They ensure the safety, sustainability, and efficiency of infrastructure, including roads, bridges, water supply systems, and buildings.");
        addStudentAnswerToProblemAnswer(pa_18_1_5, sa18_1_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment18_1.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa18_2_1_student9 = createStudentAnswer(student9, pa_18_2_1, "The engineering problem-solving process involves identifying a problem, generating potential solutions, evaluating and selecting the best solution, and implementing and testing the solution. It is a systematic approach to addressing engineering challenges.");
        addStudentAnswerToProblemAnswer(pa_18_2_1, sa18_2_1_student9);

        StudentAnswer sa18_2_2_student9 = createStudentAnswer(student9, pa_18_2_2, "The steps in the engineering problem-solving process include: \n1. Identifying the problem \n2. Defining the problem clearly \n3. Generating possible solutions \n4. Evaluating and selecting the best solution \n5. Implementing the solution \n6. Testing and refining the solution");
        addStudentAnswerToProblemAnswer(pa_18_2_2, sa18_2_2_student9);

        StudentAnswer sa18_2_3_student9 = createStudentAnswer(student9, pa_18_2_3, "Techniques for generating solutions include brainstorming, using creativity tools such as mind maps and TRIZ (theory of inventive problem solving), and applying engineering principles and heuristics.");
        addStudentAnswerToProblemAnswer(pa_18_2_3, sa18_2_3_student9);

        StudentAnswer sa18_2_4_student9 = createStudentAnswer(student9, pa_18_2_4, "Brainstorming is a technique used to generate a large number of ideas in a short amount of time. It encourages open and creative thinking, allowing participants to propose solutions without criticism or evaluation during the session.");
        addStudentAnswerToProblemAnswer(pa_18_2_4, sa18_2_4_student9);

        StudentAnswer sa18_2_5_student9 = createStudentAnswer(student9, pa_18_2_5, "TRIZ is a problem-solving methodology based on the study of patterns in inventive solutions. It provides a systematic approach to identifying and overcoming contradictions in engineering problems and generating innovative solutions.");
        addStudentAnswerToProblemAnswer(pa_18_2_5, sa18_2_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa18_2_1_student10 = createStudentAnswer(student10, pa_18_2_1, "The engineering problem-solving process involves identifying a problem, generating potential solutions, evaluating and selecting the best solution, and implementing and testing the solution. It is a systematic approach to addressing engineering challenges.");
        addStudentAnswerToProblemAnswer(pa_18_2_1, sa18_2_1_student10);

        StudentAnswer sa18_2_2_student10 = createStudentAnswer(student10, pa_18_2_2, "The steps in the engineering problem-solving process include: \n1. Identifying the problem \n2. Defining the problem clearly \n3. Generating possible solutions \n4. Evaluating and selecting the best solution \n5. Implementing the solution \n6. Testing and refining the solution");
        addStudentAnswerToProblemAnswer(pa_18_2_2, sa18_2_2_student10);

        StudentAnswer sa18_2_3_student10 = createStudentAnswer(student10, pa_18_2_3, "Techniques for generating solutions include brainstorming, using creativity tools such as mind maps and TRIZ (theory of inventive problem solving), and applying engineering principles and heuristics.");
        addStudentAnswerToProblemAnswer(pa_18_2_3, sa18_2_3_student10);

        StudentAnswer sa18_2_4_student10 = createStudentAnswer(student10, pa_18_2_4, "Brainstorming is a technique used to generate a large number of ideas in a short amount of time. It encourages open and creative thinking, allowing participants to propose solutions without criticism or evaluation during the session.");
        addStudentAnswerToProblemAnswer(pa_18_2_4, sa18_2_4_student10);

        StudentAnswer sa18_2_5_student10 = createStudentAnswer(student10, pa_18_2_5, "TRIZ is a problem-solving methodology based on the study of patterns in inventive solutions. It provides a systematic approach to identifying and overcoming contradictions in engineering problems and generating innovative solutions.");
        addStudentAnswerToProblemAnswer(pa_18_2_5, sa18_2_5_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment18_2.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa18_3_1_student9 = createStudentAnswer(student9, pa_18_3_1, "The engineering design process is a systematic approach to solving engineering problems. It involves defining the problem, generating ideas, developing solutions, testing and evaluating, and improving the design.");
        addStudentAnswerToProblemAnswer(pa_18_3_1, sa18_3_1_student9);

        StudentAnswer sa18_3_2_student9 = createStudentAnswer(student9, pa_18_3_2, "The stages of the design process include: \n1. Defining the problem \n2. Researching and gathering information \n3. Brainstorming and generating ideas \n4. Developing and prototyping solutions \n5. Testing and evaluating prototypes \n6. Refining and improving the design \n7. Communicating the final solution");
        addStudentAnswerToProblemAnswer(pa_18_3_2, sa18_3_2_student9);

        StudentAnswer sa18_3_3_student9 = createStudentAnswer(student9, pa_18_3_3, "Engineers define requirements by identifying the needs and constraints of the project. This involves understanding the problem, considering the end-users, and establishing criteria for success. Requirements are often documented in a design brief or specification.");
        addStudentAnswerToProblemAnswer(pa_18_3_3, sa18_3_3_student9);

        StudentAnswer sa18_3_4_student9 = createStudentAnswer(student9, pa_18_3_4, "Brainstorming is a creative technique used to generate a wide range of ideas and solutions. It encourages open and free-flowing thinking, allowing participants to build on each other's ideas without judgment or criticism.");
        addStudentAnswerToProblemAnswer(pa_18_3_4, sa18_3_4_student9);

        StudentAnswer sa18_3_5_student9 = createStudentAnswer(student9, pa_18_3_5, "Prototyping involves creating a physical or digital model of a solution to test and evaluate its functionality, design, and usability. Prototypes can range from simple sketches and mock-ups to fully functional models.");
        addStudentAnswerToProblemAnswer(pa_18_3_5, sa18_3_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa18_3_1_student10 = createStudentAnswer(student10, pa_18_3_1, "The engineering design process is a systematic approach to solving engineering problems. It involves defining the problem, generating ideas, developing solutions, testing and evaluating, and improving the design.");
        addStudentAnswerToProblemAnswer(pa_18_3_1, sa18_3_1_student10);

        StudentAnswer sa18_3_2_student10 = createStudentAnswer(student10, pa_18_3_2, "The stages of the design process include: \n1. Defining the problem \n2. Researching and gathering information \n3. Brainstorming and generating ideas \n4. Developing and prototyping solutions \n5. Testing and evaluating prototypes \n6. Refining and improving the design \n7. Communicating the final solution");
        addStudentAnswerToProblemAnswer(pa_18_3_2, sa18_3_2_student10);

        StudentAnswer sa18_3_3_student10 = createStudentAnswer(student10, pa_18_3_3, "Engineers define requirements by identifying the needs and constraints of the project. This involves understanding the problem, considering the end-users, and establishing criteria for success. Requirements are often documented in a design brief or specification.");
        addStudentAnswerToProblemAnswer(pa_18_3_3, sa18_3_3_student10);

        StudentAnswer sa18_3_4_student10 = createStudentAnswer(student10, pa_18_3_4, "Brainstorming is a creative technique used to generate a wide range of ideas and solutions. It encourages open and free-flowing thinking, allowing participants to build on each other's ideas without judgment or criticism.");
        addStudentAnswerToProblemAnswer(pa_18_3_4, sa18_3_4_student10);

        StudentAnswer sa18_3_5_student10 = createStudentAnswer(student10, pa_18_3_5, "Prototyping involves creating a physical or digital model of a solution to test and evaluate its functionality, design, and usability. Prototypes can range from simple sketches and mock-ups to fully functional models.");
        addStudentAnswerToProblemAnswer(pa_18_3_5, sa18_3_5_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment18_3.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa19_1_1_student9 = createStudentAnswer(student9, pa_19_1_1, "Ohm's Law states that the current through a conductor between two points is directly proportional to the voltage across the two points and inversely proportional to the resistance between them. It is mathematically expressed as V = IR, where V is the voltage, I is the current, and R is the resistance.");
        addStudentAnswerToProblemAnswer(pa_19_1_1, sa19_1_1_student9);

        StudentAnswer sa19_1_2_student9 = createStudentAnswer(student9, pa_19_1_2, "Kirchhoff's Current Law (KCL) states that the total current entering a junction in an electrical circuit is equal to the total current leaving the junction. This law is based on the principle of conservation of charge.");
        addStudentAnswerToProblemAnswer(pa_19_1_2, sa19_1_2_student9);

        StudentAnswer sa19_1_3_student9 = createStudentAnswer(student9, pa_19_1_3, "Kirchhoff's Voltage Law (KVL) states that the sum of the electrical potential differences (voltages) around any closed loop or mesh in a circuit is equal to zero. This law is based on the principle of conservation of energy.");
        addStudentAnswerToProblemAnswer(pa_19_1_3, sa19_1_3_student9);

        StudentAnswer sa19_1_4_student9 = createStudentAnswer(student9, pa_19_1_4, "In a series circuit, the total resistance is the sum of the individual resistances. The formula is: R_total = R1 + R2 + R3 + ... + Rn, where R1, R2, R3, ..., Rn are the individual resistances.");
        addStudentAnswerToProblemAnswer(pa_19_1_4, sa19_1_4_student9);

        StudentAnswer sa19_1_5_student9 = createStudentAnswer(student9, pa_19_1_5, "In a parallel circuit, the total resistance is calculated using the formula: 1/R_total = 1/R1 + 1/R2 + 1/R3 + ... + 1/Rn. The reciprocal of the sum of the reciprocals of the individual resistances gives the total resistance.");
        addStudentAnswerToProblemAnswer(pa_19_1_5, sa19_1_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa19_1_1_student10 = createStudentAnswer(student10, pa_19_1_1, "Ohm's Law states that the current through a conductor between two points is directly proportional to the voltage across the two points and inversely proportional to the resistance between them. It is mathematically expressed as V = IR, where V is the voltage, I is the current, and R is the resistance.");
        addStudentAnswerToProblemAnswer(pa_19_1_1, sa19_1_1_student10);

        StudentAnswer sa19_1_2_student10 = createStudentAnswer(student10, pa_19_1_2, "Kirchhoff's Current Law (KCL) states that the total current entering a junction in an electrical circuit is equal to the total current leaving the junction. This law is based on the principle of conservation of charge.");
        addStudentAnswerToProblemAnswer(pa_19_1_2, sa19_1_2_student10);

        StudentAnswer sa19_1_3_student10 = createStudentAnswer(student10, pa_19_1_3, "Kirchhoff's Voltage Law (KVL) states that the sum of the electrical potential differences (voltages) around any closed loop or mesh in a circuit is equal to zero. This law is based on the principle of conservation of energy.");
        addStudentAnswerToProblemAnswer(pa_19_1_3, sa19_1_3_student10);

        StudentAnswer sa19_1_4_student10 = createStudentAnswer(student10, pa_19_1_4, "In a series circuit, the total resistance is the sum of the individual resistances. The formula is: R_total = R1 + R2 + R3 + ... + Rn, where R1, R2, R3, ..., Rn are the individual resistances.");
        addStudentAnswerToProblemAnswer(pa_19_1_4, sa19_1_4_student10);

        StudentAnswer sa19_1_5_student10 = createStudentAnswer(student10, pa_19_1_5, "In a parallel circuit, the total resistance is calculated using the formula: 1/R_total = 1/R1 + 1/R2 + 1/R3 + ... + 1/Rn. The reciprocal of the sum of the reciprocals of the individual resistances gives the total resistance.");
        addStudentAnswerToProblemAnswer(pa_19_1_5, sa19_1_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment19_1.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa19_2_1_student9 = createStudentAnswer(student9, pa_19_2_1, "Signal processing involves the analysis, manipulation, and interpretation of signals. It includes techniques for filtering, transforming, and extracting information from signals in various domains, such as time, frequency, and space.");
        addStudentAnswerToProblemAnswer(pa_19_2_1, sa19_2_1_student9);

        StudentAnswer sa19_2_2_student9 = createStudentAnswer(student9, pa_19_2_2, "A Fourier transform is a mathematical technique used to transform a signal from the time domain to the frequency domain. It decomposes a signal into its constituent frequencies, providing insights into the signal's frequency content.");
        addStudentAnswerToProblemAnswer(pa_19_2_2, sa19_2_2_student9);

        StudentAnswer sa19_2_3_student9 = createStudentAnswer(student9, pa_19_2_3, "Filtering is the process of removing unwanted components from a signal or enhancing certain aspects of a signal. Filters can be designed to pass specific frequency ranges (passbands) while attenuating others (stopbands).");
        addStudentAnswerToProblemAnswer(pa_19_2_3, sa19_2_3_student9);

        StudentAnswer sa19_2_4_student9 = createStudentAnswer(student9, pa_19_2_4, "Common types of filters include low-pass filters, high-pass filters, band-pass filters, and band-stop filters. Each type of filter allows or attenuates different frequency ranges of a signal.");
        addStudentAnswerToProblemAnswer(pa_19_2_4, sa19_2_4_student9);

        StudentAnswer sa19_2_5_student9 = createStudentAnswer(student9, pa_19_2_5, "Digital signal processing (DSP) involves the use of digital techniques to analyze, modify, and synthesize signals. DSP techniques are widely used in communication systems, audio and video processing, radar, and control systems.");
        addStudentAnswerToProblemAnswer(pa_19_2_5, sa19_2_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa19_2_1_student10 = createStudentAnswer(student10, pa_19_2_1, "Signal processing involves the analysis, manipulation, and interpretation of signals. It includes techniques for filtering, transforming, and extracting information from signals in various domains, such as time, frequency, and space.");
        addStudentAnswerToProblemAnswer(pa_19_2_1, sa19_2_1_student10);

        StudentAnswer sa19_2_2_student10 = createStudentAnswer(student10, pa_19_2_2, "A Fourier transform is a mathematical technique used to transform a signal from the time domain to the frequency domain. It decomposes a signal into its constituent frequencies, providing insights into the signal's frequency content.");
        addStudentAnswerToProblemAnswer(pa_19_2_2, sa19_2_2_student10);

        StudentAnswer sa19_2_3_student10 = createStudentAnswer(student10, pa_19_2_3, "Filtering is the process of removing unwanted components from a signal or enhancing certain aspects of a signal. Filters can be designed to pass specific frequency ranges (passbands) while attenuating others (stopbands).");
        addStudentAnswerToProblemAnswer(pa_19_2_3, sa19_2_3_student10);

        StudentAnswer sa19_2_4_student10 = createStudentAnswer(student10, pa_19_2_4, "Common types of filters include low-pass filters, high-pass filters, band-pass filters, and band-stop filters. Each type of filter allows or attenuates different frequency ranges of a signal.");
        addStudentAnswerToProblemAnswer(pa_19_2_4, sa19_2_4_student10);

        StudentAnswer sa19_2_5_student10 = createStudentAnswer(student10, pa_19_2_5, "Digital signal processing (DSP) involves the use of digital techniques to analyze, modify, and synthesize signals. DSP techniques are widely used in communication systems, audio and video processing, radar, and control systems.");
        addStudentAnswerToProblemAnswer(pa_19_2_5, sa19_2_5_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment19_2.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa19_3_1_student9 = createStudentAnswer(student9, pa_19_3_1, "Systems theory is the study of systems and their behavior, including how components of a system interact and how systems function as a whole. It is used to analyze and design complex systems across various disciplines.");
        addStudentAnswerToProblemAnswer(pa_19_3_1, sa19_3_1_student9);

        StudentAnswer sa19_3_2_student9 = createStudentAnswer(student9, pa_19_3_2, "System modeling involves creating abstract representations of systems to understand, analyze, and predict their behavior. Models can be mathematical, graphical, or computational, and they help in designing and optimizing systems.");
        addStudentAnswerToProblemAnswer(pa_19_3_2, sa19_3_2_student9);

        StudentAnswer sa19_3_3_student9 = createStudentAnswer(student9, pa_19_3_3, "Feedback is the process by which a system's output is returned as input to influence its behavior. Positive feedback amplifies changes, while negative feedback stabilizes a system by counteracting changes.");
        addStudentAnswerToProblemAnswer(pa_19_3_3, sa19_3_3_student9);

        StudentAnswer sa19_3_4_student9 = createStudentAnswer(student9, pa_19_3_4, "Control systems are systems designed to regulate and control processes or outputs. They use feedback mechanisms to maintain desired performance, such as temperature control in heating systems or speed control in vehicles.");
        addStudentAnswerToProblemAnswer(pa_19_3_4, sa19_3_4_student9);

        StudentAnswer sa19_3_5_student9 = createStudentAnswer(student9, pa_19_3_5, "Open-loop control is a type of control system that operates without feedback. It follows a predetermined set of instructions, regardless of the output, such as a washing machine's fixed cycle times.");
        addStudentAnswerToProblemAnswer(pa_19_3_5, sa19_3_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa19_3_1_student10 = createStudentAnswer(student10, pa_19_3_1, "Systems theory is the study of systems and their behavior, including how components of a system interact and how systems function as a whole. It is used to analyze and design complex systems across various disciplines.");
        addStudentAnswerToProblemAnswer(pa_19_3_1, sa19_3_1_student10);

        StudentAnswer sa19_3_2_student10 = createStudentAnswer(student10, pa_19_3_2, "System modeling involves creating abstract representations of systems to understand, analyze, and predict their behavior. Models can be mathematical, graphical, or computational, and they help in designing and optimizing systems.");
        addStudentAnswerToProblemAnswer(pa_19_3_2, sa19_3_2_student10);

        StudentAnswer sa19_3_3_student10 = createStudentAnswer(student10, pa_19_3_3, "Feedback is the process by which a system's output is returned as input to influence its behavior. Positive feedback amplifies changes, while negative feedback stabilizes a system by counteracting changes.");
        addStudentAnswerToProblemAnswer(pa_19_3_3, sa19_3_3_student10);

        StudentAnswer sa19_3_4_student10 = createStudentAnswer(student10, pa_19_3_4, "Control systems are systems designed to regulate and control processes or outputs. They use feedback mechanisms to maintain desired performance, such as temperature control in heating systems or speed control in vehicles.");
        addStudentAnswerToProblemAnswer(pa_19_3_4, sa19_3_4_student10);

        StudentAnswer sa19_3_5_student10 = createStudentAnswer(student10, pa_19_3_5, "Open-loop control is a type of control system that operates without feedback. It follows a predetermined set of instructions, regardless of the output, such as a washing machine's fixed cycle times.");
        addStudentAnswerToProblemAnswer(pa_19_3_5, sa19_3_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment19_3.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa20_1_1_student9 = createStudentAnswer(student9, pa_20_1_1, "Statics is the branch of mechanics that deals with bodies at rest and forces in equilibrium. It involves analyzing force systems, calculating moments, and solving problems related to static equilibrium.");
        addStudentAnswerToProblemAnswer(pa_20_1_1, sa20_1_1_student9);

        StudentAnswer sa20_1_2_student9 = createStudentAnswer(student9, pa_20_1_2, "Static equilibrium occurs when the sum of all forces and the sum of all moments acting on a body are zero, resulting in no motion. It is a state where the body is at rest or moving with constant velocity.");
        addStudentAnswerToProblemAnswer(pa_20_1_2, sa20_1_2_student9);

        StudentAnswer sa20_1_3_student9 = createStudentAnswer(student9, pa_20_1_3, "A force system is a collection of forces acting on a body. It includes concurrent, parallel, and non-concurrent force systems. Analyzing these systems helps determine the resultant force and its effect on the body.");
        addStudentAnswerToProblemAnswer(pa_20_1_3, sa20_1_3_student9);

        StudentAnswer sa20_1_4_student9 = createStudentAnswer(student9, pa_20_1_4, "A moment is the measure of the tendency of a force to rotate an object about a point or axis. It is calculated as the product of the force and the perpendicular distance from the point or axis to the line of action of the force.");
        addStudentAnswerToProblemAnswer(pa_20_1_4, sa20_1_4_student9);

        StudentAnswer sa20_1_5_student9 = createStudentAnswer(student9, pa_20_1_5, "The conditions for static equilibrium are: \n1. The sum of all horizontal forces must be zero (ΣFx = 0). \n2. The sum of all vertical forces must be zero (ΣFy = 0). \n3. The sum of all moments about any point must be zero (ΣM = 0).");
        addStudentAnswerToProblemAnswer(pa_20_1_5, sa20_1_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa20_1_1_student10 = createStudentAnswer(student10, pa_20_1_1, "Statics is the branch of mechanics that deals with bodies at rest and forces in equilibrium. It involves analyzing force systems, calculating moments, and solving problems related to static equilibrium.");
        addStudentAnswerToProblemAnswer(pa_20_1_1, sa20_1_1_student10);

        StudentAnswer sa20_1_2_student10 = createStudentAnswer(student10, pa_20_1_2, "Static equilibrium occurs when the sum of all forces and the sum of all moments acting on a body are zero, resulting in no motion. It is a state where the body is at rest or moving with constant velocity.");
        addStudentAnswerToProblemAnswer(pa_20_1_2, sa20_1_2_student10);

        StudentAnswer sa20_1_3_student10 = createStudentAnswer(student10, pa_20_1_3, "A force system is a collection of forces acting on a body. It includes concurrent, parallel, and non-concurrent force systems. Analyzing these systems helps determine the resultant force and its effect on the body.");
        addStudentAnswerToProblemAnswer(pa_20_1_3, sa20_1_3_student10);

        StudentAnswer sa20_1_4_student10 = createStudentAnswer(student10, pa_20_1_4, "A moment is the measure of the tendency of a force to rotate an object about a point or axis. It is calculated as the product of the force and the perpendicular distance from the point or axis to the line of action of the force.");
        addStudentAnswerToProblemAnswer(pa_20_1_4, sa20_1_4_student10);

        StudentAnswer sa20_1_5_student10 = createStudentAnswer(student10, pa_20_1_5, "The conditions for static equilibrium are: \n1. The sum of all horizontal forces must be zero (ΣFx = 0). \n2. The sum of all vertical forces must be zero (ΣFy = 0). \n3. The sum of all moments about any point must be zero (ΣM = 0).");
        addStudentAnswerToProblemAnswer(pa_20_1_5, sa20_1_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment20_1.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa20_2_1_student9 = createStudentAnswer(student9, pa_20_2_1, "Dynamics is the branch of mechanics that deals with bodies in motion. It involves studying the kinematics and kinetics of particles and rigid bodies, and analyzing their motion under the influence of forces.");
        addStudentAnswerToProblemAnswer(pa_20_2_1, sa20_2_1_student9);

        StudentAnswer sa20_2_2_student9 = createStudentAnswer(student9, pa_20_2_2, "Kinematics is the study of the motion of objects without considering the forces that cause the motion. It involves analyzing displacement, velocity, and acceleration of particles and rigid bodies.");
        addStudentAnswerToProblemAnswer(pa_20_2_2, sa20_2_2_student9);

        StudentAnswer sa20_2_3_student9 = createStudentAnswer(student9, pa_20_2_3, "Kinetics is the study of the motion of objects by considering the forces that cause the motion. It involves analyzing the relationship between forces, mass, and acceleration using Newton's laws of motion.");
        addStudentAnswerToProblemAnswer(pa_20_2_3, sa20_2_3_student9);

        StudentAnswer sa20_2_4_student9 = createStudentAnswer(student9, pa_20_2_4, "Newton's laws of motion are three fundamental principles that describe the relationship between the motion of an object and the forces acting on it. They include:\n1. Newton's First Law (Law of Inertia) - An object at rest stays at rest, and an object in motion stays in motion unless acted upon by an external force.\n2. Newton's Second Law (Law of Acceleration) - The acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass (F = ma).\n3. Newton's Third Law (Law of Action and Reaction) - For every action, there is an equal and opposite reaction.");
        addStudentAnswerToProblemAnswer(pa_20_2_4, sa20_2_4_student9);

        StudentAnswer sa20_2_5_student9 = createStudentAnswer(student9, pa_20_2_5, "Projectile motion is the curved path an object follows when it is thrown or projected near the Earth's surface. It is influenced by gravity and initial velocity, and its motion can be analyzed using the equations of motion.");
        addStudentAnswerToProblemAnswer(pa_20_2_5, sa20_2_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa20_2_1_student10 = createStudentAnswer(student10, pa_20_2_1, "Dynamics is the branch of mechanics that deals with bodies in motion. It involves studying the kinematics and kinetics of particles and rigid bodies, and analyzing their motion under the influence of forces.");
        addStudentAnswerToProblemAnswer(pa_20_2_1, sa20_2_1_student10);

        StudentAnswer sa20_2_2_student10 = createStudentAnswer(student10, pa_20_2_2, "Kinematics is the study of the motion of objects without considering the forces that cause the motion. It involves analyzing displacement, velocity, and acceleration of particles and rigid bodies.");
        addStudentAnswerToProblemAnswer(pa_20_2_2, sa20_2_2_student10);

        StudentAnswer sa20_2_3_student10 = createStudentAnswer(student10, pa_20_2_3, "Kinetics is the study of the motion of objects by considering the forces that cause the motion. It involves analyzing the relationship between forces, mass, and acceleration using Newton's laws of motion.");
        addStudentAnswerToProblemAnswer(pa_20_2_3, sa20_2_3_student10);

        StudentAnswer sa20_2_4_student10 = createStudentAnswer(student10, pa_20_2_4, "Newton's laws of motion are three fundamental principles that describe the relationship between the motion of an object and the forces acting on it. They include:\n1. Newton's First Law (Law of Inertia) - An object at rest stays at rest, and an object in motion stays in motion unless acted upon by an external force.\n2. Newton's Second Law (Law of Acceleration) - The acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass (F = ma).\n3. Newton's Third Law (Law of Action and Reaction) - For every action, there is an equal and opposite reaction.");
        addStudentAnswerToProblemAnswer(pa_20_2_4, sa20_2_4_student10);

        StudentAnswer sa20_2_5_student10 = createStudentAnswer(student10, pa_20_2_5, "Projectile motion is the curved path an object follows when it is thrown or projected near the Earth's surface. It is influenced by gravity and initial velocity, and its motion can be analyzed using the equations of motion.");
        addStudentAnswerToProblemAnswer(pa_20_2_5, sa20_2_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers");
// Creating StudentAnswer instances for student9
        StudentAnswer sa20_3_1_student9 = createStudentAnswer(student9, pa_20_3_1, "Thermodynamics is the branch of physics that deals with the study of energy transfer, heat, and work. It involves analyzing the behavior of gases and liquids, and understanding the principles governing energy transformations.");
        addStudentAnswerToProblemAnswer(pa_20_3_1, sa20_3_1_student9);

        StudentAnswer sa20_3_2_student9 = createStudentAnswer(student9, pa_20_3_2, "The laws of thermodynamics are fundamental principles that describe how energy is transferred and transformed:\n1. The First Law (Law of Energy Conservation) - Energy cannot be created or destroyed, only transferred or transformed.\n2. The Second Law - The total entropy of an isolated system always increases over time, and energy transformations are not 100% efficient.\n3. The Third Law - As the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value.");
        addStudentAnswerToProblemAnswer(pa_20_3_2, sa20_3_2_student9);

        StudentAnswer sa20_3_3_student9 = createStudentAnswer(student9, pa_20_3_3, "The First Law of Thermodynamics, also known as the Law of Energy Conservation, states that energy cannot be created or destroyed, only transferred or transformed. It is mathematically expressed as ΔU = Q - W, where ΔU is the change in internal energy, Q is the heat added to the system, and W is the work done by the system.");
        addStudentAnswerToProblemAnswer(pa_20_3_3, sa20_3_3_student9);

        StudentAnswer sa20_3_4_student9 = createStudentAnswer(student9, pa_20_3_4, "The Second Law of Thermodynamics states that the total entropy of an isolated system always increases over time. It implies that energy transformations are not 100% efficient and that some energy is always lost as waste heat.");
        addStudentAnswerToProblemAnswer(pa_20_3_4, sa20_3_4_student9);

        StudentAnswer sa20_3_5_student9 = createStudentAnswer(student9, pa_20_3_5, "The Third Law of Thermodynamics states that as the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value. It implies that it is impossible to reach absolute zero through any finite number of processes.");
        addStudentAnswerToProblemAnswer(pa_20_3_5, sa20_3_5_student9);


        // Creating StudentAnswer instances for student10
        StudentAnswer sa20_3_1_student10 = createStudentAnswer(student10, pa_20_3_1, "Thermodynamics is the branch of physics that deals with the study of energy transfer, heat, and work. It involves analyzing the behavior of gases and liquids, and understanding the principles governing energy transformations.");
        addStudentAnswerToProblemAnswer(pa_20_3_1, sa20_3_1_student10);

        StudentAnswer sa20_3_2_student10 = createStudentAnswer(student10, pa_20_3_2, "The laws of thermodynamics are fundamental principles that describe how energy is transferred and transformed:\n1. The First Law (Law of Energy Conservation) - Energy cannot be created or destroyed, only transferred or transformed.\n2. The Second Law - The total entropy of an isolated system always increases over time, and energy transformations are not 100% efficient.\n3. The Third Law - As the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value.");
        addStudentAnswerToProblemAnswer(pa_20_3_2, sa20_3_2_student10);

        StudentAnswer sa20_3_3_student10 = createStudentAnswer(student10, pa_20_3_3, "The First Law of Thermodynamics, also known as the Law of Energy Conservation, states that energy cannot be created or destroyed, only transferred or transformed. It is mathematically expressed as ΔU = Q - W, where ΔU is the change in internal energy, Q is the heat added to the system, and W is the work done by the system.");
        addStudentAnswerToProblemAnswer(pa_20_3_3, sa20_3_3_student10);

        StudentAnswer sa20_3_4_student10 = createStudentAnswer(student10, pa_20_3_4, "The Second Law of Thermodynamics states that the total entropy of an isolated system always increases over time. It implies that energy transformations are not 100% efficient and that some energy is always lost as waste heat.");
        addStudentAnswerToProblemAnswer(pa_20_3_4, sa20_3_4_student10);

        StudentAnswer sa20_3_5_student10 = createStudentAnswer(student10, pa_20_3_5, "The Third Law of Thermodynamics states that as the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value. It implies that it is impossible to reach absolute zero through any finite number of processes.");
        addStudentAnswerToProblemAnswer(pa_20_3_5, sa20_3_5_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment20_3.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa20_4_1_student9 = createStudentAnswer(student9, pa_20_4_1, "Material science is the study of the properties and behavior of materials. It involves understanding the structure, processing, and performance of different materials, including metals, ceramics, polymers, and composites.");
        addStudentAnswerToProblemAnswer(pa_20_4_1, sa20_4_1_student9);

        StudentAnswer sa20_4_2_student9 = createStudentAnswer(student9, pa_20_4_2, "Metals are materials that are typically hard, shiny, malleable, and conductive. They are used in a wide range of applications, including construction, transportation, electronics, and manufacturing. Examples include iron, aluminum, and copper.");
        addStudentAnswerToProblemAnswer(pa_20_4_2, sa20_4_2_student9);

        StudentAnswer sa20_4_3_student9 = createStudentAnswer(student9, pa_20_4_3, "Ceramics are non-metallic, inorganic materials that are typically hard and brittle. They have high melting points and are used in applications such as pottery, glass, and advanced engineering materials. Examples include clay, porcelain, and silicon carbide.");
        addStudentAnswerToProblemAnswer(pa_20_4_3, sa20_4_3_student9);

        StudentAnswer sa20_4_4_student9 = createStudentAnswer(student9, pa_20_4_4, "Polymers are large molecules made up of repeating units called monomers. They have diverse properties and applications, ranging from plastics and rubber to textiles and biomedical devices. Examples include polyethylene, polystyrene, and DNA.");
        addStudentAnswerToProblemAnswer(pa_20_4_4, sa20_4_4_student9);

        StudentAnswer sa20_4_5_student9 = createStudentAnswer(student9, pa_20_4_5, "Composites are materials made from two or more constituent materials with different properties. They combine the advantages of the individual materials to create a new material with enhanced performance. Examples include fiberglass, carbon fiber, and concrete.");
        addStudentAnswerToProblemAnswer(pa_20_4_5, sa20_4_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa20_4_1_student10 = createStudentAnswer(student10, pa_20_4_1, "Material science is the study of the properties and behavior of materials. It involves understanding the structure, processing, and performance of different materials, including metals, ceramics, polymers, and composites.");
        addStudentAnswerToProblemAnswer(pa_20_4_1, sa20_4_1_student10);

        StudentAnswer sa20_4_2_student10 = createStudentAnswer(student10, pa_20_4_2, "Metals are materials that are typically hard, shiny, malleable, and conductive. They are used in a wide range of applications, including construction, transportation, electronics, and manufacturing. Examples include iron, aluminum, and copper.");
        addStudentAnswerToProblemAnswer(pa_20_4_2, sa20_4_2_student10);

        StudentAnswer sa20_4_3_student10 = createStudentAnswer(student10, pa_20_4_3, "Ceramics are non-metallic, inorganic materials that are typically hard and brittle. They have high melting points and are used in applications such as pottery, glass, and advanced engineering materials. Examples include clay, porcelain, and silicon carbide.");
        addStudentAnswerToProblemAnswer(pa_20_4_3, sa20_4_3_student10);

        StudentAnswer sa20_4_4_student10 = createStudentAnswer(student10, pa_20_4_4, "Polymers are large molecules made up of repeating units called monomers. They have diverse properties and applications, ranging from plastics and rubber to textiles and biomedical devices. Examples include polyethylene, polystyrene, and DNA.");
        addStudentAnswerToProblemAnswer(pa_20_4_4, sa20_4_4_student10);

        StudentAnswer sa20_4_5_student10 = createStudentAnswer(student10, pa_20_4_5, "Composites are materials made from two or more constituent materials with different properties. They combine the advantages of the individual materials to create a new material with enhanced performance. Examples include fiberglass, carbon fiber, and concrete.");
        addStudentAnswerToProblemAnswer(pa_20_4_5, sa20_4_5_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment20_4.");


// Creating submission for student9 with student answers for 17_1
        Submission submission17_1_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17_1_1_student9, sa17_1_2_student9, sa17_1_3_student9, sa17_1_4_student9, sa17_1_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17_1_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_1_9);
        }

// Creating submission for student10 with student answers for 17_1
        Submission submission17_1_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17_1_1_student10, sa17_1_2_student10, sa17_1_3_student10, sa17_1_4_student10, sa17_1_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17_1_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_1_10);
        }
// Creating submission for student9 with student answers for 17_2
        Submission submission17_2_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17_2_1_student9, sa17_2_2_student9, sa17_2_3_student9, sa17_2_4_student9, sa17_2_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17_2_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_2_9);
        }

// Creating submission for student10 with student answers for 17_2
        Submission submission17_2_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17_2_1_student10, sa17_2_2_student10, sa17_2_3_student10, sa17_2_4_student10, sa17_2_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17_2_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_2_10);
        }
// Creating submission for student9 with student answers for 17_3
        Submission submission17_3_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17_3_1_student9, sa17_3_2_student9, sa17_3_3_student9, sa17_3_4_student9, sa17_3_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17_3_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_3_9);
        }

// Creating submission for student10 with student answers for 17_3
        Submission submission17_3_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17_3_1_student10, sa17_3_2_student10, sa17_3_3_student10, sa17_3_4_student10, sa17_3_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17_3_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_3_10);
        }
// Creating submission for student9 with student answers for 17_4
        Submission submission17_4_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17_4_1_student9, sa17_4_2_student9, sa17_4_3_student9, sa17_4_4_student9, sa17_4_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17_4_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_4_9);
        }

// Creating submission for student10 with student answers for 17_4
        Submission submission17_4_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17_4_1_student10, sa17_4_2_student10, sa17_4_3_student10, sa17_4_4_student10, sa17_4_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17_4_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_4_10);
        }
// Creating submission for student9 with student answers for 18_1
        Submission submission18_1_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18_1_1_student9, sa18_1_2_student9, sa18_1_3_student9, sa18_1_4_student9, sa18_1_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18_1_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_1_9);
        }

// Creating submission for student10 with student answers for 18_1
        Submission submission18_1_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18_1_1_student10, sa18_1_2_student10, sa18_1_3_student10, sa18_1_4_student10, sa18_1_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18_1_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_1_10);
        }
// Creating submission for student9 with student answers for 18_2
        Submission submission18_2_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18_2_1_student9, sa18_2_2_student9, sa18_2_3_student9, sa18_2_4_student9, sa18_2_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18_2_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_2_9);
        }

// Creating submission for student10 with student answers for 18_2
        Submission submission18_2_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18_2_1_student10, sa18_2_2_student10, sa18_2_3_student10, sa18_2_4_student10, sa18_2_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18_2_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_2_10);
        }
// Creating submission for student9 with student answers for 18_3
        Submission submission18_3_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18_3_1_student9, sa18_3_2_student9, sa18_3_3_student9, sa18_3_4_student9, sa18_3_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18_3_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_3_9);
        }

// Creating submission for student10 with student answers for 18_3
        Submission submission18_3_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18_3_1_student10, sa18_3_2_student10, sa18_3_3_student10, sa18_3_4_student10, sa18_3_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18_3_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_3_10);
        }
// Creating submission for student9 with student answers for 19_1
        Submission submission19_1_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19_1_1_student9, sa19_1_2_student9, sa19_1_3_student9, sa19_1_4_student9, sa19_1_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19_1_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_1_9);
        }

// Creating submission for student10 with student answers for 19_1
        Submission submission19_1_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19_1_1_student10, sa19_1_2_student10, sa19_1_3_student10, sa19_1_4_student10, sa19_1_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19_1_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_1_10);
        }
// Creating submission for student9 with student answers for 19_2
        Submission submission19_2_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19_2_1_student9, sa19_2_2_student9, sa19_2_3_student9, sa19_2_4_student9, sa19_2_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19_2_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_2_9);
        }

// Creating submission for student10 with student answers for 19_2
        Submission submission19_2_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19_2_1_student10, sa19_2_2_student10, sa19_2_3_student10, sa19_2_4_student10, sa19_2_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19_2_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_2_10);
        }
// Creating submission for student9 with student answers for 19_3
        Submission submission19_3_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19_3_1_student9, sa19_3_2_student9, sa19_3_3_student9, sa19_3_4_student9, sa19_3_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19_3_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_3_9);
        }

// Creating submission for student10 with student answers for 19_3
        Submission submission19_3_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19_3_1_student10, sa19_3_2_student10, sa19_3_3_student10, sa19_3_4_student10, sa19_3_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19_3_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_3_10);
        }
// Creating submission for student9 with student answers for 20_1
        Submission submission20_1_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20_1_1_student9, sa20_1_2_student9, sa20_1_3_student9, sa20_1_4_student9, sa20_1_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20_1_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_1_9);
        }

// Creating submission for student10 with student answers for 20_1
        Submission submission20_1_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20_1_1_student10, sa20_1_2_student10, sa20_1_3_student10, sa20_1_4_student10, sa20_1_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20_1_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_1_10);
        }
// Creating submission for student9 with student answers for 20_2
        Submission submission20_2_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20_2_1_student9, sa20_2_2_student9, sa20_2_3_student9, sa20_2_4_student9, sa20_2_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20_2_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_2_9);
        }

// Creating submission for student10 with student answers for 20_2
        Submission submission20_2_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20_2_1_student10, sa20_2_2_student10, sa20_2_3_student10, sa20_2_4_student10, sa20_2_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20_2_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_2_10);
        }
// Creating submission for student9 with student answers for 20_3
        Submission submission20_3_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20_3_1_student9, sa20_3_2_student9, sa20_3_3_student9, sa20_3_4_student9, sa20_3_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20_3_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_3_9);
        }

// Creating submission for student10 with student answers for 20_3
        Submission submission20_3_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20_3_1_student10, sa20_3_2_student10, sa20_3_3_student10, sa20_3_4_student10, sa20_3_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20_3_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_3_10);
        }
// Creating submission for student9 with student answers for 20_4
        Submission submission20_4_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20_4_1_student9, sa20_4_2_student9, sa20_4_3_student9, sa20_4_4_student9, sa20_4_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20_4_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_4_9);
        }

// Creating submission for student10 with student answers for 20_4
        Submission submission20_4_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20_4_1_student10, sa20_4_2_student10, sa20_4_3_student10, sa20_4_4_student10, sa20_4_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20_4_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_4_10);
        }


        Grade grade17_1_9 = createGrade(87.6, student9, faculty2, course17, submission17_1_9);
        Grade grade17_1_10 = createGrade(85.9, student10, faculty2, course17, submission17_1_10);
        Grade grade17_2_9 = createGrade(89.3, student9, faculty2, course17, submission17_2_9);
        Grade grade17_2_10 = createGrade(86.5, student10, faculty2, course17, submission17_2_10);
        Grade grade17_3_9 = createGrade(88.4, student9, faculty2, course17, submission17_3_9);
        Grade grade17_3_10 = createGrade(87.7, student10, faculty2, course17, submission17_3_10);
        Grade grade17_4_9 = createGrade(85.8, student9, faculty2, course17, submission17_4_9);
        Grade grade17_4_10 = createGrade(89.1, student10, faculty2, course17, submission17_4_10);

        Grade grade18_1_9 = createGrade(87.8, student9, faculty3, course18, submission18_1_9);
        Grade grade18_1_10 = createGrade(89.2, student10, faculty3, course18, submission18_1_10);
        Grade grade18_2_9 = createGrade(86.5, student9, faculty3, course18, submission18_2_9);
        Grade grade18_2_10 = createGrade(88.1, student10, faculty3, course18, submission18_2_10);
        Grade grade18_3_9 = createGrade(87.3, student9, faculty3, course18, submission18_3_9);
        Grade grade18_3_10 = createGrade(85.6, student10, faculty3, course18, submission18_3_10);

        Grade grade19_1_9 = createGrade(88.4, student9, faculty4, course19, submission19_1_9);
        Grade grade19_1_10 = createGrade(86.9, student10, faculty4, course19, submission19_1_10);
        Grade grade19_2_9 = createGrade(87.7, student9, faculty4, course19, submission19_2_9);
        Grade grade19_2_10 = createGrade(89.3, student10, faculty4, course19, submission19_2_10);
        Grade grade19_3_9 = createGrade(85.8, student9, faculty4, course19, submission19_3_9);
        Grade grade19_3_10 = createGrade(88.1, student10, faculty4, course19, submission19_3_10);

        Grade grade20_1_9 = createGrade(88.9, student9, faculty5, course20, submission20_1_9);
        Grade grade20_1_10 = createGrade(86.5, student10, faculty5, course20, submission20_1_10);
        Grade grade20_2_9 = createGrade(87.6, student9, faculty5, course20, submission20_2_9);
        Grade grade20_2_10 = createGrade(89.4, student10, faculty5, course20, submission20_2_10);
        Grade grade20_3_9 = createGrade(86.2, student9, faculty5, course20, submission20_3_9);
        Grade grade20_3_10 = createGrade(88.3, student10, faculty5, course20, submission20_3_10);
        Grade grade20_4_9 = createGrade(87.7, student9, faculty5, course20, submission20_4_9);
        Grade grade20_4_10 = createGrade(85.8, student10, faculty5, course20, submission20_4_10);

        CourseGrade courseGrade17_1_9 = createCourseGrade(student9, course17, 87.775, List.of(grade17_1_9, grade17_2_9, grade17_3_9, grade17_4_9));
        CourseGrade courseGrade17_1_10 = createCourseGrade(student10, course17, 87.3, List.of(grade17_1_10, grade17_2_10, grade17_3_10, grade17_4_10));

        CourseGrade courseGrade18_1_9 = createCourseGrade(student9, course18, 87.2, List.of(grade18_1_9, grade18_2_9, grade18_3_9));
        CourseGrade courseGrade18_1_10 = createCourseGrade(student10, course18, 87.6333, List.of(grade18_1_10, grade18_2_10, grade18_3_10));

        CourseGrade courseGrade19_1_9 = createCourseGrade(student9, course19, 87.3, List.of(grade19_1_9, grade19_2_9, grade19_3_9));
        CourseGrade courseGrade19_1_10 = createCourseGrade(student10, course19, 88.1, List.of(grade19_1_10, grade19_2_10, grade19_3_10));

        CourseGrade courseGrade20_1_9 = createCourseGrade(student9, course20, 87.6, List.of(grade20_1_9, grade20_2_9, grade20_3_9, grade20_4_9));
        CourseGrade courseGrade20_1_10 = createCourseGrade(student10, course20, 87.5, List.of(grade20_1_10, grade20_2_10, grade20_3_10, grade20_4_10));

        Feedback feedback17_1_9 = createFeedback("Excellent work, student9!", submission17_1_9);
        Feedback feedback17_1_10 = createFeedback("Great effort, student10!", submission17_1_10);

        Feedback feedback17_2_9 = createFeedback("Impressive answers, student9.", submission17_2_9);
        Feedback feedback17_2_10 = createFeedback("Nice job, student10.", submission17_2_10);

        Feedback feedback17_3_9 = createFeedback("Well done on the answers, student9.", submission17_3_9);
        Feedback feedback17_3_10 = createFeedback("Good work, student10!", submission17_3_10);

        Feedback feedback17_4_9 = createFeedback("Great effort, student9!", submission17_4_9);
        Feedback feedback17_4_10 = createFeedback("Well done, student10!", submission17_4_10);

        Feedback feedback18_1_9 = createFeedback("Excellent work, student9!", submission18_1_9);
        Feedback feedback18_1_10 = createFeedback("Great effort, student10!", submission18_1_10);

        Feedback feedback18_2_9 = createFeedback("Impressive answers, student9.", submission18_2_9);
        Feedback feedback18_2_10 = createFeedback("Nice job, student10.", submission18_2_10);

        Feedback feedback18_3_9 = createFeedback("Well done on the answers, student9.", submission18_3_9);
        Feedback feedback18_3_10 = createFeedback("Good work, student10!", submission18_3_10);

        Feedback feedback19_1_9 = createFeedback("Excellent work, student9!", submission19_1_9);
        Feedback feedback19_1_10 = createFeedback("Great effort, student10!", submission19_1_10);

        Feedback feedback19_2_9 = createFeedback("Impressive answers, student9.", submission19_2_9);
        Feedback feedback19_2_10 = createFeedback("Nice job, student10.", submission19_2_10);

        Feedback feedback19_3_9 = createFeedback("Well done on the answers, student9.", submission19_3_9);
        Feedback feedback19_3_10 = createFeedback("Good work, student10!", submission19_3_10);

        Feedback feedback20_1_9 = createFeedback("Excellent work, student9!", submission20_1_9);
        Feedback feedback20_1_10 = createFeedback("Great effort, student10!", submission20_1_10);

        Feedback feedback20_2_9 = createFeedback("Impressive answers, student9.", submission20_2_9);
        Feedback feedback20_2_10 = createFeedback("Nice job, student10.", submission20_2_10);

        Feedback feedback20_3_9 = createFeedback("Well done on the answers, student9.", submission20_3_9);
        Feedback feedback20_3_10 = createFeedback("Good work, student10!", submission20_3_10);

        Feedback feedback20_4_9 = createFeedback("Great effort, student9!", submission20_4_9);
        Feedback feedback20_4_10 = createFeedback("Well done, student10!", submission20_4_10);

        course17.setGrades(List.of(grade17_1_9, grade17_1_10, grade17_2_9, grade17_2_10, grade17_3_9, grade17_3_10, grade17_4_9, grade17_4_10));
        course18.setGrades(List.of(grade18_1_9, grade18_1_10, grade18_2_9, grade18_2_10, grade18_3_9, grade18_3_10));
        course19.setGrades(List.of(grade19_1_9, grade19_1_10, grade19_2_9, grade19_2_10, grade19_3_9, grade19_3_10));
        course20.setGrades(List.of(grade20_1_9, grade20_1_10, grade20_2_9, grade20_2_10, grade20_3_9, grade20_3_10, grade20_4_9, grade20_4_10));

        course17.setCourseGrades(List.of(courseGrade17_1_9, courseGrade17_1_10));
        course18.setCourseGrades(List.of(courseGrade18_1_9, courseGrade18_1_10));
        course19.setCourseGrades(List.of(courseGrade19_1_9, courseGrade19_1_10));
        course20.setCourseGrades(List.of(courseGrade20_1_9, courseGrade20_1_10));

        createFacultyWithAssignment(faculty2, List.of(grade17_1_9, grade17_1_10, grade17_2_9, grade17_2_10, grade17_3_9, grade17_3_10, grade17_4_9, grade17_4_10), List.of(assignment17_1, assignment17_2, assignment17_3, assignment17_4));
        createFacultyWithAssignment(faculty2, List.of(grade18_1_9, grade18_1_10, grade18_2_9, grade18_2_10, grade18_3_9, grade18_3_10), List.of(assignment18_1, assignment18_2, assignment18_3));
        createFacultyWithAssignment(faculty2, List.of(grade19_1_9, grade19_1_10, grade19_2_9, grade19_2_10, grade19_3_9, grade19_3_10), List.of(assignment19_1, assignment19_2, assignment19_3));
        createFacultyWithAssignment(faculty2, List.of(grade20_1_9, grade20_1_10, grade20_2_9, grade20_2_10, grade20_3_9, grade20_3_10, grade20_4_9, grade20_4_10), List.of(assignment20_1, assignment20_2, assignment20_3, assignment20_4));

        linkSubmissionDetails(submission17_1_9, student9, grade17_1_9, feedback17_1_9, List.of(sa17_1_1_student9, sa17_1_2_student9, sa17_1_3_student9, sa17_1_4_student9, sa17_1_5_student9));
        linkSubmissionDetails(submission17_1_10, student10, grade17_1_10, feedback17_1_10, List.of(sa17_1_1_student10, sa17_1_2_student10, sa17_1_3_student10, sa17_1_4_student10, sa17_1_5_student10));
        linkSubmissionDetails(submission17_2_9, student9, grade17_2_9, feedback17_2_9, List.of(sa17_2_1_student9, sa17_2_2_student9, sa17_2_3_student9, sa17_2_4_student9, sa17_2_5_student9));
        linkSubmissionDetails(submission17_2_10, student10, grade17_2_10, feedback17_2_10, List.of(sa17_2_1_student10, sa17_2_2_student10, sa17_2_3_student10, sa17_2_4_student10, sa17_2_5_student10));
        linkSubmissionDetails(submission17_3_9, student9, grade17_3_9, feedback17_3_9, List.of(sa17_3_1_student9, sa17_3_2_student9, sa17_3_3_student9, sa17_3_4_student9, sa17_3_5_student9));
        linkSubmissionDetails(submission17_3_10, student10, grade17_3_10, feedback17_3_10, List.of(sa17_3_1_student10, sa17_3_2_student10, sa17_3_3_student10, sa17_3_4_student10, sa17_3_5_student10));
        linkSubmissionDetails(submission17_4_9, student9, grade17_4_9, feedback17_4_9, List.of(sa17_4_1_student9, sa17_4_2_student9, sa17_4_3_student9, sa17_4_4_student9, sa17_4_5_student9));
        linkSubmissionDetails(submission17_4_10, student10, grade17_4_10, feedback17_4_10, List.of(sa17_4_1_student10, sa17_4_2_student10, sa17_4_3_student10, sa17_4_4_student10, sa17_4_5_student10));

        linkSubmissionDetails(submission18_1_9, student9, grade18_1_9, feedback18_1_9, List.of(sa18_1_1_student9, sa18_1_2_student9, sa18_1_3_student9, sa18_1_4_student9, sa18_1_5_student9));
        linkSubmissionDetails(submission18_1_10, student10, grade18_1_10, feedback18_1_10, List.of(sa18_1_1_student10, sa18_1_2_student10, sa18_1_3_student10, sa18_1_4_student10, sa18_1_5_student10));
        linkSubmissionDetails(submission18_2_9, student9, grade18_2_9, feedback18_2_9, List.of(sa18_2_1_student9, sa18_2_2_student9, sa18_2_3_student9, sa18_2_4_student9, sa18_2_5_student9));
        linkSubmissionDetails(submission18_2_10, student10, grade18_2_10, feedback18_2_10, List.of(sa18_2_1_student10, sa18_2_2_student10, sa18_2_3_student10, sa18_2_4_student10, sa18_2_5_student10));
        linkSubmissionDetails(submission18_3_9, student9, grade18_3_9, feedback18_3_9, List.of(sa18_3_1_student9, sa18_3_2_student9, sa18_3_3_student9, sa18_3_4_student9, sa18_3_5_student9));
        linkSubmissionDetails(submission18_3_10, student10, grade18_3_10, feedback18_3_10, List.of(sa18_3_1_student10, sa18_3_2_student10, sa18_3_3_student10, sa18_3_4_student10, sa18_3_5_student10));

        linkSubmissionDetails(submission19_1_9, student9, grade19_1_9, feedback19_1_9, List.of(sa19_1_1_student9, sa19_1_2_student9, sa19_1_3_student9, sa19_1_4_student9, sa19_1_5_student9));
        linkSubmissionDetails(submission19_1_10, student10, grade19_1_10, feedback19_1_10, List.of(sa19_1_1_student10, sa19_1_2_student10, sa19_1_3_student10, sa19_1_4_student10, sa19_1_5_student10));
        linkSubmissionDetails(submission19_2_9, student9, grade19_2_9, feedback19_2_9, List.of(sa19_2_1_student9, sa19_2_2_student9, sa19_2_3_student9, sa19_2_4_student9, sa19_2_5_student9));
        linkSubmissionDetails(submission19_2_10, student10, grade19_2_10, feedback19_2_10, List.of(sa19_2_1_student10, sa19_2_2_student10, sa19_2_3_student10, sa19_2_4_student10, sa19_2_5_student10));
        linkSubmissionDetails(submission19_3_9, student9, grade19_3_9, feedback19_3_9, List.of(sa19_3_1_student9, sa19_3_2_student9, sa19_3_3_student9, sa19_3_4_student9, sa19_3_5_student9));
        linkSubmissionDetails(submission19_3_10, student10, grade19_3_10, feedback19_3_10, List.of(sa19_3_1_student10, sa19_3_2_student10, sa19_3_3_student10, sa19_3_4_student10, sa19_3_5_student10));

        linkSubmissionDetails(submission20_1_9, student9, grade20_1_9, feedback20_1_9, List.of(sa20_1_1_student9, sa20_1_2_student9, sa20_1_3_student9, sa20_1_4_student9, sa20_1_5_student9));
        linkSubmissionDetails(submission20_1_10, student10, grade20_1_10, feedback20_1_10, List.of(sa20_1_1_student10, sa20_1_2_student10, sa20_1_3_student10, sa20_1_4_student10, sa20_1_5_student10));
        linkSubmissionDetails(submission20_2_9, student9, grade20_2_9, feedback20_2_9, List.of(sa20_2_1_student9, sa20_2_2_student9, sa20_2_3_student9, sa20_2_4_student9, sa20_2_5_student9));
        linkSubmissionDetails(submission20_2_10, student10, grade20_2_10, feedback20_2_10, List.of(sa20_2_1_student10, sa20_2_2_student10, sa20_2_3_student10, sa20_2_4_student10, sa20_2_5_student10));
        linkSubmissionDetails(submission20_3_9, student9, grade20_3_9, feedback20_3_9, List.of(sa20_3_1_student9, sa20_3_2_student9, sa20_3_3_student9, sa20_3_4_student9, sa20_3_5_student9));
        linkSubmissionDetails(submission20_3_10, student10, grade20_3_10, feedback20_3_10, List.of(sa20_3_1_student10, sa20_3_2_student10, sa20_3_3_student10, sa20_3_4_student10, sa20_3_5_student10));
        linkSubmissionDetails(submission20_4_9, student9, grade20_4_9, feedback20_4_9, List.of(sa20_4_1_student9, sa20_4_2_student9, sa20_4_3_student9, sa20_4_4_student9, sa20_4_5_student9));
        linkSubmissionDetails(submission20_4_10, student10, grade20_4_10, feedback20_4_10, List.of(sa20_4_1_student10, sa20_4_2_student10, sa20_4_3_student10, sa20_4_4_student10, sa20_4_5_student10));

    }
}
