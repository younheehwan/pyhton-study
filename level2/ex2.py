# 클래스 : 클래스는 파스칼표기법으로 사용

class User:
    username = "ssar"
    password = "1234"


u = User()
print(u.username)
print("="*50)


class Person:
    # 클래스를 만들때는 def __init__(self, ... 항상 등록해야 한다.
    def __init__(self, username, password):
        self.username = username
        self.password = password

    def __str__(self):
        return f"username : {self.username}, password : {self.password}"


p = Person("ssar", "1234")
print(p)
print("="*50)
