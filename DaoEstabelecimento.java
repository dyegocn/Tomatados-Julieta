
package DAO;

import conexoes.ConexaoMySql;
import model.ModelEstabelecimento;

public class DaoEstabelecimento extends ConexaoMySql{
    public int salvarEstabelecimentoDAO(ModelEstabelecimento tjModelEstabelecimento) {
        try {
            this.conectar();
            return this.insertSQL("insert into estabelecimento("
                    + "cmd,"
                    + "tipo,"
                    + "telefone,"
                    + "'" + tjModelEstabelecimento.getCmd() + "',"
                    + "'" + tjModelEstabelecimento.getTipo()+ "',"
                    + "'" + tjModelEstabelecimento.getTelefone()+ "',"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirEstabelecimentoDAO(int pCmd) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "delete from estabelecimento where cmd = '" + pCmd + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarEstabelecimentoDAO(ModelEstabelecimento pModelEstabelecimento) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "update estabelecimento set "
                    + "Tipo = '" + pModelEstabelecimento.getTipo() + "'"
                    + "Telefone = '" + pModelEstabelecimento.getTelefone()+ "'"
                    + "where cmd = '" + pModelEstabelecimento.getCmd()+ "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
