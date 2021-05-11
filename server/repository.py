from pymysql import connect, cursors
import datetime

conn = connect(host="localhost", user="korea",
               password="korea1234", db="koreadb", charset="utf8")

cursor = conn.cursor(cursors.DictCursor)

print(conn)


def save(board):  # dict 타입 데이터 {"title": "제목1", "content": "내용1"}
    insert_sql = "INSERT INTO board(title, content) VALUES(%(title)s, %(content)s)"
    cursor.execute(insert_sql, board)
    conn.commit()


def findAll():
    select_sql = "SELECT * FROM board ORDER BY id DESC"
    cursor.execute(select_sql)
    rows = cursor.fetchall()
    print(rows)
    return rows  # [딕셔너리, 딕셔너리]


def findById(id):
    select_sql = "SELECT * FROM board WHERE id = %s"
    cursor.execute(select_sql, [id])
    row = cursor.fetchone()
    print(row)
    return row  # 딕셔너리


def deleteById(id):
    delete_sql = "DELETE FROM board WHERE id = %s"
    cursor.execute(delete_sql, id)
    conn.commit()
