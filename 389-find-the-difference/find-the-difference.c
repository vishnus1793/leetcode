char findTheDifference(char* s, char* t) {
    char diff = 0;
    for (int i = 0; s[i] != '\0'; i++) {
        diff ^= s[i];
    }
    for (int i = 0; t[i] != '\0'; i++) {
        diff ^= t[i];
    }
    return diff;
}