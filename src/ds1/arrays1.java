package ds1;

import java.util.Scanner;

class student{
    private int roll;
    private String name;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "roll= " + roll + ", name= " + name;
    }
}

public class arrays1 {

    static student[] sectionG;
    private int bottom;

    public void insert(student student1){
        if(bottom != sectionG.length - 1 ){
            bottom++;
            sectionG[bottom] = student1;
        }
    }

    public arrays1(int numberOfStudents){
        sectionG = new student[numberOfStudents];
        bottom = -1;
    }

    public void display()
    {
        for (student stu: sectionG)
        {
            if(stu != null)
            {
                System.out.println(stu);
            }
        }
    }

    public static void main(String[] args) {

        arrays1 list = new arrays1(5);
        Scanner ob = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++)
        {
            student stu1 = new student();
            stu1.setRoll(i+1);
            stu1.setName("Mantri" + i);
            list.insert(stu1);
        }

        list.display();

    }



}
