import 'package:flutter/material.dart';

class Nav extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(25.0),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceAround,
        children: [
          //Spacer(),
          Text(
            "Woman",
            style: menuTitleStyle(),
          ),
          //Spacer(),
          Text(
            "Kids",
            style: menuTitleStyle(),
          ),
          //Spacer(),
          Text(
            "Shoes",
            style: menuTitleStyle(),
          ),
          //Spacer(),
          Text(
            "Bag",
            style: menuTitleStyle(),
          ),
          //Spacer(),
        ],
      ),
    );
  }

  TextStyle menuTitleStyle() {
    return TextStyle(
      fontSize: 16.0,
      fontWeight: FontWeight.bold,
    );
  }
}
