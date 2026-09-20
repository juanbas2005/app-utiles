.class public final Lt17;
.super Lr58;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lt17;",
        "Lr58;",
        "red"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Ld17;

.field public final c:Ld37;

.field public final d:Lxw5;


# direct methods
.method public constructor <init>(Ld17;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lr58;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lt17;->b:Ld17;

    .line 8
    .line 9
    new-instance p1, Lis7;

    .line 10
    .line 11
    new-instance v0, Le17;

    .line 12
    .line 13
    invoke-direct {v0}, Le17;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x6

    .line 17
    invoke-direct {p1, v1, v0}, Lis7;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Le37;->a(Ljava/lang/Object;)Ld37;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lt17;->c:Ld37;

    .line 25
    .line 26
    new-instance v0, Lis7;

    .line 27
    .line 28
    new-instance v2, Le17;

    .line 29
    .line 30
    invoke-direct {v2}, Le17;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lis7;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lu58;->a(Lr58;)Lls0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {p1, v0, v1}, Lkl8;->N(Ldi2;Ljava/lang/Object;Lo81;)Lxw5;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lt17;->d:Lxw5;

    .line 45
    .line 46
    invoke-static {p0}, Lu58;->a(Lr58;)Lls0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v0, Lr17;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-direct {v0, p0, v2, v1}, Lr17;-><init>(Lt17;Lf61;I)V

    .line 55
    .line 56
    .line 57
    const/4 v1, 0x3

    .line 58
    invoke-static {p1, v2, v2, v0, v1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, Lu58;->a(Lr58;)Lls0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v0, Lr17;

    .line 66
    .line 67
    const/4 v3, 0x1

    .line 68
    invoke-direct {v0, p0, v2, v3}, Lr17;-><init>(Lt17;Lf61;I)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v2, v2, v0, v1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 72
    .line 73
    .line 74
    return-void
    .line 75
    .line 76
.end method
