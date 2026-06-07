function main() {
  const emailReceived = "   Luiz.Otavio@EMPRESA.com.br ";
  const emailProcessed = handleEmail(emailReceived);
  const emailProvider = separateProvider(emailProcessed);
  console.log(
    `O e-mail tratado é: ${emailProcessed}. O provedor utilizado é: ${emailProvider}`,
  );
}

function handleEmail(emailReceived) {
  const email = emailReceived.trim().toLowerCase();

  return email;
}

function separateProvider(emailProcessed) {
  const email = emailProcessed.split("@")[1];

  return email;
}

main();
