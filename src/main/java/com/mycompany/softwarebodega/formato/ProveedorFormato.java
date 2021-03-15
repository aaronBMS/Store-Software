/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.formato;

import com.mycompany.softwarebodega.modelo.Proveedor;

/**
 *
 * @author Aaron
 */
public interface ProveedorFormato {
    public void Search();
    public void Create(Proveedor e);
    public void Update(Proveedor e);
    public void Delete(int code);
}
