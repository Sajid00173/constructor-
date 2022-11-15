public class cons{
    int modelYear;
    String modelName;

    public cons(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        cons myCar = new cons(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}