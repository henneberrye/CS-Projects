lst = ['abc', 'cdc', 'nmf', 'nmlkfen', 'vgrv']
count = 0
for x in lst:
    if (len(x) >= 2) and (x[0] == x[-1]):
        count += 1
print(count)
