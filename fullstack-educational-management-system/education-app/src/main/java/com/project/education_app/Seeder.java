package com.project.education_app;

import com.project.education_app.entities.*;
import com.project.education_app.repos.AnnouncementRepo;
import com.project.education_app.repos.FacultyRepo;
import com.project.education_app.repos.GuardianRepo;
import com.project.education_app.repos.StudentRepo;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Data
public class Seeder implements CommandLineRunner {

    private final AnnouncementRepo announcementRepo;
    private final FacultyRepo facultyRepo;
    private final StudentRepo studentRepo;
    private final GuardianRepo guardianRepo;




    @Override
    public void run(String... args) throws Exception {


        Faculty faculty1 = createFaculty("nicholas", "jones", "Nicholas", "Jones", "jones@email.com", "(111) 111-1111", 31, "male", "100 street", false, true, 50000);
        Faculty faculty2 = createFaculty("jacob", "taylor", "Jacob", "Taylor", "taylor@email.com", "(222) 222-2222", 23, "male", "200 street", true, true, 90000);
        Faculty faculty3 = createFaculty("jayden", "willis", "Jayden", "Willis", "willis@email.com", "(333) 333-3333", 21, "female", "300 street", true, true, 90000);
        Faculty faculty4 = createFaculty("sue", "todd", "Sue", "Todd", "todd@email.com", "(444) 444-4444", 35, "female", "400 street", false, true, 40000);
        Faculty faculty5 = createFaculty("sarah", "sky", "Sarah", "Sky", "sky@email.com", "(555) 555-5555", 21, "female", "500 street", false, false, 30000);
        Faculty faculty6 = createFaculty("bob", "tyler", "Bob", "Tyler", "tyler@email.com", "(666) 666-6666", 41, "male", "600 street", false, true, 60000);

         Student student1 = createStudent("emma", "johnson", "Emma", "Johnson", "johnson@email.com", "(123) 456-7890", 18, "female", "100 blvd");
         Student student2 = createStudent("liam", "smith", "Liam", "Smith", "smith@email.com", "(234) 567-8901", 19, "male", "200 blvd");
         Student student3 = createStudent("olivia", "brown", "Olivia", "Brown", "brown@email.com", "(345) 678-9012", 19, "female", "300 blvd");
         Student student4 = createStudent("noah", "davis", "Noah", "Davis", "davis@email.com", "(456) 789-0123", 18, "male", "400 blvd");
         Student student5 = createStudent("ava", "wilson", "Ava", "Wilson", "wilson@email.com", "(567) 890-1234", 20, "female", "500 blvd");
         Student student6 = createStudent("sophia", "martinez", "Sophia", "Martinez", "martinez@email.com", "(678) 901-2345", 20, "female", "600 blvd");
         Student student7 = createStudent("mason", "anderson", "Mason", "Anderson", "anderson@email.com", "(789) 012-3456", 20, "male", "700 blvd");
         Student student8 = createStudent("luke", "rio", "Luke", "Rio", "rio@email.com", "(890) 123-4567", 19, "male", "800 blvd");
         Student student9 = createStudent("lucas", "thomas", "Lucas", "Thomas", "thomas@email.com", "(901) 234-5678", 21, "male", "900 blvd");
         Student student10 = createStudent("mia", "white", "Mia", "White", "white@email.com", "(012) 345-6789", 21, "female","1001 blvd");

        Guardian guardian1 = createGuardian("nolan", "everhart", "Nolan", "Everhart", "everhart@email.com", "(987) 654-3210", 54, "male", "100 blvd");
        Guardian guardian2 = createGuardian("helena", "marlowe", "Helena", "Marlowe", "marlowe@email.com", "(876) 543-2109", 52, "female", "100 blvd");
        Guardian guardian3 = createGuardian("samuel", "langdon", "Samuel", "Langdon", "langdon@email.com", "(765) 432-1098", 56, "male", "200 blvd");
        Guardian guardian4 = createGuardian("clara", "ridley", "Clara", "Ridley", "ridley@email.com", "(654) 321-0987", 46, "female", "200 blvd");
        Guardian guardian5 = createGuardian("jason", "whitaker", "Jason", "Whitaker", "whitaker@email.com", "(543) 210-9876", 50, "male", "300 blvd");
        Guardian guardian6 = createGuardian("evelyn", "sutherland", "Evelyn", "Sutherland", "sutherland@email.com", "(432) 109-8765", 45, "female", "300 blvd");
        Guardian guardian7 = createGuardian("brandon", "fenwick", "Brandon", "Fenwick", "fenwick@email.com", "(321) 098-7654", 55, "male", "400 blvd");
        Guardian guardian8 = createGuardian("fiona", "langley", "Fiona", "Langley", "langley@email.com", "(210) 987-6543", 48, "female", "400 blvd");
        Guardian guardian9 = createGuardian("miles", "torrence", "Miles", "Torrence", "torrence@email.com", "(109) 876-5432", 53, "male", "500 blvd");
        Guardian guardian10 = createGuardian("bridget", "leighton", "Bridget", "Leighton", "leighton@email.com", "(098) 765-4321", 44, "female", "500 blvd");
        Guardian guardian11 = createGuardian("riley", "pemberton", "Riley", "Pemberton", "pemberton@email.com", "(987) 654-3219", 57, "male", "600 blvd");
        Guardian guardian12 = createGuardian("eliza", "hastings", "Eliza", "Hastings", "hastings@email.com", "(876) 543-2108", 47, "female", "600 blvd");
        Guardian guardian13 = createGuardian("julian", "ashford", "Julian", "Ashford", "ashford@email.com", "(765) 432-1097", 49, "male", "700 blvd");
        Guardian guardian14 = createGuardian("hazel", "winslow", "Hazel", "Winslow", "winslow@email.com", "(654) 321-0986", 42, "female", "700 blvd");
        Guardian guardian15 = createGuardian("isaac", "thornfield", "Isaac", "Thornfield", "thornfield@email.com", "(543) 210-9875", 55, "male", "800 blvd");
        Guardian guardian16 = createGuardian("iris", "fairchild", "Iris", "Fairchild", "fairchild@email.com", "(432) 109-8764", 51, "female", "800 blvd");
        Guardian guardian17 = createGuardian("wesley", "fairchild", "Wesley", "Fairchild", "fairchild@email.com", "(321) 098-7653", 54, "male", "900 blvd");
        Guardian guardian18 = createGuardian("nora", "pembroke", "Nora", "Pembroke", "pembroke@email.com", "(210) 987-6542", 43, "female", "900 blvd");
        Guardian guardian19 = createGuardian("oliver", "winslow", "Oliver", "Winslow", "winslow@email.com", "(109) 876-5431", 58, "male", "1000 blvd");
        Guardian guardian20 = createGuardian("lillian", "ashford", "Lillian", "Ashford", "ashford@email.com", "(109) 876-5431", 58, "female", "1000 blvd");


        facultyRepo.saveAllAndFlush(Arrays.asList(faculty1,faculty2,faculty3,faculty4,faculty5,faculty6));
        studentRepo.saveAllAndFlush(Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10));
        guardianRepo.saveAllAndFlush(Arrays.asList(guardian1,guardian2,guardian3,guardian4,guardian5,guardian6,guardian7,guardian8,guardian9,
        guardian10,guardian11,guardian12,guardian13,guardian14,guardian15,guardian16,guardian17,guardian18,guardian19,guardian20));

        Announcement announcement1 = createAnnouncement("School Year Kickoff", "Welcome to the new school year! Let's make it a great one.", faculty1);
        Announcement announcement2 = createAnnouncement("Parent-Teacher Conferences", "Parent-Teacher conferences will be held next week. Please sign up for a time slot.", faculty2);
        Announcement announcement3 = createAnnouncement("Holiday Break", "The school will be closed for the holiday break from December 20th to January 4th.", faculty3);
        Announcement announcement4 = createAnnouncement("Science Fair", "The annual Science Fair will be held on March 15th. Start preparing your projects!", faculty4);
        Announcement announcement5 = createAnnouncement("Field Trip", "Our next field trip is scheduled for April 10th. Please return your permission slips by April 5th.", faculty5);
        Announcement announcement6 = createAnnouncement("Sports Day", "Sports Day is coming up on May 20th. Get ready for some fun and games!", faculty6);
        Announcement announcement7 = createAnnouncement("Graduation Ceremony", "Graduation Ceremony for seniors will be held on June 25th. Congratulations to all graduates!", faculty6);
        Announcement announcement8 = createAnnouncement("Summer Camp", "Sign up for our summer camp programs starting July 1st. Lots of activities and fun await!", faculty1);


        // Computer Science Courses
// Course 1: Introduction to Programming
        Syllabus syllabus1 = createSyllabus("Introduce students to programming fundamentals using Python.", "Variables, Data Types, Control Structures, Functions, Modules, and Libraries.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units1 = Arrays.asList(
                createUnit("Variables", "In this unit, students will be introduced to the concept of variables and their importance in programming. They will learn how to create and use variables to store and manipulate data. By the end of this unit, students will be able to declare variables and assign values to them, understand the concept of variable naming conventions, and demonstrate the use of variables in simple Python programs."),
                createUnit("Data Types", "This unit will cover the different data types available in Python, such as integers, floats, strings, and booleans. Students will learn how to identify and use these data types effectively. By the end of this unit, students will be able to perform operations on different data types, convert between data types, and apply data types appropriately in their programs."),
                createUnit("Control Structures", "In this unit, students will explore control structures, including loops (for and while) and conditional statements (if, elif, else). They will learn how to control the flow of their programs and make decisions based on conditions. By the end of this unit, students will be able to write programs that use loops to repeat actions and conditionals to execute code based on specific criteria."),
                createUnit("Functions", "This unit will focus on the creation and use of functions in Python. Students will learn how to define functions, pass parameters, and return values. By the end of this unit, students will be able to write reusable functions, understand the importance of functions in organizing code, and apply functions to solve problems effectively."),
                createUnit("Modules", "In this unit, students will be introduced to the concept of modules and how to import and use them in their Python programs. They will learn how to break down large programs into smaller, manageable pieces using modules. By the end of this unit, students will be able to create and import their own modules, use built-in Python modules, and understand the benefits of modular programming."),
                createUnit("Libraries", "This unit will cover the use of libraries in Python programming. Students will learn how to find, install, and use libraries to extend the functionality of their programs. By the end of this unit, students will be familiar with popular Python libraries, understand how to read library documentation, and integrate libraries into their own projects to simplify complex tasks.")
        );
        Course course1 = createCourse("Introduction to Programming", "Learn the basics of programming using Python.", "Computer Science", 4, syllabus1, units1);

// Course 2: Data Structures
        Syllabus syllabus2 = createSyllabus("Understand and implement various data structures.", "Arrays, Linked Lists, Stacks, Queues, Trees, Graphs.", "Assignments (50%), Projects (20%), Tests (30%)");
        List<Unit> units2 = Arrays.asList(
                createUnit("Arrays", "In this unit, students will learn about arrays, a fundamental data structure..."),
                createUnit("Linked Lists", "This unit covers linked lists, a data structure consisting of nodes..."),
                createUnit("Stacks", "In this unit, students will explore stacks, a last-in, first-out (LIFO) data structure..."),
                createUnit("Queues", "This unit focuses on queues, a first-in, first-out (FIFO) data structure..."),
                createUnit("Trees", "In this unit, students will study trees, a hierarchical data structure..."),
                createUnit("Graphs", "This unit covers graphs, a versatile data structure used to represent relationships...")
        );
        Course course2 = createCourse("Data Structures", "An in-depth study of data structures such as arrays, linked lists, stacks, queues, and trees.", "Computer Science", 3, syllabus2, units2);

// Course 3: Algorithms
        Syllabus syllabus3 = createSyllabus("Explore the design and analysis of algorithms.", "Sorting, Searching, Graph Algorithms, Dynamic Programming.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units3 = Arrays.asList(
                createUnit("Sorting", "In this unit, students will learn about various sorting algorithms, including bubble sort, merge sort, and quicksort. They will understand the principles behind each sorting method, analyze their efficiency, and implement these algorithms in Python."),
                createUnit("Searching", "This unit covers different searching algorithms such as linear search and binary search. Students will learn how to implement these algorithms, analyze their time complexity, and apply them to solve real-world problems."),
                createUnit("Graph Algorithms", "In this unit, students will explore algorithms used to traverse and manipulate graphs, including depth-first search (DFS) and breadth-first search (BFS). They will learn how to implement these algorithms and understand their applications in network analysis and other fields."),
                createUnit("Dynamic Programming", "This unit focuses on dynamic programming, a method for solving complex problems by breaking them down into simpler subproblems. Students will learn the fundamentals of dynamic programming, implement classic algorithms such as the Fibonacci sequence and knapsack problem, and understand how to optimize their solutions.")
        );
        Course course3 = createCourse("Algorithms", "Explore the design and analysis of algorithms, including sorting and searching algorithms.", "Computer Science", 3, syllabus3, units3);

// Course 4: Database Management Systems
        Syllabus syllabus4 = createSyllabus("Introduction to database concepts, SQL, and database design.", "Relational Databases, SQL, Transactions, Database Design.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units4 = Arrays.asList(
                createUnit("Relational Databases", "In this unit, students will learn about the foundational concepts of relational databases, including tables, keys, and relationships. Students will understand how relational databases organize data and how to design efficient database schemas."),
                createUnit("SQL", "This unit covers the basics of Structured Query Language (SQL), the standard language for querying and manipulating databases. Students will learn how to write SQL queries to create, read, update, and delete data, as well as perform complex data operations."),
                createUnit("Transactions", "In this unit, students will explore the concept of transactions, which ensure data integrity and consistency in databases. They will learn about ACID properties (Atomicity, Consistency, Isolation, Durability) and how to implement transactions in SQL."),
                createUnit("Database Design", "This unit focuses on the principles and best practices of database design. Students will learn how to create normalized database schemas, design efficient database structures, and apply data modeling techniques to meet specific application requirements.")
        );
        Course course4 = createCourse("Database Management Systems", "Introduction to database concepts, SQL, and database design.", "Computer Science", 3, syllabus4, units4);

// Course 5: Operating Systems
        Syllabus syllabus5 = createSyllabus("Study the fundamental concepts of operating systems.", "Processes, Memory Management, File Systems, Scheduling.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units5 = Arrays.asList(
                createUnit("Processes", "In this unit, students will learn about processes and process management in operating systems. They will understand how the OS handles process creation, scheduling, and termination, and explore inter-process communication and synchronization."),
                createUnit("Memory Management", "This unit covers memory management techniques used by operating systems to allocate and manage memory resources. Students will learn about paging, segmentation, virtual memory, and memory allocation algorithms."),
                createUnit("File Systems", "In this unit, students will explore file systems and how they are managed by the OS. They will learn about file organization, storage allocation, directory structures, and file access methods."),
                createUnit("Scheduling", "This unit focuses on CPU scheduling algorithms and their role in managing process execution. Students will learn about different scheduling techniques, such as round-robin, priority scheduling, and multi-level queues, and analyze their performance and efficiency.")
        );
        Course course5 = createCourse("Operating Systems", "Study the fundamental concepts of operating systems, including processes, memory management, and file systems.", "Computer Science", 3, syllabus5, units5);

// Course 6: Computer Networks
        Syllabus syllabus6 = createSyllabus("Learn about the principles of computer networking.", "OSI Model, TCP/IP, Network Protocols, Routing, Switching.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units6 = Arrays.asList(
                createUnit("OSI Model", "In this unit, students will learn about the OSI (Open Systems Interconnection) model, which standardizes the functions of a telecommunication or computing system irrespective of its underlying structure and technology. They will understand the seven layers of the OSI model and how data is transmitted across each layer."),
                createUnit("TCP/IP", "This unit covers the TCP/IP (Transmission Control Protocol/Internet Protocol) model, the foundational protocol suite for the internet. Students will learn about its four layers, key protocols, and how TCP/IP enables reliable communication between networked devices."),
                createUnit("Network Protocols", "In this unit, students will explore various network protocols that govern data exchange over networks. They will understand the roles of protocols such as HTTP, FTP, DNS, and DHCP, and how these protocols ensure secure and efficient communication."),
                createUnit("Routing", "This unit focuses on routing, the process of selecting paths in a network along which to send data packets. Students will learn about different routing algorithms, protocols (e.g., OSPF, BGP), and the concepts of static and dynamic routing."),
                createUnit("Switching", "In this unit, students will learn about switching, a technique used to forward data packets from one device to another within a network. They will explore different types of switches, switching methods (e.g., packet switching, circuit switching), and the role of switches in network design.")
        );
        Course course6 = createCourse("Computer Networks", "Learn about the principles of computer networking, including the OSI model, TCP/IP, and network protocols.", "Computer Science", 3, syllabus6, units6);

// Course 7: Software Engineering
        Syllabus syllabus7 = createSyllabus("Introduction to software development methodologies.", "Software Development Life Cycle, Agile, Waterfall, Project Management.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units7 = Arrays.asList(
                createUnit("Software Development Life Cycle", "In this unit, students will learn about the Software Development Life Cycle (SDLC), a process for planning, creating, testing, and deploying an information system. They will explore different SDLC models, including iterative, incremental, and spiral models."),
                createUnit("Agile", "This unit covers the Agile methodology, an iterative approach to software development that emphasizes flexibility and customer feedback. Students will learn about Agile principles, practices (e.g., Scrum, Kanban), and how to apply Agile techniques in software projects."),
                createUnit("Waterfall", "In this unit, students will explore the Waterfall model, a linear and sequential approach to software development. They will understand the phases of the Waterfall model, including requirements analysis, system design, implementation, testing, deployment, and maintenance."),
                createUnit("Project Management", "This unit focuses on project management techniques and tools used in software development. Students will learn about project planning, scheduling, resource management, risk management, and quality assurance, and how to manage a software project from inception to completion.")
        );
        Course course7 = createCourse("Software Engineering", "Introduction to software development methodologies, project management, and software life cycle.", "Computer Science", 4, syllabus7, units7);

// Course 8: Web Development
        Syllabus syllabus8 = createSyllabus("Learn to create dynamic websites.", "HTML, CSS, JavaScript, React, Backend Integration.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units8 = Arrays.asList(
                createUnit("HTML", "In this unit, students will learn the basics of HTML (HyperText Markup Language), the standard language for creating web pages. They will understand how to structure content using HTML tags and attributes, and build simple web pages."),
                createUnit("CSS", "This unit covers CSS (Cascading Style Sheets), a language used to style HTML documents. Students will learn how to apply styles to web pages, including layout, colors, fonts, and responsiveness, to enhance the visual presentation of their web pages."),
                createUnit("JavaScript", "In this unit, students will explore JavaScript, a programming language that allows them to create interactive and dynamic web content. They will learn how to write JavaScript code to manipulate the DOM (Document Object Model), handle events, and perform animations."),
                createUnit("React", "This unit focuses on React, a popular JavaScript library for building user interfaces. Students will learn the core concepts of React, including components, state, and props, and how to create single-page applications with React."),
                createUnit("Backend Integration", "In this unit, students will learn how to integrate front-end web applications with backend services. They will explore RESTful APIs, data fetching, and server-side rendering, and understand how to build full-stack web applications.")
        );
        Course course8 = createCourse("Web Development", "Learn to create dynamic websites using HTML, CSS, JavaScript, and frameworks such as React.", "Computer Science", 3, syllabus8, units8);

// Course 9: Artificial Intelligence
        Syllabus syllabus9 = createSyllabus(
                "Explore the basics of artificial intelligence.",
                "Machine Learning, Neural Networks, Natural Language Processing.",
                "Assignments (40%), Projects (30%), Tests (30%)"
        );
        List<Unit> units9 = Arrays.asList(
                createUnit("Machine Learning", "In this unit, students will learn about machine learning, a subset of AI that focuses on developing algorithms that enable computers to learn from and make predictions based on data. They will explore various machine learning techniques and tools."),
                createUnit("Neural Networks", "This unit covers neural networks, a set of algorithms modeled after the human brain. Students will understand the basics of neural network architecture, backpropagation, and how to build and train neural networks for different tasks."),
                createUnit("Natural Language Processing", "In this unit, students will explore natural language processing (NLP), a field of AI that enables computers to understand and generate human language. They will learn about text processing, sentiment analysis, and how to build NLP models using machine learning techniques.")
        );
        Course course9 = createCourse("Artificial Intelligence", "Explore the basics of artificial intelligence, including machine learning, neural networks, and natural language processing.", "Computer Science", 4, syllabus9, units9);


// Create the Syllabus and Units for Course 10
        Syllabus syllabus10 = createSyllabus("Introduction to the principles of cybersecurity.", "Threat Analysis, Encryption, Network Security, Secure Coding.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units10 = Arrays.asList(
                createUnit("Threat Analysis", "In this unit, students will learn about threat analysis, identifying potential security threats and vulnerabilities. They will understand how to assess risks and implement strategies to mitigate these threats."),
                createUnit("Encryption", "This unit covers encryption, the process of converting information into a secure format. Students will learn about different encryption techniques, algorithms, and the importance of encryption in protecting sensitive data."),
                createUnit("Network Security", "In this unit, students will explore network security, including measures to protect data during transmission across networks. They will understand firewalls, intrusion detection systems, and other tools used to safeguard networks."),
                createUnit("Secure Coding", "This unit focuses on secure coding practices to prevent vulnerabilities in software. Students will learn about common security flaws, how to write secure code, and best practices for maintaining software security.")
        );
// Create Course 10
        Course course10 = createCourse("Cybersecurity", "Introduction to the principles of cybersecurity, including threat analysis, encryption, and network security.", "Computer Science", 3, syllabus10, units10);


// Mathematics Courses

        // Course 11: Calculus I
        Syllabus syllabus11 = createSyllabus("Introduce students to differential and integral calculus.", "Limits, Derivatives, Integrals, Applications of Calculus.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units11 = Arrays.asList(
                createUnit("Limits", "In this unit, students will learn about limits, the foundational concept of calculus. They will understand how to calculate limits and their importance in defining continuity and the behavior of functions."),
                createUnit("Derivatives", "This unit covers derivatives, the measure of how a function changes as its input changes. Students will learn techniques of differentiation, applications of derivatives, and how to solve real-world problems using derivatives."),
                createUnit("Integrals", "In this unit, students will explore integrals, the concept of accumulation of quantities. They will learn about techniques of integration, the Fundamental Theorem of Calculus, and applications of integrals in various fields."),
                createUnit("Applications of Calculus", "This unit focuses on the practical applications of calculus in science, engineering, and economics. Students will understand how to apply calculus concepts to model and solve real-world problems.")
        );
        Course course11 = createCourse("Calculus I", "Introduction to differential and integral calculus.", "Mathematics", 4, syllabus11, units11);

// Course 12: Linear Algebra
        Syllabus syllabus12 = createSyllabus("Study of vector spaces, matrices, and linear transformations.", "Vectors, Matrices, Determinants, Eigenvalues, Eigenvectors.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units12 = Arrays.asList(
                createUnit("Vectors", "In this unit, students will learn about vectors, their properties, and operations. They will explore vector addition, scalar multiplication, dot product, and cross product, and understand their applications in various fields."),
                createUnit("Matrices", "This unit covers matrices and their operations. Students will learn about matrix addition, multiplication, and inversion, as well as applications of matrices in solving linear equations and transformations."),
                createUnit("Determinants", "In this unit, students will explore determinants, a scalar value that can be computed from the elements of a square matrix. They will understand the properties of determinants, how to calculate them, and their role in solving linear systems and finding matrix inverses."),
                createUnit("Eigenvalues", "This unit focuses on eigenvalues, which are special numbers associated with a matrix. Students will learn how to calculate eigenvalues, understand their significance, and explore their applications in various mathematical and engineering problems."),
                createUnit("Eigenvectors", "In this unit, students will study eigenvectors, which are vectors associated with eigenvalues that remain in the same direction under a linear transformation. They will learn how to find eigenvectors and understand their importance in matrix diagonalization and systems of linear equations.")
        );
        Course course12 = createCourse("Linear Algebra", "Study of vector spaces, matrices, and linear transformations.", "Mathematics", 3, syllabus12, units12);

// Course 13: Cybersecurity
        Syllabus syllabus13 = createSyllabus("Introduction to the principles of cybersecurity.", "Threat Analysis, Encryption, Network Security, Secure Coding.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units13 = Arrays.asList(
                createUnit("Threat Analysis", "In this unit, students will learn about threat analysis, identifying potential security threats and vulnerabilities. They will understand how to assess risks and implement strategies to mitigate these threats."),
                createUnit("Encryption", "This unit covers encryption, the process of converting information into a secure format. Students will learn about different encryption techniques, algorithms, and the importance of encryption in protecting sensitive data."),
                createUnit("Network Security", "In this unit, students will explore network security, including measures to protect data during transmission across networks. They will understand firewalls, intrusion detection systems, and other tools used to safeguard networks."),
                createUnit("Secure Coding", "This unit focuses on secure coding practices to prevent vulnerabilities in software. Students will learn about common security flaws, how to write secure code, and best practices for maintaining software security.")
        );
        Course course13 = createCourse("Cybersecurity", "Introduction to the principles of cybersecurity, including threat analysis, encryption, and network security.", "Computer Science", 3, syllabus13, units13);

// Course 14: Discrete Mathematics
        Syllabus syllabus14 = createSyllabus("Study of mathematical structures that are fundamentally discrete.", "Logic, Set Theory, Graph Theory, Combinatorics.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units14 = Arrays.asList(
                createUnit("Logic", "In this unit, students will learn about the fundamentals of logic, including propositional and predicate logic. They will understand how to form logical statements, use logical connectives, and apply logical reasoning in problem-solving."),
                createUnit("Set Theory", "This unit covers set theory, the study of sets, which are collections of objects. Students will explore the concepts of subsets, unions, intersections, and Cartesian products, and apply these concepts to solve problems involving sets."),
                createUnit("Graph Theory", "In this unit, students will explore graph theory, the study of graphs as mathematical structures used to model pairwise relations between objects. They will learn about different types of graphs, such as directed and undirected graphs, and apply algorithms for traversing and analyzing graphs."),
                createUnit("Combinatorics", "This unit focuses on combinatorics, the study of counting, arrangement, and combination of objects. Students will learn about permutations, combinations, and the principles of counting, and apply these techniques to solve combinatorial problems.")
        );
        Course course14 = createCourse("Discrete Mathematics", "Study of mathematical structures that are fundamentally discrete rather than continuous.", "Mathematics", 3, syllabus14, units14);

// Course 15: Physics I
        Syllabus syllabus15 = createSyllabus("Introduction to classical mechanics.", "Newton's Laws, Energy Principles, Motion.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units15 = Arrays.asList(
                createUnit("Newton's Laws", "In this unit, students will learn about Newton's laws of motion, which describe the relationship between the motion of an object and the forces acting on it. They will understand and apply these laws to solve problems in mechanics."),
                createUnit("Energy Principles", "This unit covers the principles of energy, including kinetic and potential energy, work, and the conservation of energy. Students will learn how to calculate energy and work, and understand the concepts of power and efficiency."),
                createUnit("Motion", "In this unit, students will explore the concepts of motion, including linear motion, projectile motion, and circular motion. They will learn about velocity, acceleration, and the equations of motion, and apply these concepts to analyze different types of motion.")
        );
        Course course15 = createCourse("Physics I", "Introduction to classical mechanics, including Newton's laws and energy principles.", "Physics", 4, syllabus15, units15);

// Course 16: Chemistry I
        Syllabus syllabus16 = createSyllabus("Introduction to chemical principles.", "Atomic Structure, Chemical Bonding, Reactions.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units16 = Arrays.asList(
                createUnit("Atomic Structure", "In this unit, students will learn about the structure of atoms, including subatomic particles (protons, neutrons, electrons), atomic number, mass number, and isotopes. They will understand how these components define elements and their properties."),
                createUnit("Chemical Bonding", "This unit covers chemical bonding, the process by which atoms combine to form molecules and compounds. Students will explore different types of bonds, including ionic, covalent, and metallic bonds, and understand the principles that govern bond formation."),
                createUnit("Reactions", "In this unit, students will study chemical reactions, including the reactants, products, and types of chemical reactions. They will learn about reaction rates, equilibrium, and the factors that influence chemical reactions.")
        );
        Course course16 = createCourse("Chemistry I", "Introduction to chemical principles, including atomic structure and chemical bonding.", "Chemistry", 4, syllabus16, units16);

// Course 17: Biology I
        Syllabus syllabus17 = createSyllabus("Introduction to cellular biology, genetics, and evolution.", "Cell Structure, Genetics, Evolution, Ecology.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units17 = Arrays.asList(
                createUnit("Cell Structure", "In this unit, students will learn about the structure and function of cells, including the cell membrane, nucleus, organelles, and the differences between prokaryotic and eukaryotic cells."),
                createUnit("Genetics", "This unit covers genetics, the study of heredity and the variation of inherited characteristics. Students will explore the principles of Mendelian genetics, the structure and function of DNA, and the processes of replication, transcription, and translation."),
                createUnit("Evolution", "In this unit, students will explore the theory of evolution, natural selection, and the evidence supporting evolutionary change. They will understand how genetic variation and environmental factors contribute to the evolution of species."),
                createUnit("Ecology", "This unit focuses on ecology, the study of interactions between organisms and their environment. Students will learn about ecosystems, food webs, energy flow, and the impact of human activities on the environment.")
        );
        Course course17 = createCourse("Biology I", "Introduction to cellular biology, genetics, and evolution.", "Biology", 4, syllabus17, units17);

// Course 18: Introduction to Engineering
        Syllabus syllabus18 = createSyllabus("Overview of engineering disciplines and problem-solving techniques.", "Engineering Disciplines, Problem-Solving, Design Process.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units18 = Arrays.asList(
                createUnit("Engineering Disciplines", "In this unit, students will learn about the various engineering disciplines, including civil, mechanical, electrical, and chemical engineering. They will explore the roles and responsibilities of engineers in each field and understand the diverse applications of engineering."),
                createUnit("Problem-Solving", "This unit covers problem-solving techniques used in engineering. Students will learn about the engineering problem-solving process, including identifying problems, generating solutions, and selecting the best solution. They will apply these techniques to real-world engineering challenges."),
                createUnit("Design Process", "In this unit, students will explore the engineering design process, a systematic approach to solving engineering problems. They will learn about the stages of the design process, including defining requirements, brainstorming, prototyping, testing, and iteration.")
        );
        Course course18 = createCourse("Introduction to Engineering", "Overview of engineering disciplines and problem-solving techniques.", "Engineering", 3, syllabus18, units18);

// Course 19: Electrical Engineering Basics
        Syllabus syllabus19 = createSyllabus("Fundamentals of electrical circuits, signals, and systems.", "Circuit Analysis, Signal Processing, Systems Theory.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units19 = Arrays.asList(
                createUnit("Circuit Analysis", "In this unit, students will learn about the principles of circuit analysis, including Ohm's law, Kirchhoff's laws, and techniques for analyzing DC and AC circuits. They will understand how to calculate voltage, current, and resistance in electrical circuits."),
                createUnit("Signal Processing", "This unit covers the fundamentals of signal processing, including the analysis and manipulation of signals. Students will learn about Fourier transforms, filtering, and the applications of signal processing in communication systems and digital signal processing (DSP)."),
                createUnit("Systems Theory", "In this unit, students will explore systems theory, the study of systems and their behavior. They will learn about system modeling, feedback, and control systems, and understand how to apply these concepts to analyze and design electrical systems.")
        );
        Course course19 = createCourse("Electrical Engineering Basics", "Fundamentals of electrical circuits, signals, and systems.", "Engineering", 4, syllabus19, units19);

// Course 20: Mechanical Engineering Principles
        Syllabus syllabus20 = createSyllabus("Introduction to the principles of mechanics and thermodynamics.", "Statics, Dynamics, Thermodynamics, Material Science.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units20 = Arrays.asList(
                createUnit("Statics", "In this unit, students will learn about statics, the branch of mechanics that deals with bodies at rest and forces in equilibrium. They will understand how to analyze force systems, calculate moments, and solve problems related to static equilibrium."),
                createUnit("Dynamics", "This unit covers dynamics, the study of bodies in motion. Students will explore kinematics and kinetics, understand the principles of Newton's laws of motion, and learn how to analyze the motion of particles and rigid bodies."),
                createUnit("Thermodynamics", "In this unit, students will explore the principles of thermodynamics, including the laws of thermodynamics, energy transfer, and the behavior of gases and liquids. They will understand how to apply these principles to solve engineering problems involving heat and work."),
                createUnit("Material Science", "This unit focuses on material science, the study of the properties and behavior of materials. Students will learn about different types of materials, including metals, ceramics, polymers, and composites, and understand how to select materials for specific engineering applications.")
        );
        Course course20 = createCourse("Mechanical Engineering Principles", "Introduction to the principles of mechanics and thermodynamics.", "Engineering", 4, syllabus20, units20);

        Semester fall2024 = createSemester("Fall", "2024");
        Semester spring2024 = createSemester("Spring", "2024");

    }

    public static Faculty createFaculty(String username, String password, String firstName, String lastName, String email, String phoneNumber, int age, String gender, String address, boolean isAdmin, boolean isTeacher, double salary) {
        Credential credential = new Credential();
        credential.setUsername(username);
        credential.setPassword(password);

        Profile profile = new Profile();
        profile.setFirstName(firstName);
        profile.setLastName(lastName);
        profile.setEmail(email);
        profile.setPhoneNumber(phoneNumber);

        Faculty faculty = new Faculty();
        faculty.setCredentials(credential);
        faculty.setProfile(profile);
        faculty.setAge(age);
        faculty.setGender(gender);
        faculty.setAddress(address);
        faculty.setAdmin(isAdmin);
        faculty.setTeacher(isTeacher);
        faculty.setSalary(salary);

        return faculty;
    }

    public static Student createStudent(String username, String password, String firstName, String lastName, String email, String phoneNumber, int age, String gender, String address) {
        Credential credential = new Credential();
        credential.setUsername(username);
        credential.setPassword(password);

        Profile profile = new Profile();
        profile.setFirstName(firstName);
        profile.setLastName(lastName);
        profile.setEmail(email);
        profile.setPhoneNumber(phoneNumber);

        Student student = new Student();
        student.setCredentials(credential);
        student.setProfile(profile);
        student.setAge(age);
        student.setGender(gender);
        student.setAddress(address);

        return student;
    }
    public static Guardian createGuardian(String username, String password, String firstName, String lastName, String email, String phoneNumber, int age, String gender, String address) {
        Credential credential = new Credential();
        credential.setUsername(username);
        credential.setPassword(password);

        Profile profile = new Profile();
        profile.setFirstName(firstName);
        profile.setLastName(lastName);
        profile.setEmail(email);
        profile.setPhoneNumber(phoneNumber);

        Guardian guardian = new Guardian();
        guardian.setCredentials(credential);
        guardian.setProfile(profile);
        guardian.setAge(age);
        guardian.setGender(gender);
        guardian.setAddress(address);

        return guardian;
    }
    public static Announcement createAnnouncement(String title, String message, Faculty author) {
        Announcement announcement = new Announcement();
        announcement.setTitle(title);
        announcement.setMessage(message);
        announcement.setAuthor(author);

        return announcement;
    }

    public static Syllabus createSyllabus(String objectives, String topics, String evaluationCriteria) {
            Syllabus syllabus = new Syllabus();
            syllabus.setObjectives(objectives);
            syllabus.setTopics(topics);
            syllabus.setEvaluationCriteria(evaluationCriteria);
            return syllabus;
        }

        public static Course createCourse(String name, String description, String subject, int credits, Syllabus syllabus, List<Unit> units) {
            Course course = new Course();
            course.setName(name);
            course.setDescription(description);
            course.setSubject(subject);
            course.setCredits(credits);
            course.setSyllabus(syllabus);
            course.setUnits(units);
            return course;
        }

        public static Unit createUnit(String name, String description) {
            Unit unit = new Unit();
            unit.setName(name);
            unit.setDescription(description);
            return unit;
        }

    public static Semester createSemester(String name, String year) {
        Semester semester = new Semester();
        semester.setName(name);
        semester.setYear(year);
        return semester;
    }

}
