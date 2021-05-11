from pymysql import connect, cursors
import datetime

# conn 객체는 쿼리 결과를 튜플로 가져온다
# cursors : 딕셔너리로 가져온다.
conn = connect(
    host="localhost",
    user="korea",
    password="korea1234",
    db="koreadb",
    charset="utf8"
)

# conn 객체는 쿼리 결과를 딕셔너리로 가져온다.
cursor = conn.cursor(cursors.DictCursor)


def insert_one():
    data = ["title1", "content1"]
    insert_sql = "INSERT INTO board(title, content) VALUES(%s, %s)"
    cursor.execute(insert_sql, data)
    conn.commit()

# insert_one()


def select_one():
    data = 1
    select_sql = "SELECT * FROM board WHERE id = %s"
    cursor.execute(select_sql, [data])
    row = cursor.fetchone()
    print(row)

# select_one()


def select_today():
    today = datetime.date.today()
    # yesterday = today - datetime.timedelta(1) : 어제날짜
    # date(createdate) : date 형태로 변경
    select_sql = "SELECT * FROM board WHERE date(createdate) = %s"
    cursor.execute(select_sql, [today])
    row = cursor.fetchall()
    print(row)

# select_today()


def update_one():
    data = {"id": 1, "title": "title2", "content": "content2"}
    update_sql = '''
        UPDATE board
         SET title = %(title)s, content = %(content)s
        WHERE id = %(id)s
    '''
    cursor.execute(update_sql, data)
    conn.commit()

# update_one()

# 삭제하기 - 연습


def delete_one():
    data = 2
    delete_sql = "DELETE FROM board WHERE id = %s"
    cursor.execute(delete_sql, [data])
    conn.commit()


delete_one()
