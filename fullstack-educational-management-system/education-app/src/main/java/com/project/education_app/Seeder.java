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
        Announcement announcement1 = new Announcement();
        Announcement announcement2 = new Announcement();
        Announcement announcement3 = new Announcement();
        Announcement announcement4 = new Announcement();
        Announcement announcement5 = new Announcement();
        Announcement announcement6=new Announcement();
        Announcement announcement7=new Announcement();
        Announcement announcement8=new Announcement();


        Faculty faculty1=new Faculty();
        Credential cred1=new Credential();
        cred1.setUsername("nicholas");
        cred1.setPassword("jones");
        faculty1.setCredentials(cred1);
        Profile profile1=new Profile();
        profile1.setFirstName("Nicholas");
        profile1.setLastName("Jones");
        profile1.setEmail("jones@email.com");
        profile1.setPhoneNumber("(111) 111-1111");
        faculty1.setProfile(profile1);
        faculty1.setAge(31);
        faculty1.setGender("male");
        faculty1.setAddress("100 street");
        faculty1.setAdmin(false);
        faculty1.setTeacher(true);
        faculty1.setSalary(50000);

        Faculty faculty2=new Faculty();
        Credential cred2=new Credential();
        cred2.setUsername("jacob");
        cred2.setPassword("taylor");
        faculty2.setCredentials(cred2);
        Profile profile2=new Profile();
        profile2.setFirstName("Jacob");
        profile2.setLastName("Taylor");
        profile2.setEmail("taylor@email.com");
        profile2.setPhoneNumber("(222) 222-2222");
        faculty2.setProfile(profile2);
        faculty2.setAge(23);
        faculty2.setGender("male");
        faculty2.setAddress("200 street");
        faculty2.setAdmin(true);
        faculty2.setTeacher(true);
        faculty2.setSalary(90000);

        Faculty faculty3=new Faculty();
        Credential cred3=new Credential();
        cred3.setUsername("jayden");
        cred3.setPassword("willis");
        faculty3.setCredentials(cred3);
        Profile profile3=new Profile();
        profile3.setFirstName("Jayden");
        profile3.setLastName("Willis");
        profile3.setEmail("willis@email.com");
        profile3.setPhoneNumber("(333) 333-3333");
        faculty3.setProfile(profile3);
        faculty3.setAge(21);
        faculty1.setGender("female");
        faculty3.setAddress("300 street");
        faculty3.setAdmin(true);
        faculty3.setTeacher(true);
        faculty3.setSalary(90000);

        Faculty faculty4=new Faculty();
        Credential cred4=new Credential();
        cred4.setUsername("sue");
        cred4.setPassword("todd");
        faculty4.setCredentials(cred4);
        Profile profile4=new Profile();
        profile4.setFirstName("Sue");
        profile4.setLastName("Todd");
        profile4.setEmail("todd@email.com");
        profile4.setPhoneNumber("(444) 444-4444");
        faculty4.setProfile(profile4);
        faculty4.setAge(35);
        faculty4.setGender("female");
        faculty4.setAddress("400 street");
        faculty4.setAdmin(false);
        faculty4.setTeacher(true);
        faculty4.setSalary(40000);

        Faculty faculty5=new Faculty();
        Credential cred5=new Credential();
        cred5.setUsername("sarah");
        cred5.setPassword("sky");
        faculty5.setCredentials(cred5);
        Profile profile5=new Profile();
        profile5.setFirstName("Sarah");
        profile5.setLastName("Sky");
        profile5.setEmail("sky@email.com");
        profile5.setPhoneNumber("(555) 555-5555");
        faculty5.setProfile(profile5);
        faculty5.setAge(21);
        faculty5.setGender("female");
        faculty5.setAddress("500 street");
        faculty5.setAdmin(false);
        faculty5.setTeacher(false);
        faculty5.setSalary(30000);

        Faculty faculty6=new Faculty();
        Credential cred6=new Credential();
        cred6.setUsername("bob");
        cred6.setPassword("tyler");
        faculty6.setCredentials(cred6);
        Profile profile6=new Profile();
        profile6.setFirstName("Bob");
        profile6.setLastName("Tyler");
        profile6.setEmail("tyler@email.com");
        profile6.setPhoneNumber("(666) 666-6666");
        faculty6.setProfile(profile6);
        faculty6.setAge(41);
        faculty6.setGender("male");
        faculty6.setAddress("600 street");
        faculty6.setAdmin(false);
        faculty6.setTeacher(true);
        faculty6.setSalary(60000);

        Student student1=new Student();
        Credential cred7=new Credential();
        cred7.setUsername("emma");
        cred7.setPassword("johnson");
        student1.setCredentials(cred7);
        Profile profile7=new Profile();
        profile7.setFirstName("Emma");
        profile7.setLastName("Johnson");
        profile7.setEmail("johnson@email.com");
        profile7.setPhoneNumber("(123) 456-7890");
        student1.setProfile(profile7);
        student1.setAge(18);
        student1.setGender("female");
        student1.setAddress("100 blvd");

        Student student2=new Student();
        Credential cred8=new Credential();
        cred8.setUsername("liam");
        cred8.setPassword("smith");
        student2.setCredentials(cred8);
        Profile profile8=new Profile();
        profile8.setFirstName("Liam");
        profile8.setLastName("Smith");
        profile8.setEmail("smith@email.com");
        profile8.setPhoneNumber("(234) 567-8901");
        student2.setProfile(profile8);
        student2.setAge(19);
        student2.setGender("male");
        student2.setAddress("200 blvd");

        Student student3=new Student();
        Credential cred9=new Credential();
        cred9.setUsername("olivia");
        cred9.setPassword("brown");
        student3.setCredentials(cred9);
        Profile profile9=new Profile();
        profile9.setFirstName("Olivia");
        profile9.setLastName("Brown");
        profile9.setEmail("brown@email.com");
        profile9.setPhoneNumber("(345) 678-9012");
        student3.setProfile(profile9);
        student3.setAge(19);
        student3.setGender("female");
        student3.setAddress("300 blvd");

        Student student4=new Student();
        Credential cred10=new Credential();
        cred10.setUsername("noah");
        cred10.setPassword("davis");
        student4.setCredentials(cred10);
        Profile profile10=new Profile();
        profile10.setFirstName("Noah");
        profile10.setLastName("Davis");
        profile10.setEmail("davis@email.com");
        profile10.setPhoneNumber("(456) 789-0123");
        student4.setProfile(profile10);
        student4.setAge(18);
        student4.setGender("male");
        student4.setAddress("400 blvd");

        Student student5=new Student();
        Credential cred11=new Credential();
        cred11.setUsername("ava");
        cred11.setPassword("wilson");
        student5.setCredentials(cred11);
        Profile profile11=new Profile();
        profile11.setFirstName("Ava");
        profile11.setLastName("Wilson");
        profile11.setEmail("wilson@email.com");
        profile11.setPhoneNumber("(567) 890-1234");
        student5.setProfile(profile11);
        student5.setAge(20);
        student5.setGender("female");
        student5.setAddress("500 blvd");

        Student student6=new Student();
        Credential cred12=new Credential();
        cred12.setUsername("sophia");
        cred12.setPassword("martinez");
        student6.setCredentials(cred12);
        Profile profile12=new Profile();
        profile12.setFirstName("Sophia");
        profile12.setLastName("Martinez");
        profile12.setEmail("martinez@email.com");
        profile12.setPhoneNumber("(678) 901-2345");
        student6.setProfile(profile12);
        student6.setAge(20);
        student6.setGender("female");
        student6.setAddress("600 blvd");

        Student student7=new Student();
        Credential cred13=new Credential();
        cred13.setUsername("mason");
        cred13.setPassword("anderson");
        student7.setCredentials(cred13);
        Profile profile13=new Profile();
        profile13.setFirstName("Mason");
        profile13.setLastName("Anderson");
        profile13.setEmail("anderson@email.com");
        profile13.setPhoneNumber("(789) 012-3456");
        student7.setProfile(profile13);
        student7.setAge(20);
        student7.setGender("male");
        student7.setAddress("700 blvd");

        Student student8=new Student();
        Credential cred14=new Credential();
        cred14.setUsername("luke");
        cred14.setPassword("rio");
        student8.setCredentials(cred14);
        Profile profile14=new Profile();
        profile14.setFirstName("Luke");
        profile14.setLastName("Rio");
        profile14.setEmail("rio@email.com");
        profile14.setPhoneNumber("(890) 123-4567");
        student8.setProfile(profile14);
        student8.setAge(19);
        student8.setGender("male");
        student8.setAddress("800 blvd");

        Student student9=new Student();
        Credential cred15=new Credential();
        cred15.setUsername("lucas");
        cred15.setPassword("thomas");
        student9.setCredentials(cred15);
        Profile profile15=new Profile();
        profile15.setFirstName("Lucas");
        profile15.setLastName("Thomas");
        profile15.setEmail("thomas@email.com");
        profile15.setPhoneNumber("(901) 234-5678");
        student9.setProfile(profile15);
        student9.setAge(21);
        student9.setGender("male");
        student9.setAddress("900 blvd");

        Student student10=new Student();
        Credential cred16=new Credential();
        cred16.setUsername("mia");
        cred16.setPassword("white");
        student10.setCredentials(cred16);
        Profile profile16=new Profile();
        profile16.setFirstName("Mia");
        profile16.setLastName("White");
        profile16.setEmail("white@email.com");
        profile16.setPhoneNumber("(012) 345-6789");
        student10.setProfile(profile16);
        student10.setAge(21);
        student10.setGender("female");
        student10.setAddress("1001 blvd");

        Guardian guardian1=new Guardian();
        Credential cred17=new Credential();
        cred17.setUsername("nolan");
        cred17.setPassword("everhart");
        guardian1.setCredentials(cred17);
        Profile profile17=new Profile();
        profile17.setFirstName("Nolan");
        profile17.setLastName("Everhart");
        profile17.setEmail("everhart@email.com");
        profile17.setPhoneNumber("(987) 654-3210");
        guardian1.setProfile(profile17);
        guardian1.setAge(54);
        guardian1.setGender("male");
        guardian1.setAddress("100 blvd");

        Guardian guardian2=new Guardian();
        Credential cred18=new Credential();
        cred18.setUsername("helena");
        cred18.setPassword("marlowe");
        guardian2.setCredentials(cred18);
        Profile profile18=new Profile();
        profile18.setFirstName("Helena");
        profile18.setLastName("Marlowe");
        profile18.setEmail("marlowe@email.com");
        profile18.setPhoneNumber("(876) 543-2109");
        guardian2.setProfile(profile18);
        guardian2.setAge(52);
        guardian2.setGender("female");
        guardian2.setAddress("100 blvd");

        Guardian guardian3=new Guardian();
        Credential cred19=new Credential();
        cred19.setUsername("samuel");
        cred19.setPassword("langdon");
        guardian3.setCredentials(cred19);
        Profile profile19=new Profile();
        profile19.setFirstName("Samuel");
        profile19.setLastName("Langdon");
        profile19.setEmail("langdon@email.com");
        profile19.setPhoneNumber("(765) 432-1098");
        guardian3.setProfile(profile19);
        guardian3.setAge(56);
        guardian3.setGender("male");
        guardian3.setAddress("200 blvd");

        Guardian guardian4=new Guardian();
        Credential cred20=new Credential();
        cred20.setUsername("clara");
        cred20.setPassword("ridley");
        guardian4.setCredentials(cred20);
        Profile profile20=new Profile();
        profile20.setFirstName("Clara");
        profile20.setLastName("Ridley");
        profile20.setEmail("ridley@email.com");
        profile20.setPhoneNumber("(654) 321-0987");
        guardian4.setProfile(profile20);
        guardian4.setAge(46);
        guardian4.setGender("female");
        guardian4.setAddress("200 blvd");

        Guardian guardian5=new Guardian();
        Credential cred21=new Credential();
        cred21.setUsername("jason");
        cred21.setPassword("whitaker");
        guardian5.setCredentials(cred21);
        Profile profile21=new Profile();
        profile21.setFirstName("Jason");
        profile21.setLastName("Whitaker");
        profile21.setEmail("whitaker@email.com");
        profile21.setPhoneNumber("(543) 210-9876");
        guardian5.setProfile(profile21);
        guardian5.setAge(50);
        guardian5.setGender("male");
        guardian5.setAddress("300 blvd");

        Guardian guardian6=new Guardian();
        Credential cred22=new Credential();
        cred22.setUsername("evelyn");
        cred22.setPassword("sutherland");
        guardian6.setCredentials(cred22);
        Profile profile22=new Profile();
        profile22.setFirstName("Evelyn");
        profile22.setLastName("Sutherland");
        profile22.setEmail("sutherland@email.com");
        profile22.setPhoneNumber("(432) 109-8765");
        guardian6.setProfile(profile22);
        guardian6.setAge(45);
        guardian6.setGender("female");
        guardian6.setAddress("300 blvd");

        Guardian guardian7=new Guardian();
        Credential cred23=new Credential();
        cred23.setUsername("brandon");
        cred23.setPassword("fenwick");
        guardian7.setCredentials(cred23);
        Profile profile23=new Profile();
        profile23.setFirstName("Brandon");
        profile23.setLastName("Fenwick");
        profile23.setEmail("fenwick@email.com");
        profile23.setPhoneNumber("(321) 098-7654");
        guardian7.setProfile(profile23);
        guardian7.setAge(55);
        guardian7.setGender("male");
        guardian7.setAddress("400 blvd");

        Guardian guardian8=new Guardian();
        Credential cred24=new Credential();
        cred24.setUsername("fiona");
        cred24.setPassword("langley");
        guardian8.setCredentials(cred24);
        Profile profile24=new Profile();
        profile24.setFirstName("Fiona");
        profile24.setLastName("Langley");
        profile24.setEmail("langley@email.com");
        profile24.setPhoneNumber("(210) 987-6543");
        guardian8.setProfile(profile24);
        guardian8.setAge(48);
        guardian8.setGender("female");
        guardian8.setAddress("400 blvd");

        Guardian guardian9=new Guardian();
        Credential cred25=new Credential();
        cred25.setUsername("miles");
        cred25.setPassword("torrence");
        guardian9.setCredentials(cred25);
        Profile profile25=new Profile();
        profile25.setFirstName("Miles");
        profile25.setLastName("Torrence");
        profile25.setEmail("torrence@email.com");
        profile25.setPhoneNumber("(109) 876-5432");
        guardian9.setProfile(profile25);
        guardian9.setAge(53);
        guardian9.setGender("male");
        guardian9.setAddress("500 blvd");

        Guardian guardian10=new Guardian();
        Credential cred26=new Credential();
        cred26.setUsername("bridget");
        cred26.setPassword("leighton");
        guardian10.setCredentials(cred26);
        Profile profile26=new Profile();
        profile26.setFirstName("Bridget");
        profile26.setLastName("Leighton");
        profile26.setEmail("leighton@email.com");
        profile26.setPhoneNumber("(098) 765-4321");
        guardian10.setProfile(profile26);
        guardian10.setAge(44);
        guardian10.setGender("female");
        guardian10.setAddress("500 blvd");

        Guardian guardian11=new Guardian();
        Credential cred27=new Credential();
        cred27.setUsername("riley");
        cred27.setPassword("pemberton");
        guardian11.setCredentials(cred27);
        Profile profile27=new Profile();
        profile27.setFirstName("Riley");
        profile27.setLastName("Pemberton");
        profile27.setEmail("pemberton@email.com");
        profile27.setPhoneNumber("(987) 654-3219");
        guardian11.setProfile(profile27);
        guardian11.setAge(57);
        guardian11.setGender("male");
        guardian11.setAddress("600 blvd");

        Guardian guardian12=new Guardian();
        Credential cred28=new Credential();
        cred28.setUsername("eliza");
        cred28.setPassword("hastings");
        guardian12.setCredentials(cred28);
        Profile profile28=new Profile();
        profile28.setFirstName("Eliza");
        profile28.setLastName("Hastings");
        profile28.setEmail("hastings@email.com");
        profile28.setPhoneNumber("(876) 543-2108");
        guardian12.setProfile(profile28);
        guardian12.setAge(47);
        guardian12.setGender("female");
        guardian12.setAddress("600 blvd");

        Guardian guardian13=new Guardian();
        Credential cred29=new Credential();
        cred29.setUsername("julian");
        cred29.setPassword("ashford");
        guardian13.setCredentials(cred29);
        Profile profile29=new Profile();
        profile29.setFirstName("Julian");
        profile29.setLastName("Ashford");
        profile29.setEmail("ashford@email.com");
        profile29.setPhoneNumber("(765) 432-1097");
        guardian13.setProfile(profile29);
        guardian13.setAge(49);
        guardian13.setGender("male");
        guardian13.setAddress("700 blvd");

        Guardian guardian14=new Guardian();
        Credential cred30=new Credential();
        cred30.setUsername("hazel");
        cred30.setPassword("winslow");
        guardian14.setCredentials(cred30);
        Profile profile30=new Profile();
        profile30.setFirstName("Hazel");
        profile30.setLastName("Winslow");
        profile30.setEmail("winslow@email.com");
        profile30.setPhoneNumber("(654) 321-0986");
        guardian14.setProfile(profile30);
        guardian14.setAge(42);
        guardian14.setGender("female");
        guardian14.setAddress("700 blvd");

        Guardian guardian15=new Guardian();
        Credential cred31=new Credential();
        cred31.setUsername("isaac");
        cred31.setPassword("thornfield");
        guardian15.setCredentials(cred31);
        Profile profile31=new Profile();
        profile31.setFirstName("Isaac");
        profile31.setLastName("Thornfield");
        profile31.setEmail("thornfield@email.com");
        profile31.setPhoneNumber("(543) 210-9875");
        guardian15.setProfile(profile31);
        guardian15.setAge(55);
        guardian15.setGender("male");
        guardian15.setAddress("800 blvd");

        Guardian guardian16=new Guardian();
        Credential cred32=new Credential();
        cred32.setUsername("iris");
        cred32.setPassword("fairchild");
        guardian16.setCredentials(cred32);
        Profile profile32=new Profile();
        profile32.setFirstName("Iris");
        profile32.setLastName("Fairchild");
        profile32.setEmail("fairchild@email.com");
        profile32.setPhoneNumber("(432) 109-8764");
        guardian16.setProfile(profile32);
        guardian16.setAge(51);
        guardian16.setGender("female");
        guardian16.setAddress("800 blvd");

        Guardian guardian17=new Guardian();
        Credential cred33=new Credential();
        cred33.setUsername("wesley");
        cred33.setPassword("fairchild");
        guardian17.setCredentials(cred33);
        Profile profile33=new Profile();
        profile33.setFirstName("Wesley");
        profile33.setLastName("Fairchild");
        profile33.setEmail("fairchild@email.com");
        profile33.setPhoneNumber("(321) 098-7653");
        guardian17.setProfile(profile33);
        guardian17.setAge(54);
        guardian17.setGender("male");
        guardian17.setAddress("900 blvd");

        Guardian guardian18=new Guardian();
        Credential cred34=new Credential();
        cred34.setUsername("nora");
        cred34.setPassword("pembroke");
        guardian18.setCredentials(cred34);
        Profile profile34=new Profile();
        profile34.setFirstName("Nora");
        profile34.setLastName("Pembroke");
        profile34.setEmail("pembroke@email.com");
        profile34.setPhoneNumber("(210) 987-6542");
        guardian18.setProfile(profile34);
        guardian18.setAge(43);
        guardian18.setGender("female");
        guardian18.setAddress("900 blvd");

        Guardian guardian19=new Guardian();
        Credential cred35=new Credential();
        cred35.setUsername("oliver");
        cred35.setPassword("winslow");
        guardian19.setCredentials(cred35);
        Profile profile35=new Profile();
        profile35.setFirstName("Oliver");
        profile35.setLastName("Winslow");
        profile35.setEmail("winslow@email.com");
        profile35.setPhoneNumber("(109) 876-5431");
        guardian19.setProfile(profile35);
        guardian19.setAge(58);
        guardian19.setGender("male");
        guardian19.setAddress("1000 blvd");

        Guardian guardian20=new Guardian();
        Credential cred36=new Credential();
        cred36.setUsername("lillian");
        cred36.setPassword("ashford");
        guardian20.setCredentials(cred36);
        Profile profile36=new Profile();
        profile36.setFirstName("Lillian");
        profile36.setLastName("Ashford");
        profile36.setEmail("ashford@email.com");
        profile35.setPhoneNumber("(109) 876-5431");
        guardian20.setProfile(profile36);
        guardian20.setAge(58);
        guardian20.setGender("female");
        guardian20.setAddress("1000 blvd");

        announcementRepo.saveAllAndFlush(Arrays.asList(
                announcement1, announcement2, announcement3, announcement4, announcement5,announcement6,announcement7,announcement8));
        facultyRepo.saveAllAndFlush(Arrays.asList(faculty1,faculty2,faculty3,faculty4,faculty5,faculty6));
        studentRepo.saveAllAndFlush(Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10));
        guardianRepo.saveAllAndFlush(Arrays.asList(guardian1,guardian2,guardian3,guardian4,guardian5,guardian6,guardian7,guardian8,guardian9,
        guardian10,guardian11,guardian12,guardian13,guardian14,guardian15,guardian16,guardian17,guardian18,guardian19,guardian20));


        announcement1.setTitle("School Year Kickoff");
        announcement1.setMessage("Welcome to the new school year! Let's make it a great one.");
        announcement1.setAuthor(faculty1);

        announcement2.setTitle("Parent-Teacher Conferences");
        announcement2.setMessage("Parent-Teacher conferences will be held next week. Please sign up for a time slot.");
        announcement2.setAuthor(faculty2);

        announcement3.setTitle("Holiday Break");
        announcement3.setMessage("The school will be closed for the holiday break from December 20th to January 4th.");
        announcement3.setAuthor(faculty3);

        announcement4.setTitle("Science Fair");
        announcement4.setMessage("The annual Science Fair will be held on March 15th. Start preparing your projects!");
        announcement4.setAuthor(faculty4);

        announcement5.setTitle("Field Trip");
        announcement5.setMessage("Our next field trip is scheduled for April 10th. Please return your permission slips by April 5th.");
        announcement5.setAuthor(faculty5);


        announcement6.setTitle("Sports Day");
        announcement6.setMessage("Sports Day is coming up on May 20th. Get ready for some fun and games!");
        announcement6.setAuthor(faculty6);

        announcement7.setTitle("Graduation Ceremony");
        announcement7.setMessage("Graduation Ceremony for seniors will be held on June 25th. Congratulations to all graduates!");
        announcement7.setAuthor(faculty6);

        announcement8.setTitle("Summer Camp");
        announcement8.setMessage("Sign up for our summer camp programs starting July 1st. Lots of activities and fun await!");
        announcement8.setAuthor(faculty1);


        // Computer Science Courses

        Syllabus syllabus1 = new Syllabus();
        syllabus1.setObjectives("Introduce students to programming fundamentals using Python.");
        syllabus1.setTopics("Variables, Data Types, Control Structures, Functions, Modules, and Libraries.");
        syllabus1.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course1 = new Course();
        course1.setName("Introduction to Programming");
        course1.setDescription("Learn the basics of programming using Python.");
        course1.setSubject("Computer Science");
        course1.setCredits(4);
        course1.setSyllabus(syllabus1);

        // Create the units
        Unit unit1_1 = new Unit();
        unit1_1.setName("Variables");
        unit1_1.setDescription("In this unit, students will be introduced to the concept of variables and their importance in programming. "
                + "They will learn how to create and use variables to store and manipulate data. " +
                "By the end of this unit, students will be able to declare variables and assign values to them, understand the concept of variable naming conventions, and demonstrate the use of variables in simple Python programs.");

        Unit unit1_2 = new Unit();
        unit1_2.setName("Data Types");
        unit1_2.setDescription("This unit will cover the different data types available in Python, such as integers, floats, strings, and booleans. " +
                "Students will learn how to identify and use these data types effectively. By the end of this unit, students will be able to perform operations on different data types, convert between data types, and apply data types appropriately in their programs.");

        Unit unit1_3 = new Unit();
        unit1_3.setName("Control Structures");
        unit1_3.setDescription("In this unit, students will explore control structures, including loops (for and while) and conditional statements (if, elif, else). "
                + "They will learn how to control the flow of their programs and make decisions based on conditions. By the end of this unit, students will be able to write programs that use loops to repeat actions and conditionals to execute code based on specific criteria.");

        Unit unit1_4 = new Unit();
        unit1_4.setName("Functions");
        unit1_4.setDescription("This unit will focus on the creation and use of functions in Python." +
                " Students will learn how to define functions, pass parameters, and return values. By the end of this unit, students will be able to write reusable functions, understand the importance of functions in organizing code, and apply functions to solve problems effectively.");

        Unit unit1_5 = new Unit();
        unit1_5.setName("Modules");
        unit1_5.setDescription("In this unit, students will be introduced to the concept of modules and how to import and use them in their Python programs. " +
                "They will learn how to break down large programs into smaller, manageable pieces using modules." +
                " By the end of this unit, students will be able to create and import their own modules, use built-in Python modules, and understand the benefits of modular programming.");

        Unit unit1_6 = new Unit();
        unit1_6.setName("Libraries");
        unit1_6.setDescription("This unit will cover the use of libraries in Python programming. Students will learn how to find, install, and use libraries to extend the functionality of their programs. " +
                "By the end of this unit, students will be familiar with popular Python libraries, understand how to read library documentation, and integrate libraries into their own projects to simplify complex tasks.");
        // Add units to a list
        List<Unit> units1 = new ArrayList<>();
        units1.add(unit1_1);
        units1.add(unit1_2);
        units1.add(unit1_3);
        units1.add(unit1_4);
        units1.add(unit1_5);
        units1.add(unit1_6);
        // Set the units in the course
        course1.setUnits(units1);

        Syllabus syllabus2 = new Syllabus();
        syllabus2.setObjectives("Understand and implement various data structures.");
        syllabus2.setTopics("Arrays, Linked Lists, Stacks, Queues, Trees, Graphs.");
        syllabus2.setEvaluationCriteria("Assignments (50%), Projects (20%), Tests (30%)");

        Course course2 = new Course();
        course2.setName("Data Structures");
        course2.setDescription("An in-depth study of data structures such as arrays, linked lists, stacks, queues, and trees.");
        course2.setSubject("Computer Science");
        course2.setCredits(3);
        course2.setSyllabus(syllabus2);

        // Create the units
        Unit unit2_1 = new Unit();
        unit2_1.setName("Arrays");
        unit2_1.setDescription("In this unit, students will learn about arrays, a fundamental data structure...");

        Unit unit2_2 = new Unit();
        unit2_2.setName("Linked Lists");
        unit2_2.setDescription("This unit covers linked lists, a data structure consisting of nodes...");

        Unit unit2_3 = new Unit();
        unit2_3.setName("Stacks");
        unit2_3.setDescription("In this unit, students will explore stacks, a last-in, first-out (LIFO) data structure...");

        Unit unit2_4 = new Unit();
        unit2_4.setName("Queues");
        unit2_4.setDescription("This unit focuses on queues, a first-in, first-out (FIFO) data structure...");

        Unit unit2_5 = new Unit();
        unit2_5.setName("Trees");
        unit2_5.setDescription("In this unit, students will study trees, a hierarchical data structure...");

        Unit unit2_6 = new Unit();
        unit2_6.setName("Graphs");
        unit2_6.setDescription("This unit covers graphs, a versatile data structure used to represent relationships...");

// Add units to a list
        List<Unit> units2 = new ArrayList<>();
        units2.add(unit2_1);
        units2.add(unit2_2);
        units2.add(unit2_3);
        units2.add(unit2_4);
        units2.add(unit2_5);
        units2.add(unit2_6);

// Create the course and set the units

        course2.setUnits(units2);

// Now, the course has the list of units associated with it


        Syllabus syllabus3 = new Syllabus();
        syllabus3.setObjectives("Explore the design and analysis of algorithms.");
        syllabus3.setTopics("Sorting, Searching, Graph Algorithms, Dynamic Programming.");
        syllabus3.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course3 = new Course();
        course3.setName("Algorithms");
        course3.setDescription("Explore the design and analysis of algorithms, including sorting and searching algorithms.");
        course3.setSubject("Computer Science");
        course3.setCredits(3);
        course3.setSyllabus(syllabus3);

// Create the units
        Unit unit3_1 = new Unit();
        unit3_1.setName("Sorting");
        unit3_1.setDescription("In this unit, students will learn about various sorting algorithms, including bubble sort, merge sort, and quicksort. They will understand the principles behind each sorting method, analyze their efficiency, and implement these algorithms in Python.");

        Unit unit3_2 = new Unit();
        unit3_2.setName("Searching");
        unit3_2.setDescription("This unit covers different searching algorithms such as linear search and binary search. Students will learn how to implement these algorithms, analyze their time complexity, and apply them to solve real-world problems.");

        Unit unit3_3 = new Unit();
        unit3_3.setName("Graph Algorithms");
        unit3_3.setDescription("In this unit, students will explore algorithms used to traverse and manipulate graphs, including depth-first search (DFS) and breadth-first search (BFS). They will learn how to implement these algorithms and understand their applications in network analysis and other fields.");

        Unit unit3_4 = new Unit();
        unit3_4.setName("Dynamic Programming");
        unit3_4.setDescription("This unit focuses on dynamic programming, a method for solving complex problems by breaking them down into simpler subproblems. Students will learn the fundamentals of dynamic programming, implement classic algorithms such as the Fibonacci sequence and knapsack problem, and understand how to optimize their solutions.");

// Add units to a list
        List<Unit> units3 = new ArrayList<>();
        units3.add(unit3_1);
        units3.add(unit3_2);
        units3.add(unit3_3);
        units3.add(unit3_4);

// Set the units in the course
        course3.setUnits(units3);


        Syllabus syllabus4 = new Syllabus();
        syllabus4.setObjectives("Introduction to database concepts, SQL, and database design.");
        syllabus4.setTopics("Relational Databases, SQL, Transactions, Database Design.");
        syllabus4.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course4 = new Course();
        course4.setName("Database Management Systems");
        course4.setDescription("Introduction to database concepts, SQL, and database design.");
        course4.setSubject("Computer Science");
        course4.setCredits(3);
        course4.setSyllabus(syllabus4);

// Create the units
        Unit unit4_1 = new Unit();
        unit4_1.setName("Relational Databases");
        unit4_1.setDescription("In this unit, students will learn about the foundational concepts of relational databases, including tables, keys, and relationships. Students will understand how relational databases organize data and how to design efficient database schemas.");

        Unit unit4_2 = new Unit();
        unit4_2.setName("SQL");
        unit4_2.setDescription("This unit covers the basics of Structured Query Language (SQL), the standard language for querying and manipulating databases. Students will learn how to write SQL queries to create, read, update, and delete data, as well as perform complex data operations.");

        Unit unit4_3 = new Unit();
        unit4_3.setName("Transactions");
        unit4_3.setDescription("In this unit, students will explore the concept of transactions, which ensure data integrity and consistency in databases. They will learn about ACID properties (Atomicity, Consistency, Isolation, Durability) and how to implement transactions in SQL.");

        Unit unit4_4 = new Unit();
        unit4_4.setName("Database Design");
        unit4_4.setDescription("This unit focuses on the principles and best practices of database design. Students will learn how to create normalized database schemas, design efficient database structures, and apply data modeling techniques to meet specific application requirements.");

// Add units to a list
        List<Unit> units4 = new ArrayList<>();
        units4.add(unit4_1);
        units4.add(unit4_2);
        units4.add(unit4_3);
        units4.add(unit4_4);

// Set the units in the course
        course4.setUnits(units4);


        Syllabus syllabus5 = new Syllabus();
        syllabus5.setObjectives("Study the fundamental concepts of operating systems.");
        syllabus5.setTopics("Processes, Memory Management, File Systems, Scheduling.");
        syllabus5.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course5 = new Course();
        course5.setName("Operating Systems");
        course5.setDescription("Study the fundamental concepts of operating systems, including processes, memory management, and file systems.");
        course5.setSubject("Computer Science");
        course5.setCredits(3);
        course5.setSyllabus(syllabus5);

// Create the units
        Unit unit5_1 = new Unit();
        unit5_1.setName("Processes");
        unit5_1.setDescription("In this unit, students will learn about processes and process management in operating systems. They will understand how the OS handles process creation, scheduling, and termination, and explore inter-process communication and synchronization.");

        Unit unit5_2 = new Unit();
        unit5_2.setName("Memory Management");
        unit5_2.setDescription("This unit covers memory management techniques used by operating systems to allocate and manage memory resources. Students will learn about paging, segmentation, virtual memory, and memory allocation algorithms.");

        Unit unit5_3 = new Unit();
        unit5_3.setName("File Systems");
        unit5_3.setDescription("In this unit, students will explore file systems and how they are managed by the OS. They will learn about file organization, storage allocation, directory structures, and file access methods.");

        Unit unit5_4 = new Unit();
        unit5_4.setName("Scheduling");
        unit5_4.setDescription("This unit focuses on CPU scheduling algorithms and their role in managing process execution. Students will learn about different scheduling techniques, such as round-robin, priority scheduling, and multi-level queues, and analyze their performance and efficiency.");

// Add units to a list
        List<Unit> units5 = new ArrayList<>();
        units5.add(unit5_1);
        units5.add(unit5_2);
        units5.add(unit5_3);
        units5.add(unit5_4);

// Set the units in the course
        course5.setUnits(units5);


        Syllabus syllabus6 = new Syllabus();
        syllabus6.setObjectives("Learn about the principles of computer networking.");
        syllabus6.setTopics("OSI Model, TCP/IP, Network Protocols, Routing, Switching.");
        syllabus6.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course6 = new Course();
        course6.setName("Computer Networks");
        course6.setDescription("Learn about the principles of computer networking, including the OSI model, TCP/IP, and network protocols.");
        course6.setSubject("Computer Science");
        course6.setCredits(3);
        course6.setSyllabus(syllabus6);

// Create the units
        Unit unit6_1 = new Unit();
        unit6_1.setName("OSI Model");
        unit6_1.setDescription("In this unit, students will learn about the OSI (Open Systems Interconnection) model, which standardizes the functions of a telecommunication or computing system irrespective of its underlying structure and technology. They will understand the seven layers of the OSI model and how data is transmitted across each layer.");

        Unit unit6_2 = new Unit();
        unit6_2.setName("TCP/IP");
        unit6_2.setDescription("This unit covers the TCP/IP (Transmission Control Protocol/Internet Protocol) model, the foundational protocol suite for the internet. Students will learn about its four layers, key protocols, and how TCP/IP enables reliable communication between networked devices.");

        Unit unit6_3 = new Unit();
        unit6_3.setName("Network Protocols");
        unit6_3.setDescription("In this unit, students will explore various network protocols that govern data exchange over networks. They will understand the roles of protocols such as HTTP, FTP, DNS, and DHCP, and how these protocols ensure secure and efficient communication.");

        Unit unit6_4 = new Unit();
        unit6_4.setName("Routing");
        unit6_4.setDescription("This unit focuses on routing, the process of selecting paths in a network along which to send data packets. Students will learn about different routing algorithms, protocols (e.g., OSPF, BGP), and the concepts of static and dynamic routing.");

        Unit unit6_5 = new Unit();
        unit6_5.setName("Switching");
        unit6_5.setDescription("In this unit, students will learn about switching, a technique used to forward data packets from one device to another within a network. They will explore different types of switches, switching methods (e.g., packet switching, circuit switching), and the role of switches in network design.");

// Add units to a list
        List<Unit> units6 = new ArrayList<>();
        units6.add(unit6_1);
        units6.add(unit6_2);
        units6.add(unit6_3);
        units6.add(unit6_4);
        units6.add(unit6_5);

// Set the units in the course
        course6.setUnits(units6);


        Syllabus syllabus7 = new Syllabus();
        syllabus7.setObjectives("Introduction to software development methodologies.");
        syllabus7.setTopics("Software Development Life Cycle, Agile, Waterfall, Project Management.");
        syllabus7.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course7 = new Course();
        course7.setName("Software Engineering");
        course7.setDescription("Introduction to software development methodologies, project management, and software life cycle.");
        course7.setSubject("Computer Science");
        course7.setCredits(4);
        course7.setSyllabus(syllabus7);

// Create the units
        Unit unit7_1 = new Unit();
        unit7_1.setName("Software Development Life Cycle");
        unit7_1.setDescription("In this unit, students will learn about the Software Development Life Cycle (SDLC), a process for planning, creating, testing, and deploying an information system. They will explore different SDLC models, including iterative, incremental, and spiral models.");

        Unit unit7_2 = new Unit();
        unit7_2.setName("Agile");
        unit7_2.setDescription("This unit covers the Agile methodology, an iterative approach to software development that emphasizes flexibility and customer feedback. Students will learn about Agile principles, practices (e.g., Scrum, Kanban), and how to apply Agile techniques in software projects.");

        Unit unit7_3 = new Unit();
        unit7_3.setName("Waterfall");
        unit7_3.setDescription("In this unit, students will explore the Waterfall model, a linear and sequential approach to software development. They will understand the phases of the Waterfall model, including requirements analysis, system design, implementation, testing, deployment, and maintenance.");

        Unit unit7_4 = new Unit();
        unit7_4.setName("Project Management");
        unit7_4.setDescription("This unit focuses on project management techniques and tools used in software development. Students will learn about project planning, scheduling, resource management, risk management, and quality assurance, and how to manage a software project from inception to completion.");

// Add units to a list
        List<Unit> units7 = new ArrayList<>();
        units7.add(unit7_1);
        units7.add(unit7_2);
        units7.add(unit7_3);
        units7.add(unit7_4);

// Set the units in the course
        course7.setUnits(units7);


        Syllabus syllabus8 = new Syllabus();
        syllabus8.setObjectives("Learn to create dynamic websites.");
        syllabus8.setTopics("HTML, CSS, JavaScript, React, Backend Integration.");
        syllabus8.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course8 = new Course();
        course8.setName("Web Development");
        course8.setDescription("Learn to create dynamic websites using HTML, CSS, JavaScript, and frameworks such as React.");
        course8.setSubject("Computer Science");
        course8.setCredits(3);
        course8.setSyllabus(syllabus8);

// Create the units
        Unit unit8_1 = new Unit();
        unit8_1.setName("HTML");
        unit8_1.setDescription("In this unit, students will learn the basics of HTML (HyperText Markup Language), the standard language for creating web pages. They will understand how to structure content using HTML tags and attributes, and build simple web pages.");

        Unit unit8_2 = new Unit();
        unit8_2.setName("CSS");
        unit8_2.setDescription("This unit covers CSS (Cascading Style Sheets), a language used to style HTML documents. Students will learn how to apply styles to web pages, including layout, colors, fonts, and responsiveness, to enhance the visual presentation of their web pages.");

        Unit unit8_3 = new Unit();
        unit8_3.setName("JavaScript");
        unit8_3.setDescription("In this unit, students will explore JavaScript, a programming language that allows them to create interactive and dynamic web content. They will learn how to write JavaScript code to manipulate the DOM (Document Object Model), handle events, and perform animations.");

        Unit unit8_4 = new Unit();
        unit8_4.setName("React");
        unit8_4.setDescription("This unit focuses on React, a popular JavaScript library for building user interfaces. Students will learn the core concepts of React, including components, state, and props, and how to create single-page applications with React.");

        Unit unit8_5 = new Unit();
        unit8_5.setName("Backend Integration");
        unit8_5.setDescription("In this unit, students will learn how to integrate front-end web applications with backend services. They will explore RESTful APIs, data fetching, and server-side rendering, and understand how to build full-stack web applications.");

// Add units to a list
        List<Unit> units8 = new ArrayList<>();
        units8.add(unit8_1);
        units8.add(unit8_2);
        units8.add(unit8_3);
        units8.add(unit8_4);
        units8.add(unit8_5);

// Set the units in the course
        course8.setUnits(units8);


        Syllabus syllabus9 = new Syllabus();
        syllabus9.setObjectives("Explore the basics of artificial intelligence.");
        syllabus9.setTopics("Machine Learning, Neural Networks, Natural Language Processing.");
        syllabus9.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course9 = new Course();
        course9.setName("Artificial Intelligence");
        course9.setDescription("Explore the basics of artificial intelligence, including machine learning, neural networks, and natural language processing.");
        course9.setSubject("Computer Science");
        course9.setCredits(4);
        course9.setSyllabus(syllabus9);

// Create the units
        Unit unit9_1 = new Unit();
        unit9_1.setName("Machine Learning");
        unit9_1.setDescription("In this unit, students will learn about machine learning, a subset of AI that focuses on developing algorithms that enable computers to learn from and make predictions based on data. They will explore various machine learning techniques and tools.");

        Unit unit9_2 = new Unit();
        unit9_2.setName("Neural Networks");
        unit9_2.setDescription("This unit covers neural networks, a set of algorithms modeled after the human brain. Students will understand the basics of neural network architecture, backpropagation, and how to build and train neural networks for different tasks.");

        Unit unit9_3 = new Unit();
        unit9_3.setName("Natural Language Processing");
        unit9_3.setDescription("In this unit, students will explore natural language processing (NLP), a field of AI that enables computers to understand and generate human language. They will learn about text processing, sentiment analysis, and how to build NLP models using machine learning techniques.");

// Add units to a list
        List<Unit> units9 = new ArrayList<>();
        units9.add(unit9_1);
        units9.add(unit9_2);
        units9.add(unit9_3);

// Set the units in the course
        course9.setUnits(units9);


        Syllabus syllabus10 = new Syllabus();
        syllabus10.setObjectives("Introduction to the principles of cybersecurity.");
        syllabus10.setTopics("Threat Analysis, Encryption, Network Security, Secure Coding.");
        syllabus10.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course10 = new Course();
        course10.setName("Cybersecurity");
        course10.setDescription("Introduction to the principles of cybersecurity, including threat analysis, encryption, and network security.");
        course10.setSubject("Computer Science");
        course10.setCredits(3);
        course10.setSyllabus(syllabus10);

// Create the units
        Unit unit10_1 = new Unit();
        unit10_1.setName("Threat Analysis");
        unit10_1.setDescription("In this unit, students will learn about threat analysis, identifying potential security threats and vulnerabilities. They will understand how to assess risks and implement strategies to mitigate these threats.");

        Unit unit10_2 = new Unit();
        unit10_2.setName("Encryption");
        unit10_2.setDescription("This unit covers encryption, the process of converting information into a secure format. Students will learn about different encryption techniques, algorithms, and the importance of encryption in protecting sensitive data.");

        Unit unit10_3 = new Unit();
        unit10_3.setName("Network Security");
        unit10_3.setDescription("In this unit, students will explore network security, including measures to protect data during transmission across networks. They will understand firewalls, intrusion detection systems, and other tools used to safeguard networks.");

        Unit unit10_4 = new Unit();
        unit10_4.setName("Secure Coding");
        unit10_4.setDescription("This unit focuses on secure coding practices to prevent vulnerabilities in software. Students will learn about common security flaws, how to write secure code, and best practices for maintaining software security.");

// Add units to a list
        List<Unit> units10 = new ArrayList<>();
        units10.add(unit10_1);
        units10.add(unit10_2);
        units10.add(unit10_3);
        units10.add(unit10_4);

// Set the units in the course
        course10.setUnits(units10);


// Mathematics Courses

        Syllabus syllabus11 = new Syllabus();
        syllabus11.setObjectives("Introduce students to differential and integral calculus.");
        syllabus11.setTopics("Limits, Derivatives, Integrals, Applications of Calculus.");
        syllabus11.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course11 = new Course();
        course11.setName("Calculus I");
        course11.setDescription("Introduction to differential and integral calculus.");
        course11.setSubject("Mathematics");
        course11.setCredits(4);
        course11.setSyllabus(syllabus11);

// Create the units
        Unit unit11_1 = new Unit();
        unit11_1.setName("Limits");
        unit11_1.setDescription("In this unit, students will learn about limits, the foundational concept of calculus. They will understand how to calculate limits and their importance in defining continuity and the behavior of functions.");

        Unit unit11_2 = new Unit();
        unit11_2.setName("Derivatives");
        unit11_2.setDescription("This unit covers derivatives, the measure of how a function changes as its input changes. Students will learn techniques of differentiation, applications of derivatives, and how to solve real-world problems using derivatives.");

        Unit unit11_3 = new Unit();
        unit11_3.setName("Integrals");
        unit11_3.setDescription("In this unit, students will explore integrals, the concept of accumulation of quantities. They will learn about techniques of integration, the Fundamental Theorem of Calculus, and applications of integrals in various fields.");

        Unit unit11_4 = new Unit();
        unit11_4.setName("Applications of Calculus");
        unit11_4.setDescription("This unit focuses on the practical applications of calculus in science, engineering, and economics. Students will understand how to apply calculus concepts to model and solve real-world problems.");

// Add units to a list
        List<Unit> units11 = new ArrayList<>();
        units11.add(unit11_1);
        units11.add(unit11_2);
        units11.add(unit11_3);
        units11.add(unit11_4);

// Set the units in the course
        course11.setUnits(units11);


        Syllabus syllabus12 = new Syllabus();
        syllabus12.setObjectives("Study of vector spaces, matrices, and linear transformations.");
        syllabus12.setTopics("Vectors, Matrices, Determinants, Eigenvalues, Eigenvectors.");
        syllabus12.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course12 = new Course();
        course12.setName("Linear Algebra");
        course12.setDescription("Study of vector spaces, matrices, and linear transformations.");
        course12.setSubject("Mathematics");
        course12.setCredits(3);
        course12.setSyllabus(syllabus12);

// Create the units
        Unit unit12_1 = new Unit();
        unit12_1.setName("Vectors");
        unit12_1.setDescription("In this unit, students will learn about vectors, their properties, and operations. They will explore vector addition, scalar multiplication, dot product, and cross product, and understand their applications in various fields.");

        Unit unit12_2 = new Unit();
        unit12_2.setName("Matrices");
        unit12_2.setDescription("This unit covers matrices and their operations. Students will learn about matrix addition, multiplication, and inversion, as well as applications of matrices in solving linear equations and transformations.");

        Unit unit12_3 = new Unit();
        unit12_3.setName("Determinants");
        unit12_3.setDescription("In this unit, students will explore determinants, a scalar value that can be computed from the elements of a square matrix. They will understand the properties of determinants, how to calculate them, and their role in solving linear systems and finding matrix inverses.");

        Unit unit12_4 = new Unit();
        unit12_4.setName("Eigenvalues");
        unit12_4.setDescription("This unit focuses on eigenvalues, which are special numbers associated with a matrix. Students will learn how to calculate eigenvalues, understand their significance, and explore their applications in various mathematical and engineering problems.");

        Unit unit12_5 = new Unit();
        unit12_5.setName("Eigenvectors");
        unit12_5.setDescription("In this unit, students will study eigenvectors, which are vectors associated with eigenvalues that remain in the same direction under a linear transformation. They will learn how to find eigenvectors and understand their importance in matrix diagonalization and systems of linear equations.");

// Add units to a list
        List<Unit> units12 = new ArrayList<>();
        units12.add(unit12_1);
        units12.add(unit12_2);
        units12.add(unit12_3);
        units12.add(unit12_4);
        units12.add(unit12_5);

// Set the units in the course
        course12.setUnits(units12);


        Syllabus syllabus13 = new Syllabus();
        syllabus13.setObjectives("Introduction to statistical methods and their applications.");
        syllabus13.setTopics("Probability, Descriptive Statistics, Inferential Statistics.");
        syllabus13.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course13 = new Course();
        course13.setName("Statistics");
        course13.setDescription("Introduction to statistical methods and their applications.");
        course13.setSubject("Mathematics");
        course13.setCredits(3);
        course13.setSyllabus(syllabus13);

// Create the units
        Unit unit13_1 = new Unit();
        unit13_1.setName("Probability");
        unit13_1.setDescription("In this unit, students will learn about probability theory, including the concepts of random variables, probability distributions, and expected value. They will explore different probability models and their applications in real-world scenarios.");

        Unit unit13_2 = new Unit();
        unit13_2.setName("Descriptive Statistics");
        unit13_2.setDescription("This unit covers descriptive statistics, which summarize and describe the main features of a dataset. Students will learn how to calculate and interpret measures of central tendency (mean, median, mode) and measures of variability (range, variance, standard deviation).");

        Unit unit13_3 = new Unit();
        unit13_3.setName("Inferential Statistics");
        unit13_3.setDescription("In this unit, students will explore inferential statistics, which allow them to make inferences and predictions about a population based on a sample of data. They will learn about hypothesis testing, confidence intervals, and regression analysis.");

// Add units to a list
        List<Unit> units13 = new ArrayList<>();
        units13.add(unit13_1);
        units13.add(unit13_2);
        units13.add(unit13_3);

// Set the units in the course
        course13.setUnits(units13);


        Syllabus syllabus14 = new Syllabus();
        syllabus14.setObjectives("Study of mathematical structures that are fundamentally discrete.");
        syllabus14.setTopics("Logic, Set Theory, Graph Theory, Combinatorics.");
        syllabus14.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course14 = new Course();
        course14.setName("Discrete Mathematics");
        course14.setDescription("Study of mathematical structures that are fundamentally discrete rather than continuous.");
        course14.setSubject("Mathematics");
        course14.setCredits(3);
        course14.setSyllabus(syllabus14);

// Create the units
        Unit unit14_1 = new Unit();
        unit14_1.setName("Logic");
        unit14_1.setDescription("In this unit, students will learn about the fundamentals of logic, including propositional and predicate logic. They will understand how to form logical statements, use logical connectives, and apply logical reasoning in problem-solving.");

        Unit unit14_2 = new Unit();
        unit14_2.setName("Set Theory");
        unit14_2.setDescription("This unit covers set theory, the study of sets, which are collections of objects. Students will explore the concepts of subsets, unions, intersections, and Cartesian products, and apply these concepts to solve problems involving sets.");

        Unit unit14_3 = new Unit();
        unit14_3.setName("Graph Theory");
        unit14_3.setDescription("In this unit, students will explore graph theory, the study of graphs as mathematical structures used to model pairwise relations between objects. They will learn about different types of graphs, such as directed and undirected graphs, and apply algorithms for traversing and analyzing graphs.");

        Unit unit14_4 = new Unit();
        unit14_4.setName("Combinatorics");
        unit14_4.setDescription("This unit focuses on combinatorics, the study of counting, arrangement, and combination of objects. Students will learn about permutations, combinations, and the principles of counting, and apply these techniques to solve combinatorial problems.");

// Add units to a list
        List<Unit> units14 = new ArrayList<>();
        units14.add(unit14_1);
        units14.add(unit14_2);
        units14.add(unit14_3);
        units14.add(unit14_4);

// Set the units in the course
        course14.setUnits(units14);


// Science Courses

        Syllabus syllabus15 = new Syllabus();
        syllabus15.setObjectives("Introduction to classical mechanics.");
        syllabus15.setTopics("Newton's Laws, Energy Principles, Motion.");
        syllabus15.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course15 = new Course();
        course15.setName("Physics I");
        course15.setDescription("Introduction to classical mechanics, including Newton's laws and energy principles.");
        course15.setSubject("Physics");
        course15.setCredits(4);
        course15.setSyllabus(syllabus15);

// Create the units
        Unit unit15_1 = new Unit();
        unit15_1.setName("Newton's Laws");
        unit15_1.setDescription("In this unit, students will learn about Newton's laws of motion, which describe the relationship between the motion of an object and the forces acting on it. They will understand and apply these laws to solve problems in mechanics.");

        Unit unit15_2 = new Unit();
        unit15_2.setName("Energy Principles");
        unit15_2.setDescription("This unit covers the principles of energy, including kinetic and potential energy, work, and the conservation of energy. Students will learn how to calculate energy and work, and understand the concepts of power and efficiency.");

        Unit unit15_3 = new Unit();
        unit15_3.setName("Motion");
        unit15_3.setDescription("In this unit, students will explore the concepts of motion, including linear motion, projectile motion, and circular motion. They will learn about velocity, acceleration, and the equations of motion, and apply these concepts to analyze different types of motion.");

// Add units to a list
        List<Unit> units15 = new ArrayList<>();
        units15.add(unit15_1);
        units15.add(unit15_2);
        units15.add(unit15_3);

// Set the units in the course
        course15.setUnits(units15);


        Syllabus syllabus16 = new Syllabus();
        syllabus16.setObjectives("Introduction to chemical principles.");
        syllabus16.setTopics("Atomic Structure, Chemical Bonding, Reactions.");
        syllabus16.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course16 = new Course();
        course16.setName("Chemistry I");
        course16.setDescription("Introduction to chemical principles, including atomic structure and chemical bonding.");
        course16.setSubject("Chemistry");
        course16.setCredits(4);
        course16.setSyllabus(syllabus16);

// Create the units
        Unit unit16_1 = new Unit();
        unit16_1.setName("Atomic Structure");
        unit16_1.setDescription("In this unit, students will learn about the structure of atoms, including subatomic particles (protons, neutrons, electrons), atomic number, mass number, and isotopes. They will understand how these components define elements and their properties.");

        Unit unit16_2 = new Unit();
        unit16_2.setName("Chemical Bonding");
        unit16_2.setDescription("This unit covers chemical bonding, the process by which atoms combine to form molecules and compounds. Students will explore different types of bonds, including ionic, covalent, and metallic bonds, and understand the principles that govern bond formation.");

        Unit unit16_3 = new Unit();
        unit16_3.setName("Reactions");
        unit16_3.setDescription("In this unit, students will study chemical reactions, including the reactants, products, and types of chemical reactions. They will learn about reaction rates, equilibrium, and the factors that influence chemical reactions.");

// Add units to a list
        List<Unit> units16 = new ArrayList<>();
        units16.add(unit16_1);
        units16.add(unit16_2);
        units16.add(unit16_3);

// Set the units in the course
        course16.setUnits(units16);


        Syllabus syllabus17 = new Syllabus();
        syllabus17.setObjectives("Introduction to cellular biology, genetics, and evolution.");
        syllabus17.setTopics("Cell Structure, Genetics, Evolution, Ecology.");
        syllabus17.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course17 = new Course();
        course17.setName("Biology I");
        course17.setDescription("Introduction to cellular biology, genetics, and evolution.");
        course17.setSubject("Biology");
        course17.setCredits(4);
        course17.setSyllabus(syllabus17);

// Create the units
        Unit unit17_1 = new Unit();
        unit17_1.setName("Cell Structure");
        unit17_1.setDescription("In this unit, students will learn about the structure and function of cells, including the cell membrane, nucleus, organelles, and the differences between prokaryotic and eukaryotic cells.");

        Unit unit17_2 = new Unit();
        unit17_2.setName("Genetics");
        unit17_2.setDescription("This unit covers genetics, the study of heredity and the variation of inherited characteristics. Students will explore the principles of Mendelian genetics, the structure and function of DNA, and the processes of replication, transcription, and translation.");

        Unit unit17_3 = new Unit();
        unit17_3.setName("Evolution");
        unit17_3.setDescription("In this unit, students will explore the theory of evolution, natural selection, and the evidence supporting evolutionary change. They will understand how genetic variation and environmental factors contribute to the evolution of species.");

        Unit unit17_4 = new Unit();
        unit17_4.setName("Ecology");
        unit17_4.setDescription("This unit focuses on ecology, the study of interactions between organisms and their environment. Students will learn about ecosystems, food webs, energy flow, and the impact of human activities on the environment.");

// Add units to a list
        List<Unit> units17 = new ArrayList<>();
        units17.add(unit17_1);
        units17.add(unit17_2);
        units17.add(unit17_3);
        units17.add(unit17_4);

// Set the units in the course
        course17.setUnits(units17);


        Syllabus syllabus18 = new Syllabus();
        syllabus18.setObjectives("Overview of engineering disciplines and problem-solving techniques.");
        syllabus18.setTopics("Engineering Disciplines, Problem-Solving, Design Process.");
        syllabus18.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course18 = new Course();
        course18.setName("Introduction to Engineering");
        course18.setDescription("Overview of engineering disciplines and problem-solving techniques.");
        course18.setSubject("Engineering");
        course18.setCredits(3);
        course18.setSyllabus(syllabus18);

// Create the units
        Unit unit18_1 = new Unit();
        unit18_1.setName("Engineering Disciplines");
        unit18_1.setDescription("In this unit, students will learn about the various engineering disciplines, including civil, mechanical, electrical, and chemical engineering. They will explore the roles and responsibilities of engineers in each field and understand the diverse applications of engineering.");

        Unit unit18_2 = new Unit();
        unit18_2.setName("Problem-Solving");
        unit18_2.setDescription("This unit covers problem-solving techniques used in engineering. Students will learn about the engineering problem-solving process, including identifying problems, generating solutions, and selecting the best solution. They will apply these techniques to real-world engineering challenges.");

        Unit unit18_3 = new Unit();
        unit18_3.setName("Design Process");
        unit18_3.setDescription("In this unit, students will explore the engineering design process, a systematic approach to solving engineering problems. They will learn about the stages of the design process, including defining requirements, brainstorming, prototyping, testing, and iteration.");

// Add units to a list
        List<Unit> units18 = new ArrayList<>();
        units18.add(unit18_1);
        units18.add(unit18_2);
        units18.add(unit18_3);

// Set the units in the course
        course18.setUnits(units18);


        Syllabus syllabus19 = new Syllabus();
        syllabus19.setObjectives("Fundamentals of electrical circuits, signals, and systems.");
        syllabus19.setTopics("Circuit Analysis, Signal Processing, Systems Theory.");
        syllabus19.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course19 = new Course();
        course19.setName("Electrical Engineering Basics");
        course19.setDescription("Fundamentals of electrical circuits, signals, and systems.");
        course19.setSubject("Engineering");
        course19.setCredits(4);
        course19.setSyllabus(syllabus19);

// Create the units
        Unit unit19_1 = new Unit();
        unit19_1.setName("Circuit Analysis");
        unit19_1.setDescription("In this unit, students will learn about the principles of circuit analysis, including Ohm's law, Kirchhoff's laws, and techniques for analyzing DC and AC circuits. They will understand how to calculate voltage, current, and resistance in electrical circuits.");

        Unit unit19_2 = new Unit();
        unit19_2.setName("Signal Processing");
        unit19_2.setDescription("This unit covers the fundamentals of signal processing, including the analysis and manipulation of signals. Students will learn about Fourier transforms, filtering, and the applications of signal processing in communication systems and digital signal processing (DSP).");

        Unit unit19_3 = new Unit();
        unit19_3.setName("Systems Theory");
        unit19_3.setDescription("In this unit, students will explore systems theory, the study of systems and their behavior. They will learn about system modeling, feedback, and control systems, and understand how to apply these concepts to analyze and design electrical systems.");

// Add units to a list
        List<Unit> units19 = new ArrayList<>();
        units19.add(unit19_1);
        units19.add(unit19_2);
        units19.add(unit19_3);

// Set the units in the course
        course19.setUnits(units19);


        Syllabus syllabus20 = new Syllabus();
        syllabus20.setObjectives("Introduction to the principles of mechanics and thermodynamics.");
        syllabus20.setTopics("Statics, Dynamics, Thermodynamics, Material Science.");
        syllabus20.setEvaluationCriteria("Assignments (40%), Projects (30%), Tests (30%)");

        Course course20 = new Course();
        course20.setName("Mechanical Engineering Principles");
        course20.setDescription("Introduction to the principles of mechanics and thermodynamics.");
        course20.setSubject("Engineering");
        course20.setCredits(4);
        course20.setSyllabus(syllabus20);

// Create the units
        Unit unit20_1 = new Unit();
        unit20_1.setName("Statics");
        unit20_1.setDescription("In this unit, students will learn about statics, the branch of mechanics that deals with bodies at rest and forces in equilibrium. They will understand how to analyze force systems, calculate moments, and solve problems related to static equilibrium.");

        Unit unit20_2 = new Unit();
        unit20_2.setName("Dynamics");
        unit20_2.setDescription("This unit covers dynamics, the study of bodies in motion. Students will explore kinematics and kinetics, understand the principles of Newton's laws of motion, and learn how to analyze the motion of particles and rigid bodies.");

        Unit unit20_3 = new Unit();
        unit20_3.setName("Thermodynamics");
        unit20_3.setDescription("In this unit, students will explore the principles of thermodynamics, including the laws of thermodynamics, energy transfer, and the behavior of gases and liquids. They will understand how to apply these principles to solve engineering problems involving heat and work.");

        Unit unit20_4 = new Unit();
        unit20_4.setName("Material Science");
        unit20_4.setDescription("This unit focuses on material science, the study of the properties and behavior of materials. Students will learn about different types of materials, including metals, ceramics, polymers, and composites, and understand how to select materials for specific engineering applications.");

// Add units to a list
        List<Unit> units20 = new ArrayList<>();
        units20.add(unit20_1);
        units20.add(unit20_2);
        units20.add(unit20_3);
        units20.add(unit20_4);

// Set the units in the course
        course20.setUnits(units20);


    }
}
