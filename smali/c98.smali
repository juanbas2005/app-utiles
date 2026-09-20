.class public final Lc98;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Luj;


# direct methods
.method public constructor <init>(Ld98;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ld98;->x:Ld98;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const/high16 p1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    new-instance v0, Luj;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v1, Lwe;->v:Llo7;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/16 v3, 0xc

    .line 22
    .line 23
    invoke-direct {v0, p1, v1, v2, v3}, Luj;-><init>(Ljava/lang/Object;Llo7;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lc98;->a:Luj;

    .line 27
    .line 28
    new-instance p1, Lfd7;

    .line 29
    .line 30
    const/16 v0, 0x8

    .line 31
    .line 32
    invoke-direct {p1, v0, p0}, Lfd7;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lu55;->i(Lsr2;)Loq1;

    .line 36
    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method
