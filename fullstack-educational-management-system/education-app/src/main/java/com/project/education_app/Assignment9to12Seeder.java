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
@Order(4)
@Data
public class Assignment9to12Seeder implements CommandLineRunner {
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
        Assignment assignment9_1 = createAssignment("Machine Learning Assignment", faculty4, Date.from(LocalDate.of(2028, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);
        Assignment assignment9_2 = createAssignment("Neural Networks Assignment", faculty4, Date.from(LocalDate.of(2028, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);
        Assignment assignment9_3 = createAssignment("Natural Language Processing Assignment", faculty4, Date.from(LocalDate.of(2028, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);
        Assignment assignment10_1 = createAssignment("Threat Analysis Assignment", faculty5, Date.from(LocalDate.of(2028, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        Assignment assignment10_2 = createAssignment("Encryption Assignment", faculty5, Date.from(LocalDate.of(2028, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        Assignment assignment10_3 = createAssignment("Network Security Assignment", faculty5, Date.from(LocalDate.of(2028, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        Assignment assignment10_4 = createAssignment("Secure Coding Assignment", faculty5, Date.from(LocalDate.of(2028, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        Assignment assignment11_1 = createAssignment("Limits Assignment", faculty1, Date.from(LocalDate.of(2028, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        Assignment assignment11_2 = createAssignment("Derivatives Assignment", faculty1, Date.from(LocalDate.of(2028, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        Assignment assignment11_3 = createAssignment("Integrals Assignment", faculty1, Date.from(LocalDate.of(2028, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        Assignment assignment11_4 = createAssignment("Applications of Calculus Assignment", faculty1, Date.from(LocalDate.of(2028, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        Assignment assignment12_1 = createAssignment("Vectors Assignment", faculty2, Date.from(LocalDate.of(2028, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        Assignment assignment12_2 = createAssignment("Matrices Assignment", faculty2, Date.from(LocalDate.of(2029, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        Assignment assignment12_3 = createAssignment("Determinants Assignment", faculty2, Date.from(LocalDate.of(2029, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        Assignment assignment12_4 = createAssignment("Eigenvalues Assignment", faculty2, Date.from(LocalDate.of(2029, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        Assignment assignment12_5 = createAssignment("Eigenvectors Assignment", faculty2, Date.from(LocalDate.of(2029, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        assignmentRepo.saveAllAndFlush(Arrays.asList(assignment9_1, assignment9_2, assignment9_3, assignment10_1, assignment10_2, assignment10_3, assignment10_4, assignment11_1, assignment11_2, assignment11_3, assignment11_4, assignment12_1, assignment12_2, assignment12_3, assignment12_4, assignment12_5));

        addStudentToAssignment(assignment9_1, student5);
        addStudentToAssignment(assignment9_1, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_9_1_1 = createProblemAnswer("What is machine learning?", "Machine learning is a subset of AI that focuses on developing algorithms that enable computers to learn from and make predictions based on data.");
        addAssignmentToProblemAnswer(pa_9_1_1, assignment9_1);
        addProblemAnswerToAssignment(assignment9_1, pa_9_1_1);

        ProblemAnswer pa_9_1_2 = createProblemAnswer("What are some common machine learning techniques?", "Common machine learning techniques include supervised learning, unsupervised learning, reinforcement learning, and deep learning.");
        addAssignmentToProblemAnswer(pa_9_1_2, assignment9_1);
        addProblemAnswerToAssignment(assignment9_1, pa_9_1_2);

        ProblemAnswer pa_9_1_3 = createProblemAnswer("What is supervised learning?", "Supervised learning is a machine learning technique where the model is trained on labeled data. The model learns to make predictions based on input-output pairs provided during training.");
        addAssignmentToProblemAnswer(pa_9_1_3, assignment9_1);
        addProblemAnswerToAssignment(assignment9_1, pa_9_1_3);

        ProblemAnswer pa_9_1_4 = createProblemAnswer("What is unsupervised learning?", "Unsupervised learning is a machine learning technique where the model is trained on unlabeled data. The model learns to find patterns and relationships in the data without explicit input-output pairs.");
        addAssignmentToProblemAnswer(pa_9_1_4, assignment9_1);
        addProblemAnswerToAssignment(assignment9_1, pa_9_1_4);

        ProblemAnswer pa_9_1_5 = createProblemAnswer("What is reinforcement learning?", "Reinforcement learning is a machine learning technique where the model learns to make decisions by interacting with an environment. The model receives rewards or penalties based on its actions and learns to maximize cumulative rewards.");
        addAssignmentToProblemAnswer(pa_9_1_5, assignment9_1);
        addProblemAnswerToAssignment(assignment9_1, pa_9_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Machine Learning' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment9_2, student5);
        addStudentToAssignment(assignment9_2, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_9_2_1 = createProblemAnswer("What are neural networks?", "Neural networks are a set of algorithms modeled after the human brain. They are used to recognize patterns and make predictions based on data.");
        addAssignmentToProblemAnswer(pa_9_2_1, assignment9_2);
        addProblemAnswerToAssignment(assignment9_2, pa_9_2_1);

        ProblemAnswer pa_9_2_2 = createProblemAnswer("What is the basic architecture of a neural network?", "The basic architecture of a neural network consists of an input layer, hidden layers, and an output layer. Each layer is made up of interconnected nodes (neurons) that process and transmit information.");
        addAssignmentToProblemAnswer(pa_9_2_2, assignment9_2);
        addProblemAnswerToAssignment(assignment9_2, pa_9_2_2);

        ProblemAnswer pa_9_2_3 = createProblemAnswer("What is backpropagation in neural networks?", "Backpropagation is a training algorithm used in neural networks to minimize the error by adjusting the weights of the connections between neurons. It involves propagating the error backward through the network and updating the weights to improve the model's accuracy.");
        addAssignmentToProblemAnswer(pa_9_2_3, assignment9_2);
        addProblemAnswerToAssignment(assignment9_2, pa_9_2_3);

        ProblemAnswer pa_9_2_4 = createProblemAnswer("What is an activation function in neural networks?", "An activation function is a mathematical function applied to the output of a neuron to introduce non-linearity into the model. Common activation functions include ReLU, sigmoid, and tanh.");
        addAssignmentToProblemAnswer(pa_9_2_4, assignment9_2);
        addProblemAnswerToAssignment(assignment9_2, pa_9_2_4);

        ProblemAnswer pa_9_2_5 = createProblemAnswer("What is a feedforward neural network?", "A feedforward neural network is a type of neural network where connections between the nodes do not form cycles. The information moves in one direction, from the input layer to the output layer, without looping back.");
        addAssignmentToProblemAnswer(pa_9_2_5, assignment9_2);
        addProblemAnswerToAssignment(assignment9_2, pa_9_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Neural Networks' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment9_3, student5);
        addStudentToAssignment(assignment9_3, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_9_3_1 = createProblemAnswer("What is natural language processing (NLP)?", "Natural language processing (NLP) is a field of AI that enables computers to understand, interpret, and generate human language. It involves a combination of linguistics, computer science, and machine learning.");
        addAssignmentToProblemAnswer(pa_9_3_1, assignment9_3);
        addProblemAnswerToAssignment(assignment9_3, pa_9_3_1);

        ProblemAnswer pa_9_3_2 = createProblemAnswer("What are some common applications of NLP?", "Common applications of NLP include language translation, sentiment analysis, chatbots, speech recognition, and text summarization.");
        addAssignmentToProblemAnswer(pa_9_3_2, assignment9_3);
        addProblemAnswerToAssignment(assignment9_3, pa_9_3_2);

        ProblemAnswer pa_9_3_3 = createProblemAnswer("What is tokenization in NLP?", "Tokenization is the process of breaking down a text into smaller units called tokens. Tokens can be words, phrases, or sentences, and are the basic building blocks for NLP tasks.");
        addAssignmentToProblemAnswer(pa_9_3_3, assignment9_3);
        addProblemAnswerToAssignment(assignment9_3, pa_9_3_3);

        ProblemAnswer pa_9_3_4 = createProblemAnswer("What is sentiment analysis?", "Sentiment analysis is an NLP technique used to determine the emotional tone of a piece of text. It classifies the text as positive, negative, or neutral based on the words and context.");
        addAssignmentToProblemAnswer(pa_9_3_4, assignment9_3);
        addProblemAnswerToAssignment(assignment9_3, pa_9_3_4);

        ProblemAnswer pa_9_3_5 = createProblemAnswer("What is named entity recognition (NER)?", "Named entity recognition (NER) is an NLP technique used to identify and classify named entities in a text, such as names of people, organizations, locations, dates, and other proper nouns.");
        addAssignmentToProblemAnswer(pa_9_3_5, assignment9_3);
        addProblemAnswerToAssignment(assignment9_3, pa_9_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Natural Language Processing' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment10_1, student5);
        addStudentToAssignment(assignment10_1, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_10_1_1 = createProblemAnswer("What is threat analysis?", "Threat analysis involves identifying potential security threats and vulnerabilities in a system. It is a critical process in ensuring the security and integrity of information and assets.");
        addAssignmentToProblemAnswer(pa_10_1_1, assignment10_1);
        addProblemAnswerToAssignment(assignment10_1, pa_10_1_1);

        ProblemAnswer pa_10_1_2 = createProblemAnswer("What are the key steps in threat analysis?", "The key steps in threat analysis include: (1) Identifying assets and resources, (2) Identifying potential threats, (3) Assessing vulnerabilities, (4) Evaluating risks, and (5) Implementing mitigation strategies.");
        addAssignmentToProblemAnswer(pa_10_1_2, assignment10_1);
        addProblemAnswerToAssignment(assignment10_1, pa_10_1_2);

        ProblemAnswer pa_10_1_3 = createProblemAnswer("What are some common types of security threats?", "Common types of security threats include malware, phishing attacks, denial-of-service (DoS) attacks, man-in-the-middle attacks, and insider threats.");
        addAssignmentToProblemAnswer(pa_10_1_3, assignment10_1);
        addProblemAnswerToAssignment(assignment10_1, pa_10_1_3);

        ProblemAnswer pa_10_1_4 = createProblemAnswer("What is a vulnerability in the context of threat analysis?", "A vulnerability is a weakness or flaw in a system that can be exploited by a threat actor to gain unauthorized access or cause harm. Identifying and addressing vulnerabilities is essential for maintaining security.");
        addAssignmentToProblemAnswer(pa_10_1_4, assignment10_1);
        addProblemAnswerToAssignment(assignment10_1, pa_10_1_4);

        ProblemAnswer pa_10_1_5 = createProblemAnswer("What is risk assessment in threat analysis?", "Risk assessment involves evaluating the potential impact and likelihood of identified threats exploiting vulnerabilities. It helps prioritize security efforts and allocate resources effectively.");
        addAssignmentToProblemAnswer(pa_10_1_5, assignment10_1);
        addProblemAnswerToAssignment(assignment10_1, pa_10_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Threat Analysis' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment10_2, student5);
        addStudentToAssignment(assignment10_2, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_10_2_1 = createProblemAnswer("What is encryption?", "Encryption is the process of converting information into a secure format to prevent unauthorized access. It ensures the confidentiality and integrity of data.");
        addAssignmentToProblemAnswer(pa_10_2_1, assignment10_2);
        addProblemAnswerToAssignment(assignment10_2, pa_10_2_1);

        ProblemAnswer pa_10_2_2 = createProblemAnswer("What are the two main types of encryption?", "The two main types of encryption are symmetric encryption and asymmetric encryption. Symmetric encryption uses the same key for both encryption and decryption, while asymmetric encryption uses a pair of public and private keys.");
        addAssignmentToProblemAnswer(pa_10_2_2, assignment10_2);
        addProblemAnswerToAssignment(assignment10_2, pa_10_2_2);

        ProblemAnswer pa_10_2_3 = createProblemAnswer("What is a cryptographic algorithm?", "A cryptographic algorithm is a mathematical formula used to encrypt and decrypt data. Examples include AES (Advanced Encryption Standard), RSA (Rivest-Shamir-Adleman), and DES (Data Encryption Standard).");
        addAssignmentToProblemAnswer(pa_10_2_3, assignment10_2);
        addProblemAnswerToAssignment(assignment10_2, pa_10_2_3);

        ProblemAnswer pa_10_2_4 = createProblemAnswer("What is the importance of encryption in protecting sensitive data?", "Encryption is essential for protecting sensitive data from unauthorized access, ensuring data confidentiality, and maintaining privacy. It is used in various applications, such as secure communications, financial transactions, and data storage.");
        addAssignmentToProblemAnswer(pa_10_2_4, assignment10_2);
        addProblemAnswerToAssignment(assignment10_2, pa_10_2_4);

        ProblemAnswer pa_10_2_5 = createProblemAnswer("What is an encryption key?", "An encryption key is a piece of information used by a cryptographic algorithm to transform plaintext into ciphertext and vice versa. The security of the encrypted data depends on the strength and secrecy of the key.");
        addAssignmentToProblemAnswer(pa_10_2_5, assignment10_2);
        addProblemAnswerToAssignment(assignment10_2, pa_10_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Encryption' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment10_3, student5);
        addStudentToAssignment(assignment10_3, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_10_3_1 = createProblemAnswer("What is network security?", "Network security involves measures to protect data during transmission across networks. It ensures the confidentiality, integrity, and availability of data by preventing unauthorized access and attacks.");
        addAssignmentToProblemAnswer(pa_10_3_1, assignment10_3);
        addProblemAnswerToAssignment(assignment10_3, pa_10_3_1);

        ProblemAnswer pa_10_3_2 = createProblemAnswer("What is a firewall?", "A firewall is a network security device that monitors and controls incoming and outgoing network traffic. It establishes a barrier between a trusted internal network and untrusted external networks to prevent unauthorized access.");
        addAssignmentToProblemAnswer(pa_10_3_2, assignment10_3);
        addProblemAnswerToAssignment(assignment10_3, pa_10_3_2);

        ProblemAnswer pa_10_3_3 = createProblemAnswer("What is an intrusion detection system (IDS)?", "An intrusion detection system (IDS) is a security tool used to detect and respond to potential security breaches and attacks. It monitors network traffic for suspicious activity and alerts administrators to take action.");
        addAssignmentToProblemAnswer(pa_10_3_3, assignment10_3);
        addProblemAnswerToAssignment(assignment10_3, pa_10_3_3);

        ProblemAnswer pa_10_3_4 = createProblemAnswer("What is the difference between an IDS and an IPS?", "An intrusion detection system (IDS) monitors network traffic and alerts administrators to potential security threats, while an intrusion prevention system (IPS) actively blocks and prevents malicious traffic from entering the network.");
        addAssignmentToProblemAnswer(pa_10_3_4, assignment10_3);
        addProblemAnswerToAssignment(assignment10_3, pa_10_3_4);

        ProblemAnswer pa_10_3_5 = createProblemAnswer("What is network segmentation?", "Network segmentation involves dividing a network into smaller, isolated segments to enhance security and control traffic flow. It helps contain potential breaches and limits the spread of attacks.");
        addAssignmentToProblemAnswer(pa_10_3_5, assignment10_3);
        addProblemAnswerToAssignment(assignment10_3, pa_10_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Network Security' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment10_4, student5);
        addStudentToAssignment(assignment10_4, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_10_4_1 = createProblemAnswer("What is secure coding?", "Secure coding involves writing software in a way that minimizes vulnerabilities and prevents security breaches. It follows best practices and guidelines to ensure the security and integrity of the software.");
        addAssignmentToProblemAnswer(pa_10_4_1, assignment10_4);
        addProblemAnswerToAssignment(assignment10_4, pa_10_4_1);

        ProblemAnswer pa_10_4_2 = createProblemAnswer("What are common security flaws in software development?", "Common security flaws include buffer overflows, SQL injection, cross-site scripting (XSS), cross-site request forgery (CSRF), and improper error handling.");
        addAssignmentToProblemAnswer(pa_10_4_2, assignment10_4);
        addProblemAnswerToAssignment(assignment10_4, pa_10_4_2);

        ProblemAnswer pa_10_4_3 = createProblemAnswer("What is SQL injection?", "SQL injection is a type of attack where an attacker inserts malicious SQL code into a query, allowing them to manipulate the database. Proper input validation and parameterized queries can prevent SQL injection.");
        addAssignmentToProblemAnswer(pa_10_4_3, assignment10_4);
        addProblemAnswerToAssignment(assignment10_4, pa_10_4_3);

        ProblemAnswer pa_10_4_4 = createProblemAnswer("What is cross-site scripting (XSS)?", "Cross-site scripting (XSS) is a security vulnerability where an attacker injects malicious scripts into web pages viewed by users. Proper input validation and output encoding can prevent XSS attacks.");
        addAssignmentToProblemAnswer(pa_10_4_4, assignment10_4);
        addProblemAnswerToAssignment(assignment10_4, pa_10_4_4);

        ProblemAnswer pa_10_4_5 = createProblemAnswer("What is cross-site request forgery (CSRF)?", "Cross-site request forgery (CSRF) is a type of attack where an attacker tricks a user into performing actions on a web application without their consent. Using anti-CSRF tokens and validating user sessions can prevent CSRF attacks.");
        addAssignmentToProblemAnswer(pa_10_4_5, assignment10_4);
        addProblemAnswerToAssignment(assignment10_4, pa_10_4_5);


// Output for confirmation
        System.out.println("Assignment for 'Secure Coding' unit created with  problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment11_1, student5);
        addStudentToAssignment(assignment11_1, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_11_1_1 = createProblemAnswer("What is a limit in calculus?", "A limit is the value that a function approaches as the input approaches a certain value. It is a foundational concept in calculus used to define continuity, derivatives, and integrals.");
        addAssignmentToProblemAnswer(pa_11_1_1, assignment11_1);
        addProblemAnswerToAssignment(assignment11_1, pa_11_1_1);

        ProblemAnswer pa_11_1_2 = createProblemAnswer("How do you calculate the limit of a function as x approaches a value?", "To calculate the limit of a function as x approaches a value, substitute the value into the function. If the function is not defined at that point, use algebraic manipulation or limit laws to simplify and find the limit.");
        addAssignmentToProblemAnswer(pa_11_1_2, assignment11_1);
        addProblemAnswerToAssignment(assignment11_1, pa_11_1_2);

        ProblemAnswer pa_11_1_3 = createProblemAnswer("What are one-sided limits?", "One-sided limits are limits that approach a specific value from only one side—either from the left (left-hand limit) or the right (right-hand limit). They are used to understand the behavior of functions at points of discontinuity.");
        addAssignmentToProblemAnswer(pa_11_1_3, assignment11_1);
        addProblemAnswerToAssignment(assignment11_1, pa_11_1_3);

        ProblemAnswer pa_11_1_4 = createProblemAnswer("What is the limit law of sums?", "The limit law of sums states that the limit of the sum of two functions is equal to the sum of their limits. Mathematically, if lim(x->c)f(x) = L and lim(x->c)g(x) = M, then lim(x->c)[f(x) + g(x)] = L + M.");
        addAssignmentToProblemAnswer(pa_11_1_4, assignment11_1);
        addProblemAnswerToAssignment(assignment11_1, pa_11_1_4);

        ProblemAnswer pa_11_1_5 = createProblemAnswer("What is the epsilon-delta definition of a limit?", "The epsilon-delta definition of a limit formalizes the concept of a limit. It states that for every ε > 0, there exists a δ > 0 such that if 0 < |x - c| < δ, then |f(x) - L| < ε, where L is the limit as x approaches c.");
        addAssignmentToProblemAnswer(pa_11_1_5, assignment11_1);
        addProblemAnswerToAssignment(assignment11_1, pa_11_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Limits' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment11_2, student5);
        addStudentToAssignment(assignment11_2, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_11_2_1 = createProblemAnswer("What is a derivative in calculus?", "A derivative represents the rate at which a function changes as its input changes. It is a fundamental concept in calculus used to determine the slope of a function at any given point.");
        addAssignmentToProblemAnswer(pa_11_2_1, assignment11_2);
        addProblemAnswerToAssignment(assignment11_2, pa_11_2_1);

        ProblemAnswer pa_11_2_2 = createProblemAnswer("How do you calculate the derivative of a function?", "The derivative of a function is calculated using differentiation techniques. The most common method is the limit definition: f'(x) = lim(h->0)[f(x+h) - f(x)]/h.");
        addAssignmentToProblemAnswer(pa_11_2_2, assignment11_2);
        addProblemAnswerToAssignment(assignment11_2, pa_11_2_2);

        ProblemAnswer pa_11_2_3 = createProblemAnswer("What are some common rules of differentiation?", "Common rules of differentiation include the power rule, product rule, quotient rule, and chain rule. These rules simplify the process of finding derivatives for various types of functions.");
        addAssignmentToProblemAnswer(pa_11_2_3, assignment11_2);
        addProblemAnswerToAssignment(assignment11_2, pa_11_2_3);

        ProblemAnswer pa_11_2_4 = createProblemAnswer("What is the power rule in differentiation?", "The power rule states that the derivative of x^n (where n is a constant) is n*x^(n-1). For example, the derivative of x^3 is 3*x^2.");
        addAssignmentToProblemAnswer(pa_11_2_4, assignment11_2);
        addProblemAnswerToAssignment(assignment11_2, pa_11_2_4);

        ProblemAnswer pa_11_2_5 = createProblemAnswer("What is the product rule in differentiation?", "The product rule is used to find the derivative of the product of two functions. It states that (uv)' = u'v + uv', where u and v are functions of x.");
        addAssignmentToProblemAnswer(pa_11_2_5, assignment11_2);
        addProblemAnswerToAssignment(assignment11_2, pa_11_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Derivatives' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment11_3, student5);
        addStudentToAssignment(assignment11_3, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_11_3_1 = createProblemAnswer("What is an integral in calculus?", "An integral represents the accumulation of quantities over a continuous interval. It is the inverse operation of differentiation and is used to calculate areas, volumes, and other related quantities.");
        addAssignmentToProblemAnswer(pa_11_3_1, assignment11_3);
        addProblemAnswerToAssignment(assignment11_3, pa_11_3_1);

        ProblemAnswer pa_11_3_2 = createProblemAnswer("What is the Fundamental Theorem of Calculus?", "The Fundamental Theorem of Calculus links differentiation and integration. It states that if F is an antiderivative of f on an interval [a, b], then the integral of f from a to b is F(b) - F(a).");
        addAssignmentToProblemAnswer(pa_11_3_2, assignment11_3);
        addProblemAnswerToAssignment(assignment11_3, pa_11_3_2);

        ProblemAnswer pa_11_3_3 = createProblemAnswer("How do you calculate a definite integral?", "To calculate a definite integral, find the antiderivative of the integrand and evaluate it at the upper and lower limits of integration. Subtract the value at the lower limit from the value at the upper limit.");
        addAssignmentToProblemAnswer(pa_11_3_3, assignment11_3);
        addProblemAnswerToAssignment(assignment11_3, pa_11_3_3);

        ProblemAnswer pa_11_3_4 = createProblemAnswer("What is an indefinite integral?", "An indefinite integral represents the family of all antiderivatives of a function. It is expressed with the integral symbol and includes a constant of integration (C), written as ∫f(x)dx = F(x) + C.");
        addAssignmentToProblemAnswer(pa_11_3_4, assignment11_3);
        addProblemAnswerToAssignment(assignment11_3, pa_11_3_4);

        ProblemAnswer pa_11_3_5 = createProblemAnswer("What is the method of integration by substitution?", "Integration by substitution is a method used to simplify the process of integration by changing the variable of integration. It involves substituting a new variable and its differential to rewrite the integral in a simpler form.");
        addAssignmentToProblemAnswer(pa_11_3_5, assignment11_3);
        addProblemAnswerToAssignment(assignment11_3, pa_11_3_5);

// Output for confirmation
        System.out.println("Assignment for 'Integrals' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment11_4, student5);
        addStudentToAssignment(assignment11_4, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_11_4_1 = createProblemAnswer("How is calculus used in physics?", "Calculus is used in physics to model and analyze the behavior of physical systems. It helps describe motion, forces, and energy through derivatives and integrals, such as in calculating velocity, acceleration, and work.");
        addAssignmentToProblemAnswer(pa_11_4_1, assignment11_4);
        addProblemAnswerToAssignment(assignment11_4, pa_11_4_1);

        ProblemAnswer pa_11_4_2 = createProblemAnswer("What are some applications of calculus in engineering?", "Calculus is used in engineering for designing and analyzing systems, optimizing processes, and solving differential equations. It is essential in fields like civil engineering (structural analysis), mechanical engineering (thermodynamics), and electrical engineering (circuit analysis).");
        addAssignmentToProblemAnswer(pa_11_4_2, assignment11_4);
        addProblemAnswerToAssignment(assignment11_4, pa_11_4_2);

        ProblemAnswer pa_11_4_3 = createProblemAnswer("How is calculus used in economics?", "In economics, calculus is used to model and analyze economic systems, optimize production and consumption, and study changes in variables over time. It helps in calculating marginal cost, revenue, and profit, and in solving differential equations in economic models.");
        addAssignmentToProblemAnswer(pa_11_4_3, assignment11_4);
        addProblemAnswerToAssignment(assignment11_4, pa_11_4_3);

        ProblemAnswer pa_11_4_4 = createProblemAnswer("What is the role of calculus in biology?", "Calculus is used in biology to model population dynamics, spread of diseases, and changes in biological systems. It helps in understanding growth rates, decay processes, and interactions between species.");
        addAssignmentToProblemAnswer(pa_11_4_4, assignment11_4);
        addProblemAnswerToAssignment(assignment11_4, pa_11_4_4);

        ProblemAnswer pa_11_4_5 = createProblemAnswer("How is calculus used in computer science?", "Calculus is used in computer science for algorithm analysis, computer graphics, machine learning, and simulations. It helps in optimizing algorithms, modeling continuous data, and solving differential equations in numerical methods.");
        addAssignmentToProblemAnswer(pa_11_4_5, assignment11_4);
        addProblemAnswerToAssignment(assignment11_4, pa_11_4_5);

// Output for confirmation
        System.out.println("Assignment for 'Applications of Calculus' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment12_1, student5);
        addStudentToAssignment(assignment12_1, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_12_1_1 = createProblemAnswer("What is a vector?", "A vector is a quantity that has both magnitude and direction. It is represented by an arrow pointing from one point to another in space.");
        addAssignmentToProblemAnswer(pa_12_1_1, assignment12_1);
        addProblemAnswerToAssignment(assignment12_1, pa_12_1_1);

        ProblemAnswer pa_12_1_2 = createProblemAnswer("What is vector addition?", "Vector addition is the process of adding two or more vectors together to get a resultant vector. It is done by adding the corresponding components of the vectors.");
        addAssignmentToProblemAnswer(pa_12_1_2, assignment12_1);
        addProblemAnswerToAssignment(assignment12_1, pa_12_1_2);

        ProblemAnswer pa_12_1_3 = createProblemAnswer("What is scalar multiplication?", "Scalar multiplication involves multiplying a vector by a scalar (a real number). It changes the magnitude of the vector but not its direction.");
        addAssignmentToProblemAnswer(pa_12_1_3, assignment12_1);
        addProblemAnswerToAssignment(assignment12_1, pa_12_1_3);

        ProblemAnswer pa_12_1_4 = createProblemAnswer("What is the dot product of two vectors?", "The dot product (or scalar product) of two vectors is a measure of their alignment. It is calculated as the product of their magnitudes and the cosine of the angle between them.");
        addAssignmentToProblemAnswer(pa_12_1_4, assignment12_1);
        addProblemAnswerToAssignment(assignment12_1, pa_12_1_4);

        ProblemAnswer pa_12_1_5 = createProblemAnswer("What is the cross product of two vectors?", "The cross product (or vector product) of two vectors is a vector that is perpendicular to both of the original vectors. It is calculated as the product of their magnitudes and the sine of the angle between them.");
        addAssignmentToProblemAnswer(pa_12_1_5, assignment12_1);
        addProblemAnswerToAssignment(assignment12_1, pa_12_1_5);

// Output for confirmation
        System.out.println("Assignment for 'Vectors' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment12_2, student5);
        addStudentToAssignment(assignment12_2, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_12_2_1 = createProblemAnswer("What is a matrix?", "A matrix is a rectangular array of numbers arranged in rows and columns. It is used to represent and solve systems of linear equations and perform various operations in mathematics.");
        addAssignmentToProblemAnswer(pa_12_2_1, assignment12_2);
        addProblemAnswerToAssignment(assignment12_2, pa_12_2_1);

        ProblemAnswer pa_12_2_2 = createProblemAnswer("What is matrix addition?", "Matrix addition is the process of adding two matrices by adding their corresponding elements. The matrices must have the same dimensions for addition to be possible.");
        addAssignmentToProblemAnswer(pa_12_2_2, assignment12_2);
        addProblemAnswerToAssignment(assignment12_2, pa_12_2_2);

        ProblemAnswer pa_12_2_3 = createProblemAnswer("What is matrix multiplication?", "Matrix multiplication is the process of multiplying two matrices by taking the dot product of rows and columns. The number of columns in the first matrix must equal the number of rows in the second matrix.");
        addAssignmentToProblemAnswer(pa_12_2_3, assignment12_2);
        addProblemAnswerToAssignment(assignment12_2, pa_12_2_3);

        ProblemAnswer pa_12_2_4 = createProblemAnswer("What is the identity matrix?", "The identity matrix is a square matrix with ones on the diagonal and zeros elsewhere. It acts as the multiplicative identity in matrix multiplication, meaning any matrix multiplied by the identity matrix remains unchanged.");
        addAssignmentToProblemAnswer(pa_12_2_4, assignment12_2);
        addProblemAnswerToAssignment(assignment12_2, pa_12_2_4);

        ProblemAnswer pa_12_2_5 = createProblemAnswer("What is the inverse of a matrix?", "The inverse of a matrix is a matrix that, when multiplied by the original matrix, yields the identity matrix. Not all matrices have inverses. A matrix must be square and have a non-zero determinant to have an inverse.");
        addAssignmentToProblemAnswer(pa_12_2_5, assignment12_2);
        addProblemAnswerToAssignment(assignment12_2, pa_12_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Matrices' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment12_3, student5);
        addStudentToAssignment(assignment12_3, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_12_3_1 = createProblemAnswer("What is a determinant?", "A determinant is a scalar value that can be computed from the elements of a square matrix. It provides important information about the matrix, such as whether it is invertible.");
        addAssignmentToProblemAnswer(pa_12_3_1, assignment12_3);
        addProblemAnswerToAssignment(assignment12_3, pa_12_3_1);

        ProblemAnswer pa_12_3_2 = createProblemAnswer("How do you calculate the determinant of a 2x2 matrix?", "The determinant of a 2x2 matrix [a b; c d] is calculated as ad - bc.");
        addAssignmentToProblemAnswer(pa_12_3_2, assignment12_3);
        addProblemAnswerToAssignment(assignment12_3, pa_12_3_2);

        ProblemAnswer pa_12_3_3 = createProblemAnswer("What is the importance of determinants in linear algebra?", "Determinants are important in linear algebra because they help determine the invertibility of a matrix, solve systems of linear equations, and find the area or volume of geometric shapes.");
        addAssignmentToProblemAnswer(pa_12_3_3, assignment12_3);
        addProblemAnswerToAssignment(assignment12_3, pa_12_3_3);

        ProblemAnswer pa_12_3_4 = createProblemAnswer("How do you calculate the determinant of a 3x3 matrix?", "The determinant of a 3x3 matrix [a b c; d e f; g h i] is calculated using the formula: a(ei - fh) - b(di - fg) + c(dh - eg).");
        addAssignmentToProblemAnswer(pa_12_3_4, assignment12_3);
        addProblemAnswerToAssignment(assignment12_3, pa_12_3_4);

        ProblemAnswer pa_12_3_5 = createProblemAnswer("What are some properties of determinants?", "Some properties of determinants include: (1) The determinant of the identity matrix is 1, (2) The determinant of a matrix product is the product of the determinants, (3) Swapping two rows or columns changes the sign of the determinant, (4) The determinant of a triangular matrix is the product of its diagonal elements.");
        addAssignmentToProblemAnswer(pa_12_3_5, assignment12_3);
        addProblemAnswerToAssignment(assignment12_3, pa_12_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Determinants' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus

        addStudentToAssignment(assignment12_4, student5);
        addStudentToAssignment(assignment12_4, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_12_4_1 = createProblemAnswer("What are eigenvalues?", "Eigenvalues are special numbers associated with a matrix that characterize the scaling factor by which the eigenvectors are stretched or compressed under a linear transformation.");
        addAssignmentToProblemAnswer(pa_12_4_1, assignment12_4);
        addProblemAnswerToAssignment(assignment12_4, pa_12_4_1);

        ProblemAnswer pa_12_4_2 = createProblemAnswer("How do you calculate eigenvalues of a matrix?", "Eigenvalues are calculated by solving the characteristic equation, which is obtained by setting the determinant of (A - λI) equal to zero, where A is the matrix, λ is the eigenvalue, and I is the identity matrix.");
        addAssignmentToProblemAnswer(pa_12_4_2, assignment12_4);
        addProblemAnswerToAssignment(assignment12_4, pa_12_4_2);

        ProblemAnswer pa_12_4_3 = createProblemAnswer("What is the characteristic equation of a matrix?", "The characteristic equation of a matrix A is given by det(A - λI) = 0, where det denotes the determinant, λ represents the eigenvalue, and I is the identity matrix.");
        addAssignmentToProblemAnswer(pa_12_4_3, assignment12_4);
        addProblemAnswerToAssignment(assignment12_4, pa_12_4_3);

        ProblemAnswer pa_12_4_4 = createProblemAnswer("What is the significance of eigenvalues in linear algebra?", "Eigenvalues provide important information about the properties of a matrix, such as its invertibility, stability, and behavior under linear transformations. They are used in various applications, including differential equations and matrix diagonalization.");
        addAssignmentToProblemAnswer(pa_12_4_4, assignment12_4);
        addProblemAnswerToAssignment(assignment12_4, pa_12_4_4);

        ProblemAnswer pa_12_4_5 = createProblemAnswer("What is the relationship between eigenvalues and the determinant of a matrix?", "The determinant of a matrix is equal to the product of its eigenvalues. This relationship provides a way to calculate the determinant using eigenvalues and helps in understanding the properties of the matrix.");
        addAssignmentToProblemAnswer(pa_12_4_5, assignment12_4);
        addProblemAnswerToAssignment(assignment12_4, pa_12_4_5);

// Output for confirmation
        System.out.println("Assignment for 'Eigenvalues' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        addStudentToAssignment(assignment12_5, student5);
        addStudentToAssignment(assignment12_5, student6);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_12_5_1 = createProblemAnswer("What are eigenvectors?", "Eigenvectors are special vectors associated with a matrix that remain in the same direction under a linear transformation. They are scaled by their corresponding eigenvalues.");
        addAssignmentToProblemAnswer(pa_12_5_1, assignment12_5);
        addProblemAnswerToAssignment(assignment12_5, pa_12_5_1);

        ProblemAnswer pa_12_5_2 = createProblemAnswer("How do you find eigenvectors of a matrix?", "Eigenvectors are found by solving the equation (A - λI)v = 0, where A is the matrix, λ is the eigenvalue, I is the identity matrix, and v is the eigenvector.");
        addAssignmentToProblemAnswer(pa_12_5_2, assignment12_5);
        addProblemAnswerToAssignment(assignment12_5, pa_12_5_2);

        ProblemAnswer pa_12_5_3 = createProblemAnswer("What is the relationship between eigenvectors and eigenvalues?", "Eigenvectors are vectors that are scaled by a factor (the eigenvalue) when a linear transformation is applied. The eigenvalue determines the amount of scaling, while the eigenvector determines the direction.");
        addAssignmentToProblemAnswer(pa_12_5_3, assignment12_5);
        addProblemAnswerToAssignment(assignment12_5, pa_12_5_3);

        ProblemAnswer pa_12_5_4 = createProblemAnswer("What is the significance of eigenvectors in linear transformations?", "Eigenvectors provide insight into the behavior of a linear transformation. They represent directions that remain unchanged by the transformation, helping to understand how the transformation affects different components of a system.");
        addAssignmentToProblemAnswer(pa_12_5_4, assignment12_5);
        addProblemAnswerToAssignment(assignment12_5, pa_12_5_4);

        ProblemAnswer pa_12_5_5 = createProblemAnswer("How are eigenvectors used in matrix diagonalization?", "Matrix diagonalization involves expressing a matrix as a product of its eigenvectors and a diagonal matrix of its eigenvalues. It simplifies matrix operations and helps solve systems of differential equations.");
        addAssignmentToProblemAnswer(pa_12_5_5, assignment12_5);
        addProblemAnswerToAssignment(assignment12_5, pa_12_5_5);

// Output for confirmation
        System.out.println("Assignment for 'Eigenvectors' unit created with 10 problem answers, due date, faculty, and syllabus.");
        problemAnswerRepo.saveAllAndFlush(Arrays.asList(pa_9_1_1, pa_9_1_2, pa_9_1_3, pa_9_1_4, pa_9_1_5, pa_9_2_1, pa_9_2_2, pa_9_2_3, pa_9_2_4, pa_9_2_5, pa_9_3_1, pa_9_3_2, pa_9_3_3, pa_9_3_4, pa_9_3_5, pa_10_1_1, pa_10_1_2, pa_10_1_3, pa_10_1_4, pa_10_1_5, pa_10_2_1, pa_10_2_2, pa_10_2_3, pa_10_2_4, pa_10_2_5, pa_10_3_1, pa_10_3_2, pa_10_3_3, pa_10_3_4, pa_10_3_5, pa_10_4_1, pa_10_4_2, pa_10_4_3, pa_10_4_4, pa_10_4_5, pa_11_1_1, pa_11_1_2, pa_11_1_3, pa_11_1_4, pa_11_1_5, pa_11_2_1, pa_11_2_2, pa_11_2_3, pa_11_2_4, pa_11_2_5, pa_11_3_1, pa_11_3_2, pa_11_3_3, pa_11_3_4, pa_11_3_5, pa_11_4_1, pa_11_4_2, pa_11_4_3, pa_11_4_4, pa_11_4_5, pa_12_1_1, pa_12_1_2, pa_12_1_3, pa_12_1_4, pa_12_1_5, pa_12_2_1, pa_12_2_2, pa_12_2_3, pa_12_2_4, pa_12_2_5, pa_12_3_1, pa_12_3_2, pa_12_3_3, pa_12_3_4, pa_12_3_5, pa_12_4_1, pa_12_4_2, pa_12_4_3, pa_12_4_4, pa_12_4_5, pa_12_5_1, pa_12_5_2, pa_12_5_3, pa_12_5_4, pa_12_5_5));


        // Creating StudentAnswer instances for student5
        StudentAnswer sa9_1_1_student5 = createStudentAnswer(student5, pa_9_1_1, "Machine learning is a subset of AI that focuses on developing algorithms that enable computers to learn from and make predictions based on data.");
        StudentAnswer sa9_1_2_student5 = createStudentAnswer(student5, pa_9_1_2, "Common machine learning techniques include supervised learning, unsupervised learning, reinforcement learning, and deep learning.");
        StudentAnswer sa9_1_3_student5 = createStudentAnswer(student5, pa_9_1_3, "Supervised learning is a technique where the model is trained on labeled data, learning to make predictions based on input-output pairs.");
        StudentAnswer sa9_1_4_student5 = createStudentAnswer(student5, pa_9_1_4, "Unsupervised learning is a technique where the model is trained on unlabeled data, learning to find patterns and relationships without explicit input-output pairs.");
        StudentAnswer sa9_1_5_student5 = createStudentAnswer(student5, pa_9_1_5, "Reinforcement learning is a technique where the model learns to make decisions by interacting with an environment and receiving rewards or penalties.");


// Creating StudentAnswer instances for student6
        StudentAnswer sa9_1_1_student6 = createStudentAnswer(student6, pa_9_1_1, "Machine learning is a subset of AI that focuses on developing algorithms that enable computers to learn from and make predictions based on data.");
        StudentAnswer sa9_1_2_student6 = createStudentAnswer(student6, pa_9_1_2, "Common machine learning techniques include supervised learning, unsupervised learning, reinforcement learning, and deep learning.");
        StudentAnswer sa9_1_3_student6 = createStudentAnswer(student6, pa_9_1_3, "Supervised learning is a technique where the model is trained on labeled data, learning to make predictions based on input-output pairs.");
        StudentAnswer sa9_1_4_student6 = createStudentAnswer(student6, pa_9_1_4, "Unsupervised learning is a technique where the model is trained on unlabeled data, learning to find patterns and relationships without explicit input-output pairs.");
        StudentAnswer sa9_1_5_student6 = createStudentAnswer(student6, pa_9_1_5, "Reinforcement learning is a technique where the model learns to make decisions by interacting with an environment and receiving rewards or penalties.");

// Creating StudentAnswer instances for student5
        StudentAnswer sa9_2_1_student5 = createStudentAnswer(student5, pa_9_2_1, "Neural networks are a set of algorithms modeled after the human brain, used to recognize patterns and make predictions based on data.");
        StudentAnswer sa9_2_2_student5 = createStudentAnswer(student5, pa_9_2_2, "The basic architecture of a neural network consists of an input layer, hidden layers, and an output layer, with interconnected nodes (neurons).");
        StudentAnswer sa9_2_3_student5 = createStudentAnswer(student5, pa_9_2_3, "Backpropagation is a training algorithm that minimizes error by adjusting the weights of the connections between neurons.");
        StudentAnswer sa9_2_4_student5 = createStudentAnswer(student5, pa_9_2_4, "An activation function introduces non-linearity into the model, with common functions including ReLU, sigmoid, and tanh.");
        StudentAnswer sa9_2_5_student5 = createStudentAnswer(student5, pa_9_2_5, "A feedforward neural network moves information in one direction, from the input layer to the output layer, without forming cycles.");


// Creating StudentAnswer instances for student6
        StudentAnswer sa9_2_1_student6 = createStudentAnswer(student6, pa_9_2_1, "Neural networks are a set of algorithms modeled after the human brain, used to recognize patterns and make predictions based on data.");
        StudentAnswer sa9_2_2_student6 = createStudentAnswer(student6, pa_9_2_2, "The basic architecture of a neural network consists of an input layer, hidden layers, and an output layer, with interconnected nodes (neurons).");
        StudentAnswer sa9_2_3_student6 = createStudentAnswer(student6, pa_9_2_3, "Backpropagation is a training algorithm that minimizes error by adjusting the weights of the connections between neurons.");
        StudentAnswer sa9_2_4_student6 = createStudentAnswer(student6, pa_9_2_4, "An activation function introduces non-linearity into the model, with common functions including ReLU, sigmoid, and tanh.");
        StudentAnswer sa9_2_5_student6 = createStudentAnswer(student6, pa_9_2_5, "A feedforward neural network moves information in one direction, from the input layer to the output layer, without forming cycles.");

// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment9_2.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa9_3_1_student5 = createStudentAnswer(student5, pa_9_3_1, "Natural language processing (NLP) is a field of AI that enables computers to understand, interpret, and generate human language.");
        StudentAnswer sa9_3_2_student5 = createStudentAnswer(student5, pa_9_3_2, "Common applications of NLP include language translation, sentiment analysis, chatbots, speech recognition, and text summarization.");
        StudentAnswer sa9_3_3_student5 = createStudentAnswer(student5, pa_9_3_3, "Tokenization is the process of breaking down a text into smaller units called tokens, which can be words, phrases, or sentences.");
        StudentAnswer sa9_3_4_student5 = createStudentAnswer(student5, pa_9_3_4, "Sentiment analysis is an NLP technique used to determine the emotional tone of a piece of text, classifying it as positive, negative, or neutral.");
        StudentAnswer sa9_3_5_student5 = createStudentAnswer(student5, pa_9_3_5, "Named entity recognition (NER) is an NLP technique used to identify and classify named entities in a text, such as names of people, organizations, and locations.");

// Creating StudentAnswer instances for student6
        StudentAnswer sa9_3_1_student6 = createStudentAnswer(student6, pa_9_3_1, "Natural language processing (NLP) is a field of AI that enables computers to understand, interpret, and generate human language.");
        StudentAnswer sa9_3_2_student6 = createStudentAnswer(student6, pa_9_3_2, "Common applications of NLP include language translation, sentiment analysis, chatbots, speech recognition, and text summarization.");
        StudentAnswer sa9_3_3_student6 = createStudentAnswer(student6, pa_9_3_3, "Tokenization is the process of breaking down a text into smaller units called tokens, which can be words, phrases, or sentences.");
        StudentAnswer sa9_3_4_student6 = createStudentAnswer(student6, pa_9_3_4, "Sentiment analysis is an NLP technique used to determine the emotional tone of a piece of text, classifying it as positive, negative, or neutral.");
        StudentAnswer sa9_3_5_student6 = createStudentAnswer(student6, pa_9_3_5, "Named entity recognition (NER) is an NLP technique used to identify and classify named entities in a text, such as names of people, organizations, and locations.");


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment9_3.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa10_1_1_student5 = createStudentAnswer(student5, pa_10_1_1, "Threat analysis involves identifying potential security threats and vulnerabilities in a system.");
        StudentAnswer sa10_1_2_student5 = createStudentAnswer(student5, pa_10_1_2, "Key steps: (1) Identifying assets and resources, (2) Identifying potential threats, (3) Assessing vulnerabilities, (4) Evaluating risks, (5) Implementing mitigation strategies.");
        StudentAnswer sa10_1_3_student5 = createStudentAnswer(student5, pa_10_1_3, "Common security threats include malware, phishing attacks, denial-of-service (DoS) attacks, man-in-the-middle attacks, and insider threats.");
        StudentAnswer sa10_1_4_student5 = createStudentAnswer(student5, pa_10_1_4, "A vulnerability is a weakness or flaw in a system that can be exploited by a threat actor to gain unauthorized access or cause harm.");
        StudentAnswer sa10_1_5_student5 = createStudentAnswer(student5, pa_10_1_5, "Risk assessment evaluates the potential impact and likelihood of identified threats exploiting vulnerabilities.");


// Creating StudentAnswer instances for student6
        StudentAnswer sa10_1_1_student6 = createStudentAnswer(student6, pa_10_1_1, "Threat analysis involves identifying potential security threats and vulnerabilities in a system.");
        StudentAnswer sa10_1_2_student6 = createStudentAnswer(student6, pa_10_1_2, "Key steps: (1) Identifying assets and resources, (2) Identifying potential threats, (3) Assessing vulnerabilities, (4) Evaluating risks, (5) Implementing mitigation strategies.");
        StudentAnswer sa10_1_3_student6 = createStudentAnswer(student6, pa_10_1_3, "Common security threats include malware, phishing attacks, denial-of-service (DoS) attacks, man-in-the-middle attacks, and insider threats.");
        StudentAnswer sa10_1_4_student6 = createStudentAnswer(student6, pa_10_1_4, "A vulnerability is a weakness or flaw in a system that can be exploited by a threat actor to gain unauthorized access or cause harm.");
        StudentAnswer sa10_1_5_student6 = createStudentAnswer(student6, pa_10_1_5, "Risk assessment evaluates the potential impact and likelihood of identified threats exploiting vulnerabilities.");


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment10_1.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa10_2_1_student5 = createStudentAnswer(student5, pa_10_2_1, "Encryption is the process of converting information into a secure format to prevent unauthorized access.");
        StudentAnswer sa10_2_2_student5 = createStudentAnswer(student5, pa_10_2_2, "The two main types of encryption are symmetric encryption and asymmetric encryption.");
        StudentAnswer sa10_2_3_student5 = createStudentAnswer(student5, pa_10_2_3, "A cryptographic algorithm is a mathematical formula used to encrypt and decrypt data, such as AES, RSA, and DES.");
        StudentAnswer sa10_2_4_student5 = createStudentAnswer(student5, pa_10_2_4, "Encryption is essential for protecting sensitive data from unauthorized access, ensuring confidentiality, and maintaining privacy.");
        StudentAnswer sa10_2_5_student5 = createStudentAnswer(student5, pa_10_2_5, "An encryption key is a piece of information used by a cryptographic algorithm to transform plaintext into ciphertext and vice versa.");

// Creating StudentAnswer instances for student6
        StudentAnswer sa10_2_1_student6 = createStudentAnswer(student6, pa_10_2_1, "Encryption is the process of converting information into a secure format to prevent unauthorized access.");
        StudentAnswer sa10_2_2_student6 = createStudentAnswer(student6, pa_10_2_2, "The two main types of encryption are symmetric encryption and asymmetric encryption.");
        StudentAnswer sa10_2_3_student6 = createStudentAnswer(student6, pa_10_2_3, "A cryptographic algorithm is a mathematical formula used to encrypt and decrypt data, such as AES, RSA, and DES.");
        StudentAnswer sa10_2_4_student6 = createStudentAnswer(student6, pa_10_2_4, "Encryption is essential for protecting sensitive data from unauthorized access, ensuring confidentiality, and maintaining privacy.");

        StudentAnswer sa10_2_5_student6 = createStudentAnswer(student6, pa_10_2_5, "An encryption key is a piece of information used by a cryptographic algorithm to transform plaintext into ciphertext and vice versa.");


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment10_2.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa10_3_1_student5 = createStudentAnswer(student5, pa_10_3_1, "Network security involves measures to protect data during transmission across networks, ensuring confidentiality, integrity, and availability.");
        StudentAnswer sa10_3_2_student5 = createStudentAnswer(student5, pa_10_3_2, "A firewall is a network security device that monitors and controls network traffic, establishing a barrier between trusted and untrusted networks.");
        StudentAnswer sa10_3_3_student5 = createStudentAnswer(student5, pa_10_3_3, "An intrusion detection system (IDS) detects and responds to potential security breaches by monitoring network traffic for suspicious activity.");
        StudentAnswer sa10_3_4_student5 = createStudentAnswer(student5, pa_10_3_4, "An IDS alerts administrators to security threats, while an intrusion prevention system (IPS) actively blocks and prevents malicious traffic.");
        StudentAnswer sa10_3_5_student5 = createStudentAnswer(student5, pa_10_3_5, "Network segmentation divides a network into smaller segments to enhance security, contain breaches, and limit the spread of attacks.");


// Creating StudentAnswer instances for student6
        StudentAnswer sa10_3_1_student6 = createStudentAnswer(student6, pa_10_3_1, "Network security involves measures to protect data during transmission across networks, ensuring confidentiality, integrity, and availability.");
        StudentAnswer sa10_3_2_student6 = createStudentAnswer(student6, pa_10_3_2, "A firewall is a network security device that monitors and controls network traffic, establishing a barrier between trusted and untrusted networks.");
        StudentAnswer sa10_3_3_student6 = createStudentAnswer(student6, pa_10_3_3, "An intrusion detection system (IDS) detects and responds to potential security breaches by monitoring network traffic for suspicious activity.");
        StudentAnswer sa10_3_4_student6 = createStudentAnswer(student6, pa_10_3_4, "An IDS alerts administrators to security threats, while an intrusion prevention system (IPS) actively blocks and prevents malicious traffic.");
        StudentAnswer sa10_3_5_student6 = createStudentAnswer(student6, pa_10_3_5, "Network segmentation divides a network into smaller segments to enhance security, contain breaches, and limit the spread of attacks.");


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment10_3.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa10_4_1_student5 = createStudentAnswer(student5, pa_10_4_1, "Secure coding involves writing software in a way that minimizes vulnerabilities and prevents security breaches.");
        StudentAnswer sa10_4_2_student5 = createStudentAnswer(student5, pa_10_4_2, "Common security flaws include buffer overflows, SQL injection, cross-site scripting (XSS), cross-site request forgery (CSRF), and improper error handling.");
        StudentAnswer sa10_4_3_student5 = createStudentAnswer(student5, pa_10_4_3, "SQL injection is an attack where an attacker inserts malicious SQL code into a query, allowing them to manipulate the database.");
        StudentAnswer sa10_4_4_student5 = createStudentAnswer(student5, pa_10_4_4, "Cross-site scripting (XSS) is a vulnerability where an attacker injects malicious scripts into web pages viewed by users.");
        StudentAnswer sa10_4_5_student5 = createStudentAnswer(student5, pa_10_4_5, "Cross-site request forgery (CSRF) is an attack where an attacker tricks a user into performing actions on a web application without their consent.");


// Creating StudentAnswer instances for student6
        StudentAnswer sa10_4_1_student6 = createStudentAnswer(student6, pa_10_4_1, "Secure coding involves writing software in a way that minimizes vulnerabilities and prevents security breaches.");
        StudentAnswer sa10_4_2_student6 = createStudentAnswer(student6, pa_10_4_2, "Common security flaws include buffer overflows, SQL injection, cross-site scripting (XSS), cross-site request forgery (CSRF), and improper error handling.");
        StudentAnswer sa10_4_3_student6 = createStudentAnswer(student6, pa_10_4_3, "SQL injection is an attack where an attacker inserts malicious SQL code into a query, allowing them to manipulate the database.");
        StudentAnswer sa10_4_4_student6 = createStudentAnswer(student6, pa_10_4_4, "Cross-site scripting (XSS) is a vulnerability where an attacker injects malicious scripts into web pages viewed by users.");
        StudentAnswer sa10_4_5_student6 = createStudentAnswer(student6, pa_10_4_5, "Cross-site request forgery (CSRF) is an attack where an attacker tricks a user into performing actions on a web application without their consent.");

// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment10_4.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa11_1_1_student5 = createStudentAnswer(student5, pa_11_1_1, "A limit is the value that a function approaches as the input approaches a certain value, foundational in defining continuity, derivatives, and integrals.");
        StudentAnswer sa11_1_2_student5 = createStudentAnswer(student5, pa_11_1_2, "To calculate the limit of a function as x approaches a value, substitute the value into the function or use algebraic manipulation and limit laws if undefined.");
        StudentAnswer sa11_1_3_student5 = createStudentAnswer(student5, pa_11_1_3, "One-sided limits approach a specific value from either the left (left-hand limit) or the right (right-hand limit), useful for points of discontinuity.");
        StudentAnswer sa11_1_4_student5 = createStudentAnswer(student5, pa_11_1_4, "The limit law of sums states that the limit of the sum of two functions is the sum of their limits, i.e., lim(x->c)[f(x) + g(x)] = L + M.");
        StudentAnswer sa11_1_5_student5 = createStudentAnswer(student5, pa_11_1_5, "The epsilon-delta definition states that for every ε > 0, there exists a δ > 0 such that if 0 < |x - c| < δ, then |f(x) - L| < ε.");


// Creating StudentAnswer instances for student6
        StudentAnswer sa11_1_1_student6 = createStudentAnswer(student6, pa_11_1_1, "A limit is the value that a function approaches as the input approaches a certain value, foundational in defining continuity, derivatives, and integrals.");
        StudentAnswer sa11_1_2_student6 = createStudentAnswer(student6, pa_11_1_2, "To calculate the limit of a function as x approaches a value, substitute the value into the function or use algebraic manipulation and limit laws if undefined.");
        StudentAnswer sa11_1_3_student6 = createStudentAnswer(student6, pa_11_1_3, "One-sided limits approach a specific value from either the left (left-hand limit) or the right (right-hand limit), useful for points of discontinuity.");
        StudentAnswer sa11_1_4_student6 = createStudentAnswer(student6, pa_11_1_4, "The limit law of sums states that the limit of the sum of two functions is the sum of their limits, i.e., lim(x->c)[f(x) + g(x)] = L + M.");
        StudentAnswer sa11_1_5_student6 = createStudentAnswer(student6, pa_11_1_5, "The epsilon-delta definition states that for every ε > 0, there exists a δ > 0 such that if 0 < |x - c| < δ, then |f(x) - L| < ε.");

// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment11_1.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa11_2_1_student5 = createStudentAnswer(student5, pa_11_2_1, "A derivative represents the rate at which a function changes as its input changes, determining the slope of a function at any given point.");
        StudentAnswer sa11_2_2_student5 = createStudentAnswer(student5, pa_11_2_2, "The derivative of a function is calculated using differentiation techniques, commonly the limit definition: f'(x) = lim(h->0)[f(x+h) - f(x)]/h.");
        StudentAnswer sa11_2_3_student5 = createStudentAnswer(student5, pa_11_2_3, "Common rules of differentiation include the power rule, product rule, quotient rule, and chain rule, simplifying the process for various functions.");
        StudentAnswer sa11_2_4_student5 = createStudentAnswer(student5, pa_11_2_4, "The power rule states that the derivative of x^n (where n is a constant) is n*x^(n-1), e.g., the derivative of x^3 is 3*x^2.");
        StudentAnswer sa11_2_5_student5 = createStudentAnswer(student5, pa_11_2_5, "The product rule is used for the derivative of the product of two functions: (uv)' = u'v + uv', where u and v are functions of x.");

// Creating StudentAnswer instances for student6
        StudentAnswer sa11_2_1_student6 = createStudentAnswer(student6, pa_11_2_1, "A derivative represents the rate at which a function changes as its input changes, determining the slope of a function at any given point.");
        StudentAnswer sa11_2_2_student6 = createStudentAnswer(student6, pa_11_2_2, "The derivative of a function is calculated using differentiation techniques, commonly the limit definition: f'(x) = lim(h->0)[f(x+h) - f(x)]/h.");
        StudentAnswer sa11_2_3_student6 = createStudentAnswer(student6, pa_11_2_3, "Common rules of differentiation include the power rule, product rule, quotient rule, and chain rule, simplifying the process for various functions.");
        StudentAnswer sa11_2_4_student6 = createStudentAnswer(student6, pa_11_2_4, "The power rule states that the derivative of x^n (where n is a constant) is n*x^(n-1), e.g., the derivative of x^3 is 3*x^2.");
        StudentAnswer sa11_2_5_student6 = createStudentAnswer(student6, pa_11_2_5, "The product rule is used for the derivative of the product of two functions: (uv)' = u'v + uv', where u and v are functions of x.");

// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment11_2.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa11_3_1_student5 = createStudentAnswer(student5, pa_11_3_1, "An integral represents the accumulation of quantities over a continuous interval and is used to calculate areas, volumes, and other related quantities.");
        StudentAnswer sa11_3_2_student5 = createStudentAnswer(student5, pa_11_3_2, "The Fundamental Theorem of Calculus links differentiation and integration, stating that if F is an antiderivative of f on [a, b], then the integral of f from a to b is F(b) - F(a).");
        StudentAnswer sa11_3_3_student5 = createStudentAnswer(student5, pa_11_3_3, "To calculate a definite integral, find the antiderivative of the integrand, evaluate it at the upper and lower limits, and subtract the lower limit value from the upper limit value.");
        StudentAnswer sa11_3_4_student5 = createStudentAnswer(student5, pa_11_3_4, "An indefinite integral represents the family of all antiderivatives of a function, expressed with the integral symbol and a constant of integration (C).");
        StudentAnswer sa11_3_5_student5 = createStudentAnswer(student5, pa_11_3_5, "Integration by substitution simplifies integration by changing the variable of integration, substituting a new variable and its differential.");

// Creating StudentAnswer instances for student6
        StudentAnswer sa11_3_1_student6 = createStudentAnswer(student6, pa_11_3_1, "An integral represents the accumulation of quantities over a continuous interval and is used to calculate areas, volumes, and other related quantities.");
        StudentAnswer sa11_3_2_student6 = createStudentAnswer(student6, pa_11_3_2, "The Fundamental Theorem of Calculus links differentiation and integration, stating that if F is an antiderivative of f on [a, b], then the integral of f from a to b is F(b) - F(a).");
        StudentAnswer sa11_3_3_student6 = createStudentAnswer(student6, pa_11_3_3, "To calculate a definite integral, find the antiderivative of the integrand, evaluate it at the upper and lower limits, and subtract the lower limit value from the upper limit value.");
        StudentAnswer sa11_3_4_student6 = createStudentAnswer(student6, pa_11_3_4, "An indefinite integral represents the family of all antiderivatives of a function, expressed with the integral symbol and a constant of integration (C).");
        StudentAnswer sa11_3_5_student6 = createStudentAnswer(student6, pa_11_3_5, "Integration by substitution simplifies integration by changing the variable of integration, substituting a new variable and its differential.");

// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment11_3.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa11_4_1_student5 = createStudentAnswer(student5, pa_11_4_1, "Calculus is used in physics to model and analyze physical systems, describing motion, forces, and energy through derivatives and integrals.");
        StudentAnswer sa11_4_2_student5 = createStudentAnswer(student5, pa_11_4_2, "Calculus in engineering is used for designing and analyzing systems, optimizing processes, and solving differential equations in fields like civil, mechanical, and electrical engineering.");
        StudentAnswer sa11_4_3_student5 = createStudentAnswer(student5, pa_11_4_3, "In economics, calculus models economic systems, optimizes production and consumption, and studies changes over time, calculating marginal cost, revenue, and profit.");
        StudentAnswer sa11_4_4_student5 = createStudentAnswer(student5, pa_11_4_4, "Calculus in biology models population dynamics, spread of diseases, and changes in biological systems, understanding growth rates and interactions between species.");
        StudentAnswer sa11_4_5_student5 = createStudentAnswer(student5, pa_11_4_5, "In computer science, calculus is used for algorithm analysis, computer graphics, machine learning, and simulations, optimizing algorithms and modeling continuous data.");

// Creating StudentAnswer instances for student6
        StudentAnswer sa11_4_1_student6 = createStudentAnswer(student6, pa_11_4_1, "Calculus is used in physics to model and analyze physical systems, describing motion, forces, and energy through derivatives and integrals.");
        StudentAnswer sa11_4_2_student6 = createStudentAnswer(student6, pa_11_4_2, "Calculus in engineering is used for designing and analyzing systems, optimizing processes, and solving differential equations in fields like civil, mechanical, and electrical engineering.");
        StudentAnswer sa11_4_3_student6 = createStudentAnswer(student6, pa_11_4_3, "In economics, calculus models economic systems, optimizes production and consumption, and studies changes over time, calculating marginal cost, revenue, and profit.");
        StudentAnswer sa11_4_4_student6 = createStudentAnswer(student6, pa_11_4_4, "Calculus in biology models population dynamics, spread of diseases, and changes in biological systems, understanding growth rates and interactions between species.");
        StudentAnswer sa11_4_5_student6 = createStudentAnswer(student6, pa_11_4_5, "In computer science, calculus is used for algorithm analysis, computer graphics, machine learning, and simulations, optimizing algorithms and modeling continuous data.");

// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment11_4.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa12_1_1_student5 = createStudentAnswer(student5, pa_12_1_1, "A vector is a quantity that has both magnitude and direction, represented by an arrow from one point to another in space.");
        StudentAnswer sa12_1_2_student5 = createStudentAnswer(student5, pa_12_1_2, "Vector addition is the process of adding two or more vectors by adding their corresponding components to get a resultant vector.");
        StudentAnswer sa12_1_3_student5 = createStudentAnswer(student5, pa_12_1_3, "Scalar multiplication involves multiplying a vector by a scalar (a real number), changing the magnitude but not the direction of the vector.");
        StudentAnswer sa12_1_4_student5 = createStudentAnswer(student5, pa_12_1_4, "The dot product (or scalar product) of two vectors is a measure of their alignment, calculated as the product of their magnitudes and the cosine of the angle between them.");
        StudentAnswer sa12_1_5_student5 = createStudentAnswer(student5, pa_12_1_5, "The cross product (or vector product) of two vectors is a vector perpendicular to both original vectors, calculated as the product of their magnitudes and the sine of the angle between them.");

// Creating StudentAnswer instances for student6
        StudentAnswer sa12_1_1_student6 = createStudentAnswer(student6, pa_12_1_1, "A vector is a quantity that has both magnitude and direction, represented by an arrow from one point to another in space.");
        StudentAnswer sa12_1_2_student6 = createStudentAnswer(student6, pa_12_1_2, "Vector addition is the process of adding two or more vectors by adding their corresponding components to get a resultant vector.");
        StudentAnswer sa12_1_3_student6 = createStudentAnswer(student6, pa_12_1_3, "Scalar multiplication involves multiplying a vector by a scalar (a real number), changing the magnitude but not the direction of the vector.");
        StudentAnswer sa12_1_4_student6 = createStudentAnswer(student6, pa_12_1_4, "The dot product (or scalar product) of two vectors is a measure of their alignment, calculated as the product of their magnitudes and the cosine of the angle between them.");
        StudentAnswer sa12_1_5_student6 = createStudentAnswer(student6, pa_12_1_5, "The cross product (or vector product) of two vectors is a vector perpendicular to both original vectors, calculated as the product of their magnitudes and the sine of the angle between them.");

// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment12_1.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa12_2_1_student5 = createStudentAnswer(student5, pa_12_2_1, "A matrix is a rectangular array of numbers arranged in rows and columns, used to represent and solve systems of linear equations.");
        StudentAnswer sa12_2_2_student5 = createStudentAnswer(student5, pa_12_2_2, "Matrix addition involves adding two matrices by adding their corresponding elements. The matrices must have the same dimensions.");
        StudentAnswer sa12_2_3_student5 = createStudentAnswer(student5, pa_12_2_3, "Matrix multiplication involves multiplying two matrices by taking the dot product of rows and columns. The number of columns in the first matrix must equal the number of rows in the second.");
        StudentAnswer sa12_2_4_student5 = createStudentAnswer(student5, pa_12_2_4, "The identity matrix is a square matrix with ones on the diagonal and zeros elsewhere, acting as the multiplicative identity in matrix multiplication.");
        StudentAnswer sa12_2_5_student5 = createStudentAnswer(student5, pa_12_2_5, "The inverse of a matrix is a matrix that, when multiplied by the original matrix, yields the identity matrix. Not all matrices have inverses.");

// Creating StudentAnswer instances for student6
        StudentAnswer sa12_2_1_student6 = createStudentAnswer(student6, pa_12_2_1, "A matrix is a rectangular array of numbers arranged in rows and columns, used to represent and solve systems of linear equations.");
        StudentAnswer sa12_2_2_student6 = createStudentAnswer(student6, pa_12_2_2, "Matrix addition involves adding two matrices by adding their corresponding elements. The matrices must have the same dimensions.");
        StudentAnswer sa12_2_3_student6 = createStudentAnswer(student6, pa_12_2_3, "Matrix multiplication involves multiplying two matrices by taking the dot product of rows and columns. The number of columns in the first matrix must equal the number of rows in the second.");
        StudentAnswer sa12_2_4_student6 = createStudentAnswer(student6, pa_12_2_4, "The identity matrix is a square matrix with ones on the diagonal and zeros elsewhere, acting as the multiplicative identity in matrix multiplication.");
        StudentAnswer sa12_2_5_student6 = createStudentAnswer(student6, pa_12_2_5, "The inverse of a matrix is a matrix that, when multiplied by the original matrix, yields the identity matrix. Not all matrices have inverses.");

// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment12_2.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa12_3_1_student5 = createStudentAnswer(student5, pa_12_3_1, "A determinant is a scalar value computed from the elements of a square matrix, providing important information about the matrix, such as whether it is invertible.");
        StudentAnswer sa12_3_2_student5 = createStudentAnswer(student5, pa_12_3_2, "The determinant of a 2x2 matrix [a b; c d] is calculated as ad - bc.");
        StudentAnswer sa12_3_3_student5 = createStudentAnswer(student5, pa_12_3_3, "Determinants help determine the invertibility of a matrix, solve systems of linear equations, and find the area or volume of geometric shapes.");
        StudentAnswer sa12_3_4_student5 = createStudentAnswer(student5, pa_12_3_4, "The determinant of a 3x3 matrix [a b c; d e f; g h i] is calculated using the formula: a(ei - fh) - b(di - fg) + c(dh - eg).");
        StudentAnswer sa12_3_5_student5 = createStudentAnswer(student5, pa_12_3_5, "Properties of determinants: (1) The determinant of the identity matrix is 1, (2) The determinant of a matrix product is the product of the determinants, (3) Swapping rows or columns changes the sign of the determinant, (4) The determinant of a triangular matrix is the product of its diagonal elements.");

// Creating StudentAnswer instances for student6
        StudentAnswer sa12_3_1_student6 = createStudentAnswer(student6, pa_12_3_1, "A determinant is a scalar value computed from the elements of a square matrix, providing important information about the matrix, such as whether it is invertible.");
        StudentAnswer sa12_3_2_student6 = createStudentAnswer(student6, pa_12_3_2, "The determinant of a 2x2 matrix [a b; c d] is calculated as ad - bc.");
        StudentAnswer sa12_3_3_student6 = createStudentAnswer(student6, pa_12_3_3, "Determinants help determine the invertibility of a matrix, solve systems of linear equations, and find the area or volume of geometric shapes.");
        StudentAnswer sa12_3_4_student6 = createStudentAnswer(student6, pa_12_3_4, "The determinant of a 3x3 matrix [a b c; d e f; g h i] is calculated using the formula: a(ei - fh) - b(di - fg) + c(dh - eg).");
        StudentAnswer sa12_3_5_student6 = createStudentAnswer(student6, pa_12_3_5, "Properties of determinants: (1) The determinant of the identity matrix is 1, (2) The determinant of a matrix product is the product of the determinants, (3) Swapping rows or columns changes the sign of the determinant, (4) The determinant of a triangular matrix is the product of its diagonal elements.");


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment12_3.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa12_4_1_student5 = createStudentAnswer(student5, pa_12_4_1, "Eigenvalues are special numbers associated with a matrix that characterize the scaling factor by which the eigenvectors are stretched or compressed under a linear transformation.");
        StudentAnswer sa12_4_2_student5 = createStudentAnswer(student5, pa_12_4_2, "Eigenvalues are calculated by solving the characteristic equation, obtained by setting the determinant of (A - λI) equal to zero, where A is the matrix, λ is the eigenvalue, and I is the identity matrix.");
        StudentAnswer sa12_4_3_student5 = createStudentAnswer(student5, pa_12_4_3, "The characteristic equation of a matrix A is given by det(A - λI) = 0, where det denotes the determinant, λ represents the eigenvalue, and I is the identity matrix.");
        StudentAnswer sa12_4_4_student5 = createStudentAnswer(student5, pa_12_4_4, "Eigenvalues provide important information about a matrix's properties, such as invertibility, stability, and behavior under linear transformations, used in differential equations and matrix diagonalization.");
        StudentAnswer sa12_4_5_student5 = createStudentAnswer(student5, pa_12_4_5, "The determinant of a matrix is equal to the product of its eigenvalues, providing a way to calculate the determinant using eigenvalues and understanding matrix properties.");

// Creating StudentAnswer instances for student6
        StudentAnswer sa12_4_1_student6 = createStudentAnswer(student6, pa_12_4_1, "Eigenvalues are special numbers associated with a matrix that characterize the scaling factor by which the eigenvectors are stretched or compressed under a linear transformation.");
        StudentAnswer sa12_4_2_student6 = createStudentAnswer(student6, pa_12_4_2, "Eigenvalues are calculated by solving the characteristic equation, obtained by setting the determinant of (A - λI) equal to zero, where A is the matrix, λ is the eigenvalue, and I is the identity matrix.");
        StudentAnswer sa12_4_3_student6 = createStudentAnswer(student6, pa_12_4_3, "The characteristic equation of a matrix A is given by det(A - λI) = 0, where det denotes the determinant, λ represents the eigenvalue, and I is the identity matrix.");
        StudentAnswer sa12_4_4_student6 = createStudentAnswer(student6, pa_12_4_4, "Eigenvalues provide important information about a matrix's properties, such as invertibility, stability, and behavior under linear transformations, used in differential equations and matrix diagonalization.");
        StudentAnswer sa12_4_5_student6 = createStudentAnswer(student6, pa_12_4_5, "The determinant of a matrix is equal to the product of its eigenvalues, providing a way to calculate the determinant using eigenvalues and understanding matrix properties.");

// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment12_4.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa12_5_1_student5 = createStudentAnswer(student5, pa_12_5_1, "Eigenvectors are special vectors associated with a matrix that remain in the same direction under a linear transformation. They are scaled by their corresponding eigenvalues.");
        StudentAnswer sa12_5_2_student5 = createStudentAnswer(student5, pa_12_5_2, "Eigenvectors are found by solving the equation (A - λI)v = 0, where A is the matrix, λ is the eigenvalue, I is the identity matrix, and v is the eigenvector.");
        StudentAnswer sa12_5_3_student5 = createStudentAnswer(student5, pa_12_5_3, "Eigenvectors are vectors scaled by a factor (the eigenvalue) when a linear transformation is applied. The eigenvalue determines the amount of scaling, while the eigenvector determines the direction.");
        StudentAnswer sa12_5_4_student5 = createStudentAnswer(student5, pa_12_5_4, "Eigenvectors provide insight into the behavior of a linear transformation, representing directions that remain unchanged and helping to understand the transformation's effect on different system components.");
        StudentAnswer sa12_5_5_student5 = createStudentAnswer(student5, pa_12_5_5, "Matrix diagonalization involves expressing a matrix as a product of its eigenvectors and a diagonal matrix of its eigenvalues, simplifying matrix operations and solving systems of differential equations.");

// Creating StudentAnswer instances for student6
        StudentAnswer sa12_5_1_student6 = createStudentAnswer(student6, pa_12_5_1, "Eigenvectors are special vectors associated with a matrix that remain in the same direction under a linear transformation. They are scaled by their corresponding eigenvalues.");
        StudentAnswer sa12_5_2_student6 = createStudentAnswer(student6, pa_12_5_2, "Eigenvectors are found by solving the equation (A - λI)v = 0, where A is the matrix, λ is the eigenvalue, I is the identity matrix, and v is the eigenvector.");
        StudentAnswer sa12_5_3_student6 = createStudentAnswer(student6, pa_12_5_3, "Eigenvectors are vectors scaled by a factor (the eigenvalue) when a linear transformation is applied. The eigenvalue determines the amount of scaling, while the eigenvector determines the direction.");
        StudentAnswer sa12_5_4_student6 = createStudentAnswer(student6, pa_12_5_4, "Eigenvectors provide insight into the behavior of a linear transformation, representing directions that remain unchanged and helping to understand the transformation's effect on different system components.");
        StudentAnswer sa12_5_5_student6 = createStudentAnswer(student6, pa_12_5_5, "Matrix diagonalization involves expressing a matrix as a product of its eigenvectors and a diagonal matrix of its eigenvalues, simplifying matrix operations and solving systems of differential equations.");
        studentAnswerRepo.saveAllAndFlush(Arrays.asList(sa9_1_1_student5, sa9_1_2_student5, sa9_1_3_student5, sa9_1_4_student5, sa9_1_5_student5, sa9_2_1_student5, sa9_2_2_student5, sa9_2_3_student5, sa9_2_4_student5, sa9_2_5_student5, sa9_3_1_student5, sa9_3_2_student5, sa9_3_3_student5, sa9_3_4_student5, sa9_3_5_student5, sa9_1_1_student6, sa9_1_2_student6, sa9_1_3_student6, sa9_1_4_student6, sa9_1_5_student6, sa9_2_1_student6, sa9_2_2_student6, sa9_2_3_student6, sa9_2_4_student6, sa9_2_5_student6, sa9_3_1_student6, sa9_3_2_student6, sa9_3_3_student6, sa9_3_4_student6, sa9_3_5_student6,
                sa10_1_1_student5, sa10_1_2_student5, sa10_1_3_student5, sa10_1_4_student5, sa10_1_5_student5, sa10_2_1_student5, sa10_2_2_student5, sa10_2_3_student5, sa10_2_4_student5, sa10_2_5_student5, sa10_3_1_student5, sa10_3_2_student5, sa10_3_3_student5, sa10_3_4_student5, sa10_3_5_student5, sa10_4_1_student5, sa10_4_2_student5, sa10_4_3_student5, sa10_4_4_student5, sa10_4_5_student5, sa10_1_1_student6, sa10_1_2_student6, sa10_1_3_student6, sa10_1_4_student6, sa10_1_5_student6, sa10_2_1_student6, sa10_2_2_student6, sa10_2_3_student6, sa10_2_4_student6, sa10_2_5_student6, sa10_3_1_student6, sa10_3_2_student6, sa10_3_3_student6, sa10_3_4_student6, sa10_3_5_student6, sa10_4_1_student6, sa10_4_2_student6, sa10_4_3_student6, sa10_4_4_student6, sa10_4_5_student6,
                sa11_1_1_student5, sa11_1_2_student5, sa11_1_3_student5, sa11_1_4_student5, sa11_1_5_student5, sa11_2_1_student5, sa11_2_2_student5, sa11_2_3_student5, sa11_2_4_student5, sa11_2_5_student5, sa11_3_1_student5, sa11_3_2_student5, sa11_3_3_student5, sa11_3_4_student5, sa11_3_5_student5, sa11_4_1_student5, sa11_4_2_student5, sa11_4_3_student5, sa11_4_4_student5, sa11_4_5_student5, sa11_1_1_student6, sa11_1_2_student6, sa11_1_3_student6, sa11_1_4_student6, sa11_1_5_student6, sa11_2_1_student6, sa11_2_2_student6, sa11_2_3_student6, sa11_2_4_student6, sa11_2_5_student6, sa11_3_1_student6, sa11_3_2_student6, sa11_3_3_student6, sa11_3_4_student6, sa11_3_5_student6, sa11_4_1_student6, sa11_4_2_student6, sa11_4_3_student6, sa11_4_4_student6, sa11_4_5_student6,
                sa12_1_1_student5, sa12_1_2_student5, sa12_1_3_student5, sa12_1_4_student5, sa12_1_5_student5, sa12_2_1_student5, sa12_2_2_student5, sa12_2_3_student5, sa12_2_4_student5, sa12_2_5_student5, sa12_3_1_student5, sa12_3_2_student5, sa12_3_3_student5, sa12_3_4_student5, sa12_3_5_student5, sa12_4_1_student5, sa12_4_2_student5, sa12_4_3_student5, sa12_4_4_student5, sa12_4_5_student5, sa12_5_1_student5, sa12_5_2_student5, sa12_5_3_student5, sa12_5_4_student5, sa12_5_5_student5, sa12_1_1_student6, sa12_1_2_student6, sa12_1_3_student6, sa12_1_4_student6, sa12_1_5_student6, sa12_2_1_student6, sa12_2_2_student6, sa12_2_3_student6, sa12_2_4_student6, sa12_2_5_student6, sa12_3_1_student6, sa12_3_2_student6, sa12_3_3_student6, sa12_3_4_student6, sa12_3_5_student6, sa12_4_1_student6, sa12_4_2_student6, sa12_4_3_student6, sa12_4_4_student6, sa12_4_5_student6, sa12_5_1_student6, sa12_5_2_student6, sa12_5_3_student6, sa12_5_4_student6, sa12_5_5_student6));

        addStudentAnswerToProblemAnswer(pa_9_1_1, sa9_1_1_student5);
        addStudentAnswerToProblemAnswer(pa_9_1_2, sa9_1_2_student5);
        addStudentAnswerToProblemAnswer(pa_9_1_3, sa9_1_3_student5);
        addStudentAnswerToProblemAnswer(pa_9_1_4, sa9_1_4_student5);
        addStudentAnswerToProblemAnswer(pa_9_1_5, sa9_1_5_student5);
        addStudentAnswerToProblemAnswer(pa_9_1_1, sa9_1_1_student6);
        addStudentAnswerToProblemAnswer(pa_9_1_2, sa9_1_2_student6);
        addStudentAnswerToProblemAnswer(pa_9_1_3, sa9_1_3_student6);
        addStudentAnswerToProblemAnswer(pa_9_1_4, sa9_1_4_student6);
        addStudentAnswerToProblemAnswer(pa_9_1_5, sa9_1_5_student6);
        addStudentAnswerToProblemAnswer(pa_9_2_1, sa9_2_1_student5);
        addStudentAnswerToProblemAnswer(pa_9_2_2, sa9_2_2_student5);
        addStudentAnswerToProblemAnswer(pa_9_2_3, sa9_2_3_student5);
        addStudentAnswerToProblemAnswer(pa_9_2_4, sa9_2_4_student5);
        addStudentAnswerToProblemAnswer(pa_9_2_5, sa9_2_5_student5);
        addStudentAnswerToProblemAnswer(pa_9_2_1, sa9_2_1_student5);
        addStudentAnswerToProblemAnswer(pa_9_2_2, sa9_2_2_student6);
        addStudentAnswerToProblemAnswer(pa_9_2_3, sa9_2_3_student6);
        addStudentAnswerToProblemAnswer(pa_9_2_4, sa9_2_4_student6);
        addStudentAnswerToProblemAnswer(pa_9_2_5, sa9_2_5_student6);
        addStudentAnswerToProblemAnswer(pa_9_3_1, sa9_3_1_student5);
        addStudentAnswerToProblemAnswer(pa_9_3_2, sa9_3_2_student5);
        addStudentAnswerToProblemAnswer(pa_9_3_3, sa9_3_3_student5);
        addStudentAnswerToProblemAnswer(pa_9_3_4, sa9_3_4_student5);
        addStudentAnswerToProblemAnswer(pa_9_3_5, sa9_3_5_student5);
        addStudentAnswerToProblemAnswer(pa_9_3_1, sa9_3_1_student6);
        addStudentAnswerToProblemAnswer(pa_9_3_2, sa9_3_2_student6);
        addStudentAnswerToProblemAnswer(pa_9_3_3, sa9_3_3_student6);
        addStudentAnswerToProblemAnswer(pa_9_3_4, sa9_3_4_student6);
        addStudentAnswerToProblemAnswer(pa_9_3_5, sa9_3_5_student6);
        addStudentAnswerToProblemAnswer(pa_10_1_1, sa10_1_1_student5);
        addStudentAnswerToProblemAnswer(pa_10_1_2, sa10_1_2_student5);
        addStudentAnswerToProblemAnswer(pa_10_1_3, sa10_1_3_student5);
        addStudentAnswerToProblemAnswer(pa_10_1_4, sa10_1_4_student5);
        addStudentAnswerToProblemAnswer(pa_10_1_5, sa10_1_5_student5);
        addStudentAnswerToProblemAnswer(pa_10_1_1, sa10_1_1_student6);
        addStudentAnswerToProblemAnswer(pa_10_1_2, sa10_1_2_student6);
        addStudentAnswerToProblemAnswer(pa_10_1_3, sa10_1_3_student6);
        addStudentAnswerToProblemAnswer(pa_10_1_4, sa10_1_4_student6);
        addStudentAnswerToProblemAnswer(pa_10_1_5, sa10_1_5_student6);
        addStudentAnswerToProblemAnswer(pa_10_2_1, sa10_2_1_student5);
        addStudentAnswerToProblemAnswer(pa_10_2_2, sa10_2_2_student5);
        addStudentAnswerToProblemAnswer(pa_10_2_3, sa10_2_3_student5);
        addStudentAnswerToProblemAnswer(pa_10_2_4, sa10_2_4_student5);
        addStudentAnswerToProblemAnswer(pa_10_2_5, sa10_2_5_student5);
        addStudentAnswerToProblemAnswer(pa_10_2_1, sa10_2_1_student6);
        addStudentAnswerToProblemAnswer(pa_10_2_2, sa10_2_2_student6);
        addStudentAnswerToProblemAnswer(pa_10_2_3, sa10_2_3_student6);
        addStudentAnswerToProblemAnswer(pa_10_2_4, sa10_2_4_student6);
        addStudentAnswerToProblemAnswer(pa_10_2_5, sa10_2_5_student6);
        addStudentAnswerToProblemAnswer(pa_10_3_1, sa10_3_1_student5);
        addStudentAnswerToProblemAnswer(pa_10_3_2, sa10_3_2_student5);
        addStudentAnswerToProblemAnswer(pa_10_3_3, sa10_3_3_student5);
        addStudentAnswerToProblemAnswer(pa_10_3_4, sa10_3_4_student5);
        addStudentAnswerToProblemAnswer(pa_10_3_5, sa10_3_5_student5);
        addStudentAnswerToProblemAnswer(pa_10_3_1, sa10_3_1_student6);
        addStudentAnswerToProblemAnswer(pa_10_3_2, sa10_3_2_student6);
        addStudentAnswerToProblemAnswer(pa_10_3_3, sa10_3_3_student6);
        addStudentAnswerToProblemAnswer(pa_10_3_4, sa10_3_4_student6);
        addStudentAnswerToProblemAnswer(pa_10_3_5, sa10_3_5_student6);
        addStudentAnswerToProblemAnswer(pa_10_4_1, sa10_4_1_student5);
        addStudentAnswerToProblemAnswer(pa_10_4_2, sa10_4_2_student5);
        addStudentAnswerToProblemAnswer(pa_10_4_3, sa10_4_3_student5);
        addStudentAnswerToProblemAnswer(pa_10_4_4, sa10_4_4_student5);
        addStudentAnswerToProblemAnswer(pa_10_4_5, sa10_4_5_student5);
        addStudentAnswerToProblemAnswer(pa_10_4_1, sa10_4_1_student6);
        addStudentAnswerToProblemAnswer(pa_10_4_2, sa10_4_2_student6);
        addStudentAnswerToProblemAnswer(pa_10_4_3, sa10_4_3_student6);
        addStudentAnswerToProblemAnswer(pa_10_4_4, sa10_4_4_student6);
        addStudentAnswerToProblemAnswer(pa_10_4_5, sa10_4_5_student6);
        addStudentAnswerToProblemAnswer(pa_11_1_1, sa11_1_1_student5);
        addStudentAnswerToProblemAnswer(pa_11_1_2, sa11_1_2_student5);
        addStudentAnswerToProblemAnswer(pa_11_1_3, sa11_1_3_student5);
        addStudentAnswerToProblemAnswer(pa_11_1_4, sa11_1_4_student5);
        addStudentAnswerToProblemAnswer(pa_11_1_5, sa11_1_5_student5);
        addStudentAnswerToProblemAnswer(pa_11_1_1, sa11_1_1_student6);
        addStudentAnswerToProblemAnswer(pa_11_1_2, sa11_1_2_student6);
        addStudentAnswerToProblemAnswer(pa_11_1_3, sa11_1_3_student6);
        addStudentAnswerToProblemAnswer(pa_11_1_4, sa11_1_4_student6);
        addStudentAnswerToProblemAnswer(pa_11_1_5, sa11_1_5_student6);

        addStudentAnswerToProblemAnswer(pa_11_2_1, sa11_2_1_student5);
        addStudentAnswerToProblemAnswer(pa_11_2_2, sa11_2_2_student5);
        addStudentAnswerToProblemAnswer(pa_11_2_3, sa11_2_3_student5);
        addStudentAnswerToProblemAnswer(pa_11_2_4, sa11_2_4_student5);
        addStudentAnswerToProblemAnswer(pa_11_2_5, sa11_2_5_student5);
        addStudentAnswerToProblemAnswer(pa_11_2_1, sa11_2_1_student6);
        addStudentAnswerToProblemAnswer(pa_11_2_2, sa11_2_2_student6);
        addStudentAnswerToProblemAnswer(pa_11_2_3, sa11_2_3_student6);
        addStudentAnswerToProblemAnswer(pa_11_2_4, sa11_2_4_student6);
        addStudentAnswerToProblemAnswer(pa_11_2_5, sa11_2_5_student6);

        addStudentAnswerToProblemAnswer(pa_11_3_1, sa11_3_1_student5);
        addStudentAnswerToProblemAnswer(pa_11_3_2, sa11_3_2_student5);
        addStudentAnswerToProblemAnswer(pa_11_3_3, sa11_3_3_student5);
        addStudentAnswerToProblemAnswer(pa_11_3_4, sa11_3_4_student5);
        addStudentAnswerToProblemAnswer(pa_11_3_5, sa11_3_5_student5);
        addStudentAnswerToProblemAnswer(pa_11_3_1, sa11_3_1_student6);
        addStudentAnswerToProblemAnswer(pa_11_3_2, sa11_3_2_student6);
        addStudentAnswerToProblemAnswer(pa_11_3_3, sa11_3_3_student6);
        addStudentAnswerToProblemAnswer(pa_11_3_4, sa11_3_4_student6);
        addStudentAnswerToProblemAnswer(pa_11_3_5, sa11_3_5_student6);

        addStudentAnswerToProblemAnswer(pa_11_4_1, sa11_4_1_student5);
        addStudentAnswerToProblemAnswer(pa_11_4_2, sa11_4_2_student5);
        addStudentAnswerToProblemAnswer(pa_11_4_3, sa11_4_3_student5);
        addStudentAnswerToProblemAnswer(pa_11_4_4, sa11_4_4_student5);
        addStudentAnswerToProblemAnswer(pa_11_4_5, sa11_4_5_student5);
        addStudentAnswerToProblemAnswer(pa_11_4_1, sa11_4_1_student6);
        addStudentAnswerToProblemAnswer(pa_11_4_2, sa11_4_2_student6);
        addStudentAnswerToProblemAnswer(pa_11_4_3, sa11_4_3_student6);
        addStudentAnswerToProblemAnswer(pa_11_4_4, sa11_4_4_student6);
        addStudentAnswerToProblemAnswer(pa_11_4_5, sa11_4_5_student6);

        addStudentAnswerToProblemAnswer(pa_12_1_1, sa12_1_1_student5);
        addStudentAnswerToProblemAnswer(pa_12_1_2, sa12_1_2_student5);
        addStudentAnswerToProblemAnswer(pa_12_1_3, sa12_1_3_student5);
        addStudentAnswerToProblemAnswer(pa_12_1_4, sa12_1_4_student5);
        addStudentAnswerToProblemAnswer(pa_12_1_5, sa12_1_5_student5);
        addStudentAnswerToProblemAnswer(pa_12_1_1, sa12_1_1_student6);
        addStudentAnswerToProblemAnswer(pa_12_1_2, sa12_1_2_student6);
        addStudentAnswerToProblemAnswer(pa_12_1_3, sa12_1_3_student6);
        addStudentAnswerToProblemAnswer(pa_12_1_4, sa12_1_4_student6);
        addStudentAnswerToProblemAnswer(pa_12_1_5, sa12_1_5_student6);

        addStudentAnswerToProblemAnswer(pa_12_2_1, sa12_2_1_student5);
        addStudentAnswerToProblemAnswer(pa_12_2_2, sa12_2_2_student5);
        addStudentAnswerToProblemAnswer(pa_12_2_3, sa12_2_3_student5);
        addStudentAnswerToProblemAnswer(pa_12_2_4, sa12_2_4_student5);
        addStudentAnswerToProblemAnswer(pa_12_2_5, sa12_2_5_student5);
        addStudentAnswerToProblemAnswer(pa_12_2_1, sa12_2_1_student6);
        addStudentAnswerToProblemAnswer(pa_12_2_2, sa12_2_2_student6);
        addStudentAnswerToProblemAnswer(pa_12_2_3, sa12_2_3_student6);
        addStudentAnswerToProblemAnswer(pa_12_2_4, sa12_2_4_student6);
        addStudentAnswerToProblemAnswer(pa_12_2_5, sa12_2_5_student6);

        addStudentAnswerToProblemAnswer(pa_12_3_1, sa12_3_1_student5);
        addStudentAnswerToProblemAnswer(pa_12_3_2, sa12_3_2_student5);
        addStudentAnswerToProblemAnswer(pa_12_3_3, sa12_3_3_student5);
        addStudentAnswerToProblemAnswer(pa_12_3_4, sa12_3_4_student5);
        addStudentAnswerToProblemAnswer(pa_12_3_5, sa12_3_5_student5);
        addStudentAnswerToProblemAnswer(pa_12_3_1, sa12_3_1_student6);
        addStudentAnswerToProblemAnswer(pa_12_3_2, sa12_3_2_student6);
        addStudentAnswerToProblemAnswer(pa_12_3_3, sa12_3_3_student6);
        addStudentAnswerToProblemAnswer(pa_12_3_4, sa12_3_4_student6);
        addStudentAnswerToProblemAnswer(pa_12_3_5, sa12_3_5_student6);
        addStudentAnswerToProblemAnswer(pa_12_4_1, sa12_4_1_student5);
        addStudentAnswerToProblemAnswer(pa_12_4_2, sa12_4_2_student5);
        addStudentAnswerToProblemAnswer(pa_12_4_3, sa12_4_3_student5);
        addStudentAnswerToProblemAnswer(pa_12_4_4, sa12_4_4_student5);
        addStudentAnswerToProblemAnswer(pa_12_4_5, sa12_4_5_student5);
        addStudentAnswerToProblemAnswer(pa_12_4_1, sa12_4_1_student6);
        addStudentAnswerToProblemAnswer(pa_12_4_2, sa12_4_2_student6);
        addStudentAnswerToProblemAnswer(pa_12_4_3, sa12_4_3_student6);
        addStudentAnswerToProblemAnswer(pa_12_4_4, sa12_4_4_student6);
        addStudentAnswerToProblemAnswer(pa_12_4_5, sa12_4_5_student6);
        addStudentAnswerToProblemAnswer(pa_12_5_1, sa12_5_1_student5);
        addStudentAnswerToProblemAnswer(pa_12_5_2, sa12_5_2_student5);
        addStudentAnswerToProblemAnswer(pa_12_5_3, sa12_5_3_student5);
        addStudentAnswerToProblemAnswer(pa_12_5_4, sa12_5_4_student5);
        addStudentAnswerToProblemAnswer(pa_12_5_5, sa12_5_5_student5);
        addStudentAnswerToProblemAnswer(pa_12_5_1, sa12_5_1_student6);
        addStudentAnswerToProblemAnswer(pa_12_5_2, sa12_5_2_student6);
        addStudentAnswerToProblemAnswer(pa_12_5_3, sa12_5_3_student6);
        addStudentAnswerToProblemAnswer(pa_12_5_4, sa12_5_4_student6);
        addStudentAnswerToProblemAnswer(pa_12_5_5, sa12_5_5_student6);

        // Creating submission for student5 with student answers for 9_1
        Submission submission9_1_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9_1_1_student5, sa9_1_2_student5, sa9_1_3_student5, sa9_1_4_student5, sa9_1_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission9_1_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_1_5);
        }

// Creating submission for student6 with student answers for 9_1
        Submission submission9_1_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9_1_1_student6, sa9_1_2_student6, sa9_1_3_student6, sa9_1_4_student6, sa9_1_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission9_1_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_1_6);
        }
// Creating submission for student5 with student answers for 9_2
        Submission submission9_2_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9_2_1_student5, sa9_2_2_student5, sa9_2_3_student5, sa9_2_4_student5, sa9_2_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission9_2_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_2_5);
        }

// Creating submission for student6 with student answers for 9_2
        Submission submission9_2_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9_2_1_student6, sa9_2_2_student6, sa9_2_3_student6, sa9_2_4_student6, sa9_2_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission9_2_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_2_6);
        }
// Creating submission for student5 with student answers for 9_3
        Submission submission9_3_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9_3_1_student5, sa9_3_2_student5, sa9_3_3_student5, sa9_3_4_student5, sa9_3_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission9_3_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_3_5);
        }

// Creating submission for student6 with student answers for 9_3
        Submission submission9_3_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9_3_1_student6, sa9_3_2_student6, sa9_3_3_student6, sa9_3_4_student6, sa9_3_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission9_3_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_3_6);
        }
// Creating submission for student5 with student answers for 10_1
        Submission submission10_1_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10_1_1_student5, sa10_1_2_student5, sa10_1_3_student5, sa10_1_4_student5, sa10_1_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10_1_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_1_5);
        }

// Creating submission for student6 with student answers for 10_1
        Submission submission10_1_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10_1_1_student6, sa10_1_2_student6, sa10_1_3_student6, sa10_1_4_student6, sa10_1_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10_1_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_1_6);
        }
// Creating submission for student5 with student answers for 10_2
        Submission submission10_2_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10_2_1_student5, sa10_2_2_student5, sa10_2_3_student5, sa10_2_4_student5, sa10_2_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10_2_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_2_5);
        }

// Creating submission for student6 with student answers for 10_2
        Submission submission10_2_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10_2_1_student6, sa10_2_2_student6, sa10_2_3_student6, sa10_2_4_student6, sa10_2_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10_2_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_2_6);
        }
// Creating submission for student5 with student answers for 10_3
        Submission submission10_3_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10_3_1_student5, sa10_3_2_student5, sa10_3_3_student5, sa10_3_4_student5, sa10_3_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10_3_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_3_5);
        }

// Creating submission for student6 with student answers for 10_3
        Submission submission10_3_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10_3_1_student6, sa10_3_2_student6, sa10_3_3_student6, sa10_3_4_student6, sa10_3_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10_3_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_3_6);
        }
// Creating submission for student5 with student answers for 10_4
        Submission submission10_4_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10_4_1_student5, sa10_4_2_student5, sa10_4_3_student5, sa10_4_4_student5, sa10_4_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10_4_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_4_5);
        }

// Creating submission for student6 with student answers for 10_4
        Submission submission10_4_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10_4_1_student6, sa10_4_2_student6, sa10_4_3_student6, sa10_4_4_student6, sa10_4_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10_4_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_4_6);
        }
// Creating submission for student5 with student answers for 11_1
        Submission submission11_1_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11_1_1_student5, sa11_1_2_student5, sa11_1_3_student5, sa11_1_4_student5, sa11_1_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11_1_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_1_5);
        }

// Creating submission for student6 with student answers for 11_1
        Submission submission11_1_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11_1_1_student6, sa11_1_2_student6, sa11_1_3_student6, sa11_1_4_student6, sa11_1_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11_1_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_1_6);
        }
// Creating submission for student5 with student answers for 11_2
        Submission submission11_2_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11_2_1_student5, sa11_2_2_student5, sa11_2_3_student5, sa11_2_4_student5, sa11_2_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11_2_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_2_5);
        }

// Creating submission for student6 with student answers for 11_2
        Submission submission11_2_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11_2_1_student6, sa11_2_2_student6, sa11_2_3_student6, sa11_2_4_student6, sa11_2_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11_2_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_2_6);
        }
// Creating submission for student5 with student answers for 11_3
        Submission submission11_3_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11_3_1_student5, sa11_3_2_student5, sa11_3_3_student5, sa11_3_4_student5, sa11_3_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11_3_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_3_5);
        }

// Creating submission for student6 with student answers for 11_3
        Submission submission11_3_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11_3_1_student6, sa11_3_2_student6, sa11_3_3_student6, sa11_3_4_student6, sa11_3_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11_3_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_3_6);
        }
// Creating submission for student5 with student answers for 11_4
        Submission submission11_4_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11_4_1_student5, sa11_4_2_student5, sa11_4_3_student5, sa11_4_4_student5, sa11_4_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11_4_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_4_5);
        }

// Creating submission for student6 with student answers for 11_4
        Submission submission11_4_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11_4_1_student6, sa11_4_2_student6, sa11_4_3_student6, sa11_4_4_student6, sa11_4_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11_4_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_4_6);
        }
// Creating submission for student5 with student answers for 12_1
        Submission submission12_1_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12_1_1_student5, sa12_1_2_student5, sa12_1_3_student5, sa12_1_4_student5, sa12_1_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12_1_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_1_5);
        }

// Creating submission for student6 with student answers for 12_1
        Submission submission12_1_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12_1_1_student6, sa12_1_2_student6, sa12_1_3_student6, sa12_1_4_student6, sa12_1_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12_1_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_1_6);
        }
// Creating submission for student5 with student answers for 12_2
        Submission submission12_2_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12_2_1_student5, sa12_2_2_student5, sa12_2_3_student5, sa12_2_4_student5, sa12_2_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12_2_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_2_5);
        }

// Creating submission for student6 with student answers for 12_2
        Submission submission12_2_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12_2_1_student6, sa12_2_2_student6, sa12_2_3_student6, sa12_2_4_student6, sa12_2_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12_2_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_2_6);
        }
// Creating submission for student5 with student answers for 12_3
        Submission submission12_3_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12_3_1_student5, sa12_3_2_student5, sa12_3_3_student5, sa12_3_4_student5, sa12_3_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12_3_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_3_5);
        }

// Creating submission for student6 with student answers for 12_3
        Submission submission12_3_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12_3_1_student6, sa12_3_2_student6, sa12_3_3_student6, sa12_3_4_student6, sa12_3_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12_3_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_3_6);
        }
// Creating submission for student5 with student answers for 12_4
        Submission submission12_4_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12_4_1_student5, sa12_4_2_student5, sa12_4_3_student5, sa12_4_4_student5, sa12_4_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12_4_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_4_5);
        }

// Creating submission for student6 with student answers for 12_4
        Submission submission12_4_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12_4_1_student6, sa12_4_2_student6, sa12_4_3_student6, sa12_4_4_student6, sa12_4_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12_4_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_4_6);
        }
// Creating submission for student5 with student answers for 12_5
        Submission submission12_5_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12_5_1_student5, sa12_5_2_student5, sa12_5_3_student5, sa12_5_4_student5, sa12_5_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12_5_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_5_5);
        }

// Creating submission for student6 with student answers for 12_5
        Submission submission12_5_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12_5_1_student6, sa12_5_2_student6, sa12_5_3_student6, sa12_5_4_student6, sa12_5_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12_5_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_5_6);
        }
        submissionRepo.saveAllAndFlush(Arrays.asList(submission9_1_5, submission9_1_6, submission9_2_5, submission9_2_6, submission9_3_5, submission9_3_6, submission10_1_5, submission10_1_6, submission10_2_5, submission10_2_6, submission10_3_5, submission10_3_6, submission10_4_5, submission10_4_6, submission11_1_5, submission11_1_6, submission11_2_5, submission11_2_6, submission11_3_5, submission11_3_6, submission11_4_5, submission11_4_6, submission12_1_5, submission12_1_6, submission12_2_5, submission12_2_6, submission12_3_5, submission12_3_6, submission12_4_5, submission12_4_6, submission12_5_5, submission12_5_6));

        Grade grade9_1_5 = createGrade(86.3, student5, faculty4, course9, submission9_1_5);
        Grade grade9_1_6 = createGrade(88.7, student6, faculty4, course9, submission9_1_6);
        Grade grade9_2_5 = createGrade(89.4, student5, faculty4, course9, submission9_2_5);
        Grade grade9_2_6 = createGrade(87.1, student6, faculty4, course9, submission9_2_6);
        Grade grade9_3_5 = createGrade(85.9, student5, faculty4, course9, submission9_3_5);
        Grade grade9_3_6 = createGrade(90.2, student6, faculty4, course9, submission9_3_6);

        Grade grade10_1_5 = createGrade(87.6, student5, faculty5, course10, submission10_1_5);
        Grade grade10_1_6 = createGrade(89.3, student6, faculty5, course10, submission10_1_6);
        Grade grade10_2_5 = createGrade(84.2, student5, faculty5, course10, submission10_2_5);
        Grade grade10_2_6 = createGrade(85.9, student6, faculty5, course10, submission10_2_6);
        Grade grade10_3_5 = createGrade(88.4, student5, faculty5, course10, submission10_3_5);
        Grade grade10_3_6 = createGrade(83.7, student6, faculty5, course10, submission10_3_6);
        Grade grade10_4_5 = createGrade(86.8, student5, faculty5, course10, submission10_4_5);
        Grade grade10_4_6 = createGrade(90.1, student6, faculty5, course10, submission10_4_6);

        Grade grade11_1_5 = createGrade(86.9, student5, faculty1, course11, submission11_1_5);
        Grade grade11_1_6 = createGrade(89.5, student6, faculty1, course11, submission11_1_6);
        Grade grade11_2_5 = createGrade(87.7, student5, faculty1, course11, submission11_2_5);
        Grade grade11_2_6 = createGrade(84.3, student6, faculty1, course11, submission11_2_6);
        Grade grade11_3_5 = createGrade(90.2, student5, faculty1, course11, submission11_3_5);
        Grade grade11_3_6 = createGrade(85.4, student6, faculty1, course11, submission11_3_6);
        Grade grade11_4_5 = createGrade(88.1, student5, faculty1, course11, submission11_4_5);
        Grade grade11_4_6 = createGrade(87.8, student6, faculty1, course11, submission11_4_6);

        Grade grade12_1_5 = createGrade(88.5, student5, faculty2, course12, submission12_1_5);
        Grade grade12_1_6 = createGrade(85.9, student6, faculty2, course12, submission12_1_6);
        Grade grade12_2_5 = createGrade(89.2, student5, faculty2, course12, submission12_2_5);
        Grade grade12_2_6 = createGrade(86.3, student6, faculty2, course12, submission12_2_6);
        Grade grade12_3_5 = createGrade(87.8, student5, faculty2, course12, submission12_3_5);
        Grade grade12_3_6 = createGrade(88.6, student6, faculty2, course12, submission12_3_6);
        Grade grade12_4_5 = createGrade(85.7, student5, faculty2, course12, submission12_4_5);
        Grade grade12_4_6 = createGrade(90.1, student6, faculty2, course12, submission12_4_6);
        Grade grade12_5_5 = createGrade(88.2, student5, faculty2, course12, submission12_5_5);
        Grade grade12_5_6 = createGrade(86.9, student6, faculty2, course12, submission12_5_6);
        gradeRepo.saveAllAndFlush(Arrays.asList(grade9_1_5, grade9_2_5, grade9_3_5, grade10_1_5, grade10_2_5, grade10_3_5, grade10_4_5, grade11_1_5, grade11_2_5, grade11_3_5, grade11_4_5, grade12_1_5, grade12_2_5, grade12_3_5, grade12_4_5, grade12_5_5, grade9_1_6, grade9_2_6, grade9_3_6, grade10_1_6, grade10_2_6, grade10_3_6, grade10_4_6, grade11_1_6, grade11_2_6, grade11_3_6, grade11_4_6, grade12_1_6, grade12_2_6, grade12_3_6, grade12_4_6, grade12_5_6));


        CourseGrade courseGrade9_1_5 = createCourseGrade(student5, course9, 87.2, Arrays.asList(grade9_1_5, grade9_2_5, grade9_3_5));
        CourseGrade courseGrade9_1_6 = createCourseGrade(student6, course9, 88.67, Arrays.asList(grade9_1_6, grade9_2_6, grade9_3_6));

        CourseGrade courseGrade10_1_5 = createCourseGrade(student5, course10, 86.75, Arrays.asList(grade10_1_5, grade10_2_5, grade10_3_5, grade10_4_5));
        CourseGrade courseGrade10_1_6 = createCourseGrade(student6, course10, 87.25, Arrays.asList(grade10_1_6, grade10_2_6, grade10_3_6, grade10_4_6));

        CourseGrade courseGrade11_1_5 = createCourseGrade(student5, course11, 88.225, Arrays.asList(grade11_1_5, grade11_2_5, grade11_3_5, grade11_4_5));
        CourseGrade courseGrade11_1_6 = createCourseGrade(student6, course11, 86.75, Arrays.asList(grade11_1_6, grade11_2_6, grade11_3_6, grade11_4_6));

        CourseGrade courseGrade12_1_5 = createCourseGrade(student5, course12, 87.88, Arrays.asList(grade12_1_5, grade12_2_5, grade12_3_5, grade12_4_5, grade12_5_5));
        CourseGrade courseGrade12_1_6 = createCourseGrade(student6, course12, 87.56, Arrays.asList(grade12_1_6, grade12_2_6, grade12_3_6, grade12_4_6, grade12_5_6));
        courseGradeRepo.saveAllAndFlush(Arrays.asList(courseGrade9_1_5, courseGrade10_1_5, courseGrade11_1_5, courseGrade12_1_5, courseGrade9_1_6, courseGrade10_1_6, courseGrade11_1_6, courseGrade12_1_6));

        Feedback feedback9_1_5 = createFeedback("Excellent work, student5!", submission9_1_5);
        Feedback feedback9_1_6 = createFeedback("Great effort, student6!", submission9_1_6);

        Feedback feedback9_2_5 = createFeedback("Impressive answers, student5.", submission9_2_5);
        Feedback feedback9_2_6 = createFeedback("Nice job, student6.", submission9_2_6);

        Feedback feedback9_3_5 = createFeedback("Well done on the answers, student5.", submission9_3_5);
        Feedback feedback9_3_6 = createFeedback("Good work, student6!", submission9_3_6);

        Feedback feedback10_1_5 = createFeedback("Excellent work, student5!", submission10_1_5);
        Feedback feedback10_1_6 = createFeedback("Great effort, student6!", submission10_1_6);

        Feedback feedback10_2_5 = createFeedback("Impressive answers, student5.", submission10_2_5);
        Feedback feedback10_2_6 = createFeedback("Nice job, student6.", submission10_2_6);

        Feedback feedback10_3_5 = createFeedback("Well done on the answers, student5.", submission10_3_5);
        Feedback feedback10_3_6 = createFeedback("Good work, student6!", submission10_3_6);

        Feedback feedback10_4_5 = createFeedback("Great effort, student5!", submission10_4_5);
        Feedback feedback10_4_6 = createFeedback("Well done, student6!", submission10_4_6);

        Feedback feedback11_1_5 = createFeedback("Excellent work, student5!", submission11_1_5);
        Feedback feedback11_1_6 = createFeedback("Great effort, student6!", submission11_1_6);

        Feedback feedback11_2_5 = createFeedback("Impressive answers, student5.", submission11_2_5);
        Feedback feedback11_2_6 = createFeedback("Nice job, student6.", submission11_2_6);

        Feedback feedback11_3_5 = createFeedback("Well done on the answers, student5.", submission11_3_5);
        Feedback feedback11_3_6 = createFeedback("Good work, student6!", submission11_3_6);

        Feedback feedback11_4_5 = createFeedback("Great effort, student5!", submission11_4_5);
        Feedback feedback11_4_6 = createFeedback("Well done, student6!", submission11_4_6);

        Feedback feedback12_1_5 = createFeedback("Excellent work, student5!", submission12_1_5);
        Feedback feedback12_1_6 = createFeedback("Great effort, student6!", submission12_1_6);

        Feedback feedback12_2_5 = createFeedback("Impressive answers, student5.", submission12_2_5);
        Feedback feedback12_2_6 = createFeedback("Nice job, student6.", submission12_2_6);

        Feedback feedback12_3_5 = createFeedback("Well done on the answers, student5.", submission12_3_5);
        Feedback feedback12_3_6 = createFeedback("Good work, student6!", submission12_3_6);

        Feedback feedback12_4_5 = createFeedback("Great effort, student5!", submission12_4_5);
        Feedback feedback12_4_6 = createFeedback("Well done, student6!", submission12_4_6);

        Feedback feedback12_5_5 = createFeedback("Excellent submission, student5!", submission12_5_5);
        Feedback feedback12_5_6 = createFeedback("Nice work, student6!", submission12_5_6);
        feedbackRepo.saveAllAndFlush(Arrays.asList(feedback9_1_5, feedback9_1_6, feedback9_2_5, feedback9_2_6, feedback9_3_5, feedback9_3_6, feedback10_1_5, feedback10_1_6, feedback10_2_5, feedback10_2_6, feedback10_3_5, feedback10_3_6, feedback10_4_5, feedback10_4_6, feedback11_1_5, feedback11_1_6, feedback11_2_5, feedback11_2_6, feedback11_3_5, feedback11_3_6, feedback11_4_5, feedback11_4_6, feedback12_1_5, feedback12_1_6, feedback12_2_5, feedback12_2_6, feedback12_3_5, feedback12_3_6, feedback12_4_5, feedback12_4_6, feedback12_5_5, feedback12_5_6));


        course9.setGrades(Arrays.asList(grade9_1_5, grade9_1_6, grade9_2_5, grade9_2_6, grade9_3_5, grade9_3_6));
        course10.setGrades(Arrays.asList(grade10_1_5, grade10_1_6, grade10_2_5, grade10_2_6, grade10_3_5, grade10_3_6, grade10_4_5, grade10_4_6));
        course11.setGrades(Arrays.asList(grade11_1_5, grade11_1_6, grade11_2_5, grade11_2_6, grade11_3_5, grade11_3_6, grade11_4_5, grade11_4_6));
        course12.setGrades(Arrays.asList(grade12_1_5, grade12_1_6, grade12_2_5, grade12_2_6, grade12_3_5, grade12_3_6, grade12_4_5, grade12_4_6, grade12_5_5, grade12_5_6));

        course9.setCourseGrades(Arrays.asList(courseGrade9_1_5, courseGrade9_1_6));
        course10.setCourseGrades(Arrays.asList(courseGrade10_1_5, courseGrade10_1_6));
        course11.setCourseGrades(Arrays.asList(courseGrade11_1_5, courseGrade11_1_6));
        course12.setCourseGrades(Arrays.asList(courseGrade12_1_5, courseGrade12_1_6));

        createFacultyWithAssignment(faculty4, Arrays.asList(grade9_1_5, grade9_1_6, grade9_2_5, grade9_2_6, grade9_3_5, grade9_3_6), Arrays.asList(assignment9_1, assignment9_2, assignment9_3));
        createFacultyWithAssignment(faculty5, Arrays.asList(grade10_1_5, grade10_1_6, grade10_2_5, grade10_2_6, grade10_3_5, grade10_3_6, grade10_4_5, grade10_4_6), Arrays.asList(assignment10_1, assignment10_2, assignment10_3, assignment10_4));
        createFacultyWithAssignment(faculty1, Arrays.asList(grade11_1_5, grade11_1_6, grade11_2_5, grade11_2_6, grade11_3_5, grade11_3_6, grade11_4_5, grade11_4_6), Arrays.asList(assignment11_1, assignment11_2, assignment11_3, assignment11_4));
        createFacultyWithAssignment(faculty2, Arrays.asList(grade12_1_5, grade12_1_6, grade12_2_5, grade12_2_6, grade12_3_5, grade12_3_6, grade12_4_5, grade12_4_6, grade12_5_5, grade12_5_6), Arrays.asList(assignment12_1, assignment12_2, assignment12_3, assignment12_4, assignment12_5));

        linkSubmissionDetails(submission9_1_5, student5, grade9_1_5, feedback9_1_5, Arrays.asList(sa9_1_1_student5, sa9_1_2_student5, sa9_1_3_student5, sa9_1_4_student5, sa9_1_5_student5));
        linkSubmissionDetails(submission9_1_6, student6, grade9_1_6, feedback9_1_6, Arrays.asList(sa9_1_1_student6, sa9_1_2_student6, sa9_1_3_student6, sa9_1_4_student6, sa9_1_5_student6));
        linkSubmissionDetails(submission9_2_5, student5, grade9_2_5, feedback9_2_5, Arrays.asList(sa9_2_1_student5, sa9_2_2_student5, sa9_2_3_student5, sa9_2_4_student5, sa9_2_5_student5));
        linkSubmissionDetails(submission9_2_6, student6, grade9_2_6, feedback9_2_6, Arrays.asList(sa9_2_1_student6, sa9_2_2_student6, sa9_2_3_student6, sa9_2_4_student6, sa9_2_5_student6));
        linkSubmissionDetails(submission9_3_5, student5, grade9_3_5, feedback9_3_5, Arrays.asList(sa9_3_1_student5, sa9_3_2_student5, sa9_3_3_student5, sa9_3_4_student5, sa9_3_5_student5));
        linkSubmissionDetails(submission9_3_6, student6, grade9_3_6, feedback9_3_6, Arrays.asList(sa9_3_1_student6, sa9_3_2_student6, sa9_3_3_student6, sa9_3_4_student6, sa9_3_5_student6));

        linkSubmissionDetails(submission10_1_5, student5, grade10_1_5, feedback10_1_5, Arrays.asList(sa10_1_1_student5, sa10_1_2_student5, sa10_1_3_student5, sa10_1_4_student5, sa10_1_5_student5));
        linkSubmissionDetails(submission10_1_6, student6, grade10_1_6, feedback10_1_6, Arrays.asList(sa10_1_1_student6, sa10_1_2_student6, sa10_1_3_student6, sa10_1_4_student6, sa10_1_5_student6));
        linkSubmissionDetails(submission10_2_5, student5, grade10_2_5, feedback10_2_5, Arrays.asList(sa10_2_1_student5, sa10_2_2_student5, sa10_2_3_student5, sa10_2_4_student5, sa10_2_5_student5));
        linkSubmissionDetails(submission10_2_6, student6, grade10_2_6, feedback10_2_6, Arrays.asList(sa10_2_1_student6, sa10_2_2_student6, sa10_2_3_student6, sa10_2_4_student6, sa10_2_5_student6));
        linkSubmissionDetails(submission10_3_5, student5, grade10_3_5, feedback10_3_5, Arrays.asList(sa10_3_1_student5, sa10_3_2_student5, sa10_3_3_student5, sa10_3_4_student5, sa10_3_5_student5));
        linkSubmissionDetails(submission10_3_6, student6, grade10_3_6, feedback10_3_6, Arrays.asList(sa10_3_1_student6, sa10_3_2_student6, sa10_3_3_student6, sa10_3_4_student6, sa10_3_5_student6));
        linkSubmissionDetails(submission10_4_5, student5, grade10_4_5, feedback10_4_5, Arrays.asList(sa10_4_1_student5, sa10_4_2_student5, sa10_4_3_student5, sa10_4_4_student5, sa10_4_5_student5));
        linkSubmissionDetails(submission10_4_6, student6, grade10_4_6, feedback10_4_6, Arrays.asList(sa10_4_1_student6, sa10_4_2_student6, sa10_4_3_student6, sa10_4_4_student6, sa10_4_5_student6));

        linkSubmissionDetails(submission11_1_5, student5, grade11_1_5, feedback11_1_5, Arrays.asList(sa11_1_1_student5, sa11_1_2_student5, sa11_1_3_student5, sa11_1_4_student5, sa11_1_5_student5));
        linkSubmissionDetails(submission11_1_6, student6, grade11_1_6, feedback11_1_6, Arrays.asList(sa11_1_1_student6, sa11_1_2_student6, sa11_1_3_student6, sa11_1_4_student6, sa11_1_5_student6));
        linkSubmissionDetails(submission11_2_5, student5, grade11_2_5, feedback11_2_5, Arrays.asList(sa11_2_1_student5, sa11_2_2_student5, sa11_2_3_student5, sa11_2_4_student5, sa11_2_5_student5));
        linkSubmissionDetails(submission11_2_6, student6, grade11_2_6, feedback11_2_6, Arrays.asList(sa11_2_1_student6, sa11_2_2_student6, sa11_2_3_student6, sa11_2_4_student6, sa11_2_5_student6));
        linkSubmissionDetails(submission11_3_5, student5, grade11_3_5, feedback11_3_5, Arrays.asList(sa11_3_1_student5, sa11_3_2_student5, sa11_3_3_student5, sa11_3_4_student5, sa11_3_5_student5));
        linkSubmissionDetails(submission11_3_6, student6, grade11_3_6, feedback11_3_6, Arrays.asList(sa11_3_1_student6, sa11_3_2_student6, sa11_3_3_student6, sa11_3_4_student6, sa11_3_5_student6));
        linkSubmissionDetails(submission11_4_5, student5, grade11_4_5, feedback11_4_5, Arrays.asList(sa11_4_1_student5, sa11_4_2_student5, sa11_4_3_student5, sa11_4_4_student5, sa11_4_5_student5));
        linkSubmissionDetails(submission11_4_6, student6, grade11_4_6, feedback11_4_6, Arrays.asList(sa11_4_1_student6, sa11_4_2_student6, sa11_4_3_student6, sa11_4_4_student6, sa11_4_5_student6));

        linkSubmissionDetails(submission12_1_5, student5, grade12_1_5, feedback12_1_5, Arrays.asList(sa12_1_1_student5, sa12_1_2_student5, sa12_1_3_student5, sa12_1_4_student5, sa12_1_5_student5));
        linkSubmissionDetails(submission12_1_6, student6, grade12_1_6, feedback12_1_6, Arrays.asList(sa12_1_1_student6, sa12_1_2_student6, sa12_1_3_student6, sa12_1_4_student6, sa12_1_5_student6));
        linkSubmissionDetails(submission12_2_5, student5, grade12_2_5, feedback12_2_5, Arrays.asList(sa12_2_1_student5, sa12_2_2_student5, sa12_2_3_student5, sa12_2_4_student5, sa12_2_5_student5));
        linkSubmissionDetails(submission12_2_6, student6, grade12_2_6, feedback12_2_6, Arrays.asList(sa12_2_1_student6, sa12_2_2_student6, sa12_2_3_student6, sa12_2_4_student6, sa12_2_5_student6));
        linkSubmissionDetails(submission12_3_5, student5, grade12_3_5, feedback12_3_5, Arrays.asList(sa12_3_1_student5, sa12_3_2_student5, sa12_3_3_student5, sa12_3_4_student5, sa12_3_5_student5));
        linkSubmissionDetails(submission12_3_6, student6, grade12_3_6, feedback12_3_6, Arrays.asList(sa12_3_1_student6, sa12_3_2_student6, sa12_3_3_student6, sa12_3_4_student6, sa12_3_5_student6));
        linkSubmissionDetails(submission12_4_5, student5, grade12_4_5, feedback12_4_5, Arrays.asList(sa12_4_1_student5, sa12_4_2_student5, sa12_4_3_student5, sa12_4_4_student5, sa12_4_5_student5));
        linkSubmissionDetails(submission12_4_6, student6, grade12_4_6, feedback12_4_6, Arrays.asList(sa12_4_1_student6, sa12_4_2_student6, sa12_4_3_student6, sa12_4_4_student6, sa12_4_5_student6));
        linkSubmissionDetails(submission12_5_5, student5, grade12_5_5, feedback12_5_5, Arrays.asList(sa12_5_1_student5, sa12_5_2_student5, sa12_5_3_student5, sa12_5_4_student5, sa12_5_5_student5));
        linkSubmissionDetails(submission12_5_6, student6, grade12_5_6, feedback12_5_6, Arrays.asList(sa12_5_1_student6, sa12_5_2_student6, sa12_5_3_student6, sa12_5_4_student6, sa12_5_5_student6));


        syllabus9.setAssignments(Arrays.asList(assignment9_1, assignment9_2, assignment9_3));
        syllabus10.setAssignments(Arrays.asList(assignment10_1, assignment10_2, assignment10_3, assignment10_4));
        syllabus11.setAssignments(Arrays.asList(assignment11_1, assignment11_2, assignment11_3, assignment11_4));
        syllabus12.setAssignments(Arrays.asList(assignment12_1, assignment12_2, assignment12_3, assignment12_4, assignment12_5));

        studentAssignment(student5, Arrays.asList(grade9_1_5, grade9_2_5, grade9_3_5, grade10_1_5, grade10_2_5, grade10_3_5, grade10_4_5, grade11_1_5, grade11_2_5, grade11_3_5, grade11_4_5, grade12_1_5, grade12_2_5, grade12_3_5, grade12_4_5, grade12_5_5), Arrays.asList(courseGrade9_1_5, courseGrade10_1_5, courseGrade11_1_5, courseGrade12_1_5), Arrays.asList(assignment9_1, assignment9_2, assignment9_3, assignment10_1, assignment10_2, assignment10_3, assignment10_4, assignment11_1, assignment11_2, assignment11_3, assignment11_4, assignment12_1, assignment12_2, assignment12_3, assignment12_4, assignment12_5));
        studentAssignment(student6, Arrays.asList(grade9_1_6, grade9_2_6, grade9_3_6, grade10_1_6, grade10_2_6, grade10_3_6, grade10_4_6, grade11_1_6, grade11_2_6, grade11_3_6, grade11_4_6, grade12_1_6, grade12_2_6, grade12_3_6, grade12_4_6, grade12_5_6), Arrays.asList(courseGrade9_1_6, courseGrade10_1_6, courseGrade11_1_6, courseGrade12_1_6), Arrays.asList(assignment9_1, assignment9_2, assignment9_3, assignment10_1, assignment10_2, assignment10_3, assignment10_4, assignment11_1, assignment11_2, assignment11_3, assignment11_4, assignment12_1, assignment12_2, assignment12_3, assignment12_4, assignment12_5));

        facultyRepo.saveAllAndFlush(Arrays.asList(faculty1, faculty2, faculty3, faculty4, faculty5));
        syllabusRepo.saveAllAndFlush(Arrays.asList(syllabus1, syllabus2, syllabus3, syllabus4, syllabus5, syllabus6, syllabus7, syllabus8, syllabus9, syllabus10, syllabus11, syllabus12, syllabus13, syllabus14, syllabus15, syllabus16, syllabus17, syllabus18, syllabus19, syllabus20));
        studentRepo.saveAllAndFlush(Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10));
        courseRepo.saveAllAndFlush(Arrays.asList(course1, course2, course3, course4, course5, course6, course7, course8, course9, course10, course11, course12, course13, course14, course15, course16, course17, course18, course19, course20));
        assignmentRepo.saveAllAndFlush(Arrays.asList(assignment9_1, assignment9_2, assignment9_3, assignment10_1, assignment10_2, assignment10_3, assignment10_4, assignment11_1, assignment11_2, assignment11_3, assignment11_4, assignment12_1, assignment12_2, assignment12_3, assignment12_4, assignment12_5));
        problemAnswerRepo.saveAllAndFlush(Arrays.asList(pa_9_1_1, pa_9_1_2, pa_9_1_3, pa_9_1_4, pa_9_1_5, pa_9_2_1, pa_9_2_2, pa_9_2_3, pa_9_2_4, pa_9_2_5, pa_9_3_1, pa_9_3_2, pa_9_3_3, pa_9_3_4, pa_9_3_5, pa_10_1_1, pa_10_1_2, pa_10_1_3, pa_10_1_4, pa_10_1_5, pa_10_2_1, pa_10_2_2, pa_10_2_3, pa_10_2_4, pa_10_2_5, pa_10_3_1, pa_10_3_2, pa_10_3_3, pa_10_3_4, pa_10_3_5, pa_10_4_1, pa_10_4_2, pa_10_4_3, pa_10_4_4, pa_10_4_5, pa_11_1_1, pa_11_1_2, pa_11_1_3, pa_11_1_4, pa_11_1_5, pa_11_2_1, pa_11_2_2, pa_11_2_3, pa_11_2_4, pa_11_2_5, pa_11_3_1, pa_11_3_2, pa_11_3_3, pa_11_3_4, pa_11_3_5, pa_11_4_1, pa_11_4_2, pa_11_4_3, pa_11_4_4, pa_11_4_5, pa_12_1_1, pa_12_1_2, pa_12_1_3, pa_12_1_4, pa_12_1_5, pa_12_2_1, pa_12_2_2, pa_12_2_3, pa_12_2_4, pa_12_2_5, pa_12_3_1, pa_12_3_2, pa_12_3_3, pa_12_3_4, pa_12_3_5, pa_12_4_1, pa_12_4_2, pa_12_4_3, pa_12_4_4, pa_12_4_5, pa_12_5_1, pa_12_5_2, pa_12_5_3, pa_12_5_4, pa_12_5_5));
        studentAnswerRepo.saveAllAndFlush(Arrays.asList(sa9_1_1_student5, sa9_1_2_student5, sa9_1_3_student5, sa9_1_4_student5, sa9_1_5_student5, sa9_2_1_student5, sa9_2_2_student5, sa9_2_3_student5, sa9_2_4_student5, sa9_2_5_student5, sa9_3_1_student5, sa9_3_2_student5, sa9_3_3_student5, sa9_3_4_student5, sa9_3_5_student5, sa9_1_1_student6, sa9_1_2_student6, sa9_1_3_student6, sa9_1_4_student6, sa9_1_5_student6, sa9_2_1_student6, sa9_2_2_student6, sa9_2_3_student6, sa9_2_4_student6, sa9_2_5_student6, sa9_3_1_student6, sa9_3_2_student6, sa9_3_3_student6, sa9_3_4_student6, sa9_3_5_student6,
                sa10_1_1_student5, sa10_1_2_student5, sa10_1_3_student5, sa10_1_4_student5, sa10_1_5_student5, sa10_2_1_student5, sa10_2_2_student5, sa10_2_3_student5, sa10_2_4_student5, sa10_2_5_student5, sa10_3_1_student5, sa10_3_2_student5, sa10_3_3_student5, sa10_3_4_student5, sa10_3_5_student5, sa10_4_1_student5, sa10_4_2_student5, sa10_4_3_student5, sa10_4_4_student5, sa10_4_5_student5, sa10_1_1_student6, sa10_1_2_student6, sa10_1_3_student6, sa10_1_4_student6, sa10_1_5_student6, sa10_2_1_student6, sa10_2_2_student6, sa10_2_3_student6, sa10_2_4_student6, sa10_2_5_student6, sa10_3_1_student6, sa10_3_2_student6, sa10_3_3_student6, sa10_3_4_student6, sa10_3_5_student6, sa10_4_1_student6, sa10_4_2_student6, sa10_4_3_student6, sa10_4_4_student6, sa10_4_5_student6,
                sa11_1_1_student5, sa11_1_2_student5, sa11_1_3_student5, sa11_1_4_student5, sa11_1_5_student5, sa11_2_1_student5, sa11_2_2_student5, sa11_2_3_student5, sa11_2_4_student5, sa11_2_5_student5, sa11_3_1_student5, sa11_3_2_student5, sa11_3_3_student5, sa11_3_4_student5, sa11_3_5_student5, sa11_4_1_student5, sa11_4_2_student5, sa11_4_3_student5, sa11_4_4_student5, sa11_4_5_student5, sa11_1_1_student6, sa11_1_2_student6, sa11_1_3_student6, sa11_1_4_student6, sa11_1_5_student6, sa11_2_1_student6, sa11_2_2_student6, sa11_2_3_student6, sa11_2_4_student6, sa11_2_5_student6, sa11_3_1_student6, sa11_3_2_student6, sa11_3_3_student6, sa11_3_4_student6, sa11_3_5_student6, sa11_4_1_student6, sa11_4_2_student6, sa11_4_3_student6, sa11_4_4_student6, sa11_4_5_student6,
                sa12_1_1_student5, sa12_1_2_student5, sa12_1_3_student5, sa12_1_4_student5, sa12_1_5_student5, sa12_2_1_student5, sa12_2_2_student5, sa12_2_3_student5, sa12_2_4_student5, sa12_2_5_student5, sa12_3_1_student5, sa12_3_2_student5, sa12_3_3_student5, sa12_3_4_student5, sa12_3_5_student5, sa12_4_1_student5, sa12_4_2_student5, sa12_4_3_student5, sa12_4_4_student5, sa12_4_5_student5, sa12_5_1_student5, sa12_5_2_student5, sa12_5_3_student5, sa12_5_4_student5, sa12_5_5_student5, sa12_1_1_student6, sa12_1_2_student6, sa12_1_3_student6, sa12_1_4_student6, sa12_1_5_student6, sa12_2_1_student6, sa12_2_2_student6, sa12_2_3_student6, sa12_2_4_student6, sa12_2_5_student6, sa12_3_1_student6, sa12_3_2_student6, sa12_3_3_student6, sa12_3_4_student6, sa12_3_5_student6, sa12_4_1_student6, sa12_4_2_student6, sa12_4_3_student6, sa12_4_4_student6, sa12_4_5_student6, sa12_5_1_student6, sa12_5_2_student6, sa12_5_3_student6, sa12_5_4_student6, sa12_5_5_student6));
        submissionRepo.saveAllAndFlush(Arrays.asList(submission9_1_5, submission9_1_6, submission9_2_5, submission9_2_6, submission9_3_5, submission9_3_6, submission10_1_5, submission10_1_6, submission10_2_5, submission10_2_6, submission10_3_5, submission10_3_6, submission10_4_5, submission10_4_6, submission11_1_5, submission11_1_6, submission11_2_5, submission11_2_6, submission11_3_5, submission11_3_6, submission11_4_5, submission11_4_6, submission12_1_5, submission12_1_6, submission12_2_5, submission12_2_6, submission12_3_5, submission12_3_6, submission12_4_5, submission12_4_6, submission12_5_5, submission12_5_6));
        gradeRepo.saveAllAndFlush(Arrays.asList(grade9_1_5, grade9_2_5, grade9_3_5, grade10_1_5, grade10_2_5, grade10_3_5, grade10_4_5, grade11_1_5, grade11_2_5, grade11_3_5, grade11_4_5, grade12_1_5, grade12_2_5, grade12_3_5, grade12_4_5, grade12_5_5, grade9_1_6, grade9_2_6, grade9_3_6, grade10_1_6, grade10_2_6, grade10_3_6, grade10_4_6, grade11_1_6, grade11_2_6, grade11_3_6, grade11_4_6, grade12_1_6, grade12_2_6, grade12_3_6, grade12_4_6, grade12_5_6));
        courseGradeRepo.saveAllAndFlush(Arrays.asList(courseGrade9_1_5, courseGrade10_1_5, courseGrade11_1_5, courseGrade12_1_5, courseGrade9_1_6, courseGrade10_1_6, courseGrade11_1_6, courseGrade12_1_6));
        feedbackRepo.saveAllAndFlush(Arrays.asList(feedback9_1_5, feedback9_1_6, feedback9_2_5, feedback9_2_6, feedback9_3_5, feedback9_3_6, feedback10_1_5, feedback10_1_6, feedback10_2_5, feedback10_2_6, feedback10_3_5, feedback10_3_6, feedback10_4_5, feedback10_4_6, feedback11_1_5, feedback11_1_6, feedback11_2_5, feedback11_2_6, feedback11_3_5, feedback11_3_6, feedback11_4_5, feedback11_4_6, feedback12_1_5, feedback12_1_6, feedback12_2_5, feedback12_2_6, feedback12_3_5, feedback12_3_6, feedback12_4_5, feedback12_4_6, feedback12_5_5, feedback12_5_6));
    }
}
