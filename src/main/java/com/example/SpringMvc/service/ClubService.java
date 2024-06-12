package com.example.SpringMvc.service;

import com.example.SpringMvc.dto.ClubDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClubService {
List<ClubDto> findAllClubs();

}
