# Corona_Virus_Booking_System

Description:
The COVID-19 Tracker is a web application developed using the Spring Boot framework to provide real-time information on the global impact of the COVID-19 pandemic. The application fetches data from an external source and displays it in a user-friendly format, including total reported cases, deaths, and changes since the last day for various states and countries.

Key Features:

Real-time Data: The application regularly updates and fetches the latest COVID-19 data from a reliable source.
User Interface: A responsive and intuitive user interface allows users to view the total reported cases, deaths, and changes since the last day for different locations.
Chart Visualization: Utilizes the Chart.js library to visually represent COVID-19 data trends using a bar chart.
Scheduled Updates: The application automatically fetches and updates data at scheduled intervals.
Thymeleaf Templates: HTML templates using Thymeleaf for dynamic content generation on the server side.
Bootstrap Styling: Utilizes Bootstrap for a clean and modern design.
Project Structure:

Main Application Class: CoronavirusTrackerApplication.java
Controller: HomeController.java manages requests and views.
Model: LocationStates.java represents the data structure for COVID-19 statistics.
Service: CoronaVirusDataServices.java fetches and processes data from an external source.
Technologies Used:

Java
Spring Boot
Thymeleaf
Bootstrap
Chart.js
Usage:

Run the application.
Access the application through a web browser.
View the latest COVID-19 statistics globally or by selecting specific states/countries.
Explore the chart visualization to understand trends.
Note:

Ensure a stable internet connection for real-time data updates.
Customize the application as needed based on user requirements or additional features.
