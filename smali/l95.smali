.class public abstract Ll95;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lyy0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lot4;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lot4;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lyy0;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lyy0;-><init>(Lvr2;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Ll95;->a:Lyy0;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final a(Lml4;)Lml4;
    .locals 1

    .line 1
    new-instance v0, Lm95;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lml4;->d(Lml4;)Lml4;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static final b(Lyt2;)Lxf;
    .locals 10

    .line 1
    const v0, 0x10dd5ab0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lyt2;->e0(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Ll95;->a:Lyy0;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lyf;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyt2;->r(Z)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-virtual {p0, v0}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p0}, Lyt2;->Q()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    sget-object v2, Lay0;->a:Ld63;

    .line 34
    .line 35
    if-ne v3, v2, :cond_2

    .line 36
    .line 37
    :cond_1
    new-instance v4, Lxf;

    .line 38
    .line 39
    iget-object v5, v0, Lyf;->a:Landroid/content/Context;

    .line 40
    .line 41
    iget-object v6, v0, Lyf;->b:Ltp1;

    .line 42
    .line 43
    iget-wide v7, v0, Lyf;->c:J

    .line 44
    .line 45
    iget-object v9, v0, Lyf;->d:Lla5;

    .line 46
    .line 47
    invoke-direct/range {v4 .. v9}, Lxf;-><init>(Landroid/content/Context;Ltp1;JLla5;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v4}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object v3, v4

    .line 54
    :cond_2
    check-cast v3, Lxf;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lyt2;->r(Z)V

    .line 57
    .line 58
    .line 59
    return-object v3
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
