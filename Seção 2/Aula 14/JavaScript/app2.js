function isAdulthood(yearOfBirth) {
  return new Date().getFullYear() - yearOfBirth >= 18;
}

function main() {
  let yearOfBirth = 2000;

  console.log(`A pessoa é adulta: ${isAdulthood(yearOfBirth)}`);

  yearOfBirth = 2015;

  console.log(`A pessoa é adulta: ${isAdulthood(yearOfBirth)}`);
}

main();
