#1. 리스트 list1=[]
list1=[1,2,3,4]
list2=[5,6,7,8]

print(list1[2])
print("="*50)

list3=list1+list2 # 배열 더하는 것 중요
print(list3)

#3 스칼라
#[1,3,4] 벡터(테이블의 열)
# 2차원 배열 : matrix, 3차원 배열 : tensor

list4=[                    # 2차원 배열 중요
    list1,
    list2
]

print(list4)

# 리스트에 항목 추가
list1.append(10)
print(list1)

del list1[0] # [] 안에는 index 값을 표시
print(list1)

list1.remove(2) # remove () 안에는 리스트에 있는 값을 표시 
print(list1)

list6=list(range(10))
print(list6)

list7=list(range(1, 12)) # 마지막 인텍스 직전까지
print(list7)

list7[0] = 100
print(list7)

#2. 튜플-리스트 같음 !! 데이터 변경이 불가능
tuple1=(1,2,3,4)
print(tuple1)

tuple2=(4,5,6)

tuple3=tuple1+tuple2
print(tuple3)

tuple4=[
    tuple1,
    tuple2
]
print(tuple4)

# 튜플을 리스트로 변환
list10=list(tuple1)
print(list10)


#3. 딕셔너리