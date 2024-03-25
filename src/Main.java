import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        float fatMan;
        int fatManIndex;
        ArrayList <Student>arrayList = new ArrayList<Student>();
        arrayList.add(new Student("홍길동",175,75));
        arrayList.add(new Student("이서경", 180, 78));
        arrayList.add(new Student("이영희", 155, 49));
        arrayList.add(new Student("김멋사123", 182, 82));
        fatMan = arrayList.get(0).getBMI();
        fatManIndex = 0;
        for(int i=1;i<arrayList.size();i++) {
            if(fatMan<arrayList.get(i).getBMI()) {
                fatMan = arrayList.get(i).getBMI();
                fatManIndex=i;
            }
        }
        arrayList.remove(fatManIndex);
        for(int i=0;i<arrayList.size();i++) {
            arrayList.get(i).printIntro();
            arrayList.get(i).say();
        }
    }
}