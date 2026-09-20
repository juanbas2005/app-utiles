package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ja  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ja extends q1 {
    public static final t49 F;
    public static final Logger G;
    public volatile Set D;
    public volatile int E;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ha} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: ha} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: ha} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        ha haVar;
        Class<ja> cls = ja.class;
        G = Logger.getLogger(cls.getName());
        try {
            ha haVar2 = new ha(AtomicReferenceFieldUpdater.newUpdater(cls, Set.class, "D"), AtomicIntegerFieldUpdater.newUpdater(cls, "E"));
            th = null;
            haVar = haVar2;
        } catch (Throwable th) {
            th = th;
            haVar = new Object();
        }
        F = haVar;
        if (th != null) {
            G.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
