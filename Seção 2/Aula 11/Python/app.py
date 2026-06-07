from decimal import Decimal
import locale

locale.setlocale(locale.LC_ALL, "pt_BR.UTF-8")


def main():
    deposit = Decimal("0.1")
    performance = Decimal("0.2")
    total = deposit + performance
    print(f"O total em sua conta é: {locale.currency(total, grouping=True)}")


if __name__ == "__main__":
    main()
