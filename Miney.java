/*<applet Code = "Miney" width = "400" height = "400"></applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Miney extends Applet implements ActionListener {

Button stop,play;
Label l1;
AudioClip a;
public void init(){
play = new Button("play");
add(play);
play.addActionListener(this);

   stop = new Button("stop");
   add(stop);
   stop.addActionListener(this);

l1 = new Label("song will play");
  add(l1);
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
