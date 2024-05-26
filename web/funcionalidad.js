/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function toggleForm(formId) {
    var forms = document.querySelectorAll('div[id^="form"]');
    forms.forEach(function (form) {
        if (form.id === formId) {
            form.style.display = 'block';
        } else {
            form.style.display = 'none';
        }
    });
}



function calcularPrecioTotalSelect() {
    var precioTotal = 0;
    var selectElements = document.querySelectorAll('select');
    selectElements.forEach(function(select) {
        var selectedOption = select.options[select.selectedIndex];
        precioTotal += parseFloat(selectedOption.dataset.precio);
    });
    document.getElementById('precioTotalLabel').innerText = 'Precio total: $' + precioTotal.toFixed(2);
}   
