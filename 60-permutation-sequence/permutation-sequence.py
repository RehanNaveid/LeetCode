
class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        arr = [i for i in range(1, n + 1)] 
        freq = [0] * n  
        res = [] 
        
        self.bpermute([], freq, k, arr, res)
        return ''.join(map(str, res))  

    def bpermute(self, temp: List[int], freq: List[int], k: int, arr: List[int], res: List[int]) -> int:
        if len(temp) == len(arr):
            k -= 1  
            if k == 0:  
                res.extend(temp) 
            return k  
        
        for i in range(len(arr)):
            if not freq[i]: 
                temp.append(arr[i])
                freq[i] = 1  

                k = self.bpermute(temp, freq, k, arr, res)  # Recurse
                if k == 0:  # If the k-th permutation is found, stop further recursion
                    return 0

                # Backtrack
                temp.pop()
                freq[i] = 0
        
        return k  # Return k to continue the search