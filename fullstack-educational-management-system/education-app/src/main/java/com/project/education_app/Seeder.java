package com.project.education_app;

import com.project.education_app.entities.*;
import com.project.education_app.repos.*;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
@Data
public class Seeder implements CommandLineRunner {

    private final AnnouncementRepo announcementRepo;
    private final FacultyRepo facultyRepo;
    private final StudentRepo studentRepo;
    private final GuardianRepo guardianRepo;
    private final AttendanceRepo attendanceRepo;
    private final ResourceRepo resourceRepo;
    private final DiscussionRepo discussionRepo;
    private final PostRepo postRepo;
    private final CommentRepo commentRepo;
    private final ScheduleRepo scheduleRepo;


    @Override
    public void run(String... args) throws Exception {


        Faculty faculty1 = createFaculty("nicholas", "jones", "Nicholas", "Jones", "jones@email.com", "(111) 111-1111", 31, "male", "100 street", false, true, 50000);
        Faculty faculty2 = createFaculty("jacob", "taylor", "Jacob", "Taylor", "taylor@email.com", "(222) 222-2222", 23, "male", "200 street", true, true, 90000);
        Faculty faculty3 = createFaculty("jayden", "willis", "Jayden", "Willis", "willis@email.com", "(333) 333-3333", 21, "female", "300 street", true, true, 90000);
        Faculty faculty4 = createFaculty("sue", "todd", "Sue", "Todd", "todd@email.com", "(444) 444-4444", 35, "female", "400 street", false, true, 40000);
        Faculty faculty5 = createFaculty("sarah", "sky", "Sarah", "Sky", "sky@email.com", "(555) 555-5555", 21, "female", "500 street", false, false, 30000);

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


        facultyRepo.saveAllAndFlush(Arrays.asList(faculty1,faculty2,faculty3,faculty4,faculty5));
        studentRepo.saveAllAndFlush(Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10));
        guardianRepo.saveAllAndFlush(Arrays.asList(guardian1,guardian2,guardian3,guardian4,guardian5,guardian6,guardian7,guardian8,guardian9,
        guardian10,guardian11,guardian12,guardian13,guardian14,guardian15,guardian16,guardian17,guardian18,guardian19,guardian20));

        Announcement announcement1 = createAnnouncement("School Year Kickoff", "Welcome to the new school year! Let's make it a great one.", faculty1);
        Announcement announcement2 = createAnnouncement("Parent-Teacher Conferences", "Parent-Teacher conferences will be held next week. Please sign up for a time slot.", faculty2);
        Announcement announcement3 = createAnnouncement("Holiday Break", "The school will be closed for the holiday break from December 20th to January 4th.", faculty3);
        Announcement announcement4 = createAnnouncement("Science Fair", "The annual Science Fair will be held on March 15th. Start preparing your projects!", faculty4);
        Announcement announcement5 = createAnnouncement("Field Trip", "Our next field trip is scheduled for April 10th. Please return your permission slips by April 5th.", faculty5);
        Announcement announcement6 = createAnnouncement("Sports Day", "Sports Day is coming up on May 20th. Get ready for some fun and games!", faculty5);
        Announcement announcement7 = createAnnouncement("Graduation Ceremony", "Graduation Ceremony for seniors will be held on June 25th. Congratulations to all graduates!", faculty2);
        Announcement announcement8 = createAnnouncement("Summer Camp", "Sign up for our summer camp programs starting July 1st. Lots of activities and fun await!", faculty1);


        // Computer Science Courses
// Course 1: Introduction to Programming
        Syllabus syllabus1 = createSyllabus("Introduce students to programming fundamentals using Python.", "Variables, Data Types, Control Structures, Functions, Modules, and Libraries.", "Assignments (40%), Projects (30%), Tests (30%)");

            Unit unit1a =  createUnit("Variables", "In this unit, students will be introduced to the concept of variables and their importance in programming. They will learn how to create and use variables to store and manipulate data. By the end of this unit, students will be able to declare variables and assign values to them, understand the concept of variable naming conventions, and demonstrate the use of variables in simple Python programs.");
            Unit unit1b=   createUnit("Data Types", "This unit will cover the different data types available in Python, such as integers, floats, strings, and booleans. Students will learn how to identify and use these data types effectively. By the end of this unit, students will be able to perform operations on different data types, convert between data types, and apply data types appropriately in their programs.");
            Unit unit1c=    createUnit("Control Structures", "In this unit, students will explore control structures, including loops (for and while) and conditional statements (if, elif, else). They will learn how to control the flow of their programs and make decisions based on conditions. By the end of this unit, students will be able to write programs that use loops to repeat actions and conditionals to execute code based on specific criteria.");
            Unit unit1d=   createUnit("Functions", "This unit will focus on the creation and use of functions in Python. Students will learn how to define functions, pass parameters, and return values. By the end of this unit, students will be able to write reusable functions, understand the importance of functions in organizing code, and apply functions to solve problems effectively.");
            Unit unit1e=    createUnit("Modules", "In this unit, students will be introduced to the concept of modules and how to import and use them in their Python programs. They will learn how to break down large programs into smaller, manageable pieces using modules. By the end of this unit, students will be able to create and import their own modules, use built-in Python modules, and understand the benefits of modular programming.");
            Unit unit1f=    createUnit("Libraries", "This unit will cover the use of libraries in Python programming. Students will learn how to find, install, and use libraries to extend the functionality of their programs. By the end of this unit, students will be familiar with popular Python libraries, understand how to read library documentation, and integrate libraries into their own projects to simplify complex tasks.");
                List<Unit> units1=Arrays.asList(unit1a,unit1b,unit1c,unit1d,unit1e,unit1f);
        Course course1 = createCourse("Introduction to Programming", "Learn the basics of programming using Python.", "Computer Science", 4, syllabus1, units1);
        Resource resource1a= createResource("Course 1 textbook resource","https://ocw.mit.edu/collections/introductory-programming/",syllabus1,course1);
        Resource resource1b=createResource("Course 1 video resource","https://m.youtube.com/watch?v=rfscVS0vtbw",syllabus1,course1);
            Lesson lesson1a=createLesson("Variables","Variables are fundamental in programming as they store data values.In Python, you can declare a variable simply by assigning it a value using the = symbol. For example, age=25. Variables can store different data types and remember to use meaningful names when naming them to make it more readable and maintainable.",faculty1,unit1a);
            Lesson lesson1b=createLesson("Data Types","Python supports various data types such as integers(int),strings (str),floating point numbers(float), and booleans(bool). Understanding and using the appropriate data type is essential for performing accurate operations in your programs. You can also convert between data types using functions like int(),float(), str(), and bool().",faculty1,unit1b);
            Lesson lesson1c=createLesson("Control Structures","Control structures in Python allow you to control the flow of your program. Conditional statements(if,elif,else) help make decisions based on conditions. Loops(for and while) enable you to repeat actions multiple times.",faculty1,unit1c);
            Lesson lesson1d=createLesson("Functions","Functions are blocks of reusable code that perform a specific task. You can define a function using the def keyword followed by the function name and parentheses. Functions can take parameters(input) and return values(output). For example, def greet(name): return 'Hello' +name. Functions help organize code, making it more modular and easier to understand and avoid redundancy.",faculty1,unit1d);
            Lesson lesson1e=createLesson("Modules","Modules are Python files that contain functions,classes and variables. You can import modules into your program to access their functionality. This helps break down large programs into smaller, manageable pieces. Built-in modules like math,random, and datetime offer a wide range of functionalities. You can also create custom modules by writing Python code in a file and importing it using the import statement",faculty1,unit1e);
            Lesson lesson1f=createLesson("Libraries","Libraries in Python are collections of modules that provide additional functionality. Popular libraries like numpy(for numbers),pandas(for data manipulation), and matplotlib(for plotting) extend Pythons capabilities. You can also install libraries using the pip command(pip install library_name).Understanding how to find,install, and use libraries allows you to leverage existing solutions and simplify complex taskes in your programs.",faculty1,unit1f);
                unit1a.setLessons(List.of(lesson1a));
                unit1b.setLessons(List.of(lesson1b));
                unit1c.setLessons(List.of(lesson1c));
                unit1d.setLessons(List.of(lesson1d));
                unit1e.setLessons(List.of(lesson1e));
                unit1f.setLessons(List.of(lesson1f));


            // Course 2: Data Structures
        Syllabus syllabus2 = createSyllabus("Understand and implement various data structures.", "Arrays, Linked Lists, Stacks, Queues, Trees, Graphs.", "Assignments (50%), Projects (20%), Tests (30%)");

          Unit unit2a=      createUnit("Arrays", "In this unit, students will learn about arrays, a fundamental data structure...");
          Unit unit2b=      createUnit("Linked Lists", "This unit covers linked lists, a data structure consisting of nodes...");
          Unit unit2c=      createUnit("Stacks", "In this unit, students will explore stacks, a last-in, first-out (LIFO) data structure...");
          Unit unit2d=      createUnit("Queues", "This unit focuses on queues, a first-in, first-out (FIFO) data structure...");
          Unit unit2e=      createUnit("Trees", "In this unit, students will study trees, a hierarchical data structure...");
          Unit unit2f=      createUnit("Graphs", "This unit covers graphs, a versatile data structure used to represent relationships...");
        List<Unit> units2=Arrays.asList(unit2a,unit2b,unit2c,unit2d,unit2e,unit2f);
        Course course2 = createCourse("Data Structures", "An in-depth study of data structures such as arrays, linked lists, stacks, queues, and trees.", "Computer Science", 3, syllabus2, units2);
        Resource resource2a=createResource("Course 2 textbook resource","https://people.cs.vt.edu/shaffer/Book/",syllabus2,course2);
        Resource resource2b=createResource("Course 2 video resource","https://m.youtube.com/watch?v=RBSGKIAvoiM",syllabus2,course2);
          Lesson lesson2a=createLesson("Arrays","Arrays are fundamental data structures that store a collection of elements, all of the same type, in contiguous memory locations. This structure allows for efficient indexing, meaning you can quickly access any element using its index. For example, array=[1,2,3] creates an array of integers. Array are useful for tasks that reuqire constant-time access and traversal of elements,such as searching or sorting.",faculty2,unit2a);
          Lesson lesson2b=createLesson("Linked Lists","A linked list is a data structure consisting of nodes, where each node containes a data part and a reference(or link) to the next node in the sequence. Unlike arrays, linked lists don't require contiguous memory locations. This structure allows for efficient insertion and deletion operations.",faculty2,unit2b);
          Lesson lesson2c=createLesson("Stacks","Stacks are a last-in,first-out(LIFO) data structure, meaning the last element added is the first to be removed. Common operations include push(add) or pop(remove).Stacks are also useful for algorithms that require backtracking,such as depth-first search.",faculty2,unit2c);
          Lesson lesson2d=createLesson("Queues","Queues are a first-in, first-out(FIFO) data structure, meaning the first element added is the first to be removed. Common operations include enqueue(add) and dequeue(remove).Queues are essential for algorithms that process elements in the order they arrive, such as breadth-first search.",faculty2,unit2d);
          Lesson lesson2e=createLesson("Trees","Trees are hierarchical data structures consisting of nodes, where each node has a value and references to child nodes. The top node is called the root and the nodes with no children are called leaves.Trees are used to represent hierarchical relationships such as file systems or orgranizational structures.A common type of tree is the binary tree, where each node has at most 2 children.Trees are useful for tasks that involve hierarchical data, such as searching and sorting",faculty2,unit2e);
          Lesson lesson2f=createLesson("Graphs","Graphs are versatile data structures used to represent relationships between objects. A graph consists of vertices(nodes) and edges(links) that connect the vertices.Graphs can be directed or undirected, and they can represent various real-world structures, such as social networks,transportation systems, or the internet. Common graph algorithms include depth-first search, breadth-first search, and Dijkstra's algorithm for finding the shortest path between nodes.",faculty2,unit2f);
                unit2a.setLessons(List.of(lesson2a));
                unit2b.setLessons(List.of(lesson2b));
                unit2c.setLessons(List.of(lesson2c));
                unit2d.setLessons(List.of(lesson2d));
                unit2e.setLessons(List.of(lesson2e));
                unit2f.setLessons(List.of(lesson2f));

// Course 3: Algorithms
        Syllabus syllabus3 = createSyllabus("Explore the design and analysis of algorithms.", "Sorting, Searching, Graph Algorithms, Dynamic Programming.", "Assignments (40%), Projects (30%), Tests (30%)");

           Unit unit3a=     createUnit("Sorting", "In this unit, students will learn about various sorting algorithms, including bubble sort, merge sort, and quicksort. They will understand the principles behind each sorting method, analyze their efficiency, and implement these algorithms in Python.");
           Unit unit3b=     createUnit("Searching", "This unit covers different searching algorithms such as linear search and binary search. Students will learn how to implement these algorithms, analyze their time complexity, and apply them to solve real-world problems.");
           Unit unit3c=     createUnit("Graph Algorithms", "In this unit, students will explore algorithms used to traverse and manipulate graphs, including depth-first search (DFS) and breadth-first search (BFS). They will learn how to implement these algorithms and understand their applications in network analysis and other fields.");
           Unit unit3d=     createUnit("Dynamic Programming", "This unit focuses on dynamic programming, a method for solving complex problems by breaking them down into simpler subproblems. Students will learn the fundamentals of dynamic programming, implement classic algorithms such as the Fibonacci sequence and knapsack problem, and understand how to optimize their solutions.");
        List<Unit> units3=Arrays.asList(unit3a,unit3b,unit3c,unit3d);
        Course course3 = createCourse("Algorithms", "Explore the design and analysis of algorithms, including sorting and searching algorithms.", "Computer Science", 3, syllabus3, units3);
        Resource resource3a=createResource("Course 3 textbook resource","httpsL//jeffe.cs.illinois.edu/teaching/algorithms/",syllabus3,course3);
        Resource resource3b=createResource("Course 3 video resource","https://m.youtube.com/watch?v=rL8X2mlNHPM",syllabus3,course3);
            Lesson lesson3a=createLesson("Sorting","Sorting algorithms arrange elements in a specific order(ascending or descending).There is bubble sort which repeatedly swaps adjacent elements if they're in the wrong order.Not efficient for large lists but is simple.Merge sort divides the lists in half,sorts them and then merges back together.More efficient and works with large data sets. Quick sort selects a 'pivot' element and partitions the other elements into 2 subarrays(less than or greater than). Complex to implement.",faculty3,unit3a);
            Lesson lesson3b=createLesson("Searching","Searching algorithms find a specific element. Linear search checks each element one by one.Its simple but not great for big datasets.Binary search findes the target by repeatedly dividing the search interval in half.It requires the list to be sorted first.",faculty3,unit3b);
            Lesson lesson3c=createLesson("Graph Algorithms","Graph algorithms manipulate and traverse graphs.Depth-First Search(DFS) explores as far along each branch as possible before backtracking.Useful for tasks like solving mazes or finding connected components.Breadth-First Search(BFS) explores all neighbors ath the present depth before moving on to nodes at the next depth level. Useful for finding the shortest path.",faculty3,unit3c);
            Lesson lesson3d=createLesson("Dynamic Programming","Dynamic programming solves complex problems by breaking them down into smaller subproblems and solving each subproblem only once.Examples include the fibonacci sequence and the knapsack problem.",faculty3,unit3d);
                unit3a.setLessons(List.of(lesson3a));
                unit3b.setLessons(List.of(lesson3b));
                unit3c.setLessons(List.of(lesson3c));
                unit3d.setLessons(List.of(lesson3d));



// Course 4: Database Management Systems
        Syllabus syllabus4 = createSyllabus("Introduction to database concepts, SQL, and database design.", "Relational Databases, SQL, Transactions, Database Design.", "Assignments (40%), Projects (30%), Tests (30%)");

            Unit unit4a=    createUnit("Relational Databases", "In this unit, students will learn about the foundational concepts of relational databases, including tables, keys, and relationships. Students will understand how relational databases organize data and how to design efficient database schemas.");
            Unit unit4b=    createUnit("SQL", "This unit covers the basics of Structured Query Language (SQL), the standard language for querying and manipulating databases. Students will learn how to write SQL queries to create, read, update, and delete data, as well as perform complex data operations.");
            Unit unit4c=    createUnit("Transactions", "In this unit, students will explore the concept of transactions, which ensure data integrity and consistency in databases. They will learn about ACID properties (Atomicity, Consistency, Isolation, Durability) and how to implement transactions in SQL.");
            Unit unit4d=    createUnit("Database Design", "This unit focuses on the principles and best practices of database design. Students will learn how to create normalized database schemas, design efficient database structures, and apply data modeling techniques to meet specific application requirements.");
                List<Unit> units4=Arrays.asList(unit4a,unit4b,unit4c,unit4d);
        Course course4 = createCourse("Database Management Systems", "Introduction to database concepts, SQL, and database design.", "Computer Science", 3, syllabus4, units4);
        Resource resource4a=createResource("Course 4 textbook resource","https://open.umn.edu/opentextbooks/textbooks/database-design-2nd-edition",syllabus4,course4);
        Resource resource4b=createResource("Course 4 video resource","https://www.khanacademy.org/computing/computer-programming/sql",syllabus4,course4);
            Lesson lesson4a=createLesson("Relational Databases","Relational databases organize data into tables where each table consists of rows and columns. Each row or record ina atable represents a single data item, and each column or field represents a specific attribute of that data item. Keys(primary and foreign) are used to uniquely identify records and establish relationships between tables.",faculty4,unit4a);
            Lesson lesson4b=createLesson("SQL","SQL(Structure Query Language) is the standard language for managing and manipulating databases. With SQL, you can perform various operations such as creating tables, inserting data,querying data, updating records and deleting data.Commands like SELECT,INSERT,UPDATE, and DELETE. You can also join tables,using aggregate functions, and writing complex queries to perform data analysis and manipulation.",faculty4,unit4b);
            Lesson lesson4c=createLesson("Transactions","Transactions are sequences of database operations that are treated as a single unit. They ensure data integrity and consistency through ACID properties: Atomicity(all operations are complete or none are),Consistency(data remains in valid state),Isolation(transactions do not interfere with each other) and Durability(changes are permanent once committed).Commands like BEGIN,COMMIT, and ROLLBACK are used.",faculty4,unit4c);
            Lesson lesson4d=createLesson("Database Design","Effective database design involves creating normalized schemas to minimize redundancy and ensure data integrity. Normalization techniques incolde organizing data into tables and defining relationships to eliminate anomalies.Key steps are indentifying entities defining primary and foreign keys, and applying normalization rules.",faculty4,unit4d);
                unit4a.setLessons(List.of(lesson4a));
                unit4b.setLessons(List.of(lesson4b));
                unit4c.setLessons(List.of(lesson4c));
                unit4d.setLessons(List.of(lesson4d));


// Course 5: Operating Systems
        Syllabus syllabus5 = createSyllabus("Study the fundamental concepts of operating systems.", "Processes, Memory Management, File Systems, Scheduling.", "Assignments (40%), Projects (30%), Tests (30%)");

             Unit unit5a=   createUnit("Processes", "In this unit, students will learn about processes and process management in operating systems. They will understand how the OS handles process creation, scheduling, and termination, and explore inter-process communication and synchronization.");
             Unit unit5b=   createUnit("Memory Management", "This unit covers memory management techniques used by operating systems to allocate and manage memory resources. Students will learn about paging, segmentation, virtual memory, and memory allocation algorithms.");
             Unit unit5c=   createUnit("File Systems", "In this unit, students will explore file systems and how they are managed by the OS. They will learn about file organization, storage allocation, directory structures, and file access methods.");
             Unit unit5d=   createUnit("Scheduling", "This unit focuses on CPU scheduling algorithms and their role in managing process execution. Students will learn about different scheduling techniques, such as round-robin, priority scheduling, and multi-level queues, and analyze their performance and efficiency.");
                 List<Unit> units5=Arrays.asList(unit5a,unit5b,unit5c,unit5d);
        Course course5 = createCourse("Operating Systems", "Study the fundamental concepts of operating systems, including processes, memory management, and file systems.", "Computer Science", 3, syllabus5, units5);
        Resource resource5a=createResource("Course 5 textbook resource","https://pages.cs.wisc.edu/~remzi/OSTEP/",syllabus5,course5);
        Resource resource5b=createResource("Course 5 video resource","https://m.youtube.com/watch?v=mXw9ruZaxzQ",syllabus5,course5);
            Lesson lesson5a=createLesson("Processes","Processes are the active entities that represenet the execution of a program. The OS handles process management by creating,scheduling, and terminating processes.It also manages inter-process communication(IPC) and synchronization to ensure process can interact and share resources effectively.",faculty5,unit5a);
            Lesson lesson5b=createLesson("Memory Management","Memory management is the function of the OS that handles the allocation and deallocation of memory space. Techniques invlude paging, which divides memory into variable sized segments.VM allows the OS to use disk space as an extension of RAM enabling the execution of larger programs.",faculty5,unit5b);
            Lesson lesson5c=createLesson("File Systems","File systems manage how data is stored and retrieved on a disk. They organize files into directories and use different allocation methods (contiguous,linked,indexed) to manage storage space.File systems ensure data integrity,support file access methods, and maintain directory structures.",faculty5,unit5c);
            Lesson lesson5d=createLesson("Scheduling","Scheduling algorithms determine the order in which processes are executed by the CPU.Common algorithms include round-robin which assigns time slices to each process;priority scheduling,which executes processes by priority, and multi-level queues, which seperate processes based on characteristics.",faculty5,unit5d);
                unit5a.setLessons(List.of(lesson5a));
                unit5b.setLessons(List.of(lesson5b));
                unit5c.setLessons(List.of(lesson5c));
                unit5d.setLessons(List.of(lesson5d));
// Course 6: Computer Networks
        Syllabus syllabus6 = createSyllabus("Learn about the principles of computer networking.", "OSI Model, TCP/IP, Network Protocols, Routing, Switching.", "Assignments (40%), Projects (30%), Tests (30%)");

           Unit unit6a=     createUnit("OSI Model", "In this unit, students will learn about the OSI (Open Systems Interconnection) model, which standardizes the functions of a telecommunication or computing system irrespective of its underlying structure and technology. They will understand the seven layers of the OSI model and how data is transmitted across each layer.");
           Unit unit6b=     createUnit("TCP/IP", "This unit covers the TCP/IP (Transmission Control Protocol/Internet Protocol) model, the foundational protocol suite for the internet. Students will learn about its four layers, key protocols, and how TCP/IP enables reliable communication between networked devices.");
           Unit unit6c=     createUnit("Network Protocols", "In this unit, students will explore various network protocols that govern data exchange over networks. They will understand the roles of protocols such as HTTP, FTP, DNS, and DHCP, and how these protocols ensure secure and efficient communication.");
           Unit unit6d=     createUnit("Routing", "This unit focuses on routing, the process of selecting paths in a network along which to send data packets. Students will learn about different routing algorithms, protocols (e.g., OSPF, BGP), and the concepts of static and dynamic routing.");
           Unit unit6e=     createUnit("Switching", "In this unit, students will learn about switching, a technique used to forward data packets from one device to another within a network. They will explore different types of switches, switching methods (e.g., packet switching, circuit switching), and the role of switches in network design.");
                 List<Unit> units6=Arrays.asList(unit6a,unit6b,unit6c,unit6d,unit6e);
        Course course6 = createCourse("Computer Networks", "Learn about the principles of computer networking, including the OSI model, TCP/IP, and network protocols.", "Computer Science", 3, syllabus6, units6);
        Resource resource6a=createResource("Course 6 textbook resource","https://github.com/obonadventure/cnp3",syllabus6,course6);
        Resource resource6b=createResource("Course 6 video resource","https://www.networkacademy.io",syllabus6,course6);
            Lesson lesson6a=createLesson("OSI Model","The OSI(Open Systems Interconnection) model standardized networking functions into seven layers: Physical,Data Link,Network,Transport,Session,Presentation, and Application. Each layers serves a specific role in data transmission.",faculty1,unit6a);
            Lesson lesson6b=createLesson("TCP/IP","The TCP/IP(Transmission Control Protocol/Internet Protocol) model is the foundational protocol suite for the internet,consisting of four layers:Link,Internet,Transport and Application. Key protocols include TCP,which ensure reliable communication, and IP, which handles addressing and routing.TCP/IP enables devices to communicate effectively acoress diverse netowrks,ensuring relaible data exchange and connectivity",faculty1,unit6b);
            Lesson lesson6c=createLesson("Network Protocols","Network protocols govern data exchange over networks, ensuring secure and efficient communication.HTTP(HyperText Transfer Protocol) used for transferring wbe pages.FTP(File Transfer Protocol) user for transferring files.DNS(Domain Name System) Translates domain names into IP addresses.DHCP(Dynamic Host Configuration Protocol)Assigns IP addresses to devices on a network.",faculty1,unit6c);
            Lesson lesson6d=createLesson("Routing","Routing is the process of selecting paths in a network along which to send data packets.Key routing algorithms include OSPF(Open Shortest Path First)A dynamic routing protocol that uses link-state info to build a map of the network and determine the shortest path.BGP(Border Gateway Protocol) Manages how packets are routed across the internet through multiple autonomous systems",faculty1,unit6d);
            Lesson lesson6e=createLesson("Switching","Switching is the technique used to forward data packets from one deviceto another within a network.Key switching methods include Packet Switching:Data is divided into packets and transmitted independently.Circuit Switching:A dedicated communication path is established between devices for the duration of the transmission.",faculty1,unit6e);
                 unit6a.setLessons(List.of(lesson6a));
                 unit6b.setLessons(List.of(lesson6b));
                 unit6c.setLessons(List.of(lesson6c));
                 unit6d.setLessons(List.of(lesson6d));
                 unit6e.setLessons(List.of(lesson6e));


// Course 7: Software Engineering
        Syllabus syllabus7 = createSyllabus("Introduction to software development methodologies.", "Software Development Life Cycle, Agile, Waterfall, Project Management.", "Assignments (40%), Projects (30%), Tests (30%)");

              Unit unit7a=  createUnit("Software Development Life Cycle", "In this unit, students will learn about the Software Development Life Cycle (SDLC), a process for planning, creating, testing, and deploying an information system. They will explore different SDLC models, including iterative, incremental, and spiral models.");
              Unit unit7b=  createUnit("Agile", "This unit covers the Agile methodology, an iterative approach to software development that emphasizes flexibility and customer feedback. Students will learn about Agile principles, practices (e.g., Scrum, Kanban), and how to apply Agile techniques in software projects.");
              Unit unit7c=  createUnit("Waterfall", "In this unit, students will explore the Waterfall model, a linear and sequential approach to software development. They will understand the phases of the Waterfall model, including requirements analysis, system design, implementation, testing, deployment, and maintenance.");
              Unit unit7d=  createUnit("Project Management", "This unit focuses on project management techniques and tools used in software development. Students will learn about project planning, scheduling, resource management, risk management, and quality assurance, and how to manage a software project from inception to completion.");
                List<Unit> units7=Arrays.asList(unit7a,unit7b,unit7c,unit7d);
        Course course7 = createCourse("Software Engineering", "Introduction to software development methodologies, project management, and software life cycle.", "Computer Science", 4, syllabus7, units7);
        Resource resource7a=createResource("Course 7 textbook resource","https://www.infobooks.org/pdfview/14012-introduction-to-software-engineering-pvpsit/",syllabus7,course7);
        Resource resource7b=createResource("Course 7 video resource","https://m.youtube.com/watch?v=zOjov-2OZ0E",syllabus7,course7);
              Lesson lesson7a=createLesson("Software Development Life Cycle","The Software Development Life Cycle(SDLC) is a prcoess used for planning, creating, testing and deploying an information system. It consists of several models,including:Iterative Model:Develops the system through repeated cycles(iterations and progressively enhances the system.Incremental Model:Divides the system into smaller segments,each of which is developed and delivered incrementally.Spiral Model:Combines iterative developement with systematics aspects fo the waterfall model,focusing on risk analysis and iterative refinement.",faculty2,unit7a);
              Lesson lesson7b=createLesson("Agile","Agile is an iterative approach to software development that emphasizes flexibility,customer feedback, and small rapide releases.Scrum: Uses sprints,time-boxed iterations typically lasting 1-4 weeks.Kanban:Visualizes work using a kanban board and focuses on continuous delivery by limiting work in progress.It allows teams to respond to change quickly.",faculty2,unit7b);
              Lesson lesson7c=createLesson("Waterfall","The Waterfall model is a linear and sequential approach to software development.It consists of distinct phases:Requirements Analysis,System Design,Implementation,Testing,Deployment and Maintenance.It is straightforward but less flexible than iterative models.",faculty2,unit7c);
              Lesson lesson7d=createLesson("Project Management","Project management involves Project Planning:define scope,goals and deliverables.Scheduling:Create a timeline for project tasks and milestones.Resource Management: Allocate and manage resources efficiently.Risk Management:Identify,assess, and mitigate risks.Quality Assurance:Ensures the projct means quality standards.They are on time, on budget.",faculty2,unit7d);
                 unit7a.setLessons(List.of(lesson7a));
                 unit7b.setLessons(List.of(lesson7b));
                 unit7c.setLessons(List.of(lesson7c));
                 unit7d.setLessons(List.of(lesson7d));



// Course 8: Web Development
        Syllabus syllabus8 = createSyllabus("Learn to create dynamic websites.", "HTML, CSS, JavaScript, React, Backend Integration.", "Assignments (40%), Projects (30%), Tests (30%)");

            Unit unit8a=    createUnit("HTML", "In this unit, students will learn the basics of HTML (HyperText Markup Language), the standard language for creating web pages. They will understand how to structure content using HTML tags and attributes, and build simple web pages.");
            Unit unit8b=    createUnit("CSS", "This unit covers CSS (Cascading Style Sheets), a language used to style HTML documents. Students will learn how to apply styles to web pages, including layout, colors, fonts, and responsiveness, to enhance the visual presentation of their web pages.");
            Unit unit8c=    createUnit("JavaScript", "In this unit, students will explore JavaScript, a programming language that allows them to create interactive and dynamic web content. They will learn how to write JavaScript code to manipulate the DOM (Document Object Model), handle events, and perform animations.");
            Unit unit8d=    createUnit("React", "This unit focuses on React, a popular JavaScript library for building user interfaces. Students will learn the core concepts of React, including components, state, and props, and how to create single-page applications with React.");
            Unit unit8e=    createUnit("Backend Integration", "In this unit, students will learn how to integrate front-end web applications with backend services. They will explore RESTful APIs, data fetching, and server-side rendering, and understand how to build full-stack web applications.");
                    List<Unit> units8=Arrays.asList(unit8a,unit8b,unit8c,unit8d,unit8e);
        Course course8 = createCourse("Web Development", "Learn to create dynamic websites using HTML, CSS, JavaScript, and frameworks such as React.", "Computer Science", 3, syllabus8, units8);
        Resource resource8a=createResource("Course 8 textbook resource","httpsL//eloquentjavascript.net",syllabus8,course8);
        Resource resource8b=createResource("Course 8 video resource","https://m.youtube.com/watch?v=nu_pCVPKzTk&pp=ygUbd2VilGRldmdmVs-b3BtZW50IGZ1bGwgY2n1cnNI",syllabus8,course8);
            Lesson lesson8a=createLesson("HTML","HTML(HyperText Markup Language) is the foundation of web development.It structures content on the web using tags and attributes.HTML provides the skeleton of a web page, allowing you to build simple and organized web content.",faculty3,unit8a);
            Lesson lesson8b=createLesson("CSS","CSS(Cascading Style Sheets) is used to style HTML documents. It controls the layout,colors,fonts, and overall presentation of web pages.CSS makes web pages visually appealing and responsive, enhancing the user experience across different devices.",faculty3,unit8b);
            Lesson lesson8c=createLesson("JavaScript","JavaScript is a programming language that adds interactivity and dynamic behavior to web pages. It allows you to mainpulate the DOM(Document Object Model), handle events, and create animations.JavaScript transforms static HTML and CSS into engaging, interactive user experiences, making it an essential tool for modern web development.",faculty3,unit8c);
            Lesson lesson8d=createLesson("React","React is a popular JavaScript library for building user interfaces, especially single-page applications(SPAs). It uses components, which are reusable pieces of UI, and manages state and props to keep the UI in sync with the application data.React simplifies the development of complex user interfaces by breaking them down into manageable pieces,promoting code reusability and maintainability.",faculty3,unit8d);
            Lesson lesson8e=createLesson("Backend Integration","Backend integration involves connecting your front-end web applications with backend services. This often involves RESTful APIs to fetch and send data. ",faculty3,unit8e);
                 unit8a.setLessons(List.of(lesson8a));
                 unit8b.setLessons(List.of(lesson8b));
                 unit8c.setLessons(List.of(lesson8c));
                 unit8d.setLessons(List.of(lesson8d));
                 unit8e.setLessons(List.of(lesson8e));
// Course 9: Artificial Intelligence
        Syllabus syllabus9 = createSyllabus(
                "Explore the basics of artificial intelligence.",
                "Machine Learning, Neural Networks, Natural Language Processing.",
                "Assignments (40%), Projects (30%), Tests (30%)"
        );

           Unit unit9a=     createUnit("Machine Learning", "In this unit, students will learn about machine learning, a subset of AI that focuses on developing algorithms that enable computers to learn from and make predictions based on data. They will explore various machine learning techniques and tools.");
           Unit unit9b=     createUnit("Neural Networks", "This unit covers neural networks, a set of algorithms modeled after the human brain. Students will understand the basics of neural network architecture, backpropagation, and how to build and train neural networks for different tasks.");
           Unit unit9c=     createUnit("Natural Language Processing", "In this unit, students will explore natural language processing (NLP), a field of AI that enables computers to understand and generate human language. They will learn about text processing, sentiment analysis, and how to build NLP models using machine learning techniques.");
                    List<Unit> units9=Arrays.asList(unit9a,unit9b,unit9c);
        Course course9 = createCourse("Artificial Intelligence", "Explore the basics of artificial intelligence, including machine learning, neural networks, and natural language processing.", "Computer Science", 4, syllabus9, units9);
        Resource resource9a=createResource("Course 9 textbook resource","http://neuralnetworksanddeeplearning.com",syllabus9,course9);
        Resource resource9b=createResource("Course 9 video resource","https://m.youtube.com/playlist?list=PLkDaE6sCZn6Ec-XTbcX1uRg2_u4xOEky0",syllabus9,course9);
            Lesson lesson9a=createLesson("Machine Learning","Machine Learning is the subset of AI that involves developing algorithms that enable computers to learn from and make predictions based on data.Key techniques include supervised learning, where models are trained on labeled data; unsupervised learning, which finds patterns in unlabeled data; and reinforcement learning, which learns optimal actions through trial and error.",faculty4,unit9a);
            Lesson lesson9b=createLesson("Neural Networks","Neural networks are a set of algorithms inspired by the human brain.They consist of interconnected layers of nodes(neurons) that process data in a hierarchical manner. The basic structures includes a input layer, hidden layers, and an output layer.Backpropagation is a key algorithm used to train nerual networks by adjusting weights based on error rates. Building and training neural networks allows for tasks such as image recognition, speech processing, and predictive modeling",faculty4,unit9b);
            Lesson lesson9c=createLesson("Natural Language Processing","Natural language processing(NLP) is a field of AI that focuses on enabling computers to understand, interpret, and generate human language. Key techniques include text processing(tokenization,stemming, and lemmatization),sentiment analysis, and building language models using machine learning. NLP is crucial for applications like chatbots, language translation, and sentiment analysis, enhancing human-computer interaction and understanding of textual data",faculty4,unit9c);
                 unit9a.setLessons(List.of(lesson9a));
                 unit9b.setLessons(List.of(lesson9b));
                 unit9c.setLessons(List.of(lesson9c));

// Create the Syllabus and Units for Course 10
        Syllabus syllabus10 = createSyllabus("Introduction to the principles of cybersecurity.", "Threat Analysis, Encryption, Network Security, Secure Coding.", "Assignments (40%), Projects (30%), Tests (30%)");

         Unit unit10a=       createUnit("Threat Analysis", "In this unit, students will learn about threat analysis, identifying potential security threats and vulnerabilities. They will understand how to assess risks and implement strategies to mitigate these threats.");
         Unit unit10b=       createUnit("Encryption", "This unit covers encryption, the process of converting information into a secure format. Students will learn about different encryption techniques, algorithms, and the importance of encryption in protecting sensitive data.");
         Unit unit10c=       createUnit("Network Security", "In this unit, students will explore network security, including measures to protect data during transmission across networks. They will understand firewalls, intrusion detection systems, and other tools used to safeguard networks.");
         Unit unit10d=       createUnit("Secure Coding", "This unit focuses on secure coding practices to prevent vulnerabilities in software. Students will learn about common security flaws, how to write secure code, and best practices for maintaining software security.");
            List<Unit> units10=Arrays.asList(unit10a,unit10b,unit10c,unit10d);
// Create Course 10
        Course course10 = createCourse("Cybersecurity", "Introduction to the principles of cybersecurity, including threat analysis, encryption, and network security.", "Computer Science", 3, syllabus10, units10);
        Resource resource10a=createResource("Course 10 textbook resource","https://www.infobooks.org/pdfview/cyber-security-wei-lu-yuqing-zhang-weiping-wen-hanbing-yan-chao-li-380/",syllabus10,course10);
        Resource resource10b=createResource("Course 10 video resource","https://m.youtube.com/watch?v=hXSFdwIOfnE",syllabus10,course10);
            Lesson lesson10a=createLesson("Threat Analysis","Threat analysis involves identifying potential security threats and vulneranilities within a system. This process includes assessing the likelihood and impact of different threats, understanding attack vectors, and implementing strategies to mitigate these risks. Key aspects of threat analysis include vulnerability scanning, risk assessment, and penetration testing.",faculty5,unit10a);
            Lesson lesson10b=createLesson("Encryption","Encryption is the process of converting information into a secure format that can only be read by authorized parties.This involves using algorithms to encode data so that it appears random and unreadable to unauthorized users. Common encryption techniques include symmetric- key encryption(AES) and asymmetric-key encryption(RSA)",faculty5,unit10b);
            Lesson lesson10c=createLesson("Network Security","Network security involves protecting data during transmission across networks by implementing various measures. These measures include firewalls, which control incoming and outgoing network traffic; intrusion detection systems(IDS), which monitor network traffic for suspicious activity; and encryption protocols, which secure data in transit.",faculty5,unit10c);
            Lesson lesson10d=createLesson("Secure Coding","Secure coding practices aim to prevent vulnerabilites in software by following best practices during development. This includes writing code that is resistant to common security flaws, such as SQL injection,cross-site scripting(XSS), and buffer overflows.Key principles of secure coding involve input validation, proper error handling, and regular code reviews.",faculty5,unit10d);
                 unit10a.setLessons(List.of(lesson10a));
                 unit10b.setLessons(List.of(lesson10b));
                 unit10c.setLessons(List.of(lesson10c));
                 unit10d.setLessons(List.of(lesson10d));
// Mathematics Courses

        // Course 11: Calculus I
        Syllabus syllabus11 = createSyllabus("Introduce students to differential and integral calculus.", "Limits, Derivatives, Integrals, Applications of Calculus.", "Assignments (40%), Projects (30%), Tests (30%)");

         Unit unit11a=       createUnit("Limits", "In this unit, students will learn about limits, the foundational concept of calculus. They will understand how to calculate limits and their importance in defining continuity and the behavior of functions.");
         Unit unit11b=       createUnit("Derivatives", "This unit covers derivatives, the measure of how a function changes as its input changes. Students will learn techniques of differentiation, applications of derivatives, and how to solve real-world problems using derivatives.");
         Unit unit11c=       createUnit("Integrals", "In this unit, students will explore integrals, the concept of accumulation of quantities. They will learn about techniques of integration, the Fundamental Theorem of Calculus, and applications of integrals in various fields.");
         Unit unit11d=       createUnit("Applications of Calculus", "This unit focuses on the practical applications of calculus in science, engineering, and economics. Students will understand how to apply calculus concepts to model and solve real-world problems.");
                List<Unit> units11=Arrays.asList(unit11a,unit11b,unit11c,unit11d);
        Course course11 = createCourse("Calculus I", "Introduction to differential and integral calculus.", "Mathematics", 4, syllabus11, units11);
        Resource resource11a=createResource("Course 11 textbook resource","https://openstax.org/books/calculus-volume-1/pages/1-introduction",syllabus11,course11);
        Resource resource11b=createResource("Course 11 video resource","https:m.youtube.com/playlist?list=PLF797E961509B4EB5",syllabus11,course11);
            Lesson lesson11a=createLesson("Limits","Limits are the foundation of calculus.They describe the behavior of a function as its input approaches a certain value. Understanding limits helps in defining continuity and the behavior of functions near specific points.",faculty1,unit11a);
            Lesson lesson11b=createLesson("Derivatives","Derivatives measure how a function changes as its input changes. The derivative of a function(f(x)) at a point x is the slope of the tangent line to the curve at that point.Techniques of differentiation include the power rule, product rule,quotient rule, and chain rule.Derivatives have many applications such as finding rate of change,optimizing functions, and solving problems in physics and engineering",faculty1,unit11b);
            Lesson lesson11c=createLesson("Integrals","Integrals represent the accumulation of quantities, such as areas under curves. The integral of a function(f(x)) over an interval ([a,b]) is the total area between the function and the x-axis. Techniques of integration include substitution,integration by parts and partial fractions.The Fundamental Theorem of Calculs connects differentiation and integration,showing that they are inverse processes. Integrals are used in various fields,such as calculating areas,volumes, and solving differential equations.",faculty1,unit11c);
            Lesson lesson11d=createLesson("Applications of Calculus","Calculus has practical applications in science,engineering and economics.It is used to model and solve real-world problems, such as calculating the motion of objects,optimizing functions, and analyzing growth rates.",faculty1,unit11d);
                unit11a.setLessons(List.of(lesson11a));
                unit11b.setLessons(List.of(lesson11b));
                unit11c.setLessons(List.of(lesson11c));
                unit11d.setLessons(List.of(lesson11d));
// Course 12: Linear Algebra
        Syllabus syllabus12 = createSyllabus("Study of vector spaces, matrices, and linear transformations.", "Vectors, Matrices, Determinants, Eigenvalues, Eigenvectors.", "Assignments (40%), Projects (30%), Tests (30%)");

             Unit unit12a=   createUnit("Vectors", "In this unit, students will learn about vectors, their properties, and operations. They will explore vector addition, scalar multiplication, dot product, and cross product, and understand their applications in various fields.");
             Unit unit12b=   createUnit("Matrices", "This unit covers matrices and their operations. Students will learn about matrix addition, multiplication, and inversion, as well as applications of matrices in solving linear equations and transformations.");
             Unit unit12c=   createUnit("Determinants", "In this unit, students will explore determinants, a scalar value that can be computed from the elements of a square matrix. They will understand the properties of determinants, how to calculate them, and their role in solving linear systems and finding matrix inverses.");
             Unit unit12d=   createUnit("Eigenvalues", "This unit focuses on eigenvalues, which are special numbers associated with a matrix. Students will learn how to calculate eigenvalues, understand their significance, and explore their applications in various mathematical and engineering problems.");
             Unit unit12e=   createUnit("Eigenvectors", "In this unit, students will study eigenvectors, which are vectors associated with eigenvalues that remain in the same direction under a linear transformation. They will learn how to find eigenvectors and understand their importance in matrix diagonalization and systems of linear equations.");
                List<Unit> units12=Arrays.asList(unit12a,unit12b,unit12c,unit12d,unit12e);
        Course course12 = createCourse("Linear Algebra", "Study of vector spaces, matrices, and linear transformations.", "Mathematics", 3, syllabus12, units12);
        Resource resource12a=createResource("Course 12 textbook resource","https://linear.axler.net",syllabus12,course12);
        Resource resource12b=createResource("Course 12 video resource","https://m.youtube.com/playlist?list=PL221E2BBF13BECF6C",syllabus12,course12);
            Lesson lesson12a=createLesson("Vectors","Vectors are fundamental objects in linear algebra that represent quantities having both magnitude and direction. You can perform various operations on vectors like addition,scalar multiplication,dot product and cross product",faculty2,unit12b);
            Lesson lesson12b=createLesson("Matrices","Matrices are rectangular arays of numbers that can represent a system of linear equations or transformations in space.Operations on matrices include addition,subtraction, and multiplication. The inverse of a matrix, if it exists, is a matrix, that when multiplied by the original matrix, yields the identity matrix.",faculty2,unit12b);
            Lesson lesson12c=createLesson("Determinants","Determinants are scalar values that can be computed from the elements of a square matrix. The determinant of a matrix provides important information about the matrix such as whether its invertable(if determinent doesnt equal 0)",faculty2,unit12c);
            Lesson lesson12d=createLesson("Eigenvalues","Eigenvalues are special numbers associated with a matrix that give insight into the matrix's properties and behavior. An eigenvalue of a matrix is scalar such that when the matrix is multiplied by a specific vector, the result is the same vector scaled by the eigenvalue.",faculty2,unit12d);
            Lesson lesson12e=createLesson("Eigenvectors","Eigenvectors are vectors associated with eigenvalues that remain in the same direction under a linear transformation.Eigenvectors are crucial in matrix diagonalization,simplifying matrix powers, and solving systems of linear differential equations.",faculty2,unit12e);
                unit12a.setLessons(List.of(lesson12a));
                unit12b.setLessons(List.of(lesson12b));
                unit12c.setLessons(List.of(lesson12c));
                unit12d.setLessons(List.of(lesson12d));
                unit12e.setLessons(List.of(lesson12e));
// Course 13: Calculus II
        Syllabus syllabus13 = createSyllabus("Explore advanced calculus topics including sequences,series, and multivariable calculus.", "Sequences and Series, Techniques of integration, Multivariable Functions, Vector Calculus.", "Assignments (40%), Projects (30%), Tests (30%)");

          Unit unit13a=      createUnit("Sequences and Series", "In this unit, students will learn about sequences and series, including convergence tests,power series, and Taylor series.They will understand how to analyze the behavior of sequences and series and apply these concepts to solve mathematical problems. ");
          Unit unit13b=      createUnit("Techniques of Integration", "This unit covers advanced integration techniques, such as integration by parts, partial fractions, trigonometric integrals, and improper integrals. Students will learn how to apply these techniques to evaluate complex integrals and solve real-world problems involving integration.");
          Unit unit13c=      createUnit("Multivariable Functions", "In this unit, students will explore functions of several variables, including partial derivatives, multiple integrals, and gradient vectors. They will understand how to analyze and visualize multivariable functions and apply these concepts to solve problems in various fields.");
          Unit unit13d=      createUnit("Vector Calculus", "This unit focuses on vector caluclus, the study of vector fields and their applications. Students will learn about line integrals, surface integrals, Green's Theorem, Stoke's Theorem, and the Divergence Theorem. They will understand how to apply these theorems to analyze and solve problems involving vector fields.");
                List<Unit> units13=Arrays.asList(unit13a,unit13b,unit13c,unit13d);
        Course course13 = createCourse("Calculus II", "Explore advanced calculus topics including sequences, series and multivariable calculus.", "Mathematics", 3, syllabus13, units13);
        Resource resource13a=createResource("Course 13 textbook resource","https://openstax.org/books/calculus-volume-2/pages/1-introduction",syllabus13,course13);
        Resource resource13b=createResource("Course 13 video resource","https://www.youtube.com/watch?v=h4Vhh7aFmWw",syllabus13,course13);
            Lesson lesson13a=createLesson("Sequences and Series","Sequences and series are essential concepts in calculus. A sequence is an order list of numbers, and a series is the sum of a sequence of terms.Key topics include convergence tests,which determine if a series converges or diverges, power series, which represent functions as infinite sums, and Taylor series, which approximate functions with polynomials.",faculty3,unit13a);
            Lesson lesson13b=createLesson("Techniques of Integration","Advance integration techniques are used to evaluate complex integrals.These include integration by parts,which integrate products of functions;partial fractions,which decompose rational functions into simpler fractions;trigonometric integrals,which extend the concept of integration to unbounded intervals or integrands.",faculty3,unit13b);
            Lesson lesson13c=createLesson("Multivariable Functions","Multivariable functions involve more than one variable.Key concepts include partial derivatives,which measure how a function changes with respect to one varaible while holding others constant;mulitple integrals,which extend the concept of integration to functions of several variables; and gradient vectors, which indicate the direction of the steepest ascent.",faculty3,unit13c);
            Lesson lesson13d=createLesson("Vector Calculus","Vector calculus studies vector fields and their applications. Important topics include line integrals, which integrate functions along curves; surfact integrals,which integrate over surfaces; Green's Theorem, which relates a line integral around a simple curve to a double integral over the region it encloses; Stoke's Theorem, which generalizes Green's Theorem to higher dimensions; and the Divergence Theorem,which relates the flux of a vector field through a surface to a triple integral over the volume it encloses",faculty3,unit13d);
                unit13a.setLessons(List.of(lesson13a));
                unit13b.setLessons(List.of(lesson13b));
                unit13c.setLessons(List.of(lesson13c));
                unit13d.setLessons(List.of(lesson13d));
// Course 14: Discrete Mathematics
        Syllabus syllabus14 = createSyllabus("Study of mathematical structures that are fundamentally discrete.", "Logic, Set Theory, Graph Theory, Combinatorics.", "Assignments (40%), Projects (30%), Tests (30%)");

        Unit unit14a=        createUnit("Logic", "In this unit, students will learn about the fundamentals of logic, including propositional and predicate logic. They will understand how to form logical statements, use logical connectives, and apply logical reasoning in problem-solving.");
        Unit unit14b=        createUnit("Set Theory", "This unit covers set theory, the study of sets, which are collections of objects. Students will explore the concepts of subsets, unions, intersections, and Cartesian products, and apply these concepts to solve problems involving sets.");
        Unit unit14c=        createUnit("Graph Theory", "In this unit, students will explore graph theory, the study of graphs as mathematical structures used to model pairwise relations between objects. They will learn about different types of graphs, such as directed and undirected graphs, and apply algorithms for traversing and analyzing graphs.");
        Unit unit14d=        createUnit("Combinatorics", "This unit focuses on combinatorics, the study of counting, arrangement, and combination of objects. Students will learn about permutations, combinations, and the principles of counting, and apply these techniques to solve combinatorial problems.");
            List<Unit> units14=Arrays.asList(unit14a,unit14b,unit14c,unit14d);
        Course course14 = createCourse("Discrete Mathematics", "Study of mathematical structures that are fundamentally discrete rather than continuous.", "Mathematics", 3, syllabus14, units14);
        Resource resource14a=createResource("Course 14 textbook resource","https://cims.nyu.edu/~regev/teaching/discrete_math_fall_2005/dmbook.pdf",syllabus14,course14);
        Resource resource14b=createResource("Course 14 video resource","https://m.youtube.com/playlist?list=PLDDGPdw7e6Ag1EIznZ-m-qXu4XX3A0cIz",syllabus14,course14);
            Lesson lesson14a=createLesson("Logic","Logic is the foundation of mathematical reasoning.It includes propositional logic,where statements are either true or false, and predicate logic,which deals with predicates and quantifiers. Logical connectives like AND,OR, and NOT help form complex statements.",faculty4,unit14a);
            Lesson lesson14b=createLesson("Set Theory","Set theory is the study of sets, which are collections of distinct objects.Key concepts include subsets,unions,intersections, and Cartesian products(pairs of elements from sets). Set Theory provides a basis for understanding mathematical structures and relationships",faculty4,unit14b);
            Lesson lesson14c=createLesson("Graph Theory","Graph theory involves studying graphs which consist of vertices connected by edges. Different types of graphs include directed and undirected graphs. Algorithms for traversing and analyzing graphs, such as depth-first search(DFS) and breadth-first search(BFS) are essential for solving problems in networking,biology, and social sciences",faculty4,unit14c);
            Lesson lesson14d=createLesson("Combinatorics","Combinatorics is the study of counting,arrangement, and combination of objects.It includes permutations and combinations.Principles of counting, such as the Pigeonhole Principle and Inclusion-Exclusion Principle help solve combinatorial problems.Combinatorics is used in fields like cryptography,coding theory, and optimization",faculty4,unit14d);
                unit14a.setLessons(List.of(lesson14a));
                unit14b.setLessons(List.of(lesson14b));
                unit14c.setLessons(List.of(lesson14c));
                unit14d.setLessons(List.of(lesson14d));
// Course 15: Physics I
        Syllabus syllabus15 = createSyllabus("Introduction to classical mechanics.", "Newton's Laws, Energy Principles, Motion.", "Assignments (40%), Projects (30%), Tests (30%)");

         Unit unit15a=       createUnit("Newton's Laws", "In this unit, students will learn about Newton's laws of motion, which describe the relationship between the motion of an object and the forces acting on it. They will understand and apply these laws to solve problems in mechanics.");
         Unit unit15b=       createUnit("Energy Principles", "This unit covers the principles of energy, including kinetic and potential energy, work, and the conservation of energy. Students will learn how to calculate energy and work, and understand the concepts of power and efficiency.");
         Unit unit15c=       createUnit("Motion", "In this unit, students will explore the concepts of motion, including linear motion, projectile motion, and circular motion. They will learn about velocity, acceleration, and the equations of motion, and apply these concepts to analyze different types of motion.");
        List<Unit> units15=Arrays.asList(unit15a,unit15b,unit15c);
        Course course15 = createCourse("Physics I", "Introduction to classical mechanics, including Newton's laws and energy principles.", "Physics", 4, syllabus15, units15);
        Resource resource15a=createResource("Course 15 textbook resource","https://openstax.org/books/university-physics-volume-1/pages/1-introduction",syllabus15,course15);
        Resource resource15b=createResource("Course 15 video resource","https://www.youtube.com/watch?v=wIq4CssPoO0&list=PLUl4u3cNGP60UlabZBeeqOuoLuj_KNphQ",syllabus15,course15);
            Lesson lesson15a=createLesson("Newton's Laws","First Law(Inertia): an object will remain at rest or in uniform motion unless acted upon by an external force. Second Law(F=ma):The acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass.Third Law(Action-Reaction):For every action, there is an equal and opposite reaction",faculty5,unit15a);
            Lesson lesson15b=createLesson("Energy Principlies","The principles of energy include kinetic energy(energy of motion) and potential energy(stored energy). Work is the process of transferring energy by applying a force over a distance.The conservation of energy states that energy cannot be created or destroyed, only transformed from one form to another. Power measures the rate at which work is done or energy is transferred.",faculty5,unit15b);
            Lesson lesson15c=createLesson("Motion","Motion describes the change in position of an object over time. Key concepts include:Linear motion,Projectile motion: the curved path an object follows when launched near the earths surface.Circular motion:Movement along a circular path, characterized by angular velocity and centripetal acceleration",faculty5,unit15c);
                unit15a.setLessons(List.of(lesson15a));
                unit15b.setLessons(List.of(lesson15b));
                unit15c.setLessons(List.of(lesson15c));
// Course 16: Chemistry I
        Syllabus syllabus16 = createSyllabus("Introduction to chemical principles.", "Atomic Structure, Chemical Bonding, Reactions.", "Assignments (40%), Projects (30%), Tests (30%)");

        Unit unit16a=        createUnit("Atomic Structure", "In this unit, students will learn about the structure of atoms, including subatomic particles (protons, neutrons, electrons), atomic number, mass number, and isotopes. They will understand how these components define elements and their properties.");
        Unit unit16b=        createUnit("Chemical Bonding", "This unit covers chemical bonding, the process by which atoms combine to form molecules and compounds. Students will explore different types of bonds, including ionic, covalent, and metallic bonds, and understand the principles that govern bond formation.");
        Unit unit16c=        createUnit("Reactions", "In this unit, students will study chemical reactions, including the reactants, products, and types of chemical reactions. They will learn about reaction rates, equilibrium, and the factors that influence chemical reactions.");
            List<Unit> units16=Arrays.asList(unit16a,unit16b,unit16c);
        Course course16 = createCourse("Chemistry I", "Introduction to chemical principles, including atomic structure and chemical bonding.", "Chemistry", 4, syllabus16, units16);
        Resource resource16a=createResource("Course 16 textbook resource","https://openstax.org/books/chemistry-atoms-first-2e/pages/1-introduction",syllabus16,course16);
        Resource resource16b=createResource("Course 16 video resource","https://m.youtube.com/playlist?list=PL8dPuuaLjXtPHzzYuWy6fYEaX9m-QQ8aGr",syllabus16,course16);
            Lesson lesson16a=createLesson("Atomic Structure","Atomic structure is the foundation of chemistry. Atoms consist of three main subatomic particles:protons,neutrons and electrons.The atomic number is the number of protons in an atom and defines the element.The mass number is the total number of protons and neutrons.Isotopes are atoms of the same element with different numbers of neutrons.",faculty1,unit16a);
            Lesson lesson16b=createLesson("Chemical Bonding","Chemical bonding is the process by which atoms combine to form molecules and compounds.Ionic bonds are formed when one atom donates an electron to another,resulting in positive and negative ions that attract each other.Covalent bonds form when atoms share electrons to achieve a full outer shell.Metallic bonds are formed by the attraction between free-floating valence electrons and positively charged metal ions",faculty1,unit16b);
            Lesson lesson16c=createLesson("Reactions","Chemical reactions involve the transformation of reactants into products. Key concepts include reaction rates,which describe how quickly reactions occur, and equilibrium, where the rates of the forward and reverse reactions are equal. Types of chemical reactions include synthesis,decomposition,single replacement, and double replacement.Factors influencing chemical reactions include temperature, concentration,surface area, and catalysts.",faculty1,unit16c);
                unit16a.setLessons(List.of(lesson16a));
                unit16b.setLessons(List.of(lesson16b));
                unit16c.setLessons(List.of(lesson16c));

// Course 17: Biology I
        Syllabus syllabus17 = createSyllabus("Introduction to cellular biology, genetics, and evolution.", "Cell Structure, Genetics, Evolution, Ecology.", "Assignments (40%), Projects (30%), Tests (30%)");

        Unit unit17a=        createUnit("Cell Structure", "In this unit, students will learn about the structure and function of cells, including the cell membrane, nucleus, organelles, and the differences between prokaryotic and eukaryotic cells.");
        Unit unit17b=        createUnit("Genetics", "This unit covers genetics, the study of heredity and the variation of inherited characteristics. Students will explore the principles of Mendelian genetics, the structure and function of DNA, and the processes of replication, transcription, and translation.");
        Unit unit17c=        createUnit("Evolution", "In this unit, students will explore the theory of evolution, natural selection, and the evidence supporting evolutionary change. They will understand how genetic variation and environmental factors contribute to the evolution of species.");
        Unit unit17d=        createUnit("Ecology", "This unit focuses on ecology, the study of interactions between organisms and their environment. Students will learn about ecosystems, food webs, energy flow, and the impact of human activities on the environment.");
            List<Unit> units17=Arrays.asList(unit17a,unit17b,unit17c,unit17d);
        Course course17 = createCourse("Biology I", "Introduction to cellular biology, genetics, and evolution.", "Biology", 4, syllabus17, units17);
        Resource resource17a=createResource("Course 17 textbook resource","https://openstax.org/books/biology-2e/pages/1-introduction",syllabus17,course17);
        Resource resource17b=createResource("Course 17 video resource","https://m.youtube.com/playlist?list=PL3EED4C1D684D3ADF",syllabus17,course17);
            Lesson lesson17a=createLesson("Cell Structure","The cell is the basic unit of life,comprising the cell membrane,nucleus, and various organelles.Prokaryotic cells lack a nucleus, whereas eukaryotic cells have a defined nucleus and organelles.THe cell membrane controls the movement of substances in and out of the cell,the nucleus contains genetic material, and organelles like mitochondria and ribosomes perform specific functions.",faculty2,unit17a);
            Lesson lesson17b=createLesson("Genetics","Genetics is the study of heredity and variation in living organisms.Key concepts include Mendelian genetics,which explains how traits are inherited through dominant and recessive alleles, and the structure and function of DNA.DNA replication ensures genetic information is passed on during cell division, while transcription and translation convert genetic information into proteins.",faculty2,unit17b);
            Lesson lesson17c=createLesson("Evolution","Evolution is the process by which species change over time through natural selection.Genetic variation and environmental factors contribute to the survival and reproduction of individuals whit advantageous traits.",faculty2,unit17c);
            Lesson lesson17d=createLesson("Ecology","Ecology studies the interactions between organisms and their environment.Key concepts include ecosystems, which consist of living organisms and their physical environment; food webs, which illustrate the flow of energy and nutrients; and energy flow,which describes how energy is transferred through trophic levels.Human activities impact ecosystems,leading to changes in biodiversity and ecological balance.",faculty2,unit17d);
                unit17a.setLessons(List.of(lesson17a));
                unit17b.setLessons(List.of(lesson17b));
                unit17c.setLessons(List.of(lesson17c));
                unit7d.setLessons(List.of(lesson17d));
// Course 18: Introduction to Engineering
        Syllabus syllabus18 = createSyllabus("Overview of engineering disciplines and problem-solving techniques.", "Engineering Disciplines, Problem-Solving, Design Process.", "Assignments (40%), Projects (30%), Tests (30%)");

        Unit unit18a=        createUnit("Engineering Disciplines", "In this unit, students will learn about the various engineering disciplines, including civil, mechanical, electrical, and chemical engineering. They will explore the roles and responsibilities of engineers in each field and understand the diverse applications of engineering.");
        Unit unit18b=        createUnit("Problem-Solving", "This unit covers problem-solving techniques used in engineering. Students will learn about the engineering problem-solving process, including identifying problems, generating solutions, and selecting the best solution. They will apply these techniques to real-world engineering challenges.");
        Unit unit18c=        createUnit("Design Process", "In this unit, students will explore the engineering design process, a systematic approach to solving engineering problems. They will learn about the stages of the design process, including defining requirements, brainstorming, prototyping, testing, and iteration.");
            List<Unit> units18=Arrays.asList(unit18a,unit18b,unit18c);
        Course course18 = createCourse("Introduction to Engineering", "Overview of engineering disciplines and problem-solving techniques.", "Engineering", 3, syllabus18, units18);
        Resource resource18a=createResource("Course 18 textbook resource","https://archive.org/details/engineering-fundamentals-an-introduction-to-engineering",syllabus18,course18);
        Resource resource18b=createResource("Course 18 video resource","https://m.youtube.com/playlist?list=PLpe3qgeJLpB0AmyDNh4-UMClqLsao4-Va",syllabus18,course18);
            Lesson lesson18a=createLesson("Engineering Disciplines","Civil:infrastructure like bridges and roads.Mechanical:Design and maunfacturing of mechanical systems.Electrical:Study and application of electricity and electronics.Chemical:Production and use of chemicals and biochemical processes",faculty3,unit18a);
            Lesson lesson18b=createLesson("Problem-Solving","Identifying Problems,Generating solutions and seleting the best solution are the steps to problem solving",faculty3,unit18b);
            Lesson lesson18c=createLesson("Design Process","The design process includes defining requirements,brainstorming,prototyping,testing and iteration",faculty3,unit18c);
                 unit18a.setLessons(List.of(lesson18a));
                 unit18b.setLessons(List.of(lesson18b));
                 unit18c.setLessons(List.of(lesson18c));
// Course 19: Electrical Engineering Basics
        Syllabus syllabus19 = createSyllabus("Fundamentals of electrical circuits, signals, and systems.", "Circuit Analysis, Signal Processing, Systems Theory.", "Assignments (40%), Projects (30%), Tests (30%)");

        Unit unit19a=        createUnit("Circuit Analysis", "In this unit, students will learn about the principles of circuit analysis, including Ohm's law, Kirchhoff's laws, and techniques for analyzing DC and AC circuits. They will understand how to calculate voltage, current, and resistance in electrical circuits.");
        Unit unit19b=        createUnit("Signal Processing", "This unit covers the fundamentals of signal processing, including the analysis and manipulation of signals. Students will learn about Fourier transforms, filtering, and the applications of signal processing in communication systems and digital signal processing (DSP).");
        Unit unit19c=        createUnit("Systems Theory", "In this unit, students will explore systems theory, the study of systems and their behavior. They will learn about system modeling, feedback, and control systems, and understand how to apply these concepts to analyze and design electrical systems.");
            List<Unit> units19=Arrays.asList(unit19a,unit19b,unit19c);
        Course course19 = createCourse("Electrical Engineering Basics", "Fundamentals of electrical circuits, signals, and systems.", "Engineering", 4, syllabus19, units19);
        Resource resource19a=createResource("Course 19 textbook resource","https://www.ece.rice.edu/~dhj/courses/elec241/col10040.pdf",syllabus19,course19);
        Resource resource19b=createResource("Course 19 video resource","https://m.youtube.com/watch?v=Vd2UJiIPbag",syllabus19,course19);
            Lesson lesson19a=createLesson("Circuit Analysis","Circuit analysis involves understanding principles such as Ohm's law(V=IR) and Kirchhoff's laws. Techniques for analyzing both DC and AC circuits help in calculating voltage,current and resistance.",faculty4,unit19a);
            Lesson lesson19b=createLesson("Signal Processing","Signal processing focuses on analyzing and manipulating signals using tools like Fourier transforms and filtering.These techniques are vital in communication systems and digital signal processing(DSP), enabling effective data transmission and transformation.",faculty4,unit19b);
            Lesson lesson19c=createLesson("Systems Theory","Systems theory studies the behavior of systems through modeling,feedback, and control systems.",faculty4,unit19c);
                unit19a.setLessons(List.of(lesson19a));
                unit19b.setLessons(List.of(lesson19b));
                unit19c.setLessons(List.of(lesson19c));

// Course 20: Mechanical Engineering Principles
        Syllabus syllabus20 = createSyllabus("Introduction to the principles of mechanics and thermodynamics.", "Statics, Dynamics, Thermodynamics, Material Science.", "Assignments (40%), Projects (30%), Tests (30%)");

        Unit unit20a=        createUnit("Statics", "In this unit, students will learn about statics, the branch of mechanics that deals with bodies at rest and forces in equilibrium. They will understand how to analyze force systems, calculate moments, and solve problems related to static equilibrium.");
        Unit unit20b=        createUnit("Dynamics", "This unit covers dynamics, the study of bodies in motion. Students will explore kinematics and kinetics, understand the principles of Newton's laws of motion, and learn how to analyze the motion of particles and rigid bodies.");
        Unit unit20c=        createUnit("Thermodynamics", "In this unit, students will explore the principles of thermodynamics, including the laws of thermodynamics, energy transfer, and the behavior of gases and liquids. They will understand how to apply these principles to solve engineering problems involving heat and work.");
        Unit unit20d=        createUnit("Material Science", "This unit focuses on material science, the study of the properties and behavior of materials. Students will learn about different types of materials, including metals, ceramics, polymers, and composites, and understand how to select materials for specific engineering applications.");
            List<Unit> units20=Arrays.asList(unit20a,unit20b,unit20c,unit20d);
        Course course20 = createCourse("Mechanical Engineering Principles", "Introduction to the principles of mechanics and thermodynamics.", "Engineering", 4, syllabus20, units20);
        Resource resource20a=createResource("Course 20 textbook resource","https://archive.org/details/mechanicalengine0000bird",syllabus20,course20);
        Resource resource20b=createResource("Course 20 video resource","https://www.youtube.com/watch?v=-MbMBgcFudY&list=PLoHI_8mQtcTbDowiHrTbykKRL75Yvzs2B",syllabus20,course20);
            Lesson lesson20a=createLesson("Statics","Statics is the branch of mechanics that deals with bodies at rest and forces on equilibrium.",faculty5,unit20a);
            Lesson lesson20b=createLesson("Dynamics","Dynamics is the study of bodies in motion and the forces that cause this motion",faculty5,unit20b);
            Lesson lesson20c=createLesson("Thermodynamics","Thermodynamics involves the study of energy,its transformations, and its relation to matter.",faculty5,unit20c);
            Lesson lesson20d=createLesson("Material Science","Material science is the study of the properties,behaviort and applications of materials",faculty5,unit20d);
                 unit20a.setLessons(List.of(lesson20a));
                 unit20b.setLessons(List.of(lesson20b));
                 unit20c.setLessons(List.of(lesson20c));
                 unit20d.setLessons(List.of(lesson20d));
        //Semesters
        Semester fall2024 = createSemester("Fall", "2024");
        Semester spring2024 = createSemester("Spring", "2024");

        //Attendance
        LocalDate attendanceLocalDate1=LocalDate.of(2024,12,4);
        Attendance attendance1=createAttendance(attendanceLocalDate1,true,student1,course1);
        Attendance attendance2=createAttendance(attendanceLocalDate1,true,student1,course2);
        Attendance attendance3=createAttendance(attendanceLocalDate1,true,student2,course3);
        Attendance attendance4=createAttendance(attendanceLocalDate1,true,student2,course4);
        Attendance attendance5=createAttendance(attendanceLocalDate1,true,student3,course5);
        Attendance attendance6=createAttendance(attendanceLocalDate1,true,student3,course6);
        Attendance attendance7=createAttendance(attendanceLocalDate1,true,student4,course7);
        Attendance attendance8=createAttendance(attendanceLocalDate1,true,student4,course8);
        Attendance attendance9=createAttendance(attendanceLocalDate1,true,student5,course9);
        Attendance attendance10=createAttendance(attendanceLocalDate1,true,student5,course10);
        Attendance attendance11=createAttendance(attendanceLocalDate1,true,student6,course11);
        Attendance attendance12=createAttendance(attendanceLocalDate1,true,student6,course12);
        Attendance attendance13=createAttendance(attendanceLocalDate1,true,student7,course13);
        Attendance attendance14=createAttendance(attendanceLocalDate1,true,student7,course14);
        Attendance attendance15=createAttendance(attendanceLocalDate1,true,student8,course15);
        Attendance attendance16=createAttendance(attendanceLocalDate1,true,student8,course16);
        Attendance attendance17=createAttendance(attendanceLocalDate1,true,student9,course17);
        Attendance attendance18=createAttendance(attendanceLocalDate1,true,student9,course18);
        Attendance attendance19=createAttendance(attendanceLocalDate1,true,student10,course19);
        Attendance attendance20=createAttendance(attendanceLocalDate1,true,student10,course20);

        //Discussions
        Discussion discussion1a = createDiscussion("The Importance of variables in Programming Discussion", "Discuss how variables are used to store and manipulate data in programs and share examples.", faculty1);
        Discussion discussion1b = createDiscussion("Type Conversion and Casting Discussion", "Explain the different data types are what are they used for?", faculty1);
        Discussion discussion1c = createDiscussion("Control Structures Discussion", "Can you provide an example of how conditional statements(if,elif,else) have been used in a real-world project you know about or have worked on?", faculty1);
        Discussion discussion1d = createDiscussion("Functions Discussion", "How do functions improve code organization, and what are some best practices for defining and using functions effectively?", faculty1);
        Discussion discussion1e = createDiscussion("Modules Discussion", "In what ways can modular programming improve the maintainability and readability of your code, and how have you applied modular principles in your projects?", faculty1);
        Discussion discussion1f = createDiscussion("Libraries Discussion", "How have libraries simplified complex tasks in your programming projects, and which libraries have you found particularly useful?", faculty1);

        Discussion discussion2a = createDiscussion("Arrays Discussion", "How do arrays enhance the efficiency of data management in programming, and what are some common pitfalls to avoid when using them?", faculty2);
        Discussion discussion2b = createDiscussion("Linked Lists Discussion", "What are the advantages of using linked lists over arrays, and in what scenarios would you prefer one over the other?", faculty2);
        Discussion discussion2c = createDiscussion("Stacks Discussion", "Can you provide an example of how stacks are used in real-world applications, and why their LIFO (Last In, First Out) nature is beneficial?", faculty2);
        Discussion discussion2d = createDiscussion("Queues Discussion", "How do queues support the handling of tasks in a first-come, first-served manner, and what are some practical applications of queues?", faculty2);
        Discussion discussion2e = createDiscussion("Trees Discussion", "Why are trees considered a powerful data structure for hierarchical data representation, and how do they support efficient searching and sorting?", faculty2);
        Discussion discussion2f = createDiscussion("Graphs Discussion", "How are graphs used to represent relationships in various fields, and what are some common algorithms for traversing and analyzing graphs?", faculty2);

        Discussion discussion3a = createDiscussion("Sorting Discussion", "How do different sorting algorithms like bubble sort, merge sort, and quicksort compare in terms of efficiency, and when would you choose one over the others?", faculty3);
        Discussion discussion3b = createDiscussion("Searching Discussion", "How do linear search and binary search differ in their approach and efficiency, and what are some real-world examples where each would be most effective?", faculty3);
        Discussion discussion3c = createDiscussion("Graph Algorithms Discussion", "How are depth-first search (DFS) and breadth-first search (BFS) algorithms applied in real-world scenarios, and what are the advantages of each method in graph traversal?", faculty3);
        Discussion discussion3d = createDiscussion("Dynamic Programming Discussion", "How does dynamic programming help in solving complex problems like the Fibonacci sequence and the knapsack problem, and what strategies can you use to identify subproblems and optimize solutions?", faculty3);

        Discussion discussion4a = createDiscussion("Relational Databases Discussion", "How do relational databases organize data using tables, keys, and relationships, and what are the advantages of using a relational database for data management?", faculty4);
        Discussion discussion4b = createDiscussion("SQL Discussion", "What are some common SQL queries used for creating, reading, updating, and deleting data, and how do these queries help in managing databases efficiently?", faculty4);
        Discussion discussion4c = createDiscussion("Transactions Discussion", "How do the ACID properties (Atomicity, Consistency, Isolation, Durability) ensure data integrity and consistency in databases, and why are they important in transaction management?", faculty4);
        Discussion discussion4d = createDiscussion("Database Design Discussion", "What are the key principles and best practices for designing normalized database schemas, and how do these practices contribute to creating efficient database structures?", faculty4);

        Discussion discussion5a = createDiscussion("Processes Discussion", "How do operating systems manage processes, including creation, scheduling, and termination, and why is inter-process communication and synchronization important?", faculty5);
        Discussion discussion5b = createDiscussion("Memory Management Discussion", "What are the differences between paging, segmentation, and virtual memory, and how do these techniques optimize memory management in operating systems?", faculty5);
        Discussion discussion5c = createDiscussion("File Systems Discussion", "How do file systems organize and manage data, and what are the advantages and challenges of different file access methods and directory structures?", faculty5);
        Discussion discussion5d = createDiscussion("Scheduling Discussion", "What are the key differences between CPU scheduling algorithms like round-robin, priority scheduling, and multi-level queues, and how do these techniques impact process execution efficiency?", faculty5);

        Discussion discussion6a = createDiscussion("OSI Model Discussion", "How do the seven layers of the OSI model facilitate the standardized functioning of telecommunication systems, and why is it important to understand how data is transmitted across each layer?", faculty1);
        Discussion discussion6b = createDiscussion("TCP/IP Discussion", "What are the key differences between the OSI model and the TCP/IP model, and how does the TCP/IP protocol suite enable reliable communication over the internet?", faculty1);
        Discussion discussion6c = createDiscussion("Network Protocols Discussion", "How do protocols such as HTTP, FTP, DNS, and DHCP ensure secure and efficient communication over networks, and what are some common challenges in implementing these protocols?", faculty1);
        Discussion discussion6d = createDiscussion("Routing Discussion", "How do different routing algorithms and protocols like OSPF and BGP determine the best paths for data packets, and what are the differences between static and dynamic routing?", faculty1);
        Discussion discussion6e = createDiscussion("Switching Discussion", "How do switching methods like packet switching and circuit switching differ in their approach to forwarding data packets, and what role do switches play in network design?", faculty1);

        Discussion discussion7a = createDiscussion("Software Development Life Cycle Discussion", "How do different SDLC models like iterative, incremental, and spiral approaches compare, and in what scenarios would you choose one model over the others?", faculty2);
        Discussion discussion7b = createDiscussion("Agile Discussion", "What are the core principles and practices of Agile methodology, and how can Agile techniques like Scrum and Kanban improve the flexibility and responsiveness of a software project?", faculty2);
        Discussion discussion7c = createDiscussion("Waterfall Discussion", "How does the Waterfall model's linear and sequential approach impact the planning and execution of software development projects, and what are the advantages and disadvantages compared to Agile?", faculty2);
        Discussion discussion7d = createDiscussion("Project Management Discussion", "What are the key techniques and tools for effective project management in software development, and how do you manage risk, resources, and quality throughout a project's lifecycle?", faculty2);

        Discussion discussion8a = createDiscussion("HTML Discussion", "How do HTML tags and attributes help structure web content, and what are some best practices for creating accessible and semantic HTML documents?", faculty3);
        Discussion discussion8b = createDiscussion("CSS Discussion", "How does CSS enhance the visual presentation of web pages, and what techniques can be used to create responsive and visually appealing designs?", faculty3);
        Discussion discussion8c = createDiscussion("JavaScript Discussion", "How can JavaScript be used to create interactive and dynamic web content, and what are some common methods for manipulating the DOM and handling events?", faculty3);
        Discussion discussion8d = createDiscussion("React Discussion", "What are the core concepts of React, such as components, state, and props, and how do they contribute to building efficient single-page applications?", faculty3);
        Discussion discussion8e = createDiscussion("Backend Integration Discussion", "How can front-end web applications be integrated with backend services using RESTful APIs, and what are the benefits and challenges of server-side rendering?", faculty3);

        Discussion discussion9a = createDiscussion("Machine Learning Discussion", "How do different machine learning techniques and tools enable computers to learn from data and make predictions, and what are some real-world applications of these techniques?", faculty4);
        Discussion discussion9b = createDiscussion("Neural Networks Discussion", "What are the key components of neural network architecture, and how does backpropagation help in training neural networks for various tasks?", faculty4);
        Discussion discussion9c = createDiscussion("Natural Language Processing Discussion", "How does natural language processing enable computers to understand and generate human language, and what are some common applications of NLP techniques like text processing and sentiment analysis?", faculty4);

        Discussion discussion10a = createDiscussion("Threat Analysis Discussion", "How can identifying potential security threats and vulnerabilities help in assessing risks, and what strategies can be implemented to mitigate these threats effectively?", faculty5);
        Discussion discussion10b = createDiscussion("Encryption Discussion", "What are the different encryption techniques and algorithms, and why is encryption crucial in protecting sensitive data?", faculty5);
        Discussion discussion10c = createDiscussion("Network Security Discussion", "How do firewalls, intrusion detection systems, and other network security measures protect data during transmission, and what are some common challenges in safeguarding networks?", faculty5);
        Discussion discussion10d = createDiscussion("Secure Coding Discussion", "What are common security flaws in software development, and how can secure coding practices prevent these vulnerabilities to maintain software security?", faculty5);

        Discussion discussion11a = createDiscussion("Limits Discussion", "How do limits help in defining continuity and understanding the behavior of functions, and why are they considered a foundational concept in calculus?", faculty1);
        Discussion discussion11b = createDiscussion("Derivatives Discussion", "What techniques are used in differentiation, and how can derivatives be applied to solve real-world problems effectively?", faculty1);
        Discussion discussion11c = createDiscussion("Integrals Discussion", "How do integrals represent the accumulation of quantities, and what are the key techniques of integration and their applications in various fields?", faculty1);
        Discussion discussion11d = createDiscussion("Applications of Calculus Discussion", "How can calculus be applied in fields such as science, engineering, and economics to model and solve real-world problems, and what are some notable examples?", faculty1);

        Discussion discussion12a = createDiscussion("Vectors Discussion", "How do vector operations such as addition, scalar multiplication, dot product, and cross product apply to real-world problems in various fields?", faculty2);
        Discussion discussion12b = createDiscussion("Matrices Discussion", "How do matrices and their operations (addition, multiplication, inversion) help in solving linear equations and performing transformations, and what are their practical applications?", faculty2);
        Discussion discussion12c = createDiscussion("Determinants Discussion", "What is the role of determinants in solving linear systems and finding matrix inverses, and how do you calculate them?", faculty2);
        Discussion discussion12d = createDiscussion("Eigenvalues Discussion", "How do eigenvalues help in understanding the properties of a matrix, and what are their applications in mathematical and engineering problems?", faculty2);
        Discussion discussion12e = createDiscussion("Eigenvectors Discussion", "How are eigenvectors important in matrix diagonalization and solving systems of linear equations, and what is their significance in linear transformations?", faculty2);

        Discussion discussion13a = createDiscussion("Sequences and Series Discussion", "How do convergence tests help in determining the behavior of sequences and series, and what are some applications of power series and Taylor series in solving mathematical problems?", faculty3);
        Discussion discussion13b = createDiscussion("Techniques of Integration Discussion", "What are the key techniques of integration, such as integration by parts, partial fractions, and trigonometric integrals, and how can these techniques be applied to solve complex integrals and real-world problems?", faculty3);
        Discussion discussion13c = createDiscussion("Multivariable Functions Discussion", "How do partial derivatives, multiple integrals, and gradient vectors contribute to the analysis and visualization of multivariable functions, and what are some practical applications of these concepts?", faculty3);
        Discussion discussion13d = createDiscussion("Vector Calculus Discussion", "How do the theorems of vector calculus, such as Green's Theorem, Stokes' Theorem, and the Divergence Theorem, help in analyzing and solving problems involving vector fields?", faculty3);

        Discussion discussion14a = createDiscussion("Logic Discussion", "How do propositional and predicate logic help in forming logical statements and applying logical reasoning in problem-solving?", faculty4);
        Discussion discussion14b = createDiscussion("Set Theory Discussion", "How do concepts such as subsets, unions, intersections, and Cartesian products apply to real-world problems, and what are the practical applications of set theory?", faculty4);
        Discussion discussion14c = createDiscussion("Graph Theory Discussion", "How do different types of graphs and graph algorithms facilitate the modeling of pairwise relations between objects, and what are some real-world applications of graph theory?", faculty4);
        Discussion discussion14d = createDiscussion("Combinatorics Discussion", "How do permutations, combinations, and the principles of counting help in solving combinatorial problems, and what are their applications in various fields?", faculty4);

        Discussion discussion15a = createDiscussion("Newton's Laws Discussion", "How do Newton's laws of motion describe the relationship between the motion of an object and the forces acting on it, and how can these laws be applied to solve problems in mechanics?", faculty5);
        Discussion discussion15b = createDiscussion("Energy Principles Discussion", "What are the key principles of kinetic and potential energy, and how do concepts such as work, power, and efficiency play a role in understanding energy conservation?", faculty5);
        Discussion discussion15c = createDiscussion("Motion Discussion", "How do the concepts of velocity, acceleration, and the equations of motion help in analyzing different types of motion, such as linear, projectile, and circular motion?", faculty5);

        Discussion discussion16a = createDiscussion("Atomic Structure Discussion", "How do the subatomic particles (protons, neutrons, electrons) define the properties of elements, and what is the significance of atomic number and mass number in determining the behavior of atoms?", faculty1);
        Discussion discussion16b = createDiscussion("Chemical Bonding Discussion", "What are the differences between ionic, covalent, and metallic bonds, and how do these types of bonds influence the properties and stability of molecules and compounds?", faculty1);
        Discussion discussion16c = createDiscussion("Reactions Discussion", "How do factors like reaction rates, equilibrium, and the nature of reactants and products influence the progress of chemical reactions, and what are some examples of these principles in real-world applications?", faculty1);

        Discussion discussion17a = createDiscussion("Cell Structure Discussion", "How do the structure and functions of cell components (like the cell membrane, nucleus, and organelles) differ between prokaryotic and eukaryotic cells, and why are these differences significant?", faculty2);
        Discussion discussion17b = createDiscussion("Genetics Discussion", "What are the principles of Mendelian genetics, and how do the processes of DNA replication, transcription, and translation contribute to genetic inheritance and variation?", faculty2);
        Discussion discussion17c = createDiscussion("Evolution Discussion", "How do genetic variation and environmental factors drive the process of natural selection and contribute to the evolution of species, and what evidence supports evolutionary change?", faculty2);
        Discussion discussion17d = createDiscussion("Ecology Discussion", "How do interactions between organisms and their environment shape ecosystems, and what are the impacts of human activities on food webs and energy flow within these systems?", faculty2);

        Discussion discussion18a = createDiscussion("Engineering Disciplines Discussion", "How do the roles and responsibilities of engineers in civil, mechanical, electrical, and chemical engineering differ, and what are the diverse applications of each engineering discipline?", faculty3);
        Discussion discussion18b = createDiscussion("Problem-Solving Discussion", "What are the key steps in the engineering problem-solving process, and how can these techniques be applied to tackle real-world engineering challenges?", faculty3);
        Discussion discussion18c = createDiscussion("Design Process Discussion", "How does the engineering design process facilitate the development of effective solutions, and what are the critical stages from defining requirements to testing and iteration?", faculty3);

        Discussion discussion19a = createDiscussion("Circuit Analysis Discussion", "How do Ohm's law and Kirchhoff's laws help in analyzing electrical circuits, and what techniques can be used to calculate voltage, current, and resistance in both DC and AC circuits?", faculty4);
        Discussion discussion19b = createDiscussion("Signal Processing Discussion", "What are the key concepts of Fourier transforms and filtering in signal processing, and how are these techniques applied in communication systems and digital signal processing (DSP)?", faculty4);
        Discussion discussion19c = createDiscussion("Systems Theory Discussion", "How do system modeling, feedback, and control systems contribute to understanding and designing electrical systems, and what are some practical applications of these concepts?", faculty4);

        Discussion discussion20a = createDiscussion("Statics Discussion", "How do the principles of statics help in analyzing force systems and calculating moments in bodies at rest, and what are some practical applications of static equilibrium?", faculty5);
        Discussion discussion20b = createDiscussion("Dynamics Discussion", "How do kinematics and kinetics help in understanding the motion of particles and rigid bodies, and what are the key applications of Newton's laws of motion in analyzing dynamics?", faculty5);
        Discussion discussion20c = createDiscussion("Thermodynamics Discussion", "How do the laws of thermodynamics and principles of energy transfer apply to the behavior of gases and liquids, and how can these principles be used to solve engineering problems involving heat and work?", faculty5);
        Discussion discussion20d = createDiscussion("Material Science Discussion", "How do the properties and behaviors of different materials (such as metals, ceramics, polymers, and composites) influence their selection for specific engineering applications, and what are some examples of these applications?", faculty5);

        // Create Posts for Discussion 1a
        Post post1a1 = createPost("Variables are used to store data that can be manipulated throughout a program. For example, a variable can store a user’s input, which can then be processed and used to generate an output.", discussion1a, student1);
        Post post1a2 = createPost("In my project, I used variables to keep track of player scores in a game, which allowed me to update and display scores dynamically.", discussion1a, student2);

// Create Posts for Discussion 1b
        Post post1b1 = createPost("Type conversion allows for changing a variable from one data type to another, such as converting a string to an integer for mathematical operations.", discussion1b, student1);
        Post post1b2 = createPost("Casting is crucial in data type management, enabling smooth data manipulation and preventing errors in operations that require specific types.", discussion1b, student2);

// Create Posts for Discussion 1c
        Post post1c1 = createPost("In a traffic light control system, conditional statements were used to decide which light should be on based on the current state and time elapsed.", discussion1c, student1);
        Post post1c2 = createPost("I used if-else conditions to validate user inputs in a form submission, ensuring the required fields were correctly filled before processing the data.", discussion1c, student2);

// Create Posts for Discussion 1d
        Post post1d1 = createPost("Functions help in organizing code by encapsulating repetitive tasks, making the code modular and easier to understand.", discussion1d, student1);
        Post post1d2 = createPost("Best practices for defining functions include using descriptive names, keeping them short, and ensuring they perform a single task.", discussion1d, student2);

// Create Posts for Discussion 1e
        Post post1e1 = createPost("Modular programming divides a program into independent modules, improving maintainability and making the codebase easier to manage and understand.", discussion1e, student1);
        Post post1e2 = createPost("I applied modular principles by separating the authentication and user management systems in my application, which simplified debugging and feature additions.", discussion1e, student2);

// Create Posts for Discussion 1f
        Post post1f1 = createPost("Libraries like NumPy in Python simplify complex mathematical computations, saving time and effort in writing custom functions.", discussion1f, student1);
        Post post1f2 = createPost("I found the React library extremely useful for building interactive user interfaces efficiently with reusable components.", discussion1f, student2);

// Create Posts for Discussion 2a
        Post post2a1 = createPost("Arrays provide a way to efficiently manage and access large amounts of data by using indices, which allow constant time access.", discussion2a, student1);
        Post post2a2 = createPost("A common pitfall when using arrays is going out of bounds, which can cause runtime errors. Proper bounds checking is essential.", discussion2a, student2);

// Create Posts for Discussion 2b
        Post post2b1 = createPost("Linked lists offer dynamic memory allocation and efficient insertions and deletions, making them preferable in scenarios where data size changes frequently.", discussion2b, student1);
        Post post2b2 = createPost("While arrays provide fast access to elements, linked lists excel in operations like insertion and deletion, especially when the data is constantly changing.", discussion2b, student2);

// Create Posts for Discussion 2c
        Post post2c1 = createPost("Stacks are used in many real-world applications such as undo mechanisms in text editors, where the most recent action is undone first (LIFO).", discussion2c, student1);
        Post post2c2 = createPost("The LIFO nature of stacks is beneficial in function call management in programming languages, where the most recent function call is completed first.", discussion2c, student2);

// Create Posts for Discussion 2d
        Post post2d1 = createPost("Queues are used in scheduling tasks in operating systems, where tasks are handled in the order they arrive, ensuring fair processing.", discussion2d, student1);
        Post post2d2 = createPost("A practical application of queues is in print spoolers, where print jobs are handled on a first-come, first-served basis.", discussion2d, student2);

// Create Posts for Discussion 2e
        Post post2e1 = createPost("Trees represent hierarchical data efficiently, such as file systems. They allow for fast searching, insertion, and deletion operations.", discussion2e, student1);
        Post post2e2 = createPost("Balanced trees, like AVL trees, support efficient searching and sorting operations by maintaining a balanced height, reducing complexity.", discussion2e, student2);

// Create Posts for Discussion 2f
        Post post2f1 = createPost("Graphs are used to model relationships in social networks, where nodes represent individuals and edges represent relationships.", discussion2f, student1);
        Post post2f2 = createPost("Common algorithms for traversing graphs include Depth-First Search (DFS) and Breadth-First Search (BFS), which are used in various applications like finding shortest paths.", discussion2f, student2);

        // Create Posts for Discussion 3a
        Post post3a1 = createPost("Bubble sort is simple but inefficient for large datasets. Merge sort is more efficient with a time complexity of O(n log n), making it suitable for larger datasets.", discussion3a, student1);
        Post post3a2 = createPost("Quicksort is often faster in practice due to its in-place sorting, but it can be less efficient than merge sort in the worst-case scenario (O(n^2)).", discussion3a, student2);

// Create Posts for Discussion 3b
        Post post3b1 = createPost("Linear search is straightforward and works well for small datasets or unsorted data, while binary search is faster (O(log n)) but requires sorted data.", discussion3b, student1);
        Post post3b2 = createPost("In real-world applications, linear search might be used for small lists or real-time searching, whereas binary search is preferred for sorted large datasets.", discussion3b, student2);

// Create Posts for Discussion 3c
        Post post3c1 = createPost("DFS is useful for exploring all possible paths in applications like maze solving, while BFS is advantageous for finding the shortest path in unweighted graphs.", discussion3c, student1);
        Post post3c2 = createPost("I used BFS to determine the shortest route in a delivery network, where the shortest path is crucial for efficiency.", discussion3c, student2);

// Create Posts for Discussion 3d
        Post post3d1 = createPost("Dynamic programming solves complex problems by breaking them down into simpler subproblems, storing the results to avoid redundant calculations.", discussion3d, student1);
        Post post3d2 = createPost("For example, in the knapsack problem, dynamic programming helps optimize the selection of items to maximize value without exceeding weight capacity.", discussion3d, student2);

// Create Posts for Discussion 4a
        Post post4a1 = createPost("Relational databases use tables, keys, and relationships to organize data efficiently, ensuring data integrity and reducing redundancy.", discussion4a, student1);
        Post post4a2 = createPost("The use of primary and foreign keys in relational databases helps in maintaining referential integrity and simplifies complex queries.", discussion4a, student2);

// Create Posts for Discussion 4b
        Post post4b1 = createPost("Common SQL queries include SELECT for data retrieval, INSERT for adding data, UPDATE for modifying data, and DELETE for removing data.", discussion4b, student1);
        Post post4b2 = createPost("Efficient SQL queries optimize database performance and ensure that data operations are performed accurately and quickly.", discussion4b, student2);

// Create Posts for Discussion 4c
        Post post4c1 = createPost("The ACID properties are crucial for ensuring reliable transactions in databases, preventing issues like data corruption and inconsistencies.", discussion4c, student1);
        Post post4c2 = createPost("In financial systems, ACID properties ensure that transactions are processed accurately, maintaining data integrity even during failures.", discussion4c, student2);

// Create Posts for Discussion 4d
        Post post4d1 = createPost("Designing normalized database schemas involves organizing data to reduce redundancy and improve data integrity, typically using techniques like 1NF, 2NF, and 3NF.", discussion4d, student1);
        Post post4d2 = createPost("Normalized schemas make databases more efficient by ensuring that data is stored logically and consistently, simplifying maintenance and queries.", discussion4d, student2);

        // Create Posts for Discussion 5a
        Post post5a1 = createPost("Operating systems manage processes by creating, scheduling, and terminating them. Inter-process communication and synchronization are crucial to avoid conflicts and ensure data consistency.", discussion5a, student3);
        Post post5a2 = createPost("In a multi-threaded environment, synchronization mechanisms like semaphores help manage the access of multiple processes to shared resources efficiently.", discussion5a, student4);

// Create Posts for Discussion 5b
        Post post5b1 = createPost("Paging, segmentation, and virtual memory are techniques that optimize memory management. Paging divides memory into fixed-sized pages, segmentation uses variable-sized segments, and virtual memory extends physical memory using disk storage.", discussion5b, student3);
        Post post5b2 = createPost("Virtual memory allows running large applications by using disk space as additional RAM, while paging helps in efficient memory allocation without fragmentation.", discussion5b, student4);

// Create Posts for Discussion 5c
        Post post5c1 = createPost("File systems organize and manage data through structures like directories and file access methods. Different methods, such as sequential and random access, provide various advantages and challenges.", discussion5c, student3);
        Post post5c2 = createPost("Hierarchical directory structures in file systems help in organizing data logically, but they can become complex and difficult to manage in large systems.", discussion5c, student4);

// Create Posts for Discussion 5d
        Post post5d1 = createPost("CPU scheduling algorithms like round-robin, priority scheduling, and multi-level queues impact process execution efficiency by determining the order and time allocation for process execution.", discussion5d, student3);
        Post post5d2 = createPost("Round-robin scheduling provides fair time allocation, while priority scheduling focuses on processes with higher priority. Multi-level queues categorize processes for more efficient handling.", discussion5d, student4);

// Create Posts for Discussion 6a
        Post post6a1 = createPost("The OSI model's seven layers facilitate standardized telecommunication by defining specific functions for each layer, ensuring data is transmitted accurately and efficiently across networks.", discussion6a, student3);
        Post post6a2 = createPost("Understanding the OSI model helps in troubleshooting network issues and designing networks by providing a clear framework for how data moves through different layers.", discussion6a, student4);

// Create Posts for Discussion 6b
        Post post6b1 = createPost("The TCP/IP model is more practical and widely used compared to the OSI model. TCP/IP ensures reliable communication over the internet through protocols like TCP and IP.", discussion6b, student3);
        Post post6b2 = createPost("While the OSI model is theoretical and divides networking tasks into seven layers, the TCP/IP model's four layers focus on real-world implementations of internet protocols.", discussion6b, student4);

// Create Posts for Discussion 6c
        Post post6c1 = createPost("Protocols such as HTTP, FTP, DNS, and DHCP ensure secure and efficient communication by defining rules for data exchange, but challenges include security vulnerabilities and interoperability issues.", discussion6c, student3);
        Post post6c2 = createPost("Implementing protocols like HTTP and DNS requires addressing challenges such as data security and ensuring reliable communication across different network architectures.", discussion6c, student4);

// Create Posts for Discussion 6d
        Post post6d1 = createPost("Routing algorithms like OSPF and BGP determine the best paths for data packets. OSPF is used within large networks for efficient route calculation, while BGP manages routing between different networks.", discussion6d, student3);
        Post post6d2 = createPost("Static routing uses predefined paths, while dynamic routing like OSPF adapts to network changes, providing flexibility and resilience in data packet routing.", discussion6d, student4);

// Create Posts for Discussion 6e
        Post post6e1 = createPost("Packet switching and circuit switching differ in how data packets are forwarded. Packet switching is more efficient for internet traffic, while circuit switching is used in traditional telephony.", discussion6e, student3);
        Post post6e2 = createPost("Switches play a crucial role in network design by directing data packets to their destinations efficiently, enhancing network performance and reducing congestion.", discussion6e, student4);

        // Create Posts for Discussion 7a
        Post post7a1 = createPost("Iterative, incremental, and spiral approaches in SDLC allow for flexible adaptation to changes. Iterative focuses on repeating phases, incremental adds functionality in increments, and spiral combines iterative with risk analysis.", discussion7a, student3);
        Post post7a2 = createPost("I prefer the spiral model for high-risk projects as it incorporates risk assessment, while the iterative model suits projects needing frequent refinements.", discussion7a, student4);

// Create Posts for Discussion 7b
        Post post7b1 = createPost("Agile methodology emphasizes flexibility and responsiveness through principles like customer collaboration and adaptive planning. Techniques like Scrum and Kanban help in breaking down tasks and managing workflow.", discussion7b, student3);
        Post post7b2 = createPost("Using Agile techniques in my project improved team collaboration and allowed us to quickly adapt to changes, ensuring timely delivery of features.", discussion7b, student4);

// Create Posts for Discussion 7c
        Post post7c1 = createPost("The Waterfall model’s linear and sequential approach makes planning straightforward but less flexible. It's suitable for projects with well-defined requirements, unlike Agile, which is adaptable to changes.", discussion7c, student3);
        Post post7c2 = createPost("While the Waterfall model is great for clear-cut projects, Agile’s iterative cycles make it better for projects requiring continuous feedback and adaptability.", discussion7c, student4);

// Create Posts for Discussion 7d
        Post post7d1 = createPost("Effective project management in software development involves techniques like risk management, resource allocation, and quality control. Tools like Gantt charts and project management software aid in tracking progress.", discussion7d, student3);
        Post post7d2 = createPost("I manage project risk by identifying potential issues early and allocating resources efficiently to ensure quality outcomes, using tools like Trello and JIRA for tracking.", discussion7d, student4);

// Create Posts for Discussion 8a
        Post post8a1 = createPost("HTML tags and attributes structure web content by defining elements like headings, paragraphs, and links. Best practices include using semantic tags and ensuring accessibility with alt text for images.", discussion8a, student3);
        Post post8a2 = createPost("Creating accessible HTML involves using semantic elements and ARIA attributes to make web content usable for all users, including those with disabilities.", discussion8a, student4);

// Create Posts for Discussion 8b
        Post post8b1 = createPost("CSS enhances web presentation by controlling layout, colors, and fonts. Techniques like Flexbox and Grid are used to create responsive designs that adapt to different screen sizes.", discussion8b, student3);
        Post post8b2 = createPost("Using CSS Grid in my project enabled me to design a responsive layout that provided a consistent user experience across various devices.", discussion8b, student4);

// Create Posts for Discussion 8c
        Post post8c1 = createPost("JavaScript adds interactivity to web content through DOM manipulation and event handling. Common methods include using getElementById and addEventListener to create dynamic interfaces.", discussion8c, student3);
        Post post8c2 = createPost("I used JavaScript to create interactive forms that validate user input in real-time, enhancing the usability of the web application.", discussion8c, student4);

// Create Posts for Discussion 8d
        Post post8d1 = createPost("React’s core concepts, like components, state, and props, allow for building efficient single-page applications by creating reusable and interactive UI elements.", discussion8d, student3);
        Post post8d2 = createPost("In my project, using React components simplified the development process and improved the maintainability of the application’s UI.", discussion8d, student4);

// Create Posts for Discussion 8e
        Post post8e1 = createPost("Integrating front-end applications with backend services using RESTful APIs enables dynamic content. Server-side rendering enhances performance by pre-rendering pages on the server.", discussion8e, student3);
        Post post8e2 = createPost("In my project, using RESTful APIs for backend integration allowed for real-time data updates, improving user experience.", discussion8e, student4);

// Create Posts for Discussion 9a
        Post post9a1 = createPost("Machine learning techniques like supervised learning, unsupervised learning, and reinforcement learning enable computers to learn from data and make predictions. Real-world applications include recommendation systems, fraud detection, and autonomous driving.", discussion9a, student5);
        Post post9a2 = createPost("Tools like Python libraries (e.g., scikit-learn) simplify the implementation of machine learning models, enabling effective data analysis and predictive modeling in various domains.", discussion9a, student6);

// Create Posts for Discussion 9b
        Post post9b1 = createPost("Neural networks consist of layers of interconnected nodes (neurons). Backpropagation helps in training by adjusting weights based on the error rate, allowing the network to learn from data.", discussion9b, student5);
        Post post9b2 = createPost("In a project, I used backpropagation to train a neural network for image classification, achieving high accuracy in recognizing different objects.", discussion9b, student6);

// Create Posts for Discussion 9c
        Post post9c1 = createPost("Natural language processing (NLP) enables computers to understand and generate human language. Common applications include text processing, sentiment analysis, and chatbots.", discussion9c, student5);
        Post post9c2 = createPost("I implemented an NLP model for sentiment analysis to gauge customer feedback, providing insights into customer satisfaction and areas for improvement.", discussion9c, student6);

// Create Posts for Discussion 10a
        Post post10a1 = createPost("Identifying potential security threats and vulnerabilities helps in assessing risks and implementing strategies like regular updates, firewalls, and intrusion detection systems to mitigate these threats.", discussion10a, student5);
        Post post10a2 = createPost("In my project, I conducted a threat analysis to identify vulnerabilities in the network, implementing measures to prevent cyber attacks and data breaches.", discussion10a, student6);

// Create Posts for Discussion 10b
        Post post10b1 = createPost("Encryption techniques like symmetric and asymmetric encryption protect sensitive data by converting it into secure formats. Encryption is crucial for ensuring data confidentiality and integrity.", discussion10b, student5);
        Post post10b2 = createPost("I used AES encryption in a project to secure data transmission, ensuring that sensitive information remained confidential and protected from unauthorized access.", discussion10b, student6);

// Create Posts for Discussion 10c
        Post post10c1 = createPost("Network security measures, such as firewalls and intrusion detection systems, protect data during transmission by monitoring and controlling incoming and outgoing network traffic.", discussion10c, student5);
        Post post10c2 = createPost("In a project, I implemented network security protocols to secure communication between devices, preventing unauthorized access and ensuring data integrity.", discussion10c, student6);

// Create Posts for Discussion 10d
        Post post10d1 = createPost("Common security flaws in software development include SQL injection, cross-site scripting (XSS), and buffer overflows. Secure coding practices help prevent these vulnerabilities and maintain software security.", discussion10d, student5);
        Post post10d2 = createPost("I followed secure coding guidelines to prevent SQL injection attacks, enhancing the security of the web application and protecting user data.", discussion10d, student6);

        // Create Posts for Discussion 11a
        Post post11a1 = createPost("Limits help in defining continuity and understanding the behavior of functions near a particular point. They are foundational in calculus because they provide a rigorous way to define derivatives and integrals.", discussion11a, student5);
        Post post11a2 = createPost("In my experience, limits are crucial for understanding how functions behave as they approach specific values, which is essential in both pure and applied mathematics.", discussion11a, student6);

// Create Posts for Discussion 11b
        Post post11b1 = createPost("Differentiation techniques include the power rule, product rule, quotient rule, and chain rule. Derivatives are used to find rates of change and can solve real-world problems like optimizing profit or minimizing costs.", discussion11b, student5);
        Post post11b2 = createPost("I used derivatives to analyze the rate of change in stock prices, helping to make informed investment decisions.", discussion11b, student6);

// Create Posts for Discussion 11c
        Post post11c1 = createPost("Integrals represent the accumulation of quantities, such as area under a curve. Key techniques include definite and indefinite integration, and their applications span fields like physics, engineering, and economics.", discussion11c, student5);
        Post post11c2 = createPost("I applied integration to calculate the total displacement of an object given its velocity function over time.", discussion11c, student6);

// Create Posts for Discussion 11d
        Post post11d1 = createPost("Calculus can be applied in various fields to model and solve real-world problems. Examples include predicting population growth, optimizing engineering designs, and analyzing economic trends.", discussion11d, student5);
        Post post11d2 = createPost("In engineering, I used calculus to model the stress and strain on materials, ensuring the structural integrity of designs.", discussion11d, student6);

// Create Posts for Discussion 12a
        Post post12a1 = createPost("Vector operations like addition, scalar multiplication, dot product, and cross product are used in physics for force analysis, in computer graphics for transformations, and in engineering for structural analysis.", discussion12a, student5);
        Post post12a2 = createPost("I used vector operations in a project to calculate the resultant force acting on a bridge, ensuring it could withstand various loads.", discussion12a, student6);

// Create Posts for Discussion 12b
        Post post12b1 = createPost("Matrices and their operations, such as addition, multiplication, and inversion, help in solving linear equations and performing transformations. They have practical applications in computer graphics, economics, and engineering.", discussion12b, student5);
        Post post12b2 = createPost("In my project, I used matrix multiplication to perform transformations in 3D space, enhancing the visual effects in a computer graphics application.", discussion12b, student6);

// Create Posts for Discussion 12c
        Post post12c1 = createPost("Determinants are used in solving linear systems and finding matrix inverses. They are calculated using techniques like cofactor expansion and row reduction.", discussion12c, student5);
        Post post12c2 = createPost("I used determinants to solve a system of linear equations in a circuit analysis problem, ensuring accurate voltage and current calculations.", discussion12c, student6);

// Create Posts for Discussion 12d
        Post post12d1 = createPost("Eigenvalues help in understanding the properties of a matrix, such as stability and resonance in engineering systems. They are calculated by solving characteristic equations.", discussion12d, student5);
        Post post12d2 = createPost("In my project, I used eigenvalues to analyze the stability of a mechanical system, identifying potential issues before implementation.", discussion12d, student6);

// Create Posts for Discussion 12e
        Post post12e1 = createPost("Eigenvectors are important in matrix diagonalization and solving systems of linear equations. They play a significant role in linear transformations and simplifying complex problems.", discussion12e, student5);
        Post post12e2 = createPost("I used eigenvectors in a project to perform principal component analysis, reducing the dimensionality of data for easier analysis and visualization.", discussion12e, student6);

        // Create Posts for Discussion 13a
        Post post13a1 = createPost("Convergence tests help determine whether a series converges or diverges. Power series and Taylor series have applications in approximating functions and solving differential equations.", discussion13a, student7);
        Post post13a2 = createPost("In my experience, using Taylor series to approximate functions can simplify complex calculations, making it easier to solve real-world problems.", discussion13a, student8);

// Create Posts for Discussion 13b
        Post post13b1 = createPost("Key integration techniques include integration by parts, partial fractions, and trigonometric integrals. These methods are used to solve complex integrals in various fields like physics and engineering.", discussion13b, student7);
        Post post13b2 = createPost("I used integration by parts to solve an integral in a physics problem, helping to understand the motion of an object under varying forces.", discussion13b, student8);

// Create Posts for Discussion 13c
        Post post13c1 = createPost("Partial derivatives, multiple integrals, and gradient vectors are crucial in analyzing multivariable functions. Applications include optimizing functions and visualizing data in multiple dimensions.", discussion13c, student7);
        Post post13c2 = createPost("In my project, I used gradient vectors to find the direction of maximum increase in a multivariable function, aiding in optimization tasks.", discussion13c, student8);

// Create Posts for Discussion 13d
        Post post13d1 = createPost("Theorems of vector calculus like Green's, Stokes', and the Divergence Theorem help analyze vector fields, with applications in electromagnetism and fluid dynamics.", discussion13d, student7);
        Post post13d2 = createPost("I applied Stokes' Theorem to calculate the circulation of a vector field in a fluid dynamics problem, enhancing my understanding of flow patterns.", discussion13d, student8);

// Create Posts for Discussion 14a
        Post post14a1 = createPost("Propositional and predicate logic are used to form logical statements and reason about problems. They are fundamental in computer science, mathematics, and philosophy.", discussion14a, student7);
        Post post14a2 = createPost("In my experience, using predicate logic has been essential in verifying the correctness of algorithms in computer science projects.", discussion14a, student8);

// Create Posts for Discussion 14b
        Post post14b1 = createPost("Set theory concepts like subsets, unions, intersections, and Cartesian products have practical applications in database theory, probability, and computer science.", discussion14b, student7);
        Post post14b2 = createPost("I used set theory in a project to manage data relationships in a database, ensuring efficient querying and data integrity.", discussion14b, student8);

// Create Posts for Discussion 14c
        Post post14c1 = createPost("Graph theory facilitates modeling relationships between objects using graphs and algorithms. Applications include social network analysis, routing algorithms, and bioinformatics.", discussion14c, student7);
        Post post14c2 = createPost("In my project, I used graph algorithms to optimize delivery routes, reducing transportation costs and improving efficiency.", discussion14c, student8);

// Create Posts for Discussion 14d
        Post post14d1 = createPost("Permutations, combinations, and the principles of counting are used to solve combinatorial problems. Applications include probability, statistics, and operations research.", discussion14d, student7);
        Post post14d2 = createPost("I applied combinatorial principles to calculate the probability of specific outcomes in a game theory problem, providing strategic insights.", discussion14d, student8);

        // Create Posts for Discussion 15a
        Post post15a1 = createPost("Newton's laws of motion describe how forces affect the motion of objects. These laws can be applied to solve problems in mechanics by analyzing forces, accelerations, and resulting movements.", discussion15a, student7);
        Post post15a2 = createPost("In my project, I used Newton's second law to calculate the acceleration of a car given its mass and the applied force, which helped in designing a more efficient engine.", discussion15a, student8);

// Create Posts for Discussion 15b
        Post post15b1 = createPost("Kinetic and potential energy principles help in understanding how energy is conserved and transferred. Concepts like work, power, and efficiency are crucial for analyzing energy systems.", discussion15b, student7);
        Post post15b2 = createPost("I applied these principles to calculate the efficiency of a solar panel system, optimizing its energy output and cost-effectiveness.", discussion15b, student8);

// Create Posts for Discussion 15c
        Post post15c1 = createPost("Velocity, acceleration, and the equations of motion are used to analyze various types of motion, such as linear, projectile, and circular motion, providing insights into the dynamics of moving objects.", discussion15c, student7);
        Post post15c2 = createPost("In my project, I used the equations of motion to predict the trajectory of a projectile, which was essential for targeting in a physics simulation.", discussion15c, student8);

// Create Posts for Discussion 16a
        Post post16a1 = createPost("Subatomic particles like protons, neutrons, and electrons define the properties of elements. The atomic number and mass number determine the behavior of atoms and their chemical properties.", discussion16a, student7);
        Post post16a2 = createPost("Understanding atomic structure helped me predict the reactivity of elements, which was useful in designing chemical experiments.", discussion16a, student8);

// Create Posts for Discussion 16b
        Post post16b1 = createPost("Ionic, covalent, and metallic bonds differ in their formation and properties. These bonds influence the stability and properties of molecules and compounds.", discussion16b, student7);
        Post post16b2 = createPost("I used knowledge of chemical bonding to explain why certain materials have high melting points and conductivity, which was crucial in material science projects.", discussion16b, student8);

// Create Posts for Discussion 16c
        Post post16c1 = createPost("Factors like reaction rates, equilibrium, and the nature of reactants and products influence chemical reactions. Understanding these principles helps in controlling and optimizing reactions.", discussion16c, student7);
        Post post16c2 = createPost("I applied these concepts to design a reaction process for synthesizing a compound efficiently, which was essential in a pharmaceutical project.", discussion16c, student8);

        // Create Posts for Discussion 17a
        Post post17a1 = createPost("Prokaryotic cells lack a defined nucleus and organelles, while eukaryotic cells have a nucleus and complex organelles. These differences are significant as they influence the complexity and functionality of the cells.", discussion17a, student9);
        Post post17a2 = createPost("In my research, I found that the compartmentalization in eukaryotic cells allows for more specialized functions, leading to greater cellular efficiency.", discussion17a, student10);

// Create Posts for Discussion 17b
        Post post17b1 = createPost("Mendelian genetics explains how traits are inherited through dominant and recessive alleles. DNA replication, transcription, and translation are key processes in genetic inheritance and variation.", discussion17b, student9);
        Post post17b2 = createPost("I studied how genetic variations arise from mutations during DNA replication, which contributes to diversity within populations.", discussion17b, student10);

// Create Posts for Discussion 17c
        Post post17c1 = createPost("Genetic variation and environmental factors drive natural selection, leading to the evolution of species. Evidence for evolutionary change includes fossil records and genetic similarities among species.", discussion17c, student9);
        Post post17c2 = createPost("I explored how environmental pressures can lead to adaptations in species, supporting the theory of evolution through natural selection.", discussion17c, student10);

// Create Posts for Discussion 17d
        Post post17d1 = createPost("Interactions between organisms and their environment shape ecosystems by influencing food webs and energy flow. Human activities like deforestation and pollution have significant impacts on these systems.", discussion17d, student9);
        Post post17d2 = createPost("In my study, I analyzed how urbanization disrupts natural food webs, leading to a decline in biodiversity and ecosystem health.", discussion17d, student10);

// Create Posts for Discussion 18a
        Post post18a1 = createPost("Civil, mechanical, electrical, and chemical engineers have distinct roles and responsibilities, each contributing to different applications such as infrastructure, machinery, electronics, and chemical processes.", discussion18a, student9);
        Post post18a2 = createPost("In my experience, working on a multidisciplinary project highlighted the diverse applications and collaborative nature of different engineering disciplines.", discussion18a, student10);

// Create Posts for Discussion 18b
        Post post18b1 = createPost("The engineering problem-solving process involves defining the problem, brainstorming solutions, prototyping, testing, and iterating. These steps are crucial for tackling real-world engineering challenges effectively.", discussion18b, student9);
        Post post18b2 = createPost("I applied these techniques to solve a mechanical failure in a prototype, improving the design and functionality of the final product.", discussion18b, student10);

// Create Posts for Discussion 18c
        Post post18c1 = createPost("The engineering design process facilitates the development of effective solutions by moving through stages like defining requirements, brainstorming, prototyping, testing, and iterating.", discussion18c, student9);
        Post post18c2 = createPost("In my project, following the design process helped ensure all requirements were met and allowed for continuous improvement through testing and iteration.", discussion18c, student10);

        // Create Posts for Discussion 19a
        Post post19a1 = createPost("Ohm's law and Kirchhoff's laws are essential for analyzing electrical circuits by calculating voltage, current, and resistance. These laws are applied in both DC and AC circuits to ensure accurate circuit analysis.", discussion19a, student9);
        Post post19a2 = createPost("In my project, I used Kirchhoff's laws to solve complex circuit networks, ensuring proper current distribution and voltage levels.", discussion19a, student10);

// Create Posts for Discussion 19b
        Post post19b1 = createPost("Fourier transforms and filtering are key concepts in signal processing. They are used in communication systems and digital signal processing (DSP) to analyze and modify signals for better transmission and clarity.", discussion19b, student9);
        Post post19b2 = createPost("I applied Fourier transforms in a project to analyze frequency components of a signal, which improved the efficiency of data transmission.", discussion19b, student10);

// Create Posts for Discussion 19c
        Post post19c1 = createPost("System modeling, feedback, and control systems are crucial for designing electrical systems. These concepts help in maintaining desired system behavior and stability, with applications in various engineering fields.", discussion19c, student9);
        Post post19c2 = createPost("In my project, I used feedback control to maintain the temperature in a heating system, ensuring consistent performance and energy efficiency.", discussion19c, student10);

// Create Posts for Discussion 20a
        Post post20a1 = createPost("The principles of statics help in analyzing force systems and calculating moments in bodies at rest. Practical applications include structural analysis in buildings and bridges to ensure stability and safety.", discussion20a, student9);
        Post post20a2 = createPost("In my project, I applied static equilibrium principles to design a stable support structure for a bridge, ensuring it could withstand various loads.", discussion20a, student10);

// Create Posts for Discussion 20b
        Post post20b1 = createPost("Kinematics and kinetics are essential for understanding the motion of particles and rigid bodies. Newton's laws of motion are applied to analyze dynamics and predict the behavior of moving objects.", discussion20b, student9);
        Post post20b2 = createPost("I used Newton's laws to calculate the forces acting on a moving vehicle, optimizing its design for better performance and safety.", discussion20b, student10);

// Create Posts for Discussion 20c
        Post post20c1 = createPost("The laws of thermodynamics and principles of energy transfer apply to the behavior of gases and liquids. These principles are used to solve engineering problems involving heat and work, such as in engines and refrigeration systems.", discussion20c, student9);
        Post post20c2 = createPost("I applied thermodynamic principles to design an efficient cooling system, improving energy efficiency and performance.", discussion20c, student10);

// Create Posts for Discussion 20d
        Post post20d1 = createPost("The properties and behaviors of different materials influence their selection for specific engineering applications. Examples include using metals for strength, polymers for flexibility, and composites for lightweight structures.", discussion20d, student9);
        Post post20d2 = createPost("In my project, I selected materials based on their properties to design a durable and lightweight drone, enhancing its performance and longevity.", discussion20d, student10);


        Comment comment1a1 = createComment("This is a great explanation of how variables can be used in programming. I like the example you provided about keeping track of player scores.", post1a1, student2);
        Comment comment1b1 = createComment("Your insights on type conversion and its importance in data manipulation are very helpful.", post1b1, student2);
        Comment comment1c1 = createComment("The traffic light control system example really clarifies how conditional statements work. Nice job!", post1c1, student2);
        Comment comment1d1 = createComment("I appreciate your explanation of functions and their role in code organization. Very clear and concise.", post1d1, student2);
        Comment comment1e1 = createComment("Great insights on modular programming and its benefits for code maintainability.", post1e1, student2);
        Comment comment1f1 = createComment("Libraries like NumPy are indeed powerful tools. Your explanation is very informative.", post1f1, student2);

        Comment comment2a1 = createComment("Your explanation of arrays and their efficiency in data management is well-articulated.", post2a1, student2);
        Comment comment2b1 = createComment("Great insights on linked lists and their advantages over arrays. Very informative.", post2b1, student2);
        Comment comment2c1 = createComment("I like the example of using stacks in undo mechanisms. It makes the concept very relatable.", post2c1, student2);
        Comment comment2d1 = createComment("Your explanation of queues in operating systems is very clear. Thanks for sharing.", post2d1, student2);
        Comment comment2e1 = createComment("Excellent summary of tree data structures and their applications. Well done!", post2e1, student2);
        Comment comment2f1 = createComment("Great overview of graph algorithms and their real-world applications. Very useful.", post2f1, student2);

        Comment comment3a1 = createComment("Your explanation of sorting algorithms is very clear. I appreciate the detailed comparison between bubble sort, merge sort, and quicksort.", post3a1, student2);
        Comment comment3b1 = createComment("Great insights on linear and binary search! Your explanation of their differences and use cases is very helpful.", post3b1, student2);
        Comment comment3c1 = createComment("I like how you explained the applications of DFS and BFS. The examples you provided make the concepts easy to understand.", post3c1, student2);
        Comment comment3d1 = createComment("Dynamic programming can be tricky, but you broke it down really well. The knapsack problem example was particularly useful.", post3d1, student2);

        Comment comment4a1 = createComment("Your explanation of relational databases and the use of tables, keys, and relationships is very clear. It highlights the importance of data integrity and reducing redundancy.", post4a1, student2);
        Comment comment4b1 = createComment("Great overview of common SQL queries! Your explanation of their roles in database management is very helpful.", post4b1, student2);
        Comment comment4c1 = createComment("Your discussion of ACID properties and their importance in ensuring reliable transactions is very well explained.", post4c1, student2);
        Comment comment4d1 = createComment("Excellent explanation of normalized database schemas and their benefits for data integrity and efficiency.", post4d1, student2);

        Comment comment5a1 = createComment("Great explanation of process management in operating systems. Your insights on inter-process communication are very helpful.", post5a1, student4);
        Comment comment5b1 = createComment("Your discussion on memory management techniques is very clear. I appreciate the detailed comparison of paging, segmentation, and virtual memory.", post5b1, student4);
        Comment comment5c1 = createComment("I like your explanation of file systems and their organization. The examples you provided make the concepts easy to understand.", post5c1, student4);
        Comment comment5d1 = createComment("Excellent overview of CPU scheduling algorithms. Your explanation of their impact on process execution efficiency is very informative.", post5d1, student4);

        Comment comment6a1 = createComment("Your explanation of the OSI model and its seven layers is very clear. It highlights the importance of standardized telecommunication systems.", post6a1, student4);
        Comment comment6b1 = createComment("Great comparison between the OSI model and the TCP/IP model! Your explanation of their differences and applications is very helpful.", post6b1, student4);
        Comment comment6c1 = createComment("Your discussion of network protocols like HTTP and FTP is very well explained. I appreciate the practical examples.", post6c1, student4);
        Comment comment6d1 = createComment("Excellent explanation of routing algorithms and protocols. Your insights on OSPF and BGP are very clear.", post6d1, student4);
        Comment comment6e1 = createComment("Your explanation of switching methods and their roles in network design is very informative. Great job!", post6e1, student4);

        Comment comment7a1 = createComment("Great discussion on different SDLC models. Your comparison of iterative, incremental, and spiral approaches is very useful.", post7a1, student4);
        Comment comment7b1 = createComment("Your insights on Agile methodology and its practices are very clear. I appreciate the detailed explanation of Scrum and Kanban.", post7b1, student4);
        Comment comment7c1 = createComment("I like your explanation of the Waterfall model and its advantages and disadvantages. The comparison with Agile is very informative.", post7c1, student4);
        Comment comment7d1 = createComment("Excellent overview of project management techniques. Your discussion on risk management and resource allocation is very helpful.", post7d1, student4);

        // Create Comments for the first post in each discussion by student4
        Comment comment8a1 = createComment("Your explanation of HTML tags and their role in structuring web content is very clear. Great insights on accessibility and semantics.", post8a1, student4);
        Comment comment8b1 = createComment("Great discussion on CSS and its role in enhancing web presentation. Your explanation of responsive design techniques is very helpful.", post8b1, student4);
        Comment comment8c1 = createComment("Your insights on JavaScript and its role in creating dynamic web content are very clear. I appreciate the practical examples.", post8c1, student4);
        Comment comment8d1 = createComment("Excellent explanation of React's core concepts. Your discussion on components, state, and props is very informative.", post8d1, student4);
        Comment comment8e1 = createComment("Your explanation of integrating front-end applications with backend services using RESTful APIs is very clear. Great job on explaining server-side rendering.", post8e1, student4);

        Comment comment9a1 = createComment("Your explanation of machine learning techniques and their real-world applications is very informative. I appreciate the practical examples.", post9a1, student6);
        Comment comment9b1 = createComment("Great breakdown of neural networks and backpropagation! Your explanation of their functions and applications is very clear.", post9b1, student6);
        Comment comment9c1 = createComment("Your insights on natural language processing and its applications are very helpful. The examples you provided make the concepts easy to understand.", post9c1, student6);


        Comment comment10a1 = createComment("Your explanation of identifying security threats and implementing mitigation strategies is very clear. The practical examples you provided are very helpful.", post10a1, student6);
        Comment comment10b1 = createComment("Great insights on encryption techniques! Your explanation of their importance in data protection is very informative.", post10b1, student6);
        Comment comment10c1 = createComment("Your discussion on network security measures is very well explained. I appreciate the practical examples you provided.", post10c1, student6);
        Comment comment10d1 = createComment("Excellent explanation of common security flaws in software development and the importance of secure coding practices.", post10d1, student6);

        Comment comment11a1 = createComment("Your explanation of limits and their importance in defining continuity and understanding functions is very clear. The practical examples you provided are very helpful.", post11a1, student6);
        Comment comment11b1 = createComment("Great insights on differentiation techniques! Your explanation of their applications in real-world problems is very informative.", post11b1, student6);
        Comment comment11c1 = createComment("Your discussion on integrals and their applications in various fields is very well explained. I appreciate the practical examples.", post11c1, student6);
        Comment comment11d1 = createComment("Excellent explanation of how calculus can be applied to solve real-world problems. Your discussion on different fields is very informative.", post11d1, student6);

        Comment comment12a1 = createComment("Your explanation of vector operations and their applications in various fields is very clear. The practical examples you provided are very helpful.", post12a1, student6);
        Comment comment12b1 = createComment("Great insights on matrix operations! Your explanation of their practical applications in computer graphics and engineering is very informative.", post12b1, student6);
        Comment comment12c1 = createComment("Your discussion on determinants and their role in solving linear systems is very well explained. I appreciate the practical examples.", post12c1, student6);
        Comment comment12d1 = createComment("Excellent explanation of eigenvalues and their significance in understanding matrix properties. Your discussion on their applications is very helpful.", post12d1, student6);
        Comment comment12e1 = createComment("Your explanation of eigenvectors and their importance in linear transformations is very clear. The practical examples you provided are very informative.", post12e1, student6);

        Comment comment13a1 = createComment("Your explanation of convergence tests and their applications in solving mathematical problems is very clear. The practical examples you provided are very helpful.", post13a1, student8);
        Comment comment13b1 = createComment("Great insights on key integration techniques! Your explanation of their applications in physics and engineering is very informative.", post13b1, student8);
        Comment comment13c1 = createComment("Your discussion on partial derivatives, multiple integrals, and gradient vectors is very well explained. I appreciate the practical examples.", post13c1, student8);
        Comment comment13d1 = createComment("Excellent explanation of theorems of vector calculus and their applications. Your discussion on electromagnetism and fluid dynamics is very helpful.", post13d1, student8);

        Comment comment14a1 = createComment("Your explanation of propositional and predicate logic is very clear. The practical examples you provided are very helpful.", post14a1, student8);
        Comment comment14b1 = createComment("Great insights on set theory concepts! Your explanation of their practical applications in database theory and probability is very informative.", post14b1, student8);
        Comment comment14c1 = createComment("Your discussion on graph theory and its applications is very well explained. I appreciate the practical examples.", post14c1, student8);
        Comment comment14d1 = createComment("Excellent explanation of permutations, combinations, and the principles of counting. Your discussion on their applications in various fields is very helpful.", post14d1, student8);

        Comment comment15a1 = createComment("Great explanation of Newton's laws of motion! Your practical example of calculating acceleration is very informative.", post15a1, student8);
        Comment comment15b1 = createComment("Your insights on kinetic and potential energy principles are very clear. The example of optimizing a solar panel system is very helpful.", post15b1, student8);
        Comment comment15c1 = createComment("Excellent discussion on velocity, acceleration, and the equations of motion. The projectile prediction example is very well explained.", post15c1, student8);

        Comment comment16a1 = createComment("Your explanation of subatomic particles and their properties is very clear. The practical example you provided is very helpful.", post16a1, student8);
        Comment comment16b1 = createComment("Great insights on different types of chemical bonds! Your explanation of their properties and stability is very informative.", post16b1, student8);
        Comment comment16c1 = createComment("Your discussion on factors influencing chemical reactions is very well explained. The example of designing a reaction process is very useful.", post16c1, student8);

        Comment comment17a1 = createComment("Your explanation of the differences between prokaryotic and eukaryotic cells is very clear. I appreciate the detailed comparison.", post17a1, student10);
        Comment comment17b1 = createComment("Great insights on Mendelian genetics! Your explanation of genetic inheritance and variation is very informative.", post17b1, student10);
        Comment comment17c1 = createComment("Your discussion on genetic variation and natural selection is very well explained. I appreciate the practical examples you provided.", post17c1, student10);
        Comment comment17d1 = createComment("Excellent explanation of ecosystem interactions and human impacts. Your insights on food webs and energy flow are very clear.", post17d1, student10);

        Comment comment18a1 = createComment("Your explanation of the different engineering disciplines is very clear. The practical examples you provided are very helpful.", post18a1, student10);
        Comment comment18b1 = createComment("Great discussion on the engineering problem-solving process! Your explanation of its importance in real-world challenges is very informative.", post18b1, student10);
        Comment comment18c1 = createComment("Your discussion on the engineering design process is very well explained. I appreciate the practical examples you provided.", post18c1, student10);

        Comment comment19a1 = createComment("Your explanation of Ohm's law and Kirchhoff's laws is very clear. The practical examples you provided are very helpful.", post19a1, student10);
        Comment comment19b1 = createComment("Great insights on Fourier transforms and filtering! Your explanation of their applications in signal processing is very informative.", post19b1, student10);
        Comment comment19c1 = createComment("Your discussion on system modeling, feedback, and control systems is very well explained. I appreciate the practical examples you provided.", post19c1, student10);

        Comment comment20a1 = createComment("Excellent explanation of the principles of statics! Your practical example of applying static equilibrium principles is very informative.", post20a1, student10);
        Comment comment20b1 = createComment("Your insights on kinematics and kinetics are very clear. The practical example you provided is very helpful.", post20b1, student10);
        Comment comment20c1 = createComment("Great discussion on the laws of thermodynamics and energy transfer principles! Your explanation of their applications in engineering problems is very informative.", post20c1, student10);
        Comment comment20d1 = createComment("Your explanation of the properties and behaviors of different materials is very clear. The practical example you provided is very helpful.", post20d1, student10);

        //Schedules
        Schedule scheduleStudent1 = createSchedule("Student 1's Fall Schedule", "List of courses for student 1 in fall 2024", student1, fall2024, course1, course2, course3, course4);
        Schedule scheduleStudent2 = createSchedule("Student 2's Fall Schedule", "List of courses for student 2 in fall 2024", student2, fall2024, course1, course2, course3, course4);
        Schedule scheduleStudent3 = createSchedule("Student 3's Fall Schedule", "List of courses for Student 3 in Fall 2024", student3, fall2024, course5, course6, course7, course8);
        Schedule scheduleStudent4 = createSchedule("Student 4's Fall Schedule", "List of courses for Student 4 in Fall 2024", student4, fall2024, course5, course6, course7, course8);
        Schedule scheduleStudent5 = createSchedule("Student 5's Fall Schedule", "List of courses for Student 5 in Fall 2024", student5, fall2024, course9, course10, course11, course12);
        Schedule scheduleStudent6 = createSchedule("Student 6's Fall Schedule", "List of courses for Student 6 in Fall 2024", student6, fall2024, course9, course10, course11, course12);
        Schedule scheduleStudent7 = createSchedule("Student 7's Fall Schedule", "List of courses for Student 7 in Fall 2024", student7, fall2024, course13, course14, course15, course16);
        Schedule scheduleStudent8 = createSchedule("Student 8's Fall Schedule", "List of courses for Student 8 in Fall 2024", student8, fall2024, course13, course14, course15, course16);
        Schedule scheduleStudent9 = createSchedule("Student 9's Fall Schedule", "List of courses for Student 9 in Fall 2024", student9, fall2024, course17, course18, course19, course20);
        Schedule scheduleStudent10 = createSchedule("Student 10's Fall Schedule", "List of courses for Student 10 in Fall 2024", student10, fall2024, course17, course18, course19, course20);

        //Course 1 Unit 1 Assignment
        // Creating the assignment
        Assignment assignment = createAssignment("Variables Assignment", faculty1, Date.from(LocalDate.of(2024, 12, 31).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa1_1_1 = createProblemAnswer("What is a variable in programming?", "A variable in programming is a storage location identified by a name that holds data which can be changed during the program's execution.");
        addAssignmentToProblemAnswer(pa1_1_1, assignment);
        addProblemAnswerToAssignment(assignment, pa1_1_1);

        ProblemAnswer pa1_1_2 = createProblemAnswer("How do you declare a variable in Python?", "To declare a variable in Python, you simply write the variable name followed by an equal sign and the value you want to assign. For example: `x = 5`.");
        addAssignmentToProblemAnswer(pa1_1_2, assignment);
        addProblemAnswerToAssignment(assignment, pa1_1_2);

        ProblemAnswer pa1_1_3 = createProblemAnswer("What is the importance of variables in programming?", "Variables are essential in programming because they allow developers to store, retrieve, and manipulate data, making the code more dynamic and flexible.");
        addAssignmentToProblemAnswer(pa1_1_3, assignment);
        addProblemAnswerToAssignment(assignment, pa1_1_3);

        ProblemAnswer pa1_1_4 = createProblemAnswer("How can you change the value of a variable once it has been assigned?", "You can change the value of a variable by reassigning it with a new value. For example: `x = 5` can be changed to `x = 10`.");
        addAssignmentToProblemAnswer(pa1_1_4, assignment);
        addProblemAnswerToAssignment(assignment, pa1_1_4);

        ProblemAnswer pa1_1_5 = createProblemAnswer("What are the rules for naming variables in Python?", "Variable names in Python must start with a letter (a-z, A-Z) or an underscore (_), followed by letters, digits (0-9), or underscores. They cannot start with a digit and are case-sensitive.");
        addAssignmentToProblemAnswer(pa1_1_5, assignment);
        addProblemAnswerToAssignment(assignment, pa1_1_5);

        ProblemAnswer pa1_1_6 = createProblemAnswer("Why is it important to use meaningful variable names?", "Using meaningful variable names makes the code more readable and maintainable, as it helps others (and yourself) understand the purpose of the variables without needing additional comments.");
        addAssignmentToProblemAnswer(pa1_1_6, assignment);
        addProblemAnswerToAssignment(assignment, pa1_1_6);

        ProblemAnswer pa1_1_7 = createProblemAnswer("What is the difference between a variable and a constant?", "A variable can change its value during the execution of a program, while a constant holds a fixed value that does not change.");
        addAssignmentToProblemAnswer(pa1_1_7, assignment);
        addProblemAnswerToAssignment(assignment, pa1_1_7);

        ProblemAnswer pa1_1_8 = createProblemAnswer("Can a variable hold different data types in Python?", "Yes, a variable in Python can hold different data types such as integers, floats, strings, and booleans. Python is dynamically typed, meaning the type of a variable can change during runtime.");
        addAssignmentToProblemAnswer(pa1_1_8, assignment);
        addProblemAnswerToAssignment(assignment, pa1_1_8);

        ProblemAnswer pa1_1_9 = createProblemAnswer("How do you delete a variable in Python?", "You can delete a variable in Python using the `del` statement. For example, `del x` will delete the variable `x`.");
        addAssignmentToProblemAnswer(pa1_1_9, assignment);
        addProblemAnswerToAssignment(assignment, pa1_1_9);

        ProblemAnswer pa1_1_10 = createProblemAnswer("What is variable scope, and why is it important?", "Variable scope refers to the context in which a variable is accessible. It is important because it prevents variable name conflicts and helps in organizing the code by limiting the variable's visibility.");
        addAssignmentToProblemAnswer(pa1_1_10, assignment);
        addProblemAnswerToAssignment(assignment, pa1_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Variables' unit created with 10 problem answers.");

        //Course 1 Unit 2 Assignment

        // Creating the assignment with the due date specified inline
        Assignment assignment2 = createAssignment("Data Types Assignment", faculty1, Date.from(LocalDate.of(2025, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_1_2_1 = createProblemAnswer("What are the primary data types in Python?", "The primary data types in Python are integers, floats, strings, and booleans.");
        addAssignmentToProblemAnswer(pa_1_2_1, assignment2);
        addProblemAnswerToAssignment(assignment2, pa_1_2_1);

        ProblemAnswer pa_1_2_2 = createProblemAnswer("How do you define an integer in Python?", "An integer in Python is defined by assigning a whole number to a variable, such as `x = 10`.");
        addAssignmentToProblemAnswer(pa_1_2_2, assignment2);
        addProblemAnswerToAssignment(assignment2, pa_1_2_2);

        ProblemAnswer pa_1_2_3 = createProblemAnswer("What is the difference between an integer and a float?", "An integer is a whole number without a decimal point, while a float is a number that includes a decimal point, such as `3.14`.");
        addAssignmentToProblemAnswer(pa_1_2_3, assignment2);
        addProblemAnswerToAssignment(assignment2, pa_1_2_3);

        ProblemAnswer pa_1_2_4 = createProblemAnswer("How can you convert a string to an integer in Python?", "You can convert a string to an integer using the `int()` function, for example, `int(\"10\")` will convert the string `\"10\"` to the integer `10`.");
        addAssignmentToProblemAnswer(pa_1_2_4, assignment2);
        addProblemAnswerToAssignment(assignment2, pa_1_2_4);

        ProblemAnswer pa_1_2_5 = createProblemAnswer("What is a boolean data type and how is it used in Python?", "A boolean data type represents one of two values: `True` or `False`. It is often used in conditional statements to control the flow of a program.");
        addAssignmentToProblemAnswer(pa_1_2_5, assignment2);
        addProblemAnswerToAssignment(assignment2, pa_1_2_5);

        ProblemAnswer pa_1_2_6 = createProblemAnswer("How can you check the data type of a variable in Python?", "You can check the data type of a variable using the `type()` function. For example, `type(x)` will return the data type of the variable `x`.");
        addAssignmentToProblemAnswer(pa_1_2_6, assignment2);
        addProblemAnswerToAssignment(assignment2, pa_1_2_6);

        ProblemAnswer pa_1_2_7 = createProblemAnswer("What is type casting and why is it useful in Python?", "Type casting is the process of converting a variable from one data type to another. It is useful for operations that require a specific data type, such as mathematical calculations or string manipulations.");
        addAssignmentToProblemAnswer(pa_1_2_7, assignment2);
        addProblemAnswerToAssignment(assignment2, pa_1_2_7);

        ProblemAnswer pa_1_2_8 = createProblemAnswer("How do you define a string in Python?", "A string in Python is defined by enclosing text in quotes, such as `name = \"Alice\"`.");
        addAssignmentToProblemAnswer(pa_1_2_8, assignment2);
        addProblemAnswerToAssignment(assignment2, pa_1_2_8);

        ProblemAnswer pa_1_2_9 = createProblemAnswer("How can you convert a float to a string in Python?", "You can convert a float to a string using the `str()` function. For example, `str(3.14)` will convert the float `3.14` to the string `\"3.14\"`.");
        addAssignmentToProblemAnswer(pa_1_2_9, assignment2);
        addProblemAnswerToAssignment(assignment2, pa_1_2_9);

        ProblemAnswer pa_1_2_10 = createProblemAnswer("What is the difference between mutable and immutable data types in Python?", "Mutable data types can be changed after their creation (e.g., lists, dictionaries), while immutable data types cannot be changed once they are created (e.g., strings, tuples).");
        addAssignmentToProblemAnswer(pa_1_2_10, assignment2);
        addProblemAnswerToAssignment(assignment2, pa_1_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Data Types' unit created with 10 problem answers and due date " + Date.from(LocalDate.of(2025, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()));

        // Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment3 = createAssignment("Control Structures Assignment", faculty1, Date.from(LocalDate.of(2025, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_1_3_1 = createProblemAnswer("What are control structures in programming?", "Control structures are constructs that control the flow of execution in a program. They include loops and conditional statements, allowing for repeated execution of code and decision-making.");
        addAssignmentToProblemAnswer(pa_1_3_1, assignment3);
        addProblemAnswerToAssignment(assignment3, pa_1_3_1);

        ProblemAnswer pa_1_3_2 = createProblemAnswer("How do you write a `for` loop in Python?", "A `for` loop in Python is written using the `for` keyword followed by a variable, the `in` keyword, and a sequence. For example:\n```python\nfor i in range(5):\n    print(i)\n```");
        addAssignmentToProblemAnswer(pa_1_3_2, assignment3);
        addProblemAnswerToAssignment(assignment3, pa_1_3_2);

        ProblemAnswer pa_1_3_3 = createProblemAnswer("What is the difference between a `for` loop and a `while` loop?", "A `for` loop iterates over a sequence of elements, such as a list or range, whereas a `while` loop continues executing as long as a specified condition is true.");
        addAssignmentToProblemAnswer(pa_1_3_3, assignment3);
        addProblemAnswerToAssignment(assignment3, pa_1_3_3);

        ProblemAnswer pa_1_3_4 = createProblemAnswer("How do you write a `while` loop in Python?", "A `while` loop in Python is written using the `while` keyword followed by a condition. For example:\n```python\nx = 0\nwhile x < 5:\n    print(x)\n    x += 1\n```");
        addAssignmentToProblemAnswer(pa_1_3_4, assignment3);
        addProblemAnswerToAssignment(assignment3, pa_1_3_4);

        ProblemAnswer pa_1_3_5 = createProblemAnswer("What are conditional statements in Python?", "Conditional statements allow a program to execute certain pieces of code based on whether a condition is true or false. They include `if`, `elif`, and `else`.");
        addAssignmentToProblemAnswer(pa_1_3_5, assignment3);
        addProblemAnswerToAssignment(assignment3, pa_1_3_5);

        ProblemAnswer pa_1_3_6 = createProblemAnswer("How do you write an `if` statement in Python?", "An `if` statement in Python is written using the `if` keyword followed by a condition and a colon. The indented code block below it will execute if the condition is true. For example:\n```python\nif x > 0:\n    print(\"x is positive\")\n```");
        addAssignmentToProblemAnswer(pa_1_3_6, assignment3);
        addProblemAnswerToAssignment(assignment3, pa_1_3_6);

        ProblemAnswer pa_1_3_7 = createProblemAnswer("What is the purpose of the `elif` keyword in Python?", "The `elif` keyword, short for \"else if,\" allows for multiple conditions to be checked in sequence after an initial `if` condition. If the initial `if` condition is false, the `elif` condition will be checked next.");
        addAssignmentToProblemAnswer(pa_1_3_7, assignment3);
        addProblemAnswerToAssignment(assignment3, pa_1_3_7);

        ProblemAnswer pa_1_3_8 = createProblemAnswer("How do you write an `else` statement in Python?", "An `else` statement in Python follows an `if` or `elif` statement and executes if all previous conditions are false. For example:\n```python\nif x > 0:\n    print(\"x is positive\")\nelif x == 0:\n    print(\"x is zero\")\nelse:\n    print(\"x is negative\")\n```");
        addAssignmentToProblemAnswer(pa_1_3_8, assignment3);
        addProblemAnswerToAssignment(assignment3, pa_1_3_8);

        ProblemAnswer pa_1_3_9 = createProblemAnswer("Can you nest control structures within each other? Provide an example.", "Yes, control structures can be nested within each other. For example, a `for` loop can contain an `if` statement:\n```python\nfor i in range(10):\n    if i % 2 == 0:\n        print(i, \"is even\")\n    else:\n        print(i, \"is odd\")\n```");
        addAssignmentToProblemAnswer(pa_1_3_9, assignment3);
        addProblemAnswerToAssignment(assignment3, pa_1_3_9);

        ProblemAnswer pa_1_3_10 = createProblemAnswer("What are the benefits of using control structures in programming?", "Control structures enhance the flexibility and efficiency of code by enabling decision-making, iteration, and the organization of complex logic into manageable parts.");
        addAssignmentToProblemAnswer(pa_1_3_10, assignment3);
        addProblemAnswerToAssignment(assignment3, pa_1_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Control Structures' unit created with 10 problem answers, due date, faculty, and syllabus.");
        // Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment4 = createAssignment("Functions Assignment", faculty1, Date.from(LocalDate.of(2025, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_1_4_1 = createProblemAnswer("What is a function in programming?", "A function in programming is a block of code that performs a specific task. It can take inputs, process them, and return an output.");
        addAssignmentToProblemAnswer(pa_1_4_1, assignment4);
        addProblemAnswerToAssignment(assignment4, pa_1_4_1);

        ProblemAnswer pa_1_4_2 = createProblemAnswer("How do you define a function in Python?", "You define a function in Python using the `def` keyword followed by the function name and parentheses. For example:\n```python\ndef greet():\n    print(\"Hello, world!\")\n```");
        addAssignmentToProblemAnswer(pa_1_4_2, assignment4);
        addProblemAnswerToAssignment(assignment4, pa_1_4_2);

        ProblemAnswer pa_1_4_3 = createProblemAnswer("What are parameters in a function?", "Parameters are variables listed inside the parentheses in the function definition. They act as placeholders for the values that are passed to the function when it is called.");
        addAssignmentToProblemAnswer(pa_1_4_3, assignment4);
        addProblemAnswerToAssignment(assignment4, pa_1_4_3);

        ProblemAnswer pa_1_4_4 = createProblemAnswer("How do you call a function in Python?", "You call a function by using its name followed by parentheses. If the function has parameters, you pass arguments inside the parentheses. For example:\n```python\ngreet()\n```");
        addAssignmentToProblemAnswer(pa_1_4_4, assignment4);
        addProblemAnswerToAssignment(assignment4, pa_1_4_4);

        ProblemAnswer pa_1_4_5 = createProblemAnswer("What is the difference between a parameter and an argument?", "A parameter is a variable in the function definition, whereas an argument is the actual value passed to the function when it is called.");
        addAssignmentToProblemAnswer(pa_1_4_5, assignment4);
        addProblemAnswerToAssignment(assignment4, pa_1_4_5);

        ProblemAnswer pa_1_4_6 = createProblemAnswer("How do you return a value from a function in Python?", "You return a value from a function using the `return` keyword. For example:\n```python\ndef add(a, b):\n    return a + b\n```");
        addAssignmentToProblemAnswer(pa_1_4_6, assignment4);
        addProblemAnswerToAssignment(assignment4, pa_1_4_6);

        ProblemAnswer pa_1_4_7 = createProblemAnswer("What is a recursive function?", "A recursive function is a function that calls itself in order to solve a problem. It typically has a base case to prevent infinite recursion.");
        addAssignmentToProblemAnswer(pa_1_4_7, assignment4);
        addProblemAnswerToAssignment(assignment4, pa_1_4_7);

        ProblemAnswer pa_1_4_8 = createProblemAnswer("How do you define a function with default parameters in Python?", "You define a function with default parameters by assigning values to the parameters in the function definition. For example:\n```python\ndef greet(name=\"world\"):\n    print(\"Hello, \" + name)\n```");
        addAssignmentToProblemAnswer(pa_1_4_8, assignment4);
        addProblemAnswerToAssignment(assignment4, pa_1_4_8);

        ProblemAnswer pa_1_4_9 = createProblemAnswer("What are the advantages of using functions in programming?", "Functions help in organizing and modularizing code, making it easier to read, maintain, and reuse. They also allow for code abstraction and simplify complex tasks.");
        addAssignmentToProblemAnswer(pa_1_4_9, assignment4);
        addProblemAnswerToAssignment(assignment4, pa_1_4_9);

        ProblemAnswer pa_1_4_10 = createProblemAnswer("Can you have a function within a function in Python? Provide an example.", "Yes, you can define a function within a function in Python. This is called a nested function. For example:\n```python\ndef outer_function():\n    def inner_function():\n        print(\"Hello from the inner function!\")\n    inner_function()\n```");
        addAssignmentToProblemAnswer(pa_1_4_10, assignment4);
        addProblemAnswerToAssignment(assignment4, pa_1_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Functions' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment5 = createAssignment("Modules Assignment", faculty1, Date.from(LocalDate.of(2025, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_1_5_1 = createProblemAnswer("What is a module in Python?", "A module in Python is a file containing Python code that defines functions, classes, and variables. It allows for organizing and reusing code across different programs.");
        addAssignmentToProblemAnswer(pa_1_5_1, assignment5);
        addProblemAnswerToAssignment(assignment5, pa_1_5_1);

        ProblemAnswer pa_1_5_2 = createProblemAnswer("How do you import a module in Python?", "You import a module in Python using the `import` keyword followed by the module name. For example:\n```python\nimport math\n```");
        addAssignmentToProblemAnswer(pa_1_5_2, assignment5);
        addProblemAnswerToAssignment(assignment5, pa_1_5_2);

        ProblemAnswer pa_1_5_3 = createProblemAnswer("What is the purpose of using modules in Python?", "Modules allow for better organization of code, code reuse, and separation of concerns. They make the code more maintainable and scalable.");
        addAssignmentToProblemAnswer(pa_1_5_3, assignment5);
        addProblemAnswerToAssignment(assignment5, pa_1_5_3);

        ProblemAnswer pa_1_5_4 = createProblemAnswer("How do you access functions and variables from an imported module?", "You can access functions and variables from an imported module using the dot notation. For example:\n```python\nimport math\nprint(math.sqrt(16))\n```");
        addAssignmentToProblemAnswer(pa_1_5_4, assignment5);
        addProblemAnswerToAssignment(assignment5, pa_1_5_4);

        ProblemAnswer pa_1_5_5 = createProblemAnswer("How can you import specific functions or variables from a module?", "You can import specific functions or variables from a module using the `from` keyword. For example:\n```python\nfrom math import sqrt\nprint(sqrt(16))\n```");
        addAssignmentToProblemAnswer(pa_1_5_5, assignment5);
        addProblemAnswerToAssignment(assignment5, pa_1_5_5);

        ProblemAnswer pa_1_5_6 = createProblemAnswer("What is a built-in module in Python? Give an example.", "A built-in module in Python is a module that comes pre-installed with Python. An example is the `os` module, which provides functions for interacting with the operating system.");
        addAssignmentToProblemAnswer(pa_1_5_6, assignment5);
        addProblemAnswerToAssignment(assignment5, pa_1_5_6);

        ProblemAnswer pa_1_5_7 = createProblemAnswer("How do you create your own module in Python?", "You create your own module in Python by writing Python code in a file and saving it with a `.py` extension. For example, creating a file named `mymodule.py` with functions and variables.");
        addAssignmentToProblemAnswer(pa_1_5_7, assignment5);
        addProblemAnswerToAssignment(assignment5, pa_1_5_7);

        ProblemAnswer pa_1_5_8 = createProblemAnswer("How do you reload a module after it has been modified?", "You can reload a module after it has been modified using the `importlib.reload()` function from the `importlib` module. For example:\n```python\nimport importlib\nimport mymodule\nimportlib.reload(mymodule)\n```");
        addAssignmentToProblemAnswer(pa_1_5_8, assignment5);
        addProblemAnswerToAssignment(assignment5, pa_1_5_8);

        ProblemAnswer pa_1_5_9 = createProblemAnswer("What is the `__name__` variable in a Python module?", "The `__name__` variable in a Python module is a special built-in variable that evaluates to `'__main__'` if the module is run as the main program, or to the module's name if it is imported.");
        addAssignmentToProblemAnswer(pa_1_5_9, assignment5);
        addProblemAnswerToAssignment(assignment5, pa_1_5_9);

        ProblemAnswer pa_1_5_10 = createProblemAnswer("What are the benefits of using modules in Python?", "The benefits of using modules in Python include code reusability, better organization, easier maintenance, and the ability to use external libraries and frameworks to extend the functionality of programs.");
        addAssignmentToProblemAnswer(pa_1_5_10, assignment5);
        addProblemAnswerToAssignment(assignment5, pa_1_5_10);

// Output for confirmation
        System.out.println("Assignment for 'Modules' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6 = createAssignment("Libraries Assignment", faculty1, Date.from(LocalDate.of(2025, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_1_6_1 = createProblemAnswer("What is a library in Python?", "A library in Python is a collection of pre-written code that provides useful functionalities for various tasks. Libraries help in extending the capabilities of Python programs without writing code from scratch.");
        addAssignmentToProblemAnswer(pa_1_6_1, assignment6);
        addProblemAnswerToAssignment(assignment6, pa_1_6_1);

        ProblemAnswer pa_1_6_2 = createProblemAnswer("How do you install a library in Python?", "You can install a library in Python using the `pip` package manager. For example, to install the `requests` library, you use the command:\n```bash\npip install requests\n```");
        addAssignmentToProblemAnswer(pa_1_6_2, assignment6);
        addProblemAnswerToAssignment(assignment6, pa_1_6_2);

        ProblemAnswer pa_1_6_3 = createProblemAnswer("What is the difference between a library and a module in Python?", "A module is a single file containing Python code, while a library is a collection of modules organized to provide specific functionalities. Libraries often include multiple modules and packages.");
        addAssignmentToProblemAnswer(pa_1_6_3, assignment6);
        addProblemAnswerToAssignment(assignment6, pa_1_6_3);

        ProblemAnswer pa_1_6_4 = createProblemAnswer("How do you import a library in Python?", "You import a library in Python using the `import` keyword followed by the library name. For example:\n```python\nimport requests\n```");
        addAssignmentToProblemAnswer(pa_1_6_4, assignment6);
        addProblemAnswerToAssignment(assignment6, pa_1_6_4);

        ProblemAnswer pa_1_6_5 = createProblemAnswer("What are some popular Python libraries, and what are they used for?", "Some popular Python libraries include:\n- `NumPy`: Used for numerical computations.\n- `Pandas`: Used for data manipulation and analysis.\n- `Matplotlib`: Used for data visualization.\n- `requests`: Used for making HTTP requests.");
        addAssignmentToProblemAnswer(pa_1_6_5, assignment6);
        addProblemAnswerToAssignment(assignment6, pa_1_6_5);

        ProblemAnswer pa_1_6_6 = createProblemAnswer("How do you read the documentation for a Python library?", "You can read the documentation for a Python library by visiting its official website or documentation page. For example, the documentation for the `requests` library is available at [https://docs.python-requests.org/](https://docs.python-requests.org/).");
        addAssignmentToProblemAnswer(pa_1_6_6, assignment6);
        addProblemAnswerToAssignment(assignment6, pa_1_6_6);

        ProblemAnswer pa_1_6_7 = createProblemAnswer("How do you update a library in Python?", "You can update a library in Python using the `pip` package manager with the `--upgrade` option. For example, to update the `requests` library, you use the command:\n```bash\npip install --upgrade requests\n```");
        addAssignmentToProblemAnswer(pa_1_6_7, assignment6);
        addProblemAnswerToAssignment(assignment6, pa_1_6_7);

        ProblemAnswer pa_1_6_8 = createProblemAnswer("How can you uninstall a library in Python?", "You can uninstall a library in Python using the `pip` package manager with the `uninstall` option. For example, to uninstall the `requests` library, you use the command:\n```bash\npip uninstall requests\n```");
        addAssignmentToProblemAnswer(pa_1_6_8, assignment6);
        addProblemAnswerToAssignment(assignment6, pa_1_6_8);

        ProblemAnswer pa_1_6_9 = createProblemAnswer("What is a virtual environment, and why is it useful when working with libraries?", "A virtual environment is an isolated environment for Python projects that allows you to manage dependencies separately for each project. It is useful because it prevents conflicts between library versions and ensures that each project has the required libraries without affecting other projects.");
        addAssignmentToProblemAnswer(pa_1_6_9, assignment6);
        addProblemAnswerToAssignment(assignment6, pa_1_6_9);

        ProblemAnswer pa_1_6_10 = createProblemAnswer("How do you create and activate a virtual environment in Python?", "You can create a virtual environment in Python using the `venv` module and activate it using the appropriate command for your operating system. For example, on Windows:\n```bash\npython -m venv myenv\nmyenv\\Scripts\\activate\n```\nOn Unix or MacOS:\n```bash\npython3 -m venv myenv\nsource myenv/bin/activate\n```");
        addAssignmentToProblemAnswer(pa_1_6_10, assignment6);
        addProblemAnswerToAssignment(assignment6, pa_1_6_10);

// Output for confirmation
        System.out.println("Assignment for 'Libraries' unit created with 10 problem answers, due date, faculty, and syllabus.");

// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_1 = createAssignment("Arrays Assignment", faculty2, Date.from(LocalDate.of(2025, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_2_1_1 = createProblemAnswer("What is an array in programming?", "An array is a collection of elements, typically of the same data type, stored in contiguous memory locations.");
        addAssignmentToProblemAnswer(pa_2_1_1, assignment2_1);
        addProblemAnswerToAssignment(assignment2_1, pa_2_1_1);

        ProblemAnswer pa_2_1_2 = createProblemAnswer("How do you declare an array in Python?", "In Python, arrays are not a built-in type. However, you can use lists or the `array` module. For example:\n```python\nimport array as arr\nmy_array = arr.array('i', [1, 2, 3, 4, 5])\n```");
        addAssignmentToProblemAnswer(pa_2_1_2, assignment2_1);
        addProblemAnswerToAssignment(assignment2_1, pa_2_1_2);

        ProblemAnswer pa_2_1_3 = createProblemAnswer("What are the advantages of using arrays?", "Arrays allow for efficient data storage and retrieval. They provide quick access to elements using indices and have a fixed size, which can help optimize memory usage.");
        addAssignmentToProblemAnswer(pa_2_1_3, assignment2_1);
        addProblemAnswerToAssignment(assignment2_1, pa_2_1_3);

        ProblemAnswer pa_2_1_4 = createProblemAnswer("How do you access an element in an array?", "You access an element in an array using its index. For example, `my_array[0]` would return the first element of the array `my_array`.");
        addAssignmentToProblemAnswer(pa_2_1_4, assignment2_1);
        addProblemAnswerToAssignment(assignment2_1, pa_2_1_4);

        ProblemAnswer pa_2_1_5 = createProblemAnswer("How do you update an element in an array?", "You update an element in an array by assigning a new value to the desired index. For example, `my_array[0] = 10` would change the first element to `10`.");
        addAssignmentToProblemAnswer(pa_2_1_5, assignment2_1);
        addProblemAnswerToAssignment(assignment2_1, pa_2_1_5);

        ProblemAnswer pa_2_1_6 = createProblemAnswer("What is the difference between a 1-dimensional array and a 2-dimensional array?", "A 1-dimensional array is a single list of elements, while a 2-dimensional array (or matrix) is a list of lists, where each inner list represents a row of elements.");
        addAssignmentToProblemAnswer(pa_2_1_6, assignment2_1);
        addProblemAnswerToAssignment(assignment2_1, pa_2_1_6);

        ProblemAnswer pa_2_1_7 = createProblemAnswer("How do you iterate through an array in Python?", "You can iterate through an array using a `for` loop. For example:\n```python\nfor element in my_array:\n    print(element)\n```");
        addAssignmentToProblemAnswer(pa_2_1_7, assignment2_1);
        addProblemAnswerToAssignment(assignment2_1, pa_2_1_7);

        ProblemAnswer pa_2_1_8 = createProblemAnswer("What is an array's index, and why is it important?", "An array's index is the position of an element within the array, starting from 0. It is important because it allows for direct access and manipulation of specific elements.");
        addAssignmentToProblemAnswer(pa_2_1_8, assignment2_1);
        addProblemAnswerToAssignment(assignment2_1, pa_2_1_8);

        ProblemAnswer pa_2_1_9 = createProblemAnswer("How do you find the length of an array in Python?", "You can find the length of an array using the `len()` function. For example, `len(my_array)` returns the number of elements in the array.");
        addAssignmentToProblemAnswer(pa_2_1_9, assignment2_1);
        addProblemAnswerToAssignment(assignment2_1, pa_2_1_9);

        ProblemAnswer pa_2_1_10 = createProblemAnswer("What are some common operations performed on arrays?", "Common operations on arrays include searching, sorting, inserting, deleting elements, and iterating through the array.");
        addAssignmentToProblemAnswer(pa_2_1_10, assignment2_1);
        addProblemAnswerToAssignment(assignment2_1, pa_2_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Arrays' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_2 = createAssignment("Linked Lists Assignment", faculty2, Date.from(LocalDate.of(2025, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_2_2_1 = createProblemAnswer("What is a linked list in programming?", "A linked list is a data structure consisting of nodes, where each node contains a data value and a reference (or link) to the next node in the sequence.");
        addAssignmentToProblemAnswer(pa_2_2_1, assignment2_2);
        addProblemAnswerToAssignment(assignment2_2, pa_2_2_1);

        ProblemAnswer pa_2_2_2 = createProblemAnswer("How do you define a node in a linked list?", "A node in a linked list is an element that contains a data value and a reference to the next node. In Python, you can define a node using a class:\n```python\nclass Node:\n    def __init__(self, data):\n        self.data = data\n        self.next = None\n```");
        addAssignmentToProblemAnswer(pa_2_2_2, assignment2_2);
        addProblemAnswerToAssignment(assignment2_2, pa_2_2_2);

        ProblemAnswer pa_2_2_3 = createProblemAnswer("What are the advantages of using linked lists?", "Linked lists allow for efficient insertion and deletion of elements, especially when dealing with dynamic data structures where the size can change frequently. They also use memory efficiently for large datasets.");
        addAssignmentToProblemAnswer(pa_2_2_3, assignment2_2);
        addProblemAnswerToAssignment(assignment2_2, pa_2_2_3);

        ProblemAnswer pa_2_2_4 = createProblemAnswer("How do you insert an element at the beginning of a linked list?", "To insert an element at the beginning of a linked list, create a new node and set its reference to the current head of the list, then update the head to this new node:\n```python\nnew_node = Node(data)\nnew_node.next = head\nhead = new_node\n```");
        addAssignmentToProblemAnswer(pa_2_2_4, assignment2_2);
        addProblemAnswerToAssignment(assignment2_2, pa_2_2_4);

        ProblemAnswer pa_2_2_5 = createProblemAnswer("What is the difference between a singly linked list and a doubly linked list?", "A singly linked list contains nodes with a reference to the next node only, while a doubly linked list contains nodes with references to both the next and previous nodes, allowing traversal in both directions.");
        addAssignmentToProblemAnswer(pa_2_2_5, assignment2_2);
        addProblemAnswerToAssignment(assignment2_2, pa_2_2_5);

        ProblemAnswer pa_2_2_6 = createProblemAnswer("How do you traverse a linked list?", "You traverse a linked list by starting at the head node and following the references to each subsequent node until you reach the end of the list:\n```python\ncurrent = head\nwhile current:\n    print(current.data)\n    current = current.next\n```");
        addAssignmentToProblemAnswer(pa_2_2_6, assignment2_2);
        addProblemAnswerToAssignment(assignment2_2, pa_2_2_6);

        ProblemAnswer pa_2_2_7 = createProblemAnswer("How do you delete an element from a linked list?", "To delete an element from a linked list, update the reference of the previous node to skip the node to be deleted:\n```python\nif head.data == key:\n    head = head.next\nelse:\n    current = head\n    while current.next and current.next.data != key:\n        current = current.next\n    if current.next:\n        current.next = current.next.next\n```");
        addAssignmentToProblemAnswer(pa_2_2_7, assignment2_2);
        addProblemAnswerToAssignment(assignment2_2, pa_2_2_7);

        ProblemAnswer pa_2_2_8 = createProblemAnswer("What is the role of the head node in a linked list?", "The head node is the first node in a linked list. It serves as the entry point for any operations performed on the list, such as traversal, insertion, and deletion.");
        addAssignmentToProblemAnswer(pa_2_2_8, assignment2_2);
        addProblemAnswerToAssignment(assignment2_2, pa_2_2_8);

        ProblemAnswer pa_2_2_9 = createProblemAnswer("How do you reverse a linked list?", "To reverse a linked list, change the direction of the links between nodes. Here’s an example:\n```python\nprev = None\ncurrent = head\nwhile current:\n    next_node = current.next\n    current.next = prev\n    prev = current\n    current = next_node\nhead = prev\n```");
        addAssignmentToProblemAnswer(pa_2_2_9, assignment2_2);
        addProblemAnswerToAssignment(assignment2_2, pa_2_2_9);

        ProblemAnswer pa_2_2_10 = createProblemAnswer("What are some common operations performed on linked lists?", "Common operations on linked lists include insertion, deletion, traversal, searching, and reversing the list.");
        addAssignmentToProblemAnswer(pa_2_2_10, assignment2_2);
        addProblemAnswerToAssignment(assignment2_2, pa_2_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Linked Lists' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_3 = createAssignment("Stacks Assignment", faculty2, Date.from(LocalDate.of(2025, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_2_3_1 = createProblemAnswer("What is a stack in programming?", "A stack is a linear data structure that follows the Last-In, First-Out (LIFO) principle, where the last element added is the first one to be removed.");
        addAssignmentToProblemAnswer(pa_2_3_1, assignment2_3);
        addProblemAnswerToAssignment(assignment2_3, pa_2_3_1);

        ProblemAnswer pa_2_3_2 = createProblemAnswer("How do you implement a stack in Python?", "You can implement a stack in Python using a list. For example:\n```python\nstack = []\nstack.append(1)\nstack.append(2)\nstack.pop()\n```");
        addAssignmentToProblemAnswer(pa_2_3_2, assignment2_3);
        addProblemAnswerToAssignment(assignment2_3, pa_2_3_2);

        ProblemAnswer pa_2_3_3 = createProblemAnswer("What are the main operations of a stack?", "The main operations of a stack are `push` (adding an element to the top), `pop` (removing the top element), and `peek` (viewing the top element without removing it).");
        addAssignmentToProblemAnswer(pa_2_3_3, assignment2_3);
        addProblemAnswerToAssignment(assignment2_3, pa_2_3_3);

        ProblemAnswer pa_2_3_4 = createProblemAnswer("How do you check if a stack is empty in Python?", "You can check if a stack is empty by verifying if its length is zero. For example:\n```python\nif len(stack) == 0:\n    print(\"Stack is empty\")\n```");
        addAssignmentToProblemAnswer(pa_2_3_4, assignment2_3);
        addProblemAnswerToAssignment(assignment2_3, pa_2_3_4);

        ProblemAnswer pa_2_3_5 = createProblemAnswer("What is the `peek` operation in a stack?", "The `peek` operation returns the top element of the stack without removing it, allowing you to inspect the top element.");
        addAssignmentToProblemAnswer(pa_2_3_5, assignment2_3);
        addProblemAnswerToAssignment(assignment2_3, pa_2_3_5);

        ProblemAnswer pa_2_3_6 = createProblemAnswer("How do you implement the `push` operation in a stack using a class in Python?", "You can implement the `push` operation by defining a method in a stack class. For example:\n```python\nclass Stack {\n  public Stack() {\n    this.items = new LinkedList<>();\n  }\n  public void push(Object item) {\n    this.items.addFirst(item);\n  }\n}\n```");
        addAssignmentToProblemAnswer(pa_2_3_6, assignment2_3);
        addProblemAnswerToAssignment(assignment2_3, pa_2_3_6);

        ProblemAnswer pa_2_3_7 = createProblemAnswer("How do you implement the `pop` operation in a stack using a class in Python?", "You can implement the `pop` operation by defining a method in a stack class. For example:\n```python\nclass Stack {\n  public Stack() {\n    this.items = new LinkedList<>();\n  }\n  public void push(Object item) {\n    this.items.addFirst(item);\n  }\n  public Object pop() {\n    if (!this.items.isEmpty()) {\n      return this.items.removeFirst();\n    }\n    return null;\n  }\n}\n```");
        addAssignmentToProblemAnswer(pa_2_3_7, assignment2_3);
        addProblemAnswerToAssignment(assignment2_3, pa_2_3_7);

        ProblemAnswer pa_2_3_8 = createProblemAnswer("What are some common applications of stacks in programming?", "Common applications of stacks include expression evaluation, syntax parsing, function call management, undo mechanisms in software, and backtracking algorithms.");
        addAssignmentToProblemAnswer(pa_2_3_8, assignment2_3);
        addProblemAnswerToAssignment(assignment2_3, pa_2_3_8);

        ProblemAnswer pa_2_3_9 = createProblemAnswer("How does the LIFO principle work in a stack?", "The LIFO principle means that the last element added to the stack will be the first one to be removed. This allows for operations such as reversing a sequence or tracking nested structures.");
        addAssignmentToProblemAnswer(pa_2_3_9, assignment2_3);
        addProblemAnswerToAssignment(assignment2_3, pa_2_3_9);

        ProblemAnswer pa_2_3_10 = createProblemAnswer("How do you implement the `peek` operation in a stack using a class in Python?", "You can implement the `peek` operation by defining a method in a stack class. For example:\n```python\nclass Stack {\n  public Stack() {\n    this.items = new LinkedList<>();\n  }\n  public void push(Object item) {\n    this.items.addFirst(item);\n  }\n  public Object pop() {\n    if (!this.items.isEmpty()) {\n      return this.items.removeFirst();\n    }\n    return null;\n  }\n  public Object peek() {\n    if (!this.items.isEmpty()) {\n      return this.items.getFirst();\n    }\n    return null;\n  }\n}\n```");
        addAssignmentToProblemAnswer(pa_2_3_10, assignment2_3);
        addProblemAnswerToAssignment(assignment2_3, pa_2_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Stacks' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_4 = createAssignment("Queues Assignment", faculty2, Date.from(LocalDate.of(2025, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_2_4_1 = createProblemAnswer("What is a queue in programming?", "A queue is a linear data structure that follows the First-In, First-Out (FIFO) principle, where the first element added is the first one to be removed.");
        addAssignmentToProblemAnswer(pa_2_4_1, assignment2_4);
        addProblemAnswerToAssignment(assignment2_4, pa_2_4_1);

        ProblemAnswer pa_2_4_2 = createProblemAnswer("How do you implement a queue in Python?", "You can implement a queue in Python using a list or `collections.deque`. For example, using `collections.deque`:\n```python\nfrom collections import deque\nqueue = deque()\nqueue.append(1)\nqueue.append(2)\nqueue.popleft()\n```");
        addAssignmentToProblemAnswer(pa_2_4_2, assignment2_4);
        addProblemAnswerToAssignment(assignment2_4, pa_2_4_2);

        ProblemAnswer pa_2_4_3 = createProblemAnswer("What are the main operations of a queue?", "The main operations of a queue are `enqueue` (adding an element to the rear), `dequeue` (removing the front element), and `peek` (viewing the front element without removing it).");
        addAssignmentToProblemAnswer(pa_2_4_3, assignment2_4);
        addProblemAnswerToAssignment(assignment2_4, pa_2_4_3);

        ProblemAnswer pa_2_4_4 = createProblemAnswer("How do you check if a queue is empty in Python?", "You can check if a queue is empty by verifying if its length is zero. For example:\n```python\nif len(queue) == 0:\n    print(\"Queue is empty\")\n```");
        addAssignmentToProblemAnswer(pa_2_4_4, assignment2_4);
        addProblemAnswerToAssignment(assignment2_4, pa_2_4_4);

        ProblemAnswer pa_2_4_5 = createProblemAnswer("What is the `peek` operation in a queue?", "The `peek` operation returns the front element of the queue without removing it, allowing you to inspect the front element.");
        addAssignmentToProblemAnswer(pa_2_4_5, assignment2_4);
        addProblemAnswerToAssignment(assignment2_4, pa_2_4_5);

        ProblemAnswer pa_2_4_6 = createProblemAnswer("How do you implement the `enqueue` operation in a queue using a class in Python?", "You can implement the `enqueue` operation by defining a method in a queue class. For example:\n```python\nclass Queue:\n    def __init__(self):\n        self.items = deque()\n\n    def enqueue(self, item):\n        self.items.append(item)\n```");
        addAssignmentToProblemAnswer(pa_2_4_6, assignment2_4);
        addProblemAnswerToAssignment(assignment2_4, pa_2_4_6);

        ProblemAnswer pa_2_4_7 = createProblemAnswer("How do you implement the `dequeue` operation in a queue using a class in Python?", "You can implement the `dequeue` operation by defining a method in a queue class. For example:\n```python\nclass Queue:\n    def __init__(self):\n        self.items = deque()\n\n    def enqueue(self, item):\n        self.items.append(item)\n\n    def dequeue(self):\n        if not self.is_empty():\n            return self.items.popleft()\n        return None\n\n    def is_empty(self):\n        return len(self.items) == 0\n```");
        addAssignmentToProblemAnswer(pa_2_4_7, assignment2_4);
        addProblemAnswerToAssignment(assignment2_4, pa_2_4_7);

        ProblemAnswer pa_2_4_8 = createProblemAnswer("What are some common applications of queues in programming?", "Common applications of queues include task scheduling, managing print jobs, handling requests in web servers, breadth-first search algorithms, and implementing cache mechanisms.");
        addAssignmentToProblemAnswer(pa_2_4_8, assignment2_4);
        addProblemAnswerToAssignment(assignment2_4, pa_2_4_8);

        ProblemAnswer pa_2_4_9 = createProblemAnswer("How does the FIFO principle work in a queue?", "The FIFO principle means that the first element added to the queue will be the first one to be removed. This is useful for scenarios where order needs to be maintained, such as processing tasks in the order they arrive.");
        addAssignmentToProblemAnswer(pa_2_4_9, assignment2_4);
        addProblemAnswerToAssignment(assignment2_4, pa_2_4_9);

        ProblemAnswer pa_2_4_10 = createProblemAnswer("How do you implement the `peek` operation in a queue using a class in Python?", "You can implement the `peek` operation by defining a method in a queue class. For example:\n```python\nclass Queue:\n    def __init__(self):\n        self.items = deque()\n\n    def enqueue(self, item):\n        self.items.append(item)\n\n    def dequeue(self):\n        if not self.is_empty():\n            return self.items.popleft()\n        return None\n\n    def peek(self):\n        if not self.is_empty():\n            return self.items[0]\n        return None\n\n    def is_empty(self):\n        return len(self.items) == 0\n```");
        addAssignmentToProblemAnswer(pa_2_4_10, assignment2_4);
        addProblemAnswerToAssignment(assignment2_4, pa_2_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Queues' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_5 = createAssignment("Trees Assignment", faculty2, Date.from(LocalDate.of(2025, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_2_5_1 = createProblemAnswer("What is a tree in programming?", "A tree is a hierarchical data structure that consists of nodes connected by edges. Each node has a value and a list of references to its child nodes, with a single node called the root.");
        addAssignmentToProblemAnswer(pa_2_5_1, assignment2_5);
        addProblemAnswerToAssignment(assignment2_5, pa_2_5_1);

        ProblemAnswer pa_2_5_2 = createProblemAnswer("How do you define a node in a tree?", "A node in a tree is an element that contains a value and a list of references to its child nodes. In Python, you can define a node using a class:\n```python\nclass TreeNode {\n    public TreeNode(Object data) {\n        this.data = data;\n        this.children = new ArrayList<>();\n    }\n}\n```");
        addAssignmentToProblemAnswer(pa_2_5_2, assignment2_5);
        addProblemAnswerToAssignment(assignment2_5, pa_2_5_2);

        ProblemAnswer pa_2_5_3 = createProblemAnswer("What are the advantages of using trees?", "Trees allow for efficient data organization and manipulation, making operations such as searching, insertion, and deletion faster compared to other data structures. They also represent hierarchical relationships naturally.");
        addAssignmentToProblemAnswer(pa_2_5_3, assignment2_5);
        addProblemAnswerToAssignment(assignment2_5, pa_2_5_3);

        ProblemAnswer pa_2_5_4 = createProblemAnswer("How do you perform a depth-first search (DFS) on a tree?", "To perform a depth-first search (DFS) on a tree, start at the root node and explore as far as possible along each branch before backtracking. Here's an example in Python:\n```python\ndef dfs(node):\n    if not node:\n        return\n    print(node.data)\n    for child in node.children:\n        dfs(child)\n```");
        addAssignmentToProblemAnswer(pa_2_5_4, assignment2_5);
        addProblemAnswerToAssignment(assignment2_5, pa_2_5_4);

        ProblemAnswer pa_2_5_5 = createProblemAnswer("What is a binary tree?", "A binary tree is a type of tree in which each node has at most two child nodes, referred to as the left child and the right child.");
        addAssignmentToProblemAnswer(pa_2_5_5, assignment2_5);
        addProblemAnswerToAssignment(assignment2_5, pa_2_5_5);

        ProblemAnswer pa_2_5_6 = createProblemAnswer("How do you perform a breadth-first search (BFS) on a tree?", "To perform a breadth-first search (BFS) on a tree, start at the root node and explore all nodes at the present depth level before moving on to nodes at the next depth level. Here's an example in Python:\n```python\nfrom collections import deque\n\ndef bfs(root):\n    queue = deque([root])\n    while queue:\n        node = queue.popleft()\n        print(node.data)\n        for child in node.children:\n            queue.append(child)\n```");
        addAssignmentToProblemAnswer(pa_2_5_6, assignment2_5);
        addProblemAnswerToAssignment(assignment2_5, pa_2_5_6);

        ProblemAnswer pa_2_5_7 = createProblemAnswer("What is a binary search tree (BST)?", "A binary search tree (BST) is a type of binary tree in which the left child of a node contains a value less than the node's value, and the right child contains a value greater than the node's value.");
        addAssignmentToProblemAnswer(pa_2_5_7, assignment2_5);
        addProblemAnswerToAssignment(assignment2_5, pa_2_5_7);

        ProblemAnswer pa_2_5_8 = createProblemAnswer("How do you insert a node into a binary search tree?", "To insert a node into a binary search tree, start at the root and compare the new node's value to the current node's value. If the new value is less, move to the left child; if greater, move to the right child. Repeat this process until you find an empty spot. Here's an example in Python:\n```python\nclass BSTNode {\n    public BSTNode(int data) {\n        this.data = data;\n        this.left = null;\n        this.right = null;\n    }\n}\n\nclass BST {\n    public BST() {\n        this.root = null;\n    }\n\n    public void insert(int data) {\n        this.root = this.insertRec(this.root, data);\n    }\n\n    private BSTNode insertRec(BSTNode root, int data) {\n        if (root == null) {\n            root = new BSTNode(data);\n            return root;\n        }\n\n        if (data < root.data) {\n            root.left = this.insertRec(root.left, data);\n        } else if (data > root.data) {\n            root.right = this.insertRec(root.right, data);\n        }\n\n        return root;\n    }\n}\n```");
        addAssignmentToProblemAnswer(pa_2_5_8, assignment2_5);
        addProblemAnswerToAssignment(assignment2_5, pa_2_5_8);

        ProblemAnswer pa_2_5_9 = createProblemAnswer("What is the height of a tree?", "The height of a tree is the length of the longest path from the root node to a leaf node. It represents the maximum depth of the tree.");
        addAssignmentToProblemAnswer(pa_2_5_9, assignment2_5);
        addProblemAnswerToAssignment(assignment2_5, pa_2_5_9);

        ProblemAnswer pa_2_5_10 = createProblemAnswer("What are some common operations performed on trees?", "Common operations on trees include traversal (in-order, pre-order, post-order), insertion, deletion, searching, and calculating the height or depth of the tree.");
        addAssignmentToProblemAnswer(pa_2_5_10, assignment2_5);
        addProblemAnswerToAssignment(assignment2_5, pa_2_5_10);

// Output for confirmation
        System.out.println("Assignment for 'Trees' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_6 = createAssignment("Graphs Assignment", faculty2, Date.from(LocalDate.of(2025, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_2_6_1 = createProblemAnswer("What is a graph in programming?", "A graph is a data structure consisting of nodes (vertices) and edges that connect pairs of nodes. It is used to represent relationships between elements.");
        addAssignmentToProblemAnswer(pa_2_6_1, assignment2_6);
        addProblemAnswerToAssignment(assignment2_6, pa_2_6_1);

        ProblemAnswer pa_2_6_2 = createProblemAnswer("How do you represent a graph using an adjacency list?", "A graph can be represented using an adjacency list, where each node has a list of its adjacent nodes. For example:\n```python\nclass Graph {\n  public Graph() {\n    this.adj_list = new HashMap<>();\n  }\n}\n```");
        addAssignmentToProblemAnswer(pa_2_6_2, assignment2_6);
        addProblemAnswerToAssignment(assignment2_6, pa_2_6_2);

        ProblemAnswer pa_2_6_3 = createProblemAnswer("What are the advantages of using graphs?", "Graphs are versatile and can model various real-world problems such as social networks, transportation networks, and dependency relationships. They provide efficient ways to find shortest paths, detect cycles, and traverse nodes.");
        addAssignmentToProblemAnswer(pa_2_6_3, assignment2_6);
        addProblemAnswerToAssignment(assignment2_6, pa_2_6_3);

        ProblemAnswer pa_2_6_4 = createProblemAnswer("How do you perform a depth-first search (DFS) on a graph?", "To perform a depth-first search (DFS) on a graph, start at a chosen node and explore as far as possible along each branch before backtracking. Here's an example in Python:\n```python\ndef dfs(graph, start, visited=None):\n    if visited is None:\n        visited = set()\n    visited.add(start)\n    print(start)\n    for next in graph[start] - visited:\n        dfs(graph, next, visited)\n```");
        addAssignmentToProblemAnswer(pa_2_6_4, assignment2_6);
        addProblemAnswerToAssignment(assignment2_6, pa_2_6_4);

        ProblemAnswer pa_2_6_5 = createProblemAnswer("What is a directed graph?", "A directed graph (digraph) is a graph in which the edges have a direction, meaning they go from one node to another and not necessarily the other way around.");
        addAssignmentToProblemAnswer(pa_2_6_5, assignment2_6);
        addProblemAnswerToAssignment(assignment2_6, pa_2_6_5);

        ProblemAnswer pa_2_6_6 = createProblemAnswer("How do you perform a breadth-first search (BFS) on a graph?", "To perform a breadth-first search (BFS) on a graph, start at a chosen node and explore all adjacent nodes at the present depth level before moving on to nodes at the next depth level. Here's an example in Python:\n```python\nfrom collections import deque\n\ndef bfs(graph, start):\n    visited = set()\n    queue = deque([start])\n    while queue:\n        node = queue.popleft()\n        if node not in visited:\n            visited.add(node)\n            print(node)\n            queue.extend(graph[node] - visited)\n```");
        addAssignmentToProblemAnswer(pa_2_6_6, assignment2_6);
        addProblemAnswerToAssignment(assignment2_6, pa_2_6_6);

        ProblemAnswer pa_2_6_7 = createProblemAnswer("What is a weighted graph?", "A weighted graph is a graph in which each edge has an associated numerical value (weight), representing the cost or distance between the nodes it connects.");
        addAssignmentToProblemAnswer(pa_2_6_7, assignment2_6);
        addProblemAnswerToAssignment(assignment2_6, pa_2_6_7);

        ProblemAnswer pa_2_6_8 = createProblemAnswer("How do you find the shortest path in a graph using Dijkstra's algorithm?", "To find the shortest path in a graph using Dijkstra's algorithm, start at the source node, initialize distances to all other nodes as infinity, and update distances based on edge weights while visiting the nearest unvisited node. Here's an example in Python:\n```python\nimport heapq\n\ndef dijkstra(graph, start):\n    queue = []\n    heapq.heappush(queue, (0, start))\n    distances = {vertex: float('infinity') for vertex in graph}\n    distances[start] = 0\n\n    while queue:\n        current_distance, current_vertex = heapq.heappop(queue)\n\n        if current_distance > distances[current_vertex]:\n            continue\n\n        for neighbor, weight in graph[current_vertex].items():\n            distance = current_distance + weight\n            if distance < distances[neighbor]:\n                distances[neighbor] = distance\n                heapq.heappush(queue, (distance, neighbor))\n\n    return distances\n```");
        addAssignmentToProblemAnswer(pa_2_6_8, assignment2_6);
        addProblemAnswerToAssignment(assignment2_6, pa_2_6_8);

        ProblemAnswer pa_2_6_9 = createProblemAnswer("What is a cycle in a graph?", "A cycle in a graph is a path that starts and ends at the same node, forming a loop. It involves traversing at least one edge more than once.");
        addAssignmentToProblemAnswer(pa_2_6_9, assignment2_6);
        addProblemAnswerToAssignment(assignment2_6, pa_2_6_9);

        ProblemAnswer pa_2_6_10 = createProblemAnswer("What are some common operations performed on graphs?", "Common operations on graphs include traversal (DFS, BFS), finding shortest paths (Dijkstra's, Bellman-Ford), detecting cycles, and finding connected components.");
        addAssignmentToProblemAnswer(pa_2_6_10, assignment2_6);
        addProblemAnswerToAssignment(assignment2_6, pa_2_6_10);

// Output for confirmation
        System.out.println("Assignment for 'Graphs' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment3_1 = createAssignment("Sorting Assignment", faculty3, Date.from(LocalDate.of(2025, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_3_1_1 = createProblemAnswer("What is sorting in programming?", "Sorting is the process of arranging data in a particular order, typically ascending or descending.");
        addAssignmentToProblemAnswer(pa_3_1_1, assignment3_1);
        addProblemAnswerToAssignment(assignment3_1, pa_3_1_1);

        ProblemAnswer pa_3_1_2 = createProblemAnswer("How does bubble sort work?", "Bubble sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.");
        addAssignmentToProblemAnswer(pa_3_1_2, assignment3_1);
        addProblemAnswerToAssignment(assignment3_1, pa_3_1_2);

        ProblemAnswer pa_3_1_3 = createProblemAnswer("What is the time complexity of bubble sort?", "The time complexity of bubble sort is O(n^2) in the worst and average cases, where n is the number of elements in the list.");
        addAssignmentToProblemAnswer(pa_3_1_3, assignment3_1);
        addProblemAnswerToAssignment(assignment3_1, pa_3_1_3);

        ProblemAnswer pa_3_1_4 = createProblemAnswer("How does merge sort work?", "Merge sort divides the list into two halves, recursively sorts each half, and then merges the sorted halves to produce a sorted list.");
        addAssignmentToProblemAnswer(pa_3_1_4, assignment3_1);
        addProblemAnswerToAssignment(assignment3_1, pa_3_1_4);

        ProblemAnswer pa_3_1_5 = createProblemAnswer("What is the time complexity of merge sort?", "The time complexity of merge sort is O(n log n) in all cases, where n is the number of elements in the list.");
        addAssignmentToProblemAnswer(pa_3_1_5, assignment3_1);
        addProblemAnswerToAssignment(assignment3_1, pa_3_1_5);

        ProblemAnswer pa_3_1_6 = createProblemAnswer("How does quicksort work?", "Quicksort selects a pivot element, partitions the list into two sublists (elements less than the pivot and elements greater than the pivot), and recursively sorts the sublists.");
        addAssignmentToProblemAnswer(pa_3_1_6, assignment3_1);
        addProblemAnswerToAssignment(assignment3_1, pa_3_1_6);

        ProblemAnswer pa_3_1_7 = createProblemAnswer("What is the time complexity of quicksort?", "The time complexity of quicksort is O(n log n) on average, but it can degrade to O(n^2) in the worst case, where n is the number of elements in the list.");
        addAssignmentToProblemAnswer(pa_3_1_7, assignment3_1);
        addProblemAnswerToAssignment(assignment3_1, pa_3_1_7);

        ProblemAnswer pa_3_1_8 = createProblemAnswer("What is the difference between stable and unstable sorting algorithms?", "A stable sorting algorithm maintains the relative order of equal elements, while an unstable sorting algorithm does not.");
        addAssignmentToProblemAnswer(pa_3_1_8, assignment3_1);
        addProblemAnswerToAssignment(assignment3_1, pa_3_1_8);

        ProblemAnswer pa_3_1_9 = createProblemAnswer("Is bubble sort a stable sorting algorithm?", "Yes, bubble sort is a stable sorting algorithm because it maintains the relative order of equal elements.");
        addAssignmentToProblemAnswer(pa_3_1_9, assignment3_1);
        addProblemAnswerToAssignment(assignment3_1, pa_3_1_9);

        ProblemAnswer pa_3_1_10 = createProblemAnswer("Why is quicksort generally preferred over bubble sort?", "Quicksort is generally preferred over bubble sort because it has a better average-case time complexity (O(n log n) compared to O(n^2)), making it more efficient for larger datasets.");
        addAssignmentToProblemAnswer(pa_3_1_10, assignment3_1);
        addProblemAnswerToAssignment(assignment3_1, pa_3_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Sorting' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment3_2 = createAssignment("Searching Assignment", faculty3, Date.from(LocalDate.of(2025, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_3_2_1 = createProblemAnswer("What is searching in programming?", "Searching is the process of finding a specific element or value within a data structure, such as an array, list, or database.");
        addAssignmentToProblemAnswer(pa_3_2_1, assignment3_2);
        addProblemAnswerToAssignment(assignment3_2, pa_3_2_1);

        ProblemAnswer pa_3_2_2 = createProblemAnswer("How does linear search work?", "Linear search sequentially checks each element in a list until the desired element is found or the list ends.");
        addAssignmentToProblemAnswer(pa_3_2_2, assignment3_2);
        addProblemAnswerToAssignment(assignment3_2, pa_3_2_2);

        ProblemAnswer pa_3_2_3 = createProblemAnswer("What is the time complexity of linear search?", "The time complexity of linear search is O(n), where n is the number of elements in the list.");
        addAssignmentToProblemAnswer(pa_3_2_3, assignment3_2);
        addProblemAnswerToAssignment(assignment3_2, pa_3_2_3);

        ProblemAnswer pa_3_2_4 = createProblemAnswer("How does binary search work?", "Binary search works by repeatedly dividing the sorted list in half, comparing the target value to the middle element, and narrowing the search to the appropriate half until the target value is found or the search interval is empty.");
        addAssignmentToProblemAnswer(pa_3_2_4, assignment3_2);
        addProblemAnswerToAssignment(assignment3_2, pa_3_2_4);

        ProblemAnswer pa_3_2_5 = createProblemAnswer("What is the time complexity of binary search?", "The time complexity of binary search is O(log n), where n is the number of elements in the sorted list.");
        addAssignmentToProblemAnswer(pa_3_2_5, assignment3_2);
        addProblemAnswerToAssignment(assignment3_2, pa_3_2_5);

        ProblemAnswer pa_3_2_6 = createProblemAnswer("What is the difference between linear search and binary search?", "Linear search checks each element sequentially, while binary search divides the sorted list in half and eliminates half the search space in each step. Binary search is faster but requires the list to be sorted.");
        addAssignmentToProblemAnswer(pa_3_2_6, assignment3_2);
        addProblemAnswerToAssignment(assignment3_2, pa_3_2_6);

        ProblemAnswer pa_3_2_7 = createProblemAnswer("Can binary search be used on unsorted lists?", "No, binary search requires the list to be sorted in order to work correctly. Using it on an unsorted list will not yield accurate results.");
        addAssignmentToProblemAnswer(pa_3_2_7, assignment3_2);
        addProblemAnswerToAssignment(assignment3_2, pa_3_2_7);

        ProblemAnswer pa_3_2_8 = createProblemAnswer("What is the purpose of a search algorithm?", "The purpose of a search algorithm is to efficiently locate a specific element or value within a data structure, minimizing the number of comparisons and operations needed.");
        addAssignmentToProblemAnswer(pa_3_2_8, assignment3_2);
        addProblemAnswerToAssignment(assignment3_2, pa_3_2_8);

        ProblemAnswer pa_3_2_9 = createProblemAnswer("What is the time complexity of searching in a hash table?", "The average time complexity of searching in a hash table is O(1) due to direct indexing, but it can degrade to O(n) in the worst case if many collisions occur.");
        addAssignmentToProblemAnswer(pa_3_2_9, assignment3_2);
        addProblemAnswerToAssignment(assignment3_2, pa_3_2_9);

        ProblemAnswer pa_3_2_10 = createProblemAnswer("Why is binary search more efficient than linear search for large datasets?", "Binary search is more efficient for large datasets because it reduces the search space by half with each step, resulting in a logarithmic time complexity, compared to the linear time complexity of linear search.");
        addAssignmentToProblemAnswer(pa_3_2_10, assignment3_2);
        addProblemAnswerToAssignment(assignment3_2, pa_3_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Searching' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment3_3 = createAssignment("Graph Algorithms Assignment", faculty3, Date.from(LocalDate.of(2026, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_3_3_1 = createProblemAnswer("What is a graph algorithm?", "A graph algorithm is a procedure or formula used to solve problems related to graph theory, such as traversal, searching, and finding shortest paths.");
        addAssignmentToProblemAnswer(pa_3_3_1, assignment3_3);
        addProblemAnswerToAssignment(assignment3_3, pa_3_3_1);

        ProblemAnswer pa_3_3_2 = createProblemAnswer("How does depth-first search (DFS) work?", "Depth-first search (DFS) explores a graph by going as deep as possible along each branch before backtracking. It uses a stack to keep track of the nodes to be visited.");
        addAssignmentToProblemAnswer(pa_3_3_2, assignment3_3);
        addProblemAnswerToAssignment(assignment3_3, pa_3_3_2);

        ProblemAnswer pa_3_3_3 = createProblemAnswer("How does breadth-first search (BFS) work?", "Breadth-first search (BFS) explores a graph by visiting all the neighbors of a node before moving on to the next level of neighbors. It uses a queue to keep track of the nodes to be visited.");
        addAssignmentToProblemAnswer(pa_3_3_3, assignment3_3);
        addProblemAnswerToAssignment(assignment3_3, pa_3_3_3);

        ProblemAnswer pa_3_3_4 = createProblemAnswer("What is the time complexity of DFS and BFS?", "The time complexity of both DFS and BFS is O(V + E), where V is the number of vertices and E is the number of edges in the graph.");
        addAssignmentToProblemAnswer(pa_3_3_4, assignment3_3);
        addProblemAnswerToAssignment(assignment3_3, pa_3_3_4);

        ProblemAnswer pa_3_3_5 = createProblemAnswer("How do you implement DFS in Python?", "Here is a Python implementation of DFS:\n```python\ndef dfs(graph, start, visited=None):\n    if visited is None:\n        visited = set()\n    visited.add(start)\n    print(start)\n    for next in graph[start] - visited:\n        dfs(graph, next, visited)\n    return visited\n```");
        addAssignmentToProblemAnswer(pa_3_3_5, assignment3_3);
        addProblemAnswerToAssignment(assignment3_3, pa_3_3_5);

        ProblemAnswer pa_3_3_6 = createProblemAnswer("How do you implement BFS in Python?", "Here is a Python implementation of BFS:\n```python\nfrom collections import deque\n\ndef bfs(graph, start):\n    visited = set()\n    queue = deque([start])\n    while queue:\n        vertex = queue.popleft()\n        if vertex not in visited:\n            visited.add(vertex)\n            print(vertex)\n            queue.extend(graph[vertex] - visited)\n    return visited\n```");
        addAssignmentToProblemAnswer(pa_3_3_6, assignment3_3);
        addProblemAnswerToAssignment(assignment3_3, pa_3_3_6);

        ProblemAnswer pa_3_3_7 = createProblemAnswer("What is the difference between DFS and BFS?", "The main difference between DFS and BFS is the order in which nodes are visited. DFS goes as deep as possible before backtracking, while BFS visits all the neighbors of a node before moving on to the next level of neighbors.");
        addAssignmentToProblemAnswer(pa_3_3_7, assignment3_3);
        addProblemAnswerToAssignment(assignment3_3, pa_3_3_7);

        ProblemAnswer pa_3_3_8 = createProblemAnswer("What are some applications of DFS and BFS?", "Applications of DFS include topological sorting, finding strongly connected components, and solving puzzles. Applications of BFS include finding the shortest path in an unweighted graph, web crawling, and social network analysis.");
        addAssignmentToProblemAnswer(pa_3_3_8, assignment3_3);
        addProblemAnswerToAssignment(assignment3_3, pa_3_3_8);

        ProblemAnswer pa_3_3_9 = createProblemAnswer("How does Dijkstra's algorithm work?", "Dijkstra's algorithm finds the shortest path from a source node to all other nodes in a weighted graph. It uses a priority queue to greedily select the nearest unvisited node and update the distances to its neighbors.");
        addAssignmentToProblemAnswer(pa_3_3_9, assignment3_3);
        addProblemAnswerToAssignment(assignment3_3, pa_3_3_9);

        ProblemAnswer pa_3_3_10 = createProblemAnswer("What is the time complexity of Dijkstra's algorithm?", "The time complexity of Dijkstra's algorithm is O(V^2) for a simple implementation and O(V + E log V) for an implementation using a priority queue, where V is the number of vertices and E is the number of edges in the graph.");
        addAssignmentToProblemAnswer(pa_3_3_10, assignment3_3);
        addProblemAnswerToAssignment(assignment3_3, pa_3_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Graph Algorithms' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment3_4 = createAssignment("Dynamic Programming Assignment", faculty3, Date.from(LocalDate.of(2026, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_3_4_1 = createProblemAnswer("What is dynamic programming?", "Dynamic programming is a method for solving complex problems by breaking them down into simpler subproblems and storing the results of these subproblems to avoid redundant calculations.");
        addAssignmentToProblemAnswer(pa_3_4_1, assignment3_4);
        addProblemAnswerToAssignment(assignment3_4, pa_3_4_1);

        ProblemAnswer pa_3_4_2 = createProblemAnswer("What is the principle of optimality in dynamic programming?", "The principle of optimality states that an optimal solution to a problem contains optimal solutions to its subproblems, meaning solving subproblems optimally leads to an optimal solution for the entire problem.");
        addAssignmentToProblemAnswer(pa_3_4_2, assignment3_4);
        addProblemAnswerToAssignment(assignment3_4, pa_3_4_2);

        ProblemAnswer pa_3_4_3 = createProblemAnswer("How does memoization work in dynamic programming?", "Memoization is a technique in dynamic programming where the results of expensive function calls are stored and reused, avoiding redundant calculations and improving efficiency.");
        addAssignmentToProblemAnswer(pa_3_4_3, assignment3_4);
        addProblemAnswerToAssignment(assignment3_4, pa_3_4_3);

        ProblemAnswer pa_3_4_4 = createProblemAnswer("What is the difference between top-down and bottom-up dynamic programming?", "Top-down dynamic programming uses recursion and memoization to solve problems by breaking them down into subproblems. Bottom-up dynamic programming uses an iterative approach to solve subproblems first and build up to the final solution.");
        addAssignmentToProblemAnswer(pa_3_4_4, assignment3_4);
        addProblemAnswerToAssignment(assignment3_4, pa_3_4_4);

        ProblemAnswer pa_3_4_5 = createProblemAnswer("How do you implement dynamic programming for the Fibonacci sequence?", "Here is a Python implementation of dynamic programming for the Fibonacci sequence:\n```python\ndef fibonacci(n, memo={}):\n    if n in memo:\n        return memo[n]\n    if n <= 1:\n        return n\n    memo[n] = fibonacci(n-1, memo) + fibonacci(n-2, memo)\n    return memo[n]\n```");
        addAssignmentToProblemAnswer(pa_3_4_5, assignment3_4);
        addProblemAnswerToAssignment(assignment3_4, pa_3_4_5);

        ProblemAnswer pa_3_4_6 = createProblemAnswer("What is the knapsack problem, and how is dynamic programming used to solve it?", "The knapsack problem involves selecting a subset of items with given weights and values to maximize the total value without exceeding a weight limit. Dynamic programming solves it by breaking the problem into subproblems and building up to the optimal solution.");
        addAssignmentToProblemAnswer(pa_3_4_6, assignment3_4);
        addProblemAnswerToAssignment(assignment3_4, pa_3_4_6);

        ProblemAnswer pa_3_4_7 = createProblemAnswer("How do you solve the knapsack problem using dynamic programming?", "Here is a Python implementation of dynamic programming for the knapsack problem:\n```python\ndef knapsack(W, wt, val, n):\n    dp = [[0 for x in range(W + 1)] for x in range(n + 1)]\n    for i in range(n + 1):\n        for w in range(W + 1):\n            if i == 0 or w == 0:\n                dp[i][w] = 0\n            elif wt[i-1] <= w:\n                dp[i][w] = max(val[i-1] + dp[i-1][w-wt[i-1]], dp[i-1][w])\n            else:\n                dp[i][w] = dp[i-1][w]\n    return dp[n][W]\n```");
        addAssignmentToProblemAnswer(pa_3_4_7, assignment3_4);
        addProblemAnswerToAssignment(assignment3_4, pa_3_4_7);

        ProblemAnswer pa_3_4_8 = createProblemAnswer("What is the longest common subsequence problem, and how is dynamic programming used to solve it?", "The longest common subsequence problem involves finding the longest subsequence that is common to two sequences. Dynamic programming solves it by breaking the problem into subproblems and building up to the optimal solution.");
        addAssignmentToProblemAnswer(pa_3_4_8, assignment3_4);
        addProblemAnswerToAssignment(assignment3_4, pa_3_4_8);

        ProblemAnswer pa_3_4_9 = createProblemAnswer("How do you solve the longest common subsequence problem using dynamic programming?", "Here is a Python implementation of dynamic programming for the longest common subsequence problem:\n```python\ndef lcs(X, Y):\n    m = len(X)\n    n = len(Y)\n    dp = [[None]*(n+1) for i in range(m+1)]\n    for i in range(m+1):\n        for j in range(n+1):\n            if i == 0 or j == 0:\n                dp[i][j] = 0\n            elif X[i-1] == Y[j-1]:\n                dp[i][j] = dp[i-1][j-1]+1\n            else:\n                dp[i][j] = max(dp[i-1][j], dp[i][j-1])\n    return dp[m][n]\n```");
        addAssignmentToProblemAnswer(pa_3_4_9, assignment3_4);
        addProblemAnswerToAssignment(assignment3_4, pa_3_4_9);

        ProblemAnswer pa_3_4_10 = createProblemAnswer("What are some common applications of dynamic programming?", "Common applications of dynamic programming include solving optimization problems, such as the knapsack problem, shortest path problems, sequence alignment in bioinformatics, and finding the longest common subsequence.");
        addAssignmentToProblemAnswer(pa_3_4_10, assignment3_4);
        addProblemAnswerToAssignment(assignment3_4, pa_3_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Dynamic Programming' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment4_1 = createAssignment("Relational Databases Assignment", faculty4, Date.from(LocalDate.of(2026, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_4_1_1 = createProblemAnswer("What is a relational database?", "A relational database is a type of database that organizes data into tables, which consist of rows and columns. Relationships between tables are defined using keys.");
        addAssignmentToProblemAnswer(pa_4_1_1, assignment4_1);
        addProblemAnswerToAssignment(assignment4_1, pa_4_1_1);

        ProblemAnswer pa_4_1_2 = createProblemAnswer("What is a primary key?", "A primary key is a unique identifier for a row in a table. It ensures that each row can be uniquely identified and retrieved.");
        addAssignmentToProblemAnswer(pa_4_1_2, assignment4_1);
        addProblemAnswerToAssignment(assignment4_1, pa_4_1_2);

        ProblemAnswer pa_4_1_3 = createProblemAnswer("What is a foreign key?", "A foreign key is a column or set of columns in one table that references the primary key in another table. It establishes a relationship between the two tables.");
        addAssignmentToProblemAnswer(pa_4_1_3, assignment4_1);
        addProblemAnswerToAssignment(assignment4_1, pa_4_1_3);

        ProblemAnswer pa_4_1_4 = createProblemAnswer("What is normalization in database design?", "Normalization is the process of organizing data in a database to reduce redundancy and improve data integrity. It involves dividing tables into smaller, related tables and defining relationships between them.");
        addAssignmentToProblemAnswer(pa_4_1_4, assignment4_1);
        addProblemAnswerToAssignment(assignment4_1, pa_4_1_4);

        ProblemAnswer pa_4_1_5 = createProblemAnswer("What is a relationship in a relational database?", "A relationship in a relational database is an association between tables. It is established using keys, such as primary and foreign keys, to ensure data integrity and consistency.");
        addAssignmentToProblemAnswer(pa_4_1_5, assignment4_1);
        addProblemAnswerToAssignment(assignment4_1, pa_4_1_5);

        ProblemAnswer pa_4_1_6 = createProblemAnswer("What is an entity-relationship (ER) diagram?", "An entity-relationship (ER) diagram is a visual representation of the entities (tables) in a database and the relationships between them. It is used in database design to illustrate the structure and relationships of the database.");
        addAssignmentToProblemAnswer(pa_4_1_6, assignment4_1);
        addProblemAnswerToAssignment(assignment4_1, pa_4_1_6);

        ProblemAnswer pa_4_1_7 = createProblemAnswer("What is a table in a relational database?", "A table in a relational database is a collection of related data organized into rows and columns. Each row represents a record, and each column represents a field or attribute.");
        addAssignmentToProblemAnswer(pa_4_1_7, assignment4_1);
        addProblemAnswerToAssignment(assignment4_1, pa_4_1_7);

        ProblemAnswer pa_4_1_8 = createProblemAnswer("What is a schema in a relational database?", "A schema in a relational database defines the structure of the database, including the tables, columns, data types, and relationships between tables. It serves as a blueprint for organizing and storing data.");
        addAssignmentToProblemAnswer(pa_4_1_8, assignment4_1);
        addProblemAnswerToAssignment(assignment4_1, pa_4_1_8);

        ProblemAnswer pa_4_1_9 = createProblemAnswer("What is the role of SQL in relational databases?", "SQL (Structured Query Language) is used to query and manipulate data in relational databases. It allows users to create, read, update, and delete data, as well as perform complex data operations and manage database schemas.");
        addAssignmentToProblemAnswer(pa_4_1_9, assignment4_1);
        addProblemAnswerToAssignment(assignment4_1, pa_4_1_9);

        ProblemAnswer pa_4_1_10 = createProblemAnswer("What are the advantages of using relational databases?", "Relational databases offer several advantages, including data integrity, flexibility, scalability, and support for complex queries and transactions. They provide a structured way to organize and manage data, making it easier to retrieve and analyze information.");
        addAssignmentToProblemAnswer(pa_4_1_10, assignment4_1);
        addProblemAnswerToAssignment(assignment4_1, pa_4_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Relational Databases' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment4_2 = createAssignment("SQL Assignment", faculty4, Date.from(LocalDate.of(2026, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_4_2_1 = createProblemAnswer("What is SQL?", "SQL (Structured Query Language) is the standard language for querying and manipulating databases. It allows users to create, read, update, and delete data, as well as perform complex data operations.");
        addAssignmentToProblemAnswer(pa_4_2_1, assignment4_2);
        addProblemAnswerToAssignment(assignment4_2, pa_4_2_1);

        ProblemAnswer pa_4_2_2 = createProblemAnswer("How do you write a basic SQL query to select all records from a table?", "Here is a basic SQL query to select all records from a table:\n```sql\nSELECT * FROM table_name;\n```");
        addAssignmentToProblemAnswer(pa_4_2_2, assignment4_2);
        addProblemAnswerToAssignment(assignment4_2, pa_4_2_2);

        ProblemAnswer pa_4_2_3 = createProblemAnswer("What is the purpose of the WHERE clause in SQL?", "The WHERE clause is used to filter records based on specified conditions. It allows users to retrieve only the records that meet the given criteria.");
        addAssignmentToProblemAnswer(pa_4_2_3, assignment4_2);
        addProblemAnswerToAssignment(assignment4_2, pa_4_2_3);

        ProblemAnswer pa_4_2_4 = createProblemAnswer("How do you write an SQL query to update a record in a table?", "Here is an SQL query to update a record in a table:\n```sql\nUPDATE table_name\nSET column1 = value1, column2 = value2\nWHERE condition;\n```");
        addAssignmentToProblemAnswer(pa_4_2_4, assignment4_2);
        addProblemAnswerToAssignment(assignment4_2, pa_4_2_4);

        ProblemAnswer pa_4_2_5 = createProblemAnswer("What is the purpose of the INSERT INTO statement in SQL?", "The INSERT INTO statement is used to add new records to a table. It allows users to insert data into specific columns of a table.");
        addAssignmentToProblemAnswer(pa_4_2_5, assignment4_2);
        addProblemAnswerToAssignment(assignment4_2, pa_4_2_5);

        ProblemAnswer pa_4_2_6 = createProblemAnswer("How do you write an SQL query to delete a record from a table?", "Here is an SQL query to delete a record from a table:\n```sql\nDELETE FROM table_name\nWHERE condition;\n```");
        addAssignmentToProblemAnswer(pa_4_2_6, assignment4_2);
        addProblemAnswerToAssignment(assignment4_2, pa_4_2_6);

        ProblemAnswer pa_4_2_7 = createProblemAnswer("What is the purpose of the JOIN clause in SQL?", "The JOIN clause is used to combine records from two or more tables based on a related column. It allows users to retrieve data from multiple tables in a single query.");
        addAssignmentToProblemAnswer(pa_4_2_7, assignment4_2);
        addProblemAnswerToAssignment(assignment4_2, pa_4_2_7);

        ProblemAnswer pa_4_2_8 = createProblemAnswer("How do you write an SQL query to perform an INNER JOIN?", "Here is an SQL query to perform an INNER JOIN:\n```sql\nSELECT table1.column1, table2.column2\nFROM table1\nINNER JOIN table2\nON table1.common_column = table2.common_column;\n```");
        addAssignmentToProblemAnswer(pa_4_2_8, assignment4_2);
        addProblemAnswerToAssignment(assignment4_2, pa_4_2_8);

        ProblemAnswer pa_4_2_9 = createProblemAnswer("What is the purpose of the GROUP BY clause in SQL?", "The GROUP BY clause is used to group records that have the same values in specified columns. It is often used with aggregate functions, such as COUNT, SUM, AVG, MAX, and MIN, to perform calculations on each group.");
        addAssignmentToProblemAnswer(pa_4_2_9, assignment4_2);
        addProblemAnswerToAssignment(assignment4_2, pa_4_2_9);

        ProblemAnswer pa_4_2_10 = createProblemAnswer("How do you write an SQL query to find the average value of a column?", "Here is an SQL query to find the average value of a column:\n```sql\nSELECT AVG(column_name)\nFROM table_name;\n```");
        addAssignmentToProblemAnswer(pa_4_2_10, assignment4_2);
        addProblemAnswerToAssignment(assignment4_2, pa_4_2_10);

// Output for confirmation
        System.out.println("Assignment for 'SQL' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment4_3 = createAssignment("Transactions Assignment", faculty4, Date.from(LocalDate.of(2026, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_4_3_1 = createProblemAnswer("What is a database transaction?", "A database transaction is a sequence of one or more SQL operations executed as a single unit of work, ensuring data integrity and consistency.");
        addAssignmentToProblemAnswer(pa_4_3_1, assignment4_3);
        addProblemAnswerToAssignment(assignment4_3, pa_4_3_1);

        ProblemAnswer pa_4_3_2 = createProblemAnswer("What are the ACID properties of a transaction?", "The ACID properties of a transaction are Atomicity, Consistency, Isolation, and Durability. These properties ensure that transactions are processed reliably.");
        addAssignmentToProblemAnswer(pa_4_3_2, assignment4_3);
        addProblemAnswerToAssignment(assignment4_3, pa_4_3_2);

        ProblemAnswer pa_4_3_3 = createProblemAnswer("What is atomicity in the context of transactions?", "Atomicity ensures that all operations within a transaction are completed successfully or none of them are. If any operation fails, the entire transaction is rolled back.");
        addAssignmentToProblemAnswer(pa_4_3_3, assignment4_3);
        addProblemAnswerToAssignment(assignment4_3, pa_4_3_3);

        ProblemAnswer pa_4_3_4 = createProblemAnswer("What is consistency in the context of transactions?", "Consistency ensures that a transaction brings the database from one valid state to another, maintaining all predefined rules and constraints.");
        addAssignmentToProblemAnswer(pa_4_3_4, assignment4_3);
        addProblemAnswerToAssignment(assignment4_3, pa_4_3_4);

        ProblemAnswer pa_4_3_5 = createProblemAnswer("What is isolation in the context of transactions?", "Isolation ensures that the operations of one transaction are isolated from those of other transactions, preventing conflicts and ensuring data integrity.");
        addAssignmentToProblemAnswer(pa_4_3_5, assignment4_3);
        addProblemAnswerToAssignment(assignment4_3, pa_4_3_5);

        ProblemAnswer pa_4_3_6 = createProblemAnswer("What is durability in the context of transactions?", "Durability ensures that once a transaction is committed, its results are permanent and will survive any subsequent system failures.");
        addAssignmentToProblemAnswer(pa_4_3_6, assignment4_3);
        addProblemAnswerToAssignment(assignment4_3, pa_4_3_6);

        ProblemAnswer pa_4_3_7 = createProblemAnswer("How do you start a transaction in SQL?", "You start a transaction in SQL using the `BEGIN TRANSACTION` statement. For example:\n```sql\nBEGIN TRANSACTION;\n```");
        addAssignmentToProblemAnswer(pa_4_3_7, assignment4_3);
        addProblemAnswerToAssignment(assignment4_3, pa_4_3_7);

        ProblemAnswer pa_4_3_8 = createProblemAnswer("How do you commit a transaction in SQL?", "You commit a transaction in SQL using the `COMMIT` statement. For example:\n```sql\nCOMMIT;\n```");
        addAssignmentToProblemAnswer(pa_4_3_8, assignment4_3);
        addProblemAnswerToAssignment(assignment4_3, pa_4_3_8);

        ProblemAnswer pa_4_3_9 = createProblemAnswer("How do you roll back a transaction in SQL?", "You roll back a transaction in SQL using the `ROLLBACK` statement. For example:\n```sql\nROLLBACK;\n```");
        addAssignmentToProblemAnswer(pa_4_3_9, assignment4_3);
        addProblemAnswerToAssignment(assignment4_3, pa_4_3_9);

        ProblemAnswer pa_4_3_10 = createProblemAnswer("What is the purpose of using transactions in SQL?", "The purpose of using transactions in SQL is to ensure data integrity and consistency, especially in scenarios involving multiple operations or concurrent access to the database. Transactions allow for safe and reliable data management.");
        addAssignmentToProblemAnswer(pa_4_3_10, assignment4_3);
        addProblemAnswerToAssignment(assignment4_3, pa_4_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Transactions' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment4_4 = createAssignment("Database Design Assignment", faculty4, Date.from(LocalDate.of(2026, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);

// Creating and adding problem answers to the assignment
        ProblemAnswer pa_4_4_1 = createProblemAnswer("What is database design?", "Database design is the process of defining the structure, organization, and relationships of data within a database. It involves creating schemas, tables, and relationships to store and manage data efficiently.");
        addAssignmentToProblemAnswer(pa_4_4_1, assignment4_4);
        addProblemAnswerToAssignment(assignment4_4, pa_4_4_1);

        ProblemAnswer pa_4_4_2 = createProblemAnswer("What is normalization in database design?", "Normalization is the process of organizing data in a database to reduce redundancy and improve data integrity. It involves dividing tables into smaller, related tables and defining relationships between them.");
        addAssignmentToProblemAnswer(pa_4_4_2, assignment4_4);
        addProblemAnswerToAssignment(assignment4_4, pa_4_4_2);

        ProblemAnswer pa_4_4_3 = createProblemAnswer("What are the normal forms in database normalization?", "The normal forms in database normalization are: 1NF (First Normal Form), 2NF (Second Normal Form), 3NF (Third Normal Form), BCNF (Boyce-Codd Normal Form), and higher normal forms. Each normal form has specific rules to reduce redundancy and dependency.");
        addAssignmentToProblemAnswer(pa_4_4_3, assignment4_4);
        addProblemAnswerToAssignment(assignment4_4, pa_4_4_3);

        ProblemAnswer pa_4_4_4 = createProblemAnswer("What is denormalization in database design?", "Denormalization is the process of combining normalized tables to reduce the complexity of queries and improve performance. It involves adding redundancy back into the database for optimization purposes.");
        addAssignmentToProblemAnswer(pa_4_4_4, assignment4_4);
        addProblemAnswerToAssignment(assignment4_4, pa_4_4_4);

        ProblemAnswer pa_4_4_5 = createProblemAnswer("What is an entity-relationship (ER) diagram?", "An entity-relationship (ER) diagram is a visual representation of the entities (tables) in a database and the relationships between them. It is used in database design to illustrate the structure and relationships of the database.");
        addAssignmentToProblemAnswer(pa_4_4_5, assignment4_4);
        addProblemAnswerToAssignment(assignment4_4, pa_4_4_5);

        ProblemAnswer pa_4_4_6 = createProblemAnswer("What is a primary key in database design?", "A primary key is a unique identifier for a row in a table. It ensures that each row can be uniquely identified and retrieved.");
        addAssignmentToProblemAnswer(pa_4_4_6, assignment4_4);
        addProblemAnswerToAssignment(assignment4_4, pa_4_4_6);

        ProblemAnswer pa_4_4_7 = createProblemAnswer("What is a foreign key in database design?", "A foreign key is a column or set of columns in one table that references the primary key in another table. It establishes a relationship between the two tables.");
        addAssignmentToProblemAnswer(pa_4_4_7, assignment4_4);
        addProblemAnswerToAssignment(assignment4_4, pa_4_4_7);

        ProblemAnswer pa_4_4_8 = createProblemAnswer("What is data modeling?", "Data modeling is the process of creating a visual representation of the data and its relationships within a database. It involves defining entities, attributes, and relationships to capture the structure and constraints of the data.");
        addAssignmentToProblemAnswer(pa_4_4_8, assignment4_4);
        addProblemAnswerToAssignment(assignment4_4, pa_4_4_8);

        ProblemAnswer pa_4_4_9 = createProblemAnswer("What is a schema in database design?", "A schema in database design defines the structure of the database, including the tables, columns, data types, and relationships between tables. It serves as a blueprint for organizing and storing data.");
        addAssignmentToProblemAnswer(pa_4_4_9, assignment4_4);
        addProblemAnswerToAssignment(assignment4_4, pa_4_4_9);

        ProblemAnswer pa_4_4_10 = createProblemAnswer("What are the best practices for database design?", "Best practices for database design include: (1) Normalizing data to reduce redundancy, (2) Choosing appropriate data types, (3) Defining primary and foreign keys, (4) Creating indexes to improve query performance, (5) Ensuring data integrity and consistency, and (6) Designing for scalability and maintainability.");
        addAssignmentToProblemAnswer(pa_4_4_10, assignment4_4);
        addProblemAnswerToAssignment(assignment4_4, pa_4_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Database Design' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment5_1 = createAssignment("Processes Assignment", faculty5, Date.from(LocalDate.of(2026, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);

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

        ProblemAnswer pa_5_1_6 = createProblemAnswer("What is a process control block (PCB)?", "A process control block (PCB) is a data structure used by the OS to store information about a process, including its state, PID, program counter, registers, and memory allocation.");
        addAssignmentToProblemAnswer(pa_5_1_6, assignment5_1);
        addProblemAnswerToAssignment(assignment5_1, pa_5_1_6);

        ProblemAnswer pa_5_1_7 = createProblemAnswer("What is context switching?", "Context switching is the process of saving the state of a currently running process and loading the state of another process. It allows the OS to switch between processes efficiently.");
        addAssignmentToProblemAnswer(pa_5_1_7, assignment5_1);
        addProblemAnswerToAssignment(assignment5_1, pa_5_1_7);

        ProblemAnswer pa_5_1_8 = createProblemAnswer("What is a process state?", "A process state represents the current status of a process. Common states include new, ready, running, waiting, and terminated.");
        addAssignmentToProblemAnswer(pa_5_1_8, assignment5_1);
        addProblemAnswerToAssignment(assignment5_1, pa_5_1_8);

        ProblemAnswer pa_5_1_9 = createProblemAnswer("What is a fork in process management?", "A fork is an operation that creates a new process by duplicating an existing process. The new process, called the child process, runs concurrently with the original process, called the parent process.");
        addAssignmentToProblemAnswer(pa_5_1_9, assignment5_1);
        addProblemAnswerToAssignment(assignment5_1, pa_5_1_9);

        ProblemAnswer pa_5_1_10 = createProblemAnswer("What is a thread in process management?", "A thread is the smallest unit of execution within a process. Multiple threads can exist within a single process, sharing the same memory and resources, but executing independently.");
        addAssignmentToProblemAnswer(pa_5_1_10, assignment5_1);
        addProblemAnswerToAssignment(assignment5_1, pa_5_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Processes' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment5_2 = createAssignment("Memory Management Assignment", faculty5, Date.from(LocalDate.of(2026, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);

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

        ProblemAnswer pa_5_2_6 = createProblemAnswer("What is a page table?", "A page table is a data structure used in paging to map virtual addresses to physical addresses. It stores the mapping information and helps the OS translate virtual addresses to corresponding physical addresses.");
        addAssignmentToProblemAnswer(pa_5_2_6, assignment5_2);
        addProblemAnswerToAssignment(assignment5_2, pa_5_2_6);

        ProblemAnswer pa_5_2_7 = createProblemAnswer("What is a memory leak?", "A memory leak occurs when a program fails to release memory that is no longer needed, causing the available memory to decrease over time. It can lead to performance degradation and system crashes.");
        addAssignmentToProblemAnswer(pa_5_2_7, assignment5_2);
        addProblemAnswerToAssignment(assignment5_2, pa_5_2_7);

        ProblemAnswer pa_5_2_8 = createProblemAnswer("What is a frame in memory management?", "A frame is a fixed-sized block of physical memory used in paging. Each frame can hold a single page from the virtual memory, and the OS manages the allocation of frames to pages.");
        addAssignmentToProblemAnswer(pa_5_2_8, assignment5_2);
        addProblemAnswerToAssignment(assignment5_2, pa_5_2_8);

        ProblemAnswer pa_5_2_9 = createProblemAnswer("What is demand paging?", "Demand paging is a memory management technique where pages are loaded into memory only when they are needed, rather than loading the entire program into memory at once. It helps reduce memory usage and improve system performance.");
        addAssignmentToProblemAnswer(pa_5_2_9, assignment5_2);
        addProblemAnswerToAssignment(assignment5_2, pa_5_2_9);

        ProblemAnswer pa_5_2_10 = createProblemAnswer("What is thrashing in memory management?", "Thrashing occurs when a system spends more time swapping pages in and out of memory than executing processes, due to excessive paging. It leads to severe performance degradation and can be mitigated by optimizing memory allocation and managing workloads.");
        addAssignmentToProblemAnswer(pa_5_2_10, assignment5_2);
        addProblemAnswerToAssignment(assignment5_2, pa_5_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Memory Management' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment5_3 = createAssignment("File Systems Assignment", faculty5, Date.from(LocalDate.of(2026, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);

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

        ProblemAnswer pa_5_3_6 = createProblemAnswer("What is file allocation table (FAT)?", "A file allocation table (FAT) is a data structure used by some file systems to keep track of the blocks of data that make up a file. It helps manage the allocation and retrieval of files on the storage device.");
        addAssignmentToProblemAnswer(pa_5_3_6, assignment5_3);
        addProblemAnswerToAssignment(assignment5_3, pa_5_3_6);

        ProblemAnswer pa_5_3_7 = createProblemAnswer("What is a journaling file system?", "A journaling file system is a type of file system that keeps a log (journal) of changes being made, which helps in recovering the file system in case of a crash or power failure.");
        addAssignmentToProblemAnswer(pa_5_3_7, assignment5_3);
        addProblemAnswerToAssignment(assignment5_3, pa_5_3_7);

        ProblemAnswer pa_5_3_8 = createProblemAnswer("What is the purpose of file permissions?", "File permissions are used to control access to files and directories. They define what actions (read, write, execute) can be performed by different users or groups.");
        addAssignmentToProblemAnswer(pa_5_3_8, assignment5_3);
        addProblemAnswerToAssignment(assignment5_3, pa_5_3_8);

        ProblemAnswer pa_5_3_9 = createProblemAnswer("What is the difference between a file system and a database?", "A file system is used to manage files on storage devices, while a database is used to manage structured data. File systems are optimized for storing and retrieving files, while databases provide advanced querying and data manipulation capabilities.");
        addAssignmentToProblemAnswer(pa_5_3_9, assignment5_3);
        addProblemAnswerToAssignment(assignment5_3, pa_5_3_9);

        ProblemAnswer pa_5_3_10 = createProblemAnswer("What is disk fragmentation?", "Disk fragmentation occurs when files are divided into scattered pieces across the storage device, leading to slower read/write performance. Defragmentation is the process of reorganizing fragmented data to improve efficiency.");
        addAssignmentToProblemAnswer(pa_5_3_10, assignment5_3);
        addProblemAnswerToAssignment(assignment5_3, pa_5_3_10);

// Output for confirmation
        System.out.println("Assignment for 'File Systems' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment5_4 = createAssignment("Scheduling Assignment", faculty5, Date.from(LocalDate.of(2026, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);

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

        ProblemAnswer pa_5_4_6 = createProblemAnswer("What is a multi-level feedback queue?", "A multi-level feedback queue is a scheduling algorithm that allows processes to move between queues based on their behavior and execution history. It adapts to the needs of processes by adjusting their priority dynamically.");
        addAssignmentToProblemAnswer(pa_5_4_6, assignment5_4);
        addProblemAnswerToAssignment(assignment5_4, pa_5_4_6);

        ProblemAnswer pa_5_4_7 = createProblemAnswer("What is the time quantum in round-robin scheduling?", "The time quantum in round-robin scheduling is the fixed time slice assigned to each process. It determines how long a process can run before being preempted and moved to the end of the queue.");
        addAssignmentToProblemAnswer(pa_5_4_7, assignment5_4);
        addProblemAnswerToAssignment(assignment5_4, pa_5_4_7);

        ProblemAnswer pa_5_4_8 = createProblemAnswer("What is the difference between preemptive and non-preemptive scheduling?", "Preemptive scheduling allows the operating system to interrupt and switch processes before they complete their execution, while non-preemptive scheduling requires a process to run until it finishes or blocks itself.");
        addAssignmentToProblemAnswer(pa_5_4_8, assignment5_4);
        addProblemAnswerToAssignment(assignment5_4, pa_5_4_8);

        ProblemAnswer pa_5_4_9 = createProblemAnswer("What is the shortest job next (SJN) scheduling algorithm?", "The shortest job next (SJN) scheduling algorithm selects the process with the shortest expected processing time for execution. It aims to minimize the average waiting time for processes.");
        addAssignmentToProblemAnswer(pa_5_4_9, assignment5_4);
        addProblemAnswerToAssignment(assignment5_4, pa_5_4_9);

        ProblemAnswer pa_5_4_10 = createProblemAnswer("What is the role of the dispatcher in CPU scheduling?", "The dispatcher is a component of the operating system responsible for switching the CPU from one process to another. It loads the context of the selected process, allocates CPU time, and manages context switching.");
        addAssignmentToProblemAnswer(pa_5_4_10, assignment5_4);
        addProblemAnswerToAssignment(assignment5_4, pa_5_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Scheduling' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6_1 = createAssignment("OSI Model Assignment", faculty1, Date.from(LocalDate.of(2026, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);

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

        ProblemAnswer pa_6_1_6 = createProblemAnswer("What is the role of the Transport layer in the OSI model?", "The Transport layer is responsible for end-to-end communication and data transfer between devices. It ensures reliable and error-free transmission of data by managing flow control and retransmission of lost packets.");
        addAssignmentToProblemAnswer(pa_6_1_6, assignment6_1);
        addProblemAnswerToAssignment(assignment6_1, pa_6_1_6);

        ProblemAnswer pa_6_1_7 = createProblemAnswer("What is the role of the Session layer in the OSI model?", "The Session layer is responsible for establishing, managing, and terminating communication sessions between devices. It handles session management and synchronization of data exchanges.");
        addAssignmentToProblemAnswer(pa_6_1_7, assignment6_1);
        addProblemAnswerToAssignment(assignment6_1, pa_6_1_7);

        ProblemAnswer pa_6_1_8 = createProblemAnswer("What is the role of the Presentation layer in the OSI model?", "The Presentation layer is responsible for data translation, encryption, and compression. It ensures that data is in a usable format and can be interpreted correctly by the Application layer.");
        addAssignmentToProblemAnswer(pa_6_1_8, assignment6_1);
        addProblemAnswerToAssignment(assignment6_1, pa_6_1_8);

        ProblemAnswer pa_6_1_9 = createProblemAnswer("What is the role of the Application layer in the OSI model?", "The Application layer is responsible for providing network services to end-users. It supports application services such as email, file transfer, and web browsing, allowing users to interact with the network.");
        addAssignmentToProblemAnswer(pa_6_1_9, assignment6_1);
        addProblemAnswerToAssignment(assignment6_1, pa_6_1_9);

        ProblemAnswer pa_6_1_10 = createProblemAnswer("How does data transmission occur across the OSI model layers?", "Data transmission across the OSI model layers involves encapsulation and decapsulation. Data is encapsulated with protocol headers at each layer as it moves down the stack and transmitted over the network. At the receiving end, the data is decapsulated, removing the headers at each layer as it moves up the stack until it reaches the Application layer.");
        addAssignmentToProblemAnswer(pa_6_1_10, assignment6_1);
        addProblemAnswerToAssignment(assignment6_1, pa_6_1_10);

// Output for confirmation
        System.out.println("Assignment for 'OSI Model' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6_2 = createAssignment("TCP/IP Assignment", faculty1, Date.from(LocalDate.of(2026, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);

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

        ProblemAnswer pa_6_2_6 = createProblemAnswer("What is the role of the Application layer in the TCP/IP model?", "The Application layer is responsible for providing network services to end-users. It includes protocols such as HTTP, FTP, and SMTP that support application-specific functions.");
        addAssignmentToProblemAnswer(pa_6_2_6, assignment6_2);
        addProblemAnswerToAssignment(assignment6_2, pa_6_2_6);

        ProblemAnswer pa_6_2_7 = createProblemAnswer("What is the difference between TCP and UDP?", "TCP (Transmission Control Protocol) is a connection-oriented protocol that ensures reliable data transmission through error checking and retransmission. UDP (User Datagram Protocol) is a connectionless protocol that provides faster, but less reliable, data transmission without error checking.");
        addAssignmentToProblemAnswer(pa_6_2_7, assignment6_2);
        addProblemAnswerToAssignment(assignment6_2, pa_6_2_7);

        ProblemAnswer pa_6_2_8 = createProblemAnswer("What is the role of IP (Internet Protocol) in the TCP/IP model?", "IP (Internet Protocol) is responsible for addressing and routing data packets to their destination across interconnected networks. It ensures that data is sent from the source to the correct destination.");
        addAssignmentToProblemAnswer(pa_6_2_8, assignment6_2);
        addProblemAnswerToAssignment(assignment6_2, pa_6_2_8);

        ProblemAnswer pa_6_2_9 = createProblemAnswer("How does TCP ensure reliable data transmission?", "TCP ensures reliable data transmission through mechanisms such as error checking, flow control, and retransmission of lost packets. It establishes a connection between devices and maintains data integrity.");
        addAssignmentToProblemAnswer(pa_6_2_9, assignment6_2);
        addProblemAnswerToAssignment(assignment6_2, pa_6_2_9);

        ProblemAnswer pa_6_2_10 = createProblemAnswer("What is the significance of the TCP/IP model for the internet?", "The TCP/IP model is significant for the internet as it provides a standardized framework for communication between networked devices. It enables interoperability, scalability, and reliable data exchange, forming the backbone of modern internet infrastructure.");
        addAssignmentToProblemAnswer(pa_6_2_10, assignment6_2);
        addProblemAnswerToAssignment(assignment6_2, pa_6_2_10);

// Output for confirmation
        System.out.println("Assignment for 'TCP/IP' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6_3 = createAssignment("Network Protocols Assignment", faculty1, Date.from(LocalDate.of(2027, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);

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

        ProblemAnswer pa_6_3_6 = createProblemAnswer("How does HTTP ensure secure communication?", "HTTP ensures secure communication using HTTPS (HTTP Secure), which encrypts data using SSL/TLS protocols. This protects data integrity and confidentiality during transmission.");
        addAssignmentToProblemAnswer(pa_6_3_6, assignment6_3);
        addProblemAnswerToAssignment(assignment6_3, pa_6_3_6);

        ProblemAnswer pa_6_3_7 = createProblemAnswer("What is the role of the SMTP protocol?", "SMTP (Simple Mail Transfer Protocol) is a protocol used for sending and receiving email messages. It defines the rules for transferring emails between mail servers and from clients to servers.");
        addAssignmentToProblemAnswer(pa_6_3_7, assignment6_3);
        addProblemAnswerToAssignment(assignment6_3, pa_6_3_7);

        ProblemAnswer pa_6_3_8 = createProblemAnswer("What is the purpose of the SNMP protocol?", "SNMP (Simple Network Management Protocol) is a protocol used for network management and monitoring. It allows administrators to collect and manage information about network devices and performance.");
        addAssignmentToProblemAnswer(pa_6_3_8, assignment6_3);
        addProblemAnswerToAssignment(assignment6_3, pa_6_3_8);

        ProblemAnswer pa_6_3_9 = createProblemAnswer("What is the difference between HTTP and HTTPS?", "HTTP is a protocol used for transferring web pages, while HTTPS is a secure version of HTTP that encrypts data using SSL/TLS. HTTPS ensures data integrity and confidentiality during transmission.");
        addAssignmentToProblemAnswer(pa_6_3_9, assignment6_3);
        addProblemAnswerToAssignment(assignment6_3, pa_6_3_9);

        ProblemAnswer pa_6_3_10 = createProblemAnswer("How does DNS work?", "DNS works by translating domain names into IP addresses. When a user enters a domain name in a web browser, a DNS server queries its database to find the corresponding IP address and returns it to the browser, allowing the user to access the website.");
        addAssignmentToProblemAnswer(pa_6_3_10, assignment6_3);
        addProblemAnswerToAssignment(assignment6_3, pa_6_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Network Protocols' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6_4 = createAssignment("Routing Assignment", faculty1, Date.from(LocalDate.of(2027, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);

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

        ProblemAnswer pa_6_4_6 = createProblemAnswer("How does RIP work?", "RIP (Routing Information Protocol) is a distance vector routing protocol that uses hop count as a metric to determine the best path for data packets. It periodically updates routing tables by exchanging information with neighboring routers.");
        addAssignmentToProblemAnswer(pa_6_4_6, assignment6_4);
        addProblemAnswerToAssignment(assignment6_4, pa_6_4_6);

        ProblemAnswer pa_6_4_7 = createProblemAnswer("What is the role of a router in routing?", "A router is a network device that forwards data packets between different networks. It uses routing tables and algorithms to determine the best path for data to travel from the source to the destination.");
        addAssignmentToProblemAnswer(pa_6_4_7, assignment6_4);
        addProblemAnswerToAssignment(assignment6_4, pa_6_4_7);

        ProblemAnswer pa_6_4_8 = createProblemAnswer("What is a routing table?", "A routing table is a data structure used by routers to store information about the paths to different network destinations. It includes details such as destination IP addresses, next-hop addresses, and metrics for each route.");
        addAssignmentToProblemAnswer(pa_6_4_8, assignment6_4);
        addProblemAnswerToAssignment(assignment6_4, pa_6_4_8);

        ProblemAnswer pa_6_4_9 = createProblemAnswer("What is the purpose of the default route in routing?", "The default route is a route used by a router when no specific path to a destination is found in the routing table. It directs data packets to a default gateway, which handles their further routing.");
        addAssignmentToProblemAnswer(pa_6_4_9, assignment6_4);
        addProblemAnswerToAssignment(assignment6_4, pa_6_4_9);

        ProblemAnswer pa_6_4_10 = createProblemAnswer("What is the significance of convergence in routing?", "Convergence in routing refers to the process by which all routers in a network update their routing tables and reach a consistent state after a change in the network topology. It ensures that data packets are routed correctly and efficiently.");
        addAssignmentToProblemAnswer(pa_6_4_10, assignment6_4);
        addProblemAnswerToAssignment(assignment6_4, pa_6_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Routing' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6_5 = createAssignment("Switching Assignment", faculty1, Date.from(LocalDate.of(2027, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus6, false);

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

        ProblemAnswer pa_6_5_6 = createProblemAnswer("How does a layer 2 switch differ from a layer 3 switch?", "A layer 2 switch operates at the Data Link layer and uses MAC addresses to forward data, while a layer 3 switch operates at the Network layer and uses IP addresses to perform routing functions in addition to switching.");
        addAssignmentToProblemAnswer(pa_6_5_6, assignment6_5);
        addProblemAnswerToAssignment(assignment6_5, pa_6_5_6);

        ProblemAnswer pa_6_5_7 = createProblemAnswer("What is the purpose of a MAC address in switching?", "A MAC address (Media Access Control address) is a unique identifier assigned to network interfaces for communication on the physical network. Switches use MAC addresses to forward data packets to the correct destination.");
        addAssignmentToProblemAnswer(pa_6_5_7, assignment6_5);
        addProblemAnswerToAssignment(assignment6_5, pa_6_5_7);

        ProblemAnswer pa_6_5_8 = createProblemAnswer("What is a switch fabric?", "A switch fabric is the internal architecture of a switch that determines how data packets are transmitted between input and output ports. It plays a crucial role in the performance and efficiency of the switch.");
        addAssignmentToProblemAnswer(pa_6_5_8, assignment6_5);
        addProblemAnswerToAssignment(assignment6_5, pa_6_5_8);

        ProblemAnswer pa_6_5_9 = createProblemAnswer("What is store-and-forward switching?", "Store-and-forward switching is a method where the switch stores the entire data packet before forwarding it to the destination. It ensures error checking and reliability but can introduce latency.");
        addAssignmentToProblemAnswer(pa_6_5_9, assignment6_5);
        addProblemAnswerToAssignment(assignment6_5, pa_6_5_9);

        ProblemAnswer pa_6_5_10 = createProblemAnswer("What is cut-through switching?", "Cut-through switching is a method where the switch starts forwarding the data packet as soon as it reads the destination address, without waiting for the entire packet to be received. It reduces latency but may not perform error checking.");
        addAssignmentToProblemAnswer(pa_6_5_10, assignment6_5);
        addProblemAnswerToAssignment(assignment6_5, pa_6_5_10);

// Output for confirmation
        System.out.println("Assignment for 'Switching' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment7_1 = createAssignment("Software Development Life Cycle Assignment", faculty2, Date.from(LocalDate.of(2027, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);

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

        ProblemAnswer pa_7_1_6 = createProblemAnswer("What is the purpose of the requirements analysis phase in the SDLC?", "The purpose of the requirements analysis phase is to gather and define the functional and non-functional requirements of the software. It involves identifying the needs and expectations of stakeholders and documenting them in a requirements specification.");
        addAssignmentToProblemAnswer(pa_7_1_6, assignment7_1);
        addProblemAnswerToAssignment(assignment7_1, pa_7_1_6);

        ProblemAnswer pa_7_1_7 = createProblemAnswer("What is the purpose of the system design phase in the SDLC?", "The purpose of the system design phase is to create a detailed design of the software based on the requirements specification. It involves defining the architecture, components, interfaces, and data structures of the system.");
        addAssignmentToProblemAnswer(pa_7_1_7, assignment7_1);
        addProblemAnswerToAssignment(assignment7_1, pa_7_1_7);

        ProblemAnswer pa_7_1_8 = createProblemAnswer("What is the purpose of the implementation phase in the SDLC?", "The purpose of the implementation phase is to develop the actual code for the software based on the design specifications. It involves programming, coding, and integrating the various components of the system.");
        addAssignmentToProblemAnswer(pa_7_1_8, assignment7_1);
        addProblemAnswerToAssignment(assignment7_1, pa_7_1_8);

        ProblemAnswer pa_7_1_9 = createProblemAnswer("What is the purpose of the testing phase in the SDLC?", "The purpose of the testing phase is to verify and validate that the software meets the requirements and functions as expected. It involves identifying and fixing defects, ensuring quality, and performing various tests such as unit, integration, and system testing.");
        addAssignmentToProblemAnswer(pa_7_1_9, assignment7_1);
        addProblemAnswerToAssignment(assignment7_1, pa_7_1_9);

        ProblemAnswer pa_7_1_10 = createProblemAnswer("What is the purpose of the maintenance phase in the SDLC?", "The purpose of the maintenance phase is to provide ongoing support and updates for the software after deployment. It involves fixing bugs, making enhancements, and ensuring the software continues to meet user needs.");
        addAssignmentToProblemAnswer(pa_7_1_10, assignment7_1);
        addProblemAnswerToAssignment(assignment7_1, pa_7_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Software Development Life Cycle' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment7_2 = createAssignment("Agile Assignment", faculty2, Date.from(LocalDate.of(2027, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);

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

        ProblemAnswer pa_7_2_6 = createProblemAnswer("What is a Sprint in Agile?", "A Sprint is a fixed-length time period, typically 1-4 weeks, during which a specific set of work items or tasks are completed. It is a core component of the Scrum framework and allows teams to deliver incremental improvements to the software.");
        addAssignmentToProblemAnswer(pa_7_2_6, assignment7_2);
        addProblemAnswerToAssignment(assignment7_2, pa_7_2_6);

        ProblemAnswer pa_7_2_7 = createProblemAnswer("What is the role of the Scrum Master?", "The Scrum Master is responsible for facilitating the Scrum process, removing impediments, and ensuring that the team follows Agile principles and practices. They act as a coach and mentor to the development team.");
        addAssignmentToProblemAnswer(pa_7_2_7, assignment7_2);
        addProblemAnswerToAssignment(assignment7_2, pa_7_2_7);

        ProblemAnswer pa_7_2_8 = createProblemAnswer("What is the role of the Product Owner?", "The Product Owner is responsible for defining and prioritizing the product backlog, ensuring that the development team works on the most valuable tasks. They act as a liaison between the stakeholders and the development team.");
        addAssignmentToProblemAnswer(pa_7_2_8, assignment7_2);
        addProblemAnswerToAssignment(assignment7_2, pa_7_2_8);

        ProblemAnswer pa_7_2_9 = createProblemAnswer("What is a user story in Agile?", "A user story is a simple, concise description of a feature or functionality from the perspective of the end-user. It typically follows the format: 'As a user, I want to [goal] so that [reason].'");
        addAssignmentToProblemAnswer(pa_7_2_9, assignment7_2);
        addProblemAnswerToAssignment(assignment7_2, pa_7_2_9);

        ProblemAnswer pa_7_2_10 = createProblemAnswer("How does Kanban differ from Scrum?", "Kanban differs from Scrum in that it is less structured and does not have fixed-length iterations (Sprints). Kanban focuses on continuous delivery and flow, while Scrum emphasizes iterative development through Sprints.");
        addAssignmentToProblemAnswer(pa_7_2_10, assignment7_2);
        addProblemAnswerToAssignment(assignment7_2, pa_7_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Agile' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment7_3 = createAssignment("Waterfall Assignment", faculty2, Date.from(LocalDate.of(2027, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);

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

        ProblemAnswer pa_7_3_6 = createProblemAnswer("What is the purpose of the testing phase in the Waterfall model?", "The purpose of the testing phase is to verify and validate that the software meets the requirements and functions as expected. It involves identifying and fixing defects, ensuring quality, and performing various tests such as unit, integration, and system testing.");
        addAssignmentToProblemAnswer(pa_7_3_6, assignment7_3);
        addProblemAnswerToAssignment(assignment7_3, pa_7_3_6);

        ProblemAnswer pa_7_3_7 = createProblemAnswer("What is the purpose of the deployment phase in the Waterfall model?", "The purpose of the deployment phase is to release the software to the end-users and ensure it is properly installed and configured. It involves preparing the system for production and providing user training and support.");
        addAssignmentToProblemAnswer(pa_7_3_7, assignment7_3);
        addProblemAnswerToAssignment(assignment7_3, pa_7_3_7);

        ProblemAnswer pa_7_3_8 = createProblemAnswer("What is the purpose of the maintenance phase in the Waterfall model?", "The purpose of the maintenance phase is to provide ongoing support and updates for the software after deployment. It involves fixing bugs, making enhancements, and ensuring the software continues to meet user needs.");
        addAssignmentToProblemAnswer(pa_7_3_8, assignment7_3);
        addProblemAnswerToAssignment(assignment7_3, pa_7_3_8);

        ProblemAnswer pa_7_3_9 = createProblemAnswer("What are the advantages of the Waterfall model?", "Advantages of the Waterfall model include: (1) Clear and structured phases, (2) Easy to manage and track progress, (3) Well-documented requirements and design, (4) Suitable for projects with well-defined requirements.");
        addAssignmentToProblemAnswer(pa_7_3_9, assignment7_3);
        addProblemAnswerToAssignment(assignment7_3, pa_7_3_9);

        ProblemAnswer pa_7_3_10 = createProblemAnswer("What are the disadvantages of the Waterfall model?", "Disadvantages of the Waterfall model include: (1) Inflexibility to changes, (2) Late testing and integration, (3) Limited customer feedback during development, (4) Not suitable for complex and dynamic projects.");
        addAssignmentToProblemAnswer(pa_7_3_10, assignment7_3);
        addProblemAnswerToAssignment(assignment7_3, pa_7_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Waterfall' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment7_4 = createAssignment("Project Management Assignment", faculty2, Date.from(LocalDate.of(2027, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus7, false);

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

        ProblemAnswer pa_7_4_6 = createProblemAnswer("What is risk management in project management?", "Risk management involves identifying, assessing, and mitigating potential risks that could impact the project's success. It includes developing risk management plans, monitoring risks, and implementing strategies to minimize their impact.");
        addAssignmentToProblemAnswer(pa_7_4_6, assignment7_4);
        addProblemAnswerToAssignment(assignment7_4, pa_7_4_6);

        ProblemAnswer pa_7_4_7 = createProblemAnswer("What is quality assurance in project management?", "Quality assurance involves ensuring that the project's deliverables meet the required standards and specifications. It includes defining quality criteria, conducting quality audits, and implementing continuous improvement processes.");
        addAssignmentToProblemAnswer(pa_7_4_7, assignment7_4);
        addProblemAnswerToAssignment(assignment7_4, pa_7_4_7);

        ProblemAnswer pa_7_4_8 = createProblemAnswer("What are some common project management tools?", "Common project management tools include Gantt charts, project management software (e.g., Microsoft Project, Trello, Asana), work breakdown structures (WBS), and critical path method (CPM) charts.");
        addAssignmentToProblemAnswer(pa_7_4_8, assignment7_4);
        addProblemAnswerToAssignment(assignment7_4, pa_7_4_8);

        ProblemAnswer pa_7_4_9 = createProblemAnswer("What is the role of a project manager?", "The project manager is responsible for planning, executing, and closing projects. They manage the project team, resources, schedule, budget, and risks to ensure successful project completion.");
        addAssignmentToProblemAnswer(pa_7_4_9, assignment7_4);
        addProblemAnswerToAssignment(assignment7_4, pa_7_4_9);

        ProblemAnswer pa_7_4_10 = createProblemAnswer("What is the importance of communication in project management?", "Communication is crucial in project management for ensuring that all stakeholders are informed and aligned. It involves sharing project updates, addressing issues, and facilitating collaboration among team members.");
        addAssignmentToProblemAnswer(pa_7_4_10, assignment7_4);
        addProblemAnswerToAssignment(assignment7_4, pa_7_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Project Management' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment8_1 = createAssignment("HTML Assignment", faculty3, Date.from(LocalDate.of(2027, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);

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

        ProblemAnswer pa_8_1_6 = createProblemAnswer("What is an HTML element?", "An HTML element is a piece of content defined by a start tag, its content, and an end tag. For example, <p>This is a paragraph.</p> is an HTML element.");
        addAssignmentToProblemAnswer(pa_8_1_6, assignment8_1);
        addProblemAnswerToAssignment(assignment8_1, pa_8_1_6);

        ProblemAnswer pa_8_1_7 = createProblemAnswer("How do you create a hyperlink in HTML?", "To create a hyperlink in HTML, use the <a> (anchor) tag with the href attribute. For example: <a href=\"https://example.com\">Visit Example</a>");
        addAssignmentToProblemAnswer(pa_8_1_7, assignment8_1);
        addProblemAnswerToAssignment(assignment8_1, pa_8_1_7);

        ProblemAnswer pa_8_1_8 = createProblemAnswer("How do you insert an image in HTML?", "To insert an image in HTML, use the <img> tag with the src attribute. For example: <img src=\"image.jpg\" alt=\"Description of the image\">");
        addAssignmentToProblemAnswer(pa_8_1_8, assignment8_1);
        addProblemAnswerToAssignment(assignment8_1, pa_8_1_8);

        ProblemAnswer pa_8_1_9 = createProblemAnswer("What is an HTML list?", "An HTML list is a collection of related items. There are two main types of lists: ordered lists (<ol>) and unordered lists (<ul>). Each item in the list is defined by the <li> tag.");
        addAssignmentToProblemAnswer(pa_8_1_9, assignment8_1);
        addProblemAnswerToAssignment(assignment8_1, pa_8_1_9);

        ProblemAnswer pa_8_1_10 = createProblemAnswer("What is the purpose of the <div> tag in HTML?", "The <div> tag is a container element used to group together other elements and apply styles or layout controls. It does not have any specific meaning or visual representation by itself.");
        addAssignmentToProblemAnswer(pa_8_1_10, assignment8_1);
        addProblemAnswerToAssignment(assignment8_1, pa_8_1_10);

// Output for confirmation
        System.out.println("Assignment for 'HTML' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment8_2 = createAssignment("CSS Assignment", faculty3, Date.from(LocalDate.of(2027, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);

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

        ProblemAnswer pa_8_2_6 = createProblemAnswer("How do you create a class in CSS?", "To create a class in CSS, use the class selector (.) followed by the class name. For example: \n.exampleClass {\n  color: red;\n  background-color: yellow;\n}");
        addAssignmentToProblemAnswer(pa_8_2_6, assignment8_2);
        addProblemAnswerToAssignment(assignment8_2, pa_8_2_6);

        ProblemAnswer pa_8_2_7 = createProblemAnswer("What is a CSS ID selector?", "A CSS ID selector uses the ID attribute of an HTML element to select and style a specific element. It is denoted by the hash symbol (#) followed by the ID name. For example: \n#exampleID {\n  color: green;\n  font-weight: bold;\n}");
        addAssignmentToProblemAnswer(pa_8_2_7, assignment8_2);
        addProblemAnswerToAssignment(assignment8_2, pa_8_2_7);

        ProblemAnswer pa_8_2_8 = createProblemAnswer("What is the difference between inline, internal, and external CSS?", "Inline CSS is applied directly within an HTML element using the style attribute. Internal CSS is defined within the <style> tag inside the <head> section of an HTML document. External CSS is defined in a separate .css file and linked to the HTML document using the <link> tag.");
        addAssignmentToProblemAnswer(pa_8_2_8, assignment8_2);
        addProblemAnswerToAssignment(assignment8_2, pa_8_2_8);

        ProblemAnswer pa_8_2_9 = createProblemAnswer("How do you make a web page responsive using CSS?", "To make a web page responsive, use media queries in CSS to apply different styles based on the screen size and device type. For example: \n@media (max-width: 600px) {\n  body {\n    background-color: lightblue;\n  }\n}");
        addAssignmentToProblemAnswer(pa_8_2_9, assignment8_2);
        addProblemAnswerToAssignment(assignment8_2, pa_8_2_9);

        ProblemAnswer pa_8_2_10 = createProblemAnswer("What are CSS frameworks?", "CSS frameworks are pre-prepared libraries that make it easier to create responsive and visually appealing web designs. Examples include Bootstrap, Foundation, and Bulma.");
        addAssignmentToProblemAnswer(pa_8_2_10, assignment8_2);
        addProblemAnswerToAssignment(assignment8_2, pa_8_2_10);

// Output for confirmation
        System.out.println("Assignment for 'CSS' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment8_3 = createAssignment("JavaScript Assignment", faculty3, Date.from(LocalDate.of(2027, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);

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

        ProblemAnswer pa_8_3_6 = createProblemAnswer("What is an array in JavaScript?", "An array is a data structure that can hold multiple values. It is defined using square brackets. For example: \nlet fruits = ['apple', 'banana', 'orange'];");
        addAssignmentToProblemAnswer(pa_8_3_6, assignment8_3);
        addProblemAnswerToAssignment(assignment8_3, pa_8_3_6);

        ProblemAnswer pa_8_3_7 = createProblemAnswer("How do you loop through an array in JavaScript?", "You can loop through an array using a for loop, forEach method, or other iteration methods. For example, using a for loop: \nfor (let i = 0; i < array.length; i++) {\n  console.log(array[i]);\n}");
        addAssignmentToProblemAnswer(pa_8_3_7, assignment8_3);
        addProblemAnswerToAssignment(assignment8_3, pa_8_3_7);

        ProblemAnswer pa_8_3_8 = createProblemAnswer("How do you manipulate the DOM with JavaScript?", "You can manipulate the DOM by selecting elements and modifying their properties, attributes, or styles. For example: \ndocument.getElementById('elementID').style.color = 'red';");
        addAssignmentToProblemAnswer(pa_8_3_8, assignment8_3);
        addProblemAnswerToAssignment(assignment8_3, pa_8_3_8);

        ProblemAnswer pa_8_3_9 = createProblemAnswer("What is a function in JavaScript?", "A function is a block of code designed to perform a particular task. It is defined using the function keyword. For example: \nfunction greet() {\n  console.log('Hello, World!');\n}");
        addAssignmentToProblemAnswer(pa_8_3_9, assignment8_3);
        addProblemAnswerToAssignment(assignment8_3, pa_8_3_9);

        ProblemAnswer pa_8_3_10 = createProblemAnswer("What is the difference between let and var in JavaScript?", "The let keyword declares a block-scoped variable, while the var keyword declares a function-scoped variable. let is preferred in modern JavaScript because it prevents common issues related to variable hoisting.");
        addAssignmentToProblemAnswer(pa_8_3_10, assignment8_3);
        addProblemAnswerToAssignment(assignment8_3, pa_8_3_10);

// Output for confirmation
        System.out.println("Assignment for 'JavaScript' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment8_4 = createAssignment("React Assignment", faculty3, Date.from(LocalDate.of(2027, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);

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

        ProblemAnswer pa_8_4_6 = createProblemAnswer("How do you create a React component?", "You can create a React component using a function or a class. For example, a functional component:\n```javascript\nfunction Welcome() {\n  return <h1>Hello, World!</h1>;\n}\n```");
        addAssignmentToProblemAnswer(pa_8_4_6, assignment8_4);
        addProblemAnswerToAssignment(assignment8_4, pa_8_4_6);

        ProblemAnswer pa_8_4_7 = createProblemAnswer("What is the useEffect hook in React?", "The useEffect hook allows you to perform side effects in functional components, such as fetching data, subscribing to events, or updating the DOM. It runs after the component renders and can be configured to run conditionally.");
        addAssignmentToProblemAnswer(pa_8_4_7, assignment8_4);
        addProblemAnswerToAssignment(assignment8_4, pa_8_4_7);

        ProblemAnswer pa_8_4_8 = createProblemAnswer("What is the virtual DOM in React?", "The virtual DOM is a lightweight representation of the real DOM used by React to optimize rendering. React updates the virtual DOM first and then efficiently updates the real DOM based on the changes.");
        addAssignmentToProblemAnswer(pa_8_4_8, assignment8_4);
        addProblemAnswerToAssignment(assignment8_4, pa_8_4_8);

        ProblemAnswer pa_8_4_9 = createProblemAnswer("What is a single-page application (SPA)?", "A single-page application (SPA) is a web application that loads a single HTML page and dynamically updates the content as the user interacts with the app. React is commonly used to build SPAs due to its efficient rendering and state management.");
        addAssignmentToProblemAnswer(pa_8_4_9, assignment8_4);
        addProblemAnswerToAssignment(assignment8_4, pa_8_4_9);

        ProblemAnswer pa_8_4_10 = createProblemAnswer("What are React hooks?", "React hooks are functions that allow you to use state and other React features in functional components. Common hooks include useState, useEffect, useContext, and useReducer.");
        addAssignmentToProblemAnswer(pa_8_4_10, assignment8_4);
        addProblemAnswerToAssignment(assignment8_4, pa_8_4_10);

// Output for confirmation
        System.out.println("Assignment for 'React' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment8_5 = createAssignment("Backend Integration Assignment", faculty3, Date.from(LocalDate.of(2027, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus8, false);

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

        ProblemAnswer pa_8_5_6 = createProblemAnswer("How do you handle authentication in backend integration?", "Authentication in backend integration involves verifying the identity of users and granting access to protected resources. Common methods include session-based authentication, token-based authentication (e.g., JWT), and OAuth.");
        addAssignmentToProblemAnswer(pa_8_5_6, assignment8_5);
        addProblemAnswerToAssignment(assignment8_5, pa_8_5_6);

        ProblemAnswer pa_8_5_7 = createProblemAnswer("What is a database and how is it used in backend integration?", "A database is a structured collection of data that can be accessed and managed electronically. In backend integration, databases are used to store, retrieve, and manipulate data required by web applications.");
        addAssignmentToProblemAnswer(pa_8_5_7, assignment8_5);
        addProblemAnswerToAssignment(assignment8_5, pa_8_5_7);

        ProblemAnswer pa_8_5_8 = createProblemAnswer("What are some common databases used in backend integration?", "Common databases used in backend integration include relational databases (e.g., MySQL, PostgreSQL), NoSQL databases (e.g., MongoDB, CouchDB), and in-memory databases (e.g., Redis).");
        addAssignmentToProblemAnswer(pa_8_5_8, assignment8_5);
        addProblemAnswerToAssignment(assignment8_5, pa_8_5_8);

        ProblemAnswer pa_8_5_9 = createProblemAnswer("What is the role of middleware in backend integration?", "Middleware is software that acts as an intermediary between the front end and backend services. It handles tasks such as request and response processing, authentication, and routing.");
        addAssignmentToProblemAnswer(pa_8_5_9, assignment8_5);
        addProblemAnswerToAssignment(assignment8_5, pa_8_5_9);

        ProblemAnswer pa_8_5_10 = createProblemAnswer("How do you test backend integration?", "Testing backend integration involves verifying that the front end correctly communicates with the backend services. It includes unit tests for individual functions, integration tests for combined components, and end-to-end tests for the entire application workflow.");
        addAssignmentToProblemAnswer(pa_8_5_10, assignment8_5);
        addProblemAnswerToAssignment(assignment8_5, pa_8_5_10);

// Output for confirmation
        System.out.println("Assignment for 'Backend Integration' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment9_1 = createAssignment("Machine Learning Assignment", faculty4, Date.from(LocalDate.of(2028, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);

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

        ProblemAnswer pa_9_1_6 = createProblemAnswer("What is deep learning?", "Deep learning is a subset of machine learning that involves neural networks with many layers. These deep neural networks can learn complex patterns and representations from large amounts of data.");
        addAssignmentToProblemAnswer(pa_9_1_6, assignment9_1);
        addProblemAnswerToAssignment(assignment9_1, pa_9_1_6);

        ProblemAnswer pa_9_1_7 = createProblemAnswer("What is a training dataset in machine learning?", "A training dataset is a collection of data used to train a machine learning model. It includes input features and corresponding labels or outcomes that the model learns to predict.");
        addAssignmentToProblemAnswer(pa_9_1_7, assignment9_1);
        addProblemAnswerToAssignment(assignment9_1, pa_9_1_7);

        ProblemAnswer pa_9_1_8 = createProblemAnswer("What is a test dataset in machine learning?", "A test dataset is a collection of data used to evaluate the performance of a machine learning model. It includes input features and corresponding labels that the model has not seen during training.");
        addAssignmentToProblemAnswer(pa_9_1_8, assignment9_1);
        addProblemAnswerToAssignment(assignment9_1, pa_9_1_8);

        ProblemAnswer pa_9_1_9 = createProblemAnswer("What is overfitting in machine learning?", "Overfitting occurs when a machine learning model learns the training data too well, including noise and outliers. As a result, the model performs poorly on new, unseen data.");
        addAssignmentToProblemAnswer(pa_9_1_9, assignment9_1);
        addProblemAnswerToAssignment(assignment9_1, pa_9_1_9);

        ProblemAnswer pa_9_1_10 = createProblemAnswer("What is cross-validation in machine learning?", "Cross-validation is a technique used to evaluate the performance of a machine learning model by splitting the data into multiple subsets. The model is trained and tested on different subsets to ensure it generalizes well to new data.");
        addAssignmentToProblemAnswer(pa_9_1_10, assignment9_1);
        addProblemAnswerToAssignment(assignment9_1, pa_9_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Machine Learning' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment9_2 = createAssignment("Neural Networks Assignment", faculty4, Date.from(LocalDate.of(2028, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);

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

        ProblemAnswer pa_9_2_6 = createProblemAnswer("What is a convolutional neural network (CNN)?", "A convolutional neural network (CNN) is a type of neural network designed for processing structured grid data, such as images. It uses convolutional layers to automatically detect and learn features from the input data.");
        addAssignmentToProblemAnswer(pa_9_2_6, assignment9_2);
        addProblemAnswerToAssignment(assignment9_2, pa_9_2_6);

        ProblemAnswer pa_9_2_7 = createProblemAnswer("What is a recurrent neural network (RNN)?", "A recurrent neural network (RNN) is a type of neural network designed for sequential data processing. It uses feedback connections to maintain a memory of previous inputs, making it suitable for tasks such as time series prediction and natural language processing.");
        addAssignmentToProblemAnswer(pa_9_2_7, assignment9_2);
        addProblemAnswerToAssignment(assignment9_2, pa_9_2_7);

        ProblemAnswer pa_9_2_8 = createProblemAnswer("What is the role of weights in a neural network?", "Weights are parameters in a neural network that determine the strength of the connections between neurons. During training, the weights are adjusted to minimize the error and improve the model's accuracy.");
        addAssignmentToProblemAnswer(pa_9_2_8, assignment9_2);
        addProblemAnswerToAssignment(assignment9_2, pa_9_2_8);

        ProblemAnswer pa_9_2_9 = createProblemAnswer("What is the difference between supervised and unsupervised learning in the context of neural networks?", "In supervised learning, neural networks are trained on labeled data, where the input-output pairs are provided. In unsupervised learning, neural networks are trained on unlabeled data, and the model learns to find patterns and relationships without explicit input-output pairs.");
        addAssignmentToProblemAnswer(pa_9_2_9, assignment9_2);
        addProblemAnswerToAssignment(assignment9_2, pa_9_2_9);

        ProblemAnswer pa_9_2_10 = createProblemAnswer("What is overfitting in neural networks?", "Overfitting occurs when a neural network learns the training data too well, including noise and outliers. As a result, the model performs poorly on new, unseen data. Techniques such as regularization and dropout can help mitigate overfitting.");
        addAssignmentToProblemAnswer(pa_9_2_10, assignment9_2);
        addProblemAnswerToAssignment(assignment9_2, pa_9_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Neural Networks' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment9_3 = createAssignment("Natural Language Processing Assignment", faculty4, Date.from(LocalDate.of(2028, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);

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

        ProblemAnswer pa_9_3_6 = createProblemAnswer("What is the bag-of-words model?", "The bag-of-words model is an NLP technique used to represent text data as a collection of individual words, disregarding grammar and word order. It is used for text classification and information retrieval tasks.");
        addAssignmentToProblemAnswer(pa_9_3_6, assignment9_3);
        addProblemAnswerToAssignment(assignment9_3, pa_9_3_6);

        ProblemAnswer pa_9_3_7 = createProblemAnswer("What is TF-IDF in NLP?", "TF-IDF (Term Frequency-Inverse Document Frequency) is a statistical measure used to evaluate the importance of a word in a document relative to a collection of documents. It is used for text mining and information retrieval tasks.");
        addAssignmentToProblemAnswer(pa_9_3_7, assignment9_3);
        addProblemAnswerToAssignment(assignment9_3, pa_9_3_7);

        ProblemAnswer pa_9_3_8 = createProblemAnswer("What is a language model in NLP?", "A language model is a probabilistic model used to predict the likelihood of a sequence of words. It is used in various NLP tasks, such as text generation, machine translation, and speech recognition.");
        addAssignmentToProblemAnswer(pa_9_3_8, assignment9_3);
        addProblemAnswerToAssignment(assignment9_3, pa_9_3_8);

        ProblemAnswer pa_9_3_9 = createProblemAnswer("How do you preprocess text data for NLP tasks?", "Preprocessing text data for NLP tasks involves steps such as tokenization, removing stop words, stemming, lemmatization, and converting text to lowercase. These steps help to normalize and clean the text data for analysis.");
        addAssignmentToProblemAnswer(pa_9_3_9, assignment9_3);
        addProblemAnswerToAssignment(assignment9_3, pa_9_3_9);

        ProblemAnswer pa_9_3_10 = createProblemAnswer("What is word embedding in NLP?", "Word embedding is a technique used to represent words as dense vectors in a continuous vector space. It captures the semantic relationships between words based on their context. Common word embedding methods include Word2Vec, GloVe, and FastText.");
        addAssignmentToProblemAnswer(pa_9_3_10, assignment9_3);
        addProblemAnswerToAssignment(assignment9_3, pa_9_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Natural Language Processing' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment10_1 = createAssignment("Threat Analysis Assignment", faculty5, Date.from(LocalDate.of(2028, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);

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

        ProblemAnswer pa_10_1_6 = createProblemAnswer("What are mitigation strategies in threat analysis?", "Mitigation strategies are actions taken to reduce or eliminate the risk of security threats. These can include implementing security controls, patching vulnerabilities, and conducting regular security audits.");
        addAssignmentToProblemAnswer(pa_10_1_6, assignment10_1);
        addProblemAnswerToAssignment(assignment10_1, pa_10_1_6);

        ProblemAnswer pa_10_1_7 = createProblemAnswer("What is the role of threat intelligence in threat analysis?", "Threat intelligence involves collecting and analyzing information about potential threats to improve the effectiveness of threat analysis and mitigation efforts. It helps organizations stay informed about emerging threats and attack techniques.");
        addAssignmentToProblemAnswer(pa_10_1_7, assignment10_1);
        addProblemAnswerToAssignment(assignment10_1, pa_10_1_7);

        ProblemAnswer pa_10_1_8 = createProblemAnswer("What is the importance of regular security audits in threat analysis?", "Regular security audits help identify and address vulnerabilities, ensure compliance with security policies, and improve overall security posture. They are essential for maintaining the effectiveness of threat analysis and mitigation strategies.");
        addAssignmentToProblemAnswer(pa_10_1_8, assignment10_1);
        addProblemAnswerToAssignment(assignment10_1, pa_10_1_8);

        ProblemAnswer pa_10_1_9 = createProblemAnswer("How can organizations improve their threat analysis processes?", "Organizations can improve their threat analysis processes by adopting a proactive approach, leveraging threat intelligence, conducting regular security training, and continuously monitoring and updating security measures.");
        addAssignmentToProblemAnswer(pa_10_1_9, assignment10_1);
        addProblemAnswerToAssignment(assignment10_1, pa_10_1_9);

        ProblemAnswer pa_10_1_10 = createProblemAnswer("What is the role of a security operations center (SOC) in threat analysis?", "A security operations center (SOC) is a centralized unit that monitors and analyzes security incidents in real-time. It plays a crucial role in threat analysis by providing continuous monitoring, incident response, and threat intelligence.");
        addAssignmentToProblemAnswer(pa_10_1_10, assignment10_1);
        addProblemAnswerToAssignment(assignment10_1, pa_10_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Threat Analysis' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment10_2 = createAssignment("Encryption Assignment", faculty5, Date.from(LocalDate.of(2028, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);

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

        ProblemAnswer pa_10_2_6 = createProblemAnswer("What is symmetric encryption?", "Symmetric encryption is a type of encryption that uses the same key for both encryption and decryption. It is efficient and fast, making it suitable for encrypting large amounts of data.");
        addAssignmentToProblemAnswer(pa_10_2_6, assignment10_2);
        addProblemAnswerToAssignment(assignment10_2, pa_10_2_6);

        ProblemAnswer pa_10_2_7 = createProblemAnswer("What is asymmetric encryption?", "Asymmetric encryption is a type of encryption that uses a pair of keys: a public key for encryption and a private key for decryption. It provides a higher level of security and is commonly used for secure communications and digital signatures.");
        addAssignmentToProblemAnswer(pa_10_2_7, assignment10_2);
        addProblemAnswerToAssignment(assignment10_2, pa_10_2_7);

        ProblemAnswer pa_10_2_8 = createProblemAnswer("What is the difference between encryption and hashing?", "Encryption is the process of converting plaintext into ciphertext using a key, and it can be reversed with the correct key. Hashing is a one-way process that converts data into a fixed-length hash value, which cannot be easily reversed. Hashing is used for data integrity and password storage.");
        addAssignmentToProblemAnswer(pa_10_2_8, assignment10_2);
        addProblemAnswerToAssignment(assignment10_2, pa_10_2_8);

        ProblemAnswer pa_10_2_9 = createProblemAnswer("What is end-to-end encryption?", "End-to-end encryption ensures that data is encrypted on the sender's device and decrypted only on the recipient's device. It prevents intermediaries, such as service providers, from accessing the data during transmission.");
        addAssignmentToProblemAnswer(pa_10_2_9, assignment10_2);
        addProblemAnswerToAssignment(assignment10_2, pa_10_2_9);

        ProblemAnswer pa_10_2_10 = createProblemAnswer("What is a digital certificate?", "A digital certificate is an electronic document that verifies the identity of an entity and binds a public key to that entity. It is issued by a trusted certificate authority (CA) and is used to establish secure communications and authenticate users.");
        addAssignmentToProblemAnswer(pa_10_2_10, assignment10_2);
        addProblemAnswerToAssignment(assignment10_2, pa_10_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Encryption' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment10_3 = createAssignment("Network Security Assignment", faculty5, Date.from(LocalDate.of(2028, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);

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

        ProblemAnswer pa_10_3_6 = createProblemAnswer("What is a virtual private network (VPN)?", "A virtual private network (VPN) is a secure connection between a user's device and a private network over the internet. It encrypts data transmission and provides anonymity by masking the user's IP address.");
        addAssignmentToProblemAnswer(pa_10_3_6, assignment10_3);
        addProblemAnswerToAssignment(assignment10_3, pa_10_3_6);

        ProblemAnswer pa_10_3_7 = createProblemAnswer("What is the role of encryption in network security?", "Encryption plays a crucial role in network security by converting data into a secure format during transmission. It ensures that only authorized parties can access and interpret the data, protecting it from eavesdropping and tampering.");
        addAssignmentToProblemAnswer(pa_10_3_7, assignment10_3);
        addProblemAnswerToAssignment(assignment10_3, pa_10_3_7);

        ProblemAnswer pa_10_3_8 = createProblemAnswer("What is a secure socket layer (SSL) and transport layer security (TLS)?", "Secure Socket Layer (SSL) and Transport Layer Security (TLS) are cryptographic protocols that provide secure communication over a computer network. They encrypt data transmitted between web servers and browsers, ensuring data privacy and integrity.");
        addAssignmentToProblemAnswer(pa_10_3_8, assignment10_3);
        addProblemAnswerToAssignment(assignment10_3, pa_10_3_8);

        ProblemAnswer pa_10_3_9 = createProblemAnswer("What is a network access control (NAC)?", "Network access control (NAC) is a security solution that restricts unauthorized devices and users from accessing a network. It enforces policies, authenticates devices, and ensures compliance with security standards.");
        addAssignmentToProblemAnswer(pa_10_3_9, assignment10_3);
        addProblemAnswerToAssignment(assignment10_3, pa_10_3_9);

        ProblemAnswer pa_10_3_10 = createProblemAnswer("What is the importance of network monitoring?", "Network monitoring involves continuously observing network activity to detect and respond to security threats, performance issues, and anomalies. It helps maintain network integrity, availability, and security by identifying and mitigating potential risks.");
        addAssignmentToProblemAnswer(pa_10_3_10, assignment10_3);
        addProblemAnswerToAssignment(assignment10_3, pa_10_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Network Security' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment10_4 = createAssignment("Secure Coding Assignment", faculty5, Date.from(LocalDate.of(2028, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus10, false);

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

        ProblemAnswer pa_10_4_6 = createProblemAnswer("How can you prevent buffer overflow vulnerabilities?", "Buffer overflow vulnerabilities can be prevented by using safe programming practices, such as bounds checking, input validation, and using functions that limit buffer size.");
        addAssignmentToProblemAnswer(pa_10_4_6, assignment10_4);
        addProblemAnswerToAssignment(assignment10_4, pa_10_4_6);

        ProblemAnswer pa_10_4_7 = createProblemAnswer("What is input validation in secure coding?", "Input validation involves checking and sanitizing user inputs to ensure they meet the expected format and do not contain malicious data. It helps prevent security vulnerabilities like SQL injection and XSS.");
        addAssignmentToProblemAnswer(pa_10_4_7, assignment10_4);
        addProblemAnswerToAssignment(assignment10_4, pa_10_4_7);

        ProblemAnswer pa_10_4_8 = createProblemAnswer("What is the principle of least privilege?", "The principle of least privilege involves granting users and systems the minimum level of access necessary to perform their tasks. It reduces the risk of unauthorized access and potential damage.");
        addAssignmentToProblemAnswer(pa_10_4_8, assignment10_4);
        addProblemAnswerToAssignment(assignment10_4, pa_10_4_8);

        ProblemAnswer pa_10_4_9 = createProblemAnswer("Why is proper error handling important in secure coding?", "Proper error handling is important because it prevents revealing sensitive information to attackers. It ensures that errors are logged securely and that users receive generic error messages without exposing system details.");
        addAssignmentToProblemAnswer(pa_10_4_9, assignment10_4);
        addProblemAnswerToAssignment(assignment10_4, pa_10_4_9);

        ProblemAnswer pa_10_4_10 = createProblemAnswer("What are best practices for maintaining software security?", "Best practices for maintaining software security include regular code reviews, using secure libraries and frameworks, conducting security testing, keeping software updated, and following secure coding guidelines.");
        addAssignmentToProblemAnswer(pa_10_4_10, assignment10_4);
        addProblemAnswerToAssignment(assignment10_4, pa_10_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Secure Coding' unit created with  problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment11_1 = createAssignment("Limits Assignment", faculty1, Date.from(LocalDate.of(2028, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);

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

        ProblemAnswer pa_11_1_6 = createProblemAnswer("What is an infinite limit?", "An infinite limit occurs when the values of a function increase or decrease without bound as the input approaches a certain value. Mathematically, it is represented as lim(x->c)f(x) = ±∞.");
        addAssignmentToProblemAnswer(pa_11_1_6, assignment11_1);
        addProblemAnswerToAssignment(assignment11_1, pa_11_1_6);

        ProblemAnswer pa_11_1_7 = createProblemAnswer("How do you evaluate a limit at infinity?", "To evaluate a limit at infinity, analyze the behavior of the function as the input grows larger without bound. Simplify the function if necessary and identify the dominant terms to determine the limit.");
        addAssignmentToProblemAnswer(pa_11_1_7, assignment11_1);
        addProblemAnswerToAssignment(assignment11_1, pa_11_1_7);

        ProblemAnswer pa_11_1_8 = createProblemAnswer("What is a removable discontinuity?", "A removable discontinuity occurs when a function is not defined at a point, but the limit exists at that point. The discontinuity can be 'removed' by redefining the function value to match the limit.");
        addAssignmentToProblemAnswer(pa_11_1_8, assignment11_1);
        addProblemAnswerToAssignment(assignment11_1, pa_11_1_8);

        ProblemAnswer pa_11_1_9 = createProblemAnswer("What is the Squeeze Theorem?", "The Squeeze Theorem states that if f(x) ≤ g(x) ≤ h(x) for all x in an interval around c (except possibly at c), and lim(x->c)f(x) = lim(x->c)h(x) = L, then lim(x->c)g(x) = L.");
        addAssignmentToProblemAnswer(pa_11_1_9, assignment11_1);
        addProblemAnswerToAssignment(assignment11_1, pa_11_1_9);

        ProblemAnswer pa_11_1_10 = createProblemAnswer("What is the importance of limits in calculus?", "Limits are important in calculus as they provide a rigorous way to define continuity, derivatives, and integrals. They help understand the behavior of functions at points of interest and are foundational to many concepts in calculus.");
        addAssignmentToProblemAnswer(pa_11_1_10, assignment11_1);
        addProblemAnswerToAssignment(assignment11_1, pa_11_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Limits' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment11_2 = createAssignment("Derivatives Assignment", faculty1, Date.from(LocalDate.of(2028, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);

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

        ProblemAnswer pa_11_2_6 = createProblemAnswer("What is the quotient rule in differentiation?", "The quotient rule is used to find the derivative of the quotient of two functions. It states that (u/v)' = (u'v - uv')/v^2, where u and v are functions of x.");
        addAssignmentToProblemAnswer(pa_11_2_6, assignment11_2);
        addProblemAnswerToAssignment(assignment11_2, pa_11_2_6);

        ProblemAnswer pa_11_2_7 = createProblemAnswer("What is the chain rule in differentiation?", "The chain rule is used to find the derivative of a composite function. It states that if y = f(g(x)), then dy/dx = f'(g(x)) * g'(x).");
        addAssignmentToProblemAnswer(pa_11_2_7, assignment11_2);
        addProblemAnswerToAssignment(assignment11_2, pa_11_2_7);

        ProblemAnswer pa_11_2_8 = createProblemAnswer("What are higher-order derivatives?", "Higher-order derivatives are derivatives of derivatives. The second derivative represents the rate of change of the first derivative, and so on. They provide information about the concavity and acceleration of a function.");
        addAssignmentToProblemAnswer(pa_11_2_8, assignment11_2);
        addProblemAnswerToAssignment(assignment11_2, pa_11_2_8);

        ProblemAnswer pa_11_2_9 = createProblemAnswer("What is implicit differentiation?", "Implicit differentiation is used to find the derivative of functions defined implicitly, rather than explicitly. It involves differentiating both sides of an equation with respect to x and solving for dy/dx.");
        addAssignmentToProblemAnswer(pa_11_2_9, assignment11_2);
        addProblemAnswerToAssignment(assignment11_2, pa_11_2_9);

        ProblemAnswer pa_11_2_10 = createProblemAnswer("What are some applications of derivatives?", "Derivatives have many applications in real-world problems, including finding the rate of change, optimizing functions, determining maximum and minimum values, and modeling motion and growth.");
        addAssignmentToProblemAnswer(pa_11_2_10, assignment11_2);
        addProblemAnswerToAssignment(assignment11_2, pa_11_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Derivatives' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment11_3 = createAssignment("Integrals Assignment", faculty1, Date.from(LocalDate.of(2028, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);

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

        ProblemAnswer pa_11_3_6 = createProblemAnswer("What is integration by parts?", "Integration by parts is a method used to integrate the product of two functions. It is based on the formula ∫u dv = uv - ∫v du, where u and v are functions of x.");
        addAssignmentToProblemAnswer(pa_11_3_6, assignment11_3);
        addProblemAnswerToAssignment(assignment11_3, pa_11_3_6);

        ProblemAnswer pa_11_3_7 = createProblemAnswer("What is the method of partial fractions?", "The method of partial fractions is used to integrate rational functions by expressing them as a sum of simpler fractions. It simplifies the integration process by breaking down complex fractions into more manageable parts.");
        addAssignmentToProblemAnswer(pa_11_3_7, assignment11_3);
        addProblemAnswerToAssignment(assignment11_3, pa_11_3_7);

        ProblemAnswer pa_11_3_8 = createProblemAnswer("How do you find the area under a curve using integrals?", "The area under a curve can be found by calculating the definite integral of the function that represents the curve over the desired interval. The integral gives the accumulated area between the curve and the x-axis.");
        addAssignmentToProblemAnswer(pa_11_3_8, assignment11_3);
        addProblemAnswerToAssignment(assignment11_3, pa_11_3_8);

        ProblemAnswer pa_11_3_9 = createProblemAnswer("What is the volume of a solid of revolution?", "The volume of a solid of revolution is found by rotating a region around an axis and calculating the integral of the resulting solid. It can be calculated using the disk method or the shell method.");
        addAssignmentToProblemAnswer(pa_11_3_9, assignment11_3);
        addProblemAnswerToAssignment(assignment11_3, pa_11_3_9);

        ProblemAnswer pa_11_3_10 = createProblemAnswer("What are some applications of integrals?", "Integrals have many applications in various fields, including calculating areas and volumes, determining displacement and velocity, finding work done by a force, and modeling growth and decay processes.");
        addAssignmentToProblemAnswer(pa_11_3_10, assignment11_3);
        addProblemAnswerToAssignment(assignment11_3, pa_11_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Integrals' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment11_4 = createAssignment("Applications of Calculus Assignment", faculty1, Date.from(LocalDate.of(2028, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus11, false);

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

        ProblemAnswer pa_11_4_6 = createProblemAnswer("How does calculus help in environmental science?", "In environmental science, calculus is used to model and analyze environmental systems, such as population growth, pollution dispersion, and climate change. It helps in understanding the rates of change and accumulation in natural processes.");
        addAssignmentToProblemAnswer(pa_11_4_6, assignment11_4);
        addProblemAnswerToAssignment(assignment11_4, pa_11_4_6);

        ProblemAnswer pa_11_4_7 = createProblemAnswer("What are some applications of calculus in medicine?", "Calculus is used in medicine for modeling the spread of diseases, analyzing medical imaging, and understanding physiological processes. It helps in calculating drug dosage, blood flow rates, and changes in biological systems.");
        addAssignmentToProblemAnswer(pa_11_4_7, assignment11_4);
        addProblemAnswerToAssignment(assignment11_4, pa_11_4_7);

        ProblemAnswer pa_11_4_8 = createProblemAnswer("How is calculus used in business and finance?", "In business and finance, calculus is used to optimize investment strategies, model market trends, and analyze financial data. It helps in calculating interest rates, maximizing profit, and solving differential equations in economic models.");
        addAssignmentToProblemAnswer(pa_11_4_8, assignment11_4);
        addProblemAnswerToAssignment(assignment11_4, pa_11_4_8);

        ProblemAnswer pa_11_4_9 = createProblemAnswer("How does calculus apply to astronomy?", "Calculus is used in astronomy to model and analyze the motion of celestial bodies, calculate orbits, and understand changes in the universe. It helps in solving differential equations that describe gravitational forces and celestial mechanics.");
        addAssignmentToProblemAnswer(pa_11_4_9, assignment11_4);
        addProblemAnswerToAssignment(assignment11_4, pa_11_4_9);

        ProblemAnswer pa_11_4_10 = createProblemAnswer("What are the general benefits of using calculus in real-world problems?", "Calculus provides tools for modeling, analyzing, and solving real-world problems involving rates of change and accumulation. It helps in making accurate predictions, optimizing processes, and understanding complex systems in various fields.");
        addAssignmentToProblemAnswer(pa_11_4_10, assignment11_4);
        addProblemAnswerToAssignment(assignment11_4, pa_11_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Applications of Calculus' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment12_1 = createAssignment("Vectors Assignment", faculty2, Date.from(LocalDate.of(2028, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);

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

        ProblemAnswer pa_12_1_6 = createProblemAnswer("What are unit vectors?", "Unit vectors are vectors with a magnitude of 1. They are used to indicate direction and are often denoted with a hat symbol (e.g., î, ĵ, k̂).");
        addAssignmentToProblemAnswer(pa_12_1_6, assignment12_1);
        addProblemAnswerToAssignment(assignment12_1, pa_12_1_6);

        ProblemAnswer pa_12_1_7 = createProblemAnswer("How do you find the magnitude of a vector?", "The magnitude of a vector is found using the Pythagorean theorem. For a vector (a, b), the magnitude is √(a^2 + b^2).");
        addAssignmentToProblemAnswer(pa_12_1_7, assignment12_1);
        addProblemAnswerToAssignment(assignment12_1, pa_12_1_7);

        ProblemAnswer pa_12_1_8 = createProblemAnswer("What is a zero vector?", "A zero vector is a vector with a magnitude of 0 and no specific direction. It is represented by (0, 0) in two dimensions and (0, 0, 0) in three dimensions.");
        addAssignmentToProblemAnswer(pa_12_1_8, assignment12_1);
        addProblemAnswerToAssignment(assignment12_1, pa_12_1_8);

        ProblemAnswer pa_12_1_9 = createProblemAnswer("How are vectors used in physics?", "Vectors are used in physics to represent quantities such as displacement, velocity, acceleration, and force. They help describe the direction and magnitude of these quantities.");
        addAssignmentToProblemAnswer(pa_12_1_9, assignment12_1);
        addProblemAnswerToAssignment(assignment12_1, pa_12_1_9);

        ProblemAnswer pa_12_1_10 = createProblemAnswer("What is the difference between a vector and a scalar?", "A vector has both magnitude and direction, while a scalar has only magnitude. Examples of vectors include velocity and force, while examples of scalars include temperature and mass.");
        addAssignmentToProblemAnswer(pa_12_1_10, assignment12_1);
        addProblemAnswerToAssignment(assignment12_1, pa_12_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Vectors' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment12_2 = createAssignment("Matrices Assignment", faculty2, Date.from(LocalDate.of(2029, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);

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

        ProblemAnswer pa_12_2_6 = createProblemAnswer("What is the determinant of a matrix?", "The determinant is a scalar value that can be computed from the elements of a square matrix. It provides information about the matrix properties, such as invertibility, and is used in solving linear systems and finding matrix inverses.");
        addAssignmentToProblemAnswer(pa_12_2_6, assignment12_2);
        addProblemAnswerToAssignment(assignment12_2, pa_12_2_6);

        ProblemAnswer pa_12_2_7 = createProblemAnswer("What is a transpose of a matrix?", "The transpose of a matrix is obtained by swapping its rows and columns. If A is an m×n matrix, its transpose, denoted A^T, is an n×m matrix with A^T(i, j) = A(j, i).");
        addAssignmentToProblemAnswer(pa_12_2_7, assignment12_2);
        addProblemAnswerToAssignment(assignment12_2, pa_12_2_7);

        ProblemAnswer pa_12_2_8 = createProblemAnswer("What is a diagonal matrix?", "A diagonal matrix is a square matrix in which all the elements outside the main diagonal are zero. The main diagonal can contain non-zero elements.");
        addAssignmentToProblemAnswer(pa_12_2_8, assignment12_2);
        addProblemAnswerToAssignment(assignment12_2, pa_12_2_8);

        ProblemAnswer pa_12_2_9 = createProblemAnswer("How are matrices used in solving linear equations?", "Matrices are used to represent and solve systems of linear equations. The system of equations can be written as a matrix equation, and various matrix operations, such as Gaussian elimination or matrix inversion, can be used to find the solution.");
        addAssignmentToProblemAnswer(pa_12_2_9, assignment12_2);
        addProblemAnswerToAssignment(assignment12_2, pa_12_2_9);

        ProblemAnswer pa_12_2_10 = createProblemAnswer("What are some applications of matrices?", "Matrices have applications in various fields, including computer graphics, engineering, physics, economics, and statistics. They are used for transformations, modeling systems, data analysis, and solving differential equations.");
        addAssignmentToProblemAnswer(pa_12_2_10, assignment12_2);
        addProblemAnswerToAssignment(assignment12_2, pa_12_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Matrices' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment12_3 = createAssignment("Determinants Assignment", faculty2, Date.from(LocalDate.of(2029, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);

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

        ProblemAnswer pa_12_3_6 = createProblemAnswer("What is the role of determinants in solving linear systems?", "Determinants are used to solve linear systems through Cramer's rule, which provides a method for finding the solutions using the determinants of the coefficient matrix and its submatrices.");
        addAssignmentToProblemAnswer(pa_12_3_6, assignment12_3);
        addProblemAnswerToAssignment(assignment12_3, pa_12_3_6);

        ProblemAnswer pa_12_3_7 = createProblemAnswer("How do you calculate the determinant of a triangular matrix?", "The determinant of a triangular matrix (upper or lower) is the product of its diagonal elements.");
        addAssignmentToProblemAnswer(pa_12_3_7, assignment12_3);
        addProblemAnswerToAssignment(assignment12_3, pa_12_3_7);

        ProblemAnswer pa_12_3_8 = createProblemAnswer("What is the cofactor expansion method for finding determinants?", "The cofactor expansion method involves expressing the determinant of a matrix as a sum of the products of its elements and their cofactors. It is used to calculate determinants of larger matrices by breaking them down into smaller submatrices.");
        addAssignmentToProblemAnswer(pa_12_3_8, assignment12_3);
        addProblemAnswerToAssignment(assignment12_3, pa_12_3_8);

        ProblemAnswer pa_12_3_9 = createProblemAnswer("How do determinants relate to eigenvalues?", "Determinants are related to eigenvalues through the characteristic polynomial of a matrix. The eigenvalues are the roots of this polynomial, and the determinant is the product of the eigenvalues.");
        addAssignmentToProblemAnswer(pa_12_3_9, assignment12_3);
        addProblemAnswerToAssignment(assignment12_3, pa_12_3_9);

        ProblemAnswer pa_12_3_10 = createProblemAnswer("What is the significance of a zero determinant?", "A zero determinant indicates that a matrix is singular, meaning it is not invertible and its rows or columns are linearly dependent. This has implications for solving linear systems and transformations.");
        addAssignmentToProblemAnswer(pa_12_3_10, assignment12_3);
        addProblemAnswerToAssignment(assignment12_3, pa_12_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Determinants' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment12_4 = createAssignment("Eigenvalues Assignment", faculty2, Date.from(LocalDate.of(2029, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);

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

        ProblemAnswer pa_12_4_6 = createProblemAnswer("What are some applications of eigenvalues?", "Eigenvalues have applications in various fields, including vibration analysis, stability analysis, principal component analysis (PCA), quantum mechanics, and computer graphics.");
        addAssignmentToProblemAnswer(pa_12_4_6, assignment12_4);
        addProblemAnswerToAssignment(assignment12_4, pa_12_4_6);

        ProblemAnswer pa_12_4_7 = createProblemAnswer("What is the difference between real and complex eigenvalues?", "Real eigenvalues are numbers on the real number line, while complex eigenvalues have both real and imaginary parts. The nature of the eigenvalues affects the behavior of the matrix under linear transformations.");
        addAssignmentToProblemAnswer(pa_12_4_7, assignment12_4);
        addProblemAnswerToAssignment(assignment12_4, pa_12_4_7);

        ProblemAnswer pa_12_4_8 = createProblemAnswer("What is an eigenvalue decomposition?", "Eigenvalue decomposition is the process of decomposing a matrix into a product of its eigenvectors and eigenvalues. It is used to simplify matrix operations and solve systems of differential equations.");
        addAssignmentToProblemAnswer(pa_12_4_8, assignment12_4);
        addProblemAnswerToAssignment(assignment12_4, pa_12_4_8);

        ProblemAnswer pa_12_4_9 = createProblemAnswer("How do you interpret the geometric meaning of eigenvalues?", "Eigenvalues represent the factor by which the corresponding eigenvectors are stretched or compressed under a linear transformation. They provide insights into the scaling and rotation properties of the transformation.");
        addAssignmentToProblemAnswer(pa_12_4_9, assignment12_4);
        addProblemAnswerToAssignment(assignment12_4, pa_12_4_9);

        ProblemAnswer pa_12_4_10 = createProblemAnswer("What is the significance of the largest eigenvalue of a matrix?", "The largest eigenvalue of a matrix, known as the dominant eigenvalue, often provides important information about the behavior of the matrix under repeated applications. It is used in stability analysis and spectral graph theory.");
        addAssignmentToProblemAnswer(pa_12_4_10, assignment12_4);
        addProblemAnswerToAssignment(assignment12_4, pa_12_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Eigenvalues' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment12_5 = createAssignment("Eigenvectors Assignment", faculty2, Date.from(LocalDate.of(2029, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus12, false);

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

        ProblemAnswer pa_12_5_6 = createProblemAnswer("What is the geometric interpretation of eigenvectors?", "Geometrically, eigenvectors represent directions in which the linear transformation acts by stretching or compressing, without changing the direction. They help visualize how the transformation affects the space.");
        addAssignmentToProblemAnswer(pa_12_5_6, assignment12_5);
        addProblemAnswerToAssignment(assignment12_5, pa_12_5_6);

        ProblemAnswer pa_12_5_7 = createProblemAnswer("How are eigenvectors used in principal component analysis (PCA)?", "In PCA, eigenvectors of the covariance matrix of the data represent the directions of maximum variance. They are used to project the data onto a lower-dimensional space, retaining the most important features.");
        addAssignmentToProblemAnswer(pa_12_5_7, assignment12_5);
        addProblemAnswerToAssignment(assignment12_5, pa_12_5_7);

        ProblemAnswer pa_12_5_8 = createProblemAnswer("What is the role of eigenvectors in stability analysis?", "In stability analysis, eigenvectors help determine the behavior of dynamic systems. They indicate the directions of stable and unstable modes, providing insights into the system's response to perturbations.");
        addAssignmentToProblemAnswer(pa_12_5_8, assignment12_5);
        addProblemAnswerToAssignment(assignment12_5, pa_12_5_8);

        ProblemAnswer pa_12_5_9 = createProblemAnswer("What are the properties of eigenvectors?", "Eigenvectors have properties such as linear independence, and their number is equal to the rank of the matrix. They form the basis of the eigenspace and are used to diagonalize the matrix.");
        addAssignmentToProblemAnswer(pa_12_5_9, assignment12_5);
        addProblemAnswerToAssignment(assignment12_5, pa_12_5_9);

        ProblemAnswer pa_12_5_10 = createProblemAnswer("How do you normalize eigenvectors?", "Eigenvectors can be normalized by dividing them by their magnitude, resulting in a unit vector. Normalization is often done to simplify calculations and interpret the eigenvectors in standard form.");
        addAssignmentToProblemAnswer(pa_12_5_10, assignment12_5);
        addProblemAnswerToAssignment(assignment12_5, pa_12_5_10);

// Output for confirmation
        System.out.println("Assignment for 'Eigenvectors' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment13_1 = createAssignment("Sequences and Series Assignment", faculty3, Date.from(LocalDate.of(2029, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);

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

        ProblemAnswer pa_13_1_6 = createProblemAnswer("What is the ratio test for convergence?", "The ratio test is a method used to determine the convergence or divergence of an infinite series. It involves finding the limit of the ratio of consecutive terms. If the limit is less than 1, the series converges; if it is greater than 1, the series diverges.");
        addAssignmentToProblemAnswer(pa_13_1_6, assignment13_1);
        addProblemAnswerToAssignment(assignment13_1, pa_13_1_6);

        ProblemAnswer pa_13_1_7 = createProblemAnswer("What is the root test for convergence?", "The root test is a method used to determine the convergence or divergence of an infinite series. It involves finding the limit of the nth root of the absolute value of the nth term. If the limit is less than 1, the series converges; if it is greater than 1, the series diverges.");
        addAssignmentToProblemAnswer(pa_13_1_7, assignment13_1);
        addProblemAnswerToAssignment(assignment13_1, pa_13_1_7);

        ProblemAnswer pa_13_1_8 = createProblemAnswer("What is a Taylor series?", "A Taylor series is an infinite series that represents a function as a sum of its derivatives evaluated at a specific point. The Taylor series of a function f(x) at a point a is given by Σ[f^n(a)/n!]*(x-a)^n.");
        addAssignmentToProblemAnswer(pa_13_1_8, assignment13_1);
        addProblemAnswerToAssignment(assignment13_1, pa_13_1_8);

        ProblemAnswer pa_13_1_9 = createProblemAnswer("What is the difference between a Taylor series and a Maclaurin series?", "A Maclaurin series is a special case of a Taylor series where the expansion is centered at zero (a=0). The Maclaurin series of a function f(x) is given by Σ[f^n(0)/n!]*x^n.");
        addAssignmentToProblemAnswer(pa_13_1_9, assignment13_1);
        addProblemAnswerToAssignment(assignment13_1, pa_13_1_9);

        ProblemAnswer pa_13_1_10 = createProblemAnswer("How are sequences and series used in real-world applications?", "Sequences and series have various real-world applications, including in finance (calculating interest and annuities), engineering (signal processing and control systems), physics (modeling waveforms and quantum mechanics), and computer science (algorithm analysis and data structures).");
        addAssignmentToProblemAnswer(pa_13_1_10, assignment13_1);
        addProblemAnswerToAssignment(assignment13_1, pa_13_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Sequences and Series' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment13_2 = createAssignment("Techniques of Integration Assignment", faculty3, Date.from(LocalDate.of(2029, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);

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

        ProblemAnswer pa_13_2_6 = createProblemAnswer("What is the method of integration by partial fractions?", "Integration by partial fractions involves expressing a rational function as a sum of simpler fractions and integrating each fraction individually. It simplifies the integration process by breaking down complex fractions.");
        addAssignmentToProblemAnswer(pa_13_2_6, assignment13_2);
        addProblemAnswerToAssignment(assignment13_2, pa_13_2_6);

        ProblemAnswer pa_13_2_7 = createProblemAnswer("How do you evaluate integrals using trigonometric identities?", "Integrals can be evaluated using trigonometric identities by transforming the integrand into a simpler form. Common identities used include Pythagorean identities, angle sum and difference identities, and double angle identities.");
        addAssignmentToProblemAnswer(pa_13_2_7, assignment13_2);
        addProblemAnswerToAssignment(assignment13_2, pa_13_2_7);

        ProblemAnswer pa_13_2_8 = createProblemAnswer("What is the method of cylindrical shells?", "The method of cylindrical shells is used to find the volume of a solid of revolution. It involves integrating the circumference and height of cylindrical shells obtained by rotating a region around an axis.");
        addAssignmentToProblemAnswer(pa_13_2_8, assignment13_2);
        addProblemAnswerToAssignment(assignment13_2, pa_13_2_8);

        ProblemAnswer pa_13_2_9 = createProblemAnswer("What is the method of disks and washers?", "The method of disks and washers is used to find the volume of a solid of revolution. It involves integrating the area of cross-sectional disks or washers perpendicular to the axis of rotation.");
        addAssignmentToProblemAnswer(pa_13_2_9, assignment13_2);
        addProblemAnswerToAssignment(assignment13_2, pa_13_2_9);

        ProblemAnswer pa_13_2_10 = createProblemAnswer("What are some real-world applications of advanced integration techniques?", "Advanced integration techniques have various real-world applications, including calculating areas and volumes of complex shapes, solving differential equations, analyzing physical systems, and modeling economic and biological processes.");
        addAssignmentToProblemAnswer(pa_13_2_10, assignment13_2);
        addProblemAnswerToAssignment(assignment13_2, pa_13_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Techniques of Integration' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment13_3 = createAssignment("Multivariable Functions Assignment", faculty3, Date.from(LocalDate.of(2029, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);

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

        ProblemAnswer pa_13_3_6 = createProblemAnswer("What is the Hessian matrix?", "The Hessian matrix is a square matrix of second-order partial derivatives of a multivariable function. It provides information about the curvature of the function and is used in optimization problems.");
        addAssignmentToProblemAnswer(pa_13_3_6, assignment13_3);
        addProblemAnswerToAssignment(assignment13_3, pa_13_3_6);

        ProblemAnswer pa_13_3_7 = createProblemAnswer("What is a level curve?", "A level curve is a curve along which a multivariable function has a constant value. It is used to visualize the behavior of the function in two dimensions and is often used in contour plots.");
        addAssignmentToProblemAnswer(pa_13_3_7, assignment13_3);
        addProblemAnswerToAssignment(assignment13_3, pa_13_3_7);

        ProblemAnswer pa_13_3_8 = createProblemAnswer("How do you find the maximum and minimum values of a multivariable function?", "To find the maximum and minimum values of a multivariable function, you can use techniques such as setting the gradient equal to zero to find critical points and analyzing the behavior of the function at these points and along the boundaries.");
        addAssignmentToProblemAnswer(pa_13_3_8, assignment13_3);
        addProblemAnswerToAssignment(assignment13_3, pa_13_3_8);

        ProblemAnswer pa_13_3_9 = createProblemAnswer("What is a Lagrange multiplier?", "A Lagrange multiplier is a method used to find the maximum and minimum values of a function subject to constraints. It involves adding the constraint to the function using a new variable (the Lagrange multiplier) and solving for the variables.");
        addAssignmentToProblemAnswer(pa_13_3_9, assignment13_3);
        addProblemAnswerToAssignment(assignment13_3, pa_13_3_9);

        ProblemAnswer pa_13_3_10 = createProblemAnswer("What are some real-world applications of multivariable functions?", "Multivariable functions have various real-world applications, including in physics (modeling fluid dynamics and electromagnetic fields), engineering (analyzing stress and strain in materials), economics (optimizing production and consumption), and environmental science (modeling pollution dispersion).");
        addAssignmentToProblemAnswer(pa_13_3_10, assignment13_3);
        addProblemAnswerToAssignment(assignment13_3, pa_13_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Multivariable Functions' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment13_4 = createAssignment("Vector Calculus Assignment", faculty3, Date.from(LocalDate.of(2029, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);

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

        ProblemAnswer pa_13_4_6 = createProblemAnswer("What is the Divergence Theorem?", "The Divergence Theorem relates the surface integral of a vector field over a closed surface to the volume integral of the divergence of the vector field within the enclosed region. It is used to convert between surface integrals and volume integrals and to analyze three-dimensional vector fields.");
        addAssignmentToProblemAnswer(pa_13_4_6, assignment13_4);
        addProblemAnswerToAssignment(assignment13_4, pa_13_4_6);

        ProblemAnswer pa_13_4_7 = createProblemAnswer("What is a gradient vector?", "A gradient vector is a vector that points in the direction of the greatest rate of increase of a scalar function. It is calculated by taking the partial derivatives of the function with respect to each of its variables and combining them into a vector.");
        addAssignmentToProblemAnswer(pa_13_4_7, assignment13_4);
        addProblemAnswerToAssignment(assignment13_4, pa_13_4_7);

        ProblemAnswer pa_13_4_8 = createProblemAnswer("What is a curl of a vector field?", "The curl of a vector field measures the rotation or swirling strength of the field at a point. It is a vector that points in the direction of the axis of rotation and has a magnitude proportional to the strength of the rotation.");
        addAssignmentToProblemAnswer(pa_13_4_8, assignment13_4);
        addProblemAnswerToAssignment(assignment13_4, pa_13_4_8);

        ProblemAnswer pa_13_4_9 = createProblemAnswer("What is divergence of a vector field?", "The divergence of a vector field measures the rate at which the field spreads out or converges at a point. It is a scalar quantity that represents the net flow of the field out of or into the point.");
        addAssignmentToProblemAnswer(pa_13_4_9, assignment13_4);
        addProblemAnswerToAssignment(assignment13_4, pa_13_4_9);

        ProblemAnswer pa_13_4_10 = createProblemAnswer("What are some real-world applications of vector calculus?", "Vector calculus has various real-world applications, including in fluid dynamics (analyzing flow fields), electromagnetism (describing electric and magnetic fields), engineering (designing control systems and analyzing stress and strain), and physics (modeling gravitational and electromagnetic fields).");
        addAssignmentToProblemAnswer(pa_13_4_10, assignment13_4);
        addProblemAnswerToAssignment(assignment13_4, pa_13_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Vector Calculus' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment14_1 = createAssignment("Logic Assignment", faculty4, Date.from(LocalDate.of(2029, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);

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

        ProblemAnswer pa_14_1_6 = createProblemAnswer("What is logical equivalence?", "Logical equivalence occurs when two logical statements have the same truth value in all possible scenarios. Two statements are logically equivalent if their truth tables are identical.");
        addAssignmentToProblemAnswer(pa_14_1_6, assignment14_1);
        addProblemAnswerToAssignment(assignment14_1, pa_14_1_6);

        ProblemAnswer pa_14_1_7 = createProblemAnswer("What is a tautology in logic?", "A tautology is a logical statement that is always true, regardless of the truth values of its components. It is a statement that is true in all possible scenarios.");
        addAssignmentToProblemAnswer(pa_14_1_7, assignment14_1);
        addProblemAnswerToAssignment(assignment14_1, pa_14_1_7);

        ProblemAnswer pa_14_1_8 = createProblemAnswer("What is a contradiction in logic?", "A contradiction is a logical statement that is always false, regardless of the truth values of its components. It is a statement that is false in all possible scenarios.");
        addAssignmentToProblemAnswer(pa_14_1_8, assignment14_1);
        addProblemAnswerToAssignment(assignment14_1, pa_14_1_8);

        ProblemAnswer pa_14_1_9 = createProblemAnswer("What is modus ponens?", "Modus ponens is a rule of inference that states if 'P implies Q' (P → Q) and 'P' is true, then 'Q' must also be true. It is a fundamental rule of logical reasoning.");
        addAssignmentToProblemAnswer(pa_14_1_9, assignment14_1);
        addProblemAnswerToAssignment(assignment14_1, pa_14_1_9);

        ProblemAnswer pa_14_1_10 = createProblemAnswer("How is logic used in problem-solving?", "Logic is used in problem-solving to analyze and structure arguments, identify valid conclusions, and ensure consistency in reasoning. It is a foundational tool in mathematics, computer science, and philosophy.");
        addAssignmentToProblemAnswer(pa_14_1_10, assignment14_1);
        addProblemAnswerToAssignment(assignment14_1, pa_14_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Logic' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment14_2 = createAssignment("Set Theory Assignment", faculty4, Date.from(LocalDate.of(2029, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);

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

        ProblemAnswer pa_14_2_6 = createProblemAnswer("What is the Cartesian product of two sets?", "The Cartesian product of two sets is a set of ordered pairs, where the first element is from the first set and the second element is from the second set. The Cartesian product of sets A and B is denoted by A × B.");
        addAssignmentToProblemAnswer(pa_14_2_6, assignment14_2);
        addProblemAnswerToAssignment(assignment14_2, pa_14_2_6);

        ProblemAnswer pa_14_2_7 = createProblemAnswer("What is a power set?", "The power set of a set is the set of all possible subsets of the original set. If the original set has n elements, its power set will have 2^n elements.");
        addAssignmentToProblemAnswer(pa_14_2_7, assignment14_2);
        addProblemAnswerToAssignment(assignment14_2, pa_14_2_7);

        ProblemAnswer pa_14_2_8 = createProblemAnswer("What is a Venn diagram?", "A Venn diagram is a visual representation of sets and their relationships. It uses overlapping circles to show the union, intersection, and differences of sets.");
        addAssignmentToProblemAnswer(pa_14_2_8, assignment14_2);
        addProblemAnswerToAssignment(assignment14_2, pa_14_2_8);

        ProblemAnswer pa_14_2_9 = createProblemAnswer("What is the principle of inclusion-exclusion?", "The principle of inclusion-exclusion is a formula used to calculate the number of elements in the union of multiple sets. It accounts for the overlapping elements by adding the sizes of individual sets and subtracting the sizes of their intersections.");
        addAssignmentToProblemAnswer(pa_14_2_9, assignment14_2);
        addProblemAnswerToAssignment(assignment14_2, pa_14_2_9);

        ProblemAnswer pa_14_2_10 = createProblemAnswer("What are some real-world applications of set theory?", "Set theory has various real-world applications, including in computer science (database queries and algorithms), probability (defining events and outcomes), logic (formalizing reasoning), and data analysis (grouping and categorizing information).");
        addAssignmentToProblemAnswer(pa_14_2_10, assignment14_2);
        addProblemAnswerToAssignment(assignment14_2, pa_14_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Set Theory' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment14_3 = createAssignment("Graph Theory Assignment", faculty4, Date.from(LocalDate.of(2029, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);

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

        ProblemAnswer pa_14_3_6 = createProblemAnswer("What is a tree in graph theory?", "A tree is a connected, acyclic graph, meaning it has no cycles. It is a hierarchical structure with a unique path between any two vertices. Trees are used to model various hierarchical relationships in computer science and other fields.");
        addAssignmentToProblemAnswer(pa_14_3_6, assignment14_3);
        addProblemAnswerToAssignment(assignment14_3, pa_14_3_6);

        ProblemAnswer pa_14_3_7 = createProblemAnswer("What is a spanning tree?", "A spanning tree of a graph is a subgraph that includes all the vertices of the original graph and is a tree. It provides a way to connect all vertices with the minimum number of edges.");
        addAssignmentToProblemAnswer(pa_14_3_7, assignment14_3);
        addProblemAnswerToAssignment(assignment14_3, pa_14_3_7);

        ProblemAnswer pa_14_3_8 = createProblemAnswer("What is a bipartite graph?", "A bipartite graph is a graph whose vertices can be divided into two disjoint sets such that no two vertices within the same set are adjacent. Bipartite graphs are used to model relationships between two distinct groups.");
        addAssignmentToProblemAnswer(pa_14_3_8, assignment14_3);
        addProblemAnswerToAssignment(assignment14_3, pa_14_3_8);

        ProblemAnswer pa_14_3_9 = createProblemAnswer("What is the degree of a vertex?", "The degree of a vertex in a graph is the number of edges connected to it. In a directed graph, the in-degree is the number of incoming edges, and the out-degree is the number of outgoing edges.");
        addAssignmentToProblemAnswer(pa_14_3_9, assignment14_3);
        addProblemAnswerToAssignment(assignment14_3, pa_14_3_9);

        ProblemAnswer pa_14_3_10 = createProblemAnswer("What are some common graph traversal algorithms?", "Common graph traversal algorithms include Depth-First Search (DFS) and Breadth-First Search (BFS). These algorithms are used to explore and analyze the structure of graphs by visiting vertices in a systematic manner.");
        addAssignmentToProblemAnswer(pa_14_3_10, assignment14_3);
        addProblemAnswerToAssignment(assignment14_3, pa_14_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Graph Theory' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment14_4 = createAssignment("Combinatorics Assignment", faculty4, Date.from(LocalDate.of(2029, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);

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

        ProblemAnswer pa_14_4_6 = createProblemAnswer("What is the binomial theorem?", "The binomial theorem provides a way to expand expressions of the form (a + b)^n. It states that (a + b)^n = Σ[k=0 to n] C(n, k) * a^(n-k) * b^k, where C(n, k) are binomial coefficients.");
        addAssignmentToProblemAnswer(pa_14_4_6, assignment14_4);
        addProblemAnswerToAssignment(assignment14_4, pa_14_4_6);

        ProblemAnswer pa_14_4_7 = createProblemAnswer("What is a combination with repetition?", "A combination with repetition allows for selecting objects where each object can be chosen more than once. The number of such combinations of n objects taken r at a time is given by C(n+r-1, r).");
        addAssignmentToProblemAnswer(pa_14_4_7, assignment14_4);
        addProblemAnswerToAssignment(assignment14_4, pa_14_4_7);

        ProblemAnswer pa_14_4_8 = createProblemAnswer("What is the pigeonhole principle?", "The pigeonhole principle states that if more than n objects are placed into n containers, then at least one container must contain more than one object. It is used to prove the existence of certain properties in combinatorial problems.");
        addAssignmentToProblemAnswer(pa_14_4_8, assignment14_4);
        addProblemAnswerToAssignment(assignment14_4, pa_14_4_8);

        ProblemAnswer pa_14_4_9 = createProblemAnswer("What are derangements?", "Derangements are permutations of a set of objects in which no object appears in its original position. The number of derangements of n objects is given by !n (subfactorial n) and can be calculated using a recursive formula.");
        addAssignmentToProblemAnswer(pa_14_4_9, assignment14_4);
        addProblemAnswerToAssignment(assignment14_4, pa_14_4_9);

        ProblemAnswer pa_14_4_10 = createProblemAnswer("What are some real-world applications of combinatorics?", "Combinatorics has various real-world applications, including in computer science (algorithm analysis and cryptography), biology (genetic combinations and phylogenetics), statistics (probability and data analysis), and operations research (optimization and scheduling).");
        addAssignmentToProblemAnswer(pa_14_4_10, assignment14_4);
        addProblemAnswerToAssignment(assignment14_4, pa_14_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Combinatorics' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment15_1 = createAssignment("Newton's Laws Assignment", faculty5, Date.from(LocalDate.of(2029, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);

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

        ProblemAnswer pa_15_1_6 = createProblemAnswer("What is the concept of equilibrium in mechanics?", "Equilibrium in mechanics refers to a state where the net force acting on an object is zero, resulting in no acceleration. An object in equilibrium can either be at rest or moving with constant velocity.");
        addAssignmentToProblemAnswer(pa_15_1_6, assignment15_1);
        addProblemAnswerToAssignment(assignment15_1, pa_15_1_6);

        ProblemAnswer pa_15_1_7 = createProblemAnswer("What is a free-body diagram?", "A free-body diagram is a graphical representation used to visualize the forces acting on an object. It helps in analyzing the motion of the object by showing all external forces as vectors originating from the object.");
        addAssignmentToProblemAnswer(pa_15_1_7, assignment15_1);
        addProblemAnswerToAssignment(assignment15_1, pa_15_1_7);

        ProblemAnswer pa_15_1_8 = createProblemAnswer("How do you calculate the net force acting on an object?", "The net force acting on an object is calculated by vectorially adding all the individual forces acting on the object. The net force determines the acceleration of the object according to Newton's Second Law of Motion.");
        addAssignmentToProblemAnswer(pa_15_1_8, assignment15_1);
        addProblemAnswerToAssignment(assignment15_1, pa_15_1_8);

        ProblemAnswer pa_15_1_9 = createProblemAnswer("What is the difference between weight and mass?", "Mass is a measure of the amount of matter in an object, while weight is the force exerted by gravity on that object. Mass is measured in kilograms (kg), and weight is measured in newtons (N). Weight is calculated as W = mg, where m is the mass and g is the acceleration due to gravity.");
        addAssignmentToProblemAnswer(pa_15_1_9, assignment15_1);
        addProblemAnswerToAssignment(assignment15_1, pa_15_1_9);

        ProblemAnswer pa_15_1_10 = createProblemAnswer("How are Newton's laws applied in real-world scenarios?", "Newton's laws are applied in various real-world scenarios, such as calculating the motion of vehicles, analyzing the stability of structures, understanding the behavior of fluids, and predicting the motion of celestial bodies. These laws provide a framework for solving problems in mechanics and engineering.");
        addAssignmentToProblemAnswer(pa_15_1_10, assignment15_1);
        addProblemAnswerToAssignment(assignment15_1, pa_15_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Newton's Laws' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment15_2 = createAssignment("Energy Principles Assignment", faculty5, Date.from(LocalDate.of(2029, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);

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

        ProblemAnswer pa_15_2_6 = createProblemAnswer("What is power?", "Power is the rate at which work is done or energy is transferred. It is calculated using the formula P = W/t or P = ΔE/t, where P is the power, W is the work done, ΔE is the change in energy, and t is the time taken. Power is measured in watts (W).");
        addAssignmentToProblemAnswer(pa_15_2_6, assignment15_2);
        addProblemAnswerToAssignment(assignment15_2, pa_15_2_6);

        ProblemAnswer pa_15_2_7 = createProblemAnswer("What is efficiency?", "Efficiency is a measure of how effectively energy is converted from one form to another in a system. It is calculated as the ratio of useful energy output to the total energy input, expressed as a percentage: Efficiency = (useful energy output / total energy input) * 100%.");
        addAssignmentToProblemAnswer(pa_15_2_7, assignment15_2);
        addProblemAnswerToAssignment(assignment15_2, pa_15_2_7);

        ProblemAnswer pa_15_2_8 = createProblemAnswer("What is work in physics?", "Work is done when a force acts on an object to move it in the direction of the force. It is calculated using the formula W = F * d * cos(θ), where W is the work, F is the force, d is the displacement, and θ is the angle between the force and the direction of motion. Work is measured in joules (J).");
        addAssignmentToProblemAnswer(pa_15_2_8, assignment15_2);
        addProblemAnswerToAssignment(assignment15_2, pa_15_2_8);

        ProblemAnswer pa_15_2_9 = createProblemAnswer("What is the difference between conservative and non-conservative forces?", "Conservative forces, such as gravity and spring force, do not dissipate energy and the work done by them depends only on the initial and final positions, not on the path taken. Non-conservative forces, such as friction and air resistance, dissipate energy as heat and the work done by them depends on the path taken.");
        addAssignmentToProblemAnswer(pa_15_2_9, assignment15_2);
        addProblemAnswerToAssignment(assignment15_2, pa_15_2_9);

        ProblemAnswer pa_15_2_10 = createProblemAnswer("How are energy principles applied in real-world scenarios?", "Energy principles are applied in various real-world scenarios, such as calculating the efficiency of machines, analyzing the motion of objects, designing energy-efficient systems, and understanding the behavior of physical systems. These principles provide a framework for solving problems in engineering, physics, and other fields.");
        addAssignmentToProblemAnswer(pa_15_2_10, assignment15_2);
        addProblemAnswerToAssignment(assignment15_2, pa_15_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Energy Principles' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment15_3 = createAssignment("Motion Assignment", faculty5, Date.from(LocalDate.of(2029, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);

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

        ProblemAnswer pa_15_3_6 = createProblemAnswer("What are the equations of motion for constant acceleration?", "The equations of motion for constant acceleration are: \n1. v = u + at \n2. s = ut + 0.5at^2 \n3. v^2 = u^2 + 2as \nwhere u is the initial velocity, v is the final velocity, a is the acceleration, t is the time, and s is the displacement.");
        addAssignmentToProblemAnswer(pa_15_3_6, assignment15_3);
        addProblemAnswerToAssignment(assignment15_3, pa_15_3_6);

        ProblemAnswer pa_15_3_7 = createProblemAnswer("What is the concept of free fall?", "Free fall is the motion of an object under the influence of gravity alone, without any other forces acting on it. The acceleration due to gravity is approximately 9.8 m/s^2 near the Earth's surface.");
        addAssignmentToProblemAnswer(pa_15_3_7, assignment15_3);
        addProblemAnswerToAssignment(assignment15_3, pa_15_3_7);

        ProblemAnswer pa_15_3_8 = createProblemAnswer("What is centripetal acceleration?", "Centripetal acceleration is the acceleration experienced by an object moving in a circular path, directed towards the center of the circle. It is calculated using the formula a_c = v^2 / r, where v is the tangential velocity and r is the radius of the circular path.");
        addAssignmentToProblemAnswer(pa_15_3_8, assignment15_3);
        addProblemAnswerToAssignment(assignment15_3, pa_15_3_8);

        ProblemAnswer pa_15_3_9 = createProblemAnswer("What is the difference between speed and velocity?", "Speed is a scalar quantity that represents the rate of motion, measured as the distance traveled per unit of time. Velocity is a vector quantity that includes both the speed and direction of motion.");
        addAssignmentToProblemAnswer(pa_15_3_9, assignment15_3);
        addProblemAnswerToAssignment(assignment15_3, pa_15_3_9);

        ProblemAnswer pa_15_3_10 = createProblemAnswer("How are concepts of motion applied in real-world scenarios?", "Concepts of motion are applied in various real-world scenarios, such as analyzing the motion of vehicles, predicting the trajectory of projectiles, designing amusement park rides, and understanding the behavior of celestial bodies. These concepts provide a framework for solving problems in physics and engineering.");
        addAssignmentToProblemAnswer(pa_15_3_10, assignment15_3);
        addProblemAnswerToAssignment(assignment15_3, pa_15_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Motion' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment16_1 = createAssignment("Atomic Structure Assignment", faculty1, Date.from(LocalDate.of(2029, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);

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

        ProblemAnswer pa_16_1_6 = createProblemAnswer("What is the periodic table?", "The periodic table is a tabular arrangement of elements based on their atomic number, electron configuration, and recurring chemical properties. Elements are organized into periods (rows) and groups (columns).");
        addAssignmentToProblemAnswer(pa_16_1_6, assignment16_1);
        addProblemAnswerToAssignment(assignment16_1, pa_16_1_6);

        ProblemAnswer pa_16_1_7 = createProblemAnswer("What are valence electrons?", "Valence electrons are the electrons in the outermost electron shell of an atom. They are important in determining an element's chemical properties and reactivity. For example, carbon has 4 valence electrons.");
        addAssignmentToProblemAnswer(pa_16_1_7, assignment16_1);
        addProblemAnswerToAssignment(assignment16_1, pa_16_1_7);

        ProblemAnswer pa_16_1_8 = createProblemAnswer("What is an atomic orbital?", "An atomic orbital is a region of space around the nucleus where an electron is likely to be found. Orbitals have different shapes and energy levels, such as s, p, d, and f orbitals.");
        addAssignmentToProblemAnswer(pa_16_1_8, assignment16_1);
        addProblemAnswerToAssignment(assignment16_1, pa_16_1_8);

        ProblemAnswer pa_16_1_9 = createProblemAnswer("What is the significance of the Bohr model?", "The Bohr model of the atom describes electrons orbiting the nucleus in discrete energy levels. It explains the quantization of energy and the emission of light by atoms, leading to the development of quantum mechanics.");
        addAssignmentToProblemAnswer(pa_16_1_9, assignment16_1);
        addProblemAnswerToAssignment(assignment16_1, pa_16_1_9);

        ProblemAnswer pa_16_1_10 = createProblemAnswer("How does atomic structure influence an element's properties?", "Atomic structure, including the arrangement of protons, neutrons, and electrons, determines an element's chemical and physical properties. These properties include atomic size, ionization energy, electronegativity, and reactivity.");
        addAssignmentToProblemAnswer(pa_16_1_10, assignment16_1);
        addProblemAnswerToAssignment(assignment16_1, pa_16_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Atomic Structure' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment16_2 = createAssignment("Chemical Bonding Assignment", faculty1, Date.from(LocalDate.of(2029, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);

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

        ProblemAnswer pa_16_2_6 = createProblemAnswer("What is a polar covalent bond?", "A polar covalent bond is a type of covalent bond in which the electrons are shared unequally between atoms, resulting in a partial positive charge on one atom and a partial negative charge on the other. This occurs due to differences in electronegativity.");
        addAssignmentToProblemAnswer(pa_16_2_6, assignment16_2);
        addProblemAnswerToAssignment(assignment16_2, pa_16_2_6);

        ProblemAnswer pa_16_2_7 = createProblemAnswer("What is a nonpolar covalent bond?", "A nonpolar covalent bond is a type of covalent bond in which the electrons are shared equally between atoms, resulting in no significant charge separation. This occurs when the atoms have similar electronegativities.");
        addAssignmentToProblemAnswer(pa_16_2_7, assignment16_2);
        addProblemAnswerToAssignment(assignment16_2, pa_16_2_7);

        ProblemAnswer pa_16_2_8 = createProblemAnswer("What is bond energy?", "Bond energy is the amount of energy required to break a chemical bond and separate the atoms in a molecule. It is a measure of bond strength, with higher bond energy indicating a stronger bond.");
        addAssignmentToProblemAnswer(pa_16_2_8, assignment16_2);
        addProblemAnswerToAssignment(assignment16_2, pa_16_2_8);

        ProblemAnswer pa_16_2_9 = createProblemAnswer("What is a Lewis structure?", "A Lewis structure is a diagram that represents the arrangement of electrons in a molecule. It shows the bonding between atoms and the lone pairs of electrons. Lewis structures help predict the shapes and reactivities of molecules.");
        addAssignmentToProblemAnswer(pa_16_2_9, assignment16_2);
        addProblemAnswerToAssignment(assignment16_2, pa_16_2_9);

        ProblemAnswer pa_16_2_10 = createProblemAnswer("How do chemical bonds influence the properties of substances?", "Chemical bonds determine the physical and chemical properties of substances, such as melting point, boiling point, solubility, conductivity, and reactivity. The type and strength of bonds affect how substances interact with each other.");
        addAssignmentToProblemAnswer(pa_16_2_10, assignment16_2);
        addProblemAnswerToAssignment(assignment16_2, pa_16_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Chemical Bonding' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment16_3 = createAssignment("Reactions Assignment", faculty1, Date.from(LocalDate.of(2029, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);

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

        ProblemAnswer pa_16_3_6 = createProblemAnswer("What is a decomposition reaction?", "A decomposition reaction occurs when a single compound breaks down into two or more simpler substances. The general form is AB → A + B.");
        addAssignmentToProblemAnswer(pa_16_3_6, assignment16_3);
        addProblemAnswerToAssignment(assignment16_3, pa_16_3_6);

        ProblemAnswer pa_16_3_7 = createProblemAnswer("What is a single displacement reaction?", "A single displacement reaction occurs when an element replaces another element in a compound. The general form is A + BC → AC + B.");
        addAssignmentToProblemAnswer(pa_16_3_7, assignment16_3);
        addProblemAnswerToAssignment(assignment16_3, pa_16_3_7);

        ProblemAnswer pa_16_3_8 = createProblemAnswer("What is a double displacement reaction?", "A double displacement reaction occurs when the ions of two compounds exchange places to form two new compounds. The general form is AB + CD → AD + CB.");
        addAssignmentToProblemAnswer(pa_16_3_8, assignment16_3);
        addProblemAnswerToAssignment(assignment16_3, pa_16_3_8);

        ProblemAnswer pa_16_3_9 = createProblemAnswer("What is a combustion reaction?", "A combustion reaction occurs when a substance reacts with oxygen to produce heat and light. It often involves hydrocarbons reacting with oxygen to produce carbon dioxide and water. The general form is CxHy + O2 → CO2 + H2O.");
        addAssignmentToProblemAnswer(pa_16_3_9, assignment16_3);
        addProblemAnswerToAssignment(assignment16_3, pa_16_3_9);

        ProblemAnswer pa_16_3_10 = createProblemAnswer("What is chemical equilibrium?", "Chemical equilibrium is a state in which the forward and reverse reactions occur at the same rate, resulting in constant concentrations of reactants and products. It can be influenced by factors such as temperature, pressure, and concentration.");
        addAssignmentToProblemAnswer(pa_16_3_10, assignment16_3);
        addProblemAnswerToAssignment(assignment16_3, pa_16_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Reactions' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment17_1 = createAssignment("Cell Structure Assignment", faculty2, Date.from(LocalDate.of(2029, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);

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

        ProblemAnswer pa_17_1_6 = createProblemAnswer("What is the endoplasmic reticulum?", "The endoplasmic reticulum (ER) is a network of membranous tubules within the cell that plays a role in protein and lipid synthesis. The rough ER is studded with ribosomes, while the smooth ER lacks ribosomes.");
        addAssignmentToProblemAnswer(pa_17_1_6, assignment17_1);
        addProblemAnswerToAssignment(assignment17_1, pa_17_1_6);

        ProblemAnswer pa_17_1_7 = createProblemAnswer("What is the function of ribosomes?", "Ribosomes are the molecular machines responsible for protein synthesis. They translate messenger RNA (mRNA) into polypeptide chains, which fold into functional proteins.");
        addAssignmentToProblemAnswer(pa_17_1_7, assignment17_1);
        addProblemAnswerToAssignment(assignment17_1, pa_17_1_7);

        ProblemAnswer pa_17_1_8 = createProblemAnswer("What is the Golgi apparatus?", "The Golgi apparatus is an organelle that modifies, sorts, and packages proteins and lipids for transport to their final destinations. It is often likened to a cellular post office.");
        addAssignmentToProblemAnswer(pa_17_1_8, assignment17_1);
        addProblemAnswerToAssignment(assignment17_1, pa_17_1_8);

        ProblemAnswer pa_17_1_9 = createProblemAnswer("What are lysosomes?", "Lysosomes are organelles that contain digestive enzymes to break down waste materials and cellular debris. They play a key role in recycling cellular components and defending against pathogens.");
        addAssignmentToProblemAnswer(pa_17_1_9, assignment17_1);
        addProblemAnswerToAssignment(assignment17_1, pa_17_1_9);

        ProblemAnswer pa_17_1_10 = createProblemAnswer("How do cell structures contribute to their functions?", "Cell structures are specialized to perform specific functions that are crucial for the cell's survival and efficiency. Each organelle and component of the cell works together to maintain homeostasis, facilitate metabolism, and ensure proper growth and division.");
        addAssignmentToProblemAnswer(pa_17_1_10, assignment17_1);
        addProblemAnswerToAssignment(assignment17_1, pa_17_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Cell Structure' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment17_2 = createAssignment("Genetics Assignment", faculty2, Date.from(LocalDate.of(2029, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);

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

        ProblemAnswer pa_17_2_6 = createProblemAnswer("What is transcription?", "Transcription is the process by which the genetic information in DNA is copied into messenger RNA (mRNA). It involves the binding of RNA polymerase to a promoter, the unwinding of the DNA, and the synthesis of a complementary RNA strand.");
        addAssignmentToProblemAnswer(pa_17_2_6, assignment17_2);
        addProblemAnswerToAssignment(assignment17_2, pa_17_2_6);

        ProblemAnswer pa_17_2_7 = createProblemAnswer("What is translation?", "Translation is the process by which the genetic information in mRNA is used to synthesize a protein. It occurs at the ribosome, where transfer RNA (tRNA) molecules bring amino acids that are added to a growing polypeptide chain according to the codon sequence in the mRNA.");
        addAssignmentToProblemAnswer(pa_17_2_7, assignment17_2);
        addProblemAnswerToAssignment(assignment17_2, pa_17_2_7);

        ProblemAnswer pa_17_2_8 = createProblemAnswer("What is a mutation?", "A mutation is a change in the DNA sequence that can result in an altered gene product or regulation. Mutations can be caused by errors during DNA replication, exposure to mutagens, or other factors, and they can have various effects on an organism's traits.");
        addAssignmentToProblemAnswer(pa_17_2_8, assignment17_2);
        addProblemAnswerToAssignment(assignment17_2, pa_17_2_8);

        ProblemAnswer pa_17_2_9 = createProblemAnswer("What is genetic variation?", "Genetic variation refers to the diversity in gene frequencies within a population. It is the result of mutations, genetic recombination during sexual reproduction, and other mechanisms, and it is essential for evolution and adaptation.");
        addAssignmentToProblemAnswer(pa_17_2_9, assignment17_2);
        addProblemAnswerToAssignment(assignment17_2, pa_17_2_9);

        ProblemAnswer pa_17_2_10 = createProblemAnswer("What are some applications of genetics?", "Applications of genetics include medical diagnostics and treatments, genetic engineering and biotechnology, forensic science, agriculture (crop and livestock breeding), and understanding evolutionary relationships among species.");
        addAssignmentToProblemAnswer(pa_17_2_10, assignment17_2);
        addProblemAnswerToAssignment(assignment17_2, pa_17_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Genetics' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment17_3 = createAssignment("Evolution Assignment", faculty2, Date.from(LocalDate.of(2029, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);

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

        ProblemAnswer pa_17_3_6 = createProblemAnswer("What are homologous structures?", "Homologous structures are anatomical features that are similar in different species because they share a common ancestor. Examples include the forelimbs of humans, whales, bats, and birds, which have different functions but similar bone structures.");
        addAssignmentToProblemAnswer(pa_17_3_6, assignment17_3);
        addProblemAnswerToAssignment(assignment17_3, pa_17_3_6);

        ProblemAnswer pa_17_3_7 = createProblemAnswer("What is speciation?", "Speciation is the process by which new species arise from existing species. It occurs when populations of the same species become isolated and diverge due to genetic variation and natural selection, eventually becoming reproductively incompatible.");
        addAssignmentToProblemAnswer(pa_17_3_7, assignment17_3);
        addProblemAnswerToAssignment(assignment17_3, pa_17_3_7);

        ProblemAnswer pa_17_3_8 = createProblemAnswer("What is adaptive radiation?", "Adaptive radiation is the rapid evolution of a single species into multiple species that occupy different ecological niches. It often occurs when a species colonizes a new environment with diverse habitats and limited competition.");
        addAssignmentToProblemAnswer(pa_17_3_8, assignment17_3);
        addProblemAnswerToAssignment(assignment17_3, pa_17_3_8);

        ProblemAnswer pa_17_3_9 = createProblemAnswer("What is the role of genetic drift in evolution?", "Genetic drift is a random process that can cause changes in allele frequencies in a population. It is more pronounced in small populations and can lead to the fixation or loss of alleles, contributing to evolutionary change.");
        addAssignmentToProblemAnswer(pa_17_3_9, assignment17_3);
        addProblemAnswerToAssignment(assignment17_3, pa_17_3_9);

        ProblemAnswer pa_17_3_10 = createProblemAnswer("How do environmental factors influence evolution?", "Environmental factors, such as climate, food availability, and predators, exert selective pressures on organisms. These pressures influence which traits are advantageous and contribute to the adaptation of species to their environment.");
        addAssignmentToProblemAnswer(pa_17_3_10, assignment17_3);
        addProblemAnswerToAssignment(assignment17_3, pa_17_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Evolution' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment17_4 = createAssignment("Ecology Assignment", faculty2, Date.from(LocalDate.of(2029, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);

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

        ProblemAnswer pa_17_4_6 = createProblemAnswer("What is a biogeochemical cycle?", "A biogeochemical cycle is the movement of elements and compounds between living organisms and the physical environment. Examples include the carbon cycle, nitrogen cycle, and water cycle, which are essential for maintaining ecosystem health.");
        addAssignmentToProblemAnswer(pa_17_4_6, assignment17_4);
        addProblemAnswerToAssignment(assignment17_4, pa_17_4_6);

        ProblemAnswer pa_17_4_7 = createProblemAnswer("What is biodiversity?", "Biodiversity refers to the variety of life forms within an ecosystem, including species diversity, genetic diversity, and ecosystem diversity. High biodiversity contributes to ecosystem stability, resilience, and productivity.");
        addAssignmentToProblemAnswer(pa_17_4_7, assignment17_4);
        addProblemAnswerToAssignment(assignment17_4, pa_17_4_7);

        ProblemAnswer pa_17_4_8 = createProblemAnswer("What is the impact of human activities on ecosystems?", "Human activities, such as deforestation, pollution, urbanization, and climate change, can have significant impacts on ecosystems. These activities can lead to habitat destruction, loss of biodiversity, and alterations in nutrient cycles and energy flow.");
        addAssignmentToProblemAnswer(pa_17_4_8, assignment17_4);
        addProblemAnswerToAssignment(assignment17_4, pa_17_4_8);

        ProblemAnswer pa_17_4_9 = createProblemAnswer("What is an ecological niche?", "An ecological niche is the role and position of an organism within an ecosystem, including its interactions with other organisms, its habitat, and its contributions to energy flow and nutrient cycling. Each species has a unique niche that helps maintain ecosystem balance.");
        addAssignmentToProblemAnswer(pa_17_4_9, assignment17_4);
        addProblemAnswerToAssignment(assignment17_4, pa_17_4_9);

        ProblemAnswer pa_17_4_10 = createProblemAnswer("What is ecological succession?", "Ecological succession is the process by which ecosystems undergo gradual changes in species composition and structure over time. It can be primary (starting from a barren environment) or secondary (following a disturbance), leading to the establishment of a stable community.");
        addAssignmentToProblemAnswer(pa_17_4_10, assignment17_4);
        addProblemAnswerToAssignment(assignment17_4, pa_17_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Ecology' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment18_1 = createAssignment("Engineering Disciplines Assignment", faculty3, Date.from(LocalDate.of(2029, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);

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

        ProblemAnswer pa_18_1_6 = createProblemAnswer("What are the roles and responsibilities of mechanical engineers?", "Mechanical engineers design, develop, and test mechanical devices and systems. They work on a wide range of projects, from small components to large machinery, and ensure that these systems operate efficiently and safely.");
        addAssignmentToProblemAnswer(pa_18_1_6, assignment18_1);
        addProblemAnswerToAssignment(assignment18_1, pa_18_1_6);

        ProblemAnswer pa_18_1_7 = createProblemAnswer("What are the roles and responsibilities of electrical engineers?", "Electrical engineers design and develop electrical equipment and systems, such as power generation and distribution networks, communication systems, and electronic devices. They also work on improving and maintaining these systems.");
        addAssignmentToProblemAnswer(pa_18_1_7, assignment18_1);
        addProblemAnswerToAssignment(assignment18_1, pa_18_1_7);

        ProblemAnswer pa_18_1_8 = createProblemAnswer("What are the roles and responsibilities of chemical engineers?", "Chemical engineers are involved in designing and optimizing processes for producing chemicals, fuels, pharmaceuticals, and other products. They work on scaling up chemical reactions, managing production processes, and ensuring environmental and safety compliance.");
        addAssignmentToProblemAnswer(pa_18_1_8, assignment18_1);
        addProblemAnswerToAssignment(assignment18_1, pa_18_1_8);

        ProblemAnswer pa_18_1_9 = createProblemAnswer("What are some applications of civil engineering?", "Applications of civil engineering include designing and constructing infrastructure such as highways, bridges, tunnels, airports, water treatment plants, and buildings. Civil engineers also work on environmental projects, urban planning, and disaster mitigation.");
        addAssignmentToProblemAnswer(pa_18_1_9, assignment18_1);
        addProblemAnswerToAssignment(assignment18_1, pa_18_1_9);

        ProblemAnswer pa_18_1_10 = createProblemAnswer("What are some applications of mechanical engineering?", "Applications of mechanical engineering include developing automotive and aerospace systems, designing industrial machinery, creating energy systems, and working on robotics and automation. Mechanical engineers also contribute to manufacturing processes and product development.");
        addAssignmentToProblemAnswer(pa_18_1_10, assignment18_1);
        addProblemAnswerToAssignment(assignment18_1, pa_18_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Engineering Disciplines' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment18_2 = createAssignment("Problem-Solving Assignment", faculty3, Date.from(LocalDate.of(2029, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);

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

        ProblemAnswer pa_18_2_6 = createProblemAnswer("How do engineers evaluate potential solutions?", "Engineers evaluate potential solutions by considering factors such as feasibility, cost, safety, reliability, and environmental impact. They use techniques such as decision matrices, cost-benefit analysis, and simulation to compare and select the best solution.");
        addAssignmentToProblemAnswer(pa_18_2_6, assignment18_2);
        addProblemAnswerToAssignment(assignment18_2, pa_18_2_6);

        ProblemAnswer pa_18_2_7 = createProblemAnswer("What is a decision matrix?", "A decision matrix is a tool used to evaluate and compare different solutions based on specific criteria. Each solution is scored against the criteria, and the scores are weighted and summed to determine the best option.");
        addAssignmentToProblemAnswer(pa_18_2_7, assignment18_2);
        addProblemAnswerToAssignment(assignment18_2, pa_18_2_7);

        ProblemAnswer pa_18_2_8 = createProblemAnswer("What is cost-benefit analysis?", "Cost-benefit analysis is a technique used to evaluate the economic feasibility of a solution by comparing its costs and benefits. It involves calculating the total costs and benefits, and determining whether the benefits outweigh the costs.");
        addAssignmentToProblemAnswer(pa_18_2_8, assignment18_2);
        addProblemAnswerToAssignment(assignment18_2, pa_18_2_8);

        ProblemAnswer pa_18_2_9 = createProblemAnswer("How do engineers implement and test solutions?", "Engineers implement solutions by designing and constructing prototypes or systems. They test these solutions through experiments, simulations, and field trials to ensure they meet the specified requirements and perform as expected.");
        addAssignmentToProblemAnswer(pa_18_2_9, assignment18_2);
        addProblemAnswerToAssignment(assignment18_2, pa_18_2_9);

        ProblemAnswer pa_18_2_10 = createProblemAnswer("What is the importance of iteration in problem-solving?", "Iteration is important in problem-solving because it allows engineers to refine and improve their solutions. By testing and evaluating prototypes, they can identify and address any issues, making incremental improvements until the final solution meets all requirements.");
        addAssignmentToProblemAnswer(pa_18_2_10, assignment18_2);
        addProblemAnswerToAssignment(assignment18_2, pa_18_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Problem-Solving' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment18_3 = createAssignment("Design Process Assignment", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);

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

        ProblemAnswer pa_18_3_6 = createProblemAnswer("How do engineers test and evaluate prototypes?", "Engineers test prototypes by conducting experiments, simulations, and user tests to gather data on performance, reliability, and user experience. This helps identify any issues or areas for improvement.");
        addAssignmentToProblemAnswer(pa_18_3_6, assignment18_3);
        addProblemAnswerToAssignment(assignment18_3, pa_18_3_6);

        ProblemAnswer pa_18_3_7 = createProblemAnswer("What is iteration in the design process?", "Iteration is the process of refining and improving a design based on feedback and testing results. It involves making incremental changes, re-evaluating, and repeating the cycle until the final solution meets the desired criteria.");
        addAssignmentToProblemAnswer(pa_18_3_7, assignment18_3);
        addProblemAnswerToAssignment(assignment18_3, pa_18_3_7);

        ProblemAnswer pa_18_3_8 = createProblemAnswer("What are the benefits of using the engineering design process?", "The engineering design process helps ensure that solutions are well thought out, feasible, and effective. It promotes creativity, collaboration, and systematic problem-solving, leading to innovative and optimized solutions.");
        addAssignmentToProblemAnswer(pa_18_3_8, assignment18_3);
        addProblemAnswerToAssignment(assignment18_3, pa_18_3_8);

        ProblemAnswer pa_18_3_9 = createProblemAnswer("How do engineers communicate their design solutions?", "Engineers communicate their design solutions through technical reports, presentations, drawings, and models. Clear and effective communication is essential for conveying ideas, justifying decisions, and gaining approval from stakeholders.");
        addAssignmentToProblemAnswer(pa_18_3_9, assignment18_3);
        addProblemAnswerToAssignment(assignment18_3, pa_18_3_9);

        ProblemAnswer pa_18_3_10 = createProblemAnswer("What are some real-world applications of the engineering design process?", "The engineering design process is used in various fields, including product development, architecture, software engineering, and industrial design. It helps create innovative solutions to complex problems, from designing consumer electronics to developing sustainable infrastructure.");
        addAssignmentToProblemAnswer(pa_18_3_10, assignment18_3);
        addProblemAnswerToAssignment(assignment18_3, pa_18_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Design Process' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment19_1 = createAssignment("Circuit Analysis Assignment", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);

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

        ProblemAnswer pa_19_1_6 = createProblemAnswer("What is the difference between AC and DC circuits?", "AC (Alternating Current) circuits have current that changes direction periodically, while DC (Direct Current) circuits have current that flows in one direction. AC is commonly used for power distribution, while DC is used in batteries and electronic devices.");
        addAssignmentToProblemAnswer(pa_19_1_6, assignment19_1);
        addProblemAnswerToAssignment(assignment19_1, pa_19_1_6);

        ProblemAnswer pa_19_1_7 = createProblemAnswer("What is a Thevenin equivalent circuit?", "A Thevenin equivalent circuit is a simplified representation of a complex circuit. It consists of a single voltage source (Thevenin voltage) in series with a single resistor (Thevenin resistance) that can replace a more complicated network to simplify analysis.");
        addAssignmentToProblemAnswer(pa_19_1_7, assignment19_1);
        addProblemAnswerToAssignment(assignment19_1, pa_19_1_7);

        ProblemAnswer pa_19_1_8 = createProblemAnswer("What is a Norton equivalent circuit?", "A Norton equivalent circuit is another simplified representation of a complex circuit. It consists of a single current source (Norton current) in parallel with a single resistor (Norton resistance) that can replace a more complicated network to simplify analysis.");
        addAssignmentToProblemAnswer(pa_19_1_8, assignment19_1);
        addProblemAnswerToAssignment(assignment19_1, pa_19_1_8);

        ProblemAnswer pa_19_1_9 = createProblemAnswer("What is the role of capacitors in a circuit?", "Capacitors store and release electrical energy in a circuit. They are used for filtering, energy storage, and signal coupling. Capacitors block DC while allowing AC to pass, making them important components in AC circuits.");
        addAssignmentToProblemAnswer(pa_19_1_9, assignment19_1);
        addProblemAnswerToAssignment(assignment19_1, pa_19_1_9);

        ProblemAnswer pa_19_1_10 = createProblemAnswer("What is the role of inductors in a circuit?", "Inductors store energy in a magnetic field when current flows through them. They are used for filtering, energy storage, and inductive coupling. Inductors oppose changes in current, making them important components in AC circuits.");
        addAssignmentToProblemAnswer(pa_19_1_10, assignment19_1);
        addProblemAnswerToAssignment(assignment19_1, pa_19_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Circuit Analysis' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment19_2 = createAssignment("Signal Processing Assignment", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);

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

        ProblemAnswer pa_19_2_6 = createProblemAnswer("What is the role of the Fast Fourier Transform (FFT)?", "The Fast Fourier Transform (FFT) is an algorithm used to efficiently compute the Fourier transform of a signal. It significantly reduces the computational complexity, making it practical for real-time signal processing applications.");
        addAssignmentToProblemAnswer(pa_19_2_6, assignment19_2);
        addProblemAnswerToAssignment(assignment19_2, pa_19_2_6);

        ProblemAnswer pa_19_2_7 = createProblemAnswer("What is modulation?", "Modulation is the process of varying a carrier signal's properties (amplitude, frequency, or phase) to encode information. It is used in communication systems to transmit signals over long distances and through various media.");
        addAssignmentToProblemAnswer(pa_19_2_7, assignment19_2);
        addProblemAnswerToAssignment(assignment19_2, pa_19_2_7);

        ProblemAnswer pa_19_2_8 = createProblemAnswer("What is demodulation?", "Demodulation is the process of extracting the original information-bearing signal from a modulated carrier signal. It is the reverse operation of modulation and is essential in communication receivers.");
        addAssignmentToProblemAnswer(pa_19_2_8, assignment19_2);
        addProblemAnswerToAssignment(assignment19_2, pa_19_2_8);

        ProblemAnswer pa_19_2_9 = createProblemAnswer("What is the Nyquist-Shannon sampling theorem?", "The Nyquist-Shannon sampling theorem states that a continuous signal can be accurately reconstructed from its samples if the sampling rate is at least twice the highest frequency present in the signal (Nyquist rate).");
        addAssignmentToProblemAnswer(pa_19_2_9, assignment19_2);
        addProblemAnswerToAssignment(assignment19_2, pa_19_2_9);

        ProblemAnswer pa_19_2_10 = createProblemAnswer("What are some applications of signal processing?", "Signal processing has numerous applications, including audio and speech processing, image and video processing, biomedical signal analysis (e.g., ECG, EEG), telecommunications, radar and sonar systems, and control systems.");
        addAssignmentToProblemAnswer(pa_19_2_10, assignment19_2);
        addProblemAnswerToAssignment(assignment19_2, pa_19_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Signal Processing' unit created with  problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment19_3 = createAssignment("Systems Theory Assignment", faculty4, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);

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

        ProblemAnswer pa_19_3_6 = createProblemAnswer("What is closed-loop control?", "Closed-loop control, also known as feedback control, is a type of control system that adjusts its actions based on feedback from the output. Examples include thermostats that adjust heating based on room temperature.");
        addAssignmentToProblemAnswer(pa_19_3_6, assignment19_3);
        addProblemAnswerToAssignment(assignment19_3, pa_19_3_6);

        ProblemAnswer pa_19_3_7 = createProblemAnswer("What is a transfer function?", "A transfer function is a mathematical representation of the relationship between the input and output of a linear time-invariant system. It is used to analyze and design control systems by describing system dynamics in the frequency domain.");
        addAssignmentToProblemAnswer(pa_19_3_7, assignment19_3);
        addProblemAnswerToAssignment(assignment19_3, pa_19_3_7);

        ProblemAnswer pa_19_3_8 = createProblemAnswer("What is state-space representation?", "State-space representation is a mathematical model of a system that uses state variables to describe the system's behavior. It provides a framework for analyzing and designing complex systems, particularly in control engineering.");
        addAssignmentToProblemAnswer(pa_19_3_8, assignment19_3);
        addProblemAnswerToAssignment(assignment19_3, pa_19_3_8);

        ProblemAnswer pa_19_3_9 = createProblemAnswer("What is stability in a system?", "Stability in a system refers to its ability to return to equilibrium after a disturbance. A stable system can recover from perturbations and maintain consistent performance over time.");
        addAssignmentToProblemAnswer(pa_19_3_9, assignment19_3);
        addProblemAnswerToAssignment(assignment19_3, pa_19_3_9);

        ProblemAnswer pa_19_3_10 = createProblemAnswer("What are some applications of systems theory?", "Systems theory has diverse applications, including in engineering (control systems and automation), biology (ecosystems and cellular processes), economics (market dynamics), and social sciences (organizational behavior and public policy).");
        addAssignmentToProblemAnswer(pa_19_3_10, assignment19_3);
        addProblemAnswerToAssignment(assignment19_3, pa_19_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Systems Theory' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment20_1 = createAssignment("Statics Assignment", faculty5, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);

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

        ProblemAnswer pa_20_1_6 = createProblemAnswer("What is a free-body diagram?", "A free-body diagram is a graphical representation used to visualize the forces and moments acting on a body. It helps in analyzing the equilibrium of the body by showing all external forces as vectors originating from the object.");
        addAssignmentToProblemAnswer(pa_20_1_6, assignment20_1);
        addProblemAnswerToAssignment(assignment20_1, pa_20_1_6);

        ProblemAnswer pa_20_1_7 = createProblemAnswer("How do you calculate the resultant force?", "The resultant force is calculated by vectorially adding all the individual forces acting on a body. It represents the single force that has the same effect as all the forces combined.");
        addAssignmentToProblemAnswer(pa_20_1_7, assignment20_1);
        addProblemAnswerToAssignment(assignment20_1, pa_20_1_7);

        ProblemAnswer pa_20_1_8 = createProblemAnswer("What is the principle of transmissibility?", "The principle of transmissibility states that the condition of static equilibrium or motion of a rigid body remains unchanged if a force acting on the body is replaced by an equal and collinear force applied at a different point on the body.");
        addAssignmentToProblemAnswer(pa_20_1_8, assignment20_1);
        addProblemAnswerToAssignment(assignment20_1, pa_20_1_8);

        ProblemAnswer pa_20_1_9 = createProblemAnswer("What is a couple in statics?", "A couple is a pair of equal and opposite forces acting on a body, separated by a distance. It creates a rotational effect but does not produce any translational motion. The moment of a couple is calculated as the product of one of the forces and the perpendicular distance between them.");
        addAssignmentToProblemAnswer(pa_20_1_9, assignment20_1);
        addProblemAnswerToAssignment(assignment20_1, pa_20_1_9);

        ProblemAnswer pa_20_1_10 = createProblemAnswer("What are some applications of statics?", "Statics is used in various engineering applications, including structural analysis, mechanical design, and construction. It helps engineers design stable structures, analyze forces in machines, and ensure safety and stability in engineering projects.");
        addAssignmentToProblemAnswer(pa_20_1_10, assignment20_1);
        addProblemAnswerToAssignment(assignment20_1, pa_20_1_10);

// Output for confirmation
        System.out.println("Assignment for 'Statics' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment20_2 = createAssignment("Dynamics Assignment", faculty5, Date.from(LocalDate.of(2030, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);

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

        ProblemAnswer pa_20_2_6 = createProblemAnswer("What is circular motion?", "Circular motion is the movement of an object along a circular path. It is characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        addAssignmentToProblemAnswer(pa_20_2_6, assignment20_2);
        addProblemAnswerToAssignment(assignment20_2, pa_20_2_6);

        ProblemAnswer pa_20_2_7 = createProblemAnswer("What is work-energy principle?", "The work-energy principle states that the work done on an object is equal to the change in its kinetic energy. It is mathematically expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        addAssignmentToProblemAnswer(pa_20_2_7, assignment20_2);
        addProblemAnswerToAssignment(assignment20_2, pa_20_2_7);

        ProblemAnswer pa_20_2_8 = createProblemAnswer("What is impulse-momentum principle?", "The impulse-momentum principle states that the change in momentum of an object is equal to the impulse applied to it. It is mathematically expressed as Δp = FΔt, where Δp is the change in momentum, F is the force applied, and Δt is the time interval.");
        addAssignmentToProblemAnswer(pa_20_2_8, assignment20_2);
        addProblemAnswerToAssignment(assignment20_2, pa_20_2_8);

        ProblemAnswer pa_20_2_9 = createProblemAnswer("What is harmonic motion?", "Harmonic motion is a type of periodic motion where an object oscillates back and forth around an equilibrium position. Examples include the motion of a pendulum and a mass-spring system. It is characterized by parameters such as amplitude, frequency, and period.");
        addAssignmentToProblemAnswer(pa_20_2_9, assignment20_2);
        addProblemAnswerToAssignment(assignment20_2, pa_20_2_9);

        ProblemAnswer pa_20_2_10 = createProblemAnswer("How are dynamics principles applied in real-world scenarios?", "Dynamics principles are applied in various real-world scenarios, such as analyzing the motion of vehicles, predicting the trajectory of projectiles, designing amusement park rides, and understanding the behavior of celestial bodies. These concepts provide a framework for solving problems in physics and engineering.");
        addAssignmentToProblemAnswer(pa_20_2_10, assignment20_2);
        addProblemAnswerToAssignment(assignment20_2, pa_20_2_10);

// Output for confirmation
        System.out.println("Assignment for 'Dynamics' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment20_3 = createAssignment("Thermodynamics Assignment", faculty5, Date.from(LocalDate.of(2030, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);

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

        ProblemAnswer pa_20_3_6 = createProblemAnswer("What is entropy?", "Entropy is a measure of the disorder or randomness in a system. It is a fundamental concept in thermodynamics and is related to the Second Law, which states that the total entropy of an isolated system always increases over time.");
        addAssignmentToProblemAnswer(pa_20_3_6, assignment20_3);
        addProblemAnswerToAssignment(assignment20_3, pa_20_3_6);

        ProblemAnswer pa_20_3_7 = createProblemAnswer("What is the relationship between heat and work?", "Heat and work are two forms of energy transfer. Heat is the transfer of thermal energy due to a temperature difference, while work is the transfer of energy due to a force acting over a distance. The First Law of Thermodynamics relates heat and work to changes in internal energy.");
        addAssignmentToProblemAnswer(pa_20_3_7, assignment20_3);
        addProblemAnswerToAssignment(assignment20_3, pa_20_3_7);

        ProblemAnswer pa_20_3_8 = createProblemAnswer("What is a thermodynamic system?", "A thermodynamic system is a defined region of space or a specific quantity of matter under study. It is separated from its surroundings by boundaries, which can be real or imaginary, and can exchange energy and matter with its surroundings.");
        addAssignmentToProblemAnswer(pa_20_3_8, assignment20_3);
        addProblemAnswerToAssignment(assignment20_3, pa_20_3_8);

        ProblemAnswer pa_20_3_9 = createProblemAnswer("What is a thermodynamic process?", "A thermodynamic process is a transformation that a system undergoes from one state to another. Examples include isothermal (constant temperature), adiabatic (no heat transfer), isobaric (constant pressure), and isochoric (constant volume) processes.");
        addAssignmentToProblemAnswer(pa_20_3_9, assignment20_3);
        addProblemAnswerToAssignment(assignment20_3, pa_20_3_9);

        ProblemAnswer pa_20_3_10 = createProblemAnswer("What are some applications of thermodynamics?", "Thermodynamics has various applications, including in engineering (heat engines, refrigerators, and power plants), chemistry (chemical reactions and phase changes), and environmental science (climate modeling and energy efficiency). It helps solve problems involving heat transfer, energy conversion, and the behavior of gases and liquids.");
        addAssignmentToProblemAnswer(pa_20_3_10, assignment20_3);
        addProblemAnswerToAssignment(assignment20_3, pa_20_3_10);

// Output for confirmation
        System.out.println("Assignment for 'Thermodynamics' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment20_4 = createAssignment("Material Science Assignment", faculty5, Date.from(LocalDate.of(2030, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);

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

        ProblemAnswer pa_20_4_6 = createProblemAnswer("What is the importance of material selection in engineering?", "Material selection is crucial in engineering because it affects the performance, durability, and cost of a product. Engineers must consider factors such as strength, weight, corrosion resistance, and thermal properties to choose the most suitable material for a specific application.");
        addAssignmentToProblemAnswer(pa_20_4_6, assignment20_4);
        addProblemAnswerToAssignment(assignment20_4, pa_20_4_6);

        ProblemAnswer pa_20_4_7 = createProblemAnswer("What is the structure-property relationship in materials?", "The structure-property relationship in materials refers to how the internal structure of a material, including its atomic arrangement and microstructure, influences its properties and behavior. Understanding this relationship helps engineers design materials with desired properties.");
        addAssignmentToProblemAnswer(pa_20_4_7, assignment20_4);
        addProblemAnswerToAssignment(assignment20_4, pa_20_4_7);

        ProblemAnswer pa_20_4_8 = createProblemAnswer("What is material processing?", "Material processing involves the techniques and methods used to shape, form, and fabricate materials into desired products. It includes processes such as casting, forging, welding, machining, and additive manufacturing.");
        addAssignmentToProblemAnswer(pa_20_4_8, assignment20_4);
        addProblemAnswerToAssignment(assignment20_4, pa_20_4_8);

        ProblemAnswer pa_20_4_9 = createProblemAnswer("What are the mechanical properties of materials?", "The mechanical properties of materials include strength, hardness, ductility, toughness, and elasticity. These properties determine how a material responds to applied forces and are critical in selecting materials for structural and mechanical applications.");
        addAssignmentToProblemAnswer(pa_20_4_9, assignment20_4);
        addProblemAnswerToAssignment(assignment20_4, pa_20_4_9);

        ProblemAnswer pa_20_4_10 = createProblemAnswer("How is material science applied in real-world scenarios?", "Material science is applied in various fields, including aerospace, automotive, electronics, construction, and healthcare. It helps develop new materials, improve existing materials, and solve engineering challenges related to material performance and sustainability.");
        addAssignmentToProblemAnswer(pa_20_4_10, assignment20_4);
        addProblemAnswerToAssignment(assignment20_4, pa_20_4_10);

// Output for confirmation
        System.out.println("Assignment for 'Material Science' unit created with 10 problem answers, due date, faculty, and syllabus.");


        attendanceRepo.saveAllAndFlush(Arrays.asList(attendance1, attendance2, attendance3, attendance4, attendance5, attendance6, attendance7, attendance8, attendance9, attendance10, attendance11, attendance12, attendance13, attendance14, attendance15, attendance16, attendance17, attendance18, attendance19, attendance20));
        resourceRepo.saveAllAndFlush(Arrays.asList(resource1a, resource1b, resource2a, resource2b, resource3a, resource3b, resource4a, resource4b, resource5a, resource5b, resource6a, resource6b, resource7a, resource7b, resource8a, resource8b, resource9a, resource9b, resource10a, resource10b, resource11a, resource11b, resource12a, resource12b, resource13a, resource13b, resource14a, resource14b, resource15a, resource15b, resource16a, resource16b, resource17a, resource17b, resource18a, resource18b, resource19a, resource19b, resource20a, resource20b));
        discussionRepo.saveAllAndFlush(Arrays.asList(discussion1a, discussion1b, discussion1c, discussion1d, discussion1e, discussion1f, discussion2a, discussion2b, discussion2c, discussion2d, discussion2e, discussion2f, discussion3a, discussion3b, discussion3c, discussion3d, discussion4a, discussion4b, discussion4c, discussion4d, discussion5a, discussion5b, discussion5c, discussion5d, discussion6a, discussion6b, discussion6c, discussion6d, discussion6e, discussion7a, discussion7b, discussion7c, discussion7d, discussion8a, discussion8b, discussion8c, discussion8d, discussion8e, discussion9a, discussion9b, discussion9c, discussion10a, discussion10b, discussion10c, discussion10d, discussion11a, discussion11b, discussion11c, discussion11d, discussion12a, discussion12b, discussion12c, discussion12d, discussion12e, discussion13a, discussion13b, discussion13c, discussion13d, discussion14a, discussion14b, discussion14c, discussion14d, discussion15a, discussion15b, discussion15c, discussion16a, discussion16b, discussion16c, discussion17a, discussion17b, discussion17c, discussion17d, discussion18a, discussion18b, discussion18c,
                discussion19a, discussion19b, discussion19c, discussion20a, discussion20b, discussion20c, discussion20d
        ));
        postRepo.saveAllAndFlush(Arrays.asList(
                post1a1, post1a2, post1b1, post1b2, post1c1, post1c2, post1d1, post1d2, post1e1, post1e2, post1f1, post1f2, post2a1, post2a2, post2b1, post2b2, post2c1, post2c2, post2d1, post2d2, post2e1, post2e2, post2f1, post2f2, post3a1, post3a2, post3b1, post3b2, post3c1, post3c2, post3d1, post3d2, post4a1, post4a2, post4b1, post4b2, post4c1, post4c2, post4d1, post4d2, post5a1, post5a2, post5b1, post5b2, post5c1, post5c2, post5d1, post5d2,
                post6a1, post6a2, post6b1, post6b2, post6c1, post6c2, post6d1, post6d2, post6e1, post6e2, post7a1, post7a2, post7b1, post7b2, post7c1, post7c2, post7d1, post7d2, post8a1, post8a2, post8b1, post8b2, post8c1, post8c2, post8d1, post8d2, post8e1, post8e2, post9a1, post9a2, post9b1, post9b2, post9c1, post9c2, post10a1, post10a2, post10b1, post10b2, post10c1, post10c2, post10d1, post10d2, post11a1, post11a2, post11b1, post11b2, post11c1, post11c2, post11d1, post11d2,
                post12a1, post12a2, post12b1, post12b2, post12c1, post12c2, post12d1, post12d2, post12e1, post12e2, post13a1, post13a2, post13b1, post13b2, post13c1, post13c2, post13d1, post13d2, post14a1, post14a2, post14b1, post14b2, post14c1, post14c2, post14d1, post14d2, post15a1, post15a2, post15b1, post15b2, post15c1, post15c2, post16a1, post16a2, post16b1, post16b2, post16c1, post16c2, post17a1, post17a2, post17b1, post17b2, post17c1, post17c2, post17d1, post17d2, post18a1, post18a2, post18b1, post18b2, post18c1, post18c2, post19a1, post19a2, post19b1, post19b2, post19c1, post19c2, post20a1, post20a2, post20b1, post20b2, post20c1, post20c2, post20d1, post20d2
        ));
        commentRepo.saveAllAndFlush(Arrays.asList(
                comment1a1, comment1b1, comment1c1, comment1d1, comment1e1, comment1f1, comment2a1, comment2b1, comment2c1, comment2d1, comment2e1, comment2f1, comment3a1, comment3b1, comment3c1, comment3d1, comment4a1, comment4b1, comment4c1, comment4d1, comment5a1, comment5b1, comment5c1, comment5d1, comment6a1, comment6b1, comment6c1, comment6d1, comment6e1, comment7a1, comment7b1, comment7c1, comment7d1, comment8a1, comment8b1, comment8c1, comment8d1, comment8e1, comment9a1, comment9b1, comment9c1, comment10a1, comment10b1, comment10c1, comment10d1,
                comment11a1, comment11b1, comment11c1, comment11d1, comment12a1, comment12b1, comment12c1, comment12d1, comment12e1, comment13a1, comment13b1, comment13c1, comment13d1, comment14a1, comment14b1, comment14c1, comment14d1, comment15a1, comment15b1, comment15c1, comment16a1, comment16b1, comment16c1, comment17a1, comment17b1, comment17c1, comment17d1, comment18a1, comment18b1, comment18c1, comment19a1, comment19b1, comment19c1, comment20a1, comment20b1, comment20c1, comment20d1
        ));
        scheduleRepo.saveAllAndFlush(Arrays.asList(scheduleStudent1, scheduleStudent2, scheduleStudent3, scheduleStudent4, scheduleStudent5, scheduleStudent6, scheduleStudent7, scheduleStudent8, scheduleStudent9, scheduleStudent10));


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

        public static Resource createResource(String resourceName, String url, Syllabus syllabus, Course course) {
            Resource resource = new Resource();
            resource.setResourceName(resourceName);
            resource.setUrl(url);
            resource.setSyllabus(syllabus);
            resource.setCourse(course);
            return resource;
        }

        public static Lesson createLesson(String title, String content, Faculty author, Unit unit){
        Lesson lesson=new Lesson();
        lesson.setTitle(title);
        lesson.setContent(content);
        lesson.setAuthor(author);
        lesson.setUnit(unit);
        return lesson;
        }

        public static Attendance createAttendance(LocalDate attendanceLocalDate, boolean present, Student student, Course course){
          Date attendanceDate=Date.from(attendanceLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            Attendance attendance=new Attendance();
            attendance.setAttendanceDate(attendanceDate);
            attendance.setPresent(present);
            attendance.setStudent(student);
            attendance.setCourse(course);
            return attendance;
        }

    public static Discussion createDiscussion(String title, String description, Faculty teacher) {
        Discussion discussion = new Discussion();
        discussion.setTitle(title);
        discussion.setDescription(description);
        discussion.setTeacher(teacher);
        discussion.setPosts(new ArrayList<>());
        return discussion;
    }

    public static Post createPost(String content, Discussion discussion, Student student) {
        Post post = new Post();
        post.setContent(content);
        post.setDiscussion(discussion);
        post.setStudent(student);
        post.setComments(new ArrayList<>());
        return post;
    }

    public static Comment createComment(String content, Post post, Student student) {
        Comment comment = new Comment();
        comment.setContent(content);
        comment.setPost(post);
        comment.setStudent(student);
        return comment;
    }

    public static Schedule createSchedule(String name, String description, Student student, Semester semester, Course... courses) {
        Schedule schedule = new Schedule();
        schedule.setName(name);
        schedule.setDescription(description);
        schedule.setStudent(student);
        schedule.setSemester(semester);
        if (courses != null) {
            schedule.setCourses(Arrays.asList(courses));
        }
        return schedule;
    }

    public static ProblemAnswer createProblemAnswer(String problemContent, String answerContent) {
        ProblemAnswer problemAnswer = new ProblemAnswer();
        problemAnswer.setProblemContent(problemContent);
        problemAnswer.setAnswerContent(answerContent);
        return problemAnswer;
    }

    public static void addAssignmentToProblemAnswer(ProblemAnswer problemAnswer, Assignment assignment) {
        problemAnswer.setAssignment(assignment);
    }

    public static void addProjectToProblemAnswer(ProblemAnswer problemAnswer, Project project) {
        problemAnswer.setProject(project);
    }

    public static void addTestToProblemAnswer(ProblemAnswer problemAnswer, Test test) {
        problemAnswer.setTest(test);
    }

    public static void addStudentAnswerToProblemAnswer(ProblemAnswer problemAnswer, StudentAnswer studentAnswer) {
        problemAnswer.setStudentAnswer(studentAnswer);
    }

    public static Assignment createAssignment(String title, Faculty teacher, Date dueDate, Syllabus syllabus, boolean completed) {
        Assignment assignment = new Assignment();
        assignment.setTitle(title);
        assignment.setTeacher(teacher);
        assignment.setDueDate(dueDate);
        assignment.setSyllabus(syllabus);
        assignment.setCompleted(completed);
        return assignment;
    }

    public static void addProblemAnswerToAssignment(Assignment assignment, ProblemAnswer problemAnswer) {
        assignment.getProblemAnswers().add(problemAnswer);
        problemAnswer.setAssignment(assignment);
    }

    public static void addStudentToAssignment(Assignment assignment, Student student) {
        assignment.getStudents().add(student);
    }

    public static Test createTest(String title, Faculty teacher, Date dueDate, Syllabus syllabus, boolean completed) {
        Test test = new Test();
        test.setTitle(title);
        test.setTeacher(teacher);
        test.setDueDate(dueDate);
        test.setSyllabus(syllabus);
        test.setCompleted(completed);
        return test;
    }

    public static void addProblemAnswerToTest(Test test, ProblemAnswer problemAnswer) {
        test.getProblemAnswers().add(problemAnswer);
        problemAnswer.setTest(test);
    }

    public static void addStudentToTest(Test test, Student student) {
        test.getStudents().add(student);
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

    public static StudentAnswer createStudentAnswer(Student student, ProblemAnswer problemAnswer, String answerContent) {
        StudentAnswer studentAnswer = new StudentAnswer();
        studentAnswer.setStudent(student);
        studentAnswer.setProblemAnswer(problemAnswer);
        studentAnswer.setAnswerContent(answerContent);
        studentAnswer.setSubmissionDate(Timestamp.valueOf(LocalDateTime.now()));
        return studentAnswer;
    }

    public static void addSubmissionToStudentAnswer(StudentAnswer studentAnswer, Submission submission) {
        studentAnswer.setSubmission(submission);
    }

    public static Submission createSubmission(String content, Student student, List<StudentAnswer> studentAnswers) {
        Submission submission = new Submission();
        submission.setContent(content);
        submission.setStudent(student);
        submission.setSubmissionDate(Timestamp.valueOf(LocalDateTime.now()));
        for (StudentAnswer studentAnswer : studentAnswers) {
            studentAnswer.setSubmission(submission);
            submission.getStudentAnswers().add(studentAnswer);
        }
        return submission;
    }

    public static void addGradeToSubmission(Submission submission, Grade grade) {
        submission.setGrade(grade);
        grade.setSubmission(submission); // Ensures the relationship is bidirectional
    }

    public static void addFeedbackToSubmission(Submission submission, Feedback feedback) {
        submission.setFeedback(feedback);
        feedback.setSubmission(submission); // Ensures the relationship is bidirectional
    }

    public static CourseGrade createCourseGrade(Course course, Student student) {
        CourseGrade courseGrade = new CourseGrade();
        courseGrade.setCourse(course);
        courseGrade.setStudent(student);
        // Add to the collection of course grades
        course.getCourseGrades().add(courseGrade);
        student.getCourseGrades().add(courseGrade); // Ensure bidirectional relationship
        return courseGrade;
    }

    public static void updateCourseGrade(Course course, CourseGrade courseGrade, int assignmentPercent, int testPercent, int projectPercent) {
        List<Grade> grades = course.getGrades();
        double totalWeightedGrade = 0;
        double totalWeight = 0;

        // Convert percentages to decimals
        double assignmentWeight = assignmentPercent / 100.0;
        double testWeight = testPercent / 100.0;
        double projectWeight = projectPercent / 100.0;

        for (Grade grade : grades) {
            Submission submission = grade.getSubmission();
            for (StudentAnswer studentAnswer : submission.getStudentAnswers()) {
                ProblemAnswer problemAnswer = studentAnswer.getProblemAnswer();

                if (problemAnswer.getAssignment() != null) {
                    totalWeightedGrade += grade.getGrade() * assignmentWeight;
                    totalWeight += assignmentWeight;
                } else if (problemAnswer.getTest() != null) {
                    totalWeightedGrade += grade.getGrade() * testWeight;
                    totalWeight += testWeight;
                } else if (problemAnswer.getProject() != null) {
                    totalWeightedGrade += grade.getGrade() * projectWeight;
                    totalWeight += projectWeight;
                }
            }
        }

        double averageGrade = totalWeight > 0 ? totalWeightedGrade / totalWeight : 0;
        courseGrade.setOverallGrade(averageGrade);
    }


    public static Grade createGrade(double gradeValue, Student student, Faculty teacher, Course course, Submission submission, int assignmentPercent, int testPercent, int projectPercent) {
        Grade grade = new Grade();
        grade.setGrade(gradeValue);
        grade.setStudent(student);
        grade.setTeacher(teacher);
        grade.setCourse(course);
        grade.setSubmission(submission);
        grade.setDateGraded(Timestamp.valueOf(LocalDateTime.now()));

        // Add the new grade to the course's grades
        course.getGrades().add(grade);

        // Update the CourseGrade
        CourseGrade courseGrade = course.getCourseGrades().stream()
                .filter(cg -> cg.getStudent().equals(student))
                .findFirst()
                .orElseGet(() -> createCourseGrade(course, student));
        updateCourseGrade(course, courseGrade, assignmentPercent, testPercent, projectPercent);

        return grade;
    }

    public static Feedback createFeedback(String feedbackText, Submission submission) {
        Feedback feedback = new Feedback();
        feedback.setFeedbackText(feedbackText);
        feedback.setSubmission(submission);
        feedback.setFeedbackDate(Timestamp.valueOf(LocalDateTime.now()));
        return feedback;
    }

}
