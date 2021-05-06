# 모듈 : 변수, 함수, 클래스를 모아둔 파일
# 패키지 : 여러 모듈을 하나의 디렉토리로 모아준 것

# built-in 된 모듈-print함수 같은 것

import sys
import hello
import hello as h
from hello import *  # from (패키지, 모듈) import (모듈, 변수나 함수나 클래스)

print(sys.modules)  # 기본적으로 설치되어 있는 모듈
print("="*50)
print(sys.path)  # 새로 설치한 모듈

hello.say_hello()
h.say_hello()
say_hello()
