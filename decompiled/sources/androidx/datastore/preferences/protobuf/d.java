package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d {
    public final us0 a;
    public int b;
    public int c;
    public int d = 0;

    public d(us0 us0) {
        Charset charset = tf3.a;
        this.a = us0;
        us0.x = this;
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.z();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void b(Object obj, pg6 pg6, z92 z92) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            pg6.e(obj, this, z92);
            if (this.b != this.c) {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public final void c(Object obj, pg6 pg6, z92 z92) {
        us0 us0 = this.a;
        int A = us0.A();
        if (us0.w < 100) {
            int j = us0.j(A);
            us0.w++;
            pg6.e(obj, this, z92);
            us0.a(0);
            us0.w--;
            us0.h(j);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public final void d(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 0) {
            do {
                ((du5) qf3).add(Boolean.valueOf(us0.k()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else if (i == 2) {
            int b2 = us0.b() + us0.A();
            do {
                ((du5) qf3).add(Boolean.valueOf(us0.k()));
            } while (us0.b() < b2);
            v(b2);
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final zf0 e() {
        w(2);
        return this.a.l();
    }

    public final void f(qf3 qf3) {
        int z;
        if ((this.b & 7) == 2) {
            do {
                ((du5) qf3).add(e());
                us0 us0 = this.a;
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final void g(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 1) {
            do {
                ((du5) qf3).add(Double.valueOf(us0.m()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else if (i == 2) {
            int A = us0.A();
            if ((A & 7) == 0) {
                int b2 = us0.b() + A;
                do {
                    ((du5) qf3).add(Double.valueOf(us0.m()));
                } while (us0.b() < b2);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void h(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 0) {
            do {
                ((du5) qf3).add(Integer.valueOf(us0.n()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else if (i == 2) {
            int b2 = us0.b() + us0.A();
            do {
                ((du5) qf3).add(Integer.valueOf(us0.n()));
            } while (us0.b() < b2);
            v(b2);
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final Object i(sc8 sc8, Class cls, z92 z92) {
        int ordinal = sc8.ordinal();
        us0 us0 = this.a;
        switch (ordinal) {
            case b85.b /*0*/:
                w(1);
                return Double.valueOf(us0.m());
            case 1:
                w(5);
                return Float.valueOf(us0.q());
            case 2:
                w(0);
                return Long.valueOf(us0.s());
            case 3:
                w(0);
                return Long.valueOf(us0.B());
            case 4:
                w(0);
                return Integer.valueOf(us0.r());
            case 5:
                w(1);
                return Long.valueOf(us0.p());
            case 6:
                w(5);
                return Integer.valueOf(us0.o());
            case 7:
                w(0);
                return Boolean.valueOf(us0.k());
            case 8:
                w(2);
                return us0.y();
            case 10:
                w(2);
                pg6 a2 = bu5.c.a(cls);
                e d2 = a2.d();
                c(d2, a2, z92);
                a2.b(d2);
                return d2;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(us0.A());
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                w(0);
                return Integer.valueOf(us0.n());
            case 14:
                w(5);
                return Integer.valueOf(us0.t());
            case h75.g /*15*/:
                w(1);
                return Long.valueOf(us0.u());
            case 16:
                w(0);
                return Integer.valueOf(us0.v());
            case 17:
                w(0);
                return Long.valueOf(us0.w());
            default:
                h.q("unsupported field type.");
                return null;
        }
    }

    public final void j(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 2) {
            int A = us0.A();
            if ((A & 3) == 0) {
                int b2 = us0.b() + A;
                do {
                    ((du5) qf3).add(Integer.valueOf(us0.o()));
                } while (us0.b() < b2);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else if (i == 5) {
            do {
                ((du5) qf3).add(Integer.valueOf(us0.o()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void k(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 1) {
            do {
                ((du5) qf3).add(Long.valueOf(us0.p()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else if (i == 2) {
            int A = us0.A();
            if ((A & 7) == 0) {
                int b2 = us0.b() + A;
                do {
                    ((du5) qf3).add(Long.valueOf(us0.p()));
                } while (us0.b() < b2);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void l(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 2) {
            int A = us0.A();
            if ((A & 3) == 0) {
                int b2 = us0.b() + A;
                do {
                    ((du5) qf3).add(Float.valueOf(us0.q()));
                } while (us0.b() < b2);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else if (i == 5) {
            do {
                ((du5) qf3).add(Float.valueOf(us0.q()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void m(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 0) {
            do {
                ((du5) qf3).add(Integer.valueOf(us0.r()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else if (i == 2) {
            int b2 = us0.b() + us0.A();
            do {
                ((du5) qf3).add(Integer.valueOf(us0.r()));
            } while (us0.b() < b2);
            v(b2);
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void n(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 0) {
            do {
                ((du5) qf3).add(Long.valueOf(us0.s()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else if (i == 2) {
            int b2 = us0.b() + us0.A();
            do {
                ((du5) qf3).add(Long.valueOf(us0.s()));
            } while (us0.b() < b2);
            v(b2);
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void o(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 2) {
            int A = us0.A();
            if ((A & 3) == 0) {
                int b2 = us0.b() + A;
                do {
                    ((du5) qf3).add(Integer.valueOf(us0.t()));
                } while (us0.b() < b2);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else if (i == 5) {
            do {
                ((du5) qf3).add(Integer.valueOf(us0.t()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void p(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 1) {
            do {
                ((du5) qf3).add(Long.valueOf(us0.u()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else if (i == 2) {
            int A = us0.A();
            if ((A & 7) == 0) {
                int b2 = us0.b() + A;
                do {
                    ((du5) qf3).add(Long.valueOf(us0.u()));
                } while (us0.b() < b2);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void q(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 0) {
            do {
                ((du5) qf3).add(Integer.valueOf(us0.v()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else if (i == 2) {
            int b2 = us0.b() + us0.A();
            do {
                ((du5) qf3).add(Integer.valueOf(us0.v()));
            } while (us0.b() < b2);
            v(b2);
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void r(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 0) {
            do {
                ((du5) qf3).add(Long.valueOf(us0.w()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else if (i == 2) {
            int b2 = us0.b() + us0.A();
            do {
                ((du5) qf3).add(Long.valueOf(us0.w()));
            } while (us0.b() < b2);
            v(b2);
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void s(qf3 qf3, boolean z) {
        String str;
        int z2;
        if ((this.b & 7) == 2) {
            do {
                us0 us0 = this.a;
                if (z) {
                    w(2);
                    str = us0.y();
                } else {
                    w(2);
                    str = us0.x();
                }
                ((du5) qf3).add(str);
                if (!us0.c()) {
                    z2 = us0.z();
                } else {
                    return;
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final void t(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 0) {
            do {
                ((du5) qf3).add(Integer.valueOf(us0.A()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else if (i == 2) {
            int b2 = us0.b() + us0.A();
            do {
                ((du5) qf3).add(Integer.valueOf(us0.A()));
            } while (us0.b() < b2);
            v(b2);
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void u(qf3 qf3) {
        int z;
        int i = this.b & 7;
        us0 us0 = this.a;
        if (i == 0) {
            do {
                ((du5) qf3).add(Long.valueOf(us0.B()));
                if (!us0.c()) {
                    z = us0.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.d = z;
        } else if (i == 2) {
            int b2 = us0.b() + us0.A();
            do {
                ((du5) qf3).add(Long.valueOf(us0.B()));
            } while (us0.b() < b2);
            v(b2);
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void v(int i) {
        if (this.a.b() != i) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void w(int i) {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean x() {
        int i;
        us0 us0 = this.a;
        if (us0.c() || (i = this.b) == this.c) {
            return false;
        }
        return us0.C(i);
    }
}
