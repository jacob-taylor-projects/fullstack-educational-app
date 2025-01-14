package com.project.education_app;

import com.project.education_app.entities.*;
import com.project.education_app.repos.CourseRepo;
import com.project.education_app.repos.FacultyRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.repos.SyllabusRepo;
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


import static com.project.education_app.Seeder.*;
import static com.project.education_app.Seeder.createGrade;

@Component
@Data
public class Assignment1to4Seeder implements CommandLineRunner {
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


        //Course 1 Unit 1 Assignment
        // Creating the assignment
        Assignment assignment = createAssignment("Variables Assignment", faculty1, Date.from(LocalDate.of(2024, 12, 31).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        addStudentToAssignment(assignment, student1);
        addStudentToAssignment(assignment, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Variables' unit created with 10 problem answers.");

        //Course 1 Unit 2 Assignment

        // Creating the assignment with the due date specified inline
        Assignment assignment2 = createAssignment("Data Types Assignment", faculty1, Date.from(LocalDate.of(2025, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        addStudentToAssignment(assignment2, student1);
        addStudentToAssignment(assignment2, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Data Types' unit created with 10 problem answers and due date " + Date.from(LocalDate.of(2025, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()));

        // Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment3 = createAssignment("Control Structures Assignment", faculty1, Date.from(LocalDate.of(2025, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        addStudentToAssignment(assignment3, student1);
        addStudentToAssignment(assignment3, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Control Structures' unit created with 10 problem answers, due date, faculty, and syllabus.");
        // Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment4 = createAssignment("Functions Assignment", faculty1, Date.from(LocalDate.of(2025, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        addStudentToAssignment(assignment4, student1);
        addStudentToAssignment(assignment4, student2);

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
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment5 = createAssignment("Modules Assignment", faculty1, Date.from(LocalDate.of(2025, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        addStudentToAssignment(assignment5, student1);
        addStudentToAssignment(assignment5, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Modules' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment6 = createAssignment("Libraries Assignment", faculty1, Date.from(LocalDate.of(2025, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus1, false);
        addStudentToAssignment(assignment6, student1);
        addStudentToAssignment(assignment6, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Libraries' unit created with 10 problem answers, due date, faculty, and syllabus.");

// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_1 = createAssignment("Arrays Assignment", faculty2, Date.from(LocalDate.of(2025, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        addStudentToAssignment(assignment2_1, student1);
        addStudentToAssignment(assignment2_1, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Arrays' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_2 = createAssignment("Linked Lists Assignment", faculty2, Date.from(LocalDate.of(2025, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        addStudentToAssignment(assignment2_2, student1);
        addStudentToAssignment(assignment2_2, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Linked Lists' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_3 = createAssignment("Stacks Assignment", faculty2, Date.from(LocalDate.of(2025, 7, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        addStudentToAssignment(assignment2_3, student1);
        addStudentToAssignment(assignment2_3, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Stacks' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_4 = createAssignment("Queues Assignment", faculty2, Date.from(LocalDate.of(2025, 8, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        addStudentToAssignment(assignment2_4, student1);
        addStudentToAssignment(assignment2_4, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Queues' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_5 = createAssignment("Trees Assignment", faculty2, Date.from(LocalDate.of(2025, 9, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        addStudentToAssignment(assignment2_5, student1);
        addStudentToAssignment(assignment2_5, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Trees' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment2_6 = createAssignment("Graphs Assignment", faculty2, Date.from(LocalDate.of(2025, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus2, false);
        addStudentToAssignment(assignment2_6, student1);
        addStudentToAssignment(assignment2_6, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Graphs' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment3_1 = createAssignment("Sorting Assignment", faculty3, Date.from(LocalDate.of(2025, 11, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);
        addStudentToAssignment(assignment3_1, student1);
        addStudentToAssignment(assignment3_1, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Sorting' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment3_2 = createAssignment("Searching Assignment", faculty3, Date.from(LocalDate.of(2025, 12, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);
        addStudentToAssignment(assignment3_2, student1);
        addStudentToAssignment(assignment3_2, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Searching' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment3_3 = createAssignment("Graph Algorithms Assignment", faculty3, Date.from(LocalDate.of(2026, 1, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);
        addStudentToAssignment(assignment3_3, student1);
        addStudentToAssignment(assignment3_3, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Graph Algorithms' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment3_4 = createAssignment("Dynamic Programming Assignment", faculty3, Date.from(LocalDate.of(2026, 2, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus3, false);
        addStudentToAssignment(assignment3_4, student1);
        addStudentToAssignment(assignment3_4, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Dynamic Programming' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment4_1 = createAssignment("Relational Databases Assignment", faculty4, Date.from(LocalDate.of(2026, 3, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);
        addStudentToAssignment(assignment4_1, student1);
        addStudentToAssignment(assignment4_1, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Relational Databases' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment4_2 = createAssignment("SQL Assignment", faculty4, Date.from(LocalDate.of(2026, 4, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);
        addStudentToAssignment(assignment4_2, student1);
        addStudentToAssignment(assignment4_2, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'SQL' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment4_3 = createAssignment("Transactions Assignment", faculty4, Date.from(LocalDate.of(2026, 5, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);
        addStudentToAssignment(assignment4_3, student1);
        addStudentToAssignment(assignment4_3, student2);

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


// Output for confirmation
        System.out.println("Assignment for 'Transactions' unit created with 10 problem answers, due date, faculty, and syllabus.");
// Creating the assignment with the due date specified inline and including the teacher and syllabus
        Assignment assignment4_4 = createAssignment("Database Design Assignment", faculty4, Date.from(LocalDate.of(2026, 6, 15).atStartOfDay(ZoneId.systemDefault()).toInstant()), syllabus4, false);
        addStudentToAssignment(assignment4_4, student1);
        addStudentToAssignment(assignment4_4, student2);

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


        // Creating StudentAnswer instances for student1
        StudentAnswer sa1_1_1_student1 = createStudentAnswer(student1, pa1_1_1, "A variable in programming is a storage location identified by a name that holds data.");
        addStudentAnswerToProblemAnswer(pa1_1_1, sa1_1_1_student1);

        StudentAnswer sa1_1_2_student1 = createStudentAnswer(student1, pa1_1_2, "x = 5");
        addStudentAnswerToProblemAnswer(pa1_1_2, sa1_1_2_student1);

        StudentAnswer sa1_1_3_student1 = createStudentAnswer(student1, pa1_1_3, "Variables store and manipulate data.");
        addStudentAnswerToProblemAnswer(pa1_1_3, sa1_1_3_student1);

        StudentAnswer sa1_1_4_student1 = createStudentAnswer(student1, pa1_1_4, "Reassign with a new value: x = 10.");
        addStudentAnswerToProblemAnswer(pa1_1_4, sa1_1_4_student1);

        StudentAnswer sa1_1_5_student1 = createStudentAnswer(student1, pa1_1_5, "Start with a letter or underscore, case-sensitive.");
        addStudentAnswerToProblemAnswer(pa1_1_5, sa1_1_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa1_1_1_student2 = createStudentAnswer(student2, pa1_1_1, "A variable holds data that can be changed.");
        addStudentAnswerToProblemAnswer(pa1_1_1, sa1_1_1_student2);

        StudentAnswer sa1_1_2_student2 = createStudentAnswer(student2, pa1_1_2, "y = 10");
        addStudentAnswerToProblemAnswer(pa1_1_2, sa1_1_2_student2);

        StudentAnswer sa1_1_3_student2 = createStudentAnswer(student2, pa1_1_3, "Variables are key for data manipulation.");
        addStudentAnswerToProblemAnswer(pa1_1_3, sa1_1_3_student2);

        StudentAnswer sa1_1_4_student2 = createStudentAnswer(student2, pa1_1_4, "Reassign it, e.g., x = 20.");
        addStudentAnswerToProblemAnswer(pa1_1_4, sa1_1_4_student2);

        StudentAnswer sa1_1_5_student2 = createStudentAnswer(student2, pa1_1_5, "Names must start with a letter or underscore.");
        addStudentAnswerToProblemAnswer(pa1_1_5, sa1_1_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa1_2_1_student1 = createStudentAnswer(student1, pa_1_2_1, "The primary data types in Python are integers, floats, strings, and booleans.");
        addStudentAnswerToProblemAnswer(pa_1_2_1, sa1_2_1_student1);

        StudentAnswer sa1_2_2_student1 = createStudentAnswer(student1, pa_1_2_2, "An integer is defined by assigning a whole number, like x = 10.");
        addStudentAnswerToProblemAnswer(pa_1_2_2, sa1_2_2_student1);

        StudentAnswer sa1_2_3_student1 = createStudentAnswer(student1, pa_1_2_3, "An integer is a whole number, a float includes a decimal point, like 3.14.");
        addStudentAnswerToProblemAnswer(pa_1_2_3, sa1_2_3_student1);

        StudentAnswer sa1_2_4_student1 = createStudentAnswer(student1, pa_1_2_4, "Convert a string to an integer using int(), e.g., int(\"10\") converts \"10\" to 10.");
        addStudentAnswerToProblemAnswer(pa_1_2_4, sa1_2_4_student1);

        StudentAnswer sa1_2_5_student1 = createStudentAnswer(student1, pa_1_2_5, "A boolean data type is True or False, used in conditionals.");
        addStudentAnswerToProblemAnswer(pa_1_2_5, sa1_2_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa1_2_1_student2 = createStudentAnswer(student2, pa_1_2_1, "The main data types are integers, floats, strings, and booleans.");
        addStudentAnswerToProblemAnswer(pa_1_2_1, sa1_2_1_student2);

        StudentAnswer sa1_2_2_student2 = createStudentAnswer(student2, pa_1_2_2, "Define an integer by assigning a whole number, like x = 20.");
        addStudentAnswerToProblemAnswer(pa_1_2_2, sa1_2_2_student2);

        StudentAnswer sa1_2_3_student2 = createStudentAnswer(student2, pa_1_2_3, "Integers are whole numbers, floats have decimals, like 2.71.");
        addStudentAnswerToProblemAnswer(pa_1_2_3, sa1_2_3_student2);

        StudentAnswer sa1_2_4_student2 = createStudentAnswer(student2, pa_1_2_4, "Use int() to convert strings to integers, like int(\"20\") converts \"20\" to 20.");
        addStudentAnswerToProblemAnswer(pa_1_2_4, sa1_2_4_student2);

        StudentAnswer sa1_2_5_student2 = createStudentAnswer(student2, pa_1_2_5, "Boolean data types are True or False, used in conditionals.");
        addStudentAnswerToProblemAnswer(pa_1_2_5, sa1_2_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment2.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa1_3_1_student1 = createStudentAnswer(student1, pa_1_3_1, "Control structures include loops and conditionals to control flow.");
        addStudentAnswerToProblemAnswer(pa_1_3_1, sa1_3_1_student1);

        StudentAnswer sa1_3_2_student1 = createStudentAnswer(student1, pa_1_3_2, "for i in range(5): print(i)");
        addStudentAnswerToProblemAnswer(pa_1_3_2, sa1_3_2_student1);

        StudentAnswer sa1_3_3_student1 = createStudentAnswer(student1, pa_1_3_3, "For loops iterate over elements, while loops repeat as long as condition is true.");
        addStudentAnswerToProblemAnswer(pa_1_3_3, sa1_3_3_student1);

        StudentAnswer sa1_3_4_student1 = createStudentAnswer(student1, pa_1_3_4, "x = 0; while x < 5: print(x); x += 1");
        addStudentAnswerToProblemAnswer(pa_1_3_4, sa1_3_4_student1);

        StudentAnswer sa1_3_5_student1 = createStudentAnswer(student1, pa_1_3_5, "Conditional statements include if, elif, else for decision-making.");
        addStudentAnswerToProblemAnswer(pa_1_3_5, sa1_3_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa1_3_1_student2 = createStudentAnswer(student2, pa_1_3_1, "Control structures are constructs like loops and conditionals.");
        addStudentAnswerToProblemAnswer(pa_1_3_1, sa1_3_1_student2);

        StudentAnswer sa1_3_2_student2 = createStudentAnswer(student2, pa_1_3_2, "for i in range(3): print(i)");
        addStudentAnswerToProblemAnswer(pa_1_3_2, sa1_3_2_student2);

        StudentAnswer sa1_3_3_student2 = createStudentAnswer(student2, pa_1_3_3, "For loops iterate over lists, while loops run while a condition is true.");
        addStudentAnswerToProblemAnswer(pa_1_3_3, sa1_3_3_student2);

        StudentAnswer sa1_3_4_student2 = createStudentAnswer(student2, pa_1_3_4, "x = 0; while x < 3: print(x); x += 1");
        addStudentAnswerToProblemAnswer(pa_1_3_4, sa1_3_4_student2);

        StudentAnswer sa1_3_5_student2 = createStudentAnswer(student2, pa_1_3_5, "Conditionals like if, elif, else allow decision-making in code.");
        addStudentAnswerToProblemAnswer(pa_1_3_5, sa1_3_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment3.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa1_4_1_student1 = createStudentAnswer(student1, pa_1_4_1, "A function is a block of code for a specific task, takes inputs, and returns output.");
        addStudentAnswerToProblemAnswer(pa_1_4_1, sa1_4_1_student1);

        StudentAnswer sa1_4_2_student1 = createStudentAnswer(student1, pa_1_4_2, "def greet(): print('Hello, world!')");
        addStudentAnswerToProblemAnswer(pa_1_4_2, sa1_4_2_student1);

        StudentAnswer sa1_4_3_student1 = createStudentAnswer(student1, pa_1_4_3, "Parameters are placeholders in function definitions for input values.");
        addStudentAnswerToProblemAnswer(pa_1_4_3, sa1_4_3_student1);

        StudentAnswer sa1_4_4_student1 = createStudentAnswer(student1, pa_1_4_4, "Call a function using its name followed by parentheses, e.g., greet().");
        addStudentAnswerToProblemAnswer(pa_1_4_4, sa1_4_4_student1);

        StudentAnswer sa1_4_5_student1 = createStudentAnswer(student1, pa_1_4_5, "Parameters are in definitions, arguments are actual values passed.");
        addStudentAnswerToProblemAnswer(pa_1_4_5, sa1_4_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa1_4_1_student2 = createStudentAnswer(student2, pa_1_4_1, "A function is a block of code that takes inputs and returns an output.");
        addStudentAnswerToProblemAnswer(pa_1_4_1, sa1_4_1_student2);

        StudentAnswer sa1_4_2_student2 = createStudentAnswer(student2, pa_1_4_2, "def greet(): print('Hello!')");
        addStudentAnswerToProblemAnswer(pa_1_4_2, sa1_4_2_student2);

        StudentAnswer sa1_4_3_student2 = createStudentAnswer(student2, pa_1_4_3, "Parameters are placeholders for input values in function definitions.");
        addStudentAnswerToProblemAnswer(pa_1_4_3, sa1_4_3_student2);

        StudentAnswer sa1_4_4_student2 = createStudentAnswer(student2, pa_1_4_4, "Call a function with its name followed by parentheses, e.g., greet().");
        addStudentAnswerToProblemAnswer(pa_1_4_4, sa1_4_4_student2);

        StudentAnswer sa1_4_5_student2 = createStudentAnswer(student2, pa_1_4_5, "Parameters are in definitions, arguments are values passed to functions.");
        addStudentAnswerToProblemAnswer(pa_1_4_5, sa1_4_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment4.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa1_5_1_student1 = createStudentAnswer(student1, pa_1_5_1, "A module in Python is a file with code that defines functions, classes, and variables.");
        addStudentAnswerToProblemAnswer(pa_1_5_1, sa1_5_1_student1);

        StudentAnswer sa1_5_2_student1 = createStudentAnswer(student1, pa_1_5_2, "Import a module using the import keyword, e.g., import math.");
        addStudentAnswerToProblemAnswer(pa_1_5_2, sa1_5_2_student1);

        StudentAnswer sa1_5_3_student1 = createStudentAnswer(student1, pa_1_5_3, "Modules improve code organization, reuse, and maintainability.");
        addStudentAnswerToProblemAnswer(pa_1_5_3, sa1_5_3_student1);

        StudentAnswer sa1_5_4_student1 = createStudentAnswer(student1, pa_1_5_4, "Access functions and variables using dot notation, e.g., math.sqrt(16).");
        addStudentAnswerToProblemAnswer(pa_1_5_4, sa1_5_4_student1);

        StudentAnswer sa1_5_5_student1 = createStudentAnswer(student1, pa_1_5_5, "Import specific functions using from keyword, e.g., from math import sqrt.");
        addStudentAnswerToProblemAnswer(pa_1_5_5, sa1_5_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa1_5_1_student2 = createStudentAnswer(student2, pa_1_5_1, "A module contains Python code for functions, classes, and variables.");
        addStudentAnswerToProblemAnswer(pa_1_5_1, sa1_5_1_student2);

        StudentAnswer sa1_5_2_student2 = createStudentAnswer(student2, pa_1_5_2, "Use the import keyword to import a module, e.g., import math.");
        addStudentAnswerToProblemAnswer(pa_1_5_2, sa1_5_2_student2);

        StudentAnswer sa1_5_3_student2 = createStudentAnswer(student2, pa_1_5_3, "Modules help organize, reuse, and maintain code.");
        addStudentAnswerToProblemAnswer(pa_1_5_3, sa1_5_3_student2);

        StudentAnswer sa1_5_4_student2 = createStudentAnswer(student2, pa_1_5_4, "Access module functions using dot notation, e.g., math.sqrt(16).");
        addStudentAnswerToProblemAnswer(pa_1_5_4, sa1_5_4_student2);

        StudentAnswer sa1_5_5_student2 = createStudentAnswer(student2, pa_1_5_5, "Import specific functions with from keyword, e.g., from math import sqrt.");
        addStudentAnswerToProblemAnswer(pa_1_5_5, sa1_5_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment5.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa1_6_1_student1 = createStudentAnswer(student1, pa_1_6_1, "A library is a collection of pre-written code for various tasks.");
        addStudentAnswerToProblemAnswer(pa_1_6_1, sa1_6_1_student1);

        StudentAnswer sa1_6_2_student1 = createStudentAnswer(student1, pa_1_6_2, "Install a library using pip, e.g., pip install requests.");
        addStudentAnswerToProblemAnswer(pa_1_6_2, sa1_6_2_student1);

        StudentAnswer sa1_6_3_student1 = createStudentAnswer(student1, pa_1_6_3, "A module is a single file, while a library is a collection of modules.");
        addStudentAnswerToProblemAnswer(pa_1_6_3, sa1_6_3_student1);

        StudentAnswer sa1_6_4_student1 = createStudentAnswer(student1, pa_1_6_4, "Import a library using the import keyword, e.g., import requests.");
        addStudentAnswerToProblemAnswer(pa_1_6_4, sa1_6_4_student1);

        StudentAnswer sa1_6_5_student1 = createStudentAnswer(student1, pa_1_6_5, "Popular libraries include NumPy, Pandas, Matplotlib, and requests.");
        addStudentAnswerToProblemAnswer(pa_1_6_5, sa1_6_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa1_6_1_student2 = createStudentAnswer(student2, pa_1_6_1, "A library contains pre-written code for various functionalities.");
        addStudentAnswerToProblemAnswer(pa_1_6_1, sa1_6_1_student2);

        StudentAnswer sa1_6_2_student2 = createStudentAnswer(student2, pa_1_6_2, "Use pip to install a library, e.g., pip install requests.");
        addStudentAnswerToProblemAnswer(pa_1_6_2, sa1_6_2_student2);

        StudentAnswer sa1_6_3_student2 = createStudentAnswer(student2, pa_1_6_3, "Modules are single files, libraries are collections of modules.");
        addStudentAnswerToProblemAnswer(pa_1_6_3, sa1_6_3_student2);

        StudentAnswer sa1_6_4_student2 = createStudentAnswer(student2, pa_1_6_4, "Import a library with the import keyword, e.g., import requests.");
        addStudentAnswerToProblemAnswer(pa_1_6_4, sa1_6_4_student2);

        StudentAnswer sa1_6_5_student2 = createStudentAnswer(student2, pa_1_6_5, "Popular libraries include NumPy, Pandas, Matplotlib, and requests.");
        addStudentAnswerToProblemAnswer(pa_1_6_5, sa1_6_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment6.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa2_1_1_student1 = createStudentAnswer(student1, pa_2_1_1, "An array is a collection of elements stored in contiguous memory locations.");
        addStudentAnswerToProblemAnswer(pa_2_1_1, sa2_1_1_student1);

        StudentAnswer sa2_1_2_student1 = createStudentAnswer(student1, pa_2_1_2, "In Python, use lists or the array module. Example: import array as arr; my_array = arr.array('i', [1, 2, 3, 4, 5]).");
        addStudentAnswerToProblemAnswer(pa_2_1_2, sa2_1_2_student1);

        StudentAnswer sa2_1_3_student1 = createStudentAnswer(student1, pa_2_1_3, "Arrays allow efficient data storage and retrieval, and quick access using indices.");
        addStudentAnswerToProblemAnswer(pa_2_1_3, sa2_1_3_student1);

        StudentAnswer sa2_1_4_student1 = createStudentAnswer(student1, pa_2_1_4, "Access an element using its index. Example: my_array[0] returns the first element.");
        addStudentAnswerToProblemAnswer(pa_2_1_4, sa2_1_4_student1);

        StudentAnswer sa2_1_5_student1 = createStudentAnswer(student1, pa_2_1_5, "Update an element by assigning a new value to the desired index. Example: my_array[0] = 10.");
        addStudentAnswerToProblemAnswer(pa_2_1_5, sa2_1_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa2_1_1_student2 = createStudentAnswer(student2, pa_2_1_1, "An array is a collection of elements stored contiguously in memory.");
        addStudentAnswerToProblemAnswer(pa_2_1_1, sa2_1_1_student2);

        StudentAnswer sa2_1_2_student2 = createStudentAnswer(student2, pa_2_1_2, "In Python, use lists or the array module. Example: import array as arr; my_array = arr.array('i', [1, 2, 3, 4, 5]).");
        addStudentAnswerToProblemAnswer(pa_2_1_2, sa2_1_2_student2);

        StudentAnswer sa2_1_3_student2 = createStudentAnswer(student2, pa_2_1_3, "Arrays are efficient for data storage and retrieval, providing quick access with indices.");
        addStudentAnswerToProblemAnswer(pa_2_1_3, sa2_1_3_student2);

        StudentAnswer sa2_1_4_student2 = createStudentAnswer(student2, pa_2_1_4, "Access an element by its index. Example: my_array[0] returns the first element.");
        addStudentAnswerToProblemAnswer(pa_2_1_4, sa2_1_4_student2);

        StudentAnswer sa2_1_5_student2 = createStudentAnswer(student2, pa_2_1_5, "Update an element by assigning a new value to the index. Example: my_array[0] = 10.");
        addStudentAnswerToProblemAnswer(pa_2_1_5, sa2_1_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment2_1.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa2_2_1_student1 = createStudentAnswer(student1, pa_2_2_1, "A linked list is a data structure with nodes that contain data and a reference to the next node.");
        addStudentAnswerToProblemAnswer(pa_2_2_1, sa2_2_1_student1);

        StudentAnswer sa2_2_2_student1 = createStudentAnswer(student1, pa_2_2_2, "A node in a linked list has data and a reference to the next node. Example:\nclass Node:\n    def __init__(self, data):\n        self.data = data\n        self.next = None");
        addStudentAnswerToProblemAnswer(pa_2_2_2, sa2_2_2_student1);

        StudentAnswer sa2_2_3_student1 = createStudentAnswer(student1, pa_2_2_3, "Linked lists allow efficient insertion and deletion, and use memory efficiently.");
        addStudentAnswerToProblemAnswer(pa_2_2_3, sa2_2_3_student1);

        StudentAnswer sa2_2_4_student1 = createStudentAnswer(student1, pa_2_2_4, "To insert at the beginning, create a new node, set its reference to the current head, and update the head to this new node.");
        addStudentAnswerToProblemAnswer(pa_2_2_4, sa2_2_4_student1);

        StudentAnswer sa2_2_5_student1 = createStudentAnswer(student1, pa_2_2_5, "A singly linked list has references to the next node only, while a doubly linked list has references to both the next and previous nodes.");
        addStudentAnswerToProblemAnswer(pa_2_2_5, sa2_2_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa2_2_1_student2 = createStudentAnswer(student2, pa_2_2_1, "A linked list is a data structure with nodes containing data and a reference to the next node.");
        addStudentAnswerToProblemAnswer(pa_2_2_1, sa2_2_1_student2);

        StudentAnswer sa2_2_2_student2 = createStudentAnswer(student2, pa_2_2_2, "A node has data and a reference to the next node. Example:\nclass Node:\n    def __init__(self, data):\n        self.data = data\n        self.next = None");
        addStudentAnswerToProblemAnswer(pa_2_2_2, sa2_2_2_student2);

        StudentAnswer sa2_2_3_student2 = createStudentAnswer(student2, pa_2_2_3, "Linked lists are efficient for insertion and deletion, and use memory well.");
        addStudentAnswerToProblemAnswer(pa_2_2_3, sa2_2_3_student2);

        StudentAnswer sa2_2_4_student2 = createStudentAnswer(student2, pa_2_2_4, "Insert at the beginning by creating a new node, setting its reference to the head, and updating the head.");
        addStudentAnswerToProblemAnswer(pa_2_2_4, sa2_2_4_student2);

        StudentAnswer sa2_2_5_student2 = createStudentAnswer(student2, pa_2_2_5, "Singly linked lists have next node references, doubly linked lists have next and previous node references.");
        addStudentAnswerToProblemAnswer(pa_2_2_5, sa2_2_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment2_2.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa2_3_1_student1 = createStudentAnswer(student1, pa_2_3_1, "A stack is a linear data structure following the LIFO principle, where the last element added is the first one removed.");
        addStudentAnswerToProblemAnswer(pa_2_3_1, sa2_3_1_student1);

        StudentAnswer sa2_3_2_student1 = createStudentAnswer(student1, pa_2_3_2, "Implement a stack using a list in Python. Example:\nstack = []\nstack.append(1)\nstack.append(2)\nstack.pop()");
        addStudentAnswerToProblemAnswer(pa_2_3_2, sa2_3_2_student1);

        StudentAnswer sa2_3_3_student1 = createStudentAnswer(student1, pa_2_3_3, "Main operations are push (adding an element), pop (removing the top element), and peek (viewing the top element).");
        addStudentAnswerToProblemAnswer(pa_2_3_3, sa2_3_3_student1);

        StudentAnswer sa2_3_4_student1 = createStudentAnswer(student1, pa_2_3_4, "Check if a stack is empty by verifying if its length is zero. Example:\nif len(stack) == 0: print(\"Stack is empty\")");
        addStudentAnswerToProblemAnswer(pa_2_3_4, sa2_3_4_student1);

        StudentAnswer sa2_3_5_student1 = createStudentAnswer(student1, pa_2_3_5, "The peek operation returns the top element without removing it.");
        addStudentAnswerToProblemAnswer(pa_2_3_5, sa2_3_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa2_3_1_student2 = createStudentAnswer(student2, pa_2_3_1, "A stack is a linear data structure that uses the LIFO principle, meaning the last element added is the first one to be removed.");
        addStudentAnswerToProblemAnswer(pa_2_3_1, sa2_3_1_student2);

        StudentAnswer sa2_3_2_student2 = createStudentAnswer(student2, pa_2_3_2, "Implement a stack in Python using a list. Example:\nstack = []\nstack.append(1)\nstack.append(2)\nstack.pop()");
        addStudentAnswerToProblemAnswer(pa_2_3_2, sa2_3_2_student2);

        StudentAnswer sa2_3_3_student2 = createStudentAnswer(student2, pa_2_3_3, "Main operations are push (adding an element), pop (removing the top element), and peek (viewing the top element without removing it).");
        addStudentAnswerToProblemAnswer(pa_2_3_3, sa2_3_3_student2);

        StudentAnswer sa2_3_4_student2 = createStudentAnswer(student2, pa_2_3_4, "Check if a stack is empty by checking if its length is zero. Example:\nif len(stack) == 0: print(\"Stack is empty\")");
        addStudentAnswerToProblemAnswer(pa_2_3_4, sa2_3_4_student2);

        StudentAnswer sa2_3_5_student2 = createStudentAnswer(student2, pa_2_3_5, "The peek operation returns the top element without removing it from the stack.");
        addStudentAnswerToProblemAnswer(pa_2_3_5, sa2_3_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment2_3.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa2_4_1_student1 = createStudentAnswer(student1, pa_2_4_1, "A queue is a linear data structure following the FIFO principle, where the first element added is the first one removed.");
        addStudentAnswerToProblemAnswer(pa_2_4_1, sa2_4_1_student1);

        StudentAnswer sa2_4_2_student1 = createStudentAnswer(student1, pa_2_4_2, "Implement a queue using collections.deque in Python. Example:\nfrom collections import deque\nqueue = deque()\nqueue.append(1)\nqueue.append(2)\nqueue.popleft()");
        addStudentAnswerToProblemAnswer(pa_2_4_2, sa2_4_2_student1);

        StudentAnswer sa2_4_3_student1 = createStudentAnswer(student1, pa_2_4_3, "Main operations are enqueue (adding an element), dequeue (removing the front element), and peek (viewing the front element).");
        addStudentAnswerToProblemAnswer(pa_2_4_3, sa2_4_3_student1);

        StudentAnswer sa2_4_4_student1 = createStudentAnswer(student1, pa_2_4_4, "Check if a queue is empty by verifying if its length is zero. Example:\nif len(queue) == 0: print(\"Queue is empty\")");
        addStudentAnswerToProblemAnswer(pa_2_4_4, sa2_4_4_student1);

        StudentAnswer sa2_4_5_student1 = createStudentAnswer(student1, pa_2_4_5, "The peek operation returns the front element without removing it.");
        addStudentAnswerToProblemAnswer(pa_2_4_5, sa2_4_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa2_4_1_student2 = createStudentAnswer(student2, pa_2_4_1, "A queue is a linear data structure that uses the FIFO principle, meaning the first element added is the first one to be removed.");
        addStudentAnswerToProblemAnswer(pa_2_4_1, sa2_4_1_student2);

        StudentAnswer sa2_4_2_student2 = createStudentAnswer(student2, pa_2_4_2, "Implement a queue in Python using collections.deque. Example:\nfrom collections import deque\nqueue = deque()\nqueue.append(1)\nqueue.append(2)\nqueue.popleft()");
        addStudentAnswerToProblemAnswer(pa_2_4_2, sa2_4_2_student2);

        StudentAnswer sa2_4_3_student2 = createStudentAnswer(student2, pa_2_4_3, "Main operations are enqueue (adding an element), dequeue (removing the front element), and peek (viewing the front element without removing it).");
        addStudentAnswerToProblemAnswer(pa_2_4_3, sa2_4_3_student2);

        StudentAnswer sa2_4_4_student2 = createStudentAnswer(student2, pa_2_4_4, "Check if a queue is empty by checking if its length is zero. Example:\nif len(queue) == 0: print(\"Queue is empty\")");
        addStudentAnswerToProblemAnswer(pa_2_4_4, sa2_4_4_student2);

        StudentAnswer sa2_4_5_student2 = createStudentAnswer(student2, pa_2_4_5, "The peek operation returns the front element without removing it from the queue.");
        addStudentAnswerToProblemAnswer(pa_2_4_5, sa2_4_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment2_4.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa2_5_1_student1 = createStudentAnswer(student1, pa_2_5_1, "A tree is a hierarchical data structure with nodes connected by edges, each having a value and references to child nodes, with a single root node.");
        addStudentAnswerToProblemAnswer(pa_2_5_1, sa2_5_1_student1);

        StudentAnswer sa2_5_2_student1 = createStudentAnswer(student1, pa_2_5_2, "A node in a tree contains a value and references to child nodes. Example:\nclass TreeNode {\n    public TreeNode(Object data) {\n        this.data = data;\n        this.children = new ArrayList<>();\n    }\n}");
        addStudentAnswerToProblemAnswer(pa_2_5_2, sa2_5_2_student1);

        StudentAnswer sa2_5_3_student1 = createStudentAnswer(student1, pa_2_5_3, "Trees allow efficient data organization, making searching, insertion, and deletion faster, and represent hierarchical relationships naturally.");
        addStudentAnswerToProblemAnswer(pa_2_5_3, sa2_5_3_student1);

        StudentAnswer sa2_5_4_student1 = createStudentAnswer(student1, pa_2_5_4, "Perform DFS by starting at the root and exploring branches before backtracking. Example:\ndef dfs(node):\n    if not node:\n        return\n    print(node.data)\n    for child in node.children:\n        dfs(child)");
        addStudentAnswerToProblemAnswer(pa_2_5_4, sa2_5_4_student1);

        StudentAnswer sa2_5_5_student1 = createStudentAnswer(student1, pa_2_5_5, "A binary tree is a type of tree where each node has at most two child nodes: left and right.");
        addStudentAnswerToProblemAnswer(pa_2_5_5, sa2_5_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa2_5_1_student2 = createStudentAnswer(student2, pa_2_5_1, "A tree is a hierarchical data structure with nodes connected by edges. Each node has a value and references to child nodes, with a single root.");
        addStudentAnswerToProblemAnswer(pa_2_5_1, sa2_5_1_student2);

        StudentAnswer sa2_5_2_student2 = createStudentAnswer(student2, pa_2_5_2, "A node contains a value and references to child nodes. Example:\nclass TreeNode {\n    public TreeNode(Object data) {\n        this.data = data;\n        this.children = new ArrayList<>();\n    }\n}");
        addStudentAnswerToProblemAnswer(pa_2_5_2, sa2_5_2_student2);

        StudentAnswer sa2_5_3_student2 = createStudentAnswer(student2, pa_2_5_3, "Trees allow efficient data organization and manipulation, making searching, insertion, and deletion faster, and represent hierarchical relationships naturally.");
        addStudentAnswerToProblemAnswer(pa_2_5_3, sa2_5_3_student2);

        StudentAnswer sa2_5_4_student2 = createStudentAnswer(student2, pa_2_5_4, "Perform DFS by starting at the root and exploring branches before backtracking. Example:\ndef dfs(node):\n    if not node:\n        return\n    print(node.data)\n    for child in node.children:\n        dfs(child)");
        addStudentAnswerToProblemAnswer(pa_2_5_4, sa2_5_4_student2);

        StudentAnswer sa2_5_5_student2 = createStudentAnswer(student2, pa_2_5_5, "A binary tree is a type of tree where each node has at most two child nodes: left and right.");
        addStudentAnswerToProblemAnswer(pa_2_5_5, sa2_5_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment2_5.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa2_6_1_student1 = createStudentAnswer(student1, pa_2_6_1, "A graph is a data structure with nodes (vertices) and edges that connect pairs of nodes, representing relationships.");
        addStudentAnswerToProblemAnswer(pa_2_6_1, sa2_6_1_student1);

        StudentAnswer sa2_6_2_student1 = createStudentAnswer(student1, pa_2_6_2, "Represent a graph using an adjacency list, where each node has a list of adjacent nodes. Example:\nclass Graph {\n  public Graph() {\n    this.adj_list = new HashMap<>();\n  }\n}");
        addStudentAnswerToProblemAnswer(pa_2_6_2, sa2_6_2_student1);

        StudentAnswer sa2_6_3_student1 = createStudentAnswer(student1, pa_2_6_3, "Graphs model real-world problems like social networks, transportation networks, and dependencies, efficiently finding shortest paths, detecting cycles, and traversing nodes.");
        addStudentAnswerToProblemAnswer(pa_2_6_3, sa2_6_3_student1);

        StudentAnswer sa2_6_4_student1 = createStudentAnswer(student1, pa_2_6_4, "Perform DFS by starting at a node, exploring branches before backtracking. Example:\ndef dfs(graph, start, visited=None):\n    if visited is None:\n        visited = set()\n    visited.add(start)\n    print(start)\n    for next in graph[start] - visited:\n        dfs(graph, next, visited)");
        addStudentAnswerToProblemAnswer(pa_2_6_4, sa2_6_4_student1);

        StudentAnswer sa2_6_5_student1 = createStudentAnswer(student1, pa_2_6_5, "A directed graph (digraph) has edges with directions, going from one node to another but not necessarily back.");
        addStudentAnswerToProblemAnswer(pa_2_6_5, sa2_6_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa2_6_1_student2 = createStudentAnswer(student2, pa_2_6_1, "A graph is a data structure with nodes (vertices) and edges that connect pairs of nodes, representing relationships.");
        addStudentAnswerToProblemAnswer(pa_2_6_1, sa2_6_1_student2);

        StudentAnswer sa2_6_2_student2 = createStudentAnswer(student2, pa_2_6_2, "Represent a graph using an adjacency list, where each node has a list of adjacent nodes. Example:\nclass Graph {\n  public Graph() {\n    this.adj_list = new HashMap<>();\n  }\n}");
        addStudentAnswerToProblemAnswer(pa_2_6_2, sa2_6_2_student2);

        StudentAnswer sa2_6_3_student2 = createStudentAnswer(student2, pa_2_6_3, "Graphs model real-world problems like social networks, transportation networks, and dependencies, efficiently finding shortest paths, detecting cycles, and traversing nodes.");
        addStudentAnswerToProblemAnswer(pa_2_6_3, sa2_6_3_student2);

        StudentAnswer sa2_6_4_student2 = createStudentAnswer(student2, pa_2_6_4, "Perform DFS by starting at a node, exploring branches before backtracking. Example:\ndef dfs(graph, start, visited=None):\n    if visited is None:\n        visited = set()\n    visited.add(start)\n    print(start)\n    for next in graph[start] - visited:\n        dfs(graph, next, visited)");
        addStudentAnswerToProblemAnswer(pa_2_6_4, sa2_6_4_student2);

        StudentAnswer sa2_6_5_student2 = createStudentAnswer(student2, pa_2_6_5, "A directed graph (digraph) has edges with directions, going from one node to another but not necessarily back.");
        addStudentAnswerToProblemAnswer(pa_2_6_5, sa2_6_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment2_6.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa3_1_1_student1 = createStudentAnswer(student1, pa_3_1_1, "Sorting is arranging data in a particular order, typically ascending or descending.");
        addStudentAnswerToProblemAnswer(pa_3_1_1, sa3_1_1_student1);

        StudentAnswer sa3_1_2_student1 = createStudentAnswer(student1, pa_3_1_2, "Bubble sort steps through the list, compares adjacent elements, and swaps them if needed, until the list is sorted.");
        addStudentAnswerToProblemAnswer(pa_3_1_2, sa3_1_2_student1);

        StudentAnswer sa3_1_3_student1 = createStudentAnswer(student1, pa_3_1_3, "The time complexity of bubble sort is O(n^2) in the worst and average cases.");
        addStudentAnswerToProblemAnswer(pa_3_1_3, sa3_1_3_student1);

        StudentAnswer sa3_1_4_student1 = createStudentAnswer(student1, pa_3_1_4, "Merge sort divides the list, recursively sorts each half, and merges the sorted halves.");
        addStudentAnswerToProblemAnswer(pa_3_1_4, sa3_1_4_student1);

        StudentAnswer sa3_1_5_student1 = createStudentAnswer(student1, pa_3_1_5, "The time complexity of merge sort is O(n log n) in all cases.");
        addStudentAnswerToProblemAnswer(pa_3_1_5, sa3_1_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa3_1_1_student2 = createStudentAnswer(student2, pa_3_1_1, "Sorting arranges data in a particular order, usually ascending or descending.");
        addStudentAnswerToProblemAnswer(pa_3_1_1, sa3_1_1_student2);

        StudentAnswer sa3_1_2_student2 = createStudentAnswer(student2, pa_3_1_2, "Bubble sort compares adjacent elements, swapping them if needed, until the list is sorted.");
        addStudentAnswerToProblemAnswer(pa_3_1_2, sa3_1_2_student2);

        StudentAnswer sa3_1_3_student2 = createStudentAnswer(student2, pa_3_1_3, "Bubble sort has a time complexity of O(n^2) in the worst and average cases.");
        addStudentAnswerToProblemAnswer(pa_3_1_3, sa3_1_3_student2);

        StudentAnswer sa3_1_4_student2 = createStudentAnswer(student2, pa_3_1_4, "Merge sort divides the list, sorts each half, and merges the sorted halves.");
        addStudentAnswerToProblemAnswer(pa_3_1_4, sa3_1_4_student2);

        StudentAnswer sa3_1_5_student2 = createStudentAnswer(student2, pa_3_1_5, "Merge sort has a time complexity of O(n log n) in all cases.");
        addStudentAnswerToProblemAnswer(pa_3_1_5, sa3_1_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment3_1.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa3_2_1_student1 = createStudentAnswer(student1, pa_3_2_1, "Searching is the process of finding a specific element or value within a data structure.");
        addStudentAnswerToProblemAnswer(pa_3_2_1, sa3_2_1_student1);

        StudentAnswer sa3_2_2_student1 = createStudentAnswer(student1, pa_3_2_2, "Linear search sequentially checks each element until the desired element is found or the list ends.");
        addStudentAnswerToProblemAnswer(pa_3_2_2, sa3_2_2_student1);

        StudentAnswer sa3_2_3_student1 = createStudentAnswer(student1, pa_3_2_3, "The time complexity of linear search is O(n), where n is the number of elements in the list.");
        addStudentAnswerToProblemAnswer(pa_3_2_3, sa3_2_3_student1);

        StudentAnswer sa3_2_4_student1 = createStudentAnswer(student1, pa_3_2_4, "Binary search divides the sorted list in half, compares the target value to the middle element, and narrows the search to the appropriate half.");
        addStudentAnswerToProblemAnswer(pa_3_2_4, sa3_2_4_student1);

        StudentAnswer sa3_2_5_student1 = createStudentAnswer(student1, pa_3_2_5, "The time complexity of binary search is O(log n), where n is the number of elements in the sorted list.");
        addStudentAnswerToProblemAnswer(pa_3_2_5, sa3_2_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa3_2_1_student2 = createStudentAnswer(student2, pa_3_2_1, "Searching is the process of finding a specific element or value within a data structure.");
        addStudentAnswerToProblemAnswer(pa_3_2_1, sa3_2_1_student2);

        StudentAnswer sa3_2_2_student2 = createStudentAnswer(student2, pa_3_2_2, "Linear search checks each element sequentially until the desired element is found or the list ends.");
        addStudentAnswerToProblemAnswer(pa_3_2_2, sa3_2_2_student2);

        StudentAnswer sa3_2_3_student2 = createStudentAnswer(student2, pa_3_2_3, "Linear search has a time complexity of O(n), where n is the number of elements in the list.");
        addStudentAnswerToProblemAnswer(pa_3_2_3, sa3_2_3_student2);

        StudentAnswer sa3_2_4_student2 = createStudentAnswer(student2, pa_3_2_4, "Binary search works by dividing the sorted list in half, comparing the target value to the middle element, and narrowing the search accordingly.");
        addStudentAnswerToProblemAnswer(pa_3_2_4, sa3_2_4_student2);

        StudentAnswer sa3_2_5_student2 = createStudentAnswer(student2, pa_3_2_5, "Binary search has a time complexity of O(log n), where n is the number of elements in the sorted list.");
        addStudentAnswerToProblemAnswer(pa_3_2_5, sa3_2_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment3_2.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa3_3_1_student1 = createStudentAnswer(student1, pa_3_3_1, "A graph algorithm is a procedure or formula used to solve problems related to graph theory, such as traversal, searching, and finding shortest paths.");
        addStudentAnswerToProblemAnswer(pa_3_3_1, sa3_3_1_student1);

        StudentAnswer sa3_3_2_student1 = createStudentAnswer(student1, pa_3_3_2, "Depth-first search (DFS) explores a graph by going as deep as possible along each branch before backtracking. It uses a stack to keep track of the nodes to be visited.");
        addStudentAnswerToProblemAnswer(pa_3_3_2, sa3_3_2_student1);

        StudentAnswer sa3_3_3_student1 = createStudentAnswer(student1, pa_3_3_3, "Breadth-first search (BFS) explores a graph by visiting all the neighbors of a node before moving on to the next level of neighbors. It uses a queue to keep track of the nodes to be visited.");
        addStudentAnswerToProblemAnswer(pa_3_3_3, sa3_3_3_student1);

        StudentAnswer sa3_3_4_student1 = createStudentAnswer(student1, pa_3_3_4, "The time complexity of both DFS and BFS is O(V + E), where V is the number of vertices and E is the number of edges in the graph.");
        addStudentAnswerToProblemAnswer(pa_3_3_4, sa3_3_4_student1);

        StudentAnswer sa3_3_5_student1 = createStudentAnswer(student1, pa_3_3_5, "Here is a Python implementation of DFS:\n```python\ndef dfs(graph, start, visited=None):\n    if visited is None:\n        visited = set()\n    visited.add(start)\n    print(start)\n    for next in graph[start] - visited:\n        dfs(graph, next, visited)\n    return visited\n```");
        addStudentAnswerToProblemAnswer(pa_3_3_5, sa3_3_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa3_3_1_student2 = createStudentAnswer(student2, pa_3_3_1, "A graph algorithm is a procedure or formula used to solve problems related to graph theory, such as traversal, searching, and finding shortest paths.");
        addStudentAnswerToProblemAnswer(pa_3_3_1, sa3_3_1_student2);

        StudentAnswer sa3_3_2_student2 = createStudentAnswer(student2, pa_3_3_2, "Depth-first search (DFS) explores a graph by going as deep as possible along each branch before backtracking. It uses a stack to keep track of the nodes to be visited.");
        addStudentAnswerToProblemAnswer(pa_3_3_2, sa3_3_2_student2);

        StudentAnswer sa3_3_3_student2 = createStudentAnswer(student2, pa_3_3_3, "Breadth-first search (BFS) explores a graph by visiting all the neighbors of a node before moving on to the next level of neighbors. It uses a queue to keep track of the nodes to be visited.");
        addStudentAnswerToProblemAnswer(pa_3_3_3, sa3_3_3_student2);

        StudentAnswer sa3_3_4_student2 = createStudentAnswer(student2, pa_3_3_4, "The time complexity of both DFS and BFS is O(V + E), where V is the number of vertices and E is the number of edges in the graph.");
        addStudentAnswerToProblemAnswer(pa_3_3_4, sa3_3_4_student2);

        StudentAnswer sa3_3_5_student2 = createStudentAnswer(student2, pa_3_3_5, "Here is a Python implementation of DFS:\n```python\ndef dfs(graph, start, visited=None):\n    if visited is None:\n        visited = set()\n    visited.add(start)\n    print(start)\n    for next in graph[start] - visited:\n        dfs(graph, next, visited)\n    return visited\n```");
        addStudentAnswerToProblemAnswer(pa_3_3_5, sa3_3_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment3_3.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa3_4_1_student1 = createStudentAnswer(student1, pa_3_4_1, "Dynamic programming solves complex problems by breaking them into simpler subproblems and storing the results to avoid redundant calculations.");
        addStudentAnswerToProblemAnswer(pa_3_4_1, sa3_4_1_student1);

        StudentAnswer sa3_4_2_student1 = createStudentAnswer(student1, pa_3_4_2, "The principle of optimality states that an optimal solution to a problem contains optimal solutions to its subproblems.");
        addStudentAnswerToProblemAnswer(pa_3_4_2, sa3_4_2_student1);

        StudentAnswer sa3_4_3_student1 = createStudentAnswer(student1, pa_3_4_3, "Memoization stores the results of expensive function calls to avoid redundant calculations and improve efficiency.");
        addStudentAnswerToProblemAnswer(pa_3_4_3, sa3_4_3_student1);

        StudentAnswer sa3_4_4_student1 = createStudentAnswer(student1, pa_3_4_4, "Top-down dynamic programming uses recursion and memoization, while bottom-up dynamic programming uses an iterative approach.");
        addStudentAnswerToProblemAnswer(pa_3_4_4, sa3_4_4_student1);

        StudentAnswer sa3_4_5_student1 = createStudentAnswer(student1, pa_3_4_5, "Here is a Python implementation of dynamic programming for the Fibonacci sequence:\n```python\ndef fibonacci(n, memo={}):\n    if n in memo:\n        return memo[n]\n    if n <= 1:\n        return n\n    memo[n] = fibonacci(n-1, memo) + fibonacci(n-2, memo)\n    return memo[n]\n```");
        addStudentAnswerToProblemAnswer(pa_3_4_5, sa3_4_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa3_4_1_student2 = createStudentAnswer(student2, pa_3_4_1, "Dynamic programming solves complex problems by breaking them into simpler subproblems and storing the results to avoid redundant calculations.");
        addStudentAnswerToProblemAnswer(pa_3_4_1, sa3_4_1_student2);

        StudentAnswer sa3_4_2_student2 = createStudentAnswer(student2, pa_3_4_2, "The principle of optimality states that an optimal solution to a problem contains optimal solutions to its subproblems.");
        addStudentAnswerToProblemAnswer(pa_3_4_2, sa3_4_2_student2);

        StudentAnswer sa3_4_3_student2 = createStudentAnswer(student2, pa_3_4_3, "Memoization stores the results of expensive function calls to avoid redundant calculations and improve efficiency.");
        addStudentAnswerToProblemAnswer(pa_3_4_3, sa3_4_3_student2);

        StudentAnswer sa3_4_4_student2 = createStudentAnswer(student2, pa_3_4_4, "Top-down dynamic programming uses recursion and memoization, while bottom-up dynamic programming uses an iterative approach.");
        addStudentAnswerToProblemAnswer(pa_3_4_4, sa3_4_4_student2);

        StudentAnswer sa3_4_5_student2 = createStudentAnswer(student2, pa_3_4_5, "Here is a Python implementation of dynamic programming for the Fibonacci sequence:\n```python\ndef fibonacci(n, memo={}):\n    if n in memo:\n        return memo[n]\n    if n <= 1:\n        return n\n    memo[n] = fibonacci(n-1, memo) + fibonacci(n-2, memo)\n    return memo[n]\n```");
        addStudentAnswerToProblemAnswer(pa_3_4_5, sa3_4_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment3_4.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa4_1_1_student1 = createStudentAnswer(student1, pa_4_1_1, "A relational database organizes data into tables with rows and columns, and uses keys to define relationships between tables.");
        addStudentAnswerToProblemAnswer(pa_4_1_1, sa4_1_1_student1);

        StudentAnswer sa4_1_2_student1 = createStudentAnswer(student1, pa_4_1_2, "A primary key is a unique identifier for a row in a table, ensuring each row can be uniquely identified and retrieved.");
        addStudentAnswerToProblemAnswer(pa_4_1_2, sa4_1_2_student1);

        StudentAnswer sa4_1_3_student1 = createStudentAnswer(student1, pa_4_1_3, "A foreign key is a column or set of columns in one table that references the primary key in another table, establishing a relationship between the tables.");
        addStudentAnswerToProblemAnswer(pa_4_1_3, sa4_1_3_student1);

        StudentAnswer sa4_1_4_student1 = createStudentAnswer(student1, pa_4_1_4, "Normalization is the process of organizing data to reduce redundancy and improve data integrity by dividing tables into smaller, related tables and defining relationships.");
        addStudentAnswerToProblemAnswer(pa_4_1_4, sa4_1_4_student1);

        StudentAnswer sa4_1_5_student1 = createStudentAnswer(student1, pa_4_1_5, "A relationship in a relational database is an association between tables established using keys like primary and foreign keys.");
        addStudentAnswerToProblemAnswer(pa_4_1_5, sa4_1_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa4_1_1_student2 = createStudentAnswer(student2, pa_4_1_1, "A relational database organizes data into tables with rows and columns, and uses keys to define relationships between tables.");
        addStudentAnswerToProblemAnswer(pa_4_1_1, sa4_1_1_student2);

        StudentAnswer sa4_1_2_student2 = createStudentAnswer(student2, pa_4_1_2, "A primary key is a unique identifier for a row in a table, ensuring each row can be uniquely identified and retrieved.");
        addStudentAnswerToProblemAnswer(pa_4_1_2, sa4_1_2_student2);

        StudentAnswer sa4_1_3_student2 = createStudentAnswer(student2, pa_4_1_3, "A foreign key is a column or set of columns in one table that references the primary key in another table, establishing a relationship between the tables.");
        addStudentAnswerToProblemAnswer(pa_4_1_3, sa4_1_3_student2);

        StudentAnswer sa4_1_4_student2 = createStudentAnswer(student2, pa_4_1_4, "Normalization is the process of organizing data to reduce redundancy and improve data integrity by dividing tables into smaller, related tables and defining relationships.");
        addStudentAnswerToProblemAnswer(pa_4_1_4, sa4_1_4_student2);

        StudentAnswer sa4_1_5_student2 = createStudentAnswer(student2, pa_4_1_5, "A relationship in a relational database is an association between tables established using keys like primary and foreign keys.");
        addStudentAnswerToProblemAnswer(pa_4_1_5, sa4_1_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment4_1.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa4_2_1_student1 = createStudentAnswer(student1, pa_4_2_1, "SQL (Structured Query Language) is the standard language for querying and manipulating databases. It allows users to create, read, update, and delete data, as well as perform complex data operations.");
        addStudentAnswerToProblemAnswer(pa_4_2_1, sa4_2_1_student1);

        StudentAnswer sa4_2_2_student1 = createStudentAnswer(student1, pa_4_2_2, "Here is a basic SQL query to select all records from a table:\n```sql\nSELECT * FROM table_name;\n```");
        addStudentAnswerToProblemAnswer(pa_4_2_2, sa4_2_2_student1);

        StudentAnswer sa4_2_3_student1 = createStudentAnswer(student1, pa_4_2_3, "The WHERE clause is used to filter records based on specified conditions, allowing users to retrieve only the records that meet the given criteria.");
        addStudentAnswerToProblemAnswer(pa_4_2_3, sa4_2_3_student1);

        StudentAnswer sa4_2_4_student1 = createStudentAnswer(student1, pa_4_2_4, "Here is an SQL query to update a record in a table:\n```sql\nUPDATE table_name\nSET column1 = value1, column2 = value2\nWHERE condition;\n```");
        addStudentAnswerToProblemAnswer(pa_4_2_4, sa4_2_4_student1);

        StudentAnswer sa4_2_5_student1 = createStudentAnswer(student1, pa_4_2_5, "The INSERT INTO statement is used to add new records to a table, allowing users to insert data into specific columns.");
        addStudentAnswerToProblemAnswer(pa_4_2_5, sa4_2_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa4_2_1_student2 = createStudentAnswer(student2, pa_4_2_1, "SQL (Structured Query Language) is the standard language for querying and manipulating databases. It allows users to create, read, update, and delete data, as well as perform complex data operations.");
        addStudentAnswerToProblemAnswer(pa_4_2_1, sa4_2_1_student2);

        StudentAnswer sa4_2_2_student2 = createStudentAnswer(student2, pa_4_2_2, "Here is a basic SQL query to select all records from a table:\n```sql\nSELECT * FROM table_name;\n```");
        addStudentAnswerToProblemAnswer(pa_4_2_2, sa4_2_2_student2);

        StudentAnswer sa4_2_3_student2 = createStudentAnswer(student2, pa_4_2_3, "The WHERE clause is used to filter records based on specified conditions, allowing users to retrieve only the records that meet the given criteria.");
        addStudentAnswerToProblemAnswer(pa_4_2_3, sa4_2_3_student2);

        StudentAnswer sa4_2_4_student2 = createStudentAnswer(student2, pa_4_2_4, "Here is an SQL query to update a record in a table:\n```sql\nUPDATE table_name\nSET column1 = value1, column2 = value2\nWHERE condition;\n```");
        addStudentAnswerToProblemAnswer(pa_4_2_4, sa4_2_4_student2);

        StudentAnswer sa4_2_5_student2 = createStudentAnswer(student2, pa_4_2_5, "The INSERT INTO statement is used to add new records to a table, allowing users to insert data into specific columns.");
        addStudentAnswerToProblemAnswer(pa_4_2_5, sa4_2_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment4_2.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa4_3_1_student1 = createStudentAnswer(student1, pa_4_3_1, "A database transaction is a sequence of one or more SQL operations executed as a single unit of work, ensuring data integrity and consistency.");
        addStudentAnswerToProblemAnswer(pa_4_3_1, sa4_3_1_student1);

        StudentAnswer sa4_3_2_student1 = createStudentAnswer(student1, pa_4_3_2, "The ACID properties of a transaction are Atomicity, Consistency, Isolation, and Durability, ensuring that transactions are processed reliably.");
        addStudentAnswerToProblemAnswer(pa_4_3_2, sa4_3_2_student1);

        StudentAnswer sa4_3_3_student1 = createStudentAnswer(student1, pa_4_3_3, "Atomicity ensures that all operations within a transaction are completed successfully or none are, rolling back the entire transaction if any operation fails.");
        addStudentAnswerToProblemAnswer(pa_4_3_3, sa4_3_3_student1);

        StudentAnswer sa4_3_4_student1 = createStudentAnswer(student1, pa_4_3_4, "Consistency ensures that a transaction brings the database from one valid state to another, maintaining all predefined rules and constraints.");
        addStudentAnswerToProblemAnswer(pa_4_3_4, sa4_3_4_student1);

        StudentAnswer sa4_3_5_student1 = createStudentAnswer(student1, pa_4_3_5, "Isolation ensures that the operations of one transaction are isolated from those of other transactions, preventing conflicts and ensuring data integrity.");
        addStudentAnswerToProblemAnswer(pa_4_3_5, sa4_3_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa4_3_1_student2 = createStudentAnswer(student2, pa_4_3_1, "A database transaction is a sequence of one or more SQL operations executed as a single unit of work, ensuring data integrity and consistency.");
        addStudentAnswerToProblemAnswer(pa_4_3_1, sa4_3_1_student2);

        StudentAnswer sa4_3_2_student2 = createStudentAnswer(student2, pa_4_3_2, "The ACID properties of a transaction are Atomicity, Consistency, Isolation, and Durability, ensuring that transactions are processed reliably.");
        addStudentAnswerToProblemAnswer(pa_4_3_2, sa4_3_2_student2);

        StudentAnswer sa4_3_3_student2 = createStudentAnswer(student2, pa_4_3_3, "Atomicity ensures that all operations within a transaction are completed successfully or none are, rolling back the entire transaction if any operation fails.");
        addStudentAnswerToProblemAnswer(pa_4_3_3, sa4_3_3_student2);

        StudentAnswer sa4_3_4_student2 = createStudentAnswer(student2, pa_4_3_4, "Consistency ensures that a transaction brings the database from one valid state to another, maintaining all predefined rules and constraints.");
        addStudentAnswerToProblemAnswer(pa_4_3_4, sa4_3_4_student2);

        StudentAnswer sa4_3_5_student2 = createStudentAnswer(student2, pa_4_3_5, "Isolation ensures that the operations of one transaction are isolated from those of other transactions, preventing conflicts and ensuring data integrity.");
        addStudentAnswerToProblemAnswer(pa_4_3_5, sa4_3_5_student2);


// Output for confirmation
        System.out.println("Student answers created and added for both student1 and student2 for all 10 problem answers in assignment4_3.");
// Creating StudentAnswer instances for student1
        StudentAnswer sa4_4_1_student1 = createStudentAnswer(student1, pa_4_4_1, "Database design is defining the structure, organization, and relationships of data within a database.");
        addStudentAnswerToProblemAnswer(pa_4_4_1, sa4_4_1_student1);

        StudentAnswer sa4_4_2_student1 = createStudentAnswer(student1, pa_4_4_2, "Normalization is organizing data to reduce redundancy and improve data integrity.");
        addStudentAnswerToProblemAnswer(pa_4_4_2, sa4_4_2_student1);

        StudentAnswer sa4_4_3_student1 = createStudentAnswer(student1, pa_4_4_3, "Normal forms are: 1NF, 2NF, 3NF, BCNF, and higher forms, each reducing redundancy and dependency.");
        addStudentAnswerToProblemAnswer(pa_4_4_3, sa4_4_3_student1);

        StudentAnswer sa4_4_4_student1 = createStudentAnswer(student1, pa_4_4_4, "Denormalization combines normalized tables to reduce query complexity and improve performance.");
        addStudentAnswerToProblemAnswer(pa_4_4_4, sa4_4_4_student1);

        StudentAnswer sa4_4_5_student1 = createStudentAnswer(student1, pa_4_4_5, "An ER diagram is a visual representation of database entities and relationships.");
        addStudentAnswerToProblemAnswer(pa_4_4_5, sa4_4_5_student1);


// Creating StudentAnswer instances for student2
        StudentAnswer sa4_4_1_student2 = createStudentAnswer(student2, pa_4_4_1, "Database design is defining the structure, organization, and relationships of data within a database.");
        addStudentAnswerToProblemAnswer(pa_4_4_1, sa4_4_1_student2);

        StudentAnswer sa4_4_2_student2 = createStudentAnswer(student2, pa_4_4_2, "Normalization is organizing data to reduce redundancy and improve data integrity.");
        addStudentAnswerToProblemAnswer(pa_4_4_2, sa4_4_2_student2);

        StudentAnswer sa4_4_3_student2 = createStudentAnswer(student2, pa_4_4_3, "Normal forms are: 1NF, 2NF, 3NF, BCNF, and higher forms, each reducing redundancy and dependency.");
        addStudentAnswerToProblemAnswer(pa_4_4_3, sa4_4_3_student2);

        StudentAnswer sa4_4_4_student2 = createStudentAnswer(student2, pa_4_4_4, "Denormalization combines normalized tables to reduce query complexity and improve performance.");
        addStudentAnswerToProblemAnswer(pa_4_4_4, sa4_4_4_student2);

        StudentAnswer sa4_4_5_student2 = createStudentAnswer(student2, pa_4_4_5, "An ER diagram is a visual representation of database entities and relationships.");
        addStudentAnswerToProblemAnswer(pa_4_4_5, sa4_4_5_student2);


        // Creating submission for student1 with student answers
        Submission submission1_1_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1_1_1_student1, sa1_1_2_student1, sa1_1_3_student1, sa1_1_4_student1, sa1_1_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1_1_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_1_1);
        }

// Creating submission for student2 with student answers
        Submission submission1_1_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1_1_1_student2, sa1_1_2_student2, sa1_1_3_student2, sa1_1_4_student2, sa1_1_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1_1_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_1_2);

        }

        // Creating submission for student1 with student answers for 1_2
        Submission submission1_2_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1_2_1_student1, sa1_2_2_student1, sa1_2_3_student1, sa1_2_4_student1, sa1_2_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1_2_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_2_1);
        }

// Creating submission for student2 with student answers for 1_2
        Submission submission1_2_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1_2_1_student2, sa1_2_2_student2, sa1_2_3_student2, sa1_2_4_student2, sa1_2_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1_2_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_2_2);
        }
// Creating submission for student1 with student answers for 1_3
        Submission submission1_3_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1_3_1_student1, sa1_3_2_student1, sa1_3_3_student1, sa1_3_4_student1, sa1_3_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1_3_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_3_1);
        }

// Creating submission for student2 with student answers for 1_3
        Submission submission1_3_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1_3_1_student2, sa1_3_2_student2, sa1_3_3_student2, sa1_3_4_student2, sa1_3_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1_3_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_3_2);
        }
// Creating submission for student1 with student answers for 1_4
        Submission submission1_4_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1_4_1_student1, sa1_4_2_student1, sa1_4_3_student1, sa1_4_4_student1, sa1_4_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1_4_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_4_1);
        }

// Creating submission for student2 with student answers for 1_4
        Submission submission1_4_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1_4_1_student2, sa1_4_2_student2, sa1_4_3_student2, sa1_4_4_student2, sa1_4_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1_4_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_4_2);
        }
// Creating submission for student1 with student answers for 1_5
        Submission submission1_5_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1_5_1_student1, sa1_5_2_student1, sa1_5_3_student1, sa1_5_4_student1, sa1_5_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1_5_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_5_1);
        }

// Creating submission for student2 with student answers for 1_5
        Submission submission1_5_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1_5_1_student2, sa1_5_2_student2, sa1_5_3_student2, sa1_5_4_student2, sa1_5_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1_5_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_5_2);
        }
// Creating submission for student1 with student answers for 1_6
        Submission submission1_6_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa1_6_1_student1, sa1_6_2_student1, sa1_6_3_student1, sa1_6_4_student1, sa1_6_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission1_6_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_6_1);
        }

// Creating submission for student2 with student answers for 1_6
        Submission submission1_6_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa1_6_1_student2, sa1_6_2_student2, sa1_6_3_student2, sa1_6_4_student2, sa1_6_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission1_6_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission1_6_2);
        }
// Creating submission for student1 with student answers for 2_1
        Submission submission2_1_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2_1_1_student1, sa2_1_2_student1, sa2_1_3_student1, sa2_1_4_student1, sa2_1_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2_1_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_1_1);
        }

// Creating submission for student2 with student answers for 2_1
        Submission submission2_1_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2_1_1_student2, sa2_1_2_student2, sa2_1_3_student2, sa2_1_4_student2, sa2_1_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2_1_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_1_2);
        }
// Creating submission for student1 with student answers for 2_2
        Submission submission2_2_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2_2_1_student1, sa2_2_2_student1, sa2_2_3_student1, sa2_2_4_student1, sa2_2_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2_2_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_2_1);
        }

// Creating submission for student2 with student answers for 2_2
        Submission submission2_2_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2_2_1_student2, sa2_2_2_student2, sa2_2_3_student2, sa2_2_4_student2, sa2_2_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2_2_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_2_2);
        }
// Creating submission for student1 with student answers for 2_3
        Submission submission2_3_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2_3_1_student1, sa2_3_2_student1, sa2_3_3_student1, sa2_3_4_student1, sa2_3_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2_3_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_3_1);
        }

// Creating submission for student2 with student answers for 2_3
        Submission submission2_3_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2_3_1_student2, sa2_3_2_student2, sa2_3_3_student2, sa2_3_4_student2, sa2_3_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2_3_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_3_2);
        }
// Creating submission for student1 with student answers for 2_4
        Submission submission2_4_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2_4_1_student1, sa2_4_2_student1, sa2_4_3_student1, sa2_4_4_student1, sa2_4_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2_4_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_4_1);
        }

// Creating submission for student2 with student answers for 2_4
        Submission submission2_4_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2_4_1_student2, sa2_4_2_student2, sa2_4_3_student2, sa2_4_4_student2, sa2_4_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2_4_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_4_2);
        }
// Creating submission for student1 with student answers for 2_5
        Submission submission2_5_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2_5_1_student1, sa2_5_2_student1, sa2_5_3_student1, sa2_5_4_student1, sa2_5_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2_5_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_5_1);
        }

// Creating submission for student2 with student answers for 2_5
        Submission submission2_5_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2_5_1_student2, sa2_5_2_student2, sa2_5_3_student2, sa2_5_4_student2, sa2_5_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2_5_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_5_2);
        }
// Creating submission for student1 with student answers for 2_6
        Submission submission2_6_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa2_6_1_student1, sa2_6_2_student1, sa2_6_3_student1, sa2_6_4_student1, sa2_6_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission2_6_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_6_1);
        }

// Creating submission for student2 with student answers for 2_6
        Submission submission2_6_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa2_6_1_student2, sa2_6_2_student2, sa2_6_3_student2, sa2_6_4_student2, sa2_6_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission2_6_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission2_6_2);
        }
// Creating submission for student1 with student answers for 3_1
        Submission submission3_1_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3_1_1_student1, sa3_1_2_student1, sa3_1_3_student1, sa3_1_4_student1, sa3_1_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission3_1_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3_1_1);
        }

// Creating submission for student2 with student answers for 3_1
        Submission submission3_1_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3_1_1_student2, sa3_1_2_student2, sa3_1_3_student2, sa3_1_4_student2, sa3_1_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission3_1_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3_1_2);
        }
// Creating submission for student1 with student answers for 3_2
        Submission submission3_2_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3_2_1_student1, sa3_2_2_student1, sa3_2_3_student1, sa3_2_4_student1, sa3_2_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission3_2_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3_2_1);
        }

// Creating submission for student2 with student answers for 3_2
        Submission submission3_2_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3_2_1_student2, sa3_2_2_student2, sa3_2_3_student2, sa3_2_4_student2, sa3_2_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission3_2_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3_2_2);
        }
// Creating submission for student1 with student answers for 3_3
        Submission submission3_3_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3_3_1_student1, sa3_3_2_student1, sa3_3_3_student1, sa3_3_4_student1, sa3_3_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission3_3_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3_3_1);
        }

// Creating submission for student2 with student answers for 3_3
        Submission submission3_3_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3_3_1_student2, sa3_3_2_student2, sa3_3_3_student2, sa3_3_4_student2, sa3_3_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission3_3_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3_3_2);
        }
// Creating submission for student1 with student answers for 3_4
        Submission submission3_4_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa3_4_1_student1, sa3_4_2_student1, sa3_4_3_student1, sa3_4_4_student1, sa3_4_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission3_4_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3_4_1);
        }

// Creating submission for student2 with student answers for 3_4
        Submission submission3_4_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa3_4_1_student2, sa3_4_2_student2, sa3_4_3_student2, sa3_4_4_student2, sa3_4_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission3_4_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission3_4_2);
        }
// Creating submission for student1 with student answers for 4_1
        Submission submission4_1_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4_1_1_student1, sa4_1_2_student1, sa4_1_3_student1, sa4_1_4_student1, sa4_1_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission4_1_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4_1_1);
        }

// Creating submission for student2 with student answers for 4_1
        Submission submission4_1_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4_1_1_student2, sa4_1_2_student2, sa4_1_3_student2, sa4_1_4_student2, sa4_1_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission4_1_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4_1_2);
        }
// Creating submission for student1 with student answers for 4_2
        Submission submission4_2_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4_2_1_student1, sa4_2_2_student1, sa4_2_3_student1, sa4_2_4_student1, sa4_2_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission4_2_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4_2_1);
        }

// Creating submission for student2 with student answers for 4_2
        Submission submission4_2_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4_2_1_student2, sa4_2_2_student2, sa4_2_3_student2, sa4_2_4_student2, sa4_2_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission4_2_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4_2_2);
        }
// Creating submission for student1 with student answers for 4_3
        Submission submission4_3_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4_3_1_student1, sa4_3_2_student1, sa4_3_3_student1, sa4_3_4_student1, sa4_3_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission4_3_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4_3_1);
        }

// Creating submission for student2 with student answers for 4_3
        Submission submission4_3_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4_3_1_student2, sa4_3_2_student2, sa4_3_3_student2, sa4_3_4_student2, sa4_3_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission4_3_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4_3_2);
        }

// Creating submission for student1 with student answers for 4_4
        Submission submission4_4_1 = createSubmission("Submission from student1", student1, Arrays.asList(
                sa4_4_1_student1, sa4_4_2_student1, sa4_4_3_student1, sa4_4_4_student1, sa4_4_5_student1
        ));

// Adding the submission to each student answer for student1
        for (StudentAnswer studentAnswer : submission4_4_1.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4_4_1);
        }

// Creating submission for student2 with student answers for 4_4
        Submission submission4_4_2 = createSubmission("Submission from student2", student2, Arrays.asList(
                sa4_4_1_student2, sa4_4_2_student2, sa4_4_3_student2, sa4_4_4_student2, sa4_4_5_student2
        ));

// Adding the submission to each student answer for student2
        for (StudentAnswer studentAnswer : submission4_4_2.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission4_4_2);
        }


        Grade grade1_1_1 = createGrade(85.2, student1, faculty1, course1, submission1_1_1);
        Grade grade1_1_2 = createGrade(92.5, student2, faculty1, course1, submission1_1_2);
        Grade grade1_2_1 = createGrade(77.4, student1, faculty1, course1, submission1_2_1);
        Grade grade1_2_2 = createGrade(88.3, student2, faculty1, course1, submission1_2_2);
        Grade grade1_3_1 = createGrade(90.1, student1, faculty1, course1, submission1_3_1);
        Grade grade1_3_2 = createGrade(79.8, student2, faculty1, course1, submission1_3_2);
        Grade grade1_4_1 = createGrade(83.7, student1, faculty1, course1, submission1_4_1);
        Grade grade1_4_2 = createGrade(91.6, student2, faculty1, course1, submission1_4_2);
        Grade grade1_5_1 = createGrade(86.4, student1, faculty1, course1, submission1_5_1);
        Grade grade1_5_2 = createGrade(78.9, student2, faculty1, course1, submission1_5_2);
        Grade grade1_6_1 = createGrade(89.3, student1, faculty1, course1, submission1_6_1);
        Grade grade1_6_2 = createGrade(85.7, student2, faculty1, course1, submission1_6_2);

        Grade grade2_1_1 = createGrade(87.9, student1, faculty2, course2, submission2_1_1);
        Grade grade2_1_2 = createGrade(91.4, student2, faculty2, course2, submission2_1_2);
        Grade grade2_2_1 = createGrade(78.6, student1, faculty2, course2, submission2_2_1);
        Grade grade2_2_2 = createGrade(84.7, student2, faculty2, course2, submission2_2_2);
        Grade grade2_3_1 = createGrade(89.2, student1, faculty2, course2, submission2_3_1);
        Grade grade2_3_2 = createGrade(82.5, student2, faculty2, course2, submission2_3_2);
        Grade grade2_4_1 = createGrade(85.1, student1, faculty2, course2, submission2_4_1);
        Grade grade2_4_2 = createGrade(88.3, student2, faculty2, course2, submission2_4_2);
        Grade grade2_5_1 = createGrade(80.9, student1, faculty2, course2, submission2_5_1);
        Grade grade2_5_2 = createGrade(79.4, student2, faculty2, course2, submission2_5_2);
        Grade grade2_6_1 = createGrade(83.8, student1, faculty2, course2, submission2_6_1);
        Grade grade2_6_2 = createGrade(86.2, student2, faculty2, course2, submission2_6_2);

        Grade grade3_1_1 = createGrade(88.5, student1, faculty3, course3, submission3_1_1);
        Grade grade3_1_2 = createGrade(90.3, student2, faculty3, course3, submission3_1_2);
        Grade grade3_2_1 = createGrade(84.7, student1, faculty3, course3, submission3_2_1);
        Grade grade3_2_2 = createGrade(86.4, student2, faculty3, course3, submission3_2_2);
        Grade grade3_3_1 = createGrade(92.1, student1, faculty3, course3, submission3_3_1);
        Grade grade3_3_2 = createGrade(89.9, student2, faculty3, course3, submission3_3_2);
        Grade grade3_4_1 = createGrade(87.2, student1, faculty3, course3, submission3_4_1);
        Grade grade3_4_2 = createGrade(91.0, student2, faculty3, course3, submission3_4_2);

        Grade grade4_1_1 = createGrade(86.8, student1, faculty4, course4, submission4_1_1);
        Grade grade4_1_2 = createGrade(89.5, student2, faculty4, course4, submission4_1_2);
        Grade grade4_2_1 = createGrade(83.9, student1, faculty4, course4, submission4_2_1);
        Grade grade4_2_2 = createGrade(87.1, student2, faculty4, course4, submission4_2_2);
        Grade grade4_3_1 = createGrade(91.2, student1, faculty4, course4, submission4_3_1);
        Grade grade4_3_2 = createGrade(84.6, student2, faculty4, course4, submission4_3_2);
        Grade grade4_4_1 = createGrade(88.4, student1, faculty4, course4, submission4_4_1);
        Grade grade4_4_2 = createGrade(90.7, student2, faculty4, course4, submission4_4_2);

        CourseGrade courseGrade1_1_1 = createCourseGrade(student1, course1, 85.7, List.of(grade1_1_1, grade1_2_1, grade1_3_1, grade1_4_1, grade1_5_1, grade1_6_1));
        CourseGrade courseGrade1_1_2 = createCourseGrade(student2, course1, 86.13, List.of(grade1_1_2, grade1_2_2, grade1_3_2, grade1_4_2, grade1_5_2, grade1_6_2));

        CourseGrade courseGrade2_1_1 = createCourseGrade(student1, course2, 84.25, List.of(grade2_1_1, grade2_2_1, grade2_3_1, grade2_4_1, grade2_5_1, grade2_6_1));
        CourseGrade courseGrade2_1_2 = createCourseGrade(student2, course2, 85.42, List.of(grade2_1_2, grade2_2_2, grade2_3_2, grade2_4_2, grade2_5_2, grade2_6_2));

        CourseGrade courseGrade3_1_1 = createCourseGrade(student1, course3, 88.6, List.of(grade3_1_1, grade3_2_1, grade3_3_1, grade3_4_1));
        CourseGrade courseGrade3_1_2 = createCourseGrade(student2, course3, 88.0, List.of(grade3_1_2, grade3_2_2, grade3_3_2, grade3_4_2));

        CourseGrade courseGrade4_1_1 = createCourseGrade(student1, course4, 87.575, List.of(grade4_1_1, grade4_2_1, grade4_3_1, grade4_4_1));
        CourseGrade courseGrade4_1_2 = createCourseGrade(student2, course4, 87.975, List.of(grade4_1_2, grade4_2_2, grade4_3_2, grade4_4_2));

        Feedback feedback1_1_1 = createFeedback("Great job on the submission!", submission1_1_1);
        Feedback feedback1_1_2 = createFeedback("Well done, keep it up!", submission1_1_2);

        Feedback feedback1_2_1 = createFeedback("Good effort, but some improvements needed.", submission1_2_1);
        Feedback feedback1_2_2 = createFeedback("Excellent work!", submission1_2_2);

        Feedback feedback1_3_1 = createFeedback("Nice work on the assignment.", submission1_3_1);
        Feedback feedback1_3_2 = createFeedback("Good submission.", submission1_3_2);

        Feedback feedback1_4_1 = createFeedback("Well written answers.", submission1_4_1);
        Feedback feedback1_4_2 = createFeedback("Great attention to detail.", submission1_4_2);

        Feedback feedback1_5_1 = createFeedback("Impressive work, keep going!", submission1_5_1);
        Feedback feedback1_5_2 = createFeedback("Solid submission.", submission1_5_2);

        Feedback feedback1_6_1 = createFeedback("Very good effort.", submission1_6_1);
        Feedback feedback1_6_2 = createFeedback("Nice job on the answers.", submission1_6_2);

        Feedback feedback2_1_1 = createFeedback("Well done, keep it up!", submission2_1_1);
        Feedback feedback2_1_2 = createFeedback("Excellent work!", submission2_1_2);

        Feedback feedback2_2_1 = createFeedback("Good effort, some improvements needed.", submission2_2_1);
        Feedback feedback2_2_2 = createFeedback("Outstanding submission.", submission2_2_2);

        Feedback feedback2_3_1 = createFeedback("Nice work on the assignment.", submission2_3_1);
        Feedback feedback2_3_2 = createFeedback("Good submission.", submission2_3_2);

        Feedback feedback2_4_1 = createFeedback("Well written answers.", submission2_4_1);
        Feedback feedback2_4_2 = createFeedback("Great attention to detail.", submission2_4_2);

        Feedback feedback2_5_1 = createFeedback("Impressive work, keep going!", submission2_5_1);
        Feedback feedback2_5_2 = createFeedback("Solid submission.", submission2_5_2);

        Feedback feedback2_6_1 = createFeedback("Very good effort.", submission2_6_1);
        Feedback feedback2_6_2 = createFeedback("Nice job on the answers.", submission2_6_2);

        Feedback feedback3_1_1 = createFeedback("Excellent submission, student1!", submission3_1_1);
        Feedback feedback3_1_2 = createFeedback("Great job, student2!", submission3_1_2);

        Feedback feedback3_2_1 = createFeedback("Well done, student1. Keep up the good work!", submission3_2_1);
        Feedback feedback3_2_2 = createFeedback("Nice effort, student2!", submission3_2_2);

        Feedback feedback3_3_1 = createFeedback("Good work on the answers, student1.", submission3_3_1);
        Feedback feedback3_3_2 = createFeedback("Strong performance, student2.", submission3_3_2);

        Feedback feedback3_4_1 = createFeedback("Well written answers, student1.", submission3_4_1);
        Feedback feedback3_4_2 = createFeedback("Great job with the details, student2.", submission3_4_2);

        Feedback feedback4_1_1 = createFeedback("Fantastic work, student1!", submission4_1_1);
        Feedback feedback4_1_2 = createFeedback("Great effort, student2!", submission4_1_2);

        Feedback feedback4_2_1 = createFeedback("Impressive answers, student1.", submission4_2_1);
        Feedback feedback4_2_2 = createFeedback("Well done, student2!", submission4_2_2);

        Feedback feedback4_3_1 = createFeedback("Excellent submission, student1!", submission4_3_1);
        Feedback feedback4_3_2 = createFeedback("Good job, student2.", submission4_3_2);

        Feedback feedback4_4_1 = createFeedback("Great attention to detail, student1.", submission4_4_1);
        Feedback feedback4_4_2 = createFeedback("Strong effort, student2.", submission4_4_2);

        course1.setGrades(List.of(grade1_1_1, grade1_1_2, grade1_2_1, grade1_2_2, grade1_3_1, grade1_3_2, grade1_4_1, grade1_4_2, grade1_5_1, grade1_5_2, grade1_6_1, grade1_6_2));
        course2.setGrades(List.of(grade2_1_1, grade2_1_2, grade2_2_1, grade2_2_2, grade2_3_1, grade2_3_2, grade2_4_1, grade2_4_2, grade2_5_1, grade2_5_2, grade2_6_1, grade2_6_2));
        course3.setGrades(List.of(grade3_1_1, grade3_1_2, grade3_2_1, grade3_2_2, grade3_3_1, grade3_3_2, grade3_4_1, grade3_4_2));
        course4.setGrades(List.of(grade4_1_1, grade4_1_2, grade4_2_1, grade4_2_2, grade4_3_1, grade4_3_2, grade4_4_1, grade4_4_2));

        course1.setCourseGrades(List.of(courseGrade1_1_1, courseGrade1_1_2));
        course2.setCourseGrades(List.of(courseGrade2_1_1, courseGrade2_1_2));
        course3.setCourseGrades(List.of(courseGrade3_1_1, courseGrade3_1_2));
        course4.setCourseGrades(List.of(courseGrade4_1_1, courseGrade4_1_2));

        createFacultyWithAssignment(faculty1, List.of(grade1_1_1, grade1_1_2, grade1_2_1, grade1_2_2, grade1_3_1, grade1_3_2, grade1_4_1, grade1_4_2, grade1_5_1, grade1_5_2, grade1_6_1, grade1_6_2), List.of());
        createFacultyWithAssignment(faculty2, List.of(grade2_1_1, grade2_1_2, grade2_2_1, grade2_2_2, grade2_3_1, grade2_3_2, grade2_4_1, grade2_4_2, grade2_5_1, grade2_5_2, grade2_6_1, grade2_6_2), List.of(assignment2_1, assignment2_2, assignment2_3, assignment2_4, assignment2_5, assignment2_6));
        createFacultyWithAssignment(faculty3, List.of(grade3_1_1, grade3_1_2, grade3_2_1, grade3_2_2, grade3_3_1, grade3_3_2, grade3_4_1, grade3_4_2), List.of(assignment3_1, assignment3_2, assignment3_3, assignment3_4));
        createFacultyWithAssignment(faculty4, List.of(grade4_1_1, grade4_1_2, grade4_2_1, grade4_2_2, grade4_3_1, grade4_3_2, grade4_4_1, grade4_4_2), List.of(assignment4_1, assignment4_2, assignment4_3, assignment4_4));

        linkSubmissionDetails(submission1_1_1, student1, grade1_1_1, feedback1_1_1, List.of(sa1_1_1_student1, sa1_1_2_student1, sa1_1_3_student1, sa1_1_4_student1, sa1_1_5_student1));
        linkSubmissionDetails(submission1_1_2, student2, grade1_1_2, feedback1_1_2, List.of(sa1_1_1_student2, sa1_1_2_student2, sa1_1_3_student2, sa1_1_4_student2, sa1_1_5_student2));
        linkSubmissionDetails(submission1_2_1, student1, grade1_2_1, feedback1_2_1, List.of(sa1_2_1_student1, sa1_2_2_student1, sa1_2_3_student1, sa1_2_4_student1, sa1_2_5_student1));
        linkSubmissionDetails(submission1_2_2, student2, grade1_2_2, feedback1_2_2, List.of(sa1_2_1_student2, sa1_2_2_student2, sa1_2_3_student2, sa1_2_4_student2, sa1_2_5_student2));
        linkSubmissionDetails(submission1_3_1, student1, grade1_3_1, feedback1_3_1, List.of(sa1_3_1_student1, sa1_3_2_student1, sa1_3_3_student1, sa1_3_4_student1, sa1_3_5_student1));
        linkSubmissionDetails(submission1_3_2, student2, grade1_3_2, feedback1_3_2, List.of(sa1_3_1_student2, sa1_3_2_student2, sa1_3_3_student2, sa1_3_4_student2, sa1_3_5_student2));
        linkSubmissionDetails(submission1_4_1, student1, grade1_4_1, feedback1_4_1, List.of(sa1_4_1_student1, sa1_4_2_student1, sa1_4_3_student1, sa1_4_4_student1, sa1_4_5_student1));
        linkSubmissionDetails(submission1_4_2, student2, grade1_4_2, feedback1_4_2, List.of(sa1_4_1_student2, sa1_4_2_student2, sa1_4_3_student2, sa1_4_4_student2, sa1_4_5_student2));
        linkSubmissionDetails(submission1_5_1, student1, grade1_5_1, feedback1_5_1, List.of(sa1_5_1_student1, sa1_5_2_student1, sa1_5_3_student1, sa1_5_4_student1, sa1_5_5_student1));
        linkSubmissionDetails(submission1_5_2, student2, grade1_5_2, feedback1_5_2, List.of(sa1_5_1_student2, sa1_5_2_student2, sa1_5_3_student2, sa1_5_4_student2, sa1_5_5_student2));
        linkSubmissionDetails(submission1_6_1, student1, grade1_6_1, feedback1_6_1, List.of(sa1_6_1_student1, sa1_6_2_student1, sa1_6_3_student1, sa1_6_4_student1, sa1_6_5_student1));
        linkSubmissionDetails(submission1_6_2, student2, grade1_6_2, feedback1_6_2, List.of(sa1_6_1_student2, sa1_6_2_student2, sa1_6_3_student2, sa1_6_4_student2, sa1_6_5_student2));

        linkSubmissionDetails(submission2_1_1, student1, grade2_1_1, feedback2_1_1, List.of(sa2_1_1_student1, sa2_1_2_student1, sa2_1_3_student1, sa2_1_4_student1, sa2_1_5_student1));
        linkSubmissionDetails(submission2_1_2, student2, grade2_1_2, feedback2_1_2, List.of(sa2_1_1_student2, sa2_1_2_student2, sa2_1_3_student2, sa2_1_4_student2, sa2_1_5_student2));
        linkSubmissionDetails(submission2_2_1, student1, grade2_2_1, feedback2_2_1, List.of(sa2_2_1_student1, sa2_2_2_student1, sa2_2_3_student1, sa2_2_4_student1, sa2_2_5_student1));
        linkSubmissionDetails(submission2_2_2, student2, grade2_2_2, feedback2_2_2, List.of(sa2_2_1_student2, sa2_2_2_student2, sa2_2_3_student2, sa2_2_4_student2, sa2_2_5_student2));
        linkSubmissionDetails(submission2_3_1, student1, grade2_3_1, feedback2_3_1, List.of(sa2_3_1_student1, sa2_3_2_student1, sa2_3_3_student1, sa2_3_4_student1, sa2_3_5_student1));
        linkSubmissionDetails(submission2_3_2, student2, grade2_3_2, feedback2_3_2, List.of(sa2_3_1_student2, sa2_3_2_student2, sa2_3_3_student2, sa2_3_4_student2, sa2_3_5_student2));
        linkSubmissionDetails(submission2_4_1, student1, grade2_4_1, feedback2_4_1, List.of(sa2_4_1_student1, sa2_4_2_student1, sa2_4_3_student1, sa2_4_4_student1, sa2_4_5_student1));
        linkSubmissionDetails(submission2_4_2, student2, grade2_4_2, feedback2_4_2, List.of(sa2_4_1_student2, sa2_4_2_student2, sa2_4_3_student2, sa2_4_4_student2, sa2_4_5_student2));
        linkSubmissionDetails(submission2_5_1, student1, grade2_5_1, feedback2_5_1, List.of(sa2_5_1_student1, sa2_5_2_student1, sa2_5_3_student1, sa2_5_4_student1, sa2_5_5_student1));
        linkSubmissionDetails(submission2_5_2, student2, grade2_5_2, feedback2_5_2, List.of(sa2_5_1_student2, sa2_5_2_student2, sa2_5_3_student2, sa2_5_4_student2, sa2_5_5_student2));
        linkSubmissionDetails(submission2_6_1, student1, grade2_6_1, feedback2_6_1, List.of(sa2_6_1_student1, sa2_6_2_student1, sa2_6_3_student1, sa2_6_4_student1, sa2_6_5_student1));
        linkSubmissionDetails(submission2_6_2, student2, grade2_6_2, feedback2_6_2, List.of(sa2_6_1_student2, sa2_6_2_student2, sa2_6_3_student2, sa2_6_4_student2, sa2_6_5_student2));

        linkSubmissionDetails(submission3_1_1, student1, grade3_1_1, feedback3_1_1, List.of(sa3_1_1_student1, sa3_1_2_student1, sa3_1_3_student1, sa3_1_4_student1, sa3_1_5_student1));
        linkSubmissionDetails(submission3_1_2, student2, grade3_1_2, feedback3_1_2, List.of(sa3_1_1_student2, sa3_1_2_student2, sa3_1_3_student2, sa3_1_4_student2, sa3_1_5_student2));
        linkSubmissionDetails(submission3_2_1, student1, grade3_2_1, feedback3_2_1, List.of(sa3_2_1_student1, sa3_2_2_student1, sa3_2_3_student1, sa3_2_4_student1, sa3_2_5_student1));
        linkSubmissionDetails(submission3_2_2, student2, grade3_2_2, feedback3_2_2, List.of(sa3_2_1_student2, sa3_2_2_student2, sa3_2_3_student2, sa3_2_4_student2, sa3_2_5_student2));
        linkSubmissionDetails(submission3_3_1, student1, grade3_3_1, feedback3_3_1, List.of(sa3_3_1_student1, sa3_3_2_student1, sa3_3_3_student1, sa3_3_4_student1, sa3_3_5_student1));
        linkSubmissionDetails(submission3_3_2, student2, grade3_3_2, feedback3_3_2, List.of(sa3_3_1_student2, sa3_3_2_student2, sa3_3_3_student2, sa3_3_4_student2, sa3_3_5_student2));
        linkSubmissionDetails(submission3_4_1, student1, grade3_4_1, feedback3_4_1, List.of(sa3_4_1_student1, sa3_4_2_student1, sa3_4_3_student1, sa3_4_4_student1, sa3_4_5_student1));
        linkSubmissionDetails(submission3_4_2, student2, grade3_4_2, feedback3_4_2, List.of(sa3_4_1_student2, sa3_4_2_student2, sa3_4_3_student2, sa3_4_4_student2, sa3_4_5_student2));

        linkSubmissionDetails(submission4_1_1, student1, grade4_1_1, feedback4_1_1, List.of(sa4_1_1_student1, sa4_1_2_student1, sa4_1_3_student1, sa4_1_4_student1, sa4_1_5_student1));
        linkSubmissionDetails(submission4_1_2, student2, grade4_1_2, feedback4_1_2, List.of(sa4_1_1_student2, sa4_1_2_student2, sa4_1_3_student2, sa4_1_4_student2, sa4_1_5_student2));
        linkSubmissionDetails(submission4_2_1, student1, grade4_2_1, feedback4_2_1, List.of(sa4_2_1_student1, sa4_2_2_student1, sa4_2_3_student1, sa4_2_4_student1, sa4_2_5_student1));
        linkSubmissionDetails(submission4_2_2, student2, grade4_2_2, feedback4_2_2, List.of(sa4_2_1_student2, sa4_2_2_student2, sa4_2_3_student2, sa4_2_4_student2, sa4_2_5_student2));
        linkSubmissionDetails(submission4_3_1, student1, grade4_3_1, feedback4_3_1, List.of(sa4_3_1_student1, sa4_3_2_student1, sa4_3_3_student1, sa4_3_4_student1, sa4_3_5_student1));
        linkSubmissionDetails(submission4_3_2, student2, grade4_3_2, feedback4_3_2, List.of(sa4_3_1_student2, sa4_3_2_student2, sa4_3_3_student2, sa4_3_4_student2, sa4_3_5_student2));
        linkSubmissionDetails(submission4_4_1, student1, grade4_4_1, feedback4_4_1, List.of(sa4_4_1_student1, sa4_4_2_student1, sa4_4_3_student1, sa4_4_4_student1, sa4_4_5_student1));
        linkSubmissionDetails(submission4_4_2, student2, grade4_4_2, feedback4_4_2, List.of(sa4_4_1_student2, sa4_4_2_student2, sa4_4_3_student2, sa4_4_4_student2, sa4_4_5_student2));

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
        studentAnswer.setProblemAnswer(problemAnswer);
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

    public static StudentAnswer createStudentAnswer(Student student, ProblemAnswer problemAnswer, String answerContent) {
        StudentAnswer studentAnswer = new StudentAnswer();
        studentAnswer.setStudent(student);
        studentAnswer.setProblemAnswer(problemAnswer);
        studentAnswer.setAnswerContent(answerContent);
        studentAnswer.setSubmissionDate(Timestamp.valueOf(LocalDateTime.now()));
        return studentAnswer;
    }

    public static Faculty createFacultyWithAssignment(Faculty faculty, List<Grade> grades, List<Assignment> assignments) {
        faculty.setGrades(grades);
        faculty.setAssignments(assignments);
        return faculty;
    }

    public static void linkSubmissionDetails(Submission submission, Student student, Grade grade, Feedback feedback, List<StudentAnswer> studentAnswers) {
        // Link the submission details
        submission.setStudent(student);
        submission.setGrade(grade);
        submission.setFeedback(feedback);
        submission.setStudentAnswers(studentAnswers);

        // Ensure the student has a list of submissions
        List<Submission> studentSubmissions = student.getSubmissions();
        if (studentSubmissions == null) {
            studentSubmissions = new ArrayList<>();
            student.setSubmissions(studentSubmissions);
        }
        studentSubmissions.add(submission);

        // Link the other entities to the submission
        grade.setSubmission(submission);
        feedback.setSubmission(submission);
        studentAnswers.forEach(answer -> answer.setSubmission(submission));
    }


}
