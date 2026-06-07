def main():
    email_received = "   Luiz.Otavio@EMPRESA.com.br "
    email_processed = handle_email(email_received)
    email_provider = separate_provider(email_processed)

    print(
        f"O e-mail tratado é: {email_processed}. "
        f"O provedor utilizado é: {email_provider}"
    )


def handle_email(email_received):
    email = email_received.strip().lower()
    return email


def separate_provider(email_processed):
    email = email_processed.split("@")[1]
    return email


if __name__ == "__main__":
    main()
