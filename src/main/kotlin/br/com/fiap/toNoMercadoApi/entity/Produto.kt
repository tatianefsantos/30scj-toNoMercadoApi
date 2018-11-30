package br.com.fiap.toNoMercadoApi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Produto(@Id var id: String?,
                   var nome: String,
                   var marca: String?,
                   var quantidade: Int,
                   var departamento: String?,
                   var descricao: String?) {}