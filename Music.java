/*<applet code = "Music" width = "300" height = "300"> </applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Music extends Applet{
Label l; AudioClip a;

public void init(){

   l = new Label("play song");
   add(l);
   a = getAudioClip(getCodeBase(),"Itachi Uchiha Theme -  Extended_Full-HD.wav");
   a.play();
}
}
