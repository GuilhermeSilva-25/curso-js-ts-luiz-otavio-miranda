from datetime import datetime


def is_adulthood(year_of_birth):
    return datetime.now().year - year_of_birth >= 18


def main():
    year_of_birth = 2000

    print(f"A pessoa é adulta: {is_adulthood(year_of_birth)}")

    year_of_birth = 2015

    print(f"A pessoa é adulta: {is_adulthood(year_of_birth)}")


if __name__ == "__main__":
    main()
