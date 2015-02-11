package com.edutube.ui.beans;

import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;

//import javax.faces.application.FacesMessage;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
//import javax.faces.context.FacesContext;


@ManagedBean(name="youtubeTreeView")
@ViewScoped
public class YoutubeViewBean implements Serializable {

    private static final long serialVersionUID = -7809242561210037108L;

    private TreeNode root;
    private int timestamp;

    @PostConstruct
    public void init(){
        root = new DefaultTreeNode("Root", null);
        TreeNode node0 = new DefaultTreeNode("Root Node", root);
        
        TreeNode node00 = new DefaultTreeNode("Child Node 1", node0);
        TreeNode node01 = new DefaultTreeNode("Chile Node 2", node0);
        
    }
    // Getters and Setters    
    public TreeNode getRoot() {
        return root;
    }
    
    public int getTimestamp(){
        return timestamp;
    }

    public void setTimestamp(int timestamp){
        this.timestamp = timestamp;
    }
}