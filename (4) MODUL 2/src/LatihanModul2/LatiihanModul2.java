
package LatihanModul2;

/**
 *
 * @author inas
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LatiihanModul2 {
    public static void main(String[] args) {
         // membuat objek Hewan dan menambahkan beberapa elemen
        List<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        
         // membuat objek DeleteHewan dan menambahkan beberapa elemen
        List<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        
        System.out.println("hewan : sapi, kelinci, kambing, unta, domba");
        
        // menghapus data pada objek Hewan yang sama dengan data warna pada objek DeleteHewan
        Iterator<String> iterator = Hewan.iterator();
        while (iterator.hasNext()) {
            String hewan = iterator.next();
            if (DeleteHewan.contains(hewan)) {
                iterator.remove();
                
                // menampilkan elemen pada objek Hewan setelah data dihapus
        System.out.println("Isi objek Hewan setelah penghapusan data: " + Hewan);
            }
 }
}
}
    

