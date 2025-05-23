package com.example.backend.repository;

import com.example.backend.model.Preferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PreferencesRepository extends JpaRepository<Preferences, Long> {
    Optional<Preferences> findByUserId(Long userId);

    Optional<Preferences> existsByUserId(Long userId);
}