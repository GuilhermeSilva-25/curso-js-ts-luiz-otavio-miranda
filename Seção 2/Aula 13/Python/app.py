def main():
    customers = ["Luiz", "Maria", "João"]

    customers.insert(0, "Helena")
    customers.append("Otávio")

    attended = customers.pop(0)

    print(
        f"O cliente {attended} foi chamado. " f"Fila restante: {', '.join(customers)}"
    )


if __name__ == "__main__":
    main()
