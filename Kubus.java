
package Inheritance22;

public class Kubus extends BangunRuang{
    float sisi;
    
       @Override
    float volume(){
        float volume = sisi*sisi*sisi;
        System.out.println("Volume kubus : " + volume);
        return volume;
        
    }
}
