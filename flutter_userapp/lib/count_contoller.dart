import 'package:get/get.dart';

class CountController extends GetxController {
  RxInt count = 1.obs;

  void increase() {
    count = count + 1;
  }
}
