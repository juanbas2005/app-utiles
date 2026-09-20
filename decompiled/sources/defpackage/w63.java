package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: w63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w63 implements Comparable {
    public static final w63 A;
    public static final w63 B;
    public static final w63 C;
    public static final w63 D;
    public static final w63 E;
    public static final w63 F;
    public static final w63 G;
    public static final w63 y;
    public static final w63 z;
    public final int w;
    public final String x;

    static {
        w63 w63 = new w63(100, "Continue");
        w63 w632 = new w63(101, "Switching Protocols");
        w63 w633 = new w63(102, "Processing");
        w63 w634 = new w63(200, "OK");
        w63 w635 = new w63(201, "Created");
        w63 w636 = new w63(202, "Accepted");
        w63 w637 = new w63(203, "Non-Authoritative Information");
        w63 w638 = new w63(204, "No Content");
        w63 w639 = new w63(205, "Reset Content");
        w63 w6310 = new w63(206, "Partial Content");
        w63 w6311 = new w63(207, "Multi-Status");
        w63 w6312 = new w63(300, "Multiple Choices");
        w63 w6313 = new w63(301, "Moved Permanently");
        y = w6313;
        w63 w6314 = new w63(302, "Found");
        z = w6314;
        w63 w6315 = w63;
        w63 w6316 = new w63(303, "See Other");
        A = w6316;
        w63 w6317 = new w63(304, "Not Modified");
        w63 w6318 = new w63(305, "Use Proxy");
        w63 w6319 = new w63(306, "Switch Proxy");
        w63 w6320 = new w63(307, "Temporary Redirect");
        B = w6320;
        w63 w6321 = w6320;
        w63 w6322 = new w63(308, "Permanent Redirect");
        C = w6322;
        w63 w6323 = w6322;
        w63 w6324 = new w63(400, "Bad Request");
        D = w6324;
        w63 w6325 = w6324;
        w63 w6326 = new w63(401, "Unauthorized");
        E = w6326;
        w63 w6327 = new w63(402, "Payment Required");
        w63 w6328 = new w63(403, "Forbidden");
        w63 w6329 = new w63(404, "Not Found");
        F = w6329;
        w63 w6330 = w6329;
        w63 w6331 = new w63(405, "Method Not Allowed");
        w63 w6332 = new w63(406, "Not Acceptable");
        w63 w6333 = new w63(407, "Proxy Authentication Required");
        w63 w6334 = new w63(408, "Request Timeout");
        w63 w6335 = new w63(409, "Conflict");
        w63 w6336 = new w63(410, "Gone");
        w63 w6337 = new w63(411, "Length Required");
        w63 w6338 = new w63(412, "Precondition Failed");
        w63 w6339 = new w63(413, "Payload Too Large");
        w63 w6340 = new w63(414, "Request-URI Too Long");
        w63 w6341 = new w63(415, "Unsupported Media Type");
        w63 w6342 = new w63(416, "Requested Range Not Satisfiable");
        w63 w6343 = new w63(417, "Expectation Failed");
        w63 w6344 = new w63(422, "Unprocessable Entity");
        G = w6344;
        w63 w6345 = new w63(423, "Locked");
        w63 w6346 = new w63(424, "Failed Dependency");
        w63 w6347 = new w63(425, "Too Early");
        w63 w6348 = new w63(426, "Upgrade Required");
        w63 w6349 = new w63(429, "Too Many Requests");
        w63 w6350 = new w63(431, "Request Header Fields Too Large");
        w63 w6351 = new w63(500, "Internal Server Error");
        w63 w6352 = new w63(501, "Not Implemented");
        w63 w6353 = w632;
        w63 w6354 = w6318;
        w63 w6355 = w6321;
        w63 w6356 = w6325;
        w63 w6357 = w6327;
        w63 w6358 = w6330;
        w63 w6359 = w6332;
        w63 w6360 = w6334;
        w63 w6361 = w6336;
        w63 w6362 = w6338;
        w63 w6363 = w6340;
        w63 w6364 = w6342;
        w63 w6365 = w6344;
        w63 w6366 = w6346;
        w63 w6367 = w6348;
        w63 w6368 = w6350;
        w63 w6369 = w6352;
        List E2 = sg3.E(w6315, w6353, w633, w634, w635, w636, w637, w638, w639, w6310, w6311, w6312, w6313, w6314, w6316, w6317, w6354, w6319, w6355, w6323, w6356, w6326, w6357, w6328, w6358, w6331, w6359, w6333, w6360, w6335, w6361, w6337, w6362, w6339, w6363, w6341, w6364, w6343, w6365, w6345, w6366, w6347, w6367, w6349, w6368, w6351, w6369, new w63(502, "Bad Gateway"), new w63(503, "Service Unavailable"), new w63(504, "Gateway Timeout"), new w63(505, "HTTP Version Not Supported"), new w63(506, "Variant Also Negotiates"), new w63(507, "Insufficient Storage"));
        int F2 = tf4.F(et0.e0(E2, 10));
        if (F2 < 16) {
            F2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F2);
        for (Object next : E2) {
            linkedHashMap.put(Integer.valueOf(((w63) next).w), next);
        }
    }

    public w63(int i, String str) {
        str.getClass();
        this.w = i;
        this.x = str;
    }

    public final int compareTo(Object obj) {
        w63 w63 = (w63) obj;
        w63.getClass();
        return this.w - w63.w;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w63) || ((w63) obj).w != this.w) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.w);
    }

    public final String toString() {
        return this.w + ' ' + this.x;
    }
}
