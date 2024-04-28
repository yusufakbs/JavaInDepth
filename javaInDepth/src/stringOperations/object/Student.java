package stringOperations.object;

public class Student {
    private long studentId;
    private String studentName;
    private double averageMark;

    public Student(long studentId, String studentName, double averageMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
