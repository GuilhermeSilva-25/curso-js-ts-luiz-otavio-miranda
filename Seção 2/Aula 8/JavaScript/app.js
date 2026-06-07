function main() {
  const debt = "1000";
  let debtAmount = Number(debt);
  const realFormatter = new Intl.NumberFormat("pt-BR", {
    style: "currency",
    currency: "BRL",
  });

  console.log(`A dívida é de: ${realFormatter.format(debtAmount)}`);

  const installment = 200;
  const rate = 10;

  debtAmount -= installment;
  debtAmount += rate;

  console.log(`A dívida é de: ${realFormatter.format(debtAmount)}`);
}

main();
