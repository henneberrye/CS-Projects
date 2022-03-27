# getMissingNo takes list as argument
def getMissingNo(A):
	n = len(A)
	total = (n + 1)*(n + 2)/2
	sum_of_A = sum(A)
	return total - sum_of_A


# Driver program to test the above function
A = [3, 5, 2, 1]
miss = getMissingNo(A)
print(miss)
# This code is contributed by Pratik Chhajer
