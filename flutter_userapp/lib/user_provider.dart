import 'package:get/get.dart';

String host = "http://getinthere.synology.me";

class UserProvider extends GetConnect {
  // Get request
  Future<Response> findById(int id) => get('$host/user/$id');
}
