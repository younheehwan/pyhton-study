import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutterwork/components/nav.dart';

void main() {
  runApp(MyApp());
}

// stless

// 1. 이이폰, 안드로이드
class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: SafeArea(
          child: Column(
            children: [
              Nav(),
              Expanded(
                flex: 1,
                child: Image.asset(
                  "assets/bag.jpeg",
                  fit: BoxFit.cover,
                ),
              ),
              SizedBox(height: 1.0),
              Expanded(
                flex: 1,
                child: Image.asset(
                  "assets/cloth.jpeg",
                  fit: BoxFit.cover,
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
