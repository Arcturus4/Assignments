
/* Testiluokka */
public class Main{
public static void main(String[] args){
Curtain curtain = new Curtain();
Command up = new CurtainUp(curtain);
Command down = new CurtainDown(curtain);
ControlButton button1 = new ControlButton(up);
ControlButton button2 = new ControlButton(down);
button1.push();
button2.push();
}
}
