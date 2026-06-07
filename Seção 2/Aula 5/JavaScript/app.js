function main() {
  const productPrice1 = "50";
  const productPrice2 = 20;
  const deliveryFee = 15;
  const finalValue = Number(productPrice1) + productPrice2 + deliveryFee;
  console.log(
    `O valor final é R$ ${finalValue.toFixed(2).replace(".", ",")} e o seu tipo é ${typeof finalValue}`,
  );
}

main();
