// 1. 자바스크립트 타입
// var n1 = 10;
// var n2 = 10.5;
// var s1 = "문자열";
// var b1 = true;

// console.log(n1, n2, s1, b1);

// 2. 자바스크립트 오브젝트 타입
// var board = {
//     id: 1,
//     title: "제목1",
//     content: "내용1"
// };

// console.log(board);
// console.log(board.title);

// 3. 자바스크립트 함수
function add() {
    return 10;
}

var result = add();

console.log(result);

// 4, 익명함수
var m = function () {
    return 20;
}

console.log(m());




// 5. 화살표 함수
var r = () => 20;

console.log(r());

// 6. 화살표 함수로 변경허기
var f1 = function hello(n1) {
    return n1 + 5;
}

var f2 = (n1) => n1 + 5;

var r1 = f2(5);
console.log(r1);

// 7. 리스트(배열)
var arr1 = [1, 2, 3];

// 배열을 한개식 처리
arr1.forEach((n) => {
    console.log(n);
});

var arr2 = arr1.map((n) => n + 5);
console.log(arr2);

// MariaDB(타임존=Asia/Seoul) => 몽고 DB(9시간 전 UTC)
// + 9시간 헤서 Insert
// String 타입으로 변경해서 집어 넣기
// 8. Date
var today = new Date();
console.log(today);


// 몽고DB 실습
// use korea
var r = db.users.findOne({ id: 5 });

function f() {
    return db.users.find({ id: r.friend });
}

function f2(i) {
    var r1 = db.users.findOne({ id: i });
    return db.users.findOne({ id: r1.friend });
}
