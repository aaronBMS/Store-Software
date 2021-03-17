/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.formato;

import com.mycompany.softwarebodega.modelo.Usuario;

/**
 *
 * @author Aaron
 */
public interface UsuarioFormato {
    public void Search();
    public void Create(Usuario e);
    public void Update(Usuario e);
    public void Delete(int code);
    public void Validate();
    public void ValidatePriority(String user);
    public void ComboBox();
}
