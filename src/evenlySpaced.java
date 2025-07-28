public boolean evenlySpaced(int a, int b, int c) {
    int small = a;
    int medium = b;
    int large = c;

    if (small > medium) {
        int temp = small;
        small = medium;
        medium = temp;
    }
    if (medium > large) {
        int temp = medium;
        medium = large;
        large = temp;
    }
    if (small > medium) {
        int temp = small;
        small = medium;
        medium = temp;
    }

    return (medium - small) == (large - medium);
}

We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.


makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2