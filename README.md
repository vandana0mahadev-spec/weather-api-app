# Weather API App

React frontend + Spring Boot backend weather application with external weather API integration and Redis-ready caching.

## Tech Stack
- React + Vite
- Spring Boot
- Visual Crossing Weather API
- Redis

## Project URL
GitHub Repository: https://github.com/vandana0mahadev/weather-api-app
project URL: http://localhost:5173/

## Frontend
```bash
cd weather-frontend
npm install
npm run dev
```

## Backend
```bash
cd weather-backend
./gradlew bootRun
```

## Configuration
Update `weather-backend/src/main/resources/application.properties` with your own API key.

## API Endpoint
`GET /api/weather?city=mumbai`
