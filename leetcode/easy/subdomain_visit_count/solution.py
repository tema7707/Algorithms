class Solution:
    def subdomainVisits(self, cpdomains: List[str]) -> List[str]:
        domens = {}
        for i in cpdomains:
            n, site = i.split(' ')
            n = int(n)
            
            for j in range(len(site)):
                d = ''
                if j == 0:
                    d = site[j:]
                elif  site[j-1] == '.':
                    d = site[j:]
                else:
                    continue
                if d in domens:
                    domens[d] += n
                else:
                    domens[d] = n
        ans = []
        for domen, num in domens.items():
            ans.append("{} {}".format(num, domen))
        
        return ans