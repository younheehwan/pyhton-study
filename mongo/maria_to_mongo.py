from pymongo import MongoClient
from pymongo.cursor import CursorType
from pymysql import connect, cursors
import pandas as pd


def mongo_find(mongo, condition=None, db_name=None, collection_name=None):
    result = mongo[db_name][collection_name].find(
        condition, no_cursor_timeout=True, cursor_type=CursorType.EXHAUST)
    return result


def mysql_find(mysql_cursor):
    sql = "SELECT * FROM board"
    mysql_cursor.execute(sql)
    rows = mysql_cursor.fetchall()
    # 딕셔너리->튜풀 변환 로직
    # my_list = []

    # for row in mysql_cursor.fetchall():
    #     my_dict = {}
    #     for i, value in enumerate(row):
    #         my_dict[mysql_cursor.description[i][0]] = value

    #     my_list.append(my_dict)
    # return my_list
    return rows


def mongo_save(mongo, datas, db_name=None, collection_name=None):
    result = mongo[db_name][collection_name].insert_many(datas).inserted_ids
    return result


# Mongo 연결
mongo = MongoClient("localhost", 27017)

# MySQL 연결
mysql = connect(host="localhost", user="korea",
                password="korea1234", db="koreadb", charset="utf8")
mysql_cursor = mysql.cursor(cursors.DictCursor)

# mysql 데이터 찾기
rs = mysql_find(mysql_cursor)
# print(rs)

# mongo에 데이터 입력하기
# mongo_save(mongo, rs, "korea", "board")  # List안에 dict을 넣어야 함

collection = mongo_find(mongo, {}, "korea", "board")

list = []
# mongo에 데이터 확인하기
for document in collection:
    print(document)  # dict
    list.append(document)

df1 = pd.DataFrame(list)

print(df1)
