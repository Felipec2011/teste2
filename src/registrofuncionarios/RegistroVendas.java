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


public class RegistroVendas {
    String NomeMercadoriaVendida; //NomeMercadoria: Variável que guardará o nome da mercadoria solicitado 
    String CodMercadoriaVendida;  //CodMercadoria: Variável que guardará o Código da mercadoria solicitado 
    float PrecoMercadoriaVendida; //PrecoMercadoria: Variável que guardará o preço da mercadoria solicitado

    //getNomeMercadoriaVendida: Método que receberá o nome da mercadoria 
    public String getNomeMercadoriaVendida() {
        return NomeMercadoriaVendida;
    } // fim do método getNomeMercadoriaVendida
    
    //setNomeMercadoriaVendida: Método que setará o nome da mercadoria
    public void setNomeMercadoriaVendida(String NomeMercadoriaVendida) {
        this.NomeMercadoriaVendida = NomeMercadoriaVendida;
    } // fim do método setNomeMercadoriaVendida
    
    //getCodMercadoriaVendida: Método que receberá o código da mercadoria
    public String getCodMercadoriaVendida() {
        return CodMercadoriaVendida;
    } // fim do método getCodMercadoriaVendida
    
    //setCodMercadoriaVendida: Método que setará o código da mercadoria
    public void setCodMercadoriaVendida(String CodMercadoriaVendida) {
        this.CodMercadoriaVendida = CodMercadoriaVendida;
    } // fim do método setCodMercadoriaVendida
    
     //getPrecoMercadoriaVendida: Método que receberá o Preço da mercadoria
    public float getPrecoMercadoriaVendida() {
        return PrecoMercadoriaVendida;
    } // fim do método getPrecoMercadoriaVendida
    
    //setPrecoMercadoriaVendida: Método que setará o Preço da mercadoria
    public void setPrecoMercadoriaVendida(float PrecoMercadoriaVendida) {
        this.PrecoMercadoriaVendida = PrecoMercadoriaVendida;
    } // fim do método setPrecoMercadoriaVendida
}
