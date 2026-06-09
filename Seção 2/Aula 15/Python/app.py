class Cart:
    def __init__(self, owner, balance):
        self.owner = owner
        self.balance = balance

    def add_product(self, price):
        self.balance -= price
        print(
            f"Produto adicionado. Saldo restante: R$ {self.balance:.2f}"
        )


def main():
    cart = Cart("Guilherme", 100.0)

    cart.add_product(20)
    cart.add_product(50)


main()