package modelo

import modelo.Autenticavel
import modelo.Funcionario

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {
    /**
     * Aqui foi retirado o modelo.Autenticavel dos filhos e colocado diretamente na classe mãe, no
     * caso aqui em modelo.FuncionarioAdmin, pois fica mais sucinto o uso em apenas um local a
     * implementação de autenticavel.
     */
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}