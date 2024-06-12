package com.example.SpringMvc.repository;

import com.example.SpringMvc.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club,Long> {
Optional<Club> findByTitle(String url);
}
