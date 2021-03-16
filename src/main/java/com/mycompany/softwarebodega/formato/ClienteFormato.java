/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.formato;

import com.mycompany.softwarebodega.modelo.Cliente;

/**
 *
 * @author Aaron
 */
public interface ClienteFormato {
    public void Search();
    public void Create(Cliente e);
    public void Update(Cliente e);
    public void Delete(int code);
}
