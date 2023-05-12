# deep

import random

print("select random elements from a list")
elements=[1,2,3,4,5]
print(random.choice(elements))

print("select a random elements from a set")
element=set([1,2,3,4,5])
print(random.choice(tuple(element)))
