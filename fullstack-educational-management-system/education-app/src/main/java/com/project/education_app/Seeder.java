package com.project.education_app;

import com.project.education_app.entities.*;
import com.project.education_app.repos.AnnouncementRepo;
import com.project.education_app.repos.FacultyRepo;
import com.project.education_app.repos.GuardianRepo;
import com.project.education_app.repos.StudentRepo;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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


        Course course1 = new Course();
        course1.setName("Introduction to Programming");
        course1.setDescription("Learn the basics of programming using Python.");
        course1.setSubject("Computer Science");
        course1.setCredits(4);

        Course course2 = new Course();
        course2.setName("Data Structures");
        course2.setDescription("An in-depth study of data structures such as arrays, linked lists, stacks, queues, and trees.");
        course2.setSubject("Computer Science");
        course2.setCredits(3);

        Course course3 = new Course();
        course3.setName("Algorithms");
        course3.setDescription("Explore the design and analysis of algorithms, including sorting and searching algorithms.");
        course3.setSubject("Computer Science");
        course3.setCredits(3);

        Course course4 = new Course();
        course4.setName("Database Management Systems");
        course4.setDescription("Introduction to database concepts, SQL, and database design.");
        course4.setSubject("Computer Science");
        course4.setCredits(3);

        Course course5 = new Course();
        course5.setName("Operating Systems");
        course5.setDescription("Study the fundamental concepts of operating systems, including processes, memory management, and file systems.");
        course5.setSubject("Computer Science");
        course5.setCredits(3);

        Course course6 = new Course();
        course6.setName("Computer Networks");
        course6.setDescription("Learn about the principles of computer networking, including the OSI model, TCP/IP, and network protocols.");
        course6.setSubject("Computer Science");
        course6.setCredits(3);

        Course course7 = new Course();
        course7.setName("Software Engineering");
        course7.setDescription("Introduction to software development methodologies, project management, and software life cycle.");
        course7.setSubject("Computer Science");
        course7.setCredits(4);

        Course course8 = new Course();
        course8.setName("Web Development");
        course8.setDescription("Learn to create dynamic websites using HTML, CSS, JavaScript, and frameworks such as React.");
        course8.setSubject("Computer Science");
        course8.setCredits(3);

        Course course9 = new Course();
        course9.setName("Artificial Intelligence");
        course9.setDescription("Explore the basics of artificial intelligence, including machine learning, neural networks, and natural language processing.");
        course9.setSubject("Computer Science");
        course9.setCredits(4);

        Course course10 = new Course();
        course10.setName("Cybersecurity");
        course10.setDescription("Introduction to the principles of cybersecurity, including threat analysis, encryption, and network security.");
        course10.setSubject("Computer Science");
        course10.setCredits(3);

        Course course11 = new Course();
        course11.setName("Calculus I");
        course11.setDescription("Introduction to differential and integral calculus.");
        course11.setSubject("Mathematics");
        course11.setCredits(4);

        Course course12 = new Course();
        course12.setName("Linear Algebra");
        course12.setDescription("Study of vector spaces, matrices, and linear transformations.");
        course12.setSubject("Mathematics");
        course12.setCredits(3);

        Course course13 = new Course();
        course13.setName("Statistics");
        course13.setDescription("Introduction to statistical methods and their applications.");
        course13.setSubject("Mathematics");
        course13.setCredits(3);

        Course course14 = new Course();
        course14.setName("Discrete Mathematics");
        course14.setDescription("Study of mathematical structures that are fundamentally discrete rather than continuous.");
        course14.setSubject("Mathematics");
        course14.setCredits(3);

        Course course15 = new Course();
        course15.setName("Physics I");
        course15.setDescription("Introduction to classical mechanics, including Newton's laws and energy principles.");
        course15.setSubject("Physics");
        course15.setCredits(4);

        Course course16 = new Course();
        course16.setName("Chemistry I");
        course16.setDescription("Introduction to chemical principles, including atomic structure and chemical bonding.");
        course16.setSubject("Chemistry");
        course16.setCredits(4);

        Course course17 = new Course();
        course17.setName("Biology I");
        course17.setDescription("Introduction to cellular biology, genetics, and evolution.");
        course17.setSubject("Biology");
        course17.setCredits(4);

        Course course18 = new Course();
        course18.setName("Introduction to Engineering");
        course18.setDescription("Overview of engineering disciplines and problem-solving techniques.");
        course18.setSubject("Engineering");
        course18.setCredits(3);

        Course course19 = new Course();
        course19.setName("Electrical Engineering Basics");
        course19.setDescription("Fundamentals of electrical circuits, signals, and systems.");
        course19.setSubject("Engineering");
        course19.setCredits(4);

        Course course20 = new Course();
        course20.setName("Mechanical Engineering Principles");
        course20.setDescription("Introduction to the principles of mechanics and thermodynamics.");
        course20.setSubject("Engineering");
        course20.setCredits(4);

    }
}
