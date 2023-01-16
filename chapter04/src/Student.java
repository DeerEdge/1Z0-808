
/*
    Conditional Operator (?:) can be used in place of an if-else statement. It is the only ternary operator in Java
    (taking three operands).

    Ex.
        System.out.println(studentGrade >= 60 ? "Passed" : "Failed")
        System.out.println(condition evaluating to Boolean ? execute if True : execute otherwise)
 */

public class Student
{
    private String name;
    private double average;

    // constructor that initializes instance variables name and average
    public Student(String name, double average) {
        this.name = name;

        // validate that average is between 0.0 and 100.0 (inclusive)
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;
    }

    // method that sets the name of the student
    public void setName(String name)
    {
        this.name = name;
    }

    // method that retrieves the name of the student
    public String getName()
    {
        return name;
    }

    // method that sets the average of the student
    public void setAverage(double studentAverage)
    {
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;
    }

    // method that retrieves the average of the student
    public double getAverage()
    {
        return average;
    }

    // determines and returns the Student's letter grade
    public String getLetterGrade()
    {
        String letterGrade = "";

        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;
    }
}
