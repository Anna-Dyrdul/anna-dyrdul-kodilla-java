package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double calculateAverageTemperature(){
        double averageTemperature = 0;
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            averageTemperature += temperature.getValue();
        }
        averageTemperature = averageTemperature/temperatures.getTemperatures().size();
        return averageTemperature;
    }

    public double calculateMedian(){
        double median = 0;
        double temperaturesAsArray[] = new double[temperatures.getTemperatures().size()];
        int i = 0;
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            temperaturesAsArray[i]=temperature.getValue();
            i++;
        }
        Arrays.sort(temperaturesAsArray);
        if (temperaturesAsArray.length % 2 == 0){
            median = (double) temperaturesAsArray[temperaturesAsArray.length/2] + (double) temperaturesAsArray[temperaturesAsArray.length/2 - 1];
        }else{
            median = (double) temperaturesAsArray[temperaturesAsArray.length/2];
        }
        return median;
    }

}