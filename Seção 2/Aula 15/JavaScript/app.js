function main() {
  const cart = {
    owner: "Guilherme",
    balance: 100.0,

    addProduct(price) {
      this.balance -= price;

      console.log(
        `Produto adicionado. Saldo restante: R$ ${this.balance.toFixed(2)}`,
      );
    },
  };

  cart.addProduct(20);
  cart.addProduct(50);
}

main();
