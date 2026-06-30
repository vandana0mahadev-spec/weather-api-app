const API_BASE_URL = import.meta.env.VITE_API_BASE_URL;

export async function getWeatherByCity(city) {
  const response = await fetch(
    `${API_BASE_URL}/api/weather?city=${encodeURIComponent(city)}`
  );

  if (!response.ok) {
    let errorMessage = "Failed to fetch weather data.";

    try {
      const errorData = await response.json();
      errorMessage = errorData.message || errorMessage;
    } catch {
      errorMessage = "Weather service is unavailable.";
    }

    throw new Error(errorMessage);
  }

  return response.json();
}