/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
package org.zeromq.czmq;

public class Zstr implements AutoCloseable {
    static {
        try {
            System.loadLibrary ("czmqjni");
        }
        catch (Exception e) {
            System.exit (-1);
        }
    }
    long self;

    /*
    Receive C string from socket. Caller must free returned string using
    zstr_free(). Returns NULL if the context is being terminated or the 
    process was interrupted.                                            
    */
    native static String __recv (void * source);
    public String recv (void * source) {
        return Zstr.__recv (source);
    }
    /*
    Receive a series of strings (until NULL) from multipart data.    
    Each string is allocated and filled with string data; if there   
    are not enough frames, unallocated strings are set to NULL.      
    Returns -1 if the message could not be read, else returns the    
    number of strings filled, zero or more. Free each returned string
    using zstr_free(). If not enough strings are provided, remaining 
    multipart frames in the message are dropped.                     
    */
    native static int __recvx (void * source, String stringP);
    public int recvx (void * source, String stringP) {
        return Zstr.__recvx (source, stringP);
    }
    /*
    Send a C string to a socket, as a frame. The string is sent without 
    trailing null byte; to read this you can use zstr_recv, or a similar
    method that adds a null terminator on the received string. String   
    may be NULL, which is sent as "".                                   
    */
    native static int __send (void * dest, String string);
    public int send (void * dest, String string) {
        return Zstr.__send (dest, string);
    }
    /*
    Send a C string to a socket, as zstr_send(), with a MORE flag, so that
    you can send further strings in the same multi-part message.          
    */
    native static int __sendm (void * dest, String string);
    public int sendm (void * dest, String string) {
        return Zstr.__sendm (dest, string);
    }
    /*
    Send a formatted string to a socket. Note that you should NOT use
    user-supplied strings in the format (they may contain '%' which  
    will create security holes).                                     
    */
    native static int __sendf (void * dest, String format);
    public int sendf (void * dest, String format) {
        return Zstr.__sendf (dest, format);
    }
    /*
    Send a formatted string to a socket, as for zstr_sendf(), with a      
    MORE flag, so that you can send further strings in the same multi-part
    message.                                                              
    */
    native static int __sendfm (void * dest, String format);
    public int sendfm (void * dest, String format) {
        return Zstr.__sendfm (dest, format);
    }
    /*
    Send a series of strings (until NULL) as multipart data   
    Returns 0 if the strings could be sent OK, or -1 on error.
    */
    native static int __sendx (void * dest, String string);
    public int sendx (void * dest, String string) {
        return Zstr.__sendx (dest, string);
    }
    /*
    Free a provided string, and nullify the parent pointer. Safe to call on
    a null pointer.                                                        
    */
    native static void __free (String stringP);
    public void free (String stringP) {
        return Zstr.__free (stringP);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public void test (boolean verbose) {
        return Zstr.__test (verbose);
    }
}