public class App {
    public static void main(String[] args) throws Exception {
        SpecialDriv specialDriv = new SpecialDriv();
        BMW bmw = new BMW(specialDriv);
        bmw.drive();
        
    }
}
