import java.util.HashMap;

public class Aula3 {
    public static void main(String[] args){
        HashMap<Integer, String> produtos = new HashMap<>();
        
        produtos.put(101, "PC");
        produtos.put(102, "Teclado");
        produtos.put(103, "Mouse");

        System.out.println(produtos);
    }

}
