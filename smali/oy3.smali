.class public final Loy3;
.super Lxz4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final t0:Lkb9;


# instance fields
.field public r0:Lmy3;

.field public s0:Lny3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Ldh4;->b()Lkb9;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Ljt0;->h:I

    .line 6
    .line 7
    sget-wide v1, Ljt0;->e:J

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lkb9;->k(J)V

    .line 10
    .line 11
    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lkb9;->q(F)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lkb9;->r(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Loy3;->t0:Lkb9;

    .line 22
    .line 23
    return-void
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
.end method

.method public constructor <init>(Luy3;Lmy3;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lxz4;-><init>(Luy3;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Loy3;->r0:Lmy3;

    .line 5
    .line 6
    iget-object p1, p1, Luy3;->D:Luy3;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lny3;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lny3;-><init>(Loy3;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v0

    .line 18
    :goto_0
    iput-object p1, p0, Loy3;->s0:Lny3;

    .line 19
    .line 20
    check-cast p2, Lll4;

    .line 21
    .line 22
    iget-object p0, p2, Lll4;->w:Lll4;

    .line 23
    .line 24
    iget p0, p0, Lll4;->y:I

    .line 25
    .line 26
    and-int/lit16 p0, p0, 0x200

    .line 27
    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-static {}, Lku4;->a()V

    .line 32
    .line 33
    .line 34
    throw v0
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
.end method


# virtual methods
.method public final E1(Lmy3;)V
    .locals 1

    .line 1
    iget-object v0, p0, Loy3;->r0:Lmy3;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Lll4;

    .line 11
    .line 12
    iget-object v0, v0, Lll4;->w:Lll4;

    .line 13
    .line 14
    iget v0, v0, Lll4;->y:I

    .line 15
    .line 16
    and-int/lit16 v0, v0, 0x200

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lku4;->a()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    :goto_0
    iput-object p1, p0, Loy3;->r0:Lmy3;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
.end method

.method public final W(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Loy3;->r0:Lmy3;

    .line 2
    .line 3
    iget-object v1, p0, Lxz4;->P:Lxz4;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lmy3;->i0(Ldd4;Lgh4;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
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

.method public final X0()V
    .locals 1

    .line 1
    iget-object v0, p0, Loy3;->s0:Lny3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lny3;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lny3;-><init>(Loy3;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Loy3;->s0:Lny3;

    .line 11
    .line 12
    :cond_0
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

.method public final a1()Lfd4;
    .locals 0

    .line 1
    iget-object p0, p0, Loy3;->s0:Lny3;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method

.method public final c(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Loy3;->r0:Lmy3;

    .line 2
    .line 3
    iget-object v1, p0, Lxz4;->P:Lxz4;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lmy3;->Z(Ldd4;Lgh4;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
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

.method public final c1()Lll4;
    .locals 0

    .line 1
    iget-object p0, p0, Loy3;->r0:Lmy3;

    .line 2
    .line 3
    check-cast p0, Lll4;

    .line 4
    .line 5
    iget-object p0, p0, Lll4;->w:Lll4;

    .line 6
    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
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
.end method

.method public final h0(JFLvr2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lxz4;->s1(JFLvr2;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Ldd4;->J:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lxz4;->n1()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lxz4;->P:Lxz4;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-boolean p2, p1, Ldd4;->K:Z

    .line 18
    .line 19
    iget-boolean p3, p0, Ldd4;->K:Z

    .line 20
    .line 21
    iput-boolean p3, p1, Ldd4;->K:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lxz4;->J0()Lmh4;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Lmh4;->b()V

    .line 28
    .line 29
    .line 30
    iput-boolean p2, p1, Ldd4;->K:Z

    .line 31
    .line 32
    :goto_0
    return-void
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

.method public final l(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Loy3;->r0:Lmy3;

    .line 2
    .line 3
    iget-object v1, p0, Lxz4;->P:Lxz4;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lmy3;->s0(Ldd4;Lgh4;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
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

.method public final p0(Lkb;)I
    .locals 1

    .line 1
    iget-object v0, p0, Loy3;->s0:Lny3;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, v0, Lfd4;->T:Lhp4;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lhp4;->d(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lhp4;->c:[I

    .line 14
    .line 15
    aget p0, p0, p1

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    const/high16 p0, -0x80000000

    .line 19
    .line 20
    return p0

    .line 21
    :cond_1
    invoke-static {p0, p1}, Lrc9;->i(Ldd4;Lkb;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final r1(Lqk0;Lcx2;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lxz4;->P:Lxz4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lxz4;->V0(Lqk0;Lcx2;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lxz4;->O:Luy3;

    .line 10
    .line 11
    invoke-static {p2}, Lxy3;->a(Luy3;)Lp95;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lje;

    .line 16
    .line 17
    invoke-virtual {p2}, Lje;->getShowLayoutBounds()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Lxz4;->P:Lxz4;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-wide v0, p0, Leh5;->y:J

    .line 28
    .line 29
    iget-wide v2, p2, Leh5;->y:J

    .line 30
    .line 31
    invoke-static {v0, v1, v2, v3}, Lwe3;->a(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-wide v0, p2, Lxz4;->Z:J

    .line 38
    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, Loe3;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    :cond_0
    iget-wide v0, p0, Leh5;->y:J

    .line 48
    .line 49
    const/16 p0, 0x20

    .line 50
    .line 51
    shr-long v2, v0, p0

    .line 52
    .line 53
    long-to-int p0, v2

    .line 54
    int-to-float p0, p0

    .line 55
    const/high16 p2, 0x3f000000    # 0.5f

    .line 56
    .line 57
    sub-float v5, p0, p2

    .line 58
    .line 59
    const-wide v2, 0xffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr v0, v2

    .line 65
    long-to-int p0, v0

    .line 66
    int-to-float p0, p0

    .line 67
    sub-float v6, p0, p2

    .line 68
    .line 69
    const/high16 v3, 0x3f000000    # 0.5f

    .line 70
    .line 71
    const/high16 v4, 0x3f000000    # 0.5f

    .line 72
    .line 73
    sget-object v7, Loy3;->t0:Lkb9;

    .line 74
    .line 75
    move-object v2, p1

    .line 76
    invoke-interface/range {v2 .. v7}, Lqk0;->a(FFFFLkb9;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public final v(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Loy3;->r0:Lmy3;

    .line 2
    .line 3
    iget-object v1, p0, Lxz4;->P:Lxz4;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lmy3;->f(Ldd4;Lgh4;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
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

.method public final y(J)Leh5;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Leh5;->m0(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Loy3;->r0:Lmy3;

    .line 5
    .line 6
    iget-object v1, p0, Lxz4;->P:Lxz4;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0, v1, p1, p2}, Lmy3;->c(Loh4;Lgh4;J)Lmh4;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lxz4;->v1(Lmh4;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lxz4;->m1()V

    .line 19
    .line 20
    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
