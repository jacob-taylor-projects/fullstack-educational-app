package com.project.education_app;

import com.project.education_app.entities.*;
import com.project.education_app.repos.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
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
