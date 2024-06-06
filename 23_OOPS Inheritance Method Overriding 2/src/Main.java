class TV
{
    public void switchON() {System.out.println("TV witched ON");}
    public void changeChannel() {System.out.println("TV channel is Changed");}
}
class SmartTV extends TV {
    public void switchON() {
        System.out.println("SamrtTV switched ON");
    }

    public void changeChannel() {
        System.out.println("SmartTV channel is Changed");
    }

    public void browse() {
        System.out.println("Smart Tv is browsing");
    }


    public static class Main {
        public static void main(String[] args) {

SmartTV t = new SmartTV();
t.switchON();
t.browse();

        }
    }
}