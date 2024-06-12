package com.example.SpringMvc.service;

import com.example.SpringMvc.dto.ClubDto;
import com.example.SpringMvc.models.Club;
import com.example.SpringMvc.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ClubServiceImpl implements ClubService{
private ClubRepository clubRepository;
@Autowired
public ClubServiceImpl(ClubRepository clubRepository){
     this.clubRepository=clubRepository;

}
    @Override
    public List<ClubDto> findAllClubs() {
    List<Club> clubs=clubRepository.findAll();
    return clubs.stream().map((club)->maptoClubDto(club)).collect(Collectors.toList());

    }
 public ClubDto maptoClubDto(Club club){
    ClubDto clubDto= ClubDto.builder().id(club.getId()).title(club.getTitle()).photoUrl(club.getPhotoUrl()).content(club.getContent()).createdOn(club.getCreatedOn()).updatedOn(club.getUpdatedOn()).build();
    return clubDto;
 }
}
