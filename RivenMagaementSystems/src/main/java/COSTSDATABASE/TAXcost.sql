/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  dpw82
 * Created: Oct 24, 2022
 */

CREATE DATABASE TAX;

CREATE TABLE COMMONTAX(
    salesTax double,
    propertyTax double
    stateTax double,
    federalTax double,
);

INSERT INTO COMMONTAX(0, 0, 0, 0);
