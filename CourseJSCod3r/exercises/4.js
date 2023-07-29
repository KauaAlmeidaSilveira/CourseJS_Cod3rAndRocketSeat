Array.prototype.getNomeMes = function(mes){
    if(mes < 1 || mes > 12){
        return console.log('Mês inexistente')
    }
    return console.log(this[mes-1])
}

const meses = ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro']

meses.getNomeMes(11)