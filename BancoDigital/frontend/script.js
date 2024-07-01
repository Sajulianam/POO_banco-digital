fetch('/api/saldo')
  .then(response => response.json())
  .then(data => {
    document.getElementById('saldoConta').textContent = `R$ ${data.saldo}`;
  })
  .catch(error => {
    console.error('Erro ao obter saldo:', error);
  });

  const valorSaque = document.getElementById('valorSaque').value;

fetch('/api/sacar', {
  method: 'POST',
  headers: {
    'Content-Type': 'application/json'
  },
  body: JSON.stringify({ valor: valorSaque })
})
  .then(response => response.json())
  .then(data => {
    if (data.sucesso) {
      atualizarSaldo(); // Função para atualizar o saldo na interface
      alert('Saque realizado com sucesso!');
    } else {
      alert('Erro ao realizar saque:', data.mensagem);
    }
  })
  .catch(error => {
    console.error('Erro ao realizar saque:', error);
  });