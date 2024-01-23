
package Inheritance22;

public class LimasSegitiga extends BangunRuang{
    float a, tl, ta;
    
       @Override
    float volume(){
        float volume = (float) (1.0/3.0 * a * ta) * tl;
        System.out.println("Volume Limas Segitiga : " + volume);
        return volume;
        
    }
}
