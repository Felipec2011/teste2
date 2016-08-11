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
public class registroCodPromocionalProdutos {
    String NomeMercadoria; //NomeMercadoria: Variável que guardará o nome da mercadoria solicitado 
    String CodMercadoria;  //CodMercadoria: Variável que guardará o Código da mercadoria solicitado 
    float PrecoMercadoria; //PrecoMercadoria: Variável que guardará o preço da mercadoria solicitado
    String CodPromoMercadoria; //CodPromoMercadoria: Variável que guardará o código promocionak da mercadoria solicitado

    //getCodPromoMercadoria: Método que receberá o nome da mercadoria 
    public String getCodPromoMercadoria() {
        return CodPromoMercadoria;
    } // fim do método getCodPromoMercadoria
    
    //setCodPromoMercadoria: Método que setará o nome da mercadoria 
    public void setCodPromoMercadoria(String CodPromoMercadoria) {
        this.CodPromoMercadoria = CodPromoMercadoria;
    } // fim do método setCodPromoMercadoria

    //getNomeMercadoria: Método que receberá o nome da mercadoria 
    public String getNomeMercadoria() {
        return NomeMercadoria;
    } // fim do método getNomeMercadoria
    
    //setNomeMercadoria: Método que setará o nome da mercadoria
    public void setNomeMercadoria(String NomeMercadoria) {
        this.NomeMercadoria = NomeMercadoria;
    } // fim do método setCodPromoMercadoria
    
    //getCodMercadoria: Método que receberá o código da mercadoria
    public String getCodMercadoria() {
        return CodMercadoria;
    } // fim do método getCodMercadoria
    
    //setCodMercadoria: Método que setará o código da mercadoria
    public void setCodMercadoria(String CodMercadoria) {
        this.CodMercadoria = CodMercadoria;
    } // fim do método setCodMercadoria
    
     //getPrecoMercadoria: Método que receberá o Preço da mercadoria
    public float getPrecoMercadoria() {
        return PrecoMercadoria;
    } // fim do método getPrecoMercadoria
    //setPrecoMercadoria: Método que setará o Preço da mercadoria
    public void setPrecoMercadoria(float PrecoMercadoria) {
        this.PrecoMercadoria = PrecoMercadoria;
    } // fim do método setPrecoMercadoria
}
