import random
import math


def main():
    random_number = random.random()
    cashback = max(1, math.ceil(random_number * 100))

    print(f"Parabéns! Você ganhou R$ {cashback} de cashback!")


if __name__ == "__main__":
    main()
