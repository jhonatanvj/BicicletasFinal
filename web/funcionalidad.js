/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function toggleForm(formId) {
        var forms = document.querySelectorAll('div[id^="form"]');
        forms.forEach(function(form) {
            if (form.id === formId) {
                form.style.display = 'block';
            } else {
                form.style.display = 'none';
            }
        });
    }