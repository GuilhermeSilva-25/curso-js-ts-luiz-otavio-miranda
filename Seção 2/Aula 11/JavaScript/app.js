function main() {
  const deposit = 0.1;
  const performance = 0.2;
  const total = (deposit * 100 + performance * 100) / 100;
  const realFormatter = new Intl.NumberFormat("pt-BR", {
    style: "currency",
    currency: "BRL",
  });
  console.log(`O total em sua conta é: ${realFormatter.format(total)}`);
}

main();
