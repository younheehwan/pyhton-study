# HelloWorld 파스칼표기법
# helloWorld 낙타표기법
# hello_world 언더스코어표기법(파이션)

# 타입 추론
# 모든 것이 오브젝트
# 인터프리터

# 1. 숫자
a = 1
b = 1.2
c = 4e5

# ctrl + / : 주석처리
# alt + shift + 아래방향키 : 위의줄 복사

print(a)
print(b)
print(c)

print(type(a))
print(type(b))
print(type(c))

# 연산자 : +, - , *, /, %
e = 2
f = 32

print(e**f)  # ** : 제곱
print(e//f)  # // : 목
print(4 % 3)  # % : 나머지

# 2. 문자열

# "", '', ''' '''(홀따움표 3개)
s1 = "안녕하세요"
s2 = '안녕하세요'
s3 = '''
안녕하세요
'''

s4 = s1 + s2
print(s4)

s5 = "홍길동"
print(s5+"님 안녕하세요")
print(f"{s5}님 안녕하세요")  # 문자열 사용시 추천
print("=" * 50)

# format
# 1000 단위 콤마
values = 100000.011
print(f"{values:,}")

# 3. 슬라이싱 : - 슬라이싱 연산자

str1 = "가나다라마"

print(str1[0:3])  # 슬라이싱 연산자는 마지막 인덱스 번호 직전까지 뽑아요.
# 0:3 - 3자리 전까지 출력 => 0, 1, 2 만 출력
print(str1[-1])

print(str1[1:])  # 마지막 인덱스 번호가 없으면 끝까지 뽑아요.

# 02-555-2222
# 051-755-3333
