public class Aula3 {

    public static void main(String [] args) {
        Hashmap<Integer, String> produtos = new Hashmap<>();

        produtos.put(101, value: "Monitor");
        produtos.put(102, value: "PC");
        produtos.put(102, value: "Mouse");
        produtos.put(104, value: "Teclado");
        if (produtos.containsKey(key: 102)) {
              System.out.println("Produto: " + produtos.get (key: 102))
        }

        System.out.println("produto 101: " + produtos.get(key: 101);
    }
}