
package Modelo;

import java.util.List;

    
public interface BO<T> {
    List<T> listar() throws NegocioException;
    void validar (T entidade)throws NegocioException;
    
    void incluir(T entidade) throws NegocioException;
    
    void Alterar (T entidade)throws NegocioException;
    
    void excluir (int id )throws NegocioException;
    
    T consultar (int id) throws NegocioException;
    
}    

