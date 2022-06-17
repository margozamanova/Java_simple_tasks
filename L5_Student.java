// Измените класс StudentTest так, чтобы среднюю арифметическую оценку студента выводил на экран метод
// То есть создайте 1 метод, параметр которого - это объект класса Student,
// а в теле метода будет вычисляться средняя арифметическая оценка и выводиться на экран



package Homework.Lesson5;

public class Student {

        int StudentID;
        String FirstName;
        String LastName;
        int GradeYear;
        double AvScoreMath;
        double AvScoreEconomics;
        double AvScoreEngl;
    }

    class StudentTest {

    double AverageScore(Student st) {
        double Average = (st.AvScoreMath + st.AvScoreEconomics + st.AvScoreEngl) / 3;
        System.out.println("Average Score of Student " + st.FirstName + " "  + st.LastName + ": " + Average);
        return Average;
    }

        public static void main(String[] args) {

            Student st1 = new Student();
            Student st2 = new Student();
            Student st3 = new Student();

            st1.StudentID = 2569;
            st1.FirstName = "Pavel";
            st1.LastName = "Mikado";
            st1.GradeYear = 1;
            st1.AvScoreMath = 4.5;
            st1.AvScoreEconomics = 5.0;
            st1.AvScoreEngl = 4.9;

            st2.StudentID = 3654;
            st2.FirstName = "Ivan";
            st2.LastName = "Kikosyan";
            st2.GradeYear = 2;
            st2.AvScoreMath = 3.8;
            st2.AvScoreEconomics = 4.1;
            st2.AvScoreEngl = 5.0;

            st3.StudentID = 1111;
            st3.FirstName = "Margarita";
            st3.LastName = "Zamanova";
            st3.GradeYear = 1;
            st3.AvScoreMath = 5.0;
            st3.AvScoreEconomics = 5.0;
            st3.AvScoreEngl = 5.0;

           // System.out.println("Average Score " + st1.FirstName + " " + st1.LastName + ": " + (st1.AvScoreMath + st1.AvScoreEconomics + st1.AvScoreEngl)/3);
           // System.out.println("Average Score " + st2.FirstName + " " + st2.LastName + ": " + (st2.AvScoreMath + st2.AvScoreEconomics + st2.AvScoreEngl)/3);
           // System.out.println("Average Score " + st3.FirstName + " " + st3.LastName + ": " + (st3.AvScoreMath + st3.AvScoreEconomics + st3.AvScoreEngl)/3);

            StudentTest sTest = new StudentTest();
            sTest.AverageScore(st1);
            sTest.AverageScore(st2);
            sTest.AverageScore(st3);
        }
}
