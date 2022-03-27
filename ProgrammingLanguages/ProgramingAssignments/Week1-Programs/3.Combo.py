import itertools

a = {'1': ['a', 'b', 'c'], '2': ['d', 'e', 'f']}
for combo in itertools.product(*[a[b] for b in sorted(a.keys())]):
    print(''.join(combo))
