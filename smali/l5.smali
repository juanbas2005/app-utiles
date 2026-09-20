.class public abstract Ll5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lml4;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnw0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lnw0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v2, Ljl4;->w:Ljl4;

    .line 8
    .line 9
    invoke-static {v2, v0}, Lwe;->D(Lml4;Lhs2;)Lml4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v3, Lj5;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v3, v4}, Lj5;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-static {v0, v5, v3}, Lck6;->a(Lml4;ZLvr2;)Lml4;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/high16 v3, 0x41200000    # 10.0f

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-static {v0, v3, v6, v1}, Lx91;->M(Lml4;FFI)Lml4;

    .line 28
    .line 29
    .line 30
    new-instance v0, Lnw0;

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    invoke-direct {v0, v1}, Lnw0;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v0}, Lwe;->D(Lml4;Lhs2;)Lml4;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Lj5;

    .line 41
    .line 42
    invoke-direct {v1, v4}, Lj5;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v5, v1}, Lck6;->a(Lml4;ZLvr2;)Lml4;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0, v6, v3, v5}, Lx91;->M(Lml4;FFI)Lml4;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Ll5;->a:Lml4;

    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method
