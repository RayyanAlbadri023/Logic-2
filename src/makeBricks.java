public boolean makeBricks(int small, int big, int goal) {
    int maxBigBricks = goal / 5;
    int useBig = Math.min(big, maxBigBricks);
    int remaining = goal - (useBig * 5);
    return remaining <= small;
}
