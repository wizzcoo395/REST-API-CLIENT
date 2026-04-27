# REST-API-CLIENT

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: KAUSHIK PAUL

*INTERN ID*: CTIS8066

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 6 WEEKS

*MENTOR*: NEELA SANTHOSH KUMAR



# Weather API Client (Java)

## Overview

This project is a Java-based application developed to demonstrate how to consume a public REST API, handle HTTP requests, and parse JSON responses in a structured and efficient way. The application connects to a free weather API and retrieves real-time weather data such as temperature and wind speed. The fetched data is then processed and displayed in a clean and readable format in the console.

The primary goal of this project is to provide a clear understanding of how Java applications can interact with external web services using REST APIs. It also highlights the importance of JSON parsing, which is a common data format used in modern web applications. This project can serve as a beginner-friendly introduction to backend integration and API consumption.

## Features

* Sends HTTP GET requests to a public REST API
* Handles server responses using HttpURLConnection
* Parses JSON data using the org.json library
* Displays structured weather information in the console
* Lightweight and easy to understand implementation
* No API key required for access

## API Used

This project uses the Open-Meteo API, which provides free access to weather data without requiring authentication.

API Endpoint:
https://api.open-meteo.com/v1/forecast

Example Query:
https://api.open-meteo.com/v1/forecast?latitude=22.57&longitude=88.36&current_weather=true

The API returns weather data in JSON format, which includes various parameters such as temperature, wind speed, and weather conditions.

## Technologies Used

* Java (Core Java concepts)
* HttpURLConnection for handling HTTP requests
* org.json library for parsing JSON responses
* Maven for dependency management
* IntelliJ IDEA (or any Java IDE)

## Project Structure

WeatherApp/
├── pom.xml
└── src/
  └── main/
    └── java/
      └── com/
        └── weather/
          └── WeatherClient.java

## How It Works

1. The application defines the API URL containing latitude and longitude parameters.
2. A connection is established using HttpURLConnection.
3. A GET request is sent to the API.
4. The server responds with JSON data.
5. The response is read using BufferedReader.
6. The JSON response is parsed using the org.json library.
7. Required fields such as temperature and wind speed are extracted.
8. The extracted data is displayed in a structured format in the console.

## How to Run

### Step 1: Clone Repository

git clone https://github.com/YOUR_USERNAME/weather-api-client.git

### Step 2: Open Project

Open the project in IntelliJ IDEA or any preferred Java IDE.

### Step 3: Install Dependencies

Ensure Maven is installed and configured.
Reload the Maven project to automatically download dependencies.

### Step 4: Build Project

Allow the IDE to build the project and resolve all dependencies.

### Step 5: Run Application

Locate the WeatherClient.java file and run the main method.

## Sample Output

===== Weather Report =====
Temperature : 30.2 °C
Wind Speed  : 10.5 km/h

## Advantages

* Simple implementation suitable for beginners
* Demonstrates real-world API integration
* No authentication or API key required
* Easily extendable for more features

## Limitations

* Only displays limited weather parameters
* Uses static coordinates instead of dynamic user input
* Console-based output (no graphical interface)

## Future Enhancements

* Add user input for city selection
* Integrate more weather details such as humidity and pressure
* Develop a graphical user interface using JavaFX or Swing
* Implement error handling for network failures
* Support multiple API endpoints

## Notes

* Internet connection is required to fetch data from the API
* Ensure dependencies are properly installed before running
* API response may vary depending on location and time


