public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
    float bmi = service.calculate(70.5f,1.64f);
        System.out.println(bmi);
    }
}
