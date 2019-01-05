
package model;


public class ModelProdutos {

    private String Descricao;
    private String UnidadeDeVenda;
    private float Preco;
    private int Quantidade;
    private int CodProduto;
   
    public String getDescricao() {
        return Descricao;
    }

   
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

   
    public String getUnidadeDeVenda() {
        return UnidadeDeVenda;
    }

    
    public void setUnidadeDeVenda(String UnidadeDeVenda) {
        this.UnidadeDeVenda = UnidadeDeVenda;
    }

  
    public float getPreco() {
        return Preco;
    }

    
    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

   
    public int getQuantidade() {
        return Quantidade;
    }

   
    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    
    public int getCodProduto() {
        return CodProduto;
    }

    
    public void setCodProduto(int CodProduto) {
        this.CodProduto = CodProduto;
    }
    
}
