import 'package:flutter/material.dart';

class RecipeListItem extends StatefulWidget {
  final String imageName;
  final String? title;

  const RecipeListItem({Key? key, required this.imageName, this.title})
      : super(key: key);

  @override
  _RecipeListItemState createState() => _RecipeListItemState();
}

class _RecipeListItemState extends State<RecipeListItem> {
  int num = 10;

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 20.0),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          //Text("숫자 : $num"),
          // ElevatedButton(
          //   onPressed: () {
          //     setState(() {
          //       num++;
          //     });
          //     print("클릭됨 : $num");
          //   },
          //   child: Text("증가"),
          // ),
          ClipRRect(
            borderRadius: BorderRadius.circular(20.0),
            child: Image.asset(
              "assets/images/${widget.imageName}.jpeg",
              fit: BoxFit.cover,
            ),
          ),
          SizedBox(height: 10),
          Text(
            widget.title ?? "제목없음",
            style: TextStyle(fontSize: 20.0, fontWeight: FontWeight.w600),
          ),
          Text(
            "Have you ever mad your own Made Coffee? Once you've tried a handmade Coffee.",
            style: TextStyle(fontSize: 12.0, color: Colors.grey),
          )
        ],
      ),
    );
  }
}
