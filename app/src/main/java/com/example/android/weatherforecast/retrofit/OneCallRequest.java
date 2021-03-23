package com.example.android.weatherforecast.retrofit;

import com.google.gson.annotations.SerializedName;

public class OneCallRequest {

    @SerializedName("lat")
    private double latitude;

    @SerializedName("lon")
    private double longitude;

    private String timezone;

    @SerializedName("timezone_offset")
    private int timezoneOffset;

    private Current current;

    private Minutely[] minutely;

    private Hourly[] hourly;

    private Daily[] daily;

    private Alerts[] alerts;

    public static class Current {

        @SerializedName("dt")
        private long time;

        @SerializedName("sunrise")
        private long sunriseTime;

        @SerializedName("sunset")
        private long sunsetTime;

        @SerializedName("temp")
        private double temperature;

        @SerializedName("feels_like")
        private double feelLikeTemperature;

        private int pressure;

        private int humidity;

        @SerializedName("dew_point")
        private double dewPoint;

        @SerializedName("clouds")
        private int cloudiness;

        @SerializedName("uvi")
        private double uVIndex;

        private int visibility;

        @SerializedName("wind_speed")
        private double windSpeed;

        @SerializedName("wind_gust")
        private double windGust;             //опционально

        @SerializedName("wind_deg")
        private int WindDirection;

        private Rain rain;

        private Snow snow;

        private Weather[] weather;

        public static class Rain {

            @SerializedName("1h")
            private double oneH;                 //опционально

            public double getOptOneH() {
                return oneH;
            }

            public void setOPtOneH(double oneH) {
                this.oneH = oneH;
            }
        }

        public static class Snow {

            @SerializedName("1h")
            private double oneH;                //опционально

            public double getOptOneH() {
                return oneH;
            }

            public void setOptOneH(double oneH) {
                this.oneH = oneH;
            }
        }

        public static class Weather {

            private int id;

            private String main;

            private String description;

            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public long getSunriseTime() {
            return sunriseTime;
        }

        public void setSunriseTime(long sunriseTime) {
            this.sunriseTime = sunriseTime;
        }

        public long getSunsetTime() {
            return sunsetTime;
        }

        public void setSunsetTime(long sunsetTime) {
            this.sunsetTime = sunsetTime;
        }

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public double getFeelLikeTemperature() {
            return feelLikeTemperature;
        }

        public void setFeelLikeTemperature(double feelLikeTemperature) {
            this.feelLikeTemperature = feelLikeTemperature;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getDewPoint() {
            return dewPoint;
        }

        public void setDewPoint(double dewPoint) {
            this.dewPoint = dewPoint;
        }

        public int getCloudiness() {
            return cloudiness;
        }

        public void setCloudiness(int cloudiness) {
            this.cloudiness = cloudiness;
        }

        public double getuVIndex() {
            return uVIndex;
        }

        public void setuVIndex(double uVIndex) {
            this.uVIndex = uVIndex;
        }

        public int getVisibility() {
            return visibility;
        }

        public void setVisibility(int visibility) {
            this.visibility = visibility;
        }

        public double getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(double windSpeed) {
            this.windSpeed = windSpeed;
        }

        public double getOptWindGust() {
            return windGust;
        }

        public void setOptWindGust(double windGust) {
            this.windGust = windGust;
        }

        public int getWindDirection() {
            return WindDirection;
        }

        public void setWindDirection(int windDirection) {
            WindDirection = windDirection;
        }

        public Rain getRain() {
            return rain;
        }

        public void setRain(Rain rain) {
            this.rain = rain;
        }

        public Snow getSnow() {
            return snow;
        }

        public void setSnow(Snow snow) {
            this.snow = snow;
        }

        public Weather[] getWeather() {
            return weather;
        }

        public void setWeather(Weather[] weather) {
            this.weather = weather;
        }
    }

    public static class Minutely {

        @SerializedName("dt")
        private long time;

        private int precipitation;

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public int getPrecipitation() {
            return precipitation;
        }

        public void setPrecipitation(int precipitation) {
            this.precipitation = precipitation;
        }
    }

    public static class Hourly {

        @SerializedName("dt")
        private long time;

        @SerializedName("temp")
        private double temperature;

        @SerializedName("feels_like")
        private double feelLikeTemperature;

        private int pressure;

        private int humidity;

        @SerializedName("dew_point")
        private double dewPoint;

        @SerializedName("clouds")
        private int cloudiness;

        @SerializedName("uvi")
        private double uVIndex;

        private int visibility;

        @SerializedName("wind_speed")
        private double windSpeed;

        @SerializedName("wind_gust")
        private double windGust;             //опционально

        @SerializedName("wind_deg")
        private int windDirection;

        @SerializedName("pop")
        private double probabilityOfPrecipitation;

        private Rain rain;

        private Snow snow;

        private Weather[] weather;

        public static class Rain {

            @SerializedName("1h")
            private double oneH;                 //опционально

            public double getOptOneH() {
                return oneH;
            }

            public void setOptOneH(double oneH) {
                this.oneH = oneH;
            }
        }

        public static class Snow {

            @SerializedName("1h")
            private double oneH;                //опционально

            public double getOptOneH() {
                return oneH;
            }

            public void setOptOneH(double oneH) {
                this.oneH = oneH;
            }
        }

        public static class Weather {

            private int id;

            private String main;

            private String description;

            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public double getFeelLikeTemperature() {
            return feelLikeTemperature;
        }

        public void setFeelLikeTemperature(double feelLikeTemperature) {
            this.feelLikeTemperature = feelLikeTemperature;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getDewPoint() {
            return dewPoint;
        }

        public void setDewPoint(double dewPoint) {
            this.dewPoint = dewPoint;
        }

        public int getCloudiness() {
            return cloudiness;
        }

        public void setCloudiness(int cloudiness) {
            this.cloudiness = cloudiness;
        }

        public double getuVIndex() {
            return uVIndex;
        }

        public void setuVIndex(double uVIndex) {
            this.uVIndex = uVIndex;
        }

        public int getVisibility() {
            return visibility;
        }

        public void setVisibility(int visibility) {
            this.visibility = visibility;
        }

        public double getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(double windSpeed) {
            this.windSpeed = windSpeed;
        }

        public double getOptWindGust() {
            return windGust;
        }

        public void setOptWindGust(double windGust) {
            this.windGust = windGust;
        }

        public int getWindDirection() {
            return windDirection;
        }

        public void setWindDirection(int windDirection) {
            this.windDirection = windDirection;
        }

        public double getProbabilityOfPrecipitation() {
            return probabilityOfPrecipitation;
        }

        public void setProbabilityOfPrecipitation(double probabilityOfPrecipitation) {
            this.probabilityOfPrecipitation = probabilityOfPrecipitation;
        }

        public Rain getRain() {
            return rain;
        }

        public void setRain(Rain rain) {
            this.rain = rain;
        }

        public Snow getSnow() {
            return snow;
        }

        public void setSnow(Snow snow) {
            this.snow = snow;
        }

        public Weather[] getWeather() {
            return weather;
        }

        public void setWeather(Weather[] weather) {
            this.weather = weather;
        }
    }

    public static class Daily {

        @SerializedName("dt")
        private long time;

        @SerializedName("sunrise")
        private long sunriseTime;

        @SerializedName("sunset")
        private long sunsetTime;

        @SerializedName("temp")
        private Temperature temperature;

        @SerializedName("feels_like")
        private FeelLikeTemperature feelLikeTemperature;

        private int pressure;

        private int humidity;

        @SerializedName("dew_point")
        private double dewPoint;

        @SerializedName("wind_speed")
        private double windSpeed;

        @SerializedName("wind_gust")
        private double windGust;             //опционально

        @SerializedName("wind_deg")
        private int WindDirection;

        @SerializedName("clouds")
        private int cloudiness;

        @SerializedName("uvi")
        private double uVIndex;

        @SerializedName("pop")
        private double probabilityOfPrecipitation;

        private double rain;                 //опционально

        private double snow;                 //опционально

        private Weather[] weather;

        public static class Temperature {

            @SerializedName("morn")
            private double morningTemp;

            @SerializedName("day")
            private double dayTemp;

            @SerializedName("eve")
            private double eveningTemp;

            @SerializedName("night")
            private double nightTemp;

            @SerializedName("min")
            private double minDailyTemp;

            @SerializedName("max")
            private double maxDailyTemp;

            public double getMorningTemp() {
                return morningTemp;
            }

            public void setMorningTemp(double morningTemp) {
                this.morningTemp = morningTemp;
            }

            public double getDayTemp() {
                return dayTemp;
            }

            public void setDayTemp(double dayTemp) {
                this.dayTemp = dayTemp;
            }

            public double getEveningTemp() {
                return eveningTemp;
            }

            public void setEveningTemp(double eveningTemp) {
                this.eveningTemp = eveningTemp;
            }

            public double getNightTemp() {
                return nightTemp;
            }

            public void setNightTemp(double nightTemp) {
                this.nightTemp = nightTemp;
            }

            public double getMinDailyTemp() {
                return minDailyTemp;
            }

            public void setMinDailyTemp(double minDailyTemp) {
                this.minDailyTemp = minDailyTemp;
            }

            public double getMaxDailyTemp() {
                return maxDailyTemp;
            }

            public void setMaxDailyTemp(double maxDailyTemp) {
                this.maxDailyTemp = maxDailyTemp;
            }
        }

        public static class FeelLikeTemperature {

            @SerializedName("morn")
            private double morningTemp;

            @SerializedName("day")
            private double dayTemp;

            @SerializedName("eve")
            private double eveningTemp;

            @SerializedName("night")
            private double nightTemp;

            public double getMorningTemp() {
                return morningTemp;
            }

            public void setMorningTemp(double morningTemp) {
                this.morningTemp = morningTemp;
            }

            public double getDayTemp() {
                return dayTemp;
            }

            public void setDayTemp(double dayTemp) {
                this.dayTemp = dayTemp;
            }

            public double getEveningTemp() {
                return eveningTemp;
            }

            public void setEveningTemp(double eveningTemp) {
                this.eveningTemp = eveningTemp;
            }

            public double getNightTemp() {
                return nightTemp;
            }

            public void setNightTemp(double nightTemp) {
                this.nightTemp = nightTemp;
            }
        }

        public static class Weather {

            private int id;

            private String main;

            private String description;

            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public long getSunriseTime() {
            return sunriseTime;
        }

        public void setSunriseTime(long sunriseTime) {
            this.sunriseTime = sunriseTime;
        }

        public long getSunsetTime() {
            return sunsetTime;
        }

        public void setSunsetTime(long sunsetTime) {
            this.sunsetTime = sunsetTime;
        }

        public Temperature getTemperature() {
            return temperature;
        }

        public void setTemperature(Temperature temperature) {
            this.temperature = temperature;
        }

        public FeelLikeTemperature getFeelLikeTemperature() {
            return feelLikeTemperature;
        }

        public void setFeelLikeTemperature(FeelLikeTemperature feelLikeTemperature) {
            this.feelLikeTemperature = feelLikeTemperature;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getDewPoint() {
            return dewPoint;
        }

        public void setDewPoint(double dewPoint) {
            this.dewPoint = dewPoint;
        }

        public double getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(double windSpeed) {
            this.windSpeed = windSpeed;
        }

        public double getOptWindGust() {
            return windGust;
        }

        public void setOptWindGust(double windGust) {
            this.windGust = windGust;
        }

        public int getWindDirection() {
            return WindDirection;
        }

        public void setWindDirection(int windDirection) {
            WindDirection = windDirection;
        }

        public int getCloudiness() {
            return cloudiness;
        }

        public void setCloudiness(int cloudiness) {
            this.cloudiness = cloudiness;
        }

        public double getuVIndex() {
            return uVIndex;
        }

        public void setuVIndex(double uVIndex) {
            this.uVIndex = uVIndex;
        }

        public double getProbabilityOfPrecipitation() {
            return probabilityOfPrecipitation;
        }

        public void setProbabilityOfPrecipitation(double probabilityOfPrecipitation) {
            this.probabilityOfPrecipitation = probabilityOfPrecipitation;
        }

        public double getOptRain() {
            return rain;
        }

        public void setOptRain(double rain) {
            this.rain = rain;
        }

        public double getOptSnow() {
            return snow;
        }

        public void setOptSnow(double snow) {
            this.snow = snow;
        }

        public Weather[] getWeather() {
            return weather;
        }

        public void setWeather(Weather[] weather) {
            this.weather = weather;
        }
    }

    public static class Alerts {

        @SerializedName("sender_name")
        private String senderName;

        @SerializedName("event")
        private String eventName;

        @SerializedName("start")
        private long startTime;

        @SerializedName("end")
        private long endTime;

        @SerializedName("description")
        private String alertDescription;

        public String getSenderName() {
            return senderName;
        }

        public void setSenderName(String senderName) {
            this.senderName = senderName;
        }

        public String getEventName() {
            return eventName;
        }

        public void setEventName(String eventName) {
            this.eventName = eventName;
        }

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }

        public String getAlertDescription() {
            return alertDescription;
        }

        public void setAlertDescription(String alertDescription) {
            this.alertDescription = alertDescription;
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Minutely[] getMinutely() {
        return minutely;
    }

    public void setMinutely(Minutely[] minutely) {
        this.minutely = minutely;
    }

    public Hourly[] getHourly() {
        return hourly;
    }

    public void setHourly(Hourly[] hourly) {
        this.hourly = hourly;
    }

    public Daily[] getDaily() {
        return daily;
    }

    public void setDaily(Daily[] daily) {
        this.daily = daily;
    }

    public Alerts[] getAlerts() {
        return alerts;
    }

    public void setAlerts(Alerts[] alerts) {
        this.alerts = alerts;
    }
}