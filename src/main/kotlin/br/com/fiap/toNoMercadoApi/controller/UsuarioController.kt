package br.com.fiap.toNoMercadoApi.controller

import br.com.fiap.toNoMercadoApi.entity.Usuario
import br.com.fiap.toNoMercadoApi.service.UsuarioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usuario")
class UsuarioController {
    @Autowired
    lateinit var service : UsuarioService

    @GetMapping("/nome/{nome}/senha/{senha}")
    fun login(@PathVariable(value = "nome") nome: String,
              @PathVariable(value = "senha") senha: String) : Boolean {
        val usuario: Usuario? = service.buscarPorNome(nome)

        if (usuario != null){
            if (usuario.senha.equals(senha)){
                return true
            }
            return false
        }

        return false
    }

    @PostMapping
    fun salvar(@RequestBody usuario: Usuario){
        service.salvar(usuario)
    }

    @DeleteMapping
    fun excluir(@RequestBody produto: Usuario){
        service.excluir(produto)
    }

    @PutMapping
    fun atualizar(@RequestBody produto: Usuario){
        service.atualizar(produto)
    }
}