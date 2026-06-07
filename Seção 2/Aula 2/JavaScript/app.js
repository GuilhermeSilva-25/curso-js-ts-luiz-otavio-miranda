function calculateShippingCost(currentShippingCost, transportType) {
  let finalShippingCost = currentShippingCost;

  // Temporary government-approved customs port fee applied to maritime transport.
  if (transportType === 1) {
    finalShippingCost += 10;
  }

  return finalShippingCost;
}
