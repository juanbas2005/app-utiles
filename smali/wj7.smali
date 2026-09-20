.class public abstract Lwj7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/high16 v0, 0x41800000    # 16.0f

    .line 2
    .line 3
    const/high16 v1, 0x41000000    # 8.0f

    .line 4
    .line 5
    invoke-static {v0, v1}, Lpv8;->c(FF)J

    .line 6
    .line 7
    .line 8
    const/high16 v0, 0x43480000    # 200.0f

    .line 9
    .line 10
    sput v0, Lwj7;->a:F

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static a(Lyt2;)Lck7;
    .locals 5

    .line 1
    sget-object v0, Lak7;->a:Lpa5;

    .line 2
    .line 3
    sget-object v0, Lxy0;->h:Lt37;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ltp1;

    .line 10
    .line 11
    const/high16 v1, 0x40800000    # 4.0f

    .line 12
    .line 13
    invoke-interface {v0, v1}, Ltp1;->r0(F)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget-object v1, Lxy0;->v:Lt37;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lw98;

    .line 24
    .line 25
    check-cast v1, Lk44;

    .line 26
    .line 27
    invoke-virtual {v1}, Lk44;->a()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {p0, v0}, Lyt2;->e(I)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {p0, v1, v2}, Lyt2;->f(J)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    or-int/2addr v3, v4

    .line 40
    invoke-virtual {p0}, Lyt2;->Q()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-nez v3, :cond_0

    .line 45
    .line 46
    sget-object v3, Lay0;->a:Ld63;

    .line 47
    .line 48
    if-ne v4, v3, :cond_1

    .line 49
    .line 50
    :cond_0
    new-instance v4, Lck7;

    .line 51
    .line 52
    invoke-direct {v4, v1, v2, v0}, Lck7;-><init>(JI)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v4}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    check-cast v4, Lck7;

    .line 59
    .line 60
    return-object v4
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
