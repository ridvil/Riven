/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  dpw82
 * Created: Oct 24, 2022
 */

CREATE DATABASE EMPLOYEES;

CREATE TABLE EMPLOYEEINFO(
    payRate double,
    hours double,
    jobTitle VARCHAR(255),
);

INSERT INTO EMPLOYEEINFO (0, 0, 'TestEmployee');