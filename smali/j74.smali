.class public final Lj74;
.super Ljb5;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final d:Lgq3;

.field public final e:Ljava/lang/Object;

.field public final f:Ljb5;


# direct methods
.method public constructor <init>(Lgq3;Ljava/lang/Object;Ljb5;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lj74;->d:Lgq3;

    .line 11
    .line 12
    iput-object p2, p0, Lj74;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p3, p0, Lj74;->f:Ljb5;

    .line 15
    .line 16
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final C(Lgq3;Ljava/lang/Object;)Ljb5;
    .locals 3

    .line 1
    iget-object v0, p0, Lj74;->d:Lgq3;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lj74;->f:Ljb5;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v2, p1, v1}, Ljb5;->C(Lgq3;Ljava/lang/Object;)Ljb5;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    new-instance v2, Lj74;

    .line 21
    .line 22
    iget-object p0, p0, Lj74;->e:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {v2, v0, p0, v1}, Lj74;-><init>(Lgq3;Ljava/lang/Object;Ljb5;)V

    .line 25
    .line 26
    .line 27
    move-object p0, v2

    .line 28
    :goto_0
    move-object v2, p0

    .line 29
    :goto_1
    if-eqz p2, :cond_2

    .line 30
    .line 31
    new-instance p0, Lj74;

    .line 32
    .line 33
    invoke-direct {p0, p1, p2, v2}, Lj74;-><init>(Lgq3;Ljava/lang/Object;Ljb5;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    return-object v2
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ltm3;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ltm3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p0}, Lcl6;->S(Lvr2;Ljava/lang/Object;)Lal6;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lcl6;->V(Lal6;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ldt0;->O0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v4, Ltm3;

    .line 21
    .line 22
    const/16 p0, 0xd

    .line 23
    .line 24
    invoke-direct {v4, p0}, Ltm3;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const/16 v5, 0x19

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const-string v2, "{"

    .line 31
    .line 32
    const-string v3, "}"

    .line 33
    .line 34
    invoke-static/range {v0 .. v5}, Ldt0;->E0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvr2;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
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
.end method
