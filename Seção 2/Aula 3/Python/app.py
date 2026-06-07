def main():
    data_received = 33
    validation_response = validate_value(data_received)
    print(validation_response)


def validate_value(data):
    if data > 100:
        return "[SUCESSO] Valor validado!"

    return "[ERRO] Valor não validado!"


if __name__ == "__main__":
    main()
