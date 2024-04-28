package stringOperations.object;

import java.util.StringTokenizer;

public class Test {

    private static String format(Student student){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(student.getStudentId()).append("|");
        stringBuilder.append(student.getStudentName()).append("|");
        stringBuilder.append(student.getAverageMark());

        return stringBuilder.toString();
    }

//    private static String format2(Student student){
//        return String.format("%d|%s|%f",student.getStudentId(),student.getStudentName(),student.getAverageMark());
//    }

    private static Student parse(String str){
        StringTokenizer tokenizer = new StringTokenizer(str,"|");
        long studentId = Long.parseLong(tokenizer.nextToken());
        String studentName = tokenizer.nextToken();
        double averageMark = Double.parseDouble(tokenizer.nextToken());
        return new Student(studentId,studentName,averageMark);

    }

//    private static Student parse2(String str){
//        String[] tokens = str.split("\\|");
//        long studentId = Long.parseLong(tokens[0]);
//        String studentName = tokens[1];
//        double averageMark = Double.parseDouble(tokens[2]);
//
//        return  new Student(studentId,studentName,averageMark);
//    }


    public static void main(String[] args) {
        Student student = new Student(901,"Ali Bedir",3.3);
        String text = format(student);
        System.out.println("Katar : " + text);
//        String text2 = format2(student);
//        System.out.println("Katar2:" + text2);
        Student student1 = parse(text);
        System.out.println(student1.getStudentId() + ", " + student1.getStudentName() + ", " + student1.getAverageMark());
    }
}
