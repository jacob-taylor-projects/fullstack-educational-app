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
public class Assignment5to8Seeder implements CommandLineRunner {
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
        System.out.println("Assignment for 'Database Design' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment5_1 = createAssignment("Processes Assignment", faculty5, Date.from(LocalDate.of(2026, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        addStudentToAssignment(assignment5_1, student3);
        addStudentToAssignment(assignment5_1, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_5_1_1 = createProblemAnswer("What is a process in operating systems?", "A process is an instance of a program that is being executed. It includes the program code, data, and other resources required for execution.");
        addAssignmentToProblemAnswer(pa_5_1_1, assignment5_1);
        addProblemAnswerToAssignment(assignment5_1, pa_5_1_1);

        ProblemAnswer pa_5_1_2 = createProblemAnswer("How does the OS handle process creation?", "The OS handles process creation by assigning a unique process identifier (PID), allocating memory, and setting up necessary resources for the new process.");
        addAssignmentToProblemAnswer(pa_5_1_2, assignment5_1);
        addProblemAnswerToAssignment(assignment5_1, pa_5_1_2);

        ProblemAnswer pa_5_1_3 = createProblemAnswer("What is process scheduling?", "Process scheduling is the method used by the OS to allocate CPU time to processes. It determines the order in which processes are executed and how long they run.");
        addAssignmentToProblemAnswer(pa_5_1_3, assignment5_1);
        addProblemAnswerToAssignment(assignment5_1, pa_5_1_3);

        ProblemAnswer pa_5_1_4 = createProblemAnswer("What is process termination?", "Process termination is the act of ending a process's execution. It occurs when a process completes its task or is terminated by the OS for various reasons, such as errors or resource constraints.");
        addAssignmentToProblemAnswer(pa_5_1_4, assignment5_1);
        addProblemAnswerToAssignment(assignment5_1, pa_5_1_4);

        ProblemAnswer pa_5_1_5 = createProblemAnswer("What is inter-process communication (IPC)?", "Inter-process communication (IPC) is a mechanism that allows processes to communicate and synchronize their actions. It can be achieved through methods such as message passing, shared memory, and semaphores.");
        addAssignmentToProblemAnswer(pa_5_1_5, assignment5_1);
        addProblemAnswerToAssignment(assignment5_1, pa_5_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Processes' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment5_2 = createAssignment("Memory Management Assignment", faculty5, Date.from(LocalDate.of(2026, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        addStudentToAssignment(assignment5_2, student3);
        addStudentToAssignment(assignment5_2, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_5_2_1 = createProblemAnswer("What is memory management in operating systems?", "Memory management is the process by which an operating system allocates, tracks, and manages the computer's memory resources.");
        addAssignmentToProblemAnswer(pa_5_2_1, assignment5_2);
        addProblemAnswerToAssignment(assignment5_2, pa_5_2_1);

        ProblemAnswer pa_5_2_2 = createProblemAnswer("What is paging in memory management?", "Paging is a memory management technique that divides the physical memory into fixed-sized blocks called pages. The operating system uses pages to manage memory more efficiently.");
        addAssignmentToProblemAnswer(pa_5_2_2, assignment5_2);
        addProblemAnswerToAssignment(assignment5_2, pa_5_2_2);

        ProblemAnswer pa_5_2_3 = createProblemAnswer("What is segmentation in memory management?", "Segmentation is a memory management technique that divides the memory into variable-sized segments based on the logical divisions of a program, such as functions, data, and stack.");
        addAssignmentToProblemAnswer(pa_5_2_3, assignment5_2);
        addProblemAnswerToAssignment(assignment5_2, pa_5_2_3);

        ProblemAnswer pa_5_2_4 = createProblemAnswer("What is virtual memory?", "Virtual memory is a memory management technique that allows the execution of processes that may not be entirely in the physical memory. It uses disk space to extend the available memory, enabling larger programs to run on systems with limited physical memory.");
        addAssignmentToProblemAnswer(pa_5_2_4, assignment5_2);
        addProblemAnswerToAssignment(assignment5_2, pa_5_2_4);

        ProblemAnswer pa_5_2_5 = createProblemAnswer("How does the OS handle memory allocation?", "The OS handles memory allocation using algorithms such as first-fit, best-fit, and worst-fit to assign memory blocks to processes. These algorithms determine how memory is allocated and deallocated efficiently.");
        addAssignmentToProblemAnswer(pa_5_2_5, assignment5_2);
        addProblemAnswerToAssignment(assignment5_2, pa_5_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Memory Management' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment5_3 = createAssignment("File Systems Assignment", faculty5, Date.from(LocalDate.of(2026, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        addStudentToAssignment(assignment5_3, student3);
        addStudentToAssignment(assignment5_3, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_5_3_1 = createProblemAnswer("What is a file system in operating systems?", "A file system is a method used by operating systems to store, organize, and manage files on storage devices. It defines how data is stored and accessed.");
        addAssignmentToProblemAnswer(pa_5_3_1, assignment5_3);
        addProblemAnswerToAssignment(assignment5_3, pa_5_3_1);

        ProblemAnswer pa_5_3_2 = createProblemAnswer("What is file organization?", "File organization refers to the way files are logically arranged and stored on a storage device. It includes the structure and methods used to store and access data efficiently.");
        addAssignmentToProblemAnswer(pa_5_3_2, assignment5_3);
        addProblemAnswerToAssignment(assignment5_3, pa_5_3_2);

        ProblemAnswer pa_5_3_3 = createProblemAnswer("What is storage allocation in file systems?", "Storage allocation is the process of assigning storage space to files and directories on a storage device. It includes techniques such as contiguous allocation, linked allocation, and indexed allocation.");
        addAssignmentToProblemAnswer(pa_5_3_3, assignment5_3);
        addProblemAnswerToAssignment(assignment5_3, pa_5_3_3);

        ProblemAnswer pa_5_3_4 = createProblemAnswer("What is a directory structure?", "A directory structure is a hierarchical organization of files and directories on a storage device. It helps users and the operating system manage and navigate the file system efficiently.");
        addAssignmentToProblemAnswer(pa_5_3_4, assignment5_3);
        addProblemAnswerToAssignment(assignment5_3, pa_5_3_4);

        ProblemAnswer pa_5_3_5 = createProblemAnswer("What are file access methods?", "File access methods define how data within a file is accessed. Common methods include sequential access, direct access, and indexed access.");
        addAssignmentToProblemAnswer(pa_5_3_5, assignment5_3);
        addProblemAnswerToAssignment(assignment5_3, pa_5_3_5);


// Output for confirmation
        System.out.println("Assignment for 'File Systems' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment5_4 = createAssignment("Scheduling Assignment", faculty5, Date.from(LocalDate.of(2026, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);
        addStudentToAssignment(assignment5_4, student3);
        addStudentToAssignment(assignment5_4, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_5_4_1 = createProblemAnswer("What is CPU scheduling?", "CPU scheduling is the process used by the operating system to manage the execution of processes by allocating CPU time to them.");
        addAssignmentToProblemAnswer(pa_5_4_1, assignment5_4);
        addProblemAnswerToAssignment(assignment5_4, pa_5_4_1);

        ProblemAnswer pa_5_4_2 = createProblemAnswer("What is the purpose of scheduling algorithms?", "The purpose of scheduling algorithms is to optimize the use of CPU resources, improve system performance, and ensure fairness among processes.");
        addAssignmentToProblemAnswer(pa_5_4_2, assignment5_4);
        addProblemAnswerToAssignment(assignment5_4, pa_5_4_2);

        ProblemAnswer pa_5_4_3 = createProblemAnswer("What is round-robin scheduling?", "Round-robin scheduling is a CPU scheduling algorithm that assigns a fixed time slice (quantum) to each process in a circular order, ensuring fair allocation of CPU time.");
        addAssignmentToProblemAnswer(pa_5_4_3, assignment5_4);
        addProblemAnswerToAssignment(assignment5_4, pa_5_4_3);

        ProblemAnswer pa_5_4_4 = createProblemAnswer("What is priority scheduling?", "Priority scheduling is a CPU scheduling algorithm that selects the process with the highest priority for execution. Processes with higher priorities are given preference over those with lower priorities.");
        addAssignmentToProblemAnswer(pa_5_4_4, assignment5_4);
        addProblemAnswerToAssignment(assignment5_4, pa_5_4_4);

        ProblemAnswer pa_5_4_5 = createProblemAnswer("What is a multi-level queue in CPU scheduling?", "A multi-level queue is a scheduling technique that divides processes into multiple queues based on their priority or type. Each queue may use a different scheduling algorithm.");
        addAssignmentToProblemAnswer(pa_5_4_5, assignment5_4);
        addProblemAnswerToAssignment(assignment5_4, pa_5_4_5);


// Output for confirmation
        System.out.println("Assignment for 'Scheduling' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6_1 = createAssignment("OSI Model Assignment", faculty1, Date.from(LocalDate.of(2026, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        addStudentToAssignment(assignment6_1, student3);
        addStudentToAssignment(assignment6_1, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_6_1_1 = createProblemAnswer("What is the OSI model?", "The OSI (Open Systems Interconnection) model standardizes the functions of a telecommunication or computing system irrespective of its underlying structure and technology. It consists of seven layers that describe how data is transmitted across a network.");
        addAssignmentToProblemAnswer(pa_6_1_1, assignment6_1);
        addProblemAnswerToAssignment(assignment6_1, pa_6_1_1);

        ProblemAnswer pa_6_1_2 = createProblemAnswer("What are the seven layers of the OSI model?", "The seven layers of the OSI model are: Physical, Data Link, Network, Transport, Session, Presentation, and Application.");
        addAssignmentToProblemAnswer(pa_6_1_2, assignment6_1);
        addProblemAnswerToAssignment(assignment6_1, pa_6_1_2);

        ProblemAnswer pa_6_1_3 = createProblemAnswer("What is the role of the Physical layer in the OSI model?", "The Physical layer is responsible for the physical connection between devices. It deals with the transmission and reception of raw bitstreams over a physical medium, such as cables or wireless signals.");
        addAssignmentToProblemAnswer(pa_6_1_3, assignment6_1);
        addProblemAnswerToAssignment(assignment6_1, pa_6_1_3);

        ProblemAnswer pa_6_1_4 = createProblemAnswer("What is the role of the Data Link layer in the OSI model?", "The Data Link layer is responsible for node-to-node data transfer and error detection and correction. It ensures that data is transmitted accurately between devices on the same network.");
        addAssignmentToProblemAnswer(pa_6_1_4, assignment6_1);
        addProblemAnswerToAssignment(assignment6_1, pa_6_1_4);

        ProblemAnswer pa_6_1_5 = createProblemAnswer("What is the role of the Network layer in the OSI model?", "The Network layer is responsible for routing and forwarding data packets across different networks. It determines the best path for data to travel from the source to the destination.");
        addAssignmentToProblemAnswer(pa_6_1_5, assignment6_1);
        addProblemAnswerToAssignment(assignment6_1, pa_6_1_5);


// Output for confirmation
        System.out.println("Assignment for 'OSI Model' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6_2 = createAssignment("TCP/IP Assignment", faculty1, Date.from(LocalDate.of(2026, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        addStudentToAssignment(assignment6_2, student3);
        addStudentToAssignment(assignment6_2, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_6_2_1 = createProblemAnswer("What is the TCP/IP model?", "The TCP/IP (Transmission Control Protocol/Internet Protocol) model is the foundational protocol suite for the internet. It standardizes communication functions across networked devices.");
        addAssignmentToProblemAnswer(pa_6_2_1, assignment6_2);
        addProblemAnswerToAssignment(assignment6_2, pa_6_2_1);

        ProblemAnswer pa_6_2_2 = createProblemAnswer("What are the four layers of the TCP/IP model?", "The four layers of the TCP/IP model are: Network Interface, Internet, Transport, and Application.");
        addAssignmentToProblemAnswer(pa_6_2_2, assignment6_2);
        addProblemAnswerToAssignment(assignment6_2, pa_6_2_2);

        ProblemAnswer pa_6_2_3 = createProblemAnswer("What is the role of the Network Interface layer in the TCP/IP model?", "The Network Interface layer is responsible for the physical transmission of data between devices. It includes protocols for data link and hardware addressing.");
        addAssignmentToProblemAnswer(pa_6_2_3, assignment6_2);
        addProblemAnswerToAssignment(assignment6_2, pa_6_2_3);

        ProblemAnswer pa_6_2_4 = createProblemAnswer("What is the role of the Internet layer in the TCP/IP model?", "The Internet layer is responsible for routing and forwarding data packets across networks. It includes protocols such as IP (Internet Protocol) that determine the best path for data to travel.");
        addAssignmentToProblemAnswer(pa_6_2_4, assignment6_2);
        addProblemAnswerToAssignment(assignment6_2, pa_6_2_4);

        ProblemAnswer pa_6_2_5 = createProblemAnswer("What is the role of the Transport layer in the TCP/IP model?", "The Transport layer is responsible for end-to-end communication and data transfer between devices. It includes protocols such as TCP (Transmission Control Protocol) and UDP (User Datagram Protocol) that ensure reliable and error-free transmission.");
        addAssignmentToProblemAnswer(pa_6_2_5, assignment6_2);
        addProblemAnswerToAssignment(assignment6_2, pa_6_2_5);


// Output for confirmation
        System.out.println("Assignment for 'TCP/IP' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6_3 = createAssignment("Network Protocols Assignment", faculty1, Date.from(LocalDate.of(2027, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        addStudentToAssignment(assignment6_3, student3);
        addStudentToAssignment(assignment6_3, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_6_3_1 = createProblemAnswer("What are network protocols?", "Network protocols are rules and standards that govern data exchange over networks. They define how data is formatted, transmitted, and received.");
        addAssignmentToProblemAnswer(pa_6_3_1, assignment6_3);
        addProblemAnswerToAssignment(assignment6_3, pa_6_3_1);

        ProblemAnswer pa_6_3_2 = createProblemAnswer("What is HTTP?", "HTTP (Hypertext Transfer Protocol) is a protocol used for transferring web pages and other resources over the internet. It defines how clients and servers communicate to request and deliver web content.");
        addAssignmentToProblemAnswer(pa_6_3_2, assignment6_3);
        addProblemAnswerToAssignment(assignment6_3, pa_6_3_2);

        ProblemAnswer pa_6_3_3 = createProblemAnswer("What is FTP?", "FTP (File Transfer Protocol) is a protocol used for transferring files between clients and servers over a network. It allows users to upload, download, and manage files on remote servers.");
        addAssignmentToProblemAnswer(pa_6_3_3, assignment6_3);
        addProblemAnswerToAssignment(assignment6_3, pa_6_3_3);

        ProblemAnswer pa_6_3_4 = createProblemAnswer("What is DNS?", "DNS (Domain Name System) is a protocol that translates human-readable domain names into IP addresses. It allows users to access websites using domain names instead of numerical IP addresses.");
        addAssignmentToProblemAnswer(pa_6_3_4, assignment6_3);
        addProblemAnswerToAssignment(assignment6_3, pa_6_3_4);

        ProblemAnswer pa_6_3_5 = createProblemAnswer("What is DHCP?", "DHCP (Dynamic Host Configuration Protocol) is a protocol used to automatically assign IP addresses and other network configuration parameters to devices on a network. It simplifies the process of configuring network settings for devices.");
        addAssignmentToProblemAnswer(pa_6_3_5, assignment6_3);
        addProblemAnswerToAssignment(assignment6_3, pa_6_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Network Protocols' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6_4 = createAssignment("Routing Assignment", faculty1, Date.from(LocalDate.of(2027, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        addStudentToAssignment(assignment6_4, student3);
        addStudentToAssignment(assignment6_4, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_6_4_1 = createProblemAnswer("What is routing in networking?", "Routing is the process of selecting paths in a network along which to send data packets. It determines the best route for data to travel from the source to the destination.");
        addAssignmentToProblemAnswer(pa_6_4_1, assignment6_4);
        addProblemAnswerToAssignment(assignment6_4, pa_6_4_1);

        ProblemAnswer pa_6_4_2 = createProblemAnswer("What are routing algorithms?", "Routing algorithms are algorithms used by routers to determine the best path for data to travel across a network. They include methods such as shortest path, distance vector, and link state algorithms.");
        addAssignmentToProblemAnswer(pa_6_4_2, assignment6_4);
        addProblemAnswerToAssignment(assignment6_4, pa_6_4_2);

        ProblemAnswer pa_6_4_3 = createProblemAnswer("What is OSPF?", "OSPF (Open Shortest Path First) is a link-state routing protocol used in IP networks to determine the best path for data packets. It uses Dijkstra's algorithm to compute the shortest path.");
        addAssignmentToProblemAnswer(pa_6_4_3, assignment6_4);
        addProblemAnswerToAssignment(assignment6_4, pa_6_4_3);

        ProblemAnswer pa_6_4_4 = createProblemAnswer("What is BGP?", "BGP (Border Gateway Protocol) is a path vector routing protocol used to exchange routing information between different autonomous systems on the internet. It is the protocol that makes the internet work by enabling data routing between networks.");
        addAssignmentToProblemAnswer(pa_6_4_4, assignment6_4);
        addProblemAnswerToAssignment(assignment6_4, pa_6_4_4);

        ProblemAnswer pa_6_4_5 = createProblemAnswer("What is the difference between static and dynamic routing?", "Static routing involves manually configuring fixed routes in the routing table, while dynamic routing uses routing protocols to automatically adjust routes based on network conditions.");
        addAssignmentToProblemAnswer(pa_6_4_5, assignment6_4);
        addProblemAnswerToAssignment(assignment6_4, pa_6_4_5);


// Output for confirmation
        System.out.println("Assignment for 'Routing' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6_5 = createAssignment("Switching Assignment", faculty1, Date.from(LocalDate.of(2027, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);
        addStudentToAssignment(assignment6_5, student3);
        addStudentToAssignment(assignment6_5, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_6_5_1 = createProblemAnswer("What is switching in networking?", "Switching is a technique used to forward data packets from one device to another within a network. It ensures that data is transmitted efficiently between devices.");
        addAssignmentToProblemAnswer(pa_6_5_1, assignment6_5);
        addProblemAnswerToAssignment(assignment6_5, pa_6_5_1);

        ProblemAnswer pa_6_5_2 = createProblemAnswer("What are the types of switches used in networking?", "The types of switches used in networking include unmanaged switches, managed switches, and smart switches. Each type offers different levels of control and configuration.");
        addAssignmentToProblemAnswer(pa_6_5_2, assignment6_5);
        addProblemAnswerToAssignment(assignment6_5, pa_6_5_2);

        ProblemAnswer pa_6_5_3 = createProblemAnswer("What is packet switching?", "Packet switching is a method of data transmission where data is broken into smaller packets, which are transmitted independently over the network. It allows for efficient use of network resources.");
        addAssignmentToProblemAnswer(pa_6_5_3, assignment6_5);
        addProblemAnswerToAssignment(assignment6_5, pa_6_5_3);

        ProblemAnswer pa_6_5_4 = createProblemAnswer("What is circuit switching?", "Circuit switching is a method of data transmission where a dedicated communication path is established between devices for the duration of the transmission. It is commonly used in traditional telephone networks.");
        addAssignmentToProblemAnswer(pa_6_5_4, assignment6_5);
        addProblemAnswerToAssignment(assignment6_5, pa_6_5_4);

        ProblemAnswer pa_6_5_5 = createProblemAnswer("What is a VLAN?", "A VLAN (Virtual Local Area Network) is a logical grouping of devices on different physical LANs that can communicate as if they were on the same physical LAN. It enhances network segmentation and security.");
        addAssignmentToProblemAnswer(pa_6_5_5, assignment6_5);
        addProblemAnswerToAssignment(assignment6_5, pa_6_5_5);


// Output for confirmation
        System.out.println("Assignment for 'Switching' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment7_1 = createAssignment("Software Development Life Cycle Assignment", faculty2, Date.from(LocalDate.of(2027, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        addStudentToAssignment(assignment7_1, student3);
        addStudentToAssignment(assignment7_1, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_7_1_1 = createProblemAnswer("What is the Software Development Life Cycle (SDLC)?", "The Software Development Life Cycle (SDLC) is a process for planning, creating, testing, and deploying an information system. It consists of several phases that guide the development of software.");
        addAssignmentToProblemAnswer(pa_7_1_1, assignment7_1);
        addProblemAnswerToAssignment(assignment7_1, pa_7_1_1);

        ProblemAnswer pa_7_1_2 = createProblemAnswer("What are the common phases of the SDLC?", "The common phases of the SDLC include: requirements analysis, system design, implementation, testing, deployment, and maintenance.");
        addAssignmentToProblemAnswer(pa_7_1_2, assignment7_1);
        addProblemAnswerToAssignment(assignment7_1, pa_7_1_2);

        ProblemAnswer pa_7_1_3 = createProblemAnswer("What is the iterative model in the SDLC?", "The iterative model is an SDLC approach where the development process is divided into small, repeating cycles. Each iteration produces a working version of the software, which is refined and improved in subsequent iterations.");
        addAssignmentToProblemAnswer(pa_7_1_3, assignment7_1);
        addProblemAnswerToAssignment(assignment7_1, pa_7_1_3);

        ProblemAnswer pa_7_1_4 = createProblemAnswer("What is the incremental model in the SDLC?", "The incremental model is an SDLC approach where the software is developed and delivered in small, manageable increments. Each increment adds new functionality, allowing for gradual development and early user feedback.");
        addAssignmentToProblemAnswer(pa_7_1_4, assignment7_1);
        addProblemAnswerToAssignment(assignment7_1, pa_7_1_4);

        ProblemAnswer pa_7_1_5 = createProblemAnswer("What is the spiral model in the SDLC?", "The spiral model is an SDLC approach that combines iterative development with risk assessment. It involves repeated cycles of planning, risk analysis, development, and testing, allowing for continuous refinement and risk mitigation.");
        addAssignmentToProblemAnswer(pa_7_1_5, assignment7_1);
        addProblemAnswerToAssignment(assignment7_1, pa_7_1_5);


// Output for confirmation
        System.out.println("Assignment for 'Software Development Life Cycle' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment7_2 = createAssignment("Agile Assignment", faculty2, Date.from(LocalDate.of(2027, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        addStudentToAssignment(assignment7_2, student3);
        addStudentToAssignment(assignment7_2, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_7_2_1 = createProblemAnswer("What is Agile methodology?", "Agile methodology is an iterative approach to software development that emphasizes flexibility, collaboration, and customer feedback. It focuses on delivering small, incremental improvements to the software.");
        addAssignmentToProblemAnswer(pa_7_2_1, assignment7_2);
        addProblemAnswerToAssignment(assignment7_2, pa_7_2_1);

        ProblemAnswer pa_7_2_2 = createProblemAnswer("What are the core principles of Agile?", "The core principles of Agile include: (1) Customer satisfaction through continuous delivery of valuable software, (2) Welcoming changing requirements, (3) Delivering working software frequently, (4) Collaboration between business and developers, (5) Building projects around motivated individuals, (6) Face-to-face communication, (7) Measuring progress through working software, (8) Sustainable development, (9) Technical excellence and good design, (10) Simplicity, (11) Self-organizing teams, and (12) Regular reflection and adjustment.");
        addAssignmentToProblemAnswer(pa_7_2_2, assignment7_2);
        addProblemAnswerToAssignment(assignment7_2, pa_7_2_2);

        ProblemAnswer pa_7_2_3 = createProblemAnswer("What is Scrum?", "Scrum is an Agile framework that provides a structured approach to managing and completing complex projects. It involves roles such as Scrum Master, Product Owner, and Development Team, and ceremonies such as Sprint Planning, Daily Stand-ups, Sprint Reviews, and Retrospectives.");
        addAssignmentToProblemAnswer(pa_7_2_3, assignment7_2);
        addProblemAnswerToAssignment(assignment7_2, pa_7_2_3);

        ProblemAnswer pa_7_2_4 = createProblemAnswer("What is Kanban?", "Kanban is an Agile methodology that focuses on visualizing work, limiting work in progress, and improving flow. It uses a Kanban board to track tasks and emphasizes continuous delivery and process improvement.");
        addAssignmentToProblemAnswer(pa_7_2_4, assignment7_2);
        addProblemAnswerToAssignment(assignment7_2, pa_7_2_4);

        ProblemAnswer pa_7_2_5 = createProblemAnswer("How does Agile handle changing requirements?", "Agile handles changing requirements by welcoming and embracing change. It allows for flexibility and adaptability, enabling teams to respond to new information and customer feedback throughout the development process.");
        addAssignmentToProblemAnswer(pa_7_2_5, assignment7_2);
        addProblemAnswerToAssignment(assignment7_2, pa_7_2_5);


// Output for confirmation
        System.out.println("Assignment for 'Agile' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment7_3 = createAssignment("Waterfall Assignment", faculty2, Date.from(LocalDate.of(2027, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        addStudentToAssignment(assignment7_3, student3);
        addStudentToAssignment(assignment7_3, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_7_3_1 = createProblemAnswer("What is the Waterfall model?", "The Waterfall model is a linear and sequential approach to software development. It involves completing each phase of the development process before moving on to the next phase.");
        addAssignmentToProblemAnswer(pa_7_3_1, assignment7_3);
        addProblemAnswerToAssignment(assignment7_3, pa_7_3_1);

        ProblemAnswer pa_7_3_2 = createProblemAnswer("What are the phases of the Waterfall model?", "The phases of the Waterfall model include: requirements analysis, system design, implementation, testing, deployment, and maintenance.");
        addAssignmentToProblemAnswer(pa_7_3_2, assignment7_3);
        addProblemAnswerToAssignment(assignment7_3, pa_7_3_2);

        ProblemAnswer pa_7_3_3 = createProblemAnswer("What is the purpose of the requirements analysis phase in the Waterfall model?", "The purpose of the requirements analysis phase is to gather and define the functional and non-functional requirements of the software. It involves identifying the needs and expectations of stakeholders and documenting them in a requirements specification.");
        addAssignmentToProblemAnswer(pa_7_3_3, assignment7_3);
        addProblemAnswerToAssignment(assignment7_3, pa_7_3_3);

        ProblemAnswer pa_7_3_4 = createProblemAnswer("What is the purpose of the system design phase in the Waterfall model?", "The purpose of the system design phase is to create a detailed design of the software based on the requirements specification. It involves defining the architecture, components, interfaces, and data structures of the system.");
        addAssignmentToProblemAnswer(pa_7_3_4, assignment7_3);
        addProblemAnswerToAssignment(assignment7_3, pa_7_3_4);

        ProblemAnswer pa_7_3_5 = createProblemAnswer("What is the purpose of the implementation phase in the Waterfall model?", "The purpose of the implementation phase is to develop the actual code for the software based on the design specifications. It involves programming, coding, and integrating the various components of the system.");
        addAssignmentToProblemAnswer(pa_7_3_5, assignment7_3);
        addProblemAnswerToAssignment(assignment7_3, pa_7_3_5);


// Output for confirmation
        System.out.println("Assignment for 'Waterfall' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment7_4 = createAssignment("Project Management Assignment", faculty2, Date.from(LocalDate.of(2027, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);
        addStudentToAssignment(assignment7_4, student3);
        addStudentToAssignment(assignment7_4, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_7_4_1 = createProblemAnswer("What is project management?", "Project management involves planning, organizing, and managing resources to achieve specific goals and complete projects efficiently. It encompasses processes, methods, skills, and knowledge required to deliver projects successfully.");
        addAssignmentToProblemAnswer(pa_7_4_1, assignment7_4);
        addProblemAnswerToAssignment(assignment7_4, pa_7_4_1);

        ProblemAnswer pa_7_4_2 = createProblemAnswer("What are the key phases of project management?", "The key phases of project management include: (1) Initiation, (2) Planning, (3) Execution, (4) Monitoring and Controlling, and (5) Closure.");
        addAssignmentToProblemAnswer(pa_7_4_2, assignment7_4);
        addProblemAnswerToAssignment(assignment7_4, pa_7_4_2);

        ProblemAnswer pa_7_4_3 = createProblemAnswer("What is project planning?", "Project planning involves defining the project scope, objectives, deliverables, timelines, and resource requirements. It includes creating a project plan that outlines the tasks, schedule, budget, and risk management strategies.");
        addAssignmentToProblemAnswer(pa_7_4_3, assignment7_4);
        addProblemAnswerToAssignment(assignment7_4, pa_7_4_3);

        ProblemAnswer pa_7_4_4 = createProblemAnswer("What is project scheduling?", "Project scheduling involves creating a timeline for the project's tasks and activities. It includes determining the start and end dates, dependencies, milestones, and resource allocation to ensure timely project completion.");
        addAssignmentToProblemAnswer(pa_7_4_4, assignment7_4);
        addProblemAnswerToAssignment(assignment7_4, pa_7_4_4);

        ProblemAnswer pa_7_4_5 = createProblemAnswer("What is resource management in project management?", "Resource management involves identifying, allocating, and managing the resources needed for a project. It includes managing human resources, materials, equipment, and finances to ensure optimal utilization and efficiency.");
        addAssignmentToProblemAnswer(pa_7_4_5, assignment7_4);
        addProblemAnswerToAssignment(assignment7_4, pa_7_4_5);


// Output for confirmation
        System.out.println("Assignment for 'Project Management' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment8_1 = createAssignment("HTML Assignment", faculty3, Date.from(LocalDate.of(2027, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        addStudentToAssignment(assignment8_1, student3);
        addStudentToAssignment(assignment8_1, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_8_1_1 = createProblemAnswer("What is HTML?", "HTML (HyperText Markup Language) is the standard language for creating web pages. It defines the structure and content of web pages using tags and attributes.");
        addAssignmentToProblemAnswer(pa_8_1_1, assignment8_1);
        addProblemAnswerToAssignment(assignment8_1, pa_8_1_1);

        ProblemAnswer pa_8_1_2 = createProblemAnswer("What are HTML tags?", "HTML tags are the building blocks of HTML. They are used to define and structure the content of web pages. Tags are enclosed in angle brackets, such as <html>, <head>, <body>, etc.");
        addAssignmentToProblemAnswer(pa_8_1_2, assignment8_1);
        addProblemAnswerToAssignment(assignment8_1, pa_8_1_2);

        ProblemAnswer pa_8_1_3 = createProblemAnswer("What is an HTML attribute?", "An HTML attribute provides additional information about an element. Attributes are specified within the opening tag and usually come in name/value pairs, such as class=\"classname\" or src=\"image.jpg\".");
        addAssignmentToProblemAnswer(pa_8_1_3, assignment8_1);
        addProblemAnswerToAssignment(assignment8_1, pa_8_1_3);

        ProblemAnswer pa_8_1_4 = createProblemAnswer("What is the purpose of the <head> tag in HTML?", "The <head> tag contains meta-information about the document, such as its title, character set, and links to stylesheets or scripts. It does not contain any content that is directly displayed on the web page.");
        addAssignmentToProblemAnswer(pa_8_1_4, assignment8_1);
        addProblemAnswerToAssignment(assignment8_1, pa_8_1_4);

        ProblemAnswer pa_8_1_5 = createProblemAnswer("What is the purpose of the <body> tag in HTML?", "The <body> tag contains the content of the web page, such as text, images, links, and other elements. It is the main part of the HTML document that is displayed in the browser.");
        addAssignmentToProblemAnswer(pa_8_1_5, assignment8_1);
        addProblemAnswerToAssignment(assignment8_1, pa_8_1_5);


// Output for confirmation
        System.out.println("Assignment for 'HTML' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment8_2 = createAssignment("CSS Assignment", faculty3, Date.from(LocalDate.of(2027, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        addStudentToAssignment(assignment8_2, student3);
        addStudentToAssignment(assignment8_2, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_8_2_1 = createProblemAnswer("What is CSS?", "CSS (Cascading Style Sheets) is a language used to style HTML documents. It controls the layout, colors, fonts, and overall visual presentation of web pages.");
        addAssignmentToProblemAnswer(pa_8_2_1, assignment8_2);
        addProblemAnswerToAssignment(assignment8_2, pa_8_2_1);

        ProblemAnswer pa_8_2_2 = createProblemAnswer("How do you link a CSS file to an HTML document?", "To link a CSS file to an HTML document, use the <link> tag within the <head> section. For example: <link rel=\"stylesheet\" href=\"styles.css\">");
        addAssignmentToProblemAnswer(pa_8_2_2, assignment8_2);
        addProblemAnswerToAssignment(assignment8_2, pa_8_2_2);

        ProblemAnswer pa_8_2_3 = createProblemAnswer("What is the CSS box model?", "The CSS box model describes the rectangular boxes generated for elements in the document tree. It includes the content, padding, border, and margin areas.");
        addAssignmentToProblemAnswer(pa_8_2_3, assignment8_2);
        addProblemAnswerToAssignment(assignment8_2, pa_8_2_3);

        ProblemAnswer pa_8_2_4 = createProblemAnswer("How do you apply styles to HTML elements using CSS?", "Styles can be applied to HTML elements using selectors in a CSS file. For example, to style all <p> elements: \np {\n  color: blue;\n  font-size: 16px;\n}");
        addAssignmentToProblemAnswer(pa_8_2_4, assignment8_2);
        addProblemAnswerToAssignment(assignment8_2, pa_8_2_4);

        ProblemAnswer pa_8_2_5 = createProblemAnswer("What are CSS selectors?", "CSS selectors are patterns used to select and style specific elements on a web page. Examples include element selectors, class selectors, ID selectors, and attribute selectors.");
        addAssignmentToProblemAnswer(pa_8_2_5, assignment8_2);
        addProblemAnswerToAssignment(assignment8_2, pa_8_2_5);


// Output for confirmation
        System.out.println("Assignment for 'CSS' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment8_3 = createAssignment("JavaScript Assignment", faculty3, Date.from(LocalDate.of(2027, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        addStudentToAssignment(assignment8_3, student3);
        addStudentToAssignment(assignment8_3, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_8_3_1 = createProblemAnswer("What is JavaScript?", "JavaScript is a programming language that allows you to create interactive and dynamic web content. It can manipulate the DOM (Document Object Model), handle events, and perform animations.");
        addAssignmentToProblemAnswer(pa_8_3_1, assignment8_3);
        addProblemAnswerToAssignment(assignment8_3, pa_8_3_1);

        ProblemAnswer pa_8_3_2 = createProblemAnswer("How do you include JavaScript in an HTML document?", "To include JavaScript in an HTML document, use the <script> tag. For example: \n<script src=\"script.js\"></script> for an external script or <script>\n// JavaScript code here\n</script> for an internal script.");
        addAssignmentToProblemAnswer(pa_8_3_2, assignment8_3);
        addProblemAnswerToAssignment(assignment8_3, pa_8_3_2);

        ProblemAnswer pa_8_3_3 = createProblemAnswer("What is the DOM in JavaScript?", "The DOM (Document Object Model) is a programming interface for HTML and XML documents. It represents the structure of a document as a tree of objects that can be manipulated with JavaScript.");
        addAssignmentToProblemAnswer(pa_8_3_3, assignment8_3);
        addProblemAnswerToAssignment(assignment8_3, pa_8_3_3);

        ProblemAnswer pa_8_3_4 = createProblemAnswer("How do you select an HTML element using JavaScript?", "You can select an HTML element using JavaScript with methods like getElementById, getElementsByClassName, getElementsByTagName, querySelector, and querySelectorAll. For example: \ndocument.getElementById('elementID');");
        addAssignmentToProblemAnswer(pa_8_3_4, assignment8_3);
        addProblemAnswerToAssignment(assignment8_3, pa_8_3_4);

        ProblemAnswer pa_8_3_5 = createProblemAnswer("How do you handle events in JavaScript?", "You can handle events in JavaScript by adding event listeners to elements. For example: \ndocument.getElementById('button').addEventListener('click', function() {\n  alert('Button clicked!');\n});");
        addAssignmentToProblemAnswer(pa_8_3_5, assignment8_3);
        addProblemAnswerToAssignment(assignment8_3, pa_8_3_5);


// Output for confirmation
        System.out.println("Assignment for 'JavaScript' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment8_4 = createAssignment("React Assignment", faculty3, Date.from(LocalDate.of(2027, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        addStudentToAssignment(assignment8_4, student3);
        addStudentToAssignment(assignment8_4, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_8_4_1 = createProblemAnswer("What is React?", "React is a popular JavaScript library for building user interfaces. It allows developers to create reusable UI components and manage the state of applications efficiently.");
        addAssignmentToProblemAnswer(pa_8_4_1, assignment8_4);
        addProblemAnswerToAssignment(assignment8_4, pa_8_4_1);

        ProblemAnswer pa_8_4_2 = createProblemAnswer("What are React components?", "React components are the building blocks of a React application. They are reusable pieces of UI that can be combined to create complex user interfaces. Components can be functional or class-based.");
        addAssignmentToProblemAnswer(pa_8_4_2, assignment8_4);
        addProblemAnswerToAssignment(assignment8_4, pa_8_4_2);

        ProblemAnswer pa_8_4_3 = createProblemAnswer("What is JSX in React?", "JSX (JavaScript XML) is a syntax extension for JavaScript that allows developers to write HTML-like code within their JavaScript. It makes it easier to create React elements and components.");
        addAssignmentToProblemAnswer(pa_8_4_3, assignment8_4);
        addProblemAnswerToAssignment(assignment8_4, pa_8_4_3);

        ProblemAnswer pa_8_4_4 = createProblemAnswer("What is state in React?", "State is an object that holds data that can change over time and affect the rendering of a component. State is managed within the component and can be updated using the setState method in class components or the useState hook in functional components.");
        addAssignmentToProblemAnswer(pa_8_4_4, assignment8_4);
        addProblemAnswerToAssignment(assignment8_4, pa_8_4_4);

        ProblemAnswer pa_8_4_5 = createProblemAnswer("What are props in React?", "Props (short for properties) are a way of passing data from parent components to child components. They are read-only and used to customize the behavior and appearance of components.");
        addAssignmentToProblemAnswer(pa_8_4_5, assignment8_4);
        addProblemAnswerToAssignment(assignment8_4, pa_8_4_5);


// Output for confirmation
        System.out.println("Assignment for 'React' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment8_5 = createAssignment("Backend Integration Assignment", faculty3, Date.from(LocalDate.of(2027, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);
        addStudentToAssignment(assignment8_5, student3);
        addStudentToAssignment(assignment8_5, student4);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_8_5_1 = createProblemAnswer("What is backend integration?", "Backend integration involves connecting front-end web applications with backend services. It allows the front end to communicate with the server, fetch data, and perform server-side operations.");
        addAssignmentToProblemAnswer(pa_8_5_1, assignment8_5);
        addProblemAnswerToAssignment(assignment8_5, pa_8_5_1);

        ProblemAnswer pa_8_5_2 = createProblemAnswer("What is a RESTful API?", "A RESTful API (Representational State Transfer) is an architectural style for designing networked applications. It uses standard HTTP methods (GET, POST, PUT, DELETE) to interact with resources and perform CRUD (Create, Read, Update, Delete) operations.");
        addAssignmentToProblemAnswer(pa_8_5_2, assignment8_5);
        addProblemAnswerToAssignment(assignment8_5, pa_8_5_2);

        ProblemAnswer pa_8_5_3 = createProblemAnswer("How do you fetch data from a RESTful API using JavaScript?", "You can fetch data from a RESTful API using JavaScript's Fetch API. For example: \nfetch('https://api.example.com/data')\n  .then(response => response.json())\n  .then(data => console.log(data));");
        addAssignmentToProblemAnswer(pa_8_5_3, assignment8_5);
        addProblemAnswerToAssignment(assignment8_5, pa_8_5_3);

        ProblemAnswer pa_8_5_4 = createProblemAnswer("What is server-side rendering?", "Server-side rendering (SSR) is the process of rendering web pages on the server instead of the client. It improves the initial load time and SEO by delivering fully rendered HTML pages to the browser.");
        addAssignmentToProblemAnswer(pa_8_5_4, assignment8_5);
        addProblemAnswerToAssignment(assignment8_5, pa_8_5_4);

        ProblemAnswer pa_8_5_5 = createProblemAnswer("What is the difference between client-side and server-side rendering?", "Client-side rendering (CSR) renders web pages in the browser using JavaScript, while server-side rendering (SSR) renders web pages on the server before sending them to the browser. CSR offers a more dynamic experience, while SSR provides faster initial load times.");
        addAssignmentToProblemAnswer(pa_8_5_5, assignment8_5);
        addProblemAnswerToAssignment(assignment8_5, pa_8_5_5);


// Output for confirmation
        System.out.println("Assignment for 'Backend Integration' unit created with 10 problem answers, due date, faculty, and syllabus.");


        // Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment4_4.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa5_1_1_student3 = createStudentAnswer(student3, pa_5_1_1, "A process is an instance of a program being executed, including the program code, data, and other resources required for execution.");
        addStudentAnswerToProblemAnswer(pa_5_1_1, sa5_1_1_student3);

        StudentAnswer sa5_1_2_student3 = createStudentAnswer(student3, pa_5_1_2, "The OS handles process creation by assigning a unique PID, allocating memory, and setting up necessary resources for the new process.");
        addStudentAnswerToProblemAnswer(pa_5_1_2, sa5_1_2_student3);

        StudentAnswer sa5_1_3_student3 = createStudentAnswer(student3, pa_5_1_3, "Process scheduling is the method used by the OS to allocate CPU time to processes, determining the order of execution and duration.");
        addStudentAnswerToProblemAnswer(pa_5_1_3, sa5_1_3_student3);

        StudentAnswer sa5_1_4_student3 = createStudentAnswer(student3, pa_5_1_4, "Process termination is the act of ending a process's execution, occurring when a process completes its task or is terminated by the OS.");
        addStudentAnswerToProblemAnswer(pa_5_1_4, sa5_1_4_student3);

        StudentAnswer sa5_1_5_student3 = createStudentAnswer(student3, pa_5_1_5, "IPC allows processes to communicate and synchronize their actions through methods like message passing, shared memory, and semaphores.");
        addStudentAnswerToProblemAnswer(pa_5_1_5, sa5_1_5_student3);

        // Creating StudentAnswer instances for student4
        StudentAnswer sa5_1_1_student4 = createStudentAnswer(student4, pa_5_1_1, "A process is an instance of a program being executed, including the program code, data, and other resources required for execution.");
        addStudentAnswerToProblemAnswer(pa_5_1_1, sa5_1_1_student4);

        StudentAnswer sa5_1_2_student4 = createStudentAnswer(student4, pa_5_1_2, "The OS handles process creation by assigning a unique PID, allocating memory, and setting up necessary resources for the new process.");
        addStudentAnswerToProblemAnswer(pa_5_1_2, sa5_1_2_student4);

        StudentAnswer sa5_1_3_student4 = createStudentAnswer(student4, pa_5_1_3, "Process scheduling is the method used by the OS to allocate CPU time to processes, determining the order of execution and duration.");
        addStudentAnswerToProblemAnswer(pa_5_1_3, sa5_1_3_student4);

        StudentAnswer sa5_1_4_student4 = createStudentAnswer(student4, pa_5_1_4, "Process termination is the act of ending a process's execution, occurring when a process completes its task or is terminated by the OS.");
        addStudentAnswerToProblemAnswer(pa_5_1_4, sa5_1_4_student4);

        StudentAnswer sa5_1_5_student4 = createStudentAnswer(student4, pa_5_1_5, "IPC allows processes to communicate and synchronize their actions through methods like message passing, shared memory, and semaphores.");
        addStudentAnswerToProblemAnswer(pa_5_1_5, sa5_1_5_student4);

        // Creating StudentAnswer instances for student3
        StudentAnswer sa5_2_1_student3 = createStudentAnswer(student3, pa_5_2_1, "Memory management is how the OS allocates, tracks, and manages computer memory.");
        addStudentAnswerToProblemAnswer(pa_5_2_1, sa5_2_1_student3);

        StudentAnswer sa5_2_2_student3 = createStudentAnswer(student3, pa_5_2_2, "Paging divides physical memory into fixed-sized blocks called pages.");
        addStudentAnswerToProblemAnswer(pa_5_2_2, sa5_2_2_student3);

        StudentAnswer sa5_2_3_student3 = createStudentAnswer(student3, pa_5_2_3, "Segmentation divides memory into variable-sized segments based on logical divisions of a program.");
        addStudentAnswerToProblemAnswer(pa_5_2_3, sa5_2_3_student3);

        StudentAnswer sa5_2_4_student3 = createStudentAnswer(student3, pa_5_2_4, "Virtual memory allows processes to execute that may not be entirely in physical memory by using disk space.");
        addStudentAnswerToProblemAnswer(pa_5_2_4, sa5_2_4_student3);

        StudentAnswer sa5_2_5_student3 = createStudentAnswer(student3, pa_5_2_5, "The OS uses algorithms like first-fit, best-fit, and worst-fit to allocate memory blocks to processes efficiently.");
        addStudentAnswerToProblemAnswer(pa_5_2_5, sa5_2_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa5_2_1_student4 = createStudentAnswer(student4, pa_5_2_1, "Memory management is how the OS allocates, tracks, and manages computer memory.");
        addStudentAnswerToProblemAnswer(pa_5_2_1, sa5_2_1_student4);

        StudentAnswer sa5_2_2_student4 = createStudentAnswer(student4, pa_5_2_2, "Paging divides physical memory into fixed-sized blocks called pages.");
        addStudentAnswerToProblemAnswer(pa_5_2_2, sa5_2_2_student4);

        StudentAnswer sa5_2_3_student4 = createStudentAnswer(student4, pa_5_2_3, "Segmentation divides memory into variable-sized segments based on logical divisions of a program.");
        addStudentAnswerToProblemAnswer(pa_5_2_3, sa5_2_3_student4);

        StudentAnswer sa5_2_4_student4 = createStudentAnswer(student4, pa_5_2_4, "Virtual memory allows processes to execute that may not be entirely in physical memory by using disk space.");
        addStudentAnswerToProblemAnswer(pa_5_2_4, sa5_2_4_student4);

        StudentAnswer sa5_2_5_student4 = createStudentAnswer(student4, pa_5_2_5, "The OS uses algorithms like first-fit, best-fit, and worst-fit to allocate memory blocks to processes efficiently.");
        addStudentAnswerToProblemAnswer(pa_5_2_5, sa5_2_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for student3 and student4 for all 10 problem answers in assignment5_2.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa5_3_1_student3 = createStudentAnswer(student3, pa_5_3_1, "A file system is a method used by operating systems to store, organize, and manage files on storage devices.");
        addStudentAnswerToProblemAnswer(pa_5_3_1, sa5_3_1_student3);

        StudentAnswer sa5_3_2_student3 = createStudentAnswer(student3, pa_5_3_2, "File organization refers to how files are logically arranged and stored on a storage device.");
        addStudentAnswerToProblemAnswer(pa_5_3_2, sa5_3_2_student3);

        StudentAnswer sa5_3_3_student3 = createStudentAnswer(student3, pa_5_3_3, "Storage allocation is the process of assigning storage space to files and directories on a storage device.");
        addStudentAnswerToProblemAnswer(pa_5_3_3, sa5_3_3_student3);

        StudentAnswer sa5_3_4_student3 = createStudentAnswer(student3, pa_5_3_4, "A directory structure is a hierarchical organization of files and directories on a storage device.");
        addStudentAnswerToProblemAnswer(pa_5_3_4, sa5_3_4_student3);

        StudentAnswer sa5_3_5_student3 = createStudentAnswer(student3, pa_5_3_5, "File access methods define how data within a file is accessed, including sequential, direct, and indexed access.");
        addStudentAnswerToProblemAnswer(pa_5_3_5, sa5_3_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa5_3_1_student4 = createStudentAnswer(student4, pa_5_3_1, "A file system is a method used by operating systems to store, organize, and manage files on storage devices.");
        addStudentAnswerToProblemAnswer(pa_5_3_1, sa5_3_1_student4);

        StudentAnswer sa5_3_2_student4 = createStudentAnswer(student4, pa_5_3_2, "File organization refers to how files are logically arranged and stored on a storage device.");
        addStudentAnswerToProblemAnswer(pa_5_3_2, sa5_3_2_student4);

        StudentAnswer sa5_3_3_student4 = createStudentAnswer(student4, pa_5_3_3, "Storage allocation is the process of assigning storage space to files and directories on a storage device.");
        addStudentAnswerToProblemAnswer(pa_5_3_3, sa5_3_3_student4);

        StudentAnswer sa5_3_4_student4 = createStudentAnswer(student4, pa_5_3_4, "A directory structure is a hierarchical organization of files and directories on a storage device.");
        addStudentAnswerToProblemAnswer(pa_5_3_4, sa5_3_4_student4);

        StudentAnswer sa5_3_5_student4 = createStudentAnswer(student4, pa_5_3_5, "File access methods define how data within a file is accessed, including sequential, direct, and indexed access.");
        addStudentAnswerToProblemAnswer(pa_5_3_5, sa5_3_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment5_3.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa5_4_1_student3 = createStudentAnswer(student3, pa_5_4_1, "CPU scheduling manages the execution of processes by allocating CPU time.");
        addStudentAnswerToProblemAnswer(pa_5_4_1, sa5_4_1_student3);

        StudentAnswer sa5_4_2_student3 = createStudentAnswer(student3, pa_5_4_2, "Scheduling algorithms optimize CPU usage, improve performance, and ensure fairness among processes.");
        addStudentAnswerToProblemAnswer(pa_5_4_2, sa5_4_2_student3);

        StudentAnswer sa5_4_3_student3 = createStudentAnswer(student3, pa_5_4_3, "Round-robin scheduling assigns a fixed time slice to each process in a circular order.");
        addStudentAnswerToProblemAnswer(pa_5_4_3, sa5_4_3_student3);

        StudentAnswer sa5_4_4_student3 = createStudentAnswer(student3, pa_5_4_4, "Priority scheduling selects the process with the highest priority for execution.");
        addStudentAnswerToProblemAnswer(pa_5_4_4, sa5_4_4_student3);

        StudentAnswer sa5_4_5_student3 = createStudentAnswer(student3, pa_5_4_5, "A multi-level queue divides processes into multiple queues based on priority or type.");
        addStudentAnswerToProblemAnswer(pa_5_4_5, sa5_4_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa5_4_1_student4 = createStudentAnswer(student4, pa_5_4_1, "CPU scheduling manages the execution of processes by allocating CPU time.");
        addStudentAnswerToProblemAnswer(pa_5_4_1, sa5_4_1_student4);

        StudentAnswer sa5_4_2_student4 = createStudentAnswer(student4, pa_5_4_2, "Scheduling algorithms optimize CPU usage, improve performance, and ensure fairness among processes.");
        addStudentAnswerToProblemAnswer(pa_5_4_2, sa5_4_2_student4);

        StudentAnswer sa5_4_3_student4 = createStudentAnswer(student4, pa_5_4_3, "Round-robin scheduling assigns a fixed time slice to each process in a circular order.");
        addStudentAnswerToProblemAnswer(pa_5_4_3, sa5_4_3_student4);

        StudentAnswer sa5_4_4_student4 = createStudentAnswer(student4, pa_5_4_4, "Priority scheduling selects the process with the highest priority for execution.");
        addStudentAnswerToProblemAnswer(pa_5_4_4, sa5_4_4_student4);

        StudentAnswer sa5_4_5_student4 = createStudentAnswer(student4, pa_5_4_5, "A multi-level queue divides processes into multiple queues based on priority or type.");
        addStudentAnswerToProblemAnswer(pa_5_4_5, sa5_4_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment5_4.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa6_1_1_student3 = createStudentAnswer(student3, pa_6_1_1, "The OSI model standardizes the functions of a telecommunication or computing system in seven layers.");
        addStudentAnswerToProblemAnswer(pa_6_1_1, sa6_1_1_student3);

        StudentAnswer sa6_1_2_student3 = createStudentAnswer(student3, pa_6_1_2, "The seven layers of the OSI model are: Physical, Data Link, Network, Transport, Session, Presentation, and Application.");
        addStudentAnswerToProblemAnswer(pa_6_1_2, sa6_1_2_student3);

        StudentAnswer sa6_1_3_student3 = createStudentAnswer(student3, pa_6_1_3, "The Physical layer deals with the transmission and reception of raw bitstreams over a physical medium.");
        addStudentAnswerToProblemAnswer(pa_6_1_3, sa6_1_3_student3);

        StudentAnswer sa6_1_4_student3 = createStudentAnswer(student3, pa_6_1_4, "The Data Link layer is responsible for node-to-node data transfer and error detection and correction.");
        addStudentAnswerToProblemAnswer(pa_6_1_4, sa6_1_4_student3);

        StudentAnswer sa6_1_5_student3 = createStudentAnswer(student3, pa_6_1_5, "The Network layer handles routing and forwarding data packets across different networks.");
        addStudentAnswerToProblemAnswer(pa_6_1_5, sa6_1_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa6_1_1_student4 = createStudentAnswer(student4, pa_6_1_1, "The OSI model standardizes the functions of a telecommunication or computing system in seven layers.");
        addStudentAnswerToProblemAnswer(pa_6_1_1, sa6_1_1_student4);

        StudentAnswer sa6_1_2_student4 = createStudentAnswer(student4, pa_6_1_2, "The seven layers of the OSI model are: Physical, Data Link, Network, Transport, Session, Presentation, and Application.");
        addStudentAnswerToProblemAnswer(pa_6_1_2, sa6_1_2_student4);

        StudentAnswer sa6_1_3_student4 = createStudentAnswer(student4, pa_6_1_3, "The Physical layer deals with the transmission and reception of raw bitstreams over a physical medium.");
        addStudentAnswerToProblemAnswer(pa_6_1_3, sa6_1_3_student4);

        StudentAnswer sa6_1_4_student4 = createStudentAnswer(student4, pa_6_1_4, "The Data Link layer is responsible for node-to-node data transfer and error detection and correction.");
        addStudentAnswerToProblemAnswer(pa_6_1_4, sa6_1_4_student4);

        StudentAnswer sa6_1_5_student4 = createStudentAnswer(student4, pa_6_1_5, "The Network layer handles routing and forwarding data packets across different networks.");
        addStudentAnswerToProblemAnswer(pa_6_1_5, sa6_1_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment6_1.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa6_2_1_student3 = createStudentAnswer(student3, pa_6_2_1, "The TCP/IP model is the foundational protocol suite for the internet, standardizing communication functions.");
        addStudentAnswerToProblemAnswer(pa_6_2_1, sa6_2_1_student3);

        StudentAnswer sa6_2_2_student3 = createStudentAnswer(student3, pa_6_2_2, "The four layers of the TCP/IP model are: Network Interface, Internet, Transport, and Application.");
        addStudentAnswerToProblemAnswer(pa_6_2_2, sa6_2_2_student3);

        StudentAnswer sa6_2_3_student3 = createStudentAnswer(student3, pa_6_2_3, "The Network Interface layer handles the physical transmission of data between devices, including protocols for data link and hardware addressing.");
        addStudentAnswerToProblemAnswer(pa_6_2_3, sa6_2_3_student3);

        StudentAnswer sa6_2_4_student3 = createStudentAnswer(student3, pa_6_2_4, "The Internet layer manages routing and forwarding data packets across networks, including protocols like IP.");
        addStudentAnswerToProblemAnswer(pa_6_2_4, sa6_2_4_student3);

        StudentAnswer sa6_2_5_student3 = createStudentAnswer(student3, pa_6_2_5, "The Transport layer is responsible for end-to-end communication and data transfer, ensuring reliability with protocols like TCP and UDP.");
        addStudentAnswerToProblemAnswer(pa_6_2_5, sa6_2_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa6_2_1_student4 = createStudentAnswer(student4, pa_6_2_1, "The TCP/IP model is the foundational protocol suite for the internet, standardizing communication functions.");
        addStudentAnswerToProblemAnswer(pa_6_2_1, sa6_2_1_student4);

        StudentAnswer sa6_2_2_student4 = createStudentAnswer(student4, pa_6_2_2, "The four layers of the TCP/IP model are: Network Interface, Internet, Transport, and Application.");
        addStudentAnswerToProblemAnswer(pa_6_2_2, sa6_2_2_student4);

        StudentAnswer sa6_2_3_student4 = createStudentAnswer(student4, pa_6_2_3, "The Network Interface layer handles the physical transmission of data between devices, including protocols for data link and hardware addressing.");
        addStudentAnswerToProblemAnswer(pa_6_2_3, sa6_2_3_student4);

        StudentAnswer sa6_2_4_student4 = createStudentAnswer(student4, pa_6_2_4, "The Internet layer manages routing and forwarding data packets across networks, including protocols like IP.");
        addStudentAnswerToProblemAnswer(pa_6_2_4, sa6_2_4_student4);

        StudentAnswer sa6_2_5_student4 = createStudentAnswer(student4, pa_6_2_5, "The Transport layer is responsible for end-to-end communication and data transfer, ensuring reliability with protocols like TCP and UDP.");
        addStudentAnswerToProblemAnswer(pa_6_2_5, sa6_2_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment6_2.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa6_3_1_student3 = createStudentAnswer(student3, pa_6_3_1, "Network protocols are rules and standards that govern data exchange over networks.");
        addStudentAnswerToProblemAnswer(pa_6_3_1, sa6_3_1_student3);

        StudentAnswer sa6_3_2_student3 = createStudentAnswer(student3, pa_6_3_2, "HTTP is a protocol for transferring web pages and other resources over the internet.");
        addStudentAnswerToProblemAnswer(pa_6_3_2, sa6_3_2_student3);

        StudentAnswer sa6_3_3_student3 = createStudentAnswer(student3, pa_6_3_3, "FTP is a protocol for transferring files between clients and servers over a network.");
        addStudentAnswerToProblemAnswer(pa_6_3_3, sa6_3_3_student3);

        StudentAnswer sa6_3_4_student3 = createStudentAnswer(student3, pa_6_3_4, "DNS translates human-readable domain names into IP addresses.");
        addStudentAnswerToProblemAnswer(pa_6_3_4, sa6_3_4_student3);

        StudentAnswer sa6_3_5_student3 = createStudentAnswer(student3, pa_6_3_5, "DHCP automatically assigns IP addresses and other network configuration parameters to devices on a network.");
        addStudentAnswerToProblemAnswer(pa_6_3_5, sa6_3_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa6_3_1_student4 = createStudentAnswer(student4, pa_6_3_1, "Network protocols are rules and standards that govern data exchange over networks.");
        addStudentAnswerToProblemAnswer(pa_6_3_1, sa6_3_1_student4);

        StudentAnswer sa6_3_2_student4 = createStudentAnswer(student4, pa_6_3_2, "HTTP is a protocol for transferring web pages and other resources over the internet.");
        addStudentAnswerToProblemAnswer(pa_6_3_2, sa6_3_2_student4);

        StudentAnswer sa6_3_3_student4 = createStudentAnswer(student4, pa_6_3_3, "FTP is a protocol for transferring files between clients and servers over a network.");
        addStudentAnswerToProblemAnswer(pa_6_3_3, sa6_3_3_student4);

        StudentAnswer sa6_3_4_student4 = createStudentAnswer(student4, pa_6_3_4, "DNS translates human-readable domain names into IP addresses.");
        addStudentAnswerToProblemAnswer(pa_6_3_4, sa6_3_4_student4);

        StudentAnswer sa6_3_5_student4 = createStudentAnswer(student4, pa_6_3_5, "DHCP automatically assigns IP addresses and other network configuration parameters to devices on a network.");
        addStudentAnswerToProblemAnswer(pa_6_3_5, sa6_3_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment6_3.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa6_4_1_student3 = createStudentAnswer(student3, pa_6_4_1, "Routing is the process of selecting paths in a network to send data packets.");
        addStudentAnswerToProblemAnswer(pa_6_4_1, sa6_4_1_student3);

        StudentAnswer sa6_4_2_student3 = createStudentAnswer(student3, pa_6_4_2, "Routing algorithms determine the best path for data to travel across a network.");
        addStudentAnswerToProblemAnswer(pa_6_4_2, sa6_4_2_student3);

        StudentAnswer sa6_4_3_student3 = createStudentAnswer(student3, pa_6_4_3, "OSPF is a link-state routing protocol that uses Dijkstra's algorithm to compute the shortest path.");
        addStudentAnswerToProblemAnswer(pa_6_4_3, sa6_4_3_student3);

        StudentAnswer sa6_4_4_student3 = createStudentAnswer(student3, pa_6_4_4, "BGP is a path vector routing protocol that enables data routing between different autonomous systems on the internet.");
        addStudentAnswerToProblemAnswer(pa_6_4_4, sa6_4_4_student3);

        StudentAnswer sa6_4_5_student3 = createStudentAnswer(student3, pa_6_4_5, "Static routing uses manually configured fixed routes, while dynamic routing adjusts routes based on network conditions.");
        addStudentAnswerToProblemAnswer(pa_6_4_5, sa6_4_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa6_4_1_student4 = createStudentAnswer(student4, pa_6_4_1, "Routing is the process of selecting paths in a network to send data packets.");
        addStudentAnswerToProblemAnswer(pa_6_4_1, sa6_4_1_student4);

        StudentAnswer sa6_4_2_student4 = createStudentAnswer(student4, pa_6_4_2, "Routing algorithms determine the best path for data to travel across a network.");
        addStudentAnswerToProblemAnswer(pa_6_4_2, sa6_4_2_student4);

        StudentAnswer sa6_4_3_student4 = createStudentAnswer(student4, pa_6_4_3, "OSPF is a link-state routing protocol that uses Dijkstra's algorithm to compute the shortest path.");
        addStudentAnswerToProblemAnswer(pa_6_4_3, sa6_4_3_student4);

        StudentAnswer sa6_4_4_student4 = createStudentAnswer(student4, pa_6_4_4, "BGP is a path vector routing protocol that enables data routing between different autonomous systems on the internet.");
        addStudentAnswerToProblemAnswer(pa_6_4_4, sa6_4_4_student4);

        StudentAnswer sa6_4_5_student4 = createStudentAnswer(student4, pa_6_4_5, "Static routing uses manually configured fixed routes, while dynamic routing adjusts routes based on network conditions.");
        addStudentAnswerToProblemAnswer(pa_6_4_5, sa6_4_5_student4);

// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment6_4.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa6_5_1_student3 = createStudentAnswer(student3, pa_6_5_1, "Switching forwards data packets between devices within a network.");
        addStudentAnswerToProblemAnswer(pa_6_5_1, sa6_5_1_student3);

        StudentAnswer sa6_5_2_student3 = createStudentAnswer(student3, pa_6_5_2, "Types of switches: unmanaged, managed, and smart switches.");
        addStudentAnswerToProblemAnswer(pa_6_5_2, sa6_5_2_student3);

        StudentAnswer sa6_5_3_student3 = createStudentAnswer(student3, pa_6_5_3, "Packet switching breaks data into smaller packets transmitted independently.");
        addStudentAnswerToProblemAnswer(pa_6_5_3, sa6_5_3_student3);

        StudentAnswer sa6_5_4_student3 = createStudentAnswer(student3, pa_6_5_4, "Circuit switching establishes a dedicated communication path for data transmission.");
        addStudentAnswerToProblemAnswer(pa_6_5_4, sa6_5_4_student3);

        StudentAnswer sa6_5_5_student3 = createStudentAnswer(student3, pa_6_5_5, "A VLAN groups devices on different physical LANs for enhanced segmentation and security.");
        addStudentAnswerToProblemAnswer(pa_6_5_5, sa6_5_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa6_5_1_student4 = createStudentAnswer(student4, pa_6_5_1, "Switching forwards data packets between devices within a network.");
        addStudentAnswerToProblemAnswer(pa_6_5_1, sa6_5_1_student4);

        StudentAnswer sa6_5_2_student4 = createStudentAnswer(student4, pa_6_5_2, "Types of switches: unmanaged, managed, and smart switches.");
        addStudentAnswerToProblemAnswer(pa_6_5_2, sa6_5_2_student4);

        StudentAnswer sa6_5_3_student4 = createStudentAnswer(student4, pa_6_5_3, "Packet switching breaks data into smaller packets transmitted independently.");
        addStudentAnswerToProblemAnswer(pa_6_5_3, sa6_5_3_student4);

        StudentAnswer sa6_5_4_student4 = createStudentAnswer(student4, pa_6_5_4, "Circuit switching establishes a dedicated communication path for data transmission.");
        addStudentAnswerToProblemAnswer(pa_6_5_4, sa6_5_4_student4);

        StudentAnswer sa6_5_5_student4 = createStudentAnswer(student4, pa_6_5_5, "A VLAN groups devices on different physical LANs for enhanced segmentation and security.");
        addStudentAnswerToProblemAnswer(pa_6_5_5, sa6_5_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment6_5.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa7_1_1_student3 = createStudentAnswer(student3, pa_7_1_1, "The SDLC is a process for planning, creating, testing, and deploying an information system.");
        addStudentAnswerToProblemAnswer(pa_7_1_1, sa7_1_1_student3);

        StudentAnswer sa7_1_2_student3 = createStudentAnswer(student3, pa_7_1_2, "The common phases of the SDLC include: requirements analysis, system design, implementation, testing, deployment, and maintenance.");
        addStudentAnswerToProblemAnswer(pa_7_1_2, sa7_1_2_student3);

        StudentAnswer sa7_1_3_student3 = createStudentAnswer(student3, pa_7_1_3, "The iterative model divides the development process into small, repeating cycles, producing a working version in each iteration.");
        addStudentAnswerToProblemAnswer(pa_7_1_3, sa7_1_3_student3);

        StudentAnswer sa7_1_4_student3 = createStudentAnswer(student3, pa_7_1_4, "The incremental model develops and delivers software in small increments, adding new functionality with each increment.");
        addStudentAnswerToProblemAnswer(pa_7_1_4, sa7_1_4_student3);

        StudentAnswer sa7_1_5_student3 = createStudentAnswer(student3, pa_7_1_5, "The spiral model combines iterative development with risk assessment, allowing for continuous refinement and risk mitigation.");
        addStudentAnswerToProblemAnswer(pa_7_1_5, sa7_1_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa7_1_1_student4 = createStudentAnswer(student4, pa_7_1_1, "The SDLC is a process for planning, creating, testing, and deploying an information system.");
        addStudentAnswerToProblemAnswer(pa_7_1_1, sa7_1_1_student4);

        StudentAnswer sa7_1_2_student4 = createStudentAnswer(student4, pa_7_1_2, "The common phases of the SDLC include: requirements analysis, system design, implementation, testing, deployment, and maintenance.");
        addStudentAnswerToProblemAnswer(pa_7_1_2, sa7_1_2_student4);

        StudentAnswer sa7_1_3_student4 = createStudentAnswer(student4, pa_7_1_3, "The iterative model divides the development process into small, repeating cycles, producing a working version in each iteration.");
        addStudentAnswerToProblemAnswer(pa_7_1_3, sa7_1_3_student4);

        StudentAnswer sa7_1_4_student4 = createStudentAnswer(student4, pa_7_1_4, "The incremental model develops and delivers software in small increments, adding new functionality with each increment.");
        addStudentAnswerToProblemAnswer(pa_7_1_4, sa7_1_4_student4);

        StudentAnswer sa7_1_5_student4 = createStudentAnswer(student4, pa_7_1_5, "The spiral model combines iterative development with risk assessment, allowing for continuous refinement and risk mitigation.");
        addStudentAnswerToProblemAnswer(pa_7_1_5, sa7_1_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment7_1.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa7_2_1_student3 = createStudentAnswer(student3, pa_7_2_1, "Agile is an iterative approach that emphasizes flexibility, collaboration, and customer feedback.");
        addStudentAnswerToProblemAnswer(pa_7_2_1, sa7_2_1_student3);

        StudentAnswer sa7_2_2_student3 = createStudentAnswer(student3, pa_7_2_2, "Core principles of Agile: (1) Customer satisfaction, (2) Welcoming changes, (3) Frequent delivery, (4) Collaboration, (5) Motivated individuals, (6) Face-to-face communication, (7) Working software, (8) Sustainable development, (9) Technical excellence, (10) Simplicity, (11) Self-organizing teams, (12) Regular reflection.");
        addStudentAnswerToProblemAnswer(pa_7_2_2, sa7_2_2_student3);

        StudentAnswer sa7_2_3_student3 = createStudentAnswer(student3, pa_7_2_3, "Scrum is an Agile framework with roles like Scrum Master and Product Owner, and ceremonies like Sprint Planning and Daily Stand-ups.");
        addStudentAnswerToProblemAnswer(pa_7_2_3, sa7_2_3_student3);

        StudentAnswer sa7_2_4_student3 = createStudentAnswer(student3, pa_7_2_4, "Kanban focuses on visualizing work, limiting work in progress, and improving flow using a Kanban board.");
        addStudentAnswerToProblemAnswer(pa_7_2_4, sa7_2_4_student3);

        StudentAnswer sa7_2_5_student3 = createStudentAnswer(student3, pa_7_2_5, "Agile handles changing requirements by embracing change and enabling teams to respond to new information and customer feedback.");
        addStudentAnswerToProblemAnswer(pa_7_2_5, sa7_2_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa7_2_1_student4 = createStudentAnswer(student4, pa_7_2_1, "Agile is an iterative approach that emphasizes flexibility, collaboration, and customer feedback.");
        addStudentAnswerToProblemAnswer(pa_7_2_1, sa7_2_1_student4);

        StudentAnswer sa7_2_2_student4 = createStudentAnswer(student4, pa_7_2_2, "Core principles of Agile: (1) Customer satisfaction, (2) Welcoming changes, (3) Frequent delivery, (4) Collaboration, (5) Motivated individuals, (6) Face-to-face communication, (7) Working software, (8) Sustainable development, (9) Technical excellence, (10) Simplicity, (11) Self-organizing teams, (12) Regular reflection.");
        addStudentAnswerToProblemAnswer(pa_7_2_2, sa7_2_2_student4);

        StudentAnswer sa7_2_3_student4 = createStudentAnswer(student4, pa_7_2_3, "Scrum is an Agile framework with roles like Scrum Master and Product Owner, and ceremonies like Sprint Planning and Daily Stand-ups.");
        addStudentAnswerToProblemAnswer(pa_7_2_3, sa7_2_3_student4);

        StudentAnswer sa7_2_4_student4 = createStudentAnswer(student4, pa_7_2_4, "Kanban focuses on visualizing work, limiting work in progress, and improving flow using a Kanban board.");
        addStudentAnswerToProblemAnswer(pa_7_2_4, sa7_2_4_student4);

        StudentAnswer sa7_2_5_student4 = createStudentAnswer(student4, pa_7_2_5, "Agile handles changing requirements by embracing change and enabling teams to respond to new information and customer feedback.");
        addStudentAnswerToProblemAnswer(pa_7_2_5, sa7_2_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment7_2.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa7_3_1_student3 = createStudentAnswer(student3, pa_7_3_1, "The Waterfall model is a linear and sequential approach to software development.");
        addStudentAnswerToProblemAnswer(pa_7_3_1, sa7_3_1_student3);

        StudentAnswer sa7_3_2_student3 = createStudentAnswer(student3, pa_7_3_2, "The phases of the Waterfall model include: requirements analysis, system design, implementation, testing, deployment, and maintenance.");
        addStudentAnswerToProblemAnswer(pa_7_3_2, sa7_3_2_student3);

        StudentAnswer sa7_3_3_student3 = createStudentAnswer(student3, pa_7_3_3, "The purpose of the requirements analysis phase is to gather and define the functional and non-functional requirements.");
        addStudentAnswerToProblemAnswer(pa_7_3_3, sa7_3_3_student3);

        StudentAnswer sa7_3_4_student3 = createStudentAnswer(student3, pa_7_3_4, "The purpose of the system design phase is to create a detailed design of the software based on the requirements specification.");
        addStudentAnswerToProblemAnswer(pa_7_3_4, sa7_3_4_student3);

        StudentAnswer sa7_3_5_student3 = createStudentAnswer(student3, pa_7_3_5, "The purpose of the implementation phase is to develop the actual code for the software based on the design specifications.");
        addStudentAnswerToProblemAnswer(pa_7_3_5, sa7_3_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa7_3_1_student4 = createStudentAnswer(student4, pa_7_3_1, "The Waterfall model is a linear and sequential approach to software development.");
        addStudentAnswerToProblemAnswer(pa_7_3_1, sa7_3_1_student4);

        StudentAnswer sa7_3_2_student4 = createStudentAnswer(student4, pa_7_3_2, "The phases of the Waterfall model include: requirements analysis, system design, implementation, testing, deployment, and maintenance.");
        addStudentAnswerToProblemAnswer(pa_7_3_2, sa7_3_2_student4);

        StudentAnswer sa7_3_3_student4 = createStudentAnswer(student4, pa_7_3_3, "The purpose of the requirements analysis phase is to gather and define the functional and non-functional requirements.");
        addStudentAnswerToProblemAnswer(pa_7_3_3, sa7_3_3_student4);

        StudentAnswer sa7_3_4_student4 = createStudentAnswer(student4, pa_7_3_4, "The purpose of the system design phase is to create a detailed design of the software based on the requirements specification.");
        addStudentAnswerToProblemAnswer(pa_7_3_4, sa7_3_4_student4);

        StudentAnswer sa7_3_5_student4 = createStudentAnswer(student4, pa_7_3_5, "The purpose of the implementation phase is to develop the actual code for the software based on the design specifications.");
        addStudentAnswerToProblemAnswer(pa_7_3_5, sa7_3_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment7_3.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa7_4_1_student3 = createStudentAnswer(student3, pa_7_4_1, "Project management involves planning, organizing, and managing resources to achieve specific goals and complete projects efficiently.");
        addStudentAnswerToProblemAnswer(pa_7_4_1, sa7_4_1_student3);

        StudentAnswer sa7_4_2_student3 = createStudentAnswer(student3, pa_7_4_2, "Key phases: (1) Initiation, (2) Planning, (3) Execution, (4) Monitoring and Controlling, and (5) Closure.");
        addStudentAnswerToProblemAnswer(pa_7_4_2, sa7_4_2_student3);

        StudentAnswer sa7_4_3_student3 = createStudentAnswer(student3, pa_7_4_3, "Project planning defines scope, objectives, deliverables, timelines, and resource requirements.");
        addStudentAnswerToProblemAnswer(pa_7_4_3, sa7_4_3_student3);

        StudentAnswer sa7_4_4_student3 = createStudentAnswer(student3, pa_7_4_4, "Project scheduling creates a timeline for tasks and activities, determining dates, dependencies, milestones, and resource allocation.");
        addStudentAnswerToProblemAnswer(pa_7_4_4, sa7_4_4_student3);

        StudentAnswer sa7_4_5_student3 = createStudentAnswer(student3, pa_7_4_5, "Resource management identifies, allocates, and manages resources needed for a project.");
        addStudentAnswerToProblemAnswer(pa_7_4_5, sa7_4_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa7_4_1_student4 = createStudentAnswer(student4, pa_7_4_1, "Project management involves planning, organizing, and managing resources to achieve specific goals and complete projects efficiently.");
        addStudentAnswerToProblemAnswer(pa_7_4_1, sa7_4_1_student4);

        StudentAnswer sa7_4_2_student4 = createStudentAnswer(student4, pa_7_4_2, "Key phases: (1) Initiation, (2) Planning, (3) Execution, (4) Monitoring and Controlling, and (5) Closure.");
        addStudentAnswerToProblemAnswer(pa_7_4_2, sa7_4_2_student4);

        StudentAnswer sa7_4_3_student4 = createStudentAnswer(student4, pa_7_4_3, "Project planning defines scope, objectives, deliverables, timelines, and resource requirements.");
        addStudentAnswerToProblemAnswer(pa_7_4_3, sa7_4_3_student4);

        StudentAnswer sa7_4_4_student4 = createStudentAnswer(student4, pa_7_4_4, "Project scheduling creates a timeline for tasks and activities, determining dates, dependencies, milestones, and resource allocation.");
        addStudentAnswerToProblemAnswer(pa_7_4_4, sa7_4_4_student4);

        StudentAnswer sa7_4_5_student4 = createStudentAnswer(student4, pa_7_4_5, "Resource management identifies, allocates, and manages resources needed for a project.");
        addStudentAnswerToProblemAnswer(pa_7_4_5, sa7_4_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment7_4.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa8_1_1_student3 = createStudentAnswer(student3, pa_8_1_1, "HTML is the standard language for creating web pages, defining structure and content using tags and attributes.");
        addStudentAnswerToProblemAnswer(pa_8_1_1, sa8_1_1_student3);

        StudentAnswer sa8_1_2_student3 = createStudentAnswer(student3, pa_8_1_2, "HTML tags are the building blocks of HTML, defining and structuring content within angle brackets.");
        addStudentAnswerToProblemAnswer(pa_8_1_2, sa8_1_2_student3);

        StudentAnswer sa8_1_3_student3 = createStudentAnswer(student3, pa_8_1_3, "An HTML attribute provides additional information about an element, specified within the opening tag as name/value pairs.");
        addStudentAnswerToProblemAnswer(pa_8_1_3, sa8_1_3_student3);

        StudentAnswer sa8_1_4_student3 = createStudentAnswer(student3, pa_8_1_4, "The <head> tag contains meta-information about the document, such as title, character set, and links to stylesheets or scripts.");
        addStudentAnswerToProblemAnswer(pa_8_1_4, sa8_1_4_student3);

        StudentAnswer sa8_1_5_student3 = createStudentAnswer(student3, pa_8_1_5, "The <body> tag contains the content of the web page, such as text, images, links, and other elements.");
        addStudentAnswerToProblemAnswer(pa_8_1_5, sa8_1_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa8_1_1_student4 = createStudentAnswer(student4, pa_8_1_1, "HTML is the standard language for creating web pages, defining structure and content using tags and attributes.");
        addStudentAnswerToProblemAnswer(pa_8_1_1, sa8_1_1_student4);

        StudentAnswer sa8_1_2_student4 = createStudentAnswer(student4, pa_8_1_2, "HTML tags are the building blocks of HTML, defining and structuring content within angle brackets.");
        addStudentAnswerToProblemAnswer(pa_8_1_2, sa8_1_2_student4);

        StudentAnswer sa8_1_3_student4 = createStudentAnswer(student4, pa_8_1_3, "An HTML attribute provides additional information about an element, specified within the opening tag as name/value pairs.");
        addStudentAnswerToProblemAnswer(pa_8_1_3, sa8_1_3_student4);

        StudentAnswer sa8_1_4_student4 = createStudentAnswer(student4, pa_8_1_4, "The <head> tag contains meta-information about the document, such as title, character set, and links to stylesheets or scripts.");
        addStudentAnswerToProblemAnswer(pa_8_1_4, sa8_1_4_student4);

        StudentAnswer sa8_1_5_student4 = createStudentAnswer(student4, pa_8_1_5, "The <body> tag contains the content of the web page, such as text, images, links, and other elements.");
        addStudentAnswerToProblemAnswer(pa_8_1_5, sa8_1_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment8_1.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa8_2_1_student3 = createStudentAnswer(student3, pa_8_2_1, "CSS is a language used to style HTML documents, controlling layout, colors, fonts, and visual presentation.");
        addStudentAnswerToProblemAnswer(pa_8_2_1, sa8_2_1_student3);

        StudentAnswer sa8_2_2_student3 = createStudentAnswer(student3, pa_8_2_2, "To link a CSS file to an HTML document, use the <link> tag within the <head> section, e.g., <link rel=\"stylesheet\" href=\"styles.css\">.");
        addStudentAnswerToProblemAnswer(pa_8_2_2, sa8_2_2_student3);

        StudentAnswer sa8_2_3_student3 = createStudentAnswer(student3, pa_8_2_3, "The CSS box model describes the rectangular boxes generated for elements, including the content, padding, border, and margin areas.");
        addStudentAnswerToProblemAnswer(pa_8_2_3, sa8_2_3_student3);

        StudentAnswer sa8_2_4_student3 = createStudentAnswer(student3, pa_8_2_4, "Styles can be applied to HTML elements using selectors in a CSS file, e.g., p { color: blue; font-size: 16px; }.");
        addStudentAnswerToProblemAnswer(pa_8_2_4, sa8_2_4_student3);

        StudentAnswer sa8_2_5_student3 = createStudentAnswer(student3, pa_8_2_5, "CSS selectors are patterns used to select and style specific elements on a web page, such as element, class, ID, and attribute selectors.");
        addStudentAnswerToProblemAnswer(pa_8_2_5, sa8_2_5_student3);

// Creating StudentAnswer instances for student4
        StudentAnswer sa8_2_1_student4 = createStudentAnswer(student4, pa_8_2_1, "CSS is a language used to style HTML documents, controlling layout, colors, fonts, and visual presentation.");
        addStudentAnswerToProblemAnswer(pa_8_2_1, sa8_2_1_student4);

        StudentAnswer sa8_2_2_student4 = createStudentAnswer(student4, pa_8_2_2, "To link a CSS file to an HTML document, use the <link> tag within the <head> section, e.g., <link rel=\"stylesheet\" href=\"styles.css\">.");
        addStudentAnswerToProblemAnswer(pa_8_2_2, sa8_2_2_student4);

        StudentAnswer sa8_2_3_student4 = createStudentAnswer(student4, pa_8_2_3, "The CSS box model describes the rectangular boxes generated for elements, including the content, padding, border, and margin areas.");
        addStudentAnswerToProblemAnswer(pa_8_2_3, sa8_2_3_student4);

        StudentAnswer sa8_2_4_student4 = createStudentAnswer(student4, pa_8_2_4, "Styles can be applied to HTML elements using selectors in a CSS file, e.g., p { color: blue; font-size: 16px; }.");
        addStudentAnswerToProblemAnswer(pa_8_2_4, sa8_2_4_student4);

        StudentAnswer sa8_2_5_student4 = createStudentAnswer(student4, pa_8_2_5, "CSS selectors are patterns used to select and style specific elements on a web page, such as element, class, ID, and attribute selectors.");
        addStudentAnswerToProblemAnswer(pa_8_2_5, sa8_2_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment8_2.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa8_3_1_student3 = createStudentAnswer(student3, pa_8_3_1, "JavaScript is a programming language for creating interactive and dynamic web content.");
        addStudentAnswerToProblemAnswer(pa_8_3_1, sa8_3_1_student3);

        StudentAnswer sa8_3_2_student3 = createStudentAnswer(student3, pa_8_3_2, "To include JavaScript in an HTML document, use the <script> tag, e.g., <script src=\"script.js\"></script> for an external script.");
        addStudentAnswerToProblemAnswer(pa_8_3_2, sa8_3_2_student3);

        StudentAnswer sa8_3_3_student3 = createStudentAnswer(student3, pa_8_3_3, "The DOM is a programming interface for HTML and XML documents, representing the structure as a tree of objects.");
        addStudentAnswerToProblemAnswer(pa_8_3_3, sa8_3_3_student3);

        StudentAnswer sa8_3_4_student3 = createStudentAnswer(student3, pa_8_3_4, "Select an HTML element using methods like getElementById, getElementsByClassName, querySelector, e.g., document.getElementById('elementID');");
        addStudentAnswerToProblemAnswer(pa_8_3_4, sa8_3_4_student3);

        StudentAnswer sa8_3_5_student3 = createStudentAnswer(student3, pa_8_3_5, "Handle events by adding event listeners to elements, e.g., document.getElementById('button').addEventListener('click', function() { alert('Button clicked!'); });");
        addStudentAnswerToProblemAnswer(pa_8_3_5, sa8_3_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa8_3_1_student4 = createStudentAnswer(student4, pa_8_3_1, "JavaScript is a programming language for creating interactive and dynamic web content.");
        addStudentAnswerToProblemAnswer(pa_8_3_1, sa8_3_1_student4);

        StudentAnswer sa8_3_2_student4 = createStudentAnswer(student4, pa_8_3_2, "To include JavaScript in an HTML document, use the <script> tag, e.g., <script src=\"script.js\"></script> for an external script.");
        addStudentAnswerToProblemAnswer(pa_8_3_2, sa8_3_2_student4);

        StudentAnswer sa8_3_3_student4 = createStudentAnswer(student4, pa_8_3_3, "The DOM is a programming interface for HTML and XML documents, representing the structure as a tree of objects.");
        addStudentAnswerToProblemAnswer(pa_8_3_3, sa8_3_3_student4);

        StudentAnswer sa8_3_4_student4 = createStudentAnswer(student4, pa_8_3_4, "Select an HTML element using methods like getElementById, getElementsByClassName, querySelector, e.g., document.getElementById('elementID');");
        addStudentAnswerToProblemAnswer(pa_8_3_4, sa8_3_4_student4);

        StudentAnswer sa8_3_5_student4 = createStudentAnswer(student4, pa_8_3_5, "Handle events by adding event listeners to elements, e.g., document.getElementById('button').addEventListener('click', function() { alert('Button clicked!'); });");
        addStudentAnswerToProblemAnswer(pa_8_3_5, sa8_3_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment8_3.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa8_4_1_student3 = createStudentAnswer(student3, pa_8_4_1, "React is a popular JavaScript library for building user interfaces, allowing the creation of reusable UI components.");
        addStudentAnswerToProblemAnswer(pa_8_4_1, sa8_4_1_student3);

        StudentAnswer sa8_4_2_student3 = createStudentAnswer(student3, pa_8_4_2, "React components are reusable pieces of UI in a React application, which can be functional or class-based.");
        addStudentAnswerToProblemAnswer(pa_8_4_2, sa8_4_2_student3);

        StudentAnswer sa8_4_3_student3 = createStudentAnswer(student3, pa_8_4_3, "JSX is a syntax extension for JavaScript that allows developers to write HTML-like code within their JavaScript.");
        addStudentAnswerToProblemAnswer(pa_8_4_3, sa8_4_3_student3);

        StudentAnswer sa8_4_4_student3 = createStudentAnswer(student3, pa_8_4_4, "State is an object that holds data that can change over time and affect the rendering of a component.");
        addStudentAnswerToProblemAnswer(pa_8_4_4, sa8_4_4_student3);

        StudentAnswer sa8_4_5_student3 = createStudentAnswer(student3, pa_8_4_5, "Props are read-only properties that allow data to be passed from parent components to child components.");
        addStudentAnswerToProblemAnswer(pa_8_4_5, sa8_4_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa8_4_1_student4 = createStudentAnswer(student4, pa_8_4_1, "React is a popular JavaScript library for building user interfaces, allowing the creation of reusable UI components.");
        addStudentAnswerToProblemAnswer(pa_8_4_1, sa8_4_1_student4);

        StudentAnswer sa8_4_2_student4 = createStudentAnswer(student4, pa_8_4_2, "React components are reusable pieces of UI in a React application, which can be functional or class-based.");
        addStudentAnswerToProblemAnswer(pa_8_4_2, sa8_4_2_student4);

        StudentAnswer sa8_4_3_student4 = createStudentAnswer(student4, pa_8_4_3, "JSX is a syntax extension for JavaScript that allows developers to write HTML-like code within their JavaScript.");
        addStudentAnswerToProblemAnswer(pa_8_4_3, sa8_4_3_student4);

        StudentAnswer sa8_4_4_student4 = createStudentAnswer(student4, pa_8_4_4, "State is an object that holds data that can change over time and affect the rendering of a component.");
        addStudentAnswerToProblemAnswer(pa_8_4_4, sa8_4_4_student4);

        StudentAnswer sa8_4_5_student4 = createStudentAnswer(student4, pa_8_4_5, "Props are read-only properties that allow data to be passed from parent components to child components.");
        addStudentAnswerToProblemAnswer(pa_8_4_5, sa8_4_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment8_4.");
// Creating StudentAnswer instances for student3
        StudentAnswer sa8_5_1_student3 = createStudentAnswer(student3, pa_8_5_1, "Backend integration connects front-end web applications with backend services for communication, data fetching, and server-side operations.");
        addStudentAnswerToProblemAnswer(pa_8_5_1, sa8_5_1_student3);

        StudentAnswer sa8_5_2_student3 = createStudentAnswer(student3, pa_8_5_2, "A RESTful API uses standard HTTP methods to interact with resources and perform CRUD operations.");
        addStudentAnswerToProblemAnswer(pa_8_5_2, sa8_5_2_student3);

        StudentAnswer sa8_5_3_student3 = createStudentAnswer(student3, pa_8_5_3, "Use JavaScript's Fetch API to fetch data from a RESTful API, e.g., fetch('https://api.example.com/data').then(response => response.json()).then(data => console.log(data));");
        addStudentAnswerToProblemAnswer(pa_8_5_3, sa8_5_3_student3);

        StudentAnswer sa8_5_4_student3 = createStudentAnswer(student3, pa_8_5_4, "Server-side rendering (SSR) renders web pages on the server to improve initial load time and SEO.");
        addStudentAnswerToProblemAnswer(pa_8_5_4, sa8_5_4_student3);

        StudentAnswer sa8_5_5_student3 = createStudentAnswer(student3, pa_8_5_5, "Client-side rendering (CSR) renders web pages in the browser; server-side rendering (SSR) renders web pages on the server for faster initial load times.");
        addStudentAnswerToProblemAnswer(pa_8_5_5, sa8_5_5_student3);


// Creating StudentAnswer instances for student4
        StudentAnswer sa8_5_1_student4 = createStudentAnswer(student4, pa_8_5_1, "Backend integration connects front-end web applications with backend services for communication, data fetching, and server-side operations.");
        addStudentAnswerToProblemAnswer(pa_8_5_1, sa8_5_1_student4);

        StudentAnswer sa8_5_2_student4 = createStudentAnswer(student4, pa_8_5_2, "A RESTful API uses standard HTTP methods to interact with resources and perform CRUD operations.");
        addStudentAnswerToProblemAnswer(pa_8_5_2, sa8_5_2_student4);

        StudentAnswer sa8_5_3_student4 = createStudentAnswer(student4, pa_8_5_3, "Use JavaScript's Fetch API to fetch data from a RESTful API, e.g., fetch('https://api.example.com/data').then(response => response.json()).then(data => console.log(data));");
        addStudentAnswerToProblemAnswer(pa_8_5_3, sa8_5_3_student4);

        StudentAnswer sa8_5_4_student4 = createStudentAnswer(student4, pa_8_5_4, "Server-side rendering (SSR) renders web pages on the server to improve initial load time and SEO.");
        addStudentAnswerToProblemAnswer(pa_8_5_4, sa8_5_4_student4);

        StudentAnswer sa8_5_5_student4 = createStudentAnswer(student4, pa_8_5_5, "Client-side rendering (CSR) renders web pages in the browser; server-side rendering (SSR) renders web pages on the server for faster initial load times.");
        addStudentAnswerToProblemAnswer(pa_8_5_5, sa8_5_5_student4);


// Output for confirmation
        System.out.println("Student answers created and added for both student3 and student4 for all 10 problem answers in assignment8_5.");


        // Creating submission for student3 with student answers for 5_1
        Submission submission5_1_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5_1_1_student3, sa5_1_2_student3, sa5_1_3_student3, sa5_1_4_student3, sa5_1_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission5_1_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5_1_3);
        }

// Creating submission for student4 with student answers for 5_1
        Submission submission5_1_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5_1_1_student4, sa5_1_2_student4, sa5_1_3_student4, sa5_1_4_student4, sa5_1_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission5_1_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5_1_4);
        }
// Creating submission for student3 with student answers for 5_2
        Submission submission5_2_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5_2_1_student3, sa5_2_2_student3, sa5_2_3_student3, sa5_2_4_student3, sa5_2_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission5_2_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5_2_3);
        }

// Creating submission for student4 with student answers for 5_2
        Submission submission5_2_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5_2_1_student4, sa5_2_2_student4, sa5_2_3_student4, sa5_2_4_student4, sa5_2_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission5_2_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5_2_4);
        }
// Creating submission for student3 with student answers for 5_3
        Submission submission5_3_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5_3_1_student3, sa5_3_2_student3, sa5_3_3_student3, sa5_3_4_student3, sa5_3_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission5_3_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5_3_3);
        }

// Creating submission for student4 with student answers for 5_3
        Submission submission5_3_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5_3_1_student4, sa5_3_2_student4, sa5_3_3_student4, sa5_3_4_student4, sa5_3_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission5_3_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5_3_4);
        }
// Creating submission for student3 with student answers for 5_4
        Submission submission5_4_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa5_4_1_student3, sa5_4_2_student3, sa5_4_3_student3, sa5_4_4_student3, sa5_4_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission5_4_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5_4_3);
        }

// Creating submission for student4 with student answers for 5_4
        Submission submission5_4_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa5_4_1_student4, sa5_4_2_student4, sa5_4_3_student4, sa5_4_4_student4, sa5_4_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission5_4_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission5_4_4);
        }
// Creating submission for student3 with student answers for 6_1
        Submission submission6_1_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6_1_1_student3, sa6_1_2_student3, sa6_1_3_student3, sa6_1_4_student3, sa6_1_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission6_1_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6_1_3);
        }

// Creating submission for student4 with student answers for 6_1
        Submission submission6_1_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6_1_1_student4, sa6_1_2_student4, sa6_1_3_student4, sa6_1_4_student4, sa6_1_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission6_1_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6_1_4);
        }
// Creating submission for student3 with student answers for 6_2
        Submission submission6_2_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6_2_1_student3, sa6_2_2_student3, sa6_2_3_student3, sa6_2_4_student3, sa6_2_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission6_2_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6_2_3);
        }

// Creating submission for student4 with student answers for 6_2
        Submission submission6_2_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6_2_1_student4, sa6_2_2_student4, sa6_2_3_student4, sa6_2_4_student4, sa6_2_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission6_2_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6_2_4);
        }
// Creating submission for student3 with student answers for 6_3
        Submission submission6_3_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6_3_1_student3, sa6_3_2_student3, sa6_3_3_student3, sa6_3_4_student3, sa6_3_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission6_3_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6_3_3);
        }

// Creating submission for student4 with student answers for 6_3
        Submission submission6_3_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6_3_1_student4, sa6_3_2_student4, sa6_3_3_student4, sa6_3_4_student4, sa6_3_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission6_3_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6_3_4);
        }
// Creating submission for student3 with student answers for 6_4
        Submission submission6_4_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6_4_1_student3, sa6_4_2_student3, sa6_4_3_student3, sa6_4_4_student3, sa6_4_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission6_4_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6_4_3);
        }

// Creating submission for student4 with student answers for 6_4
        Submission submission6_4_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6_4_1_student4, sa6_4_2_student4, sa6_4_3_student4, sa6_4_4_student4, sa6_4_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission6_4_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6_4_4);
        }
// Creating submission for student3 with student answers for 6_5
        Submission submission6_5_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa6_5_1_student3, sa6_5_2_student3, sa6_5_3_student3, sa6_5_4_student3, sa6_5_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission6_5_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6_5_3);
        }

// Creating submission for student4 with student answers for 6_5
        Submission submission6_5_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa6_5_1_student4, sa6_5_2_student4, sa6_5_3_student4, sa6_5_4_student4, sa6_5_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission6_5_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission6_5_4);
        }
// Creating submission for student3 with student answers for 7_1
        Submission submission7_1_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7_1_1_student3, sa7_1_2_student3, sa7_1_3_student3, sa7_1_4_student3, sa7_1_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission7_1_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7_1_3);
        }

// Creating submission for student4 with student answers for 7_1
        Submission submission7_1_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7_1_1_student4, sa7_1_2_student4, sa7_1_3_student4, sa7_1_4_student4, sa7_1_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission7_1_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7_1_4);
        }
// Creating submission for student3 with student answers for 7_2
        Submission submission7_2_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7_2_1_student3, sa7_2_2_student3, sa7_2_3_student3, sa7_2_4_student3, sa7_2_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission7_2_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7_2_3);
        }

// Creating submission for student4 with student answers for 7_2
        Submission submission7_2_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7_2_1_student4, sa7_2_2_student4, sa7_2_3_student4, sa7_2_4_student4, sa7_2_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission7_2_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7_2_4);
        }
// Creating submission for student3 with student answers for 7_3
        Submission submission7_3_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7_3_1_student3, sa7_3_2_student3, sa7_3_3_student3, sa7_3_4_student3, sa7_3_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission7_3_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7_3_3);
        }

// Creating submission for student4 with student answers for 7_3
        Submission submission7_3_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7_3_1_student4, sa7_3_2_student4, sa7_3_3_student4, sa7_3_4_student4, sa7_3_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission7_3_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7_3_4);
        }
// Creating submission for student3 with student answers for 7_4
        Submission submission7_4_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa7_4_1_student3, sa7_4_2_student3, sa7_4_3_student3, sa7_4_4_student3, sa7_4_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission7_4_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7_4_3);
        }

// Creating submission for student4 with student answers for 7_4
        Submission submission7_4_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa7_4_1_student4, sa7_4_2_student4, sa7_4_3_student4, sa7_4_4_student4, sa7_4_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission7_4_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission7_4_4);
        }
// Creating submission for student3 with student answers for 8_1
        Submission submission8_1_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8_1_1_student3, sa8_1_2_student3, sa8_1_3_student3, sa8_1_4_student3, sa8_1_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission8_1_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8_1_3);
        }

// Creating submission for student4 with student answers for 8_1
        Submission submission8_1_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8_1_1_student4, sa8_1_2_student4, sa8_1_3_student4, sa8_1_4_student4, sa8_1_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission8_1_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8_1_4);
        }
// Creating submission for student3 with student answers for 8_2
        Submission submission8_2_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8_2_1_student3, sa8_2_2_student3, sa8_2_3_student3, sa8_2_4_student3, sa8_2_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission8_2_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8_2_3);
        }

// Creating submission for student4 with student answers for 8_2
        Submission submission8_2_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8_2_1_student4, sa8_2_2_student4, sa8_2_3_student4, sa8_2_4_student4, sa8_2_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission8_2_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8_2_4);
        }
// Creating submission for student3 with student answers for 8_3
        Submission submission8_3_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8_3_1_student3, sa8_3_2_student3, sa8_3_3_student3, sa8_3_4_student3, sa8_3_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission8_3_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8_3_3);
        }
// Creating submission for student3 with student answers for 8_4
        Submission submission8_4_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8_4_1_student3, sa8_4_2_student3, sa8_4_3_student3, sa8_4_4_student3, sa8_4_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission8_4_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8_4_3);
        }

// Creating submission for student4 with student answers for 8_4
        Submission submission8_4_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8_4_1_student4, sa8_4_2_student4, sa8_4_3_student4, sa8_4_4_student4, sa8_4_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission8_4_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8_4_4);
        }

// Creating submission for student4 with student answers for 8_3
        Submission submission8_3_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8_3_1_student4, sa8_3_2_student4, sa8_3_3_student4, sa8_3_4_student4, sa8_3_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission8_3_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8_3_4);
        }
// Creating submission for student3 with student answers for 8_5
        Submission submission8_5_3 = createSubmission("Submission from student3", student3, Arrays.asList(
                sa8_5_1_student3, sa8_5_2_student3, sa8_5_3_student3, sa8_5_4_student3, sa8_5_5_student3
        ));

// Adding the submission to each student answer for student3
        for (StudentAnswer studentAnswer : submission8_5_3.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8_5_3);
        }

// Creating submission for student4 with student answers for 8_5
        Submission submission8_5_4 = createSubmission("Submission from student4", student4, Arrays.asList(
                sa8_5_1_student4, sa8_5_2_student4, sa8_5_3_student4, sa8_5_4_student4, sa8_5_5_student4
        ));

// Adding the submission to each student answer for student4
        for (StudentAnswer studentAnswer : submission8_5_4.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission8_5_4);
        }

        Grade grade5_1_3 = createGrade(83.4, student3, faculty5, course5, submission5_1_3);
        Grade grade5_1_4 = createGrade(88.1, student4, faculty5, course5, submission5_1_4);
        Grade grade5_2_3 = createGrade(85.7, student3, faculty5, course5, submission5_2_3);
        Grade grade5_2_4 = createGrade(89.5, student4, faculty5, course5, submission5_2_4);
        Grade grade5_3_3 = createGrade(86.8, student3, faculty5, course5, submission5_3_3);
        Grade grade5_3_4 = createGrade(84.9, student4, faculty5, course5, submission5_3_4);
        Grade grade5_4_3 = createGrade(87.6, student3, faculty5, course5, submission5_4_3);
        Grade grade5_4_4 = createGrade(90.2, student4, faculty5, course5, submission5_4_4);

        Grade grade6_1_3 = createGrade(84.3, student3, faculty1, course6, submission6_1_3);
        Grade grade6_1_4 = createGrade(87.9, student4, faculty1, course6, submission6_1_4);
        Grade grade6_2_3 = createGrade(88.7, student3, faculty1, course6, submission6_2_3);
        Grade grade6_2_4 = createGrade(85.1, student4, faculty1, course6, submission6_2_4);
        Grade grade6_3_3 = createGrade(83.2, student3, faculty1, course6, submission6_3_3);
        Grade grade6_3_4 = createGrade(89.4, student4, faculty1, course6, submission6_3_4);
        Grade grade6_4_3 = createGrade(87.5, student3, faculty1, course6, submission6_4_3);
        Grade grade6_4_4 = createGrade(84.6, student4, faculty1, course6, submission6_4_4);
        Grade grade6_5_3 = createGrade(90.8, student3, faculty1, course6, submission6_5_3);
        Grade grade6_5_4 = createGrade(82.7, student4, faculty1, course6, submission6_5_4);

        Grade grade7_1_3 = createGrade(85.7, student3, faculty2, course7, submission7_1_3);
        Grade grade7_1_4 = createGrade(88.4, student4, faculty2, course7, submission7_1_4);
        Grade grade7_2_3 = createGrade(89.1, student3, faculty2, course7, submission7_2_3);
        Grade grade7_2_4 = createGrade(86.5, student4, faculty2, course7, submission7_2_4);
        Grade grade7_3_3 = createGrade(83.2, student3, faculty2, course7, submission7_3_3);
        Grade grade7_3_4 = createGrade(87.8, student4, faculty2, course7, submission7_3_4);
        Grade grade7_4_3 = createGrade(90.6, student3, faculty2, course7, submission7_4_3);
        Grade grade7_4_4 = createGrade(82.9, student4, faculty2, course7, submission7_4_4);

        Grade grade8_1_3 = createGrade(87.4, student3, faculty3, course8, submission8_1_3);
        Grade grade8_1_4 = createGrade(85.9, student4, faculty3, course8, submission8_1_4);
        Grade grade8_2_3 = createGrade(89.2, student3, faculty3, course8, submission8_2_3);
        Grade grade8_2_4 = createGrade(83.6, student4, faculty3, course8, submission8_2_4);
        Grade grade8_3_3 = createGrade(88.8, student3, faculty3, course8, submission8_3_3);
        Grade grade8_3_4 = createGrade(86.1, student4, faculty3, course8, submission8_3_4);
        Grade grade8_4_3 = createGrade(84.5, student3, faculty3, course8, submission8_4_3);
        Grade grade8_4_4 = createGrade(87.7, student4, faculty3, course8, submission8_4_4);
        Grade grade8_5_3 = createGrade(83.8, student3, faculty3, course8, submission8_5_3);
        Grade grade8_5_4 = createGrade(88.3, student4, faculty3, course8, submission8_5_4);

        CourseGrade courseGrade5_1_3 = createCourseGrade(student3, course5, 85.875, List.of(grade5_1_3, grade5_2_3, grade5_3_3, grade5_4_3));
        CourseGrade courseGrade5_1_4 = createCourseGrade(student4, course5, 88.175, List.of(grade5_1_4, grade5_2_4, grade5_3_4, grade5_4_4));

        CourseGrade courseGrade6_1_3 = createCourseGrade(student3, course6, 86.9, List.of(grade6_1_3, grade6_2_3, grade6_3_3, grade6_4_3, grade6_5_3));
        CourseGrade courseGrade6_1_4 = createCourseGrade(student4, course6, 85.94, List.of(grade6_1_4, grade6_2_4, grade6_3_4, grade6_4_4, grade6_5_4));

        CourseGrade courseGrade7_1_3 = createCourseGrade(student3, course7, 87.15, List.of(grade7_1_3, grade7_2_3, grade7_3_3, grade7_4_3));
        CourseGrade courseGrade7_1_4 = createCourseGrade(student4, course7, 86.4, List.of(grade7_1_4, grade7_2_4, grade7_3_4, grade7_4_4));

        CourseGrade courseGrade8_1_3 = createCourseGrade(student3, course8, 86.74, List.of(grade8_1_3, grade8_2_3, grade8_3_3, grade8_4_3, grade8_5_3));
        CourseGrade courseGrade8_1_4 = createCourseGrade(student4, course8, 86.32, List.of(grade8_1_4, grade8_2_4, grade8_3_4, grade8_4_4, grade8_5_4));

        Feedback feedback5_1_3 = createFeedback("Great work, student3!", submission5_1_3);
        Feedback feedback5_1_4 = createFeedback("Nice job, student4!", submission5_1_4);

        Feedback feedback5_2_3 = createFeedback("Excellent effort, student3.", submission5_2_3);
        Feedback feedback5_2_4 = createFeedback("Well done, student4!", submission5_2_4);

        Feedback feedback5_3_3 = createFeedback("Good answers, student3.", submission5_3_3);
        Feedback feedback5_3_4 = createFeedback("Strong performance, student4.", submission5_3_4);

        Feedback feedback5_4_3 = createFeedback("Well written, student3.", submission5_4_3);
        Feedback feedback5_4_4 = createFeedback("Great job, student4.", submission5_4_4);

        Feedback feedback6_1_3 = createFeedback("Well done, student3!", submission6_1_3);
        Feedback feedback6_1_4 = createFeedback("Nice effort, student4!", submission6_1_4);

        Feedback feedback6_2_3 = createFeedback("Excellent work, student3.", submission6_2_3);
        Feedback feedback6_2_4 = createFeedback("Great job, student4!", submission6_2_4);

        Feedback feedback6_3_3 = createFeedback("Good answers, student3.", submission6_3_3);
        Feedback feedback6_3_4 = createFeedback("Strong performance, student4.", submission6_3_4);

        Feedback feedback6_4_3 = createFeedback("Well written, student3.", submission6_4_3);
        Feedback feedback6_4_4 = createFeedback("Great job, student4.", submission6_4_4);

        Feedback feedback6_5_3 = createFeedback("Impressive work, student3!", submission6_5_3);
        Feedback feedback6_5_4 = createFeedback("Solid submission, student4.", submission6_5_4);

        Feedback feedback7_1_3 = createFeedback("Well done, student3!", submission7_1_3);
        Feedback feedback7_1_4 = createFeedback("Great effort, student4!", submission7_1_4);

        Feedback feedback7_2_3 = createFeedback("Excellent work, student3.", submission7_2_3);
        Feedback feedback7_2_4 = createFeedback("Nice job, student4!", submission7_2_4);

        Feedback feedback7_3_3 = createFeedback("Good answers, student3.", submission7_3_3);
        Feedback feedback7_3_4 = createFeedback("Strong performance, student4.", submission7_3_4);

        Feedback feedback7_4_3 = createFeedback("Well written, student3.", submission7_4_3);
        Feedback feedback7_4_4 = createFeedback("Great job, student4.", submission7_4_4);

        Feedback feedback8_1_3 = createFeedback("Great work, student3!", submission8_1_3);
        Feedback feedback8_1_4 = createFeedback("Nice job, student4!", submission8_1_4);

        Feedback feedback8_2_3 = createFeedback("Excellent effort, student3.", submission8_2_3);
        Feedback feedback8_2_4 = createFeedback("Well done, student4!", submission8_2_4);

        Feedback feedback8_3_3 = createFeedback("Good answers, student3.", submission8_3_3);
        Feedback feedback8_3_4 = createFeedback("Strong performance, student4.", submission8_3_4);

        Feedback feedback8_4_3 = createFeedback("Well written, student3.", submission8_4_3);
        Feedback feedback8_4_4 = createFeedback("Great job, student4.", submission8_4_4);

        Feedback feedback8_5_3 = createFeedback("Impressive work, student3!", submission8_5_3);
        Feedback feedback8_5_4 = createFeedback("Solid submission, student4.", submission8_5_4);


        course5.setGrades(List.of(grade5_1_3, grade5_1_4, grade5_2_3, grade5_2_4, grade5_3_3, grade5_3_4, grade5_4_3, grade5_4_4));
        course6.setGrades(List.of(grade6_1_3, grade6_1_4, grade6_2_3, grade6_2_4, grade6_3_3, grade6_3_4, grade6_4_3, grade6_4_4, grade6_5_3, grade6_5_4));
        course7.setGrades(List.of(grade7_1_3, grade7_1_4, grade7_2_3, grade7_2_4, grade7_3_3, grade7_3_4, grade7_4_3, grade7_4_4));
        course8.setGrades(List.of(grade8_1_3, grade8_1_4, grade8_2_3, grade8_2_4, grade8_3_3, grade8_3_4, grade8_4_3, grade8_4_4, grade8_5_3, grade8_5_4));

        course5.setCourseGrades(List.of(courseGrade5_1_3, courseGrade5_1_4));
        course6.setCourseGrades(List.of(courseGrade6_1_3, courseGrade6_1_4));
        course7.setCourseGrades(List.of(courseGrade7_1_3, courseGrade7_1_4));
        course8.setCourseGrades(List.of(courseGrade8_1_3, courseGrade8_1_4));

        createFacultyWithAssignment(faculty5, List.of(grade5_1_3, grade5_1_4, grade5_2_3, grade5_2_4, grade5_3_3, grade5_3_4, grade5_4_3, grade5_4_4), List.of(assignment5_1, assignment5_2, assignment5_3, assignment5_4));
        createFacultyWithAssignment(faculty1, List.of(grade6_1_3, grade6_1_4, grade6_2_3, grade6_2_4, grade6_3_3, grade6_3_4, grade6_4_3, grade6_4_4, grade6_5_3, grade6_5_4), List.of(assignment6_1, assignment6_2, assignment6_3, assignment6_4, assignment6_5));
        createFacultyWithAssignment(faculty2, List.of(grade7_1_3, grade7_1_4, grade7_2_3, grade7_2_4, grade7_3_3, grade7_3_4, grade7_4_3, grade7_4_4), List.of(assignment7_1, assignment7_2, assignment7_3, assignment7_4));
        createFacultyWithAssignment(faculty3, List.of(grade8_1_3, grade8_1_4, grade8_2_3, grade8_2_4, grade8_3_3, grade8_3_4, grade8_4_3, grade8_4_4, grade8_5_3, grade8_5_4), List.of(assignment8_1, assignment8_2, assignment8_3, assignment8_4, assignment8_5));

        linkSubmissionDetails(submission5_1_3, student3, grade5_1_3, feedback5_1_3, List.of(sa5_1_1_student3, sa5_1_2_student3, sa5_1_3_student3, sa5_1_4_student3, sa5_1_5_student3));
        linkSubmissionDetails(submission5_1_4, student4, grade5_1_4, feedback5_1_4, List.of(sa5_1_1_student4, sa5_1_2_student4, sa5_1_3_student4, sa5_1_4_student4, sa5_1_5_student4));
        linkSubmissionDetails(submission5_2_3, student3, grade5_2_3, feedback5_2_3, List.of(sa5_2_1_student3, sa5_2_2_student3, sa5_2_3_student3, sa5_2_4_student3, sa5_2_5_student3));
        linkSubmissionDetails(submission5_2_4, student4, grade5_2_4, feedback5_2_4, List.of(sa5_2_1_student4, sa5_2_2_student4, sa5_2_3_student4, sa5_2_4_student4, sa5_2_5_student4));
        linkSubmissionDetails(submission5_3_3, student3, grade5_3_3, feedback5_3_3, List.of(sa5_3_1_student3, sa5_3_2_student3, sa5_3_3_student3, sa5_3_4_student3, sa5_3_5_student3));
        linkSubmissionDetails(submission5_3_4, student4, grade5_3_4, feedback5_3_4, List.of(sa5_3_1_student4, sa5_3_2_student4, sa5_3_3_student4, sa5_3_4_student4, sa5_3_5_student4));
        linkSubmissionDetails(submission5_4_3, student3, grade5_4_3, feedback5_4_3, List.of(sa5_4_1_student3, sa5_4_2_student3, sa5_4_3_student3, sa5_4_4_student3, sa5_4_5_student3));
        linkSubmissionDetails(submission5_4_4, student4, grade5_4_4, feedback5_4_4, List.of(sa5_4_1_student4, sa5_4_2_student4, sa5_4_3_student4, sa5_4_4_student4, sa5_4_5_student4));

        linkSubmissionDetails(submission6_1_3, student3, grade6_1_3, feedback6_1_3, List.of(sa6_1_1_student3, sa6_1_2_student3, sa6_1_3_student3, sa6_1_4_student3, sa6_1_5_student3));
        linkSubmissionDetails(submission6_1_4, student4, grade6_1_4, feedback6_1_4, List.of(sa6_1_1_student4, sa6_1_2_student4, sa6_1_3_student4, sa6_1_4_student4, sa6_1_5_student4));
        linkSubmissionDetails(submission6_2_3, student3, grade6_2_3, feedback6_2_3, List.of(sa6_2_1_student3, sa6_2_2_student3, sa6_2_3_student3, sa6_2_4_student3, sa6_2_5_student3));
        linkSubmissionDetails(submission6_2_4, student4, grade6_2_4, feedback6_2_4, List.of(sa6_2_1_student4, sa6_2_2_student4, sa6_2_3_student4, sa6_2_4_student4, sa6_2_5_student4));
        linkSubmissionDetails(submission6_3_3, student3, grade6_3_3, feedback6_3_3, List.of(sa6_3_1_student3, sa6_3_2_student3, sa6_3_3_student3, sa6_3_4_student3, sa6_3_5_student3));
        linkSubmissionDetails(submission6_3_4, student4, grade6_3_4, feedback6_3_4, List.of(sa6_3_1_student4, sa6_3_2_student4, sa6_3_3_student4, sa6_3_4_student4, sa6_3_5_student4));
        linkSubmissionDetails(submission6_4_3, student3, grade6_4_3, feedback6_4_3, List.of(sa6_4_1_student3, sa6_4_2_student3, sa6_4_3_student3, sa6_4_4_student3, sa6_4_5_student3));
        linkSubmissionDetails(submission6_4_4, student4, grade6_4_4, feedback6_4_4, List.of(sa6_4_1_student4, sa6_4_2_student4, sa6_4_3_student4, sa6_4_4_student4, sa6_4_5_student4));
        linkSubmissionDetails(submission6_5_3, student3, grade6_5_3, feedback6_5_3, List.of(sa6_5_1_student3, sa6_5_2_student3, sa6_5_3_student3, sa6_5_4_student3, sa6_5_5_student3));
        linkSubmissionDetails(submission6_5_4, student4, grade6_5_4, feedback6_5_4, List.of(sa6_5_1_student4, sa6_5_2_student4, sa6_5_3_student4, sa6_5_4_student4, sa6_5_5_student4));

        linkSubmissionDetails(submission7_1_3, student3, grade7_1_3, feedback7_1_3, List.of(sa7_1_1_student3, sa7_1_2_student3, sa7_1_3_student3, sa7_1_4_student3, sa7_1_5_student3));
        linkSubmissionDetails(submission7_1_4, student4, grade7_1_4, feedback7_1_4, List.of(sa7_1_1_student4, sa7_1_2_student4, sa7_1_3_student4, sa7_1_4_student4, sa7_1_5_student4));
        linkSubmissionDetails(submission7_2_3, student3, grade7_2_3, feedback7_2_3, List.of(sa7_2_1_student3, sa7_2_2_student3, sa7_2_3_student3, sa7_2_4_student3, sa7_2_5_student3));
        linkSubmissionDetails(submission7_2_4, student4, grade7_2_4, feedback7_2_4, List.of(sa7_2_1_student4, sa7_2_2_student4, sa7_2_3_student4, sa7_2_4_student4, sa7_2_5_student4));
        linkSubmissionDetails(submission7_3_3, student3, grade7_3_3, feedback7_3_3, List.of(sa7_3_1_student3, sa7_3_2_student3, sa7_3_3_student3, sa7_3_4_student3, sa7_3_5_student3));
        linkSubmissionDetails(submission7_3_4, student4, grade7_3_4, feedback7_3_4, List.of(sa7_3_1_student4, sa7_3_2_student4, sa7_3_3_student4, sa7_3_4_student4, sa7_3_5_student4));
        linkSubmissionDetails(submission7_4_3, student3, grade7_4_3, feedback7_4_3, List.of(sa7_4_1_student3, sa7_4_2_student3, sa7_4_3_student3, sa7_4_4_student3, sa7_4_5_student3));
        linkSubmissionDetails(submission7_4_4, student4, grade7_4_4, feedback7_4_4, List.of(sa7_4_1_student4, sa7_4_2_student4, sa7_4_3_student4, sa7_4_4_student4, sa7_4_5_student4));

        linkSubmissionDetails(submission8_1_3, student3, grade8_1_3, feedback8_1_3, List.of(sa8_1_1_student3, sa8_1_2_student3, sa8_1_3_student3, sa8_1_4_student3, sa8_1_5_student3));
        linkSubmissionDetails(submission8_1_4, student4, grade8_1_4, feedback8_1_4, List.of(sa8_1_1_student4, sa8_1_2_student4, sa8_1_3_student4, sa8_1_4_student4, sa8_1_5_student4));
        linkSubmissionDetails(submission8_2_3, student3, grade8_2_3, feedback8_2_3, List.of(sa8_2_1_student3, sa8_2_2_student3, sa8_2_3_student3, sa8_2_4_student3, sa8_2_5_student3));
        linkSubmissionDetails(submission8_2_4, student4, grade8_2_4, feedback8_2_4, List.of(sa8_2_1_student4, sa8_2_2_student4, sa8_2_3_student4, sa8_2_4_student4, sa8_2_5_student4));
        linkSubmissionDetails(submission8_3_3, student3, grade8_3_3, feedback8_3_3, List.of(sa8_3_1_student3, sa8_3_2_student3, sa8_3_3_student3, sa8_3_4_student3, sa8_3_5_student3));
        linkSubmissionDetails(submission8_3_4, student4, grade8_3_4, feedback8_3_4, List.of(sa8_3_1_student4, sa8_3_2_student4, sa8_3_3_student4, sa8_3_4_student4, sa8_3_5_student4));
        linkSubmissionDetails(submission8_4_3, student3, grade8_4_3, feedback8_4_3, List.of(sa8_4_1_student3, sa8_4_2_student3, sa8_4_3_student3, sa8_4_4_student3, sa8_4_5_student3));
        linkSubmissionDetails(submission8_4_4, student4, grade8_4_4, feedback8_4_4, List.of(sa8_4_1_student4, sa8_4_2_student4, sa8_4_3_student4, sa8_4_4_student4, sa8_4_5_student4));
        linkSubmissionDetails(submission8_5_3, student3, grade8_5_3, feedback8_5_3, List.of(sa8_5_1_student3, sa8_5_2_student3, sa8_5_3_student3, sa8_5_4_student3, sa8_5_5_student3));
        linkSubmissionDetails(submission8_5_4, student4, grade8_5_4, feedback8_5_4, List.of(sa8_5_1_student4, sa8_5_2_student4, sa8_5_3_student4, sa8_5_4_student4, sa8_5_5_student4));


    }
}
