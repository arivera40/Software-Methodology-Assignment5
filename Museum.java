package com.example.museumsnyc;

import java.io.Serializable;

/**
* This is the abstract class for Museum which implments Serializable,
* that defines the max amount of tickets
*
*
* @author Andy Rivera and Joseph Shamma
*
*/

public abstract class Museum implements Serializable {
    static final int MAX_TICKETS = 5;  // max amount of tickets allowed
