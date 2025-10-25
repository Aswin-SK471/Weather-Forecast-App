# 🌦️ Weather Logging System (Java + MySQL)

A desktop application built using **Java Swing** and **MySQL** that allows users to log, view, and store weather data such as temperature, humidity, and conditions for different cities.

---

## 🧩 Features

- Add weather entries with city, temperature, humidity, and condition  
- Display logged weather data in a table  
- Automatically timestamps each entry  
- Uses JDBC (MySQL Connector) for database operations  
- Simple and user-friendly Swing UI  

---

## 🧱 Project Structure

WeatherReport/
│
├── src/
│ ├── DBConnection.java # Handles MySQL database connection
│ ├── WeatherModel.java # Represents weather data
│ ├── WeatherDAO.java # Data access logic (insert/select)
│ ├── WeatherForm.java # Java Swing UI
│ └── Main.java # Entry point of the program
│
├── lib/
│ └── mysql-connector-j-9.4.0.jar # MySQL JDBC Driver
│
├── database/
│ └── weather.sql # SQL script to create database and table
│
├── .gitignore
└── README.md
