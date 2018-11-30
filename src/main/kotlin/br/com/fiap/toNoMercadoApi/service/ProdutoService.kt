package br.com.fiap.toNoMercadoApi.service

import br.com.fiap.toNoMercadoApi.entity.Produto
import br.com.fiap.toNoMercadoApi.repository.ProdutoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProdutoService {

    @Autowired
    lateinit var repository: ProdutoRepository

    fun salvar(produto: Produto){
        repository.save(produto)
    }

    fun excluir(produto: Produto){
        repository.delete(produto)
    }

    fun atualizar(produto: Produto){
        repository.save(produto)
    }

    fun buscarPorNome(nome: String) : Produto?{
        return repository.findByNomeProduto(nome)
    }

    fun buscarPorDepartamento(departamento: String) : List<Produto>?{
        return repository.findByDepartamento(departamento)
    }

    fun buscarPorMarca(marca: String) : List<Produto>?{
        return repository.findByMarca(marca)
    }

    fun buscarTodos() : List<Produto>{
        return repository.findAll()
    }

}