package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private final ArrayList<Integer> grades;
    HashMap<String, String> attendance = new HashMap<>();

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (sum / grades.size());
    }

    public void getAttendance() {
        for (String day : attendance.keySet()) {
            String attendanceStatus = attendance.get(day);
            System.out.printf("%s %s\n", day, attendanceStatus);
        }
    }

    public double getAttendancePercentage() {
        int absentSum = 0;
        int presentSum = 0;
        for (String day : attendance.keySet()) {
            String attendanceStatus = attendance.get(day);
            if (attendanceStatus.equalsIgnoreCase("a")) {
                absentSum += 1;
            } else {
                presentSum += 1;
            }
        }
        return 0;
    }

    public void recordAttendance(String date, String attendance) {
        if (attendance.equalsIgnoreCase("p") || attendance.equalsIgnoreCase("a")) {
            this.attendance.put(date, attendance);
        } else {
            System.out.printf("\"%s\" not valid attendance!\nAttendance value needs to be \"A\" for absent or \"P\" for present\nPlease try again\n", attendance);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("John");
        student1.addGrade(90);
        student1.addGrade(90);
        student1.addGrade(80);

        student1.recordAttendance("2020-10-02", "P");
        student1.recordAttendance("2020-10-03", "A");
        student1.getAttendance();
    }
}
