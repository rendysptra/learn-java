public class Student {

    static int totalStudent;
    static double totalGrade;
    static int IDIteration = 1;
    
    private int id;
    private String name;
    private String major;
    private double grade;

    Student(String name, String major, double grade){
        this.name = name;
        this.major = major;
        this.grade = grade;
        this.id = IDIteration;

        IDIteration++;
        totalStudent++;
        totalGrade += this.grade;
    }

    static double averageGrade(){
        
        if(totalStudent == 0){
            return 0;
        }
        
        return totalGrade / totalStudent;
    }
    
    public int getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getMajor(){
        return this.major;
    }

    public double getGrade(){
        return this.grade;
    }
    
    @Override
    public String toString(){
        return "ID: "+ String.valueOf(id) + " | " + "Name: " + name + " | " + "Major: " + major + " | " + "Grade: " + String.valueOf(grade);
    }
    
}
