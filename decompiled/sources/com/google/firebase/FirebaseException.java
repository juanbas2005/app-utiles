package com.google.firebase;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebaseException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        z65.i(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str, Throwable th) {
        super(str, th);
        z65.i(str, "Detail message must not be empty");
    }
}
