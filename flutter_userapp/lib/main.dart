import 'dart:developer';

import 'package:flutter/material.dart';
import 'package:flutter_userapp/count_contoller.dart';
import 'package:flutter_userapp/user_controller.dart';
import 'package:get/get.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: HomePage(),
    );
  }
}

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Column(
        children: [
          Expanded(child: Top()),
          Expanded(child: Bottom()),
        ],
      ),
    );
  }
}

class Top extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final CountController c = Get.put(CountController());
    return Container(
      width: double.infinity,
      color: Colors.yellow,
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Obx(
            () => Text(
              "${c.count}",
              style: TextStyle(fontSize: 30),
            ),
          ),
          ElevatedButton(
            onPressed: () {},
            child: Text("증가"),
          )
        ],
      ),
    );
  }
}

class Bottom extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final CountController c = Get.put(CountController());
    final UserController u = Get.put(UserController());

    return Container(
      width: double.infinity,
      color: Colors.lightBlue,
      child: ElevatedButton(
        onPressed: () {
          c.increase();
          u.findById();
        },
        child: Text("증가"),
      ),
    );
  }
}
