function main() {
  let age = 17;
  verifyAge(age);
  age = 30;
  verifyAge(age);
}

main();

function verifyAge(age) {
  const MINIMUM_AGE = 18;
  const AGE_FOR_VIP = 30;
  const isAuthorized = age >= MINIMUM_AGE;
  const isVip = age === AGE_FOR_VIP;

  printVerificationResult(isAuthorized, isVip);
}

function printVerificationResult(authorization, vip) {
  console.log(`Acesso liberado: ${authorization}\nAcesso VIP: ${vip}\n`);
}
