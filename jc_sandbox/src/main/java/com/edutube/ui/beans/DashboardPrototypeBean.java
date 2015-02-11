package com.edutube.ui.beans;

import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;

//import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
//import javax.faces.context.FacesContext;

//import com.solutionary.models.DashboardPrototypeModel;

@ManagedBean
@ViewScoped
public class DashboardPrototypeBean implements Serializable {

    private static final long serialVersionUID = -7809242561210037108L;

    private String testString = "Hello PrimeFaces!";

    // Getters and Setters    
    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
}