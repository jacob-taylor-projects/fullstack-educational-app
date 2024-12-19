package com.project.education_app;

import com.project.education_app.entities.*;
import com.project.education_app.repos.FacultyRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.repos.SyllabusRepo;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static com.project.education_app.AssignmentSeeder.*;

@Component
@Data
public class ProjectSeeder implements CommandLineRunner {
    private final FacultyRepo facultyRepo;
    private final SyllabusRepo syllabusRepo;
    private final StudentRepo studentRepo;

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
        ProblemAnswer pa1a_project = createProblemAnswer("What is the significance of variables in programming?", "Variables are essential for storing and manipulating data, allowing programmers to create dynamic and flexible programs.");
        Project project1a = createProject("Variables Project", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false, pa1a_project);
        addProjectToProblemAnswer(pa1a_project, project1a);
        System.out.println("Project for 'Variables' unit created with associated problem answer.");

        ProblemAnswer pa1b_project = createProblemAnswer("How do different data types impact program functionality?", "Different data types allow for the representation and manipulation of various forms of data, ensuring the correct handling and processing in programs.");
        Project project1b = createProject("Data Types Project", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false, pa1b_project);
        addProjectToProblemAnswer(pa1b_project, project1b);
        System.out.println("Project for 'Data Types' unit created with associated problem answer.");

        ProblemAnswer pa1c_project = createProblemAnswer("Why are control structures important in programming?", "Control structures like loops and conditionals enable the flow control of a program, allowing for repeated actions and decision-making based on conditions.");
        Project project1c = createProject("Control Structures Project", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false, pa1c_project);
        addProjectToProblemAnswer(pa1c_project, project1c);
        System.out.println("Project for 'Control Structures' unit created with associated problem answer.");

        ProblemAnswer pa1d_project = createProblemAnswer("What is the role of functions in programming?", "Functions allow for code reuse and modularity, making programs more organized, readable, and maintainable.");
        Project project1d = createProject("Functions Project", faculty1, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false, pa1d_project);
        addProjectToProblemAnswer(pa1d_project, project1d);
        System.out.println("Project for 'Functions' unit created with associated problem answer.");

        ProblemAnswer pa1e_project = createProblemAnswer("How do modules enhance Python programming?", "Modules allow for the modularization of code, making it more manageable and reusable, and enable the use of built-in and custom functionalities.");
        Project project1e = createProject("Modules Project", faculty1, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false, pa1e_project);
        addProjectToProblemAnswer(pa1e_project, project1e);
        System.out.println("Project for 'Modules' unit created with associated problem answer.");

        ProblemAnswer pa1f_project = createProblemAnswer("What is the significance of libraries in Python programming?", "Libraries provide pre-written code that extends the functionality of programs, allowing developers to perform complex tasks efficiently.");
        Project project1f = createProject("Libraries Project", faculty1, Date.from(LocalDate.of(2030, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false, pa1f_project);
        addProjectToProblemAnswer(pa1f_project, project1f);
        System.out.println("Project for 'Libraries' unit created with associated problem answer.");

        ProblemAnswer pa2a_project = createProblemAnswer("What are the advantages of using arrays?", "Arrays provide a way to store multiple elements of the same type in a contiguous block of memory, allowing for efficient indexing and traversal.");
        Project project2a = createProject("Arrays Project", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false, pa2a_project);
        addProjectToProblemAnswer(pa2a_project, project2a);
        System.out.println("Project for 'Arrays' unit created with associated problem answer.");

        ProblemAnswer pa2b_project = createProblemAnswer("What are the advantages of using linked lists?", "Linked lists allow for efficient insertions and deletions at any position in the list, providing more flexibility than arrays.");
        Project project2b = createProject("Linked Lists Project", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false, pa2b_project);
        addProjectToProblemAnswer(pa2b_project, project2b);
        System.out.println("Project for 'Linked Lists' unit created with associated problem answer.");

        ProblemAnswer pa2c_project = createProblemAnswer("What are the common uses of stacks?", "Stacks are commonly used for function call management, expression evaluation, and depth-first search algorithms.");
        Project project2c = createProject("Stacks Project", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false, pa2c_project);
        addProjectToProblemAnswer(pa2c_project, project2c);
        System.out.println("Project for 'Stacks' unit created with associated problem answer.");

        ProblemAnswer pa2d_project = createProblemAnswer("What are the applications of queues?", "Queues are used in scheduling algorithms, buffering data streams, and breadth-first search algorithms.");
        Project project2d = createProject("Queues Project", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false, pa2d_project);
        addProjectToProblemAnswer(pa2d_project, project2d);
        System.out.println("Project for 'Queues' unit created with associated problem answer.");

        ProblemAnswer pa2e_project = createProblemAnswer("Why are trees important in data structures?", "Trees provide a hierarchical structure for organizing data, enabling efficient search, insertion, and deletion operations.");
        Project project2e = createProject("Trees Project", faculty2, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false, pa2e_project);
        addProjectToProblemAnswer(pa2e_project, project2e);
        System.out.println("Project for 'Trees' unit created with associated problem answer.");

        ProblemAnswer pa2f_project = createProblemAnswer("What are the applications of graphs?", "Graphs are used to represent relationships between entities in various fields such as social networks, transportation systems, and computer networks.");
        Project project2f = createProject("Graphs Project", faculty2, Date.from(LocalDate.of(2030, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false, pa2f_project);
        addProjectToProblemAnswer(pa2f_project, project2f);
        System.out.println("Project for 'Graphs' unit created with associated problem answer.");

        ProblemAnswer pa3a_project = createProblemAnswer("What are the benefits of using efficient sorting algorithms?", "Efficient sorting algorithms improve the performance of applications by reducing the time complexity of sorting operations, leading to faster data processing.");
        Project project3a = createProject("Sorting Project", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false, pa3a_project);
        addProjectToProblemAnswer(pa3a_project, project3a);
        System.out.println("Project for 'Sorting' unit created with associated problem answer.");

        ProblemAnswer pa3b_project = createProblemAnswer("Why is binary search more efficient than linear search?", "Binary search significantly reduces the time complexity by dividing the search space in half with each step, making it much faster for large datasets compared to linear search.");
        Project project3b = createProject("Searching Project", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false, pa3b_project);
        addProjectToProblemAnswer(pa3b_project, project3b);
        System.out.println("Project for 'Searching' unit created with associated problem answer.");

        ProblemAnswer pa3c_project = createProblemAnswer("How do graph algorithms benefit network analysis?", "Graph algorithms like DFS and BFS are crucial for analyzing network structures, identifying connectivity, and optimizing routes and connections in various fields, such as social networks and transportation.");
        Project project3c = createProject("Graph Algorithms Project", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false, pa3c_project);
        addProjectToProblemAnswer(pa3c_project, project3c);
        System.out.println("Project for 'Graph Algorithms' unit created with associated problem answer.");

        ProblemAnswer pa3d_project = createProblemAnswer("What is the importance of dynamic programming in problem-solving?", "Dynamic programming optimizes the solution of complex problems by breaking them down into simpler subproblems, reducing redundancy and improving efficiency.");
        Project project3d = createProject("Dynamic Programming Project", faculty3, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false, pa3d_project);
        addProjectToProblemAnswer(pa3d_project, project3d);
        System.out.println("Project for 'Dynamic Programming' unit created with associated problem answer.");

        ProblemAnswer pa4a_project = createProblemAnswer("What is the importance of relational databases?", "Relational databases organize data efficiently and establish clear relationships between data points, ensuring data integrity and ease of access.");
        Project project4a = createProject("Relational Databases Project", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false, pa4a_project);
        addProjectToProblemAnswer(pa4a_project, project4a);
        System.out.println("Project for 'Relational Databases' unit created with associated problem answer.");

        ProblemAnswer pa4b_project = createProblemAnswer("How does SQL enhance database management?", "SQL allows for efficient querying and manipulation of data, enabling users to create, read, update, and delete records with precision and ease.");
        Project project4b = createProject("SQL Project", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false, pa4b_project);
        addProjectToProblemAnswer(pa4b_project, project4b);
        System.out.println("Project for 'SQL' unit created with associated problem answer.");

        ProblemAnswer pa4c_project = createProblemAnswer("Why are transactions critical in databases?", "Transactions ensure data integrity and consistency by adhering to ACID properties, allowing for safe and reliable database operations.");
        Project project4c = createProject("Transactions Project", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false, pa4c_project);
        addProjectToProblemAnswer(pa4c_project, project4c);
        System.out.println("Project for 'Transactions' unit created with associated problem answer.");

        ProblemAnswer pa4d_project = createProblemAnswer("What are the best practices in database design?", "Best practices in database design include normalization, efficient schema creation, and data modeling to ensure optimal performance and data integrity.");
        Project project4d = createProject("Database Design Project", faculty4, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false, pa4d_project);
        addProjectToProblemAnswer(pa4d_project, project4d);
        System.out.println("Project for 'Database Design' unit created with associated problem answer.");

        ProblemAnswer pa5a_project = createProblemAnswer("Why is process management important in operating systems?", "Process management ensures efficient execution of processes, maintains system stability, and allows for multitasking and resource sharing.");
        Project project5a = createProject("Processes Project", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false, pa5a_project);
        addProjectToProblemAnswer(pa5a_project, project5a);
        System.out.println("Project for 'Processes' unit created with associated problem answer.");

        ProblemAnswer pa5b_project = createProblemAnswer("How does memory management enhance system performance?", "Memory management techniques like paging, segmentation, and virtual memory optimize resource allocation and improve system efficiency.");
        Project project5b = createProject("Memory Management Project", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false, pa5b_project);
        addProjectToProblemAnswer(pa5b_project, project5b);
        System.out.println("Project for 'Memory Management' unit created with associated problem answer.");

        ProblemAnswer pa5c_project = createProblemAnswer("What role do file systems play in operating systems?", "File systems organize and manage data storage, providing a structured way to store, retrieve, and manage files efficiently.");
        Project project5c = createProject("File Systems Project", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false, pa5c_project);
        addProjectToProblemAnswer(pa5c_project, project5c);
        System.out.println("Project for 'File Systems' unit created with associated problem answer.");

        ProblemAnswer pa5d_project = createProblemAnswer("Why are CPU scheduling algorithms essential?", "CPU scheduling algorithms optimize process execution, improve system responsiveness, and ensure efficient utilization of CPU resources.");
        Project project5d = createProject("Scheduling Project", faculty5, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false, pa5d_project);
        addProjectToProblemAnswer(pa5d_project, project5d);
        System.out.println("Project for 'Scheduling' unit created with associated problem answer.");

        ProblemAnswer pa6a_project = createProblemAnswer("Why is the OSI model important in networking?", "The OSI model standardizes network functions, enabling interoperability between different systems and technologies.");
        Project project6a = createProject("OSI Model Project", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false, pa6a_project);
        addProjectToProblemAnswer(pa6a_project, project6a);
        System.out.println("Project for 'OSI Model' unit created with associated problem answer.");

        ProblemAnswer pa6b_project = createProblemAnswer("How does the TCP/IP model facilitate internet communication?", "The TCP/IP model provides a robust and scalable framework for data transmission, ensuring reliable communication between networked devices.");
        Project project6b = createProject("TCP/IP Project", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false, pa6b_project);
        addProjectToProblemAnswer(pa6b_project, project6b);
        System.out.println("Project for 'TCP/IP' unit created with associated problem answer.");

        ProblemAnswer pa6c_project = createProblemAnswer("What is the role of network protocols in data exchange?", "Network protocols govern the rules and conventions for communication between devices, ensuring secure and efficient data exchange.");
        Project project6c = createProject("Network Protocols Project", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false, pa6c_project);
        addProjectToProblemAnswer(pa6c_project, project6c);
        System.out.println("Project for 'Network Protocols' unit created with associated problem answer.");

        ProblemAnswer pa6d_project = createProblemAnswer("Why is routing essential in networking?", "Routing determines the optimal paths for data packets, ensuring efficient and reliable data delivery across complex networks.");
        Project project6d = createProject("Routing Project", faculty1, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false, pa6d_project);
        addProjectToProblemAnswer(pa6d_project, project6d);
        System.out.println("Project for 'Routing' unit created with associated problem answer.");

        ProblemAnswer pa6e_project = createProblemAnswer("What is the significance of switching in network design?", "Switching efficiently forwards data packets within a network, enhancing communication speed and reducing latency.");
        Project project6e = createProject("Switching Project", faculty1, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false, pa6e_project);
        addProjectToProblemAnswer(pa6e_project, project6e);
        System.out.println("Project for 'Switching' unit created with associated problem answer.");

        ProblemAnswer pa7a_project = createProblemAnswer("Why is the Software Development Life Cycle (SDLC) important in software development?", "The SDLC provides a structured approach to planning, creating, testing, and deploying software, ensuring quality and efficiency throughout the development process.");
        Project project7a = createProject("SDLC Project", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false, pa7a_project);
        addProjectToProblemAnswer(pa7a_project, project7a);
        System.out.println("Project for 'Software Development Life Cycle' unit created with associated problem answer.");

        ProblemAnswer pa7b_project = createProblemAnswer("What are the key benefits of using Agile methodology?", "Agile methodology enhances flexibility, customer feedback, and iterative progress, allowing for adaptive and efficient software development.");
        Project project7b = createProject("Agile Project", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false, pa7b_project);
        addProjectToProblemAnswer(pa7b_project, project7b);
        System.out.println("Project for 'Agile' unit created with associated problem answer.");

        ProblemAnswer pa7c_project = createProblemAnswer("How does the Waterfall model structure software development?", "The Waterfall model follows a linear and sequential approach, ensuring each phase of development is completed before moving on to the next, promoting thorough documentation and planning.");
        Project project7c = createProject("Waterfall Project", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false, pa7c_project);
        addProjectToProblemAnswer(pa7c_project, project7c);
        System.out.println("Project for 'Waterfall' unit created with associated problem answer.");

        ProblemAnswer pa7d_project = createProblemAnswer("What are the essential project management techniques for software development?", "Effective project management involves planning, scheduling, resource allocation, risk management, and quality assurance, ensuring successful project completion.");
        Project project7d = createProject("Project Management Project", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false, pa7d_project);
        addProjectToProblemAnswer(pa7d_project, project7d);
        System.out.println("Project for 'Project Management' unit created with associated problem answer.");

        ProblemAnswer pa8a_project = createProblemAnswer("What is the significance of HTML in web development?", "HTML is the foundational language for creating web pages, providing the structure and layout for web content.");
        Project project8a = createProject("HTML Project", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false, pa8a_project);
        addProjectToProblemAnswer(pa8a_project, project8a);
        System.out.println("Project for 'HTML' unit created with associated problem answer.");

        ProblemAnswer pa8b_project = createProblemAnswer("How does CSS enhance web page design?", "CSS enhances web page design by allowing developers to style and layout HTML content, improving the visual appeal and user experience.");
        Project project8b = createProject("CSS Project", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false, pa8b_project);
        addProjectToProblemAnswer(pa8b_project, project8b);
        System.out.println("Project for 'CSS' unit created with associated problem answer.");

        ProblemAnswer pa8c_project = createProblemAnswer("What role does JavaScript play in web development?", "JavaScript adds interactivity and dynamic behavior to web pages, allowing developers to create engaging and responsive user experiences.");
        Project project8c = createProject("JavaScript Project", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false, pa8c_project);
        addProjectToProblemAnswer(pa8c_project, project8c);
        System.out.println("Project for 'JavaScript' unit created with associated problem answer.");

        ProblemAnswer pa8d_project = createProblemAnswer("Why is React popular for building user interfaces?", "React's component-based architecture and efficient rendering make it ideal for building complex, interactive user interfaces in a scalable and maintainable way.");
        Project project8d = createProject("React Project", faculty3, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false, pa8d_project);
        addProjectToProblemAnswer(pa8d_project, project8d);
        System.out.println("Project for 'React' unit created with associated problem answer.");

        ProblemAnswer pa8e_project = createProblemAnswer("What is the importance of backend integration in web development?", "Backend integration allows front-end applications to interact with servers and databases, enabling dynamic data fetching, user authentication, and seamless full-stack functionality.");
        Project project8e = createProject("Backend Integration Project", faculty3, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false, pa8e_project);
        addProjectToProblemAnswer(pa8e_project, project8e);
        System.out.println("Project for 'Backend Integration' unit created with associated problem answer.");

        ProblemAnswer pa9a_project = createProblemAnswer("What are the applications of machine learning?", "Machine learning is used in various fields such as healthcare, finance, and marketing to make predictions, automate processes, and gain insights from data.");
        Project project9a = createProject("Machine Learning Project", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false, pa9a_project);
        addProjectToProblemAnswer(pa9a_project, project9a);
        System.out.println("Project for 'Machine Learning' unit created with associated problem answer.");

        ProblemAnswer pa9b_project = createProblemAnswer("How do neural networks mimic the human brain?", "Neural networks use interconnected layers of nodes (neurons) to process information, similar to the way neurons in the human brain work, enabling them to learn and make decisions.");
        Project project9b = createProject("Neural Networks Project", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false, pa9b_project);
        addProjectToProblemAnswer(pa9b_project, project9b);
        System.out.println("Project for 'Neural Networks' unit created with associated problem answer.");

        ProblemAnswer pa9c_project = createProblemAnswer("What is the significance of natural language processing (NLP)?", "NLP enables computers to understand, interpret, and generate human language, facilitating applications such as chatbots, language translation, and sentiment analysis.");
        Project project9c = createProject("Natural Language Processing Project", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false, pa9c_project);
        addProjectToProblemAnswer(pa9c_project, project9c);
        System.out.println("Project for 'Natural Language Processing' unit created with associated problem answer.");

        ProblemAnswer pa10a_project = createProblemAnswer("Why is threat analysis important in cybersecurity?", "Threat analysis helps identify potential security threats and vulnerabilities, allowing organizations to implement strategies to mitigate these risks and protect their systems.");
        Project project10a = createProject("Threat Analysis Project", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false, pa10a_project);
        addProjectToProblemAnswer(pa10a_project, project10a);
        System.out.println("Project for 'Threat Analysis' unit created with associated problem answer.");

        ProblemAnswer pa10b_project = createProblemAnswer("How does encryption protect sensitive data?", "Encryption converts information into a secure format, preventing unauthorized access and ensuring the confidentiality and integrity of data.");
        Project project10b = createProject("Encryption Project", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false, pa10b_project);
        addProjectToProblemAnswer(pa10b_project, project10b);
        System.out.println("Project for 'Encryption' unit created with associated problem answer.");

        ProblemAnswer pa10c_project = createProblemAnswer("What measures are used to protect data during transmission across networks?", "Measures such as firewalls, intrusion detection systems, and encryption protocols safeguard networks and ensure secure data transmission.");
        Project project10c = createProject("Network Security Project", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false, pa10c_project);
        addProjectToProblemAnswer(pa10c_project, project10c);
        System.out.println("Project for 'Network Security' unit created with associated problem answer.");

        ProblemAnswer pa10d_project = createProblemAnswer("What are the best practices for secure coding?", "Secure coding practices involve writing code that is free of vulnerabilities, using techniques such as input validation, error handling, and regular security testing.");
        Project project10d = createProject("Secure Coding Project", faculty5, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false, pa10d_project);
        addProjectToProblemAnswer(pa10d_project, project10d);
        System.out.println("Project for 'Secure Coding' unit created with associated problem answer.");

        ProblemAnswer pa11a_project = createProblemAnswer("What is the significance of limits in calculus?", "Limits are fundamental to calculus, serving as the foundation for defining continuity, derivatives, and integrals.");
        Project project11a = createProject("Limits Project", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false, pa11a_project);
        addProjectToProblemAnswer(pa11a_project, project11a);
        System.out.println("Project for 'Limits' unit created with associated problem answer.");

        ProblemAnswer pa11b_project = createProblemAnswer("How do derivatives help solve real-world problems?", "Derivatives measure how a function changes as its input changes, enabling the analysis and optimization of various physical and economic systems.");
        Project project11b = createProject("Derivatives Project", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false, pa11b_project);
        addProjectToProblemAnswer(pa11b_project, project11b);
        System.out.println("Project for 'Derivatives' unit created with associated problem answer.");

        ProblemAnswer pa11c_project = createProblemAnswer("What are the applications of integrals in various fields?", "Integrals are used to calculate areas, volumes, and the accumulation of quantities, making them essential in fields like physics, engineering, and economics.");
        Project project11c = createProject("Integrals Project", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false, pa11c_project);
        addProjectToProblemAnswer(pa11c_project, project11c);
        System.out.println("Project for 'Integrals' unit created with associated problem answer.");

        ProblemAnswer pa11d_project = createProblemAnswer("How is calculus applied to model and solve real-world problems?", "Calculus is used to model and analyze dynamic systems, optimize processes, and solve complex problems in science, engineering, and economics.");
        Project project11d = createProject("Applications of Calculus Project", faculty1, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false, pa11d_project);
        addProjectToProblemAnswer(pa11d_project, project11d);
        System.out.println("Project for 'Applications of Calculus' unit created with associated problem answer.");

        ProblemAnswer pa12a_project = createProblemAnswer("What are the applications of vectors in various fields?", "Vectors are used in physics, engineering, and computer graphics to represent quantities that have both magnitude and direction.");
        Project project12a = createProject("Vectors Project", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false, pa12a_project);
        addProjectToProblemAnswer(pa12a_project, project12a);
        System.out.println("Project for 'Vectors' unit created with associated problem answer.");

        ProblemAnswer pa12b_project = createProblemAnswer("How do matrices help solve linear equations?", "Matrices provide a structured way to represent and solve systems of linear equations, enabling efficient computation and transformations.");
        Project project12b = createProject("Matrices Project", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false, pa12b_project);
        addProjectToProblemAnswer(pa12b_project, project12b);
        System.out.println("Project for 'Matrices' unit created with associated problem answer.");

        ProblemAnswer pa12c_project = createProblemAnswer("What role do determinants play in solving linear systems?", "Determinants help determine the solvability of a system of linear equations and are used to find the inverse of a matrix.");
        Project project12c = createProject("Determinants Project", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false, pa12c_project);
        addProjectToProblemAnswer(pa12c_project, project12c);
        System.out.println("Project for 'Determinants' unit created with associated problem answer.");

        ProblemAnswer pa12d_project = createProblemAnswer("What is the significance of eigenvalues in mathematical problems?", "Eigenvalues provide insights into the properties of linear transformations and are used in various applications, including stability analysis and vibration analysis.");
        Project project12d = createProject("Eigenvalues Project", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false, pa12d_project);
        addProjectToProblemAnswer(pa12d_project, project12d);
        System.out.println("Project for 'Eigenvalues' unit created with associated problem answer.");

        ProblemAnswer pa12e_project = createProblemAnswer("How do eigenvectors relate to eigenvalues?", "Eigenvectors are vectors that remain in the same direction under a linear transformation, corresponding to their eigenvalues, and are used in matrix diagonalization and solving systems of linear equations.");
        Project project12e = createProject("Eigenvectors Project", faculty2, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false, pa12e_project);
        addProjectToProblemAnswer(pa12e_project, project12e);
        System.out.println("Project for 'Eigenvectors' unit created with associated problem answer.");

        ProblemAnswer pa13a_project = createProblemAnswer("Why are sequences and series important in mathematics?", "Sequences and series are fundamental in analyzing the behavior of mathematical functions and in solving problems in calculus and other areas of mathematics.");
        Project project13a = createProject("Sequences and Series Project", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false, pa13a_project);
        addProjectToProblemAnswer(pa13a_project, project13a);
        System.out.println("Project for 'Sequences and Series' unit created with associated problem answer.");

        ProblemAnswer pa13b_project = createProblemAnswer("What are the applications of advanced integration techniques?", "Advanced integration techniques allow for the evaluation of complex integrals, which are essential in solving real-world problems in physics, engineering, and economics.");
        Project project13b = createProject("Techniques of Integration Project", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false, pa13b_project);
        addProjectToProblemAnswer(pa13b_project, project13b);
        System.out.println("Project for 'Techniques of Integration' unit created with associated problem answer.");

        ProblemAnswer pa13c_project = createProblemAnswer("How do multivariable functions apply to various fields?", "Multivariable functions are used to model and analyze systems with multiple variables, such as in physics, engineering, and economics.");
        Project project13c = createProject("Multivariable Functions Project", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false, pa13c_project);
        addProjectToProblemAnswer(pa13c_project, project13c);
        System.out.println("Project for 'Multivariable Functions' unit created with associated problem answer.");

        ProblemAnswer pa13d_project = createProblemAnswer("What is the importance of vector calculus in analyzing vector fields?", "Vector calculus provides tools to analyze and solve problems involving vector fields, such as fluid dynamics, electromagnetism, and other applications in physics and engineering.");
        Project project13d = createProject("Vector Calculus Project", faculty3, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false, pa13d_project);
        addProjectToProblemAnswer(pa13d_project, project13d);
        System.out.println("Project for 'Vector Calculus' unit created with associated problem answer.");

        ProblemAnswer pa14a_project = createProblemAnswer("Why is logic important in problem-solving?", "Logic provides a foundation for forming sound arguments and reasoning, enabling effective problem-solving and decision-making.");
        Project project14a = createProject("Logic Project", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false, pa14a_project);
        addProjectToProblemAnswer(pa14a_project, project14a);
        System.out.println("Project for 'Logic' unit created with associated problem answer.");

        ProblemAnswer pa14b_project = createProblemAnswer("What are the applications of set theory in mathematics?", "Set theory provides a framework for understanding collections of objects, and is fundamental in areas such as probability, statistics, and algebra.");
        Project project14b = createProject("Set Theory Project", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false, pa14b_project);
        addProjectToProblemAnswer(pa14b_project, project14b);
        System.out.println("Project for 'Set Theory' unit created with associated problem answer.");

        ProblemAnswer pa14c_project = createProblemAnswer("Why is graph theory significant in modeling relationships?", "Graph theory allows for the modeling of pairwise relations between objects, facilitating the analysis of networks, paths, and connectivity in various fields.");
        Project project14c = createProject("Graph Theory Project", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false, pa14c_project);
        addProjectToProblemAnswer(pa14c_project, project14c);
        System.out.println("Project for 'Graph Theory' unit created with associated problem answer.");

        ProblemAnswer pa14d_project = createProblemAnswer("How does combinatorics aid in solving counting problems?", "Combinatorics provides techniques for counting, arrangement, and combination of objects, essential in fields such as computer science, cryptography, and optimization.");
        Project project14d = createProject("Combinatorics Project", faculty4, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false, pa14d_project);
        addProjectToProblemAnswer(pa14d_project, project14d);
        System.out.println("Project for 'Combinatorics' unit created with associated problem answer.");

        ProblemAnswer pa15a_project = createProblemAnswer("How do Newton's laws of motion explain the behavior of objects?", "Newton's laws describe the relationship between forces and the motion of objects, providing a foundation for understanding mechanics and solving problems in physics.");
        Project project15a = createProject("Newton's Laws Project", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false, pa15a_project);
        addProjectToProblemAnswer(pa15a_project, project15a);
        System.out.println("Project for 'Newton's Laws' unit created with associated problem answer.");

        ProblemAnswer pa15b_project = createProblemAnswer("What are the key principles of energy and work in physics?", "The principles of energy, including kinetic and potential energy, and the conservation of energy, are fundamental to understanding work, power, and efficiency in physical systems.");
        Project project15b = createProject("Energy Principles Project", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false, pa15b_project);
        addProjectToProblemAnswer(pa15b_project, project15b);
        System.out.println("Project for 'Energy Principles' unit created with associated problem answer.");

        ProblemAnswer pa15c_project = createProblemAnswer("How are concepts of motion analyzed in physics?", "Concepts of motion, including linear, projectile, and circular motion, are analyzed using velocity, acceleration, and the equations of motion to understand and predict the behavior of moving objects.");
        Project project15c = createProject("Motion Project", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false, pa15c_project);
        addProjectToProblemAnswer(pa15c_project, project15c);
        System.out.println("Project for 'Motion' unit created with associated problem answer.");

        ProblemAnswer pa16a_project = createProblemAnswer("Why is understanding atomic structure important in chemistry?", "Understanding atomic structure is fundamental to chemistry as it defines the properties of elements and their interactions, laying the groundwork for studying chemical behavior.");
        Project project16a = createProject("Atomic Structure Project", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false, pa16a_project);
        addProjectToProblemAnswer(pa16a_project, project16a);
        System.out.println("Project for 'Atomic Structure' unit created with associated problem answer.");

        ProblemAnswer pa16b_project = createProblemAnswer("How do chemical bonds influence the properties of substances?", "Chemical bonds determine the structure and stability of molecules and compounds, influencing their physical and chemical properties.");
        Project project16b = createProject("Chemical Bonding Project", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false, pa16b_project);
        addProjectToProblemAnswer(pa16b_project, project16b);
        System.out.println("Project for 'Chemical Bonding' unit created with associated problem answer.");

        ProblemAnswer pa16c_project = createProblemAnswer("What factors influence chemical reactions?", "Chemical reactions are influenced by factors such as temperature, concentration, pressure, catalysts, and the nature of the reactants, affecting reaction rates and equilibrium.");
        Project project16c = createProject("Reactions Project", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false, pa16c_project);
        addProjectToProblemAnswer(pa16c_project, project16c);
        System.out.println("Project for 'Reactions' unit created with associated problem answer.");

        ProblemAnswer pa17a_project = createProblemAnswer("Why is understanding cell structure important in biology?", "Understanding cell structure is fundamental to biology as it provides insights into the function and organization of all living organisms.");
        Project project17a = createProject("Cell Structure Project", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false, pa17a_project);
        addProjectToProblemAnswer(pa17a_project, project17a);
        System.out.println("Project for 'Cell Structure' unit created with associated problem answer.");

        ProblemAnswer pa17b_project = createProblemAnswer("What is the significance of genetics in understanding heredity?", "Genetics helps explain how traits are passed from one generation to the next, providing a foundation for studying biological variation and inheritance.");
        Project project17b = createProject("Genetics Project", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false, pa17b_project);
        addProjectToProblemAnswer(pa17b_project, project17b);
        System.out.println("Project for 'Genetics' unit created with associated problem answer.");

        ProblemAnswer pa17c_project = createProblemAnswer("How does the theory of evolution explain the diversity of life?", "The theory of evolution explains the diversity of life through the processes of natural selection and genetic variation, providing evidence for the common ancestry of all species.");
        Project project17c = createProject("Evolution Project", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false, pa17c_project);
        addProjectToProblemAnswer(pa17c_project, project17c);
        System.out.println("Project for 'Evolution' unit created with associated problem answer.");

        ProblemAnswer pa17d_project = createProblemAnswer("What is the role of ecology in understanding environmental interactions?", "Ecology studies the interactions between organisms and their environment, providing insights into ecosystem dynamics, biodiversity, and the impact of human activities on the natural world.");
        Project project17d = createProject("Ecology Project", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false, pa17d_project);
        addProjectToProblemAnswer(pa17d_project, project17d);
        System.out.println("Project for 'Ecology' unit created with associated problem answer.");

        ProblemAnswer pa18a_project = createProblemAnswer("What are the diverse applications of different engineering disciplines?", "Engineering disciplines such as civil, mechanical, electrical, and chemical engineering have diverse applications, ranging from infrastructure development to technological innovations in various industries.");
        Project project18a = createProject("Engineering Disciplines Project", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false, pa18a_project);
        addProjectToProblemAnswer(pa18a_project, project18a);
        System.out.println("Project for 'Engineering Disciplines' unit created with associated problem answer.");

        ProblemAnswer pa18b_project = createProblemAnswer("Why are problem-solving techniques crucial in engineering?", "Problem-solving techniques are crucial in engineering as they enable engineers to identify and address challenges efficiently, leading to innovative solutions and improved processes.");
        Project project18b = createProject("Problem-Solving Project", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false, pa18b_project);
        addProjectToProblemAnswer(pa18b_project, project18b);
        System.out.println("Project for 'Problem-Solving' unit created with associated problem answer.");

        ProblemAnswer pa18c_project = createProblemAnswer("How does the engineering design process facilitate problem-solving?", "The engineering design process provides a systematic approach to problem-solving, guiding engineers through stages such as defining requirements, brainstorming, prototyping, testing, and iteration to develop effective solutions.");
        Project project18c = createProject("Design Process Project", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false, pa18c_project);
        addProjectToProblemAnswer(pa18c_project, project18c);
        System.out.println("Project for 'Design Process' unit created with associated problem answer.");

        ProblemAnswer pa19a_project = createProblemAnswer("What are the fundamental principles of circuit analysis?", "Circuit analysis involves principles such as Ohm's law, Kirchhoff's laws, and various techniques for analyzing DC and AC circuits, essential for understanding voltage, current, and resistance in electrical systems.");
        Project project19a = createProject("Circuit Analysis Project", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false, pa19a_project);
        addProjectToProblemAnswer(pa19a_project, project19a);
        System.out.println("Project for 'Circuit Analysis' unit created with associated problem answer.");

        ProblemAnswer pa19b_project = createProblemAnswer("How does signal processing enhance communication systems?", "Signal processing involves the analysis and manipulation of signals using techniques like Fourier transforms and filtering, which are crucial for improving communication systems and digital signal processing (DSP).");
        Project project19b = createProject("Signal Processing Project", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false, pa19b_project);
        addProjectToProblemAnswer(pa19b_project, project19b);
        System.out.println("Project for 'Signal Processing' unit created with associated problem answer.");

        ProblemAnswer pa19c_project = createProblemAnswer("What is the importance of systems theory in electrical engineering?", "Systems theory helps in understanding and modeling the behavior of complex systems through concepts such as feedback and control systems, which are essential for analyzing and designing efficient electrical systems.");
        Project project19c = createProject("Systems Theory Project", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false, pa19c_project);
        addProjectToProblemAnswer(pa19c_project, project19c);
        System.out.println("Project for 'Systems Theory' unit created with associated problem answer.");

        ProblemAnswer pa20a_project = createProblemAnswer("What is the importance of analyzing force systems?", "Analyzing force systems is crucial for understanding the equilibrium and stability of structures, ensuring safety and reliability in engineering applications.");
        Project project20a = createProject("Statics Project", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false, pa20a_project);
        addProjectToProblemAnswer(pa20a_project, project20a);
        System.out.println("Project for 'Statics' unit created with associated problem answer.");

        ProblemAnswer pa20b_project = createProblemAnswer("How do Newton's laws of motion apply to dynamics?", "Newton's laws of motion provide the foundation for analyzing the motion of particles and rigid bodies, allowing engineers to predict and optimize their behavior.");
        Project project20b = createProject("Dynamics Project", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false, pa20b_project);
        addProjectToProblemAnswer(pa20b_project, project20b);
        System.out.println("Project for 'Dynamics' unit created with associated problem answer.");

        ProblemAnswer pa20c_project = createProblemAnswer("What is the significance of thermodynamics in engineering?", "Thermodynamics principles are essential for understanding energy transfer, heat, and the behavior of gases and liquids, which are crucial for solving engineering problems involving energy and work.");
        Project project20c = createProject("Thermodynamics Project", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false, pa20c_project);
        addProjectToProblemAnswer(pa20c_project, project20c);
        System.out.println("Project for 'Thermodynamics' unit created with associated problem answer.");

        ProblemAnswer pa20d_project = createProblemAnswer("Why is material selection important in engineering applications?", "Material selection determines the performance, durability, and cost-effectiveness of engineering designs, ensuring that materials meet specific requirements and application needs.");
        Project project20d = createProject("Material Science Project", faculty5, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false, pa20d_project);
        addProjectToProblemAnswer(pa20d_project, project20d);
        System.out.println("Project for 'Material Science' unit created with associated problem answer.");


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
// Creating StudentAnswer instances for student1
    }

    public static Project createProject(String name, Faculty teacher, Date dueDate, Syllabus syllabus, boolean completed, ProblemAnswer problemAnswer) {
        Project project = new Project();
        project.setName(name);
        project.setTeacher(teacher);
        project.setDueDate(dueDate);
        project.setSyllabus(syllabus);
        project.setCompleted(completed);
        project.setProblemAnswer(problemAnswer);
        problemAnswer.setProject(project);
        return project;
    }

    public static void addStudentToProject(Project project, Student student) {
        project.getStudents().add(student);
    }
}
