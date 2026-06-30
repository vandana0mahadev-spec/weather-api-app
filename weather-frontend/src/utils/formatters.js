export function formatTemperature(value) {
  if (value === null || value === undefined) return "N/A";
  return `${Math.round(value)}°C`;
}

export function formatWindSpeed(value) {
  if (value === null || value === undefined) return "N/A";
  return `${value} m/s`;
}