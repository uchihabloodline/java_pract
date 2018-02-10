/*<applet code ="Aplet" width="300" height = "100"> </applet>*/

import java.awt.*;

import java.applet.*;

class Aplet extends Applet {

 public void init()
 {
  System.out.println("init function called..");

 }

 public void start(){
 System.out.println(" start function called..and yes its called");

 }
public void stop(){
System.out.println("stop function called..");

}
public void destroy(){
System.out.println("destroy function called..");
}

}
