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
@Order(10)
@Data
public class Test9to12Seeder implements CommandLineRunner {
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


        // Creating the test for Unit 1: Machine Learning
        Test test9a = createTest("Machine Learning Test", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);
        addStudentToTest(test9a, student5);
        addStudentToTest(test9a, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa9a_1 = createProblemAnswer("What is machine learning?", "Machine learning is a subset of artificial intelligence that involves developing algorithms that enable computers to learn from and make predictions based on data.");
        addTestToProblemAnswer(pa9a_1, test9a);
        addProblemAnswerToTest(test9a, pa9a_1);

        ProblemAnswer pa9a_2 = createProblemAnswer("What are supervised learning algorithms?", "Supervised learning algorithms are a type of machine learning where the model is trained on labeled data. Examples include linear regression, decision trees, and support vector machines.");
        addTestToProblemAnswer(pa9a_2, test9a);
        addProblemAnswerToTest(test9a, pa9a_2);

        ProblemAnswer pa9a_3 = createProblemAnswer("What are unsupervised learning algorithms?", "Unsupervised learning algorithms are a type of machine learning where the model is trained on unlabeled data. Examples include k-means clustering, hierarchical clustering, and principal component analysis.");
        addTestToProblemAnswer(pa9a_3, test9a);
        addProblemAnswerToTest(test9a, pa9a_3);

        ProblemAnswer pa9a_4 = createProblemAnswer("What is a neural network?", "A neural network is a set of algorithms modeled after the human brain, designed to recognize patterns and make predictions. It consists of layers of interconnected nodes (neurons) that process and transmit information.");
        addTestToProblemAnswer(pa9a_4, test9a);
        addProblemAnswerToTest(test9a, pa9a_4);

        ProblemAnswer pa9a_5 = createProblemAnswer("What is overfitting in machine learning?", "Overfitting occurs when a machine learning model learns the training data too well, capturing noise and details that do not generalize to new, unseen data. This results in poor performance on test data.");
        addTestToProblemAnswer(pa9a_5, test9a);
        addProblemAnswerToTest(test9a, pa9a_5);

// Output for confirmation
        System.out.println("Test for 'Machine Learning' unit created with 10 problem answers.");
// Creating the test for Unit 2: Neural Networks
        Test test9b = createTest("Neural Networks Test", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);
        addStudentToTest(test9b, student5);
        addStudentToTest(test9b, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa9b_1 = createProblemAnswer("What is a neural network?", "A neural network is a set of algorithms modeled after the human brain, designed to recognize patterns and make predictions. It consists of layers of interconnected nodes (neurons) that process and transmit information.");
        addTestToProblemAnswer(pa9b_1, test9b);
        addProblemAnswerToTest(test9b, pa9b_1);

        ProblemAnswer pa9b_2 = createProblemAnswer("What is the architecture of a neural network?", "The architecture of a neural network typically consists of an input layer, one or more hidden layers, and an output layer. Each layer contains nodes (neurons) that perform computations.");
        addTestToProblemAnswer(pa9b_2, test9b);
        addProblemAnswerToTest(test9b, pa9b_2);

        ProblemAnswer pa9b_3 = createProblemAnswer("What is a perceptron?", "A perceptron is the simplest type of artificial neuron, representing a linear binary classifier. It takes multiple input signals, applies weights, sums them, and passes the result through an activation function.");
        addTestToProblemAnswer(pa9b_3, test9b);
        addProblemAnswerToTest(test9b, pa9b_3);

        ProblemAnswer pa9b_4 = createProblemAnswer("What is backpropagation?", "Backpropagation is a learning algorithm used in neural networks to adjust the weights of the connections based on the error of the output. It involves calculating the gradient of the loss function and updating the weights to minimize the error.");
        addTestToProblemAnswer(pa9b_4, test9b);
        addProblemAnswerToTest(test9b, pa9b_4);

        ProblemAnswer pa9b_5 = createProblemAnswer("What is an activation function?", "An activation function is a mathematical function used in neural networks to introduce non-linearity into the model. Common activation functions include sigmoid, tanh, and ReLU.");
        addTestToProblemAnswer(pa9b_5, test9b);
        addProblemAnswerToTest(test9b, pa9b_5);

// Output for confirmation
        System.out.println("Test for 'Neural Networks' unit created with 10 problem answers.");
// Creating the test for Unit 3: Natural Language Processing
        Test test9c = createTest("Natural Language Processing Test", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);
        addStudentToTest(test9c, student5);
        addStudentToTest(test9c, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa9c_1 = createProblemAnswer("What is natural language processing (NLP)?", "Natural language processing (NLP) is a field of artificial intelligence that enables computers to understand, interpret, and generate human language.");
        addTestToProblemAnswer(pa9c_1, test9c);
        addProblemAnswerToTest(test9c, pa9c_1);

        ProblemAnswer pa9c_2 = createProblemAnswer("What is tokenization in NLP?", "Tokenization is the process of breaking down text into smaller units called tokens, such as words, phrases, or sentences. It is a fundamental step in NLP tasks.");
        addTestToProblemAnswer(pa9c_2, test9c);
        addProblemAnswerToTest(test9c, pa9c_2);

        ProblemAnswer pa9c_3 = createProblemAnswer("What is sentiment analysis?", "Sentiment analysis is a technique used in NLP to determine the sentiment or emotional tone of a piece of text. It involves classifying text as positive, negative, or neutral.");
        addTestToProblemAnswer(pa9c_3, test9c);
        addProblemAnswerToTest(test9c, pa9c_3);

        ProblemAnswer pa9c_4 = createProblemAnswer("What is named entity recognition (NER)?", "Named entity recognition (NER) is a technique used in NLP to identify and classify named entities in text, such as people, organizations, locations, and dates.");
        addTestToProblemAnswer(pa9c_4, test9c);
        addProblemAnswerToTest(test9c, pa9c_4);

        ProblemAnswer pa9c_5 = createProblemAnswer("What is part-of-speech tagging?", "Part-of-speech tagging is a technique used in NLP to assign parts of speech (such as nouns, verbs, adjectives, and adverbs) to each word in a text.");
        addTestToProblemAnswer(pa9c_5, test9c);
        addProblemAnswerToTest(test9c, pa9c_5);

// Output for confirmation
        System.out.println("Test for 'Natural Language Processing' unit created with 10 problem answers.");
// Creating the test for Unit 1: Threat Analysis
        Test test10a = createTest("Threat Analysis Test", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        addStudentToTest(test10a, student5);
        addStudentToTest(test10a, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa10a_1 = createProblemAnswer("What is threat analysis?", "Threat analysis is the process of identifying potential security threats and vulnerabilities in a system or network. It involves assessing risks and implementing strategies to mitigate these threats.");
        addTestToProblemAnswer(pa10a_1, test10a);
        addProblemAnswerToTest(test10a, pa10a_1);

        ProblemAnswer pa10a_2 = createProblemAnswer("What is risk assessment?", "Risk assessment is the process of evaluating the potential risks that may impact an organization's operations or assets. It involves identifying threats, analyzing their likelihood and impact, and determining appropriate measures to mitigate or manage the risks.");
        addTestToProblemAnswer(pa10a_2, test10a);
        addProblemAnswerToTest(test10a, pa10a_2);

        ProblemAnswer pa10a_3 = createProblemAnswer("What are common types of security threats?", "Common types of security threats include malware, phishing, denial-of-service (DoS) attacks, man-in-the-middle attacks, and insider threats.");
        addTestToProblemAnswer(pa10a_3, test10a);
        addProblemAnswerToTest(test10a, pa10a_3);

        ProblemAnswer pa10a_4 = createProblemAnswer("What is vulnerability assessment?", "Vulnerability assessment is the process of identifying and evaluating vulnerabilities in a system or network. It involves scanning for weaknesses that could be exploited by attackers and assessing the severity of these vulnerabilities.");
        addTestToProblemAnswer(pa10a_4, test10a);
        addProblemAnswerToTest(test10a, pa10a_4);

        ProblemAnswer pa10a_5 = createProblemAnswer("What is the difference between a threat and a vulnerability?", "A threat is a potential cause of harm to a system or network, while a vulnerability is a weakness or flaw that can be exploited by a threat to cause harm.");
        addTestToProblemAnswer(pa10a_5, test10a);
        addProblemAnswerToTest(test10a, pa10a_5);

// Output for confirmation
        System.out.println("Test for 'Threat Analysis' unit created with 10 problem answers.");
// Creating the test for Unit 2: Encryption
        Test test10b = createTest("Encryption Test", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        addStudentToTest(test10b, student5);
        addStudentToTest(test10b, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa10b_1 = createProblemAnswer("What is encryption?", "Encryption is the process of converting information into a secure format that can only be read by authorized parties. It protects data by transforming it into an unreadable form.");
        addTestToProblemAnswer(pa10b_1, test10b);
        addProblemAnswerToTest(test10b, pa10b_1);

        ProblemAnswer pa10b_2 = createProblemAnswer("What are the main types of encryption?", "The main types of encryption are symmetric encryption and asymmetric encryption. Symmetric encryption uses the same key for encryption and decryption, while asymmetric encryption uses a pair of keys (public and private) for encryption and decryption.");
        addTestToProblemAnswer(pa10b_2, test10b);
        addProblemAnswerToTest(test10b, pa10b_2);

        ProblemAnswer pa10b_3 = createProblemAnswer("What is symmetric encryption?", "Symmetric encryption is a type of encryption where the same key is used to encrypt and decrypt data. Examples of symmetric encryption algorithms include AES (Advanced Encryption Standard) and DES (Data Encryption Standard).");
        addTestToProblemAnswer(pa10b_3, test10b);
        addProblemAnswerToTest(test10b, pa10b_3);

        ProblemAnswer pa10b_4 = createProblemAnswer("What is asymmetric encryption?", "Asymmetric encryption is a type of encryption that uses a pair of keys—a public key for encryption and a private key for decryption. Examples of asymmetric encryption algorithms include RSA (Rivest-Shamir-Adleman) and ECC (Elliptic Curve Cryptography).");
        addTestToProblemAnswer(pa10b_4, test10b);
        addProblemAnswerToTest(test10b, pa10b_4);

        ProblemAnswer pa10b_5 = createProblemAnswer("What is the importance of encryption in data protection?", "Encryption is crucial for data protection as it ensures the confidentiality and integrity of sensitive information. It prevents unauthorized access, protects data during transmission, and helps comply with regulatory requirements.");
        addTestToProblemAnswer(pa10b_5, test10b);
        addProblemAnswerToTest(test10b, pa10b_5);

// Output for confirmation
        System.out.println("Test for 'Encryption' unit created with 10 problem answers.");
// Creating the test for Unit 3: Network Security
        Test test10c = createTest("Network Security Test", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        addStudentToTest(test10c, student5);
        addStudentToTest(test10c, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa10c_1 = createProblemAnswer("What is network security?", "Network security involves measures and protocols to protect data during transmission across networks, preventing unauthorized access and ensuring data integrity.");
        addTestToProblemAnswer(pa10c_1, test10c);
        addProblemAnswerToTest(test10c, pa10c_1);

        ProblemAnswer pa10c_2 = createProblemAnswer("What is a firewall?", "A firewall is a network security device that monitors and controls incoming and outgoing network traffic based on predetermined security rules. It acts as a barrier between trusted and untrusted networks.");
        addTestToProblemAnswer(pa10c_2, test10c);
        addProblemAnswerToTest(test10c, pa10c_2);

        ProblemAnswer pa10c_3 = createProblemAnswer("What is an intrusion detection system (IDS)?", "An intrusion detection system (IDS) is a security tool that monitors network traffic for suspicious activity and potential threats. It alerts administrators to potential security breaches.");
        addTestToProblemAnswer(pa10c_3, test10c);
        addProblemAnswerToTest(test10c, pa10c_3);

        ProblemAnswer pa10c_4 = createProblemAnswer("What is an intrusion prevention system (IPS)?", "An intrusion prevention system (IPS) is similar to an IDS but can also take action to block or prevent detected threats. It actively monitors and responds to potential security incidents.");
        addTestToProblemAnswer(pa10c_4, test10c);
        addProblemAnswerToTest(test10c, pa10c_4);

        ProblemAnswer pa10c_5 = createProblemAnswer("What is a virtual private network (VPN)?", "A virtual private network (VPN) is a secure connection that extends a private network across a public network, such as the internet. It encrypts data transmission, ensuring privacy and security for remote users.");
        addTestToProblemAnswer(pa10c_5, test10c);
        addProblemAnswerToTest(test10c, pa10c_5);

// Output for confirmation
        System.out.println("Test for 'Network Security' unit created with 10 problem answers.");
// Creating the test for Unit 4: Secure Coding
        Test test10d = createTest("Secure Coding Test", faculty5, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);
        addStudentToTest(test10d, student5);
        addStudentToTest(test10d, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa10d_1 = createProblemAnswer("What is secure coding?", "Secure coding involves writing software in a way that minimizes vulnerabilities and ensures the software is resistant to attacks. It involves following best practices and guidelines to prevent security flaws.");
        addTestToProblemAnswer(pa10d_1, test10d);
        addProblemAnswerToTest(test10d, pa10d_1);

        ProblemAnswer pa10d_2 = createProblemAnswer("What are common security flaws in software?", "Common security flaws in software include buffer overflows, SQL injection, cross-site scripting (XSS), cross-site request forgery (CSRF), and improper error handling.");
        addTestToProblemAnswer(pa10d_2, test10d);
        addProblemAnswerToTest(test10d, pa10d_2);

        ProblemAnswer pa10d_3 = createProblemAnswer("What is input validation?", "Input validation is the process of verifying and sanitizing user inputs to ensure they are safe and meet the expected format. It helps prevent attacks like SQL injection and XSS.");
        addTestToProblemAnswer(pa10d_3, test10d);
        addProblemAnswerToTest(test10d, pa10d_3);

        ProblemAnswer pa10d_4 = createProblemAnswer("What is the principle of least privilege?", "The principle of least privilege involves granting users and systems the minimum level of access necessary to perform their functions. It reduces the risk of accidental or malicious damage to systems and data.");
        addTestToProblemAnswer(pa10d_4, test10d);
        addProblemAnswerToTest(test10d, pa10d_4);

        ProblemAnswer pa10d_5 = createProblemAnswer("What is secure authentication?", "Secure authentication involves verifying the identity of users and systems using secure methods, such as multi-factor authentication, strong passwords, and cryptographic protocols.");
        addTestToProblemAnswer(pa10d_5, test10d);
        addProblemAnswerToTest(test10d, pa10d_5);


// Output for confirmation
        System.out.println("Test for 'Secure Coding' unit created with 10 problem answers.");
// Creating the test for Unit 1: Limits
        Test test11a = createTest("Limits Test", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        addStudentToTest(test11a, student5);
        addStudentToTest(test11a, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa11a_1 = createProblemAnswer("What is a limit in calculus?", "A limit is the value that a function approaches as the input approaches a certain point. It is used to define continuity, derivatives, and integrals.");
        addTestToProblemAnswer(pa11a_1, test11a);
        addProblemAnswerToTest(test11a, pa11a_1);

        ProblemAnswer pa11a_2 = createProblemAnswer("How do you calculate a limit?", "To calculate a limit, you can use direct substitution, factoring, rationalizing, or applying the L'Hôpital's Rule if applicable. The method depends on the form of the function.");
        addTestToProblemAnswer(pa11a_2, test11a);
        addProblemAnswerToTest(test11a, pa11a_2);

        ProblemAnswer pa11a_3 = createProblemAnswer("What is the importance of limits in calculus?", "Limits are fundamental in calculus as they are used to define derivatives, integrals, and continuity. They help in understanding the behavior of functions at specific points or as inputs approach infinity.");
        addTestToProblemAnswer(pa11a_3, test11a);
        addProblemAnswerToTest(test11a, pa11a_3);

        ProblemAnswer pa11a_4 = createProblemAnswer("What is a one-sided limit?", "A one-sided limit is the value that a function approaches as the input approaches a certain point from one side (either the left or the right). It is denoted as lim(x→c⁺) f(x) for the right-hand limit and lim(x→c⁻) f(x) for the left-hand limit.");
        addTestToProblemAnswer(pa11a_4, test11a);
        addProblemAnswerToTest(test11a, pa11a_4);

        ProblemAnswer pa11a_5 = createProblemAnswer("What is an infinite limit?", "An infinite limit describes the behavior of a function as it increases or decreases without bound as the input approaches a certain value. It is denoted as lim(x→c) f(x) = ±∞.");
        addTestToProblemAnswer(pa11a_5, test11a);
        addProblemAnswerToTest(test11a, pa11a_5);

// Output for confirmation
        System.out.println("Test for 'Limits' unit created with 10 problem answers.");
// Creating the test for Unit 2: Derivatives
        Test test11b = createTest("Derivatives Test", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        addStudentToTest(test11b, student5);
        addStudentToTest(test11b, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa11b_1 = createProblemAnswer("What is a derivative?", "A derivative measures how a function changes as its input changes. It represents the rate of change or slope of the function at a given point.");
        addTestToProblemAnswer(pa11b_1, test11b);
        addProblemAnswerToTest(test11b, pa11b_1);

        ProblemAnswer pa11b_2 = createProblemAnswer("What is the power rule for differentiation?", "The power rule for differentiation states that if f(x) = x^n, then the derivative f'(x) = n*x^(n-1).");
        addTestToProblemAnswer(pa11b_2, test11b);
        addProblemAnswerToTest(test11b, pa11b_2);

        ProblemAnswer pa11b_3 = createProblemAnswer("What is the product rule for differentiation?", "The product rule for differentiation states that if f(x) = u(x) * v(x), then the derivative f'(x) = u'(x) * v(x) + u(x) * v'(x).");
        addTestToProblemAnswer(pa11b_3, test11b);
        addProblemAnswerToTest(test11b, pa11b_3);

        ProblemAnswer pa11b_4 = createProblemAnswer("What is the quotient rule for differentiation?", "The quotient rule for differentiation states that if f(x) = u(x) / v(x), then the derivative f'(x) = (u'(x) * v(x) - u(x) * v'(x)) / (v(x))^2.");
        addTestToProblemAnswer(pa11b_4, test11b);
        addProblemAnswerToTest(test11b, pa11b_4);

        ProblemAnswer pa11b_5 = createProblemAnswer("What is the chain rule for differentiation?", "The chain rule for differentiation states that if a function y = f(g(x)), then the derivative dy/dx = f'(g(x)) * g'(x).");
        addTestToProblemAnswer(pa11b_5, test11b);
        addProblemAnswerToTest(test11b, pa11b_5);

// Output for confirmation
        System.out.println("Test for 'Derivatives' unit created with 10 problem answers.");
// Creating the test for Unit 3: Integrals
        Test test11c = createTest("Integrals Test", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        addStudentToTest(test11c, student5);
        addStudentToTest(test11c, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa11c_1 = createProblemAnswer("What is an integral?", "An integral is a mathematical concept that represents the accumulation of quantities. It is used to calculate areas, volumes, and other quantities that accumulate over a region.");
        addTestToProblemAnswer(pa11c_1, test11c);
        addProblemAnswerToTest(test11c, pa11c_1);

        ProblemAnswer pa11c_2 = createProblemAnswer("What is the Fundamental Theorem of Calculus?", "The Fundamental Theorem of Calculus links differentiation and integration. It states that the definite integral of a function over an interval is equal to the difference of its antiderivative evaluated at the endpoints of the interval.");
        addTestToProblemAnswer(pa11c_2, test11c);
        addProblemAnswerToTest(test11c, pa11c_2);

        ProblemAnswer pa11c_3 = createProblemAnswer("What are the two types of integrals?", "The two types of integrals are definite integrals and indefinite integrals. Definite integrals have specific limits of integration and calculate a numerical value, while indefinite integrals represent a family of functions and include a constant of integration (C).");
        addTestToProblemAnswer(pa11c_3, test11c);
        addProblemAnswerToTest(test11c, pa11c_3);

        ProblemAnswer pa11c_4 = createProblemAnswer("What is the method of substitution in integration?", "The method of substitution in integration is used to simplify integrals by substituting a part of the integrand with a new variable. It often makes the integral easier to evaluate.");
        addTestToProblemAnswer(pa11c_4, test11c);
        addProblemAnswerToTest(test11c, pa11c_4);

        ProblemAnswer pa11c_5 = createProblemAnswer("What is integration by parts?", "Integration by parts is a technique used to integrate the product of two functions. It is based on the product rule of differentiation and is given by the formula: ∫u dv = uv - ∫v du.");
        addTestToProblemAnswer(pa11c_5, test11c);
        addProblemAnswerToTest(test11c, pa11c_5);

// Output for confirmation
        System.out.println("Test for 'Integrals' unit created with 10 problem answers.");
// Creating the test for Unit 4: Applications of Calculus
        Test test11d = createTest("Applications of Calculus Test", faculty1, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);
        addStudentToTest(test11d, student5);
        addStudentToTest(test11d, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa11d_1 = createProblemAnswer("How is calculus applied in physics?", "In physics, calculus is used to model and analyze the motion of objects, calculate forces and energy, and describe the behavior of physical systems. Examples include finding the velocity and acceleration of objects and solving differential equations.");
        addTestToProblemAnswer(pa11d_1, test11d);
        addProblemAnswerToTest(test11d, pa11d_1);

        ProblemAnswer pa11d_2 = createProblemAnswer("How is calculus used in engineering?", "In engineering, calculus is used to design and analyze systems and structures, optimize processes, and solve problems related to fluid dynamics, thermodynamics, and electrical circuits. Examples include calculating stress and strain in materials and modeling fluid flow.");
        addTestToProblemAnswer(pa11d_2, test11d);
        addProblemAnswerToTest(test11d, pa11d_2);

        ProblemAnswer pa11d_3 = createProblemAnswer("What is the role of calculus in economics?", "In economics, calculus is used to model and analyze economic behavior, optimize production and consumption, and study changes in economic variables. Examples include finding marginal cost and revenue, and solving optimization problems in resource allocation.");
        addTestToProblemAnswer(pa11d_3, test11d);
        addProblemAnswerToTest(test11d, pa11d_3);

        ProblemAnswer pa11d_4 = createProblemAnswer("How is calculus applied in biology?", "In biology, calculus is used to model population growth, analyze rates of biochemical reactions, and understand the dynamics of ecosystems. Examples include modeling the spread of diseases and calculating the rate of enzyme reactions.");
        addTestToProblemAnswer(pa11d_4, test11d);
        addProblemAnswerToTest(test11d, pa11d_4);

        ProblemAnswer pa11d_5 = createProblemAnswer("What is the application of calculus in finance?", "In finance, calculus is used to model and analyze financial markets, optimize investment strategies, and calculate the present value of cash flows. Examples include pricing options and other derivatives and solving optimization problems in portfolio management.");
        addTestToProblemAnswer(pa11d_5, test11d);
        addProblemAnswerToTest(test11d, pa11d_5);


// Output for confirmation
        System.out.println("Test for 'Applications of Calculus' unit created with 10 problem answers.");
// Creating the test for Unit 1: Vectors
        Test test12a = createTest("Vectors Test", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        addStudentToTest(test12a, student5);
        addStudentToTest(test12a, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa12a_1 = createProblemAnswer("What is a vector?", "A vector is a quantity that has both magnitude and direction. It can be represented graphically by an arrow or algebraically by coordinates.");
        addTestToProblemAnswer(pa12a_1, test12a);
        addProblemAnswerToTest(test12a, pa12a_1);

        ProblemAnswer pa12a_2 = createProblemAnswer("How do you add vectors?", "Vectors are added by adding their corresponding components. If A = (a1, a2, a3) and B = (b1, b2, b3), then A + B = (a1 + b1, a2 + b2, a3 + b3).");
        addTestToProblemAnswer(pa12a_2, test12a);
        addProblemAnswerToTest(test12a, pa12a_2);

        ProblemAnswer pa12a_3 = createProblemAnswer("What is scalar multiplication of a vector?", "Scalar multiplication involves multiplying a vector by a scalar (a real number). If k is a scalar and A = (a1, a2, a3), then kA = (k*a1, k*a2, k*a3).");
        addTestToProblemAnswer(pa12a_3, test12a);
        addProblemAnswerToTest(test12a, pa12a_3);

        ProblemAnswer pa12a_4 = createProblemAnswer("What is the dot product of two vectors?", "The dot product of two vectors A and B is a scalar obtained by multiplying their corresponding components and summing the results. If A = (a1, a2, a3) and B = (b1, b2, b3), then A ⋅ B = a1*b1 + a2*b2 + a3*b3.");
        addTestToProblemAnswer(pa12a_4, test12a);
        addProblemAnswerToTest(test12a, pa12a_4);

        ProblemAnswer pa12a_5 = createProblemAnswer("What is the cross product of two vectors?", "The cross product of two vectors A and B is a vector that is perpendicular to both A and B. If A = (a1, a2, a3) and B = (b1, b2, b3), then A × B = (a2*b3 - a3*b2, a3*b1 - a1*b3, a1*b2 - a2*b1).");
        addTestToProblemAnswer(pa12a_5, test12a);
        addProblemAnswerToTest(test12a, pa12a_5);

// Output for confirmation
        System.out.println("Test for 'Vectors' unit created with 10 problem answers.");
// Creating the test for Unit 2: Matrices
        Test test12b = createTest("Matrices Test", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        addStudentToTest(test12b, student5);
        addStudentToTest(test12b, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa12b_1 = createProblemAnswer("What is a matrix?", "A matrix is a rectangular array of numbers arranged in rows and columns. It is used to represent linear transformations and solve systems of linear equations.");
        addTestToProblemAnswer(pa12b_1, test12b);
        addProblemAnswerToTest(test12b, pa12b_1);

        ProblemAnswer pa12b_2 = createProblemAnswer("How do you add matrices?", "Matrices are added by adding their corresponding elements. If A and B are matrices of the same dimension, then the sum C = A + B is obtained by adding each corresponding element of A and B.");
        addTestToProblemAnswer(pa12b_2, test12b);
        addProblemAnswerToTest(test12b, pa12b_2);

        ProblemAnswer pa12b_3 = createProblemAnswer("What is matrix multiplication?", "Matrix multiplication involves multiplying rows of the first matrix by columns of the second matrix and summing the products. If A is an m×n matrix and B is an n×p matrix, the product AB is an m×p matrix.");
        addTestToProblemAnswer(pa12b_3, test12b);
        addProblemAnswerToTest(test12b, pa12b_3);

        ProblemAnswer pa12b_4 = createProblemAnswer("What is the identity matrix?", "The identity matrix is a square matrix with ones on the diagonal and zeros elsewhere. It acts as the multiplicative identity in matrix multiplication, meaning AI = IA = A for any matrix A.");
        addTestToProblemAnswer(pa12b_4, test12b);
        addProblemAnswerToTest(test12b, pa12b_4);

        ProblemAnswer pa12b_5 = createProblemAnswer("What is the inverse of a matrix?", "The inverse of a matrix A is a matrix B such that AB = BA = I, where I is the identity matrix. Not all matrices have inverses; only square matrices that are non-singular (determinant is non-zero) have inverses.");
        addTestToProblemAnswer(pa12b_5, test12b);
        addProblemAnswerToTest(test12b, pa12b_5);

// Output for confirmation
        System.out.println("Test for 'Matrices' unit created with 10 problem answers.");
// Creating the test for Unit 3: Determinants
        Test test12c = createTest("Determinants Test", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        addStudentToTest(test12c, student5);
        addStudentToTest(test12c, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa12c_1 = createProblemAnswer("What is a determinant?", "A determinant is a scalar value that can be computed from the elements of a square matrix. It provides important properties of the matrix, such as whether it is invertible.");
        addTestToProblemAnswer(pa12c_1, test12c);
        addProblemAnswerToTest(test12c, pa12c_1);

        ProblemAnswer pa12c_2 = createProblemAnswer("How do you calculate the determinant of a 2x2 matrix?", "For a 2x2 matrix A = [[a, b], [c, d]], the determinant is det(A) = ad - bc.");
        addTestToProblemAnswer(pa12c_2, test12c);
        addProblemAnswerToTest(test12c, pa12c_2);

        ProblemAnswer pa12c_3 = createProblemAnswer("What is the determinant of a 3x3 matrix?", "For a 3x3 matrix A = [[a, b, c], [d, e, f], [g, h, i]], the determinant is det(A) = a(ei - fh) - b(di - fg) + c(dh - eg).");
        addTestToProblemAnswer(pa12c_3, test12c);
        addProblemAnswerToTest(test12c, pa12c_3);

        ProblemAnswer pa12c_4 = createProblemAnswer("What are the properties of determinants?", "Properties of determinants include: det(AB) = det(A)det(B), det(A^T) = det(A), det(cA) = c^n det(A) for an nxn matrix, and a matrix is invertible if and only if its determinant is non-zero.");
        addTestToProblemAnswer(pa12c_4, test12c);
        addProblemAnswerToTest(test12c, pa12c_4);

        ProblemAnswer pa12c_5 = createProblemAnswer("What is the cofactor expansion?", "The cofactor expansion, also known as Laplace expansion, is a method for calculating the determinant of an nxn matrix by expanding along a row or column and using the minors and cofactors.");
        addTestToProblemAnswer(pa12c_5, test12c);
        addProblemAnswerToTest(test12c, pa12c_5);

// Output for confirmation
        System.out.println("Test for 'Determinants' unit created with 10 problem answers.");
// Creating the test for Unit 4: Eigenvalues
        Test test12d = createTest("Eigenvalues Test", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        addStudentToTest(test12d, student5);
        addStudentToTest(test12d, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa12d_1 = createProblemAnswer("What is an eigenvalue?", "An eigenvalue is a scalar value associated with a matrix that, when multiplied by its corresponding eigenvector, yields the same eigenvector. It is a special number that provides insight into the matrix's properties.");
        addTestToProblemAnswer(pa12d_1, test12d);
        addProblemAnswerToTest(test12d, pa12d_1);

        ProblemAnswer pa12d_2 = createProblemAnswer("How do you calculate eigenvalues of a matrix?", "To calculate the eigenvalues of a matrix A, solve the characteristic equation det(A - λI) = 0, where λ represents the eigenvalues, I is the identity matrix, and det denotes the determinant.");
        addTestToProblemAnswer(pa12d_2, test12d);
        addProblemAnswerToTest(test12d, pa12d_2);

        ProblemAnswer pa12d_3 = createProblemAnswer("What is the characteristic polynomial?", "The characteristic polynomial of a matrix A is the polynomial obtained by computing the determinant of (A - λI). The roots of this polynomial are the eigenvalues of the matrix.");
        addTestToProblemAnswer(pa12d_3, test12d);
        addProblemAnswerToTest(test12d, pa12d_3);

        ProblemAnswer pa12d_4 = createProblemAnswer("What is the geometric multiplicity of an eigenvalue?", "The geometric multiplicity of an eigenvalue is the number of linearly independent eigenvectors associated with it. It represents the dimension of the eigenspace corresponding to that eigenvalue.");
        addTestToProblemAnswer(pa12d_4, test12d);
        addProblemAnswerToTest(test12d, pa12d_4);

        ProblemAnswer pa12d_5 = createProblemAnswer("What is the algebraic multiplicity of an eigenvalue?", "The algebraic multiplicity of an eigenvalue is the number of times that eigenvalue appears as a root of the characteristic polynomial. It can be equal to or greater than the geometric multiplicity.");
        addTestToProblemAnswer(pa12d_5, test12d);
        addProblemAnswerToTest(test12d, pa12d_5);

// Output for confirmation
        System.out.println("Test for 'Eigenvalues' unit created with 10 problem answers.");
// Creating the test for Unit 5: Eigenvectors
        Test test12e = createTest("Eigenvectors Test", faculty2, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);
        addStudentToTest(test12e, student5);
        addStudentToTest(test12e, student6);

// Creating and adding problem answers to the test
        ProblemAnswer pa12e_1 = createProblemAnswer("What is an eigenvector?", "An eigenvector is a non-zero vector that changes only in scale (not direction) when a linear transformation is applied to it. It is associated with a specific eigenvalue.");
        addTestToProblemAnswer(pa12e_1, test12e);
        addProblemAnswerToTest(test12e, pa12e_1);

        ProblemAnswer pa12e_2 = createProblemAnswer("How do you find eigenvectors of a matrix?", "Eigenvectors of a matrix A are found by solving the equation (A - λI)x = 0, where λ is an eigenvalue, I is the identity matrix, and x is the eigenvector.");
        addTestToProblemAnswer(pa12e_2, test12e);
        addProblemAnswerToTest(test12e, pa12e_2);

        ProblemAnswer pa12e_3 = createProblemAnswer("What is the relationship between eigenvalues and eigenvectors?", "Eigenvalues are the scalars associated with eigenvectors. If x is an eigenvector of matrix A with eigenvalue λ, then Ax = λx.");
        addTestToProblemAnswer(pa12e_3, test12e);
        addProblemAnswerToTest(test12e, pa12e_3);

        ProblemAnswer pa12e_4 = createProblemAnswer("What is an eigenspace?", "An eigenspace is the set of all eigenvectors corresponding to a particular eigenvalue, along with the zero vector. It forms a subspace of the vector space.");
        addTestToProblemAnswer(pa12e_4, test12e);
        addProblemAnswerToTest(test12e, pa12e_4);

        ProblemAnswer pa12e_5 = createProblemAnswer("How are eigenvectors used in matrix diagonalization?", "Matrix diagonalization involves expressing a matrix A as PDP^(-1), where P is a matrix of eigenvectors, D is a diagonal matrix of eigenvalues, and P^(-1) is the inverse of P.");
        addTestToProblemAnswer(pa12e_5, test12e);
        addProblemAnswerToTest(test12e, pa12e_5);

// Output for confirmation
        System.out.println("Test for 'Eigenvectors' unit created with 10 problem answers.");

        // Creating StudentAnswer instances for student5
        StudentAnswer sa9a_1_student5 = createStudentAnswer(student5, pa9a_1, "Machine learning is a subset of artificial intelligence that involves developing algorithms that enable computers to learn from and make predictions based on data.");
        addStudentAnswerToProblemAnswer(pa9a_1, sa9a_1_student5);

        StudentAnswer sa9a_2_student5 = createStudentAnswer(student5, pa9a_2, "Supervised learning algorithms are a type of machine learning where the model is trained on labeled data. Examples include linear regression, decision trees, and support vector machines.");
        addStudentAnswerToProblemAnswer(pa9a_2, sa9a_2_student5);

        StudentAnswer sa9a_3_student5 = createStudentAnswer(student5, pa9a_3, "Unsupervised learning algorithms are a type of machine learning where the model is trained on unlabeled data. Examples include k-means clustering, hierarchical clustering, and principal component analysis.");
        addStudentAnswerToProblemAnswer(pa9a_3, sa9a_3_student5);

        StudentAnswer sa9a_4_student5 = createStudentAnswer(student5, pa9a_4, "A neural network is a set of algorithms modeled after the human brain, designed to recognize patterns and make predictions. It consists of layers of interconnected nodes (neurons) that process and transmit information.");
        addStudentAnswerToProblemAnswer(pa9a_4, sa9a_4_student5);

        StudentAnswer sa9a_5_student5 = createStudentAnswer(student5, pa9a_5, "Overfitting occurs when a machine learning model learns the training data too well, capturing noise and details that do not generalize to new, unseen data. This results in poor performance on test data.");
        addStudentAnswerToProblemAnswer(pa9a_5, sa9a_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa9a_1_student6 = createStudentAnswer(student6, pa9a_1, "Machine learning is a subset of artificial intelligence that involves developing algorithms that enable computers to learn from and make predictions based on data.");
        addStudentAnswerToProblemAnswer(pa9a_1, sa9a_1_student6);

        StudentAnswer sa9a_2_student6 = createStudentAnswer(student6, pa9a_2, "Supervised learning algorithms are a type of machine learning where the model is trained on labeled data. Examples include linear regression, decision trees, and support vector machines.");
        addStudentAnswerToProblemAnswer(pa9a_2, sa9a_2_student6);

        StudentAnswer sa9a_3_student6 = createStudentAnswer(student6, pa9a_3, "Unsupervised learning algorithms are a type of machine learning where the model is trained on unlabeled data. Examples include k-means clustering, hierarchical clustering, and principal component analysis.");
        addStudentAnswerToProblemAnswer(pa9a_3, sa9a_3_student6);

        StudentAnswer sa9a_4_student6 = createStudentAnswer(student6, pa9a_4, "A neural network is a set of algorithms modeled after the human brain, designed to recognize patterns and make predictions. It consists of layers of interconnected nodes (neurons) that process and transmit information.");
        addStudentAnswerToProblemAnswer(pa9a_4, sa9a_4_student6);

        StudentAnswer sa9a_5_student6 = createStudentAnswer(student6, pa9a_5, "Overfitting occurs when a machine learning model learns the training data too well, capturing noise and details that do not generalize to new, unseen data. This results in poor performance on test data.");
        addStudentAnswerToProblemAnswer(pa9a_5, sa9a_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa9b_1_student5 = createStudentAnswer(student5, pa9b_1, "A neural network is a set of algorithms modeled after the human brain, designed to recognize patterns and make predictions. It consists of layers of interconnected nodes (neurons) that process and transmit information.");
        addStudentAnswerToProblemAnswer(pa9b_1, sa9b_1_student5);

        StudentAnswer sa9b_2_student5 = createStudentAnswer(student5, pa9b_2, "The architecture of a neural network typically consists of an input layer, one or more hidden layers, and an output layer. Each layer contains nodes (neurons) that perform computations.");
        addStudentAnswerToProblemAnswer(pa9b_2, sa9b_2_student5);

        StudentAnswer sa9b_3_student5 = createStudentAnswer(student5, pa9b_3, "A perceptron is the simplest type of artificial neuron, representing a linear binary classifier. It takes multiple input signals, applies weights, sums them, and passes the result through an activation function.");
        addStudentAnswerToProblemAnswer(pa9b_3, sa9b_3_student5);

        StudentAnswer sa9b_4_student5 = createStudentAnswer(student5, pa9b_4, "Backpropagation is a learning algorithm used in neural networks to adjust the weights of the connections based on the error of the output. It involves calculating the gradient of the loss function and updating the weights to minimize the error.");
        addStudentAnswerToProblemAnswer(pa9b_4, sa9b_4_student5);

        StudentAnswer sa9b_5_student5 = createStudentAnswer(student5, pa9b_5, "An activation function is a mathematical function used in neural networks to introduce non-linearity into the model. Common activation functions include sigmoid, tanh, and ReLU.");
        addStudentAnswerToProblemAnswer(pa9b_5, sa9b_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa9b_1_student6 = createStudentAnswer(student6, pa9b_1, "A neural network is a set of algorithms modeled after the human brain, designed to recognize patterns and make predictions. It consists of layers of interconnected nodes (neurons) that process and transmit information.");
        addStudentAnswerToProblemAnswer(pa9b_1, sa9b_1_student6);

        StudentAnswer sa9b_2_student6 = createStudentAnswer(student6, pa9b_2, "The architecture of a neural network typically consists of an input layer, one or more hidden layers, and an output layer. Each layer contains nodes (neurons) that perform computations.");
        addStudentAnswerToProblemAnswer(pa9b_2, sa9b_2_student6);

        StudentAnswer sa9b_3_student6 = createStudentAnswer(student6, pa9b_3, "A perceptron is the simplest type of artificial neuron, representing a linear binary classifier. It takes multiple input signals, applies weights, sums them, and passes the result through an activation function.");
        addStudentAnswerToProblemAnswer(pa9b_3, sa9b_3_student6);

        StudentAnswer sa9b_4_student6 = createStudentAnswer(student6, pa9b_4, "Backpropagation is a learning algorithm used in neural networks to adjust the weights of the connections based on the error of the output. It involves calculating the gradient of the loss function and updating the weights to minimize the error.");
        addStudentAnswerToProblemAnswer(pa9b_4, sa9b_4_student6);

        StudentAnswer sa9b_5_student6 = createStudentAnswer(student6, pa9b_5, "An activation function is a mathematical function used in neural networks to introduce non-linearity into the model. Common activation functions include sigmoid, tanh, and ReLU.");
        addStudentAnswerToProblemAnswer(pa9b_5, sa9b_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa9c_1_student5 = createStudentAnswer(student5, pa9c_1, "Natural language processing (NLP) is a field of artificial intelligence that enables computers to understand, interpret, and generate human language.");
        addStudentAnswerToProblemAnswer(pa9c_1, sa9c_1_student5);

        StudentAnswer sa9c_2_student5 = createStudentAnswer(student5, pa9c_2, "Tokenization is the process of breaking down text into smaller units called tokens, such as words, phrases, or sentences. It is a fundamental step in NLP tasks.");
        addStudentAnswerToProblemAnswer(pa9c_2, sa9c_2_student5);

        StudentAnswer sa9c_3_student5 = createStudentAnswer(student5, pa9c_3, "Sentiment analysis is a technique used in NLP to determine the sentiment or emotional tone of a piece of text. It involves classifying text as positive, negative, or neutral.");
        addStudentAnswerToProblemAnswer(pa9c_3, sa9c_3_student5);

        StudentAnswer sa9c_4_student5 = createStudentAnswer(student5, pa9c_4, "Named entity recognition (NER) is a technique used in NLP to identify and classify named entities in text, such as people, organizations, locations, and dates.");
        addStudentAnswerToProblemAnswer(pa9c_4, sa9c_4_student5);

        StudentAnswer sa9c_5_student5 = createStudentAnswer(student5, pa9c_5, "Part-of-speech tagging is a technique used in NLP to assign parts of speech (such as nouns, verbs, adjectives, and adverbs) to each word in a text.");
        addStudentAnswerToProblemAnswer(pa9c_5, sa9c_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa9c_1_student6 = createStudentAnswer(student6, pa9c_1, "Natural language processing (NLP) is a field of artificial intelligence that enables computers to understand, interpret, and generate human language.");
        addStudentAnswerToProblemAnswer(pa9c_1, sa9c_1_student6);

        StudentAnswer sa9c_2_student6 = createStudentAnswer(student6, pa9c_2, "Tokenization is the process of breaking down text into smaller units called tokens, such as words, phrases, or sentences. It is a fundamental step in NLP tasks.");
        addStudentAnswerToProblemAnswer(pa9c_2, sa9c_2_student6);

        StudentAnswer sa9c_3_student6 = createStudentAnswer(student6, pa9c_3, "Sentiment analysis is a technique used in NLP to determine the sentiment or emotional tone of a piece of text. It involves classifying text as positive, negative, or neutral.");
        addStudentAnswerToProblemAnswer(pa9c_3, sa9c_3_student6);

        StudentAnswer sa9c_4_student6 = createStudentAnswer(student6, pa9c_4, "Named entity recognition (NER) is a technique used in NLP to identify and classify named entities in text, such as people, organizations, locations, and dates.");
        addStudentAnswerToProblemAnswer(pa9c_4, sa9c_4_student6);

        StudentAnswer sa9c_5_student6 = createStudentAnswer(student6, pa9c_5, "Part-of-speech tagging is a technique used in NLP to assign parts of speech (such as nouns, verbs, adjectives, and adverbs) to each word in a text.");
        addStudentAnswerToProblemAnswer(pa9c_5, sa9c_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa10a_1_student5 = createStudentAnswer(student5, pa10a_1, "Threat analysis is the process of identifying potential security threats and vulnerabilities in a system or network. It involves assessing risks and implementing strategies to mitigate these threats.");
        addStudentAnswerToProblemAnswer(pa10a_1, sa10a_1_student5);

        StudentAnswer sa10a_2_student5 = createStudentAnswer(student5, pa10a_2, "Risk assessment is the process of evaluating the potential risks that may impact an organization's operations or assets. It involves identifying threats, analyzing their likelihood and impact, and determining appropriate measures to mitigate or manage the risks.");
        addStudentAnswerToProblemAnswer(pa10a_2, sa10a_2_student5);

        StudentAnswer sa10a_3_student5 = createStudentAnswer(student5, pa10a_3, "Common types of security threats include malware, phishing, denial-of-service (DoS) attacks, man-in-the-middle attacks, and insider threats.");
        addStudentAnswerToProblemAnswer(pa10a_3, sa10a_3_student5);

        StudentAnswer sa10a_4_student5 = createStudentAnswer(student5, pa10a_4, "Vulnerability assessment is the process of identifying and evaluating vulnerabilities in a system or network. It involves scanning for weaknesses that could be exploited by attackers and assessing the severity of these vulnerabilities.");
        addStudentAnswerToProblemAnswer(pa10a_4, sa10a_4_student5);

        StudentAnswer sa10a_5_student5 = createStudentAnswer(student5, pa10a_5, "A threat is a potential cause of harm to a system or network, while a vulnerability is a weakness or flaw that can be exploited by a threat to cause harm.");
        addStudentAnswerToProblemAnswer(pa10a_5, sa10a_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa10a_1_student6 = createStudentAnswer(student6, pa10a_1, "Threat analysis is the process of identifying potential security threats and vulnerabilities in a system or network. It involves assessing risks and implementing strategies to mitigate these threats.");
        addStudentAnswerToProblemAnswer(pa10a_1, sa10a_1_student6);

        StudentAnswer sa10a_2_student6 = createStudentAnswer(student6, pa10a_2, "Risk assessment is the process of evaluating the potential risks that may impact an organization's operations or assets. It involves identifying threats, analyzing their likelihood and impact, and determining appropriate measures to mitigate or manage the risks.");
        addStudentAnswerToProblemAnswer(pa10a_2, sa10a_2_student6);

        StudentAnswer sa10a_3_student6 = createStudentAnswer(student6, pa10a_3, "Common types of security threats include malware, phishing, denial-of-service (DoS) attacks, man-in-the-middle attacks, and insider threats.");
        addStudentAnswerToProblemAnswer(pa10a_3, sa10a_3_student6);

        StudentAnswer sa10a_4_student6 = createStudentAnswer(student6, pa10a_4, "Vulnerability assessment is the process of identifying and evaluating vulnerabilities in a system or network. It involves scanning for weaknesses that could be exploited by attackers and assessing the severity of these vulnerabilities.");
        addStudentAnswerToProblemAnswer(pa10a_4, sa10a_4_student6);

        StudentAnswer sa10a_5_student6 = createStudentAnswer(student6, pa10a_5, "A threat is a potential cause of harm to a system or network, while a vulnerability is a weakness or flaw that can be exploited by a threat to cause harm.");
        addStudentAnswerToProblemAnswer(pa10a_5, sa10a_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa10b_1_student5 = createStudentAnswer(student5, pa10b_1, "Encryption is the process of converting information into a secure format that can only be read by authorized parties. It protects data by transforming it into an unreadable form.");
        addStudentAnswerToProblemAnswer(pa10b_1, sa10b_1_student5);

        StudentAnswer sa10b_2_student5 = createStudentAnswer(student5, pa10b_2, "The main types of encryption are symmetric encryption and asymmetric encryption. Symmetric encryption uses the same key for encryption and decryption, while asymmetric encryption uses a pair of keys (public and private) for encryption and decryption.");
        addStudentAnswerToProblemAnswer(pa10b_2, sa10b_2_student5);

        StudentAnswer sa10b_3_student5 = createStudentAnswer(student5, pa10b_3, "Symmetric encryption is a type of encryption where the same key is used to encrypt and decrypt data. Examples of symmetric encryption algorithms include AES (Advanced Encryption Standard) and DES (Data Encryption Standard).");
        addStudentAnswerToProblemAnswer(pa10b_3, sa10b_3_student5);

        StudentAnswer sa10b_4_student5 = createStudentAnswer(student5, pa10b_4, "Asymmetric encryption is a type of encryption that uses a pair of keys—a public key for encryption and a private key for decryption. Examples of asymmetric encryption algorithms include RSA (Rivest-Shamir-Adleman) and ECC (Elliptic Curve Cryptography).");
        addStudentAnswerToProblemAnswer(pa10b_4, sa10b_4_student5);

        StudentAnswer sa10b_5_student5 = createStudentAnswer(student5, pa10b_5, "Encryption is crucial for data protection as it ensures the confidentiality and integrity of sensitive information. It prevents unauthorized access, protects data during transmission, and helps comply with regulatory requirements.");
        addStudentAnswerToProblemAnswer(pa10b_5, sa10b_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa10b_1_student6 = createStudentAnswer(student6, pa10b_1, "Encryption is the process of converting information into a secure format that can only be read by authorized parties. It protects data by transforming it into an unreadable form.");
        addStudentAnswerToProblemAnswer(pa10b_1, sa10b_1_student6);

        StudentAnswer sa10b_2_student6 = createStudentAnswer(student6, pa10b_2, "The main types of encryption are symmetric encryption and asymmetric encryption. Symmetric encryption uses the same key for encryption and decryption, while asymmetric encryption uses a pair of keys (public and private) for encryption and decryption.");
        addStudentAnswerToProblemAnswer(pa10b_2, sa10b_2_student6);

        StudentAnswer sa10b_3_student6 = createStudentAnswer(student6, pa10b_3, "Symmetric encryption is a type of encryption where the same key is used to encrypt and decrypt data. Examples of symmetric encryption algorithms include AES (Advanced Encryption Standard) and DES (Data Encryption Standard).");
        addStudentAnswerToProblemAnswer(pa10b_3, sa10b_3_student6);

        StudentAnswer sa10b_4_student6 = createStudentAnswer(student6, pa10b_4, "Asymmetric encryption is a type of encryption that uses a pair of keys—a public key for encryption and a private key for decryption. Examples of asymmetric encryption algorithms include RSA (Rivest-Shamir-Adleman) and ECC (Elliptic Curve Cryptography).");
        addStudentAnswerToProblemAnswer(pa10b_4, sa10b_4_student6);

        StudentAnswer sa10b_5_student6 = createStudentAnswer(student6, pa10b_5, "Encryption is crucial for data protection as it ensures the confidentiality and integrity of sensitive information. It prevents unauthorized access, protects data during transmission, and helps comply with regulatory requirements.");
        addStudentAnswerToProblemAnswer(pa10b_5, sa10b_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa10c_1_student5 = createStudentAnswer(student5, pa10c_1, "Network security involves measures and protocols to protect data during transmission across networks, preventing unauthorized access and ensuring data integrity.");
        addStudentAnswerToProblemAnswer(pa10c_1, sa10c_1_student5);

        StudentAnswer sa10c_2_student5 = createStudentAnswer(student5, pa10c_2, "A firewall is a network security device that monitors and controls incoming and outgoing network traffic based on predetermined security rules. It acts as a barrier between trusted and untrusted networks.");
        addStudentAnswerToProblemAnswer(pa10c_2, sa10c_2_student5);

        StudentAnswer sa10c_3_student5 = createStudentAnswer(student5, pa10c_3, "An intrusion detection system (IDS) is a security tool that monitors network traffic for suspicious activity and potential threats. It alerts administrators to potential security breaches.");
        addStudentAnswerToProblemAnswer(pa10c_3, sa10c_3_student5);

        StudentAnswer sa10c_4_student5 = createStudentAnswer(student5, pa10c_4, "An intrusion prevention system (IPS) is similar to an IDS but can also take action to block or prevent detected threats. It actively monitors and responds to potential security incidents.");
        addStudentAnswerToProblemAnswer(pa10c_4, sa10c_4_student5);

        StudentAnswer sa10c_5_student5 = createStudentAnswer(student5, pa10c_5, "A virtual private network (VPN) is a secure connection that extends a private network across a public network, such as the internet. It encrypts data transmission, ensuring privacy and security for remote users.");
        addStudentAnswerToProblemAnswer(pa10c_5, sa10c_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa10c_1_student6 = createStudentAnswer(student6, pa10c_1, "Network security involves measures and protocols to protect data during transmission across networks, preventing unauthorized access and ensuring data integrity.");
        addStudentAnswerToProblemAnswer(pa10c_1, sa10c_1_student6);

        StudentAnswer sa10c_2_student6 = createStudentAnswer(student6, pa10c_2, "A firewall is a network security device that monitors and controls incoming and outgoing network traffic based on predetermined security rules. It acts as a barrier between trusted and untrusted networks.");
        addStudentAnswerToProblemAnswer(pa10c_2, sa10c_2_student6);

        StudentAnswer sa10c_3_student6 = createStudentAnswer(student6, pa10c_3, "An intrusion detection system (IDS) is a security tool that monitors network traffic for suspicious activity and potential threats. It alerts administrators to potential security breaches.");
        addStudentAnswerToProblemAnswer(pa10c_3, sa10c_3_student6);

        StudentAnswer sa10c_4_student6 = createStudentAnswer(student6, pa10c_4, "An intrusion prevention system (IPS) is similar to an IDS but can also take action to block or prevent detected threats. It actively monitors and responds to potential security incidents.");
        addStudentAnswerToProblemAnswer(pa10c_4, sa10c_4_student6);

        StudentAnswer sa10c_5_student6 = createStudentAnswer(student6, pa10c_5, "A virtual private network (VPN) is a secure connection that extends a private network across a public network, such as the internet. It encrypts data transmission, ensuring privacy and security for remote users.");
        addStudentAnswerToProblemAnswer(pa10c_5, sa10c_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa10d_1_student5 = createStudentAnswer(student5, pa10d_1, "Secure coding involves writing software in a way that minimizes vulnerabilities and ensures the software is resistant to attacks. It involves following best practices and guidelines to prevent security flaws.");
        addStudentAnswerToProblemAnswer(pa10d_1, sa10d_1_student5);

        StudentAnswer sa10d_2_student5 = createStudentAnswer(student5, pa10d_2, "Common security flaws in software include buffer overflows, SQL injection, cross-site scripting (XSS), cross-site request forgery (CSRF), and improper error handling.");
        addStudentAnswerToProblemAnswer(pa10d_2, sa10d_2_student5);

        StudentAnswer sa10d_3_student5 = createStudentAnswer(student5, pa10d_3, "Input validation is the process of verifying and sanitizing user inputs to ensure they are safe and meet the expected format. It helps prevent attacks like SQL injection and XSS.");
        addStudentAnswerToProblemAnswer(pa10d_3, sa10d_3_student5);

        StudentAnswer sa10d_4_student5 = createStudentAnswer(student5, pa10d_4, "The principle of least privilege involves granting users and systems the minimum level of access necessary to perform their functions. It reduces the risk of accidental or malicious damage to systems and data.");
        addStudentAnswerToProblemAnswer(pa10d_4, sa10d_4_student5);

        StudentAnswer sa10d_5_student5 = createStudentAnswer(student5, pa10d_5, "Secure authentication involves verifying the identity of users and systems using secure methods, such as multi-factor authentication, strong passwords, and cryptographic protocols.");
        addStudentAnswerToProblemAnswer(pa10d_5, sa10d_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa10d_1_student6 = createStudentAnswer(student6, pa10d_1, "Secure coding involves writing software in a way that minimizes vulnerabilities and ensures the software is resistant to attacks. It involves following best practices and guidelines to prevent security flaws.");
        addStudentAnswerToProblemAnswer(pa10d_1, sa10d_1_student6);

        StudentAnswer sa10d_2_student6 = createStudentAnswer(student6, pa10d_2, "Common security flaws in software include buffer overflows, SQL injection, cross-site scripting (XSS), cross-site request forgery (CSRF), and improper error handling.");
        addStudentAnswerToProblemAnswer(pa10d_2, sa10d_2_student6);

        StudentAnswer sa10d_3_student6 = createStudentAnswer(student6, pa10d_3, "Input validation is the process of verifying and sanitizing user inputs to ensure they are safe and meet the expected format. It helps prevent attacks like SQL injection and XSS.");
        addStudentAnswerToProblemAnswer(pa10d_3, sa10d_3_student6);

        StudentAnswer sa10d_4_student6 = createStudentAnswer(student6, pa10d_4, "The principle of least privilege involves granting users and systems the minimum level of access necessary to perform their functions. It reduces the risk of accidental or malicious damage to systems and data.");
        addStudentAnswerToProblemAnswer(pa10d_4, sa10d_4_student6);

        StudentAnswer sa10d_5_student6 = createStudentAnswer(student6, pa10d_5, "Secure authentication involves verifying the identity of users and systems using secure methods, such as multi-factor authentication, strong passwords, and cryptographic protocols.");
        addStudentAnswerToProblemAnswer(pa10d_5, sa10d_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa11a_1_student5 = createStudentAnswer(student5, pa11a_1, "A limit is the value that a function approaches as the input approaches a certain point. It is used to define continuity, derivatives, and integrals.");
        addStudentAnswerToProblemAnswer(pa11a_1, sa11a_1_student5);

        StudentAnswer sa11a_2_student5 = createStudentAnswer(student5, pa11a_2, "To calculate a limit, you can use direct substitution, factoring, rationalizing, or applying the L'Hôpital's Rule if applicable. The method depends on the form of the function.");
        addStudentAnswerToProblemAnswer(pa11a_2, sa11a_2_student5);

        StudentAnswer sa11a_3_student5 = createStudentAnswer(student5, pa11a_3, "Limits are fundamental in calculus as they are used to define derivatives, integrals, and continuity. They help in understanding the behavior of functions at specific points or as inputs approach infinity.");
        addStudentAnswerToProblemAnswer(pa11a_3, sa11a_3_student5);

        StudentAnswer sa11a_4_student5 = createStudentAnswer(student5, pa11a_4, "A one-sided limit is the value that a function approaches as the input approaches a certain point from one side (either the left or the right). It is denoted as lim(x→c⁺) f(x) for the right-hand limit and lim(x→c⁻) f(x) for the left-hand limit.");
        addStudentAnswerToProblemAnswer(pa11a_4, sa11a_4_student5);

        StudentAnswer sa11a_5_student5 = createStudentAnswer(student5, pa11a_5, "An infinite limit describes the behavior of a function as it increases or decreases without bound as the input approaches a certain value. It is denoted as lim(x→c) f(x) = ±∞.");
        addStudentAnswerToProblemAnswer(pa11a_5, sa11a_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa11a_1_student6 = createStudentAnswer(student6, pa11a_1, "A limit is the value that a function approaches as the input approaches a certain point. It is used to define continuity, derivatives, and integrals.");
        addStudentAnswerToProblemAnswer(pa11a_1, sa11a_1_student6);

        StudentAnswer sa11a_2_student6 = createStudentAnswer(student6, pa11a_2, "To calculate a limit, you can use direct substitution, factoring, rationalizing, or applying the L'Hôpital's Rule if applicable. The method depends on the form of the function.");
        addStudentAnswerToProblemAnswer(pa11a_2, sa11a_2_student6);

        StudentAnswer sa11a_3_student6 = createStudentAnswer(student6, pa11a_3, "Limits are fundamental in calculus as they are used to define derivatives, integrals, and continuity. They help in understanding the behavior of functions at specific points or as inputs approach infinity.");
        addStudentAnswerToProblemAnswer(pa11a_3, sa11a_3_student6);

        StudentAnswer sa11a_4_student6 = createStudentAnswer(student6, pa11a_4, "A one-sided limit is the value that a function approaches as the input approaches a certain point from one side (either the left or the right). It is denoted as lim(x→c⁺) f(x) for the right-hand limit and lim(x→c⁻) f(x) for the left-hand limit.");
        addStudentAnswerToProblemAnswer(pa11a_4, sa11a_4_student6);

        StudentAnswer sa11a_5_student6 = createStudentAnswer(student6, pa11a_5, "An infinite limit describes the behavior of a function as it increases or decreases without bound as the input approaches a certain value. It is denoted as lim(x→c) f(x) = ±∞.");
        addStudentAnswerToProblemAnswer(pa11a_5, sa11a_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa11b_1_student5 = createStudentAnswer(student5, pa11b_1, "A derivative measures how a function changes as its input changes. It represents the rate of change or slope of the function at a given point.");
        addStudentAnswerToProblemAnswer(pa11b_1, sa11b_1_student5);

        StudentAnswer sa11b_2_student5 = createStudentAnswer(student5, pa11b_2, "The power rule for differentiation states that if f(x) = x^n, then the derivative f'(x) = n*x^(n-1).");
        addStudentAnswerToProblemAnswer(pa11b_2, sa11b_2_student5);

        StudentAnswer sa11b_3_student5 = createStudentAnswer(student5, pa11b_3, "The product rule for differentiation states that if f(x) = u(x) * v(x), then the derivative f'(x) = u'(x) * v(x) + u(x) * v'(x).");
        addStudentAnswerToProblemAnswer(pa11b_3, sa11b_3_student5);

        StudentAnswer sa11b_4_student5 = createStudentAnswer(student5, pa11b_4, "The quotient rule for differentiation states that if f(x) = u(x) / v(x), then the derivative f'(x) = (u'(x) * v(x) - u(x) * v'(x)) / (v(x))^2.");
        addStudentAnswerToProblemAnswer(pa11b_4, sa11b_4_student5);

        StudentAnswer sa11b_5_student5 = createStudentAnswer(student5, pa11b_5, "The chain rule for differentiation states that if a function y = f(g(x)), then the derivative dy/dx = f'(g(x)) * g'(x).");
        addStudentAnswerToProblemAnswer(pa11b_5, sa11b_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa11b_1_student6 = createStudentAnswer(student6, pa11b_1, "A derivative measures how a function changes as its input changes. It represents the rate of change or slope of the function at a given point.");
        addStudentAnswerToProblemAnswer(pa11b_1, sa11b_1_student6);

        StudentAnswer sa11b_2_student6 = createStudentAnswer(student6, pa11b_2, "The power rule for differentiation states that if f(x) = x^n, then the derivative f'(x) = n*x^(n-1).");
        addStudentAnswerToProblemAnswer(pa11b_2, sa11b_2_student6);

        StudentAnswer sa11b_3_student6 = createStudentAnswer(student6, pa11b_3, "The product rule for differentiation states that if f(x) = u(x) * v(x), then the derivative f'(x) = u'(x) * v(x) + u(x) * v'(x).");
        addStudentAnswerToProblemAnswer(pa11b_3, sa11b_3_student6);

        StudentAnswer sa11b_4_student6 = createStudentAnswer(student6, pa11b_4, "The quotient rule for differentiation states that if f(x) = u(x) / v(x), then the derivative f'(x) = (u'(x) * v(x) - u(x) * v'(x)) / (v(x))^2.");
        addStudentAnswerToProblemAnswer(pa11b_4, sa11b_4_student6);

        StudentAnswer sa11b_5_student6 = createStudentAnswer(student6, pa11b_5, "The chain rule for differentiation states that if a function y = f(g(x)), then the derivative dy/dx = f'(g(x)) * g'(x).");
        addStudentAnswerToProblemAnswer(pa11b_5, sa11b_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa11c_1_student5 = createStudentAnswer(student5, pa11c_1, "An integral is a mathematical concept that represents the accumulation of quantities. It is used to calculate areas, volumes, and other quantities that accumulate over a region.");
        addStudentAnswerToProblemAnswer(pa11c_1, sa11c_1_student5);

        StudentAnswer sa11c_2_student5 = createStudentAnswer(student5, pa11c_2, "The Fundamental Theorem of Calculus links differentiation and integration. It states that the definite integral of a function over an interval is equal to the difference of its antiderivative evaluated at the endpoints of the interval.");
        addStudentAnswerToProblemAnswer(pa11c_2, sa11c_2_student5);

        StudentAnswer sa11c_3_student5 = createStudentAnswer(student5, pa11c_3, "The two types of integrals are definite integrals and indefinite integrals. Definite integrals have specific limits of integration and calculate a numerical value, while indefinite integrals represent a family of functions and include a constant of integration (C).");
        addStudentAnswerToProblemAnswer(pa11c_3, sa11c_3_student5);

        StudentAnswer sa11c_4_student5 = createStudentAnswer(student5, pa11c_4, "The method of substitution in integration is used to simplify integrals by substituting a part of the integrand with a new variable. It often makes the integral easier to evaluate.");
        addStudentAnswerToProblemAnswer(pa11c_4, sa11c_4_student5);

        StudentAnswer sa11c_5_student5 = createStudentAnswer(student5, pa11c_5, "Integration by parts is a technique used to integrate the product of two functions. It is based on the product rule of differentiation and is given by the formula: ∫u dv = uv - ∫v du.");
        addStudentAnswerToProblemAnswer(pa11c_5, sa11c_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa11c_1_student6 = createStudentAnswer(student6, pa11c_1, "An integral is a mathematical concept that represents the accumulation of quantities. It is used to calculate areas, volumes, and other quantities that accumulate over a region.");
        addStudentAnswerToProblemAnswer(pa11c_1, sa11c_1_student6);

        StudentAnswer sa11c_2_student6 = createStudentAnswer(student6, pa11c_2, "The Fundamental Theorem of Calculus links differentiation and integration. It states that the definite integral of a function over an interval is equal to the difference of its antiderivative evaluated at the endpoints of the interval.");
        addStudentAnswerToProblemAnswer(pa11c_2, sa11c_2_student6);

        StudentAnswer sa11c_3_student6 = createStudentAnswer(student6, pa11c_3, "The two types of integrals are definite integrals and indefinite integrals. Definite integrals have specific limits of integration and calculate a numerical value, while indefinite integrals represent a family of functions and include a constant of integration (C).");
        addStudentAnswerToProblemAnswer(pa11c_3, sa11c_3_student6);

        StudentAnswer sa11c_4_student6 = createStudentAnswer(student6, pa11c_4, "The method of substitution in integration is used to simplify integrals by substituting a part of the integrand with a new variable. It often makes the integral easier to evaluate.");
        addStudentAnswerToProblemAnswer(pa11c_4, sa11c_4_student6);

        StudentAnswer sa11c_5_student6 = createStudentAnswer(student6, pa11c_5, "Integration by parts is a technique used to integrate the product of two functions. It is based on the product rule of differentiation and is given by the formula: ∫u dv = uv - ∫v du.");
        addStudentAnswerToProblemAnswer(pa11c_5, sa11c_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa11d_1_student5 = createStudentAnswer(student5, pa11d_1, "In physics, calculus is used to model and analyze the motion of objects, calculate forces and energy, and describe the behavior of physical systems. Examples include finding the velocity and acceleration of objects and solving differential equations.");
        addStudentAnswerToProblemAnswer(pa11d_1, sa11d_1_student5);

        StudentAnswer sa11d_2_student5 = createStudentAnswer(student5, pa11d_2, "In engineering, calculus is used to design and analyze systems and structures, optimize processes, and solve problems related to fluid dynamics, thermodynamics, and electrical circuits. Examples include calculating stress and strain in materials and modeling fluid flow.");
        addStudentAnswerToProblemAnswer(pa11d_2, sa11d_2_student5);

        StudentAnswer sa11d_3_student5 = createStudentAnswer(student5, pa11d_3, "In economics, calculus is used to model and analyze economic behavior, optimize production and consumption, and study changes in economic variables. Examples include finding marginal cost and revenue, and solving optimization problems in resource allocation.");
        addStudentAnswerToProblemAnswer(pa11d_3, sa11d_3_student5);

        StudentAnswer sa11d_4_student5 = createStudentAnswer(student5, pa11d_4, "In biology, calculus is used to model population growth, analyze rates of biochemical reactions, and understand the dynamics of ecosystems. Examples include modeling the spread of diseases and calculating the rate of enzyme reactions.");
        addStudentAnswerToProblemAnswer(pa11d_4, sa11d_4_student5);

        StudentAnswer sa11d_5_student5 = createStudentAnswer(student5, pa11d_5, "In finance, calculus is used to model and analyze financial markets, optimize investment strategies, and calculate the present value of cash flows. Examples include pricing options and other derivatives and solving optimization problems in portfolio management.");
        addStudentAnswerToProblemAnswer(pa11d_5, sa11d_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa11d_1_student6 = createStudentAnswer(student6, pa11d_1, "In physics, calculus is used to model and analyze the motion of objects, calculate forces and energy, and describe the behavior of physical systems. Examples include finding the velocity and acceleration of objects and solving differential equations.");
        addStudentAnswerToProblemAnswer(pa11d_1, sa11d_1_student6);

        StudentAnswer sa11d_2_student6 = createStudentAnswer(student6, pa11d_2, "In engineering, calculus is used to design and analyze systems and structures, optimize processes, and solve problems related to fluid dynamics, thermodynamics, and electrical circuits. Examples include calculating stress and strain in materials and modeling fluid flow.");
        addStudentAnswerToProblemAnswer(pa11d_2, sa11d_2_student6);

        StudentAnswer sa11d_3_student6 = createStudentAnswer(student6, pa11d_3, "In economics, calculus is used to model and analyze economic behavior, optimize production and consumption, and study changes in economic variables. Examples include finding marginal cost and revenue, and solving optimization problems in resource allocation.");
        addStudentAnswerToProblemAnswer(pa11d_3, sa11d_3_student6);

        StudentAnswer sa11d_4_student6 = createStudentAnswer(student6, pa11d_4, "In biology, calculus is used to model population growth, analyze rates of biochemical reactions, and understand the dynamics of ecosystems. Examples include modeling the spread of diseases and calculating the rate of enzyme reactions.");
        addStudentAnswerToProblemAnswer(pa11d_4, sa11d_4_student6);

        StudentAnswer sa11d_5_student6 = createStudentAnswer(student6, pa11d_5, "In finance, calculus is used to model and analyze financial markets, optimize investment strategies, and calculate the present value of cash flows. Examples include pricing options and other derivatives and solving optimization problems in portfolio management.");
        addStudentAnswerToProblemAnswer(pa11d_5, sa11d_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa12a_1_student5 = createStudentAnswer(student5, pa12a_1, "A vector is a quantity that has both magnitude and direction. It can be represented graphically by an arrow or algebraically by coordinates.");
        addStudentAnswerToProblemAnswer(pa12a_1, sa12a_1_student5);

        StudentAnswer sa12a_2_student5 = createStudentAnswer(student5, pa12a_2, "Vectors are added by adding their corresponding components. If A = (a1, a2, a3) and B = (b1, b2, b3), then A + B = (a1 + b1, a2 + b2, a3 + b3).");
        addStudentAnswerToProblemAnswer(pa12a_2, sa12a_2_student5);

        StudentAnswer sa12a_3_student5 = createStudentAnswer(student5, pa12a_3, "Scalar multiplication involves multiplying a vector by a scalar (a real number). If k is a scalar and A = (a1, a2, a3), then kA = (k*a1, k*a2, k*a3).");
        addStudentAnswerToProblemAnswer(pa12a_3, sa12a_3_student5);

        StudentAnswer sa12a_4_student5 = createStudentAnswer(student5, pa12a_4, "The dot product of two vectors A and B is a scalar obtained by multiplying their corresponding components and summing the results. If A = (a1, a2, a3) and B = (b1, b2, b3), then A ⋅ B = a1*b1 + a2*b2 + a3*b3.");
        addStudentAnswerToProblemAnswer(pa12a_4, sa12a_4_student5);

        StudentAnswer sa12a_5_student5 = createStudentAnswer(student5, pa12a_5, "The cross product of two vectors A and B is a vector that is perpendicular to both A and B. If A = (a1, a2, a3) and B = (b1, b2, b3), then A × B = (a2*b3 - a3*b2, a3*b1 - a1*b3, a1*b2 - a2*b1).");
        addStudentAnswerToProblemAnswer(pa12a_5, sa12a_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa12a_1_student6 = createStudentAnswer(student6, pa12a_1, "A vector is a quantity that has both magnitude and direction. It can be represented graphically by an arrow or algebraically by coordinates.");
        addStudentAnswerToProblemAnswer(pa12a_1, sa12a_1_student6);

        StudentAnswer sa12a_2_student6 = createStudentAnswer(student6, pa12a_2, "Vectors are added by adding their corresponding components. If A = (a1, a2, a3) and B = (b1, b2, b3), then A + B = (a1 + b1, a2 + b2, a3 + b3).");
        addStudentAnswerToProblemAnswer(pa12a_2, sa12a_2_student6);

        StudentAnswer sa12a_3_student6 = createStudentAnswer(student6, pa12a_3, "Scalar multiplication involves multiplying a vector by a scalar (a real number). If k is a scalar and A = (a1, a2, a3), then kA = (k*a1, k*a2, k*a3).");
        addStudentAnswerToProblemAnswer(pa12a_3, sa12a_3_student6);

        StudentAnswer sa12a_4_student6 = createStudentAnswer(student6, pa12a_4, "The dot product of two vectors A and B is a scalar obtained by multiplying their corresponding components and summing the results. If A = (a1, a2, a3) and B = (b1, b2, b3), then A ⋅ B = a1*b1 + a2*b2 + a3*b3.");
        addStudentAnswerToProblemAnswer(pa12a_4, sa12a_4_student6);

        StudentAnswer sa12a_5_student6 = createStudentAnswer(student6, pa12a_5, "The cross product of two vectors A and B is a vector that is perpendicular to both A and B. If A = (a1, a2, a3) and B = (b1, b2, b3), then A × B = (a2*b3 - a3*b2, a3*b1 - a1*b3, a1*b2 - a2*b1).");
        addStudentAnswerToProblemAnswer(pa12a_5, sa12a_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa12b_1_student5 = createStudentAnswer(student5, pa12b_1, "A matrix is a rectangular array of numbers arranged in rows and columns. It is used to represent linear transformations and solve systems of linear equations.");
        addStudentAnswerToProblemAnswer(pa12b_1, sa12b_1_student5);

        StudentAnswer sa12b_2_student5 = createStudentAnswer(student5, pa12b_2, "Matrices are added by adding their corresponding elements. If A and B are matrices of the same dimension, then the sum C = A + B is obtained by adding each corresponding element of A and B.");
        addStudentAnswerToProblemAnswer(pa12b_2, sa12b_2_student5);

        StudentAnswer sa12b_3_student5 = createStudentAnswer(student5, pa12b_3, "Matrix multiplication involves multiplying rows of the first matrix by columns of the second matrix and summing the products. If A is an m×n matrix and B is an n×p matrix, the product AB is an m×p matrix.");
        addStudentAnswerToProblemAnswer(pa12b_3, sa12b_3_student5);

        StudentAnswer sa12b_4_student5 = createStudentAnswer(student5, pa12b_4, "The identity matrix is a square matrix with ones on the diagonal and zeros elsewhere. It acts as the multiplicative identity in matrix multiplication, meaning AI = IA = A for any matrix A.");
        addStudentAnswerToProblemAnswer(pa12b_4, sa12b_4_student5);

        StudentAnswer sa12b_5_student5 = createStudentAnswer(student5, pa12b_5, "The inverse of a matrix A is a matrix B such that AB = BA = I, where I is the identity matrix. Not all matrices have inverses; only square matrices that are non-singular (determinant is non-zero) have inverses.");
        addStudentAnswerToProblemAnswer(pa12b_5, sa12b_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa12b_1_student6 = createStudentAnswer(student6, pa12b_1, "A matrix is a rectangular array of numbers arranged in rows and columns. It is used to represent linear transformations and solve systems of linear equations.");
        addStudentAnswerToProblemAnswer(pa12b_1, sa12b_1_student6);

        StudentAnswer sa12b_2_student6 = createStudentAnswer(student6, pa12b_2, "Matrices are added by adding their corresponding elements. If A and B are matrices of the same dimension, then the sum C = A + B is obtained by adding each corresponding element of A and B.");
        addStudentAnswerToProblemAnswer(pa12b_2, sa12b_2_student6);

        StudentAnswer sa12b_3_student6 = createStudentAnswer(student6, pa12b_3, "Matrix multiplication involves multiplying rows of the first matrix by columns of the second matrix and summing the products. If A is an m×n matrix and B is an n×p matrix, the product AB is an m×p matrix.");
        addStudentAnswerToProblemAnswer(pa12b_3, sa12b_3_student6);

        StudentAnswer sa12b_4_student6 = createStudentAnswer(student6, pa12b_4, "The identity matrix is a square matrix with ones on the diagonal and zeros elsewhere. It acts as the multiplicative identity in matrix multiplication, meaning AI = IA = A for any matrix A.");
        addStudentAnswerToProblemAnswer(pa12b_4, sa12b_4_student6);

        StudentAnswer sa12b_5_student6 = createStudentAnswer(student6, pa12b_5, "The inverse of a matrix A is a matrix B such that AB = BA = I, where I is the identity matrix. Not all matrices have inverses; only square matrices that are non-singular (determinant is non-zero) have inverses.");
        addStudentAnswerToProblemAnswer(pa12b_5, sa12b_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa12c_1_student5 = createStudentAnswer(student5, pa12c_1, "A determinant is a scalar value that can be computed from the elements of a square matrix. It provides important properties of the matrix, such as whether it is invertible.");
        addStudentAnswerToProblemAnswer(pa12c_1, sa12c_1_student5);

        StudentAnswer sa12c_2_student5 = createStudentAnswer(student5, pa12c_2, "For a 2x2 matrix A = [[a, b], [c, d]], the determinant is det(A) = ad - bc.");
        addStudentAnswerToProblemAnswer(pa12c_2, sa12c_2_student5);

        StudentAnswer sa12c_3_student5 = createStudentAnswer(student5, pa12c_3, "For a 3x3 matrix A = [[a, b, c], [d, e, f], [g, h, i]], the determinant is det(A) = a(ei - fh) - b(di - fg) + c(dh - eg).");
        addStudentAnswerToProblemAnswer(pa12c_3, sa12c_3_student5);

        StudentAnswer sa12c_4_student5 = createStudentAnswer(student5, pa12c_4, "Properties of determinants include: det(AB) = det(A)det(B), det(A^T) = det(A), det(cA) = c^n det(A) for an nxn matrix, and a matrix is invertible if and only if its determinant is non-zero.");
        addStudentAnswerToProblemAnswer(pa12c_4, sa12c_4_student5);

        StudentAnswer sa12c_5_student5 = createStudentAnswer(student5, pa12c_5, "The cofactor expansion, also known as Laplace expansion, is a method for calculating the determinant of an nxn matrix by expanding along a row or column and using the minors and cofactors.");
        addStudentAnswerToProblemAnswer(pa12c_5, sa12c_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa12c_1_student6 = createStudentAnswer(student6, pa12c_1, "A determinant is a scalar value that can be computed from the elements of a square matrix. It provides important properties of the matrix, such as whether it is invertible.");
        addStudentAnswerToProblemAnswer(pa12c_1, sa12c_1_student6);

        StudentAnswer sa12c_2_student6 = createStudentAnswer(student6, pa12c_2, "For a 2x2 matrix A = [[a, b], [c, d]], the determinant is det(A) = ad - bc.");
        addStudentAnswerToProblemAnswer(pa12c_2, sa12c_2_student6);

        StudentAnswer sa12c_3_student6 = createStudentAnswer(student6, pa12c_3, "For a 3x3 matrix A = [[a, b, c], [d, e, f], [g, h, i]], the determinant is det(A) = a(ei - fh) - b(di - fg) + c(dh - eg).");
        addStudentAnswerToProblemAnswer(pa12c_3, sa12c_3_student6);

        StudentAnswer sa12c_4_student6 = createStudentAnswer(student6, pa12c_4, "Properties of determinants include: det(AB) = det(A)det(B), det(A^T) = det(A), det(cA) = c^n det(A) for an nxn matrix, and a matrix is invertible if and only if its determinant is non-zero.");
        addStudentAnswerToProblemAnswer(pa12c_4, sa12c_4_student6);

        StudentAnswer sa12c_5_student6 = createStudentAnswer(student6, pa12c_5, "The cofactor expansion, also known as Laplace expansion, is a method for calculating the determinant of an nxn matrix by expanding along a row or column and using the minors and cofactors.");
        addStudentAnswerToProblemAnswer(pa12c_5, sa12c_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa12d_1_student5 = createStudentAnswer(student5, pa12d_1, "An eigenvalue is a scalar value associated with a matrix that, when multiplied by its corresponding eigenvector, yields the same eigenvector. It is a special number that provides insight into the matrix's properties.");
        addStudentAnswerToProblemAnswer(pa12d_1, sa12d_1_student5);

        StudentAnswer sa12d_2_student5 = createStudentAnswer(student5, pa12d_2, "To calculate the eigenvalues of a matrix A, solve the characteristic equation det(A - λI) = 0, where λ represents the eigenvalues, I is the identity matrix, and det denotes the determinant.");
        addStudentAnswerToProblemAnswer(pa12d_2, sa12d_2_student5);

        StudentAnswer sa12d_3_student5 = createStudentAnswer(student5, pa12d_3, "The characteristic polynomial of a matrix A is the polynomial obtained by computing the determinant of (A - λI). The roots of this polynomial are the eigenvalues of the matrix.");
        addStudentAnswerToProblemAnswer(pa12d_3, sa12d_3_student5);

        StudentAnswer sa12d_4_student5 = createStudentAnswer(student5, pa12d_4, "The geometric multiplicity of an eigenvalue is the number of linearly independent eigenvectors associated with it. It represents the dimension of the eigenspace corresponding to that eigenvalue.");
        addStudentAnswerToProblemAnswer(pa12d_4, sa12d_4_student5);

        StudentAnswer sa12d_5_student5 = createStudentAnswer(student5, pa12d_5, "The algebraic multiplicity of an eigenvalue is the number of times that eigenvalue appears as a root of the characteristic polynomial. It can be equal to or greater than the geometric multiplicity.");
        addStudentAnswerToProblemAnswer(pa12d_5, sa12d_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa12d_1_student6 = createStudentAnswer(student6, pa12d_1, "An eigenvalue is a scalar value associated with a matrix that, when multiplied by its corresponding eigenvector, yields the same eigenvector. It is a special number that provides insight into the matrix's properties.");
        addStudentAnswerToProblemAnswer(pa12d_1, sa12d_1_student6);

        StudentAnswer sa12d_2_student6 = createStudentAnswer(student6, pa12d_2, "To calculate the eigenvalues of a matrix A, solve the characteristic equation det(A - λI) = 0, where λ represents the eigenvalues, I is the identity matrix, and det denotes the determinant.");
        addStudentAnswerToProblemAnswer(pa12d_2, sa12d_2_student6);

        StudentAnswer sa12d_3_student6 = createStudentAnswer(student6, pa12d_3, "The characteristic polynomial of a matrix A is the polynomial obtained by computing the determinant of (A - λI). The roots of this polynomial are the eigenvalues of the matrix.");
        addStudentAnswerToProblemAnswer(pa12d_3, sa12d_3_student6);

        StudentAnswer sa12d_4_student6 = createStudentAnswer(student6, pa12d_4, "The geometric multiplicity of an eigenvalue is the number of linearly independent eigenvectors associated with it. It represents the dimension of the eigenspace corresponding to that eigenvalue.");
        addStudentAnswerToProblemAnswer(pa12d_4, sa12d_4_student6);

        StudentAnswer sa12d_5_student6 = createStudentAnswer(student6, pa12d_5, "The algebraic multiplicity of an eigenvalue is the number of times that eigenvalue appears as a root of the characteristic polynomial. It can be equal to or greater than the geometric multiplicity.");
        addStudentAnswerToProblemAnswer(pa12d_5, sa12d_5_student6);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa12e_1_student5 = createStudentAnswer(student5, pa12e_1, "An eigenvector is a non-zero vector that changes only in scale (not direction) when a linear transformation is applied to it. It is associated with a specific eigenvalue.");
        addStudentAnswerToProblemAnswer(pa12e_1, sa12e_1_student5);

        StudentAnswer sa12e_2_student5 = createStudentAnswer(student5, pa12e_2, "Eigenvectors of a matrix A are found by solving the equation (A - λI)x = 0, where λ is an eigenvalue, I is the identity matrix, and x is the eigenvector.");
        addStudentAnswerToProblemAnswer(pa12e_2, sa12e_2_student5);

        StudentAnswer sa12e_3_student5 = createStudentAnswer(student5, pa12e_3, "Eigenvalues are the scalars associated with eigenvectors. If x is an eigenvector of matrix A with eigenvalue λ, then Ax = λx.");
        addStudentAnswerToProblemAnswer(pa12e_3, sa12e_3_student5);

        StudentAnswer sa12e_4_student5 = createStudentAnswer(student5, pa12e_4, "An eigenspace is the set of all eigenvectors corresponding to a particular eigenvalue, along with the zero vector. It forms a subspace of the vector space.");
        addStudentAnswerToProblemAnswer(pa12e_4, sa12e_4_student5);

        StudentAnswer sa12e_5_student5 = createStudentAnswer(student5, pa12e_5, "Matrix diagonalization involves expressing a matrix A as PDP^(-1), where P is a matrix of eigenvectors, D is a diagonal matrix of eigenvalues, and P^(-1) is the inverse of P.");
        addStudentAnswerToProblemAnswer(pa12e_5, sa12e_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa12e_1_student6 = createStudentAnswer(student6, pa12e_1, "An eigenvector is a non-zero vector that changes only in scale (not direction) when a linear transformation is applied to it. It is associated with a specific eigenvalue.");
        addStudentAnswerToProblemAnswer(pa12e_1, sa12e_1_student6);

        StudentAnswer sa12e_2_student6 = createStudentAnswer(student6, pa12e_2, "Eigenvectors of a matrix A are found by solving the equation (A - λI)x = 0, where λ is an eigenvalue, I is the identity matrix, and x is the eigenvector.");
        addStudentAnswerToProblemAnswer(pa12e_2, sa12e_2_student6);

        StudentAnswer sa12e_3_student6 = createStudentAnswer(student6, pa12e_3, "Eigenvalues are the scalars associated with eigenvectors. If x is an eigenvector of matrix A with eigenvalue λ, then Ax = λx.");
        addStudentAnswerToProblemAnswer(pa12e_3, sa12e_3_student6);

        StudentAnswer sa12e_4_student6 = createStudentAnswer(student6, pa12e_4, "An eigenspace is the set of all eigenvectors corresponding to a particular eigenvalue, along with the zero vector. It forms a subspace of the vector space.");
        addStudentAnswerToProblemAnswer(pa12e_4, sa12e_4_student6);

        StudentAnswer sa12e_5_student6 = createStudentAnswer(student6, pa12e_5, "Matrix diagonalization involves expressing a matrix A as PDP^(-1), where P is a matrix of eigenvectors, D is a diagonal matrix of eigenvalues, and P^(-1) is the inverse of P.");
        addStudentAnswerToProblemAnswer(pa12e_5, sa12e_5_student6);


        // Creating submission for student5 with student answers for 9a
        Submission submission9a_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9a_1_student5, sa9a_2_student5, sa9a_3_student5, sa9a_4_student5, sa9a_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission9a_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9a_5);
        }

// Creating submission for student6 with student answers for 9a
        Submission submission9a_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9a_1_student6, sa9a_2_student6, sa9a_3_student6, sa9a_4_student6, sa9a_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission9a_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9a_6);
        }
// Creating submission for student5 with student answers for 9b
        Submission submission9b_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9b_1_student5, sa9b_2_student5, sa9b_3_student5, sa9b_4_student5, sa9b_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission9b_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9b_5);
        }

// Creating submission for student6 with student answers for 9b
        Submission submission9b_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9b_1_student6, sa9b_2_student6, sa9b_3_student6, sa9b_4_student6, sa9b_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission9b_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9b_6);
        }
// Creating submission for student5 with student answers for 9c
        Submission submission9c_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9c_1_student5, sa9c_2_student5, sa9c_3_student5, sa9c_4_student5, sa9c_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission9c_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9c_5);
        }

// Creating submission for student6 with student answers for 9c
        Submission submission9c_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9c_1_student6, sa9c_2_student6, sa9c_3_student6, sa9c_4_student6, sa9c_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission9c_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9c_6);
        }
// Creating submission for student5 with student answers for 10a
        Submission submission10a_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10a_1_student5, sa10a_2_student5, sa10a_3_student5, sa10a_4_student5, sa10a_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10a_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10a_5);
        }

// Creating submission for student6 with student answers for 10a
        Submission submission10a_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10a_1_student6, sa10a_2_student6, sa10a_3_student6, sa10a_4_student6, sa10a_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10a_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10a_6);
        }
// Creating submission for student5 with student answers for 10b
        Submission submission10b_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10b_1_student5, sa10b_2_student5, sa10b_3_student5, sa10b_4_student5, sa10b_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10b_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10b_5);
        }

// Creating submission for student6 with student answers for 10b
        Submission submission10b_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10b_1_student6, sa10b_2_student6, sa10b_3_student6, sa10b_4_student6, sa10b_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10b_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10b_6);
        }
// Creating submission for student5 with student answers for 10c
        Submission submission10c_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10c_1_student5, sa10c_2_student5, sa10c_3_student5, sa10c_4_student5, sa10c_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10c_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10c_5);
        }

// Creating submission for student6 with student answers for 10c
        Submission submission10c_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10c_1_student6, sa10c_2_student6, sa10c_3_student6, sa10c_4_student6, sa10c_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10c_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10c_6);
        }
// Creating submission for student5 with student answers for 10d
        Submission submission10d_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10d_1_student5, sa10d_2_student5, sa10d_3_student5, sa10d_4_student5, sa10d_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10d_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10d_5);
        }

// Creating submission for student6 with student answers for 10d
        Submission submission10d_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10d_1_student6, sa10d_2_student6, sa10d_3_student6, sa10d_4_student6, sa10d_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10d_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10d_6);
        }
// Creating submission for student5 with student answers for 11a
        Submission submission11a_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11a_1_student5, sa11a_2_student5, sa11a_3_student5, sa11a_4_student5, sa11a_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11a_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11a_5);
        }

// Creating submission for student6 with student answers for 11a
        Submission submission11a_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11a_1_student6, sa11a_2_student6, sa11a_3_student6, sa11a_4_student6, sa11a_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11a_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11a_6);
        }
// Creating submission for student5 with student answers for 11b
        Submission submission11b_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11b_1_student5, sa11b_2_student5, sa11b_3_student5, sa11b_4_student5, sa11b_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11b_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11b_5);
        }

// Creating submission for student6 with student answers for 11b
        Submission submission11b_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11b_1_student6, sa11b_2_student6, sa11b_3_student6, sa11b_4_student6, sa11b_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11b_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11b_6);
        }
// Creating submission for student5 with student answers for 11c
        Submission submission11c_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11c_1_student5, sa11c_2_student5, sa11c_3_student5, sa11c_4_student5, sa11c_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11c_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11c_5);
        }

// Creating submission for student6 with student answers for 11c
        Submission submission11c_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11c_1_student6, sa11c_2_student6, sa11c_3_student6, sa11c_4_student6, sa11c_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11c_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11c_6);
        }
// Creating submission for student5 with student answers for 11d
        Submission submission11d_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11d_1_student5, sa11d_2_student5, sa11d_3_student5, sa11d_4_student5, sa11d_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11d_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11d_5);
        }

// Creating submission for student6 with student answers for 11d
        Submission submission11d_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11d_1_student6, sa11d_2_student6, sa11d_3_student6, sa11d_4_student6, sa11d_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11d_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11d_6);
        }
// Creating submission for student5 with student answers for 12a
        Submission submission12a_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12a_1_student5, sa12a_2_student5, sa12a_3_student5, sa12a_4_student5, sa12a_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12a_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12a_5);
        }

// Creating submission for student6 with student answers for 12a
        Submission submission12a_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12a_1_student6, sa12a_2_student6, sa12a_3_student6, sa12a_4_student6, sa12a_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12a_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12a_6);
        }
// Creating submission for student5 with student answers for 12b
        Submission submission12b_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12b_1_student5, sa12b_2_student5, sa12b_3_student5, sa12b_4_student5, sa12b_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12b_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12b_5);
        }

// Creating submission for student6 with student answers for 12b
        Submission submission12b_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12b_1_student6, sa12b_2_student6, sa12b_3_student6, sa12b_4_student6, sa12b_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12b_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12b_6);
        }
// Creating submission for student5 with student answers for 12c
        Submission submission12c_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12c_1_student5, sa12c_2_student5, sa12c_3_student5, sa12c_4_student5, sa12c_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12c_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12c_5);
        }

// Creating submission for student6 with student answers for 12c
        Submission submission12c_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12c_1_student6, sa12c_2_student6, sa12c_3_student6, sa12c_4_student6, sa12c_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12c_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12c_6);
        }
// Creating submission for student5 with student answers for 12d
        Submission submission12d_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12d_1_student5, sa12d_2_student5, sa12d_3_student5, sa12d_4_student5, sa12d_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12d_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12d_5);
        }

// Creating submission for student6 with student answers for 12d
        Submission submission12d_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12d_1_student6, sa12d_2_student6, sa12d_3_student6, sa12d_4_student6, sa12d_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12d_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12d_6);
        }
// Creating submission for student5 with student answers for 12e
        Submission submission12e_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12e_1_student5, sa12e_2_student5, sa12e_3_student5, sa12e_4_student5, sa12e_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12e_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12e_5);
        }

// Creating submission for student6 with student answers for 12e
        Submission submission12e_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12e_1_student6, sa12e_2_student6, sa12e_3_student6, sa12e_4_student6, sa12e_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12e_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12e_6);
        }

        Grade grade9a_5 = createGrade(86.7, student5, faculty4, course9, submission9a_5);
        Grade grade9a_6 = createGrade(88.5, student6, faculty4, course9, submission9a_6);
        Grade grade9b_5 = createGrade(89.1, student5, faculty4, course9, submission9b_5);
        Grade grade9b_6 = createGrade(87.8, student6, faculty4, course9, submission9b_6);
        Grade grade9c_5 = createGrade(85.9, student5, faculty4, course9, submission9c_5);
        Grade grade9c_6 = createGrade(88.2, student6, faculty4, course9, submission9c_6);

        Grade grade10a_5 = createGrade(88.6, student5, faculty5, course10, submission10a_5);
        Grade grade10a_6 = createGrade(87.2, student6, faculty5, course10, submission10a_6);
        Grade grade10b_5 = createGrade(89.7, student5, faculty5, course10, submission10b_5);
        Grade grade10b_6 = createGrade(86.5, student6, faculty5, course10, submission10b_6);
        Grade grade10c_5 = createGrade(87.8, student5, faculty5, course10, submission10c_5);
        Grade grade10c_6 = createGrade(88.9, student6, faculty5, course10, submission10c_6);
        Grade grade10d_5 = createGrade(89.3, student5, faculty5, course10, submission10d_5);
        Grade grade10d_6 = createGrade(86.8, student6, faculty5, course10, submission10d_6);

        Grade grade11a_5 = createGrade(86.4, student5, faculty1, course11, submission11a_5);
        Grade grade11a_6 = createGrade(89.2, student6, faculty1, course11, submission11a_6);
        Grade grade11b_5 = createGrade(85.9, student5, faculty1, course11, submission11b_5);
        Grade grade11b_6 = createGrade(88.6, student6, faculty1, course11, submission11b_6);
        Grade grade11c_5 = createGrade(87.1, student5, faculty1, course11, submission11c_5);
        Grade grade11c_6 = createGrade(86.7, student6, faculty1, course11, submission11c_6);
        Grade grade11d_5 = createGrade(88.4, student5, faculty1, course11, submission11d_5);
        Grade grade11d_6 = createGrade(87.5, student6, faculty1, course11, submission11d_6);

        Grade grade12a_5 = createGrade(86.5, student5, faculty2, course12, submission12a_5);
        Grade grade12a_6 = createGrade(88.9, student6, faculty2, course12, submission12a_6);
        Grade grade12b_5 = createGrade(89.4, student5, faculty2, course12, submission12b_5);
        Grade grade12b_6 = createGrade(87.8, student6, faculty2, course12, submission12b_6);
        Grade grade12c_5 = createGrade(88.2, student5, faculty2, course12, submission12c_5);
        Grade grade12c_6 = createGrade(86.7, student6, faculty2, course12, submission12c_6);
        Grade grade12d_5 = createGrade(87.5, student5, faculty2, course12, submission12d_5);
        Grade grade12d_6 = createGrade(89.1, student6, faculty2, course12, submission12d_6);
        Grade grade12e_5 = createGrade(86.3, student5, faculty2, course12, submission12e_5);
        Grade grade12e_6 = createGrade(88.4, student6, faculty2, course12, submission12e_6);

        CourseGrade courseGrade9a_5 = createCourseGrade(student5, course9, 87.23, Arrays.asList(grade9a_5, grade9b_5, grade9c_5));
        CourseGrade courseGrade9a_6 = createCourseGrade(student6, course9, 88.17, Arrays.asList(grade9a_6, grade9b_6, grade9c_6));

        CourseGrade courseGrade10a_5 = createCourseGrade(student5, course10, 88.35, Arrays.asList(grade10a_5, grade10b_5, grade10c_5));
        CourseGrade courseGrade10a_6 = createCourseGrade(student6, course10, 87.35, Arrays.asList(grade10a_6, grade10b_6, grade10c_6));

        CourseGrade courseGrade11a_5 = createCourseGrade(student5, course11, 86.95, Arrays.asList(grade11a_5, grade11b_5, grade11c_5, grade11d_5));
        CourseGrade courseGrade11a_6 = createCourseGrade(student6, course11, 87.95, Arrays.asList(grade11a_6, grade11b_6, grade11c_6, grade11d_6));

        CourseGrade courseGrade12a_5 = createCourseGrade(student5, course12, 87.58, Arrays.asList(grade12a_5, grade12b_5, grade12c_5, grade12d_5, grade12e_5));
        CourseGrade courseGrade12a_6 = createCourseGrade(student6, course12, 88.18, Arrays.asList(grade12a_6, grade12b_6, grade12c_6, grade12d_6, grade12e_6));

        Feedback feedback9a_5 = createFeedback("Excellent work, student5!", submission9a_5);
        Feedback feedback9a_6 = createFeedback("Great effort, student6!", submission9a_6);

        Feedback feedback9b_5 = createFeedback("Impressive answers, student5.", submission9b_5);
        Feedback feedback9b_6 = createFeedback("Nice job, student6.", submission9b_6);

        Feedback feedback9c_5 = createFeedback("Well done on the answers, student5.", submission9c_5);
        Feedback feedback9c_6 = createFeedback("Good work, student6!", submission9c_6);

        Feedback feedback10a_5 = createFeedback("Great job, student5!", submission10a_5);
        Feedback feedback10a_6 = createFeedback("Excellent work, student6!", submission10a_6);

        Feedback feedback10b_5 = createFeedback("Well done, student5.", submission10b_5);
        Feedback feedback10b_6 = createFeedback("Nice job, student6!", submission10b_6);

        Feedback feedback10c_5 = createFeedback("Good answers, student5.", submission10c_5);
        Feedback feedback10c_6 = createFeedback("Strong performance, student6.", submission10c_6);

        Feedback feedback10d_5 = createFeedback("Impressive work, student5!", submission10d_5);
        Feedback feedback10d_6 = createFeedback("Great effort, student6!", submission10d_6);

        Feedback feedback11a_5 = createFeedback("Excellent work, student5!", submission11a_5);
        Feedback feedback11a_6 = createFeedback("Great effort, student6!", submission11a_6);

        Feedback feedback11b_5 = createFeedback("Impressive answers, student5.", submission11b_5);
        Feedback feedback11b_6 = createFeedback("Nice job, student6.", submission11b_6);

        Feedback feedback11c_5 = createFeedback("Well done on the answers, student5.", submission11c_5);
        Feedback feedback11c_6 = createFeedback("Good work, student6!", submission11c_6);

        Feedback feedback11d_5 = createFeedback("Great effort, student5!", submission11d_5);
        Feedback feedback11d_6 = createFeedback("Well done, student6!", submission11d_6);

        Feedback feedback12a_5 = createFeedback("Great job on the submission, student5!", submission12a_5);
        Feedback feedback12a_6 = createFeedback("Well done, student6!", submission12a_6);

        Feedback feedback12b_5 = createFeedback("Excellent effort, student5.", submission12b_5);
        Feedback feedback12b_6 = createFeedback("Nice work, student6.", submission12b_6);

        Feedback feedback12c_5 = createFeedback("Good answers, student5.", submission12c_5);
        Feedback feedback12c_6 = createFeedback("Strong performance, student6.", submission12c_6);

        Feedback feedback12d_5 = createFeedback("Well written, student5.", submission12d_5);
        Feedback feedback12d_6 = createFeedback("Great job, student6!", submission12d_6);

        Feedback feedback12e_5 = createFeedback("Impressive work, student5!", submission12e_5);
        Feedback feedback12e_6 = createFeedback("Solid submission, student6.", submission12e_6);

        course9.setGrades(Arrays.asList(grade9a_5, grade9a_6, grade9b_5, grade9b_6, grade9c_5, grade9c_6));
        course10.setGrades(Arrays.asList(grade10a_5, grade10a_6, grade10b_5, grade10b_6, grade10c_5, grade10c_6, grade10d_5, grade10d_6));
        course11.setGrades(Arrays.asList(grade11a_5, grade11a_6, grade11b_5, grade11b_6, grade11c_5, grade11c_6, grade11d_5, grade11d_6));
        course12.setGrades(Arrays.asList(grade12a_5, grade12a_6, grade12b_5, grade12b_6, grade12c_5, grade12c_6, grade12d_5, grade12d_6, grade12e_5, grade12e_6));

        createFacultyWithTest(faculty4, Arrays.asList(grade9a_5, grade9a_6, grade9b_5, grade9b_6, grade9c_5, grade9c_6), Arrays.asList(test9a, test9b, test9c));
        createFacultyWithTest(faculty5, Arrays.asList(grade10a_5, grade10a_6, grade10b_5, grade10b_6, grade10c_5, grade10c_6, grade10d_5, grade10d_6), Arrays.asList(test10a, test10b, test10c, test10d));
        createFacultyWithTest(faculty1, Arrays.asList(grade11a_5, grade11a_6, grade11b_5, grade11b_6, grade11c_5, grade11c_6, grade11d_5, grade11d_6), Arrays.asList(test11a, test11b, test11c, test11d));
        createFacultyWithTest(faculty2, Arrays.asList(grade12a_5, grade12a_6, grade12b_5, grade12b_6, grade12c_5, grade12c_6, grade12d_5, grade12d_6, grade12e_5, grade12e_6), Arrays.asList(test12a, test12b, test12c, test12d, test12e));


        course9.setCourseGrades(Arrays.asList(courseGrade9a_5, courseGrade9a_6));
        course10.setCourseGrades(Arrays.asList(courseGrade10a_5, courseGrade10a_6));
        course11.setCourseGrades(Arrays.asList(courseGrade11a_5, courseGrade11a_6));
        course12.setCourseGrades(Arrays.asList(courseGrade12a_5, courseGrade12a_6));

        linkSubmissionDetails(submission9a_5, student5, grade9a_5, feedback9a_5, Arrays.asList(sa9a_1_student5, sa9a_2_student5, sa9a_3_student5, sa9a_4_student5, sa9a_5_student5));
        linkSubmissionDetails(submission9a_6, student6, grade9a_6, feedback9a_6, Arrays.asList(sa9a_1_student6, sa9a_2_student6, sa9a_3_student6, sa9a_4_student6, sa9a_5_student6));
        linkSubmissionDetails(submission9b_5, student5, grade9b_5, feedback9b_5, Arrays.asList(sa9b_1_student5, sa9b_2_student5, sa9b_3_student5, sa9b_4_student5, sa9b_5_student5));
        linkSubmissionDetails(submission9b_6, student6, grade9b_6, feedback9b_6, Arrays.asList(sa9b_1_student6, sa9b_2_student6, sa9b_3_student6, sa9b_4_student6, sa9b_5_student6));
        linkSubmissionDetails(submission9c_5, student5, grade9c_5, feedback9c_5, Arrays.asList(sa9c_1_student5, sa9c_2_student5, sa9c_3_student5, sa9c_4_student5, sa9c_5_student5));
        linkSubmissionDetails(submission9c_6, student6, grade9c_6, feedback9c_6, Arrays.asList(sa9c_1_student6, sa9c_2_student6, sa9c_3_student6, sa9c_4_student6, sa9c_5_student6));

        linkSubmissionDetails(submission10a_5, student5, grade10a_5, feedback10a_5, Arrays.asList(sa10a_1_student5, sa10a_2_student5, sa10a_3_student5, sa10a_4_student5, sa10a_5_student5));
        linkSubmissionDetails(submission10a_6, student6, grade10a_6, feedback10a_6, Arrays.asList(sa10a_1_student6, sa10a_2_student6, sa10a_3_student6, sa10a_4_student6, sa10a_5_student6));
        linkSubmissionDetails(submission10b_5, student5, grade10b_5, feedback10b_5, Arrays.asList(sa10b_1_student5, sa10b_2_student5, sa10b_3_student5, sa10b_4_student5, sa10b_5_student5));
        linkSubmissionDetails(submission10b_6, student6, grade10b_6, feedback10b_6, Arrays.asList(sa10b_1_student6, sa10b_2_student6, sa10b_3_student6, sa10b_4_student6, sa10b_5_student6));
        linkSubmissionDetails(submission10c_5, student5, grade10c_5, feedback10c_5, Arrays.asList(sa10c_1_student5, sa10c_2_student5, sa10c_3_student5, sa10c_4_student5, sa10c_5_student5));
        linkSubmissionDetails(submission10c_6, student6, grade10c_6, feedback10c_6, Arrays.asList(sa10c_1_student6, sa10c_2_student6, sa10c_3_student6, sa10c_4_student6, sa10c_5_student6));
        linkSubmissionDetails(submission10d_5, student5, grade10d_5, feedback10d_5, Arrays.asList(sa10d_1_student5, sa10d_2_student5, sa10d_3_student5, sa10d_4_student5, sa10d_5_student5));
        linkSubmissionDetails(submission10d_6, student6, grade10d_6, feedback10d_6, Arrays.asList(sa10d_1_student6, sa10d_2_student6, sa10d_3_student6, sa10d_4_student6, sa10d_5_student6));

        linkSubmissionDetails(submission11a_5, student5, grade11a_5, feedback11a_5, Arrays.asList(sa11a_1_student5, sa11a_2_student5, sa11a_3_student5, sa11a_4_student5, sa11a_5_student5));
        linkSubmissionDetails(submission11a_6, student6, grade11a_6, feedback11a_6, Arrays.asList(sa11a_1_student6, sa11a_2_student6, sa11a_3_student6, sa11a_4_student6, sa11a_5_student6));
        linkSubmissionDetails(submission11b_5, student5, grade11b_5, feedback11b_5, Arrays.asList(sa11b_1_student5, sa11b_2_student5, sa11b_3_student5, sa11b_4_student5, sa11b_5_student5));
        linkSubmissionDetails(submission11b_6, student6, grade11b_6, feedback11b_6, Arrays.asList(sa11b_1_student6, sa11b_2_student6, sa11b_3_student6, sa11b_4_student6, sa11b_5_student6));
        linkSubmissionDetails(submission11c_5, student5, grade11c_5, feedback11c_5, Arrays.asList(sa11c_1_student5, sa11c_2_student5, sa11c_3_student5, sa11c_4_student5, sa11c_5_student5));
        linkSubmissionDetails(submission11c_6, student6, grade11c_6, feedback11c_6, Arrays.asList(sa11c_1_student6, sa11c_2_student6, sa11c_3_student6, sa11c_4_student6, sa11c_5_student6));
        linkSubmissionDetails(submission11d_5, student5, grade11d_5, feedback11d_5, Arrays.asList(sa11d_1_student5, sa11d_2_student5, sa11d_3_student5, sa11d_4_student5, sa11d_5_student5));
        linkSubmissionDetails(submission11d_6, student6, grade11d_6, feedback11d_6, Arrays.asList(sa11d_1_student6, sa11d_2_student6, sa11d_3_student6, sa11d_4_student6, sa11d_5_student6));

        linkSubmissionDetails(submission12a_5, student5, grade12a_5, feedback12a_5, Arrays.asList(sa12a_1_student5, sa12a_2_student5, sa12a_3_student5, sa12a_4_student5, sa12a_5_student5));
        linkSubmissionDetails(submission12a_6, student6, grade12a_6, feedback12a_6, Arrays.asList(sa12a_1_student6, sa12a_2_student6, sa12a_3_student6, sa12a_4_student6, sa12a_5_student6));
        linkSubmissionDetails(submission12b_5, student5, grade12b_5, feedback12b_5, Arrays.asList(sa12b_1_student5, sa12b_2_student5, sa12b_3_student5, sa12b_4_student5, sa12b_5_student5));
        linkSubmissionDetails(submission12b_6, student6, grade12b_6, feedback12b_6, Arrays.asList(sa12b_1_student6, sa12b_2_student6, sa12b_3_student6, sa12b_4_student6, sa12b_5_student6));
        linkSubmissionDetails(submission12c_5, student5, grade12c_5, feedback12c_5, Arrays.asList(sa12c_1_student5, sa12c_2_student5, sa12c_3_student5, sa12c_4_student5, sa12c_5_student5));
        linkSubmissionDetails(submission12c_6, student6, grade12c_6, feedback12c_6, Arrays.asList(sa12c_1_student6, sa12c_2_student6, sa12c_3_student6, sa12c_4_student6, sa12c_5_student6));
        linkSubmissionDetails(submission12d_5, student5, grade12d_5, feedback12d_5, Arrays.asList(sa12d_1_student5, sa12d_2_student5, sa12d_3_student5, sa12d_4_student5, sa12d_5_student5));
        linkSubmissionDetails(submission12d_6, student6, grade12d_6, feedback12d_6, Arrays.asList(sa12d_1_student6, sa12d_2_student6, sa12d_3_student6, sa12d_4_student6, sa12d_5_student6));
        linkSubmissionDetails(submission12e_5, student5, grade12e_5, feedback12e_5, Arrays.asList(sa12e_1_student5, sa12e_2_student5, sa12e_3_student5, sa12e_4_student5, sa12e_5_student5));
        linkSubmissionDetails(submission12e_6, student6, grade12e_6, feedback12e_6, Arrays.asList(sa12e_1_student6, sa12e_2_student6, sa12e_3_student6, sa12e_4_student6, sa12e_5_student6));

        syllabus9.setTests(Arrays.asList(test9a, test9b, test9c));
        syllabus10.setTests(Arrays.asList(test10a, test10b, test10c, test10d));
        syllabus11.setTests(Arrays.asList(test11a, test11b, test11c, test11d));
        syllabus12.setTests(Arrays.asList(test12a, test12b, test12c, test12d, test12e));

        studentTest(student5, Arrays.asList(grade9a_5, grade9b_5, grade9c_5, grade10a_5, grade10b_5, grade10c_5, grade10d_5, grade11a_5, grade11b_5, grade11c_5, grade11d_5, grade12a_5, grade12b_5, grade12c_5, grade12d_5, grade12e_5), Arrays.asList(courseGrade9a_5, courseGrade10a_5, courseGrade11a_5, courseGrade12a_5), Arrays.asList(test9a, test9b, test9c, test10a, test10b, test10c, test10d, test11a, test11b, test11c, test11d, test12a, test12b, test12c, test12d, test12e));
        studentTest(student6, Arrays.asList(grade9a_6, grade9b_6, grade9c_6, grade10a_6, grade10b_6, grade10c_6, grade10d_6, grade11a_6, grade11b_6, grade11c_6, grade11d_6, grade12a_6, grade12b_6, grade12c_6, grade12d_6, grade12e_6), Arrays.asList(courseGrade9a_6, courseGrade10a_6, courseGrade11a_6, courseGrade12a_6), Arrays.asList(test9a, test9b, test9c, test10a, test10b, test10c, test10d, test11a, test11b, test11c, test11d, test12a, test12b, test12c, test12d, test12e));

    }
}
