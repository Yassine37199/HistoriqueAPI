package com.example.historique_cnx;

import com.example.historique_cnx.entities.HistoriqueConnexion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoriqueRepository extends JpaRepository<HistoriqueConnexion , Long> {

    @Query("SELECT h from HistoriqueConnexion h "+
    "WHERE h.username = ?1")
    List<HistoriqueConnexion> getHistoriqueByUsername(String username);
}
