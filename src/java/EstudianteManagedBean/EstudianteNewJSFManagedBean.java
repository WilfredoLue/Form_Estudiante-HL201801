/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudianteManagedBean;

import Tratamiento_Estudiantes.TbEstudiante;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author wilfr
 */
@Named(value = "estudianteNewJSFManagedBean")
@Dependent
public class EstudianteNewJSFManagedBean {

    @EJB
    private TbEstudianteFacadeLocal tbEstudianteFacade;
    TbEstudiante estud= new TbEstudiante();

    public TbEstudiante getEstud() {
        return estud;
    }

    public void setEstud(TbEstudiante estud) {
        this.estud = estud;
    }
    public void validar(){
        tbEstudianteFacade.create(estud);
    }
    public void modificar(){
        tbEstudianteFacade.edit(estud);
    }
    public void supimir(){
        tbEstudianteFacade.remove(estud);
    }

    /**
     * Creates a new instance of EstudianteNewJSFManagedB ean
     */
    public EstudianteNewJSFManagedBean() {
    }
    
}
