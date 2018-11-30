package br.com.fiap.toNoMercadoApi.entity

import org.springframework.data.annotation.Id

data class Usuario (@Id var id: String?,
                    var nomeUsuario: String,
                    var senha: String) {}