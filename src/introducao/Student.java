package introducao;

class Student {
    int rno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello, my name is " + this.name);
    }

    Student() {
        this.rno = 13;
        this.name = "Kunal";
        this.marks = 88.5f;


    }
}


