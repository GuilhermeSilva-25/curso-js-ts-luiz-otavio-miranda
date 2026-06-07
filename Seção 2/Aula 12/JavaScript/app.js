function main() {
  const randomNumber = Math.random();
  const cashback = Math.ceil(randomNumber * 100) || 1;
  console.log(`Parabéns! Você ganhou R$ ${cashback} de cashback!`);
}

main();
