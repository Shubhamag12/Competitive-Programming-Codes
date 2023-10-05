class MyHashMap:

    def __init__(self):

        self.map = [-1] * (10**6)
        
    def put(self, key: int, value: int) -> None:
        
        self.map[key-1] = value

    def get(self, key: int) -> int:
        
        val = self.map[key-1]

        if val != -1:

            return val

        else:

            return -1

    def remove(self, key: int) -> None:
        
        self.map[key-1] = -1


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)
