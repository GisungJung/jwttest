package com.gs.jwt.api.repo;

import com.gs.jwt.api.dto.UserDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDto, String> {

}
