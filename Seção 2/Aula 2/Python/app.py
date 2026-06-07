def calculate_shipping_cost(current_shipping_cost, transport_type):
    final_shipping_cost = current_shipping_cost

    # Temporary government-approved customs port fee applied to maritime transport.
    if transport_type == 1:
        final_shipping_cost += 10

    return final_shipping_cost
