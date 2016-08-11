/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrofuncionarios;

/**
 *
 * @author 2311134
 */
public class CadastroCliente {
   String Nome; // Nome: Variável que guardará o nome do cliente solicitada no cadastro
    String CPF; // CPF: Variável que guardará o CPF do cliente solicitadp no cadastro
    String Endereco;  // Endereço: Variável que guardará o endereço do cliente solicitadp no cadastro

    // getNome: Método que receberá o nome do cliente solicitada no cadastro
    public String getNome() {
        return Nome;
    } // fim do método getNome
    
    // setNome: Método que setará o nome do cliente solicitada no cadastro
    public void setNome(String Nome) {
        this.Nome = Nome;
    } // fim do método setNome
    
    // getCPF: Método que receberá o CPF do cliente solicitado no cadastro
    public String getCPF() {
        return CPF;
    } // fim do método getCPF
    
    // setCPF: Método que setará o CPF do cliente solicitado no cadastro
    public void setCPF(String CPF) {
        this.CPF = CPF;
    } // fim do método setCPF
    
    // getEndereco: Método que receberá o endereço do cliente solicitado no cadastro
    public String getEndereco() {
        return Endereco;
    } // fim do método getEndereco
    
    // setEndereco: Método que setará o endereço do cliente solicitado no cadastro
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    } // fim do método setEndereco
     
}
