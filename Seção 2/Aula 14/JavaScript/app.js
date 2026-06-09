function main() {
  let yearOfBirth = 2000;

  const isAdulthood = (yearOfBirth) =>
    new Date().getFullYear() - yearOfBirth >= 18;

  console.log(`A pessoa é adulta: ${isAdulthood(yearOfBirth)}`);

  yearOfBirth = 2015;

  console.log(`A pessoa é adulta: ${isAdulthood(yearOfBirth)}`);
}

main();
