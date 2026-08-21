def is_lapindrome(s):
    n = len(s)
    if n % 2 == 0:
        left = s[:n//2]
        right = s[n//2:]
    else:
        left = s[:n//2]
        right = s[n//2+1:]

    # Count character frequencies
    from collections import Counter
    return Counter(left) == Counter(right)


# Driver code
T = int(input().strip())
for _ in range(T):
    s = input().strip()
    if is_lapindrome(s):
        print("YES")
    else:
        print("NO")
