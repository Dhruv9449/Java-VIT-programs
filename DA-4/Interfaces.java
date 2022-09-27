// JAVA DA - 4
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Parent class
class Phone {
    public void call() {
        System.out.println("Phone call");
    }

    public void sms() {
        System.out.println("Sending SMS");
    }
}

// Interface
interface Camera {
    void click();

    void record();
}

interface MusicPlayer {
    void play();

    void stop();

    void pause();
}

// Child class
class SmartPhone extends Phone implements Camera, MusicPlayer {

    public void call() {
        System.out.println("Smart phone call");
    }

    public void sms() {
        System.out.println("Smart phone sending SMS");
    }

    public void click() {
        System.out.println("Smart phone clicking photo");
    }

    public void record() {
        System.out.println("Smart phone recording video");
    }

    public void play() {
        System.out.println("Smart phone playing music");
    }

    public void stop() {
        System.out.println("Smart phone stopping music");
    }

    public void pause() {
        System.out.println("Smart phone pausing music");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call(); // Smart phone call
        smartPhone.sms(); // Smart phone sending SMS
        smartPhone.click(); // Smart phone clicking photo
        smartPhone.record(); // Smart phone recording video
        smartPhone.play(); // Smart phone playing music
        smartPhone.stop(); // Smart phone stopping music
        smartPhone.pause(); // Smart phone pausing music
    }

}
