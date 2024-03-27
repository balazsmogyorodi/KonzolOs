
package modell;

import java.io.Serializable;



public class MenthetoFuto extends KonkretOs implements Serializable{

    
    private String leiras;

   
    public MenthetoFuto(String leiras, boolean van) {
        super(van);
        this.leiras = leiras;
    }
    
    public MenthetoFuto(String leiras) {
       this(leiras, false);
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    @Override
    public String toString() {
        return "MenthetoFuto{" + "leiras=" + leiras + '}';
    }
    
      public String mitTudok(){
         String os = super.mitTudok();
      return os +  ">--- Menthető vagyok.";
    }
    
    

    
}
