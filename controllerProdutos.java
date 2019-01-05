
package controller;

import DAO.DaoProdutos;
import model.ModelProdutos;


public class controllerProdutos {
    private DaoProdutos daoProdutos = new DaoProdutos() ;
    public int salvarProdutosController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.salvarProdutoDAO(pModelProdutos);
    }
    
    public boolean excluirProdutoController(int pCodigo) {
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    
    public boolean alterarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
}
