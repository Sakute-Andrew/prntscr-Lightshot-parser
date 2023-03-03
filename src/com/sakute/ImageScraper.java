package com.sakute;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ImageScraper extends RandomUrlGenerator {

  private  String folderPath = "photos\\";
  String url;
    public void scrap(int i) throws IOException {
      try {

        url = "https://prnt.sc/" + generateRandomUrl();

        // відкриваємо з'єднання зі сторінкою / opening connection with page
        Document document = Jsoup.connect(url).get();

        // знаходимо тег <img> та отримуємо URL фотографії
        Elements imgElements = document.getElementsByTag("img");
        String imgUrl = imgElements.get(0).attr("src");

        // створюємо InputStream для отримання фотографії / creating an InputStream to obtain a photograph."
        InputStream in = new URL(imgUrl).openStream();

        // створюємо FileOutputStream для запису фотографії / create a FileOutputStream to write the photo
        FileOutputStream out = new FileOutputStream("photos\\" + generateRandomUrl() + ".jpg");

        // читаємо та записуємо фотографію / reading and recording the photo
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = in.read(buffer)) != -1) {
          out.write(buffer, 0, bytesRead);
        }
        System.out.println("[№" + i+ "] Valid file:" + url);

        // закриваємо потоки / close the flow
        in.close();
        out.close();
      } catch (IOException exception) {
        System.out.println("[№" + i + "]Invalid file:" + url);
      }

    }
  }

