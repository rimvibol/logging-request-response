package com.example.logrequestresponse.repo;

import com.example.logrequestresponse.model.GreetingResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vibol rim
 */
@Repository
public interface LoggingRepo extends JpaRepository<GreetingResponse,String> {
}
