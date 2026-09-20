package com.wireguard.config;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ParseException extends Exception {
    public final Class w;

    public ParseException(Class cls, String str, String str2, Exception exc) {
        super(str2, exc);
        this.w = cls;
    }
}
