.class final Ljc;
.super Lpl4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lpl4;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00030\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Ljc;",
        "T",
        "Lpl4;",
        "Lvc;",
        "foundation"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final w:Lbd;

.field public final x:Z

.field public final y:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lbd;ZLjava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljc;->w:Lbd;

    .line 5
    .line 6
    iput-boolean p2, p0, Ljc;->x:Z

    .line 7
    .line 8
    iput-object p3, p0, Ljc;->y:Ljava/lang/Boolean;

    .line 9
    .line 10
    return-void
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
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Ljc;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Ljc;

    .line 10
    .line 11
    iget-object v0, p1, Ljc;->w:Lbd;

    .line 12
    .line 13
    iget-object v1, p0, Ljc;->w:Lbd;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-boolean v0, p0, Ljc;->x:Z

    .line 23
    .line 24
    iget-boolean v1, p1, Ljc;->x:Z

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object p0, p0, Ljc;->y:Ljava/lang/Boolean;

    .line 30
    .line 31
    iget-object p1, p1, Ljc;->y:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    :goto_0
    const/4 p0, 0x0

    .line 40
    return p0

    .line 41
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0
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

.method public final g()Lll4;
    .locals 5

    .line 1
    new-instance v0, Lvc;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lrc;->a:Lj5;

    .line 5
    .line 6
    iget-boolean v3, p0, Ljc;->x:Z

    .line 7
    .line 8
    sget-object v4, Lz75;->x:Lz75;

    .line 9
    .line 10
    invoke-direct {v0, v2, v3, v1, v4}, Lty1;-><init>(Lvr2;ZLap4;Lz75;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Ljc;->w:Lbd;

    .line 14
    .line 15
    iput-object v1, v0, Lvc;->f0:Lbd;

    .line 16
    .line 17
    iget-object p0, p0, Ljc;->y:Ljava/lang/Boolean;

    .line 18
    .line 19
    iput-object p0, v0, Lvc;->g0:Ljava/lang/Boolean;

    .line 20
    .line 21
    return-object v0
.end method

.method public final h(Lll4;)V
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lvc;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, v0, Lvc;->f0:Lbd;

    .line 8
    .line 9
    iget-object v1, p0, Ljc;->w:Lbd;

    .line 10
    .line 11
    invoke-static {p1, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iput-object v1, v0, Lvc;->f0:Lbd;

    .line 19
    .line 20
    invoke-virtual {v0}, Lvc;->s1()V

    .line 21
    .line 22
    .line 23
    move p1, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    iget-object v1, v0, Lty1;->M:Lz75;

    .line 27
    .line 28
    sget-object v4, Lz75;->x:Lz75;

    .line 29
    .line 30
    if-eq v1, v4, :cond_1

    .line 31
    .line 32
    iput-object v4, v0, Lty1;->M:Lz75;

    .line 33
    .line 34
    move p1, v2

    .line 35
    :cond_1
    iget-object v1, v0, Lvc;->g0:Ljava/lang/Boolean;

    .line 36
    .line 37
    iget-object v3, p0, Ljc;->y:Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    iput-object v3, v0, Lvc;->g0:Ljava/lang/Boolean;

    .line 46
    .line 47
    move v5, v2

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v5, p1

    .line 50
    :goto_1
    iget-object v1, v0, Lty1;->N:Lvr2;

    .line 51
    .line 52
    iget-boolean v2, p0, Ljc;->x:Z

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual/range {v0 .. v5}, Lty1;->p1(Lvr2;ZLap4;Lz75;Z)V

    .line 56
    .line 57
    .line 58
    return-void
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

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Ljc;->w:Lbd;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    sget-object v2, Lz75;->x:Lz75;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-boolean v0, p0, Ljc;->x:Z

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, Lhl6;->i(IIZ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object p0, p0, Ljc;->y:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v0

    .line 31
    const v0, 0xe1781

    .line 32
    .line 33
    .line 34
    mul-int/2addr p0, v0

    .line 35
    return p0
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
.end method
