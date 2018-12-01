package br.com.fiap.toNoMercadoApi.controller

import br.com.fiap.toNoMercadoApi.entity.Produto
import br.com.fiap.toNoMercadoApi.service.ProdutoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/produto")
class ProdutoController {

    @Autowired
    lateinit var service: ProdutoService

    @GetMapping
    fun buscarTodos() : List<Produto>{
        return service.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody produto: Produto){
        service.salvar(produto)
    }

    @DeleteMapping
    fun excluir(@RequestBody produto: Produto){
        service.excluir(produto)
    }

    @PutMapping
    fun atualizar(@RequestBody produto: Produto){
        service.atualizar(produto)
    }

    @GetMapping("/departamento/{departamento}")
    fun buscarPorDepartamento(@PathVariable(value = "departamento") departamento: String): List<Produto>?{
        return service.buscarPorDepartamento(departamento)
    }

    @GetMapping("/nomeProduto/{nomeProduto}")
    fun buscarPorNome(@PathVariable(value = "nomeProduto") nome: String): Produto?{
        return service.buscarPorNome(nome)
    }

    @GetMapping("/marca/{marca}")
    fun buscarPorMarca(@PathVariable(value = "marca") marca: String): List<Produto>?{
        return service.buscarPorMarca(marca)
    }

}