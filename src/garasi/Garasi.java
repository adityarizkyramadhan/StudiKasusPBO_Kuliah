package garasi;

import java.util.Stack;
import mobil.*;
// Nyimpan mobil
public class Garasi {
    // Save mobil with stack
    private Stack<Mobil> stack;
    public Garasi() {
        stack = new Stack<Mobil>();
    }
    // Add mobil to garasi
    public void masukkanMobil(Mobil mobil) {
        stack.push(mobil);
    }
    // Remove mobil from garasi
    public Mobil ambilMobil() {
        return stack.pop();
    }
    // Get mobil from garasi
    public Mobil lihatMobil(int index) {
        return stack.get(index);
    }
    // Get mobil from garasi
    public Mobil lihatMobil(String nmerkMobil) {
        for (Mobil mobil : stack) {
            if (mobil.getNmerkMobil().equals(nmerkMobil)) {
                return mobil;
            }
        }
        return null;
    }
    public void getInfoGarasi() {
        if (stack.isEmpty()) {
            System.out.println("Garasi kosong");
        } else {
            System.out.println("Mobil yang ada di garasi");
            for (Mobil mobil : stack) {
                mobil.cetakInfo();
            }
        }
    }
}