/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alen.model;

import java.math.BigDecimal;
import jakarta.persistence.Entity;


/**
 *
 * @author Alen
 */
@Entity
public class Smjer {
    
    @Id
    @GeneratedValue(startegy =GenerationType.IDENTITY)
    
    private Integer sifra;
    private String naziv;
    private BigDecimal cijena;
    private BigDecimal upisnina;
    private  Boolean certificiran;

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public BigDecimal getUpisnina() {
        return upisnina;
    }

    public void setUpisnina(BigDecimal upisnina) {
        this.upisnina = upisnina;
    }

    public Boolean getCertificiran() {
        return certificiran;
    }

    public void setCertificiran(Boolean certificiran) {
        this.certificiran = certificiran;
    }
    
    
    
    
    
}
