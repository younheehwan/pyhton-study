# 오버로딩 없음

def add(a, b):
    return a + b


print(add(1, 2))
print("="*50)


def minus(a, b=5):
    return a-b


print(minus(10))
print("="*50)


def many(*data):  # 튜플로 받음(*)
    print(data)


many(1, 2, 3, 4, 5)
print("="*50)


def keyword(**data):  # 딕셔너리 받음(**)
    print(data)


keyword(id=1, username="ssar")
print("="*50)

n1 = 1


def var_test():
    global n1
    n1 = 2


var_test()
print(n1)
print("="*50)
