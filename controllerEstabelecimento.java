
package controller;
import DAO.DaoEstabelecimento;
import model.ModelEstabelecimento;

public class controllerEstabelecimento {
    private DaoEstabelecimento daoEstabelecimento = new DaoEstabelecimento();
    public int salvarEstabelecimentoController(ModelEstabelecimento pModelEstabelecimento) {
        return this.daoEstabelecimento.salvarEstabelecimentoDAO(pModelEstabelecimento);
    }
    
    public boolean excluirProdutoController(int pCmd) {
        return this.daoEstabelecimento.excluirEstabelecimentoDAO(pCmd);
    }
    
    public boolean alterarProdutoController(ModelEstabelecimento pModelEstabelecimento) {
        return this.daoEstabelecimento.alterarEstabelecimentoDAO(pModelEstabelecimento);
    }
}
