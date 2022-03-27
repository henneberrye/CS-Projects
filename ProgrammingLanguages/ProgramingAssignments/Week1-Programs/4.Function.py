list_A = [(10, 20, 40), (40, 50, 60), (70, 80, 90)]
print("Output: ")
print([b[:-1] + (1000,) for b in list_A])
