package br.com.fiap.toNoMercadoApi.repository

import br.com.fiap.toNoMercadoApi.entity.Usuario
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository: MongoRepository<Usuario, String> {
    fun findByNomeUsuario(nome: String): Usuario
}