const productName = "Teclado Mecânico";
const quantityPurchased = 3;
const unitValue = 150.5;

console.log(
  `[LOG INFO] Compra aprovada: Produto: ${productName} | Qtd: ${quantityPurchased} | Total: R$ ${(unitValue * quantityPurchased).toFixed(2)}`,
);
