t1 = ("username", "password", "gender")  # 튜풀데이터
t2 = ("ssar", "1234", "남")

d1 = {}

for i, k in enumerate(t1):
    d1[k] = t2[i]

print(d1)
print("="*50)
