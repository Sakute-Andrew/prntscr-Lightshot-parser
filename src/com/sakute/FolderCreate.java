package com.sakute;

import java.io.File;

public class FolderCreate {
  public static void createFolder(){
    File folder = new File("photos\\");
    // Перевіряємо, чи існує папка / check if folder exists
    if (!folder.exists()) {
      // Створюємо папку / creating folder
      boolean result = folder.mkdirs();
    }
  }

}
