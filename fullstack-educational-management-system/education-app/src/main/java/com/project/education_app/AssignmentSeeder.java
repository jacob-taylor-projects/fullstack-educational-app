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
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.project.education_app.Seeder.*;

@Component
@Data
public class AssignmentSeeder implements CommandLineRunner {
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


// Output for confirmation
        System.out.println("Assignment for 'Material Science' unit created with 10 problem answers, due date, faculty, and syllabus.");


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
// Creating StudentAnswer instances for student5
        StudentAnswer sa9_1_1_student5 = createStudentAnswer(student5, pa_9_1_1, "Machine learning is a subset of AI that focuses on developing algorithms that enable computers to learn from and make predictions based on data.");
        addStudentAnswerToProblemAnswer(pa_9_1_1, sa9_1_1_student5);

        StudentAnswer sa9_1_2_student5 = createStudentAnswer(student5, pa_9_1_2, "Common machine learning techniques include supervised learning, unsupervised learning, reinforcement learning, and deep learning.");
        addStudentAnswerToProblemAnswer(pa_9_1_2, sa9_1_2_student5);

        StudentAnswer sa9_1_3_student5 = createStudentAnswer(student5, pa_9_1_3, "Supervised learning is a technique where the model is trained on labeled data, learning to make predictions based on input-output pairs.");
        addStudentAnswerToProblemAnswer(pa_9_1_3, sa9_1_3_student5);

        StudentAnswer sa9_1_4_student5 = createStudentAnswer(student5, pa_9_1_4, "Unsupervised learning is a technique where the model is trained on unlabeled data, learning to find patterns and relationships without explicit input-output pairs.");
        addStudentAnswerToProblemAnswer(pa_9_1_4, sa9_1_4_student5);

        StudentAnswer sa9_1_5_student5 = createStudentAnswer(student5, pa_9_1_5, "Reinforcement learning is a technique where the model learns to make decisions by interacting with an environment and receiving rewards or penalties.");
        addStudentAnswerToProblemAnswer(pa_9_1_5, sa9_1_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa9_1_1_student6 = createStudentAnswer(student6, pa_9_1_1, "Machine learning is a subset of AI that focuses on developing algorithms that enable computers to learn from and make predictions based on data.");
        addStudentAnswerToProblemAnswer(pa_9_1_1, sa9_1_1_student6);

        StudentAnswer sa9_1_2_student6 = createStudentAnswer(student6, pa_9_1_2, "Common machine learning techniques include supervised learning, unsupervised learning, reinforcement learning, and deep learning.");
        addStudentAnswerToProblemAnswer(pa_9_1_2, sa9_1_2_student6);

        StudentAnswer sa9_1_3_student6 = createStudentAnswer(student6, pa_9_1_3, "Supervised learning is a technique where the model is trained on labeled data, learning to make predictions based on input-output pairs.");
        addStudentAnswerToProblemAnswer(pa_9_1_3, sa9_1_3_student6);

        StudentAnswer sa9_1_4_student6 = createStudentAnswer(student6, pa_9_1_4, "Unsupervised learning is a technique where the model is trained on unlabeled data, learning to find patterns and relationships without explicit input-output pairs.");
        addStudentAnswerToProblemAnswer(pa_9_1_4, sa9_1_4_student6);

        StudentAnswer sa9_1_5_student6 = createStudentAnswer(student6, pa_9_1_5, "Reinforcement learning is a technique where the model learns to make decisions by interacting with an environment and receiving rewards or penalties.");
        addStudentAnswerToProblemAnswer(pa_9_1_5, sa9_1_5_student6);


// Creating StudentAnswer instances for student5
        StudentAnswer sa9_2_1_student5 = createStudentAnswer(student5, pa_9_2_1, "Neural networks are a set of algorithms modeled after the human brain, used to recognize patterns and make predictions based on data.");
        addStudentAnswerToProblemAnswer(pa_9_2_1, sa9_2_1_student5);

        StudentAnswer sa9_2_2_student5 = createStudentAnswer(student5, pa_9_2_2, "The basic architecture of a neural network consists of an input layer, hidden layers, and an output layer, with interconnected nodes (neurons).");
        addStudentAnswerToProblemAnswer(pa_9_2_2, sa9_2_2_student5);

        StudentAnswer sa9_2_3_student5 = createStudentAnswer(student5, pa_9_2_3, "Backpropagation is a training algorithm that minimizes error by adjusting the weights of the connections between neurons.");
        addStudentAnswerToProblemAnswer(pa_9_2_3, sa9_2_3_student5);

        StudentAnswer sa9_2_4_student5 = createStudentAnswer(student5, pa_9_2_4, "An activation function introduces non-linearity into the model, with common functions including ReLU, sigmoid, and tanh.");
        addStudentAnswerToProblemAnswer(pa_9_2_4, sa9_2_4_student5);

        StudentAnswer sa9_2_5_student5 = createStudentAnswer(student5, pa_9_2_5, "A feedforward neural network moves information in one direction, from the input layer to the output layer, without forming cycles.");
        addStudentAnswerToProblemAnswer(pa_9_2_5, sa9_2_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa9_2_1_student6 = createStudentAnswer(student6, pa_9_2_1, "Neural networks are a set of algorithms modeled after the human brain, used to recognize patterns and make predictions based on data.");
        addStudentAnswerToProblemAnswer(pa_9_2_1, sa9_2_1_student6);

        StudentAnswer sa9_2_2_student6 = createStudentAnswer(student6, pa_9_2_2, "The basic architecture of a neural network consists of an input layer, hidden layers, and an output layer, with interconnected nodes (neurons).");
        addStudentAnswerToProblemAnswer(pa_9_2_2, sa9_2_2_student6);

        StudentAnswer sa9_2_3_student6 = createStudentAnswer(student6, pa_9_2_3, "Backpropagation is a training algorithm that minimizes error by adjusting the weights of the connections between neurons.");
        addStudentAnswerToProblemAnswer(pa_9_2_3, sa9_2_3_student6);

        StudentAnswer sa9_2_4_student6 = createStudentAnswer(student6, pa_9_2_4, "An activation function introduces non-linearity into the model, with common functions including ReLU, sigmoid, and tanh.");
        addStudentAnswerToProblemAnswer(pa_9_2_4, sa9_2_4_student6);

        StudentAnswer sa9_2_5_student6 = createStudentAnswer(student6, pa_9_2_5, "A feedforward neural network moves information in one direction, from the input layer to the output layer, without forming cycles.");
        addStudentAnswerToProblemAnswer(pa_9_2_5, sa9_2_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment9_2.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa9_3_1_student5 = createStudentAnswer(student5, pa_9_3_1, "Natural language processing (NLP) is a field of AI that enables computers to understand, interpret, and generate human language.");
        addStudentAnswerToProblemAnswer(pa_9_3_1, sa9_3_1_student5);

        StudentAnswer sa9_3_2_student5 = createStudentAnswer(student5, pa_9_3_2, "Common applications of NLP include language translation, sentiment analysis, chatbots, speech recognition, and text summarization.");
        addStudentAnswerToProblemAnswer(pa_9_3_2, sa9_3_2_student5);

        StudentAnswer sa9_3_3_student5 = createStudentAnswer(student5, pa_9_3_3, "Tokenization is the process of breaking down a text into smaller units called tokens, which can be words, phrases, or sentences.");
        addStudentAnswerToProblemAnswer(pa_9_3_3, sa9_3_3_student5);

        StudentAnswer sa9_3_4_student5 = createStudentAnswer(student5, pa_9_3_4, "Sentiment analysis is an NLP technique used to determine the emotional tone of a piece of text, classifying it as positive, negative, or neutral.");
        addStudentAnswerToProblemAnswer(pa_9_3_4, sa9_3_4_student5);

        StudentAnswer sa9_3_5_student5 = createStudentAnswer(student5, pa_9_3_5, "Named entity recognition (NER) is an NLP technique used to identify and classify named entities in a text, such as names of people, organizations, and locations.");
        addStudentAnswerToProblemAnswer(pa_9_3_5, sa9_3_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa9_3_1_student6 = createStudentAnswer(student6, pa_9_3_1, "Natural language processing (NLP) is a field of AI that enables computers to understand, interpret, and generate human language.");
        addStudentAnswerToProblemAnswer(pa_9_3_1, sa9_3_1_student6);

        StudentAnswer sa9_3_2_student6 = createStudentAnswer(student6, pa_9_3_2, "Common applications of NLP include language translation, sentiment analysis, chatbots, speech recognition, and text summarization.");
        addStudentAnswerToProblemAnswer(pa_9_3_2, sa9_3_2_student6);

        StudentAnswer sa9_3_3_student6 = createStudentAnswer(student6, pa_9_3_3, "Tokenization is the process of breaking down a text into smaller units called tokens, which can be words, phrases, or sentences.");
        addStudentAnswerToProblemAnswer(pa_9_3_3, sa9_3_3_student6);

        StudentAnswer sa9_3_4_student6 = createStudentAnswer(student6, pa_9_3_4, "Sentiment analysis is an NLP technique used to determine the emotional tone of a piece of text, classifying it as positive, negative, or neutral.");
        addStudentAnswerToProblemAnswer(pa_9_3_4, sa9_3_4_student6);

        StudentAnswer sa9_3_5_student6 = createStudentAnswer(student6, pa_9_3_5, "Named entity recognition (NER) is an NLP technique used to identify and classify named entities in a text, such as names of people, organizations, and locations.");
        addStudentAnswerToProblemAnswer(pa_9_3_5, sa9_3_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment9_3.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa10_1_1_student5 = createStudentAnswer(student5, pa_10_1_1, "Threat analysis involves identifying potential security threats and vulnerabilities in a system.");
        addStudentAnswerToProblemAnswer(pa_10_1_1, sa10_1_1_student5);

        StudentAnswer sa10_1_2_student5 = createStudentAnswer(student5, pa_10_1_2, "Key steps: (1) Identifying assets and resources, (2) Identifying potential threats, (3) Assessing vulnerabilities, (4) Evaluating risks, (5) Implementing mitigation strategies.");
        addStudentAnswerToProblemAnswer(pa_10_1_2, sa10_1_2_student5);

        StudentAnswer sa10_1_3_student5 = createStudentAnswer(student5, pa_10_1_3, "Common security threats include malware, phishing attacks, denial-of-service (DoS) attacks, man-in-the-middle attacks, and insider threats.");
        addStudentAnswerToProblemAnswer(pa_10_1_3, sa10_1_3_student5);

        StudentAnswer sa10_1_4_student5 = createStudentAnswer(student5, pa_10_1_4, "A vulnerability is a weakness or flaw in a system that can be exploited by a threat actor to gain unauthorized access or cause harm.");
        addStudentAnswerToProblemAnswer(pa_10_1_4, sa10_1_4_student5);

        StudentAnswer sa10_1_5_student5 = createStudentAnswer(student5, pa_10_1_5, "Risk assessment evaluates the potential impact and likelihood of identified threats exploiting vulnerabilities.");
        addStudentAnswerToProblemAnswer(pa_10_1_5, sa10_1_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa10_1_1_student6 = createStudentAnswer(student6, pa_10_1_1, "Threat analysis involves identifying potential security threats and vulnerabilities in a system.");
        addStudentAnswerToProblemAnswer(pa_10_1_1, sa10_1_1_student6);

        StudentAnswer sa10_1_2_student6 = createStudentAnswer(student6, pa_10_1_2, "Key steps: (1) Identifying assets and resources, (2) Identifying potential threats, (3) Assessing vulnerabilities, (4) Evaluating risks, (5) Implementing mitigation strategies.");
        addStudentAnswerToProblemAnswer(pa_10_1_2, sa10_1_2_student6);

        StudentAnswer sa10_1_3_student6 = createStudentAnswer(student6, pa_10_1_3, "Common security threats include malware, phishing attacks, denial-of-service (DoS) attacks, man-in-the-middle attacks, and insider threats.");
        addStudentAnswerToProblemAnswer(pa_10_1_3, sa10_1_3_student6);

        StudentAnswer sa10_1_4_student6 = createStudentAnswer(student6, pa_10_1_4, "A vulnerability is a weakness or flaw in a system that can be exploited by a threat actor to gain unauthorized access or cause harm.");
        addStudentAnswerToProblemAnswer(pa_10_1_4, sa10_1_4_student6);

        StudentAnswer sa10_1_5_student6 = createStudentAnswer(student6, pa_10_1_5, "Risk assessment evaluates the potential impact and likelihood of identified threats exploiting vulnerabilities.");
        addStudentAnswerToProblemAnswer(pa_10_1_5, sa10_1_5_student6);

// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment10_1.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa10_2_1_student5 = createStudentAnswer(student5, pa_10_2_1, "Encryption is the process of converting information into a secure format to prevent unauthorized access.");
        addStudentAnswerToProblemAnswer(pa_10_2_1, sa10_2_1_student5);

        StudentAnswer sa10_2_2_student5 = createStudentAnswer(student5, pa_10_2_2, "The two main types of encryption are symmetric encryption and asymmetric encryption.");
        addStudentAnswerToProblemAnswer(pa_10_2_2, sa10_2_2_student5);

        StudentAnswer sa10_2_3_student5 = createStudentAnswer(student5, pa_10_2_3, "A cryptographic algorithm is a mathematical formula used to encrypt and decrypt data, such as AES, RSA, and DES.");
        addStudentAnswerToProblemAnswer(pa_10_2_3, sa10_2_3_student5);

        StudentAnswer sa10_2_4_student5 = createStudentAnswer(student5, pa_10_2_4, "Encryption is essential for protecting sensitive data from unauthorized access, ensuring confidentiality, and maintaining privacy.");
        addStudentAnswerToProblemAnswer(pa_10_2_4, sa10_2_4_student5);

        StudentAnswer sa10_2_5_student5 = createStudentAnswer(student5, pa_10_2_5, "An encryption key is a piece of information used by a cryptographic algorithm to transform plaintext into ciphertext and vice versa.");
        addStudentAnswerToProblemAnswer(pa_10_2_5, sa10_2_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa10_2_1_student6 = createStudentAnswer(student6, pa_10_2_1, "Encryption is the process of converting information into a secure format to prevent unauthorized access.");
        addStudentAnswerToProblemAnswer(pa_10_2_1, sa10_2_1_student6);

        StudentAnswer sa10_2_2_student6 = createStudentAnswer(student6, pa_10_2_2, "The two main types of encryption are symmetric encryption and asymmetric encryption.");
        addStudentAnswerToProblemAnswer(pa_10_2_2, sa10_2_2_student6);

        StudentAnswer sa10_2_3_student6 = createStudentAnswer(student6, pa_10_2_3, "A cryptographic algorithm is a mathematical formula used to encrypt and decrypt data, such as AES, RSA, and DES.");
        addStudentAnswerToProblemAnswer(pa_10_2_3, sa10_2_3_student6);

        StudentAnswer sa10_2_4_student6 = createStudentAnswer(student6, pa_10_2_4, "Encryption is essential for protecting sensitive data from unauthorized access, ensuring confidentiality, and maintaining privacy.");
        addStudentAnswerToProblemAnswer(pa_10_2_4, sa10_2_4_student6);

        StudentAnswer sa10_2_5_student6 = createStudentAnswer(student6, pa_10_2_5, "An encryption key is a piece of information used by a cryptographic algorithm to transform plaintext into ciphertext and vice versa.");
        addStudentAnswerToProblemAnswer(pa_10_2_5, sa10_2_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment10_2.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa10_3_1_student5 = createStudentAnswer(student5, pa_10_3_1, "Network security involves measures to protect data during transmission across networks, ensuring confidentiality, integrity, and availability.");
        addStudentAnswerToProblemAnswer(pa_10_3_1, sa10_3_1_student5);

        StudentAnswer sa10_3_2_student5 = createStudentAnswer(student5, pa_10_3_2, "A firewall is a network security device that monitors and controls network traffic, establishing a barrier between trusted and untrusted networks.");
        addStudentAnswerToProblemAnswer(pa_10_3_2, sa10_3_2_student5);

        StudentAnswer sa10_3_3_student5 = createStudentAnswer(student5, pa_10_3_3, "An intrusion detection system (IDS) detects and responds to potential security breaches by monitoring network traffic for suspicious activity.");
        addStudentAnswerToProblemAnswer(pa_10_3_3, sa10_3_3_student5);

        StudentAnswer sa10_3_4_student5 = createStudentAnswer(student5, pa_10_3_4, "An IDS alerts administrators to security threats, while an intrusion prevention system (IPS) actively blocks and prevents malicious traffic.");
        addStudentAnswerToProblemAnswer(pa_10_3_4, sa10_3_4_student5);

        StudentAnswer sa10_3_5_student5 = createStudentAnswer(student5, pa_10_3_5, "Network segmentation divides a network into smaller segments to enhance security, contain breaches, and limit the spread of attacks.");
        addStudentAnswerToProblemAnswer(pa_10_3_5, sa10_3_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa10_3_1_student6 = createStudentAnswer(student6, pa_10_3_1, "Network security involves measures to protect data during transmission across networks, ensuring confidentiality, integrity, and availability.");
        addStudentAnswerToProblemAnswer(pa_10_3_1, sa10_3_1_student6);

        StudentAnswer sa10_3_2_student6 = createStudentAnswer(student6, pa_10_3_2, "A firewall is a network security device that monitors and controls network traffic, establishing a barrier between trusted and untrusted networks.");
        addStudentAnswerToProblemAnswer(pa_10_3_2, sa10_3_2_student6);

        StudentAnswer sa10_3_3_student6 = createStudentAnswer(student6, pa_10_3_3, "An intrusion detection system (IDS) detects and responds to potential security breaches by monitoring network traffic for suspicious activity.");
        addStudentAnswerToProblemAnswer(pa_10_3_3, sa10_3_3_student6);

        StudentAnswer sa10_3_4_student6 = createStudentAnswer(student6, pa_10_3_4, "An IDS alerts administrators to security threats, while an intrusion prevention system (IPS) actively blocks and prevents malicious traffic.");
        addStudentAnswerToProblemAnswer(pa_10_3_4, sa10_3_4_student6);

        StudentAnswer sa10_3_5_student6 = createStudentAnswer(student6, pa_10_3_5, "Network segmentation divides a network into smaller segments to enhance security, contain breaches, and limit the spread of attacks.");
        addStudentAnswerToProblemAnswer(pa_10_3_5, sa10_3_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment10_3.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa10_4_1_student5 = createStudentAnswer(student5, pa_10_4_1, "Secure coding involves writing software in a way that minimizes vulnerabilities and prevents security breaches.");
        addStudentAnswerToProblemAnswer(pa_10_4_1, sa10_4_1_student5);

        StudentAnswer sa10_4_2_student5 = createStudentAnswer(student5, pa_10_4_2, "Common security flaws include buffer overflows, SQL injection, cross-site scripting (XSS), cross-site request forgery (CSRF), and improper error handling.");
        addStudentAnswerToProblemAnswer(pa_10_4_2, sa10_4_2_student5);

        StudentAnswer sa10_4_3_student5 = createStudentAnswer(student5, pa_10_4_3, "SQL injection is an attack where an attacker inserts malicious SQL code into a query, allowing them to manipulate the database.");
        addStudentAnswerToProblemAnswer(pa_10_4_3, sa10_4_3_student5);

        StudentAnswer sa10_4_4_student5 = createStudentAnswer(student5, pa_10_4_4, "Cross-site scripting (XSS) is a vulnerability where an attacker injects malicious scripts into web pages viewed by users.");
        addStudentAnswerToProblemAnswer(pa_10_4_4, sa10_4_4_student5);

        StudentAnswer sa10_4_5_student5 = createStudentAnswer(student5, pa_10_4_5, "Cross-site request forgery (CSRF) is an attack where an attacker tricks a user into performing actions on a web application without their consent.");
        addStudentAnswerToProblemAnswer(pa_10_4_5, sa10_4_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa10_4_1_student6 = createStudentAnswer(student6, pa_10_4_1, "Secure coding involves writing software in a way that minimizes vulnerabilities and prevents security breaches.");
        addStudentAnswerToProblemAnswer(pa_10_4_1, sa10_4_1_student6);

        StudentAnswer sa10_4_2_student6 = createStudentAnswer(student6, pa_10_4_2, "Common security flaws include buffer overflows, SQL injection, cross-site scripting (XSS), cross-site request forgery (CSRF), and improper error handling.");
        addStudentAnswerToProblemAnswer(pa_10_4_2, sa10_4_2_student6);

        StudentAnswer sa10_4_3_student6 = createStudentAnswer(student6, pa_10_4_3, "SQL injection is an attack where an attacker inserts malicious SQL code into a query, allowing them to manipulate the database.");
        addStudentAnswerToProblemAnswer(pa_10_4_3, sa10_4_3_student6);

        StudentAnswer sa10_4_4_student6 = createStudentAnswer(student6, pa_10_4_4, "Cross-site scripting (XSS) is a vulnerability where an attacker injects malicious scripts into web pages viewed by users.");
        addStudentAnswerToProblemAnswer(pa_10_4_4, sa10_4_4_student6);

        StudentAnswer sa10_4_5_student6 = createStudentAnswer(student6, pa_10_4_5, "Cross-site request forgery (CSRF) is an attack where an attacker tricks a user into performing actions on a web application without their consent.");
        addStudentAnswerToProblemAnswer(pa_10_4_5, sa10_4_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment10_4.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa11_1_1_student5 = createStudentAnswer(student5, pa_11_1_1, "A limit is the value that a function approaches as the input approaches a certain value, foundational in defining continuity, derivatives, and integrals.");
        addStudentAnswerToProblemAnswer(pa_11_1_1, sa11_1_1_student5);

        StudentAnswer sa11_1_2_student5 = createStudentAnswer(student5, pa_11_1_2, "To calculate the limit of a function as x approaches a value, substitute the value into the function or use algebraic manipulation and limit laws if undefined.");
        addStudentAnswerToProblemAnswer(pa_11_1_2, sa11_1_2_student5);

        StudentAnswer sa11_1_3_student5 = createStudentAnswer(student5, pa_11_1_3, "One-sided limits approach a specific value from either the left (left-hand limit) or the right (right-hand limit), useful for points of discontinuity.");
        addStudentAnswerToProblemAnswer(pa_11_1_3, sa11_1_3_student5);

        StudentAnswer sa11_1_4_student5 = createStudentAnswer(student5, pa_11_1_4, "The limit law of sums states that the limit of the sum of two functions is the sum of their limits, i.e., lim(x->c)[f(x) + g(x)] = L + M.");
        addStudentAnswerToProblemAnswer(pa_11_1_4, sa11_1_4_student5);

        StudentAnswer sa11_1_5_student5 = createStudentAnswer(student5, pa_11_1_5, "The epsilon-delta definition states that for every ε > 0, there exists a δ > 0 such that if 0 < |x - c| < δ, then |f(x) - L| < ε.");
        addStudentAnswerToProblemAnswer(pa_11_1_5, sa11_1_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa11_1_1_student6 = createStudentAnswer(student6, pa_11_1_1, "A limit is the value that a function approaches as the input approaches a certain value, foundational in defining continuity, derivatives, and integrals.");
        addStudentAnswerToProblemAnswer(pa_11_1_1, sa11_1_1_student6);

        StudentAnswer sa11_1_2_student6 = createStudentAnswer(student6, pa_11_1_2, "To calculate the limit of a function as x approaches a value, substitute the value into the function or use algebraic manipulation and limit laws if undefined.");
        addStudentAnswerToProblemAnswer(pa_11_1_2, sa11_1_2_student6);

        StudentAnswer sa11_1_3_student6 = createStudentAnswer(student6, pa_11_1_3, "One-sided limits approach a specific value from either the left (left-hand limit) or the right (right-hand limit), useful for points of discontinuity.");
        addStudentAnswerToProblemAnswer(pa_11_1_3, sa11_1_3_student6);

        StudentAnswer sa11_1_4_student6 = createStudentAnswer(student6, pa_11_1_4, "The limit law of sums states that the limit of the sum of two functions is the sum of their limits, i.e., lim(x->c)[f(x) + g(x)] = L + M.");
        addStudentAnswerToProblemAnswer(pa_11_1_4, sa11_1_4_student6);

        StudentAnswer sa11_1_5_student6 = createStudentAnswer(student6, pa_11_1_5, "The epsilon-delta definition states that for every ε > 0, there exists a δ > 0 such that if 0 < |x - c| < δ, then |f(x) - L| < ε.");
        addStudentAnswerToProblemAnswer(pa_11_1_5, sa11_1_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment11_1.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa11_2_1_student5 = createStudentAnswer(student5, pa_11_2_1, "A derivative represents the rate at which a function changes as its input changes, determining the slope of a function at any given point.");
        addStudentAnswerToProblemAnswer(pa_11_2_1, sa11_2_1_student5);

        StudentAnswer sa11_2_2_student5 = createStudentAnswer(student5, pa_11_2_2, "The derivative of a function is calculated using differentiation techniques, commonly the limit definition: f'(x) = lim(h->0)[f(x+h) - f(x)]/h.");
        addStudentAnswerToProblemAnswer(pa_11_2_2, sa11_2_2_student5);

        StudentAnswer sa11_2_3_student5 = createStudentAnswer(student5, pa_11_2_3, "Common rules of differentiation include the power rule, product rule, quotient rule, and chain rule, simplifying the process for various functions.");
        addStudentAnswerToProblemAnswer(pa_11_2_3, sa11_2_3_student5);

        StudentAnswer sa11_2_4_student5 = createStudentAnswer(student5, pa_11_2_4, "The power rule states that the derivative of x^n (where n is a constant) is n*x^(n-1), e.g., the derivative of x^3 is 3*x^2.");
        addStudentAnswerToProblemAnswer(pa_11_2_4, sa11_2_4_student5);

        StudentAnswer sa11_2_5_student5 = createStudentAnswer(student5, pa_11_2_5, "The product rule is used for the derivative of the product of two functions: (uv)' = u'v + uv', where u and v are functions of x.");
        addStudentAnswerToProblemAnswer(pa_11_2_5, sa11_2_5_student5);

// Creating StudentAnswer instances for student6
        StudentAnswer sa11_2_1_student6 = createStudentAnswer(student6, pa_11_2_1, "A derivative represents the rate at which a function changes as its input changes, determining the slope of a function at any given point.");
        addStudentAnswerToProblemAnswer(pa_11_2_1, sa11_2_1_student6);

        StudentAnswer sa11_2_2_student6 = createStudentAnswer(student6, pa_11_2_2, "The derivative of a function is calculated using differentiation techniques, commonly the limit definition: f'(x) = lim(h->0)[f(x+h) - f(x)]/h.");
        addStudentAnswerToProblemAnswer(pa_11_2_2, sa11_2_2_student6);

        StudentAnswer sa11_2_3_student6 = createStudentAnswer(student6, pa_11_2_3, "Common rules of differentiation include the power rule, product rule, quotient rule, and chain rule, simplifying the process for various functions.");
        addStudentAnswerToProblemAnswer(pa_11_2_3, sa11_2_3_student6);

        StudentAnswer sa11_2_4_student6 = createStudentAnswer(student6, pa_11_2_4, "The power rule states that the derivative of x^n (where n is a constant) is n*x^(n-1), e.g., the derivative of x^3 is 3*x^2.");
        addStudentAnswerToProblemAnswer(pa_11_2_4, sa11_2_4_student6);

        StudentAnswer sa11_2_5_student6 = createStudentAnswer(student6, pa_11_2_5, "The product rule is used for the derivative of the product of two functions: (uv)' = u'v + uv', where u and v are functions of x.");
        addStudentAnswerToProblemAnswer(pa_11_2_5, sa11_2_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment11_2.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa11_3_1_student5 = createStudentAnswer(student5, pa_11_3_1, "An integral represents the accumulation of quantities over a continuous interval and is used to calculate areas, volumes, and other related quantities.");
        addStudentAnswerToProblemAnswer(pa_11_3_1, sa11_3_1_student5);

        StudentAnswer sa11_3_2_student5 = createStudentAnswer(student5, pa_11_3_2, "The Fundamental Theorem of Calculus links differentiation and integration, stating that if F is an antiderivative of f on [a, b], then the integral of f from a to b is F(b) - F(a).");
        addStudentAnswerToProblemAnswer(pa_11_3_2, sa11_3_2_student5);

        StudentAnswer sa11_3_3_student5 = createStudentAnswer(student5, pa_11_3_3, "To calculate a definite integral, find the antiderivative of the integrand, evaluate it at the upper and lower limits, and subtract the lower limit value from the upper limit value.");
        addStudentAnswerToProblemAnswer(pa_11_3_3, sa11_3_3_student5);

        StudentAnswer sa11_3_4_student5 = createStudentAnswer(student5, pa_11_3_4, "An indefinite integral represents the family of all antiderivatives of a function, expressed with the integral symbol and a constant of integration (C).");
        addStudentAnswerToProblemAnswer(pa_11_3_4, sa11_3_4_student5);

        StudentAnswer sa11_3_5_student5 = createStudentAnswer(student5, pa_11_3_5, "Integration by substitution simplifies integration by changing the variable of integration, substituting a new variable and its differential.");
        addStudentAnswerToProblemAnswer(pa_11_3_5, sa11_3_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa11_3_1_student6 = createStudentAnswer(student6, pa_11_3_1, "An integral represents the accumulation of quantities over a continuous interval and is used to calculate areas, volumes, and other related quantities.");
        addStudentAnswerToProblemAnswer(pa_11_3_1, sa11_3_1_student6);

        StudentAnswer sa11_3_2_student6 = createStudentAnswer(student6, pa_11_3_2, "The Fundamental Theorem of Calculus links differentiation and integration, stating that if F is an antiderivative of f on [a, b], then the integral of f from a to b is F(b) - F(a).");
        addStudentAnswerToProblemAnswer(pa_11_3_2, sa11_3_2_student6);

        StudentAnswer sa11_3_3_student6 = createStudentAnswer(student6, pa_11_3_3, "To calculate a definite integral, find the antiderivative of the integrand, evaluate it at the upper and lower limits, and subtract the lower limit value from the upper limit value.");
        addStudentAnswerToProblemAnswer(pa_11_3_3, sa11_3_3_student6);

        StudentAnswer sa11_3_4_student6 = createStudentAnswer(student6, pa_11_3_4, "An indefinite integral represents the family of all antiderivatives of a function, expressed with the integral symbol and a constant of integration (C).");
        addStudentAnswerToProblemAnswer(pa_11_3_4, sa11_3_4_student6);

        StudentAnswer sa11_3_5_student6 = createStudentAnswer(student6, pa_11_3_5, "Integration by substitution simplifies integration by changing the variable of integration, substituting a new variable and its differential.");
        addStudentAnswerToProblemAnswer(pa_11_3_5, sa11_3_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment11_3.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa11_4_1_student5 = createStudentAnswer(student5, pa_11_4_1, "Calculus is used in physics to model and analyze physical systems, describing motion, forces, and energy through derivatives and integrals.");
        addStudentAnswerToProblemAnswer(pa_11_4_1, sa11_4_1_student5);

        StudentAnswer sa11_4_2_student5 = createStudentAnswer(student5, pa_11_4_2, "Calculus in engineering is used for designing and analyzing systems, optimizing processes, and solving differential equations in fields like civil, mechanical, and electrical engineering.");
        addStudentAnswerToProblemAnswer(pa_11_4_2, sa11_4_2_student5);

        StudentAnswer sa11_4_3_student5 = createStudentAnswer(student5, pa_11_4_3, "In economics, calculus models economic systems, optimizes production and consumption, and studies changes over time, calculating marginal cost, revenue, and profit.");
        addStudentAnswerToProblemAnswer(pa_11_4_3, sa11_4_3_student5);

        StudentAnswer sa11_4_4_student5 = createStudentAnswer(student5, pa_11_4_4, "Calculus in biology models population dynamics, spread of diseases, and changes in biological systems, understanding growth rates and interactions between species.");
        addStudentAnswerToProblemAnswer(pa_11_4_4, sa11_4_4_student5);

        StudentAnswer sa11_4_5_student5 = createStudentAnswer(student5, pa_11_4_5, "In computer science, calculus is used for algorithm analysis, computer graphics, machine learning, and simulations, optimizing algorithms and modeling continuous data.");
        addStudentAnswerToProblemAnswer(pa_11_4_5, sa11_4_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa11_4_1_student6 = createStudentAnswer(student6, pa_11_4_1, "Calculus is used in physics to model and analyze physical systems, describing motion, forces, and energy through derivatives and integrals.");
        addStudentAnswerToProblemAnswer(pa_11_4_1, sa11_4_1_student6);

        StudentAnswer sa11_4_2_student6 = createStudentAnswer(student6, pa_11_4_2, "Calculus in engineering is used for designing and analyzing systems, optimizing processes, and solving differential equations in fields like civil, mechanical, and electrical engineering.");
        addStudentAnswerToProblemAnswer(pa_11_4_2, sa11_4_2_student6);

        StudentAnswer sa11_4_3_student6 = createStudentAnswer(student6, pa_11_4_3, "In economics, calculus models economic systems, optimizes production and consumption, and studies changes over time, calculating marginal cost, revenue, and profit.");
        addStudentAnswerToProblemAnswer(pa_11_4_3, sa11_4_3_student6);

        StudentAnswer sa11_4_4_student6 = createStudentAnswer(student6, pa_11_4_4, "Calculus in biology models population dynamics, spread of diseases, and changes in biological systems, understanding growth rates and interactions between species.");
        addStudentAnswerToProblemAnswer(pa_11_4_4, sa11_4_4_student6);

        StudentAnswer sa11_4_5_student6 = createStudentAnswer(student6, pa_11_4_5, "In computer science, calculus is used for algorithm analysis, computer graphics, machine learning, and simulations, optimizing algorithms and modeling continuous data.");
        addStudentAnswerToProblemAnswer(pa_11_4_5, sa11_4_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment11_4.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa12_1_1_student5 = createStudentAnswer(student5, pa_12_1_1, "A vector is a quantity that has both magnitude and direction, represented by an arrow from one point to another in space.");
        addStudentAnswerToProblemAnswer(pa_12_1_1, sa12_1_1_student5);

        StudentAnswer sa12_1_2_student5 = createStudentAnswer(student5, pa_12_1_2, "Vector addition is the process of adding two or more vectors by adding their corresponding components to get a resultant vector.");
        addStudentAnswerToProblemAnswer(pa_12_1_2, sa12_1_2_student5);

        StudentAnswer sa12_1_3_student5 = createStudentAnswer(student5, pa_12_1_3, "Scalar multiplication involves multiplying a vector by a scalar (a real number), changing the magnitude but not the direction of the vector.");
        addStudentAnswerToProblemAnswer(pa_12_1_3, sa12_1_3_student5);

        StudentAnswer sa12_1_4_student5 = createStudentAnswer(student5, pa_12_1_4, "The dot product (or scalar product) of two vectors is a measure of their alignment, calculated as the product of their magnitudes and the cosine of the angle between them.");
        addStudentAnswerToProblemAnswer(pa_12_1_4, sa12_1_4_student5);

        StudentAnswer sa12_1_5_student5 = createStudentAnswer(student5, pa_12_1_5, "The cross product (or vector product) of two vectors is a vector perpendicular to both original vectors, calculated as the product of their magnitudes and the sine of the angle between them.");
        addStudentAnswerToProblemAnswer(pa_12_1_5, sa12_1_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa12_1_1_student6 = createStudentAnswer(student6, pa_12_1_1, "A vector is a quantity that has both magnitude and direction, represented by an arrow from one point to another in space.");
        addStudentAnswerToProblemAnswer(pa_12_1_1, sa12_1_1_student6);

        StudentAnswer sa12_1_2_student6 = createStudentAnswer(student6, pa_12_1_2, "Vector addition is the process of adding two or more vectors by adding their corresponding components to get a resultant vector.");
        addStudentAnswerToProblemAnswer(pa_12_1_2, sa12_1_2_student6);

        StudentAnswer sa12_1_3_student6 = createStudentAnswer(student6, pa_12_1_3, "Scalar multiplication involves multiplying a vector by a scalar (a real number), changing the magnitude but not the direction of the vector.");
        addStudentAnswerToProblemAnswer(pa_12_1_3, sa12_1_3_student6);

        StudentAnswer sa12_1_4_student6 = createStudentAnswer(student6, pa_12_1_4, "The dot product (or scalar product) of two vectors is a measure of their alignment, calculated as the product of their magnitudes and the cosine of the angle between them.");
        addStudentAnswerToProblemAnswer(pa_12_1_4, sa12_1_4_student6);

        StudentAnswer sa12_1_5_student6 = createStudentAnswer(student6, pa_12_1_5, "The cross product (or vector product) of two vectors is a vector perpendicular to both original vectors, calculated as the product of their magnitudes and the sine of the angle between them.");
        addStudentAnswerToProblemAnswer(pa_12_1_5, sa12_1_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment12_1.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa12_2_1_student5 = createStudentAnswer(student5, pa_12_2_1, "A matrix is a rectangular array of numbers arranged in rows and columns, used to represent and solve systems of linear equations.");
        addStudentAnswerToProblemAnswer(pa_12_2_1, sa12_2_1_student5);

        StudentAnswer sa12_2_2_student5 = createStudentAnswer(student5, pa_12_2_2, "Matrix addition involves adding two matrices by adding their corresponding elements. The matrices must have the same dimensions.");
        addStudentAnswerToProblemAnswer(pa_12_2_2, sa12_2_2_student5);

        StudentAnswer sa12_2_3_student5 = createStudentAnswer(student5, pa_12_2_3, "Matrix multiplication involves multiplying two matrices by taking the dot product of rows and columns. The number of columns in the first matrix must equal the number of rows in the second.");
        addStudentAnswerToProblemAnswer(pa_12_2_3, sa12_2_3_student5);

        StudentAnswer sa12_2_4_student5 = createStudentAnswer(student5, pa_12_2_4, "The identity matrix is a square matrix with ones on the diagonal and zeros elsewhere, acting as the multiplicative identity in matrix multiplication.");
        addStudentAnswerToProblemAnswer(pa_12_2_4, sa12_2_4_student5);

        StudentAnswer sa12_2_5_student5 = createStudentAnswer(student5, pa_12_2_5, "The inverse of a matrix is a matrix that, when multiplied by the original matrix, yields the identity matrix. Not all matrices have inverses.");
        addStudentAnswerToProblemAnswer(pa_12_2_5, sa12_2_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa12_2_1_student6 = createStudentAnswer(student6, pa_12_2_1, "A matrix is a rectangular array of numbers arranged in rows and columns, used to represent and solve systems of linear equations.");
        addStudentAnswerToProblemAnswer(pa_12_2_1, sa12_2_1_student6);

        StudentAnswer sa12_2_2_student6 = createStudentAnswer(student6, pa_12_2_2, "Matrix addition involves adding two matrices by adding their corresponding elements. The matrices must have the same dimensions.");
        addStudentAnswerToProblemAnswer(pa_12_2_2, sa12_2_2_student6);

        StudentAnswer sa12_2_3_student6 = createStudentAnswer(student6, pa_12_2_3, "Matrix multiplication involves multiplying two matrices by taking the dot product of rows and columns. The number of columns in the first matrix must equal the number of rows in the second.");
        addStudentAnswerToProblemAnswer(pa_12_2_3, sa12_2_3_student6);

        StudentAnswer sa12_2_4_student6 = createStudentAnswer(student6, pa_12_2_4, "The identity matrix is a square matrix with ones on the diagonal and zeros elsewhere, acting as the multiplicative identity in matrix multiplication.");
        addStudentAnswerToProblemAnswer(pa_12_2_4, sa12_2_4_student6);

        StudentAnswer sa12_2_5_student6 = createStudentAnswer(student6, pa_12_2_5, "The inverse of a matrix is a matrix that, when multiplied by the original matrix, yields the identity matrix. Not all matrices have inverses.");
        addStudentAnswerToProblemAnswer(pa_12_2_5, sa12_2_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment12_2.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa12_3_1_student5 = createStudentAnswer(student5, pa_12_3_1, "A determinant is a scalar value computed from the elements of a square matrix, providing important information about the matrix, such as whether it is invertible.");
        addStudentAnswerToProblemAnswer(pa_12_3_1, sa12_3_1_student5);

        StudentAnswer sa12_3_2_student5 = createStudentAnswer(student5, pa_12_3_2, "The determinant of a 2x2 matrix [a b; c d] is calculated as ad - bc.");
        addStudentAnswerToProblemAnswer(pa_12_3_2, sa12_3_2_student5);

        StudentAnswer sa12_3_3_student5 = createStudentAnswer(student5, pa_12_3_3, "Determinants help determine the invertibility of a matrix, solve systems of linear equations, and find the area or volume of geometric shapes.");
        addStudentAnswerToProblemAnswer(pa_12_3_3, sa12_3_3_student5);

        StudentAnswer sa12_3_4_student5 = createStudentAnswer(student5, pa_12_3_4, "The determinant of a 3x3 matrix [a b c; d e f; g h i] is calculated using the formula: a(ei - fh) - b(di - fg) + c(dh - eg).");
        addStudentAnswerToProblemAnswer(pa_12_3_4, sa12_3_4_student5);

        StudentAnswer sa12_3_5_student5 = createStudentAnswer(student5, pa_12_3_5, "Properties of determinants: (1) The determinant of the identity matrix is 1, (2) The determinant of a matrix product is the product of the determinants, (3) Swapping rows or columns changes the sign of the determinant, (4) The determinant of a triangular matrix is the product of its diagonal elements.");
        addStudentAnswerToProblemAnswer(pa_12_3_5, sa12_3_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa12_3_1_student6 = createStudentAnswer(student6, pa_12_3_1, "A determinant is a scalar value computed from the elements of a square matrix, providing important information about the matrix, such as whether it is invertible.");
        addStudentAnswerToProblemAnswer(pa_12_3_1, sa12_3_1_student6);

        StudentAnswer sa12_3_2_student6 = createStudentAnswer(student6, pa_12_3_2, "The determinant of a 2x2 matrix [a b; c d] is calculated as ad - bc.");
        addStudentAnswerToProblemAnswer(pa_12_3_2, sa12_3_2_student6);

        StudentAnswer sa12_3_3_student6 = createStudentAnswer(student6, pa_12_3_3, "Determinants help determine the invertibility of a matrix, solve systems of linear equations, and find the area or volume of geometric shapes.");
        addStudentAnswerToProblemAnswer(pa_12_3_3, sa12_3_3_student6);

        StudentAnswer sa12_3_4_student6 = createStudentAnswer(student6, pa_12_3_4, "The determinant of a 3x3 matrix [a b c; d e f; g h i] is calculated using the formula: a(ei - fh) - b(di - fg) + c(dh - eg).");
        addStudentAnswerToProblemAnswer(pa_12_3_4, sa12_3_4_student6);

        StudentAnswer sa12_3_5_student6 = createStudentAnswer(student6, pa_12_3_5, "Properties of determinants: (1) The determinant of the identity matrix is 1, (2) The determinant of a matrix product is the product of the determinants, (3) Swapping rows or columns changes the sign of the determinant, (4) The determinant of a triangular matrix is the product of its diagonal elements.");
        addStudentAnswerToProblemAnswer(pa_12_3_5, sa12_3_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment12_3.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa12_4_1_student5 = createStudentAnswer(student5, pa_12_4_1, "Eigenvalues are special numbers associated with a matrix that characterize the scaling factor by which the eigenvectors are stretched or compressed under a linear transformation.");
        addStudentAnswerToProblemAnswer(pa_12_4_1, sa12_4_1_student5);

        StudentAnswer sa12_4_2_student5 = createStudentAnswer(student5, pa_12_4_2, "Eigenvalues are calculated by solving the characteristic equation, obtained by setting the determinant of (A - λI) equal to zero, where A is the matrix, λ is the eigenvalue, and I is the identity matrix.");
        addStudentAnswerToProblemAnswer(pa_12_4_2, sa12_4_2_student5);

        StudentAnswer sa12_4_3_student5 = createStudentAnswer(student5, pa_12_4_3, "The characteristic equation of a matrix A is given by det(A - λI) = 0, where det denotes the determinant, λ represents the eigenvalue, and I is the identity matrix.");
        addStudentAnswerToProblemAnswer(pa_12_4_3, sa12_4_3_student5);

        StudentAnswer sa12_4_4_student5 = createStudentAnswer(student5, pa_12_4_4, "Eigenvalues provide important information about a matrix's properties, such as invertibility, stability, and behavior under linear transformations, used in differential equations and matrix diagonalization.");
        addStudentAnswerToProblemAnswer(pa_12_4_4, sa12_4_4_student5);

        StudentAnswer sa12_4_5_student5 = createStudentAnswer(student5, pa_12_4_5, "The determinant of a matrix is equal to the product of its eigenvalues, providing a way to calculate the determinant using eigenvalues and understanding matrix properties.");
        addStudentAnswerToProblemAnswer(pa_12_4_5, sa12_4_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa12_4_1_student6 = createStudentAnswer(student6, pa_12_4_1, "Eigenvalues are special numbers associated with a matrix that characterize the scaling factor by which the eigenvectors are stretched or compressed under a linear transformation.");
        addStudentAnswerToProblemAnswer(pa_12_4_1, sa12_4_1_student6);

        StudentAnswer sa12_4_2_student6 = createStudentAnswer(student6, pa_12_4_2, "Eigenvalues are calculated by solving the characteristic equation, obtained by setting the determinant of (A - λI) equal to zero, where A is the matrix, λ is the eigenvalue, and I is the identity matrix.");
        addStudentAnswerToProblemAnswer(pa_12_4_2, sa12_4_2_student6);

        StudentAnswer sa12_4_3_student6 = createStudentAnswer(student6, pa_12_4_3, "The characteristic equation of a matrix A is given by det(A - λI) = 0, where det denotes the determinant, λ represents the eigenvalue, and I is the identity matrix.");
        addStudentAnswerToProblemAnswer(pa_12_4_3, sa12_4_3_student6);

        StudentAnswer sa12_4_4_student6 = createStudentAnswer(student6, pa_12_4_4, "Eigenvalues provide important information about a matrix's properties, such as invertibility, stability, and behavior under linear transformations, used in differential equations and matrix diagonalization.");
        addStudentAnswerToProblemAnswer(pa_12_4_4, sa12_4_4_student6);

        StudentAnswer sa12_4_5_student6 = createStudentAnswer(student6, pa_12_4_5, "The determinant of a matrix is equal to the product of its eigenvalues, providing a way to calculate the determinant using eigenvalues and understanding matrix properties.");
        addStudentAnswerToProblemAnswer(pa_12_4_5, sa12_4_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment12_4.");
// Creating StudentAnswer instances for student5
        StudentAnswer sa12_5_1_student5 = createStudentAnswer(student5, pa_12_5_1, "Eigenvectors are special vectors associated with a matrix that remain in the same direction under a linear transformation. They are scaled by their corresponding eigenvalues.");
        addStudentAnswerToProblemAnswer(pa_12_5_1, sa12_5_1_student5);

        StudentAnswer sa12_5_2_student5 = createStudentAnswer(student5, pa_12_5_2, "Eigenvectors are found by solving the equation (A - λI)v = 0, where A is the matrix, λ is the eigenvalue, I is the identity matrix, and v is the eigenvector.");
        addStudentAnswerToProblemAnswer(pa_12_5_2, sa12_5_2_student5);

        StudentAnswer sa12_5_3_student5 = createStudentAnswer(student5, pa_12_5_3, "Eigenvectors are vectors scaled by a factor (the eigenvalue) when a linear transformation is applied. The eigenvalue determines the amount of scaling, while the eigenvector determines the direction.");
        addStudentAnswerToProblemAnswer(pa_12_5_3, sa12_5_3_student5);

        StudentAnswer sa12_5_4_student5 = createStudentAnswer(student5, pa_12_5_4, "Eigenvectors provide insight into the behavior of a linear transformation, representing directions that remain unchanged and helping to understand the transformation's effect on different system components.");
        addStudentAnswerToProblemAnswer(pa_12_5_4, sa12_5_4_student5);

        StudentAnswer sa12_5_5_student5 = createStudentAnswer(student5, pa_12_5_5, "Matrix diagonalization involves expressing a matrix as a product of its eigenvectors and a diagonal matrix of its eigenvalues, simplifying matrix operations and solving systems of differential equations.");
        addStudentAnswerToProblemAnswer(pa_12_5_5, sa12_5_5_student5);


// Creating StudentAnswer instances for student6
        StudentAnswer sa12_5_1_student6 = createStudentAnswer(student6, pa_12_5_1, "Eigenvectors are special vectors associated with a matrix that remain in the same direction under a linear transformation. They are scaled by their corresponding eigenvalues.");
        addStudentAnswerToProblemAnswer(pa_12_5_1, sa12_5_1_student6);

        StudentAnswer sa12_5_2_student6 = createStudentAnswer(student6, pa_12_5_2, "Eigenvectors are found by solving the equation (A - λI)v = 0, where A is the matrix, λ is the eigenvalue, I is the identity matrix, and v is the eigenvector.");
        addStudentAnswerToProblemAnswer(pa_12_5_2, sa12_5_2_student6);

        StudentAnswer sa12_5_3_student6 = createStudentAnswer(student6, pa_12_5_3, "Eigenvectors are vectors scaled by a factor (the eigenvalue) when a linear transformation is applied. The eigenvalue determines the amount of scaling, while the eigenvector determines the direction.");
        addStudentAnswerToProblemAnswer(pa_12_5_3, sa12_5_3_student6);

        StudentAnswer sa12_5_4_student6 = createStudentAnswer(student6, pa_12_5_4, "Eigenvectors provide insight into the behavior of a linear transformation, representing directions that remain unchanged and helping to understand the transformation's effect on different system components.");
        addStudentAnswerToProblemAnswer(pa_12_5_4, sa12_5_4_student6);

        StudentAnswer sa12_5_5_student6 = createStudentAnswer(student6, pa_12_5_5, "Matrix diagonalization involves expressing a matrix as a product of its eigenvectors and a diagonal matrix of its eigenvalues, simplifying matrix operations and solving systems of differential equations.");
        addStudentAnswerToProblemAnswer(pa_12_5_5, sa12_5_5_student6);


// Output for confirmation
        System.out.println("Student answers created and added for both student5 and student6 for all 10 problem answers in assignment12_5.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa13_1_1_student7 = createStudentAnswer(student7, pa_13_1_1, "A sequence is an ordered list of numbers or terms that follow a specific pattern or rule, with each term identified by its position in the list.");
        addStudentAnswerToProblemAnswer(pa_13_1_1, sa13_1_1_student7);

        StudentAnswer sa13_1_2_student7 = createStudentAnswer(student7, pa_13_1_2, "A series is the sum of the terms of a sequence, which can be finite with a fixed number of terms or infinite with an infinite number of terms.");
        addStudentAnswerToProblemAnswer(pa_13_1_2, sa13_1_2_student7);

        StudentAnswer sa13_1_3_student7 = createStudentAnswer(student7, pa_13_1_3, "A convergent series is a series whose terms approach a specific value as the number of terms increases, meaning the sum of the series approaches a finite limit.");
        addStudentAnswerToProblemAnswer(pa_13_1_3, sa13_1_3_student7);

        StudentAnswer sa13_1_4_student7 = createStudentAnswer(student7, pa_13_1_4, "A divergent series is a series whose terms do not approach a specific value as the number of terms increases, meaning the sum of the series does not converge to a finite limit.");
        addStudentAnswerToProblemAnswer(pa_13_1_4, sa13_1_4_student7);

        StudentAnswer sa13_1_5_student7 = createStudentAnswer(student7, pa_13_1_5, "A power series is an infinite series of the form Σa_n(x-c)^n, where a_n are the coefficients, x is the variable, and c is the center of the series, used to represent functions in terms of Taylor or Maclaurin series expansions.");
        addStudentAnswerToProblemAnswer(pa_13_1_5, sa13_1_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa13_1_1_student8 = createStudentAnswer(student8, pa_13_1_1, "A sequence is an ordered list of numbers or terms that follow a specific pattern or rule, with each term identified by its position in the list.");
        addStudentAnswerToProblemAnswer(pa_13_1_1, sa13_1_1_student8);

        StudentAnswer sa13_1_2_student8 = createStudentAnswer(student8, pa_13_1_2, "A series is the sum of the terms of a sequence, which can be finite with a fixed number of terms or infinite with an infinite number of terms.");
        addStudentAnswerToProblemAnswer(pa_13_1_2, sa13_1_2_student8);

        StudentAnswer sa13_1_3_student8 = createStudentAnswer(student8, pa_13_1_3, "A convergent series is a series whose terms approach a specific value as the number of terms increases, meaning the sum of the series approaches a finite limit.");
        addStudentAnswerToProblemAnswer(pa_13_1_3, sa13_1_3_student8);

        StudentAnswer sa13_1_4_student8 = createStudentAnswer(student8, pa_13_1_4, "A divergent series is a series whose terms do not approach a specific value as the number of terms increases, meaning the sum of the series does not converge to a finite limit.");
        addStudentAnswerToProblemAnswer(pa_13_1_4, sa13_1_4_student8);

        StudentAnswer sa13_1_5_student8 = createStudentAnswer(student8, pa_13_1_5, "A power series is an infinite series of the form Σa_n(x-c)^n, where a_n are the coefficients, x is the variable, and c is the center of the series, used to represent functions in terms of Taylor or Maclaurin series expansions.");
        addStudentAnswerToProblemAnswer(pa_13_1_5, sa13_1_5_student8);

// Creating StudentAnswer instances for student7
        StudentAnswer sa13_2_1_student7 = createStudentAnswer(student7, pa_13_2_1, "Integration by parts is a method used to integrate the product of two functions, based on the formula ∫u dv = uv - ∫v du, where u and v are functions of x.");
        addStudentAnswerToProblemAnswer(pa_13_2_1, sa13_2_1_student7);

        StudentAnswer sa13_2_2_student7 = createStudentAnswer(student7, pa_13_2_2, "Partial fraction decomposition breaks down a complex rational function into simpler fractions that can be integrated individually, useful for integrating rational functions.");
        addStudentAnswerToProblemAnswer(pa_13_2_2, sa13_2_2_student7);

        StudentAnswer sa13_2_3_student7 = createStudentAnswer(student7, pa_13_2_3, "Trigonometric integrals involve integrals of functions with trigonometric functions like sine, cosine, and tangent. Techniques include using trigonometric identities and substitution.");
        addStudentAnswerToProblemAnswer(pa_13_2_3, sa13_2_3_student7);

        StudentAnswer sa13_2_4_student7 = createStudentAnswer(student7, pa_13_2_4, "Improper integrals have infinite limits of integration or integrands that approach infinity within the integration interval, evaluated by taking the limit of the integral as it approaches the problematic point.");
        addStudentAnswerToProblemAnswer(pa_13_2_4, sa13_2_4_student7);

        StudentAnswer sa13_2_5_student7 = createStudentAnswer(student7, pa_13_2_5, "Trigonometric substitution simplifies integrals by substituting trigonometric functions for expressions with square roots, useful for integrals involving radicals.");
        addStudentAnswerToProblemAnswer(pa_13_2_5, sa13_2_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa13_2_1_student8 = createStudentAnswer(student8, pa_13_2_1, "Integration by parts is a method used to integrate the product of two functions, based on the formula ∫u dv = uv - ∫v du, where u and v are functions of x.");
        addStudentAnswerToProblemAnswer(pa_13_2_1, sa13_2_1_student8);

        StudentAnswer sa13_2_2_student8 = createStudentAnswer(student8, pa_13_2_2, "Partial fraction decomposition breaks down a complex rational function into simpler fractions that can be integrated individually, useful for integrating rational functions.");
        addStudentAnswerToProblemAnswer(pa_13_2_2, sa13_2_2_student8);

        StudentAnswer sa13_2_3_student8 = createStudentAnswer(student8, pa_13_2_3, "Trigonometric integrals involve integrals of functions with trigonometric functions like sine, cosine, and tangent. Techniques include using trigonometric identities and substitution.");
        addStudentAnswerToProblemAnswer(pa_13_2_3, sa13_2_3_student8);

        StudentAnswer sa13_2_4_student8 = createStudentAnswer(student8, pa_13_2_4, "Improper integrals have infinite limits of integration or integrands that approach infinity within the integration interval, evaluated by taking the limit of the integral as it approaches the problematic point.");
        addStudentAnswerToProblemAnswer(pa_13_2_4, sa13_2_4_student8);

        StudentAnswer sa13_2_5_student8 = createStudentAnswer(student8, pa_13_2_5, "Trigonometric substitution simplifies integrals by substituting trigonometric functions for expressions with square roots, useful for integrals involving radicals.");
        addStudentAnswerToProblemAnswer(pa_13_2_5, sa13_2_5_student8);


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment13_2.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa13_3_1_student7 = createStudentAnswer(student7, pa_13_3_1, "Multivariable functions have more than one input variable and model relationships involving multiple quantities, often represented as f(x, y, z).");
        addStudentAnswerToProblemAnswer(pa_13_3_1, sa13_3_1_student7);

        StudentAnswer sa13_3_2_student7 = createStudentAnswer(student7, pa_13_3_2, "A partial derivative is the derivative of a multivariable function with respect to one variable, while keeping the other variables constant, measuring how the function changes as that variable changes.");
        addStudentAnswerToProblemAnswer(pa_13_3_2, sa13_3_2_student7);

        StudentAnswer sa13_3_3_student7 = createStudentAnswer(student7, pa_13_3_3, "The gradient of a multivariable function is a vector pointing in the direction of the steepest ascent, calculated by taking the partial derivatives with respect to each variable and combining them into a vector.");
        addStudentAnswerToProblemAnswer(pa_13_3_3, sa13_3_3_student7);

        StudentAnswer sa13_3_4_student7 = createStudentAnswer(student7, pa_13_3_4, "A multiple integral involves more than one variable and is used to calculate volumes, areas, and other quantities in higher dimensions, such as double and triple integrals.");
        addStudentAnswerToProblemAnswer(pa_13_3_4, sa13_3_4_student7);

        StudentAnswer sa13_3_5_student7 = createStudentAnswer(student7, pa_13_3_5, "The Jacobian matrix is a matrix of all first-order partial derivatives of a multivariable function, used to analyze the function's behavior and perform coordinate transformations.");
        addStudentAnswerToProblemAnswer(pa_13_3_5, sa13_3_5_student7);

// Creating StudentAnswer instances for student8
        StudentAnswer sa13_3_1_student8 = createStudentAnswer(student8, pa_13_3_1, "Multivariable functions have more than one input variable and model relationships involving multiple quantities, often represented as f(x, y, z).");
        addStudentAnswerToProblemAnswer(pa_13_3_1, sa13_3_1_student8);

        StudentAnswer sa13_3_2_student8 = createStudentAnswer(student8, pa_13_3_2, "A partial derivative is the derivative of a multivariable function with respect to one variable, while keeping the other variables constant, measuring how the function changes as that variable changes.");
        addStudentAnswerToProblemAnswer(pa_13_3_2, sa13_3_2_student8);

        StudentAnswer sa13_3_3_student8 = createStudentAnswer(student8, pa_13_3_3, "The gradient of a multivariable function is a vector pointing in the direction of the steepest ascent, calculated by taking the partial derivatives with respect to each variable and combining them into a vector.");
        addStudentAnswerToProblemAnswer(pa_13_3_3, sa13_3_3_student8);

        StudentAnswer sa13_3_4_student8 = createStudentAnswer(student8, pa_13_3_4, "A multiple integral involves more than one variable and is used to calculate volumes, areas, and other quantities in higher dimensions, such as double and triple integrals.");
        addStudentAnswerToProblemAnswer(pa_13_3_4, sa13_3_4_student8);

        StudentAnswer sa13_3_5_student8 = createStudentAnswer(student8, pa_13_3_5, "The Jacobian matrix is a matrix of all first-order partial derivatives of a multivariable function, used to analyze the function's behavior and perform coordinate transformations.");
        addStudentAnswerToProblemAnswer(pa_13_3_5, sa13_3_5_student8);


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment13_3.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa13_4_1_student7 = createStudentAnswer(student7, pa_13_4_1, "Vector calculus is the study of vector fields and their applications, involving operations like differentiation and integration of vector functions to solve problems with vector fields.");
        addStudentAnswerToProblemAnswer(pa_13_4_1, sa13_4_1_student7);

        StudentAnswer sa13_4_2_student7 = createStudentAnswer(student7, pa_13_4_2, "A line integral evaluates the sum of a function along a curve, used to calculate quantities like work done by a force field along a path and circulation in fluid dynamics.");
        addStudentAnswerToProblemAnswer(pa_13_4_2, sa13_4_2_student7);

        StudentAnswer sa13_4_3_student7 = createStudentAnswer(student7, pa_13_4_3, "A surface integral evaluates the sum of a function over a surface, used to calculate quantities like flux through a surface and surface area in three-dimensional space.");
        addStudentAnswerToProblemAnswer(pa_13_4_3, sa13_4_3_student7);

        StudentAnswer sa13_4_4_student7 = createStudentAnswer(student7, pa_13_4_4, "Green's Theorem relates the line integral around a simple, closed curve to the double integral over the enclosed region, converting between line integrals and double integrals to analyze two-dimensional vector fields.");
        addStudentAnswerToProblemAnswer(pa_13_4_4, sa13_4_4_student7);

        StudentAnswer sa13_4_5_student7 = createStudentAnswer(student7, pa_13_4_5, "Stokes' Theorem relates the surface integral of the curl of a vector field over a surface to the line integral of the vector field around the surface's boundary, generalizing Green's Theorem to three dimensions.");
        addStudentAnswerToProblemAnswer(pa_13_4_5, sa13_4_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa13_4_1_student8 = createStudentAnswer(student8, pa_13_4_1, "Vector calculus is the study of vector fields and their applications, involving operations like differentiation and integration of vector functions to solve problems with vector fields.");
        addStudentAnswerToProblemAnswer(pa_13_4_1, sa13_4_1_student8);

        StudentAnswer sa13_4_2_student8 = createStudentAnswer(student8, pa_13_4_2, "A line integral evaluates the sum of a function along a curve, used to calculate quantities like work done by a force field along a path and circulation in fluid dynamics.");
        addStudentAnswerToProblemAnswer(pa_13_4_2, sa13_4_2_student8);

        StudentAnswer sa13_4_3_student8 = createStudentAnswer(student8, pa_13_4_3, "A surface integral evaluates the sum of a function over a surface, used to calculate quantities like flux through a surface and surface area in three-dimensional space.");
        addStudentAnswerToProblemAnswer(pa_13_4_3, sa13_4_3_student8);

        StudentAnswer sa13_4_4_student8 = createStudentAnswer(student8, pa_13_4_4, "Green's Theorem relates the line integral around a simple, closed curve to the double integral over the enclosed region, converting between line integrals and double integrals to analyze two-dimensional vector fields.");
        addStudentAnswerToProblemAnswer(pa_13_4_4, sa13_4_4_student8);

        StudentAnswer sa13_4_5_student8 = createStudentAnswer(student8, pa_13_4_5, "Stokes' Theorem relates the surface integral of the curl of a vector field over a surface to the line integral of the vector field around the surface's boundary, generalizing Green's Theorem to three dimensions.");
        addStudentAnswerToProblemAnswer(pa_13_4_5, sa13_4_5_student8);


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment13_4.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa14_1_1_student7 = createStudentAnswer(student7, pa_14_1_1, "Propositional logic deals with propositions, which are statements that can be true or false, and uses logical connectives like AND, OR, NOT, and IMPLIES to form complex statements.");
        addStudentAnswerToProblemAnswer(pa_14_1_1, sa14_1_1_student7);

        StudentAnswer sa14_1_2_student7 = createStudentAnswer(student7, pa_14_1_2, "Predicate logic, or first-order logic, extends propositional logic by dealing with predicates, which are statements with variables, and uses quantifiers like FOR ALL and THERE EXISTS for more expressive statements.");
        addStudentAnswerToProblemAnswer(pa_14_1_2, sa14_1_2_student7);

        StudentAnswer sa14_1_3_student7 = createStudentAnswer(student7, pa_14_1_3, "Logical connectives are symbols or words used to connect propositions and form complex logical statements. Common logical connectives include AND (∧), OR (∨), NOT (¬), IMPLIES (→), and IF AND ONLY IF (↔).");
        addStudentAnswerToProblemAnswer(pa_14_1_3, sa14_1_3_student7);

        StudentAnswer sa14_1_4_student7 = createStudentAnswer(student7, pa_14_1_4, "A truth table determines the truth value of a logical expression based on all possible combinations of truth values for its components, useful for analyzing and verifying logical statements.");
        addStudentAnswerToProblemAnswer(pa_14_1_4, sa14_1_4_student7);

        StudentAnswer sa14_1_5_student7 = createStudentAnswer(student7, pa_14_1_5, "A logical argument is a sequence of propositions leading to a conclusion. An argument is valid if the conclusion logically follows from the premises, and sound if the premises are true.");
        addStudentAnswerToProblemAnswer(pa_14_1_5, sa14_1_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa14_1_1_student8 = createStudentAnswer(student8, pa_14_1_1, "Propositional logic deals with propositions, which are statements that can be true or false, and uses logical connectives like AND, OR, NOT, and IMPLIES to form complex statements.");
        addStudentAnswerToProblemAnswer(pa_14_1_1, sa14_1_1_student8);

        StudentAnswer sa14_1_2_student8 = createStudentAnswer(student8, pa_14_1_2, "Predicate logic, or first-order logic, extends propositional logic by dealing with predicates, which are statements with variables, and uses quantifiers like FOR ALL and THERE EXISTS for more expressive statements.");
        addStudentAnswerToProblemAnswer(pa_14_1_2, sa14_1_2_student8);

        StudentAnswer sa14_1_3_student8 = createStudentAnswer(student8, pa_14_1_3, "Logical connectives are symbols or words used to connect propositions and form complex logical statements. Common logical connectives include AND (∧), OR (∨), NOT (¬), IMPLIES (→), and IF AND ONLY IF (↔).");
        addStudentAnswerToProblemAnswer(pa_14_1_3, sa14_1_3_student8);

        StudentAnswer sa14_1_4_student8 = createStudentAnswer(student8, pa_14_1_4, "A truth table determines the truth value of a logical expression based on all possible combinations of truth values for its components, useful for analyzing and verifying logical statements.");
        addStudentAnswerToProblemAnswer(pa_14_1_4, sa14_1_4_student8);

        StudentAnswer sa14_1_5_student8 = createStudentAnswer(student8, pa_14_1_5, "A logical argument is a sequence of propositions leading to a conclusion. An argument is valid if the conclusion logically follows from the premises, and sound if the premises are true.");
        addStudentAnswerToProblemAnswer(pa_14_1_5, sa14_1_5_student8);

// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment14_1.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa14_2_1_student7 = createStudentAnswer(student7, pa_14_2_1, "A set is a collection of distinct objects, considered as an object in its own right, fundamental in mathematics and used to define various concepts.");
        addStudentAnswerToProblemAnswer(pa_14_2_1, sa14_2_1_student7);

        StudentAnswer sa14_2_2_student7 = createStudentAnswer(student7, pa_14_2_2, "A subset is a set whose elements are all contained within another set. If A is a subset of B, every element of A is also an element of B.");
        addStudentAnswerToProblemAnswer(pa_14_2_2, sa14_2_2_student7);

        StudentAnswer sa14_2_3_student7 = createStudentAnswer(student7, pa_14_2_3, "The union of two sets is a set containing all the elements of both sets. The union of sets A and B is denoted by A ∪ B and includes all elements in A, B, or both.");
        addStudentAnswerToProblemAnswer(pa_14_2_3, sa14_2_3_student7);

        StudentAnswer sa14_2_4_student7 = createStudentAnswer(student7, pa_14_2_4, "The intersection of two sets is a set containing only the elements that are common to both sets. The intersection of sets A and B is denoted by A ∩ B and includes all elements in both A and B.");
        addStudentAnswerToProblemAnswer(pa_14_2_4, sa14_2_4_student7);

        StudentAnswer sa14_2_5_student7 = createStudentAnswer(student7, pa_14_2_5, "The difference between two sets is a set containing the elements of one set that are not in the other. The difference of sets A and B is denoted by A - B and includes all elements in A but not in B.");
        addStudentAnswerToProblemAnswer(pa_14_2_5, sa14_2_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa14_2_1_student8 = createStudentAnswer(student8, pa_14_2_1, "A set is a collection of distinct objects, considered as an object in its own right, fundamental in mathematics and used to define various concepts.");
        addStudentAnswerToProblemAnswer(pa_14_2_1, sa14_2_1_student8);

        StudentAnswer sa14_2_2_student8 = createStudentAnswer(student8, pa_14_2_2, "A subset is a set whose elements are all contained within another set. If A is a subset of B, every element of A is also an element of B.");
        addStudentAnswerToProblemAnswer(pa_14_2_2, sa14_2_2_student8);

        StudentAnswer sa14_2_3_student8 = createStudentAnswer(student8, pa_14_2_3, "The union of two sets is a set containing all the elements of both sets. The union of sets A and B is denoted by A ∪ B and includes all elements in A, B, or both.");
        addStudentAnswerToProblemAnswer(pa_14_2_3, sa14_2_3_student8);

        StudentAnswer sa14_2_4_student8 = createStudentAnswer(student8, pa_14_2_4, "The intersection of two sets is a set containing only the elements that are common to both sets. The intersection of sets A and B is denoted by A ∩ B and includes all elements in both A and B.");
        addStudentAnswerToProblemAnswer(pa_14_2_4, sa14_2_4_student8);

        StudentAnswer sa14_2_5_student8 = createStudentAnswer(student8, pa_14_2_5, "The difference between two sets is a set containing the elements of one set that are not in the other. The difference of sets A and B is denoted by A - B and includes all elements in A but not in B.");
        addStudentAnswerToProblemAnswer(pa_14_2_5, sa14_2_5_student8);


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment14_2.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa14_3_1_student7 = createStudentAnswer(student7, pa_14_3_1, "Graph theory is the study of graphs as mathematical structures used to model pairwise relations between objects, involving the analysis of vertices (nodes) and edges (connections) that form graphs.");
        addStudentAnswerToProblemAnswer(pa_14_3_1, sa14_3_1_student7);

        StudentAnswer sa14_3_2_student7 = createStudentAnswer(student7, pa_14_3_2, "A directed graph (or digraph) is a graph in which edges have a direction, indicated by arrows, showing the relationship between two vertices, like a one-way street or hierarchy.");
        addStudentAnswerToProblemAnswer(pa_14_3_2, sa14_3_2_student7);

        StudentAnswer sa14_3_3_student7 = createStudentAnswer(student7, pa_14_3_3, "An undirected graph is a graph in which edges do not have a direction. The connections between vertices are bidirectional, meaning there is no distinction between the two endpoints of an edge.");
        addStudentAnswerToProblemAnswer(pa_14_3_3, sa14_3_3_student7);

        StudentAnswer sa14_3_4_student7 = createStudentAnswer(student7, pa_14_3_4, "A connected graph is a graph in which there is a path between any two vertices, meaning all vertices in the graph are reachable from any other vertex.");
        addStudentAnswerToProblemAnswer(pa_14_3_4, sa14_3_4_student7);

        StudentAnswer sa14_3_5_student7 = createStudentAnswer(student7, pa_14_3_5, "A cycle in a graph is a path that starts and ends at the same vertex, with all edges and vertices being distinct except for the starting and ending vertex, important for analyzing graph structure and properties.");
        addStudentAnswerToProblemAnswer(pa_14_3_5, sa14_3_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa14_3_1_student8 = createStudentAnswer(student8, pa_14_3_1, "Graph theory is the study of graphs as mathematical structures used to model pairwise relations between objects, involving the analysis of vertices (nodes) and edges (connections) that form graphs.");
        addStudentAnswerToProblemAnswer(pa_14_3_1, sa14_3_1_student8);

        StudentAnswer sa14_3_2_student8 = createStudentAnswer(student8, pa_14_3_2, "A directed graph (or digraph) is a graph in which edges have a direction, indicated by arrows, showing the relationship between two vertices, like a one-way street or hierarchy.");
        addStudentAnswerToProblemAnswer(pa_14_3_2, sa14_3_2_student8);

        StudentAnswer sa14_3_3_student8 = createStudentAnswer(student8, pa_14_3_3, "An undirected graph is a graph in which edges do not have a direction. The connections between vertices are bidirectional, meaning there is no distinction between the two endpoints of an edge.");
        addStudentAnswerToProblemAnswer(pa_14_3_3, sa14_3_3_student8);

        StudentAnswer sa14_3_4_student8 = createStudentAnswer(student8, pa_14_3_4, "A connected graph is a graph in which there is a path between any two vertices, meaning all vertices in the graph are reachable from any other vertex.");
        addStudentAnswerToProblemAnswer(pa_14_3_4, sa14_3_4_student8);

        StudentAnswer sa14_3_5_student8 = createStudentAnswer(student8, pa_14_3_5, "A cycle in a graph is a path that starts and ends at the same vertex, with all edges and vertices being distinct except for the starting and ending vertex, important for analyzing graph structure and properties.");
        addStudentAnswerToProblemAnswer(pa_14_3_5, sa14_3_5_student8);


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment14_3.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa14_4_1_student7 = createStudentAnswer(student7, pa_14_4_1, "Combinatorics is the study of counting, arrangement, and combination of objects, dealing with problems related to enumeration and combination of discrete structures.");
        addStudentAnswerToProblemAnswer(pa_14_4_1, sa14_4_1_student7);

        StudentAnswer sa14_4_2_student7 = createStudentAnswer(student7, pa_14_4_2, "Permutations are arrangements of objects in a specific order. The number of permutations of n distinct objects is given by n! (n factorial), the product of all positive integers up to n.");
        addStudentAnswerToProblemAnswer(pa_14_4_2, sa14_4_2_student7);

        StudentAnswer sa14_4_3_student7 = createStudentAnswer(student7, pa_14_4_3, "Combinations are selections of objects without regard to order. The number of combinations of n objects taken r at a time is given by C(n, r) = n! / [r!(n-r)!], known as binomial coefficients.");
        addStudentAnswerToProblemAnswer(pa_14_4_3, sa14_4_3_student7);

        StudentAnswer sa14_4_4_student7 = createStudentAnswer(student7, pa_14_4_4, "The principle of multiplication states that if there are m ways to do one thing and n ways to do another, there are m * n ways to do both, a fundamental rule in counting and combinatorics.");
        addStudentAnswerToProblemAnswer(pa_14_4_4, sa14_4_4_student7);

        StudentAnswer sa14_4_5_student7 = createStudentAnswer(student7, pa_14_4_5, "The principle of addition states that if there are m ways to do one thing and n ways to do another, and the two events are mutually exclusive, there are m + n ways to do either, used to combine disjoint sets.");
        addStudentAnswerToProblemAnswer(pa_14_4_5, sa14_4_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa14_4_1_student8 = createStudentAnswer(student8, pa_14_4_1, "Combinatorics is the study of counting, arrangement, and combination of objects, dealing with problems related to enumeration and combination of discrete structures.");
        addStudentAnswerToProblemAnswer(pa_14_4_1, sa14_4_1_student8);

        StudentAnswer sa14_4_2_student8 = createStudentAnswer(student8, pa_14_4_2, "Permutations are arrangements of objects in a specific order. The number of permutations of n distinct objects is given by n! (n factorial), the product of all positive integers up to n.");
        addStudentAnswerToProblemAnswer(pa_14_4_2, sa14_4_2_student8);

        StudentAnswer sa14_4_3_student8 = createStudentAnswer(student8, pa_14_4_3, "Combinations are selections of objects without regard to order. The number of combinations of n objects taken r at a time is given by C(n, r) = n! / [r!(n-r)!], known as binomial coefficients.");
        addStudentAnswerToProblemAnswer(pa_14_4_3, sa14_4_3_student8);

        StudentAnswer sa14_4_4_student8 = createStudentAnswer(student8, pa_14_4_4, "The principle of multiplication states that if there are m ways to do one thing and n ways to do another, there are m * n ways to do both, a fundamental rule in counting and combinatorics.");
        addStudentAnswerToProblemAnswer(pa_14_4_4, sa14_4_4_student8);

        StudentAnswer sa14_4_5_student8 = createStudentAnswer(student8, pa_14_4_5, "The principle of addition states that if there are m ways to do one thing and n ways to do another, and the two events are mutually exclusive, there are m + n ways to do either, used to combine disjoint sets.");
        addStudentAnswerToProblemAnswer(pa_14_4_5, sa14_4_5_student8);

// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment14_4.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa15_1_1_student7 = createStudentAnswer(student7, pa_15_1_1, "Newton's First Law of Motion, also known as the law of inertia, states that an object will remain at rest or in uniform motion in a straight line unless acted upon by an external force.");
        addStudentAnswerToProblemAnswer(pa_15_1_1, sa15_1_1_student7);

        StudentAnswer sa15_1_2_student7 = createStudentAnswer(student7, pa_15_1_2, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. The law is mathematically expressed as F = ma, where F is the net force, m is the mass, and a is the acceleration.");
        addStudentAnswerToProblemAnswer(pa_15_1_2, sa15_1_2_student7);

        StudentAnswer sa15_1_3_student7 = createStudentAnswer(student7, pa_15_1_3, "Newton's Third Law of Motion states that for every action, there is an equal and opposite reaction. This means that forces always occur in pairs; if one object exerts a force on another, the second object exerts an equal and opposite force on the first.");
        addStudentAnswerToProblemAnswer(pa_15_1_3, sa15_1_3_student7);

        StudentAnswer sa15_1_4_student7 = createStudentAnswer(student7, pa_15_1_4, "Inertia is the property of an object that resists changes to its state of motion. An object with greater mass has greater inertia and requires more force to change its motion.");
        addStudentAnswerToProblemAnswer(pa_15_1_4, sa15_1_4_student7);

        StudentAnswer sa15_1_5_student7 = createStudentAnswer(student7, pa_15_1_5, "The equation of motion for an object under constant acceleration is given by the kinematic equations: \n1. v = u + at \n2. s = ut + 0.5at^2 \n3. v^2 = u^2 + 2as \nwhere u is the initial velocity, v is the final velocity, a is the acceleration, t is the time, and s is the displacement.");
        addStudentAnswerToProblemAnswer(pa_15_1_5, sa15_1_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa15_1_1_student8 = createStudentAnswer(student8, pa_15_1_1, "Newton's First Law of Motion, also known as the law of inertia, states that an object will remain at rest or in uniform motion in a straight line unless acted upon by an external force.");
        addStudentAnswerToProblemAnswer(pa_15_1_1, sa15_1_1_student8);

        StudentAnswer sa15_1_2_student8 = createStudentAnswer(student8, pa_15_1_2, "Newton's Second Law of Motion states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. The law is mathematically expressed as F = ma, where F is the net force, m is the mass, and a is the acceleration.");
        addStudentAnswerToProblemAnswer(pa_15_1_2, sa15_1_2_student8);

        StudentAnswer sa15_1_3_student8 = createStudentAnswer(student8, pa_15_1_3, "Newton's Third Law of Motion states that for every action, there is an equal and opposite reaction. This means that forces always occur in pairs; if one object exerts a force on another, the second object exerts an equal and opposite force on the first.");
        addStudentAnswerToProblemAnswer(pa_15_1_3, sa15_1_3_student8);

        StudentAnswer sa15_1_4_student8 = createStudentAnswer(student8, pa_15_1_4, "Inertia is the property of an object that resists changes to its state of motion. An object with greater mass has greater inertia and requires more force to change its motion.");
        addStudentAnswerToProblemAnswer(pa_15_1_4, sa15_1_4_student8);

        StudentAnswer sa15_1_5_student8 = createStudentAnswer(student8, pa_15_1_5, "The equation of motion for an object under constant acceleration is given by the kinematic equations: \n1. v = u + at \n2. s = ut + 0.5at^2 \n3. v^2 = u^2 + 2as \nwhere u is the initial velocity, v is the final velocity, a is the acceleration, t is the time, and s is the displacement.");
        addStudentAnswerToProblemAnswer(pa_15_1_5, sa15_1_5_student8);


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment15_1.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa15_2_1_student7 = createStudentAnswer(student7, pa_15_2_1, "Kinetic energy is the energy possessed by an object due to its motion. It is calculated using the formula KE = 0.5 * m * v^2, where m is the mass of the object and v is its velocity.");
        addStudentAnswerToProblemAnswer(pa_15_2_1, sa15_2_1_student7);

        StudentAnswer sa15_2_2_student7 = createStudentAnswer(student7, pa_15_2_2, "Potential energy is the energy stored in an object due to its position or configuration. Gravitational potential energy is calculated using the formula PE = mgh, where m is the mass, g is the acceleration due to gravity, and h is the height above a reference level.");
        addStudentAnswerToProblemAnswer(pa_15_2_2, sa15_2_2_student7);

        StudentAnswer sa15_2_3_student7 = createStudentAnswer(student7, pa_15_2_3, "The work-energy principle states that the work done on an object is equal to the change in its kinetic energy. It is mathematically expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        addStudentAnswerToProblemAnswer(pa_15_2_3, sa15_2_3_student7);

        StudentAnswer sa15_2_4_student7 = createStudentAnswer(student7, pa_15_2_4, "The conservation of energy principle states that energy cannot be created or destroyed, only transferred or transformed from one form to another. The total energy of an isolated system remains constant over time.");
        addStudentAnswerToProblemAnswer(pa_15_2_4, sa15_2_4_student7);

        StudentAnswer sa15_2_5_student7 = createStudentAnswer(student7, pa_15_2_5, "Mechanical energy is the sum of kinetic and potential energy in a system. It is the energy associated with the motion and position of an object. Mechanical energy can be conserved in the absence of non-conservative forces such as friction.");
        addStudentAnswerToProblemAnswer(pa_15_2_5, sa15_2_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa15_2_1_student8 = createStudentAnswer(student8, pa_15_2_1, "Kinetic energy is the energy possessed by an object due to its motion. It is calculated using the formula KE = 0.5 * m * v^2, where m is the mass of the object and v is its velocity.");
        addStudentAnswerToProblemAnswer(pa_15_2_1, sa15_2_1_student8);

        StudentAnswer sa15_2_2_student8 = createStudentAnswer(student8, pa_15_2_2, "Potential energy is the energy stored in an object due to its position or configuration. Gravitational potential energy is calculated using the formula PE = mgh, where m is the mass, g is the acceleration due to gravity, and h is the height above a reference level.");
        addStudentAnswerToProblemAnswer(pa_15_2_2, sa15_2_2_student8);

        StudentAnswer sa15_2_3_student8 = createStudentAnswer(student8, pa_15_2_3, "The work-energy principle states that the work done on an object is equal to the change in its kinetic energy. It is mathematically expressed as W = ΔKE, where W is the work done and ΔKE is the change in kinetic energy.");
        addStudentAnswerToProblemAnswer(pa_15_2_3, sa15_2_3_student8);

        StudentAnswer sa15_2_4_student8 = createStudentAnswer(student8, pa_15_2_4, "The conservation of energy principle states that energy cannot be created or destroyed, only transferred or transformed from one form to another. The total energy of an isolated system remains constant over time.");
        addStudentAnswerToProblemAnswer(pa_15_2_4, sa15_2_4_student8);

        StudentAnswer sa15_2_5_student8 = createStudentAnswer(student8, pa_15_2_5, "Mechanical energy is the sum of kinetic and potential energy in a system. It is the energy associated with the motion and position of an object. Mechanical energy can be conserved in the absence of non-conservative forces such as friction.");
        addStudentAnswerToProblemAnswer(pa_15_2_5, sa15_2_5_student8);


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment15_2.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa15_3_1_student7 = createStudentAnswer(student7, pa_15_3_1, "Linear motion is the movement of an object along a straight path. It is described by parameters such as displacement, velocity, and acceleration.");
        addStudentAnswerToProblemAnswer(pa_15_3_1, sa15_3_1_student7);

        StudentAnswer sa15_3_2_student7 = createStudentAnswer(student7, pa_15_3_2, "Projectile motion is the curved path an object follows when it is thrown or projected near the Earth's surface. It is influenced by gravity and initial velocity, and its motion can be analyzed using the equations of motion.");
        addStudentAnswerToProblemAnswer(pa_15_3_2, sa15_3_2_student7);

        StudentAnswer sa15_3_3_student7 = createStudentAnswer(student7, pa_15_3_3, "Circular motion is the movement of an object along a circular path. It is characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        addStudentAnswerToProblemAnswer(pa_15_3_3, sa15_3_3_student7);

        StudentAnswer sa15_3_4_student7 = createStudentAnswer(student7, pa_15_3_4, "Velocity is a vector quantity that describes the rate of change of an object's displacement with respect to time. It has both magnitude and direction and is measured in meters per second (m/s).");
        addStudentAnswerToProblemAnswer(pa_15_3_4, sa15_3_4_student7);

        StudentAnswer sa15_3_5_student7 = createStudentAnswer(student7, pa_15_3_5, "Acceleration is a vector quantity that describes the rate of change of an object's velocity with respect to time. It is measured in meters per second squared (m/s^2).");
        addStudentAnswerToProblemAnswer(pa_15_3_5, sa15_3_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa15_3_1_student8 = createStudentAnswer(student8, pa_15_3_1, "Linear motion is the movement of an object along a straight path. It is described by parameters such as displacement, velocity, and acceleration.");
        addStudentAnswerToProblemAnswer(pa_15_3_1, sa15_3_1_student8);

        StudentAnswer sa15_3_2_student8 = createStudentAnswer(student8, pa_15_3_2, "Projectile motion is the curved path an object follows when it is thrown or projected near the Earth's surface. It is influenced by gravity and initial velocity, and its motion can be analyzed using the equations of motion.");
        addStudentAnswerToProblemAnswer(pa_15_3_2, sa15_3_2_student8);

        StudentAnswer sa15_3_3_student8 = createStudentAnswer(student8, pa_15_3_3, "Circular motion is the movement of an object along a circular path. It is characterized by parameters such as angular displacement, angular velocity, and centripetal acceleration.");
        addStudentAnswerToProblemAnswer(pa_15_3_3, sa15_3_3_student8);

        StudentAnswer sa15_3_4_student8 = createStudentAnswer(student8, pa_15_3_4, "Velocity is a vector quantity that describes the rate of change of an object's displacement with respect to time. It has both magnitude and direction and is measured in meters per second (m/s).");
        addStudentAnswerToProblemAnswer(pa_15_3_4, sa15_3_4_student8);

        StudentAnswer sa15_3_5_student8 = createStudentAnswer(student8, pa_15_3_5, "Acceleration is a vector quantity that describes the rate of change of an object's velocity with respect to time. It is measured in meters per second squared (m/s^2).");
        addStudentAnswerToProblemAnswer(pa_15_3_5, sa15_3_5_student8);

// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment15_3.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa16_1_1_student7 = createStudentAnswer(student7, pa_16_1_1, "The main subatomic particles in an atom are protons, neutrons, and electrons. Protons and neutrons are located in the nucleus, while electrons orbit the nucleus in electron shells.");
        addStudentAnswerToProblemAnswer(pa_16_1_1, sa16_1_1_student7);

        StudentAnswer sa16_1_2_student7 = createStudentAnswer(student7, pa_16_1_2, "The atomic number is the number of protons in the nucleus of an atom. It defines the element and its position in the periodic table. For example, the atomic number of hydrogen is 1, and the atomic number of carbon is 6.");
        addStudentAnswerToProblemAnswer(pa_16_1_2, sa16_1_2_student7);

        StudentAnswer sa16_1_3_student7 = createStudentAnswer(student7, pa_16_1_3, "The mass number is the total number of protons and neutrons in the nucleus of an atom. It is used to distinguish between different isotopes of an element. For example, carbon-12 has a mass number of 12 (6 protons and 6 neutrons).");
        addStudentAnswerToProblemAnswer(pa_16_1_3, sa16_1_3_student7);

        StudentAnswer sa16_1_4_student7 = createStudentAnswer(student7, pa_16_1_4, "Isotopes are atoms of the same element that have different numbers of neutrons and, therefore, different mass numbers. For example, carbon-12 and carbon-14 are isotopes of carbon.");
        addStudentAnswerToProblemAnswer(pa_16_1_4, sa16_1_4_student7);

        StudentAnswer sa16_1_5_student7 = createStudentAnswer(student7, pa_16_1_5, "Electron configuration is the distribution of electrons in an atom's electron shells. It follows the Aufbau principle, Pauli exclusion principle, and Hund's rule. For example, the electron configuration of carbon is 1s^2 2s^2 2p^2.");
        addStudentAnswerToProblemAnswer(pa_16_1_5, sa16_1_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa16_1_1_student8 = createStudentAnswer(student8, pa_16_1_1, "The main subatomic particles in an atom are protons, neutrons, and electrons. Protons and neutrons are located in the nucleus, while electrons orbit the nucleus in electron shells.");
        addStudentAnswerToProblemAnswer(pa_16_1_1, sa16_1_1_student8);

        StudentAnswer sa16_1_2_student8 = createStudentAnswer(student8, pa_16_1_2, "The atomic number is the number of protons in the nucleus of an atom. It defines the element and its position in the periodic table. For example, the atomic number of hydrogen is 1, and the atomic number of carbon is 6.");
        addStudentAnswerToProblemAnswer(pa_16_1_2, sa16_1_2_student8);

        StudentAnswer sa16_1_3_student8 = createStudentAnswer(student8, pa_16_1_3, "The mass number is the total number of protons and neutrons in the nucleus of an atom. It is used to distinguish between different isotopes of an element. For example, carbon-12 has a mass number of 12 (6 protons and 6 neutrons).");
        addStudentAnswerToProblemAnswer(pa_16_1_3, sa16_1_3_student8);

        StudentAnswer sa16_1_4_student8 = createStudentAnswer(student8, pa_16_1_4, "Isotopes are atoms of the same element that have different numbers of neutrons and, therefore, different mass numbers. For example, carbon-12 and carbon-14 are isotopes of carbon.");
        addStudentAnswerToProblemAnswer(pa_16_1_4, sa16_1_4_student8);

        StudentAnswer sa16_1_5_student8 = createStudentAnswer(student8, pa_16_1_5, "Electron configuration is the distribution of electrons in an atom's electron shells. It follows the Aufbau principle, Pauli exclusion principle, and Hund's rule. For example, the electron configuration of carbon is 1s^2 2s^2 2p^2.");
        addStudentAnswerToProblemAnswer(pa_16_1_5, sa16_1_5_student8);

// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment16_1.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa16_2_1_student7 = createStudentAnswer(student7, pa_16_2_1, "A chemical bond is a force of attraction that holds atoms together in a molecule or compound. It is formed by the sharing or transfer of electrons between atoms.");
        addStudentAnswerToProblemAnswer(pa_16_2_1, sa16_2_1_student7);

        StudentAnswer sa16_2_2_student7 = createStudentAnswer(student7, pa_16_2_2, "An ionic bond is a type of chemical bond formed by the electrostatic attraction between oppositely charged ions. It occurs when one atom donates an electron to another, resulting in the formation of positive and negative ions.");
        addStudentAnswerToProblemAnswer(pa_16_2_2, sa16_2_2_student7);

        StudentAnswer sa16_2_3_student7 = createStudentAnswer(student7, pa_16_2_3, "A covalent bond is a type of chemical bond formed by the sharing of electron pairs between atoms. It occurs when atoms have similar electronegativities and share electrons to achieve a stable electron configuration.");
        addStudentAnswerToProblemAnswer(pa_16_2_3, sa16_2_3_student7);

        StudentAnswer sa16_2_4_student7 = createStudentAnswer(student7, pa_16_2_4, "A metallic bond is a type of chemical bond found in metals. It involves the attraction between positively charged metal ions and the sea of delocalized electrons that move freely throughout the metal lattice.");
        addStudentAnswerToProblemAnswer(pa_16_2_4, sa16_2_4_student7);

        StudentAnswer sa16_2_5_student7 = createStudentAnswer(student7, pa_16_2_5, "Electronegativity is a measure of an atom's ability to attract and hold onto electrons in a chemical bond. It determines the type of bond formed between atoms. For example, fluorine has the highest electronegativity, while francium has the lowest.");
        addStudentAnswerToProblemAnswer(pa_16_2_5, sa16_2_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa16_2_1_student8 = createStudentAnswer(student8, pa_16_2_1, "A chemical bond is a force of attraction that holds atoms together in a molecule or compound. It is formed by the sharing or transfer of electrons between atoms.");
        addStudentAnswerToProblemAnswer(pa_16_2_1, sa16_2_1_student8);

        StudentAnswer sa16_2_2_student8 = createStudentAnswer(student8, pa_16_2_2, "An ionic bond is a type of chemical bond formed by the electrostatic attraction between oppositely charged ions. It occurs when one atom donates an electron to another, resulting in the formation of positive and negative ions.");
        addStudentAnswerToProblemAnswer(pa_16_2_2, sa16_2_2_student8);

        StudentAnswer sa16_2_3_student8 = createStudentAnswer(student8, pa_16_2_3, "A covalent bond is a type of chemical bond formed by the sharing of electron pairs between atoms. It occurs when atoms have similar electronegativities and share electrons to achieve a stable electron configuration.");
        addStudentAnswerToProblemAnswer(pa_16_2_3, sa16_2_3_student8);

        StudentAnswer sa16_2_4_student8 = createStudentAnswer(student8, pa_16_2_4, "A metallic bond is a type of chemical bond found in metals. It involves the attraction between positively charged metal ions and the sea of delocalized electrons that move freely throughout the metal lattice.");
        addStudentAnswerToProblemAnswer(pa_16_2_4, sa16_2_4_student8);

        StudentAnswer sa16_2_5_student8 = createStudentAnswer(student8, pa_16_2_5, "Electronegativity is a measure of an atom's ability to attract and hold onto electrons in a chemical bond. It determines the type of bond formed between atoms. For example, fluorine has the highest electronegativity, while francium has the lowest.");
        addStudentAnswerToProblemAnswer(pa_16_2_5, sa16_2_5_student8);


// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment16_2.");
// Creating StudentAnswer instances for student7
        StudentAnswer sa16_3_1_student7 = createStudentAnswer(student7, pa_16_3_1, "A chemical reaction is a process in which substances (reactants) are transformed into different substances (products) through the breaking and forming of chemical bonds.");
        addStudentAnswerToProblemAnswer(pa_16_3_1, sa16_3_1_student7);

        StudentAnswer sa16_3_2_student7 = createStudentAnswer(student7, pa_16_3_2, "Reactants are the starting substances in a chemical reaction, while products are the substances formed as a result of the reaction. The reactants undergo chemical changes to form the products.");
        addStudentAnswerToProblemAnswer(pa_16_3_2, sa16_3_2_student7);

        StudentAnswer sa16_3_3_student7 = createStudentAnswer(student7, pa_16_3_3, "The law of conservation of mass states that mass is neither created nor destroyed in a chemical reaction. The total mass of the reactants is equal to the total mass of the products.");
        addStudentAnswerToProblemAnswer(pa_16_3_3, sa16_3_3_student7);

        StudentAnswer sa16_3_4_student7 = createStudentAnswer(student7, pa_16_3_4, "Different types of chemical reactions include synthesis (combination), decomposition, single displacement, double displacement, combustion, and redox (oxidation-reduction) reactions.");
        addStudentAnswerToProblemAnswer(pa_16_3_4, sa16_3_4_student7);

        StudentAnswer sa16_3_5_student7 = createStudentAnswer(student7, pa_16_3_5, "A synthesis reaction, also known as a combination reaction, occurs when two or more reactants combine to form a single product. The general form is A + B → AB.");
        addStudentAnswerToProblemAnswer(pa_16_3_5, sa16_3_5_student7);


// Creating StudentAnswer instances for student8
        StudentAnswer sa16_3_1_student8 = createStudentAnswer(student8, pa_16_3_1, "A chemical reaction is a process in which substances (reactants) are transformed into different substances (products) through the breaking and forming of chemical bonds.");
        addStudentAnswerToProblemAnswer(pa_16_3_1, sa16_3_1_student8);

        StudentAnswer sa16_3_2_student8 = createStudentAnswer(student8, pa_16_3_2, "Reactants are the starting substances in a chemical reaction, while products are the substances formed as a result of the reaction. The reactants undergo chemical changes to form the products.");
        addStudentAnswerToProblemAnswer(pa_16_3_2, sa16_3_2_student8);

        StudentAnswer sa16_3_3_student8 = createStudentAnswer(student8, pa_16_3_3, "The law of conservation of mass states that mass is neither created nor destroyed in a chemical reaction. The total mass of the reactants is equal to the total mass of the products.");
        addStudentAnswerToProblemAnswer(pa_16_3_3, sa16_3_3_student8);

        StudentAnswer sa16_3_4_student8 = createStudentAnswer(student8, pa_16_3_4, "Different types of chemical reactions include synthesis (combination), decomposition, single displacement, double displacement, combustion, and redox (oxidation-reduction) reactions.");
        addStudentAnswerToProblemAnswer(pa_16_3_4, sa16_3_4_student8);

        StudentAnswer sa16_3_5_student8 = createStudentAnswer(student8, pa_16_3_5, "A synthesis reaction, also known as a combination reaction, occurs when two or more reactants combine to form a single product. The general form is A + B → AB.");
        addStudentAnswerToProblemAnswer(pa_16_3_5, sa16_3_5_student8);

// Output for confirmation
        System.out.println("Student answers created and added for student7 and student8 for all problem answers in assignment16_3.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa17_1_1_student9 = createStudentAnswer(student9, pa_17_1_1, "The cell membrane is a thin, flexible barrier that surrounds the cell, regulating what enters and exits the cell. It is composed of a lipid bilayer with embedded proteins.");
        addStudentAnswerToProblemAnswer(pa_17_1_1, sa17_1_1_student9);

        StudentAnswer sa17_1_2_student9 = createStudentAnswer(student9, pa_17_1_2, "The nucleus is the control center of the cell, containing the cell's genetic material (DNA). It regulates gene expression and controls cellular activities such as growth, metabolism, and reproduction.");
        addStudentAnswerToProblemAnswer(pa_17_1_2, sa17_1_2_student9);

        StudentAnswer sa17_1_3_student9 = createStudentAnswer(student9, pa_17_1_3, "Organelles are specialized structures within a cell that perform specific functions. Examples include the mitochondria (energy production), endoplasmic reticulum (protein and lipid synthesis), and Golgi apparatus (modifying, sorting, and packaging proteins).");
        addStudentAnswerToProblemAnswer(pa_17_1_3, sa17_1_3_student9);

        StudentAnswer sa17_1_4_student9 = createStudentAnswer(student9, pa_17_1_4, "Prokaryotic cells lack a true nucleus and membrane-bound organelles, while eukaryotic cells have a defined nucleus and various membrane-bound organelles. Prokaryotes include bacteria and archaea, while eukaryotes include plants, animals, fungi, and protists.");
        addStudentAnswerToProblemAnswer(pa_17_1_4, sa17_1_4_student9);

        StudentAnswer sa17_1_5_student9 = createStudentAnswer(student9, pa_17_1_5, "Mitochondria are the powerhouse of the cell, responsible for producing energy through cellular respiration. They convert glucose and oxygen into ATP (adenosine triphosphate), the cell's main energy currency.");
        addStudentAnswerToProblemAnswer(pa_17_1_5, sa17_1_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa17_1_1_student10 = createStudentAnswer(student10, pa_17_1_1, "The cell membrane is a thin, flexible barrier that surrounds the cell, regulating what enters and exits the cell. It is composed of a lipid bilayer with embedded proteins.");
        addStudentAnswerToProblemAnswer(pa_17_1_1, sa17_1_1_student10);

        StudentAnswer sa17_1_2_student10 = createStudentAnswer(student10, pa_17_1_2, "The nucleus is the control center of the cell, containing the cell's genetic material (DNA). It regulates gene expression and controls cellular activities such as growth, metabolism, and reproduction.");
        addStudentAnswerToProblemAnswer(pa_17_1_2, sa17_1_2_student10);

        StudentAnswer sa17_1_3_student10 = createStudentAnswer(student10, pa_17_1_3, "Organelles are specialized structures within a cell that perform specific functions. Examples include the mitochondria (energy production), endoplasmic reticulum (protein and lipid synthesis), and Golgi apparatus (modifying, sorting, and packaging proteins).");
        addStudentAnswerToProblemAnswer(pa_17_1_3, sa17_1_3_student10);

        StudentAnswer sa17_1_4_student10 = createStudentAnswer(student10, pa_17_1_4, "Prokaryotic cells lack a true nucleus and membrane-bound organelles, while eukaryotic cells have a defined nucleus and various membrane-bound organelles. Prokaryotes include bacteria and archaea, while eukaryotes include plants, animals, fungi, and protists.");
        addStudentAnswerToProblemAnswer(pa_17_1_4, sa17_1_4_student10);

        StudentAnswer sa17_1_5_student10 = createStudentAnswer(student10, pa_17_1_5, "Mitochondria are the powerhouse of the cell, responsible for producing energy through cellular respiration. They convert glucose and oxygen into ATP (adenosine triphosphate), the cell's main energy currency.");
        addStudentAnswerToProblemAnswer(pa_17_1_5, sa17_1_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment17_1.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa17_2_1_student9 = createStudentAnswer(student9, pa_17_2_1, "Genetics is the study of heredity and the variation of inherited characteristics. It examines how traits are passed from one generation to the next through genes.");
        addStudentAnswerToProblemAnswer(pa_17_2_1, sa17_2_1_student9);

        StudentAnswer sa17_2_2_student9 = createStudentAnswer(student9, pa_17_2_2, "Mendelian genetics is the study of the principles of inheritance discovered by Gregor Mendel. It includes the laws of segregation and independent assortment, which explain how traits are inherited through dominant and recessive alleles.");
        addStudentAnswerToProblemAnswer(pa_17_2_2, sa17_2_2_student9);

        StudentAnswer sa17_2_3_student9 = createStudentAnswer(student9, pa_17_2_3, "DNA (deoxyribonucleic acid) is the molecule that carries genetic information in living organisms. It is composed of two strands forming a double helix, with each strand made up of nucleotides containing a sugar, a phosphate group, and a nitrogenous base.");
        addStudentAnswerToProblemAnswer(pa_17_2_3, sa17_2_3_student9);

        StudentAnswer sa17_2_4_student9 = createStudentAnswer(student9, pa_17_2_4, "A gene is a segment of DNA that contains the instructions for building a specific protein. It includes coding regions called exons and non-coding regions called introns, as well as regulatory sequences that control gene expression.");
        addStudentAnswerToProblemAnswer(pa_17_2_4, sa17_2_4_student9);

        StudentAnswer sa17_2_5_student9 = createStudentAnswer(student9, pa_17_2_5, "DNA replication is the process by which a cell copies its DNA before cell division. It involves the unwinding of the double helix, the formation of a replication fork, and the synthesis of new DNA strands by DNA polymerase.");
        addStudentAnswerToProblemAnswer(pa_17_2_5, sa17_2_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa17_2_1_student10 = createStudentAnswer(student10, pa_17_2_1, "Genetics is the study of heredity and the variation of inherited characteristics. It examines how traits are passed from one generation to the next through genes.");
        addStudentAnswerToProblemAnswer(pa_17_2_1, sa17_2_1_student10);

        StudentAnswer sa17_2_2_student10 = createStudentAnswer(student10, pa_17_2_2, "Mendelian genetics is the study of the principles of inheritance discovered by Gregor Mendel. It includes the laws of segregation and independent assortment, which explain how traits are inherited through dominant and recessive alleles.");
        addStudentAnswerToProblemAnswer(pa_17_2_2, sa17_2_2_student10);

        StudentAnswer sa17_2_3_student10 = createStudentAnswer(student10, pa_17_2_3, "DNA (deoxyribonucleic acid) is the molecule that carries genetic information in living organisms. It is composed of two strands forming a double helix, with each strand made up of nucleotides containing a sugar, a phosphate group, and a nitrogenous base.");
        addStudentAnswerToProblemAnswer(pa_17_2_3, sa17_2_3_student10);

        StudentAnswer sa17_2_4_student10 = createStudentAnswer(student10, pa_17_2_4, "A gene is a segment of DNA that contains the instructions for building a specific protein. It includes coding regions called exons and non-coding regions called introns, as well as regulatory sequences that control gene expression.");
        addStudentAnswerToProblemAnswer(pa_17_2_4, sa17_2_4_student10);

        StudentAnswer sa17_2_5_student10 = createStudentAnswer(student10, pa_17_2_5, "DNA replication is the process by which a cell copies its DNA before cell division. It involves the unwinding of the double helix, the formation of a replication fork, and the synthesis of new DNA strands by DNA polymerase.");
        addStudentAnswerToProblemAnswer(pa_17_2_5, sa17_2_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment17_2.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa17_3_1_student9 = createStudentAnswer(student9, pa_17_3_1, "The theory of evolution is the scientific explanation for the diversity of life on Earth. It states that all species of organisms have descended from common ancestors through a process of gradual change and natural selection.");
        addStudentAnswerToProblemAnswer(pa_17_3_1, sa17_3_1_student9);

        StudentAnswer sa17_3_2_student9 = createStudentAnswer(student9, pa_17_3_2, "Natural selection is the process by which certain traits become more common in a population because they increase an organism's chances of survival and reproduction. It is a key mechanism of evolution.");
        addStudentAnswerToProblemAnswer(pa_17_3_2, sa17_3_2_student9);

        StudentAnswer sa17_3_3_student9 = createStudentAnswer(student9, pa_17_3_3, "Genetic variation refers to the differences in DNA sequences among individuals within a population. It is the raw material for evolution, as it provides the genetic diversity on which natural selection acts.");
        addStudentAnswerToProblemAnswer(pa_17_3_3, sa17_3_3_student9);

        StudentAnswer sa17_3_4_student9 = createStudentAnswer(student9, pa_17_3_4, "Evidence for evolution comes from various fields, including paleontology (fossil record), comparative anatomy (homologous structures), molecular biology (DNA and protein similarities), biogeography (distribution of species), and embryology (developmental stages).");
        addStudentAnswerToProblemAnswer(pa_17_3_4, sa17_3_4_student9);

        StudentAnswer sa17_3_5_student9 = createStudentAnswer(student9, pa_17_3_5, "The fossil record is the collection of fossils that provides evidence of the history of life on Earth. It shows the progression of life forms over time and supports the idea of common ancestry and evolutionary change.");
        addStudentAnswerToProblemAnswer(pa_17_3_5, sa17_3_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa17_3_1_student10 = createStudentAnswer(student10, pa_17_3_1, "The theory of evolution is the scientific explanation for the diversity of life on Earth. It states that all species of organisms have descended from common ancestors through a process of gradual change and natural selection.");
        addStudentAnswerToProblemAnswer(pa_17_3_1, sa17_3_1_student10);

        StudentAnswer sa17_3_2_student10 = createStudentAnswer(student10, pa_17_3_2, "Natural selection is the process by which certain traits become more common in a population because they increase an organism's chances of survival and reproduction. It is a key mechanism of evolution.");
        addStudentAnswerToProblemAnswer(pa_17_3_2, sa17_3_2_student10);

        StudentAnswer sa17_3_3_student10 = createStudentAnswer(student10, pa_17_3_3, "Genetic variation refers to the differences in DNA sequences among individuals within a population. It is the raw material for evolution, as it provides the genetic diversity on which natural selection acts.");
        addStudentAnswerToProblemAnswer(pa_17_3_3, sa17_3_3_student10);

        StudentAnswer sa17_3_4_student10 = createStudentAnswer(student10, pa_17_3_4, "Evidence for evolution comes from various fields, including paleontology (fossil record), comparative anatomy (homologous structures), molecular biology (DNA and protein similarities), biogeography (distribution of species), and embryology (developmental stages).");
        addStudentAnswerToProblemAnswer(pa_17_3_4, sa17_3_4_student10);

        StudentAnswer sa17_3_5_student10 = createStudentAnswer(student10, pa_17_3_5, "The fossil record is the collection of fossils that provides evidence of the history of life on Earth. It shows the progression of life forms over time and supports the idea of common ancestry and evolutionary change.");
        addStudentAnswerToProblemAnswer(pa_17_3_5, sa17_3_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment17_3.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa17_4_1_student9 = createStudentAnswer(student9, pa_17_4_1, "Ecology is the study of interactions between organisms and their environment. It examines how organisms affect and are affected by their surroundings, including other organisms and physical factors.");
        addStudentAnswerToProblemAnswer(pa_17_4_1, sa17_4_1_student9);

        StudentAnswer sa17_4_2_student9 = createStudentAnswer(student9, pa_17_4_2, "An ecosystem is a community of living organisms (plants, animals, and microbes) interacting with their physical environment (air, water, and soil). It includes both biotic (living) and abiotic (non-living) components.");
        addStudentAnswerToProblemAnswer(pa_17_4_2, sa17_4_2_student9);

        StudentAnswer sa17_4_3_student9 = createStudentAnswer(student9, pa_17_4_3, "A food web is a complex network of interconnected food chains that shows the feeding relationships between organisms in an ecosystem. It illustrates how energy and nutrients flow through different trophic levels.");
        addStudentAnswerToProblemAnswer(pa_17_4_3, sa17_4_3_student9);

        StudentAnswer sa17_4_4_student9 = createStudentAnswer(student9, pa_17_4_4, "Energy flow in an ecosystem refers to the transfer of energy from one trophic level to another, beginning with primary producers (plants) and moving through herbivores, carnivores, and decomposers. Energy is lost at each level through metabolic processes and heat.");
        addStudentAnswerToProblemAnswer(pa_17_4_4, sa17_4_4_student9);

        StudentAnswer sa17_4_5_student9 = createStudentAnswer(student9, pa_17_4_5, "Producers (plants and algae) convert sunlight into chemical energy through photosynthesis. Consumers (herbivores, carnivores, and omnivores) obtain energy by eating other organisms. Decomposers (bacteria and fungi) break down dead organic matter, recycling nutrients back into the ecosystem.");
        addStudentAnswerToProblemAnswer(pa_17_4_5, sa17_4_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa17_4_1_student10 = createStudentAnswer(student10, pa_17_4_1, "Ecology is the study of interactions between organisms and their environment. It examines how organisms affect and are affected by their surroundings, including other organisms and physical factors.");
        addStudentAnswerToProblemAnswer(pa_17_4_1, sa17_4_1_student10);

        StudentAnswer sa17_4_2_student10 = createStudentAnswer(student10, pa_17_4_2, "An ecosystem is a community of living organisms (plants, animals, and microbes) interacting with their physical environment (air, water, and soil). It includes both biotic (living) and abiotic (non-living) components.");
        addStudentAnswerToProblemAnswer(pa_17_4_2, sa17_4_2_student10);

        StudentAnswer sa17_4_3_student10 = createStudentAnswer(student10, pa_17_4_3, "A food web is a complex network of interconnected food chains that shows the feeding relationships between organisms in an ecosystem. It illustrates how energy and nutrients flow through different trophic levels.");
        addStudentAnswerToProblemAnswer(pa_17_4_3, sa17_4_3_student10);

        StudentAnswer sa17_4_4_student10 = createStudentAnswer(student10, pa_17_4_4, "Energy flow in an ecosystem refers to the transfer of energy from one trophic level to another, beginning with primary producers (plants) and moving through herbivores, carnivores, and decomposers. Energy is lost at each level through metabolic processes and heat.");
        addStudentAnswerToProblemAnswer(pa_17_4_4, sa17_4_4_student10);

        StudentAnswer sa17_4_5_student10 = createStudentAnswer(student10, pa_17_4_5, "Producers (plants and algae) convert sunlight into chemical energy through photosynthesis. Consumers (herbivores, carnivores, and omnivores) obtain energy by eating other organisms. Decomposers (bacteria and fungi) break down dead organic matter, recycling nutrients back into the ecosystem.");
        addStudentAnswerToProblemAnswer(pa_17_4_5, sa17_4_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment17_4.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa18_1_1_student9 = createStudentAnswer(student9, pa_18_1_1, "Civil engineering is the discipline that deals with the design, construction, and maintenance of the built environment. This includes infrastructure such as roads, bridges, dams, and buildings.");
        addStudentAnswerToProblemAnswer(pa_18_1_1, sa18_1_1_student9);

        StudentAnswer sa18_1_2_student9 = createStudentAnswer(student9, pa_18_1_2, "Mechanical engineering is the discipline that applies principles of physics and materials science for the design, analysis, manufacturing, and maintenance of mechanical systems. It involves the development of machines and tools.");
        addStudentAnswerToProblemAnswer(pa_18_1_2, sa18_1_2_student9);

        StudentAnswer sa18_1_3_student9 = createStudentAnswer(student9, pa_18_1_3, "Electrical engineering is the discipline that focuses on the study and application of electricity, electronics, and electromagnetism. It includes the design and development of electrical circuits, devices, and systems.");
        addStudentAnswerToProblemAnswer(pa_18_1_3, sa18_1_3_student9);

        StudentAnswer sa18_1_4_student9 = createStudentAnswer(student9, pa_18_1_4, "Chemical engineering is the discipline that combines principles of chemistry, physics, mathematics, and engineering to design and operate processes for producing, transforming, and using chemicals and materials.");
        addStudentAnswerToProblemAnswer(pa_18_1_4, sa18_1_4_student9);

        StudentAnswer sa18_1_5_student9 = createStudentAnswer(student9, pa_18_1_5, "Civil engineers are responsible for planning, designing, and overseeing construction projects. They ensure the safety, sustainability, and efficiency of infrastructure, including roads, bridges, water supply systems, and buildings.");
        addStudentAnswerToProblemAnswer(pa_18_1_5, sa18_1_5_student9);


        // Creating StudentAnswer instances for student10
        StudentAnswer sa18_1_1_student10 = createStudentAnswer(student10, pa_18_1_1, "Civil engineering is the discipline that deals with the design, construction, and maintenance of the built environment. This includes infrastructure such as roads, bridges, dams, and buildings.");
        addStudentAnswerToProblemAnswer(pa_18_1_1, sa18_1_1_student10);

        StudentAnswer sa18_1_2_student10 = createStudentAnswer(student10, pa_18_1_2, "Mechanical engineering is the discipline that applies principles of physics and materials science for the design, analysis, manufacturing, and maintenance of mechanical systems. It involves the development of machines and tools.");
        addStudentAnswerToProblemAnswer(pa_18_1_2, sa18_1_2_student10);

        StudentAnswer sa18_1_3_student10 = createStudentAnswer(student10, pa_18_1_3, "Electrical engineering is the discipline that focuses on the study and application of electricity, electronics, and electromagnetism. It includes the design and development of electrical circuits, devices, and systems.");
        addStudentAnswerToProblemAnswer(pa_18_1_3, sa18_1_3_student10);

        StudentAnswer sa18_1_4_student10 = createStudentAnswer(student10, pa_18_1_4, "Chemical engineering is the discipline that combines principles of chemistry, physics, mathematics, and engineering to design and operate processes for producing, transforming, and using chemicals and materials.");
        addStudentAnswerToProblemAnswer(pa_18_1_4, sa18_1_4_student10);

        StudentAnswer sa18_1_5_student10 = createStudentAnswer(student10, pa_18_1_5, "Civil engineers are responsible for planning, designing, and overseeing construction projects. They ensure the safety, sustainability, and efficiency of infrastructure, including roads, bridges, water supply systems, and buildings.");
        addStudentAnswerToProblemAnswer(pa_18_1_5, sa18_1_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment18_1.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa18_2_1_student9 = createStudentAnswer(student9, pa_18_2_1, "The engineering problem-solving process involves identifying a problem, generating potential solutions, evaluating and selecting the best solution, and implementing and testing the solution. It is a systematic approach to addressing engineering challenges.");
        addStudentAnswerToProblemAnswer(pa_18_2_1, sa18_2_1_student9);

        StudentAnswer sa18_2_2_student9 = createStudentAnswer(student9, pa_18_2_2, "The steps in the engineering problem-solving process include: \n1. Identifying the problem \n2. Defining the problem clearly \n3. Generating possible solutions \n4. Evaluating and selecting the best solution \n5. Implementing the solution \n6. Testing and refining the solution");
        addStudentAnswerToProblemAnswer(pa_18_2_2, sa18_2_2_student9);

        StudentAnswer sa18_2_3_student9 = createStudentAnswer(student9, pa_18_2_3, "Techniques for generating solutions include brainstorming, using creativity tools such as mind maps and TRIZ (theory of inventive problem solving), and applying engineering principles and heuristics.");
        addStudentAnswerToProblemAnswer(pa_18_2_3, sa18_2_3_student9);

        StudentAnswer sa18_2_4_student9 = createStudentAnswer(student9, pa_18_2_4, "Brainstorming is a technique used to generate a large number of ideas in a short amount of time. It encourages open and creative thinking, allowing participants to propose solutions without criticism or evaluation during the session.");
        addStudentAnswerToProblemAnswer(pa_18_2_4, sa18_2_4_student9);

        StudentAnswer sa18_2_5_student9 = createStudentAnswer(student9, pa_18_2_5, "TRIZ is a problem-solving methodology based on the study of patterns in inventive solutions. It provides a systematic approach to identifying and overcoming contradictions in engineering problems and generating innovative solutions.");
        addStudentAnswerToProblemAnswer(pa_18_2_5, sa18_2_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa18_2_1_student10 = createStudentAnswer(student10, pa_18_2_1, "The engineering problem-solving process involves identifying a problem, generating potential solutions, evaluating and selecting the best solution, and implementing and testing the solution. It is a systematic approach to addressing engineering challenges.");
        addStudentAnswerToProblemAnswer(pa_18_2_1, sa18_2_1_student10);

        StudentAnswer sa18_2_2_student10 = createStudentAnswer(student10, pa_18_2_2, "The steps in the engineering problem-solving process include: \n1. Identifying the problem \n2. Defining the problem clearly \n3. Generating possible solutions \n4. Evaluating and selecting the best solution \n5. Implementing the solution \n6. Testing and refining the solution");
        addStudentAnswerToProblemAnswer(pa_18_2_2, sa18_2_2_student10);

        StudentAnswer sa18_2_3_student10 = createStudentAnswer(student10, pa_18_2_3, "Techniques for generating solutions include brainstorming, using creativity tools such as mind maps and TRIZ (theory of inventive problem solving), and applying engineering principles and heuristics.");
        addStudentAnswerToProblemAnswer(pa_18_2_3, sa18_2_3_student10);

        StudentAnswer sa18_2_4_student10 = createStudentAnswer(student10, pa_18_2_4, "Brainstorming is a technique used to generate a large number of ideas in a short amount of time. It encourages open and creative thinking, allowing participants to propose solutions without criticism or evaluation during the session.");
        addStudentAnswerToProblemAnswer(pa_18_2_4, sa18_2_4_student10);

        StudentAnswer sa18_2_5_student10 = createStudentAnswer(student10, pa_18_2_5, "TRIZ is a problem-solving methodology based on the study of patterns in inventive solutions. It provides a systematic approach to identifying and overcoming contradictions in engineering problems and generating innovative solutions.");
        addStudentAnswerToProblemAnswer(pa_18_2_5, sa18_2_5_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment18_2.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa18_3_1_student9 = createStudentAnswer(student9, pa_18_3_1, "The engineering design process is a systematic approach to solving engineering problems. It involves defining the problem, generating ideas, developing solutions, testing and evaluating, and improving the design.");
        addStudentAnswerToProblemAnswer(pa_18_3_1, sa18_3_1_student9);

        StudentAnswer sa18_3_2_student9 = createStudentAnswer(student9, pa_18_3_2, "The stages of the design process include: \n1. Defining the problem \n2. Researching and gathering information \n3. Brainstorming and generating ideas \n4. Developing and prototyping solutions \n5. Testing and evaluating prototypes \n6. Refining and improving the design \n7. Communicating the final solution");
        addStudentAnswerToProblemAnswer(pa_18_3_2, sa18_3_2_student9);

        StudentAnswer sa18_3_3_student9 = createStudentAnswer(student9, pa_18_3_3, "Engineers define requirements by identifying the needs and constraints of the project. This involves understanding the problem, considering the end-users, and establishing criteria for success. Requirements are often documented in a design brief or specification.");
        addStudentAnswerToProblemAnswer(pa_18_3_3, sa18_3_3_student9);

        StudentAnswer sa18_3_4_student9 = createStudentAnswer(student9, pa_18_3_4, "Brainstorming is a creative technique used to generate a wide range of ideas and solutions. It encourages open and free-flowing thinking, allowing participants to build on each other's ideas without judgment or criticism.");
        addStudentAnswerToProblemAnswer(pa_18_3_4, sa18_3_4_student9);

        StudentAnswer sa18_3_5_student9 = createStudentAnswer(student9, pa_18_3_5, "Prototyping involves creating a physical or digital model of a solution to test and evaluate its functionality, design, and usability. Prototypes can range from simple sketches and mock-ups to fully functional models.");
        addStudentAnswerToProblemAnswer(pa_18_3_5, sa18_3_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa18_3_1_student10 = createStudentAnswer(student10, pa_18_3_1, "The engineering design process is a systematic approach to solving engineering problems. It involves defining the problem, generating ideas, developing solutions, testing and evaluating, and improving the design.");
        addStudentAnswerToProblemAnswer(pa_18_3_1, sa18_3_1_student10);

        StudentAnswer sa18_3_2_student10 = createStudentAnswer(student10, pa_18_3_2, "The stages of the design process include: \n1. Defining the problem \n2. Researching and gathering information \n3. Brainstorming and generating ideas \n4. Developing and prototyping solutions \n5. Testing and evaluating prototypes \n6. Refining and improving the design \n7. Communicating the final solution");
        addStudentAnswerToProblemAnswer(pa_18_3_2, sa18_3_2_student10);

        StudentAnswer sa18_3_3_student10 = createStudentAnswer(student10, pa_18_3_3, "Engineers define requirements by identifying the needs and constraints of the project. This involves understanding the problem, considering the end-users, and establishing criteria for success. Requirements are often documented in a design brief or specification.");
        addStudentAnswerToProblemAnswer(pa_18_3_3, sa18_3_3_student10);

        StudentAnswer sa18_3_4_student10 = createStudentAnswer(student10, pa_18_3_4, "Brainstorming is a creative technique used to generate a wide range of ideas and solutions. It encourages open and free-flowing thinking, allowing participants to build on each other's ideas without judgment or criticism.");
        addStudentAnswerToProblemAnswer(pa_18_3_4, sa18_3_4_student10);

        StudentAnswer sa18_3_5_student10 = createStudentAnswer(student10, pa_18_3_5, "Prototyping involves creating a physical or digital model of a solution to test and evaluate its functionality, design, and usability. Prototypes can range from simple sketches and mock-ups to fully functional models.");
        addStudentAnswerToProblemAnswer(pa_18_3_5, sa18_3_5_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment18_3.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa19_1_1_student9 = createStudentAnswer(student9, pa_19_1_1, "Ohm's Law states that the current through a conductor between two points is directly proportional to the voltage across the two points and inversely proportional to the resistance between them. It is mathematically expressed as V = IR, where V is the voltage, I is the current, and R is the resistance.");
        addStudentAnswerToProblemAnswer(pa_19_1_1, sa19_1_1_student9);

        StudentAnswer sa19_1_2_student9 = createStudentAnswer(student9, pa_19_1_2, "Kirchhoff's Current Law (KCL) states that the total current entering a junction in an electrical circuit is equal to the total current leaving the junction. This law is based on the principle of conservation of charge.");
        addStudentAnswerToProblemAnswer(pa_19_1_2, sa19_1_2_student9);

        StudentAnswer sa19_1_3_student9 = createStudentAnswer(student9, pa_19_1_3, "Kirchhoff's Voltage Law (KVL) states that the sum of the electrical potential differences (voltages) around any closed loop or mesh in a circuit is equal to zero. This law is based on the principle of conservation of energy.");
        addStudentAnswerToProblemAnswer(pa_19_1_3, sa19_1_3_student9);

        StudentAnswer sa19_1_4_student9 = createStudentAnswer(student9, pa_19_1_4, "In a series circuit, the total resistance is the sum of the individual resistances. The formula is: R_total = R1 + R2 + R3 + ... + Rn, where R1, R2, R3, ..., Rn are the individual resistances.");
        addStudentAnswerToProblemAnswer(pa_19_1_4, sa19_1_4_student9);

        StudentAnswer sa19_1_5_student9 = createStudentAnswer(student9, pa_19_1_5, "In a parallel circuit, the total resistance is calculated using the formula: 1/R_total = 1/R1 + 1/R2 + 1/R3 + ... + 1/Rn. The reciprocal of the sum of the reciprocals of the individual resistances gives the total resistance.");
        addStudentAnswerToProblemAnswer(pa_19_1_5, sa19_1_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa19_1_1_student10 = createStudentAnswer(student10, pa_19_1_1, "Ohm's Law states that the current through a conductor between two points is directly proportional to the voltage across the two points and inversely proportional to the resistance between them. It is mathematically expressed as V = IR, where V is the voltage, I is the current, and R is the resistance.");
        addStudentAnswerToProblemAnswer(pa_19_1_1, sa19_1_1_student10);

        StudentAnswer sa19_1_2_student10 = createStudentAnswer(student10, pa_19_1_2, "Kirchhoff's Current Law (KCL) states that the total current entering a junction in an electrical circuit is equal to the total current leaving the junction. This law is based on the principle of conservation of charge.");
        addStudentAnswerToProblemAnswer(pa_19_1_2, sa19_1_2_student10);

        StudentAnswer sa19_1_3_student10 = createStudentAnswer(student10, pa_19_1_3, "Kirchhoff's Voltage Law (KVL) states that the sum of the electrical potential differences (voltages) around any closed loop or mesh in a circuit is equal to zero. This law is based on the principle of conservation of energy.");
        addStudentAnswerToProblemAnswer(pa_19_1_3, sa19_1_3_student10);

        StudentAnswer sa19_1_4_student10 = createStudentAnswer(student10, pa_19_1_4, "In a series circuit, the total resistance is the sum of the individual resistances. The formula is: R_total = R1 + R2 + R3 + ... + Rn, where R1, R2, R3, ..., Rn are the individual resistances.");
        addStudentAnswerToProblemAnswer(pa_19_1_4, sa19_1_4_student10);

        StudentAnswer sa19_1_5_student10 = createStudentAnswer(student10, pa_19_1_5, "In a parallel circuit, the total resistance is calculated using the formula: 1/R_total = 1/R1 + 1/R2 + 1/R3 + ... + 1/Rn. The reciprocal of the sum of the reciprocals of the individual resistances gives the total resistance.");
        addStudentAnswerToProblemAnswer(pa_19_1_5, sa19_1_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment19_1.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa19_2_1_student9 = createStudentAnswer(student9, pa_19_2_1, "Signal processing involves the analysis, manipulation, and interpretation of signals. It includes techniques for filtering, transforming, and extracting information from signals in various domains, such as time, frequency, and space.");
        addStudentAnswerToProblemAnswer(pa_19_2_1, sa19_2_1_student9);

        StudentAnswer sa19_2_2_student9 = createStudentAnswer(student9, pa_19_2_2, "A Fourier transform is a mathematical technique used to transform a signal from the time domain to the frequency domain. It decomposes a signal into its constituent frequencies, providing insights into the signal's frequency content.");
        addStudentAnswerToProblemAnswer(pa_19_2_2, sa19_2_2_student9);

        StudentAnswer sa19_2_3_student9 = createStudentAnswer(student9, pa_19_2_3, "Filtering is the process of removing unwanted components from a signal or enhancing certain aspects of a signal. Filters can be designed to pass specific frequency ranges (passbands) while attenuating others (stopbands).");
        addStudentAnswerToProblemAnswer(pa_19_2_3, sa19_2_3_student9);

        StudentAnswer sa19_2_4_student9 = createStudentAnswer(student9, pa_19_2_4, "Common types of filters include low-pass filters, high-pass filters, band-pass filters, and band-stop filters. Each type of filter allows or attenuates different frequency ranges of a signal.");
        addStudentAnswerToProblemAnswer(pa_19_2_4, sa19_2_4_student9);

        StudentAnswer sa19_2_5_student9 = createStudentAnswer(student9, pa_19_2_5, "Digital signal processing (DSP) involves the use of digital techniques to analyze, modify, and synthesize signals. DSP techniques are widely used in communication systems, audio and video processing, radar, and control systems.");
        addStudentAnswerToProblemAnswer(pa_19_2_5, sa19_2_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa19_2_1_student10 = createStudentAnswer(student10, pa_19_2_1, "Signal processing involves the analysis, manipulation, and interpretation of signals. It includes techniques for filtering, transforming, and extracting information from signals in various domains, such as time, frequency, and space.");
        addStudentAnswerToProblemAnswer(pa_19_2_1, sa19_2_1_student10);

        StudentAnswer sa19_2_2_student10 = createStudentAnswer(student10, pa_19_2_2, "A Fourier transform is a mathematical technique used to transform a signal from the time domain to the frequency domain. It decomposes a signal into its constituent frequencies, providing insights into the signal's frequency content.");
        addStudentAnswerToProblemAnswer(pa_19_2_2, sa19_2_2_student10);

        StudentAnswer sa19_2_3_student10 = createStudentAnswer(student10, pa_19_2_3, "Filtering is the process of removing unwanted components from a signal or enhancing certain aspects of a signal. Filters can be designed to pass specific frequency ranges (passbands) while attenuating others (stopbands).");
        addStudentAnswerToProblemAnswer(pa_19_2_3, sa19_2_3_student10);

        StudentAnswer sa19_2_4_student10 = createStudentAnswer(student10, pa_19_2_4, "Common types of filters include low-pass filters, high-pass filters, band-pass filters, and band-stop filters. Each type of filter allows or attenuates different frequency ranges of a signal.");
        addStudentAnswerToProblemAnswer(pa_19_2_4, sa19_2_4_student10);

        StudentAnswer sa19_2_5_student10 = createStudentAnswer(student10, pa_19_2_5, "Digital signal processing (DSP) involves the use of digital techniques to analyze, modify, and synthesize signals. DSP techniques are widely used in communication systems, audio and video processing, radar, and control systems.");
        addStudentAnswerToProblemAnswer(pa_19_2_5, sa19_2_5_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment19_2.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa19_3_1_student9 = createStudentAnswer(student9, pa_19_3_1, "Systems theory is the study of systems and their behavior, including how components of a system interact and how systems function as a whole. It is used to analyze and design complex systems across various disciplines.");
        addStudentAnswerToProblemAnswer(pa_19_3_1, sa19_3_1_student9);

        StudentAnswer sa19_3_2_student9 = createStudentAnswer(student9, pa_19_3_2, "System modeling involves creating abstract representations of systems to understand, analyze, and predict their behavior. Models can be mathematical, graphical, or computational, and they help in designing and optimizing systems.");
        addStudentAnswerToProblemAnswer(pa_19_3_2, sa19_3_2_student9);

        StudentAnswer sa19_3_3_student9 = createStudentAnswer(student9, pa_19_3_3, "Feedback is the process by which a system's output is returned as input to influence its behavior. Positive feedback amplifies changes, while negative feedback stabilizes a system by counteracting changes.");
        addStudentAnswerToProblemAnswer(pa_19_3_3, sa19_3_3_student9);

        StudentAnswer sa19_3_4_student9 = createStudentAnswer(student9, pa_19_3_4, "Control systems are systems designed to regulate and control processes or outputs. They use feedback mechanisms to maintain desired performance, such as temperature control in heating systems or speed control in vehicles.");
        addStudentAnswerToProblemAnswer(pa_19_3_4, sa19_3_4_student9);

        StudentAnswer sa19_3_5_student9 = createStudentAnswer(student9, pa_19_3_5, "Open-loop control is a type of control system that operates without feedback. It follows a predetermined set of instructions, regardless of the output, such as a washing machine's fixed cycle times.");
        addStudentAnswerToProblemAnswer(pa_19_3_5, sa19_3_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa19_3_1_student10 = createStudentAnswer(student10, pa_19_3_1, "Systems theory is the study of systems and their behavior, including how components of a system interact and how systems function as a whole. It is used to analyze and design complex systems across various disciplines.");
        addStudentAnswerToProblemAnswer(pa_19_3_1, sa19_3_1_student10);

        StudentAnswer sa19_3_2_student10 = createStudentAnswer(student10, pa_19_3_2, "System modeling involves creating abstract representations of systems to understand, analyze, and predict their behavior. Models can be mathematical, graphical, or computational, and they help in designing and optimizing systems.");
        addStudentAnswerToProblemAnswer(pa_19_3_2, sa19_3_2_student10);

        StudentAnswer sa19_3_3_student10 = createStudentAnswer(student10, pa_19_3_3, "Feedback is the process by which a system's output is returned as input to influence its behavior. Positive feedback amplifies changes, while negative feedback stabilizes a system by counteracting changes.");
        addStudentAnswerToProblemAnswer(pa_19_3_3, sa19_3_3_student10);

        StudentAnswer sa19_3_4_student10 = createStudentAnswer(student10, pa_19_3_4, "Control systems are systems designed to regulate and control processes or outputs. They use feedback mechanisms to maintain desired performance, such as temperature control in heating systems or speed control in vehicles.");
        addStudentAnswerToProblemAnswer(pa_19_3_4, sa19_3_4_student10);

        StudentAnswer sa19_3_5_student10 = createStudentAnswer(student10, pa_19_3_5, "Open-loop control is a type of control system that operates without feedback. It follows a predetermined set of instructions, regardless of the output, such as a washing machine's fixed cycle times.");
        addStudentAnswerToProblemAnswer(pa_19_3_5, sa19_3_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment19_3.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa20_1_1_student9 = createStudentAnswer(student9, pa_20_1_1, "Statics is the branch of mechanics that deals with bodies at rest and forces in equilibrium. It involves analyzing force systems, calculating moments, and solving problems related to static equilibrium.");
        addStudentAnswerToProblemAnswer(pa_20_1_1, sa20_1_1_student9);

        StudentAnswer sa20_1_2_student9 = createStudentAnswer(student9, pa_20_1_2, "Static equilibrium occurs when the sum of all forces and the sum of all moments acting on a body are zero, resulting in no motion. It is a state where the body is at rest or moving with constant velocity.");
        addStudentAnswerToProblemAnswer(pa_20_1_2, sa20_1_2_student9);

        StudentAnswer sa20_1_3_student9 = createStudentAnswer(student9, pa_20_1_3, "A force system is a collection of forces acting on a body. It includes concurrent, parallel, and non-concurrent force systems. Analyzing these systems helps determine the resultant force and its effect on the body.");
        addStudentAnswerToProblemAnswer(pa_20_1_3, sa20_1_3_student9);

        StudentAnswer sa20_1_4_student9 = createStudentAnswer(student9, pa_20_1_4, "A moment is the measure of the tendency of a force to rotate an object about a point or axis. It is calculated as the product of the force and the perpendicular distance from the point or axis to the line of action of the force.");
        addStudentAnswerToProblemAnswer(pa_20_1_4, sa20_1_4_student9);

        StudentAnswer sa20_1_5_student9 = createStudentAnswer(student9, pa_20_1_5, "The conditions for static equilibrium are: \n1. The sum of all horizontal forces must be zero (ΣFx = 0). \n2. The sum of all vertical forces must be zero (ΣFy = 0). \n3. The sum of all moments about any point must be zero (ΣM = 0).");
        addStudentAnswerToProblemAnswer(pa_20_1_5, sa20_1_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa20_1_1_student10 = createStudentAnswer(student10, pa_20_1_1, "Statics is the branch of mechanics that deals with bodies at rest and forces in equilibrium. It involves analyzing force systems, calculating moments, and solving problems related to static equilibrium.");
        addStudentAnswerToProblemAnswer(pa_20_1_1, sa20_1_1_student10);

        StudentAnswer sa20_1_2_student10 = createStudentAnswer(student10, pa_20_1_2, "Static equilibrium occurs when the sum of all forces and the sum of all moments acting on a body are zero, resulting in no motion. It is a state where the body is at rest or moving with constant velocity.");
        addStudentAnswerToProblemAnswer(pa_20_1_2, sa20_1_2_student10);

        StudentAnswer sa20_1_3_student10 = createStudentAnswer(student10, pa_20_1_3, "A force system is a collection of forces acting on a body. It includes concurrent, parallel, and non-concurrent force systems. Analyzing these systems helps determine the resultant force and its effect on the body.");
        addStudentAnswerToProblemAnswer(pa_20_1_3, sa20_1_3_student10);

        StudentAnswer sa20_1_4_student10 = createStudentAnswer(student10, pa_20_1_4, "A moment is the measure of the tendency of a force to rotate an object about a point or axis. It is calculated as the product of the force and the perpendicular distance from the point or axis to the line of action of the force.");
        addStudentAnswerToProblemAnswer(pa_20_1_4, sa20_1_4_student10);

        StudentAnswer sa20_1_5_student10 = createStudentAnswer(student10, pa_20_1_5, "The conditions for static equilibrium are: \n1. The sum of all horizontal forces must be zero (ΣFx = 0). \n2. The sum of all vertical forces must be zero (ΣFy = 0). \n3. The sum of all moments about any point must be zero (ΣM = 0).");
        addStudentAnswerToProblemAnswer(pa_20_1_5, sa20_1_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment20_1.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa20_2_1_student9 = createStudentAnswer(student9, pa_20_2_1, "Dynamics is the branch of mechanics that deals with bodies in motion. It involves studying the kinematics and kinetics of particles and rigid bodies, and analyzing their motion under the influence of forces.");
        addStudentAnswerToProblemAnswer(pa_20_2_1, sa20_2_1_student9);

        StudentAnswer sa20_2_2_student9 = createStudentAnswer(student9, pa_20_2_2, "Kinematics is the study of the motion of objects without considering the forces that cause the motion. It involves analyzing displacement, velocity, and acceleration of particles and rigid bodies.");
        addStudentAnswerToProblemAnswer(pa_20_2_2, sa20_2_2_student9);

        StudentAnswer sa20_2_3_student9 = createStudentAnswer(student9, pa_20_2_3, "Kinetics is the study of the motion of objects by considering the forces that cause the motion. It involves analyzing the relationship between forces, mass, and acceleration using Newton's laws of motion.");
        addStudentAnswerToProblemAnswer(pa_20_2_3, sa20_2_3_student9);

        StudentAnswer sa20_2_4_student9 = createStudentAnswer(student9, pa_20_2_4, "Newton's laws of motion are three fundamental principles that describe the relationship between the motion of an object and the forces acting on it. They include:\n1. Newton's First Law (Law of Inertia) - An object at rest stays at rest, and an object in motion stays in motion unless acted upon by an external force.\n2. Newton's Second Law (Law of Acceleration) - The acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass (F = ma).\n3. Newton's Third Law (Law of Action and Reaction) - For every action, there is an equal and opposite reaction.");
        addStudentAnswerToProblemAnswer(pa_20_2_4, sa20_2_4_student9);

        StudentAnswer sa20_2_5_student9 = createStudentAnswer(student9, pa_20_2_5, "Projectile motion is the curved path an object follows when it is thrown or projected near the Earth's surface. It is influenced by gravity and initial velocity, and its motion can be analyzed using the equations of motion.");
        addStudentAnswerToProblemAnswer(pa_20_2_5, sa20_2_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa20_2_1_student10 = createStudentAnswer(student10, pa_20_2_1, "Dynamics is the branch of mechanics that deals with bodies in motion. It involves studying the kinematics and kinetics of particles and rigid bodies, and analyzing their motion under the influence of forces.");
        addStudentAnswerToProblemAnswer(pa_20_2_1, sa20_2_1_student10);

        StudentAnswer sa20_2_2_student10 = createStudentAnswer(student10, pa_20_2_2, "Kinematics is the study of the motion of objects without considering the forces that cause the motion. It involves analyzing displacement, velocity, and acceleration of particles and rigid bodies.");
        addStudentAnswerToProblemAnswer(pa_20_2_2, sa20_2_2_student10);

        StudentAnswer sa20_2_3_student10 = createStudentAnswer(student10, pa_20_2_3, "Kinetics is the study of the motion of objects by considering the forces that cause the motion. It involves analyzing the relationship between forces, mass, and acceleration using Newton's laws of motion.");
        addStudentAnswerToProblemAnswer(pa_20_2_3, sa20_2_3_student10);

        StudentAnswer sa20_2_4_student10 = createStudentAnswer(student10, pa_20_2_4, "Newton's laws of motion are three fundamental principles that describe the relationship between the motion of an object and the forces acting on it. They include:\n1. Newton's First Law (Law of Inertia) - An object at rest stays at rest, and an object in motion stays in motion unless acted upon by an external force.\n2. Newton's Second Law (Law of Acceleration) - The acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass (F = ma).\n3. Newton's Third Law (Law of Action and Reaction) - For every action, there is an equal and opposite reaction.");
        addStudentAnswerToProblemAnswer(pa_20_2_4, sa20_2_4_student10);

        StudentAnswer sa20_2_5_student10 = createStudentAnswer(student10, pa_20_2_5, "Projectile motion is the curved path an object follows when it is thrown or projected near the Earth's surface. It is influenced by gravity and initial velocity, and its motion can be analyzed using the equations of motion.");
        addStudentAnswerToProblemAnswer(pa_20_2_5, sa20_2_5_student10);


// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers");
// Creating StudentAnswer instances for student9
        StudentAnswer sa20_3_1_student9 = createStudentAnswer(student9, pa_20_3_1, "Thermodynamics is the branch of physics that deals with the study of energy transfer, heat, and work. It involves analyzing the behavior of gases and liquids, and understanding the principles governing energy transformations.");
        addStudentAnswerToProblemAnswer(pa_20_3_1, sa20_3_1_student9);

        StudentAnswer sa20_3_2_student9 = createStudentAnswer(student9, pa_20_3_2, "The laws of thermodynamics are fundamental principles that describe how energy is transferred and transformed:\n1. The First Law (Law of Energy Conservation) - Energy cannot be created or destroyed, only transferred or transformed.\n2. The Second Law - The total entropy of an isolated system always increases over time, and energy transformations are not 100% efficient.\n3. The Third Law - As the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value.");
        addStudentAnswerToProblemAnswer(pa_20_3_2, sa20_3_2_student9);

        StudentAnswer sa20_3_3_student9 = createStudentAnswer(student9, pa_20_3_3, "The First Law of Thermodynamics, also known as the Law of Energy Conservation, states that energy cannot be created or destroyed, only transferred or transformed. It is mathematically expressed as ΔU = Q - W, where ΔU is the change in internal energy, Q is the heat added to the system, and W is the work done by the system.");
        addStudentAnswerToProblemAnswer(pa_20_3_3, sa20_3_3_student9);

        StudentAnswer sa20_3_4_student9 = createStudentAnswer(student9, pa_20_3_4, "The Second Law of Thermodynamics states that the total entropy of an isolated system always increases over time. It implies that energy transformations are not 100% efficient and that some energy is always lost as waste heat.");
        addStudentAnswerToProblemAnswer(pa_20_3_4, sa20_3_4_student9);

        StudentAnswer sa20_3_5_student9 = createStudentAnswer(student9, pa_20_3_5, "The Third Law of Thermodynamics states that as the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value. It implies that it is impossible to reach absolute zero through any finite number of processes.");
        addStudentAnswerToProblemAnswer(pa_20_3_5, sa20_3_5_student9);


        // Creating StudentAnswer instances for student10
        StudentAnswer sa20_3_1_student10 = createStudentAnswer(student10, pa_20_3_1, "Thermodynamics is the branch of physics that deals with the study of energy transfer, heat, and work. It involves analyzing the behavior of gases and liquids, and understanding the principles governing energy transformations.");
        addStudentAnswerToProblemAnswer(pa_20_3_1, sa20_3_1_student10);

        StudentAnswer sa20_3_2_student10 = createStudentAnswer(student10, pa_20_3_2, "The laws of thermodynamics are fundamental principles that describe how energy is transferred and transformed:\n1. The First Law (Law of Energy Conservation) - Energy cannot be created or destroyed, only transferred or transformed.\n2. The Second Law - The total entropy of an isolated system always increases over time, and energy transformations are not 100% efficient.\n3. The Third Law - As the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value.");
        addStudentAnswerToProblemAnswer(pa_20_3_2, sa20_3_2_student10);

        StudentAnswer sa20_3_3_student10 = createStudentAnswer(student10, pa_20_3_3, "The First Law of Thermodynamics, also known as the Law of Energy Conservation, states that energy cannot be created or destroyed, only transferred or transformed. It is mathematically expressed as ΔU = Q - W, where ΔU is the change in internal energy, Q is the heat added to the system, and W is the work done by the system.");
        addStudentAnswerToProblemAnswer(pa_20_3_3, sa20_3_3_student10);

        StudentAnswer sa20_3_4_student10 = createStudentAnswer(student10, pa_20_3_4, "The Second Law of Thermodynamics states that the total entropy of an isolated system always increases over time. It implies that energy transformations are not 100% efficient and that some energy is always lost as waste heat.");
        addStudentAnswerToProblemAnswer(pa_20_3_4, sa20_3_4_student10);

        StudentAnswer sa20_3_5_student10 = createStudentAnswer(student10, pa_20_3_5, "The Third Law of Thermodynamics states that as the temperature of a system approaches absolute zero, the entropy of the system approaches a minimum value. It implies that it is impossible to reach absolute zero through any finite number of processes.");
        addStudentAnswerToProblemAnswer(pa_20_3_5, sa20_3_5_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment20_3.");
// Creating StudentAnswer instances for student9
        StudentAnswer sa20_4_1_student9 = createStudentAnswer(student9, pa_20_4_1, "Material science is the study of the properties and behavior of materials. It involves understanding the structure, processing, and performance of different materials, including metals, ceramics, polymers, and composites.");
        addStudentAnswerToProblemAnswer(pa_20_4_1, sa20_4_1_student9);

        StudentAnswer sa20_4_2_student9 = createStudentAnswer(student9, pa_20_4_2, "Metals are materials that are typically hard, shiny, malleable, and conductive. They are used in a wide range of applications, including construction, transportation, electronics, and manufacturing. Examples include iron, aluminum, and copper.");
        addStudentAnswerToProblemAnswer(pa_20_4_2, sa20_4_2_student9);

        StudentAnswer sa20_4_3_student9 = createStudentAnswer(student9, pa_20_4_3, "Ceramics are non-metallic, inorganic materials that are typically hard and brittle. They have high melting points and are used in applications such as pottery, glass, and advanced engineering materials. Examples include clay, porcelain, and silicon carbide.");
        addStudentAnswerToProblemAnswer(pa_20_4_3, sa20_4_3_student9);

        StudentAnswer sa20_4_4_student9 = createStudentAnswer(student9, pa_20_4_4, "Polymers are large molecules made up of repeating units called monomers. They have diverse properties and applications, ranging from plastics and rubber to textiles and biomedical devices. Examples include polyethylene, polystyrene, and DNA.");
        addStudentAnswerToProblemAnswer(pa_20_4_4, sa20_4_4_student9);

        StudentAnswer sa20_4_5_student9 = createStudentAnswer(student9, pa_20_4_5, "Composites are materials made from two or more constituent materials with different properties. They combine the advantages of the individual materials to create a new material with enhanced performance. Examples include fiberglass, carbon fiber, and concrete.");
        addStudentAnswerToProblemAnswer(pa_20_4_5, sa20_4_5_student9);


// Creating StudentAnswer instances for student10
        StudentAnswer sa20_4_1_student10 = createStudentAnswer(student10, pa_20_4_1, "Material science is the study of the properties and behavior of materials. It involves understanding the structure, processing, and performance of different materials, including metals, ceramics, polymers, and composites.");
        addStudentAnswerToProblemAnswer(pa_20_4_1, sa20_4_1_student10);

        StudentAnswer sa20_4_2_student10 = createStudentAnswer(student10, pa_20_4_2, "Metals are materials that are typically hard, shiny, malleable, and conductive. They are used in a wide range of applications, including construction, transportation, electronics, and manufacturing. Examples include iron, aluminum, and copper.");
        addStudentAnswerToProblemAnswer(pa_20_4_2, sa20_4_2_student10);

        StudentAnswer sa20_4_3_student10 = createStudentAnswer(student10, pa_20_4_3, "Ceramics are non-metallic, inorganic materials that are typically hard and brittle. They have high melting points and are used in applications such as pottery, glass, and advanced engineering materials. Examples include clay, porcelain, and silicon carbide.");
        addStudentAnswerToProblemAnswer(pa_20_4_3, sa20_4_3_student10);

        StudentAnswer sa20_4_4_student10 = createStudentAnswer(student10, pa_20_4_4, "Polymers are large molecules made up of repeating units called monomers. They have diverse properties and applications, ranging from plastics and rubber to textiles and biomedical devices. Examples include polyethylene, polystyrene, and DNA.");
        addStudentAnswerToProblemAnswer(pa_20_4_4, sa20_4_4_student10);

        StudentAnswer sa20_4_5_student10 = createStudentAnswer(student10, pa_20_4_5, "Composites are materials made from two or more constituent materials with different properties. They combine the advantages of the individual materials to create a new material with enhanced performance. Examples include fiberglass, carbon fiber, and concrete.");
        addStudentAnswerToProblemAnswer(pa_20_4_5, sa20_4_5_student10);

// Output for confirmation
        System.out.println("Student answers created and added for student9 and student10 for all problem answers in assignment20_4.");
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
// Creating submission for student5 with student answers for 9_1
        Submission submission9_1_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9_1_1_student5, sa9_1_2_student5, sa9_1_3_student5, sa9_1_4_student5, sa9_1_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission9_1_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_1_5);
        }

// Creating submission for student6 with student answers for 9_1
        Submission submission9_1_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9_1_1_student6, sa9_1_2_student6, sa9_1_3_student6, sa9_1_4_student6, sa9_1_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission9_1_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_1_6);
        }
// Creating submission for student5 with student answers for 9_2
        Submission submission9_2_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9_2_1_student5, sa9_2_2_student5, sa9_2_3_student5, sa9_2_4_student5, sa9_2_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission9_2_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_2_5);
        }

// Creating submission for student6 with student answers for 9_2
        Submission submission9_2_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9_2_1_student6, sa9_2_2_student6, sa9_2_3_student6, sa9_2_4_student6, sa9_2_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission9_2_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_2_6);
        }
// Creating submission for student5 with student answers for 9_3
        Submission submission9_3_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa9_3_1_student5, sa9_3_2_student5, sa9_3_3_student5, sa9_3_4_student5, sa9_3_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission9_3_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_3_5);
        }

// Creating submission for student6 with student answers for 9_3
        Submission submission9_3_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa9_3_1_student6, sa9_3_2_student6, sa9_3_3_student6, sa9_3_4_student6, sa9_3_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission9_3_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission9_3_6);
        }
// Creating submission for student5 with student answers for 10_1
        Submission submission10_1_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10_1_1_student5, sa10_1_2_student5, sa10_1_3_student5, sa10_1_4_student5, sa10_1_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10_1_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_1_5);
        }

// Creating submission for student6 with student answers for 10_1
        Submission submission10_1_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10_1_1_student6, sa10_1_2_student6, sa10_1_3_student6, sa10_1_4_student6, sa10_1_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10_1_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_1_6);
        }
// Creating submission for student5 with student answers for 10_2
        Submission submission10_2_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10_2_1_student5, sa10_2_2_student5, sa10_2_3_student5, sa10_2_4_student5, sa10_2_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10_2_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_2_5);
        }

// Creating submission for student6 with student answers for 10_2
        Submission submission10_2_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10_2_1_student6, sa10_2_2_student6, sa10_2_3_student6, sa10_2_4_student6, sa10_2_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10_2_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_2_6);
        }
// Creating submission for student5 with student answers for 10_3
        Submission submission10_3_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10_3_1_student5, sa10_3_2_student5, sa10_3_3_student5, sa10_3_4_student5, sa10_3_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10_3_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_3_5);
        }

// Creating submission for student6 with student answers for 10_3
        Submission submission10_3_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10_3_1_student6, sa10_3_2_student6, sa10_3_3_student6, sa10_3_4_student6, sa10_3_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10_3_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_3_6);
        }
// Creating submission for student5 with student answers for 10_4
        Submission submission10_4_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa10_4_1_student5, sa10_4_2_student5, sa10_4_3_student5, sa10_4_4_student5, sa10_4_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission10_4_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_4_5);
        }

// Creating submission for student6 with student answers for 10_4
        Submission submission10_4_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa10_4_1_student6, sa10_4_2_student6, sa10_4_3_student6, sa10_4_4_student6, sa10_4_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission10_4_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission10_4_6);
        }
// Creating submission for student5 with student answers for 11_1
        Submission submission11_1_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11_1_1_student5, sa11_1_2_student5, sa11_1_3_student5, sa11_1_4_student5, sa11_1_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11_1_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_1_5);
        }

// Creating submission for student6 with student answers for 11_1
        Submission submission11_1_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11_1_1_student6, sa11_1_2_student6, sa11_1_3_student6, sa11_1_4_student6, sa11_1_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11_1_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_1_6);
        }
// Creating submission for student5 with student answers for 11_2
        Submission submission11_2_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11_2_1_student5, sa11_2_2_student5, sa11_2_3_student5, sa11_2_4_student5, sa11_2_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11_2_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_2_5);
        }

// Creating submission for student6 with student answers for 11_2
        Submission submission11_2_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11_2_1_student6, sa11_2_2_student6, sa11_2_3_student6, sa11_2_4_student6, sa11_2_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11_2_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_2_6);
        }
// Creating submission for student5 with student answers for 11_3
        Submission submission11_3_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11_3_1_student5, sa11_3_2_student5, sa11_3_3_student5, sa11_3_4_student5, sa11_3_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11_3_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_3_5);
        }

// Creating submission for student6 with student answers for 11_3
        Submission submission11_3_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11_3_1_student6, sa11_3_2_student6, sa11_3_3_student6, sa11_3_4_student6, sa11_3_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11_3_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_3_6);
        }
// Creating submission for student5 with student answers for 11_4
        Submission submission11_4_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa11_4_1_student5, sa11_4_2_student5, sa11_4_3_student5, sa11_4_4_student5, sa11_4_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission11_4_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_4_5);
        }

// Creating submission for student6 with student answers for 11_4
        Submission submission11_4_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa11_4_1_student6, sa11_4_2_student6, sa11_4_3_student6, sa11_4_4_student6, sa11_4_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission11_4_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission11_4_6);
        }
// Creating submission for student5 with student answers for 12_1
        Submission submission12_1_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12_1_1_student5, sa12_1_2_student5, sa12_1_3_student5, sa12_1_4_student5, sa12_1_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12_1_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_1_5);
        }

// Creating submission for student6 with student answers for 12_1
        Submission submission12_1_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12_1_1_student6, sa12_1_2_student6, sa12_1_3_student6, sa12_1_4_student6, sa12_1_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12_1_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_1_6);
        }
// Creating submission for student5 with student answers for 12_2
        Submission submission12_2_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12_2_1_student5, sa12_2_2_student5, sa12_2_3_student5, sa12_2_4_student5, sa12_2_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12_2_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_2_5);
        }

// Creating submission for student6 with student answers for 12_2
        Submission submission12_2_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12_2_1_student6, sa12_2_2_student6, sa12_2_3_student6, sa12_2_4_student6, sa12_2_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12_2_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_2_6);
        }
// Creating submission for student5 with student answers for 12_3
        Submission submission12_3_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12_3_1_student5, sa12_3_2_student5, sa12_3_3_student5, sa12_3_4_student5, sa12_3_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12_3_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_3_5);
        }

// Creating submission for student6 with student answers for 12_3
        Submission submission12_3_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12_3_1_student6, sa12_3_2_student6, sa12_3_3_student6, sa12_3_4_student6, sa12_3_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12_3_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_3_6);
        }
// Creating submission for student5 with student answers for 12_4
        Submission submission12_4_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12_4_1_student5, sa12_4_2_student5, sa12_4_3_student5, sa12_4_4_student5, sa12_4_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12_4_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_4_5);
        }

// Creating submission for student6 with student answers for 12_4
        Submission submission12_4_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12_4_1_student6, sa12_4_2_student6, sa12_4_3_student6, sa12_4_4_student6, sa12_4_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12_4_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_4_6);
        }
// Creating submission for student5 with student answers for 12_5
        Submission submission12_5_5 = createSubmission("Submission from student5", student5, Arrays.asList(
                sa12_5_1_student5, sa12_5_2_student5, sa12_5_3_student5, sa12_5_4_student5, sa12_5_5_student5
        ));

// Adding the submission to each student answer for student5
        for (StudentAnswer studentAnswer : submission12_5_5.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_5_5);
        }

// Creating submission for student6 with student answers for 12_5
        Submission submission12_5_6 = createSubmission("Submission from student6", student6, Arrays.asList(
                sa12_5_1_student6, sa12_5_2_student6, sa12_5_3_student6, sa12_5_4_student6, sa12_5_5_student6
        ));

// Adding the submission to each student answer for student6
        for (StudentAnswer studentAnswer : submission12_5_6.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission12_5_6);
        }
// Creating submission for student7 with student answers for 13_1
        Submission submission13_1_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13_1_1_student7, sa13_1_2_student7, sa13_1_3_student7, sa13_1_4_student7, sa13_1_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13_1_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_1_7);
        }

// Creating submission for student8 with student answers for 13_1
        Submission submission13_1_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13_1_1_student8, sa13_1_2_student8, sa13_1_3_student8, sa13_1_4_student8, sa13_1_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13_1_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_1_8);
        }
// Creating submission for student7 with student answers for 13_2
        Submission submission13_2_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13_2_1_student7, sa13_2_2_student7, sa13_2_3_student7, sa13_2_4_student7, sa13_2_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13_2_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_2_7);
        }

// Creating submission for student8 with student answers for 13_2
        Submission submission13_2_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13_2_1_student8, sa13_2_2_student8, sa13_2_3_student8, sa13_2_4_student8, sa13_2_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13_2_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_2_8);
        }
// Creating submission for student7 with student answers for 13_3
        Submission submission13_3_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13_3_1_student7, sa13_3_2_student7, sa13_3_3_student7, sa13_3_4_student7, sa13_3_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13_3_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_3_7);
        }

// Creating submission for student8 with student answers for 13_3
        Submission submission13_3_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13_3_1_student8, sa13_3_2_student8, sa13_3_3_student8, sa13_3_4_student8, sa13_3_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13_3_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_3_8);
        }
// Creating submission for student7 with student answers for 13_4
        Submission submission13_4_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa13_4_1_student7, sa13_4_2_student7, sa13_4_3_student7, sa13_4_4_student7, sa13_4_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission13_4_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_4_7);
        }

// Creating submission for student8 with student answers for 13_4
        Submission submission13_4_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa13_4_1_student8, sa13_4_2_student8, sa13_4_3_student8, sa13_4_4_student8, sa13_4_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission13_4_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission13_4_8);
        }
// Creating submission for student7 with student answers for 14_1
        Submission submission14_1_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14_1_1_student7, sa14_1_2_student7, sa14_1_3_student7, sa14_1_4_student7, sa14_1_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14_1_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_1_7);
        }

// Creating submission for student8 with student answers for 14_1
        Submission submission14_1_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14_1_1_student8, sa14_1_2_student8, sa14_1_3_student8, sa14_1_4_student8, sa14_1_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14_1_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_1_8);
        }
// Creating submission for student7 with student answers for 14_2
        Submission submission14_2_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14_2_1_student7, sa14_2_2_student7, sa14_2_3_student7, sa14_2_4_student7, sa14_2_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14_2_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_2_7);
        }

// Creating submission for student8 with student answers for 14_2
        Submission submission14_2_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14_2_1_student8, sa14_2_2_student8, sa14_2_3_student8, sa14_2_4_student8, sa14_2_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14_2_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_2_8);
        }
// Creating submission for student7 with student answers for 14_3
        Submission submission14_3_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14_3_1_student7, sa14_3_2_student7, sa14_3_3_student7, sa14_3_4_student7, sa14_3_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14_3_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_3_7);
        }

// Creating submission for student8 with student answers for 14_3
        Submission submission14_3_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14_3_1_student8, sa14_3_2_student8, sa14_3_3_student8, sa14_3_4_student8, sa14_3_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14_3_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_3_8);
        }
// Creating submission for student7 with student answers for 14_4
        Submission submission14_4_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa14_4_1_student7, sa14_4_2_student7, sa14_4_3_student7, sa14_4_4_student7, sa14_4_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission14_4_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_4_7);
        }

// Creating submission for student8 with student answers for 14_4
        Submission submission14_4_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa14_4_1_student8, sa14_4_2_student8, sa14_4_3_student8, sa14_4_4_student8, sa14_4_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission14_4_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission14_4_8);
        }
// Creating submission for student7 with student answers for 15_1
        Submission submission15_1_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15_1_1_student7, sa15_1_2_student7, sa15_1_3_student7, sa15_1_4_student7, sa15_1_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15_1_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_1_7);
        }

// Creating submission for student8 with student answers for 15_1
        Submission submission15_1_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15_1_1_student8, sa15_1_2_student8, sa15_1_3_student8, sa15_1_4_student8, sa15_1_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15_1_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_1_8);
        }
// Creating submission for student7 with student answers for 15_2
        Submission submission15_2_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15_2_1_student7, sa15_2_2_student7, sa15_2_3_student7, sa15_2_4_student7, sa15_2_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15_2_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_2_7);
        }

// Creating submission for student8 with student answers for 15_2
        Submission submission15_2_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15_2_1_student8, sa15_2_2_student8, sa15_2_3_student8, sa15_2_4_student8, sa15_2_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15_2_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_2_8);
        }
// Creating submission for student7 with student answers for 15_3
        Submission submission15_3_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa15_3_1_student7, sa15_3_2_student7, sa15_3_3_student7, sa15_3_4_student7, sa15_3_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission15_3_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_3_7);
        }

// Creating submission for student8 with student answers for 15_3
        Submission submission15_3_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa15_3_1_student8, sa15_3_2_student8, sa15_3_3_student8, sa15_3_4_student8, sa15_3_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission15_3_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission15_3_8);
        }
        // Creating submission for student7 with student answers for 16_1
        Submission submission16_1_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16_1_1_student7, sa16_1_2_student7, sa16_1_3_student7, sa16_1_4_student7, sa16_1_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16_1_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_1_7);
        }

// Creating submission for student8 with student answers for 16_1
        Submission submission16_1_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16_1_1_student8, sa16_1_2_student8, sa16_1_3_student8, sa16_1_4_student8, sa16_1_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16_1_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_1_8);
        }

// Creating submission for student7 with student answers for 16_2
        Submission submission16_2_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16_2_1_student7, sa16_2_2_student7, sa16_2_3_student7, sa16_2_4_student7, sa16_2_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16_2_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_2_7);
        }

// Creating submission for student8 with student answers for 16_2
        Submission submission16_2_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16_2_1_student8, sa16_2_2_student8, sa16_2_3_student8, sa16_2_4_student8, sa16_2_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16_2_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_2_8);
        }
// Creating submission for student7 with student answers for 16_3
        Submission submission16_3_7 = createSubmission("Submission from student7", student7, Arrays.asList(
                sa16_3_1_student7, sa16_3_2_student7, sa16_3_3_student7, sa16_3_4_student7, sa16_3_5_student7
        ));

// Adding the submission to each student answer for student7
        for (StudentAnswer studentAnswer : submission16_3_7.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_3_7);
        }

// Creating submission for student8 with student answers for 16_3
        Submission submission16_3_8 = createSubmission("Submission from student8", student8, Arrays.asList(
                sa16_3_1_student8, sa16_3_2_student8, sa16_3_3_student8, sa16_3_4_student8, sa16_3_5_student8
        ));

// Adding the submission to each student answer for student8
        for (StudentAnswer studentAnswer : submission16_3_8.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission16_3_8);
        }
// Creating submission for student9 with student answers for 17_1
        Submission submission17_1_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17_1_1_student9, sa17_1_2_student9, sa17_1_3_student9, sa17_1_4_student9, sa17_1_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17_1_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_1_9);
        }

// Creating submission for student10 with student answers for 17_1
        Submission submission17_1_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17_1_1_student10, sa17_1_2_student10, sa17_1_3_student10, sa17_1_4_student10, sa17_1_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17_1_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_1_10);
        }
// Creating submission for student9 with student answers for 17_2
        Submission submission17_2_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17_2_1_student9, sa17_2_2_student9, sa17_2_3_student9, sa17_2_4_student9, sa17_2_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17_2_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_2_9);
        }

// Creating submission for student10 with student answers for 17_2
        Submission submission17_2_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17_2_1_student10, sa17_2_2_student10, sa17_2_3_student10, sa17_2_4_student10, sa17_2_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17_2_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_2_10);
        }
// Creating submission for student9 with student answers for 17_3
        Submission submission17_3_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17_3_1_student9, sa17_3_2_student9, sa17_3_3_student9, sa17_3_4_student9, sa17_3_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17_3_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_3_9);
        }

// Creating submission for student10 with student answers for 17_3
        Submission submission17_3_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17_3_1_student10, sa17_3_2_student10, sa17_3_3_student10, sa17_3_4_student10, sa17_3_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17_3_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_3_10);
        }
// Creating submission for student9 with student answers for 17_4
        Submission submission17_4_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa17_4_1_student9, sa17_4_2_student9, sa17_4_3_student9, sa17_4_4_student9, sa17_4_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission17_4_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_4_9);
        }

// Creating submission for student10 with student answers for 17_4
        Submission submission17_4_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa17_4_1_student10, sa17_4_2_student10, sa17_4_3_student10, sa17_4_4_student10, sa17_4_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission17_4_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission17_4_10);
        }
// Creating submission for student9 with student answers for 18_1
        Submission submission18_1_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18_1_1_student9, sa18_1_2_student9, sa18_1_3_student9, sa18_1_4_student9, sa18_1_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18_1_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_1_9);
        }

// Creating submission for student10 with student answers for 18_1
        Submission submission18_1_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18_1_1_student10, sa18_1_2_student10, sa18_1_3_student10, sa18_1_4_student10, sa18_1_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18_1_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_1_10);
        }
// Creating submission for student9 with student answers for 18_2
        Submission submission18_2_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18_2_1_student9, sa18_2_2_student9, sa18_2_3_student9, sa18_2_4_student9, sa18_2_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18_2_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_2_9);
        }

// Creating submission for student10 with student answers for 18_2
        Submission submission18_2_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18_2_1_student10, sa18_2_2_student10, sa18_2_3_student10, sa18_2_4_student10, sa18_2_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18_2_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_2_10);
        }
// Creating submission for student9 with student answers for 18_3
        Submission submission18_3_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa18_3_1_student9, sa18_3_2_student9, sa18_3_3_student9, sa18_3_4_student9, sa18_3_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission18_3_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_3_9);
        }

// Creating submission for student10 with student answers for 18_3
        Submission submission18_3_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa18_3_1_student10, sa18_3_2_student10, sa18_3_3_student10, sa18_3_4_student10, sa18_3_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission18_3_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission18_3_10);
        }
// Creating submission for student9 with student answers for 19_1
        Submission submission19_1_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19_1_1_student9, sa19_1_2_student9, sa19_1_3_student9, sa19_1_4_student9, sa19_1_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19_1_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_1_9);
        }

// Creating submission for student10 with student answers for 19_1
        Submission submission19_1_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19_1_1_student10, sa19_1_2_student10, sa19_1_3_student10, sa19_1_4_student10, sa19_1_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19_1_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_1_10);
        }
// Creating submission for student9 with student answers for 19_2
        Submission submission19_2_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19_2_1_student9, sa19_2_2_student9, sa19_2_3_student9, sa19_2_4_student9, sa19_2_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19_2_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_2_9);
        }

// Creating submission for student10 with student answers for 19_2
        Submission submission19_2_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19_2_1_student10, sa19_2_2_student10, sa19_2_3_student10, sa19_2_4_student10, sa19_2_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19_2_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_2_10);
        }
// Creating submission for student9 with student answers for 19_3
        Submission submission19_3_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa19_3_1_student9, sa19_3_2_student9, sa19_3_3_student9, sa19_3_4_student9, sa19_3_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission19_3_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_3_9);
        }

// Creating submission for student10 with student answers for 19_3
        Submission submission19_3_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa19_3_1_student10, sa19_3_2_student10, sa19_3_3_student10, sa19_3_4_student10, sa19_3_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission19_3_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission19_3_10);
        }
// Creating submission for student9 with student answers for 20_1
        Submission submission20_1_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20_1_1_student9, sa20_1_2_student9, sa20_1_3_student9, sa20_1_4_student9, sa20_1_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20_1_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_1_9);
        }

// Creating submission for student10 with student answers for 20_1
        Submission submission20_1_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20_1_1_student10, sa20_1_2_student10, sa20_1_3_student10, sa20_1_4_student10, sa20_1_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20_1_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_1_10);
        }
// Creating submission for student9 with student answers for 20_2
        Submission submission20_2_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20_2_1_student9, sa20_2_2_student9, sa20_2_3_student9, sa20_2_4_student9, sa20_2_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20_2_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_2_9);
        }

// Creating submission for student10 with student answers for 20_2
        Submission submission20_2_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20_2_1_student10, sa20_2_2_student10, sa20_2_3_student10, sa20_2_4_student10, sa20_2_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20_2_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_2_10);
        }
// Creating submission for student9 with student answers for 20_3
        Submission submission20_3_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20_3_1_student9, sa20_3_2_student9, sa20_3_3_student9, sa20_3_4_student9, sa20_3_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20_3_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_3_9);
        }

// Creating submission for student10 with student answers for 20_3
        Submission submission20_3_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20_3_1_student10, sa20_3_2_student10, sa20_3_3_student10, sa20_3_4_student10, sa20_3_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20_3_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_3_10);
        }
// Creating submission for student9 with student answers for 20_4
        Submission submission20_4_9 = createSubmission("Submission from student9", student9, Arrays.asList(
                sa20_4_1_student9, sa20_4_2_student9, sa20_4_3_student9, sa20_4_4_student9, sa20_4_5_student9
        ));

// Adding the submission to each student answer for student9
        for (StudentAnswer studentAnswer : submission20_4_9.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_4_9);
        }

// Creating submission for student10 with student answers for 20_4
        Submission submission20_4_10 = createSubmission("Submission from student10", student10, Arrays.asList(
                sa20_4_1_student10, sa20_4_2_student10, sa20_4_3_student10, sa20_4_4_student10, sa20_4_5_student10
        ));

// Adding the submission to each student answer for student10
        for (StudentAnswer studentAnswer : submission20_4_10.getStudentAnswers()) {
            addSubmissionToStudentAnswer(studentAnswer, submission20_4_10);
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

        Grade grade9_1_5 = createGrade(86.3, student5, faculty4, course9, submission9_1_5);
        Grade grade9_1_6 = createGrade(88.7, student6, faculty4, course9, submission9_1_6);
        Grade grade9_2_5 = createGrade(89.4, student5, faculty4, course9, submission9_2_5);
        Grade grade9_2_6 = createGrade(87.1, student6, faculty4, course9, submission9_2_6);
        Grade grade9_3_5 = createGrade(85.9, student5, faculty4, course9, submission9_3_5);
        Grade grade9_3_6 = createGrade(90.2, student6, faculty4, course9, submission9_3_6);

        Grade grade10_1_5 = createGrade(87.6, student5, faculty5, course10, submission10_1_5);
        Grade grade10_1_6 = createGrade(89.3, student6, faculty5, course10, submission10_1_6);
        Grade grade10_2_5 = createGrade(84.2, student5, faculty5, course10, submission10_2_5);
        Grade grade10_2_6 = createGrade(85.9, student6, faculty5, course10, submission10_2_6);
        Grade grade10_3_5 = createGrade(88.4, student5, faculty5, course10, submission10_3_5);
        Grade grade10_3_6 = createGrade(83.7, student6, faculty5, course10, submission10_3_6);
        Grade grade10_4_5 = createGrade(86.8, student5, faculty5, course10, submission10_4_5);
        Grade grade10_4_6 = createGrade(90.1, student6, faculty5, course10, submission10_4_6);

        Grade grade11_1_5 = createGrade(86.9, student5, faculty1, course11, submission11_1_5);
        Grade grade11_1_6 = createGrade(89.5, student6, faculty1, course11, submission11_1_6);
        Grade grade11_2_5 = createGrade(87.7, student5, faculty1, course11, submission11_2_5);
        Grade grade11_2_6 = createGrade(84.3, student6, faculty1, course11, submission11_2_6);
        Grade grade11_3_5 = createGrade(90.2, student5, faculty1, course11, submission11_3_5);
        Grade grade11_3_6 = createGrade(85.4, student6, faculty1, course11, submission11_3_6);
        Grade grade11_4_5 = createGrade(88.1, student5, faculty1, course11, submission11_4_5);
        Grade grade11_4_6 = createGrade(87.8, student6, faculty1, course11, submission11_4_6);

        Grade grade12_1_5 = createGrade(88.5, student5, faculty2, course12, submission12_1_5);
        Grade grade12_1_6 = createGrade(85.9, student6, faculty2, course12, submission12_1_6);
        Grade grade12_2_5 = createGrade(89.2, student5, faculty2, course12, submission12_2_5);
        Grade grade12_2_6 = createGrade(86.3, student6, faculty2, course12, submission12_2_6);
        Grade grade12_3_5 = createGrade(87.8, student5, faculty2, course12, submission12_3_5);
        Grade grade12_3_6 = createGrade(88.6, student6, faculty2, course12, submission12_3_6);
        Grade grade12_4_5 = createGrade(85.7, student5, faculty2, course12, submission12_4_5);
        Grade grade12_4_6 = createGrade(90.1, student6, faculty2, course12, submission12_4_6);
        Grade grade12_5_5 = createGrade(88.2, student5, faculty2, course12, submission12_5_5);
        Grade grade12_5_6 = createGrade(86.9, student6, faculty2, course12, submission12_5_6);

        Grade grade13_1_7 = createGrade(86.2, student7, faculty3, course13, submission13_1_7);
        Grade grade13_1_8 = createGrade(88.5, student8, faculty3, course13, submission13_1_8);
        Grade grade13_2_7 = createGrade(89.8, student7, faculty3, course13, submission13_2_7);
        Grade grade13_2_8 = createGrade(87.3, student8, faculty3, course13, submission13_2_8);
        Grade grade13_3_7 = createGrade(84.9, student7, faculty3, course13, submission13_3_7);
        Grade grade13_3_8 = createGrade(90.6, student8, faculty3, course13, submission13_3_8);
        Grade grade13_4_7 = createGrade(88.1, student7, faculty3, course13, submission13_4_7);
        Grade grade13_4_8 = createGrade(85.7, student8, faculty3, course13, submission13_4_8);

        Grade grade14_1_7 = createGrade(88.3, student7, faculty4, course14, submission14_1_7);
        Grade grade14_1_8 = createGrade(86.9, student8, faculty4, course14, submission14_1_8);
        Grade grade14_2_7 = createGrade(87.4, student7, faculty4, course14, submission14_2_7);
        Grade grade14_2_8 = createGrade(85.7, student8, faculty4, course14, submission14_2_8);
        Grade grade14_3_7 = createGrade(89.1, student7, faculty4, course14, submission14_3_7);
        Grade grade14_3_8 = createGrade(84.3, student8, faculty4, course14, submission14_3_8);
        Grade grade14_4_7 = createGrade(88.7, student7, faculty4, course14, submission14_4_7);
        Grade grade14_4_8 = createGrade(87.8, student8, faculty4, course14, submission14_4_8);

        Grade grade15_1_7 = createGrade(86.7, student7, faculty5, course15, submission15_1_7);
        Grade grade15_1_8 = createGrade(88.4, student8, faculty5, course15, submission15_1_8);
        Grade grade15_2_7 = createGrade(85.3, student7, faculty5, course15, submission15_2_7);
        Grade grade15_2_8 = createGrade(87.9, student8, faculty5, course15, submission15_2_8);
        Grade grade15_3_7 = createGrade(89.1, student7, faculty5, course15, submission15_3_7);
        Grade grade15_3_8 = createGrade(86.5, student8, faculty5, course15, submission15_3_8);

        Grade grade16_1_7 = createGrade(87.1, student7, faculty1, course16, submission16_1_7);
        Grade grade16_1_8 = createGrade(85.4, student8, faculty1, course16, submission16_1_8);
        Grade grade16_2_7 = createGrade(88.3, student7, faculty1, course16, submission16_2_7);
        Grade grade16_2_8 = createGrade(86.7, student8, faculty1, course16, submission16_2_8);
        Grade grade16_3_7 = createGrade(84.9, student7, faculty1, course16, submission16_3_7);
        Grade grade16_3_8 = createGrade(87.5, student8, faculty1, course16, submission16_3_8);

        Grade grade17_1_9 = createGrade(87.6, student9, faculty2, course17, submission17_1_9);
        Grade grade17_1_10 = createGrade(85.9, student10, faculty2, course17, submission17_1_10);
        Grade grade17_2_9 = createGrade(89.3, student9, faculty2, course17, submission17_2_9);
        Grade grade17_2_10 = createGrade(86.5, student10, faculty2, course17, submission17_2_10);
        Grade grade17_3_9 = createGrade(88.4, student9, faculty2, course17, submission17_3_9);
        Grade grade17_3_10 = createGrade(87.7, student10, faculty2, course17, submission17_3_10);
        Grade grade17_4_9 = createGrade(85.8, student9, faculty2, course17, submission17_4_9);
        Grade grade17_4_10 = createGrade(89.1, student10, faculty2, course17, submission17_4_10);

        Grade grade18_1_9 = createGrade(87.8, student9, faculty3, course18, submission18_1_9);
        Grade grade18_1_10 = createGrade(89.2, student10, faculty3, course18, submission18_1_10);
        Grade grade18_2_9 = createGrade(86.5, student9, faculty3, course18, submission18_2_9);
        Grade grade18_2_10 = createGrade(88.1, student10, faculty3, course18, submission18_2_10);
        Grade grade18_3_9 = createGrade(87.3, student9, faculty3, course18, submission18_3_9);
        Grade grade18_3_10 = createGrade(85.6, student10, faculty3, course18, submission18_3_10);

        Grade grade19_1_9 = createGrade(88.4, student9, faculty4, course19, submission19_1_9);
        Grade grade19_1_10 = createGrade(86.9, student10, faculty4, course19, submission19_1_10);
        Grade grade19_2_9 = createGrade(87.7, student9, faculty4, course19, submission19_2_9);
        Grade grade19_2_10 = createGrade(89.3, student10, faculty4, course19, submission19_2_10);
        Grade grade19_3_9 = createGrade(85.8, student9, faculty4, course19, submission19_3_9);
        Grade grade19_3_10 = createGrade(88.1, student10, faculty4, course19, submission19_3_10);

        Grade grade20_1_9 = createGrade(88.9, student9, faculty5, course20, submission20_1_9);
        Grade grade20_1_10 = createGrade(86.5, student10, faculty5, course20, submission20_1_10);
        Grade grade20_2_9 = createGrade(87.6, student9, faculty5, course20, submission20_2_9);
        Grade grade20_2_10 = createGrade(89.4, student10, faculty5, course20, submission20_2_10);
        Grade grade20_3_9 = createGrade(86.2, student9, faculty5, course20, submission20_3_9);
        Grade grade20_3_10 = createGrade(88.3, student10, faculty5, course20, submission20_3_10);
        Grade grade20_4_9 = createGrade(87.7, student9, faculty5, course20, submission20_4_9);
        Grade grade20_4_10 = createGrade(85.8, student10, faculty5, course20, submission20_4_10);

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

    public static StudentAnswer createStudentAnswer(Student student, ProblemAnswer problemAnswer, String answerContent) {
        StudentAnswer studentAnswer = new StudentAnswer();
        studentAnswer.setStudent(student);
        studentAnswer.setProblemAnswer(problemAnswer);
        studentAnswer.setAnswerContent(answerContent);
        studentAnswer.setSubmissionDate(Timestamp.valueOf(LocalDateTime.now()));
        return studentAnswer;
    }

}
