package grades;

import java.util.*;

public class GradesApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Student student1 = new Student("John");
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(80);
        Student student2 = new Student("Elisa");
        student2.addGrade(70);
        student2.addGrade(100);
        student2.addGrade(95);
        Student student3 = new Student("Mike");
        student3.addGrade(80);
        student3.addGrade(90);
        student3.addGrade(90);
        Student student4 = new Student("Lilly");
        student4.addGrade(80);
        student4.addGrade(90);
        student4.addGrade(100);
        createStudentHashMap(student1, student2, student3, student4);
    }

    private static void createStudentHashMap(Student student1, Student student2, Student student3, Student student4) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("johnnycodesalot", student1);
        students.put("elisaplaysalot", student2);
        students.put("mikeymikemike", student3);
        students.put("Lillylearnsalot", student4);
        System.out.println(students);

        System.out.println(student1.setName("Irvin"));
        gradeApp(students);
    }

    public static void gradeApp(HashMap<String, Student> students) {
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        for (String gitHubName : students.keySet()) {
            System.out.printf("|%s|  ", gitHubName);
        }
        System.out.println("\n");
        System.out.println("What student would you like to see more information on?\nEnter \"all\" to see all students information\nEnter \"class\" or \"avg\" for the class average\nEnter \"csv\" for a csv report of all the students");
        String userInput = scanner.nextLine().trim();
        getStudentInfoByGitName(students, userInput);
    }

    public static void getStudentInfoByGitName(HashMap<String, Student> students, String userInput) {
        if (students.containsKey(userInput)) {
            Student currentChoice = students.get(userInput);
            System.out.printf("\nStudent Name: %s - GitHub Username: %s\nGrades: %s Current Average: %.2f%%\n\n", currentChoice.getName(), userInput, currentChoice.getGrades().toString(), currentChoice.getGradeAverage());
            askUserProceed(students);
        } else if (userInput.equalsIgnoreCase("all")) {
            getAllGrades(students);
        } else if (userInput.equalsIgnoreCase("class") || userInput.equalsIgnoreCase("avg")) {
            getClassAverage(students);
        } else if (userInput.equalsIgnoreCase("csv")) {
            getCsvFormat(students);
        } else {
            System.out.println("Not a valid input");
            askUserProceed(students);
        }
    }

    public static void getAllGrades(HashMap<String, Student> students) {
        System.out.println("Here are all the students information\n");
        for (String gitHubName : students.keySet()) {
            Student currentChoice = students.get(gitHubName);
            System.out.print("Name: " + currentChoice.getName() + ", Github Username: " + gitHubName + "\nGrades ");
            for (Integer grade : currentChoice.getGrades()) {
                System.out.printf("%d, ", grade);
            }
            System.out.printf("Avg: %.2f", currentChoice.getGradeAverage());
            System.out.println();
        }
        askUserProceed(students);
    }

    public static void getClassAverage(HashMap<String, Student> students) {
        ArrayList<Double> grades = new ArrayList<>();
        for (String gitHubName : students.keySet()) {
            Student currentStudent = students.get(gitHubName);
            grades.add(currentStudent.getGradeAverage());
        }
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        double classAvg = sum / students.size();
        System.out.printf("Class average is: %.2f\n", classAvg);
        askUserProceed(students);
    }

    private static void getCsvFormat(HashMap<String, Student> students) {
        System.out.println("name,github_username,average");
        for (String gitHubName : students.keySet()) {
            Student currentStudent = students.get(gitHubName);
            System.out.printf("%s,%s,%.1f\n",currentStudent.getName(), gitHubName, currentStudent.getGradeAverage());
        }
        askUserProceed(students);
    }

    public static void askUserProceed(HashMap<String, Student> students) {
        System.out.println("Would you like to search again? (y/n)");
        String userProceed = scanner.nextLine();
        if (userProceed.equalsIgnoreCase("y")) {
            gradeApp(students);
        } else {
            System.out.println("Goodbye!");
        }
    }
}
