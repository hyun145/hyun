package kopo.poly.service.impl;


import kopo.poly.dto.FoodDTO;
import kopo.poly.dto.WeatherDTO;
import kopo.poly.service.IWeatherService;
import kopo.poly.util.CmmUtil;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
@Service
public class WeatherService implements IWeatherService {
    @Override
    public WeatherDTO toDayWeather() throws Exception {
        log.info(this.getClass().getName() + ".toDayWeather Start! ");

        int res = 0; // 크롤링 결과

        String url = "https://weather.naver.com/";

        Document doc = null;

        doc = Jsoup.connect(url).get();

        // 원래 cssQuery div.card card_week   cssQurey 에서 id or class 중  id는 단 한번 유일하게 적용될 때 사용하기 좋음, claas는 ?  두 개 이상의 값을 가질 수있음.
        Elements element = doc.select("div.card");

        log.info("element.text() : " + element.text());

   // 5,6 번째만 가져올래.

        Elements Lowtemperature = element.select("span.lowest"); // 최저기온

        Elements Hightemperature = element.select("span.highest"); // 최고기온

        WeatherDTO pDTO = null;


        pDTO = new WeatherDTO();

        String lowTemp = CmmUtil.nvl(Lowtemperature.text());
        String highTemp = CmmUtil.nvl(Hightemperature.text());

        pDTO.setLowtemperature(lowTemp.substring(4,7));
        pDTO.setHightemperature(highTemp.substring(4,7));

        log.info("pDTO" + pDTO.toString());


        log.info(this.getClass().getName() + ".toDayWeather Stop ! ");
        return pDTO;
    }


}
