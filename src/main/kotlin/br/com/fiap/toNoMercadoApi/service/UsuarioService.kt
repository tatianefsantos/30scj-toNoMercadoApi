package br.com.fiap.toNoMercadoApi.service

import br.com.fiap.toNoMercadoApi.entity.Usuario
import br.com.fiap.toNoMercadoApi.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsuarioService {

    @Autowired
    lateinit var repository: UsuarioRepository

    fun salvar(usuario: Usuario){
        repository.save(usuario)
    }

    fun excluir(usuario: Usuario){
        repository.delete(usuario)
    }

    fun atualizar(usuario: Usuario){
        repository.save(usuario)
    }

    fun buscarPorNome(nome: String) : Usuario?{
        return repository.findByNomeUsuario(nome)
    }
}