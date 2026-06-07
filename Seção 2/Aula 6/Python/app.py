import locale

locale.setlocale(locale.LC_ALL, "pt_BR.UTF-8")


def calculate_total():
    product_price = 100
    discount = 20
    final_price = product_price - discount

    print(f"O preço final é: {locale.currency(final_price, grouping=True)}")


calculate_total()
