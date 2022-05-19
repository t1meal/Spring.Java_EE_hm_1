package resurses;

import java.util.ArrayList;
import java.util.List;

public class ProductGenerator {

    public List<String> generate (Integer quantity, String title){
        List<String> list = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
           list.add(new Product(i+1,title).getProductToString());
        }
        return list;
    }
}
