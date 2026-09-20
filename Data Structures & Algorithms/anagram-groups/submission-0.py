# solution 1: sorting
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = defaultdict(list);

        for string in strs:
            sortedStringArray = sorted(string)
            sortedString = "".join(sortedStringArray)
            map[sortedString].append(string)

        return list(map.values())