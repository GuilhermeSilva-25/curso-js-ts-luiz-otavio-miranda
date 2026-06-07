function simulateSystem() {
  let customerNameA = "Luiz";
  let customerNameB = customerNameA;
  customerNameB = "Otávio";

  let cartA = ["Teclado", "Monitor"];
  let cartB = structuredClone(cartA);

  cartB.push("Mouse");

  console.log(`Cliente A: ${customerNameA} | Carrinho: ${cartA.join(", ")}`);
  console.log(`Cliente B: ${customerNameB}| Carrinho: ${cartB.join(", ")}`);
}

simulateSystem();
