public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(2, 4);

        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(3, 4);

        IRobot roboDog1 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog1.display(2, 4);

        IRobot roboDog2 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog2.display(2, 4);



    }
}
