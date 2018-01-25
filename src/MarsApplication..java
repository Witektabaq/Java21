class MarsApplication {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot();
        MarsRobot opportunity = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        opportunity.status = "szukanie";
        opportunity.speed = 1;
        opportunity.temperature = -100;
        
        spirit.showAttributes();
        System.out.println("Zwiększenie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperatury.");
        spirit.chekTemperature();
        spirit.showAttributes();
        opportunity.showAttributes();
    }
    
}