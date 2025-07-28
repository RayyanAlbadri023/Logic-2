public boolean closeFar(int a, int b, int c) {
    boolean bIsClose = Math.abs(b - a) <= 1;
    boolean cIsClose = Math.abs(c - a) <= 1;

    boolean bIsFar = Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2;
    boolean cIsFar = Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2;

    if ((bIsClose && cIsFar) || (cIsClose && bIsFar)) {
        return true;
    }
    return false;
}
