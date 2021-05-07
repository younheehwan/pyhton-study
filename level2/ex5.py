# for문으로 리스트[], 튜플(), 딕셔너리{} 다르기

# 1. list안에 tuple을 뽑아보기
list1 = [
    (1, "ssar", "1234"),
    (2, "cos", "5678")
]

for a, b, c in list1:
    print(f"{a}, {b}, {c}")

print("="*50)

# 2. 가장 기본 for문
for i in range(3, 10):  # 0~9
    print(i)

# 3. 리스트안에 딕셔너리 뽑아내기
# list2 리스트에 id 값만 담기
list2 = []

dic1 = [
    {"id": 1, "name": "ssat"},
    {"id": 2, "name": "cos"}
]

for d in dic1:
    print(d["id"])

list3 = [d["id"] for d in dic1]
print(list3)

print([d["id"] for d in dic1])
