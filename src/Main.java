public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodymass = 55;
        double bodyheight = 1.61;
        double index = service.calculate(bodymass , bodyheight);
        String result = String.format("%.2f", index);
        System.out.println("Your body index is: " + result);
    }
}