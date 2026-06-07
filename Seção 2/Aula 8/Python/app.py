import locale

locale.setlocale(locale.LC_ALL, "pt_BR.UTF-8")


def main():
    debt = "1000"
    debt_amount = float(debt)

    print(f"A dívida é de: {locale.currency(debt_amount, grouping=True)}")

    installment = 200
    rate = 10

    debt_amount -= installment
    debt_amount += rate

    print(f"A dívida é de: {locale.currency(debt_amount, grouping=True)}")


if __name__ == "__main__":
    main()
