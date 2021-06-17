import 'package:flutter/material.dart';

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

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int count = 3;

  void increase() {
    setState(() {
      count = count + 1;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Column(
        children: [
          Expanded(child: Top(count: count)),
          Expanded(child: Bottom(increase: increase)),
        ],
      ),
    );
  }
}

class Top extends StatelessWidget {
  final int count;

  const Top({Key? key, required this.count}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: double.infinity,
      color: Colors.yellow,
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Text(
            "$count",
            style: TextStyle(fontSize: 30),
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
  final increase;

  const Bottom({Key? key, required this.increase}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: double.infinity,
      color: Colors.lightBlue,
      child: ElevatedButton(
        onPressed: () {
          increase();
        },
        child: Text("증가"),
      ),
    );
  }
}
