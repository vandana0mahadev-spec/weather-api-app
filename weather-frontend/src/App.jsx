import { useState } from "react";
import Header from "./components/Header";
import SearchBox from "./components/SearchBox";
import WeatherCard from "./components/WeatherCard";
import StatusMessage from "./components/StatusMessage";
import { getWeatherByCity } from "./services/weatherApi";
import "./App.css";

function App() {
  const [city, setCity] = useState("");
  const [weather, setWeather] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");

  const handleSearch = async () => {
    if (!city.trim()) {
      setError("Please enter a city name.");
      setWeather(null);
      return;
    }

    setLoading(true);
    setError("");
    setWeather(null);

    try {
      const data = await getWeatherByCity(city.trim());
      setWeather(data);
    } catch (err) {
      setError(err.message || "Something went wrong while fetching weather data.");
    } finally {
      setLoading(false);
    }
  };

  const handleKeyDown = (event) => {
    if (event.key === "Enter") {
      handleSearch();
    }
  };

  return (
    <div className="app-shell">
      <div className="app-container">
        <Header />
        <SearchBox
          city={city}
          setCity={setCity}
          onSearch={handleSearch}
          onKeyDown={handleKeyDown}
          loading={loading}
        />

        {loading && (
          <StatusMessage type="loading" message="Loading weather data..." />
        )}

        {!loading && error && (
          <StatusMessage type="error" message={error} />
        )}

        {!loading && !error && weather && <WeatherCard weather={weather} />}
      </div>
    </div>
  );
}

export default App;