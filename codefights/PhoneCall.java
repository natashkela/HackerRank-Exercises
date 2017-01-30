int phoneCall(int min1, int min2, int min3, int s) {
    if (s < min1) {
        return 0;
      }
  for (int i = 2; i <= 10; i++) {
    if (s < min1 + min2 * (i-1)) {
      return i - 1;
    }
  }
  return 10 + (s - min1 - min2 * 9) / min3;
}
