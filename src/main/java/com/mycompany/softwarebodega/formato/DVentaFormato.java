/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.formato;

import com.mycompany.softwarebodega.modelo.DetalleVenta;

/**
 *
 * @author Aaron
 */
public interface DVentaFormato {
    public void Create(DetalleVenta e);
    public void Search(String n);
    public void ComboBox();
}
