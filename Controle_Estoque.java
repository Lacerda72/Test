
public class Controle_Estoque {

    Produto produto = new Produto();

    public String getProdutoNome() {
        return produto.ProdutoNome;
    }

    public void setProdutoNome(String ProdutoNome) {
        produto.ProdutoNome = ProdutoNome;
    }

    public String getProdutoMarca() {
        return produto.ProdutoMarca;
    }

    public void setProdutoMarca(String ProdutoMarca) {
        produto.ProdutoMarca = ProdutoMarca;
    }

    public float getvalorProduto() {
        return produto.valorProduto;
    }

    public void setvalorProduto(float valorProduto) { produto.valorProduto = valorProduto; }

    public void imprimir(){
        System.out.println("Nome: " + produto.ProdutoNome);
        System.out.println("Marca: " + produto.ProdutoMarca);
        System.out.println("Valor do Produto: " + produto.valorProduto + " Reais");
        System.out.println("Quantidade do Produto: " + produto.QProduto + " Unidades");
    }

    public void setQuantidade(int QProduto){ produto.QProduto = QProduto; }

    public void Vender(int QtdProdutovndd, String ProdutoNome, float valorProduto) {
        produto.QProduto = produto.QProduto - QtdProdutovndd;
        float valorTT;
        valorTT = QtdProdutovndd * valorProduto;
        System.out.println("Valor Total = "+ valorTT);
    }
}
