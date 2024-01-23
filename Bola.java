
package Inheritance22;

public class Bola extends BangunRuang{
    float r;
    
    @Override
    float volume(){
        float volume = 4/3 * 22/7 * r *r *r;
        System.out.println("Volume Bola : " + volume);
        return volume;
        
    }
}
