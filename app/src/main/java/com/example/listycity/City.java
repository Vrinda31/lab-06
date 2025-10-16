package com.example.listycity;

/**
 * This class defines a City object with a city name and province name.
 * It implements {@link Comparable} to allow sorting by city name.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructs a new {@link City}.
     *
     * @param city     The name of the city.
     * @param province The name of the province the city belongs to.
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return The city name as a {@link String}.
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Returns the name of the province.
     *
     * @return The province name as a {@link String}.
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city to another city based on city name.
     *
     * @param other The other {@link City} to compare to.
     * @return A negative integer, zero, or a positive integer if this city's
     *         name is lexicographically less than, equal to, or greater than
     *         the specified city's name.
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * Determines whether two cities are equal based on both city and province names.
     *
     * @param obj The object to compare to.
     * @return {@code true} if both city and province names match, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof City)) return false;
        City other = (City) obj;
        return this.city.equals(other.city) && this.province.equals(other.province);
    }

    /**
     * Returns a hash code value for the city, based on its city and province names.
     *
     * @return The hash code value.
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}
