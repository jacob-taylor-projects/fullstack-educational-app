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
public class Test1to4Seeder implements CommandLineRunner {
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
        addStudentToTest(test1a, student1);
        addStudentToTest(test1a, student2);

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
        addStudentToTest(test1b, student1);
        addStudentToTest(test1b, student2);

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
        addStudentToTest(test1c, student1);
        addStudentToTest(test1c, student2);

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
        addStudentToTest(test1d, student1);
        addStudentToTest(test1d, student2);

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
        addStudentToTest(test1e, student1);
        addStudentToTest(test1e, student2);

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
        addStudentToTest(test1f, student1);
        addStudentToTest(test1f, student2);

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
        addStudentToTest(test2a, student1);
        addStudentToTest(test2a, student2);

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
        addStudentToTest(test2b, student1);
        addStudentToTest(test2b, student2);

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
        addStudentToTest(test2c, student1);
        addStudentToTest(test2c, student2);

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
        addStudentToTest(test2d, student1);
        addStudentToTest(test2d, student2);

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
        addStudentToTest(test2e, student1);
        addStudentToTest(test2e, student2);

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
        addStudentToTest(test2f, student1);
        addStudentToTest(test2f, student2);

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
        addStudentToTest(test3a, student1);
        addStudentToTest(test3a, student2);

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
        addStudentToTest(test3b, student1);
        addStudentToTest(test3b, student2);

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
        addStudentToTest(test3c, student1);
        addStudentToTest(test3c, student2);

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
        addStudentToTest(test3d, student1);
        addStudentToTest(test3d, student2);

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
        addStudentToTest(test4a, student1);
        addStudentToTest(test4a, student2);

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
        addStudentToTest(test4b, student1);
        addStudentToTest(test4b, student2);

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
        addStudentToTest(test4c, student1);
        addStudentToTest(test4c, student2);

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
        addStudentToTest(test4d, student1);
        addStudentToTest(test4d, student2);
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

        CourseGrade courseGrade1a_1 = createCourseGrade(student1, course1, 87.4, List.of(grade1a_1, grade1b_1, grade1c_1, grade1d_1, grade1e_1, grade1f_1));
        CourseGrade courseGrade1a_2 = createCourseGrade(student2, course1, 87.9, List.of(grade1a_2, grade1b_2, grade1c_2, grade1d_2, grade1e_2, grade1f_2));

        CourseGrade courseGrade2a_1 = createCourseGrade(student1, course2, 87.4, List.of(grade2a_1, grade2b_1, grade2c_1, grade2d_1, grade2e_1, grade2f_1));
        CourseGrade courseGrade2a_2 = createCourseGrade(student2, course2, 87.7, List.of(grade2a_2, grade2b_2, grade2c_2, grade2d_2, grade2e_2, grade2f_2));

        CourseGrade courseGrade3a_1 = createCourseGrade(student1, course3, 87.05, List.of(grade3a_1, grade3b_1, grade3c_1, grade3d_1));
        CourseGrade courseGrade3a_2 = createCourseGrade(student2, course3, 87.575, List.of(grade3a_2, grade3b_2, grade3c_2, grade3d_2));

        CourseGrade courseGrade4a_1 = createCourseGrade(student1, course4, 87.725, List.of(grade4a_1, grade4b_1, grade4c_1, grade4d_1));
        CourseGrade courseGrade4a_2 = createCourseGrade(student2, course4, 87.95, List.of(grade4a_2, grade4b_2, grade4c_2, grade4d_2));

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

        course1.setGrades(List.of(grade1a_1, grade1a_2, grade1b_1, grade1b_2, grade1c_1, grade1c_2, grade1d_1, grade1d_2, grade1e_1, grade1e_2, grade1f_1, grade1f_2));
        course2.setGrades(List.of(grade2a_1, grade2a_2, grade2b_1, grade2b_2, grade2c_1, grade2c_2, grade2d_1, grade2d_2, grade2e_1, grade2e_2, grade2f_1, grade2f_2));
        course3.setGrades(List.of(grade3a_1, grade3a_2, grade3b_1, grade3b_2, grade3c_1, grade3c_2, grade3d_1, grade3d_2));
        course4.setGrades(List.of(grade4a_1, grade4a_2, grade4b_1, grade4b_2, grade4c_1, grade4c_2, grade4d_1, grade4d_2));


        course1.setCourseGrades(List.of(courseGrade1a_1, courseGrade1a_2));
        course2.setCourseGrades(List.of(courseGrade2a_1, courseGrade2a_2));
        course3.setCourseGrades(List.of(courseGrade3a_1, courseGrade3a_2));
        course4.setCourseGrades(List.of(courseGrade4a_1, courseGrade4a_2));

        createFacultyWithTest(faculty1, List.of(grade1a_1, grade1a_2, grade1b_1, grade1b_2, grade1c_1, grade1c_2, grade1d_1, grade1d_2, grade1e_1, grade1e_2, grade1f_1, grade1f_2), List.of(test1a, test1b, test1c, test1d, test1e, test1f));
        createFacultyWithTest(faculty2, List.of(grade2a_1, grade2a_2, grade2b_1, grade2b_2, grade2c_1, grade2c_2, grade2d_1, grade2d_2, grade2e_1, grade2e_2, grade2f_1, grade2f_2), List.of(test2a, test2b, test2c, test2d, test2e, test2f));
        createFacultyWithTest(faculty3, List.of(grade3a_1, grade3a_2, grade3b_1, grade3b_2, grade3c_1, grade3c_2, grade3d_1, grade3d_2), List.of(test3a, test3b, test3c, test3d));
        createFacultyWithTest(faculty4, List.of(grade4a_1, grade4a_2, grade4b_1, grade4b_2, grade4c_1, grade4c_2, grade4d_1, grade4d_2), List.of(test4a, test4b, test4c, test4d));

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

    public static Faculty createFacultyWithTest(Faculty faculty, List<Grade> grades, List<Test> tests) {
        faculty.setGrades(grades);
        faculty.setTests(tests);
        return faculty;
    }

}
