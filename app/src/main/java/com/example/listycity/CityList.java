package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class represents a list of {@link City} objects.
 * It allows adding, removing, counting, and checking for the presence of cities,
 * as well as retrieving them in sorted order.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not already exist.
     *
     * @param city The {@link City} to add to the list.
     * @throws IllegalArgumentException if the city already exists in the list.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists in the list.");
        }
        cities.add(city);
    }

    /**
     * Returns a sorted list of cities.
     *
     * @return A new sorted {@link List} of {@link City} objects.
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether a city exists in the list.
     *
     * @param city The {@link City} to check for.
     * @return {@code true} if the city exists in the list, {@code false} otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list if it exists.
     *
     * @param city The {@link City} to delete.
     * @throws IllegalArgumentException if the city does not exist in the list.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in the list.");
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list.
     *
     * @return The count of {@link City} objects in the list.
     */
    public int countCities() {
        return cities.size();
    }
}
