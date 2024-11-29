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

// Course 7: Software Engineering
        Syllabus syllabus7 = createSyllabus("Introduction to software development methodologies.", "Software Development Life Cycle, Agile, Waterfall, Project Management.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units7 = Arrays.asList(
                createUnit("Software Development Life Cycle", "In this unit, students will learn about the Software Development Life Cycle (SDLC), a process for planning, creating, testing, and deploying an information system. They will explore different SDLC models, including iterative, incremental, and spiral models."),
                createUnit("Agile", "This unit covers the Agile methodology, an iterative approach to software development that emphasizes flexibility and customer feedback. Students will learn about Agile principles, practices (e.g., Scrum, Kanban), and how to apply Agile techniques in software projects."),
                createUnit("Waterfall", "In this unit, students will explore the Waterfall model, a linear and sequential approach to software development. They will understand the phases of the Waterfall model, including requirements analysis, system design, implementation, testing, deployment, and maintenance."),
                createUnit("Project Management", "This unit focuses on project management techniques and tools used in software development. Students will learn about project planning, scheduling, resource management, risk management, and quality assurance, and how to manage a software project from inception to completion.")
        );
        Course course7 = createCourse("Software Engineering", "Introduction to software development methodologies, project management, and software life cycle.", "Computer Science", 4, syllabus7, units7);
        Resource resource7a=createResource("Course 7 textbook resource","https://www.infobooks.org/pdfview/14012-introduction-to-software-engineering-pvpsit/",syllabus7,course7);
        Resource resource7b=createResource("Course 7 video resource","https://m.youtube.com/watch?v=zOjov-2OZ0E",syllabus7,course7);

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
        Resource resource8a=createResource("Course 8 textbook resource","httpsL//eloquentjavascript.net",syllabus8,course8);
        Resource resource8b=createResource("Course 8 video resource","https://m.youtube.com/watch?v=nu_pCVPKzTk&pp=ygUbd2VilGRldmdmVs-b3BtZW50IGZ1bGwgY2n1cnNI",syllabus8,course8);

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
        Resource resource9a=createResource("Course 9 textbook resource","http://neuralnetworksanddeeplearning.com",syllabus9,course9);
        Resource resource9b=createResource("Course 9 video resource","https://m.youtube.com/playlist?list=PLkDaE6sCZn6Ec-XTbcX1uRg2_u4xOEky0",syllabus9,course9);

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
        Resource resource10a=createResource("Course 10 textbook resource","https://www.infobooks.org/pdfview/cyber-security-wei-lu-yuqing-zhang-weiping-wen-hanbing-yan-chao-li-380/",syllabus10,course10);
        Resource resource10b=createResource("Course 10 video resource","https://m.youtube.com/watch?v=hXSFdwIOfnE",syllabus10,course10);

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
        Resource resource11a=createResource("Course 11 textbook resource","https://openstax.org/books/calculus-volume-1/pages/1-introduction",syllabus11,course11);
        Resource resource11b=createResource("Course 11 video resource","https:m.youtube.com/playlist?list=PLF797E961509B4EB5",syllabus11,course11);

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
        Resource resource12a=createResource("Course 12 textbook resource","https://linear.axler.net",syllabus12,course12);
        Resource resource12b=createResource("Course 12 video resource","https://m.youtube.com/playlist?list=PL221E2BBF13BECF6C",syllabus12,course12);

// Course 13: Calculus II
        Syllabus syllabus13 = createSyllabus("Explore advanced calculus topics including sequences,series, and multivariable calculus.", "Sequences and Series, Techniques of integration, Multivariable Functions, Vector Calculus.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units13 = Arrays.asList(
                createUnit("Sequences and Series", "In this unit, students will learn about sequences and series, including convergence tests,power series, and Taylor series.They will understand how to analyze the behavior of sequences and series and apply these concepts to solve mathematical problems. "),
                createUnit("Techniques of Integration", "This unit covers advanced integration techniques, such as integration by parts, partial fractions, trigonometric integrals, and improper integrals. Students will learn how to apply these techniques to evaluate complex integrals and solve real-world problems involving integration."),
                createUnit("Multivariable Functions", "In this unit, students will explore functions of several variables, including partial derivatives, multiple integrals, and gradient vectors. They will understand how to analyze and visualize multivariable functions and apply these concepts to solve problems in various fields."),
                createUnit("Vector Calculus", "This unit focuses on vector caluclus, the study of vector fields and their applications. Students will learn about line integrals, surface integrals, Green's Theorem, Stoke's Theorem, and the Divergence Theorem. They will understand how to apply these theorems to analyze and solve problems involving vector fields.")
        );
        Course course13 = createCourse("Calculus II", "Explore advanced calculus topics including sequences, series and multivariable calculus.", "Mathematics", 3, syllabus13, units13);
        Resource resource13a=createResource("Course 13 textbook resource","https://openstax.org/books/calculus-volume-2/pages/1-introduction",syllabus13,course13);
        Resource resource13b=createResource("Course 13 video resource","https://www.youtube.com/watch?v=h4Vhh7aFmWw",syllabus13,course13);

// Course 14: Discrete Mathematics
        Syllabus syllabus14 = createSyllabus("Study of mathematical structures that are fundamentally discrete.", "Logic, Set Theory, Graph Theory, Combinatorics.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units14 = Arrays.asList(
                createUnit("Logic", "In this unit, students will learn about the fundamentals of logic, including propositional and predicate logic. They will understand how to form logical statements, use logical connectives, and apply logical reasoning in problem-solving."),
                createUnit("Set Theory", "This unit covers set theory, the study of sets, which are collections of objects. Students will explore the concepts of subsets, unions, intersections, and Cartesian products, and apply these concepts to solve problems involving sets."),
                createUnit("Graph Theory", "In this unit, students will explore graph theory, the study of graphs as mathematical structures used to model pairwise relations between objects. They will learn about different types of graphs, such as directed and undirected graphs, and apply algorithms for traversing and analyzing graphs."),
                createUnit("Combinatorics", "This unit focuses on combinatorics, the study of counting, arrangement, and combination of objects. Students will learn about permutations, combinations, and the principles of counting, and apply these techniques to solve combinatorial problems.")
        );
        Course course14 = createCourse("Discrete Mathematics", "Study of mathematical structures that are fundamentally discrete rather than continuous.", "Mathematics", 3, syllabus14, units14);
        Resource resource14a=createResource("Course 14 textbook resource","https://cims.nyu.edu/~regev/teaching/discrete_math_fall_2005/dmbook.pdf",syllabus14,course14);
        Resource resource14b=createResource("Course 14 video resource","https://m.youtube.com/playlist?list=PLDDGPdw7e6Ag1EIznZ-m-qXu4XX3A0cIz",syllabus14,course14);

// Course 15: Physics I
        Syllabus syllabus15 = createSyllabus("Introduction to classical mechanics.", "Newton's Laws, Energy Principles, Motion.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units15 = Arrays.asList(
                createUnit("Newton's Laws", "In this unit, students will learn about Newton's laws of motion, which describe the relationship between the motion of an object and the forces acting on it. They will understand and apply these laws to solve problems in mechanics."),
                createUnit("Energy Principles", "This unit covers the principles of energy, including kinetic and potential energy, work, and the conservation of energy. Students will learn how to calculate energy and work, and understand the concepts of power and efficiency."),
                createUnit("Motion", "In this unit, students will explore the concepts of motion, including linear motion, projectile motion, and circular motion. They will learn about velocity, acceleration, and the equations of motion, and apply these concepts to analyze different types of motion.")
        );
        Course course15 = createCourse("Physics I", "Introduction to classical mechanics, including Newton's laws and energy principles.", "Physics", 4, syllabus15, units15);
        Resource resource15a=createResource("Course 15 textbook resource","https://openstax.org/books/university-physics-volume-1/pages/1-introduction",syllabus15,course15);
        Resource resource15b=createResource("Course 15 video resource","https://www.youtube.com/watch?v=wIq4CssPoO0&list=PLUl4u3cNGP60UlabZBeeqOuoLuj_KNphQ",syllabus15,course15);

// Course 16: Chemistry I
        Syllabus syllabus16 = createSyllabus("Introduction to chemical principles.", "Atomic Structure, Chemical Bonding, Reactions.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units16 = Arrays.asList(
                createUnit("Atomic Structure", "In this unit, students will learn about the structure of atoms, including subatomic particles (protons, neutrons, electrons), atomic number, mass number, and isotopes. They will understand how these components define elements and their properties."),
                createUnit("Chemical Bonding", "This unit covers chemical bonding, the process by which atoms combine to form molecules and compounds. Students will explore different types of bonds, including ionic, covalent, and metallic bonds, and understand the principles that govern bond formation."),
                createUnit("Reactions", "In this unit, students will study chemical reactions, including the reactants, products, and types of chemical reactions. They will learn about reaction rates, equilibrium, and the factors that influence chemical reactions.")
        );
        Course course16 = createCourse("Chemistry I", "Introduction to chemical principles, including atomic structure and chemical bonding.", "Chemistry", 4, syllabus16, units16);
        Resource resource16a=createResource("Course 16 textbook resource","https://openstax.org/books/chemistry-atoms-first-2e/pages/1-introduction",syllabus16,course16);
        Resource resource16b=createResource("Course 16 video resource","https://m.youtube.com/playlist?list=PL8dPuuaLjXtPHzzYuWy6fYEaX9m-QQ8aGr",syllabus16,course16);

// Course 17: Biology I
        Syllabus syllabus17 = createSyllabus("Introduction to cellular biology, genetics, and evolution.", "Cell Structure, Genetics, Evolution, Ecology.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units17 = Arrays.asList(
                createUnit("Cell Structure", "In this unit, students will learn about the structure and function of cells, including the cell membrane, nucleus, organelles, and the differences between prokaryotic and eukaryotic cells."),
                createUnit("Genetics", "This unit covers genetics, the study of heredity and the variation of inherited characteristics. Students will explore the principles of Mendelian genetics, the structure and function of DNA, and the processes of replication, transcription, and translation."),
                createUnit("Evolution", "In this unit, students will explore the theory of evolution, natural selection, and the evidence supporting evolutionary change. They will understand how genetic variation and environmental factors contribute to the evolution of species."),
                createUnit("Ecology", "This unit focuses on ecology, the study of interactions between organisms and their environment. Students will learn about ecosystems, food webs, energy flow, and the impact of human activities on the environment.")
        );
        Course course17 = createCourse("Biology I", "Introduction to cellular biology, genetics, and evolution.", "Biology", 4, syllabus17, units17);
        Resource resource17a=createResource("Course 17 textbook resource","https://openstax.org/books/biology-2e/pages/1-introduction",syllabus17,course17);
        Resource resource17b=createResource("Course 17 video resource","https://m.youtube.com/playlist?list=PL3EED4C1D684D3ADF",syllabus17,course17);

// Course 18: Introduction to Engineering
        Syllabus syllabus18 = createSyllabus("Overview of engineering disciplines and problem-solving techniques.", "Engineering Disciplines, Problem-Solving, Design Process.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units18 = Arrays.asList(
                createUnit("Engineering Disciplines", "In this unit, students will learn about the various engineering disciplines, including civil, mechanical, electrical, and chemical engineering. They will explore the roles and responsibilities of engineers in each field and understand the diverse applications of engineering."),
                createUnit("Problem-Solving", "This unit covers problem-solving techniques used in engineering. Students will learn about the engineering problem-solving process, including identifying problems, generating solutions, and selecting the best solution. They will apply these techniques to real-world engineering challenges."),
                createUnit("Design Process", "In this unit, students will explore the engineering design process, a systematic approach to solving engineering problems. They will learn about the stages of the design process, including defining requirements, brainstorming, prototyping, testing, and iteration.")
        );
        Course course18 = createCourse("Introduction to Engineering", "Overview of engineering disciplines and problem-solving techniques.", "Engineering", 3, syllabus18, units18);
        Resource resource18a=createResource("Course 18 textbook resource","https://archive.org/details/engineering-fundamentals-an-introduction-to-engineering",syllabus18,course18);
        Resource resource18b=createResource("Course 18 video resource","https://m.youtube.com/playlist?list=PLpe3qgeJLpB0AmyDNh4-UMClqLsao4-Va",syllabus18,course18);

// Course 19: Electrical Engineering Basics
        Syllabus syllabus19 = createSyllabus("Fundamentals of electrical circuits, signals, and systems.", "Circuit Analysis, Signal Processing, Systems Theory.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units19 = Arrays.asList(
                createUnit("Circuit Analysis", "In this unit, students will learn about the principles of circuit analysis, including Ohm's law, Kirchhoff's laws, and techniques for analyzing DC and AC circuits. They will understand how to calculate voltage, current, and resistance in electrical circuits."),
                createUnit("Signal Processing", "This unit covers the fundamentals of signal processing, including the analysis and manipulation of signals. Students will learn about Fourier transforms, filtering, and the applications of signal processing in communication systems and digital signal processing (DSP)."),
                createUnit("Systems Theory", "In this unit, students will explore systems theory, the study of systems and their behavior. They will learn about system modeling, feedback, and control systems, and understand how to apply these concepts to analyze and design electrical systems.")
        );
        Course course19 = createCourse("Electrical Engineering Basics", "Fundamentals of electrical circuits, signals, and systems.", "Engineering", 4, syllabus19, units19);
        Resource resource19a=createResource("Course 19 textbook resource","https://www.ece.rice.edu/~dhj/courses/elec241/col10040.pdf",syllabus19,course19);
        Resource resource19b=createResource("Course 19 video resource","https://m.youtube.com/watch?v=Vd2UJiIPbag",syllabus19,course19);

// Course 20: Mechanical Engineering Principles
        Syllabus syllabus20 = createSyllabus("Introduction to the principles of mechanics and thermodynamics.", "Statics, Dynamics, Thermodynamics, Material Science.", "Assignments (40%), Projects (30%), Tests (30%)");
        List<Unit> units20 = Arrays.asList(
                createUnit("Statics", "In this unit, students will learn about statics, the branch of mechanics that deals with bodies at rest and forces in equilibrium. They will understand how to analyze force systems, calculate moments, and solve problems related to static equilibrium."),
                createUnit("Dynamics", "This unit covers dynamics, the study of bodies in motion. Students will explore kinematics and kinetics, understand the principles of Newton's laws of motion, and learn how to analyze the motion of particles and rigid bodies."),
                createUnit("Thermodynamics", "In this unit, students will explore the principles of thermodynamics, including the laws of thermodynamics, energy transfer, and the behavior of gases and liquids. They will understand how to apply these principles to solve engineering problems involving heat and work."),
                createUnit("Material Science", "This unit focuses on material science, the study of the properties and behavior of materials. Students will learn about different types of materials, including metals, ceramics, polymers, and composites, and understand how to select materials for specific engineering applications.")
        );
        Course course20 = createCourse("Mechanical Engineering Principles", "Introduction to the principles of mechanics and thermodynamics.", "Engineering", 4, syllabus20, units20);
        Resource resource20a=createResource("Course 20 textbook resource","https://archive.org/details/mechanicalengine0000bird",syllabus20,course20);
        Resource resource20b=createResource("Course 20 video resource","https://www.youtube.com/watch?v=-MbMBgcFudY&list=PLoHI_8mQtcTbDowiHrTbykKRL75Yvzs2B",syllabus20,course20);

        //Semesters
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

}
