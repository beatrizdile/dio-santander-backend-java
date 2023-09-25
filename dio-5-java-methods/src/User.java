public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("State: " + smartTv.state);
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("New State: " + smartTv.state);

        smartTv.changeChannel(42);
        System.out.println("New Channel: " + smartTv.channel);

        smartTv.turnUpVolume();
        smartTv.turnUpVolume();
        smartTv.turnUpVolume();
        smartTv.turnDownVolume();

        System.out.println("New Volume: " + smartTv.volume);
    }
}
