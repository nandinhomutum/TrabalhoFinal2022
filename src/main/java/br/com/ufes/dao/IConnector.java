/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufes.dao;

import java.sql.Connection;


public interface IConnector {
     public Connection connect();
     public void disconect();
}
