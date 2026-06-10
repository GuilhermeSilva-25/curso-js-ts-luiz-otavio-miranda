def main():
    age = 17
    verify_age(age)

    age = 30
    verify_age(age)


def verify_age(age):
    MINIMUM_AGE = 18
    AGE_FOR_VIP = 30

    is_authorized = age >= MINIMUM_AGE
    is_vip = age == AGE_FOR_VIP

    print_verification_result(is_authorized, is_vip)


def print_verification_result(authorization, vip):
    print(f"Acesso liberado: {authorization}")
    print(f"Acesso VIP: {vip}\n")


if __name__ == "__main__":
    main()
