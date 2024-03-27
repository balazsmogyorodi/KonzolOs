
package modell;


public class NyomtathatoUtod extends KonkretOs implements Nyomtathato{

    @Override
    public void nyomtat() {
        
       }
    
    
    
    public String mitTudok(){
        String os = super.mitTudok();
         return os + "\n Nyomtatható vagyok.";
    
    }

    @Override
    public String toString() {
        String os = super.toString();
         return os + "\n Nyomtatható vagyok.";
    
    }
    
    
    
    
    
    
}
