package com.sakute;

import java.util.Random;

public class RandomUrlGenerator {
  public static String generateRandomUrl() {
    String baseUrl = "https://prnt.sc/";
    int length = 6;
    String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    // створюємо випадкове ім'я або посилання фото / creating random photo url
    for (int i = 0; i < length; i++) {
      int index = random.nextInt(chars.length());
      sb.append(chars.charAt(index));
    }
    return  sb.toString();
  }

}
