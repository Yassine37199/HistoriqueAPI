package com.example.historique_cnx.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class HistoriqueConnexion {
    @Id
    @SequenceGenerator(sequenceName = "cnx_sequence",
                        name = "cnx_sequence",
                        allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "cnx_sequence")
    private Long idHist;
    private String username;
    private String acctStatusType;
    private LocalDateTime accStartTime;
    private LocalDateTime accStopTime;
    private int accSessionTime;
    private int telADSL;

    public HistoriqueConnexion() {
    }

    public HistoriqueConnexion(Long idHist, String username,
                               String acctStatusType,
                               LocalDateTime accStartTime,
                               LocalDateTime accStopTime,
                               int accSessionTime,
                               int telADSL) {
        this.idHist = idHist;
        this.username = username;
        this.acctStatusType = acctStatusType;
        this.accStartTime = accStartTime;
        this.accStopTime = accStopTime;
        this.accSessionTime = accSessionTime;
        this.telADSL = telADSL;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAcctStatusType() {
        return acctStatusType;
    }

    public void setAcctStatusType(String acctStatusType) {
        this.acctStatusType = acctStatusType;
    }

    public LocalDateTime getAccStartTime() {
        return accStartTime;
    }

    public void setAccStartTime(LocalDateTime accStartTime) {
        this.accStartTime = accStartTime;
    }

    public LocalDateTime getAccStopTime() {
        return accStopTime;
    }

    public void setAccStopTime(LocalDateTime accStopTime) {
        this.accStopTime = accStopTime;
    }

    public int getAccSessionTime() {
        return accSessionTime;
    }

    public void setAccSessionTime(int accSessionTime) {
        this.accSessionTime = accSessionTime;
    }

    public int getTelADSL() {
        return telADSL;
    }

    public void setTelADSL(int telADSL) {
        this.telADSL = telADSL;
    }

    public Long getIdHist() {
        return idHist;
    }

    public void setIdHist(Long idHist) {
        this.idHist = idHist;
    }
}
