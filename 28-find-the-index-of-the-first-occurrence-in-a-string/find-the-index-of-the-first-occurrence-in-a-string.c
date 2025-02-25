#include <string.h>
#include <stdbool.h>

int strStr(char* haystack, char* needle) {
    int x = strlen(haystack);
    int y = strlen(needle);
    
    if (y == 0) {
        return 0;
    }
    
    if (x < y) {
        return -1;
    }
    
    for (int i = 0; i <= x - y; i++) {
        int j;
        for (j = 0; j < y; j++) {
            if (haystack[i + j] != needle[j]) {
                break;
            }
        }
        if (j == y) {
            return i;
        }
    }
    
    return -1;
}
