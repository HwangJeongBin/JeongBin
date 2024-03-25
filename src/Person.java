public class Person {


    private final String name;
    private final float cm;
    private final float kg;
    Person (String name, float cm, float kg) {
        this.name = name;
        this.cm = cm;
        this.kg = kg;
    }
    public float getBMI() {
        return kg/((cm/100)*(cm/100));
    }
    public void say() {
        System.out.println("응애");
    }
    public String getName() {
        return name;
    }
    public float getCm() {
        return cm;
    }
    public float getKg() {
        return kg;
    }
}
