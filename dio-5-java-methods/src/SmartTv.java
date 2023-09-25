public class SmartTv {
    boolean state = false;
    int channel = 1;
    int volume = 30;

    public void changeChannel(int num){
        channel = num;
    }
    public void changeChannelUp(){
        channel++;
    }
    public void changeChannelDown(){
        channel--;
    }
    public void turnUpVolume(){
        volume++;
    }
    public void turnDownVolume(){
        volume--;
    }

    public void turnOn(){
        state = true;
    }
    public void turnOff(){
        state = false;
    }
}
