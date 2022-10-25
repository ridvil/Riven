/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  dpw82
 * Created: Oct 24, 2022
 */

CREATE DATABASE COSTOFGOODSSOLD;

CREATE TABLE SportsCarsPurchased (
    VIN int,
    Make varchar(255),
    Model varchar(255),
    Price double,
    Warranty boolean
);

CREATE TABLE SedanCarsPurchased (
    VIN int,
    Make varchar(255),
    Model varchar(255),
    Price double,
    Warranty boolean
);

CREATE TABLE SUVCarsPurchased (
    VIN int,
    Make varchar(255),
    Model varchar(255),
    Price double,
    Warranty boolean
);