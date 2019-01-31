package ds1;

public class PersonQueue {

    private person[] people;
    private int front;
    private int rear;

    public PersonQueue(int totalPeople)
    {
        people = new person[totalPeople];
        front = -1;
        rear = -1;
    }

    public void enqueue(person person1)
    {
        front = 0;
        if(rear != people.length-1)
        {
            rear++;
            people[rear] = person1;
        }
    }

    public person dequeue(){
        person temp = null;

        if(rear != -1)
        {
            temp = people[front];
        }

        return temp;
    }


}

class person{
    private String name;
    private int age;
    private long adhaar;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getAdhaar() {
        return adhaar;
    }

    public void setAdhaar(long adhaar) {
        this.adhaar = adhaar;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "( " + name + ", " + age + ", " + adhaar +", "+ gender + " )";
    }
}
