package br.com.fiap.toNoMercadoApi.repository

import br.com.fiap.toNoMercadoApi.entity.Produto
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProdutoRepository: MongoRepository<Produto, String> {
    fun findByNomeProduto(nome: String): Produto
    fun findByDepartamento(departamento: String): List<Produto>?
    fun findByMarca(marca: String): List<Produto>?
}