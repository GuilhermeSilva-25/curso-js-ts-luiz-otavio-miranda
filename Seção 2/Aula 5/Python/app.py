import locale

locale.setlocale(locale.LC_ALL, "pt_BR.UTF-8")


def main():
    PRODUCT_PRICE_1 = "50"
    PRODUCT_PRICE_2 = 20
    DELIVERY_FEE = 15
    FINAL_VALUE = int(PRODUCT_PRICE_1) + PRODUCT_PRICE_2 + DELIVERY_FEE
    print(
        f"O valor final é R$ {FINAL_VALUE:.2f} e o seu tipo é {type(FINAL_VALUE).__name__}".replace(
            ".", ","
        )
    )


if __name__ == "__main__":
    main()
