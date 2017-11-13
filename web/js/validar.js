/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validForm() {
    alert("Valid form");
    // Obtenemos el valor por el Nombre
    //var porNombre=document.getElementsByName("nombre")[0].value;
    valor = document.getElementById("numero").value;
    if (valor == null || valor.length == 0 || /^\s+$/.test(valor) || isNaN(valor)) {
        alert("Debe introducir un valor correcto");
        return false;
    } else {
        return true;
    }


}





