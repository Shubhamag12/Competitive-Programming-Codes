# https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

n = int(input())

for _ in range(n):
    s1 = set(input())
    s2 = set(input())

    print('YES' if s1.intersection(s2) else 'NO')
