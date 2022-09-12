// JAVA DA - 3
// by Dhruv Rajeshkumar Shah
// 21BCE0611

class Subject {
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subId, String name, int maxMarks) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubId() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    boolean isQualified() {
        return marksObtained >= (maxMarks * 0.4);
    }

    public String toString() {
        return "Subject ID: " + subId + "\nSubject Name: " + name + "\nMaximum Marks: " + maxMarks
                + "\nMarks Obtained: " + marksObtained + "\nPassed: " + isQualified() + "\n";
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Subject sub1 = new Subject("CS101", "Computer Programming", 100);
        Subject sub2 = new Subject("CS102", "Data Structures", 100);
        Subject sub3 = new Subject("CS103", "Discrete Mathematics", 100);

        sub1.setMarksObtained(80);
        sub2.setMarksObtained(70);
        sub3.setMarksObtained(30);

        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(sub3);

    }

}
