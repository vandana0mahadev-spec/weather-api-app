function SearchBox({ city, setCity, onSearch, onKeyDown, loading }) {
  return (
    <section className="search-panel">
      <label htmlFor="city" className="input-label">
        City
      </label>

      <div className="search-row">
        <input
          id="city"
          type="text"
          placeholder="Enter city name"
          value={city}
          onChange={(e) => setCity(e.target.value)}
          onKeyDown={onKeyDown}
          disabled={loading}
        />

        <button onClick={onSearch} disabled={loading}>
          {loading ? "Searching..." : "Search"}
        </button>
      </div>
    </section>
  );
}

export default SearchBox;