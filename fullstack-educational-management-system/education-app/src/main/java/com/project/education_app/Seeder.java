package com.project.education_app;

import com.project.education_app.entities.*;
import com.project.education_app.repos.AnnouncementRepo;
import com.project.education_app.repos.FacultyRepo;
import com.project.education_app.repos.GuardianRepo;
import com.project.education_app.repos.StudentRepo;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
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
}
