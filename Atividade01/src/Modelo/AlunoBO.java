package Modelo;

import Modelo.entidades.Aluno;
import Modelo.persistencia.AlunoDAO;
import Modelo.persistencia.DadosException;
import java.util.ArrayList;
import java.util.List;

public class AlunoBO implements BO<Aluno> {

    @Override
    public List<Aluno> listar()throws NegocioException {
     List<Aluno> lista = new ArrayList<Aluno>();
        AlunoDAO dao = new AlunoDAO();

        try {
            lista = dao.listar();
            if (lista.isEmpty()) {
                throw new NegocioException("Nenhum aluno cadastrado!");
            }
        } catch (DadosException ex) {
            throw new NegocioException("Ocorreu um erro", ex);
        }

        return lista;
    }

        @Override
        public void validar
        (Aluno entidade) throws NegocioException {
            if (entidade.getMatricula() == 0) {
                throw new NegocioException("Campo obrigatório MATRÍCULA não informado!");
            }
            if (entidade.getNome().isEmpty()) {
                throw new NegocioException("Campo obrigatório MATRÍCULA não informado!");
            }
        }

            @Override
            public void incluir
            (Aluno entidade) throws NegocioException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void Alterar
            (Aluno entidade) throws NegocioException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void excluir
            (int id) throws NegocioException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Aluno consultar
            (int id) throws NegocioException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        }
