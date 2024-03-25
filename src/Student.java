public class Student extends Person{

    Student(String name, float cm, float kg) {
        super(name, cm, kg);
    }
    public void printIntro() {
        System.out.println(getName()+"의 키는 " + getCm() + "cm 이고, 몸무게는 " + getKg() + "이므로 BMI수치는 " + getBMI() + "입니다.");
    }
    public void say() {
        System.out.println("안녕");
    }
}
