package com.rfcq.infoshow.repository;

import com.rfcq.infoshow.dto.UserInfoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoDTO, Long> {
}
