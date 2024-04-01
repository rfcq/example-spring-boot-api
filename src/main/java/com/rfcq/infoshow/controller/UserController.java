package com.rfcq.infoshow.controller;

import com.rfcq.infoshow.dto.UserInfoDTO;
import com.rfcq.infoshow.exception.ResourceNotFoundException;
import com.rfcq.infoshow.repository.UserInfoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserInfoRepository userInfoRepository;

    @PostMapping(
            path = "/register-user",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<UserInfoDTO> registerUser(@Valid @RequestBody UserInfoDTO userInfo) {
        try {
            UserInfoDTO user = userInfoRepository.save(new UserInfoDTO(
                    userInfo.getName(),
                    userInfo.getSurname(),
                    userInfo.getUsername(),
                    userInfo.getBirthDate(),
                    userInfo.getEmail(),
                    userInfo.getPhoneNumber()
            ));
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/")
    public List<UserInfoDTO> getAllUsers() {
        List<UserInfoDTO> userList = userInfoRepository.findAll();
        return userList;
    }

    @GetMapping("/get-user/{id}")
    public ResponseEntity<UserInfoDTO> getUserById(@PathVariable(value = "id") Long id)
        throws ResourceNotFoundException {
        UserInfoDTO userInfo = userInfoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with this ID: " + id));

        return ResponseEntity.ok().body(userInfo);

    }

    @PutMapping("/update-user/{id}")
    public ResponseEntity<UserInfoDTO> updateUserById(@PathVariable(value = "id") Long id,
                                                      @Valid @RequestBody UserInfoDTO userInfo)
            throws ResourceNotFoundException {

        UserInfoDTO userData = userInfoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with the ID: " + id));

        userData.setName(userInfo.getName());
        userData.setSurname(userInfo.getSurname());
        userData.setUsername(userInfo.getUsername());
        userData.setEmail(userInfo.getEmail());
        userData.setBirthDate(userInfo.getBirthDate());
        userData.setPhoneNumber(userInfo.getPhoneNumber());
        final UserInfoDTO userInfoUpdated = userInfoRepository.save(userData);
        return ResponseEntity.ok(userInfoUpdated);

    }

    @DeleteMapping("/delete/all")
    public ResponseEntity<HttpStatus> deleteAllUsers() {
        try {
            userInfoRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public Map<String, Boolean> deleteUserById(@PathVariable(value = "id") Long id)
        throws ResourceNotFoundException {

        UserInfoDTO userData = userInfoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with the ID: " + id));

        userInfoRepository.deleteById(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return response;
    }

}
