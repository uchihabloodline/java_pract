/*<applet code = "SoundExample" width = "400" height = "400"> </applet>*/
import java.applet.*;

import java.awt.*;

public class SoundExample extends Applet

{

       private AudioClip mysound;

       public void init()

        {

                 mysound=getAudioClip(getCodeBase(), "Dimitri Vegas & Like Mike - Live at Tomorrowland 2016 ( FULL Mainstage Set HD )_HD.m4a");

          }

      public void start()

       {

             mysound.loop();

         }

     public void stop()

       {

             mysound.stop();

       }
}
