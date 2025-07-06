package com.joaojunio.contact.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_record_history")
public class RecordHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ip_address")
    private String ip;

    @Column(name = "browser")
    private String browser;

    @Column(name = "operating_system")
    private String operatingSystem;

    @Column(name = "datetime_access")
    private Date datetimeAccess;

    @Column(name = "datetime_registration", nullable = false)
    private Date datetimeRegistration;

    public RecordHistory() {}

    public RecordHistory(String ip, String browser, String operatingSystem, Date datetimeAccess, Date datetimeRegistration) {
        this.ip = ip;
        this.browser = browser;
        this.operatingSystem = operatingSystem;
        this.datetimeAccess = datetimeAccess;
        this.datetimeRegistration = datetimeRegistration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Date getDatetimeAccess() {
        return datetimeAccess;
    }

    public void setDatetimeAccess(Date datetimeAccess) {
        this.datetimeAccess = datetimeAccess;
    }

    public Date getDatetimeRegistration() {
        return datetimeRegistration;
    }

    public void setDatetimeRegistration(Date datetimeRegistration) {
        this.datetimeRegistration = datetimeRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RecordHistory that = (RecordHistory) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
