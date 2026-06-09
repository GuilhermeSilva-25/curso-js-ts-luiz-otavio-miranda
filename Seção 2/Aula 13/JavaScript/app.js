function main() {
  const customers = ["Luiz", "Maria", "João"];
  customers.unshift("Helena");
  customers.push("Otávio");
  const attended = customers.shift();

  console.log(
    `O cliente ${attended} foi chamado. Fila restante: ${customers.join(", ")}`,
  );
}

main();
