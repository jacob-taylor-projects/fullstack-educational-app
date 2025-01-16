package com.project.education_app;

import com.project.education_app.entities.*;
import com.project.education_app.repos.CourseRepo;
import com.project.education_app.repos.FacultyRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.repos.SyllabusRepo;
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
import static com.project.education_app.Assignment1to4Seeder.addStudentAnswerToProblemAnswer;
import static com.project.education_app.Seeder.*;
import static com.project.education_app.Seeder.createGrade;
import static com.project.education_app.Test1to4Seeder.*;


@Component
@Order(12)
@Data
public class Test17to20Seeder implements CommandLineRunner {
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

        // Creating the test for Unit 1: Cell Structure
        Test test17a = createTest("Cell Structure Test", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        addStudentToTest(test17a, student9);
        addStudentToTest(test17a, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa17a_1 = createProblemAnswer("What are the main components of a cell?", "The main components of a cell include the cell membrane, nucleus, cytoplasm, and various organelles such as mitochondria, ribosomes, endoplasmic reticulum, Golgi apparatus, and lysosomes.");
        addTestToProblemAnswer(pa17a_1, test17a);
        addProblemAnswerToTest(test17a, pa17a_1);

        ProblemAnswer pa17a_2 = createProblemAnswer("What is the function of the cell membrane?", "The cell membrane, also known as the plasma membrane, controls the movement of substances in and out of the cell. It provides protection and support to the cell and helps maintain its shape.");
        addTestToProblemAnswer(pa17a_2, test17a);
        addProblemAnswerToTest(test17a, pa17a_2);

        ProblemAnswer pa17a_3 = createProblemAnswer("What is the role of the nucleus in a cell?", "The nucleus is the control center of the cell, containing the cell's genetic material (DNA). It regulates gene expression, cell growth, and reproduction, and directs various cellular activities.");
        addTestToProblemAnswer(pa17a_3, test17a);
        addProblemAnswerToTest(test17a, pa17a_3);

        ProblemAnswer pa17a_4 = createProblemAnswer("What are organelles?", "Organelles are specialized structures within a cell that perform specific functions. Examples include mitochondria (energy production), ribosomes (protein synthesis), and the endoplasmic reticulum (protein and lipid processing).");
        addTestToProblemAnswer(pa17a_4, test17a);
        addProblemAnswerToTest(test17a, pa17a_4);

        ProblemAnswer pa17a_5 = createProblemAnswer("What is the difference between prokaryotic and eukaryotic cells?", "Prokaryotic cells lack a true nucleus and membrane-bound organelles, while eukaryotic cells have a defined nucleus and various membrane-bound organelles. Prokaryotes include bacteria and archaea, whereas eukaryotes include plants, animals, fungi, and protists.");
        addTestToProblemAnswer(pa17a_5, test17a);
        addProblemAnswerToTest(test17a, pa17a_5);

// Output for confirmation
        System.out.println("Test for 'Cell Structure' unit created with 10 problem answers.");
// Creating the test for Unit 2: Genetics
        Test test17b = createTest("Genetics Test", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        addStudentToTest(test17b, student9);
        addStudentToTest(test17b, student10);
// Creating and adding problem answers to the test
        ProblemAnswer pa17b_1 = createProblemAnswer("What is genetics?", "Genetics is the study of heredity and the variation of inherited characteristics. It involves understanding how traits are passed from parents to offspring through genes.");
        addTestToProblemAnswer(pa17b_1, test17b);
        addProblemAnswerToTest(test17b, pa17b_1);

        ProblemAnswer pa17b_2 = createProblemAnswer("What are the principles of Mendelian genetics?", "The principles of Mendelian genetics, established by Gregor Mendel, include the Law of Segregation (each individual has two alleles for each gene, which separate during gamete formation) and the Law of Independent Assortment (genes for different traits can segregate independently during the formation of gametes).");
        addTestToProblemAnswer(pa17b_2, test17b);
        addProblemAnswerToTest(test17b, pa17b_2);

        ProblemAnswer pa17b_3 = createProblemAnswer("What is DNA?", "DNA (deoxyribonucleic acid) is the molecule that carries the genetic instructions for life. It consists of two strands forming a double helix, with each strand composed of nucleotides containing a sugar, phosphate group, and a nitrogenous base (adenine, thymine, cytosine, or guanine).");
        addTestToProblemAnswer(pa17b_3, test17b);
        addProblemAnswerToTest(test17b, pa17b_3);

        ProblemAnswer pa17b_4 = createProblemAnswer("What is the function of DNA?", "The function of DNA is to store and transmit genetic information. It provides the instructions for building and maintaining an organism and guides the production of proteins through the processes of transcription and translation.");
        addTestToProblemAnswer(pa17b_4, test17b);
        addProblemAnswerToTest(test17b, pa17b_4);

        ProblemAnswer pa17b_5 = createProblemAnswer("What is replication?", "Replication is the process by which DNA is copied before cell division. It ensures that each daughter cell receives an exact copy of the parent cell's DNA. The process involves unwinding the DNA double helix and using each strand as a template to synthesize a new complementary strand.");
        addTestToProblemAnswer(pa17b_5, test17b);
        addProblemAnswerToTest(test17b, pa17b_5);

// Output for confirmation
        System.out.println("Test for 'Genetics' unit created with 10 problem answers.");
// Creating the test for Unit 3: Evolution
        Test test17c = createTest("Evolution Test", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        addStudentToTest(test17c, student9);
        addStudentToTest(test17c, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa17c_1 = createProblemAnswer("What is the theory of evolution?", "The theory of evolution, developed by Charles Darwin, explains how species change over time through the process of natural selection. It states that organisms with traits better suited to their environment are more likely to survive and reproduce, passing those traits to their offspring.");
        addTestToProblemAnswer(pa17c_1, test17c);
        addProblemAnswerToTest(test17c, pa17c_1);

        ProblemAnswer pa17c_2 = createProblemAnswer("What is natural selection?", "Natural selection is the process by which individuals with advantageous traits are more likely to survive and reproduce, leading to the gradual accumulation of those traits in a population over generations.");
        addTestToProblemAnswer(pa17c_2, test17c);
        addProblemAnswerToTest(test17c, pa17c_2);

        ProblemAnswer pa17c_3 = createProblemAnswer("What is genetic variation?", "Genetic variation is the diversity of gene combinations within a population. It is essential for evolution as it provides the raw material for natural selection to act upon.");
        addTestToProblemAnswer(pa17c_3, test17c);
        addProblemAnswerToTest(test17c, pa17c_3);

        ProblemAnswer pa17c_4 = createProblemAnswer("What is a mutation?", "A mutation is a change in the DNA sequence of an organism. Mutations can introduce new genetic variations and are a source of genetic diversity in a population.");
        addTestToProblemAnswer(pa17c_4, test17c);
        addProblemAnswerToTest(test17c, pa17c_4);

        ProblemAnswer pa17c_5 = createProblemAnswer("What is an adaptation?", "An adaptation is a trait that increases an organism's chances of survival and reproduction in a particular environment. Adaptations result from the process of natural selection acting on genetic variation.");
        addTestToProblemAnswer(pa17c_5, test17c);
        addProblemAnswerToTest(test17c, pa17c_5);

// Output for confirmation
        System.out.println("Test for 'Evolution' unit created with 10 problem answers.");
// Creating the test for Unit 4: Ecology
        Test test17d = createTest("Ecology Test", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);
        addStudentToTest(test17d, student9);
        addStudentToTest(test17d, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa17d_1 = createProblemAnswer("What is ecology?", "Ecology is the study of interactions between organisms and their environment. It examines how living things interact with each other and with their physical surroundings.");
        addTestToProblemAnswer(pa17d_1, test17d);
        addProblemAnswerToTest(test17d, pa17d_1);

        ProblemAnswer pa17d_2 = createProblemAnswer("What are ecosystems?", "Ecosystems are communities of living organisms interacting with their physical environment. They include both biotic (living) components, such as plants and animals, and abiotic (non-living) components, such as water, soil, and climate.");
        addTestToProblemAnswer(pa17d_2, test17d);
        addProblemAnswerToTest(test17d, pa17d_2);

        ProblemAnswer pa17d_3 = createProblemAnswer("What is a food web?", "A food web is a complex network of interconnected food chains within an ecosystem. It illustrates the feeding relationships and energy flow between different organisms, showing how energy is transferred from producers to consumers and decomposers.");
        addTestToProblemAnswer(pa17d_3, test17d);
        addProblemAnswerToTest(test17d, pa17d_3);

        ProblemAnswer pa17d_4 = createProblemAnswer("What is energy flow in an ecosystem?", "Energy flow in an ecosystem refers to the transfer of energy from one trophic level to another. Energy enters the ecosystem through photosynthesis by producers, and it is passed on to consumers and decomposers through feeding relationships.");
        addTestToProblemAnswer(pa17d_4, test17d);
        addProblemAnswerToTest(test17d, pa17d_4);

        ProblemAnswer pa17d_5 = createProblemAnswer("What are the levels of organization in ecology?", "The levels of organization in ecology, from smallest to largest, are: organism, population, community, ecosystem, biome, and biosphere. Each level represents a different scale of interaction between living organisms and their environment.");
        addTestToProblemAnswer(pa17d_5, test17d);
        addProblemAnswerToTest(test17d, pa17d_5);

// Output for confirmation
        System.out.println("Test for 'Ecology' unit created with 10 problem answers.");
// Creating the test for Unit 1: Engineering Disciplines
        Test test18a = createTest("Engineering Disciplines Test", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);
        addStudentToTest(test18a, student9);
        addStudentToTest(test18a, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa18a_1 = createProblemAnswer("What is civil engineering?", "Civil engineering is a discipline that deals with the design, construction, and maintenance of infrastructure such as roads, bridges, buildings, and water supply systems. Civil engineers work on projects that improve the built environment and enhance public safety.");
        addTestToProblemAnswer(pa18a_1, test18a);
        addProblemAnswerToTest(test18a, pa18a_1);

        ProblemAnswer pa18a_2 = createProblemAnswer("What is mechanical engineering?", "Mechanical engineering is a discipline that involves the design, analysis, manufacturing, and maintenance of mechanical systems. Mechanical engineers work on projects ranging from small devices to large machinery, including engines, HVAC systems, and robotics.");
        addTestToProblemAnswer(pa18a_2, test18a);
        addProblemAnswerToTest(test18a, pa18a_2);

        ProblemAnswer pa18a_3 = createProblemAnswer("What is electrical engineering?", "Electrical engineering is a discipline focused on the study and application of electricity, electronics, and electromagnetism. Electrical engineers design and develop electrical systems, including power generation, transmission, and distribution, as well as electronic devices and communication systems.");
        addTestToProblemAnswer(pa18a_3, test18a);
        addProblemAnswerToTest(test18a, pa18a_3);

        ProblemAnswer pa18a_4 = createProblemAnswer("What is chemical engineering?", "Chemical engineering is a discipline that combines principles of chemistry, physics, mathematics, and engineering to design and operate processes that convert raw materials into valuable products. Chemical engineers work in industries such as pharmaceuticals, petrochemicals, and food processing.");
        addTestToProblemAnswer(pa18a_4, test18a);
        addProblemAnswerToTest(test18a, pa18a_4);

        ProblemAnswer pa18a_5 = createProblemAnswer("What are the roles of civil engineers?", "Civil engineers are responsible for planning, designing, constructing, and maintaining infrastructure projects. They ensure the safety, functionality, and sustainability of structures such as roads, bridges, buildings, and water supply systems.");
        addTestToProblemAnswer(pa18a_5, test18a);
        addProblemAnswerToTest(test18a, pa18a_5);

// Output for confirmation
        System.out.println("Test for 'Engineering Disciplines' unit created with 10 problem answers.");
// Creating the test for Unit 2: Problem-Solving
        Test test18b = createTest("Problem-Solving Test", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);
        addStudentToTest(test18b, student9);
        addStudentToTest(test18b, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa18b_1 = createProblemAnswer("What is the engineering problem-solving process?", "The engineering problem-solving process is a systematic approach to addressing engineering challenges. It involves defining the problem, conducting research, generating potential solutions, selecting the best solution, implementing the solution, and evaluating the results.");
        addTestToProblemAnswer(pa18b_1, test18b);
        addProblemAnswerToTest(test18b, pa18b_1);

        ProblemAnswer pa18b_2 = createProblemAnswer("How do you define a problem in engineering?", "Defining a problem in engineering involves identifying the specific issue or need, understanding the constraints and requirements, and clearly stating the problem in a way that guides the development of solutions.");
        addTestToProblemAnswer(pa18b_2, test18b);
        addProblemAnswerToTest(test18b, pa18b_2);

        ProblemAnswer pa18b_3 = createProblemAnswer("What is brainstorming in the context of engineering problem-solving?", "Brainstorming is a creative process used to generate a wide range of potential solutions to an engineering problem. It encourages free thinking and the sharing of ideas without immediate evaluation or criticism.");
        addTestToProblemAnswer(pa18b_3, test18b);
        addProblemAnswerToTest(test18b, pa18b_3);

        ProblemAnswer pa18b_4 = createProblemAnswer("How do engineers select the best solution to a problem?", "Engineers select the best solution by evaluating the potential solutions based on criteria such as feasibility, cost, effectiveness, safety, and sustainability. They use decision-making tools and techniques to compare and rank the solutions.");
        addTestToProblemAnswer(pa18b_4, test18b);
        addProblemAnswerToTest(test18b, pa18b_4);

        ProblemAnswer pa18b_5 = createProblemAnswer("What is implementation in the engineering problem-solving process?", "Implementation involves putting the chosen solution into practice. This includes designing, developing, testing, and deploying the solution, as well as managing the resources and timelines required for successful implementation.");
        addTestToProblemAnswer(pa18b_5, test18b);
        addProblemAnswerToTest(test18b, pa18b_5);

// Output for confirmation
        System.out.println("Test for 'Problem-Solving' unit created with 10 problem answers.");
// Creating the test for Unit 3: Design Process
        Test test18c = createTest("Design Process Test", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);
        addStudentToTest(test18c, student9);
        addStudentToTest(test18c, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa18c_1 = createProblemAnswer("What is the engineering design process?", "The engineering design process is a systematic approach to solving engineering problems. It involves defining requirements, brainstorming, prototyping, testing, and iteration to develop and refine solutions.");
        addTestToProblemAnswer(pa18c_1, test18c);
        addProblemAnswerToTest(test18c, pa18c_1);

        ProblemAnswer pa18c_2 = createProblemAnswer("What are the stages of the design process?", "The stages of the design process typically include defining the problem, researching and gathering information, generating ideas, developing and testing prototypes, evaluating and refining the solution, and finalizing and implementing the design.");
        addTestToProblemAnswer(pa18c_2, test18c);
        addProblemAnswerToTest(test18c, pa18c_2);

        ProblemAnswer pa18c_3 = createProblemAnswer("How do engineers define requirements in the design process?", "Engineers define requirements by identifying the specific needs and constraints of the project. This includes understanding the problem, setting clear objectives, and determining the criteria for a successful solution.");
        addTestToProblemAnswer(pa18c_3, test18c);
        addProblemAnswerToTest(test18c, pa18c_3);

        ProblemAnswer pa18c_4 = createProblemAnswer("What is the importance of brainstorming in the design process?", "Brainstorming is important because it encourages the generation of a wide range of ideas and solutions. It fosters creativity and collaboration, allowing engineers to explore different approaches and identify the best possible solution.");
        addTestToProblemAnswer(pa18c_4, test18c);
        addProblemAnswerToTest(test18c, pa18c_4);

        ProblemAnswer pa18c_5 = createProblemAnswer("What is prototyping in the design process?", "Prototyping involves creating a preliminary model or version of a solution to test its feasibility and functionality. Prototypes allow engineers to identify potential issues, gather feedback, and make improvements before finalizing the design.");
        addTestToProblemAnswer(pa18c_5, test18c);
        addProblemAnswerToTest(test18c, pa18c_5);

// Output for confirmation
        System.out.println("Test for 'Design Process' unit created with 10 problem answers.");
// Creating the test for Unit 1: Circuit Analysis
        Test test19a = createTest("Circuit Analysis Test", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);
        addStudentToTest(test19a, student9);
        addStudentToTest(test19a, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa19a_1 = createProblemAnswer("What is Ohm's law?", "Ohm's law states that the current flowing through a conductor between two points is directly proportional to the voltage across the two points. It is mathematically expressed as V = IR, where V is voltage, I is current, and R is resistance.");
        addTestToProblemAnswer(pa19a_1, test19a);
        addProblemAnswerToTest(test19a, pa19a_1);

        ProblemAnswer pa19a_2 = createProblemAnswer("What are Kirchhoff's laws?", "Kirchhoff's laws include Kirchhoff's Current Law (KCL) and Kirchhoff's Voltage Law (KVL). KCL states that the total current entering a junction equals the total current leaving the junction. KVL states that the sum of all voltages around a closed loop equals zero.");
        addTestToProblemAnswer(pa19a_2, test19a);
        addProblemAnswerToTest(test19a, pa19a_2);

        ProblemAnswer pa19a_3 = createProblemAnswer("How do you calculate voltage in a circuit?", "Voltage in a circuit can be calculated using Ohm's law (V = IR) and Kirchhoff's Voltage Law (KVL). For a series circuit, the total voltage is the sum of the voltages across each component. For a parallel circuit, the voltage is the same across each branch.");
        addTestToProblemAnswer(pa19a_3, test19a);
        addProblemAnswerToTest(test19a, pa19a_3);

        ProblemAnswer pa19a_4 = createProblemAnswer("How do you calculate current in a circuit?", "Current in a circuit can be calculated using Ohm's law (I = V/R) and Kirchhoff's Current Law (KCL). For a series circuit, the current is the same through each component. For a parallel circuit, the total current is the sum of the currents in each branch.");
        addTestToProblemAnswer(pa19a_4, test19a);
        addProblemAnswerToTest(test19a, pa19a_4);

        ProblemAnswer pa19a_5 = createProblemAnswer("What are the techniques for analyzing DC circuits?", "Techniques for analyzing DC circuits include using Ohm's law, Kirchhoff's laws, voltage division, current division, mesh analysis, and nodal analysis. These techniques help determine the voltage, current, and resistance in various parts of the circuit.");
        addTestToProblemAnswer(pa19a_5, test19a);
        addProblemAnswerToTest(test19a, pa19a_5);

// Output for confirmation
        System.out.println("Test for 'Circuit Analysis' unit created with 10 problem answers.");
// Creating the test for Unit 2: Signal Processing
        Test test19b = createTest("Signal Processing Test", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);
        addStudentToTest(test19b, student9);
        addStudentToTest(test19b, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa19b_1 = createProblemAnswer("What is signal processing?", "Signal processing is the analysis, manipulation, and interpretation of signals. It involves techniques for filtering, transforming, and extracting information from signals in various forms, such as audio, video, and data.");
        addTestToProblemAnswer(pa19b_1, test19b);
        addProblemAnswerToTest(test19b, pa19b_1);

        ProblemAnswer pa19b_2 = createProblemAnswer("What is a Fourier transform?", "A Fourier transform is a mathematical technique used to transform a signal from the time domain to the frequency domain. It decomposes a signal into its constituent frequencies, allowing analysis of the signal's frequency content.");
        addTestToProblemAnswer(pa19b_2, test19b);
        addProblemAnswerToTest(test19b, pa19b_2);

        ProblemAnswer pa19b_3 = createProblemAnswer("What is filtering in signal processing?", "Filtering is the process of removing unwanted components or noise from a signal. Filters can be designed to pass certain frequencies while attenuating others, such as low-pass, high-pass, band-pass, and band-stop filters.");
        addTestToProblemAnswer(pa19b_3, test19b);
        addProblemAnswerToTest(test19b, pa19b_3);

        ProblemAnswer pa19b_4 = createProblemAnswer("What is digital signal processing (DSP)?", "Digital signal processing (DSP) involves the manipulation of signals using digital techniques. DSP algorithms are implemented on digital hardware, allowing for efficient processing, analysis, and transformation of signals in digital form.");
        addTestToProblemAnswer(pa19b_4, test19b);
        addProblemAnswerToTest(test19b, pa19b_4);

        ProblemAnswer pa19b_5 = createProblemAnswer("What are the applications of signal processing?", "Applications of signal processing include telecommunications (signal transmission and reception), audio and video processing (enhancement and compression), medical imaging (MRI and CT scans), and radar and sonar systems (target detection and tracking).");
        addTestToProblemAnswer(pa19b_5, test19b);
        addProblemAnswerToTest(test19b, pa19b_5);

// Output for confirmation
        System.out.println("Test for 'Signal Processing' unit created with 10 problem answers.");
// Creating the test for Unit 3: Systems Theory
        Test test19c = createTest("Systems Theory Test", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);
        addStudentToTest(test19c, student9);
        addStudentToTest(test19c, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa19c_1 = createProblemAnswer("What is systems theory?", "Systems theory is the study of systems, which are sets of interacting components working together as a whole. It focuses on understanding the behavior, structure, and dynamics of complex systems.");
        addTestToProblemAnswer(pa19c_1, test19c);
        addProblemAnswerToTest(test19c, pa19c_1);

        ProblemAnswer pa19c_2 = createProblemAnswer("What is system modeling?", "System modeling involves creating abstract representations of systems to analyze their behavior and predict their performance. Models can be mathematical, graphical, or computational and help in understanding and designing systems.");
        addTestToProblemAnswer(pa19c_2, test19c);
        addProblemAnswerToTest(test19c, pa19c_2);

        ProblemAnswer pa19c_3 = createProblemAnswer("What is feedback in systems theory?", "Feedback is a process in which the output of a system is fed back into the system as input, influencing its future behavior. Positive feedback amplifies changes, while negative feedback stabilizes the system.");
        addTestToProblemAnswer(pa19c_3, test19c);
        addProblemAnswerToTest(test19c, pa19c_3);

        ProblemAnswer pa19c_4 = createProblemAnswer("What are control systems?", "Control systems are systems designed to regulate the behavior of other systems. They use feedback and control mechanisms to maintain desired outputs despite disturbances. Examples include thermostats and automatic pilot systems.");
        addTestToProblemAnswer(pa19c_4, test19c);
        addProblemAnswerToTest(test19c, pa19c_4);

        ProblemAnswer pa19c_5 = createProblemAnswer("What is the role of transfer functions in systems theory?", "Transfer functions are mathematical representations of the relationship between the input and output of a linear time-invariant system. They are used to analyze and design control systems by providing insights into system dynamics.");
        addTestToProblemAnswer(pa19c_5, test19c);
        addProblemAnswerToTest(test19c, pa19c_5);

// Output for confirmation
        System.out.println("Test for 'Systems Theory' unit created with 10 problem answers.");
// Creating the test for Unit 1: Statics
        Test test20a = createTest("Statics Test", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        addStudentToTest(test20a, student9);
        addStudentToTest(test20a, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa20a_1 = createProblemAnswer("What is statics?", "Statics is the branch of mechanics that deals with bodies at rest and forces in equilibrium. It involves analyzing force systems, calculating moments, and solving problems related to static equilibrium.");
        addTestToProblemAnswer(pa20a_1, test20a);
        addProblemAnswerToTest(test20a, pa20a_1);

        ProblemAnswer pa20a_2 = createProblemAnswer("What is a force system?", "A force system is a collection of forces acting on a body. It includes the magnitudes, directions, and points of application of the forces. Analyzing force systems is essential for understanding how forces affect a body's equilibrium.");
        addTestToProblemAnswer(pa20a_2, test20a);
        addProblemAnswerToTest(test20a, pa20a_2);

        ProblemAnswer pa20a_3 = createProblemAnswer("What is a moment?", "A moment is a measure of the tendency of a force to rotate a body about a point or axis. It is calculated as the product of the force and the perpendicular distance from the point or axis to the line of action of the force, expressed as M = Fd.");
        addTestToProblemAnswer(pa20a_3, test20a);
        addProblemAnswerToTest(test20a, pa20a_3);

        ProblemAnswer pa20a_4 = createProblemAnswer("What is static equilibrium?", "Static equilibrium occurs when a body is at rest and the sum of all forces and moments acting on it is zero. In this state, the body does not experience any linear or rotational motion.");
        addTestToProblemAnswer(pa20a_4, test20a);
        addProblemAnswerToTest(test20a, pa20a_4);

        ProblemAnswer pa20a_5 = createProblemAnswer("How do you calculate the resultant force in a force system?", "The resultant force is the single force that has the same effect as the combined forces acting on a body. It is calculated by vector addition of all the individual forces in the system.");
        addTestToProblemAnswer(pa20a_5, test20a);
        addProblemAnswerToTest(test20a, pa20a_5);

// Output for confirmation
        System.out.println("Test for 'Statics' unit created with 10 problem answers.");
// Creating the test for Unit 2: Dynamics
        Test test20b = createTest("Dynamics Test", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        addStudentToTest(test20b, student9);
        addStudentToTest(test20b, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa20b_1 = createProblemAnswer("What is dynamics?", "Dynamics is the study of bodies in motion. It involves analyzing the forces and torques that cause motion and understanding the principles of kinematics and kinetics.");
        addTestToProblemAnswer(pa20b_1, test20b);
        addProblemAnswerToTest(test20b, pa20b_1);

        ProblemAnswer pa20b_2 = createProblemAnswer("What is kinematics?", "Kinematics is the branch of dynamics that deals with the description of motion without considering the forces that cause it. It involves analyzing the position, velocity, and acceleration of objects.");
        addTestToProblemAnswer(pa20b_2, test20b);
        addProblemAnswerToTest(test20b, pa20b_2);

        ProblemAnswer pa20b_3 = createProblemAnswer("What is kinetics?", "Kinetics is the branch of dynamics that deals with the forces and torques that cause motion. It involves analyzing the relationship between the motion of objects and the forces acting on them.");
        addTestToProblemAnswer(pa20b_3, test20b);
        addProblemAnswerToTest(test20b, pa20b_3);

        ProblemAnswer pa20b_4_new = createProblemAnswer("What is Newton's Second Law of Motion?", "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. This law is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addTestToProblemAnswer(pa20b_4_new, test20b);
        addProblemAnswerToTest(test20b, pa20b_4_new);

        ProblemAnswer pa20b_5 = createProblemAnswer("What is the difference between velocity and acceleration?", "Velocity is the rate of change of displacement with respect to time, and it is a vector quantity with both magnitude and direction. Acceleration is the rate of change of velocity with respect to time, and it is also a vector quantity.");
        addTestToProblemAnswer(pa20b_5, test20b);
        addProblemAnswerToTest(test20b, pa20b_5);

// Output for confirmation
        System.out.println("Test for 'Dynamics' unit created with 10 problem answers.");
// Creating the test for Unit 3: Thermodynamics
        Test test20c = createTest("Thermodynamics Test", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        addStudentToTest(test20c, student9);
        addStudentToTest(test20c, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa20c_1 = createProblemAnswer("What is thermodynamics?", "Thermodynamics is the branch of physics that deals with the study of heat, energy, and the transformation of energy from one form to another. It involves understanding the principles governing the behavior of gases and liquids, as well as the laws of thermodynamics.");
        addTestToProblemAnswer(pa20c_1, test20c);
        addProblemAnswerToTest(test20c, pa20c_1);

        ProblemAnswer pa20c_2 = createProblemAnswer("What is the first law of thermodynamics?", "The first law of thermodynamics, also known as the law of energy conservation, states that energy cannot be created or destroyed, only transformed from one form to another. It is expressed as ΔU = Q - W, where ΔU is the change in internal energy, Q is the heat added to the system, and W is the work done by the system.");
        addTestToProblemAnswer(pa20c_2, test20c);
        addProblemAnswerToTest(test20c, pa20c_2);

        ProblemAnswer pa20c_3 = createProblemAnswer("What is the second law of thermodynamics?", "The second law of thermodynamics states that the entropy of an isolated system always increases over time. It also implies that heat naturally flows from a region of higher temperature to a region of lower temperature and that it is impossible to convert heat completely into work without some loss of energy.");
        addTestToProblemAnswer(pa20c_3, test20c);
        addProblemAnswerToTest(test20c, pa20c_3);

        ProblemAnswer pa20c_4 = createProblemAnswer("What is entropy?", "Entropy is a measure of the disorder or randomness in a system. It quantifies the number of possible microstates of a system and is a key concept in the second law of thermodynamics. Higher entropy indicates greater disorder and lower energy availability for work.");
        addTestToProblemAnswer(pa20c_4, test20c);
        addProblemAnswerToTest(test20c, pa20c_4);

        ProblemAnswer pa20c_5 = createProblemAnswer("What is the third law of thermodynamics?", "The third law of thermodynamics states that as the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value. This implies that it is impossible to reach absolute zero through any finite number of processes.");
        addTestToProblemAnswer(pa20c_5, test20c);
        addProblemAnswerToTest(test20c, pa20c_5);

// Output for confirmation
        System.out.println("Test for 'Thermodynamics' unit created with 10 problem answers.");
// Creating the test for Unit 4: Material Science
        Test test20d = createTest("Material Science Test", faculty5, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);
        addStudentToTest(test20d, student9);
        addStudentToTest(test20d, student10);

// Creating and adding problem answers to the test
        ProblemAnswer pa20d_1 = createProblemAnswer("What is material science?", "Material science is the study of the properties and behavior of materials. It involves understanding the structure, composition, and performance of different materials and how they can be used in various engineering applications.");
        addTestToProblemAnswer(pa20d_1, test20d);
        addProblemAnswerToTest(test20d, pa20d_1);

        ProblemAnswer pa20d_2 = createProblemAnswer("What are the main types of materials studied in material science?", "The main types of materials studied in material science include metals, ceramics, polymers, and composites. Each type has distinct properties and applications, making them suitable for different engineering purposes.");
        addTestToProblemAnswer(pa20d_2, test20d);
        addProblemAnswerToTest(test20d, pa20d_2);

        ProblemAnswer pa20d_3 = createProblemAnswer("What are the properties of metals?", "Metals have properties such as high electrical and thermal conductivity, ductility, malleability, and strength. They are widely used in engineering applications such as construction, transportation, and electronics.");
        addTestToProblemAnswer(pa20d_3, test20d);
        addProblemAnswerToTest(test20d, pa20d_3);

        ProblemAnswer pa20d_4 = createProblemAnswer("What are ceramics?", "Ceramics are non-metallic, inorganic materials that are typically hard, brittle, and resistant to heat and chemical attack. They are used in applications such as pottery, building materials, and high-temperature environments.");
        addTestToProblemAnswer(pa20d_4, test20d);
        addProblemAnswerToTest(test20d, pa20d_4);

        ProblemAnswer pa20d_5 = createProblemAnswer("What are polymers?", "Polymers are large molecules composed of repeating structural units. They can be natural or synthetic and have properties such as flexibility, elasticity, and low density. Polymers are used in a wide range of applications, including plastics, textiles, and medical devices.");
        addTestToProblemAnswer(pa20d_5, test20d);
        addProblemAnswerToTest(test20d, pa20d_5);

// Output for confirmation
        System.out.println("Test for 'Material Science' unit created with 10 problem answers.");


        // Creating StudentAnswer instances for student9
        StudentAnswer sa17a_1_student9 = createStudentAnswer(student9, pa17a_1, "The main components of a cell include the cell membrane, nucleus, cytoplasm, and various organelles such as mitochondria, ribosomes, endoplasmic reticulum, Golgi apparatus, and lysosomes.");
        addStudentAnswerToProblemAnswer(pa17a_1, sa17a_1_student9);

        StudentAnswer sa17a_2_student9 = createStudentAnswer(student9, pa17a_2, "The cell membrane, also known as the plasma membrane, controls the movement of substances in and out of the cell. It provides protection and support to the cell and helps maintain its shape.");
        addStudentAnswerToProblemAnswer(pa17a_2, sa17a_2_student9);

        StudentAnswer sa17a_3_student9 = createStudentAnswer(student9, pa17a_3, "The nucleus is the control center of the cell, containing the cell's genetic material (DNA). It regulates gene expression, cell growth, and reproduction, and directs various cellular activities.");
        addStudentAnswerToProblemAnswer(pa17a_3, sa17a_3_student9);

        StudentAnswer sa17a_4_student9 = createStudentAnswer(student9, pa17a_4, "Organelles are specialized structures within a cell that perform specific functions. Examples include mitochondria (energy production), ribosomes (protein synthesis), and the endoplasmic reticulum (protein and lipid processing).");
        addStudentAnswerToProblemAnswer(pa17a_4, sa17a_4_student9);

        StudentAnswer sa17a_5_student9 = createStudentAnswer(student9, pa17a_5, "Prokaryotic cells lack a true nucleus and membrane-bound organelles, while eukaryotic cells have a defined nucleus and various membrane-bound organelles. Prokaryotes include bacteria and archaea, whereas eukaryotes include plants, animals, fungi, and protists.");
        addStudentAnswerToProblemAnswer(pa17a_5, sa17a_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa17a_1_student10 = createStudentAnswer(student10, pa17a_1, "The main components of a cell include the cell membrane, nucleus, cytoplasm, and various organelles such as mitochondria, ribosomes, endoplasmic reticulum, Golgi apparatus, and lysosomes.");
        addStudentAnswerToProblemAnswer(pa17a_1, sa17a_1_student10);

        StudentAnswer sa17a_2_student10 = createStudentAnswer(student10, pa17a_2, "The cell membrane, also known as the plasma membrane, controls the movement of substances in and out of the cell. It provides protection and support to the cell and helps maintain its shape.");
        addStudentAnswerToProblemAnswer(pa17a_2, sa17a_2_student10);

        StudentAnswer sa17a_3_student10 = createStudentAnswer(student10, pa17a_3, "The nucleus is the control center of the cell, containing the cell's genetic material (DNA). It regulates gene expression, cell growth, and reproduction, and directs various cellular activities.");
        addStudentAnswerToProblemAnswer(pa17a_3, sa17a_3_student10);

        StudentAnswer sa17a_4_student10 = createStudentAnswer(student10, pa17a_4, "Organelles are specialized structures within a cell that perform specific functions. Examples include mitochondria (energy production), ribosomes (protein synthesis), and the endoplasmic reticulum (protein and lipid processing).");
        addStudentAnswerToProblemAnswer(pa17a_4, sa17a_4_student10);

        StudentAnswer sa17a_5_student10 = createStudentAnswer(student10, pa17a_5, "Prokaryotic cells lack a true nucleus and membrane-bound organelles, while eukaryotic cells have a defined nucleus and various membrane-bound organelles. Prokaryotes include bacteria and archaea, whereas eukaryotes include plants, animals, fungi, and protists.");
        addStudentAnswerToProblemAnswer(pa17a_5, sa17a_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa17b_1_student9 = createStudentAnswer(student9, pa17b_1, "Genetics is the study of heredity and the variation of inherited characteristics. It involves understanding how traits are passed from parents to offspring through genes.");
        addStudentAnswerToProblemAnswer(pa17b_1, sa17b_1_student9);

        StudentAnswer sa17b_2_student9 = createStudentAnswer(student9, pa17b_2, "The principles of Mendelian genetics, established by Gregor Mendel, include the Law of Segregation (each individual has two alleles for each gene, which separate during gamete formation) and the Law of Independent Assortment (genes for different traits can segregate independently during the formation of gametes).");
        addStudentAnswerToProblemAnswer(pa17b_2, sa17b_2_student9);

        StudentAnswer sa17b_3_student9 = createStudentAnswer(student9, pa17b_3, "DNA (deoxyribonucleic acid) is the molecule that carries the genetic instructions for life. It consists of two strands forming a double helix, with each strand composed of nucleotides containing a sugar, phosphate group, and a nitrogenous base (adenine, thymine, cytosine, or guanine).");
        addStudentAnswerToProblemAnswer(pa17b_3, sa17b_3_student9);

        StudentAnswer sa17b_4_student9 = createStudentAnswer(student9, pa17b_4, "The function of DNA is to store and transmit genetic information. It provides the instructions for building and maintaining an organism and guides the production of proteins through the processes of transcription and translation.");
        addStudentAnswerToProblemAnswer(pa17b_4, sa17b_4_student9);

        StudentAnswer sa17b_5_student9 = createStudentAnswer(student9, pa17b_5, "Replication is the process by which DNA is copied before cell division. It ensures that each daughter cell receives an exact copy of the parent cell's DNA. The process involves unwinding the DNA double helix and using each strand as a template to synthesize a new complementary strand.");
        addStudentAnswerToProblemAnswer(pa17b_5, sa17b_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa17b_1_student10 = createStudentAnswer(student10, pa17b_1, "Genetics is the study of heredity and the variation of inherited characteristics. It involves understanding how traits are passed from parents to offspring through genes.");
        addStudentAnswerToProblemAnswer(pa17b_1, sa17b_1_student10);

        StudentAnswer sa17b_2_student10 = createStudentAnswer(student10, pa17b_2, "The principles of Mendelian genetics, established by Gregor Mendel, include the Law of Segregation (each individual has two alleles for each gene, which separate during gamete formation) and the Law of Independent Assortment (genes for different traits can segregate independently during the formation of gametes).");
        addStudentAnswerToProblemAnswer(pa17b_2, sa17b_2_student10);

        StudentAnswer sa17b_3_student10 = createStudentAnswer(student10, pa17b_3, "DNA (deoxyribonucleic acid) is the molecule that carries the genetic instructions for life. It consists of two strands forming a double helix, with each strand composed of nucleotides containing a sugar, phosphate group, and a nitrogenous base (adenine, thymine, cytosine, or guanine).");
        addStudentAnswerToProblemAnswer(pa17b_3, sa17b_3_student10);

        StudentAnswer sa17b_4_student10 = createStudentAnswer(student10, pa17b_4, "The function of DNA is to store and transmit genetic information. It provides the instructions for building and maintaining an organism and guides the production of proteins through the processes of transcription and translation.");
        addStudentAnswerToProblemAnswer(pa17b_4, sa17b_4_student10);

        StudentAnswer sa17b_5_student10 = createStudentAnswer(student10, pa17b_5, "Replication is the process by which DNA is copied before cell division. It ensures that each daughter cell receives an exact copy of the parent cell's DNA. The process involves unwinding the DNA double helix and using each strand as a template to synthesize a new complementary strand.");
        addStudentAnswerToProblemAnswer(pa17b_5, sa17b_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa17c_1_student9 = createStudentAnswer(student9, pa17c_1, "The theory of evolution, developed by Charles Darwin, explains how species change over time through the process of natural selection. It states that organisms with traits better suited to their environment are more likely to survive and reproduce, passing those traits to their offspring.");
        addStudentAnswerToProblemAnswer(pa17c_1, sa17c_1_student9);

        StudentAnswer sa17c_2_student9 = createStudentAnswer(student9, pa17c_2, "Natural selection is the process by which individuals with advantageous traits are more likely to survive and reproduce, leading to the gradual accumulation of those traits in a population over generations.");
        addStudentAnswerToProblemAnswer(pa17c_2, sa17c_2_student9);

        StudentAnswer sa17c_3_student9 = createStudentAnswer(student9, pa17c_3, "Genetic variation is the diversity of gene combinations within a population. It is essential for evolution as it provides the raw material for natural selection to act upon.");
        addStudentAnswerToProblemAnswer(pa17c_3, sa17c_3_student9);

        StudentAnswer sa17c_4_student9 = createStudentAnswer(student9, pa17c_4, "A mutation is a change in the DNA sequence of an organism. Mutations can introduce new genetic variations and are a source of genetic diversity in a population.");
        addStudentAnswerToProblemAnswer(pa17c_4, sa17c_4_student9);

        StudentAnswer sa17c_5_student9 = createStudentAnswer(student9, pa17c_5, "An adaptation is a trait that increases an organism's chances of survival and reproduction in a particular environment. Adaptations result from the process of natural selection acting on genetic variation.");
        addStudentAnswerToProblemAnswer(pa17c_5, sa17c_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa17c_1_student10 = createStudentAnswer(student10, pa17c_1, "The theory of evolution, developed by Charles Darwin, explains how species change over time through the process of natural selection. It states that organisms with traits better suited to their environment are more likely to survive and reproduce, passing those traits to their offspring.");
        addStudentAnswerToProblemAnswer(pa17c_1, sa17c_1_student10);

        StudentAnswer sa17c_2_student10 = createStudentAnswer(student10, pa17c_2, "Natural selection is the process by which individuals with advantageous traits are more likely to survive and reproduce, leading to the gradual accumulation of those traits in a population over generations.");
        addStudentAnswerToProblemAnswer(pa17c_2, sa17c_2_student10);

        StudentAnswer sa17c_3_student10 = createStudentAnswer(student10, pa17c_3, "Genetic variation is the diversity of gene combinations within a population. It is essential for evolution as it provides the raw material for natural selection to act upon.");
        addStudentAnswerToProblemAnswer(pa17c_3, sa17c_3_student10);

        StudentAnswer sa17c_4_student10 = createStudentAnswer(student10, pa17c_4, "A mutation is a change in the DNA sequence of an organism. Mutations can introduce new genetic variations and are a source of genetic diversity in a population.");
        addStudentAnswerToProblemAnswer(pa17c_4, sa17c_4_student10);

        StudentAnswer sa17c_5_student10 = createStudentAnswer(student10, pa17c_5, "An adaptation is a trait that increases an organism's chances of survival and reproduction in a particular environment. Adaptations result from the process of natural selection acting on genetic variation.");
        addStudentAnswerToProblemAnswer(pa17c_5, sa17c_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa17d_1_student9 = createStudentAnswer(student9, pa17d_1, "Ecology is the study of interactions between organisms and their environment. It examines how living things interact with each other and with their physical surroundings.");
        addStudentAnswerToProblemAnswer(pa17d_1, sa17d_1_student9);

        StudentAnswer sa17d_2_student9 = createStudentAnswer(student9, pa17d_2, "Ecosystems are communities of living organisms interacting with their physical environment. They include both biotic (living) components, such as plants and animals, and abiotic (non-living) components, such as water, soil, and climate.");
        addStudentAnswerToProblemAnswer(pa17d_2, sa17d_2_student9);

        StudentAnswer sa17d_3_student9 = createStudentAnswer(student9, pa17d_3, "A food web is a complex network of interconnected food chains within an ecosystem. It illustrates the feeding relationships and energy flow between different organisms, showing how energy is transferred from producers to consumers and decomposers.");
        addStudentAnswerToProblemAnswer(pa17d_3, sa17d_3_student9);

        StudentAnswer sa17d_4_student9 = createStudentAnswer(student9, pa17d_4, "Energy flow in an ecosystem refers to the transfer of energy from one trophic level to another. Energy enters the ecosystem through photosynthesis by producers, and it is passed on to consumers and decomposers through feeding relationships.");
        addStudentAnswerToProblemAnswer(pa17d_4, sa17d_4_student9);

        StudentAnswer sa17d_5_student9 = createStudentAnswer(student9, pa17d_5, "The levels of organization in ecology, from smallest to largest, are: organism, population, community, ecosystem, biome, and biosphere. Each level represents a different scale of interaction between living organisms and their environment.");
        addStudentAnswerToProblemAnswer(pa17d_5, sa17d_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa17d_1_student10 = createStudentAnswer(student10, pa17d_1, "Ecology is the study of interactions between organisms and their environment. It examines how living things interact with each other and with their physical surroundings.");
        addStudentAnswerToProblemAnswer(pa17d_1, sa17d_1_student10);

        StudentAnswer sa17d_2_student10 = createStudentAnswer(student10, pa17d_2, "Ecosystems are communities of living organisms interacting with their physical environment. They include both biotic (living) components, such as plants and animals, and abiotic (non-living) components, such as water, soil, and climate.");
        addStudentAnswerToProblemAnswer(pa17d_2, sa17d_2_student10);

        StudentAnswer sa17d_3_student10 = createStudentAnswer(student10, pa17d_3, "A food web is a complex network of interconnected food chains within an ecosystem. It illustrates the feeding relationships and energy flow between different organisms, showing how energy is transferred from producers to consumers and decomposers.");
        addStudentAnswerToProblemAnswer(pa17d_3, sa17d_3_student10);

        StudentAnswer sa17d_4_student10 = createStudentAnswer(student10, pa17d_4, "Energy flow in an ecosystem refers to the transfer of energy from one trophic level to another. Energy enters the ecosystem through photosynthesis by producers, and it is passed on to consumers and decomposers through feeding relationships.");
        addStudentAnswerToProblemAnswer(pa17d_4, sa17d_4_student10);

        StudentAnswer sa17d_5_student10 = createStudentAnswer(student10, pa17d_5, "The levels of organization in ecology, from smallest to largest, are: organism, population, community, ecosystem, biome, and biosphere. Each level represents a different scale of interaction between living organisms and their environment.");
        addStudentAnswerToProblemAnswer(pa17d_5, sa17d_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa18a_1_student9 = createStudentAnswer(student9, pa18a_1, "Civil engineering is a discipline that deals with the design, construction, and maintenance of infrastructure such as roads, bridges, buildings, and water supply systems. Civil engineers work on projects that improve the built environment and enhance public safety.");
        addStudentAnswerToProblemAnswer(pa18a_1, sa18a_1_student9);

        StudentAnswer sa18a_2_student9 = createStudentAnswer(student9, pa18a_2, "Mechanical engineering is a discipline that involves the design, analysis, manufacturing, and maintenance of mechanical systems. Mechanical engineers work on projects ranging from small devices to large machinery, including engines, HVAC systems, and robotics.");
        addStudentAnswerToProblemAnswer(pa18a_2, sa18a_2_student9);

        StudentAnswer sa18a_3_student9 = createStudentAnswer(student9, pa18a_3, "Electrical engineering is a discipline focused on the study and application of electricity, electronics, and electromagnetism. Electrical engineers design and develop electrical systems, including power generation, transmission, and distribution, as well as electronic devices and communication systems.");
        addStudentAnswerToProblemAnswer(pa18a_3, sa18a_3_student9);

        StudentAnswer sa18a_4_student9 = createStudentAnswer(student9, pa18a_4, "Chemical engineering is a discipline that combines principles of chemistry, physics, mathematics, and engineering to design and operate processes that convert raw materials into valuable products. Chemical engineers work in industries such as pharmaceuticals, petrochemicals, and food processing.");
        addStudentAnswerToProblemAnswer(pa18a_4, sa18a_4_student9);

        StudentAnswer sa18a_5_student9 = createStudentAnswer(student9, pa18a_5, "Civil engineers are responsible for planning, designing, constructing, and maintaining infrastructure projects. They ensure the safety, functionality, and sustainability of structures such as roads, bridges, buildings, and water supply systems.");
        addStudentAnswerToProblemAnswer(pa18a_5, sa18a_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa18a_1_student10 = createStudentAnswer(student10, pa18a_1, "Civil engineering is a discipline that deals with the design, construction, and maintenance of infrastructure such as roads, bridges, buildings, and water supply systems. Civil engineers work on projects that improve the built environment and enhance public safety.");
        addStudentAnswerToProblemAnswer(pa18a_1, sa18a_1_student10);

        StudentAnswer sa18a_2_student10 = createStudentAnswer(student10, pa18a_2, "Mechanical engineering is a discipline that involves the design, analysis, manufacturing, and maintenance of mechanical systems. Mechanical engineers work on projects ranging from small devices to large machinery, including engines, HVAC systems, and robotics.");
        addStudentAnswerToProblemAnswer(pa18a_2, sa18a_2_student10);

        StudentAnswer sa18a_3_student10 = createStudentAnswer(student10, pa18a_3, "Electrical engineering is a discipline focused on the study and application of electricity, electronics, and electromagnetism. Electrical engineers design and develop electrical systems, including power generation, transmission, and distribution, as well as electronic devices and communication systems.");
        addStudentAnswerToProblemAnswer(pa18a_3, sa18a_3_student10);

        StudentAnswer sa18a_4_student10 = createStudentAnswer(student10, pa18a_4, "Chemical engineering is a discipline that combines principles of chemistry, physics, mathematics, and engineering to design and operate processes that convert raw materials into valuable products. Chemical engineers work in industries such as pharmaceuticals, petrochemicals, and food processing.");
        addStudentAnswerToProblemAnswer(pa18a_4, sa18a_4_student10);

        StudentAnswer sa18a_5_student10 = createStudentAnswer(student10, pa18a_5, "Civil engineers are responsible for planning, designing, constructing, and maintaining infrastructure projects. They ensure the safety, functionality, and sustainability of structures such as roads, bridges, buildings, and water supply systems.");
        addStudentAnswerToProblemAnswer(pa18a_5, sa18a_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa18b_1_student9 = createStudentAnswer(student9, pa18b_1, "The engineering problem-solving process is a systematic approach to addressing engineering challenges. It involves defining the problem, conducting research, generating potential solutions, selecting the best solution, implementing the solution, and evaluating the results.");
        addStudentAnswerToProblemAnswer(pa18b_1, sa18b_1_student9);

        StudentAnswer sa18b_2_student9 = createStudentAnswer(student9, pa18b_2, "Defining a problem in engineering involves identifying the specific issue or need, understanding the constraints and requirements, and clearly stating the problem in a way that guides the development of solutions.");
        addStudentAnswerToProblemAnswer(pa18b_2, sa18b_2_student9);

        StudentAnswer sa18b_3_student9 = createStudentAnswer(student9, pa18b_3, "Brainstorming is a creative process used to generate a wide range of potential solutions to an engineering problem. It encourages free thinking and the sharing of ideas without immediate evaluation or criticism.");
        addStudentAnswerToProblemAnswer(pa18b_3, sa18b_3_student9);

        StudentAnswer sa18b_4_student9 = createStudentAnswer(student9, pa18b_4, "Engineers select the best solution by evaluating the potential solutions based on criteria such as feasibility, cost, effectiveness, safety, and sustainability. They use decision-making tools and techniques to compare and rank the solutions.");
        addStudentAnswerToProblemAnswer(pa18b_4, sa18b_4_student9);

        StudentAnswer sa18b_5_student9 = createStudentAnswer(student9, pa18b_5, "Implementation involves putting the chosen solution into practice. This includes designing, developing, testing, and deploying the solution, as well as managing the resources and timelines required for successful implementation.");
        addStudentAnswerToProblemAnswer(pa18b_5, sa18b_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa18b_1_student10 = createStudentAnswer(student10, pa18b_1, "The engineering problem-solving process is a systematic approach to addressing engineering challenges. It involves defining the problem, conducting research, generating potential solutions, selecting the best solution, implementing the solution, and evaluating the results.");
        addStudentAnswerToProblemAnswer(pa18b_1, sa18b_1_student10);

        StudentAnswer sa18b_2_student10 = createStudentAnswer(student10, pa18b_2, "Defining a problem in engineering involves identifying the specific issue or need, understanding the constraints and requirements, and clearly stating the problem in a way that guides the development of solutions.");
        addStudentAnswerToProblemAnswer(pa18b_2, sa18b_2_student10);

        StudentAnswer sa18b_3_student10 = createStudentAnswer(student10, pa18b_3, "Brainstorming is a creative process used to generate a wide range of potential solutions to an engineering problem. It encourages free thinking and the sharing of ideas without immediate evaluation or criticism.");
        addStudentAnswerToProblemAnswer(pa18b_3, sa18b_3_student10);

        StudentAnswer sa18b_4_student10 = createStudentAnswer(student10, pa18b_4, "Engineers select the best solution by evaluating the potential solutions based on criteria such as feasibility, cost, effectiveness, safety, and sustainability. They use decision-making tools and techniques to compare and rank the solutions.");
        addStudentAnswerToProblemAnswer(pa18b_4, sa18b_4_student10);

        StudentAnswer sa18b_5_student10 = createStudentAnswer(student10, pa18b_5, "Implementation involves putting the chosen solution into practice. This includes designing, developing, testing, and deploying the solution, as well as managing the resources and timelines required for successful implementation.");
        addStudentAnswerToProblemAnswer(pa18b_5, sa18b_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa18c_1_student9 = createStudentAnswer(student9, pa18c_1, "The engineering design process is a systematic approach to solving engineering problems. It involves defining requirements, brainstorming, prototyping, testing, and iteration to develop and refine solutions.");
        addStudentAnswerToProblemAnswer(pa18c_1, sa18c_1_student9);

        StudentAnswer sa18c_2_student9 = createStudentAnswer(student9, pa18c_2, "The stages of the design process typically include defining the problem, researching and gathering information, generating ideas, developing and testing prototypes, evaluating and refining the solution, and finalizing and implementing the design.");
        addStudentAnswerToProblemAnswer(pa18c_2, sa18c_2_student9);

        StudentAnswer sa18c_3_student9 = createStudentAnswer(student9, pa18c_3, "Engineers define requirements by identifying the specific needs and constraints of the project. This includes understanding the problem, setting clear objectives, and determining the criteria for a successful solution.");
        addStudentAnswerToProblemAnswer(pa18c_3, sa18c_3_student9);

        StudentAnswer sa18c_4_student9 = createStudentAnswer(student9, pa18c_4, "Brainstorming is important because it encourages the generation of a wide range of ideas and solutions. It fosters creativity and collaboration, allowing engineers to explore different approaches and identify the best possible solution.");
        addStudentAnswerToProblemAnswer(pa18c_4, sa18c_4_student9);

        StudentAnswer sa18c_5_student9 = createStudentAnswer(student9, pa18c_5, "Prototyping involves creating a preliminary model or version of a solution to test its feasibility and functionality. Prototypes allow engineers to identify potential issues, gather feedback, and make improvements before finalizing the design.");
        addStudentAnswerToProblemAnswer(pa18c_5, sa18c_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa18c_1_student10 = createStudentAnswer(student10, pa18c_1, "The engineering design process is a systematic approach to solving engineering problems. It involves defining requirements, brainstorming, prototyping, testing, and iteration to develop and refine solutions.");
        addStudentAnswerToProblemAnswer(pa18c_1, sa18c_1_student10);

        StudentAnswer sa18c_2_student10 = createStudentAnswer(student10, pa18c_2, "The stages of the design process typically include defining the problem, researching and gathering information, generating ideas, developing and testing prototypes, evaluating and refining the solution, and finalizing and implementing the design.");
        addStudentAnswerToProblemAnswer(pa18c_2, sa18c_2_student10);

        StudentAnswer sa18c_3_student10 = createStudentAnswer(student10, pa18c_3, "Engineers define requirements by identifying the specific needs and constraints of the project. This includes understanding the problem, setting clear objectives, and determining the criteria for a successful solution.");
        addStudentAnswerToProblemAnswer(pa18c_3, sa18c_3_student10);

        StudentAnswer sa18c_4_student10 = createStudentAnswer(student10, pa18c_4, "Brainstorming is important because it encourages the generation of a wide range of ideas and solutions. It fosters creativity and collaboration, allowing engineers to explore different approaches and identify the best possible solution.");
        addStudentAnswerToProblemAnswer(pa18c_4, sa18c_4_student10);

        StudentAnswer sa18c_5_student10 = createStudentAnswer(student10, pa18c_5, "Prototyping involves creating a preliminary model or version of a solution to test its feasibility and functionality. Prototypes allow engineers to identify potential issues, gather feedback, and make improvements before finalizing the design.");
        addStudentAnswerToProblemAnswer(pa18c_5, sa18c_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa19a_1_student9 = createStudentAnswer(student9, pa19a_1, "Ohm's law states that the current flowing through a conductor between two points is directly proportional to the voltage across the two points. It is mathematically expressed as V = IR, where V is voltage, I is current, and R is resistance.");
        addStudentAnswerToProblemAnswer(pa19a_1, sa19a_1_student9);

        StudentAnswer sa19a_2_student9 = createStudentAnswer(student9, pa19a_2, "Kirchhoff's laws include Kirchhoff's Current Law (KCL) and Kirchhoff's Voltage Law (KVL). KCL states that the total current entering a junction equals the total current leaving the junction. KVL states that the sum of all voltages around a closed loop equals zero.");
        addStudentAnswerToProblemAnswer(pa19a_2, sa19a_2_student9);

        StudentAnswer sa19a_3_student9 = createStudentAnswer(student9, pa19a_3, "Voltage in a circuit can be calculated using Ohm's law (V = IR) and Kirchhoff's Voltage Law (KVL). For a series circuit, the total voltage is the sum of the voltages across each component. For a parallel circuit, the voltage is the same across each branch.");
        addStudentAnswerToProblemAnswer(pa19a_3, sa19a_3_student9);

        StudentAnswer sa19a_4_student9 = createStudentAnswer(student9, pa19a_4, "Current in a circuit can be calculated using Ohm's law (I = V/R) and Kirchhoff's Current Law (KCL). For a series circuit, the current is the same through each component. For a parallel circuit, the total current is the sum of the currents in each branch.");
        addStudentAnswerToProblemAnswer(pa19a_4, sa19a_4_student9);

        StudentAnswer sa19a_5_student9 = createStudentAnswer(student9, pa19a_5, "Techniques for analyzing DC circuits include using Ohm's law, Kirchhoff's laws, voltage division, current division, mesh analysis, and nodal analysis. These techniques help determine the voltage, current, and resistance in various parts of the circuit.");
        addStudentAnswerToProblemAnswer(pa19a_5, sa19a_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa19a_1_student10 = createStudentAnswer(student10, pa19a_1, "Ohm's law states that the current flowing through a conductor between two points is directly proportional to the voltage across the two points. It is mathematically expressed as V = IR, where V is voltage, I is current, and R is resistance.");
        addStudentAnswerToProblemAnswer(pa19a_1, sa19a_1_student10);

        StudentAnswer sa19a_2_student10 = createStudentAnswer(student10, pa19a_2, "Kirchhoff's laws include Kirchhoff's Current Law (KCL) and Kirchhoff's Voltage Law (KVL). KCL states that the total current entering a junction equals the total current leaving the junction. KVL states that the sum of all voltages around a closed loop equals zero.");
        addStudentAnswerToProblemAnswer(pa19a_2, sa19a_2_student10);

        StudentAnswer sa19a_3_student10 = createStudentAnswer(student10, pa19a_3, "Voltage in a circuit can be calculated using Ohm's law (V = IR) and Kirchhoff's Voltage Law (KVL). For a series circuit, the total voltage is the sum of the voltages across each component. For a parallel circuit, the voltage is the same across each branch.");
        addStudentAnswerToProblemAnswer(pa19a_3, sa19a_3_student10);

        StudentAnswer sa19a_4_student10 = createStudentAnswer(student10, pa19a_4, "Current in a circuit can be calculated using Ohm's law (I = V/R) and Kirchhoff's Current Law (KCL). For a series circuit, the current is the same through each component. For a parallel circuit, the total current is the sum of the currents in each branch.");
        addStudentAnswerToProblemAnswer(pa19a_4, sa19a_4_student10);

        StudentAnswer sa19a_5_student10 = createStudentAnswer(student10, pa19a_5, "Techniques for analyzing DC circuits include using Ohm's law, Kirchhoff's laws, voltage division, current division, mesh analysis, and nodal analysis. These techniques help determine the voltage, current, and resistance in various parts of the circuit.");
        addStudentAnswerToProblemAnswer(pa19a_5, sa19a_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa19b_1_student9 = createStudentAnswer(student9, pa19b_1, "Signal processing is the analysis, manipulation, and interpretation of signals. It involves techniques for filtering, transforming, and extracting information from signals in various forms, such as audio, video, and data.");
        addStudentAnswerToProblemAnswer(pa19b_1, sa19b_1_student9);

        StudentAnswer sa19b_2_student9 = createStudentAnswer(student9, pa19b_2, "A Fourier transform is a mathematical technique used to transform a signal from the time domain to the frequency domain. It decomposes a signal into its constituent frequencies, allowing analysis of the signal's frequency content.");
        addStudentAnswerToProblemAnswer(pa19b_2, sa19b_2_student9);

        StudentAnswer sa19b_3_student9 = createStudentAnswer(student9, pa19b_3, "Filtering is the process of removing unwanted components or noise from a signal. Filters can be designed to pass certain frequencies while attenuating others, such as low-pass, high-pass, band-pass, and band-stop filters.");
        addStudentAnswerToProblemAnswer(pa19b_3, sa19b_3_student9);

        StudentAnswer sa19b_4_student9 = createStudentAnswer(student9, pa19b_4, "Digital signal processing (DSP) involves the manipulation of signals using digital techniques. DSP algorithms are implemented on digital hardware, allowing for efficient processing, analysis, and transformation of signals in digital form.");
        addStudentAnswerToProblemAnswer(pa19b_4, sa19b_4_student9);

        StudentAnswer sa19b_5_student9 = createStudentAnswer(student9, pa19b_5, "Applications of signal processing include telecommunications (signal transmission and reception), audio and video processing (enhancement and compression), medical imaging (MRI and CT scans), and radar and sonar systems (target detection and tracking).");
        addStudentAnswerToProblemAnswer(pa19b_5, sa19b_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa19b_1_student10 = createStudentAnswer(student10, pa19b_1, "Signal processing is the analysis, manipulation, and interpretation of signals. It involves techniques for filtering, transforming, and extracting information from signals in various forms, such as audio, video, and data.");
        addStudentAnswerToProblemAnswer(pa19b_1, sa19b_1_student10);

        StudentAnswer sa19b_2_student10 = createStudentAnswer(student10, pa19b_2, "A Fourier transform is a mathematical technique used to transform a signal from the time domain to the frequency domain. It decomposes a signal into its constituent frequencies, allowing analysis of the signal's frequency content.");
        addStudentAnswerToProblemAnswer(pa19b_2, sa19b_2_student10);

        StudentAnswer sa19b_3_student10 = createStudentAnswer(student10, pa19b_3, "Filtering is the process of removing unwanted components or noise from a signal. Filters can be designed to pass certain frequencies while attenuating others, such as low-pass, high-pass, band-pass, and band-stop filters.");
        addStudentAnswerToProblemAnswer(pa19b_3, sa19b_3_student10);

        StudentAnswer sa19b_4_student10 = createStudentAnswer(student10, pa19b_4, "Digital signal processing (DSP) involves the manipulation of signals using digital techniques. DSP algorithms are implemented on digital hardware, allowing for efficient processing, analysis, and transformation of signals in digital form.");
        addStudentAnswerToProblemAnswer(pa19b_4, sa19b_4_student10);

        StudentAnswer sa19b_5_student10 = createStudentAnswer(student10, pa19b_5, "Applications of signal processing include telecommunications (signal transmission and reception), audio and video processing (enhancement and compression), medical imaging (MRI and CT scans), and radar and sonar systems (target detection and tracking).");
        addStudentAnswerToProblemAnswer(pa19b_5, sa19b_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa19c_1_student9 = createStudentAnswer(student9, pa19c_1, "Systems theory is the study of systems, which are sets of interacting components working together as a whole. It focuses on understanding the behavior, structure, and dynamics of complex systems.");
        addStudentAnswerToProblemAnswer(pa19c_1, sa19c_1_student9);

        StudentAnswer sa19c_2_student9 = createStudentAnswer(student9, pa19c_2, "System modeling involves creating abstract representations of systems to analyze their behavior and predict their performance. Models can be mathematical, graphical, or computational and help in understanding and designing systems.");
        addStudentAnswerToProblemAnswer(pa19c_2, sa19c_2_student9);

        StudentAnswer sa19c_3_student9 = createStudentAnswer(student9, pa19c_3, "Feedback is a process in which the output of a system is fed back into the system as input, influencing its future behavior. Positive feedback amplifies changes, while negative feedback stabilizes the system.");
        addStudentAnswerToProblemAnswer(pa19c_3, sa19c_3_student9);

        StudentAnswer sa19c_4_student9 = createStudentAnswer(student9, pa19c_4, "Control systems are systems designed to regulate the behavior of other systems. They use feedback and control mechanisms to maintain desired outputs despite disturbances. Examples include thermostats and automatic pilot systems.");
        addStudentAnswerToProblemAnswer(pa19c_4, sa19c_4_student9);

        StudentAnswer sa19c_5_student9 = createStudentAnswer(student9, pa19c_5, "Transfer functions are mathematical representations of the relationship between the input and output of a linear time-invariant system. They are used to analyze and design control systems by providing insights into system dynamics.");
        addStudentAnswerToProblemAnswer(pa19c_5, sa19c_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa19c_1_student10 = createStudentAnswer(student10, pa19c_1, "Systems theory is the study of systems, which are sets of interacting components working together as a whole. It focuses on understanding the behavior, structure, and dynamics of complex systems.");
        addStudentAnswerToProblemAnswer(pa19c_1, sa19c_1_student10);

        StudentAnswer sa19c_2_student10 = createStudentAnswer(student10, pa19c_2, "System modeling involves creating abstract representations of systems to analyze their behavior and predict their performance. Models can be mathematical, graphical, or computational and help in understanding and designing systems.");
        addStudentAnswerToProblemAnswer(pa19c_2, sa19c_2_student10);

        StudentAnswer sa19c_3_student10 = createStudentAnswer(student10, pa19c_3, "Feedback is a process in which the output of a system is fed back into the system as input, influencing its future behavior. Positive feedback amplifies changes, while negative feedback stabilizes the system.");
        addStudentAnswerToProblemAnswer(pa19c_3, sa19c_3_student10);

        StudentAnswer sa19c_4_student10 = createStudentAnswer(student10, pa19c_4, "Control systems are systems designed to regulate the behavior of other systems. They use feedback and control mechanisms to maintain desired outputs despite disturbances. Examples include thermostats and automatic pilot systems.");
        addStudentAnswerToProblemAnswer(pa19c_4, sa19c_4_student10);

        StudentAnswer sa19c_5_student10 = createStudentAnswer(student10, pa19c_5, "Transfer functions are mathematical representations of the relationship between the input and output of a linear time-invariant system. They are used to analyze and design control systems by providing insights into system dynamics.");
        addStudentAnswerToProblemAnswer(pa19c_5, sa19c_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa20a_1_student9 = createStudentAnswer(student9, pa20a_1, "Statics is the branch of mechanics that deals with bodies at rest and forces in equilibrium. It involves analyzing force systems, calculating moments, and solving problems related to static equilibrium.");
        addStudentAnswerToProblemAnswer(pa20a_1, sa20a_1_student9);

        StudentAnswer sa20a_2_student9 = createStudentAnswer(student9, pa20a_2, "A force system is a collection of forces acting on a body. It includes the magnitudes, directions, and points of application of the forces. Analyzing force systems is essential for understanding how forces affect a body's equilibrium.");
        addStudentAnswerToProblemAnswer(pa20a_2, sa20a_2_student9);

        StudentAnswer sa20a_3_student9 = createStudentAnswer(student9, pa20a_3, "A moment is a measure of the tendency of a force to rotate a body about a point or axis. It is calculated as the product of the force and the perpendicular distance from the point or axis to the line of action of the force, expressed as M = Fd.");
        addStudentAnswerToProblemAnswer(pa20a_3, sa20a_3_student9);

        StudentAnswer sa20a_4_student9 = createStudentAnswer(student9, pa20a_4, "Static equilibrium occurs when a body is at rest and the sum of all forces and moments acting on it is zero. In this state, the body does not experience any linear or rotational motion.");
        addStudentAnswerToProblemAnswer(pa20a_4, sa20a_4_student9);

        StudentAnswer sa20a_5_student9 = createStudentAnswer(student9, pa20a_5, "The resultant force is the single force that has the same effect as the combined forces acting on a body. It is calculated by vector addition of all the individual forces in the system.");
        addStudentAnswerToProblemAnswer(pa20a_5, sa20a_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa20a_1_student10 = createStudentAnswer(student10, pa20a_1, "Statics is the branch of mechanics that deals with bodies at rest and forces in equilibrium. It involves analyzing force systems, calculating moments, and solving problems related to static equilibrium.");
        addStudentAnswerToProblemAnswer(pa20a_1, sa20a_1_student10);

        StudentAnswer sa20a_2_student10 = createStudentAnswer(student10, pa20a_2, "A force system is a collection of forces acting on a body. It includes the magnitudes, directions, and points of application of the forces. Analyzing force systems is essential for understanding how forces affect a body's equilibrium.");
        addStudentAnswerToProblemAnswer(pa20a_2, sa20a_2_student10);

        StudentAnswer sa20a_3_student10 = createStudentAnswer(student10, pa20a_3, "A moment is a measure of the tendency of a force to rotate a body about a point or axis. It is calculated as the product of the force and the perpendicular distance from the point or axis to the line of action of the force, expressed as M = Fd.");
        addStudentAnswerToProblemAnswer(pa20a_3, sa20a_3_student10);

        StudentAnswer sa20a_4_student10 = createStudentAnswer(student10, pa20a_4, "Static equilibrium occurs when a body is at rest and the sum of all forces and moments acting on it is zero. In this state, the body does not experience any linear or rotational motion.");
        addStudentAnswerToProblemAnswer(pa20a_4, sa20a_4_student10);

        StudentAnswer sa20a_5_student10 = createStudentAnswer(student10, pa20a_5, "The resultant force is the single force that has the same effect as the combined forces acting on a body. It is calculated by vector addition of all the individual forces in the system.");
        addStudentAnswerToProblemAnswer(pa20a_5, sa20a_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa20b_1_student9 = createStudentAnswer(student9, pa20b_1, "Dynamics is the study of bodies in motion. It involves analyzing the forces and torques that cause motion and understanding the principles of kinematics and kinetics.");
        addStudentAnswerToProblemAnswer(pa20b_1, sa20b_1_student9);

        StudentAnswer sa20b_2_student9 = createStudentAnswer(student9, pa20b_2, "Kinematics is the branch of dynamics that deals with the description of motion without considering the forces that cause it. It involves analyzing the position, velocity, and acceleration of objects.");
        addStudentAnswerToProblemAnswer(pa20b_2, sa20b_2_student9);

        StudentAnswer sa20b_3_student9 = createStudentAnswer(student9, pa20b_3, "Kinetics is the branch of dynamics that deals with the forces and torques that cause motion. It involves analyzing the relationship between the motion of objects and the forces acting on them.");
        addStudentAnswerToProblemAnswer(pa20b_3, sa20b_3_student9);

        StudentAnswer sa20b_4_student9 = createStudentAnswer(student9, pa20b_4_new, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. This law is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addStudentAnswerToProblemAnswer(pa20b_4_new, sa20b_4_student9);

        StudentAnswer sa20b_5_student9 = createStudentAnswer(student9, pa20b_5, "Velocity is the rate of change of displacement with respect to time, and it is a vector quantity with both magnitude and direction. Acceleration is the rate of change of velocity with respect to time, and it is also a vector quantity.");
        addStudentAnswerToProblemAnswer(pa20b_5, sa20b_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa20b_1_student10 = createStudentAnswer(student10, pa20b_1, "Dynamics is the study of bodies in motion. It involves analyzing the forces and torques that cause motion and understanding the principles of kinematics and kinetics.");
        addStudentAnswerToProblemAnswer(pa20b_1, sa20b_1_student10);

        StudentAnswer sa20b_2_student10 = createStudentAnswer(student10, pa20b_2, "Kinematics is the branch of dynamics that deals with the description of motion without considering the forces that cause it. It involves analyzing the position, velocity, and acceleration of objects.");
        addStudentAnswerToProblemAnswer(pa20b_2, sa20b_2_student10);

        StudentAnswer sa20b_3_student10 = createStudentAnswer(student10, pa20b_3, "Kinetics is the branch of dynamics that deals with the forces and torques that cause motion. It involves analyzing the relationship between the motion of objects and the forces acting on them.");
        addStudentAnswerToProblemAnswer(pa20b_3, sa20b_3_student10);

        StudentAnswer sa20b_4_student10 = createStudentAnswer(student10, pa20b_4_new, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. This law is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addStudentAnswerToProblemAnswer(pa20b_4_new, sa20b_4_student10);

        StudentAnswer sa20b_5_student10 = createStudentAnswer(student10, pa20b_5, "Velocity is the rate of change of displacement with respect to time, and it is a vector quantity with both magnitude and direction. Acceleration is the rate of change of velocity with respect to time, and it is also a vector quantity.");
        addStudentAnswerToProblemAnswer(pa20b_5, sa20b_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa20c_1_student9 = createStudentAnswer(student9, pa20c_1, "Thermodynamics is the branch of physics that deals with the study of heat, energy, and the transformation of energy from one form to another. It involves understanding the principles governing the behavior of gases and liquids, as well as the laws of thermodynamics.");
        addStudentAnswerToProblemAnswer(pa20c_1, sa20c_1_student9);

        StudentAnswer sa20c_2_student9 = createStudentAnswer(student9, pa20c_2, "The first law of thermodynamics, also known as the law of energy conservation, states that energy cannot be created or destroyed, only transformed from one form to another. It is expressed as ΔU = Q - W, where ΔU is the change in internal energy, Q is the heat added to the system, and W is the work done by the system.");
        addStudentAnswerToProblemAnswer(pa20c_2, sa20c_2_student9);

        StudentAnswer sa20c_3_student9 = createStudentAnswer(student9, pa20c_3, "The second law of thermodynamics states that the entropy of an isolated system always increases over time. It also implies that heat naturally flows from a region of higher temperature to a region of lower temperature and that it is impossible to convert heat completely into work without some loss of energy.");
        addStudentAnswerToProblemAnswer(pa20c_3, sa20c_3_student9);

        StudentAnswer sa20c_4_student9 = createStudentAnswer(student9, pa20c_4, "Entropy is a measure of the disorder or randomness in a system. It quantifies the number of possible microstates of a system and is a key concept in the second law of thermodynamics. Higher entropy indicates greater disorder and lower energy availability for work.");
        addStudentAnswerToProblemAnswer(pa20c_4, sa20c_4_student9);

        StudentAnswer sa20c_5_student9 = createStudentAnswer(student9, pa20c_5, "The third law of thermodynamics states that as the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value. This implies that it is impossible to reach absolute zero through any finite number of processes.");
        addStudentAnswerToProblemAnswer(pa20c_5, sa20c_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa20c_1_student10 = createStudentAnswer(student10, pa20c_1, "Thermodynamics is the branch of physics that deals with the study of heat, energy, and the transformation of energy from one form to another. It involves understanding the principles governing the behavior of gases and liquids, as well as the laws of thermodynamics.");
        addStudentAnswerToProblemAnswer(pa20c_1, sa20c_1_student10);

        StudentAnswer sa20c_2_student10 = createStudentAnswer(student10, pa20c_2, "The first law of thermodynamics, also known as the law of energy conservation, states that energy cannot be created or destroyed, only transformed from one form to another. It is expressed as ΔU = Q - W, where ΔU is the change in internal energy, Q is the heat added to the system, and W is the work done by the system.");
        addStudentAnswerToProblemAnswer(pa20c_2, sa20c_2_student10);

        StudentAnswer sa20c_3_student10 = createStudentAnswer(student10, pa20c_3, "The second law of thermodynamics states that the entropy of an isolated system always increases over time. It also implies that heat naturally flows from a region of higher temperature to a region of lower temperature and that it is impossible to convert heat completely into work without some loss of energy.");
        addStudentAnswerToProblemAnswer(pa20c_3, sa20c_3_student10);

        StudentAnswer sa20c_4_student10 = createStudentAnswer(student10, pa20c_4, "Entropy is a measure of the disorder or randomness in a system. It quantifies the number of possible microstates of a system and is a key concept in the second law of thermodynamics. Higher entropy indicates greater disorder and lower energy availability for work.");
        addStudentAnswerToProblemAnswer(pa20c_4, sa20c_4_student10);

        StudentAnswer sa20c_5_student10 = createStudentAnswer(student10, pa20c_5, "The third law of thermodynamics states that as the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value. This implies that it is impossible to reach absolute zero through any finite number of processes.");
        addStudentAnswerToProblemAnswer(pa20c_5, sa20c_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa20d_1_student9 = createStudentAnswer(student9, pa20d_1, "Material science is the study of the properties and behavior of materials. It involves understanding the structure, composition, and performance of different materials and how they can be used in various engineering applications.");
        addStudentAnswerToProblemAnswer(pa20d_1, sa20d_1_student9);

        StudentAnswer sa20d_2_student9 = createStudentAnswer(student9, pa20d_2, "The main types of materials studied in material science include metals, ceramics, polymers, and composites. Each type has distinct properties and applications, making them suitable for different engineering purposes.");
        addStudentAnswerToProblemAnswer(pa20d_2, sa20d_2_student9);

        StudentAnswer sa20d_3_student9 = createStudentAnswer(student9, pa20d_3, "Metals have properties such as high electrical and thermal conductivity, ductility, malleability, and strength. They are widely used in engineering applications such as construction, transportation, and electronics.");
        addStudentAnswerToProblemAnswer(pa20d_3, sa20d_3_student9);

        StudentAnswer sa20d_4_student9 = createStudentAnswer(student9, pa20d_4, "Ceramics are non-metallic, inorganic materials that are typically hard, brittle, and resistant to heat and chemical attack. They are used in applications such as pottery, building materials, and high-temperature environments.");
        addStudentAnswerToProblemAnswer(pa20d_4, sa20d_4_student9);

        StudentAnswer sa20d_5_student9 = createStudentAnswer(student9, pa20d_5, "Polymers are large molecules composed of repeating structural units. They can be natural or synthetic and have properties such as flexibility, elasticity, and low density. Polymers are used in a wide range of applications, including plastics, textiles, and medical devices.");
        addStudentAnswerToProblemAnswer(pa20d_5, sa20d_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa20d_1_student10 = createStudentAnswer(student10, pa20d_1, "Material science is the study of the properties and behavior of materials. It involves understanding the structure, composition, and performance of different materials and how they can be used in various engineering applications.");
        addStudentAnswerToProblemAnswer(pa20d_1, sa20d_1_student10);

        StudentAnswer sa20d_2_student10 = createStudentAnswer(student10, pa20d_2, "The main types of materials studied in material science include metals, ceramics, polymers, and composites. Each type has distinct properties and applications, making them suitable for different engineering purposes.");
        addStudentAnswerToProblemAnswer(pa20d_2, sa20d_2_student10);

        StudentAnswer sa20d_3_student10 = createStudentAnswer(student10, pa20d_3, "Metals have properties such as high electrical and thermal conductivity, ductility, malleability, and strength. They are widely used in engineering applications such as construction, transportation, and electronics.");
        addStudentAnswerToProblemAnswer(pa20d_3, sa20d_3_student10);

        StudentAnswer sa20d_4_student10 = createStudentAnswer(student10, pa20d_4, "Ceramics are non-metallic, inorganic materials that are typically hard, brittle, and resistant to heat and chemical attack. They are used in applications such as pottery, building materials, and high-temperature environments.");
        addStudentAnswerToProblemAnswer(pa20d_4, sa20d_4_student10);

        StudentAnswer sa20d_5_student10 = createStudentAnswer(student10, pa20d_5, "Polymers are large molecules composed of repeating structural units. They can be natural or synthetic and have properties such as flexibility, elasticity, and low density. Polymers are used in a wide range of applications, including plastics, textiles, and medical devices.");
        addStudentAnswerToProblemAnswer(pa20d_5, sa20d_5_student10);

// Creating submission for student9 with student answers for 17a
        Submission submission17a_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17a_1_student9, sa17a_2_student9, sa17a_3_student9, sa17a_4_student9, sa17a_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17a_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17a_9);
        }

// Creating submission for student10 with student answers for 17a
        Submission submission17a_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17a_1_student10, sa17a_2_student10, sa17a_3_student10, sa17a_4_student10, sa17a_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17a_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17a_10);
        }
// Creating submission for student9 with student answers for 17b
        Submission submission17b_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17b_1_student9, sa17b_2_student9, sa17b_3_student9, sa17b_4_student9, sa17b_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17b_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17b_9);
        }

// Creating submission for student10 with student answers for 17b
        Submission submission17b_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17b_1_student10, sa17b_2_student10, sa17b_3_student10, sa17b_4_student10, sa17b_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17b_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17b_10);
        }
// Creating submission for student9 with student answers for 17c
        Submission submission17c_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17c_1_student9, sa17c_2_student9, sa17c_3_student9, sa17c_4_student9, sa17c_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17c_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17c_9);
        }

// Creating submission for student10 with student answers for 17c
        Submission submission17c_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17c_1_student10, sa17c_2_student10, sa17c_3_student10, sa17c_4_student10, sa17c_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17c_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17c_10);
        }
// Creating submission for student9 with student answers for 17d
        Submission submission17d_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17d_1_student9, sa17d_2_student9, sa17d_3_student9, sa17d_4_student9, sa17d_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17d_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17d_9);
        }

// Creating submission for student10 with student answers for 17d
        Submission submission17d_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17d_1_student10, sa17d_2_student10, sa17d_3_student10, sa17d_4_student10, sa17d_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17d_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17d_10);
        }
// Creating submission for student9 with student answers for 18a
        Submission submission18a_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18a_1_student9, sa18a_2_student9, sa18a_3_student9, sa18a_4_student9, sa18a_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18a_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18a_9);
        }

// Creating submission for student10 with student answers for 18a
        Submission submission18a_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18a_1_student10, sa18a_2_student10, sa18a_3_student10, sa18a_4_student10, sa18a_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18a_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18a_10);
        }
// Creating submission for student9 with student answers for 18b
        Submission submission18b_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18b_1_student9, sa18b_2_student9, sa18b_3_student9, sa18b_4_student9, sa18b_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18b_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18b_9);
        }

// Creating submission for student10 with student answers for 18b
        Submission submission18b_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18b_1_student10, sa18b_2_student10, sa18b_3_student10, sa18b_4_student10, sa18b_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18b_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18b_10);
        }
// Creating submission for student9 with student answers for 18c
        Submission submission18c_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18c_1_student9, sa18c_2_student9, sa18c_3_student9, sa18c_4_student9, sa18c_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18c_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18c_9);
        }

// Creating submission for student10 with student answers for 18c
        Submission submission18c_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18c_1_student10, sa18c_2_student10, sa18c_3_student10, sa18c_4_student10, sa18c_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18c_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18c_10);
        }
// Creating submission for student9 with student answers for 19a
        Submission submission19a_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19a_1_student9, sa19a_2_student9, sa19a_3_student9, sa19a_4_student9, sa19a_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19a_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19a_9);
        }

// Creating submission for student10 with student answers for 19a
        Submission submission19a_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19a_1_student10, sa19a_2_student10, sa19a_3_student10, sa19a_4_student10, sa19a_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19a_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19a_10);
        }
// Creating submission for student9 with student answers for 19b
        Submission submission19b_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19b_1_student9, sa19b_2_student9, sa19b_3_student9, sa19b_4_student9, sa19b_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19b_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19b_9);
        }

// Creating submission for student10 with student answers for 19b
        Submission submission19b_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19b_1_student10, sa19b_2_student10, sa19b_3_student10, sa19b_4_student10, sa19b_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19b_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19b_10);
        }
// Creating submission for student9 with student answers for 19c
        Submission submission19c_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19c_1_student9, sa19c_2_student9, sa19c_3_student9, sa19c_4_student9, sa19c_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19c_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19c_9);
        }

// Creating submission for student10 with student answers for 19c
        Submission submission19c_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19c_1_student10, sa19c_2_student10, sa19c_3_student10, sa19c_4_student10, sa19c_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19c_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19c_10);
        }
// Creating submission for student9 with student answers for 20a
        Submission submission20a_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20a_1_student9, sa20a_2_student9, sa20a_3_student9, sa20a_4_student9, sa20a_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20a_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20a_9);
        }

// Creating submission for student10 with student answers for 20a
        Submission submission20a_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20a_1_student10, sa20a_2_student10, sa20a_3_student10, sa20a_4_student10, sa20a_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20a_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20a_10);
        }
// Creating submission for student9 with student answers for 20b
        Submission submission20b_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20b_1_student9, sa20b_2_student9, sa20b_3_student9, sa20b_4_student9, sa20b_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20b_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20b_9);
        }

// Creating submission for student10 with student answers for 20b
        Submission submission20b_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20b_1_student10, sa20b_2_student10, sa20b_3_student10, sa20b_4_student10, sa20b_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20b_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20b_10);
        }
// Creating submission for student9 with student answers for 20c
        Submission submission20c_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20c_1_student9, sa20c_2_student9, sa20c_3_student9, sa20c_4_student9, sa20c_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20c_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20c_9);
        }

// Creating submission for student10 with student answers for 20c
        Submission submission20c_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20c_1_student10, sa20c_2_student10, sa20c_3_student10, sa20c_4_student10, sa20c_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20c_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20c_10);
        }
// Creating submission for student9 with student answers for 20d
        Submission submission20d_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20d_1_student9, sa20d_2_student9, sa20d_3_student9, sa20d_4_student9, sa20d_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20d_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20d_9);
        }

// Creating submission for student10 with student answers for 20d
        Submission submission20d_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20d_1_student10, sa20d_2_student10, sa20d_3_student10, sa20d_4_student10, sa20d_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20d_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20d_10);
        }

        Grade grade17a_9 = createGrade(87.4, student9, faculty2, course17, submission17a_9);
        Grade grade17a_10 = createGrade(89.1, student10, faculty2, course17, submission17a_10);
        Grade grade17b_9 = createGrade(85.8, student9, faculty2, course17, submission17b_9);
        Grade grade17b_10 = createGrade(88.7, student10, faculty2, course17, submission17b_10);
        Grade grade17c_9 = createGrade(89.3, student9, faculty2, course17, submission17c_9);
        Grade grade17c_10 = createGrade(86.5, student10, faculty2, course17, submission17c_10);
        Grade grade17d_9 = createGrade(87.7, student9, faculty2, course17, submission17d_9);
        Grade grade17d_10 = createGrade(88.9, student10, faculty2, course17, submission17d_10);

        Grade grade18a_9 = createGrade(87.8, student9, faculty3, course18, submission18a_9);
        Grade grade18a_10 = createGrade(89.2, student10, faculty3, course18, submission18a_10);
        Grade grade18b_9 = createGrade(86.5, student9, faculty3, course18, submission18b_9);
        Grade grade18b_10 = createGrade(88.1, student10, faculty3, course18, submission18b_10);
        Grade grade18c_9 = createGrade(87.3, student9, faculty3, course18, submission18c_9);
        Grade grade18c_10 = createGrade(85.6, student10, faculty3, course18, submission18c_10);

        Grade grade19a_9 = createGrade(88.4, student9, faculty4, course19, submission19a_9);
        Grade grade19a_10 = createGrade(86.9, student10, faculty4, course19, submission19a_10);
        Grade grade19b_9 = createGrade(87.7, student9, faculty4, course19, submission19b_9);
        Grade grade19b_10 = createGrade(89.3, student10, faculty4, course19, submission19b_10);
        Grade grade19c_9 = createGrade(85.8, student9, faculty4, course19, submission19c_9);
        Grade grade19c_10 = createGrade(88.1, student10, faculty4, course19, submission19c_10);

        Grade grade20a_9 = createGrade(88.9, student9, faculty5, course20, submission20a_9);
        Grade grade20a_10 = createGrade(86.5, student10, faculty5, course20, submission20a_10);
        Grade grade20b_9 = createGrade(87.6, student9, faculty5, course20, submission20b_9);
        Grade grade20b_10 = createGrade(89.4, student10, faculty5, course20, submission20b_10);
        Grade grade20c_9 = createGrade(86.2, student9, faculty5, course20, submission20c_9);
        Grade grade20c_10 = createGrade(88.3, student10, faculty5, course20, submission20c_10);
        Grade grade20d_9 = createGrade(87.7, student9, faculty5, course20, submission20d_9);
        Grade grade20d_10 = createGrade(85.8, student10, faculty5, course20, submission20d_10);

        CourseGrade courseGrade17a_9 = createCourseGrade(student9, course17, 87.55, Arrays.asList(grade17a_9, grade17b_9, grade17c_9, grade17d_9));
        CourseGrade courseGrade17a_10 = createCourseGrade(student10, course17, 88.3, Arrays.asList(grade17a_10, grade17b_10, grade17c_10, grade17d_10));

        CourseGrade courseGrade18a_9 = createCourseGrade(student9, course18, 87.2, Arrays.asList(grade18a_9, grade18b_9, grade18c_9));
        CourseGrade courseGrade18a_10 = createCourseGrade(student10, course18, 87.63, Arrays.asList(grade18a_10, grade18b_10, grade18c_10));

        CourseGrade courseGrade19a_9 = createCourseGrade(student9, course19, 87.3, Arrays.asList(grade19a_9, grade19b_9, grade19c_9));
        CourseGrade courseGrade19a_10 = createCourseGrade(student10, course19, 88.1, Arrays.asList(grade19a_10, grade19b_10, grade19c_10));

        CourseGrade courseGrade20a_9 = createCourseGrade(student9, course20, 87.6, Arrays.asList(grade20a_9, grade20b_9, grade20c_9, grade20d_9));
        CourseGrade courseGrade20a_10 = createCourseGrade(student10, course20, 87.5, Arrays.asList(grade20a_10, grade20b_10, grade20c_10, grade20d_10));

        Feedback feedback17a_9 = createFeedback("Excellent work, student9!", submission17a_9);
        Feedback feedback17a_10 = createFeedback("Great effort, student10!", submission17a_10);

        Feedback feedback17b_9 = createFeedback("Impressive answers, student9.", submission17b_9);
        Feedback feedback17b_10 = createFeedback("Nice job, student10.", submission17b_10);

        Feedback feedback17c_9 = createFeedback("Well done on the answers, student9.", submission17c_9);
        Feedback feedback17c_10 = createFeedback("Good work, student10!", submission17c_10);

        Feedback feedback17d_9 = createFeedback("Great effort, student9!", submission17d_9);
        Feedback feedback17d_10 = createFeedback("Well done, student10!", submission17d_10);

        Feedback feedback18a_9 = createFeedback("Excellent work, student9!", submission18a_9);
        Feedback feedback18a_10 = createFeedback("Great effort, student10!", submission18a_10);

        Feedback feedback18b_9 = createFeedback("Impressive answers, student9.", submission18b_9);
        Feedback feedback18b_10 = createFeedback("Nice job, student10.", submission18b_10);

        Feedback feedback18c_9 = createFeedback("Well done on the answers, student9.", submission18c_9);
        Feedback feedback18c_10 = createFeedback("Good work, student10!", submission18c_10);

        Feedback feedback19a_9 = createFeedback("Excellent work, student9!", submission19a_9);
        Feedback feedback19a_10 = createFeedback("Great effort, student10!", submission19a_10);

        Feedback feedback19b_9 = createFeedback("Impressive answers, student9.", submission19b_9);
        Feedback feedback19b_10 = createFeedback("Nice job, student10.", submission19b_10);

        Feedback feedback19c_9 = createFeedback("Well done on the answers, student9.", submission19c_9);
        Feedback feedback19c_10 = createFeedback("Good work, student10!", submission19c_10);

        Feedback feedback20a_9 = createFeedback("Excellent work, student9!", submission20a_9);
        Feedback feedback20a_10 = createFeedback("Great effort, student10!", submission20a_10);

        Feedback feedback20b_9 = createFeedback("Impressive answers, student9.", submission20b_9);
        Feedback feedback20b_10 = createFeedback("Nice job, student10.", submission20b_10);

        Feedback feedback20c_9 = createFeedback("Well done on the answers, student9.", submission20c_9);
        Feedback feedback20c_10 = createFeedback("Good work, student10!", submission20c_10);

        Feedback feedback20d_9 = createFeedback("Great effort, student9!", submission20d_9);
        Feedback feedback20d_10 = createFeedback("Well done, student10!", submission20d_10);

        course17.setGrades(Arrays.asList(grade17a_9, grade17a_10, grade17b_9, grade17b_10, grade17c_9, grade17c_10, grade17d_9, grade17d_10));
        course18.setGrades(Arrays.asList(grade18a_9, grade18a_10, grade18b_9, grade18b_10, grade18c_9, grade18c_10));
        course19.setGrades(Arrays.asList(grade19a_9, grade19a_10, grade19b_9, grade19b_10, grade19c_9, grade19c_10));
        course20.setGrades(Arrays.asList(grade20a_9, grade20a_10, grade20b_9, grade20b_10, grade20c_9, grade20c_10, grade20d_9, grade20d_10));

        createFacultyWithTest(faculty2, Arrays.asList(grade17a_9, grade17a_10, grade17b_9, grade17b_10, grade17c_9, grade17c_10, grade17d_9, grade17d_10), Arrays.asList(test17a, test17b, test17c, test17d));
        createFacultyWithTest(faculty3, Arrays.asList(grade18a_9, grade18a_10, grade18b_9, grade18b_10, grade18c_9, grade18c_10), Arrays.asList(test18a, test18b, test18c));
        createFacultyWithTest(faculty4, Arrays.asList(grade19a_9, grade19a_10, grade19b_9, grade19b_10, grade19c_9, grade19c_10), Arrays.asList(test19a, test19b, test19c));
        createFacultyWithTest(faculty5, Arrays.asList(grade20a_9, grade20a_10, grade20b_9, grade20b_10, grade20c_9, grade20c_10, grade20d_9, grade20d_10), Arrays.asList(test20a, test20b, test20c, test20d));


        course17.setCourseGrades(Arrays.asList(courseGrade17a_9, courseGrade17a_10));
        course18.setCourseGrades(Arrays.asList(courseGrade18a_9, courseGrade18a_10));
        course19.setCourseGrades(Arrays.asList(courseGrade19a_9, courseGrade19a_10));
        course20.setCourseGrades(Arrays.asList(courseGrade20a_9, courseGrade20a_10));

        linkSubmissionDetails(submission17a_9, student9, grade17a_9, feedback17a_9, Arrays.asList(sa17a_1_student9, sa17a_2_student9, sa17a_3_student9, sa17a_4_student9, sa17a_5_student9));
        linkSubmissionDetails(submission17a_10, student10, grade17a_10, feedback17a_10, Arrays.asList(sa17a_1_student10, sa17a_2_student10, sa17a_3_student10, sa17a_4_student10, sa17a_5_student10));
        linkSubmissionDetails(submission17b_9, student9, grade17b_9, feedback17b_9, Arrays.asList(sa17b_1_student9, sa17b_2_student9, sa17b_3_student9, sa17b_4_student9, sa17b_5_student9));
        linkSubmissionDetails(submission17b_10, student10, grade17b_10, feedback17b_10, Arrays.asList(sa17b_1_student10, sa17b_2_student10, sa17b_3_student10, sa17b_4_student10, sa17b_5_student10));
        linkSubmissionDetails(submission17c_9, student9, grade17c_9, feedback17c_9, Arrays.asList(sa17c_1_student9, sa17c_2_student9, sa17c_3_student9, sa17c_4_student9, sa17c_5_student9));
        linkSubmissionDetails(submission17c_10, student10, grade17c_10, feedback17c_10, Arrays.asList(sa17c_1_student10, sa17c_2_student10, sa17c_3_student10, sa17c_4_student10, sa17c_5_student10));
        linkSubmissionDetails(submission17d_9, student9, grade17d_9, feedback17d_9, Arrays.asList(sa17d_1_student9, sa17d_2_student9, sa17d_3_student9, sa17d_4_student9, sa17d_5_student9));
        linkSubmissionDetails(submission17d_10, student10, grade17d_10, feedback17d_10, Arrays.asList(sa17d_1_student10, sa17d_2_student10, sa17d_3_student10, sa17d_4_student10, sa17d_5_student10));

        linkSubmissionDetails(submission18a_9, student9, grade18a_9, feedback18a_9, Arrays.asList(sa18a_1_student9, sa18a_2_student9, sa18a_3_student9, sa18a_4_student9, sa18a_5_student9));
        linkSubmissionDetails(submission18a_10, student10, grade18a_10, feedback18a_10, Arrays.asList(sa18a_1_student10, sa18a_2_student10, sa18a_3_student10, sa18a_4_student10, sa18a_5_student10));
        linkSubmissionDetails(submission18b_9, student9, grade18b_9, feedback18b_9, Arrays.asList(sa18b_1_student9, sa18b_2_student9, sa18b_3_student9, sa18b_4_student9, sa18b_5_student9));
        linkSubmissionDetails(submission18b_10, student10, grade18b_10, feedback18b_10, Arrays.asList(sa18b_1_student10, sa18b_2_student10, sa18b_3_student10, sa18b_4_student10, sa18b_5_student10));
        linkSubmissionDetails(submission18c_9, student9, grade18c_9, feedback18c_9, Arrays.asList(sa18c_1_student9, sa18c_2_student9, sa18c_3_student9, sa18c_4_student9, sa18c_5_student9));
        linkSubmissionDetails(submission18c_10, student10, grade18c_10, feedback18c_10, Arrays.asList(sa18c_1_student10, sa18c_2_student10, sa18c_3_student10, sa18c_4_student10, sa18c_5_student10));

        linkSubmissionDetails(submission19a_9, student9, grade19a_9, feedback19a_9, Arrays.asList(sa19a_1_student9, sa19a_2_student9, sa19a_3_student9, sa19a_4_student9, sa19a_5_student9));
        linkSubmissionDetails(submission19a_10, student10, grade19a_10, feedback19a_10, Arrays.asList(sa19a_1_student10, sa19a_2_student10, sa19a_3_student10, sa19a_4_student10, sa19a_5_student10));
        linkSubmissionDetails(submission19b_9, student9, grade19b_9, feedback19b_9, Arrays.asList(sa19b_1_student9, sa19b_2_student9, sa19b_3_student9, sa19b_4_student9, sa19b_5_student9));
        linkSubmissionDetails(submission19b_10, student10, grade19b_10, feedback19b_10, Arrays.asList(sa19b_1_student10, sa19b_2_student10, sa19b_3_student10, sa19b_4_student10, sa19b_5_student10));
        linkSubmissionDetails(submission19c_9, student9, grade19c_9, feedback19c_9, Arrays.asList(sa19c_1_student9, sa19c_2_student9, sa19c_3_student9, sa19c_4_student9, sa19c_5_student9));
        linkSubmissionDetails(submission19c_10, student10, grade19c_10, feedback19c_10, Arrays.asList(sa19c_1_student10, sa19c_2_student10, sa19c_3_student10, sa19c_4_student10, sa19c_5_student10));

        linkSubmissionDetails(submission20a_9, student9, grade20a_9, feedback20a_9, Arrays.asList(sa20a_1_student9, sa20a_2_student9, sa20a_3_student9, sa20a_4_student9, sa20a_5_student9));
        linkSubmissionDetails(submission20a_10, student10, grade20a_10, feedback20a_10, Arrays.asList(sa20a_1_student10, sa20a_2_student10, sa20a_3_student10, sa20a_4_student10, sa20a_5_student10));
        linkSubmissionDetails(submission20b_9, student9, grade20b_9, feedback20b_9, Arrays.asList(sa20b_1_student9, sa20b_2_student9, sa20b_3_student9, sa20b_4_student9, sa20b_5_student9));
        linkSubmissionDetails(submission20b_10, student10, grade20b_10, feedback20b_10, Arrays.asList(sa20b_1_student10, sa20b_2_student10, sa20b_3_student10, sa20b_4_student10, sa20b_5_student10));
        linkSubmissionDetails(submission20c_9, student9, grade20c_9, feedback20c_9, Arrays.asList(sa20c_1_student9, sa20c_2_student9, sa20c_3_student9, sa20c_4_student9, sa20c_5_student9));
        linkSubmissionDetails(submission20c_10, student10, grade20c_10, feedback20c_10, Arrays.asList(sa20c_1_student10, sa20c_2_student10, sa20c_3_student10, sa20c_4_student10, sa20c_5_student10));
        linkSubmissionDetails(submission20d_9, student9, grade20d_9, feedback20d_9, Arrays.asList(sa20d_1_student9, sa20d_2_student9, sa20d_3_student9, sa20d_4_student9, sa20d_5_student9));
        linkSubmissionDetails(submission20d_10, student10, grade20d_10, feedback20d_10, Arrays.asList(sa20d_1_student10, sa20d_2_student10, sa20d_3_student10, sa20d_4_student10, sa20d_5_student10));

        syllabus17.setTests(Arrays.asList(test17a, test17b, test17c, test17d));
        syllabus18.setTests(Arrays.asList(test18a, test18b, test18c));
        syllabus19.setTests(Arrays.asList(test19a, test19b, test19c));
        syllabus20.setTests(Arrays.asList(test20a, test20b, test20c, test20d));

        studentTest(student9, Arrays.asList(grade17a_9, grade17b_9, grade17c_9, grade17d_9, grade18a_9, grade18b_9, grade18c_9, grade19a_9, grade19b_9, grade19c_9, grade20a_9, grade20b_9, grade20c_9, grade20d_9), Arrays.asList(courseGrade17a_9, courseGrade18a_9, courseGrade19a_9, courseGrade20a_9), Arrays.asList(test17a, test17b, test17c, test17d, test18a, test18b, test18c, test19a, test19b, test19c, test20a, test20b, test20c, test20d));
        studentTest(student10, Arrays.asList(grade17a_10, grade17b_10, grade17c_10, grade17d_10, grade18a_10, grade18b_10, grade18c_10, grade19a_10, grade19b_10, grade19c_10, grade20a_10, grade20b_10, grade20c_10, grade20d_10), Arrays.asList(courseGrade17a_10, courseGrade18a_10, courseGrade19a_10, courseGrade20a_10), Arrays.asList(test17a, test17b, test17c, test17d, test18a, test18b, test18c, test19a, test19b, test19c, test20a, test20b, test20c, test20d));

    }
}
