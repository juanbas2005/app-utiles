package defpackage;

/* renamed from: cd0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class cd0 {
    public static final sn0 a = new sn0(-1, (sn0) null, (ad0) null, 0);
    public static final int b = ya5.u(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = ya5.u(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final py2 d = new py2("BUFFERED", 4);
    public static final py2 e = new py2("SHOULD_BUFFER", 4);
    public static final py2 f = new py2("S_RESUMING_BY_RCV", 4);
    public static final py2 g = new py2("RESUMING_BY_EB", 4);
    public static final py2 h = new py2("POISONED", 4);
    public static final py2 i = new py2("DONE_RCV", 4);
    public static final py2 j = new py2("INTERRUPTED_SEND", 4);
    public static final py2 k = new py2("INTERRUPTED_RCV", 4);
    public static final py2 l = new py2("CHANNEL_CLOSED", 4);
    public static final py2 m = new py2("SUSPEND", 4);
    public static final py2 n = new py2("SUSPEND_NO_WAITER", 4);
    public static final py2 o = new py2("FAILED", 4);
    public static final py2 p = new py2("NO_RECEIVE_RESULT", 4);
    public static final py2 q = new py2("CLOSE_HANDLER_CLOSED", 4);
    public static final py2 r = new py2("CLOSE_HANDLER_INVOKED", 4);
    public static final py2 s = new py2("NO_CLOSE_CAUSE", 4);

    public static final boolean a(ik0 ik0, Object obj, hs2 hs2) {
        py2 n2 = ik0.n(obj, hs2);
        if (n2 == null) {
            return false;
        }
        ik0.N(n2);
        return true;
    }
}
