#1. 문자열 함수
# find, rfind, join

str1 = "가나-다-라"
r1 = str1.find("-")
print(r1)

r2 = str1.find("-",3)
print(r2)

r3 = str1.rfind("-")
print(r3)

tel1 = "02-2222-7874"
tel2 = "051-777-8373"

r1 = tel1[tel1.find("-")+1 : tel1.rfind("-")]
print(r1)
r2 = tel2[tel2.find("-")+1 : tel2.rfind("-")]
print(r2)

# tel1 = "02-2222-7874"

# tel1_start=te11.find("-")+1
# tel1_end=tel1.rfind("-")
# print(tel1[tel1_start:tel1_end])




#가,나,다,라,마
str2="가나다라마"
r4=",".join(str2)
print(r4)
