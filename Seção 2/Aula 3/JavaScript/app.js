function main() {
  const dataReceived = 33;
  const validationResponse = validateValue(dataReceived);
  console.log(validationResponse);
}

function validateValue(data) {
  if (data > 100) {
    return "[SUCESSO] Valor validado!";
  }

  return "[ERRO] Valor não validado!";
}

main();
