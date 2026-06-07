function calculateTotal() {
  const productPrice = 100;
  const discount = 20;
  const finalPrice = productPrice - discount;
  const realFormatter = new Intl.NumberFormat("pt-BR", {
    style: "currency",
    currency: "BRL",
  });
  console.log(`O preço final é: ${realFormatter.format(finalPrice)}`);
}

calculateTotal();
