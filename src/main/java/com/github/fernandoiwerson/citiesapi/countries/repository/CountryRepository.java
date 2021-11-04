package com.github.fernandoiwerson.citiesapi.countries.repository;

import com.github.fernandoiwerson.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
