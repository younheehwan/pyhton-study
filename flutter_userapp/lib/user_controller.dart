import 'package:flutter_userapp/user_provider.dart';
import 'package:get/get.dart';

class UserController extends GetxController {
  UserProvider userProvider = UserProvider();

  void findById() async {
    Response response = await userProvider.findById(1);
    print(response.body);
  }
}
