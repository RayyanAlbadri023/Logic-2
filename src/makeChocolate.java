public int makeChocolate(int small, int big, int goal) {
    int maxBigUsed = goal / 5;
    if (maxBigUsed > big) {
        maxBigUsed = big;
    }
    int remainder = goal - maxBigUsed * 5;
    if (remainder <= small) {
        return remainder;
    } else {
        return -1;
    }
}
