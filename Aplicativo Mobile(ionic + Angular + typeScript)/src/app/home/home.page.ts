import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {
  
  public precoAlcool: string = ""
  public precoGasolina: string = ""
  public resultado: String = ""

  calcular() {

    //validar se os campos foram preenchidos 
    if(this.precoAlcool && this.precoGasolina ){
       
       var pAlcool = parseFloat(this.precoAlcool)
       var pGasolina = parseFloat(this.precoGasolina)

       /*Faz cáulculo (precoAlcool / precoGasolina) 
         se: resultado >= 0.7 melhor ultilizar gasolina 
         senao: melhor ultilizar álcool */
       var res = pAlcool / pGasolina 
       if (res >= 0.7){
        this.resultado = "Melhor ultilizar Gasolina"
       }else {
         this.resultado = "Melhor ultilizar Alcool"
       }
    }else {
      this.resultado = "Preecha corretamente os campos!"
    }

  }

 } 

  