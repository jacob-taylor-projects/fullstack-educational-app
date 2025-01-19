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
import static com.project.education_app.Assignment1to4Seeder.addStudentAnswerToProblemAnswer;
import static com.project.education_app.Seeder.*;
import static com.project.education_app.Seeder.createGrade;
import static com.project.education_app.Test1to4Seeder.*;


@Component
@Order(9)
@Data
public class Test5to8Seeder implements CommandLineRunner {
    private final FacultyRepo facultyRepo;
    private final SyllabusRepo syllabusRepo;
    private final StudentRepo studentRepo;
    private final CourseRepo courseRepo;
    private final TestRepo testRepo;
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


// Creating the test for Unit 1: Processes
        Test test5a = createTest("Processes Test", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        addStudentToTest(test5a, student3);
        addStudentToTest(test5a, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa5a_1 = createProblemAnswer("What is a process in operating systems?", "A process is an instance of a program in execution, including the program code, current activity, and allocated resources.");
        addTestToProblemAnswer(pa5a_1, test5a);
        addProblemAnswerToTest(test5a, pa5a_1);

        ProblemAnswer pa5a_2 = createProblemAnswer("What is process management?", "Process management involves handling the creation, scheduling, and termination of processes within an operating system.");
        addTestToProblemAnswer(pa5a_2, test5a);
        addProblemAnswerToTest(test5a, pa5a_2);

        ProblemAnswer pa5a_3 = createProblemAnswer("What is process scheduling?", "Process scheduling is the method by which an operating system decides which processes to execute and in what order.");
        addTestToProblemAnswer(pa5a_3, test5a);
        addProblemAnswerToTest(test5a, pa5a_3);

        ProblemAnswer pa5a_4 = createProblemAnswer("What is inter-process communication (IPC)?", "IPC is a mechanism that allows processes to communicate and synchronize their actions, using methods like message passing and shared memory.");
        addTestToProblemAnswer(pa5a_4, test5a);
        addProblemAnswerToTest(test5a, pa5a_4);

        ProblemAnswer pa5a_5 = createProblemAnswer("What are the states of a process?", "The states of a process include new, ready, running, waiting, and terminated.");
        addTestToProblemAnswer(pa5a_5, test5a);
        addProblemAnswerToTest(test5a, pa5a_5);

// Output for confirmation
        System.out.println("Test for 'Processes' unit created with 10 problem answers.");
// Creating the test for Unit 2: Memory Management
        Test test5b = createTest("Memory Management Test", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        addStudentToTest(test5b, student3);
        addStudentToTest(test5b, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa5b_1 = createProblemAnswer("What is memory management in operating systems?", "Memory management is the process by which an operating system handles the allocation, tracking, and deallocation of memory resources.");
        addTestToProblemAnswer(pa5b_1, test5b);
        addProblemAnswerToTest(test5b, pa5b_1);

        ProblemAnswer pa5b_2 = createProblemAnswer("What is paging?", "Paging is a memory management scheme that eliminates the need for contiguous allocation of physical memory by dividing memory into fixed-size blocks called pages.");
        addTestToProblemAnswer(pa5b_2, test5b);
        addProblemAnswerToTest(test5b, pa5b_2);

        ProblemAnswer pa5b_3 = createProblemAnswer("What is segmentation?", "Segmentation is a memory management technique that divides memory into variable-sized segments, each of which can correspond to different parts of a program, such as code, data, and stack.");
        addTestToProblemAnswer(pa5b_3, test5b);
        addProblemAnswerToTest(test5b, pa5b_3);

        ProblemAnswer pa5b_4 = createProblemAnswer("What is virtual memory?", "Virtual memory is a memory management technique that gives an application the impression it has contiguous working memory while actually using physical memory fragmented in different locations.");
        addTestToProblemAnswer(pa5b_4, test5b);
        addProblemAnswerToTest(test5b, pa5b_4);

        ProblemAnswer pa5b_5 = createProblemAnswer("What is a page table?", "A page table is a data structure used in paging that maps virtual addresses to physical addresses.");
        addTestToProblemAnswer(pa5b_5, test5b);
        addProblemAnswerToTest(test5b, pa5b_5);

// Output for confirmation
        System.out.println("Test for 'Memory Management' unit created with  problem answers.");
// Creating the test for Unit 3: File Systems
        Test test5c = createTest("File Systems Test", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        addStudentToTest(test5c, student3);
        addStudentToTest(test5c, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa5c_1 = createProblemAnswer("What is a file system in operating systems?", "A file system is a method used by an operating system to organize, store, retrieve, and manage files and directories on a storage device.");
        addTestToProblemAnswer(pa5c_1, test5c);
        addProblemAnswerToTest(test5c, pa5c_1);

        ProblemAnswer pa5c_2 = createProblemAnswer("What are the main functions of a file system?", "The main functions of a file system include file creation and deletion, directory creation and deletion, file manipulation, and file access control.");
        addTestToProblemAnswer(pa5c_2, test5c);
        addProblemAnswerToTest(test5c, pa5c_2);

        ProblemAnswer pa5c_3 = createProblemAnswer("What is file organization?", "File organization refers to the way files are arranged and managed on a storage device, ensuring efficient access and retrieval.");
        addTestToProblemAnswer(pa5c_3, test5c);
        addProblemAnswerToTest(test5c, pa5c_3);

        ProblemAnswer pa5c_4 = createProblemAnswer("What is a directory structure?", "A directory structure is a hierarchical arrangement of directories and subdirectories that organize files in a systematic way.");
        addTestToProblemAnswer(pa5c_4, test5c);
        addProblemAnswerToTest(test5c, pa5c_4);

        ProblemAnswer pa5c_5 = createProblemAnswer("What is storage allocation?", "Storage allocation is the process of assigning physical storage space to files and directories on a storage device.");
        addTestToProblemAnswer(pa5c_5, test5c);
        addProblemAnswerToTest(test5c, pa5c_5);

// Output for confirmation
        System.out.println("Test for 'File Systems' unit created with 10 problem answers.");
// Creating the test for Unit 4: Scheduling
        Test test5d = createTest("Scheduling Test", faculty5, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        addStudentToTest(test5d, student3);
        addStudentToTest(test5d, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa5d_1 = createProblemAnswer("What is CPU scheduling?", "CPU scheduling is the process by which the operating system decides which processes to run, in what order, and for how long, to ensure efficient use of the CPU.");
        addTestToProblemAnswer(pa5d_1, test5d);
        addProblemAnswerToTest(test5d, pa5d_1);

        ProblemAnswer pa5d_2 = createProblemAnswer("What is the purpose of scheduling algorithms?", "Scheduling algorithms determine the order and time allocation for processes to ensure fair and efficient CPU utilization, reduce waiting time, and improve overall system performance.");
        addTestToProblemAnswer(pa5d_2, test5d);
        addProblemAnswerToTest(test5d, pa5d_2);

        ProblemAnswer pa5d_3 = createProblemAnswer("What is the round-robin scheduling algorithm?", "The round-robin scheduling algorithm allocates a fixed time slice, or quantum, to each process in the ready queue in a cyclic order. When a process's time slice expires, it is moved to the back of the queue.");
        addTestToProblemAnswer(pa5d_3, test5d);
        addProblemAnswerToTest(test5d, pa5d_3);

        ProblemAnswer pa5d_4 = createProblemAnswer("What is priority scheduling?", "Priority scheduling assigns a priority to each process, and the CPU is allocated to the process with the highest priority. Lower-priority processes are preempted by higher-priority processes.");
        addTestToProblemAnswer(pa5d_4, test5d);
        addProblemAnswerToTest(test5d, pa5d_4);

        ProblemAnswer pa5d_5 = createProblemAnswer("What is multi-level queue scheduling?", "Multi-level queue scheduling divides the ready queue into several queues based on process priority or type. Each queue can have its own scheduling algorithm, and processes are assigned to queues permanently or dynamically.");
        addTestToProblemAnswer(pa5d_5, test5d);
        addProblemAnswerToTest(test5d, pa5d_5);


// Output for confirmation
        System.out.println("Test for 'Scheduling' unit created with 10 problem answers.");
// Creating the test for Unit 1: OSI Model
        Test test6a = createTest("OSI Model Test", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        addStudentToTest(test6a, student3);
        addStudentToTest(test6a, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa6a_1 = createProblemAnswer("What is the OSI model?", "The OSI (Open Systems Interconnection) model is a conceptual framework that standardizes the functions of a telecommunication or computing system into seven distinct layers.");
        addTestToProblemAnswer(pa6a_1, test6a);
        addProblemAnswerToTest(test6a, pa6a_1);

        ProblemAnswer pa6a_2 = createProblemAnswer("What are the seven layers of the OSI model?", "The seven layers of the OSI model are: 1) Physical, 2) Data Link, 3) Network, 4) Transport, 5) Session, 6) Presentation, and 7) Application.");
        addTestToProblemAnswer(pa6a_2, test6a);
        addProblemAnswerToTest(test6a, pa6a_2);

        ProblemAnswer pa6a_3 = createProblemAnswer("What is the function of the Physical layer?", "The Physical layer is responsible for transmitting raw data bits over a physical medium, such as cables, and defining the hardware specifications.");
        addTestToProblemAnswer(pa6a_3, test6a);
        addProblemAnswerToTest(test6a, pa6a_3);

        ProblemAnswer pa6a_4 = createProblemAnswer("What is the function of the Data Link layer?", "The Data Link layer is responsible for establishing, maintaining, and terminating data links between nodes. It ensures reliable data transfer and handles error detection and correction.");
        addTestToProblemAnswer(pa6a_4, test6a);
        addProblemAnswerToTest(test6a, pa6a_4);

        ProblemAnswer pa6a_5 = createProblemAnswer("What is the function of the Network layer?", "The Network layer is responsible for routing data packets between nodes on different networks. It determines the best path for data transmission and handles logical addressing.");
        addTestToProblemAnswer(pa6a_5, test6a);
        addProblemAnswerToTest(test6a, pa6a_5);

// Output for confirmation
        System.out.println("Test for 'OSI Model' unit created with 10 problem answers.");
// Creating the test for Unit 2: TCP/IP
        Test test6b = createTest("TCP/IP Test", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        addStudentToTest(test6b, student3);
        addStudentToTest(test6b, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa6b_1 = createProblemAnswer("What is the TCP/IP model?", "The TCP/IP (Transmission Control Protocol/Internet Protocol) model is a foundational protocol suite for the internet, consisting of four layers: Link, Internet, Transport, and Application.");
        addTestToProblemAnswer(pa6b_1, test6b);
        addProblemAnswerToTest(test6b, pa6b_1);

        ProblemAnswer pa6b_2 = createProblemAnswer("What are the layers of the TCP/IP model?", "The layers of the TCP/IP model are: 1) Link, 2) Internet, 3) Transport, and 4) Application.");
        addTestToProblemAnswer(pa6b_2, test6b);
        addProblemAnswerToTest(test6b, pa6b_2);

        ProblemAnswer pa6b_3 = createProblemAnswer("What is the function of the Link layer?", "The Link layer is responsible for physical addressing, frame formatting, and error detection on the physical network. It includes protocols like Ethernet and Wi-Fi.");
        addTestToProblemAnswer(pa6b_3, test6b);
        addProblemAnswerToTest(test6b, pa6b_3);

        ProblemAnswer pa6b_4 = createProblemAnswer("What is the function of the Internet layer?", "The Internet layer is responsible for logical addressing, routing, and packet fragmentation. It includes protocols like IP (Internet Protocol) and ICMP (Internet Control Message Protocol).");
        addTestToProblemAnswer(pa6b_4, test6b);
        addProblemAnswerToTest(test6b, pa6b_4);

        ProblemAnswer pa6b_5 = createProblemAnswer("What is the function of the Transport layer?", "The Transport layer is responsible for ensuring reliable data transfer, error detection, and flow control. It includes protocols like TCP (Transmission Control Protocol) and UDP (User Datagram Protocol).");
        addTestToProblemAnswer(pa6b_5, test6b);
        addProblemAnswerToTest(test6b, pa6b_5);

// Output for confirmation
        System.out.println("Test for 'TCP/IP' unit created with 10 problem answers.");
// Creating the test for Unit 3: Network Protocols
        Test test6c = createTest("Network Protocols Test", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        addStudentToTest(test6c, student3);
        addStudentToTest(test6c, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa6c_1 = createProblemAnswer("What is HTTP?", "HTTP (Hypertext Transfer Protocol) is a protocol used for transmitting web pages over the internet. It defines how messages are formatted and transmitted, and how web servers and browsers should respond to various commands.");
        addTestToProblemAnswer(pa6c_1, test6c);
        addProblemAnswerToTest(test6c, pa6c_1);

        ProblemAnswer pa6c_2 = createProblemAnswer("What is FTP?", "FTP (File Transfer Protocol) is a protocol used for transferring files between computers over a network. It provides a way to upload and download files to and from a server.");
        addTestToProblemAnswer(pa6c_2, test6c);
        addProblemAnswerToTest(test6c, pa6c_2);

        ProblemAnswer pa6c_3 = createProblemAnswer("What is DNS?", "DNS (Domain Name System) is a protocol that translates human-readable domain names (like www.example.com) into IP addresses that computers use to identify each other on the network.");
        addTestToProblemAnswer(pa6c_3, test6c);
        addProblemAnswerToTest(test6c, pa6c_3);

        ProblemAnswer pa6c_4 = createProblemAnswer("What is DHCP?", "DHCP (Dynamic Host Configuration Protocol) is a protocol used to automatically assign IP addresses and other network configuration parameters to devices on a network, allowing them to communicate with other IP networks.");
        addTestToProblemAnswer(pa6c_4, test6c);
        addProblemAnswerToTest(test6c, pa6c_4);

        ProblemAnswer pa6c_5 = createProblemAnswer("What is the function of the SMTP protocol?", "SMTP (Simple Mail Transfer Protocol) is a protocol used for sending and receiving email messages between servers. It handles the routing of emails across the internet.");
        addTestToProblemAnswer(pa6c_5, test6c);
        addProblemAnswerToTest(test6c, pa6c_5);

// Output for confirmation
        System.out.println("Test for 'Network Protocols' unit created with 10 problem answers.");
// Creating the test for Unit 4: Routing
        Test test6d = createTest("Routing Test", faculty1, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        addStudentToTest(test6d, student3);
        addStudentToTest(test6d, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa6d_1 = createProblemAnswer("What is routing in networking?", "Routing is the process of selecting paths in a network along which to send data packets from a source to a destination.");
        addTestToProblemAnswer(pa6d_1, test6d);
        addProblemAnswerToTest(test6d, pa6d_1);

        ProblemAnswer pa6d_2 = createProblemAnswer("What are routing algorithms?", "Routing algorithms are techniques used to determine the best path for data packets to travel across a network. Examples include distance vector and link-state algorithms.");
        addTestToProblemAnswer(pa6d_2, test6d);
        addProblemAnswerToTest(test6d, pa6d_2);

        ProblemAnswer pa6d_3 = createProblemAnswer("What is the difference between static and dynamic routing?", "Static routing involves manually configuring routes, which remain fixed, while dynamic routing uses algorithms and protocols to automatically adjust routes based on network conditions.");
        addTestToProblemAnswer(pa6d_3, test6d);
        addProblemAnswerToTest(test6d, pa6d_3);

        ProblemAnswer pa6d_4 = createProblemAnswer("What is OSPF?", "OSPF (Open Shortest Path First) is a link-state routing protocol used to find the best path for data packets in an IP network. It uses the shortest path first algorithm to build and calculate the shortest path to all known destinations.");
        addTestToProblemAnswer(pa6d_4, test6d);
        addProblemAnswerToTest(test6d, pa6d_4);

        ProblemAnswer pa6d_5 = createProblemAnswer("What is BGP?", "BGP (Border Gateway Protocol) is an exterior gateway protocol used to exchange routing information between different autonomous systems on the internet. It determines the best paths for data transmission based on various criteria, such as path attributes and policies.");
        addTestToProblemAnswer(pa6d_5, test6d);
        addProblemAnswerToTest(test6d, pa6d_5);


// Output for confirmation
        System.out.println("Test for 'Routing' unit created with 10 problem answers.");
// Creating the test for Unit 5: Switching
        Test test6e = createTest("Switching Test", faculty1, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        addStudentToTest(test6e, student3);
        addStudentToTest(test6e, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa6e_1 = createProblemAnswer("What is switching in networking?", "Switching is the technique used to forward data packets from one device to another within a network. It determines the path that data packets take through the network.");
        addTestToProblemAnswer(pa6e_1, test6e);
        addProblemAnswerToTest(test6e, pa6e_1);

        ProblemAnswer pa6e_2 = createProblemAnswer("What are the types of switches in networking?", "Types of switches include unmanaged switches, managed switches, smart switches, and layer 3 switches. Each type offers different levels of configuration and control.");
        addTestToProblemAnswer(pa6e_2, test6e);
        addProblemAnswerToTest(test6e, pa6e_2);

        ProblemAnswer pa6e_3 = createProblemAnswer("What is packet switching?", "Packet switching is a method of data transmission where data is broken into packets, each of which is transmitted independently across the network. Packets are reassembled at the destination.");
        addTestToProblemAnswer(pa6e_3, test6e);
        addProblemAnswerToTest(test6e, pa6e_3);

        ProblemAnswer pa6e_4 = createProblemAnswer("What is circuit switching?", "Circuit switching is a method of data transmission where a dedicated communication path is established between two devices for the duration of the connection. It is commonly used in traditional telephone networks.");
        addTestToProblemAnswer(pa6e_4, test6e);
        addProblemAnswerToTest(test6e, pa6e_4);

        ProblemAnswer pa6e_5 = createProblemAnswer("What is the role of a switch in a network?", "A switch operates at the data link layer (Layer 2) of the OSI model. It connects devices within a local area network (LAN) and uses MAC addresses to forward data to the correct destination.");
        addTestToProblemAnswer(pa6e_5, test6e);
        addProblemAnswerToTest(test6e, pa6e_5);

// Output for confirmation
        System.out.println("Test for 'Switching' unit created with 10 problem answers.");
// Creating the test for Unit 1: Software Development Life Cycle
        Test test7a = createTest("Software Development Life Cycle Test", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        addStudentToTest(test7a, student3);
        addStudentToTest(test7a, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa7a_1 = createProblemAnswer("What is the Software Development Life Cycle (SDLC)?", "The SDLC is a process for planning, creating, testing, and deploying an information system. It provides a structured approach to software development.");
        addTestToProblemAnswer(pa7a_1, test7a);
        addProblemAnswerToTest(test7a, pa7a_1);

        ProblemAnswer pa7a_2 = createProblemAnswer("What are the phases of the SDLC?", "The phases of the SDLC typically include: planning, requirements analysis, design, implementation (coding), testing, deployment, and maintenance.");
        addTestToProblemAnswer(pa7a_2, test7a);
        addProblemAnswerToTest(test7a, pa7a_2);

        ProblemAnswer pa7a_3 = createProblemAnswer("What is the iterative model in SDLC?", "The iterative model is a type of SDLC model where the software is developed in small, incremental cycles. Each iteration produces a working version of the software, which is improved upon in subsequent iterations.");
        addTestToProblemAnswer(pa7a_3, test7a);
        addProblemAnswerToTest(test7a, pa7a_3);

        ProblemAnswer pa7a_4 = createProblemAnswer("What is the incremental model in SDLC?", "The incremental model is a type of SDLC model where the software is developed and delivered in small, manageable increments. Each increment adds new functionality to the software.");
        addTestToProblemAnswer(pa7a_4, test7a);
        addProblemAnswerToTest(test7a, pa7a_4);

        ProblemAnswer pa7a_5 = createProblemAnswer("What is the spiral model in SDLC?", "The spiral model is a type of SDLC model that combines elements of both iterative and incremental models. It emphasizes risk assessment and mitigation, and consists of repeated cycles (spirals) of planning, risk analysis, engineering, and evaluation.");
        addTestToProblemAnswer(pa7a_5, test7a);
        addProblemAnswerToTest(test7a, pa7a_5);

// Output for confirmation
        System.out.println("Test for 'Software Development Life Cycle' unit created with 10 problem answers.");
// Creating the test for Unit 2: Agile
        Test test7b = createTest("Agile Test", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        addStudentToTest(test7b, student3);
        addStudentToTest(test7b, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa7b_1 = createProblemAnswer("What is Agile methodology?", "Agile methodology is an iterative approach to software development that emphasizes flexibility, collaboration, and customer feedback. It aims to deliver small, incremental improvements to the software throughout the development process.");
        addTestToProblemAnswer(pa7b_1, test7b);
        addProblemAnswerToTest(test7b, pa7b_1);

        ProblemAnswer pa7b_2 = createProblemAnswer("What are the principles of Agile?", "The principles of Agile include customer collaboration over contract negotiation, responding to change over following a plan, individuals and interactions over processes and tools, and working software over comprehensive documentation.");
        addTestToProblemAnswer(pa7b_2, test7b);
        addProblemAnswerToTest(test7b, pa7b_2);

        ProblemAnswer pa7b_3 = createProblemAnswer("What is Scrum in Agile?", "Scrum is a framework within Agile that uses fixed-length iterations called sprints to complete work. It involves roles like Scrum Master and Product Owner, and events like daily stand-ups, sprint planning, sprint review, and sprint retrospective.");
        addTestToProblemAnswer(pa7b_3, test7b);
        addProblemAnswerToTest(test7b, pa7b_3);

        ProblemAnswer pa7b_4 = createProblemAnswer("What is Kanban in Agile?", "Kanban is a visual framework within Agile that uses a board and cards to represent work items. It focuses on continuous delivery and improvement by visualizing workflow, limiting work in progress, and managing flow.");
        addTestToProblemAnswer(pa7b_4, test7b);
        addProblemAnswerToTest(test7b, pa7b_4);

        ProblemAnswer pa7b_5 = createProblemAnswer("How does Agile handle requirements?", "Agile handles requirements through user stories and backlogs. User stories capture individual requirements from the user's perspective, while backlogs prioritize and manage these stories for development.");
        addTestToProblemAnswer(pa7b_5, test7b);
        addProblemAnswerToTest(test7b, pa7b_5);

// Output for confirmation
        System.out.println("Test for 'Agile' unit created with 10 problem answers.");
// Creating the test for Unit 3: Waterfall
        Test test7c = createTest("Waterfall Test", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        addStudentToTest(test7c, student3);
        addStudentToTest(test7c, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa7c_1 = createProblemAnswer("What is the Waterfall model?", "The Waterfall model is a linear and sequential approach to software development, where each phase must be completed before the next phase begins. It follows a top-down approach.");
        addTestToProblemAnswer(pa7c_1, test7c);
        addProblemAnswerToTest(test7c, pa7c_1);

        ProblemAnswer pa7c_2 = createProblemAnswer("What are the phases of the Waterfall model?", "The phases of the Waterfall model include: 1) Requirements Analysis, 2) System Design, 3) Implementation (Coding), 4) Testing, 5) Deployment, and 6) Maintenance.");
        addTestToProblemAnswer(pa7c_2, test7c);
        addProblemAnswerToTest(test7c, pa7c_2);

        ProblemAnswer pa7c_3 = createProblemAnswer("What is the role of Requirements Analysis in the Waterfall model?", "Requirements Analysis is the first phase of the Waterfall model. It involves gathering and documenting the requirements and specifications of the software from stakeholders.");
        addTestToProblemAnswer(pa7c_3, test7c);
        addProblemAnswerToTest(test7c, pa7c_3);

        ProblemAnswer pa7c_4 = createProblemAnswer("What is the role of System Design in the Waterfall model?", "System Design is the second phase of the Waterfall model. It involves creating the architecture and design of the software based on the requirements gathered in the previous phase.");
        addTestToProblemAnswer(pa7c_4, test7c);
        addProblemAnswerToTest(test7c, pa7c_4);

        ProblemAnswer pa7c_5 = createProblemAnswer("What is the role of Implementation in the Waterfall model?", "Implementation, also known as Coding, is the third phase of the Waterfall model. It involves writing the actual code for the software based on the design created in the previous phase.");
        addTestToProblemAnswer(pa7c_5, test7c);
        addProblemAnswerToTest(test7c, pa7c_5);

// Output for confirmation
        System.out.println("Test for 'Waterfall' unit created with 10 problem answers.");
// Creating the test for Unit 4: Project Management
        Test test7d = createTest("Project Management Test", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        addStudentToTest(test7d, student3);
        addStudentToTest(test7d, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa7d_1 = createProblemAnswer("What is project management?", "Project management is the process of planning, organizing, and managing resources to achieve specific goals and objectives within a defined timeframe and budget.");
        addTestToProblemAnswer(pa7d_1, test7d);
        addProblemAnswerToTest(test7d, pa7d_1);

        ProblemAnswer pa7d_2 = createProblemAnswer("What are the key phases of project management?", "The key phases of project management include: 1) Initiation, 2) Planning, 3) Execution, 4) Monitoring and Controlling, and 5) Closing.");
        addTestToProblemAnswer(pa7d_2, test7d);
        addProblemAnswerToTest(test7d, pa7d_2);

        ProblemAnswer pa7d_3 = createProblemAnswer("What is the role of a project manager?", "The project manager is responsible for overseeing the project, ensuring that it is completed on time, within budget, and to the required quality standards. They coordinate the efforts of the project team and manage stakeholder expectations.");
        addTestToProblemAnswer(pa7d_3, test7d);
        addProblemAnswerToTest(test7d, pa7d_3);

        ProblemAnswer pa7d_4 = createProblemAnswer("What is a project charter?", "A project charter is a document that formally authorizes the project, outlining its objectives, scope, stakeholders, and key deliverables. It serves as a reference for decision-making and provides a clear direction for the project.");
        addTestToProblemAnswer(pa7d_4, test7d);
        addProblemAnswerToTest(test7d, pa7d_4);

        ProblemAnswer pa7d_5 = createProblemAnswer("What is a Gantt chart?", "A Gantt chart is a visual tool used in project management to represent the project schedule. It shows the start and end dates of project tasks, their dependencies, and progress over time.");
        addTestToProblemAnswer(pa7d_5, test7d);
        addProblemAnswerToTest(test7d, pa7d_5);

// Output for confirmation
        System.out.println("Test for 'Project Management' unit created with 10 problem answers.");
// Creating the test for Unit 1: HTML
        Test test8a = createTest("HTML Test", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        addStudentToTest(test8a, student3);
        addStudentToTest(test8a, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa8a_1 = createProblemAnswer("What is HTML?", "HTML (HyperText Markup Language) is the standard language used to create and structure content on web pages.");
        addTestToProblemAnswer(pa8a_1, test8a);
        addProblemAnswerToTest(test8a, pa8a_1);

        ProblemAnswer pa8a_2 = createProblemAnswer("What are HTML tags?", "HTML tags are the building blocks of HTML. They are used to create elements, such as paragraphs, headings, links, images, and more.");
        addTestToProblemAnswer(pa8a_2, test8a);
        addProblemAnswerToTest(test8a, pa8a_2);

        ProblemAnswer pa8a_3 = createProblemAnswer("What is the purpose of the <head> tag in HTML?", "The <head> tag contains metadata about the HTML document, such as the title, links to stylesheets, scripts, and other meta information.");
        addTestToProblemAnswer(pa8a_3, test8a);
        addProblemAnswerToTest(test8a, pa8a_3);

        ProblemAnswer pa8a_4 = createProblemAnswer("What is the <body> tag in HTML?", "The <body> tag contains the main content of the HTML document, including text, images, links, and other elements that are displayed on the web page.");
        addTestToProblemAnswer(pa8a_4, test8a);
        addProblemAnswerToTest(test8a, pa8a_4);

        ProblemAnswer pa8a_5 = createProblemAnswer("What is an attribute in HTML?", "An attribute provides additional information about an HTML element. Attributes are specified in the opening tag and consist of a name and value pair, such as class='example' or href='link.html'.");
        addTestToProblemAnswer(pa8a_5, test8a);
        addProblemAnswerToTest(test8a, pa8a_5);

// Output for confirmation
        System.out.println("Test for 'HTML' unit created with 10 problem answers.");
// Creating the test for Unit 2: CSS
        Test test8b = createTest("CSS Test", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        addStudentToTest(test8b, student3);
        addStudentToTest(test8b, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa8b_1 = createProblemAnswer("What is CSS?", "CSS (Cascading Style Sheets) is a language used to describe the presentation of a document written in HTML or XML. It controls the layout, colors, fonts, and overall visual appearance of web pages.");
        addTestToProblemAnswer(pa8b_1, test8b);
        addProblemAnswerToTest(test8b, pa8b_1);

        ProblemAnswer pa8b_2 = createProblemAnswer("How do you apply CSS to an HTML document?", "You can apply CSS to an HTML document using inline styles, internal stylesheets (within the <style> tag in the <head> section), or external stylesheets (linking to a .css file).");
        addTestToProblemAnswer(pa8b_2, test8b);
        addProblemAnswerToTest(test8b, pa8b_2);

        ProblemAnswer pa8b_3 = createProblemAnswer("What is the purpose of the class attribute in CSS?", "The class attribute is used to apply CSS styles to multiple elements by assigning the same class name to them. For example: .example-class { color: blue; }.");
        addTestToProblemAnswer(pa8b_3, test8b);
        addProblemAnswerToTest(test8b, pa8b_3);

        ProblemAnswer pa8b_4 = createProblemAnswer("What is the difference between id and class selectors in CSS?", "The id selector is used to apply styles to a single unique element, using the # symbol. The class selector is used to apply styles to multiple elements, using the . symbol. For example: #example-id { font-size: 20px; } and .example-class { color: blue; }.");
        addTestToProblemAnswer(pa8b_4, test8b);
        addProblemAnswerToTest(test8b, pa8b_4);

        ProblemAnswer pa8b_5 = createProblemAnswer("How do you create a CSS rule?", "A CSS rule consists of a selector and a declaration block. The selector targets the HTML elements to style, and the declaration block contains one or more declarations, each consisting of a property and a value. For example: p { color: red; font-size: 16px; }.");
        addTestToProblemAnswer(pa8b_5, test8b);
        addProblemAnswerToTest(test8b, pa8b_5);

// Output for confirmation
        System.out.println("Test for 'CSS' unit created with 10 problem answers.");
// Creating the test for Unit 3: JavaScript
        Test test8c = createTest("JavaScript Test", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        addStudentToTest(test8c, student3);
        addStudentToTest(test8c, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa8c_1 = createProblemAnswer("What is JavaScript?", "JavaScript is a programming language that allows you to create interactive and dynamic web content. It is widely used for client-side scripting on web pages.");
        addTestToProblemAnswer(pa8c_1, test8c);
        addProblemAnswerToTest(test8c, pa8c_1);

        ProblemAnswer pa8c_2 = createProblemAnswer("How do you include JavaScript in an HTML document?", "You can include JavaScript in an HTML document using the <script> tag, either inline within the HTML file or by linking to an external .js file.");
        addTestToProblemAnswer(pa8c_2, test8c);
        addProblemAnswerToTest(test8c, pa8c_2);

        ProblemAnswer pa8c_3 = createProblemAnswer("What is the Document Object Model (DOM)?", "The Document Object Model (DOM) is a programming interface for HTML and XML documents. It represents the page's structure as a tree of nodes, allowing you to manipulate the content and structure of web pages.");
        addTestToProblemAnswer(pa8c_3, test8c);
        addProblemAnswerToTest(test8c, pa8c_3);

        ProblemAnswer pa8c_4 = createProblemAnswer("How do you select an HTML element using JavaScript?", "You can select an HTML element using JavaScript methods like document.getElementById(), document.getElementsByClassName(), document.getElementsByTagName(), or document.querySelector().");
        addTestToProblemAnswer(pa8c_4, test8c);
        addProblemAnswerToTest(test8c, pa8c_4);

        ProblemAnswer pa8c_5 = createProblemAnswer("What is an event in JavaScript?", "An event is an action or occurrence that happens in the browser, such as a click, keypress, or page load. Events can be used to trigger JavaScript code to execute in response to user interactions.");
        addTestToProblemAnswer(pa8c_5, test8c);
        addProblemAnswerToTest(test8c, pa8c_5);

// Output for confirmation
        System.out.println("Test for 'JavaScript' unit created with 10 problem answers.");
// Creating the test for Unit 4: React
        Test test8d = createTest("React Test", faculty3, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        addStudentToTest(test8d, student3);
        addStudentToTest(test8d, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa8d_1 = createProblemAnswer("What is React?", "React is a popular JavaScript library for building user interfaces, particularly single-page applications. It allows developers to create reusable UI components.");
        addTestToProblemAnswer(pa8d_1, test8d);
        addProblemAnswerToTest(test8d, pa8d_1);

        ProblemAnswer pa8d_2 = createProblemAnswer("What is a component in React?", "A component in React is a reusable piece of UI that can be composed and nested within other components. Components can be functional or class-based.");
        addTestToProblemAnswer(pa8d_2, test8d);
        addProblemAnswerToTest(test8d, pa8d_2);

        ProblemAnswer pa8d_3 = createProblemAnswer("What is JSX in React?", "JSX (JavaScript XML) is a syntax extension for JavaScript that allows you to write HTML-like code within JavaScript. JSX makes it easier to create React elements and components.");
        addTestToProblemAnswer(pa8d_3, test8d);
        addProblemAnswerToTest(test8d, pa8d_3);

        ProblemAnswer pa8d_4 = createProblemAnswer("What is state in React?", "State is an object that represents the dynamic data of a component. It allows React components to respond to user input, network requests, and other events by re-rendering the UI.");
        addTestToProblemAnswer(pa8d_4, test8d);
        addProblemAnswerToTest(test8d, pa8d_4);

        ProblemAnswer pa8d_5 = createProblemAnswer("What are props in React?", "Props (short for properties) are read-only attributes that are passed from parent components to child components. They allow data to be shared and reused across components.");
        addTestToProblemAnswer(pa8d_5, test8d);
        addProblemAnswerToTest(test8d, pa8d_5);

// Output for confirmation
        System.out.println("Test for 'React' unit created with 10 problem answers.");
// Creating the test for Unit 5: Backend Integration
        Test test8e = createTest("Backend Integration Test", faculty3, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        addStudentToTest(test8e, student3);
        addStudentToTest(test8e, student4);

// Creating and adding problem answers to the test
        ProblemAnswer pa8e_1 = createProblemAnswer("What is a RESTful API?", "A RESTful API (Representational State Transfer) is an architectural style for building web services that use HTTP methods to perform CRUD operations on resources.");
        addTestToProblemAnswer(pa8e_1, test8e);
        addProblemAnswerToTest(test8e, pa8e_1);

        ProblemAnswer pa8e_2 = createProblemAnswer("What are the main HTTP methods used in RESTful APIs?", "The main HTTP methods used in RESTful APIs are GET (retrieve data), POST (create data), PUT (update data), DELETE (remove data), and PATCH (partially update data).");
        addTestToProblemAnswer(pa8e_2, test8e);
        addProblemAnswerToTest(test8e, pa8e_2);

        ProblemAnswer pa8e_3 = createProblemAnswer("What is server-side rendering?", "Server-side rendering (SSR) is the process of generating HTML content on the server instead of the client. It improves performance and SEO by delivering fully rendered pages to the client.");
        addTestToProblemAnswer(pa8e_3, test8e);
        addProblemAnswerToTest(test8e, pa8e_3);

        ProblemAnswer pa8e_4 = createProblemAnswer("What is client-side rendering?", "Client-side rendering (CSR) is the process of rendering web content in the browser using JavaScript. It allows for faster interactions after the initial page load but can impact performance and SEO.");
        addTestToProblemAnswer(pa8e_4, test8e);
        addProblemAnswerToTest(test8e, pa8e_4);

        ProblemAnswer pa8e_5 = createProblemAnswer("How do you fetch data from an API in JavaScript?", "You can fetch data from an API in JavaScript using the fetch() function or libraries like Axios. For example: fetch('https://api.example.com/data').then(response => response.json()).then(data => console.log(data));.");
        addTestToProblemAnswer(pa8e_5, test8e);
        addProblemAnswerToTest(test8e, pa8e_5);

// Output for confirmation
        System.out.println("Test for 'Backend Integration' unit created with 10 problem answers.");


        StudentAnswer sa5a_1_student3 = createStudentAnswer(student3, pa5a_1, "A process is an instance of a program in execution, including the program code, current activity, and allocated resources.");
        addStudentAnswerToProblemAnswer(pa5a_1, sa5a_1_student3);

        StudentAnswer sa5a_2_student3 = createStudentAnswer(student3, pa5a_2, "Process management involves handling the creation, scheduling, and termination of processes within an operating system.");
        addStudentAnswerToProblemAnswer(pa5a_2, sa5a_2_student3);

        StudentAnswer sa5a_3_student3 = createStudentAnswer(student3, pa5a_3, "Process scheduling is the method by which an operating system decides which processes to execute and in what order.");
        addStudentAnswerToProblemAnswer(pa5a_3, sa5a_3_student3);

        StudentAnswer sa5a_4_student3 = createStudentAnswer(student3, pa5a_4, "IPC is a mechanism that allows processes to communicate and synchronize their actions, using methods like message passing and shared memory.");
        addStudentAnswerToProblemAnswer(pa5a_4, sa5a_4_student3);

        StudentAnswer sa5a_5_student3 = createStudentAnswer(student3, pa5a_5, "The states of a process include new, ready, running, waiting, and terminated.");
        addStudentAnswerToProblemAnswer(pa5a_5, sa5a_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa5a_1_student4 = createStudentAnswer(student4, pa5a_1, "A process is an instance of a program in execution, including the program code, current activity, and allocated resources.");
        addStudentAnswerToProblemAnswer(pa5a_1, sa5a_1_student4);

        StudentAnswer sa5a_2_student4 = createStudentAnswer(student4, pa5a_2, "Process management involves handling the creation, scheduling, and termination of processes within an operating system.");
        addStudentAnswerToProblemAnswer(pa5a_2, sa5a_2_student4);

        StudentAnswer sa5a_3_student4 = createStudentAnswer(student4, pa5a_3, "Process scheduling is the method by which an operating system decides which processes to execute and in what order.");
        addStudentAnswerToProblemAnswer(pa5a_3, sa5a_3_student4);

        StudentAnswer sa5a_4_student4 = createStudentAnswer(student4, pa5a_4, "IPC is a mechanism that allows processes to communicate and synchronize their actions, using methods like message passing and shared memory.");
        addStudentAnswerToProblemAnswer(pa5a_4, sa5a_4_student4);

        StudentAnswer sa5a_5_student4 = createStudentAnswer(student4, pa5a_5, "The states of a process include new, ready, running, waiting, and terminated.");
        addStudentAnswerToProblemAnswer(pa5a_5, sa5a_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa5b_1_student3 = createStudentAnswer(student3, pa5b_1, "Memory management is the process by which an operating system handles the allocation, tracking, and deallocation of memory resources.");
        addStudentAnswerToProblemAnswer(pa5b_1, sa5b_1_student3);

        StudentAnswer sa5b_2_student3 = createStudentAnswer(student3, pa5b_2, "Paging is a memory management scheme that eliminates the need for contiguous allocation of physical memory by dividing memory into fixed-size blocks called pages.");
        addStudentAnswerToProblemAnswer(pa5b_2, sa5b_2_student3);

        StudentAnswer sa5b_3_student3 = createStudentAnswer(student3, pa5b_3, "Segmentation is a memory management technique that divides memory into variable-sized segments, each of which can correspond to different parts of a program, such as code, data, and stack.");
        addStudentAnswerToProblemAnswer(pa5b_3, sa5b_3_student3);

        StudentAnswer sa5b_4_student3 = createStudentAnswer(student3, pa5b_4, "Virtual memory is a memory management technique that gives an application the impression it has contiguous working memory while actually using physical memory fragmented in different locations.");
        addStudentAnswerToProblemAnswer(pa5b_4, sa5b_4_student3);

        StudentAnswer sa5b_5_student3 = createStudentAnswer(student3, pa5b_5, "A page table is a data structure used in paging that maps virtual addresses to physical addresses.");
        addStudentAnswerToProblemAnswer(pa5b_5, sa5b_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa5b_1_student4 = createStudentAnswer(student4, pa5b_1, "Memory management is the process by which an operating system handles the allocation, tracking, and deallocation of memory resources.");
        addStudentAnswerToProblemAnswer(pa5b_1, sa5b_1_student4);

        StudentAnswer sa5b_2_student4 = createStudentAnswer(student4, pa5b_2, "Paging is a memory management scheme that eliminates the need for contiguous allocation of physical memory by dividing memory into fixed-size blocks called pages.");
        addStudentAnswerToProblemAnswer(pa5b_2, sa5b_2_student4);

        StudentAnswer sa5b_3_student4 = createStudentAnswer(student4, pa5b_3, "Segmentation is a memory management technique that divides memory into variable-sized segments, each of which can correspond to different parts of a program, such as code, data, and stack.");
        addStudentAnswerToProblemAnswer(pa5b_3, sa5b_3_student4);

        StudentAnswer sa5b_4_student4 = createStudentAnswer(student4, pa5b_4, "Virtual memory is a memory management technique that gives an application the impression it has contiguous working memory while actually using physical memory fragmented in different locations.");
        addStudentAnswerToProblemAnswer(pa5b_4, sa5b_4_student4);

        StudentAnswer sa5b_5_student4 = createStudentAnswer(student4, pa5b_5, "A page table is a data structure used in paging that maps virtual addresses to physical addresses.");
        addStudentAnswerToProblemAnswer(pa5b_5, sa5b_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa5c_1_student3 = createStudentAnswer(student3, pa5c_1, "A file system is a method used by an operating system to organize, store, retrieve, and manage files and directories on a storage device.");
        addStudentAnswerToProblemAnswer(pa5c_1, sa5c_1_student3);

        StudentAnswer sa5c_2_student3 = createStudentAnswer(student3, pa5c_2, "The main functions of a file system include file creation and deletion, directory creation and deletion, file manipulation, and file access control.");
        addStudentAnswerToProblemAnswer(pa5c_2, sa5c_2_student3);

        StudentAnswer sa5c_3_student3 = createStudentAnswer(student3, pa5c_3, "File organization refers to the way files are arranged and managed on a storage device, ensuring efficient access and retrieval.");
        addStudentAnswerToProblemAnswer(pa5c_3, sa5c_3_student3);

        StudentAnswer sa5c_4_student3 = createStudentAnswer(student3, pa5c_4, "A directory structure is a hierarchical arrangement of directories and subdirectories that organize files in a systematic way.");
        addStudentAnswerToProblemAnswer(pa5c_4, sa5c_4_student3);

        StudentAnswer sa5c_5_student3 = createStudentAnswer(student3, pa5c_5, "Storage allocation is the process of assigning physical storage space to files and directories on a storage device.");
        addStudentAnswerToProblemAnswer(pa5c_5, sa5c_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa5c_1_student4 = createStudentAnswer(student4, pa5c_1, "A file system is a method used by an operating system to organize, store, retrieve, and manage files and directories on a storage device.");
        addStudentAnswerToProblemAnswer(pa5c_1, sa5c_1_student4);

        StudentAnswer sa5c_2_student4 = createStudentAnswer(student4, pa5c_2, "The main functions of a file system include file creation and deletion, directory creation and deletion, file manipulation, and file access control.");
        addStudentAnswerToProblemAnswer(pa5c_2, sa5c_2_student4);

        StudentAnswer sa5c_3_student4 = createStudentAnswer(student4, pa5c_3, "File organization refers to the way files are arranged and managed on a storage device, ensuring efficient access and retrieval.");
        addStudentAnswerToProblemAnswer(pa5c_3, sa5c_3_student4);

        StudentAnswer sa5c_4_student4 = createStudentAnswer(student4, pa5c_4, "A directory structure is a hierarchical arrangement of directories and subdirectories that organize files in a systematic way.");
        addStudentAnswerToProblemAnswer(pa5c_4, sa5c_4_student4);

        StudentAnswer sa5c_5_student4 = createStudentAnswer(student4, pa5c_5, "Storage allocation is the process of assigning physical storage space to files and directories on a storage device.");
        addStudentAnswerToProblemAnswer(pa5c_5, sa5c_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa5d_1_student3 = createStudentAnswer(student3, pa5d_1, "CPU scheduling is the process by which the operating system decides which processes to run, in what order, and for how long, to ensure efficient use of the CPU.");
        addStudentAnswerToProblemAnswer(pa5d_1, sa5d_1_student3);

        StudentAnswer sa5d_2_student3 = createStudentAnswer(student3, pa5d_2, "Scheduling algorithms determine the order and time allocation for processes to ensure fair and efficient CPU utilization, reduce waiting time, and improve overall system performance.");
        addStudentAnswerToProblemAnswer(pa5d_2, sa5d_2_student3);

        StudentAnswer sa5d_3_student3 = createStudentAnswer(student3, pa5d_3, "The round-robin scheduling algorithm allocates a fixed time slice, or quantum, to each process in the ready queue in a cyclic order. When a process's time slice expires, it is moved to the back of the queue.");
        addStudentAnswerToProblemAnswer(pa5d_3, sa5d_3_student3);

        StudentAnswer sa5d_4_student3 = createStudentAnswer(student3, pa5d_4, "Priority scheduling assigns a priority to each process, and the CPU is allocated to the process with the highest priority. Lower-priority processes are preempted by higher-priority processes.");
        addStudentAnswerToProblemAnswer(pa5d_4, sa5d_4_student3);

        StudentAnswer sa5d_5_student3 = createStudentAnswer(student3, pa5d_5, "Multi-level queue scheduling divides the ready queue into several queues based on process priority or type. Each queue can have its own scheduling algorithm, and processes are assigned to queues permanently or dynamically.");
        addStudentAnswerToProblemAnswer(pa5d_5, sa5d_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa5d_1_student4 = createStudentAnswer(student4, pa5d_1, "CPU scheduling is the process by which the operating system decides which processes to run, in what order, and for how long, to ensure efficient use of the CPU.");
        addStudentAnswerToProblemAnswer(pa5d_1, sa5d_1_student4);

        StudentAnswer sa5d_2_student4 = createStudentAnswer(student4, pa5d_2, "Scheduling algorithms determine the order and time allocation for processes to ensure fair and efficient CPU utilization, reduce waiting time, and improve overall system performance.");
        addStudentAnswerToProblemAnswer(pa5d_2, sa5d_2_student4);

        StudentAnswer sa5d_3_student4 = createStudentAnswer(student4, pa5d_3, "The round-robin scheduling algorithm allocates a fixed time slice, or quantum, to each process in the ready queue in a cyclic order. When a process's time slice expires, it is moved to the back of the queue.");
        addStudentAnswerToProblemAnswer(pa5d_3, sa5d_3_student4);

        StudentAnswer sa5d_4_student4 = createStudentAnswer(student4, pa5d_4, "Priority scheduling assigns a priority to each process, and the CPU is allocated to the process with the highest priority. Lower-priority processes are preempted by higher-priority processes.");
        addStudentAnswerToProblemAnswer(pa5d_4, sa5d_4_student4);

        StudentAnswer sa5d_5_student4 = createStudentAnswer(student4, pa5d_5, "Multi-level queue scheduling divides the ready queue into several queues based on process priority or type. Each queue can have its own scheduling algorithm, and processes are assigned to queues permanently or dynamically.");
        addStudentAnswerToProblemAnswer(pa5d_5, sa5d_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa6a_1_student3 = createStudentAnswer(student3, pa6a_1, "The OSI (Open Systems Interconnection) model is a conceptual framework that standardizes the functions of a telecommunication or computing system into seven distinct layers.");
        addStudentAnswerToProblemAnswer(pa6a_1, sa6a_1_student3);

        StudentAnswer sa6a_2_student3 = createStudentAnswer(student3, pa6a_2, "The seven layers of the OSI model are: 1) Physical, 2) Data Link, 3) Network, 4) Transport, 5) Session, 6) Presentation, and 7) Application.");
        addStudentAnswerToProblemAnswer(pa6a_2, sa6a_2_student3);

        StudentAnswer sa6a_3_student3 = createStudentAnswer(student3, pa6a_3, "The Physical layer is responsible for transmitting raw data bits over a physical medium, such as cables, and defining the hardware specifications.");
        addStudentAnswerToProblemAnswer(pa6a_3, sa6a_3_student3);

        StudentAnswer sa6a_4_student3 = createStudentAnswer(student3, pa6a_4, "The Data Link layer is responsible for establishing, maintaining, and terminating data links between nodes. It ensures reliable data transfer and handles error detection and correction.");
        addStudentAnswerToProblemAnswer(pa6a_4, sa6a_4_student3);

        StudentAnswer sa6a_5_student3 = createStudentAnswer(student3, pa6a_5, "The Network layer is responsible for routing data packets between nodes on different networks. It determines the best path for data transmission and handles logical addressing.");
        addStudentAnswerToProblemAnswer(pa6a_5, sa6a_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa6a_1_student4 = createStudentAnswer(student4, pa6a_1, "The OSI (Open Systems Interconnection) model is a conceptual framework that standardizes the functions of a telecommunication or computing system into seven distinct layers.");
        addStudentAnswerToProblemAnswer(pa6a_1, sa6a_1_student4);

        StudentAnswer sa6a_2_student4 = createStudentAnswer(student4, pa6a_2, "The seven layers of the OSI model are: 1) Physical, 2) Data Link, 3) Network, 4) Transport, 5) Session, 6) Presentation, and 7) Application.");
        addStudentAnswerToProblemAnswer(pa6a_2, sa6a_2_student4);

        StudentAnswer sa6a_3_student4 = createStudentAnswer(student4, pa6a_3, "The Physical layer is responsible for transmitting raw data bits over a physical medium, such as cables, and defining the hardware specifications.");
        addStudentAnswerToProblemAnswer(pa6a_3, sa6a_3_student4);

        StudentAnswer sa6a_4_student4 = createStudentAnswer(student4, pa6a_4, "The Data Link layer is responsible for establishing, maintaining, and terminating data links between nodes. It ensures reliable data transfer and handles error detection and correction.");
        addStudentAnswerToProblemAnswer(pa6a_4, sa6a_4_student4);

        StudentAnswer sa6a_5_student4 = createStudentAnswer(student4, pa6a_5, "The Network layer is responsible for routing data packets between nodes on different networks. It determines the best path for data transmission and handles logical addressing.");
        addStudentAnswerToProblemAnswer(pa6a_5, sa6a_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa6b_1_student3 = createStudentAnswer(student3, pa6b_1, "The TCP/IP (Transmission Control Protocol/Internet Protocol) model is a foundational protocol suite for the internet, consisting of four layers: Link, Internet, Transport, and Application.");
        addStudentAnswerToProblemAnswer(pa6b_1, sa6b_1_student3);

        StudentAnswer sa6b_2_student3 = createStudentAnswer(student3, pa6b_2, "The layers of the TCP/IP model are: 1) Link, 2) Internet, 3) Transport, and 4) Application.");
        addStudentAnswerToProblemAnswer(pa6b_2, sa6b_2_student3);

        StudentAnswer sa6b_3_student3 = createStudentAnswer(student3, pa6b_3, "The Link layer is responsible for physical addressing, frame formatting, and error detection on the physical network. It includes protocols like Ethernet and Wi-Fi.");
        addStudentAnswerToProblemAnswer(pa6b_3, sa6b_3_student3);

        StudentAnswer sa6b_4_student3 = createStudentAnswer(student3, pa6b_4, "The Internet layer is responsible for logical addressing, routing, and packet fragmentation. It includes protocols like IP (Internet Protocol) and ICMP (Internet Control Message Protocol).");
        addStudentAnswerToProblemAnswer(pa6b_4, sa6b_4_student3);

        StudentAnswer sa6b_5_student3 = createStudentAnswer(student3, pa6b_5, "The Transport layer is responsible for ensuring reliable data transfer, error detection, and flow control. It includes protocols like TCP (Transmission Control Protocol) and UDP (User Datagram Protocol).");
        addStudentAnswerToProblemAnswer(pa6b_5, sa6b_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa6b_1_student4 = createStudentAnswer(student4, pa6b_1, "The TCP/IP (Transmission Control Protocol/Internet Protocol) model is a foundational protocol suite for the internet, consisting of four layers: Link, Internet, Transport, and Application.");
        addStudentAnswerToProblemAnswer(pa6b_1, sa6b_1_student4);

        StudentAnswer sa6b_2_student4 = createStudentAnswer(student4, pa6b_2, "The layers of the TCP/IP model are: 1) Link, 2) Internet, 3) Transport, and 4) Application.");
        addStudentAnswerToProblemAnswer(pa6b_2, sa6b_2_student4);

        StudentAnswer sa6b_3_student4 = createStudentAnswer(student4, pa6b_3, "The Link layer is responsible for physical addressing, frame formatting, and error detection on the physical network. It includes protocols like Ethernet and Wi-Fi.");
        addStudentAnswerToProblemAnswer(pa6b_3, sa6b_3_student4);

        StudentAnswer sa6b_4_student4 = createStudentAnswer(student4, pa6b_4, "The Internet layer is responsible for logical addressing, routing, and packet fragmentation. It includes protocols like IP (Internet Protocol) and ICMP (Internet Control Message Protocol).");
        addStudentAnswerToProblemAnswer(pa6b_4, sa6b_4_student4);

        StudentAnswer sa6b_5_student4 = createStudentAnswer(student4, pa6b_5, "The Transport layer is responsible for ensuring reliable data transfer, error detection, and flow control. It includes protocols like TCP (Transmission Control Protocol) and UDP (User Datagram Protocol).");
        addStudentAnswerToProblemAnswer(pa6b_5, sa6b_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa6c_1_student3 = createStudentAnswer(student3, pa6c_1, "HTTP (Hypertext Transfer Protocol) is a protocol used for transmitting web pages over the internet. It defines how messages are formatted and transmitted, and how web servers and browsers should respond to various commands.");
        addStudentAnswerToProblemAnswer(pa6c_1, sa6c_1_student3);

        StudentAnswer sa6c_2_student3 = createStudentAnswer(student3, pa6c_2, "FTP (File Transfer Protocol) is a protocol used for transferring files between computers over a network. It provides a way to upload and download files to and from a server.");
        addStudentAnswerToProblemAnswer(pa6c_2, sa6c_2_student3);

        StudentAnswer sa6c_3_student3 = createStudentAnswer(student3, pa6c_3, "DNS (Domain Name System) is a protocol that translates human-readable domain names (like www.example.com) into IP addresses that computers use to identify each other on the network.");
        addStudentAnswerToProblemAnswer(pa6c_3, sa6c_3_student3);

        StudentAnswer sa6c_4_student3 = createStudentAnswer(student3, pa6c_4, "DHCP (Dynamic Host Configuration Protocol) is a protocol used to automatically assign IP addresses and other network configuration parameters to devices on a network, allowing them to communicate with other IP networks.");
        addStudentAnswerToProblemAnswer(pa6c_4, sa6c_4_student3);

        StudentAnswer sa6c_5_student3 = createStudentAnswer(student3, pa6c_5, "SMTP (Simple Mail Transfer Protocol) is a protocol used for sending and receiving email messages between servers. It handles the routing of emails across the internet.");
        addStudentAnswerToProblemAnswer(pa6c_5, sa6c_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa6c_1_student4 = createStudentAnswer(student4, pa6c_1, "HTTP (Hypertext Transfer Protocol) is a protocol used for transmitting web pages over the internet. It defines how messages are formatted and transmitted, and how web servers and browsers should respond to various commands.");
        addStudentAnswerToProblemAnswer(pa6c_1, sa6c_1_student4);

        StudentAnswer sa6c_2_student4 = createStudentAnswer(student4, pa6c_2, "FTP (File Transfer Protocol) is a protocol used for transferring files between computers over a network. It provides a way to upload and download files to and from a server.");
        addStudentAnswerToProblemAnswer(pa6c_2, sa6c_2_student4);

        StudentAnswer sa6c_3_student4 = createStudentAnswer(student4, pa6c_3, "DNS (Domain Name System) is a protocol that translates human-readable domain names (like www.example.com) into IP addresses that computers use to identify each other on the network.");
        addStudentAnswerToProblemAnswer(pa6c_3, sa6c_3_student4);

        StudentAnswer sa6c_4_student4 = createStudentAnswer(student4, pa6c_4, "DHCP (Dynamic Host Configuration Protocol) is a protocol used to automatically assign IP addresses and other network configuration parameters to devices on a network, allowing them to communicate with other IP networks.");
        addStudentAnswerToProblemAnswer(pa6c_4, sa6c_4_student4);

        StudentAnswer sa6c_5_student4 = createStudentAnswer(student4, pa6c_5, "SMTP (Simple Mail Transfer Protocol) is a protocol used for sending and receiving email messages between servers. It handles the routing of emails across the internet.");
        addStudentAnswerToProblemAnswer(pa6c_5, sa6c_5_student4);


        // Creating StudentAnswer instances for student3
        StudentAnswer sa6d_1_student3 = createStudentAnswer(student3, pa6d_1, "Routing is the process of selecting paths in a network along which to send data packets from a source to a destination.");
        addStudentAnswerToProblemAnswer(pa6d_1, sa6d_1_student3);

        StudentAnswer sa6d_2_student3 = createStudentAnswer(student3, pa6d_2, "Routing algorithms are techniques used to determine the best path for data packets to travel across a network. Examples include distance vector and link-state algorithms.");
        addStudentAnswerToProblemAnswer(pa6d_2, sa6d_2_student3);

        StudentAnswer sa6d_3_student3 = createStudentAnswer(student3, pa6d_3, "Static routing involves manually configuring routes, which remain fixed, while dynamic routing uses algorithms and protocols to automatically adjust routes based on network conditions.");
        addStudentAnswerToProblemAnswer(pa6d_3, sa6d_3_student3);

        StudentAnswer sa6d_4_student3 = createStudentAnswer(student3, pa6d_4, "OSPF (Open Shortest Path First) is a link-state routing protocol used to find the best path for data packets in an IP network. It uses the shortest path first algorithm to build and calculate the shortest path to all known destinations.");
        addStudentAnswerToProblemAnswer(pa6d_4, sa6d_4_student3);

        StudentAnswer sa6d_5_student3 = createStudentAnswer(student3, pa6d_5, "BGP (Border Gateway Protocol) is an exterior gateway protocol used to exchange routing information between different autonomous systems on the internet. It determines the best paths for data transmission based on various criteria, such as path attributes and policies.");
        addStudentAnswerToProblemAnswer(pa6d_5, sa6d_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa6d_1_student4 = createStudentAnswer(student4, pa6d_1, "Routing is the process of selecting paths in a network along which to send data packets from a source to a destination.");
        addStudentAnswerToProblemAnswer(pa6d_1, sa6d_1_student4);

        StudentAnswer sa6d_2_student4 = createStudentAnswer(student4, pa6d_2, "Routing algorithms are techniques used to determine the best path for data packets to travel across a network. Examples include distance vector and link-state algorithms.");
        addStudentAnswerToProblemAnswer(pa6d_2, sa6d_2_student4);

        StudentAnswer sa6d_3_student4 = createStudentAnswer(student4, pa6d_3, "Static routing involves manually configuring routes, which remain fixed, while dynamic routing uses algorithms and protocols to automatically adjust routes based on network conditions.");
        addStudentAnswerToProblemAnswer(pa6d_3, sa6d_3_student4);

        StudentAnswer sa6d_4_student4 = createStudentAnswer(student4, pa6d_4, "OSPF (Open Shortest Path First) is a link-state routing protocol used to find the best path for data packets in an IP network. It uses the shortest path first algorithm to build and calculate the shortest path to all known destinations.");
        addStudentAnswerToProblemAnswer(pa6d_4, sa6d_4_student4);

        StudentAnswer sa6d_5_student4 = createStudentAnswer(student4, pa6d_5, "BGP (Border Gateway Protocol) is an exterior gateway protocol used to exchange routing information between different autonomous systems on the internet. It determines the best paths for data transmission based on various criteria, such as path attributes and policies.");
        addStudentAnswerToProblemAnswer(pa6d_5, sa6d_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa6e_1_student3 = createStudentAnswer(student3, pa6e_1, "Switching is the technique used to forward data packets from one device to another within a network. It determines the path that data packets take through the network.");
        addStudentAnswerToProblemAnswer(pa6e_1, sa6e_1_student3);

        StudentAnswer sa6e_2_student3 = createStudentAnswer(student3, pa6e_2, "Types of switches include unmanaged switches, managed switches, smart switches, and layer 3 switches. Each type offers different levels of configuration and control.");
        addStudentAnswerToProblemAnswer(pa6e_2, sa6e_2_student3);

        StudentAnswer sa6e_3_student3 = createStudentAnswer(student3, pa6e_3, "Packet switching is a method of data transmission where data is broken into packets, each of which is transmitted independently across the network. Packets are reassembled at the destination.");
        addStudentAnswerToProblemAnswer(pa6e_3, sa6e_3_student3);

        StudentAnswer sa6e_4_student3 = createStudentAnswer(student3, pa6e_4, "Circuit switching is a method of data transmission where a dedicated communication path is established between two devices for the duration of the connection. It is commonly used in traditional telephone networks.");
        addStudentAnswerToProblemAnswer(pa6e_4, sa6e_4_student3);

        StudentAnswer sa6e_5_student3 = createStudentAnswer(student3, pa6e_5, "A switch operates at the data link layer (Layer 2) of the OSI model. It connects devices within a local area network (LAN) and uses MAC addresses to forward data to the correct destination.");
        addStudentAnswerToProblemAnswer(pa6e_5, sa6e_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa6e_1_student4 = createStudentAnswer(student4, pa6e_1, "Switching is the technique used to forward data packets from one device to another within a network. It determines the path that data packets take through the network.");
        addStudentAnswerToProblemAnswer(pa6e_1, sa6e_1_student4);

        StudentAnswer sa6e_2_student4 = createStudentAnswer(student4, pa6e_2, "Types of switches include unmanaged switches, managed switches, smart switches, and layer 3 switches. Each type offers different levels of configuration and control.");
        addStudentAnswerToProblemAnswer(pa6e_2, sa6e_2_student4);

        StudentAnswer sa6e_3_student4 = createStudentAnswer(student4, pa6e_3, "Packet switching is a method of data transmission where data is broken into packets, each of which is transmitted independently across the network. Packets are reassembled at the destination.");
        addStudentAnswerToProblemAnswer(pa6e_3, sa6e_3_student4);

        StudentAnswer sa6e_4_student4 = createStudentAnswer(student4, pa6e_4, "Circuit switching is a method of data transmission where a dedicated communication path is established between two devices for the duration of the connection. It is commonly used in traditional telephone networks.");
        addStudentAnswerToProblemAnswer(pa6e_4, sa6e_4_student4);

        StudentAnswer sa6e_5_student4 = createStudentAnswer(student4, pa6e_5, "A switch operates at the data link layer (Layer 2) of the OSI model. It connects devices within a local area network (LAN) and uses MAC addresses to forward data to the correct destination.");
        addStudentAnswerToProblemAnswer(pa6e_5, sa6e_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa7a_1_student3 = createStudentAnswer(student3, pa7a_1, "The SDLC is a process for planning, creating, testing, and deploying an information system. It provides a structured approach to software development.");
        addStudentAnswerToProblemAnswer(pa7a_1, sa7a_1_student3);

        StudentAnswer sa7a_2_student3 = createStudentAnswer(student3, pa7a_2, "The phases of the SDLC typically include: planning, requirements analysis, design, implementation (coding), testing, deployment, and maintenance.");
        addStudentAnswerToProblemAnswer(pa7a_2, sa7a_2_student3);

        StudentAnswer sa7a_3_student3 = createStudentAnswer(student3, pa7a_3, "The iterative model is a type of SDLC model where the software is developed in small, incremental cycles. Each iteration produces a working version of the software, which is improved upon in subsequent iterations.");
        addStudentAnswerToProblemAnswer(pa7a_3, sa7a_3_student3);

        StudentAnswer sa7a_4_student3 = createStudentAnswer(student3, pa7a_4, "The incremental model is a type of SDLC model where the software is developed and delivered in small, manageable increments. Each increment adds new functionality to the software.");
        addStudentAnswerToProblemAnswer(pa7a_4, sa7a_4_student3);

        StudentAnswer sa7a_5_student3 = createStudentAnswer(student3, pa7a_5, "The spiral model is a type of SDLC model that combines elements of both iterative and incremental models. It emphasizes risk assessment and mitigation, and consists of repeated cycles (spirals) of planning, risk analysis, engineering, and evaluation.");
        addStudentAnswerToProblemAnswer(pa7a_5, sa7a_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa7a_1_student4 = createStudentAnswer(student4, pa7a_1, "The SDLC is a process for planning, creating, testing, and deploying an information system. It provides a structured approach to software development.");
        addStudentAnswerToProblemAnswer(pa7a_1, sa7a_1_student4);

        StudentAnswer sa7a_2_student4 = createStudentAnswer(student4, pa7a_2, "The phases of the SDLC typically include: planning, requirements analysis, design, implementation (coding), testing, deployment, and maintenance.");
        addStudentAnswerToProblemAnswer(pa7a_2, sa7a_2_student4);

        StudentAnswer sa7a_3_student4 = createStudentAnswer(student4, pa7a_3, "The iterative model is a type of SDLC model where the software is developed in small, incremental cycles. Each iteration produces a working version of the software, which is improved upon in subsequent iterations.");
        addStudentAnswerToProblemAnswer(pa7a_3, sa7a_3_student4);

        StudentAnswer sa7a_4_student4 = createStudentAnswer(student4, pa7a_4, "The incremental model is a type of SDLC model where the software is developed and delivered in small, manageable increments. Each increment adds new functionality to the software.");
        addStudentAnswerToProblemAnswer(pa7a_4, sa7a_4_student4);

        StudentAnswer sa7a_5_student4 = createStudentAnswer(student4, pa7a_5, "The spiral model is a type of SDLC model that combines elements of both iterative and incremental models. It emphasizes risk assessment and mitigation, and consists of repeated cycles (spirals) of planning, risk analysis, engineering, and evaluation.");
        addStudentAnswerToProblemAnswer(pa7a_5, sa7a_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa7b_1_student3 = createStudentAnswer(student3, pa7b_1, "Agile methodology is an iterative approach to software development that emphasizes flexibility, collaboration, and customer feedback. It aims to deliver small, incremental improvements to the software throughout the development process.");
        addStudentAnswerToProblemAnswer(pa7b_1, sa7b_1_student3);

        StudentAnswer sa7b_2_student3 = createStudentAnswer(student3, pa7b_2, "The principles of Agile include customer collaboration over contract negotiation, responding to change over following a plan, individuals and interactions over processes and tools, and working software over comprehensive documentation.");
        addStudentAnswerToProblemAnswer(pa7b_2, sa7b_2_student3);

        StudentAnswer sa7b_3_student3 = createStudentAnswer(student3, pa7b_3, "Scrum is a framework within Agile that uses fixed-length iterations called sprints to complete work. It involves roles like Scrum Master and Product Owner, and events like daily stand-ups, sprint planning, sprint review, and sprint retrospective.");
        addStudentAnswerToProblemAnswer(pa7b_3, sa7b_3_student3);

        StudentAnswer sa7b_4_student3 = createStudentAnswer(student3, pa7b_4, "Kanban is a visual framework within Agile that uses a board and cards to represent work items. It focuses on continuous delivery and improvement by visualizing workflow, limiting work in progress, and managing flow.");
        addStudentAnswerToProblemAnswer(pa7b_4, sa7b_4_student3);

        StudentAnswer sa7b_5_student3 = createStudentAnswer(student3, pa7b_5, "Agile handles requirements through user stories and backlogs. User stories capture individual requirements from the user's perspective, while backlogs prioritize and manage these stories for development.");
        addStudentAnswerToProblemAnswer(pa7b_5, sa7b_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa7b_1_student4 = createStudentAnswer(student4, pa7b_1, "Agile methodology is an iterative approach to software development that emphasizes flexibility, collaboration, and customer feedback. It aims to deliver small, incremental improvements to the software throughout the development process.");
        addStudentAnswerToProblemAnswer(pa7b_1, sa7b_1_student4);

        StudentAnswer sa7b_2_student4 = createStudentAnswer(student4, pa7b_2, "The principles of Agile include customer collaboration over contract negotiation, responding to change over following a plan, individuals and interactions over processes and tools, and working software over comprehensive documentation.");
        addStudentAnswerToProblemAnswer(pa7b_2, sa7b_2_student4);

        StudentAnswer sa7b_3_student4 = createStudentAnswer(student4, pa7b_3, "Scrum is a framework within Agile that uses fixed-length iterations called sprints to complete work. It involves roles like Scrum Master and Product Owner, and events like daily stand-ups, sprint planning, sprint review, and sprint retrospective.");
        addStudentAnswerToProblemAnswer(pa7b_3, sa7b_3_student4);

        StudentAnswer sa7b_4_student4 = createStudentAnswer(student4, pa7b_4, "Kanban is a visual framework within Agile that uses a board and cards to represent work items. It focuses on continuous delivery and improvement by visualizing workflow, limiting work in progress, and managing flow.");
        addStudentAnswerToProblemAnswer(pa7b_4, sa7b_4_student4);

        StudentAnswer sa7b_5_student4 = createStudentAnswer(student4, pa7b_5, "Agile handles requirements through user stories and backlogs. User stories capture individual requirements from the user's perspective, while backlogs prioritize and manage these stories for development.");
        addStudentAnswerToProblemAnswer(pa7b_5, sa7b_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa7c_1_student3 = createStudentAnswer(student3, pa7c_1, "The Waterfall model is a linear and sequential approach to software development, where each phase must be completed before the next phase begins. It follows a top-down approach.");
        addStudentAnswerToProblemAnswer(pa7c_1, sa7c_1_student3);

        StudentAnswer sa7c_2_student3 = createStudentAnswer(student3, pa7c_2, "The phases of the Waterfall model include: 1) Requirements Analysis, 2) System Design, 3) Implementation (Coding), 4) Testing, 5) Deployment, and 6) Maintenance.");
        addStudentAnswerToProblemAnswer(pa7c_2, sa7c_2_student3);

        StudentAnswer sa7c_3_student3 = createStudentAnswer(student3, pa7c_3, "Requirements Analysis is the first phase of the Waterfall model. It involves gathering and documenting the requirements and specifications of the software from stakeholders.");
        addStudentAnswerToProblemAnswer(pa7c_3, sa7c_3_student3);

        StudentAnswer sa7c_4_student3 = createStudentAnswer(student3, pa7c_4, "System Design is the second phase of the Waterfall model. It involves creating the architecture and design of the software based on the requirements gathered in the previous phase.");
        addStudentAnswerToProblemAnswer(pa7c_4, sa7c_4_student3);

        StudentAnswer sa7c_5_student3 = createStudentAnswer(student3, pa7c_5, "Implementation, also known as Coding, is the third phase of the Waterfall model. It involves writing the actual code for the software based on the design created in the previous phase.");
        addStudentAnswerToProblemAnswer(pa7c_5, sa7c_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa7c_1_student4 = createStudentAnswer(student4, pa7c_1, "The Waterfall model is a linear and sequential approach to software development, where each phase must be completed before the next phase begins. It follows a top-down approach.");
        addStudentAnswerToProblemAnswer(pa7c_1, sa7c_1_student4);

        StudentAnswer sa7c_2_student4 = createStudentAnswer(student4, pa7c_2, "The phases of the Waterfall model include: 1) Requirements Analysis, 2) System Design, 3) Implementation (Coding), 4) Testing, 5) Deployment, and 6) Maintenance.");
        addStudentAnswerToProblemAnswer(pa7c_2, sa7c_2_student4);

        StudentAnswer sa7c_3_student4 = createStudentAnswer(student4, pa7c_3, "Requirements Analysis is the first phase of the Waterfall model. It involves gathering and documenting the requirements and specifications of the software from stakeholders.");
        addStudentAnswerToProblemAnswer(pa7c_3, sa7c_3_student4);

        StudentAnswer sa7c_4_student4 = createStudentAnswer(student4, pa7c_4, "System Design is the second phase of the Waterfall model. It involves creating the architecture and design of the software based on the requirements gathered in the previous phase.");
        addStudentAnswerToProblemAnswer(pa7c_4, sa7c_4_student4);

        StudentAnswer sa7c_5_student4 = createStudentAnswer(student4, pa7c_5, "Implementation, also known as Coding, is the third phase of the Waterfall model. It involves writing the actual code for the software based on the design created in the previous phase.");
        addStudentAnswerToProblemAnswer(pa7c_5, sa7c_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa7d_1_student3 = createStudentAnswer(student3, pa7d_1, "Project management is the process of planning, organizing, and managing resources to achieve specific goals and objectives within a defined timeframe and budget.");
        addStudentAnswerToProblemAnswer(pa7d_1, sa7d_1_student3);

        StudentAnswer sa7d_2_student3 = createStudentAnswer(student3, pa7d_2, "The key phases of project management include: 1) Initiation, 2) Planning, 3) Execution, 4) Monitoring and Controlling, and 5) Closing.");
        addStudentAnswerToProblemAnswer(pa7d_2, sa7d_2_student3);

        StudentAnswer sa7d_3_student3 = createStudentAnswer(student3, pa7d_3, "The project manager is responsible for overseeing the project, ensuring that it is completed on time, within budget, and to the required quality standards. They coordinate the efforts of the project team and manage stakeholder expectations.");
        addStudentAnswerToProblemAnswer(pa7d_3, sa7d_3_student3);

        StudentAnswer sa7d_4_student3 = createStudentAnswer(student3, pa7d_4, "A project charter is a document that formally authorizes the project, outlining its objectives, scope, stakeholders, and key deliverables. It serves as a reference for decision-making and provides a clear direction for the project.");
        addStudentAnswerToProblemAnswer(pa7d_4, sa7d_4_student3);

        StudentAnswer sa7d_5_student3 = createStudentAnswer(student3, pa7d_5, "A Gantt chart is a visual tool used in project management to represent the project schedule. It shows the start and end dates of project tasks, their dependencies, and progress over time.");
        addStudentAnswerToProblemAnswer(pa7d_5, sa7d_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa7d_1_student4 = createStudentAnswer(student4, pa7d_1, "Project management is the process of planning, organizing, and managing resources to achieve specific goals and objectives within a defined timeframe and budget.");
        addStudentAnswerToProblemAnswer(pa7d_1, sa7d_1_student4);

        StudentAnswer sa7d_2_student4 = createStudentAnswer(student4, pa7d_2, "The key phases of project management include: 1) Initiation, 2) Planning, 3) Execution, 4) Monitoring and Controlling, and 5) Closing.");
        addStudentAnswerToProblemAnswer(pa7d_2, sa7d_2_student4);

        StudentAnswer sa7d_3_student4 = createStudentAnswer(student4, pa7d_3, "The project manager is responsible for overseeing the project, ensuring that it is completed on time, within budget, and to the required quality standards. They coordinate the efforts of the project team and manage stakeholder expectations.");
        addStudentAnswerToProblemAnswer(pa7d_3, sa7d_3_student4);

        StudentAnswer sa7d_4_student4 = createStudentAnswer(student4, pa7d_4, "A project charter is a document that formally authorizes the project, outlining its objectives, scope, stakeholders, and key deliverables. It serves as a reference for decision-making and provides a clear direction for the project.");
        addStudentAnswerToProblemAnswer(pa7d_4, sa7d_4_student4);

        StudentAnswer sa7d_5_student4 = createStudentAnswer(student4, pa7d_5, "A Gantt chart is a visual tool used in project management to represent the project schedule. It shows the start and end dates of project tasks, their dependencies, and progress over time.");
        addStudentAnswerToProblemAnswer(pa7d_5, sa7d_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa8a_1_student3 = createStudentAnswer(student3, pa8a_1, "HTML (HyperText Markup Language) is the standard language used to create and structure content on web pages.");
        addStudentAnswerToProblemAnswer(pa8a_1, sa8a_1_student3);

        StudentAnswer sa8a_2_student3 = createStudentAnswer(student3, pa8a_2, "HTML tags are the building blocks of HTML. They are used to create elements, such as paragraphs, headings, links, images, and more.");
        addStudentAnswerToProblemAnswer(pa8a_2, sa8a_2_student3);

        StudentAnswer sa8a_3_student3 = createStudentAnswer(student3, pa8a_3, "The <head> tag contains metadata about the HTML document, such as the title, links to stylesheets, scripts, and other meta information.");
        addStudentAnswerToProblemAnswer(pa8a_3, sa8a_3_student3);

        StudentAnswer sa8a_4_student3 = createStudentAnswer(student3, pa8a_4, "The <body> tag contains the main content of the HTML document, including text, images, links, and other elements that are displayed on the web page.");
        addStudentAnswerToProblemAnswer(pa8a_4, sa8a_4_student3);

        StudentAnswer sa8a_5_student3 = createStudentAnswer(student3, pa8a_5, "An attribute provides additional information about an HTML element. Attributes are specified in the opening tag and consist of a name and value pair, such as class='example' or href='link.html'.");
        addStudentAnswerToProblemAnswer(pa8a_5, sa8a_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa8a_1_student4 = createStudentAnswer(student4, pa8a_1, "HTML (HyperText Markup Language) is the standard language used to create and structure content on web pages.");
        addStudentAnswerToProblemAnswer(pa8a_1, sa8a_1_student4);

        StudentAnswer sa8a_2_student4 = createStudentAnswer(student4, pa8a_2, "HTML tags are the building blocks of HTML. They are used to create elements, such as paragraphs, headings, links, images, and more.");
        addStudentAnswerToProblemAnswer(pa8a_2, sa8a_2_student4);

        StudentAnswer sa8a_3_student4 = createStudentAnswer(student4, pa8a_3, "The <head> tag contains metadata about the HTML document, such as the title, links to stylesheets, scripts, and other meta information.");
        addStudentAnswerToProblemAnswer(pa8a_3, sa8a_3_student4);

        StudentAnswer sa8a_4_student4 = createStudentAnswer(student4, pa8a_4, "The <body> tag contains the main content of the HTML document, including text, images, links, and other elements that are displayed on the web page.");
        addStudentAnswerToProblemAnswer(pa8a_4, sa8a_4_student4);

        StudentAnswer sa8a_5_student4 = createStudentAnswer(student4, pa8a_5, "An attribute provides additional information about an HTML element. Attributes are specified in the opening tag and consist of a name and value pair, such as class='example' or href='link.html'.");
        addStudentAnswerToProblemAnswer(pa8a_5, sa8a_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa8b_1_student3 = createStudentAnswer(student3, pa8b_1, "CSS (Cascading Style Sheets) is a language used to describe the presentation of a document written in HTML or XML. It controls the layout, colors, fonts, and overall visual appearance of web pages.");
        addStudentAnswerToProblemAnswer(pa8b_1, sa8b_1_student3);

        StudentAnswer sa8b_2_student3 = createStudentAnswer(student3, pa8b_2, "You can apply CSS to an HTML document using inline styles, internal stylesheets (within the <style> tag in the <head> section), or external stylesheets (linking to a .css file).");
        addStudentAnswerToProblemAnswer(pa8b_2, sa8b_2_student3);

        StudentAnswer sa8b_3_student3 = createStudentAnswer(student3, pa8b_3, "The class attribute is used to apply CSS styles to multiple elements by assigning the same class name to them. For example: .example-class { color: blue; }.");
        addStudentAnswerToProblemAnswer(pa8b_3, sa8b_3_student3);

        StudentAnswer sa8b_4_student3 = createStudentAnswer(student3, pa8b_4, "The id selector is used to apply styles to a single unique element, using the # symbol. The class selector is used to apply styles to multiple elements, using the . symbol. For example: #example-id { font-size: 20px; } and .example-class { color: blue; }.");
        addStudentAnswerToProblemAnswer(pa8b_4, sa8b_4_student3);

        StudentAnswer sa8b_5_student3 = createStudentAnswer(student3, pa8b_5, "A CSS rule consists of a selector and a declaration block. The selector targets the HTML elements to style, and the declaration block contains one or more declarations, each consisting of a property and a value. For example: p { color: red; font-size: 16px; }.");
        addStudentAnswerToProblemAnswer(pa8b_5, sa8b_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa8b_1_student4 = createStudentAnswer(student4, pa8b_1, "CSS (Cascading Style Sheets) is a language used to describe the presentation of a document written in HTML or XML. It controls the layout, colors, fonts, and overall visual appearance of web pages.");
        addStudentAnswerToProblemAnswer(pa8b_1, sa8b_1_student4);

        StudentAnswer sa8b_2_student4 = createStudentAnswer(student4, pa8b_2, "You can apply CSS to an HTML document using inline styles, internal stylesheets (within the <style> tag in the <head> section), or external stylesheets (linking to a .css file).");
        addStudentAnswerToProblemAnswer(pa8b_2, sa8b_2_student4);

        StudentAnswer sa8b_3_student4 = createStudentAnswer(student4, pa8b_3, "The class attribute is used to apply CSS styles to multiple elements by assigning the same class name to them. For example: .example-class { color: blue; }.");
        addStudentAnswerToProblemAnswer(pa8b_3, sa8b_3_student4);

        StudentAnswer sa8b_4_student4 = createStudentAnswer(student4, pa8b_4, "The id selector is used to apply styles to a single unique element, using the # symbol. The class selector is used to apply styles to multiple elements, using the . symbol. For example: #example-id { font-size: 20px; } and .example-class { color: blue; }.");
        addStudentAnswerToProblemAnswer(pa8b_4, sa8b_4_student4);

        StudentAnswer sa8b_5_student4 = createStudentAnswer(student4, pa8b_5, "A CSS rule consists of a selector and a declaration block. The selector targets the HTML elements to style, and the declaration block contains one or more declarations, each consisting of a property and a value. For example: p { color: red; font-size: 16px; }.");
        addStudentAnswerToProblemAnswer(pa8b_5, sa8b_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa8c_1_student3 = createStudentAnswer(student3, pa8c_1, "JavaScript is a programming language that allows you to create interactive and dynamic web content. It is widely used for client-side scripting on web pages.");
        addStudentAnswerToProblemAnswer(pa8c_1, sa8c_1_student3);

        StudentAnswer sa8c_2_student3 = createStudentAnswer(student3, pa8c_2, "You can include JavaScript in an HTML document using the <script> tag, either inline within the HTML file or by linking to an external .js file.");
        addStudentAnswerToProblemAnswer(pa8c_2, sa8c_2_student3);

        StudentAnswer sa8c_3_student3 = createStudentAnswer(student3, pa8c_3, "The Document Object Model (DOM) is a programming interface for HTML and XML documents. It represents the page's structure as a tree of nodes, allowing you to manipulate the content and structure of web pages.");
        addStudentAnswerToProblemAnswer(pa8c_3, sa8c_3_student3);

        StudentAnswer sa8c_4_student3 = createStudentAnswer(student3, pa8c_4, "You can select an HTML element using JavaScript methods like document.getElementById(), document.getElementsByClassName(), document.getElementsByTagName(), or document.querySelector().");
        addStudentAnswerToProblemAnswer(pa8c_4, sa8c_4_student3);

        StudentAnswer sa8c_5_student3 = createStudentAnswer(student3, pa8c_5, "An event is an action or occurrence that happens in the browser, such as a click, keypress, or page load. Events can be used to trigger JavaScript code to execute in response to user interactions.");
        addStudentAnswerToProblemAnswer(pa8c_5, sa8c_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa8c_1_student4 = createStudentAnswer(student4, pa8c_1, "JavaScript is a programming language that allows you to create interactive and dynamic web content. It is widely used for client-side scripting on web pages.");
        addStudentAnswerToProblemAnswer(pa8c_1, sa8c_1_student4);

        StudentAnswer sa8c_2_student4 = createStudentAnswer(student4, pa8c_2, "You can include JavaScript in an HTML document using the <script> tag, either inline within the HTML file or by linking to an external .js file.");
        addStudentAnswerToProblemAnswer(pa8c_2, sa8c_2_student4);

        StudentAnswer sa8c_3_student4 = createStudentAnswer(student4, pa8c_3, "The Document Object Model (DOM) is a programming interface for HTML and XML documents. It represents the page's structure as a tree of nodes, allowing you to manipulate the content and structure of web pages.");
        addStudentAnswerToProblemAnswer(pa8c_3, sa8c_3_student4);

        StudentAnswer sa8c_4_student4 = createStudentAnswer(student4, pa8c_4, "You can select an HTML element using JavaScript methods like document.getElementById(), document.getElementsByClassName(), document.getElementsByTagName(), or document.querySelector().");
        addStudentAnswerToProblemAnswer(pa8c_4, sa8c_4_student4);

        StudentAnswer sa8c_5_student4 = createStudentAnswer(student4, pa8c_5, "An event is an action or occurrence that happens in the browser, such as a click, keypress, or page load. Events can be used to trigger JavaScript code to execute in response to user interactions.");
        addStudentAnswerToProblemAnswer(pa8c_5, sa8c_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa8d_1_student3 = createStudentAnswer(student3, pa8d_1, "React is a popular JavaScript library for building user interfaces, particularly single-page applications. It allows developers to create reusable UI components.");
        addStudentAnswerToProblemAnswer(pa8d_1, sa8d_1_student3);

        StudentAnswer sa8d_2_student3 = createStudentAnswer(student3, pa8d_2, "A component in React is a reusable piece of UI that can be composed and nested within other components. Components can be functional or class-based.");
        addStudentAnswerToProblemAnswer(pa8d_2, sa8d_2_student3);

        StudentAnswer sa8d_3_student3 = createStudentAnswer(student3, pa8d_3, "JSX (JavaScript XML) is a syntax extension for JavaScript that allows you to write HTML-like code within JavaScript. JSX makes it easier to create React elements and components.");
        addStudentAnswerToProblemAnswer(pa8d_3, sa8d_3_student3);

        StudentAnswer sa8d_4_student3 = createStudentAnswer(student3, pa8d_4, "State is an object that represents the dynamic data of a component. It allows React components to respond to user input, network requests, and other events by re-rendering the UI.");
        addStudentAnswerToProblemAnswer(pa8d_4, sa8d_4_student3);

        StudentAnswer sa8d_5_student3 = createStudentAnswer(student3, pa8d_5, "Props (short for properties) are read-only attributes that are passed from parent components to child components. They allow data to be shared and reused across components.");
        addStudentAnswerToProblemAnswer(pa8d_5, sa8d_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa8d_1_student4 = createStudentAnswer(student4, pa8d_1, "React is a popular JavaScript library for building user interfaces, particularly single-page applications. It allows developers to create reusable UI components.");
        addStudentAnswerToProblemAnswer(pa8d_1, sa8d_1_student4);

        StudentAnswer sa8d_2_student4 = createStudentAnswer(student4, pa8d_2, "A component in React is a reusable piece of UI that can be composed and nested within other components. Components can be functional or class-based.");
        addStudentAnswerToProblemAnswer(pa8d_2, sa8d_2_student4);

        StudentAnswer sa8d_3_student4 = createStudentAnswer(student4, pa8d_3, "JSX (JavaScript XML) is a syntax extension for JavaScript that allows you to write HTML-like code within JavaScript. JSX makes it easier to create React elements and components.");
        addStudentAnswerToProblemAnswer(pa8d_3, sa8d_3_student4);

        StudentAnswer sa8d_4_student4 = createStudentAnswer(student4, pa8d_4, "State is an object that represents the dynamic data of a component. It allows React components to respond to user input, network requests, and other events by re-rendering the UI.");
        addStudentAnswerToProblemAnswer(pa8d_4, sa8d_4_student4);

        StudentAnswer sa8d_5_student4 = createStudentAnswer(student4, pa8d_5, "Props (short for properties) are read-only attributes that are passed from parent components to child components. They allow data to be shared and reused across components.");
        addStudentAnswerToProblemAnswer(pa8d_5, sa8d_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa8e_1_student3 = createStudentAnswer(student3, pa8e_1, "A RESTful API (Representational State Transfer) is an architectural style for building web services that use HTTP methods to perform CRUD operations on resources.");
        addStudentAnswerToProblemAnswer(pa8e_1, sa8e_1_student3);

        StudentAnswer sa8e_2_student3 = createStudentAnswer(student3, pa8e_2, "The main HTTP methods used in RESTful APIs are GET (retrieve data), POST (create data), PUT (update data), DELETE (remove data), and PATCH (partially update data).");
        addStudentAnswerToProblemAnswer(pa8e_2, sa8e_2_student3);

        StudentAnswer sa8e_3_student3 = createStudentAnswer(student3, pa8e_3, "Server-side rendering (SSR) is the process of generating HTML content on the server instead of the client. It improves performance and SEO by delivering fully rendered pages to the client.");
        addStudentAnswerToProblemAnswer(pa8e_3, sa8e_3_student3);

        StudentAnswer sa8e_4_student3 = createStudentAnswer(student3, pa8e_4, "Client-side rendering (CSR) is the process of rendering web content in the browser using JavaScript. It allows for faster interactions after the initial page load but can impact performance and SEO.");
        addStudentAnswerToProblemAnswer(pa8e_4, sa8e_4_student3);

        StudentAnswer sa8e_5_student3 = createStudentAnswer(student3, pa8e_5, "You can fetch data from an API in JavaScript using the fetch() function or libraries like Axios. For example: fetch('https://api.example.com/data').then(response => response.json()).then(data => console.log(data));.");
        addStudentAnswerToProblemAnswer(pa8e_5, sa8e_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa8e_1_student4 = createStudentAnswer(student4, pa8e_1, "A RESTful API (Representational State Transfer) is an architectural style for building web services that use HTTP methods to perform CRUD operations on resources.");
        addStudentAnswerToProblemAnswer(pa8e_1, sa8e_1_student4);

        StudentAnswer sa8e_2_student4 = createStudentAnswer(student4, pa8e_2, "The main HTTP methods used in RESTful APIs are GET (retrieve data), POST (create data), PUT (update data), DELETE (remove data), and PATCH (partially update data).");
        addStudentAnswerToProblemAnswer(pa8e_2, sa8e_2_student4);

        StudentAnswer sa8e_3_student4 = createStudentAnswer(student4, pa8e_3, "Server-side rendering (SSR) is the process of generating HTML content on the server instead of the client. It improves performance and SEO by delivering fully rendered pages to the client.");
        addStudentAnswerToProblemAnswer(pa8e_3, sa8e_3_student4);

        StudentAnswer sa8e_4_student4 = createStudentAnswer(student4, pa8e_4, "Client-side rendering (CSR) is the process of rendering web content in the browser using JavaScript. It allows for faster interactions after the initial page load but can impact performance and SEO.");
        addStudentAnswerToProblemAnswer(pa8e_4, sa8e_4_student4);

        StudentAnswer sa8e_5_student4 = createStudentAnswer(student4, pa8e_5, "You can fetch data from an API in JavaScript using the fetch() function or libraries like Axios. For example: fetch('https://api.example.com/data').then(response => response.json()).then(data => console.log(data));.");
        addStudentAnswerToProblemAnswer(pa8e_5, sa8e_5_student4);

        // Creating submission for student3 with student answers for 5a
        Submission submission5a_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5a_1_student3, sa5a_2_student3, sa5a_3_student3, sa5a_4_student3, sa5a_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission5a_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5a_3);
        }

// Creating submission for student4 with student answers for 5a
        Submission submission5a_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5a_1_student4, sa5a_2_student4, sa5a_3_student4, sa5a_4_student4, sa5a_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission5a_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5a_4);
        }
// Creating submission for student3 with student answers for 5b
        Submission submission5b_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5b_1_student3, sa5b_2_student3, sa5b_3_student3, sa5b_4_student3, sa5b_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission5b_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5b_3);
        }

// Creating submission for student4 with student answers for 5b
        Submission submission5b_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5b_1_student4, sa5b_2_student4, sa5b_3_student4, sa5b_4_student4, sa5b_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission5b_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5b_4);
        }
// Creating submission for student3 with student answers for 5c
        Submission submission5c_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5c_1_student3, sa5c_2_student3, sa5c_3_student3, sa5c_4_student3, sa5c_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission5c_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5c_3);
        }

// Creating submission for student4 with student answers for 5c
        Submission submission5c_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5c_1_student4, sa5c_2_student4, sa5c_3_student4, sa5c_4_student4, sa5c_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission5c_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5c_4);
        }
// Creating submission for student3 with student answers for 5d
        Submission submission5d_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5d_1_student3, sa5d_2_student3, sa5d_3_student3, sa5d_4_student3, sa5d_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission5d_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5d_3);
        }

// Creating submission for student4 with student answers for 5d
        Submission submission5d_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5d_1_student4, sa5d_2_student4, sa5d_3_student4, sa5d_4_student4, sa5d_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission5d_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5d_4);
        }
// Creating submission for student3 with student answers for 6a
        Submission submission6a_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6a_1_student3, sa6a_2_student3, sa6a_3_student3, sa6a_4_student3, sa6a_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission6a_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6a_3);
        }

// Creating submission for student4 with student answers for 6a
        Submission submission6a_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6a_1_student4, sa6a_2_student4, sa6a_3_student4, sa6a_4_student4, sa6a_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission6a_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6a_4);
        }
// Creating submission for student3 with student answers for 6b
        Submission submission6b_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6b_1_student3, sa6b_2_student3, sa6b_3_student3, sa6b_4_student3, sa6b_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission6b_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6b_3);
        }

// Creating submission for student4 with student answers for 6b
        Submission submission6b_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6b_1_student4, sa6b_2_student4, sa6b_3_student4, sa6b_4_student4, sa6b_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission6b_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6b_4);
        }
// Creating submission for student3 with student answers for 6c
        Submission submission6c_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6c_1_student3, sa6c_2_student3, sa6c_3_student3, sa6c_4_student3, sa6c_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission6c_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6c_3);
        }

// Creating submission for student4 with student answers for 6c
        Submission submission6c_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6c_1_student4, sa6c_2_student4, sa6c_3_student4, sa6c_4_student4, sa6c_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission6c_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6c_4);
        }
// Creating submission for student3 with student answers for 6d
        Submission submission6d_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6d_1_student3, sa6d_2_student3, sa6d_3_student3, sa6d_4_student3, sa6d_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission6d_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6d_3);
        }

// Creating submission for student4 with student answers for 6d
        Submission submission6d_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6d_1_student4, sa6d_2_student4, sa6d_3_student4, sa6d_4_student4, sa6d_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission6d_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6d_4);
        }
// Creating submission for student3 with student answers for 6e
        Submission submission6e_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6e_1_student3, sa6e_2_student3, sa6e_3_student3, sa6e_4_student3, sa6e_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission6e_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6e_3);
        }

// Creating submission for student4 with student answers for 6e
        Submission submission6e_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6e_1_student4, sa6e_2_student4, sa6e_3_student4, sa6e_4_student4, sa6e_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission6e_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6e_4);
        }
// Creating submission for student3 with student answers for 7a
        Submission submission7a_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7a_1_student3, sa7a_2_student3, sa7a_3_student3, sa7a_4_student3, sa7a_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission7a_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7a_3);
        }

// Creating submission for student4 with student answers for 7a
        Submission submission7a_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7a_1_student4, sa7a_2_student4, sa7a_3_student4, sa7a_4_student4, sa7a_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission7a_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7a_4);
        }
// Creating submission for student3 with student answers for 7b
        Submission submission7b_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7b_1_student3, sa7b_2_student3, sa7b_3_student3, sa7b_4_student3, sa7b_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission7b_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7b_3);
        }

// Creating submission for student4 with student answers for 7b
        Submission submission7b_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7b_1_student4, sa7b_2_student4, sa7b_3_student4, sa7b_4_student4, sa7b_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission7b_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7b_4);
        }
// Creating submission for student3 with student answers for 7c
        Submission submission7c_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7c_1_student3, sa7c_2_student3, sa7c_3_student3, sa7c_4_student3, sa7c_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission7c_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7c_3);
        }

// Creating submission for student4 with student answers for 7c
        Submission submission7c_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7c_1_student4, sa7c_2_student4, sa7c_3_student4, sa7c_4_student4, sa7c_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission7c_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7c_4);
        }
// Creating submission for student3 with student answers for 7d
        Submission submission7d_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7d_1_student3, sa7d_2_student3, sa7d_3_student3, sa7d_4_student3, sa7d_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission7d_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7d_3);
        }

// Creating submission for student4 with student answers for 7d
        Submission submission7d_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7d_1_student4, sa7d_2_student4, sa7d_3_student4, sa7d_4_student4, sa7d_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission7d_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7d_4);
        }
// Creating submission for student3 with student answers for 8a
        Submission submission8a_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8a_1_student3, sa8a_2_student3, sa8a_3_student3, sa8a_4_student3, sa8a_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission8a_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8a_3);
        }

// Creating submission for student4 with student answers for 8a
        Submission submission8a_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8a_1_student4, sa8a_2_student4, sa8a_3_student4, sa8a_4_student4, sa8a_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission8a_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8a_4);
        }
// Creating submission for student3 with student answers for 8b
        Submission submission8b_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8b_1_student3, sa8b_2_student3, sa8b_3_student3, sa8b_4_student3, sa8b_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission8b_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8b_3);
        }

// Creating submission for student4 with student answers for 8b
        Submission submission8b_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8b_1_student4, sa8b_2_student4, sa8b_3_student4, sa8b_4_student4, sa8b_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission8b_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8b_4);
        }
// Creating submission for student3 with student answers for 8c
        Submission submission8c_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8c_1_student3, sa8c_2_student3, sa8c_3_student3, sa8c_4_student3, sa8c_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission8c_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8c_3);
        }

// Creating submission for student4 with student answers for 8c
        Submission submission8c_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8c_1_student4, sa8c_2_student4, sa8c_3_student4, sa8c_4_student4, sa8c_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission8c_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8c_4);
        }
// Creating submission for student3 with student answers for 8d
        Submission submission8d_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8d_1_student3, sa8d_2_student3, sa8d_3_student3, sa8d_4_student3, sa8d_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission8d_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8d_3);
        }

// Creating submission for student4 with student answers for 8d
        Submission submission8d_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8d_1_student4, sa8d_2_student4, sa8d_3_student4, sa8d_4_student4, sa8d_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission8d_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8d_4);
        }
// Creating submission for student3 with student answers for 8e
        Submission submission8e_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8e_1_student3, sa8e_2_student3, sa8e_3_student3, sa8e_4_student3, sa8e_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission8e_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8e_3);
        }

// Creating submission for student4 with student answers for 8e
        Submission submission8e_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8e_1_student4, sa8e_2_student4, sa8e_3_student4, sa8e_4_student4, sa8e_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission8e_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8e_4);
        }


        Grade grade5a_3 = createGrade(85.6, student3, faculty5, course5, submission5a_3);
        Grade grade5a_4 = createGrade(87.3, student4, faculty5, course5, submission5a_4);
        Grade grade5b_3 = createGrade(88.2, student3, faculty5, course5, submission5b_3);
        Grade grade5b_4 = createGrade(86.9, student4, faculty5, course5, submission5b_4);
        Grade grade5c_3 = createGrade(87.5, student3, faculty5, course5, submission5c_3);
        Grade grade5c_4 = createGrade(89.1, student4, faculty5, course5, submission5c_4);
        Grade grade5d_3 = createGrade(86.4, student3, faculty5, course5, submission5d_3);
        Grade grade5d_4 = createGrade(88.8, student4, faculty5, course5, submission5d_4);

        Grade grade6a_3 = createGrade(87.2, student3, faculty1, course6, submission6a_3);
        Grade grade6a_4 = createGrade(85.6, student4, faculty1, course6, submission6a_4);
        Grade grade6b_3 = createGrade(89.1, student3, faculty1, course6, submission6b_3);
        Grade grade6b_4 = createGrade(87.8, student4, faculty1, course6, submission6b_4);
        Grade grade6c_3 = createGrade(88.4, student3, faculty1, course6, submission6c_3);
        Grade grade6c_4 = createGrade(86.9, student4, faculty1, course6, submission6c_4);
        Grade grade6d_3 = createGrade(85.7, student3, faculty1, course6, submission6d_3);
        Grade grade6d_4 = createGrade(89.3, student4, faculty1, course6, submission6d_4);
        Grade grade6e_3 = createGrade(86.8, student3, faculty1, course6, submission6e_3);
        Grade grade6e_4 = createGrade(88.1, student4, faculty1, course6, submission6e_4);

        Grade grade7a_3 = createGrade(87.1, student3, faculty2, course7, submission7a_3);
        Grade grade7a_4 = createGrade(85.9, student4, faculty2, course7, submission7a_4);
        Grade grade7b_3 = createGrade(89.3, student3, faculty2, course7, submission7b_3);
        Grade grade7b_4 = createGrade(88.4, student4, faculty2, course7, submission7b_4);
        Grade grade7c_3 = createGrade(86.7, student3, faculty2, course7, submission7c_3);
        Grade grade7c_4 = createGrade(87.5, student4, faculty2, course7, submission7c_4);
        Grade grade7d_3 = createGrade(88.9, student3, faculty2, course7, submission7d_3);
        Grade grade7d_4 = createGrade(86.2, student4, faculty2, course7, submission7d_4);

        Grade grade8a_3 = createGrade(88.1, student3, faculty3, course8, submission8a_3);
        Grade grade8a_4 = createGrade(86.5, student4, faculty3, course8, submission8a_4);
        Grade grade8b_3 = createGrade(87.4, student3, faculty3, course8, submission8b_3);
        Grade grade8b_4 = createGrade(89.7, student4, faculty3, course8, submission8b_4);
        Grade grade8c_3 = createGrade(86.2, student3, faculty3, course8, submission8c_3);
        Grade grade8c_4 = createGrade(88.9, student4, faculty3, course8, submission8c_4);
        Grade grade8d_3 = createGrade(89.3, student3, faculty3, course8, submission8d_3);
        Grade grade8d_4 = createGrade(87.6, student4, faculty3, course8, submission8d_4);
        Grade grade8e_3 = createGrade(85.7, student3, faculty3, course8, submission8e_3);
        Grade grade8e_4 = createGrade(88.4, student4, faculty3, course8, submission8e_4);


        CourseGrade courseGrade5a_3 = createCourseGrade(student3, course5, 86.925, Arrays.asList(grade5a_3, grade5b_3, grade5c_3, grade5d_3));
        CourseGrade courseGrade5a_4 = createCourseGrade(student4, course5, 88.025, Arrays.asList(grade5a_3, grade5b_3, grade5c_3, grade5d_3));

        CourseGrade courseGrade6a_3 = createCourseGrade(student3, course6, 87.44, Arrays.asList(grade6a_3, grade6b_3, grade6c_3, grade6d_3, grade6e_3));
        CourseGrade courseGrade6a_4 = createCourseGrade(student4, course6, 87.54, Arrays.asList(grade6a_4, grade6b_4, grade6c_4, grade6d_4, grade6e_4));

        CourseGrade courseGrade7a_3 = createCourseGrade(student3, course7, 87.5, Arrays.asList(grade7a_3, grade7b_3, grade7c_3, grade7d_3));
        CourseGrade courseGrade7a_4 = createCourseGrade(student4, course7, 87.0, Arrays.asList(grade7a_4, grade7b_4, grade7c_4, grade7d_4));

        CourseGrade courseGrade8a_3 = createCourseGrade(student3, course8, 87.74, Arrays.asList(grade8a_3, grade8b_3, grade8c_3, grade8d_3, grade8e_3));
        CourseGrade courseGrade8a_4 = createCourseGrade(student4, course8, 87.02, Arrays.asList(grade8a_4, grade8b_4, grade8c_4, grade8d_4, grade8e_4));

        Feedback feedback5a_3 = createFeedback("Great work, student3!", submission5a_3);
        Feedback feedback5a_4 = createFeedback("Nice job, student4!", submission5a_4);

        Feedback feedback5b_3 = createFeedback("Excellent effort, student3.", submission5b_3);
        Feedback feedback5b_4 = createFeedback("Well done, student4!", submission5b_4);

        Feedback feedback5c_3 = createFeedback("Good answers, student3.", submission5c_3);
        Feedback feedback5c_4 = createFeedback("Strong performance, student4.", submission5c_4);

        Feedback feedback5d_3 = createFeedback("Well written, student3.", submission5d_3);
        Feedback feedback5d_4 = createFeedback("Great job, student4!", submission5d_4);

        Feedback feedback6a_3 = createFeedback("Great work, student3!", submission6a_3);
        Feedback feedback6a_4 = createFeedback("Nice job, student4!", submission6a_4);

        Feedback feedback6b_3 = createFeedback("Excellent effort, student3.", submission6b_3);
        Feedback feedback6b_4 = createFeedback("Well done, student4!", submission6b_4);

        Feedback feedback6c_3 = createFeedback("Good answers, student3.", submission6c_3);
        Feedback feedback6c_4 = createFeedback("Strong performance, student4.", submission6c_4);

        Feedback feedback6d_3 = createFeedback("Well written, student3.", submission6d_3);
        Feedback feedback6d_4 = createFeedback("Great job, student4!", submission6d_4);

        Feedback feedback6e_3 = createFeedback("Impressive work, student3!", submission6e_3);
        Feedback feedback6e_4 = createFeedback("Solid submission, student4.", submission6e_4);

        Feedback feedback7a_3 = createFeedback("Great work, student3!", submission7a_3);
        Feedback feedback7a_4 = createFeedback("Nice job, student4!", submission7a_4);

        Feedback feedback7b_3 = createFeedback("Excellent effort, student3.", submission7b_3);
        Feedback feedback7b_4 = createFeedback("Well done, student4!", submission7b_4);

        Feedback feedback7c_3 = createFeedback("Good answers, student3.", submission7c_3);
        Feedback feedback7c_4 = createFeedback("Strong performance, student4.", submission7c_4);

        Feedback feedback7d_3 = createFeedback("Well written, student3.", submission7d_3);
        Feedback feedback7d_4 = createFeedback("Great job, student4!", submission7d_4);

        Feedback feedback8a_3 = createFeedback("Great work, student3!", submission8a_3);
        Feedback feedback8a_4 = createFeedback("Nice job, student4!", submission8a_4);

        Feedback feedback8b_3 = createFeedback("Excellent effort, student3.", submission8b_3);
        Feedback feedback8b_4 = createFeedback("Well done, student4!", submission8b_4);

        Feedback feedback8c_3 = createFeedback("Good answers, student3.", submission8c_3);
        Feedback feedback8c_4 = createFeedback("Strong performance, student4.", submission8c_4);

        Feedback feedback8d_3 = createFeedback("Well written, student3.", submission8d_3);
        Feedback feedback8d_4 = createFeedback("Great job, student4!", submission8d_4);

        Feedback feedback8e_3 = createFeedback("Impressive work, student3!", submission8e_3);
        Feedback feedback8e_4 = createFeedback("Solid submission, student4.", submission8e_4);

        course5.setGrades(Arrays.asList(grade5a_3, grade5a_4, grade5b_3, grade5b_4, grade5c_3, grade5c_4, grade5d_3, grade5d_4));
        course6.setGrades(Arrays.asList(grade6a_3, grade6a_4, grade6b_3, grade6b_4, grade6c_3, grade6c_4, grade6d_3, grade6d_4, grade6e_3, grade6e_4));
        course7.setGrades(Arrays.asList(grade7a_3, grade7a_4, grade7b_3, grade7b_4, grade7c_3, grade7c_4, grade7d_3, grade7d_4));
        course8.setGrades(Arrays.asList(grade8a_3, grade8a_4, grade8b_3, grade8b_4, grade8c_3, grade8c_4, grade8d_3, grade8d_4, grade8e_3, grade8e_4));


        course5.setCourseGrades(Arrays.asList(courseGrade5a_3, courseGrade5a_4));
        course6.setCourseGrades(Arrays.asList(courseGrade6a_3, courseGrade6a_4));
        course7.setCourseGrades(Arrays.asList(courseGrade7a_3, courseGrade7a_4));
        course8.setCourseGrades(Arrays.asList(courseGrade8a_3, courseGrade8a_4));

        createFacultyWithTest(faculty5, Arrays.asList(grade5a_3, grade5a_4, grade5b_3, grade5b_4, grade5c_3, grade5c_4, grade5d_3, grade5d_4), Arrays.asList(test5a, test5b, test5c, test5d));
        createFacultyWithTest(faculty1, Arrays.asList(grade6a_3, grade6a_4, grade6b_3, grade6b_4, grade6c_3, grade6c_4, grade6d_3, grade6d_4, grade6e_3, grade6e_4), Arrays.asList(test6a, test6b, test6c, test6d, test6e));
        createFacultyWithTest(faculty2, Arrays.asList(grade7a_3, grade7a_4, grade7b_3, grade7b_4, grade7c_3, grade7c_4, grade7d_3, grade7d_4), Arrays.asList(test7a, test7b, test7c, test7d));
        createFacultyWithTest(faculty3, Arrays.asList(grade8a_3, grade8a_4, grade8b_3, grade8b_4, grade8c_3, grade8c_4, grade8d_3, grade8d_4, grade8e_3, grade8e_4), Arrays.asList(test8a, test8b, test8c, test8d, test8e));

        linkSubmissionDetails(submission5a_3, student3, grade5a_3, feedback5a_3, Arrays.asList(sa5a_1_student3, sa5a_2_student3, sa5a_3_student3, sa5a_4_student3, sa5a_5_student3));
        linkSubmissionDetails(submission5a_4, student4, grade5a_4, feedback5a_4, Arrays.asList(sa5a_1_student4, sa5a_2_student4, sa5a_3_student4, sa5a_4_student4, sa5a_5_student4));
        linkSubmissionDetails(submission5b_3, student3, grade5b_3, feedback5b_3, Arrays.asList(sa5b_1_student3, sa5b_2_student3, sa5b_3_student3, sa5b_4_student3, sa5b_5_student3));
        linkSubmissionDetails(submission5b_4, student4, grade5b_4, feedback5b_4, Arrays.asList(sa5b_1_student4, sa5b_2_student4, sa5b_3_student4, sa5b_4_student4, sa5b_5_student4));
        linkSubmissionDetails(submission5c_3, student3, grade5c_3, feedback5c_3, Arrays.asList(sa5c_1_student3, sa5c_2_student3, sa5c_3_student3, sa5c_4_student3, sa5c_5_student3));
        linkSubmissionDetails(submission5c_4, student4, grade5c_4, feedback5c_4, Arrays.asList(sa5c_1_student4, sa5c_2_student4, sa5c_3_student4, sa5c_4_student4, sa5c_5_student4));
        linkSubmissionDetails(submission5d_3, student3, grade5d_3, feedback5d_3, Arrays.asList(sa5d_1_student3, sa5d_2_student3, sa5d_3_student3, sa5d_4_student3, sa5d_5_student3));
        linkSubmissionDetails(submission5d_4, student4, grade5d_4, feedback5d_4, Arrays.asList(sa5d_1_student4, sa5d_2_student4, sa5d_3_student4, sa5d_4_student4, sa5d_5_student4));

        linkSubmissionDetails(submission6a_3, student3, grade6a_3, feedback6a_3, Arrays.asList(sa6a_1_student3, sa6a_2_student3, sa6a_3_student3, sa6a_4_student3, sa6a_5_student3));
        linkSubmissionDetails(submission6a_4, student4, grade6a_4, feedback6a_4, Arrays.asList(sa6a_1_student4, sa6a_2_student4, sa6a_3_student4, sa6a_4_student4, sa6a_5_student4));
        linkSubmissionDetails(submission6b_3, student3, grade6b_3, feedback6b_3, Arrays.asList(sa6b_1_student3, sa6b_2_student3, sa6b_3_student3, sa6b_4_student3, sa6b_5_student3));
        linkSubmissionDetails(submission6b_4, student4, grade6b_4, feedback6b_4, Arrays.asList(sa6b_1_student4, sa6b_2_student4, sa6b_3_student4, sa6b_4_student4, sa6b_5_student4));
        linkSubmissionDetails(submission6c_3, student3, grade6c_3, feedback6c_3, Arrays.asList(sa6c_1_student3, sa6c_2_student3, sa6c_3_student3, sa6c_4_student3, sa6c_5_student3));
        linkSubmissionDetails(submission6c_4, student4, grade6c_4, feedback6c_4, Arrays.asList(sa6c_1_student4, sa6c_2_student4, sa6c_3_student4, sa6c_4_student4, sa6c_5_student4));
        linkSubmissionDetails(submission6d_3, student3, grade6d_3, feedback6d_3, Arrays.asList(sa6d_1_student3, sa6d_2_student3, sa6d_3_student3, sa6d_4_student3, sa6d_5_student3));
        linkSubmissionDetails(submission6d_4, student4, grade6d_4, feedback6d_4, Arrays.asList(sa6d_1_student4, sa6d_2_student4, sa6d_3_student4, sa6d_4_student4, sa6d_5_student4));
        linkSubmissionDetails(submission6e_3, student3, grade6e_3, feedback6e_3, Arrays.asList(sa6e_1_student3, sa6e_2_student3, sa6e_3_student3, sa6e_4_student3, sa6e_5_student3));
        linkSubmissionDetails(submission6e_4, student4, grade6e_4, feedback6e_4, Arrays.asList(sa6e_1_student4, sa6e_2_student4, sa6e_3_student4, sa6e_4_student4, sa6e_5_student4));

        linkSubmissionDetails(submission7a_3, student3, grade7a_3, feedback7a_3, Arrays.asList(sa7a_1_student3, sa7a_2_student3, sa7a_3_student3, sa7a_4_student3, sa7a_5_student3));
        linkSubmissionDetails(submission7a_4, student4, grade7a_4, feedback7a_4, Arrays.asList(sa7a_1_student4, sa7a_2_student4, sa7a_3_student4, sa7a_4_student4, sa7a_5_student4));
        linkSubmissionDetails(submission7b_3, student3, grade7b_3, feedback7b_3, Arrays.asList(sa7b_1_student3, sa7b_2_student3, sa7b_3_student3, sa7b_4_student3, sa7b_5_student3));
        linkSubmissionDetails(submission7b_4, student4, grade7b_4, feedback7b_4, Arrays.asList(sa7b_1_student4, sa7b_2_student4, sa7b_3_student4, sa7b_4_student4, sa7b_5_student4));
        linkSubmissionDetails(submission7c_3, student3, grade7c_3, feedback7c_3, Arrays.asList(sa7c_1_student3, sa7c_2_student3, sa7c_3_student3, sa7c_4_student3, sa7c_5_student3));
        linkSubmissionDetails(submission7c_4, student4, grade7c_4, feedback7c_4, Arrays.asList(sa7c_1_student4, sa7c_2_student4, sa7c_3_student4, sa7c_4_student4, sa7c_5_student4));
        linkSubmissionDetails(submission7d_3, student3, grade7d_3, feedback7d_3, Arrays.asList(sa7d_1_student3, sa7d_2_student3, sa7d_3_student3, sa7d_4_student3, sa7d_5_student3));
        linkSubmissionDetails(submission7d_4, student4, grade7d_4, feedback7d_4, Arrays.asList(sa7d_1_student4, sa7d_2_student4, sa7d_3_student4, sa7d_4_student4, sa7d_5_student4));

        linkSubmissionDetails(submission8a_3, student3, grade8a_3, feedback8a_3, Arrays.asList(sa8a_1_student3, sa8a_2_student3, sa8a_3_student3, sa8a_4_student3, sa8a_5_student3));
        linkSubmissionDetails(submission8a_4, student4, grade8a_4, feedback8a_4, Arrays.asList(sa8a_1_student4, sa8a_2_student4, sa8a_3_student4, sa8a_4_student4, sa8a_5_student4));
        linkSubmissionDetails(submission8b_3, student3, grade8b_3, feedback8b_3, Arrays.asList(sa8b_1_student3, sa8b_2_student3, sa8b_3_student3, sa8b_4_student3, sa8b_5_student3));
        linkSubmissionDetails(submission8b_4, student4, grade8b_4, feedback8b_4, Arrays.asList(sa8b_1_student4, sa8b_2_student4, sa8b_3_student4, sa8b_4_student4, sa8b_5_student4));
        linkSubmissionDetails(submission8c_3, student3, grade8c_3, feedback8c_3, Arrays.asList(sa8c_1_student3, sa8c_2_student3, sa8c_3_student3, sa8c_4_student3, sa8c_5_student3));
        linkSubmissionDetails(submission8c_4, student4, grade8c_4, feedback8c_4, Arrays.asList(sa8c_1_student4, sa8c_2_student4, sa8c_3_student4, sa8c_4_student4, sa8c_5_student4));
        linkSubmissionDetails(submission8d_3, student3, grade8d_3, feedback8d_3, Arrays.asList(sa8d_1_student3, sa8d_2_student3, sa8d_3_student3, sa8d_4_student3, sa8d_5_student3));
        linkSubmissionDetails(submission8d_4, student4, grade8d_4, feedback8d_4, Arrays.asList(sa8d_1_student4, sa8d_2_student4, sa8d_3_student4, sa8d_4_student4, sa8d_5_student4));
        linkSubmissionDetails(submission8e_3, student3, grade8e_3, feedback8e_3, Arrays.asList(sa8e_1_student3, sa8e_2_student3, sa8e_3_student3, sa8e_4_student3, sa8e_5_student3));
        linkSubmissionDetails(submission8e_4, student4, grade8e_4, feedback8e_4, Arrays.asList(sa8e_1_student4, sa8e_2_student4, sa8e_3_student4, sa8e_4_student4, sa8e_5_student4));

        syllabus5.setTests(Arrays.asList(test5a, test5b, test5c, test5d));
        syllabus6.setTests(Arrays.asList(test6a, test6b, test6c, test6d, test6e));
        syllabus7.setTests(Arrays.asList(test7a, test7b, test7c, test7d));
        syllabus8.setTests(Arrays.asList(test8a, test8b, test8c, test8d, test8e));

        studentTest(student3, Arrays.asList(grade5a_3, grade5b_3, grade5c_3, grade5d_4, grade6a_3, grade6b_3, grade6c_3, grade6d_3, grade6e_3, grade7a_3, grade7b_3, grade7c_3, grade7d_3, grade8a_3, grade8b_3, grade8c_3, grade8d_3, grade8e_3), Arrays.asList(courseGrade5a_3, courseGrade6a_3, courseGrade7a_3, courseGrade8a_3), Arrays.asList(test5a, test5b, test5c, test5d, test6a, test6b, test6c, test6d, test6e, test7a, test7b, test7c, test7d, test8a, test8b, test8c, test8d, test8e));
        studentTest(student4, Arrays.asList(grade5a_4, grade5b_4, grade5c_4, grade5d_4, grade6a_4, grade6b_4, grade6c_4, grade6d_4, grade6e_4, grade7a_4, grade7b_4, grade7c_4, grade7d_4, grade8a_4, grade8b_4, grade8c_4, grade8d_4, grade8e_4), Arrays.asList(courseGrade5a_4, courseGrade6a_4, courseGrade7a_4, courseGrade8a_4), Arrays.asList(test5a, test5b, test5c, test5d, test6a, test6b, test6c, test6d, test6e, test7a, test7b, test7c, test7d, test8a, test8b, test8c, test8d, test8e));

        facultyRepo.saveAllAndFlush(Arrays.asList(faculty1, faculty2, faculty3, faculty4, faculty5));
        syllabusRepo.saveAllAndFlush(Arrays.asList(syllabus1, syllabus2, syllabus3, syllabus4, syllabus5, syllabus6, syllabus7, syllabus8, syllabus9, syllabus10, syllabus11, syllabus12, syllabus13, syllabus14, syllabus15, syllabus16, syllabus17, syllabus18, syllabus19, syllabus20));
        studentRepo.saveAllAndFlush(Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10));
        courseRepo.saveAllAndFlush(Arrays.asList(course1, course2, course3, course4, course5, course6, course7, course8, course9, course10, course11, course12, course13, course14, course15, course16, course17, course18, course19, course20));
        testRepo.saveAllAndFlush(Arrays.asList(test5a, test5b, test5c, test5d, test6a, test6b, test6c, test6d, test6e, test7a, test7b, test7c, test7d, test8a, test8b, test8c, test8d, test8e));
        problemAnswerRepo.saveAllAndFlush(Arrays.asList(pa5a_1, pa5a_2, pa5a_3, pa5a_4, pa5a_5, pa5b_1, pa5b_2, pa5b_3, pa5b_4, pa5b_5, pa5c_1, pa5c_2, pa5c_3, pa5c_4, pa5c_5, pa5d_1, pa5d_2, pa5d_3, pa5d_4, pa5d_5, pa6a_1, pa6a_2, pa6a_3, pa6a_4, pa6a_5, pa6b_1, pa6b_2, pa6b_3, pa6b_4, pa6b_5, pa6c_1, pa6c_2, pa6c_3, pa6c_4, pa6c_5, pa6d_1, pa6d_2, pa6d_3, pa6d_4, pa6d_5, pa6e_1, pa6e_2, pa6e_3, pa6e_4, pa6e_5, pa7a_1, pa7a_2, pa7a_3, pa7a_4, pa7a_5, pa7b_1, pa7b_2, pa7b_3, pa7b_4, pa7b_5, pa7c_1, pa7c_2, pa7c_3, pa7c_4, pa7c_5, pa7d_1, pa7d_2, pa7d_3, pa7d_4, pa7d_5, pa8a_1, pa8a_2, pa8a_3, pa8a_4, pa8a_5, pa8b_1, pa8b_2, pa8b_3, pa8b_4, pa8b_5, pa8c_1, pa8c_2, pa8c_3, pa8c_4, pa8c_5, pa8d_1, pa8d_2, pa8d_3, pa8d_4, pa8d_5, pa8e_1, pa8e_2, pa8e_3, pa8e_4, pa8e_5));
        studentAnswerRepo.saveAllAndFlush(Arrays.asList(sa5a_1_student3, sa5a_2_student3, sa5a_3_student3, sa5a_4_student3, sa5a_5_student3, sa5b_1_student3, sa5b_2_student3, sa5b_3_student3, sa5b_4_student3, sa5b_5_student3, sa5c_1_student3, sa5c_2_student3, sa5c_3_student3, sa5c_4_student3, sa5c_5_student3, sa5d_1_student3, sa5d_2_student3, sa5d_3_student3, sa5d_4_student3, sa5d_5_student3, sa5a_1_student4, sa5a_2_student4, sa5a_3_student4, sa5a_4_student4, sa5a_5_student4, sa5b_1_student4, sa5b_2_student4, sa5b_3_student4, sa5b_4_student4, sa5b_5_student4, sa5c_1_student4, sa5c_2_student4, sa5c_3_student4, sa5c_4_student4, sa5c_5_student4, sa5d_1_student4, sa5d_2_student4, sa5d_3_student4, sa5d_4_student4, sa5d_5_student4,
                sa6a_1_student3, sa6a_2_student3, sa6a_3_student3, sa6a_4_student3, sa6a_5_student3, sa6b_1_student3, sa6b_2_student3, sa6b_3_student3, sa6b_4_student3, sa6b_5_student3, sa6c_1_student3, sa6c_2_student3, sa6c_3_student3, sa6c_4_student3, sa6c_5_student3, sa6d_1_student3, sa6d_2_student3, sa6d_3_student3, sa6d_4_student3, sa6d_5_student3, sa6e_1_student3, sa6e_2_student3, sa6e_3_student3, sa6e_4_student3, sa6e_5_student3, sa6a_1_student4, sa6a_2_student4, sa6a_3_student4, sa6a_4_student4, sa6a_5_student4, sa6b_1_student4, sa6b_2_student4, sa6b_3_student4, sa6b_4_student4, sa6b_5_student4, sa6c_1_student4, sa6c_2_student4, sa6c_3_student4, sa6c_4_student4, sa6c_5_student4, sa6d_1_student4, sa6d_2_student4, sa6d_3_student4, sa6d_4_student4, sa6d_5_student4, sa6e_1_student4, sa6e_2_student4, sa6e_3_student4, sa6e_4_student4, sa6e_5_student4,
                sa7a_1_student3, sa7a_2_student3, sa7a_3_student3, sa7a_4_student3, sa7a_5_student3, sa7b_1_student3, sa7b_2_student3, sa7b_3_student3, sa7b_4_student3, sa7b_5_student3, sa7c_1_student3, sa7c_2_student3, sa7c_3_student3, sa7c_4_student3, sa7c_5_student3, sa7d_1_student3, sa7d_2_student3, sa7d_3_student3, sa7d_4_student3, sa7d_5_student3, sa7a_1_student4, sa7a_2_student4, sa7a_3_student4, sa7a_4_student4, sa7a_5_student4, sa7b_1_student4, sa7b_2_student4, sa7b_3_student4, sa7b_4_student4, sa7b_5_student4, sa7c_1_student4, sa7c_2_student4, sa7c_3_student4, sa7c_4_student4, sa7c_5_student4, sa7d_1_student4, sa7d_2_student4, sa7d_3_student4, sa7d_4_student4, sa7d_5_student4,
                sa8a_1_student3, sa8a_2_student3, sa8a_3_student3, sa8a_4_student3, sa8a_5_student3, sa8b_1_student3, sa8b_2_student3, sa8b_3_student3, sa8b_4_student3, sa8b_5_student3, sa8c_1_student3, sa8c_2_student3, sa8c_3_student3, sa8c_4_student3, sa8c_5_student3, sa8d_1_student3, sa8d_2_student3, sa8d_3_student3, sa8d_4_student3, sa8d_5_student3, sa8e_1_student3, sa8e_2_student3, sa8e_3_student3, sa8e_4_student3, sa8e_5_student3, sa8a_1_student4, sa8a_2_student4, sa8a_3_student4, sa8a_4_student4, sa8a_5_student4, sa8b_1_student4, sa8b_2_student4, sa8b_3_student4, sa8b_4_student4, sa8b_5_student4, sa8c_1_student4, sa8c_2_student4, sa8c_3_student4, sa8c_4_student4, sa8c_5_student4, sa8d_1_student4, sa8d_2_student4, sa8d_3_student4, sa8d_4_student4, sa8d_5_student4, sa8e_1_student4, sa8e_2_student4, sa8e_3_student4, sa8e_4_student4, sa8e_5_student4));
        submissionRepo.saveAllAndFlush(Arrays.asList(submission5a_3, submission5a_4, submission5b_3, submission5b_4, submission5c_3, submission5c_4, submission5d_3, submission5d_4, submission6a_3, submission6a_4, submission6b_3, submission6b_4, submission6c_3, submission6c_4, submission6d_3, submission6d_4, submission6e_3, submission6e_4, submission7a_3, submission7a_4, submission7b_3, submission7b_4, submission7c_3, submission7c_4, submission7d_3, submission7d_4, submission8a_3, submission8a_4, submission8b_3, submission8b_4, submission8c_3, submission8c_4, submission8d_3, submission8d_4, submission8e_3, submission8e_4));
        gradeRepo.saveAllAndFlush(Arrays.asList(grade5a_3, grade5b_3, grade5c_3, grade5d_4, grade6a_3, grade6b_3, grade6c_3, grade6d_3, grade6e_3, grade7a_3, grade7b_3, grade7c_3, grade7d_3, grade8a_3, grade8b_3, grade8c_3, grade8d_3, grade8e_3, grade5a_4, grade5b_4, grade5c_4, grade5d_4, grade6a_4, grade6b_4, grade6c_4, grade6d_4, grade6e_4, grade7a_4, grade7b_4, grade7c_4, grade7d_4, grade8a_4, grade8b_4, grade8c_4, grade8d_4, grade8e_4));
        courseGradeRepo.saveAllAndFlush(Arrays.asList(courseGrade5a_3, courseGrade6a_3, courseGrade7a_3, courseGrade8a_3, courseGrade5a_4, courseGrade6a_4, courseGrade7a_4, courseGrade8a_4));
        feedbackRepo.saveAllAndFlush(Arrays.asList(feedback5a_3, feedback5a_4, feedback5b_3, feedback5b_4, feedback5c_3, feedback5c_4, feedback5d_3, feedback5d_4, feedback6a_3, feedback6a_4, feedback6b_3, feedback6b_4, feedback6c_3, feedback6c_4, feedback6d_3, feedback6d_4, feedback6e_3, feedback6e_4, feedback7a_3, feedback7a_4, feedback7b_3, feedback7b_4, feedback7c_3, feedback7c_4, feedback7d_3, feedback7d_4, feedback8a_3, feedback8a_4, feedback8b_3, feedback8b_4, feedback8c_3, feedback8c_4, feedback8d_3, feedback8d_4, feedback8e_3, feedback8e_4));
    }
}
