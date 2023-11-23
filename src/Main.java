public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        int myBmi = service.calculate(83, 1.8);
        // weight - кг,
        // height - метр.
        System.out.println(myBmi);
    }
}