import { formatTemperature, formatWindSpeed } from "../utils/formatters";

function WeatherCard({ weather }) {
  return (
    <section className="weather-card">
      <div className="weather-card__top">
        <div>
          <p className="weather-card__label">Current weather</p>
          <h2>{weather.city}</h2>
          <p className="weather-card__description">{weather.description}</p>
        </div>

        <div className="weather-card__temp">
          {formatTemperature(weather.temperature)}
        </div>
      </div>

      <div className="weather-grid">
        <div className="weather-stat">
          <span>Humidity</span>
          <strong>{weather.humidity}%</strong>
        </div>

        <div className="weather-stat">
          <span>Wind Speed</span>
          <strong>{formatWindSpeed(weather.windSpeed)}</strong>
        </div>

        <div className="weather-stat">
          <span>Feels Like</span>
          <strong>
            {weather.feelsLike !== undefined
              ? formatTemperature(weather.feelsLike)
              : "N/A"}
          </strong>
        </div>

        <div className="weather-stat">
          <span>Country</span>
          <strong>{weather.country || "N/A"}</strong>
        </div>
      </div>
    </section>
  );
}

export default WeatherCard;