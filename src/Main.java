public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        int myBodyMassIndex = service.calculate(83, 1.8);
        // weight - кг,
        // height - метр.
        System.out.println("Мой индекс массы тела составляет: " + myBodyMassIndex + " кг/кв.м");
    }
}