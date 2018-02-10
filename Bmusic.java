/*<applet code = "Bmusic" width = "300" height = "300"> </applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Bmusic extends Applet implements ActionListener {
Button play,stop;
AudioClip a;

  public void init(){

 play = new Button("play");
 add(play);
 play.addActionListener(this);
 stop = new Button("stop");
 add(stop);
 stop.addActionListener(this);
 a = getAudioClip(getCodeBase(),"Itachi_Uchiha_Theme_-_Extended_Full-HD.wav");
 }

 public void actionPerformed(ActionEvent ae){
 Button source = (Button)ae.getSource();
 if(ae.getSource()==play){
    a.play();
 }

 else if(ae.getSource()==stop){
    a.stop();

 }
   }
     }
