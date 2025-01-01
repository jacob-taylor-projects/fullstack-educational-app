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

import static com.project.education_app.AssignmentSeeder.*;
import static com.project.education_app.Seeder.*;

@Component
@Data
public class TestSeeder implements CommandLineRunner {
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


        //Tests
// Creating the test for Unit 1: Variables
        Test test1a = createTest("Variables Test", faculty1, Date.from(LocalDate.of(2029, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa1a_1 = createProblemAnswer("What is a variable in programming?", "A variable in programming is a storage location identified by a name that holds data which can be changed during the program's execution.");
        addTestToProblemAnswer(pa1a_1, test1a);
        addProblemAnswerToTest(test1a, pa1a_1);

        ProblemAnswer pa1a_2 = createProblemAnswer("How do you declare a variable in Python?", "To declare a variable in Python, you simply write the variable name followed by an equal sign and the value you want to assign. For example: `x = 5`.");
        addTestToProblemAnswer(pa1a_2, test1a);
        addProblemAnswerToTest(test1a, pa1a_2);

        ProblemAnswer pa1a_3 = createProblemAnswer("What is the importance of variables in programming?", "Variables are essential in programming because they allow developers to store, retrieve, and manipulate data, making the code more dynamic and flexible.");
        addTestToProblemAnswer(pa1a_3, test1a);
        addProblemAnswerToTest(test1a, pa1a_3);

        ProblemAnswer pa1a_4 = createProblemAnswer("How can you change the value of a variable once it has been assigned?", "You can change the value of a variable by reassigning it with a new value. For example: `x = 5` can be changed to `x = 10`.");
        addTestToProblemAnswer(pa1a_4, test1a);
        addProblemAnswerToTest(test1a, pa1a_4);

        ProblemAnswer pa1a_5 = createProblemAnswer("What are the rules for naming variables in Python?", "Variable names in Python must start with a letter (a-z, A-Z) or an underscore (_), followed by letters, digits (0-9), or underscores. They cannot start with a digit and are case-sensitive.");
        addTestToProblemAnswer(pa1a_5, test1a);
        addProblemAnswerToTest(test1a, pa1a_5);

// Output for confirmation
        System.out.println("Test for 'Variables' unit created with 10 problem answers.");
// Creating the test for Unit 2: Data Types
        Test test1b = createTest("Data Types Test", faculty1, Date.from(LocalDate.of(2029, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa1b_1 = createProblemAnswer("What is an integer in Python?", "An integer is a whole number without a fractional component.");
        addTestToProblemAnswer(pa1b_1, test1b);
        addProblemAnswerToTest(test1b, pa1b_1);

        ProblemAnswer pa1b_2 = createProblemAnswer("What is a float in Python?", "A float is a number that has a decimal point or is written in exponential form.");
        addTestToProblemAnswer(pa1b_2, test1b);
        addProblemAnswerToTest(test1b, pa1b_2);

        ProblemAnswer pa1b_3 = createProblemAnswer("What is a string in Python?", "A string is a sequence of characters enclosed in quotes, used to represent text.");
        addTestToProblemAnswer(pa1b_3, test1b);
        addProblemAnswerToTest(test1b, pa1b_3);

        ProblemAnswer pa1b_4 = createProblemAnswer("What is a boolean in Python?", "A boolean is a data type with two possible values: True or False, used for logical operations.");
        addTestToProblemAnswer(pa1b_4, test1b);
        addProblemAnswerToTest(test1b, pa1b_4);

        ProblemAnswer pa1b_5 = createProblemAnswer("How do you convert an integer to a float in Python?", "You can convert an integer to a float using the `float()` function. For example: `float(5)` results in `5.0`.");
        addTestToProblemAnswer(pa1b_5, test1b);
        addProblemAnswerToTest(test1b, pa1b_5);


// Output for confirmation
        System.out.println("Test for 'Data Types' unit created with 10 problem answers.");
// Creating the test for Unit 3: Control Structures
        Test test1c = createTest("Control Structures Test", faculty1, Date.from(LocalDate.of(2029, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa1c_1 = createProblemAnswer("What is a for loop in Python?", "A for loop is a control structure that allows you to repeat a block of code a fixed number of times.");
        addTestToProblemAnswer(pa1c_1, test1c);
        addProblemAnswerToTest(test1c, pa1c_1);

        ProblemAnswer pa1c_2 = createProblemAnswer("What is a while loop in Python?", "A while loop is a control structure that repeats a block of code as long as a specified condition is true.");
        addTestToProblemAnswer(pa1c_2, test1c);
        addProblemAnswerToTest(test1c, pa1c_2);

        ProblemAnswer pa1c_3 = createProblemAnswer("What is an if statement in Python?", "An if statement is a control structure that executes a block of code only if a specified condition is true.");
        addTestToProblemAnswer(pa1c_3, test1c);
        addProblemAnswerToTest(test1c, pa1c_3);

        ProblemAnswer pa1c_4 = createProblemAnswer("What is an elif statement in Python?", "An elif statement is a control structure used in conjunction with an if statement to check additional conditions if the previous conditions are false.");
        addTestToProblemAnswer(pa1c_4, test1c);
        addProblemAnswerToTest(test1c, pa1c_4);

        ProblemAnswer pa1c_5 = createProblemAnswer("What is an else statement in Python?", "An else statement is a control structure that executes a block of code if none of the previous conditions are true.");
        addTestToProblemAnswer(pa1c_5, test1c);
        addProblemAnswerToTest(test1c, pa1c_5);

// Output for confirmation
        System.out.println("Test for 'Control Structures' unit created with 10 problem answers.");
// Creating the test for Unit 4: Functions
        Test test1d = createTest("Functions Test", faculty1, Date.from(LocalDate.of(2029, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa1d_1 = createProblemAnswer("What is a function in Python?", "A function is a block of reusable code that performs a specific task.");
        addTestToProblemAnswer(pa1d_1, test1d);
        addProblemAnswerToTest(test1d, pa1d_1);

        ProblemAnswer pa1d_2 = createProblemAnswer("How do you define a function in Python?", "You define a function in Python using the `def` keyword followed by the function name and parentheses. For example: `def my_function():`.");
        addTestToProblemAnswer(pa1d_2, test1d);
        addProblemAnswerToTest(test1d, pa1d_2);

        ProblemAnswer pa1d_3 = createProblemAnswer("What is a parameter in Python?", "A parameter is a variable in a function definition that accepts values passed to the function when it is called.");
        addTestToProblemAnswer(pa1d_3, test1d);
        addProblemAnswerToTest(test1d, pa1d_3);

        ProblemAnswer pa1d_4 = createProblemAnswer("What is an argument in Python?", "An argument is a value that is passed to a function when it is called.");
        addTestToProblemAnswer(pa1d_4, test1d);
        addProblemAnswerToTest(test1d, pa1d_4);

        ProblemAnswer pa1d_5 = createProblemAnswer("How do you return a value from a function in Python?", "You return a value from a function using the `return` statement. For example: `return result`.");
        addTestToProblemAnswer(pa1d_5, test1d);
        addProblemAnswerToTest(test1d, pa1d_5);

// Output for confirmation
        System.out.println("Test for 'Functions' unit created with 10 problem answers.");
// Creating the test for Unit 5: Modules
        Test test1e = createTest("Modules Test", faculty1, Date.from(LocalDate.of(2029, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa1e_1 = createProblemAnswer("What is a module in Python?", "A module is a file containing Python definitions and statements. It helps in organizing and reusing code.");
        addTestToProblemAnswer(pa1e_1, test1e);
        addProblemAnswerToTest(test1e, pa1e_1);

        ProblemAnswer pa1e_2 = createProblemAnswer("How do you create a module in Python?", "To create a module, simply write Python code in a file with a .py extension. For example, my_module.py.");
        addTestToProblemAnswer(pa1e_2, test1e);
        addProblemAnswerToTest(test1e, pa1e_2);

        ProblemAnswer pa1e_3 = createProblemAnswer("How do you import a module in Python?", "You can import a module using the `import` statement. For example: `import my_module`.");
        addTestToProblemAnswer(pa1e_3, test1e);
        addProblemAnswerToTest(test1e, pa1e_3);

        ProblemAnswer pa1e_4 = createProblemAnswer("What is the purpose of the `__name__` variable in Python modules?", "The `__name__` variable in a module is set to `__main__` when the module is run as the main program. It helps in determining if the module is being run on its own or being imported.");
        addTestToProblemAnswer(pa1e_4, test1e);
        addProblemAnswerToTest(test1e, pa1e_4);

        ProblemAnswer pa1e_5 = createProblemAnswer("How do you access functions and variables from an imported module?", "You can access functions and variables from an imported module using the dot notation. For example: `module_name.function_name()`.");
        addTestToProblemAnswer(pa1e_5, test1e);
        addProblemAnswerToTest(test1e, pa1e_5);

// Output for confirmation
        System.out.println("Test for 'Modules' unit created with 10 problem answers.");
// Creating the test for Unit 6: Libraries
        Test test1f = createTest("Libraries Test", faculty1, Date.from(LocalDate.of(2029, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa1f_1 = createProblemAnswer("What is a library in Python?", "A library is a collection of modules and packages that provide pre-written code for common tasks.");
        addTestToProblemAnswer(pa1f_1, test1f);
        addProblemAnswerToTest(test1f, pa1f_1);

        ProblemAnswer pa1f_2 = createProblemAnswer("How do you install a Python library?", "You can install a Python library using the `pip` tool. For example: `pip install library_name`.");
        addTestToProblemAnswer(pa1f_2, test1f);
        addProblemAnswerToTest(test1f, pa1f_2);

        ProblemAnswer pa1f_3 = createProblemAnswer("How do you import a library in Python?", "You can import a library using the `import` statement. For example: `import library_name`.");
        addTestToProblemAnswer(pa1f_3, test1f);
        addProblemAnswerToTest(test1f, pa1f_3);

        ProblemAnswer pa1f_4 = createProblemAnswer("What is the standard library in Python?", "The standard library is a collection of modules and packages included with Python. It provides functionalities for various tasks such as file I/O, system calls, and data manipulation.");
        addTestToProblemAnswer(pa1f_4, test1f);
        addProblemAnswerToTest(test1f, pa1f_4);

        ProblemAnswer pa1f_5 = createProblemAnswer("How do you find documentation for a Python library?", "You can find documentation for a Python library on its official website or through online resources such as Read the Docs and PyPI.");
        addTestToProblemAnswer(pa1f_5, test1f);
        addProblemAnswerToTest(test1f, pa1f_5);


// Output for confirmation
        System.out.println("Test for 'Libraries' unit created with 10 problem answers.");
// Creating the test for Unit 1: Arrays
        Test test2a = createTest("Arrays Test", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa2a_1 = createProblemAnswer("What is an array?", "An array is a collection of elements, each identified by an index or a key, that stores data of the same type.");
        addTestToProblemAnswer(pa2a_1, test2a);
        addProblemAnswerToTest(test2a, pa2a_1);

        ProblemAnswer pa2a_2 = createProblemAnswer("How do you declare an array in Python?", "In Python, you can declare an array using the list syntax. For example: `arr = [1, 2, 3, 4, 5]`.");
        addTestToProblemAnswer(pa2a_2, test2a);
        addProblemAnswerToTest(test2a, pa2a_2);

        ProblemAnswer pa2a_3 = createProblemAnswer("What are the benefits of using arrays?", "Arrays provide efficient storage and retrieval of data, easy iteration, and support for various operations like sorting and searching.");
        addTestToProblemAnswer(pa2a_3, test2a);
        addProblemAnswerToTest(test2a, pa2a_3);

        ProblemAnswer pa2a_4 = createProblemAnswer("How do you access an element in an array?", "You can access an element in an array using its index. For example: `arr[0]` accesses the first element of the array.");
        addTestToProblemAnswer(pa2a_4, test2a);
        addProblemAnswerToTest(test2a, pa2a_4);

        ProblemAnswer pa2a_5 = createProblemAnswer("How do you modify an element in an array?", "You can modify an element in an array by assigning a new value to it using its index. For example: `arr[1] = 10` changes the second element of the array to 10.");
        addTestToProblemAnswer(pa2a_5, test2a);
        addProblemAnswerToTest(test2a, pa2a_5);

// Output for confirmation
        System.out.println("Test for 'Arrays' unit created with 10 problem answers.");
// Creating the test for Unit 2: Linked Lists
        Test test2b = createTest("Linked Lists Test", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa2b_1 = createProblemAnswer("What is a linked list?", "A linked list is a data structure consisting of nodes, where each node contains data and a reference to the next node in the sequence.");
        addTestToProblemAnswer(pa2b_1, test2b);
        addProblemAnswerToTest(test2b, pa2b_1);

        ProblemAnswer pa2b_2 = createProblemAnswer("What are the types of linked lists?", "The types of linked lists include singly linked lists, doubly linked lists, and circular linked lists.");
        addTestToProblemAnswer(pa2b_2, test2b);
        addProblemAnswerToTest(test2b, pa2b_2);

        ProblemAnswer pa2b_3 = createProblemAnswer("How do you insert a node at the beginning of a linked list?", "To insert a node at the beginning, create a new node and set its next reference to the current head. Then update the head to the new node.");
        addTestToProblemAnswer(pa2b_3, test2b);
        addProblemAnswerToTest(test2b, pa2b_3);

        ProblemAnswer pa2b_4 = createProblemAnswer("How do you delete a node from a linked list?", "To delete a node, update the next reference of the previous node to bypass the node to be deleted and point to the next node.");
        addTestToProblemAnswer(pa2b_4, test2b);
        addProblemAnswerToTest(test2b, pa2b_4);

        ProblemAnswer pa2b_5 = createProblemAnswer("What is the advantage of using linked lists over arrays?", "Linked lists provide dynamic memory allocation, making it easier to insert and delete elements without the need to shift elements.");
        addTestToProblemAnswer(pa2b_5, test2b);
        addProblemAnswerToTest(test2b, pa2b_5);


// Output for confirmation
        System.out.println("Test for 'Linked Lists' unit created with 10 problem answers.");
// Creating the test for Unit 3: Stacks
        Test test2c = createTest("Stacks Test", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa2c_1 = createProblemAnswer("What is a stack?", "A stack is a last-in, first-out (LIFO) data structure where the last element added is the first one to be removed.");
        addTestToProblemAnswer(pa2c_1, test2c);
        addProblemAnswerToTest(test2c, pa2c_1);

        ProblemAnswer pa2c_2 = createProblemAnswer("What are the primary operations of a stack?", "The primary operations of a stack are `push` (adding an element to the top) and `pop` (removing the top element).");
        addTestToProblemAnswer(pa2c_2, test2c);
        addProblemAnswerToTest(test2c, pa2c_2);

        ProblemAnswer pa2c_3 = createProblemAnswer("How do you implement a stack in Python?", "A stack can be implemented in Python using a list, where `append()` performs the `push` operation and `pop()` performs the `pop` operation.");
        addTestToProblemAnswer(pa2c_3, test2c);
        addProblemAnswerToTest(test2c, pa2c_3);

        ProblemAnswer pa2c_4 = createProblemAnswer("What is stack overflow?", "Stack overflow occurs when too many items are pushed onto the stack, exceeding its capacity and causing an error.");
        addTestToProblemAnswer(pa2c_4, test2c);
        addProblemAnswerToTest(test2c, pa2c_4);

        ProblemAnswer pa2c_5 = createProblemAnswer("What is stack underflow?", "Stack underflow occurs when trying to pop an element from an empty stack, resulting in an error.");
        addTestToProblemAnswer(pa2c_5, test2c);
        addProblemAnswerToTest(test2c, pa2c_5);

// Output for confirmation
        System.out.println("Test for 'Stacks' unit created with 10 problem answers.");
// Creating the test for Unit 4: Queues
        Test test2d = createTest("Queues Test", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa2d_1 = createProblemAnswer("What is a queue?", "A queue is a first-in, first-out (FIFO) data structure where the first element added is the first one to be removed.");
        addTestToProblemAnswer(pa2d_1, test2d);
        addProblemAnswerToTest(test2d, pa2d_1);

        ProblemAnswer pa2d_2 = createProblemAnswer("What are the primary operations of a queue?", "The primary operations of a queue are `enqueue` (adding an element to the back) and `dequeue` (removing the front element).");
        addTestToProblemAnswer(pa2d_2, test2d);
        addProblemAnswerToTest(test2d, pa2d_2);

        ProblemAnswer pa2d_3 = createProblemAnswer("How do you implement a queue in Python?", "A queue can be implemented in Python using a list, where `append()` performs the `enqueue` operation and `pop(0)` performs the `dequeue` operation.");
        addTestToProblemAnswer(pa2d_3, test2d);
        addProblemAnswerToTest(test2d, pa2d_3);

        ProblemAnswer pa2d_4 = createProblemAnswer("What is queue overflow?", "Queue overflow occurs when too many items are enqueued onto the queue, exceeding its capacity and causing an error.");
        addTestToProblemAnswer(pa2d_4, test2d);
        addProblemAnswerToTest(test2d, pa2d_4);

        ProblemAnswer pa2d_5 = createProblemAnswer("What is queue underflow?", "Queue underflow occurs when trying to dequeue an element from an empty queue, resulting in an error.");
        addTestToProblemAnswer(pa2d_5, test2d);
        addProblemAnswerToTest(test2d, pa2d_5);

// Output for confirmation
        System.out.println("Test for 'Queues' unit created with 10 problem answers.");
// Creating the test for Unit 5: Trees
        Test test2e = createTest("Trees Test", faculty2, Date.from(LocalDate.of(2030, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa2e_1 = createProblemAnswer("What is a tree in data structures?", "A tree is a hierarchical data structure consisting of nodes, where each node has a value and references to its children.");
        addTestToProblemAnswer(pa2e_1, test2e);
        addProblemAnswerToTest(test2e, pa2e_1);

        ProblemAnswer pa2e_2 = createProblemAnswer("What is a binary tree?", "A binary tree is a type of tree where each node has at most two children, referred to as the left and right children.");
        addTestToProblemAnswer(pa2e_2, test2e);
        addProblemAnswerToTest(test2e, pa2e_2);

        ProblemAnswer pa2e_3 = createProblemAnswer("What is a binary search tree (BST)?", "A binary search tree (BST) is a type of binary tree where the left child of a node contains values less than the node, and the right child contains values greater than the node.");
        addTestToProblemAnswer(pa2e_3, test2e);
        addProblemAnswerToTest(test2e, pa2e_3);

        ProblemAnswer pa2e_4 = createProblemAnswer("How do you traverse a tree in preorder?", "In preorder traversal, you visit the root node first, then recursively visit the left subtree, followed by the right subtree.");
        addTestToProblemAnswer(pa2e_4, test2e);
        addProblemAnswerToTest(test2e, pa2e_4);

        ProblemAnswer pa2e_5 = createProblemAnswer("How do you traverse a tree in inorder?", "In inorder traversal, you recursively visit the left subtree first, then visit the root node, followed by the right subtree.");
        addTestToProblemAnswer(pa2e_5, test2e);
        addProblemAnswerToTest(test2e, pa2e_5);


// Output for confirmation
        System.out.println("Test for 'Trees' unit created with 10 problem answers.");
// Creating the test for Unit 6: Graphs
        Test test2f = createTest("Graphs Test", faculty2, Date.from(LocalDate.of(2030, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa2f_1 = createProblemAnswer("What is a graph in data structures?", "A graph is a collection of nodes (vertices) and edges that connect pairs of nodes, used to represent relationships between entities.");
        addTestToProblemAnswer(pa2f_1, test2f);
        addProblemAnswerToTest(test2f, pa2f_1);

        ProblemAnswer pa2f_2 = createProblemAnswer("What are the types of graphs?", "The types of graphs include directed graphs (digraphs) and undirected graphs. In directed graphs, edges have a direction, while in undirected graphs, edges do not have a direction.");
        addTestToProblemAnswer(pa2f_2, test2f);
        addProblemAnswerToTest(test2f, pa2f_2);

        ProblemAnswer pa2f_3 = createProblemAnswer("What is a weighted graph?", "A weighted graph is a graph in which each edge is assigned a weight or cost, representing the cost of moving between nodes.");
        addTestToProblemAnswer(pa2f_3, test2f);
        addProblemAnswerToTest(test2f, pa2f_3);

        ProblemAnswer pa2f_4 = createProblemAnswer("What is a path in a graph?", "A path in a graph is a sequence of edges that connect a sequence of vertices, with no repeated vertices.");
        addTestToProblemAnswer(pa2f_4, test2f);
        addProblemAnswerToTest(test2f, pa2f_4);

        ProblemAnswer pa2f_5 = createProblemAnswer("What is a cycle in a graph?", "A cycle in a graph is a path that starts and ends at the same vertex, with all edges and vertices being distinct except for the starting and ending vertex.");
        addTestToProblemAnswer(pa2f_5, test2f);
        addProblemAnswerToTest(test2f, pa2f_5);

// Output for confirmation
        System.out.println("Test for 'Graphs' unit created with 10 problem answers.");
// Creating the test for Unit 1: Sorting
        Test test3a = createTest("Sorting Test", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa3a_1 = createProblemAnswer("What is bubble sort?", "Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.");
        addTestToProblemAnswer(pa3a_1, test3a);
        addProblemAnswerToTest(test3a, pa3a_1);

        ProblemAnswer pa3a_2 = createProblemAnswer("How does merge sort work?", "Merge sort is a divide-and-conquer algorithm that divides the list into halves, recursively sorts each half, and then merges the sorted halves.");
        addTestToProblemAnswer(pa3a_2, test3a);
        addProblemAnswerToTest(test3a, pa3a_2);

        ProblemAnswer pa3a_3 = createProblemAnswer("What is quicksort?", "Quicksort is a divide-and-conquer algorithm that selects a 'pivot' element, partitions the list into elements less than and greater than the pivot, and recursively sorts the partitions.");
        addTestToProblemAnswer(pa3a_3, test3a);
        addProblemAnswerToTest(test3a, pa3a_3);

        ProblemAnswer pa3a_4 = createProblemAnswer("What is the time complexity of bubble sort?", "The time complexity of bubble sort is O(n^2) in the average and worst case, where n is the number of elements.");
        addTestToProblemAnswer(pa3a_4, test3a);
        addProblemAnswerToTest(test3a, pa3a_4);

        ProblemAnswer pa3a_5 = createProblemAnswer("What is the time complexity of merge sort?", "The time complexity of merge sort is O(n log n) in all cases, where n is the number of elements.");
        addTestToProblemAnswer(pa3a_5, test3a);
        addProblemAnswerToTest(test3a, pa3a_5);


// Output for confirmation
        System.out.println("Test for 'Sorting' unit created with 10 problem answers.");
// Creating the test for Unit 2: Searching
        Test test3b = createTest("Searching Test", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa3b_1 = createProblemAnswer("What is linear search?", "Linear search is a simple searching algorithm that checks each element in the list sequentially until the desired element is found or the list ends.");
        addTestToProblemAnswer(pa3b_1, test3b);
        addProblemAnswerToTest(test3b, pa3b_1);

        ProblemAnswer pa3b_2 = createProblemAnswer("What is binary search?", "Binary search is a searching algorithm that divides the list into halves to find the desired element. It requires the list to be sorted.");
        addTestToProblemAnswer(pa3b_2, test3b);
        addProblemAnswerToTest(test3b, pa3b_2);

        ProblemAnswer pa3b_3 = createProblemAnswer("How does linear search work?", "Linear search iterates through the list and compares each element with the target value until a match is found or the end of the list is reached.");
        addTestToProblemAnswer(pa3b_3, test3b);
        addProblemAnswerToTest(test3b, pa3b_3);

        ProblemAnswer pa3b_4 = createProblemAnswer("How does binary search work?", "Binary search repeatedly divides the list in half, compares the middle element with the target value, and narrows down the search to the appropriate half.");
        addTestToProblemAnswer(pa3b_4, test3b);
        addProblemAnswerToTest(test3b, pa3b_4);

        ProblemAnswer pa3b_5 = createProblemAnswer("What is the time complexity of linear search?", "The time complexity of linear search is O(n), where n is the number of elements in the list.");
        addTestToProblemAnswer(pa3b_5, test3b);
        addProblemAnswerToTest(test3b, pa3b_5);


// Output for confirmation
        System.out.println("Test for 'Searching' unit created with 10 problem answers.");
// Creating the test for Unit 3: Graph Algorithms
        Test test3c = createTest("Graph Algorithms Test", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa3c_1 = createProblemAnswer("What is depth-first search (DFS)?", "Depth-first search (DFS) is a graph traversal algorithm that explores as far as possible along each branch before backtracking.");
        addTestToProblemAnswer(pa3c_1, test3c);
        addProblemAnswerToTest(test3c, pa3c_1);

        ProblemAnswer pa3c_2 = createProblemAnswer("What is breadth-first search (BFS)?", "Breadth-first search (BFS) is a graph traversal algorithm that explores all nodes at the present depth level before moving on to nodes at the next depth level.");
        addTestToProblemAnswer(pa3c_2, test3c);
        addProblemAnswerToTest(test3c, pa3c_2);

        ProblemAnswer pa3c_3 = createProblemAnswer("How does DFS work?", "DFS uses a stack (either explicitly or via recursion) to explore as far as possible along each branch before backtracking.");
        addTestToProblemAnswer(pa3c_3, test3c);
        addProblemAnswerToTest(test3c, pa3c_3);

        ProblemAnswer pa3c_4 = createProblemAnswer("How does BFS work?", "BFS uses a queue to explore all nodes at the present depth level before moving on to nodes at the next depth level.");
        addTestToProblemAnswer(pa3c_4, test3c);
        addProblemAnswerToTest(test3c, pa3c_4);

        ProblemAnswer pa3c_5 = createProblemAnswer("What is the time complexity of DFS?", "The time complexity of DFS is O(V + E), where V is the number of vertices and E is the number of edges in the graph.");
        addTestToProblemAnswer(pa3c_5, test3c);
        addProblemAnswerToTest(test3c, pa3c_5);

// Output for confirmation
        System.out.println("Test for 'Graph Algorithms' unit created with 10 problem answers.");
// Creating the test for Unit 4: Dynamic Programming
        Test test3d = createTest("Dynamic Programming Test", faculty3, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa3d_1 = createProblemAnswer("What is dynamic programming?", "Dynamic programming is a method for solving complex problems by breaking them down into simpler subproblems and solving each subproblem just once, storing its solution.");
        addTestToProblemAnswer(pa3d_1, test3d);
        addProblemAnswerToTest(test3d, pa3d_1);

        ProblemAnswer pa3d_2 = createProblemAnswer("What is the difference between dynamic programming and recursion?", "Dynamic programming optimizes recursion by storing the results of subproblems (memoization) to avoid redundant computations.");
        addTestToProblemAnswer(pa3d_2, test3d);
        addProblemAnswerToTest(test3d, pa3d_2);

        ProblemAnswer pa3d_3 = createProblemAnswer("What is the principle of optimality?", "The principle of optimality states that an optimal solution to a problem contains optimal solutions to its subproblems.");
        addTestToProblemAnswer(pa3d_3, test3d);
        addProblemAnswerToTest(test3d, pa3d_3);

        ProblemAnswer pa3d_4 = createProblemAnswer("What is memoization?", "Memoization is a technique used in dynamic programming to store the results of expensive function calls and reuse them when the same inputs occur again.");
        addTestToProblemAnswer(pa3d_4, test3d);
        addProblemAnswerToTest(test3d, pa3d_4);

        ProblemAnswer pa3d_5 = createProblemAnswer("How do you implement the Fibonacci sequence using dynamic programming?", "You can implement the Fibonacci sequence using dynamic programming by storing the results of previous Fibonacci calculations in an array and reusing them.");
        addTestToProblemAnswer(pa3d_5, test3d);
        addProblemAnswerToTest(test3d, pa3d_5);

// Output for confirmation
        System.out.println("Test for 'Dynamic Programming' unit created with 10 problem answers.");
// Creating the test for Unit 1: Relational Databases
        Test test4a = createTest("Relational Databases Test", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa4a_1 = createProblemAnswer("What is a relational database?", "A relational database is a type of database that stores data in tables with rows and columns, where relationships between tables are established using keys.");
        addTestToProblemAnswer(pa4a_1, test4a);
        addProblemAnswerToTest(test4a, pa4a_1);

        ProblemAnswer pa4a_2 = createProblemAnswer("What is a table in a relational database?", "A table is a collection of related data entries that consists of columns (fields) and rows (records). Each column represents a data attribute, and each row represents a record.");
        addTestToProblemAnswer(pa4a_2, test4a);
        addProblemAnswerToTest(test4a, pa4a_2);

        ProblemAnswer pa4a_3 = createProblemAnswer("What is a primary key?", "A primary key is a unique identifier for each record in a table. It ensures that each record can be uniquely identified and that no duplicate records exist.");
        addTestToProblemAnswer(pa4a_3, test4a);
        addProblemAnswerToTest(test4a, pa4a_3);

        ProblemAnswer pa4a_4 = createProblemAnswer("What is a foreign key?", "A foreign key is a field in one table that uniquely identifies a row in another table. It establishes a relationship between the two tables.");
        addTestToProblemAnswer(pa4a_4, test4a);
        addProblemAnswerToTest(test4a, pa4a_4);

        ProblemAnswer pa4a_5 = createProblemAnswer("What is a relational schema?", "A relational schema is a blueprint that defines the structure of a relational database, including the tables, fields, and relationships between tables.");
        addTestToProblemAnswer(pa4a_5, test4a);
        addProblemAnswerToTest(test4a, pa4a_5);

// Output for confirmation
        System.out.println("Test for 'Relational Databases' unit created with 10 problem answers.");
// Creating the test for Unit 2: SQL
        Test test4b = createTest("SQL Test", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa4b_1 = createProblemAnswer("What is SQL?", "SQL (Structured Query Language) is the standard language for querying and manipulating databases.");
        addTestToProblemAnswer(pa4b_1, test4b);
        addProblemAnswerToTest(test4b, pa4b_1);

        ProblemAnswer pa4b_2 = createProblemAnswer("How do you write a SELECT statement in SQL?", "A SELECT statement is used to query data from a database. For example: `SELECT column1, column2 FROM table_name;`.");
        addTestToProblemAnswer(pa4b_2, test4b);
        addProblemAnswerToTest(test4b, pa4b_2);

        ProblemAnswer pa4b_3 = createProblemAnswer("What is the purpose of the WHERE clause in SQL?", "The WHERE clause is used to filter records based on specified conditions. For example: `SELECT * FROM table_name WHERE condition;`.");
        addTestToProblemAnswer(pa4b_3, test4b);
        addProblemAnswerToTest(test4b, pa4b_3);

        ProblemAnswer pa4b_4 = createProblemAnswer("How do you write an INSERT statement in SQL?", "An INSERT statement is used to add new records to a table. For example: `INSERT INTO table_name (column1, column2) VALUES (value1, value2);`.");
        addTestToProblemAnswer(pa4b_4, test4b);
        addProblemAnswerToTest(test4b, pa4b_4);

        ProblemAnswer pa4b_5 = createProblemAnswer("What is the purpose of the UPDATE statement in SQL?", "An UPDATE statement is used to modify existing records in a table. For example: `UPDATE table_name SET column1 = value1 WHERE condition;`.");
        addTestToProblemAnswer(pa4b_5, test4b);
        addProblemAnswerToTest(test4b, pa4b_5);


// Output for confirmation
        System.out.println("Test for 'SQL' unit created with 10 problem answers.");
// Creating the test for Unit 3: Transactions
        Test test4c = createTest("Transactions Test", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa4c_1 = createProblemAnswer("What is a transaction in a database?", "A transaction is a sequence of one or more SQL operations that are executed as a single unit of work. It ensures data integrity and consistency.");
        addTestToProblemAnswer(pa4c_1, test4c);
        addProblemAnswerToTest(test4c, pa4c_1);

        ProblemAnswer pa4c_2 = createProblemAnswer("What are ACID properties?", "ACID properties are a set of principles that ensure reliable transactions in a database. They stand for Atomicity, Consistency, Isolation, and Durability.");
        addTestToProblemAnswer(pa4c_2, test4c);
        addProblemAnswerToTest(test4c, pa4c_2);

        ProblemAnswer pa4c_3 = createProblemAnswer("What is atomicity?", "Atomicity ensures that all operations within a transaction are completed successfully. If any operation fails, the entire transaction is rolled back.");
        addTestToProblemAnswer(pa4c_3, test4c);
        addProblemAnswerToTest(test4c, pa4c_3);

        ProblemAnswer pa4c_4 = createProblemAnswer("What is consistency in database transactions?", "Consistency ensures that a transaction brings the database from one valid state to another, maintaining data integrity throughout the process.");
        addTestToProblemAnswer(pa4c_4, test4c);
        addProblemAnswerToTest(test4c, pa4c_4);

        ProblemAnswer pa4c_5 = createProblemAnswer("What is isolation?", "Isolation ensures that concurrent transactions do not interfere with each other, providing each transaction with a consistent view of the database.");
        addTestToProblemAnswer(pa4c_5, test4c);
        addProblemAnswerToTest(test4c, pa4c_5);


// Output for confirmation
        System.out.println("Test for 'Transactions' unit created with 10 problem answers.");
// Creating the test for Unit 4: Database Design
        Test test4d = createTest("Database Design Test", faculty4, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa4d_1 = createProblemAnswer("What is database design?", "Database design is the process of creating a detailed data model of a database, which includes the structure of tables, relationships, and constraints to efficiently store and retrieve data.");
        addTestToProblemAnswer(pa4d_1, test4d);
        addProblemAnswerToTest(test4d, pa4d_1);

        ProblemAnswer pa4d_2 = createProblemAnswer("What is normalization in database design?", "Normalization is the process of organizing data in a database to reduce redundancy and improve data integrity. It involves dividing tables into smaller tables and defining relationships between them.");
        addTestToProblemAnswer(pa4d_2, test4d);
        addProblemAnswerToTest(test4d, pa4d_2);

        ProblemAnswer pa4d_3 = createProblemAnswer("What are the normal forms in database normalization?", "Normal forms are standards used to achieve normalization. The common normal forms are: 1NF (First Normal Form), 2NF (Second Normal Form), 3NF (Third Normal Form), and BCNF (Boyce-Codd Normal Form).");
        addTestToProblemAnswer(pa4d_3, test4d);
        addProblemAnswerToTest(test4d, pa4d_3);

        ProblemAnswer pa4d_4 = createProblemAnswer("What is denormalization?", "Denormalization is the process of combining normalized tables into larger tables to improve read performance and reduce the complexity of database queries, at the cost of increased redundancy.");
        addTestToProblemAnswer(pa4d_4, test4d);
        addProblemAnswerToTest(test4d, pa4d_4);

        ProblemAnswer pa4d_5 = createProblemAnswer("What is an entity-relationship (ER) diagram?", "An ER diagram is a visual representation of entities and their relationships within a database. It is used to design and model the database structure.");
        addTestToProblemAnswer(pa4d_5, test4d);
        addProblemAnswerToTest(test4d, pa4d_5);

// Output for confirmation
        System.out.println("Test for 'Database Design' unit created with 10 problem answers.");
// Creating the test for Unit 1: Processes
        Test test5a = createTest("Processes Test", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus5, false);

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
// Creating the test for Unit 1: Machine Learning
        Test test9a = createTest("Machine Learning Test", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus9, false);

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
// Creating the test for Unit 1: Sequences and Series
        Test test13a = createTest("Sequences and Series Test", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa13a_1 = createProblemAnswer("What is a sequence?", "A sequence is an ordered list of numbers that follows a specific pattern or rule. Each number in the sequence is called a term.");
        addTestToProblemAnswer(pa13a_1, test13a);
        addProblemAnswerToTest(test13a, pa13a_1);

        ProblemAnswer pa13a_2 = createProblemAnswer("What is a series?", "A series is the sum of the terms of a sequence. It can be finite or infinite, depending on the number of terms being summed.");
        addTestToProblemAnswer(pa13a_2, test13a);
        addProblemAnswerToTest(test13a, pa13a_2);

        ProblemAnswer pa13a_3 = createProblemAnswer("What is a convergent series?", "A convergent series is a series whose terms approach a finite limit as the number of terms increases. The series converges to this limit.");
        addTestToProblemAnswer(pa13a_3, test13a);
        addProblemAnswerToTest(test13a, pa13a_3);

        ProblemAnswer pa13a_4 = createProblemAnswer("What is a divergent series?", "A divergent series is a series whose terms do not approach a finite limit as the number of terms increases. The series either increases without bound or oscillates indefinitely.");
        addTestToProblemAnswer(pa13a_4, test13a);
        addProblemAnswerToTest(test13a, pa13a_4);

        ProblemAnswer pa13a_5 = createProblemAnswer("What is a power series?", "A power series is an infinite series of the form Σ(an)(x^n), where an are coefficients and x is the variable. Power series can represent functions within a certain interval of convergence.");
        addTestToProblemAnswer(pa13a_5, test13a);
        addProblemAnswerToTest(test13a, pa13a_5);


// Output for confirmation
        System.out.println("Test for 'Sequences and Series' unit created with 10 problem answers.");
// Creating the test for Unit 2: Techniques of Integration
        Test test13b = createTest("Techniques of Integration Test", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa13b_1 = createProblemAnswer("What is integration by parts?", "Integration by parts is a technique used to integrate the product of two functions. It is based on the product rule of differentiation and is given by the formula: ∫u dv = uv - ∫v du.");
        addTestToProblemAnswer(pa13b_1, test13b);
        addProblemAnswerToTest(test13b, pa13b_1);

        ProblemAnswer pa13b_2 = createProblemAnswer("What is partial fractions integration?", "Partial fractions integration is a method used to integrate rational functions by expressing them as a sum of simpler fractions. This technique involves decomposing the rational function into partial fractions and then integrating each fraction separately.");
        addTestToProblemAnswer(pa13b_2, test13b);
        addProblemAnswerToTest(test13b, pa13b_2);

        ProblemAnswer pa13b_3 = createProblemAnswer("How do you integrate trigonometric functions?", "To integrate trigonometric functions, you can use trigonometric identities, substitution, and integration formulas. Common techniques include using identities to simplify the integrand and applying specific integration formulas for trigonometric functions.");
        addTestToProblemAnswer(pa13b_3, test13b);
        addProblemAnswerToTest(test13b, pa13b_3);

        ProblemAnswer pa13b_4 = createProblemAnswer("What are improper integrals?", "Improper integrals are integrals that have infinite limits of integration or integrands with infinite discontinuities. They are evaluated as limits, such as ∫[a, ∞] f(x) dx = lim(b→∞) ∫[a, b] f(x) dx.");
        addTestToProblemAnswer(pa13b_4, test13b);
        addProblemAnswerToTest(test13b, pa13b_4);

        ProblemAnswer pa13b_5 = createProblemAnswer("What is the substitution method in integration?", "The substitution method, also known as u-substitution, is used to simplify integrals by substituting a part of the integrand with a new variable. This technique often makes the integral easier to evaluate.");
        addTestToProblemAnswer(pa13b_5, test13b);
        addProblemAnswerToTest(test13b, pa13b_5);

// Output for confirmation
        System.out.println("Test for 'Techniques of Integration' unit created with 10 problem answers.");
// Creating the test for Unit 3: Multivariable Functions
        Test test13c = createTest("Multivariable Functions Test", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa13c_1 = createProblemAnswer("What is a multivariable function?", "A multivariable function is a function that has more than one input variable. It maps a set of input variables to a single output value.");
        addTestToProblemAnswer(pa13c_1, test13c);
        addProblemAnswerToTest(test13c, pa13c_1);

        ProblemAnswer pa13c_2 = createProblemAnswer("What is a partial derivative?", "A partial derivative is the derivative of a multivariable function with respect to one of its variables, while keeping the other variables constant. It measures how the function changes as that variable changes.");
        addTestToProblemAnswer(pa13c_2, test13c);
        addProblemAnswerToTest(test13c, pa13c_2);

        ProblemAnswer pa13c_3 = createProblemAnswer("What is a gradient vector?", "A gradient vector is a vector that contains all the partial derivatives of a multivariable function. It points in the direction of the steepest ascent of the function.");
        addTestToProblemAnswer(pa13c_3, test13c);
        addProblemAnswerToTest(test13c, pa13c_3);

        ProblemAnswer pa13c_4 = createProblemAnswer("What is a level curve?", "A level curve is a curve on a graph where the function has a constant value. It represents points in the domain of the function where the function's value is the same.");
        addTestToProblemAnswer(pa13c_4, test13c);
        addProblemAnswerToTest(test13c, pa13c_4);

        ProblemAnswer pa13c_5 = createProblemAnswer("What is a multiple integral?", "A multiple integral is an integral that involves more than one variable. It is used to calculate the volume under a surface or the accumulation of a quantity over a region.");
        addTestToProblemAnswer(pa13c_5, test13c);
        addProblemAnswerToTest(test13c, pa13c_5);

// Output for confirmation
        System.out.println("Test for 'Multivariable Functions' unit created with 10 problem answers.");
// Creating the test for Unit 4: Vector Calculus
        Test test13d = createTest("Vector Calculus Test", faculty3, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus13, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa13d_1 = createProblemAnswer("What is a vector field?", "A vector field is a function that assigns a vector to every point in a space. It represents the direction and magnitude of a vector quantity, such as velocity or force, at each point.");
        addTestToProblemAnswer(pa13d_1, test13d);
        addProblemAnswerToTest(test13d, pa13d_1);

        ProblemAnswer pa13d_2 = createProblemAnswer("What is a line integral?", "A line integral is an integral that evaluates the work done by a vector field along a curve. It is given by the integral of the dot product of the vector field and the differential element of the curve.");
        addTestToProblemAnswer(pa13d_2, test13d);
        addProblemAnswerToTest(test13d, pa13d_2);

        ProblemAnswer pa13d_3 = createProblemAnswer("What is Green's Theorem?", "Green's Theorem relates the line integral around a simple closed curve to the double integral over the region enclosed by the curve. It is given by ∮C F ⋅ dr = ∬R (∂N/∂x - ∂M/∂y) dA, where F = (M, N) is the vector field.");
        addTestToProblemAnswer(pa13d_3, test13d);
        addProblemAnswerToTest(test13d, pa13d_3);

        ProblemAnswer pa13d_4 = createProblemAnswer("What is a surface integral?", "A surface integral is an integral that evaluates the flux of a vector field through a surface. It is given by the integral of the dot product of the vector field and the differential element of the surface.");
        addTestToProblemAnswer(pa13d_4, test13d);
        addProblemAnswerToTest(test13d, pa13d_4);

        ProblemAnswer pa13d_5 = createProblemAnswer("What is Stokes' Theorem?", "Stokes' Theorem relates the surface integral of the curl of a vector field over a surface to the line integral of the vector field around the boundary of the surface. It is given by ∬S curl(F) ⋅ dS = ∮C F ⋅ dr.");
        addTestToProblemAnswer(pa13d_5, test13d);
        addProblemAnswerToTest(test13d, pa13d_5);

// Output for confirmation
        System.out.println("Test for 'Vector Calculus' unit created with 10 problem answers.");
// Creating the test for Unit 1: Logic
        Test test14a = createTest("Logic Test", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa14a_1 = createProblemAnswer("What is propositional logic?", "Propositional logic is a branch of logic that deals with propositions, which are statements that can be either true or false. It uses logical connectives such as AND, OR, and NOT to form complex logical expressions.");
        addTestToProblemAnswer(pa14a_1, test14a);
        addProblemAnswerToTest(test14a, pa14a_1);

        ProblemAnswer pa14a_2 = createProblemAnswer("What is predicate logic?", "Predicate logic, also known as first-order logic, is a branch of logic that extends propositional logic by dealing with predicates, which are functions that return true or false based on the values of their variables. It includes quantifiers such as 'forall' and 'exists'.");
        addTestToProblemAnswer(pa14a_2, test14a);
        addProblemAnswerToTest(test14a, pa14a_2);

        ProblemAnswer pa14a_3 = createProblemAnswer("What are logical connectives?", "Logical connectives are symbols or words used to connect propositions and form complex logical expressions. Common logical connectives include AND (∧), OR (∨), NOT (¬), IMPLIES (→), and IFF (↔).");
        addTestToProblemAnswer(pa14a_3, test14a);
        addProblemAnswerToTest(test14a, pa14a_3);

        ProblemAnswer pa14a_4 = createProblemAnswer("What is a truth table?", "A truth table is a tabular representation of all possible truth values of logical expressions. It lists all possible combinations of truth values for the variables involved and the resulting truth value of the expression for each combination.");
        addTestToProblemAnswer(pa14a_4, test14a);
        addProblemAnswerToTest(test14a, pa14a_4);

        ProblemAnswer pa14a_5 = createProblemAnswer("What is logical equivalence?", "Logical equivalence is a relationship between two logical expressions that have the same truth values in all possible scenarios. If two expressions are logically equivalent, they can be substituted for each other in logical arguments.");
        addTestToProblemAnswer(pa14a_5, test14a);
        addProblemAnswerToTest(test14a, pa14a_5);


// Output for confirmation
        System.out.println("Test for 'Logic' unit created with 10 problem answers.");
// Creating the test for Unit 2: Set Theory
        Test test14b = createTest("Set Theory Test", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa14b_1 = createProblemAnswer("What is a set?", "A set is a collection of distinct objects, considered as an object in its own right. Sets are usually denoted by capital letters and their elements are listed within curly brackets, e.g., A = {1, 2, 3}.");
        addTestToProblemAnswer(pa14b_1, test14b);
        addProblemAnswerToTest(test14b, pa14b_1);

        ProblemAnswer pa14b_2 = createProblemAnswer("What is a subset?", "A subset is a set whose elements are all contained in another set. If A and B are sets, A is a subset of B if every element of A is also an element of B, denoted as A ⊆ B.");
        addTestToProblemAnswer(pa14b_2, test14b);
        addProblemAnswerToTest(test14b, pa14b_2);

        ProblemAnswer pa14b_3 = createProblemAnswer("What is the union of sets?", "The union of sets is a set containing all elements from the given sets. For sets A and B, the union is denoted as A ∪ B and consists of all elements that are in A, in B, or in both.");
        addTestToProblemAnswer(pa14b_3, test14b);
        addProblemAnswerToTest(test14b, pa14b_3);

        ProblemAnswer pa14b_4 = createProblemAnswer("What is the intersection of sets?", "The intersection of sets is a set containing only the elements that are common to the given sets. For sets A and B, the intersection is denoted as A ∩ B and consists of all elements that are in both A and B.");
        addTestToProblemAnswer(pa14b_4, test14b);
        addProblemAnswerToTest(test14b, pa14b_4);

        ProblemAnswer pa14b_5 = createProblemAnswer("What is the difference of sets?", "The difference of sets is a set containing the elements that are in one set but not in another. For sets A and B, the difference is denoted as A - B and consists of all elements that are in A but not in B.");
        addTestToProblemAnswer(pa14b_5, test14b);
        addProblemAnswerToTest(test14b, pa14b_5);

// Output for confirmation
        System.out.println("Test for 'Set Theory' unit created with 10 problem answers.");
// Creating the test for Unit 3: Graph Theory
        Test test14c = createTest("Graph Theory Test", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa14c_1 = createProblemAnswer("What is a graph?", "A graph is a mathematical structure consisting of a set of vertices (nodes) and a set of edges (lines) that connect pairs of vertices. Graphs are used to model pairwise relations between objects.");
        addTestToProblemAnswer(pa14c_1, test14c);
        addProblemAnswerToTest(test14c, pa14c_1);

        ProblemAnswer pa14c_2 = createProblemAnswer("What is the difference between directed and undirected graphs?", "In a directed graph, edges have a direction, indicating a one-way relationship between vertices. In an undirected graph, edges have no direction, indicating a two-way relationship between vertices.");
        addTestToProblemAnswer(pa14c_2, test14c);
        addProblemAnswerToTest(test14c, pa14c_2);

        ProblemAnswer pa14c_3 = createProblemAnswer("What is a path in a graph?", "A path in a graph is a sequence of vertices connected by edges. A path can be simple (no repeated vertices) or general (vertices can be repeated). The length of a path is the number of edges it contains.");
        addTestToProblemAnswer(pa14c_3, test14c);
        addProblemAnswerToTest(test14c, pa14c_3);

        ProblemAnswer pa14c_4 = createProblemAnswer("What is a cycle in a graph?", "A cycle in a graph is a path that starts and ends at the same vertex, with no other repeated vertices. Cycles are used to study the connectivity and structure of graphs.");
        addTestToProblemAnswer(pa14c_4, test14c);
        addProblemAnswerToTest(test14c, pa14c_4);

        ProblemAnswer pa14c_5 = createProblemAnswer("What is a connected graph?", "A connected graph is a graph in which there is a path between every pair of vertices. In a connected graph, all vertices are reachable from any other vertex.");
        addTestToProblemAnswer(pa14c_5, test14c);
        addProblemAnswerToTest(test14c, pa14c_5);

// Output for confirmation
        System.out.println("Test for 'Graph Theory' unit created with 10 problem answers.");
// Creating the test for Unit 4: Combinatorics
        Test test14d = createTest("Combinatorics Test", faculty4, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus14, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa14d_1 = createProblemAnswer("What is combinatorics?", "Combinatorics is the branch of mathematics that deals with counting, arrangement, and combination of objects. It involves studying finite structures and solving problems related to discrete objects.");
        addTestToProblemAnswer(pa14d_1, test14d);
        addProblemAnswerToTest(test14d, pa14d_1);

        ProblemAnswer pa14d_2 = createProblemAnswer("What is a permutation?", "A permutation is an arrangement of objects in a specific order. The number of permutations of n distinct objects is given by n!, where ! denotes factorial.");
        addTestToProblemAnswer(pa14d_2, test14d);
        addProblemAnswerToTest(test14d, pa14d_2);

        ProblemAnswer pa14d_3 = createProblemAnswer("What is a combination?", "A combination is a selection of objects without regard to order. The number of combinations of n objects taken r at a time is given by the binomial coefficient C(n, r) = n! / (r!(n - r)!).");
        addTestToProblemAnswer(pa14d_3, test14d);
        addProblemAnswerToTest(test14d, pa14d_3);

        ProblemAnswer pa14d_4 = createProblemAnswer("What is the principle of inclusion-exclusion?", "The principle of inclusion-exclusion is a method for counting the number of elements in the union of overlapping sets. It involves adding the sizes of individual sets and subtracting the sizes of their pairwise intersections, and so on.");
        addTestToProblemAnswer(pa14d_4, test14d);
        addProblemAnswerToTest(test14d, pa14d_4);

        ProblemAnswer pa14d_5 = createProblemAnswer("What is a binomial coefficient?", "A binomial coefficient, denoted C(n, r) or (n choose r), represents the number of ways to choose r objects from a set of n objects without regard to order. It is given by the formula C(n, r) = n! / (r!(n - r)!).");
        addTestToProblemAnswer(pa14d_5, test14d);
        addProblemAnswerToTest(test14d, pa14d_5);

// Output for confirmation
        System.out.println("Test for 'Combinatorics' unit created with 10 problem answers.");
// Creating the test for Unit 1: Newton's Laws
        Test test15a = createTest("Newton's Laws Test", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa15a_1 = createProblemAnswer("What is Newton's First Law of Motion?", "Newton's First Law of Motion, also known as the Law of Inertia, states that an object will remain at rest or in uniform motion in a straight line unless acted upon by an external force.");
        addTestToProblemAnswer(pa15a_1, test15a);
        addProblemAnswerToTest(test15a, pa15a_1);

        ProblemAnswer pa15a_2 = createProblemAnswer("What is Newton's Second Law of Motion?", "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. It is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addTestToProblemAnswer(pa15a_2, test15a);
        addProblemAnswerToTest(test15a, pa15a_2);

        ProblemAnswer pa15a_3 = createProblemAnswer("What is Newton's Third Law of Motion?", "Newton's Third Law of Motion states that for every action, there is an equal and opposite reaction. This means that if one body exerts a force on another body, the second body exerts a force of equal magnitude but in the opposite direction on the first body.");
        addTestToProblemAnswer(pa15a_3, test15a);
        addProblemAnswerToTest(test15a, pa15a_3);

        ProblemAnswer pa15a_4 = createProblemAnswer("What is inertia?", "Inertia is the property of an object to resist changes in its state of motion. It is directly related to the mass of the object: the greater the mass, the greater the inertia.");
        addTestToProblemAnswer(pa15a_4, test15a);
        addProblemAnswerToTest(test15a, pa15a_4);

        ProblemAnswer pa15a_5 = createProblemAnswer("How does Newton's First Law apply to a car crash?", "In a car crash, the passengers inside the car continue moving at the car's speed due to inertia until an external force, such as a seatbelt or airbag, acts to decelerate them and bring them to a stop.");
        addTestToProblemAnswer(pa15a_5, test15a);
        addProblemAnswerToTest(test15a, pa15a_5);

// Output for confirmation
        System.out.println("Test for 'Newton's Laws' unit created with 10 problem answers.");
// Creating the test for Unit 2: Energy Principles
        Test test15b = createTest("Energy Principles Test", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa15b_1 = createProblemAnswer("What is kinetic energy?", "Kinetic energy is the energy possessed by an object due to its motion. It is calculated using the formula KE = 1/2 mv^2, where m is the mass and v is the velocity of the object.");
        addTestToProblemAnswer(pa15b_1, test15b);
        addProblemAnswerToTest(test15b, pa15b_1);

        ProblemAnswer pa15b_2 = createProblemAnswer("What is potential energy?", "Potential energy is the energy stored in an object due to its position or configuration. Examples include gravitational potential energy (U = mgh) and elastic potential energy (U = 1/2 kx^2).");
        addTestToProblemAnswer(pa15b_2, test15b);
        addProblemAnswerToTest(test15b, pa15b_2);

        ProblemAnswer pa15b_3 = createProblemAnswer("What is the work-energy theorem?", "The work-energy theorem states that the work done on an object is equal to the change in its kinetic energy. It is expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        addTestToProblemAnswer(pa15b_3, test15b);
        addProblemAnswerToTest(test15b, pa15b_3);

        ProblemAnswer pa15b_4 = createProblemAnswer("What is the principle of conservation of energy?", "The principle of conservation of energy states that energy cannot be created or destroyed, only transformed from one form to another. The total energy in an isolated system remains constant.");
        addTestToProblemAnswer(pa15b_4, test15b);
        addProblemAnswerToTest(test15b, pa15b_4);

        ProblemAnswer pa15b_5 = createProblemAnswer("What is power?", "Power is the rate at which work is done or energy is transferred. It is calculated using the formula P = W/t, where P is power, W is work, and t is time. The unit of power is the watt (W).");
        addTestToProblemAnswer(pa15b_5, test15b);
        addProblemAnswerToTest(test15b, pa15b_5);

// Output for confirmation
        System.out.println("Test for 'Energy Principles' unit created with 10 problem answers.");
// Creating the test for Unit 3: Motion
        Test test15c = createTest("Motion Test", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus15, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa15c_1 = createProblemAnswer("What is linear motion?", "Linear motion is the movement of an object along a straight line. It can be described by parameters such as displacement, velocity, and acceleration.");
        addTestToProblemAnswer(pa15c_1, test15c);
        addProblemAnswerToTest(test15c, pa15c_1);

        ProblemAnswer pa15c_2 = createProblemAnswer("What is projectile motion?", "Projectile motion is the curved path that an object follows when it is thrown or propelled near the surface of the Earth. It is influenced by gravity and can be analyzed using the equations of motion.");
        addTestToProblemAnswer(pa15c_2, test15c);
        addProblemAnswerToTest(test15c, pa15c_2);

        ProblemAnswer pa15c_3 = createProblemAnswer("What is circular motion?", "Circular motion is the movement of an object along a circular path. It can be characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        addTestToProblemAnswer(pa15c_3, test15c);
        addProblemAnswerToTest(test15c, pa15c_3);

        ProblemAnswer pa15c_4 = createProblemAnswer("What is velocity?", "Velocity is the rate of change of displacement with respect to time. It is a vector quantity with both magnitude and direction. The formula for velocity is v = Δx / Δt, where Δx is the displacement and Δt is the time interval.");
        addTestToProblemAnswer(pa15c_4, test15c);
        addProblemAnswerToTest(test15c, pa15c_4);

        ProblemAnswer pa15c_5 = createProblemAnswer("What is acceleration?", "Acceleration is the rate of change of velocity with respect to time. It is a vector quantity and can be positive (speeding up) or negative (slowing down). The formula for acceleration is a = Δv / Δt, where Δv is the change in velocity and Δt is the time interval.");
        addTestToProblemAnswer(pa15c_5, test15c);
        addProblemAnswerToTest(test15c, pa15c_5);

// Output for confirmation
        System.out.println("Test for 'Motion' unit created with 10 problem answers.");
// Creating the test for Unit 1: Atomic Structure
        Test test16a = createTest("Atomic Structure Test", faculty1, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa16a_1 = createProblemAnswer("What are the three main subatomic particles in an atom?", "The three main subatomic particles in an atom are protons, neutrons, and electrons. Protons and neutrons are located in the nucleus, while electrons orbit the nucleus.");
        addTestToProblemAnswer(pa16a_1, test16a);
        addProblemAnswerToTest(test16a, pa16a_1);

        ProblemAnswer pa16a_2 = createProblemAnswer("What is the atomic number of an element?", "The atomic number of an element is the number of protons in the nucleus of an atom. It determines the identity of the element and its position in the periodic table.");
        addTestToProblemAnswer(pa16a_2, test16a);
        addProblemAnswerToTest(test16a, pa16a_2);

        ProblemAnswer pa16a_3 = createProblemAnswer("What is the mass number of an atom?", "The mass number of an atom is the total number of protons and neutrons in its nucleus. It is represented as A and can be calculated as A = Z + N, where Z is the atomic number and N is the number of neutrons.");
        addTestToProblemAnswer(pa16a_3, test16a);
        addProblemAnswerToTest(test16a, pa16a_3);

        ProblemAnswer pa16a_4 = createProblemAnswer("What are isotopes?", "Isotopes are variants of a given chemical element that have the same number of protons but different numbers of neutrons. This results in different mass numbers for the isotopes.");
        addTestToProblemAnswer(pa16a_4, test16a);
        addProblemAnswerToTest(test16a, pa16a_4);

        ProblemAnswer pa16a_5 = createProblemAnswer("What is an electron configuration?", "An electron configuration is the distribution of electrons in an atom's orbitals. It follows the Aufbau principle, Hund's rule, and the Pauli exclusion principle to determine the most stable arrangement of electrons.");
        addTestToProblemAnswer(pa16a_5, test16a);
        addProblemAnswerToTest(test16a, pa16a_5);

// Output for confirmation
        System.out.println("Test for 'Atomic Structure' unit created with 10 problem answers.");
// Creating the test for Unit 2: Chemical Bonding
        Test test16b = createTest("Chemical Bonding Test", faculty1, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa16b_1 = createProblemAnswer("What is an ionic bond?", "An ionic bond is a type of chemical bond formed through the electrostatic attraction between oppositely charged ions. It typically occurs between a metal and a non-metal.");
        addTestToProblemAnswer(pa16b_1, test16b);
        addProblemAnswerToTest(test16b, pa16b_1);

        ProblemAnswer pa16b_2 = createProblemAnswer("What is a covalent bond?", "A covalent bond is a type of chemical bond where two atoms share one or more pairs of electrons. It usually occurs between non-metal atoms.");
        addTestToProblemAnswer(pa16b_2, test16b);
        addProblemAnswerToTest(test16b, pa16b_2);

        ProblemAnswer pa16b_3 = createProblemAnswer("What is a metallic bond?", "A metallic bond is a type of chemical bond found in metals, where electrons are shared and move freely among a lattice of metal atoms. This creates a 'sea of electrons' that contributes to the conductivity and malleability of metals.");
        addTestToProblemAnswer(pa16b_3, test16b);
        addProblemAnswerToTest(test16b, pa16b_3);

        ProblemAnswer pa16b_4 = createProblemAnswer("What is electronegativity?", "Electronegativity is a measure of an atom's ability to attract and hold onto electrons in a chemical bond. Elements with high electronegativity tend to attract electrons more strongly.");
        addTestToProblemAnswer(pa16b_4, test16b);
        addProblemAnswerToTest(test16b, pa16b_4);

        ProblemAnswer pa16b_5 = createProblemAnswer("What is a polar covalent bond?", "A polar covalent bond is a type of covalent bond in which the electrons are not shared equally between the atoms. This results in a partial positive charge on one atom and a partial negative charge on the other.");
        addTestToProblemAnswer(pa16b_5, test16b);
        addProblemAnswerToTest(test16b, pa16b_5);

// Output for confirmation
        System.out.println("Test for 'Chemical Bonding' unit created with 10 problem answers.");
// Creating the test for Unit 3: Reactions
        Test test16c = createTest("Reactions Test", faculty1, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus16, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa16c_1 = createProblemAnswer("What are chemical reactions?", "Chemical reactions are processes in which one or more substances (reactants) are converted into one or more different substances (products). They involve the breaking and forming of chemical bonds.");
        addTestToProblemAnswer(pa16c_1, test16c);
        addProblemAnswerToTest(test16c, pa16c_1);

        ProblemAnswer pa16c_2 = createProblemAnswer("What are the types of chemical reactions?", "The main types of chemical reactions include synthesis (combination), decomposition, single displacement (substitution), double displacement (metathesis), and combustion reactions.");
        addTestToProblemAnswer(pa16c_2, test16c);
        addProblemAnswerToTest(test16c, pa16c_2);

        ProblemAnswer pa16c_3 = createProblemAnswer("What is a synthesis reaction?", "A synthesis reaction is a type of chemical reaction in which two or more reactants combine to form a single product. It is represented by the general equation: A + B → AB.");
        addTestToProblemAnswer(pa16c_3, test16c);
        addProblemAnswerToTest(test16c, pa16c_3);

        ProblemAnswer pa16c_4 = createProblemAnswer("What is a decomposition reaction?", "A decomposition reaction is a type of chemical reaction in which a single compound breaks down into two or more simpler products. It is represented by the general equation: AB → A + B.");
        addTestToProblemAnswer(pa16c_4, test16c);
        addProblemAnswerToTest(test16c, pa16c_4);

        ProblemAnswer pa16c_5 = createProblemAnswer("What is a single displacement reaction?", "A single displacement reaction, also known as a substitution reaction, is a type of chemical reaction in which one element replaces another in a compound. It is represented by the general equation: A + BC → AC + B.");
        addTestToProblemAnswer(pa16c_5, test16c);
        addProblemAnswerToTest(test16c, pa16c_5);

        System.out.println("Test for 'Reactions' unit created with 10 problem answers.");
// Creating the test for Unit 1: Cell Structure
        Test test17a = createTest("Cell Structure Test", faculty2, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa17a_1 = createProblemAnswer("What are the main components of a cell?", "The main components of a cell include the cell membrane, nucleus, cytoplasm, and various organelles such as mitochondria, ribosomes, endoplasmic reticulum, Golgi apparatus, and lysosomes.");
        addTestToProblemAnswer(pa17a_1, test17a);
        addProblemAnswerToTest(test17a, pa17a_1);

        ProblemAnswer pa17a_2 = createProblemAnswer("What is the function of the cell membrane?", "The cell membrane, also known as the plasma membrane, controls the movement of substances in and out of the cell. It provides protection and support to the cell and helps maintain its shape.");
        addTestToProblemAnswer(pa17a_2, test17a);
        addProblemAnswerToTest(test17a, pa17a_2);

        ProblemAnswer pa17a_3 = createProblemAnswer("What is the role of the nucleus in a cell?", "The nucleus is the control center of the cell, containing the cell's genetic material (DNA). It regulates gene expression, cell growth, and reproduction, and directs various cellular activities.");
        addTestToProblemAnswer(pa17a_3, test17a);
        addProblemAnswerToTest(test17a, pa17a_3);

        ProblemAnswer pa17a_4 = createProblemAnswer("What are organelles?", "Organelles are specialized structures within a cell that perform specific functions. Examples include mitochondria (energy production), ribosomes (protein synthesis), and the endoplasmic reticulum (protein and lipid processing).");
        addTestToProblemAnswer(pa17a_4, test17a);
        addProblemAnswerToTest(test17a, pa17a_4);

        ProblemAnswer pa17a_5 = createProblemAnswer("What is the difference between prokaryotic and eukaryotic cells?", "Prokaryotic cells lack a true nucleus and membrane-bound organelles, while eukaryotic cells have a defined nucleus and various membrane-bound organelles. Prokaryotes include bacteria and archaea, whereas eukaryotes include plants, animals, fungi, and protists.");
        addTestToProblemAnswer(pa17a_5, test17a);
        addProblemAnswerToTest(test17a, pa17a_5);

// Output for confirmation
        System.out.println("Test for 'Cell Structure' unit created with 10 problem answers.");
// Creating the test for Unit 2: Genetics
        Test test17b = createTest("Genetics Test", faculty2, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa17b_1 = createProblemAnswer("What is genetics?", "Genetics is the study of heredity and the variation of inherited characteristics. It involves understanding how traits are passed from parents to offspring through genes.");
        addTestToProblemAnswer(pa17b_1, test17b);
        addProblemAnswerToTest(test17b, pa17b_1);

        ProblemAnswer pa17b_2 = createProblemAnswer("What are the principles of Mendelian genetics?", "The principles of Mendelian genetics, established by Gregor Mendel, include the Law of Segregation (each individual has two alleles for each gene, which separate during gamete formation) and the Law of Independent Assortment (genes for different traits can segregate independently during the formation of gametes).");
        addTestToProblemAnswer(pa17b_2, test17b);
        addProblemAnswerToTest(test17b, pa17b_2);

        ProblemAnswer pa17b_3 = createProblemAnswer("What is DNA?", "DNA (deoxyribonucleic acid) is the molecule that carries the genetic instructions for life. It consists of two strands forming a double helix, with each strand composed of nucleotides containing a sugar, phosphate group, and a nitrogenous base (adenine, thymine, cytosine, or guanine).");
        addTestToProblemAnswer(pa17b_3, test17b);
        addProblemAnswerToTest(test17b, pa17b_3);

        ProblemAnswer pa17b_4 = createProblemAnswer("What is the function of DNA?", "The function of DNA is to store and transmit genetic information. It provides the instructions for building and maintaining an organism and guides the production of proteins through the processes of transcription and translation.");
        addTestToProblemAnswer(pa17b_4, test17b);
        addProblemAnswerToTest(test17b, pa17b_4);

        ProblemAnswer pa17b_5 = createProblemAnswer("What is replication?", "Replication is the process by which DNA is copied before cell division. It ensures that each daughter cell receives an exact copy of the parent cell's DNA. The process involves unwinding the DNA double helix and using each strand as a template to synthesize a new complementary strand.");
        addTestToProblemAnswer(pa17b_5, test17b);
        addProblemAnswerToTest(test17b, pa17b_5);

// Output for confirmation
        System.out.println("Test for 'Genetics' unit created with 10 problem answers.");
// Creating the test for Unit 3: Evolution
        Test test17c = createTest("Evolution Test", faculty2, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa17c_1 = createProblemAnswer("What is the theory of evolution?", "The theory of evolution, developed by Charles Darwin, explains how species change over time through the process of natural selection. It states that organisms with traits better suited to their environment are more likely to survive and reproduce, passing those traits to their offspring.");
        addTestToProblemAnswer(pa17c_1, test17c);
        addProblemAnswerToTest(test17c, pa17c_1);

        ProblemAnswer pa17c_2 = createProblemAnswer("What is natural selection?", "Natural selection is the process by which individuals with advantageous traits are more likely to survive and reproduce, leading to the gradual accumulation of those traits in a population over generations.");
        addTestToProblemAnswer(pa17c_2, test17c);
        addProblemAnswerToTest(test17c, pa17c_2);

        ProblemAnswer pa17c_3 = createProblemAnswer("What is genetic variation?", "Genetic variation is the diversity of gene combinations within a population. It is essential for evolution as it provides the raw material for natural selection to act upon.");
        addTestToProblemAnswer(pa17c_3, test17c);
        addProblemAnswerToTest(test17c, pa17c_3);

        ProblemAnswer pa17c_4 = createProblemAnswer("What is a mutation?", "A mutation is a change in the DNA sequence of an organism. Mutations can introduce new genetic variations and are a source of genetic diversity in a population.");
        addTestToProblemAnswer(pa17c_4, test17c);
        addProblemAnswerToTest(test17c, pa17c_4);

        ProblemAnswer pa17c_5 = createProblemAnswer("What is an adaptation?", "An adaptation is a trait that increases an organism's chances of survival and reproduction in a particular environment. Adaptations result from the process of natural selection acting on genetic variation.");
        addTestToProblemAnswer(pa17c_5, test17c);
        addProblemAnswerToTest(test17c, pa17c_5);

// Output for confirmation
        System.out.println("Test for 'Evolution' unit created with 10 problem answers.");
// Creating the test for Unit 4: Ecology
        Test test17d = createTest("Ecology Test", faculty2, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus17, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa17d_1 = createProblemAnswer("What is ecology?", "Ecology is the study of interactions between organisms and their environment. It examines how living things interact with each other and with their physical surroundings.");
        addTestToProblemAnswer(pa17d_1, test17d);
        addProblemAnswerToTest(test17d, pa17d_1);

        ProblemAnswer pa17d_2 = createProblemAnswer("What are ecosystems?", "Ecosystems are communities of living organisms interacting with their physical environment. They include both biotic (living) components, such as plants and animals, and abiotic (non-living) components, such as water, soil, and climate.");
        addTestToProblemAnswer(pa17d_2, test17d);
        addProblemAnswerToTest(test17d, pa17d_2);

        ProblemAnswer pa17d_3 = createProblemAnswer("What is a food web?", "A food web is a complex network of interconnected food chains within an ecosystem. It illustrates the feeding relationships and energy flow between different organisms, showing how energy is transferred from producers to consumers and decomposers.");
        addTestToProblemAnswer(pa17d_3, test17d);
        addProblemAnswerToTest(test17d, pa17d_3);

        ProblemAnswer pa17d_4 = createProblemAnswer("What is energy flow in an ecosystem?", "Energy flow in an ecosystem refers to the transfer of energy from one trophic level to another. Energy enters the ecosystem through photosynthesis by producers, and it is passed on to consumers and decomposers through feeding relationships.");
        addTestToProblemAnswer(pa17d_4, test17d);
        addProblemAnswerToTest(test17d, pa17d_4);

        ProblemAnswer pa17d_5 = createProblemAnswer("What are the levels of organization in ecology?", "The levels of organization in ecology, from smallest to largest, are: organism, population, community, ecosystem, biome, and biosphere. Each level represents a different scale of interaction between living organisms and their environment.");
        addTestToProblemAnswer(pa17d_5, test17d);
        addProblemAnswerToTest(test17d, pa17d_5);

// Output for confirmation
        System.out.println("Test for 'Ecology' unit created with 10 problem answers.");
// Creating the test for Unit 1: Engineering Disciplines
        Test test18a = createTest("Engineering Disciplines Test", faculty3, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa18a_1 = createProblemAnswer("What is civil engineering?", "Civil engineering is a discipline that deals with the design, construction, and maintenance of infrastructure such as roads, bridges, buildings, and water supply systems. Civil engineers work on projects that improve the built environment and enhance public safety.");
        addTestToProblemAnswer(pa18a_1, test18a);
        addProblemAnswerToTest(test18a, pa18a_1);

        ProblemAnswer pa18a_2 = createProblemAnswer("What is mechanical engineering?", "Mechanical engineering is a discipline that involves the design, analysis, manufacturing, and maintenance of mechanical systems. Mechanical engineers work on projects ranging from small devices to large machinery, including engines, HVAC systems, and robotics.");
        addTestToProblemAnswer(pa18a_2, test18a);
        addProblemAnswerToTest(test18a, pa18a_2);

        ProblemAnswer pa18a_3 = createProblemAnswer("What is electrical engineering?", "Electrical engineering is a discipline focused on the study and application of electricity, electronics, and electromagnetism. Electrical engineers design and develop electrical systems, including power generation, transmission, and distribution, as well as electronic devices and communication systems.");
        addTestToProblemAnswer(pa18a_3, test18a);
        addProblemAnswerToTest(test18a, pa18a_3);

        ProblemAnswer pa18a_4 = createProblemAnswer("What is chemical engineering?", "Chemical engineering is a discipline that combines principles of chemistry, physics, mathematics, and engineering to design and operate processes that convert raw materials into valuable products. Chemical engineers work in industries such as pharmaceuticals, petrochemicals, and food processing.");
        addTestToProblemAnswer(pa18a_4, test18a);
        addProblemAnswerToTest(test18a, pa18a_4);

        ProblemAnswer pa18a_5 = createProblemAnswer("What are the roles of civil engineers?", "Civil engineers are responsible for planning, designing, constructing, and maintaining infrastructure projects. They ensure the safety, functionality, and sustainability of structures such as roads, bridges, buildings, and water supply systems.");
        addTestToProblemAnswer(pa18a_5, test18a);
        addProblemAnswerToTest(test18a, pa18a_5);

// Output for confirmation
        System.out.println("Test for 'Engineering Disciplines' unit created with 10 problem answers.");
// Creating the test for Unit 2: Problem-Solving
        Test test18b = createTest("Problem-Solving Test", faculty3, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa18b_1 = createProblemAnswer("What is the engineering problem-solving process?", "The engineering problem-solving process is a systematic approach to addressing engineering challenges. It involves defining the problem, conducting research, generating potential solutions, selecting the best solution, implementing the solution, and evaluating the results.");
        addTestToProblemAnswer(pa18b_1, test18b);
        addProblemAnswerToTest(test18b, pa18b_1);

        ProblemAnswer pa18b_2 = createProblemAnswer("How do you define a problem in engineering?", "Defining a problem in engineering involves identifying the specific issue or need, understanding the constraints and requirements, and clearly stating the problem in a way that guides the development of solutions.");
        addTestToProblemAnswer(pa18b_2, test18b);
        addProblemAnswerToTest(test18b, pa18b_2);

        ProblemAnswer pa18b_3 = createProblemAnswer("What is brainstorming in the context of engineering problem-solving?", "Brainstorming is a creative process used to generate a wide range of potential solutions to an engineering problem. It encourages free thinking and the sharing of ideas without immediate evaluation or criticism.");
        addTestToProblemAnswer(pa18b_3, test18b);
        addProblemAnswerToTest(test18b, pa18b_3);

        ProblemAnswer pa18b_4 = createProblemAnswer("How do engineers select the best solution to a problem?", "Engineers select the best solution by evaluating the potential solutions based on criteria such as feasibility, cost, effectiveness, safety, and sustainability. They use decision-making tools and techniques to compare and rank the solutions.");
        addTestToProblemAnswer(pa18b_4, test18b);
        addProblemAnswerToTest(test18b, pa18b_4);

        ProblemAnswer pa18b_5 = createProblemAnswer("What is implementation in the engineering problem-solving process?", "Implementation involves putting the chosen solution into practice. This includes designing, developing, testing, and deploying the solution, as well as managing the resources and timelines required for successful implementation.");
        addTestToProblemAnswer(pa18b_5, test18b);
        addProblemAnswerToTest(test18b, pa18b_5);

// Output for confirmation
        System.out.println("Test for 'Problem-Solving' unit created with 10 problem answers.");
// Creating the test for Unit 3: Design Process
        Test test18c = createTest("Design Process Test", faculty3, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus18, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa18c_1 = createProblemAnswer("What is the engineering design process?", "The engineering design process is a systematic approach to solving engineering problems. It involves defining requirements, brainstorming, prototyping, testing, and iteration to develop and refine solutions.");
        addTestToProblemAnswer(pa18c_1, test18c);
        addProblemAnswerToTest(test18c, pa18c_1);

        ProblemAnswer pa18c_2 = createProblemAnswer("What are the stages of the design process?", "The stages of the design process typically include defining the problem, researching and gathering information, generating ideas, developing and testing prototypes, evaluating and refining the solution, and finalizing and implementing the design.");
        addTestToProblemAnswer(pa18c_2, test18c);
        addProblemAnswerToTest(test18c, pa18c_2);

        ProblemAnswer pa18c_3 = createProblemAnswer("How do engineers define requirements in the design process?", "Engineers define requirements by identifying the specific needs and constraints of the project. This includes understanding the problem, setting clear objectives, and determining the criteria for a successful solution.");
        addTestToProblemAnswer(pa18c_3, test18c);
        addProblemAnswerToTest(test18c, pa18c_3);

        ProblemAnswer pa18c_4 = createProblemAnswer("What is the importance of brainstorming in the design process?", "Brainstorming is important because it encourages the generation of a wide range of ideas and solutions. It fosters creativity and collaboration, allowing engineers to explore different approaches and identify the best possible solution.");
        addTestToProblemAnswer(pa18c_4, test18c);
        addProblemAnswerToTest(test18c, pa18c_4);

        ProblemAnswer pa18c_5 = createProblemAnswer("What is prototyping in the design process?", "Prototyping involves creating a preliminary model or version of a solution to test its feasibility and functionality. Prototypes allow engineers to identify potential issues, gather feedback, and make improvements before finalizing the design.");
        addTestToProblemAnswer(pa18c_5, test18c);
        addProblemAnswerToTest(test18c, pa18c_5);

// Output for confirmation
        System.out.println("Test for 'Design Process' unit created with 10 problem answers.");
// Creating the test for Unit 1: Circuit Analysis
        Test test19a = createTest("Circuit Analysis Test", faculty4, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa19a_1 = createProblemAnswer("What is Ohm's law?", "Ohm's law states that the current flowing through a conductor between two points is directly proportional to the voltage across the two points. It is mathematically expressed as V = IR, where V is voltage, I is current, and R is resistance.");
        addTestToProblemAnswer(pa19a_1, test19a);
        addProblemAnswerToTest(test19a, pa19a_1);

        ProblemAnswer pa19a_2 = createProblemAnswer("What are Kirchhoff's laws?", "Kirchhoff's laws include Kirchhoff's Current Law (KCL) and Kirchhoff's Voltage Law (KVL). KCL states that the total current entering a junction equals the total current leaving the junction. KVL states that the sum of all voltages around a closed loop equals zero.");
        addTestToProblemAnswer(pa19a_2, test19a);
        addProblemAnswerToTest(test19a, pa19a_2);

        ProblemAnswer pa19a_3 = createProblemAnswer("How do you calculate voltage in a circuit?", "Voltage in a circuit can be calculated using Ohm's law (V = IR) and Kirchhoff's Voltage Law (KVL). For a series circuit, the total voltage is the sum of the voltages across each component. For a parallel circuit, the voltage is the same across each branch.");
        addTestToProblemAnswer(pa19a_3, test19a);
        addProblemAnswerToTest(test19a, pa19a_3);

        ProblemAnswer pa19a_4 = createProblemAnswer("How do you calculate current in a circuit?", "Current in a circuit can be calculated using Ohm's law (I = V/R) and Kirchhoff's Current Law (KCL). For a series circuit, the current is the same through each component. For a parallel circuit, the total current is the sum of the currents in each branch.");
        addTestToProblemAnswer(pa19a_4, test19a);
        addProblemAnswerToTest(test19a, pa19a_4);

        ProblemAnswer pa19a_5 = createProblemAnswer("What are the techniques for analyzing DC circuits?", "Techniques for analyzing DC circuits include using Ohm's law, Kirchhoff's laws, voltage division, current division, mesh analysis, and nodal analysis. These techniques help determine the voltage, current, and resistance in various parts of the circuit.");
        addTestToProblemAnswer(pa19a_5, test19a);
        addProblemAnswerToTest(test19a, pa19a_5);

// Output for confirmation
        System.out.println("Test for 'Circuit Analysis' unit created with 10 problem answers.");
// Creating the test for Unit 2: Signal Processing
        Test test19b = createTest("Signal Processing Test", faculty4, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa19b_1 = createProblemAnswer("What is signal processing?", "Signal processing is the analysis, manipulation, and interpretation of signals. It involves techniques for filtering, transforming, and extracting information from signals in various forms, such as audio, video, and data.");
        addTestToProblemAnswer(pa19b_1, test19b);
        addProblemAnswerToTest(test19b, pa19b_1);

        ProblemAnswer pa19b_2 = createProblemAnswer("What is a Fourier transform?", "A Fourier transform is a mathematical technique used to transform a signal from the time domain to the frequency domain. It decomposes a signal into its constituent frequencies, allowing analysis of the signal's frequency content.");
        addTestToProblemAnswer(pa19b_2, test19b);
        addProblemAnswerToTest(test19b, pa19b_2);

        ProblemAnswer pa19b_3 = createProblemAnswer("What is filtering in signal processing?", "Filtering is the process of removing unwanted components or noise from a signal. Filters can be designed to pass certain frequencies while attenuating others, such as low-pass, high-pass, band-pass, and band-stop filters.");
        addTestToProblemAnswer(pa19b_3, test19b);
        addProblemAnswerToTest(test19b, pa19b_3);

        ProblemAnswer pa19b_4 = createProblemAnswer("What is digital signal processing (DSP)?", "Digital signal processing (DSP) involves the manipulation of signals using digital techniques. DSP algorithms are implemented on digital hardware, allowing for efficient processing, analysis, and transformation of signals in digital form.");
        addTestToProblemAnswer(pa19b_4, test19b);
        addProblemAnswerToTest(test19b, pa19b_4);

        ProblemAnswer pa19b_5 = createProblemAnswer("What are the applications of signal processing?", "Applications of signal processing include telecommunications (signal transmission and reception), audio and video processing (enhancement and compression), medical imaging (MRI and CT scans), and radar and sonar systems (target detection and tracking).");
        addTestToProblemAnswer(pa19b_5, test19b);
        addProblemAnswerToTest(test19b, pa19b_5);

// Output for confirmation
        System.out.println("Test for 'Signal Processing' unit created with 10 problem answers.");
// Creating the test for Unit 3: Systems Theory
        Test test19c = createTest("Systems Theory Test", faculty4, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus19, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa19c_1 = createProblemAnswer("What is systems theory?", "Systems theory is the study of systems, which are sets of interacting components working together as a whole. It focuses on understanding the behavior, structure, and dynamics of complex systems.");
        addTestToProblemAnswer(pa19c_1, test19c);
        addProblemAnswerToTest(test19c, pa19c_1);

        ProblemAnswer pa19c_2 = createProblemAnswer("What is system modeling?", "System modeling involves creating abstract representations of systems to analyze their behavior and predict their performance. Models can be mathematical, graphical, or computational and help in understanding and designing systems.");
        addTestToProblemAnswer(pa19c_2, test19c);
        addProblemAnswerToTest(test19c, pa19c_2);

        ProblemAnswer pa19c_3 = createProblemAnswer("What is feedback in systems theory?", "Feedback is a process in which the output of a system is fed back into the system as input, influencing its future behavior. Positive feedback amplifies changes, while negative feedback stabilizes the system.");
        addTestToProblemAnswer(pa19c_3, test19c);
        addProblemAnswerToTest(test19c, pa19c_3);

        ProblemAnswer pa19c_4 = createProblemAnswer("What are control systems?", "Control systems are systems designed to regulate the behavior of other systems. They use feedback and control mechanisms to maintain desired outputs despite disturbances. Examples include thermostats and automatic pilot systems.");
        addTestToProblemAnswer(pa19c_4, test19c);
        addProblemAnswerToTest(test19c, pa19c_4);

        ProblemAnswer pa19c_5 = createProblemAnswer("What is the role of transfer functions in systems theory?", "Transfer functions are mathematical representations of the relationship between the input and output of a linear time-invariant system. They are used to analyze and design control systems by providing insights into system dynamics.");
        addTestToProblemAnswer(pa19c_5, test19c);
        addProblemAnswerToTest(test19c, pa19c_5);

// Output for confirmation
        System.out.println("Test for 'Systems Theory' unit created with 10 problem answers.");
// Creating the test for Unit 1: Statics
        Test test20a = createTest("Statics Test", faculty5, Date.from(LocalDate.of(2030, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa20a_1 = createProblemAnswer("What is statics?", "Statics is the branch of mechanics that deals with bodies at rest and forces in equilibrium. It involves analyzing force systems, calculating moments, and solving problems related to static equilibrium.");
        addTestToProblemAnswer(pa20a_1, test20a);
        addProblemAnswerToTest(test20a, pa20a_1);

        ProblemAnswer pa20a_2 = createProblemAnswer("What is a force system?", "A force system is a collection of forces acting on a body. It includes the magnitudes, directions, and points of application of the forces. Analyzing force systems is essential for understanding how forces affect a body's equilibrium.");
        addTestToProblemAnswer(pa20a_2, test20a);
        addProblemAnswerToTest(test20a, pa20a_2);

        ProblemAnswer pa20a_3 = createProblemAnswer("What is a moment?", "A moment is a measure of the tendency of a force to rotate a body about a point or axis. It is calculated as the product of the force and the perpendicular distance from the point or axis to the line of action of the force, expressed as M = Fd.");
        addTestToProblemAnswer(pa20a_3, test20a);
        addProblemAnswerToTest(test20a, pa20a_3);

        ProblemAnswer pa20a_4 = createProblemAnswer("What is static equilibrium?", "Static equilibrium occurs when a body is at rest and the sum of all forces and moments acting on it is zero. In this state, the body does not experience any linear or rotational motion.");
        addTestToProblemAnswer(pa20a_4, test20a);
        addProblemAnswerToTest(test20a, pa20a_4);

        ProblemAnswer pa20a_5 = createProblemAnswer("How do you calculate the resultant force in a force system?", "The resultant force is the single force that has the same effect as the combined forces acting on a body. It is calculated by vector addition of all the individual forces in the system.");
        addTestToProblemAnswer(pa20a_5, test20a);
        addProblemAnswerToTest(test20a, pa20a_5);

// Output for confirmation
        System.out.println("Test for 'Statics' unit created with 10 problem answers.");
// Creating the test for Unit 2: Dynamics
        Test test20b = createTest("Dynamics Test", faculty5, Date.from(LocalDate.of(2030, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa20b_1 = createProblemAnswer("What is dynamics?", "Dynamics is the study of bodies in motion. It involves analyzing the forces and torques that cause motion and understanding the principles of kinematics and kinetics.");
        addTestToProblemAnswer(pa20b_1, test20b);
        addProblemAnswerToTest(test20b, pa20b_1);

        ProblemAnswer pa20b_2 = createProblemAnswer("What is kinematics?", "Kinematics is the branch of dynamics that deals with the description of motion without considering the forces that cause it. It involves analyzing the position, velocity, and acceleration of objects.");
        addTestToProblemAnswer(pa20b_2, test20b);
        addProblemAnswerToTest(test20b, pa20b_2);

        ProblemAnswer pa20b_3 = createProblemAnswer("What is kinetics?", "Kinetics is the branch of dynamics that deals with the forces and torques that cause motion. It involves analyzing the relationship between the motion of objects and the forces acting on them.");
        addTestToProblemAnswer(pa20b_3, test20b);
        addProblemAnswerToTest(test20b, pa20b_3);

        ProblemAnswer pa20b_4_new = createProblemAnswer("What is Newton's Second Law of Motion?", "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. This law is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addTestToProblemAnswer(pa20b_4_new, test20b);
        addProblemAnswerToTest(test20b, pa20b_4_new);

        ProblemAnswer pa20b_5 = createProblemAnswer("What is the difference between velocity and acceleration?", "Velocity is the rate of change of displacement with respect to time, and it is a vector quantity with both magnitude and direction. Acceleration is the rate of change of velocity with respect to time, and it is also a vector quantity.");
        addTestToProblemAnswer(pa20b_5, test20b);
        addProblemAnswerToTest(test20b, pa20b_5);

// Output for confirmation
        System.out.println("Test for 'Dynamics' unit created with 10 problem answers.");
// Creating the test for Unit 3: Thermodynamics
        Test test20c = createTest("Thermodynamics Test", faculty5, Date.from(LocalDate.of(2030, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa20c_1 = createProblemAnswer("What is thermodynamics?", "Thermodynamics is the branch of physics that deals with the study of heat, energy, and the transformation of energy from one form to another. It involves understanding the principles governing the behavior of gases and liquids, as well as the laws of thermodynamics.");
        addTestToProblemAnswer(pa20c_1, test20c);
        addProblemAnswerToTest(test20c, pa20c_1);

        ProblemAnswer pa20c_2 = createProblemAnswer("What is the first law of thermodynamics?", "The first law of thermodynamics, also known as the law of energy conservation, states that energy cannot be created or destroyed, only transformed from one form to another. It is expressed as ΔU = Q - W, where ΔU is the change in internal energy, Q is the heat added to the system, and W is the work done by the system.");
        addTestToProblemAnswer(pa20c_2, test20c);
        addProblemAnswerToTest(test20c, pa20c_2);

        ProblemAnswer pa20c_3 = createProblemAnswer("What is the second law of thermodynamics?", "The second law of thermodynamics states that the entropy of an isolated system always increases over time. It also implies that heat naturally flows from a region of higher temperature to a region of lower temperature and that it is impossible to convert heat completely into work without some loss of energy.");
        addTestToProblemAnswer(pa20c_3, test20c);
        addProblemAnswerToTest(test20c, pa20c_3);

        ProblemAnswer pa20c_4 = createProblemAnswer("What is entropy?", "Entropy is a measure of the disorder or randomness in a system. It quantifies the number of possible microstates of a system and is a key concept in the second law of thermodynamics. Higher entropy indicates greater disorder and lower energy availability for work.");
        addTestToProblemAnswer(pa20c_4, test20c);
        addProblemAnswerToTest(test20c, pa20c_4);

        ProblemAnswer pa20c_5 = createProblemAnswer("What is the third law of thermodynamics?", "The third law of thermodynamics states that as the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value. This implies that it is impossible to reach absolute zero through any finite number of processes.");
        addTestToProblemAnswer(pa20c_5, test20c);
        addProblemAnswerToTest(test20c, pa20c_5);

// Output for confirmation
        System.out.println("Test for 'Thermodynamics' unit created with 10 problem answers.");
// Creating the test for Unit 4: Material Science
        Test test20d = createTest("Material Science Test", faculty5, Date.from(LocalDate.of(2030, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus20, false);

// Creating and adding problem answers to the test
        ProblemAnswer pa20d_1 = createProblemAnswer("What is material science?", "Material science is the study of the properties and behavior of materials. It involves understanding the structure, composition, and performance of different materials and how they can be used in various engineering applications.");
        addTestToProblemAnswer(pa20d_1, test20d);
        addProblemAnswerToTest(test20d, pa20d_1);

        ProblemAnswer pa20d_2 = createProblemAnswer("What are the main types of materials studied in material science?", "The main types of materials studied in material science include metals, ceramics, polymers, and composites. Each type has distinct properties and applications, making them suitable for different engineering purposes.");
        addTestToProblemAnswer(pa20d_2, test20d);
        addProblemAnswerToTest(test20d, pa20d_2);

        ProblemAnswer pa20d_3 = createProblemAnswer("What are the properties of metals?", "Metals have properties such as high electrical and thermal conductivity, ductility, malleability, and strength. They are widely used in engineering applications such as construction, transportation, and electronics.");
        addTestToProblemAnswer(pa20d_3, test20d);
        addProblemAnswerToTest(test20d, pa20d_3);

        ProblemAnswer pa20d_4 = createProblemAnswer("What are ceramics?", "Ceramics are non-metallic, inorganic materials that are typically hard, brittle, and resistant to heat and chemical attack. They are used in applications such as pottery, building materials, and high-temperature environments.");
        addTestToProblemAnswer(pa20d_4, test20d);
        addProblemAnswerToTest(test20d, pa20d_4);

        ProblemAnswer pa20d_5 = createProblemAnswer("What are polymers?", "Polymers are large molecules composed of repeating structural units. They can be natural or synthetic and have properties such as flexibility, elasticity, and low density. Polymers are used in a wide range of applications, including plastics, textiles, and medical devices.");
        addTestToProblemAnswer(pa20d_5, test20d);
        addProblemAnswerToTest(test20d, pa20d_5);

// Output for confirmation
        System.out.println("Test for 'Material Science' unit created with 10 problem answers.");
        StudentAnswer sa1a_1_student1 = createStudentAnswer(student1, pa1a_1, "A variable in programming is a storage location identified by a name that holds data which can be changed during the program's execution.");
        addStudentAnswerToProblemAnswer(pa1a_1, sa1a_1_student1);

        StudentAnswer sa1a_2_student1 = createStudentAnswer(student1, pa1a_2, "To declare a variable in Python, you simply write the variable name followed by an equal sign and the value you want to assign. For example: `x = 5`.");
        addStudentAnswerToProblemAnswer(pa1a_2, sa1a_2_student1);

        StudentAnswer sa1a_3_student1 = createStudentAnswer(student1, pa1a_3, "Variables are essential in programming because they allow developers to store, retrieve, and manipulate data, making the code more dynamic and flexible.");
        addStudentAnswerToProblemAnswer(pa1a_3, sa1a_3_student1);

        StudentAnswer sa1a_4_student1 = createStudentAnswer(student1, pa1a_4, "You can change the value of a variable by reassigning it with a new value. For example: `x = 5` can be changed to `x = 10`.");
        addStudentAnswerToProblemAnswer(pa1a_4, sa1a_4_student1);

        StudentAnswer sa1a_5_student1 = createStudentAnswer(student1, pa1a_5, "Variable names in Python must start with a letter (a-z, A-Z) or an underscore (_), followed by letters, digits (0-9), or underscores. They cannot start with a digit and are case-sensitive.");
        addStudentAnswerToProblemAnswer(pa1a_5, sa1a_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa1a_1_student2 = createStudentAnswer(student2, pa1a_1, "A variable in programming is a storage location identified by a name that holds data which can be changed during the program's execution.");
        addStudentAnswerToProblemAnswer(pa1a_1, sa1a_1_student2);

        StudentAnswer sa1a_2_student2 = createStudentAnswer(student2, pa1a_2, "To declare a variable in Python, you simply write the variable name followed by an equal sign and the value you want to assign. For example: `x = 5`.");
        addStudentAnswerToProblemAnswer(pa1a_2, sa1a_2_student2);

        StudentAnswer sa1a_3_student2 = createStudentAnswer(student2, pa1a_3, "Variables are essential in programming because they allow developers to store, retrieve, and manipulate data, making the code more dynamic and flexible.");
        addStudentAnswerToProblemAnswer(pa1a_3, sa1a_3_student2);

        StudentAnswer sa1a_4_student2 = createStudentAnswer(student2, pa1a_4, "You can change the value of a variable by reassigning it with a new value. For example: `x = 5` can be changed to `x = 10`.");
        addStudentAnswerToProblemAnswer(pa1a_4, sa1a_4_student2);

        StudentAnswer sa1a_5_student2 = createStudentAnswer(student2, pa1a_5, "Variable names in Python must start with a letter (a-z, A-Z) or an underscore (_), followed by letters, digits (0-9), or underscores. They cannot start with a digit and are case-sensitive.");
        addStudentAnswerToProblemAnswer(pa1a_5, sa1a_5_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa1b_1_student1 = createStudentAnswer(student1, pa1b_1, "An integer is a whole number without a fractional component.");
        addStudentAnswerToProblemAnswer(pa1b_1, sa1b_1_student1);

        StudentAnswer sa1b_2_student1 = createStudentAnswer(student1, pa1b_2, "A float is a number that has a decimal point or is written in exponential form.");
        addStudentAnswerToProblemAnswer(pa1b_2, sa1b_2_student1);

        StudentAnswer sa1b_3_student1 = createStudentAnswer(student1, pa1b_3, "A string is a sequence of characters enclosed in quotes, used to represent text.");
        addStudentAnswerToProblemAnswer(pa1b_3, sa1b_3_student1);

        StudentAnswer sa1b_4_student1 = createStudentAnswer(student1, pa1b_4, "A boolean is a data type with two possible values: True or False, used for logical operations.");
        addStudentAnswerToProblemAnswer(pa1b_4, sa1b_4_student1);

        StudentAnswer sa1b_5_student1 = createStudentAnswer(student1, pa1b_5, "You can convert an integer to a float using the `float()` function. For example: `float(5)` results in `5.0`.");
        addStudentAnswerToProblemAnswer(pa1b_5, sa1b_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa1b_1_student2 = createStudentAnswer(student2, pa1b_1, "An integer is a whole number without a fractional component.");
        addStudentAnswerToProblemAnswer(pa1b_1, sa1b_1_student2);

        StudentAnswer sa1b_2_student2 = createStudentAnswer(student2, pa1b_2, "A float is a number that has a decimal point or is written in exponential form.");
        addStudentAnswerToProblemAnswer(pa1b_2, sa1b_2_student2);

        StudentAnswer sa1b_3_student2 = createStudentAnswer(student2, pa1b_3, "A string is a sequence of characters enclosed in quotes, used to represent text.");
        addStudentAnswerToProblemAnswer(pa1b_3, sa1b_3_student2);

        StudentAnswer sa1b_4_student2 = createStudentAnswer(student2, pa1b_4, "A boolean is a data type with two possible values: True or False, used for logical operations.");
        addStudentAnswerToProblemAnswer(pa1b_4, sa1b_4_student2);

        StudentAnswer sa1b_5_student2 = createStudentAnswer(student2, pa1b_5, "You can convert an integer to a float using the `float()` function. For example: `float(5)` results in `5.0`.");
        addStudentAnswerToProblemAnswer(pa1b_5, sa1b_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa1c_1_student1 = createStudentAnswer(student1, pa1c_1, "A for loop is a control structure that allows you to repeat a block of code a fixed number of times.");
        addStudentAnswerToProblemAnswer(pa1c_1, sa1c_1_student1);

        StudentAnswer sa1c_2_student1 = createStudentAnswer(student1, pa1c_2, "A while loop is a control structure that repeats a block of code as long as a specified condition is true.");
        addStudentAnswerToProblemAnswer(pa1c_2, sa1c_2_student1);

        StudentAnswer sa1c_3_student1 = createStudentAnswer(student1, pa1c_3, "An if statement is a control structure that executes a block of code only if a specified condition is true.");
        addStudentAnswerToProblemAnswer(pa1c_3, sa1c_3_student1);

        StudentAnswer sa1c_4_student1 = createStudentAnswer(student1, pa1c_4, "An elif statement is a control structure used in conjunction with an if statement to check additional conditions if the previous conditions are false.");
        addStudentAnswerToProblemAnswer(pa1c_4, sa1c_4_student1);

        StudentAnswer sa1c_5_student1 = createStudentAnswer(student1, pa1c_5, "An else statement is a control structure that executes a block of code if none of the previous conditions are true.");
        addStudentAnswerToProblemAnswer(pa1c_5, sa1c_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa1c_1_student2 = createStudentAnswer(student2, pa1c_1, "A for loop is a control structure that allows you to repeat a block of code a fixed number of times.");
        addStudentAnswerToProblemAnswer(pa1c_1, sa1c_1_student2);

        StudentAnswer sa1c_2_student2 = createStudentAnswer(student2, pa1c_2, "A while loop is a control structure that repeats a block of code as long as a specified condition is true.");
        addStudentAnswerToProblemAnswer(pa1c_2, sa1c_2_student2);

        StudentAnswer sa1c_3_student2 = createStudentAnswer(student2, pa1c_3, "An if statement is a control structure that executes a block of code only if a specified condition is true.");
        addStudentAnswerToProblemAnswer(pa1c_3, sa1c_3_student2);

        StudentAnswer sa1c_4_student2 = createStudentAnswer(student2, pa1c_4, "An elif statement is a control structure used in conjunction with an if statement to check additional conditions if the previous conditions are false.");
        addStudentAnswerToProblemAnswer(pa1c_4, sa1c_4_student2);

        StudentAnswer sa1c_5_student2 = createStudentAnswer(student2, pa1c_5, "An else statement is a control structure that executes a block of code if none of the previous conditions are true.");
        addStudentAnswerToProblemAnswer(pa1c_5, sa1c_5_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa1d_1_student1 = createStudentAnswer(student1, pa1d_1, "A function is a block of reusable code that performs a specific task.");
        addStudentAnswerToProblemAnswer(pa1d_1, sa1d_1_student1);

        StudentAnswer sa1d_2_student1 = createStudentAnswer(student1, pa1d_2, "You define a function in Python using the `def` keyword followed by the function name and parentheses. For example: `def my_function():`.");
        addStudentAnswerToProblemAnswer(pa1d_2, sa1d_2_student1);

        StudentAnswer sa1d_3_student1 = createStudentAnswer(student1, pa1d_3, "A parameter is a variable in a function definition that accepts values passed to the function when it is called.");
        addStudentAnswerToProblemAnswer(pa1d_3, sa1d_3_student1);

        StudentAnswer sa1d_4_student1 = createStudentAnswer(student1, pa1d_4, "An argument is a value that is passed to a function when it is called.");
        addStudentAnswerToProblemAnswer(pa1d_4, sa1d_4_student1);

        StudentAnswer sa1d_5_student1 = createStudentAnswer(student1, pa1d_5, "You return a value from a function using the `return` statement. For example: `return result`.");
        addStudentAnswerToProblemAnswer(pa1d_5, sa1d_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa1d_1_student2 = createStudentAnswer(student2, pa1d_1, "A function is a block of reusable code that performs a specific task.");
        addStudentAnswerToProblemAnswer(pa1d_1, sa1d_1_student2);

        StudentAnswer sa1d_2_student2 = createStudentAnswer(student2, pa1d_2, "You define a function in Python using the `def` keyword followed by the function name and parentheses. For example: `def my_function():`.");
        addStudentAnswerToProblemAnswer(pa1d_2, sa1d_2_student2);

        StudentAnswer sa1d_3_student2 = createStudentAnswer(student2, pa1d_3, "A parameter is a variable in a function definition that accepts values passed to the function when it is called.");
        addStudentAnswerToProblemAnswer(pa1d_3, sa1d_3_student2);

        StudentAnswer sa1d_4_student2 = createStudentAnswer(student2, pa1d_4, "An argument is a value that is passed to a function when it is called.");
        addStudentAnswerToProblemAnswer(pa1d_4, sa1d_4_student2);

        StudentAnswer sa1d_5_student2 = createStudentAnswer(student2, pa1d_5, "You return a value from a function using the `return` statement. For example: `return result`.");
        addStudentAnswerToProblemAnswer(pa1d_5, sa1d_5_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa1e_1_student1 = createStudentAnswer(student1, pa1e_1, "A module is a file containing Python definitions and statements. It helps in organizing and reusing code.");
        addStudentAnswerToProblemAnswer(pa1e_1, sa1e_1_student1);

        StudentAnswer sa1e_2_student1 = createStudentAnswer(student1, pa1e_2, "To create a module, simply write Python code in a file with a .py extension. For example, my_module.py.");
        addStudentAnswerToProblemAnswer(pa1e_2, sa1e_2_student1);

        StudentAnswer sa1e_3_student1 = createStudentAnswer(student1, pa1e_3, "You can import a module using the `import` statement. For example: `import my_module`.");
        addStudentAnswerToProblemAnswer(pa1e_3, sa1e_3_student1);

        StudentAnswer sa1e_4_student1 = createStudentAnswer(student1, pa1e_4, "The `__name__` variable in a module is set to `__main__` when the module is run as the main program. It helps in determining if the module is being run on its own or being imported.");
        addStudentAnswerToProblemAnswer(pa1e_4, sa1e_4_student1);

        StudentAnswer sa1e_5_student1 = createStudentAnswer(student1, pa1e_5, "You can access functions and variables from an imported module using the dot notation. For example: `module_name.function_name()`.");
        addStudentAnswerToProblemAnswer(pa1e_5, sa1e_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa1e_1_student2 = createStudentAnswer(student2, pa1e_1, "A module is a file containing Python definitions and statements. It helps in organizing and reusing code.");
        addStudentAnswerToProblemAnswer(pa1e_1, sa1e_1_student2);

        StudentAnswer sa1e_2_student2 = createStudentAnswer(student2, pa1e_2, "To create a module, simply write Python code in a file with a .py extension. For example, my_module.py.");
        addStudentAnswerToProblemAnswer(pa1e_2, sa1e_2_student2);

        StudentAnswer sa1e_3_student2 = createStudentAnswer(student2, pa1e_3, "You can import a module using the `import` statement. For example: `import my_module`.");
        addStudentAnswerToProblemAnswer(pa1e_3, sa1e_3_student2);

        StudentAnswer sa1e_4_student2 = createStudentAnswer(student2, pa1e_4, "The `__name__` variable in a module is set to `__main__` when the module is run as the main program. It helps in determining if the module is being run on its own or being imported.");
        addStudentAnswerToProblemAnswer(pa1e_4, sa1e_4_student2);

        StudentAnswer sa1e_5_student2 = createStudentAnswer(student2, pa1e_5, "You can access functions and variables from an imported module using the dot notation. For example: `module_name.function_name()`.");
        addStudentAnswerToProblemAnswer(pa1e_5, sa1e_5_student2);

// Creating StudentAnswer instances for student1
        StudentAnswer sa1f_1_student1 = createStudentAnswer(student1, pa1f_1, "A library is a collection of modules and packages that provide pre-written code for common tasks.");
        addStudentAnswerToProblemAnswer(pa1f_1, sa1f_1_student1);

        StudentAnswer sa1f_2_student1 = createStudentAnswer(student1, pa1f_2, "You can install a Python library using the `pip` tool. For example: `pip install library_name`.");
        addStudentAnswerToProblemAnswer(pa1f_2, sa1f_2_student1);

        StudentAnswer sa1f_3_student1 = createStudentAnswer(student1, pa1f_3, "You can import a library using the `import` statement. For example: `import library_name`.");
        addStudentAnswerToProblemAnswer(pa1f_3, sa1f_3_student1);

        StudentAnswer sa1f_4_student1 = createStudentAnswer(student1, pa1f_4, "The standard library is a collection of modules and packages included with Python. It provides functionalities for various tasks such as file I/O, system calls, and data manipulation.");
        addStudentAnswerToProblemAnswer(pa1f_4, sa1f_4_student1);

        StudentAnswer sa1f_5_student1 = createStudentAnswer(student1, pa1f_5, "You can find documentation for a Python library on its official website or through online resources such as Read the Docs and PyPI.");
        addStudentAnswerToProblemAnswer(pa1f_5, sa1f_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa1f_1_student2 = createStudentAnswer(student2, pa1f_1, "A library is a collection of modules and packages that provide pre-written code for common tasks.");
        addStudentAnswerToProblemAnswer(pa1f_1, sa1f_1_student2);

        StudentAnswer sa1f_2_student2 = createStudentAnswer(student2, pa1f_2, "You can install a Python library using the `pip` tool. For example: `pip install library_name`.");
        addStudentAnswerToProblemAnswer(pa1f_2, sa1f_2_student2);

        StudentAnswer sa1f_3_student2 = createStudentAnswer(student2, pa1f_3, "You can import a library using the `import` statement. For example: `import library_name`.");
        addStudentAnswerToProblemAnswer(pa1f_3, sa1f_3_student2);

        StudentAnswer sa1f_4_student2 = createStudentAnswer(student2, pa1f_4, "The standard library is a collection of modules and packages included with Python. It provides functionalities for various tasks such as file I/O, system calls, and data manipulation.");
        addStudentAnswerToProblemAnswer(pa1f_4, sa1f_4_student2);

        StudentAnswer sa1f_5_student2 = createStudentAnswer(student2, pa1f_5, "You can find documentation for a Python library on its official website or through online resources such as Read the Docs and PyPI.");
        addStudentAnswerToProblemAnswer(pa1f_5, sa1f_5_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa2a_1_student1 = createStudentAnswer(student1, pa2a_1, "An array is a collection of elements, each identified by an index or a key, that stores data of the same type.");
        addStudentAnswerToProblemAnswer(pa2a_1, sa2a_1_student1);

        StudentAnswer sa2a_2_student1 = createStudentAnswer(student1, pa2a_2, "In Python, you can declare an array using the list syntax. For example: `arr = [1, 2, 3, 4, 5]`.");
        addStudentAnswerToProblemAnswer(pa2a_2, sa2a_2_student1);

        StudentAnswer sa2a_3_student1 = createStudentAnswer(student1, pa2a_3, "Arrays provide efficient storage and retrieval of data, easy iteration, and support for various operations like sorting and searching.");
        addStudentAnswerToProblemAnswer(pa2a_3, sa2a_3_student1);

        StudentAnswer sa2a_4_student1 = createStudentAnswer(student1, pa2a_4, "You can access an element in an array using its index. For example: `arr[0]` accesses the first element of the array.");
        addStudentAnswerToProblemAnswer(pa2a_4, sa2a_4_student1);

        StudentAnswer sa2a_5_student1 = createStudentAnswer(student1, pa2a_5, "You can modify an element in an array by assigning a new value to it using its index. For example: `arr[1] = 10` changes the second element of the array to 10.");
        addStudentAnswerToProblemAnswer(pa2a_5, sa2a_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa2a_1_student2 = createStudentAnswer(student2, pa2a_1, "An array is a collection of elements, each identified by an index or a key, that stores data of the same type.");
        addStudentAnswerToProblemAnswer(pa2a_1, sa2a_1_student2);

        StudentAnswer sa2a_2_student2 = createStudentAnswer(student2, pa2a_2, "In Python, you can declare an array using the list syntax. For example: `arr = [1, 2, 3, 4, 5]`.");
        addStudentAnswerToProblemAnswer(pa2a_2, sa2a_2_student2);

        StudentAnswer sa2a_3_student2 = createStudentAnswer(student2, pa2a_3, "Arrays provide efficient storage and retrieval of data, easy iteration, and support for various operations like sorting and searching.");
        addStudentAnswerToProblemAnswer(pa2a_3, sa2a_3_student2);

        StudentAnswer sa2a_4_student2 = createStudentAnswer(student2, pa2a_4, "You can access an element in an array using its index. For example: `arr[0]` accesses the first element of the array.");
        addStudentAnswerToProblemAnswer(pa2a_4, sa2a_4_student2);

        StudentAnswer sa2a_5_student2 = createStudentAnswer(student2, pa2a_5, "You can modify an element in an array by assigning a new value to it using its index. For example: `arr[1] = 10` changes the second element of the array to 10.");
        addStudentAnswerToProblemAnswer(pa2a_5, sa2a_5_student2);

// Creating StudentAnswer instances for student1
        StudentAnswer sa2b_1_student1 = createStudentAnswer(student1, pa2b_1, "A linked list is a data structure consisting of nodes, where each node contains data and a reference to the next node in the sequence.");
        addStudentAnswerToProblemAnswer(pa2b_1, sa2b_1_student1);

        StudentAnswer sa2b_2_student1 = createStudentAnswer(student1, pa2b_2, "The types of linked lists include singly linked lists, doubly linked lists, and circular linked lists.");
        addStudentAnswerToProblemAnswer(pa2b_2, sa2b_2_student1);

        StudentAnswer sa2b_3_student1 = createStudentAnswer(student1, pa2b_3, "To insert a node at the beginning, create a new node and set its next reference to the current head. Then update the head to the new node.");
        addStudentAnswerToProblemAnswer(pa2b_3, sa2b_3_student1);

        StudentAnswer sa2b_4_student1 = createStudentAnswer(student1, pa2b_4, "To delete a node, update the next reference of the previous node to bypass the node to be deleted and point to the next node.");
        addStudentAnswerToProblemAnswer(pa2b_4, sa2b_4_student1);

        StudentAnswer sa2b_5_student1 = createStudentAnswer(student1, pa2b_5, "Linked lists provide dynamic memory allocation, making it easier to insert and delete elements without the need to shift elements.");
        addStudentAnswerToProblemAnswer(pa2b_5, sa2b_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa2b_1_student2 = createStudentAnswer(student2, pa2b_1, "A linked list is a data structure consisting of nodes, where each node contains data and a reference to the next node in the sequence.");
        addStudentAnswerToProblemAnswer(pa2b_1, sa2b_1_student2);

        StudentAnswer sa2b_2_student2 = createStudentAnswer(student2, pa2b_2, "The types of linked lists include singly linked lists, doubly linked lists, and circular linked lists.");
        addStudentAnswerToProblemAnswer(pa2b_2, sa2b_2_student2);

        StudentAnswer sa2b_3_student2 = createStudentAnswer(student2, pa2b_3, "To insert a node at the beginning, create a new node and set its next reference to the current head. Then update the head to the new node.");
        addStudentAnswerToProblemAnswer(pa2b_3, sa2b_3_student2);

        StudentAnswer sa2b_4_student2 = createStudentAnswer(student2, pa2b_4, "To delete a node, update the next reference of the previous node to bypass the node to be deleted and point to the next node.");
        addStudentAnswerToProblemAnswer(pa2b_4, sa2b_4_student2);

        StudentAnswer sa2b_5_student2 = createStudentAnswer(student2, pa2b_5, "Linked lists provide dynamic memory allocation, making it easier to insert and delete elements without the need to shift elements.");
        addStudentAnswerToProblemAnswer(pa2b_5, sa2b_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student2
// Creating StudentAnswer instances for student1
        StudentAnswer sa2c_1_student1 = createStudentAnswer(student1, pa2c_1, "A stack is a last-in, first-out (LIFO) data structure where the last element added is the first one to be removed.");
        addStudentAnswerToProblemAnswer(pa2c_1, sa2c_1_student1);

        StudentAnswer sa2c_2_student1 = createStudentAnswer(student1, pa2c_2, "The primary operations of a stack are `push` (adding an element to the top) and `pop` (removing the top element).");
        addStudentAnswerToProblemAnswer(pa2c_2, sa2c_2_student1);

        StudentAnswer sa2c_3_student1 = createStudentAnswer(student1, pa2c_3, "A stack can be implemented in Python using a list, where `append()` performs the `push` operation and `pop()` performs the `pop` operation.");
        addStudentAnswerToProblemAnswer(pa2c_3, sa2c_3_student1);

        StudentAnswer sa2c_4_student1 = createStudentAnswer(student1, pa2c_4, "Stack overflow occurs when too many items are pushed onto the stack, exceeding its capacity and causing an error.");
        addStudentAnswerToProblemAnswer(pa2c_4, sa2c_4_student1);

        StudentAnswer sa2c_5_student1 = createStudentAnswer(student1, pa2c_5, "Stack underflow occurs when trying to pop an element from an empty stack, resulting in an error.");
        addStudentAnswerToProblemAnswer(pa2c_5, sa2c_5_student1);

        StudentAnswer sa2c_1_student2 = createStudentAnswer(student2, pa2c_1, "A stack is a last-in, first-out (LIFO) data structure where the last element added is the first one to be removed.");
        addStudentAnswerToProblemAnswer(pa2c_1, sa2c_1_student2);

        StudentAnswer sa2c_2_student2 = createStudentAnswer(student2, pa2c_2, "The primary operations of a stack are `push` (adding an element to the top) and `pop` (removing the top element).");
        addStudentAnswerToProblemAnswer(pa2c_2, sa2c_2_student2);

        StudentAnswer sa2c_3_student2 = createStudentAnswer(student2, pa2c_3, "A stack can be implemented in Python using a list, where `append()` performs the `push` operation and `pop()` performs the `pop` operation.");
        addStudentAnswerToProblemAnswer(pa2c_3, sa2c_3_student2);

        StudentAnswer sa2c_4_student2 = createStudentAnswer(student2, pa2c_4, "Stack overflow occurs when too many items are pushed onto the stack, exceeding its capacity and causing an error.");
        addStudentAnswerToProblemAnswer(pa2c_4, sa2c_4_student2);

        StudentAnswer sa2c_5_student2 = createStudentAnswer(student2, pa2c_5, "Stack underflow occurs when trying to pop an element from an empty stack, resulting in an error.");
        addStudentAnswerToProblemAnswer(pa2c_5, sa2c_5_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa2d_1_student1 = createStudentAnswer(student1, pa2d_1, "A queue is a first-in, first-out (FIFO) data structure where the first element added is the first one to be removed.");
        addStudentAnswerToProblemAnswer(pa2d_1, sa2d_1_student1);

        StudentAnswer sa2d_2_student1 = createStudentAnswer(student1, pa2d_2, "The primary operations of a queue are `enqueue` (adding an element to the back) and `dequeue` (removing the front element).");
        addStudentAnswerToProblemAnswer(pa2d_2, sa2d_2_student1);

        StudentAnswer sa2d_3_student1 = createStudentAnswer(student1, pa2d_3, "A queue can be implemented in Python using a list, where `append()` performs the `enqueue` operation and `pop(0)` performs the `dequeue` operation.");
        addStudentAnswerToProblemAnswer(pa2d_3, sa2d_3_student1);

        StudentAnswer sa2d_4_student1 = createStudentAnswer(student1, pa2d_4, "Queue overflow occurs when too many items are enqueued onto the queue, exceeding its capacity and causing an error.");
        addStudentAnswerToProblemAnswer(pa2d_4, sa2d_4_student1);

        StudentAnswer sa2d_5_student1 = createStudentAnswer(student1, pa2d_5, "Queue underflow occurs when trying to dequeue an element from an empty queue, resulting in an error.");
        addStudentAnswerToProblemAnswer(pa2d_5, sa2d_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa2d_1_student2 = createStudentAnswer(student2, pa2d_1, "A queue is a first-in, first-out (FIFO) data structure where the first element added is the first one to be removed.");
        addStudentAnswerToProblemAnswer(pa2d_1, sa2d_1_student2);

        StudentAnswer sa2d_2_student2 = createStudentAnswer(student2, pa2d_2, "The primary operations of a queue are `enqueue` (adding an element to the back) and `dequeue` (removing the front element).");
        addStudentAnswerToProblemAnswer(pa2d_2, sa2d_2_student2);

        StudentAnswer sa2d_3_student2 = createStudentAnswer(student2, pa2d_3, "A queue can be implemented in Python using a list, where `append()` performs the `enqueue` operation and `pop(0)` performs the `dequeue` operation.");
        addStudentAnswerToProblemAnswer(pa2d_3, sa2d_3_student2);

        StudentAnswer sa2d_4_student2 = createStudentAnswer(student2, pa2d_4, "Queue overflow occurs when too many items are enqueued onto the queue, exceeding its capacity and causing an error.");
        addStudentAnswerToProblemAnswer(pa2d_4, sa2d_4_student2);

        StudentAnswer sa2d_5_student2 = createStudentAnswer(student2, pa2d_5, "Queue underflow occurs when trying to dequeue an element from an empty queue, resulting in an error.");
        addStudentAnswerToProblemAnswer(pa2d_5, sa2d_5_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa2e_1_student1 = createStudentAnswer(student1, pa2e_1, "A tree is a hierarchical data structure consisting of nodes, where each node has a value and references to its children.");
        addStudentAnswerToProblemAnswer(pa2e_1, sa2e_1_student1);

        StudentAnswer sa2e_2_student1 = createStudentAnswer(student1, pa2e_2, "A binary tree is a type of tree where each node has at most two children, referred to as the left and right children.");
        addStudentAnswerToProblemAnswer(pa2e_2, sa2e_2_student1);

        StudentAnswer sa2e_3_student1 = createStudentAnswer(student1, pa2e_3, "A binary search tree (BST) is a type of binary tree where the left child of a node contains values less than the node, and the right child contains values greater than the node.");
        addStudentAnswerToProblemAnswer(pa2e_3, sa2e_3_student1);

        StudentAnswer sa2e_4_student1 = createStudentAnswer(student1, pa2e_4, "In preorder traversal, you visit the root node first, then recursively visit the left subtree, followed by the right subtree.");
        addStudentAnswerToProblemAnswer(pa2e_4, sa2e_4_student1);

        StudentAnswer sa2e_5_student1 = createStudentAnswer(student1, pa2e_5, "In inorder traversal, you recursively visit the left subtree first, then visit the root node, followed by the right subtree.");
        addStudentAnswerToProblemAnswer(pa2e_5, sa2e_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa2e_1_student2 = createStudentAnswer(student2, pa2e_1, "A tree is a hierarchical data structure consisting of nodes, where each node has a value and references to its children.");
        addStudentAnswerToProblemAnswer(pa2e_1, sa2e_1_student2);

        StudentAnswer sa2e_2_student2 = createStudentAnswer(student2, pa2e_2, "A binary tree is a type of tree where each node has at most two children, referred to as the left and right children.");
        addStudentAnswerToProblemAnswer(pa2e_2, sa2e_2_student2);

        StudentAnswer sa2e_3_student2 = createStudentAnswer(student2, pa2e_3, "A binary search tree (BST) is a type of binary tree where the left child of a node contains values less than the node, and the right child contains values greater than the node.");
        addStudentAnswerToProblemAnswer(pa2e_3, sa2e_3_student2);

        StudentAnswer sa2e_4_student2 = createStudentAnswer(student2, pa2e_4, "In preorder traversal, you visit the root node first, then recursively visit the left subtree, followed by the right subtree.");
        addStudentAnswerToProblemAnswer(pa2e_4, sa2e_4_student2);

        StudentAnswer sa2e_5_student2 = createStudentAnswer(student2, pa2e_5, "In inorder traversal, you recursively visit the left subtree first, then visit the root node, followed by the right subtree.");
        addStudentAnswerToProblemAnswer(pa2e_5, sa2e_5_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa2f_1_student1 = createStudentAnswer(student1, pa2f_1, "A graph is a collection of nodes (vertices) and edges that connect pairs of nodes, used to represent relationships between entities.");
        addStudentAnswerToProblemAnswer(pa2f_1, sa2f_1_student1);

        StudentAnswer sa2f_2_student1 = createStudentAnswer(student1, pa2f_2, "The types of graphs include directed graphs (digraphs) and undirected graphs. In directed graphs, edges have a direction, while in undirected graphs, edges do not have a direction.");
        addStudentAnswerToProblemAnswer(pa2f_2, sa2f_2_student1);

        StudentAnswer sa2f_3_student1 = createStudentAnswer(student1, pa2f_3, "A weighted graph is a graph in which each edge is assigned a weight or cost, representing the cost of moving between nodes.");
        addStudentAnswerToProblemAnswer(pa2f_3, sa2f_3_student1);

        StudentAnswer sa2f_4_student1 = createStudentAnswer(student1, pa2f_4, "A path in a graph is a sequence of edges that connect a sequence of vertices, with no repeated vertices.");
        addStudentAnswerToProblemAnswer(pa2f_4, sa2f_4_student1);

        StudentAnswer sa2f_5_student1 = createStudentAnswer(student1, pa2f_5, "A cycle in a graph is a path that starts and ends at the same vertex, with all edges and vertices being distinct except for the starting and ending vertex.");
        addStudentAnswerToProblemAnswer(pa2f_5, sa2f_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa2f_1_student2 = createStudentAnswer(student2, pa2f_1, "A graph is a collection of nodes (vertices) and edges that connect pairs of nodes, used to represent relationships between entities.");
        addStudentAnswerToProblemAnswer(pa2f_1, sa2f_1_student2);

        StudentAnswer sa2f_2_student2 = createStudentAnswer(student2, pa2f_2, "The types of graphs include directed graphs (digraphs) and undirected graphs. In directed graphs, edges have a direction, while in undirected graphs, edges do not have a direction.");
        addStudentAnswerToProblemAnswer(pa2f_2, sa2f_2_student2);

        StudentAnswer sa2f_3_student2 = createStudentAnswer(student2, pa2f_3, "A weighted graph is a graph in which each edge is assigned a weight or cost, representing the cost of moving between nodes.");
        addStudentAnswerToProblemAnswer(pa2f_3, sa2f_3_student2);

        StudentAnswer sa2f_4_student2 = createStudentAnswer(student2, pa2f_4, "A path in a graph is a sequence of edges that connect a sequence of vertices, with no repeated vertices.");
        addStudentAnswerToProblemAnswer(pa2f_4, sa2f_4_student2);

        StudentAnswer sa2f_5_student2 = createStudentAnswer(student2, pa2f_5, "A cycle in a graph is a path that starts and ends at the same vertex, with all edges and vertices being distinct except for the starting and ending vertex.");
        addStudentAnswerToProblemAnswer(pa2f_5, sa2f_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa3a_1_student1 = createStudentAnswer(student1, pa3a_1, "Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.");
        addStudentAnswerToProblemAnswer(pa3a_1, sa3a_1_student1);

        StudentAnswer sa3a_2_student1 = createStudentAnswer(student1, pa3a_2, "Merge sort is a divide-and-conquer algorithm that divides the list into halves, recursively sorts each half, and then merges the sorted halves.");
        addStudentAnswerToProblemAnswer(pa3a_2, sa3a_2_student1);

        StudentAnswer sa3a_3_student1 = createStudentAnswer(student1, pa3a_3, "Quicksort is a divide-and-conquer algorithm that selects a 'pivot' element, partitions the list into elements less than and greater than the pivot, and recursively sorts the partitions.");
        addStudentAnswerToProblemAnswer(pa3a_3, sa3a_3_student1);

        StudentAnswer sa3a_4_student1 = createStudentAnswer(student1, pa3a_4, "The time complexity of bubble sort is O(n^2) in the average and worst case, where n is the number of elements.");
        addStudentAnswerToProblemAnswer(pa3a_4, sa3a_4_student1);

        StudentAnswer sa3a_5_student1 = createStudentAnswer(student1, pa3a_5, "The time complexity of merge sort is O(n log n) in all cases, where n is the number of elements.");
        addStudentAnswerToProblemAnswer(pa3a_5, sa3a_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa3a_1_student2 = createStudentAnswer(student2, pa3a_1, "Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.");
        addStudentAnswerToProblemAnswer(pa3a_1, sa3a_1_student2);

        StudentAnswer sa3a_2_student2 = createStudentAnswer(student2, pa3a_2, "Merge sort is a divide-and-conquer algorithm that divides the list into halves, recursively sorts each half, and then merges the sorted halves.");
        addStudentAnswerToProblemAnswer(pa3a_2, sa3a_2_student2);

        StudentAnswer sa3a_3_student2 = createStudentAnswer(student2, pa3a_3, "Quicksort is a divide-and-conquer algorithm that selects a 'pivot' element, partitions the list into elements less than and greater than the pivot, and recursively sorts the partitions.");
        addStudentAnswerToProblemAnswer(pa3a_3, sa3a_3_student2);

        StudentAnswer sa3a_4_student2 = createStudentAnswer(student2, pa3a_4, "The time complexity of bubble sort is O(n^2) in the average and worst case, where n is the number of elements.");
        addStudentAnswerToProblemAnswer(pa3a_4, sa3a_4_student2);

        StudentAnswer sa3a_5_student2 = createStudentAnswer(student2, pa3a_5, "The time complexity of merge sort is O(n log n) in all cases, where n is the number of elements.");
        addStudentAnswerToProblemAnswer(pa3a_5, sa3a_5_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa3b_1_student1 = createStudentAnswer(student1, pa3b_1, "Linear search is a simple searching algorithm that checks each element in the list sequentially until the desired element is found or the list ends.");
        addStudentAnswerToProblemAnswer(pa3b_1, sa3b_1_student1);

        StudentAnswer sa3b_2_student1 = createStudentAnswer(student1, pa3b_2, "Binary search is a searching algorithm that divides the list into halves to find the desired element. It requires the list to be sorted.");
        addStudentAnswerToProblemAnswer(pa3b_2, sa3b_2_student1);

        StudentAnswer sa3b_3_student1 = createStudentAnswer(student1, pa3b_3, "Linear search iterates through the list and compares each element with the target value until a match is found or the end of the list is reached.");
        addStudentAnswerToProblemAnswer(pa3b_3, sa3b_3_student1);

        StudentAnswer sa3b_4_student1 = createStudentAnswer(student1, pa3b_4, "Binary search repeatedly divides the list in half, compares the middle element with the target value, and narrows down the search to the appropriate half.");
        addStudentAnswerToProblemAnswer(pa3b_4, sa3b_4_student1);

        StudentAnswer sa3b_5_student1 = createStudentAnswer(student1, pa3b_5, "The time complexity of linear search is O(n), where n is the number of elements in the list.");
        addStudentAnswerToProblemAnswer(pa3b_5, sa3b_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa3b_1_student2 = createStudentAnswer(student2, pa3b_1, "Linear search is a simple searching algorithm that checks each element in the list sequentially until the desired element is found or the list ends.");
        addStudentAnswerToProblemAnswer(pa3b_1, sa3b_1_student2);

        StudentAnswer sa3b_2_student2 = createStudentAnswer(student2, pa3b_2, "Binary search is a searching algorithm that divides the list into halves to find the desired element. It requires the list to be sorted.");
        addStudentAnswerToProblemAnswer(pa3b_2, sa3b_2_student2);

        StudentAnswer sa3b_3_student2 = createStudentAnswer(student2, pa3b_3, "Linear search iterates through the list and compares each element with the target value until a match is found or the end of the list is reached.");
        addStudentAnswerToProblemAnswer(pa3b_3, sa3b_3_student2);

        StudentAnswer sa3b_4_student2 = createStudentAnswer(student2, pa3b_4, "Binary search repeatedly divides the list in half, compares the middle element with the target value, and narrows down the search to the appropriate half.");
        addStudentAnswerToProblemAnswer(pa3b_4, sa3b_4_student2);

        StudentAnswer sa3b_5_student2 = createStudentAnswer(student2, pa3b_5, "The time complexity of linear search is O(n), where n is the number of elements in the list.");
        addStudentAnswerToProblemAnswer(pa3b_5, sa3b_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa3c_1_student1 = createStudentAnswer(student1, pa3c_1, "Depth-first search (DFS) is a graph traversal algorithm that explores as far as possible along each branch before backtracking.");
        addStudentAnswerToProblemAnswer(pa3c_1, sa3c_1_student1);

        StudentAnswer sa3c_2_student1 = createStudentAnswer(student1, pa3c_2, "Breadth-first search (BFS) is a graph traversal algorithm that explores all nodes at the present depth level before moving on to nodes at the next depth level.");
        addStudentAnswerToProblemAnswer(pa3c_2, sa3c_2_student1);

        StudentAnswer sa3c_3_student1 = createStudentAnswer(student1, pa3c_3, "DFS uses a stack (either explicitly or via recursion) to explore as far as possible along each branch before backtracking.");
        addStudentAnswerToProblemAnswer(pa3c_3, sa3c_3_student1);

        StudentAnswer sa3c_4_student1 = createStudentAnswer(student1, pa3c_4, "BFS uses a queue to explore all nodes at the present depth level before moving on to nodes at the next depth level.");
        addStudentAnswerToProblemAnswer(pa3c_4, sa3c_4_student1);

        StudentAnswer sa3c_5_student1 = createStudentAnswer(student1, pa3c_5, "The time complexity of DFS is O(V + E), where V is the number of vertices and E is the number of edges in the graph.");
        addStudentAnswerToProblemAnswer(pa3c_5, sa3c_5_student1);

        // Creating StudentAnswer instances for student2
        StudentAnswer sa3c_1_student2 = createStudentAnswer(student2, pa3c_1, "Depth-first search (DFS) is a graph traversal algorithm that explores as far as possible along each branch before backtracking.");
        addStudentAnswerToProblemAnswer(pa3c_1, sa3c_1_student2);

        StudentAnswer sa3c_2_student2 = createStudentAnswer(student2, pa3c_2, "Breadth-first search (BFS) is a graph traversal algorithm that explores all nodes at the present depth level before moving on to nodes at the next depth level.");
        addStudentAnswerToProblemAnswer(pa3c_2, sa3c_2_student2);

        StudentAnswer sa3c_3_student2 = createStudentAnswer(student2, pa3c_3, "DFS uses a stack (either explicitly or via recursion) to explore as far as possible along each branch before backtracking.");
        addStudentAnswerToProblemAnswer(pa3c_3, sa3c_3_student2);

        StudentAnswer sa3c_4_student2 = createStudentAnswer(student2, pa3c_4, "BFS uses a queue to explore all nodes at the present depth level before moving on to nodes at the next depth level.");
        addStudentAnswerToProblemAnswer(pa3c_4, sa3c_4_student2);

        StudentAnswer sa3c_5_student2 = createStudentAnswer(student2, pa3c_5, "The time complexity of DFS is O(V + E), where V is the number of vertices and E is the number of edges in the graph.");
        addStudentAnswerToProblemAnswer(pa3c_5, sa3c_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa3d_1_student1 = createStudentAnswer(student1, pa3d_1, "Dynamic programming is a method for solving complex problems by breaking them down into simpler subproblems and solving each subproblem just once, storing its solution.");
        addStudentAnswerToProblemAnswer(pa3d_1, sa3d_1_student1);

        StudentAnswer sa3d_2_student1 = createStudentAnswer(student1, pa3d_2, "Dynamic programming optimizes recursion by storing the results of subproblems (memoization) to avoid redundant computations.");
        addStudentAnswerToProblemAnswer(pa3d_2, sa3d_2_student1);

        StudentAnswer sa3d_3_student1 = createStudentAnswer(student1, pa3d_3, "The principle of optimality states that an optimal solution to a problem contains optimal solutions to its subproblems.");
        addStudentAnswerToProblemAnswer(pa3d_3, sa3d_3_student1);

        StudentAnswer sa3d_4_student1 = createStudentAnswer(student1, pa3d_4, "Memoization is a technique used in dynamic programming to store the results of expensive function calls and reuse them when the same inputs occur again.");
        addStudentAnswerToProblemAnswer(pa3d_4, sa3d_4_student1);

        StudentAnswer sa3d_5_student1 = createStudentAnswer(student1, pa3d_5, "You can implement the Fibonacci sequence using dynamic programming by storing the results of previous Fibonacci calculations in an array and reusing them.");
        addStudentAnswerToProblemAnswer(pa3d_5, sa3d_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa3d_1_student2 = createStudentAnswer(student2, pa3d_1, "Dynamic programming is a method for solving complex problems by breaking them down into simpler subproblems and solving each subproblem just once, storing its solution.");
        addStudentAnswerToProblemAnswer(pa3d_1, sa3d_1_student2);

        StudentAnswer sa3d_2_student2 = createStudentAnswer(student2, pa3d_2, "Dynamic programming optimizes recursion by storing the results of subproblems (memoization) to avoid redundant computations.");
        addStudentAnswerToProblemAnswer(pa3d_2, sa3d_2_student2);

        StudentAnswer sa3d_3_student2 = createStudentAnswer(student2, pa3d_3, "The principle of optimality states that an optimal solution to a problem contains optimal solutions to its subproblems.");
        addStudentAnswerToProblemAnswer(pa3d_3, sa3d_3_student2);

        StudentAnswer sa3d_4_student2 = createStudentAnswer(student2, pa3d_4, "Memoization is a technique used in dynamic programming to store the results of expensive function calls and reuse them when the same inputs occur again.");
        addStudentAnswerToProblemAnswer(pa3d_4, sa3d_4_student2);

        StudentAnswer sa3d_5_student2 = createStudentAnswer(student2, pa3d_5, "You can implement the Fibonacci sequence using dynamic programming by storing the results of previous Fibonacci calculations in an array and reusing them.");
        addStudentAnswerToProblemAnswer(pa3d_5, sa3d_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa4a_1_student1 = createStudentAnswer(student1, pa4a_1, "A relational database is a type of database that stores data in tables with rows and columns, where relationships between tables are established using keys.");
        addStudentAnswerToProblemAnswer(pa4a_1, sa4a_1_student1);

        StudentAnswer sa4a_2_student1 = createStudentAnswer(student1, pa4a_2, "A table is a collection of related data entries that consists of columns (fields) and rows (records). Each column represents a data attribute, and each row represents a record.");
        addStudentAnswerToProblemAnswer(pa4a_2, sa4a_2_student1);

        StudentAnswer sa4a_3_student1 = createStudentAnswer(student1, pa4a_3, "A primary key is a unique identifier for each record in a table. It ensures that each record can be uniquely identified and that no duplicate records exist.");
        addStudentAnswerToProblemAnswer(pa4a_3, sa4a_3_student1);

        StudentAnswer sa4a_4_student1 = createStudentAnswer(student1, pa4a_4, "A foreign key is a field in one table that uniquely identifies a row in another table. It establishes a relationship between the two tables.");
        addStudentAnswerToProblemAnswer(pa4a_4, sa4a_4_student1);

        StudentAnswer sa4a_5_student1 = createStudentAnswer(student1, pa4a_5, "A relational schema is a blueprint that defines the structure of a relational database, including the tables, fields, and relationships between tables.");
        addStudentAnswerToProblemAnswer(pa4a_5, sa4a_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa4a_1_student2 = createStudentAnswer(student2, pa4a_1, "A relational database is a type of database that stores data in tables with rows and columns, where relationships between tables are established using keys.");
        addStudentAnswerToProblemAnswer(pa4a_1, sa4a_1_student2);

        StudentAnswer sa4a_2_student2 = createStudentAnswer(student2, pa4a_2, "A table is a collection of related data entries that consists of columns (fields) and rows (records). Each column represents a data attribute, and each row represents a record.");
        addStudentAnswerToProblemAnswer(pa4a_2, sa4a_2_student2);

        StudentAnswer sa4a_3_student2 = createStudentAnswer(student2, pa4a_3, "A primary key is a unique identifier for each record in a table. It ensures that each record can be uniquely identified and that no duplicate records exist.");
        addStudentAnswerToProblemAnswer(pa4a_3, sa4a_3_student2);

        StudentAnswer sa4a_4_student2 = createStudentAnswer(student2, pa4a_4, "A foreign key is a field in one table that uniquely identifies a row in another table. It establishes a relationship between the two tables.");
        addStudentAnswerToProblemAnswer(pa4a_4, sa4a_4_student2);

        StudentAnswer sa4a_5_student2 = createStudentAnswer(student2, pa4a_5, "A relational schema is a blueprint that defines the structure of a relational database, including the tables, fields, and relationships between tables.");
        addStudentAnswerToProblemAnswer(pa4a_5, sa4a_5_student2);

// Output for confirmation
        System.out.println("Student answers created and added for student1 and student2 for all test-related problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa4b_1_student1 = createStudentAnswer(student1, pa4b_1, "SQL is the standard language for querying and manipulating databases.");
        addStudentAnswerToProblemAnswer(pa4b_1, sa4b_1_student1);

        StudentAnswer sa4b_2_student1 = createStudentAnswer(student1, pa4b_2, "A SELECT statement is used to query data from a database, for example: SELECT column1, column2 FROM table_name;");
        addStudentAnswerToProblemAnswer(pa4b_2, sa4b_2_student1);

        StudentAnswer sa4b_3_student1 = createStudentAnswer(student1, pa4b_3, "The WHERE clause is used to filter records based on specified conditions, for example: SELECT * FROM table_name WHERE condition;");
        addStudentAnswerToProblemAnswer(pa4b_3, sa4b_3_student1);

        StudentAnswer sa4b_4_student1 = createStudentAnswer(student1, pa4b_4, "An INSERT statement is used to add new records to a table, for example: INSERT INTO table_name (column1, column2) VALUES (value1, value2);");
        addStudentAnswerToProblemAnswer(pa4b_4, sa4b_4_student1);

        StudentAnswer sa4b_5_student1 = createStudentAnswer(student1, pa4b_5, "An UPDATE statement is used to modify existing records in a table, for example: UPDATE table_name SET column1 = value1 WHERE condition;");
        addStudentAnswerToProblemAnswer(pa4b_5, sa4b_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa4b_1_student2 = createStudentAnswer(student2, pa4b_1, "SQL is the standard language for querying and manipulating databases.");
        addStudentAnswerToProblemAnswer(pa4b_1, sa4b_1_student2);

        StudentAnswer sa4b_2_student2 = createStudentAnswer(student2, pa4b_2, "A SELECT statement is used to query data from a database, for example: SELECT column1, column2 FROM table_name;");
        addStudentAnswerToProblemAnswer(pa4b_2, sa4b_2_student2);

        StudentAnswer sa4b_3_student2 = createStudentAnswer(student2, pa4b_3, "The WHERE clause is used to filter records based on specified conditions, for example: SELECT * FROM table_name WHERE condition;");
        addStudentAnswerToProblemAnswer(pa4b_3, sa4b_3_student2);

        StudentAnswer sa4b_4_student2 = createStudentAnswer(student2, pa4b_4, "An INSERT statement is used to add new records to a table, for example: INSERT INTO table_name (column1, column2) VALUES (value1, value2);");
        addStudentAnswerToProblemAnswer(pa4b_4, sa4b_4_student2);

        StudentAnswer sa4b_5_student2 = createStudentAnswer(student2, pa4b_5, "An UPDATE statement is used to modify existing records in a table, for example: UPDATE table_name SET column1 = value1 WHERE condition;");
        addStudentAnswerToProblemAnswer(pa4b_5, sa4b_5_student2);

        // Creating StudentAnswer instances for student1
        StudentAnswer sa4c_1_student1 = createStudentAnswer(student1, pa4c_1, "A transaction is a sequence of one or more SQL operations that are executed as a single unit of work. It ensures data integrity and consistency.");
        addStudentAnswerToProblemAnswer(pa4c_1, sa4c_1_student1);

        StudentAnswer sa4c_2_student1 = createStudentAnswer(student1, pa4c_2, "ACID properties are a set of principles that ensure reliable transactions in a database. They stand for Atomicity, Consistency, Isolation, and Durability.");
        addStudentAnswerToProblemAnswer(pa4c_2, sa4c_2_student1);

        StudentAnswer sa4c_3_student1 = createStudentAnswer(student1, pa4c_3, "Atomicity ensures that all operations within a transaction are completed successfully. If any operation fails, the entire transaction is rolled back.");
        addStudentAnswerToProblemAnswer(pa4c_3, sa4c_3_student1);

        StudentAnswer sa4c_4_student1 = createStudentAnswer(student1, pa4c_4, "Consistency ensures that a transaction brings the database from one valid state to another, maintaining data integrity throughout the process.");
        addStudentAnswerToProblemAnswer(pa4c_4, sa4c_4_student1);

        StudentAnswer sa4c_5_student1 = createStudentAnswer(student1, pa4c_5, "Isolation ensures that concurrent transactions do not interfere with each other, providing each transaction with a consistent view of the database.");
        addStudentAnswerToProblemAnswer(pa4c_5, sa4c_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa4c_1_student2 = createStudentAnswer(student2, pa4c_1, "A transaction is a sequence of one or more SQL operations that are executed as a single unit of work. It ensures data integrity and consistency.");
        addStudentAnswerToProblemAnswer(pa4c_1, sa4c_1_student2);

        StudentAnswer sa4c_2_student2 = createStudentAnswer(student2, pa4c_2, "ACID properties are a set of principles that ensure reliable transactions in a database. They stand for Atomicity, Consistency, Isolation, and Durability.");
        addStudentAnswerToProblemAnswer(pa4c_2, sa4c_2_student2);

        StudentAnswer sa4c_3_student2 = createStudentAnswer(student2, pa4c_3, "Atomicity ensures that all operations within a transaction are completed successfully. If any operation fails, the entire transaction is rolled back.");
        addStudentAnswerToProblemAnswer(pa4c_3, sa4c_3_student2);

        StudentAnswer sa4c_4_student2 = createStudentAnswer(student2, pa4c_4, "Consistency ensures that a transaction brings the database from one valid state to another, maintaining data integrity throughout the process.");
        addStudentAnswerToProblemAnswer(pa4c_4, sa4c_4_student2);

        StudentAnswer sa4c_5_student2 = createStudentAnswer(student2, pa4c_5, "Isolation ensures that concurrent transactions do not interfere with each other, providing each transaction with a consistent view of the database.");
        addStudentAnswerToProblemAnswer(pa4c_5, sa4c_5_student2);

        // Creating StudentAnswer instances for student1
        StudentAnswer sa4d_1_student1 = createStudentAnswer(student1, pa4d_1, "Database design is the process of creating a detailed data model of a database, which includes the structure of tables, relationships, and constraints to efficiently store and retrieve data.");
        addStudentAnswerToProblemAnswer(pa4d_1, sa4d_1_student1);

        StudentAnswer sa4d_2_student1 = createStudentAnswer(student1, pa4d_2, "Normalization is the process of organizing data in a database to reduce redundancy and improve data integrity. It involves dividing tables into smaller tables and defining relationships between them.");
        addStudentAnswerToProblemAnswer(pa4d_2, sa4d_2_student1);

        StudentAnswer sa4d_3_student1 = createStudentAnswer(student1, pa4d_3, "Normal forms are standards used to achieve normalization. The common normal forms are: 1NF (First Normal Form), 2NF (Second Normal Form), 3NF (Third Normal Form), and BCNF (Boyce-Codd Normal Form).");
        addStudentAnswerToProblemAnswer(pa4d_3, sa4d_3_student1);

        StudentAnswer sa4d_4_student1 = createStudentAnswer(student1, pa4d_4, "Denormalization is the process of combining normalized tables into larger tables to improve read performance and reduce the complexity of database queries, at the cost of increased redundancy.");
        addStudentAnswerToProblemAnswer(pa4d_4, sa4d_4_student1);

        StudentAnswer sa4d_5_student1 = createStudentAnswer(student1, pa4d_5, "An ER diagram is a visual representation of entities and their relationships within a database. It is used to design and model the database structure.");
        addStudentAnswerToProblemAnswer(pa4d_5, sa4d_5_student1);

// Creating StudentAnswer instances for student2
        StudentAnswer sa4d_1_student2 = createStudentAnswer(student2, pa4d_1, "Database design is the process of creating a detailed data model of a database, which includes the structure of tables, relationships, and constraints to efficiently store and retrieve data.");
        addStudentAnswerToProblemAnswer(pa4d_1, sa4d_1_student2);

        StudentAnswer sa4d_2_student2 = createStudentAnswer(student2, pa4d_2, "Normalization is the process of organizing data in a database to reduce redundancy and improve data integrity. It involves dividing tables into smaller tables and defining relationships between them.");
        addStudentAnswerToProblemAnswer(pa4d_2, sa4d_2_student2);

        StudentAnswer sa4d_3_student2 = createStudentAnswer(student2, pa4d_3, "Normal forms are standards used to achieve normalization. The common normal forms are: 1NF (First Normal Form), 2NF (Second Normal Form), 3NF (Third Normal Form), and BCNF (Boyce-Codd Normal Form).");
        addStudentAnswerToProblemAnswer(pa4d_3, sa4d_3_student2);

        StudentAnswer sa4d_4_student2 = createStudentAnswer(student2, pa4d_4, "Denormalization is the process of combining normalized tables into larger tables to improve read performance and reduce the complexity of database queries, at the cost of increased redundancy.");
        addStudentAnswerToProblemAnswer(pa4d_4, sa4d_4_student2);

        StudentAnswer sa4d_5_student2 = createStudentAnswer(student2, pa4d_5, "An ER diagram is a visual representation of entities and their relationships within a database. It is used to design and model the database structure.");
        addStudentAnswerToProblemAnswer(pa4d_5, sa4d_5_student2);

        // Creating StudentAnswer instances for student3
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

        // Creating StudentAnswer instances for student5
        StudentAnswer sa13a_1_student7 = createStudentAnswer(student7, pa13a_1, "A sequence is an ordered list of numbers that follows a specific pattern or rule. Each number in the sequence is called a term.");
        addStudentAnswerToProblemAnswer(pa13a_1, sa13a_1_student7);

        StudentAnswer sa13a_2_student7 = createStudentAnswer(student7, pa13a_2, "A series is the sum of the terms of a sequence. It can be finite or infinite, depending on the number of terms being summed.");
        addStudentAnswerToProblemAnswer(pa13a_2, sa13a_2_student7);

        StudentAnswer sa13a_3_student7 = createStudentAnswer(student7, pa13a_3, "A convergent series is a series whose terms approach a finite limit as the number of terms increases. The series converges to this limit.");
        addStudentAnswerToProblemAnswer(pa13a_3, sa13a_3_student7);

        StudentAnswer sa13a_4_student7 = createStudentAnswer(student7, pa13a_4, "A divergent series is a series whose terms do not approach a finite limit as the number of terms increases. The series either increases without bound or oscillates indefinitely.");
        addStudentAnswerToProblemAnswer(pa13a_4, sa13a_4_student7);

        StudentAnswer sa13a_5_student7 = createStudentAnswer(student7, pa13a_5, "A power series is an infinite series of the form Σ(an)(x^n), where an are coefficients and x is the variable. Power series can represent functions within a certain interval of convergence.");
        addStudentAnswerToProblemAnswer(pa13a_5, sa13a_5_student7);

// Creating StudentAnswer instances for student6
        StudentAnswer sa13a_1_student8 = createStudentAnswer(student8, pa13a_1, "A sequence is an ordered list of numbers that follows a specific pattern or rule. Each number in the sequence is called a term.");
        addStudentAnswerToProblemAnswer(pa13a_1, sa13a_1_student8);

        StudentAnswer sa13a_2_student8 = createStudentAnswer(student8, pa13a_2, "A series is the sum of the terms of a sequence. It can be finite or infinite, depending on the number of terms being summed.");
        addStudentAnswerToProblemAnswer(pa13a_2, sa13a_2_student8);

        StudentAnswer sa13a_3_student8 = createStudentAnswer(student8, pa13a_3, "A convergent series is a series whose terms approach a finite limit as the number of terms increases. The series converges to this limit.");
        addStudentAnswerToProblemAnswer(pa13a_3, sa13a_3_student8);

        StudentAnswer sa13a_4_student8 = createStudentAnswer(student8, pa13a_4, "A divergent series is a series whose terms do not approach a finite limit as the number of terms increases. The series either increases without bound or oscillates indefinitely.");
        addStudentAnswerToProblemAnswer(pa13a_4, sa13a_4_student8);

        StudentAnswer sa13a_5_student8 = createStudentAnswer(student8, pa13a_5, "A power series is an infinite series of the form Σ(an)(x^n), where an are coefficients and x is the variable. Power series can represent functions within a certain interval of convergence.");
        addStudentAnswerToProblemAnswer(pa13a_5, sa13a_5_student8);

        // Creating StudentAnswer instances for student5
        StudentAnswer sa13b_1_student7 = createStudentAnswer(student7, pa13b_1, "Integration by parts is a technique used to integrate the product of two functions. It is based on the product rule of differentiation and is given by the formula: ∫u dv = uv - ∫v du.");
        addStudentAnswerToProblemAnswer(pa13b_1, sa13b_1_student7);

        StudentAnswer sa13b_2_student7 = createStudentAnswer(student7, pa13b_2, "Partial fractions integration is a method used to integrate rational functions by expressing them as a sum of simpler fractions. This technique involves decomposing the rational function into partial fractions and then integrating each fraction separately.");
        addStudentAnswerToProblemAnswer(pa13b_2, sa13b_2_student7);

        StudentAnswer sa13b_3_student7 = createStudentAnswer(student7, pa13b_3, "To integrate trigonometric functions, you can use trigonometric identities, substitution, and integration formulas. Common techniques include using identities to simplify the integrand and applying specific integration formulas for trigonometric functions.");
        addStudentAnswerToProblemAnswer(pa13b_3, sa13b_3_student7);

        StudentAnswer sa13b_4_student7 = createStudentAnswer(student7, pa13b_4, "Improper integrals are integrals that have infinite limits of integration or integrands with infinite discontinuities. They are evaluated as limits, such as ∫[a, ∞] f(x) dx = lim(b→∞) ∫[a, b] f(x) dx.");
        addStudentAnswerToProblemAnswer(pa13b_4, sa13b_4_student7);

        StudentAnswer sa13b_5_student7 = createStudentAnswer(student7, pa13b_5, "The substitution method, also known as u-substitution, is used to simplify integrals by substituting a part of the integrand with a new variable. This technique often makes the integral easier to evaluate.");
        addStudentAnswerToProblemAnswer(pa13b_5, sa13b_5_student7);

// Creating StudentAnswer instances for student6
        StudentAnswer sa13b_1_student8 = createStudentAnswer(student8, pa13b_1, "Integration by parts is a technique used to integrate the product of two functions. It is based on the product rule of differentiation and is given by the formula: ∫u dv = uv - ∫v du.");
        addStudentAnswerToProblemAnswer(pa13b_1, sa13b_1_student8);

        StudentAnswer sa13b_2_student8 = createStudentAnswer(student8, pa13b_2, "Partial fractions integration is a method used to integrate rational functions by expressing them as a sum of simpler fractions. This technique involves decomposing the rational function into partial fractions and then integrating each fraction separately.");
        addStudentAnswerToProblemAnswer(pa13b_2, sa13b_2_student8);

        StudentAnswer sa13b_3_student8 = createStudentAnswer(student8, pa13b_3, "To integrate trigonometric functions, you can use trigonometric identities, substitution, and integration formulas. Common techniques include using identities to simplify the integrand and applying specific integration formulas for trigonometric functions.");
        addStudentAnswerToProblemAnswer(pa13b_3, sa13b_3_student8);

        StudentAnswer sa13b_4_student8 = createStudentAnswer(student8, pa13b_4, "Improper integrals are integrals that have infinite limits of integration or integrands with infinite discontinuities. They are evaluated as limits, such as ∫[a, ∞] f(x) dx = lim(b→∞) ∫[a, b] f(x) dx.");
        addStudentAnswerToProblemAnswer(pa13b_4, sa13b_4_student8);

        StudentAnswer sa13b_5_student8 = createStudentAnswer(student8, pa13b_5, "The substitution method, also known as u-substitution, is used to simplify integrals by substituting a part of the integrand with a new variable. This technique often makes the integral easier to evaluate.");
        addStudentAnswerToProblemAnswer(pa13b_5, sa13b_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa13c_1_student7 = createStudentAnswer(student7, pa13c_1, "A multivariable function is a function that has more than one input variable. It maps a set of input variables to a single output value.");
        addStudentAnswerToProblemAnswer(pa13c_1, sa13c_1_student7);

        StudentAnswer sa13c_2_student7 = createStudentAnswer(student7, pa13c_2, "A partial derivative is the derivative of a multivariable function with respect to one of its variables, while keeping the other variables constant. It measures how the function changes as that variable changes.");
        addStudentAnswerToProblemAnswer(pa13c_2, sa13c_2_student7);

        StudentAnswer sa13c_3_student7 = createStudentAnswer(student7, pa13c_3, "A gradient vector is a vector that contains all the partial derivatives of a multivariable function. It points in the direction of the steepest ascent of the function.");
        addStudentAnswerToProblemAnswer(pa13c_3, sa13c_3_student7);

        StudentAnswer sa13c_4_student7 = createStudentAnswer(student7, pa13c_4, "A level curve is a curve on a graph where the function has a constant value. It represents points in the domain of the function where the function's value is the same.");
        addStudentAnswerToProblemAnswer(pa13c_4, sa13c_4_student7);

        StudentAnswer sa13c_5_student7 = createStudentAnswer(student7, pa13c_5, "A multiple integral is an integral that involves more than one variable. It is used to calculate the volume under a surface or the accumulation of a quantity over a region.");
        addStudentAnswerToProblemAnswer(pa13c_5, sa13c_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa13c_1_student8 = createStudentAnswer(student8, pa13c_1, "A multivariable function is a function that has more than one input variable. It maps a set of input variables to a single output value.");
        addStudentAnswerToProblemAnswer(pa13c_1, sa13c_1_student8);

        StudentAnswer sa13c_2_student8 = createStudentAnswer(student8, pa13c_2, "A partial derivative is the derivative of a multivariable function with respect to one of its variables, while keeping the other variables constant. It measures how the function changes as that variable changes.");
        addStudentAnswerToProblemAnswer(pa13c_2, sa13c_2_student8);

        StudentAnswer sa13c_3_student8 = createStudentAnswer(student8, pa13c_3, "A gradient vector is a vector that contains all the partial derivatives of a multivariable function. It points in the direction of the steepest ascent of the function.");
        addStudentAnswerToProblemAnswer(pa13c_3, sa13c_3_student8);

        StudentAnswer sa13c_4_student8 = createStudentAnswer(student8, pa13c_4, "A level curve is a curve on a graph where the function has a constant value. It represents points in the domain of the function where the function's value is the same.");
        addStudentAnswerToProblemAnswer(pa13c_4, sa13c_4_student8);

        StudentAnswer sa13c_5_student8 = createStudentAnswer(student8, pa13c_5, "A multiple integral is an integral that involves more than one variable. It is used to calculate the volume under a surface or the accumulation of a quantity over a region.");
        addStudentAnswerToProblemAnswer(pa13c_5, sa13c_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa13d_1_student7 = createStudentAnswer(student7, pa13d_1, "A vector field is a function that assigns a vector to every point in a space. It represents the direction and magnitude of a vector quantity, such as velocity or force, at each point.");
        addStudentAnswerToProblemAnswer(pa13d_1, sa13d_1_student7);

        StudentAnswer sa13d_2_student7 = createStudentAnswer(student7, pa13d_2, "A line integral is an integral that evaluates the work done by a vector field along a curve. It is given by the integral of the dot product of the vector field and the differential element of the curve.");
        addStudentAnswerToProblemAnswer(pa13d_2, sa13d_2_student7);

        StudentAnswer sa13d_3_student7 = createStudentAnswer(student7, pa13d_3, "Green's Theorem relates the line integral around a simple closed curve to the double integral over the region enclosed by the curve. It is given by ∮C F ⋅ dr = ∬R (∂N/∂x - ∂M/∂y) dA, where F = (M, N) is the vector field.");
        addStudentAnswerToProblemAnswer(pa13d_3, sa13d_3_student7);

        StudentAnswer sa13d_4_student7 = createStudentAnswer(student7, pa13d_4, "A surface integral is an integral that evaluates the flux of a vector field through a surface. It is given by the integral of the dot product of the vector field and the differential element of the surface.");
        addStudentAnswerToProblemAnswer(pa13d_4, sa13d_4_student7);

        StudentAnswer sa13d_5_student7 = createStudentAnswer(student7, pa13d_5, "Stokes' Theorem relates the surface integral of the curl of a vector field over a surface to the line integral of the vector field around the boundary of the surface. It is given by ∬S curl(F) ⋅ dS = ∮C F ⋅ dr.");
        addStudentAnswerToProblemAnswer(pa13d_5, sa13d_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa13d_1_student8 = createStudentAnswer(student8, pa13d_1, "A vector field is a function that assigns a vector to every point in a space. It represents the direction and magnitude of a vector quantity, such as velocity or force, at each point.");
        addStudentAnswerToProblemAnswer(pa13d_1, sa13d_1_student8);

        StudentAnswer sa13d_2_student8 = createStudentAnswer(student8, pa13d_2, "A line integral is an integral that evaluates the work done by a vector field along a curve. It is given by the integral of the dot product of the vector field and the differential element of the curve.");
        addStudentAnswerToProblemAnswer(pa13d_2, sa13d_2_student8);

        StudentAnswer sa13d_3_student8 = createStudentAnswer(student8, pa13d_3, "Green's Theorem relates the line integral around a simple closed curve to the double integral over the region enclosed by the curve. It is given by ∮C F ⋅ dr = ∬R (∂N/∂x - ∂M/∂y) dA, where F = (M, N) is the vector field.");
        addStudentAnswerToProblemAnswer(pa13d_3, sa13d_3_student8);

        StudentAnswer sa13d_4_student8 = createStudentAnswer(student8, pa13d_4, "A surface integral is an integral that evaluates the flux of a vector field through a surface. It is given by the integral of the dot product of the vector field and the differential element of the surface.");
        addStudentAnswerToProblemAnswer(pa13d_4, sa13d_4_student8);

        StudentAnswer sa13d_5_student8 = createStudentAnswer(student8, pa13d_5, "Stokes' Theorem relates the surface integral of the curl of a vector field over a surface to the line integral of the vector field around the boundary of the surface. It is given by ∬S curl(F) ⋅ dS = ∮C F ⋅ dr.");
        addStudentAnswerToProblemAnswer(pa13d_5, sa13d_5_student8);

// Creating StudentAnswer instances for student7
        StudentAnswer sa14a_1_student7 = createStudentAnswer(student7, pa14a_1, "Propositional logic is a branch of logic that deals with propositions, which are statements that can be either true or false. It uses logical connectives such as AND, OR, and NOT to form complex logical expressions.");
        addStudentAnswerToProblemAnswer(pa14a_1, sa14a_1_student7);

        StudentAnswer sa14a_2_student7 = createStudentAnswer(student7, pa14a_2, "Predicate logic, also known as first-order logic, is a branch of logic that extends propositional logic by dealing with predicates, which are functions that return true or false based on the values of their variables. It includes quantifiers such as 'forall' and 'exists'.");
        addStudentAnswerToProblemAnswer(pa14a_2, sa14a_2_student7);

        StudentAnswer sa14a_3_student7 = createStudentAnswer(student7, pa14a_3, "Logical connectives are symbols or words used to connect propositions and form complex logical expressions. Common logical connectives include AND (∧), OR (∨), NOT (¬), IMPLIES (→), and IFF (↔).");
        addStudentAnswerToProblemAnswer(pa14a_3, sa14a_3_student7);

        StudentAnswer sa14a_4_student7 = createStudentAnswer(student7, pa14a_4, "A truth table is a tabular representation of all possible truth values of logical expressions. It lists all possible combinations of truth values for the variables involved and the resulting truth value of the expression for each combination.");
        addStudentAnswerToProblemAnswer(pa14a_4, sa14a_4_student7);

        StudentAnswer sa14a_5_student7 = createStudentAnswer(student7, pa14a_5, "Logical equivalence is a relationship between two logical expressions that have the same truth values in all possible scenarios. If two expressions are logically equivalent, they can be substituted for each other in logical arguments.");
        addStudentAnswerToProblemAnswer(pa14a_5, sa14a_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa14a_1_student8 = createStudentAnswer(student8, pa14a_1, "Propositional logic is a branch of logic that deals with propositions, which are statements that can be either true or false. It uses logical connectives such as AND, OR, and NOT to form complex logical expressions.");
        addStudentAnswerToProblemAnswer(pa14a_1, sa14a_1_student8);

        StudentAnswer sa14a_2_student8 = createStudentAnswer(student8, pa14a_2, "Predicate logic, also known as first-order logic, is a branch of logic that extends propositional logic by dealing with predicates, which are functions that return true or false based on the values of their variables. It includes quantifiers such as 'forall' and 'exists'.");
        addStudentAnswerToProblemAnswer(pa14a_2, sa14a_2_student8);

        StudentAnswer sa14a_3_student8 = createStudentAnswer(student8, pa14a_3, "Logical connectives are symbols or words used to connect propositions and form complex logical expressions. Common logical connectives include AND (∧), OR (∨), NOT (¬), IMPLIES (→), and IFF (↔).");
        addStudentAnswerToProblemAnswer(pa14a_3, sa14a_3_student8);

        StudentAnswer sa14a_4_student8 = createStudentAnswer(student8, pa14a_4, "A truth table is a tabular representation of all possible truth values of logical expressions. It lists all possible combinations of truth values for the variables involved and the resulting truth value of the expression for each combination.");
        addStudentAnswerToProblemAnswer(pa14a_4, sa14a_4_student8);

        StudentAnswer sa14a_5_student8 = createStudentAnswer(student8, pa14a_5, "Logical equivalence is a relationship between two logical expressions that have the same truth values in all possible scenarios. If two expressions are logically equivalent, they can be substituted for each other in logical arguments.");
        addStudentAnswerToProblemAnswer(pa14a_5, sa14a_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa14b_1_student7 = createStudentAnswer(student7, pa14b_1, "A set is a collection of distinct objects, considered as an object in its own right. Sets are usually denoted by capital letters and their elements are listed within curly brackets, e.g., A = {1, 2, 3}.");
        addStudentAnswerToProblemAnswer(pa14b_1, sa14b_1_student7);

        StudentAnswer sa14b_2_student7 = createStudentAnswer(student7, pa14b_2, "A subset is a set whose elements are all contained in another set. If A and B are sets, A is a subset of B if every element of A is also an element of B, denoted as A ⊆ B.");
        addStudentAnswerToProblemAnswer(pa14b_2, sa14b_2_student7);

        StudentAnswer sa14b_3_student7 = createStudentAnswer(student7, pa14b_3, "The union of sets is a set containing all elements from the given sets. For sets A and B, the union is denoted as A ∪ B and consists of all elements that are in A, in B, or in both.");
        addStudentAnswerToProblemAnswer(pa14b_3, sa14b_3_student7);

        StudentAnswer sa14b_4_student7 = createStudentAnswer(student7, pa14b_4, "The intersection of sets is a set containing only the elements that are common to the given sets. For sets A and B, the intersection is denoted as A ∩ B and consists of all elements that are in both A and B.");
        addStudentAnswerToProblemAnswer(pa14b_4, sa14b_4_student7);

        StudentAnswer sa14b_5_student7 = createStudentAnswer(student7, pa14b_5, "The difference of sets is a set containing the elements that are in one set but not in another. For sets A and B, the difference is denoted as A - B and consists of all elements that are in A but not in B.");
        addStudentAnswerToProblemAnswer(pa14b_5, sa14b_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa14b_1_student8 = createStudentAnswer(student8, pa14b_1, "A set is a collection of distinct objects, considered as an object in its own right. Sets are usually denoted by capital letters and their elements are listed within curly brackets, e.g., A = {1, 2, 3}.");
        addStudentAnswerToProblemAnswer(pa14b_1, sa14b_1_student8);

        StudentAnswer sa14b_2_student8 = createStudentAnswer(student8, pa14b_2, "A subset is a set whose elements are all contained in another set. If A and B are sets, A is a subset of B if every element of A is also an element of B, denoted as A ⊆ B.");
        addStudentAnswerToProblemAnswer(pa14b_2, sa14b_2_student8);

        StudentAnswer sa14b_3_student8 = createStudentAnswer(student8, pa14b_3, "The union of sets is a set containing all elements from the given sets. For sets A and B, the union is denoted as A ∪ B and consists of all elements that are in A, in B, or in both.");
        addStudentAnswerToProblemAnswer(pa14b_3, sa14b_3_student8);

        StudentAnswer sa14b_4_student8 = createStudentAnswer(student8, pa14b_4, "The intersection of sets is a set containing only the elements that are common to the given sets. For sets A and B, the intersection is denoted as A ∩ B and consists of all elements that are in both A and B.");
        addStudentAnswerToProblemAnswer(pa14b_4, sa14b_4_student8);

        StudentAnswer sa14b_5_student8 = createStudentAnswer(student8, pa14b_5, "The difference of sets is a set containing the elements that are in one set but not in another. For sets A and B, the difference is denoted as A - B and consists of all elements that are in A but not in B.");
        addStudentAnswerToProblemAnswer(pa14b_5, sa14b_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa14c_1_student7 = createStudentAnswer(student7, pa14c_1, "A graph is a mathematical structure consisting of a set of vertices (nodes) and a set of edges (lines) that connect pairs of vertices. Graphs are used to model pairwise relations between objects.");
        addStudentAnswerToProblemAnswer(pa14c_1, sa14c_1_student7);

        StudentAnswer sa14c_2_student7 = createStudentAnswer(student7, pa14c_2, "In a directed graph, edges have a direction, indicating a one-way relationship between vertices. In an undirected graph, edges have no direction, indicating a two-way relationship between vertices.");
        addStudentAnswerToProblemAnswer(pa14c_2, sa14c_2_student7);

        StudentAnswer sa14c_3_student7 = createStudentAnswer(student7, pa14c_3, "A path in a graph is a sequence of vertices connected by edges. A path can be simple (no repeated vertices) or general (vertices can be repeated). The length of a path is the number of edges it contains.");
        addStudentAnswerToProblemAnswer(pa14c_3, sa14c_3_student7);

        StudentAnswer sa14c_4_student7 = createStudentAnswer(student7, pa14c_4, "A cycle in a graph is a path that starts and ends at the same vertex, with no other repeated vertices. Cycles are used to study the connectivity and structure of graphs.");
        addStudentAnswerToProblemAnswer(pa14c_4, sa14c_4_student7);

        StudentAnswer sa14c_5_student7 = createStudentAnswer(student7, pa14c_5, "A connected graph is a graph in which there is a path between every pair of vertices. In a connected graph, all vertices are reachable from any other vertex.");
        addStudentAnswerToProblemAnswer(pa14c_5, sa14c_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa14c_1_student8 = createStudentAnswer(student8, pa14c_1, "A graph is a mathematical structure consisting of a set of vertices (nodes) and a set of edges (lines) that connect pairs of vertices. Graphs are used to model pairwise relations between objects.");
        addStudentAnswerToProblemAnswer(pa14c_1, sa14c_1_student8);

        StudentAnswer sa14c_2_student8 = createStudentAnswer(student8, pa14c_2, "In a directed graph, edges have a direction, indicating a one-way relationship between vertices. In an undirected graph, edges have no direction, indicating a two-way relationship between vertices.");
        addStudentAnswerToProblemAnswer(pa14c_2, sa14c_2_student8);

        StudentAnswer sa14c_3_student8 = createStudentAnswer(student8, pa14c_3, "A path in a graph is a sequence of vertices connected by edges. A path can be simple (no repeated vertices) or general (vertices can be repeated). The length of a path is the number of edges it contains.");
        addStudentAnswerToProblemAnswer(pa14c_3, sa14c_3_student8);

        StudentAnswer sa14c_4_student8 = createStudentAnswer(student8, pa14c_4, "A cycle in a graph is a path that starts and ends at the same vertex, with no other repeated vertices. Cycles are used to study the connectivity and structure of graphs.");
        addStudentAnswerToProblemAnswer(pa14c_4, sa14c_4_student8);

        StudentAnswer sa14c_5_student8 = createStudentAnswer(student8, pa14c_5, "A connected graph is a graph in which there is a path between every pair of vertices. In a connected graph, all vertices are reachable from any other vertex.");
        addStudentAnswerToProblemAnswer(pa14c_5, sa14c_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa14d_1_student7 = createStudentAnswer(student7, pa14d_1, "Combinatorics is the branch of mathematics that deals with counting, arrangement, and combination of objects. It involves studying finite structures and solving problems related to discrete objects.");
        addStudentAnswerToProblemAnswer(pa14d_1, sa14d_1_student7);

        StudentAnswer sa14d_2_student7 = createStudentAnswer(student7, pa14d_2, "A permutation is an arrangement of objects in a specific order. The number of permutations of n distinct objects is given by n!, where ! denotes factorial.");
        addStudentAnswerToProblemAnswer(pa14d_2, sa14d_2_student7);

        StudentAnswer sa14d_3_student7 = createStudentAnswer(student7, pa14d_3, "A combination is a selection of objects without regard to order. The number of combinations of n objects taken r at a time is given by the binomial coefficient C(n, r) = n! / (r!(n - r)!).");
        addStudentAnswerToProblemAnswer(pa14d_3, sa14d_3_student7);

        StudentAnswer sa14d_4_student7 = createStudentAnswer(student7, pa14d_4, "The principle of inclusion-exclusion is a method for counting the number of elements in the union of overlapping sets. It involves adding the sizes of individual sets and subtracting the sizes of their pairwise intersections, and so on.");
        addStudentAnswerToProblemAnswer(pa14d_4, sa14d_4_student7);

        StudentAnswer sa14d_5_student7 = createStudentAnswer(student7, pa14d_5, "A binomial coefficient, denoted C(n, r) or (n choose r), represents the number of ways to choose r objects from a set of n objects without regard to order. It is given by the formula C(n, r) = n! / (r!(n - r)!).");
        addStudentAnswerToProblemAnswer(pa14d_5, sa14d_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa14d_1_student8 = createStudentAnswer(student8, pa14d_1, "Combinatorics is the branch of mathematics that deals with counting, arrangement, and combination of objects. It involves studying finite structures and solving problems related to discrete objects.");
        addStudentAnswerToProblemAnswer(pa14d_1, sa14d_1_student8);

        StudentAnswer sa14d_2_student8 = createStudentAnswer(student8, pa14d_2, "A permutation is an arrangement of objects in a specific order. The number of permutations of n distinct objects is given by n!, where ! denotes factorial.");
        addStudentAnswerToProblemAnswer(pa14d_2, sa14d_2_student8);

        StudentAnswer sa14d_3_student8 = createStudentAnswer(student8, pa14d_3, "A combination is a selection of objects without regard to order. The number of combinations of n objects taken r at a time is given by the binomial coefficient C(n, r) = n! / (r!(n - r)!).");
        addStudentAnswerToProblemAnswer(pa14d_3, sa14d_3_student8);

        StudentAnswer sa14d_4_student8 = createStudentAnswer(student8, pa14d_4, "The principle of inclusion-exclusion is a method for counting the number of elements in the union of overlapping sets. It involves adding the sizes of individual sets and subtracting the sizes of their pairwise intersections, and so on.");
        addStudentAnswerToProblemAnswer(pa14d_4, sa14d_4_student8);

        StudentAnswer sa14d_5_student8 = createStudentAnswer(student8, pa14d_5, "A binomial coefficient, denoted C(n, r) or (n choose r), represents the number of ways to choose r objects from a set of n objects without regard to order. It is given by the formula C(n, r) = n! / (r!(n - r)!).");
        addStudentAnswerToProblemAnswer(pa14d_5, sa14d_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa15a_1_student7 = createStudentAnswer(student7, pa15a_1, "Newton's First Law of Motion, also known as the Law of Inertia, states that an object will remain at rest or in uniform motion in a straight line unless acted upon by an external force.");
        addStudentAnswerToProblemAnswer(pa15a_1, sa15a_1_student7);

        StudentAnswer sa15a_2_student7 = createStudentAnswer(student7, pa15a_2, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. It is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addStudentAnswerToProblemAnswer(pa15a_2, sa15a_2_student7);

        StudentAnswer sa15a_3_student7 = createStudentAnswer(student7, pa15a_3, "Newton's Third Law of Motion states that for every action, there is an equal and opposite reaction. This means that if one body exerts a force on another body, the second body exerts a force of equal magnitude but in the opposite direction on the first body.");
        addStudentAnswerToProblemAnswer(pa15a_3, sa15a_3_student7);

        StudentAnswer sa15a_4_student7 = createStudentAnswer(student7, pa15a_4, "Inertia is the property of an object to resist changes in its state of motion. It is directly related to the mass of the object: the greater the mass, the greater the inertia.");
        addStudentAnswerToProblemAnswer(pa15a_4, sa15a_4_student7);

        StudentAnswer sa15a_5_student7 = createStudentAnswer(student7, pa15a_5, "In a car crash, the passengers inside the car continue moving at the car's speed due to inertia until an external force, such as a seatbelt or airbag, acts to decelerate them and bring them to a stop.");
        addStudentAnswerToProblemAnswer(pa15a_5, sa15a_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa15a_1_student8 = createStudentAnswer(student8, pa15a_1, "Newton's First Law of Motion, also known as the Law of Inertia, states that an object will remain at rest or in uniform motion in a straight line unless acted upon by an external force.");
        addStudentAnswerToProblemAnswer(pa15a_1, sa15a_1_student8);

        StudentAnswer sa15a_2_student8 = createStudentAnswer(student8, pa15a_2, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. It is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addStudentAnswerToProblemAnswer(pa15a_2, sa15a_2_student8);

        StudentAnswer sa15a_3_student8 = createStudentAnswer(student8, pa15a_3, "Newton's Third Law of Motion states that for every action, there is an equal and opposite reaction. This means that if one body exerts a force on another body, the second body exerts a force of equal magnitude but in the opposite direction on the first body.");
        addStudentAnswerToProblemAnswer(pa15a_3, sa15a_3_student8);

        StudentAnswer sa15a_4_student8 = createStudentAnswer(student8, pa15a_4, "Inertia is the property of an object to resist changes in its state of motion. It is directly related to the mass of the object: the greater the mass, the greater the inertia.");
        addStudentAnswerToProblemAnswer(pa15a_4, sa15a_4_student8);

        StudentAnswer sa15a_5_student8 = createStudentAnswer(student8, pa15a_5, "In a car crash, the passengers inside the car continue moving at the car's speed due to inertia until an external force, such as a seatbelt or airbag, acts to decelerate them and bring them to a stop.");
        addStudentAnswerToProblemAnswer(pa15a_5, sa15a_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa15b_1_student7 = createStudentAnswer(student7, pa15b_1, "Kinetic energy is the energy possessed by an object due to its motion. It is calculated using the formula KE = 1/2 mv^2, where m is the mass and v is the velocity of the object.");
        addStudentAnswerToProblemAnswer(pa15b_1, sa15b_1_student7);

        StudentAnswer sa15b_2_student7 = createStudentAnswer(student7, pa15b_2, "Potential energy is the energy stored in an object due to its position or configuration. Examples include gravitational potential energy (U = mgh) and elastic potential energy (U = 1/2 kx^2).");
        addStudentAnswerToProblemAnswer(pa15b_2, sa15b_2_student7);

        StudentAnswer sa15b_3_student7 = createStudentAnswer(student7, pa15b_3, "The work-energy theorem states that the work done on an object is equal to the change in its kinetic energy. It is expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        addStudentAnswerToProblemAnswer(pa15b_3, sa15b_3_student7);

        StudentAnswer sa15b_4_student7 = createStudentAnswer(student7, pa15b_4, "The principle of conservation of energy states that energy cannot be created or destroyed, only transformed from one form to another. The total energy in an isolated system remains constant.");
        addStudentAnswerToProblemAnswer(pa15b_4, sa15b_4_student7);

        StudentAnswer sa15b_5_student7 = createStudentAnswer(student7, pa15b_5, "Power is the rate at which work is done or energy is transferred. It is calculated using the formula P = W/t, where P is power, W is work, and t is time. The unit of power is the watt (W).");
        addStudentAnswerToProblemAnswer(pa15b_5, sa15b_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa15b_1_student8 = createStudentAnswer(student8, pa15b_1, "Kinetic energy is the energy possessed by an object due to its motion. It is calculated using the formula KE = 1/2 mv^2, where m is the mass and v is the velocity of the object.");
        addStudentAnswerToProblemAnswer(pa15b_1, sa15b_1_student8);

        StudentAnswer sa15b_2_student8 = createStudentAnswer(student8, pa15b_2, "Potential energy is the energy stored in an object due to its position or configuration. Examples include gravitational potential energy (U = mgh) and elastic potential energy (U = 1/2 kx^2).");
        addStudentAnswerToProblemAnswer(pa15b_2, sa15b_2_student8);

        StudentAnswer sa15b_3_student8 = createStudentAnswer(student8, pa15b_3, "The work-energy theorem states that the work done on an object is equal to the change in its kinetic energy. It is expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        addStudentAnswerToProblemAnswer(pa15b_3, sa15b_3_student8);

        StudentAnswer sa15b_4_student8 = createStudentAnswer(student8, pa15b_4, "The principle of conservation of energy states that energy cannot be created or destroyed, only transformed from one form to another. The total energy in an isolated system remains constant.");
        addStudentAnswerToProblemAnswer(pa15b_4, sa15b_4_student8);

        StudentAnswer sa15b_5_student8 = createStudentAnswer(student8, pa15b_5, "Power is the rate at which work is done or energy is transferred. It is calculated using the formula P = W/t, where P is power, W is work, and t is time. The unit of power is the watt (W).");
        addStudentAnswerToProblemAnswer(pa15b_5, sa15b_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa15c_1_student7 = createStudentAnswer(student7, pa15c_1, "Linear motion is the movement of an object along a straight line. It can be described by parameters such as displacement, velocity, and acceleration.");
        addStudentAnswerToProblemAnswer(pa15c_1, sa15c_1_student7);

        StudentAnswer sa15c_2_student7 = createStudentAnswer(student7, pa15c_2, "Projectile motion is the curved path that an object follows when it is thrown or propelled near the surface of the Earth. It is influenced by gravity and can be analyzed using the equations of motion.");
        addStudentAnswerToProblemAnswer(pa15c_2, sa15c_2_student7);

        StudentAnswer sa15c_3_student7 = createStudentAnswer(student7, pa15c_3, "Circular motion is the movement of an object along a circular path. It can be characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        addStudentAnswerToProblemAnswer(pa15c_3, sa15c_3_student7);

        StudentAnswer sa15c_4_student7 = createStudentAnswer(student7, pa15c_4, "Velocity is the rate of change of displacement with respect to time. It is a vector quantity with both magnitude and direction. The formula for velocity is v = Δx / Δt, where Δx is the displacement and Δt is the time interval.");
        addStudentAnswerToProblemAnswer(pa15c_4, sa15c_4_student7);

        StudentAnswer sa15c_5_student7 = createStudentAnswer(student7, pa15c_5, "Acceleration is the rate of change of velocity with respect to time. It is a vector quantity and can be positive (speeding up) or negative (slowing down). The formula for acceleration is a = Δv / Δt, where Δv is the change in velocity and Δt is the time interval.");
        addStudentAnswerToProblemAnswer(pa15c_5, sa15c_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa15c_1_student8 = createStudentAnswer(student8, pa15c_1, "Linear motion is the movement of an object along a straight line. It can be described by parameters such as displacement, velocity, and acceleration.");
        addStudentAnswerToProblemAnswer(pa15c_1, sa15c_1_student8);

        StudentAnswer sa15c_2_student8 = createStudentAnswer(student8, pa15c_2, "Projectile motion is the curved path that an object follows when it is thrown or propelled near the surface of the Earth. It is influenced by gravity and can be analyzed using the equations of motion.");
        addStudentAnswerToProblemAnswer(pa15c_2, sa15c_2_student8);

        StudentAnswer sa15c_3_student8 = createStudentAnswer(student8, pa15c_3, "Circular motion is the movement of an object along a circular path. It can be characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        addStudentAnswerToProblemAnswer(pa15c_3, sa15c_3_student8);

        StudentAnswer sa15c_4_student8 = createStudentAnswer(student8, pa15c_4, "Velocity is the rate of change of displacement with respect to time. It is a vector quantity with both magnitude and direction. The formula for velocity is v = Δx / Δt, where Δx is the displacement and Δt is the time interval.");
        addStudentAnswerToProblemAnswer(pa15c_4, sa15c_4_student8);

        StudentAnswer sa15c_5_student8 = createStudentAnswer(student8, pa15c_5, "Acceleration is the rate of change of velocity with respect to time. It is a vector quantity and can be positive (speeding up) or negative (slowing down). The formula for acceleration is a = Δv / Δt, where Δv is the change in velocity and Δt is the time interval.");
        addStudentAnswerToProblemAnswer(pa15c_5, sa15c_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa16a_1_student7 = createStudentAnswer(student7, pa16a_1, "The three main subatomic particles in an atom are protons, neutrons, and electrons. Protons and neutrons are located in the nucleus, while electrons orbit the nucleus.");
        addStudentAnswerToProblemAnswer(pa16a_1, sa16a_1_student7);

        StudentAnswer sa16a_2_student7 = createStudentAnswer(student7, pa16a_2, "The atomic number of an element is the number of protons in the nucleus of an atom. It determines the identity of the element and its position in the periodic table.");
        addStudentAnswerToProblemAnswer(pa16a_2, sa16a_2_student7);

        StudentAnswer sa16a_3_student7 = createStudentAnswer(student7, pa16a_3, "The mass number of an atom is the total number of protons and neutrons in its nucleus. It is represented as A and can be calculated as A = Z + N, where Z is the atomic number and N is the number of neutrons.");
        addStudentAnswerToProblemAnswer(pa16a_3, sa16a_3_student7);

        StudentAnswer sa16a_4_student7 = createStudentAnswer(student7, pa16a_4, "Isotopes are variants of a given chemical element that have the same number of protons but different numbers of neutrons. This results in different mass numbers for the isotopes.");
        addStudentAnswerToProblemAnswer(pa16a_4, sa16a_4_student7);

        StudentAnswer sa16a_5_student7 = createStudentAnswer(student7, pa16a_5, "An electron configuration is the distribution of electrons in an atom's orbitals. It follows the Aufbau principle, Hund's rule, and the Pauli exclusion principle to determine the most stable arrangement of electrons.");
        addStudentAnswerToProblemAnswer(pa16a_5, sa16a_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa16a_1_student8 = createStudentAnswer(student8, pa16a_1, "The three main subatomic particles in an atom are protons, neutrons, and electrons. Protons and neutrons are located in the nucleus, while electrons orbit the nucleus.");
        addStudentAnswerToProblemAnswer(pa16a_1, sa16a_1_student8);

        StudentAnswer sa16a_2_student8 = createStudentAnswer(student8, pa16a_2, "The atomic number of an element is the number of protons in the nucleus of an atom. It determines the identity of the element and its position in the periodic table.");
        addStudentAnswerToProblemAnswer(pa16a_2, sa16a_2_student8);

        StudentAnswer sa16a_3_student8 = createStudentAnswer(student8, pa16a_3, "The mass number of an atom is the total number of protons and neutrons in its nucleus. It is represented as A and can be calculated as A = Z + N, where Z is the atomic number and N is the number of neutrons.");
        addStudentAnswerToProblemAnswer(pa16a_3, sa16a_3_student8);

        StudentAnswer sa16a_4_student8 = createStudentAnswer(student8, pa16a_4, "Isotopes are variants of a given chemical element that have the same number of protons but different numbers of neutrons. This results in different mass numbers for the isotopes.");
        addStudentAnswerToProblemAnswer(pa16a_4, sa16a_4_student8);

        StudentAnswer sa16a_5_student8 = createStudentAnswer(student8, pa16a_5, "An electron configuration is the distribution of electrons in an atom's orbitals. It follows the Aufbau principle, Hund's rule, and the Pauli exclusion principle to determine the most stable arrangement of electrons.");
        addStudentAnswerToProblemAnswer(pa16a_5, sa16a_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa16b_1_student7 = createStudentAnswer(student7, pa16b_1, "An ionic bond is a type of chemical bond formed through the electrostatic attraction between oppositely charged ions. It typically occurs between a metal and a non-metal.");
        addStudentAnswerToProblemAnswer(pa16b_1, sa16b_1_student7);

        StudentAnswer sa16b_2_student7 = createStudentAnswer(student7, pa16b_2, "A covalent bond is a type of chemical bond where two atoms share one or more pairs of electrons. It usually occurs between non-metal atoms.");
        addStudentAnswerToProblemAnswer(pa16b_2, sa16b_2_student7);

        StudentAnswer sa16b_3_student7 = createStudentAnswer(student7, pa16b_3, "A metallic bond is a type of chemical bond found in metals, where electrons are shared and move freely among a lattice of metal atoms. This creates a 'sea of electrons' that contributes to the conductivity and malleability of metals.");
        addStudentAnswerToProblemAnswer(pa16b_3, sa16b_3_student7);

        StudentAnswer sa16b_4_student7 = createStudentAnswer(student7, pa16b_4, "Electronegativity is a measure of an atom's ability to attract and hold onto electrons in a chemical bond. Elements with high electronegativity tend to attract electrons more strongly.");
        addStudentAnswerToProblemAnswer(pa16b_4, sa16b_4_student7);

        StudentAnswer sa16b_5_student7 = createStudentAnswer(student7, pa16b_5, "A polar covalent bond is a type of covalent bond in which the electrons are not shared equally between the atoms. This results in a partial positive charge on one atom and a partial negative charge on the other.");
        addStudentAnswerToProblemAnswer(pa16b_5, sa16b_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa16b_1_student8 = createStudentAnswer(student8, pa16b_1, "An ionic bond is a type of chemical bond formed through the electrostatic attraction between oppositely charged ions. It typically occurs between a metal and a non-metal.");
        addStudentAnswerToProblemAnswer(pa16b_1, sa16b_1_student8);

        StudentAnswer sa16b_2_student8 = createStudentAnswer(student8, pa16b_2, "A covalent bond is a type of chemical bond where two atoms share one or more pairs of electrons. It usually occurs between non-metal atoms.");
        addStudentAnswerToProblemAnswer(pa16b_2, sa16b_2_student8);

        StudentAnswer sa16b_3_student8 = createStudentAnswer(student8, pa16b_3, "A metallic bond is a type of chemical bond found in metals, where electrons are shared and move freely among a lattice of metal atoms. This creates a 'sea of electrons' that contributes to the conductivity and malleability of metals.");
        addStudentAnswerToProblemAnswer(pa16b_3, sa16b_3_student8);

        StudentAnswer sa16b_4_student8 = createStudentAnswer(student8, pa16b_4, "Electronegativity is a measure of an atom's ability to attract and hold onto electrons in a chemical bond. Elements with high electronegativity tend to attract electrons more strongly.");
        addStudentAnswerToProblemAnswer(pa16b_4, sa16b_4_student8);

        StudentAnswer sa16b_5_student8 = createStudentAnswer(student8, pa16b_5, "A polar covalent bond is a type of covalent bond in which the electrons are not shared equally between the atoms. This results in a partial positive charge on one atom and a partial negative charge on the other.");
        addStudentAnswerToProblemAnswer(pa16b_5, sa16b_5_student8);

        // Creating StudentAnswer instances for student7
        StudentAnswer sa16c_1_student7 = createStudentAnswer(student7, pa16c_1, "Chemical reactions are processes in which one or more substances (reactants) are converted into one or more different substances (products). They involve the breaking and forming of chemical bonds.");
        addStudentAnswerToProblemAnswer(pa16c_1, sa16c_1_student7);

        StudentAnswer sa16c_2_student7 = createStudentAnswer(student7, pa16c_2, "The main types of chemical reactions include synthesis (combination), decomposition, single displacement (substitution), double displacement (metathesis), and combustion reactions.");
        addStudentAnswerToProblemAnswer(pa16c_2, sa16c_2_student7);

        StudentAnswer sa16c_3_student7 = createStudentAnswer(student7, pa16c_3, "A synthesis reaction is a type of chemical reaction in which two or more reactants combine to form a single product. It is represented by the general equation: A + B → AB.");
        addStudentAnswerToProblemAnswer(pa16c_3, sa16c_3_student7);

        StudentAnswer sa16c_4_student7 = createStudentAnswer(student7, pa16c_4, "A decomposition reaction is a type of chemical reaction in which a single compound breaks down into two or more simpler products. It is represented by the general equation: AB → A + B.");
        addStudentAnswerToProblemAnswer(pa16c_4, sa16c_4_student7);

        StudentAnswer sa16c_5_student7 = createStudentAnswer(student7, pa16c_5, "A single displacement reaction, also known as a substitution reaction, is a type of chemical reaction in which one element replaces another in a compound. It is represented by the general equation: A + BC → AC + B.");
        addStudentAnswerToProblemAnswer(pa16c_5, sa16c_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa16c_1_student8 = createStudentAnswer(student8, pa16c_1, "Chemical reactions are processes in which one or more substances (reactants) are converted into one or more different substances (products). They involve the breaking and forming of chemical bonds.");
        addStudentAnswerToProblemAnswer(pa16c_1, sa16c_1_student8);

        StudentAnswer sa16c_2_student8 = createStudentAnswer(student8, pa16c_2, "The main types of chemical reactions include synthesis (combination), decomposition, single displacement (substitution), double displacement (metathesis), and combustion reactions.");
        addStudentAnswerToProblemAnswer(pa16c_2, sa16c_2_student8);

        StudentAnswer sa16c_3_student8 = createStudentAnswer(student8, pa16c_3, "A synthesis reaction is a type of chemical reaction in which two or more reactants combine to form a single product. It is represented by the general equation: A + B → AB.");
        addStudentAnswerToProblemAnswer(pa16c_3, sa16c_3_student8);

        StudentAnswer sa16c_4_student8 = createStudentAnswer(student8, pa16c_4, "A decomposition reaction is a type of chemical reaction in which a single compound breaks down into two or more simpler products. It is represented by the general equation: AB → A + B.");
        addStudentAnswerToProblemAnswer(pa16c_4, sa16c_4_student8);

        StudentAnswer sa16c_5_student8 = createStudentAnswer(student8, pa16c_5, "A single displacement reaction, also known as a substitution reaction, is a type of chemical reaction in which one element replaces another in a compound. It is represented by the general equation: A + BC → AC + B.");
        addStudentAnswerToProblemAnswer(pa16c_5, sa16c_5_student8);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa17a_1_student9 = createStudentAnswer(student9, pa17a_1, "The main components of a cell include the cell membrane, nucleus, cytoplasm, and various organelles such as mitochondria, ribosomes, endoplasmic reticulum, Golgi apparatus, and lysosomes.");
        addStudentAnswerToProblemAnswer(pa17a_1, sa17a_1_student9);

        StudentAnswer sa17a_2_student9 = createStudentAnswer(student9, pa17a_2, "The cell membrane, also known as the plasma membrane, controls the movement of substances in and out of the cell. It provides protection and support to the cell and helps maintain its shape.");
        addStudentAnswerToProblemAnswer(pa17a_2, sa17a_2_student9);

        StudentAnswer sa17a_3_student9 = createStudentAnswer(student9, pa17a_3, "The nucleus is the control center of the cell, containing the cell's genetic material (DNA). It regulates gene expression, cell growth, and reproduction, and directs various cellular activities.");
        addStudentAnswerToProblemAnswer(pa17a_3, sa17a_3_student9);

        StudentAnswer sa17a_4_student9 = createStudentAnswer(student9, pa17a_4, "Organelles are specialized structures within a cell that perform specific functions. Examples include mitochondria (energy production), ribosomes (protein synthesis), and the endoplasmic reticulum (protein and lipid processing).");
        addStudentAnswerToProblemAnswer(pa17a_4, sa17a_4_student9);

        StudentAnswer sa17a_5_student9 = createStudentAnswer(student9, pa17a_5, "Prokaryotic cells lack a true nucleus and membrane-bound organelles, while eukaryotic cells have a defined nucleus and various membrane-bound organelles. Prokaryotes include bacteria and archaea, whereas eukaryotes include plants, animals, fungi, and protists.");
        addStudentAnswerToProblemAnswer(pa17a_5, sa17a_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa17a_1_student10 = createStudentAnswer(student10, pa17a_1, "The main components of a cell include the cell membrane, nucleus, cytoplasm, and various organelles such as mitochondria, ribosomes, endoplasmic reticulum, Golgi apparatus, and lysosomes.");
        addStudentAnswerToProblemAnswer(pa17a_1, sa17a_1_student10);

        StudentAnswer sa17a_2_student10 = createStudentAnswer(student10, pa17a_2, "The cell membrane, also known as the plasma membrane, controls the movement of substances in and out of the cell. It provides protection and support to the cell and helps maintain its shape.");
        addStudentAnswerToProblemAnswer(pa17a_2, sa17a_2_student10);

        StudentAnswer sa17a_3_student10 = createStudentAnswer(student10, pa17a_3, "The nucleus is the control center of the cell, containing the cell's genetic material (DNA). It regulates gene expression, cell growth, and reproduction, and directs various cellular activities.");
        addStudentAnswerToProblemAnswer(pa17a_3, sa17a_3_student10);

        StudentAnswer sa17a_4_student10 = createStudentAnswer(student10, pa17a_4, "Organelles are specialized structures within a cell that perform specific functions. Examples include mitochondria (energy production), ribosomes (protein synthesis), and the endoplasmic reticulum (protein and lipid processing).");
        addStudentAnswerToProblemAnswer(pa17a_4, sa17a_4_student10);

        StudentAnswer sa17a_5_student10 = createStudentAnswer(student10, pa17a_5, "Prokaryotic cells lack a true nucleus and membrane-bound organelles, while eukaryotic cells have a defined nucleus and various membrane-bound organelles. Prokaryotes include bacteria and archaea, whereas eukaryotes include plants, animals, fungi, and protists.");
        addStudentAnswerToProblemAnswer(pa17a_5, sa17a_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa17b_1_student9 = createStudentAnswer(student9, pa17b_1, "Genetics is the study of heredity and the variation of inherited characteristics. It involves understanding how traits are passed from parents to offspring through genes.");
        addStudentAnswerToProblemAnswer(pa17b_1, sa17b_1_student9);

        StudentAnswer sa17b_2_student9 = createStudentAnswer(student9, pa17b_2, "The principles of Mendelian genetics, established by Gregor Mendel, include the Law of Segregation (each individual has two alleles for each gene, which separate during gamete formation) and the Law of Independent Assortment (genes for different traits can segregate independently during the formation of gametes).");
        addStudentAnswerToProblemAnswer(pa17b_2, sa17b_2_student9);

        StudentAnswer sa17b_3_student9 = createStudentAnswer(student9, pa17b_3, "DNA (deoxyribonucleic acid) is the molecule that carries the genetic instructions for life. It consists of two strands forming a double helix, with each strand composed of nucleotides containing a sugar, phosphate group, and a nitrogenous base (adenine, thymine, cytosine, or guanine).");
        addStudentAnswerToProblemAnswer(pa17b_3, sa17b_3_student9);

        StudentAnswer sa17b_4_student9 = createStudentAnswer(student9, pa17b_4, "The function of DNA is to store and transmit genetic information. It provides the instructions for building and maintaining an organism and guides the production of proteins through the processes of transcription and translation.");
        addStudentAnswerToProblemAnswer(pa17b_4, sa17b_4_student9);

        StudentAnswer sa17b_5_student9 = createStudentAnswer(student9, pa17b_5, "Replication is the process by which DNA is copied before cell division. It ensures that each daughter cell receives an exact copy of the parent cell's DNA. The process involves unwinding the DNA double helix and using each strand as a template to synthesize a new complementary strand.");
        addStudentAnswerToProblemAnswer(pa17b_5, sa17b_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa17b_1_student10 = createStudentAnswer(student10, pa17b_1, "Genetics is the study of heredity and the variation of inherited characteristics. It involves understanding how traits are passed from parents to offspring through genes.");
        addStudentAnswerToProblemAnswer(pa17b_1, sa17b_1_student10);

        StudentAnswer sa17b_2_student10 = createStudentAnswer(student10, pa17b_2, "The principles of Mendelian genetics, established by Gregor Mendel, include the Law of Segregation (each individual has two alleles for each gene, which separate during gamete formation) and the Law of Independent Assortment (genes for different traits can segregate independently during the formation of gametes).");
        addStudentAnswerToProblemAnswer(pa17b_2, sa17b_2_student10);

        StudentAnswer sa17b_3_student10 = createStudentAnswer(student10, pa17b_3, "DNA (deoxyribonucleic acid) is the molecule that carries the genetic instructions for life. It consists of two strands forming a double helix, with each strand composed of nucleotides containing a sugar, phosphate group, and a nitrogenous base (adenine, thymine, cytosine, or guanine).");
        addStudentAnswerToProblemAnswer(pa17b_3, sa17b_3_student10);

        StudentAnswer sa17b_4_student10 = createStudentAnswer(student10, pa17b_4, "The function of DNA is to store and transmit genetic information. It provides the instructions for building and maintaining an organism and guides the production of proteins through the processes of transcription and translation.");
        addStudentAnswerToProblemAnswer(pa17b_4, sa17b_4_student10);

        StudentAnswer sa17b_5_student10 = createStudentAnswer(student10, pa17b_5, "Replication is the process by which DNA is copied before cell division. It ensures that each daughter cell receives an exact copy of the parent cell's DNA. The process involves unwinding the DNA double helix and using each strand as a template to synthesize a new complementary strand.");
        addStudentAnswerToProblemAnswer(pa17b_5, sa17b_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa17c_1_student9 = createStudentAnswer(student9, pa17c_1, "The theory of evolution, developed by Charles Darwin, explains how species change over time through the process of natural selection. It states that organisms with traits better suited to their environment are more likely to survive and reproduce, passing those traits to their offspring.");
        addStudentAnswerToProblemAnswer(pa17c_1, sa17c_1_student9);

        StudentAnswer sa17c_2_student9 = createStudentAnswer(student9, pa17c_2, "Natural selection is the process by which individuals with advantageous traits are more likely to survive and reproduce, leading to the gradual accumulation of those traits in a population over generations.");
        addStudentAnswerToProblemAnswer(pa17c_2, sa17c_2_student9);

        StudentAnswer sa17c_3_student9 = createStudentAnswer(student9, pa17c_3, "Genetic variation is the diversity of gene combinations within a population. It is essential for evolution as it provides the raw material for natural selection to act upon.");
        addStudentAnswerToProblemAnswer(pa17c_3, sa17c_3_student9);

        StudentAnswer sa17c_4_student9 = createStudentAnswer(student9, pa17c_4, "A mutation is a change in the DNA sequence of an organism. Mutations can introduce new genetic variations and are a source of genetic diversity in a population.");
        addStudentAnswerToProblemAnswer(pa17c_4, sa17c_4_student9);

        StudentAnswer sa17c_5_student9 = createStudentAnswer(student9, pa17c_5, "An adaptation is a trait that increases an organism's chances of survival and reproduction in a particular environment. Adaptations result from the process of natural selection acting on genetic variation.");
        addStudentAnswerToProblemAnswer(pa17c_5, sa17c_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa17c_1_student10 = createStudentAnswer(student10, pa17c_1, "The theory of evolution, developed by Charles Darwin, explains how species change over time through the process of natural selection. It states that organisms with traits better suited to their environment are more likely to survive and reproduce, passing those traits to their offspring.");
        addStudentAnswerToProblemAnswer(pa17c_1, sa17c_1_student10);

        StudentAnswer sa17c_2_student10 = createStudentAnswer(student10, pa17c_2, "Natural selection is the process by which individuals with advantageous traits are more likely to survive and reproduce, leading to the gradual accumulation of those traits in a population over generations.");
        addStudentAnswerToProblemAnswer(pa17c_2, sa17c_2_student10);

        StudentAnswer sa17c_3_student10 = createStudentAnswer(student10, pa17c_3, "Genetic variation is the diversity of gene combinations within a population. It is essential for evolution as it provides the raw material for natural selection to act upon.");
        addStudentAnswerToProblemAnswer(pa17c_3, sa17c_3_student10);

        StudentAnswer sa17c_4_student10 = createStudentAnswer(student10, pa17c_4, "A mutation is a change in the DNA sequence of an organism. Mutations can introduce new genetic variations and are a source of genetic diversity in a population.");
        addStudentAnswerToProblemAnswer(pa17c_4, sa17c_4_student10);

        StudentAnswer sa17c_5_student10 = createStudentAnswer(student10, pa17c_5, "An adaptation is a trait that increases an organism's chances of survival and reproduction in a particular environment. Adaptations result from the process of natural selection acting on genetic variation.");
        addStudentAnswerToProblemAnswer(pa17c_5, sa17c_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa17d_1_student9 = createStudentAnswer(student9, pa17d_1, "Ecology is the study of interactions between organisms and their environment. It examines how living things interact with each other and with their physical surroundings.");
        addStudentAnswerToProblemAnswer(pa17d_1, sa17d_1_student9);

        StudentAnswer sa17d_2_student9 = createStudentAnswer(student9, pa17d_2, "Ecosystems are communities of living organisms interacting with their physical environment. They include both biotic (living) components, such as plants and animals, and abiotic (non-living) components, such as water, soil, and climate.");
        addStudentAnswerToProblemAnswer(pa17d_2, sa17d_2_student9);

        StudentAnswer sa17d_3_student9 = createStudentAnswer(student9, pa17d_3, "A food web is a complex network of interconnected food chains within an ecosystem. It illustrates the feeding relationships and energy flow between different organisms, showing how energy is transferred from producers to consumers and decomposers.");
        addStudentAnswerToProblemAnswer(pa17d_3, sa17d_3_student9);

        StudentAnswer sa17d_4_student9 = createStudentAnswer(student9, pa17d_4, "Energy flow in an ecosystem refers to the transfer of energy from one trophic level to another. Energy enters the ecosystem through photosynthesis by producers, and it is passed on to consumers and decomposers through feeding relationships.");
        addStudentAnswerToProblemAnswer(pa17d_4, sa17d_4_student9);

        StudentAnswer sa17d_5_student9 = createStudentAnswer(student9, pa17d_5, "The levels of organization in ecology, from smallest to largest, are: organism, population, community, ecosystem, biome, and biosphere. Each level represents a different scale of interaction between living organisms and their environment.");
        addStudentAnswerToProblemAnswer(pa17d_5, sa17d_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa17d_1_student10 = createStudentAnswer(student10, pa17d_1, "Ecology is the study of interactions between organisms and their environment. It examines how living things interact with each other and with their physical surroundings.");
        addStudentAnswerToProblemAnswer(pa17d_1, sa17d_1_student10);

        StudentAnswer sa17d_2_student10 = createStudentAnswer(student10, pa17d_2, "Ecosystems are communities of living organisms interacting with their physical environment. They include both biotic (living) components, such as plants and animals, and abiotic (non-living) components, such as water, soil, and climate.");
        addStudentAnswerToProblemAnswer(pa17d_2, sa17d_2_student10);

        StudentAnswer sa17d_3_student10 = createStudentAnswer(student10, pa17d_3, "A food web is a complex network of interconnected food chains within an ecosystem. It illustrates the feeding relationships and energy flow between different organisms, showing how energy is transferred from producers to consumers and decomposers.");
        addStudentAnswerToProblemAnswer(pa17d_3, sa17d_3_student10);

        StudentAnswer sa17d_4_student10 = createStudentAnswer(student10, pa17d_4, "Energy flow in an ecosystem refers to the transfer of energy from one trophic level to another. Energy enters the ecosystem through photosynthesis by producers, and it is passed on to consumers and decomposers through feeding relationships.");
        addStudentAnswerToProblemAnswer(pa17d_4, sa17d_4_student10);

        StudentAnswer sa17d_5_student10 = createStudentAnswer(student10, pa17d_5, "The levels of organization in ecology, from smallest to largest, are: organism, population, community, ecosystem, biome, and biosphere. Each level represents a different scale of interaction between living organisms and their environment.");
        addStudentAnswerToProblemAnswer(pa17d_5, sa17d_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa18a_1_student9 = createStudentAnswer(student9, pa18a_1, "Civil engineering is a discipline that deals with the design, construction, and maintenance of infrastructure such as roads, bridges, buildings, and water supply systems. Civil engineers work on projects that improve the built environment and enhance public safety.");
        addStudentAnswerToProblemAnswer(pa18a_1, sa18a_1_student9);

        StudentAnswer sa18a_2_student9 = createStudentAnswer(student9, pa18a_2, "Mechanical engineering is a discipline that involves the design, analysis, manufacturing, and maintenance of mechanical systems. Mechanical engineers work on projects ranging from small devices to large machinery, including engines, HVAC systems, and robotics.");
        addStudentAnswerToProblemAnswer(pa18a_2, sa18a_2_student9);

        StudentAnswer sa18a_3_student9 = createStudentAnswer(student9, pa18a_3, "Electrical engineering is a discipline focused on the study and application of electricity, electronics, and electromagnetism. Electrical engineers design and develop electrical systems, including power generation, transmission, and distribution, as well as electronic devices and communication systems.");
        addStudentAnswerToProblemAnswer(pa18a_3, sa18a_3_student9);

        StudentAnswer sa18a_4_student9 = createStudentAnswer(student9, pa18a_4, "Chemical engineering is a discipline that combines principles of chemistry, physics, mathematics, and engineering to design and operate processes that convert raw materials into valuable products. Chemical engineers work in industries such as pharmaceuticals, petrochemicals, and food processing.");
        addStudentAnswerToProblemAnswer(pa18a_4, sa18a_4_student9);

        StudentAnswer sa18a_5_student9 = createStudentAnswer(student9, pa18a_5, "Civil engineers are responsible for planning, designing, constructing, and maintaining infrastructure projects. They ensure the safety, functionality, and sustainability of structures such as roads, bridges, buildings, and water supply systems.");
        addStudentAnswerToProblemAnswer(pa18a_5, sa18a_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa18a_1_student10 = createStudentAnswer(student10, pa18a_1, "Civil engineering is a discipline that deals with the design, construction, and maintenance of infrastructure such as roads, bridges, buildings, and water supply systems. Civil engineers work on projects that improve the built environment and enhance public safety.");
        addStudentAnswerToProblemAnswer(pa18a_1, sa18a_1_student10);

        StudentAnswer sa18a_2_student10 = createStudentAnswer(student10, pa18a_2, "Mechanical engineering is a discipline that involves the design, analysis, manufacturing, and maintenance of mechanical systems. Mechanical engineers work on projects ranging from small devices to large machinery, including engines, HVAC systems, and robotics.");
        addStudentAnswerToProblemAnswer(pa18a_2, sa18a_2_student10);

        StudentAnswer sa18a_3_student10 = createStudentAnswer(student10, pa18a_3, "Electrical engineering is a discipline focused on the study and application of electricity, electronics, and electromagnetism. Electrical engineers design and develop electrical systems, including power generation, transmission, and distribution, as well as electronic devices and communication systems.");
        addStudentAnswerToProblemAnswer(pa18a_3, sa18a_3_student10);

        StudentAnswer sa18a_4_student10 = createStudentAnswer(student10, pa18a_4, "Chemical engineering is a discipline that combines principles of chemistry, physics, mathematics, and engineering to design and operate processes that convert raw materials into valuable products. Chemical engineers work in industries such as pharmaceuticals, petrochemicals, and food processing.");
        addStudentAnswerToProblemAnswer(pa18a_4, sa18a_4_student10);

        StudentAnswer sa18a_5_student10 = createStudentAnswer(student10, pa18a_5, "Civil engineers are responsible for planning, designing, constructing, and maintaining infrastructure projects. They ensure the safety, functionality, and sustainability of structures such as roads, bridges, buildings, and water supply systems.");
        addStudentAnswerToProblemAnswer(pa18a_5, sa18a_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa18b_1_student9 = createStudentAnswer(student9, pa18b_1, "The engineering problem-solving process is a systematic approach to addressing engineering challenges. It involves defining the problem, conducting research, generating potential solutions, selecting the best solution, implementing the solution, and evaluating the results.");
        addStudentAnswerToProblemAnswer(pa18b_1, sa18b_1_student9);

        StudentAnswer sa18b_2_student9 = createStudentAnswer(student9, pa18b_2, "Defining a problem in engineering involves identifying the specific issue or need, understanding the constraints and requirements, and clearly stating the problem in a way that guides the development of solutions.");
        addStudentAnswerToProblemAnswer(pa18b_2, sa18b_2_student9);

        StudentAnswer sa18b_3_student9 = createStudentAnswer(student9, pa18b_3, "Brainstorming is a creative process used to generate a wide range of potential solutions to an engineering problem. It encourages free thinking and the sharing of ideas without immediate evaluation or criticism.");
        addStudentAnswerToProblemAnswer(pa18b_3, sa18b_3_student9);

        StudentAnswer sa18b_4_student9 = createStudentAnswer(student9, pa18b_4, "Engineers select the best solution by evaluating the potential solutions based on criteria such as feasibility, cost, effectiveness, safety, and sustainability. They use decision-making tools and techniques to compare and rank the solutions.");
        addStudentAnswerToProblemAnswer(pa18b_4, sa18b_4_student9);

        StudentAnswer sa18b_5_student9 = createStudentAnswer(student9, pa18b_5, "Implementation involves putting the chosen solution into practice. This includes designing, developing, testing, and deploying the solution, as well as managing the resources and timelines required for successful implementation.");
        addStudentAnswerToProblemAnswer(pa18b_5, sa18b_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa18b_1_student10 = createStudentAnswer(student10, pa18b_1, "The engineering problem-solving process is a systematic approach to addressing engineering challenges. It involves defining the problem, conducting research, generating potential solutions, selecting the best solution, implementing the solution, and evaluating the results.");
        addStudentAnswerToProblemAnswer(pa18b_1, sa18b_1_student10);

        StudentAnswer sa18b_2_student10 = createStudentAnswer(student10, pa18b_2, "Defining a problem in engineering involves identifying the specific issue or need, understanding the constraints and requirements, and clearly stating the problem in a way that guides the development of solutions.");
        addStudentAnswerToProblemAnswer(pa18b_2, sa18b_2_student10);

        StudentAnswer sa18b_3_student10 = createStudentAnswer(student10, pa18b_3, "Brainstorming is a creative process used to generate a wide range of potential solutions to an engineering problem. It encourages free thinking and the sharing of ideas without immediate evaluation or criticism.");
        addStudentAnswerToProblemAnswer(pa18b_3, sa18b_3_student10);

        StudentAnswer sa18b_4_student10 = createStudentAnswer(student10, pa18b_4, "Engineers select the best solution by evaluating the potential solutions based on criteria such as feasibility, cost, effectiveness, safety, and sustainability. They use decision-making tools and techniques to compare and rank the solutions.");
        addStudentAnswerToProblemAnswer(pa18b_4, sa18b_4_student10);

        StudentAnswer sa18b_5_student10 = createStudentAnswer(student10, pa18b_5, "Implementation involves putting the chosen solution into practice. This includes designing, developing, testing, and deploying the solution, as well as managing the resources and timelines required for successful implementation.");
        addStudentAnswerToProblemAnswer(pa18b_5, sa18b_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa18c_1_student9 = createStudentAnswer(student9, pa18c_1, "The engineering design process is a systematic approach to solving engineering problems. It involves defining requirements, brainstorming, prototyping, testing, and iteration to develop and refine solutions.");
        addStudentAnswerToProblemAnswer(pa18c_1, sa18c_1_student9);

        StudentAnswer sa18c_2_student9 = createStudentAnswer(student9, pa18c_2, "The stages of the design process typically include defining the problem, researching and gathering information, generating ideas, developing and testing prototypes, evaluating and refining the solution, and finalizing and implementing the design.");
        addStudentAnswerToProblemAnswer(pa18c_2, sa18c_2_student9);

        StudentAnswer sa18c_3_student9 = createStudentAnswer(student9, pa18c_3, "Engineers define requirements by identifying the specific needs and constraints of the project. This includes understanding the problem, setting clear objectives, and determining the criteria for a successful solution.");
        addStudentAnswerToProblemAnswer(pa18c_3, sa18c_3_student9);

        StudentAnswer sa18c_4_student9 = createStudentAnswer(student9, pa18c_4, "Brainstorming is important because it encourages the generation of a wide range of ideas and solutions. It fosters creativity and collaboration, allowing engineers to explore different approaches and identify the best possible solution.");
        addStudentAnswerToProblemAnswer(pa18c_4, sa18c_4_student9);

        StudentAnswer sa18c_5_student9 = createStudentAnswer(student9, pa18c_5, "Prototyping involves creating a preliminary model or version of a solution to test its feasibility and functionality. Prototypes allow engineers to identify potential issues, gather feedback, and make improvements before finalizing the design.");
        addStudentAnswerToProblemAnswer(pa18c_5, sa18c_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa18c_1_student10 = createStudentAnswer(student10, pa18c_1, "The engineering design process is a systematic approach to solving engineering problems. It involves defining requirements, brainstorming, prototyping, testing, and iteration to develop and refine solutions.");
        addStudentAnswerToProblemAnswer(pa18c_1, sa18c_1_student10);

        StudentAnswer sa18c_2_student10 = createStudentAnswer(student10, pa18c_2, "The stages of the design process typically include defining the problem, researching and gathering information, generating ideas, developing and testing prototypes, evaluating and refining the solution, and finalizing and implementing the design.");
        addStudentAnswerToProblemAnswer(pa18c_2, sa18c_2_student10);

        StudentAnswer sa18c_3_student10 = createStudentAnswer(student10, pa18c_3, "Engineers define requirements by identifying the specific needs and constraints of the project. This includes understanding the problem, setting clear objectives, and determining the criteria for a successful solution.");
        addStudentAnswerToProblemAnswer(pa18c_3, sa18c_3_student10);

        StudentAnswer sa18c_4_student10 = createStudentAnswer(student10, pa18c_4, "Brainstorming is important because it encourages the generation of a wide range of ideas and solutions. It fosters creativity and collaboration, allowing engineers to explore different approaches and identify the best possible solution.");
        addStudentAnswerToProblemAnswer(pa18c_4, sa18c_4_student10);

        StudentAnswer sa18c_5_student10 = createStudentAnswer(student10, pa18c_5, "Prototyping involves creating a preliminary model or version of a solution to test its feasibility and functionality. Prototypes allow engineers to identify potential issues, gather feedback, and make improvements before finalizing the design.");
        addStudentAnswerToProblemAnswer(pa18c_5, sa18c_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa19a_1_student9 = createStudentAnswer(student9, pa19a_1, "Ohm's law states that the current flowing through a conductor between two points is directly proportional to the voltage across the two points. It is mathematically expressed as V = IR, where V is voltage, I is current, and R is resistance.");
        addStudentAnswerToProblemAnswer(pa19a_1, sa19a_1_student9);

        StudentAnswer sa19a_2_student9 = createStudentAnswer(student9, pa19a_2, "Kirchhoff's laws include Kirchhoff's Current Law (KCL) and Kirchhoff's Voltage Law (KVL). KCL states that the total current entering a junction equals the total current leaving the junction. KVL states that the sum of all voltages around a closed loop equals zero.");
        addStudentAnswerToProblemAnswer(pa19a_2, sa19a_2_student9);

        StudentAnswer sa19a_3_student9 = createStudentAnswer(student9, pa19a_3, "Voltage in a circuit can be calculated using Ohm's law (V = IR) and Kirchhoff's Voltage Law (KVL). For a series circuit, the total voltage is the sum of the voltages across each component. For a parallel circuit, the voltage is the same across each branch.");
        addStudentAnswerToProblemAnswer(pa19a_3, sa19a_3_student9);

        StudentAnswer sa19a_4_student9 = createStudentAnswer(student9, pa19a_4, "Current in a circuit can be calculated using Ohm's law (I = V/R) and Kirchhoff's Current Law (KCL). For a series circuit, the current is the same through each component. For a parallel circuit, the total current is the sum of the currents in each branch.");
        addStudentAnswerToProblemAnswer(pa19a_4, sa19a_4_student9);

        StudentAnswer sa19a_5_student9 = createStudentAnswer(student9, pa19a_5, "Techniques for analyzing DC circuits include using Ohm's law, Kirchhoff's laws, voltage division, current division, mesh analysis, and nodal analysis. These techniques help determine the voltage, current, and resistance in various parts of the circuit.");
        addStudentAnswerToProblemAnswer(pa19a_5, sa19a_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa19a_1_student10 = createStudentAnswer(student10, pa19a_1, "Ohm's law states that the current flowing through a conductor between two points is directly proportional to the voltage across the two points. It is mathematically expressed as V = IR, where V is voltage, I is current, and R is resistance.");
        addStudentAnswerToProblemAnswer(pa19a_1, sa19a_1_student10);

        StudentAnswer sa19a_2_student10 = createStudentAnswer(student10, pa19a_2, "Kirchhoff's laws include Kirchhoff's Current Law (KCL) and Kirchhoff's Voltage Law (KVL). KCL states that the total current entering a junction equals the total current leaving the junction. KVL states that the sum of all voltages around a closed loop equals zero.");
        addStudentAnswerToProblemAnswer(pa19a_2, sa19a_2_student10);

        StudentAnswer sa19a_3_student10 = createStudentAnswer(student10, pa19a_3, "Voltage in a circuit can be calculated using Ohm's law (V = IR) and Kirchhoff's Voltage Law (KVL). For a series circuit, the total voltage is the sum of the voltages across each component. For a parallel circuit, the voltage is the same across each branch.");
        addStudentAnswerToProblemAnswer(pa19a_3, sa19a_3_student10);

        StudentAnswer sa19a_4_student10 = createStudentAnswer(student10, pa19a_4, "Current in a circuit can be calculated using Ohm's law (I = V/R) and Kirchhoff's Current Law (KCL). For a series circuit, the current is the same through each component. For a parallel circuit, the total current is the sum of the currents in each branch.");
        addStudentAnswerToProblemAnswer(pa19a_4, sa19a_4_student10);

        StudentAnswer sa19a_5_student10 = createStudentAnswer(student10, pa19a_5, "Techniques for analyzing DC circuits include using Ohm's law, Kirchhoff's laws, voltage division, current division, mesh analysis, and nodal analysis. These techniques help determine the voltage, current, and resistance in various parts of the circuit.");
        addStudentAnswerToProblemAnswer(pa19a_5, sa19a_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa19b_1_student9 = createStudentAnswer(student9, pa19b_1, "Signal processing is the analysis, manipulation, and interpretation of signals. It involves techniques for filtering, transforming, and extracting information from signals in various forms, such as audio, video, and data.");
        addStudentAnswerToProblemAnswer(pa19b_1, sa19b_1_student9);

        StudentAnswer sa19b_2_student9 = createStudentAnswer(student9, pa19b_2, "A Fourier transform is a mathematical technique used to transform a signal from the time domain to the frequency domain. It decomposes a signal into its constituent frequencies, allowing analysis of the signal's frequency content.");
        addStudentAnswerToProblemAnswer(pa19b_2, sa19b_2_student9);

        StudentAnswer sa19b_3_student9 = createStudentAnswer(student9, pa19b_3, "Filtering is the process of removing unwanted components or noise from a signal. Filters can be designed to pass certain frequencies while attenuating others, such as low-pass, high-pass, band-pass, and band-stop filters.");
        addStudentAnswerToProblemAnswer(pa19b_3, sa19b_3_student9);

        StudentAnswer sa19b_4_student9 = createStudentAnswer(student9, pa19b_4, "Digital signal processing (DSP) involves the manipulation of signals using digital techniques. DSP algorithms are implemented on digital hardware, allowing for efficient processing, analysis, and transformation of signals in digital form.");
        addStudentAnswerToProblemAnswer(pa19b_4, sa19b_4_student9);

        StudentAnswer sa19b_5_student9 = createStudentAnswer(student9, pa19b_5, "Applications of signal processing include telecommunications (signal transmission and reception), audio and video processing (enhancement and compression), medical imaging (MRI and CT scans), and radar and sonar systems (target detection and tracking).");
        addStudentAnswerToProblemAnswer(pa19b_5, sa19b_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa19b_1_student10 = createStudentAnswer(student10, pa19b_1, "Signal processing is the analysis, manipulation, and interpretation of signals. It involves techniques for filtering, transforming, and extracting information from signals in various forms, such as audio, video, and data.");
        addStudentAnswerToProblemAnswer(pa19b_1, sa19b_1_student10);

        StudentAnswer sa19b_2_student10 = createStudentAnswer(student10, pa19b_2, "A Fourier transform is a mathematical technique used to transform a signal from the time domain to the frequency domain. It decomposes a signal into its constituent frequencies, allowing analysis of the signal's frequency content.");
        addStudentAnswerToProblemAnswer(pa19b_2, sa19b_2_student10);

        StudentAnswer sa19b_3_student10 = createStudentAnswer(student10, pa19b_3, "Filtering is the process of removing unwanted components or noise from a signal. Filters can be designed to pass certain frequencies while attenuating others, such as low-pass, high-pass, band-pass, and band-stop filters.");
        addStudentAnswerToProblemAnswer(pa19b_3, sa19b_3_student10);

        StudentAnswer sa19b_4_student10 = createStudentAnswer(student10, pa19b_4, "Digital signal processing (DSP) involves the manipulation of signals using digital techniques. DSP algorithms are implemented on digital hardware, allowing for efficient processing, analysis, and transformation of signals in digital form.");
        addStudentAnswerToProblemAnswer(pa19b_4, sa19b_4_student10);

        StudentAnswer sa19b_5_student10 = createStudentAnswer(student10, pa19b_5, "Applications of signal processing include telecommunications (signal transmission and reception), audio and video processing (enhancement and compression), medical imaging (MRI and CT scans), and radar and sonar systems (target detection and tracking).");
        addStudentAnswerToProblemAnswer(pa19b_5, sa19b_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa19c_1_student9 = createStudentAnswer(student9, pa19c_1, "Systems theory is the study of systems, which are sets of interacting components working together as a whole. It focuses on understanding the behavior, structure, and dynamics of complex systems.");
        addStudentAnswerToProblemAnswer(pa19c_1, sa19c_1_student9);

        StudentAnswer sa19c_2_student9 = createStudentAnswer(student9, pa19c_2, "System modeling involves creating abstract representations of systems to analyze their behavior and predict their performance. Models can be mathematical, graphical, or computational and help in understanding and designing systems.");
        addStudentAnswerToProblemAnswer(pa19c_2, sa19c_2_student9);

        StudentAnswer sa19c_3_student9 = createStudentAnswer(student9, pa19c_3, "Feedback is a process in which the output of a system is fed back into the system as input, influencing its future behavior. Positive feedback amplifies changes, while negative feedback stabilizes the system.");
        addStudentAnswerToProblemAnswer(pa19c_3, sa19c_3_student9);

        StudentAnswer sa19c_4_student9 = createStudentAnswer(student9, pa19c_4, "Control systems are systems designed to regulate the behavior of other systems. They use feedback and control mechanisms to maintain desired outputs despite disturbances. Examples include thermostats and automatic pilot systems.");
        addStudentAnswerToProblemAnswer(pa19c_4, sa19c_4_student9);

        StudentAnswer sa19c_5_student9 = createStudentAnswer(student9, pa19c_5, "Transfer functions are mathematical representations of the relationship between the input and output of a linear time-invariant system. They are used to analyze and design control systems by providing insights into system dynamics.");
        addStudentAnswerToProblemAnswer(pa19c_5, sa19c_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa19c_1_student10 = createStudentAnswer(student10, pa19c_1, "Systems theory is the study of systems, which are sets of interacting components working together as a whole. It focuses on understanding the behavior, structure, and dynamics of complex systems.");
        addStudentAnswerToProblemAnswer(pa19c_1, sa19c_1_student10);

        StudentAnswer sa19c_2_student10 = createStudentAnswer(student10, pa19c_2, "System modeling involves creating abstract representations of systems to analyze their behavior and predict their performance. Models can be mathematical, graphical, or computational and help in understanding and designing systems.");
        addStudentAnswerToProblemAnswer(pa19c_2, sa19c_2_student10);

        StudentAnswer sa19c_3_student10 = createStudentAnswer(student10, pa19c_3, "Feedback is a process in which the output of a system is fed back into the system as input, influencing its future behavior. Positive feedback amplifies changes, while negative feedback stabilizes the system.");
        addStudentAnswerToProblemAnswer(pa19c_3, sa19c_3_student10);

        StudentAnswer sa19c_4_student10 = createStudentAnswer(student10, pa19c_4, "Control systems are systems designed to regulate the behavior of other systems. They use feedback and control mechanisms to maintain desired outputs despite disturbances. Examples include thermostats and automatic pilot systems.");
        addStudentAnswerToProblemAnswer(pa19c_4, sa19c_4_student10);

        StudentAnswer sa19c_5_student10 = createStudentAnswer(student10, pa19c_5, "Transfer functions are mathematical representations of the relationship between the input and output of a linear time-invariant system. They are used to analyze and design control systems by providing insights into system dynamics.");
        addStudentAnswerToProblemAnswer(pa19c_5, sa19c_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa20a_1_student9 = createStudentAnswer(student9, pa20a_1, "Statics is the branch of mechanics that deals with bodies at rest and forces in equilibrium. It involves analyzing force systems, calculating moments, and solving problems related to static equilibrium.");
        addStudentAnswerToProblemAnswer(pa20a_1, sa20a_1_student9);

        StudentAnswer sa20a_2_student9 = createStudentAnswer(student9, pa20a_2, "A force system is a collection of forces acting on a body. It includes the magnitudes, directions, and points of application of the forces. Analyzing force systems is essential for understanding how forces affect a body's equilibrium.");
        addStudentAnswerToProblemAnswer(pa20a_2, sa20a_2_student9);

        StudentAnswer sa20a_3_student9 = createStudentAnswer(student9, pa20a_3, "A moment is a measure of the tendency of a force to rotate a body about a point or axis. It is calculated as the product of the force and the perpendicular distance from the point or axis to the line of action of the force, expressed as M = Fd.");
        addStudentAnswerToProblemAnswer(pa20a_3, sa20a_3_student9);

        StudentAnswer sa20a_4_student9 = createStudentAnswer(student9, pa20a_4, "Static equilibrium occurs when a body is at rest and the sum of all forces and moments acting on it is zero. In this state, the body does not experience any linear or rotational motion.");
        addStudentAnswerToProblemAnswer(pa20a_4, sa20a_4_student9);

        StudentAnswer sa20a_5_student9 = createStudentAnswer(student9, pa20a_5, "The resultant force is the single force that has the same effect as the combined forces acting on a body. It is calculated by vector addition of all the individual forces in the system.");
        addStudentAnswerToProblemAnswer(pa20a_5, sa20a_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa20a_1_student10 = createStudentAnswer(student10, pa20a_1, "Statics is the branch of mechanics that deals with bodies at rest and forces in equilibrium. It involves analyzing force systems, calculating moments, and solving problems related to static equilibrium.");
        addStudentAnswerToProblemAnswer(pa20a_1, sa20a_1_student10);

        StudentAnswer sa20a_2_student10 = createStudentAnswer(student10, pa20a_2, "A force system is a collection of forces acting on a body. It includes the magnitudes, directions, and points of application of the forces. Analyzing force systems is essential for understanding how forces affect a body's equilibrium.");
        addStudentAnswerToProblemAnswer(pa20a_2, sa20a_2_student10);

        StudentAnswer sa20a_3_student10 = createStudentAnswer(student10, pa20a_3, "A moment is a measure of the tendency of a force to rotate a body about a point or axis. It is calculated as the product of the force and the perpendicular distance from the point or axis to the line of action of the force, expressed as M = Fd.");
        addStudentAnswerToProblemAnswer(pa20a_3, sa20a_3_student10);

        StudentAnswer sa20a_4_student10 = createStudentAnswer(student10, pa20a_4, "Static equilibrium occurs when a body is at rest and the sum of all forces and moments acting on it is zero. In this state, the body does not experience any linear or rotational motion.");
        addStudentAnswerToProblemAnswer(pa20a_4, sa20a_4_student10);

        StudentAnswer sa20a_5_student10 = createStudentAnswer(student10, pa20a_5, "The resultant force is the single force that has the same effect as the combined forces acting on a body. It is calculated by vector addition of all the individual forces in the system.");
        addStudentAnswerToProblemAnswer(pa20a_5, sa20a_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa20b_1_student9 = createStudentAnswer(student9, pa20b_1, "Dynamics is the study of bodies in motion. It involves analyzing the forces and torques that cause motion and understanding the principles of kinematics and kinetics.");
        addStudentAnswerToProblemAnswer(pa20b_1, sa20b_1_student9);

        StudentAnswer sa20b_2_student9 = createStudentAnswer(student9, pa20b_2, "Kinematics is the branch of dynamics that deals with the description of motion without considering the forces that cause it. It involves analyzing the position, velocity, and acceleration of objects.");
        addStudentAnswerToProblemAnswer(pa20b_2, sa20b_2_student9);

        StudentAnswer sa20b_3_student9 = createStudentAnswer(student9, pa20b_3, "Kinetics is the branch of dynamics that deals with the forces and torques that cause motion. It involves analyzing the relationship between the motion of objects and the forces acting on them.");
        addStudentAnswerToProblemAnswer(pa20b_3, sa20b_3_student9);

        StudentAnswer sa20b_4_student9 = createStudentAnswer(student9, pa20b_4_new, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. This law is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addStudentAnswerToProblemAnswer(pa20b_4_new, sa20b_4_student9);

        StudentAnswer sa20b_5_student9 = createStudentAnswer(student9, pa20b_5, "Velocity is the rate of change of displacement with respect to time, and it is a vector quantity with both magnitude and direction. Acceleration is the rate of change of velocity with respect to time, and it is also a vector quantity.");
        addStudentAnswerToProblemAnswer(pa20b_5, sa20b_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa20b_1_student10 = createStudentAnswer(student10, pa20b_1, "Dynamics is the study of bodies in motion. It involves analyzing the forces and torques that cause motion and understanding the principles of kinematics and kinetics.");
        addStudentAnswerToProblemAnswer(pa20b_1, sa20b_1_student10);

        StudentAnswer sa20b_2_student10 = createStudentAnswer(student10, pa20b_2, "Kinematics is the branch of dynamics that deals with the description of motion without considering the forces that cause it. It involves analyzing the position, velocity, and acceleration of objects.");
        addStudentAnswerToProblemAnswer(pa20b_2, sa20b_2_student10);

        StudentAnswer sa20b_3_student10 = createStudentAnswer(student10, pa20b_3, "Kinetics is the branch of dynamics that deals with the forces and torques that cause motion. It involves analyzing the relationship between the motion of objects and the forces acting on them.");
        addStudentAnswerToProblemAnswer(pa20b_3, sa20b_3_student10);

        StudentAnswer sa20b_4_student10 = createStudentAnswer(student10, pa20b_4_new, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. This law is expressed by the equation F = ma, where F is the force, m is the mass, and a is the acceleration.");
        addStudentAnswerToProblemAnswer(pa20b_4_new, sa20b_4_student10);

        StudentAnswer sa20b_5_student10 = createStudentAnswer(student10, pa20b_5, "Velocity is the rate of change of displacement with respect to time, and it is a vector quantity with both magnitude and direction. Acceleration is the rate of change of velocity with respect to time, and it is also a vector quantity.");
        addStudentAnswerToProblemAnswer(pa20b_5, sa20b_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa20c_1_student9 = createStudentAnswer(student9, pa20c_1, "Thermodynamics is the branch of physics that deals with the study of heat, energy, and the transformation of energy from one form to another. It involves understanding the principles governing the behavior of gases and liquids, as well as the laws of thermodynamics.");
        addStudentAnswerToProblemAnswer(pa20c_1, sa20c_1_student9);

        StudentAnswer sa20c_2_student9 = createStudentAnswer(student9, pa20c_2, "The first law of thermodynamics, also known as the law of energy conservation, states that energy cannot be created or destroyed, only transformed from one form to another. It is expressed as ΔU = Q - W, where ΔU is the change in internal energy, Q is the heat added to the system, and W is the work done by the system.");
        addStudentAnswerToProblemAnswer(pa20c_2, sa20c_2_student9);

        StudentAnswer sa20c_3_student9 = createStudentAnswer(student9, pa20c_3, "The second law of thermodynamics states that the entropy of an isolated system always increases over time. It also implies that heat naturally flows from a region of higher temperature to a region of lower temperature and that it is impossible to convert heat completely into work without some loss of energy.");
        addStudentAnswerToProblemAnswer(pa20c_3, sa20c_3_student9);

        StudentAnswer sa20c_4_student9 = createStudentAnswer(student9, pa20c_4, "Entropy is a measure of the disorder or randomness in a system. It quantifies the number of possible microstates of a system and is a key concept in the second law of thermodynamics. Higher entropy indicates greater disorder and lower energy availability for work.");
        addStudentAnswerToProblemAnswer(pa20c_4, sa20c_4_student9);

        StudentAnswer sa20c_5_student9 = createStudentAnswer(student9, pa20c_5, "The third law of thermodynamics states that as the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value. This implies that it is impossible to reach absolute zero through any finite number of processes.");
        addStudentAnswerToProblemAnswer(pa20c_5, sa20c_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa20c_1_student10 = createStudentAnswer(student10, pa20c_1, "Thermodynamics is the branch of physics that deals with the study of heat, energy, and the transformation of energy from one form to another. It involves understanding the principles governing the behavior of gases and liquids, as well as the laws of thermodynamics.");
        addStudentAnswerToProblemAnswer(pa20c_1, sa20c_1_student10);

        StudentAnswer sa20c_2_student10 = createStudentAnswer(student10, pa20c_2, "The first law of thermodynamics, also known as the law of energy conservation, states that energy cannot be created or destroyed, only transformed from one form to another. It is expressed as ΔU = Q - W, where ΔU is the change in internal energy, Q is the heat added to the system, and W is the work done by the system.");
        addStudentAnswerToProblemAnswer(pa20c_2, sa20c_2_student10);

        StudentAnswer sa20c_3_student10 = createStudentAnswer(student10, pa20c_3, "The second law of thermodynamics states that the entropy of an isolated system always increases over time. It also implies that heat naturally flows from a region of higher temperature to a region of lower temperature and that it is impossible to convert heat completely into work without some loss of energy.");
        addStudentAnswerToProblemAnswer(pa20c_3, sa20c_3_student10);

        StudentAnswer sa20c_4_student10 = createStudentAnswer(student10, pa20c_4, "Entropy is a measure of the disorder or randomness in a system. It quantifies the number of possible microstates of a system and is a key concept in the second law of thermodynamics. Higher entropy indicates greater disorder and lower energy availability for work.");
        addStudentAnswerToProblemAnswer(pa20c_4, sa20c_4_student10);

        StudentAnswer sa20c_5_student10 = createStudentAnswer(student10, pa20c_5, "The third law of thermodynamics states that as the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value. This implies that it is impossible to reach absolute zero through any finite number of processes.");
        addStudentAnswerToProblemAnswer(pa20c_5, sa20c_5_student10);

        // Creating StudentAnswer instances for student9
        StudentAnswer sa20d_1_student9 = createStudentAnswer(student9, pa20d_1, "Material science is the study of the properties and behavior of materials. It involves understanding the structure, composition, and performance of different materials and how they can be used in various engineering applications.");
        addStudentAnswerToProblemAnswer(pa20d_1, sa20d_1_student9);

        StudentAnswer sa20d_2_student9 = createStudentAnswer(student9, pa20d_2, "The main types of materials studied in material science include metals, ceramics, polymers, and composites. Each type has distinct properties and applications, making them suitable for different engineering purposes.");
        addStudentAnswerToProblemAnswer(pa20d_2, sa20d_2_student9);

        StudentAnswer sa20d_3_student9 = createStudentAnswer(student9, pa20d_3, "Metals have properties such as high electrical and thermal conductivity, ductility, malleability, and strength. They are widely used in engineering applications such as construction, transportation, and electronics.");
        addStudentAnswerToProblemAnswer(pa20d_3, sa20d_3_student9);

        StudentAnswer sa20d_4_student9 = createStudentAnswer(student9, pa20d_4, "Ceramics are non-metallic, inorganic materials that are typically hard, brittle, and resistant to heat and chemical attack. They are used in applications such as pottery, building materials, and high-temperature environments.");
        addStudentAnswerToProblemAnswer(pa20d_4, sa20d_4_student9);

        StudentAnswer sa20d_5_student9 = createStudentAnswer(student9, pa20d_5, "Polymers are large molecules composed of repeating structural units. They can be natural or synthetic and have properties such as flexibility, elasticity, and low density. Polymers are used in a wide range of applications, including plastics, textiles, and medical devices.");
        addStudentAnswerToProblemAnswer(pa20d_5, sa20d_5_student9);

// Creating StudentAnswer instances for student10
        StudentAnswer sa20d_1_student10 = createStudentAnswer(student10, pa20d_1, "Material science is the study of the properties and behavior of materials. It involves understanding the structure, composition, and performance of different materials and how they can be used in various engineering applications.");
        addStudentAnswerToProblemAnswer(pa20d_1, sa20d_1_student10);

        StudentAnswer sa20d_2_student10 = createStudentAnswer(student10, pa20d_2, "The main types of materials studied in material science include metals, ceramics, polymers, and composites. Each type has distinct properties and applications, making them suitable for different engineering purposes.");
        addStudentAnswerToProblemAnswer(pa20d_2, sa20d_2_student10);

        StudentAnswer sa20d_3_student10 = createStudentAnswer(student10, pa20d_3, "Metals have properties such as high electrical and thermal conductivity, ductility, malleability, and strength. They are widely used in engineering applications such as construction, transportation, and electronics.");
        addStudentAnswerToProblemAnswer(pa20d_3, sa20d_3_student10);

        StudentAnswer sa20d_4_student10 = createStudentAnswer(student10, pa20d_4, "Ceramics are non-metallic, inorganic materials that are typically hard, brittle, and resistant to heat and chemical attack. They are used in applications such as pottery, building materials, and high-temperature environments.");
        addStudentAnswerToProblemAnswer(pa20d_4, sa20d_4_student10);

        StudentAnswer sa20d_5_student10 = createStudentAnswer(student10, pa20d_5, "Polymers are large molecules composed of repeating structural units. They can be natural or synthetic and have properties such as flexibility, elasticity, and low density. Polymers are used in a wide range of applications, including plastics, textiles, and medical devices.");
        addStudentAnswerToProblemAnswer(pa20d_5, sa20d_5_student10);

// Creating submission for student1 with student answers for 1a
        Submission submission1a_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1a_1_student1, sa1a_2_student1, sa1a_3_student1, sa1a_4_student1, sa1a_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1a_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1a_1);
        }

// Creating submission for student2 with student answers for 1a
        Submission submission1a_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1a_1_student2, sa1a_2_student2, sa1a_3_student2, sa1a_4_student2, sa1a_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1a_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1a_2);
        }
// Creating submission for student1 with student answers for 1b
        Submission submission1b_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1b_1_student1, sa1b_2_student1, sa1b_3_student1, sa1b_4_student1, sa1b_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1b_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1b_1);
        }

// Creating submission for student2 with student answers for 1b
        Submission submission1b_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1b_1_student2, sa1b_2_student2, sa1b_3_student2, sa1b_4_student2, sa1b_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1b_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1b_2);
        }
// Creating submission for student1 with student answers for 1c
        Submission submission1c_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1c_1_student1, sa1c_2_student1, sa1c_3_student1, sa1c_4_student1, sa1c_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1c_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1c_1);
        }

// Creating submission for student2 with student answers for 1c
        Submission submission1c_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1c_1_student2, sa1c_2_student2, sa1c_3_student2, sa1c_4_student2, sa1c_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1c_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1c_2);
        }
// Creating submission for student1 with student answers for 1d
        Submission submission1d_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1d_1_student1, sa1d_2_student1, sa1d_3_student1, sa1d_4_student1, sa1d_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1d_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1d_1);
        }

// Creating submission for student2 with student answers for 1d
        Submission submission1d_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1d_1_student2, sa1d_2_student2, sa1d_3_student2, sa1d_4_student2, sa1d_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1d_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1d_2);
        }
// Creating submission for student1 with student answers for 1e
        Submission submission1e_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1e_1_student1, sa1e_2_student1, sa1e_3_student1, sa1e_4_student1, sa1e_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1e_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1e_1);
        }

// Creating submission for student2 with student answers for 1e
        Submission submission1e_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1e_1_student2, sa1e_2_student2, sa1e_3_student2, sa1e_4_student2, sa1e_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1e_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1e_2);
        }
// Creating submission for student1 with student answers for 1f
        Submission submission1f_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1f_1_student1, sa1f_2_student1, sa1f_3_student1, sa1f_4_student1, sa1f_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1f_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1f_1);
        }

// Creating submission for student2 with student answers for 1f
        Submission submission1f_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1f_1_student2, sa1f_2_student2, sa1f_3_student2, sa1f_4_student2, sa1f_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1f_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1f_2);
        }
// Creating submission for student1 with student answers for 2a
        Submission submission2a_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2a_1_student1, sa2a_2_student1, sa2a_3_student1, sa2a_4_student1, sa2a_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2a_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2a_1);
        }

// Creating submission for student2 with student answers for 2a
        Submission submission2a_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2a_1_student2, sa2a_2_student2, sa2a_3_student2, sa2a_4_student2, sa2a_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2a_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2a_2);
        }
// Creating submission for student1 with student answers for 2b
        Submission submission2b_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2b_1_student1, sa2b_2_student1, sa2b_3_student1, sa2b_4_student1, sa2b_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2b_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2b_1);
        }

// Creating submission for student2 with student answers for 2b
        Submission submission2b_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2b_1_student2, sa2b_2_student2, sa2b_3_student2, sa2b_4_student2, sa2b_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2b_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2b_2);
        }
// Creating submission for student1 with student answers for 2c
        Submission submission2c_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2c_1_student1, sa2c_2_student1, sa2c_3_student1, sa2c_4_student1, sa2c_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2c_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2c_1);
        }

// Creating submission for student2 with student answers for 2c
        Submission submission2c_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2c_1_student2, sa2c_2_student2, sa2c_3_student2, sa2c_4_student2, sa2c_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2c_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2c_2);
        }
// Creating submission for student1 with student answers for 2d
        Submission submission2d_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2d_1_student1, sa2d_2_student1, sa2d_3_student1, sa2d_4_student1, sa2d_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2d_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2d_1);
        }

// Creating submission for student2 with student answers for 2d
        Submission submission2d_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2d_1_student2, sa2d_2_student2, sa2d_3_student2, sa2d_4_student2, sa2d_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2d_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2d_2);
        }
// Creating submission for student1 with student answers for 2e
        Submission submission2e_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2e_1_student1, sa2e_2_student1, sa2e_3_student1, sa2e_4_student1, sa2e_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2e_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2e_1);
        }

// Creating submission for student2 with student answers for 2e
        Submission submission2e_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2e_1_student2, sa2e_2_student2, sa2e_3_student2, sa2e_4_student2, sa2e_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2e_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2e_2);
        }
// Creating submission for student1 with student answers for 2f
        Submission submission2f_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2f_1_student1, sa2f_2_student1, sa2f_3_student1, sa2f_4_student1, sa2f_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2f_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2f_1);
        }

// Creating submission for student2 with student answers for 2f
        Submission submission2f_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2f_1_student2, sa2f_2_student2, sa2f_3_student2, sa2f_4_student2, sa2f_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2f_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2f_2);
        }
// Creating submission for student1 with student answers for 3a
        Submission submission3a_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3a_1_student1, sa3a_2_student1, sa3a_3_student1, sa3a_4_student1, sa3a_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission3a_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3a_1);
        }

// Creating submission for student2 with student answers for 3a
        Submission submission3a_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3a_1_student2, sa3a_2_student2, sa3a_3_student2, sa3a_4_student2, sa3a_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission3a_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3a_2);
        }
// Creating submission for student1 with student answers for 3b
        Submission submission3b_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3b_1_student1, sa3b_2_student1, sa3b_3_student1, sa3b_4_student1, sa3b_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission3b_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3b_1);
        }

// Creating submission for student2 with student answers for 3b
        Submission submission3b_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3b_1_student2, sa3b_2_student2, sa3b_3_student2, sa3b_4_student2, sa3b_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission3b_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3b_2);
        }
// Creating submission for student1 with student answers for 3c
        Submission submission3c_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3c_1_student1, sa3c_2_student1, sa3c_3_student1, sa3c_4_student1, sa3c_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission3c_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3c_1);
        }

// Creating submission for student2 with student answers for 3c
        Submission submission3c_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3c_1_student2, sa3c_2_student2, sa3c_3_student2, sa3c_4_student2, sa3c_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission3c_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3c_2);
        }
// Creating submission for student1 with student answers for 3d
        Submission submission3d_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3d_1_student1, sa3d_2_student1, sa3d_3_student1, sa3d_4_student1, sa3d_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission3d_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3d_1);
        }

// Creating submission for student2 with student answers for 3d
        Submission submission3d_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3d_1_student2, sa3d_2_student2, sa3d_3_student2, sa3d_4_student2, sa3d_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission3d_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3d_2);
        }
// Creating submission for student1 with student answers for 4a
        Submission submission4a_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4a_1_student1, sa4a_2_student1, sa4a_3_student1, sa4a_4_student1, sa4a_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission4a_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4a_1);
        }

// Creating submission for student2 with student answers for 4a
        Submission submission4a_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4a_1_student2, sa4a_2_student2, sa4a_3_student2, sa4a_4_student2, sa4a_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission4a_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4a_2);
        }
// Creating submission for student1 with student answers for 4b
        Submission submission4b_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4b_1_student1, sa4b_2_student1, sa4b_3_student1, sa4b_4_student1, sa4b_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission4b_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4b_1);
        }

// Creating submission for student2 with student answers for 4b
        Submission submission4b_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4b_1_student2, sa4b_2_student2, sa4b_3_student2, sa4b_4_student2, sa4b_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission4b_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4b_2);
        }
// Creating submission for student1 with student answers for 4c
        Submission submission4c_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4c_1_student1, sa4c_2_student1, sa4c_3_student1, sa4c_4_student1, sa4c_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission4c_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4c_1);
        }

// Creating submission for student2 with student answers for 4c
        Submission submission4c_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4c_1_student2, sa4c_2_student2, sa4c_3_student2, sa4c_4_student2, sa4c_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission4c_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4c_2);
        }
// Creating submission for student1 with student answers for 4d
        Submission submission4d_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4d_1_student1, sa4d_2_student1, sa4d_3_student1, sa4d_4_student1, sa4d_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission4d_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4d_1);
        }

// Creating submission for student2 with student answers for 4d
        Submission submission4d_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4d_1_student2, sa4d_2_student2, sa4d_3_student2, sa4d_4_student2, sa4d_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission4d_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4d_2);
        }
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
// Creating submission for student7 with student answers for 13a
        Submission submission13a_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13a_1_student7, sa13a_2_student7, sa13a_3_student7, sa13a_4_student7, sa13a_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13a_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13a_7);
        }

// Creating submission for student8 with student answers for 13a
        Submission submission13a_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13a_1_student8, sa13a_2_student8, sa13a_3_student8, sa13a_4_student8, sa13a_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13a_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13a_8);
        }
// Creating submission for student7 with student answers for 13b
        Submission submission13b_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13b_1_student7, sa13b_2_student7, sa13b_3_student7, sa13b_4_student7, sa13b_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13b_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13b_7);
        }

// Creating submission for student8 with student answers for 13b
        Submission submission13b_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13b_1_student8, sa13b_2_student8, sa13b_3_student8, sa13b_4_student8, sa13b_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13b_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13b_8);
        }
// Creating submission for student7 with student answers for 13c
        Submission submission13c_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13c_1_student7, sa13c_2_student7, sa13c_3_student7, sa13c_4_student7, sa13c_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13c_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13c_7);
        }

// Creating submission for student8 with student answers for 13c
        Submission submission13c_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13c_1_student8, sa13c_2_student8, sa13c_3_student8, sa13c_4_student8, sa13c_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13c_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13c_8);
        }
// Creating submission for student7 with student answers for 13d
        Submission submission13d_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13d_1_student7, sa13d_2_student7, sa13d_3_student7, sa13d_4_student7, sa13d_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13d_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13d_7);
        }

// Creating submission for student8 with student answers for 13d
        Submission submission13d_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13d_1_student8, sa13d_2_student8, sa13d_3_student8, sa13d_4_student8, sa13d_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13d_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13d_8);
        }
// Creating submission for student7 with student answers for 14a
        Submission submission14a_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14a_1_student7, sa14a_2_student7, sa14a_3_student7, sa14a_4_student7, sa14a_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14a_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14a_7);
        }

// Creating submission for student8 with student answers for 14a
        Submission submission14a_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14a_1_student8, sa14a_2_student8, sa14a_3_student8, sa14a_4_student8, sa14a_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14a_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14a_8);
        }
// Creating submission for student7 with student answers for 14b
        Submission submission14b_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14b_1_student7, sa14b_2_student7, sa14b_3_student7, sa14b_4_student7, sa14b_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14b_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14b_7);
        }

// Creating submission for student8 with student answers for 14b
        Submission submission14b_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14b_1_student8, sa14b_2_student8, sa14b_3_student8, sa14b_4_student8, sa14b_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14b_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14b_8);
        }
// Creating submission for student7 with student answers for 14c
        Submission submission14c_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14c_1_student7, sa14c_2_student7, sa14c_3_student7, sa14c_4_student7, sa14c_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14c_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14c_7);
        }

// Creating submission for student8 with student answers for 14c
        Submission submission14c_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14c_1_student8, sa14c_2_student8, sa14c_3_student8, sa14c_4_student8, sa14c_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14c_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14c_8);
        }
// Creating submission for student7 with student answers for 14d
        Submission submission14d_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14d_1_student7, sa14d_2_student7, sa14d_3_student7, sa14d_4_student7, sa14d_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14d_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14d_7);
        }

// Creating submission for student8 with student answers for 14d
        Submission submission14d_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14d_1_student8, sa14d_2_student8, sa14d_3_student8, sa14d_4_student8, sa14d_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14d_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14d_8);
        }
// Creating submission for student7 with student answers for 15a
        Submission submission15a_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15a_1_student7, sa15a_2_student7, sa15a_3_student7, sa15a_4_student7, sa15a_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15a_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15a_7);
        }

// Creating submission for student8 with student answers for 15a
        Submission submission15a_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15a_1_student8, sa15a_2_student8, sa15a_3_student8, sa15a_4_student8, sa15a_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15a_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15a_8);
        }
// Creating submission for student7 with student answers for 15b
        Submission submission15b_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15b_1_student7, sa15b_2_student7, sa15b_3_student7, sa15b_4_student7, sa15b_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15b_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15b_7);
        }

// Creating submission for student8 with student answers for 15b
        Submission submission15b_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15b_1_student8, sa15b_2_student8, sa15b_3_student8, sa15b_4_student8, sa15b_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15b_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15b_8);
        }
// Creating submission for student7 with student answers for 15c
        Submission submission15c_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15c_1_student7, sa15c_2_student7, sa15c_3_student7, sa15c_4_student7, sa15c_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15c_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15c_7);
        }

// Creating submission for student8 with student answers for 15c
        Submission submission15c_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15c_1_student8, sa15c_2_student8, sa15c_3_student8, sa15c_4_student8, sa15c_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15c_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15c_8);
        }
// Creating submission for student7 with student answers for 16a
        Submission submission16a_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16a_1_student7, sa16a_2_student7, sa16a_3_student7, sa16a_4_student7, sa16a_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16a_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16a_7);
        }

// Creating submission for student8 with student answers for 16a
        Submission submission16a_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16a_1_student8, sa16a_2_student8, sa16a_3_student8, sa16a_4_student8, sa16a_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16a_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16a_8);
        }
// Creating submission for student7 with student answers for 16b
        Submission submission16b_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16b_1_student7, sa16b_2_student7, sa16b_3_student7, sa16b_4_student7, sa16b_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16b_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16b_7);
        }

// Creating submission for student8 with student answers for 16b
        Submission submission16b_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16b_1_student8, sa16b_2_student8, sa16b_3_student8, sa16b_4_student8, sa16b_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16b_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16b_8);
        }
// Creating submission for student7 with student answers for 16c
        Submission submission16c_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16c_1_student7, sa16c_2_student7, sa16c_3_student7, sa16c_4_student7, sa16c_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16c_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16c_7);
        }

// Creating submission for student8 with student answers for 16c
        Submission submission16c_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16c_1_student8, sa16c_2_student8, sa16c_3_student8, sa16c_4_student8, sa16c_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16c_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16c_8);
        }
// Creating submission for student9 with student answers for 17a
        Submission submission17a_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17a_1_student9, sa17a_2_student9, sa17a_3_student9, sa17a_4_student9, sa17a_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17a_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17a_9);
        }

// Creating submission for student10 with student answers for 17a
        Submission submission17a_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17a_1_student10, sa17a_2_student10, sa17a_3_student10, sa17a_4_student10, sa17a_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17a_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17a_10);
        }
// Creating submission for student9 with student answers for 17b
        Submission submission17b_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17b_1_student9, sa17b_2_student9, sa17b_3_student9, sa17b_4_student9, sa17b_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17b_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17b_9);
        }

// Creating submission for student10 with student answers for 17b
        Submission submission17b_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17b_1_student10, sa17b_2_student10, sa17b_3_student10, sa17b_4_student10, sa17b_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17b_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17b_10);
        }
// Creating submission for student9 with student answers for 17c
        Submission submission17c_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17c_1_student9, sa17c_2_student9, sa17c_3_student9, sa17c_4_student9, sa17c_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17c_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17c_9);
        }

// Creating submission for student10 with student answers for 17c
        Submission submission17c_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17c_1_student10, sa17c_2_student10, sa17c_3_student10, sa17c_4_student10, sa17c_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17c_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17c_10);
        }
// Creating submission for student9 with student answers for 17d
        Submission submission17d_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17d_1_student9, sa17d_2_student9, sa17d_3_student9, sa17d_4_student9, sa17d_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17d_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17d_9);
        }

// Creating submission for student10 with student answers for 17d
        Submission submission17d_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17d_1_student10, sa17d_2_student10, sa17d_3_student10, sa17d_4_student10, sa17d_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17d_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17d_10);
        }
// Creating submission for student9 with student answers for 18a
        Submission submission18a_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18a_1_student9, sa18a_2_student9, sa18a_3_student9, sa18a_4_student9, sa18a_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18a_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18a_9);
        }

// Creating submission for student10 with student answers for 18a
        Submission submission18a_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18a_1_student10, sa18a_2_student10, sa18a_3_student10, sa18a_4_student10, sa18a_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18a_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18a_10);
        }
// Creating submission for student9 with student answers for 18b
        Submission submission18b_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18b_1_student9, sa18b_2_student9, sa18b_3_student9, sa18b_4_student9, sa18b_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18b_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18b_9);
        }

// Creating submission for student10 with student answers for 18b
        Submission submission18b_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18b_1_student10, sa18b_2_student10, sa18b_3_student10, sa18b_4_student10, sa18b_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18b_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18b_10);
        }
// Creating submission for student9 with student answers for 18c
        Submission submission18c_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18c_1_student9, sa18c_2_student9, sa18c_3_student9, sa18c_4_student9, sa18c_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18c_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18c_9);
        }

// Creating submission for student10 with student answers for 18c
        Submission submission18c_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18c_1_student10, sa18c_2_student10, sa18c_3_student10, sa18c_4_student10, sa18c_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18c_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18c_10);
        }
// Creating submission for student9 with student answers for 19a
        Submission submission19a_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19a_1_student9, sa19a_2_student9, sa19a_3_student9, sa19a_4_student9, sa19a_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19a_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19a_9);
        }

// Creating submission for student10 with student answers for 19a
        Submission submission19a_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19a_1_student10, sa19a_2_student10, sa19a_3_student10, sa19a_4_student10, sa19a_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19a_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19a_10);
        }
// Creating submission for student9 with student answers for 19b
        Submission submission19b_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19b_1_student9, sa19b_2_student9, sa19b_3_student9, sa19b_4_student9, sa19b_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19b_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19b_9);
        }

// Creating submission for student10 with student answers for 19b
        Submission submission19b_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19b_1_student10, sa19b_2_student10, sa19b_3_student10, sa19b_4_student10, sa19b_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19b_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19b_10);
        }
// Creating submission for student9 with student answers for 19c
        Submission submission19c_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19c_1_student9, sa19c_2_student9, sa19c_3_student9, sa19c_4_student9, sa19c_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19c_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19c_9);
        }

// Creating submission for student10 with student answers for 19c
        Submission submission19c_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19c_1_student10, sa19c_2_student10, sa19c_3_student10, sa19c_4_student10, sa19c_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19c_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19c_10);
        }
// Creating submission for student9 with student answers for 20a
        Submission submission20a_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20a_1_student9, sa20a_2_student9, sa20a_3_student9, sa20a_4_student9, sa20a_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20a_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20a_9);
        }

// Creating submission for student10 with student answers for 20a
        Submission submission20a_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20a_1_student10, sa20a_2_student10, sa20a_3_student10, sa20a_4_student10, sa20a_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20a_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20a_10);
        }
// Creating submission for student9 with student answers for 20b
        Submission submission20b_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20b_1_student9, sa20b_2_student9, sa20b_3_student9, sa20b_4_student9, sa20b_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20b_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20b_9);
        }

// Creating submission for student10 with student answers for 20b
        Submission submission20b_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20b_1_student10, sa20b_2_student10, sa20b_3_student10, sa20b_4_student10, sa20b_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20b_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20b_10);
        }
// Creating submission for student9 with student answers for 20c
        Submission submission20c_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20c_1_student9, sa20c_2_student9, sa20c_3_student9, sa20c_4_student9, sa20c_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20c_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20c_9);
        }

// Creating submission for student10 with student answers for 20c
        Submission submission20c_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20c_1_student10, sa20c_2_student10, sa20c_3_student10, sa20c_4_student10, sa20c_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20c_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20c_10);
        }
// Creating submission for student9 with student answers for 20d
        Submission submission20d_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20d_1_student9, sa20d_2_student9, sa20d_3_student9, sa20d_4_student9, sa20d_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20d_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20d_9);
        }

// Creating submission for student10 with student answers for 20d
        Submission submission20d_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20d_1_student10, sa20d_2_student10, sa20d_3_student10, sa20d_4_student10, sa20d_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20d_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20d_10);
        }


        Grade grade1a_1 = createGrade(87.2, student1, faculty1, course1, submission1a_1);
        Grade grade1a_2 = createGrade(89.5, student2, faculty1, course1, submission1a_2);
        Grade grade1b_1 = createGrade(86.8, student1, faculty1, course1, submission1b_1);
        Grade grade1b_2 = createGrade(88.7, student2, faculty1, course1, submission1b_2);
        Grade grade1c_1 = createGrade(85.6, student1, faculty1, course1, submission1c_1);
        Grade grade1c_2 = createGrade(87.3, student2, faculty1, course1, submission1c_2);
        Grade grade1d_1 = createGrade(89.1, student1, faculty1, course1, submission1d_1);
        Grade grade1d_2 = createGrade(86.4, student2, faculty1, course1, submission1d_2);
        Grade grade1e_1 = createGrade(88.3, student1, faculty1, course1, submission1e_1);
        Grade grade1e_2 = createGrade(85.9, student2, faculty1, course1, submission1e_2);
        Grade grade1f_1 = createGrade(87.4, student1, faculty1, course1, submission1f_1);
        Grade grade1f_2 = createGrade(89.6, student2, faculty1, course1, submission1f_2);

        Grade grade2a_1 = createGrade(87.5, student1, faculty2, course2, submission2a_1);
        Grade grade2a_2 = createGrade(88.9, student2, faculty2, course2, submission2a_2);
        Grade grade2b_1 = createGrade(86.1, student1, faculty2, course2, submission2b_1);
        Grade grade2b_2 = createGrade(89.4, student2, faculty2, course2, submission2b_2);
        Grade grade2c_1 = createGrade(87.8, student1, faculty2, course2, submission2c_1);
        Grade grade2c_2 = createGrade(85.7, student2, faculty2, course2, submission2c_2);
        Grade grade2d_1 = createGrade(89.2, student1, faculty2, course2, submission2d_1);
        Grade grade2d_2 = createGrade(86.4, student2, faculty2, course2, submission2d_2);
        Grade grade2e_1 = createGrade(88.5, student1, faculty2, course2, submission2e_1);
        Grade grade2e_2 = createGrade(87.1, student2, faculty2, course2, submission2e_2);
        Grade grade2f_1 = createGrade(85.3, student1, faculty2, course2, submission2f_1);
        Grade grade2f_2 = createGrade(88.7, student2, faculty2, course2, submission2f_2);

        Grade grade3a_1 = createGrade(86.9, student1, faculty3, course3, submission3a_1);
        Grade grade3a_2 = createGrade(89.3, student2, faculty3, course3, submission3a_2);
        Grade grade3b_1 = createGrade(85.7, student1, faculty3, course3, submission3b_1);
        Grade grade3b_2 = createGrade(88.4, student2, faculty3, course3, submission3b_2);
        Grade grade3c_1 = createGrade(87.5, student1, faculty3, course3, submission3c_1);
        Grade grade3c_2 = createGrade(85.9, student2, faculty3, course3, submission3c_2);
        Grade grade3d_1 = createGrade(88.1, student1, faculty3, course3, submission3d_1);
        Grade grade3d_2 = createGrade(86.7, student2, faculty3, course3, submission3d_2);

        Grade grade4a_1 = createGrade(88.2, student1, faculty4, course4, submission4a_1);
        Grade grade4a_2 = createGrade(86.7, student2, faculty4, course4, submission4a_2);
        Grade grade4b_1 = createGrade(89.5, student1, faculty4, course4, submission4b_1);
        Grade grade4b_2 = createGrade(87.1, student2, faculty4, course4, submission4b_2);
        Grade grade4c_1 = createGrade(85.9, student1, faculty4, course4, submission4c_1);
        Grade grade4c_2 = createGrade(88.6, student2, faculty4, course4, submission4c_2);
        Grade grade4d_1 = createGrade(87.3, student1, faculty4, course4, submission4d_1);
        Grade grade4d_2 = createGrade(89.4, student2, faculty4, course4, submission4d_2);

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

        Grade grade13a_7 = createGrade(87.6, student7, faculty3, course13, submission13a_7);
        Grade grade13a_8 = createGrade(88.3, student8, faculty3, course13, submission13a_8);
        Grade grade13b_7 = createGrade(86.4, student7, faculty3, course13, submission13b_7);
        Grade grade13b_8 = createGrade(89.2, student8, faculty3, course13, submission13b_8);
        Grade grade13c_7 = createGrade(88.7, student7, faculty3, course13, submission13c_7);
        Grade grade13c_8 = createGrade(86.9, student8, faculty3, course13, submission13c_8);
        Grade grade13d_7 = createGrade(87.3, student7, faculty3, course13, submission13d_7);
        Grade grade13d_8 = createGrade(85.8, student8, faculty3, course13, submission13d_8);

        Grade grade14a_7 = createGrade(88.3, student7, faculty4, course14, submission14a_7);
        Grade grade14a_8 = createGrade(86.9, student8, faculty4, course14, submission14a_8);
        Grade grade14b_7 = createGrade(87.4, student7, faculty4, course14, submission14b_7);
        Grade grade14b_8 = createGrade(85.7, student8, faculty4, course14, submission14b_8);
        Grade grade14c_7 = createGrade(89.1, student7, faculty4, course14, submission14c_7);
        Grade grade14c_8 = createGrade(84.3, student8, faculty4, course14, submission14c_8);
        Grade grade14d_7 = createGrade(88.7, student7, faculty4, course14, submission14d_7);
        Grade grade14d_8 = createGrade(87.8, student8, faculty4, course14, submission14d_8);

        Grade grade15a_7 = createGrade(88.3, student7, faculty5, course15, submission15a_7);
        Grade grade15a_8 = createGrade(86.4, student8, faculty5, course15, submission15a_8);
        Grade grade15b_7 = createGrade(89.1, student7, faculty5, course15, submission15b_7);
        Grade grade15b_8 = createGrade(87.8, student8, faculty5, course15, submission15b_8);
        Grade grade15c_7 = createGrade(88.6, student7, faculty5, course15, submission15c_7);
        Grade grade15c_8 = createGrade(85.7, student8, faculty5, course15, submission15c_8);

        Grade grade16a_7 = createGrade(87.6, student7, faculty1, course16, submission16a_7);
        Grade grade16a_8 = createGrade(86.3, student8, faculty1, course16, submission16a_8);
        Grade grade16b_7 = createGrade(88.9, student7, faculty1, course16, submission16b_7);
        Grade grade16b_8 = createGrade(87.1, student8, faculty1, course16, submission16b_8);
        Grade grade16c_7 = createGrade(85.8, student7, faculty1, course16, submission16c_7);
        Grade grade16c_8 = createGrade(88.2, student8, faculty1, course16, submission16c_8);

        Grade grade17a_9 = createGrade(87.4, student9, faculty2, course17, submission17a_9);
        Grade grade17a_10 = createGrade(89.1, student10, faculty2, course17, submission17a_10);
        Grade grade17b_9 = createGrade(85.8, student9, faculty2, course17, submission17b_9);
        Grade grade17b_10 = createGrade(88.7, student10, faculty2, course17, submission17b_10);
        Grade grade17c_9 = createGrade(89.3, student9, faculty2, course17, submission17c_9);
        Grade grade17c_10 = createGrade(86.5, student10, faculty2, course17, submission17c_10);
        Grade grade17d_9 = createGrade(87.7, student9, faculty2, course17, submission17d_9);
        Grade grade17d_10 = createGrade(88.9, student10, faculty2, course17, submission17d_10);

        Grade grade18a_9 = createGrade(87.8, student9, faculty3, course18, submission18a_9);
        Grade grade18a_10 = createGrade(89.2, student10, faculty3, course18, submission18a_10);
        Grade grade18b_9 = createGrade(86.5, student9, faculty3, course18, submission18b_9);
        Grade grade18b_10 = createGrade(88.1, student10, faculty3, course18, submission18b_10);
        Grade grade18c_9 = createGrade(87.3, student9, faculty3, course18, submission18c_9);
        Grade grade18c_10 = createGrade(85.6, student10, faculty3, course18, submission18c_10);

        Grade grade19a_9 = createGrade(88.4, student9, faculty4, course19, submission19a_9);
        Grade grade19a_10 = createGrade(86.9, student10, faculty4, course19, submission19a_10);
        Grade grade19b_9 = createGrade(87.7, student9, faculty4, course19, submission19b_9);
        Grade grade19b_10 = createGrade(89.3, student10, faculty4, course19, submission19b_10);
        Grade grade19c_9 = createGrade(85.8, student9, faculty4, course19, submission19c_9);
        Grade grade19c_10 = createGrade(88.1, student10, faculty4, course19, submission19c_10);

        Grade grade20a_9 = createGrade(88.9, student9, faculty5, course20, submission20a_9);
        Grade grade20a_10 = createGrade(86.5, student10, faculty5, course20, submission20a_10);
        Grade grade20b_9 = createGrade(87.6, student9, faculty5, course20, submission20b_9);
        Grade grade20b_10 = createGrade(89.4, student10, faculty5, course20, submission20b_10);
        Grade grade20c_9 = createGrade(86.2, student9, faculty5, course20, submission20c_9);
        Grade grade20c_10 = createGrade(88.3, student10, faculty5, course20, submission20c_10);
        Grade grade20d_9 = createGrade(87.7, student9, faculty5, course20, submission20d_9);
        Grade grade20d_10 = createGrade(85.8, student10, faculty5, course20, submission20d_10);


        CourseGrade courseGrade1a_1 = createCourseGrade(student1, course1, 87.4);
        CourseGrade courseGrade1a_2 = createCourseGrade(student2, course1, 87.9);

        CourseGrade courseGrade2a_1 = createCourseGrade(student1, course2, 87.4);
        CourseGrade courseGrade2a_2 = createCourseGrade(student2, course2, 87.7);

        CourseGrade courseGrade3a_1 = createCourseGrade(student1, course3, 87.05);
        CourseGrade courseGrade3a_2 = createCourseGrade(student2, course3, 87.575);

        CourseGrade courseGrade4a_1 = createCourseGrade(student1, course4, 87.725);
        CourseGrade courseGrade4a_2 = createCourseGrade(student2, course4, 87.95);

        CourseGrade courseGrade5a_3 = createCourseGrade(student3, course5, 86.925);
        CourseGrade courseGrade5a_4 = createCourseGrade(student4, course5, 88.025);

        CourseGrade courseGrade6a_3 = createCourseGrade(student3, course6, 87.44);
        CourseGrade courseGrade6a_4 = createCourseGrade(student4, course6, 87.54);

        CourseGrade courseGrade7a_3 = createCourseGrade(student3, course7, 87.5);
        CourseGrade courseGrade7a_4 = createCourseGrade(student4, course7, 87.0);

        CourseGrade courseGrade8a_3 = createCourseGrade(student3, course8, 87.74);
        CourseGrade courseGrade8a_4 = createCourseGrade(student4, course8, 87.02);

        CourseGrade courseGrade9a_5 = createCourseGrade(student5, course9, 87.23);
        CourseGrade courseGrade9a_6 = createCourseGrade(student6, course9, 88.17);

        CourseGrade courseGrade10a_5 = createCourseGrade(student5, course10, 88.35);
        CourseGrade courseGrade10a_6 = createCourseGrade(student6, course10, 87.35);

        CourseGrade courseGrade11a_5 = createCourseGrade(student5, course11, 86.95);
        CourseGrade courseGrade11a_6 = createCourseGrade(student6, course11, 87.95);

        CourseGrade courseGrade12a_5 = createCourseGrade(student5, course12, 87.58);
        CourseGrade courseGrade12a_6 = createCourseGrade(student6, course12, 88.18);

        CourseGrade courseGrade13a_7 = createCourseGrade(student7, course13, 87.5);
        CourseGrade courseGrade13a_8 = createCourseGrade(student8, course13, 88.05);

        CourseGrade courseGrade14a_7 = createCourseGrade(student7, course14, 88.375);
        CourseGrade courseGrade14a_8 = createCourseGrade(student8, course14, 86.175);

        CourseGrade courseGrade15a_7 = createCourseGrade(student7, course15, 88.667);
        CourseGrade courseGrade15a_8 = createCourseGrade(student8, course15, 86.633);

        CourseGrade courseGrade16a_7 = createCourseGrade(student7, course16, 87.433);
        CourseGrade courseGrade16a_8 = createCourseGrade(student8, course16, 87.2);

        CourseGrade courseGrade17a_9 = createCourseGrade(student9, course17, 87.55);
        CourseGrade courseGrade17a_10 = createCourseGrade(student10, course17, 88.3);

        CourseGrade courseGrade18a_9 = createCourseGrade(student9, course18, 87.2);
        CourseGrade courseGrade18a_10 = createCourseGrade(student10, course18, 87.63);

        CourseGrade courseGrade19a_9 = createCourseGrade(student9, course19, 87.3);
        CourseGrade courseGrade19a_10 = createCourseGrade(student10, course19, 88.1);

        CourseGrade courseGrade20a_9 = createCourseGrade(student9, course20, 87.6);
        CourseGrade courseGrade20a_10 = createCourseGrade(student10, course20, 87.5);


        Feedback feedback1a_1 = createFeedback("Great job on the submission, student1!", submission1a_1);
        Feedback feedback1a_2 = createFeedback("Well done, student2!", submission1a_2);

        Feedback feedback1b_1 = createFeedback("Excellent effort, student1.", submission1b_1);
        Feedback feedback1b_2 = createFeedback("Nice work, student2.", submission1b_2);

        Feedback feedback1c_1 = createFeedback("Good answers, student1.", submission1c_1);
        Feedback feedback1c_2 = createFeedback("Strong performance, student2.", submission1c_2);

        Feedback feedback1d_1 = createFeedback("Well written, student1.", submission1d_1);
        Feedback feedback1d_2 = createFeedback("Great job, student2.", submission1d_2);

        Feedback feedback1e_1 = createFeedback("Impressive work, student1!", submission1e_1);
        Feedback feedback1e_2 = createFeedback("Solid submission, student2.", submission1e_2);

        Feedback feedback1f_1 = createFeedback("Very good effort, student1.", submission1f_1);
        Feedback feedback1f_2 = createFeedback("Nice job on the answers, student2.", submission1f_2);

        Feedback feedback2a_1 = createFeedback("Great job on the submission, student1!", submission2a_1);
        Feedback feedback2a_2 = createFeedback("Well done, student2!", submission2a_2);

        Feedback feedback2b_1 = createFeedback("Excellent effort, student1.", submission2b_1);
        Feedback feedback2b_2 = createFeedback("Nice work, student2.", submission2b_2);

        Feedback feedback2c_1 = createFeedback("Good answers, student1.", submission2c_1);
        Feedback feedback2c_2 = createFeedback("Strong performance, student2.", submission2c_2);

        Feedback feedback2d_1 = createFeedback("Well written, student1.", submission2d_1);
        Feedback feedback2d_2 = createFeedback("Great job, student2.", submission2d_2);

        Feedback feedback2e_1 = createFeedback("Impressive work, student1!", submission2e_1);
        Feedback feedback2e_2 = createFeedback("Solid submission, student2.", submission2e_2);

        Feedback feedback2f_1 = createFeedback("Very good effort, student1.", submission2f_1);
        Feedback feedback2f_2 = createFeedback("Nice job on the answers, student2.", submission2f_2);

        Feedback feedback3a_1 = createFeedback("Great job on the submission, student1!", submission3a_1);
        Feedback feedback3a_2 = createFeedback("Well done, student2!", submission3a_2);

        Feedback feedback3b_1 = createFeedback("Excellent effort, student1.", submission3b_1);
        Feedback feedback3b_2 = createFeedback("Nice work, student2.", submission3b_2);

        Feedback feedback3c_1 = createFeedback("Good answers, student1.", submission3c_1);
        Feedback feedback3c_2 = createFeedback("Strong performance, student2.", submission3c_2);

        Feedback feedback3d_1 = createFeedback("Well written, student1.", submission3d_1);
        Feedback feedback3d_2 = createFeedback("Great job, student2.", submission3d_2);

        Feedback feedback4a_1 = createFeedback("Great job on the submission, student1!", submission4a_1);
        Feedback feedback4a_2 = createFeedback("Well done, student2!", submission4a_2);

        Feedback feedback4b_1 = createFeedback("Excellent effort, student1.", submission4b_1);
        Feedback feedback4b_2 = createFeedback("Nice work, student2.", submission4b_2);

        Feedback feedback4c_1 = createFeedback("Good answers, student1.", submission4c_1);
        Feedback feedback4c_2 = createFeedback("Strong performance, student2.", submission4c_2);

        Feedback feedback4d_1 = createFeedback("Well written, student1.", submission4d_1);
        Feedback feedback4d_2 = createFeedback("Great job, student2.", submission4d_2);

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

        Feedback feedback13a_7 = createFeedback("Excellent work, student7!", submission13a_7);
        Feedback feedback13a_8 = createFeedback("Great effort, student8!", submission13a_8);

        Feedback feedback13b_7 = createFeedback("Impressive answers, student7.", submission13b_7);
        Feedback feedback13b_8 = createFeedback("Nice job, student8.", submission13b_8);

        Feedback feedback13c_7 = createFeedback("Well done on the answers, student7.", submission13c_7);
        Feedback feedback13c_8 = createFeedback("Good work, student8!", submission13c_8);

        Feedback feedback13d_7 = createFeedback("Great effort, student7!", submission13d_7);
        Feedback feedback13d_8 = createFeedback("Well done, student8!", submission13d_8);

        Feedback feedback14a_7 = createFeedback("Great job on the submission, student7!", submission14a_7);
        Feedback feedback14a_8 = createFeedback("Well done, student8!", submission14a_8);

        Feedback feedback14b_7 = createFeedback("Excellent effort, student7.", submission14b_7);
        Feedback feedback14b_8 = createFeedback("Nice work, student8.", submission14b_8);

        Feedback feedback14c_7 = createFeedback("Good answers, student7.", submission14c_7);
        Feedback feedback14c_8 = createFeedback("Strong performance, student8.", submission14c_8);

        Feedback feedback14d_7 = createFeedback("Well written, student7.", submission14d_7);
        Feedback feedback14d_8 = createFeedback("Great job, student8.", submission14d_8);

        Feedback feedback15a_7 = createFeedback("Great job on the submission, student7!", submission15a_7);
        Feedback feedback15a_8 = createFeedback("Well done, student8!", submission15a_8);

        Feedback feedback15b_7 = createFeedback("Excellent effort, student7.", submission15b_7);
        Feedback feedback15b_8 = createFeedback("Nice work, student8.", submission15b_8);

        Feedback feedback15c_7 = createFeedback("Good answers, student7.", submission15c_7);
        Feedback feedback15c_8 = createFeedback("Strong performance, student8.", submission15c_8);

        Feedback feedback16a_7 = createFeedback("Great job on the submission, student7!", submission16a_7);
        Feedback feedback16a_8 = createFeedback("Well done, student8!", submission16a_8);

        Feedback feedback16b_7 = createFeedback("Excellent effort, student7.", submission16b_7);
        Feedback feedback16b_8 = createFeedback("Nice work, student8.", submission16b_8);

        Feedback feedback16c_7 = createFeedback("Good answers, student7.", submission16c_7);
        Feedback feedback16c_8 = createFeedback("Strong performance, student8.", submission16c_8);

        Feedback feedback17a_9 = createFeedback("Excellent work, student9!", submission17a_9);
        Feedback feedback17a_10 = createFeedback("Great effort, student10!", submission17a_10);

        Feedback feedback17b_9 = createFeedback("Impressive answers, student9.", submission17b_9);
        Feedback feedback17b_10 = createFeedback("Nice job, student10.", submission17b_10);

        Feedback feedback17c_9 = createFeedback("Well done on the answers, student9.", submission17c_9);
        Feedback feedback17c_10 = createFeedback("Good work, student10!", submission17c_10);

        Feedback feedback17d_9 = createFeedback("Great effort, student9!", submission17d_9);
        Feedback feedback17d_10 = createFeedback("Well done, student10!", submission17d_10);

        Feedback feedback18a_9 = createFeedback("Excellent work, student9!", submission18a_9);
        Feedback feedback18a_10 = createFeedback("Great effort, student10!", submission18a_10);

        Feedback feedback18b_9 = createFeedback("Impressive answers, student9.", submission18b_9);
        Feedback feedback18b_10 = createFeedback("Nice job, student10.", submission18b_10);

        Feedback feedback18c_9 = createFeedback("Well done on the answers, student9.", submission18c_9);
        Feedback feedback18c_10 = createFeedback("Good work, student10!", submission18c_10);

        Feedback feedback19a_9 = createFeedback("Excellent work, student9!", submission19a_9);
        Feedback feedback19a_10 = createFeedback("Great effort, student10!", submission19a_10);

        Feedback feedback19b_9 = createFeedback("Impressive answers, student9.", submission19b_9);
        Feedback feedback19b_10 = createFeedback("Nice job, student10.", submission19b_10);

        Feedback feedback19c_9 = createFeedback("Well done on the answers, student9.", submission19c_9);
        Feedback feedback19c_10 = createFeedback("Good work, student10!", submission19c_10);

        Feedback feedback20a_9 = createFeedback("Excellent work, student9!", submission20a_9);
        Feedback feedback20a_10 = createFeedback("Great effort, student10!", submission20a_10);

        Feedback feedback20b_9 = createFeedback("Impressive answers, student9.", submission20b_9);
        Feedback feedback20b_10 = createFeedback("Nice job, student10.", submission20b_10);

        Feedback feedback20c_9 = createFeedback("Well done on the answers, student9.", submission20c_9);
        Feedback feedback20c_10 = createFeedback("Good work, student10!", submission20c_10);

        Feedback feedback20d_9 = createFeedback("Great effort, student9!", submission20d_9);
        Feedback feedback20d_10 = createFeedback("Well done, student10!", submission20d_10);

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

}
