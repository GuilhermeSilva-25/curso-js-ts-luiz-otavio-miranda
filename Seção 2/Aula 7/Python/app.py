def simulate_system():
    customer_name_a = "Luiz"
    customer_name_b = customer_name_a
    customer_name_b = "Otávio"

    cart_a = ["Teclado", "Monitor"]
    cart_b = cart_a.copy()

    cart_b.append("Mouse")

    print(f"Cliente A: {customer_name_a} | Carrinho: {', '.join(cart_a)}")
    print(f"Cliente B: {customer_name_b} | Carrinho: {', '.join(cart_b)}")


simulate_system()
