public class App {

    public static void main(String[] args) throws Exception {
        Controle_Estoque estoque = new Controle_Estoque();
        estoque.setProdutoNome("Thinkpad");
        estoque.setProdutoMarca("Lenovo");
        estoque.setvalorProduto(4000);
        estoque.setQuantidade(10);
        estoque.imprimir();
        estoque.Vender(4, "Thinkpad", 4000);
        estoque.imprimir();
    }

}
