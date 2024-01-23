
package Inheritance22;

public class Tabung extends BangunRuang{
    float tinggi,r;
    
    @Override
    float volume(){
        float volume = 22/7 * r *r *tinggi;
        System.out.println("Volume tabung : " + volume);
        return volume;
        
    }
}
