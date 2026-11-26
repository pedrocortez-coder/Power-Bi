function duplicar() {
    var numVeiculos = document.getElementById('num').value;
    var velMultiploDiv = document.getElementById('velmultiplo');
    velMultiploDiv.innerHTML = ''; // Limpa qualquer conteúdo anterior

    for (var i = 0; i < numVeiculos; i++) {
        var div = document.createElement('div');
        div.innerHTML = '<label for="placa' + i + '">Placa do Veículo:</label>' +
                        '<input type="text" id="placa' + i + '" name="placa' + i + '" required>' +
                        '<br>' +
                        '<label>Tipo do Veículo:</label>' +
                        '<input type="radio" id="carro' + i + '" name="tipov' + i + '" value="carro">' +
                        '<label for="carro' + i + '">Carro</label>' +
                        '<input type="radio" id="moto' + i + '" name="tipov' + i + '" value="moto">' +
                        '<label for="moto' + i + '">Moto</label>' +
                        '<br>';

        velMultiploDiv.appendChild(div);
    }
}

document.addEventListener('DOMContentLoaded', function() {
    var telInput = document.getElementById('tel');

    telInput.addEventListener('input', function(event) {
        var input = event.target;
        var cleaned = input.value.replace(/\D/g, ''); // Remove todos os caracteres não numéricos
        var formatted = '';

        // Formata para (XX) XXXX-XXXX
        if (cleaned.length > 0) {
            formatted = '(' + cleaned.substring(0, 2);
            if (cleaned.length > 2) {
                formatted += ') ' + cleaned.substring(2, 6);
            }
            if (cleaned.length > 6) {
                formatted += '-' + cleaned.substring(6, 10);
            }
        }

        input.value = formatted;
    });
});

function validaTel() {
    var telInput = document.getElementById('tel');
    var telefone = telInput.value;
    var regex = /^\(\d{2}\) \d{4}-\d{4}$/;

    if (!regex.test(telefone)) {
        telInput.setCustomValidity("Por favor, insira um número de telefone válido no formato (XX) XXXX-XXXX.");
    } else {
        telInput.setCustomValidity("");
    }
}

function ajuda() {
    var pAjuda = document.createElement("p");
    var txtAjuda = document.createTextNode("Você precisa de ajuda?");
    pAjuda.appendChild(txtAjuda);

    var divA = document.getElementById("divajuda");
    divA.appendChild(pAjuda);
}

setTimeout(ajuda, 3000);