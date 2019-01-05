package DAO;

import conexoes.ConexaoMySql;
import model.ModelProdutos;

public class DaoProdutos extends ConexaoMySql {

    public int salvarProdutoDAO(ModelProdutos tjModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL("insert into produto("
                    + "descricao,"
                    + "unidade_de_venda,"
                    + "preco,"
                    + "quantidade,"
                    + "cod_produto"
                    + " values ("
                    + "'" + tjModelProdutos.getDescricao() + "',"
                    + "'" + tjModelProdutos.getUnidadeDeVenda() + "',"
                    + "'" + tjModelProdutos.getPreco() + "',"
                    + "'" + tjModelProdutos.getQuantidade() + "',"
                    + "'" + tjModelProdutos.getCodProduto() + "',"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirProdutoDAO(int pCodProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "delete from produtos where cod_produto = '" + pCodProduto + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "update produtos set "
                    + "decricao = '" + pModelProdutos.getDescricao() + "'"
                    + "unidade_de_venda = '" + pModelProdutos.getUnidadeDeVenda() + "'"
                    + "preco = '" + pModelProdutos.getPreco() + "'"
                    + "quantidade = '" + pModelProdutos.getQuantidade() + "'"
                    + "where cod_produtos = '" + pModelProdutos.getCodProduto() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * public ModelProdutos buscarProdutoDAO (int pCodProduto) { ModelProdutos
     * modelProodutos = new ModelProdutos(); try{ this.conectar();
     * this.executarSQL( "select " + "decricao," + "unidade_de_venda," +
     * "preco," + "quantidade," + "cod_produto" + "from produtos where
     * cod_produto = '"+pCodProduto+"'" ); while (this.getResultSet().next()) {
     * modelProodutos.setDescricao(this.getResultSet().getString(1));
     * modelProodutos.setUnidadeDeVenda(this.getResultSet().getString(2));
     * modelProodutos.setPreco(this.getResultSet().getFloat(3));
     * modelProodutos.setQuantidade(this.getResultSet().getInt(4));
     * modelProodutos.setCodProduto(this.getResultSet().getInt(5)); }
     * }catch(Exception e) { e.printStackTrace(); }finally {
     * this.fecharConexao(); } return modelProodutos; }
*
     */
}
