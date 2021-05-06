# 클래스 : 클래스는 파스칼표기법으로 사용

class User:
    username = "ssar"
    password = "1234"

u = User()
print(u.username)
print("="*50)

class Person:
    def __init__(self, username, password):
        self.username = username
        self.password = password

p = Person("ssar", "1234")
print(p.username)
print("="*50)