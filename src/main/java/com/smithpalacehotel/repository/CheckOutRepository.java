package com.smithpalacehotel.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.smithpalacehotel.models.*;

@Repository
public interface CheckOutRepository extends JpaRepository<CheckOut, Integer>{ 
}