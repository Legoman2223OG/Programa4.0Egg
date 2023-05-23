/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1extra;

import java.util.Date;

/**
 *
 * @author mi tamura
 */
public abstract class Barco {
    String matricula; // Formato: Listado 1-9::Provincia Maritima:: Distrito maritimo:: Folio:: Año de registro.
    double eslora; //En metros.
    Date anioDeFabricacion;

    public Barco(String matricula, double eslora, Date anioDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Date getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(Date anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }
    
}
