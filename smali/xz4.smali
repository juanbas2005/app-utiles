.class public abstract Lxz4;
.super Ldd4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgh4;
.implements Ldy3;


# static fields
.field public static final m0:Ll76;

.field public static final n0:Lay3;

.field public static final o0:[F

.field public static final p0:Luz4;

.field public static final q0:Lhr2;


# instance fields
.field public final O:Luy3;

.field public P:Lxz4;

.field public Q:Lxz4;

.field public R:Z

.field public S:Z

.field public T:Lvr2;

.field public U:Ltp1;

.field public V:Ley3;

.field public W:F

.field public X:Lmh4;

.field public Y:Lhp4;

.field public Z:J

.field public a0:F

.field public b0:Lsp4;

.field public c0:Lay3;

.field public d0:Lpq6;

.field public e0:Z

.field public f0:Z

.field public g0:Lcx2;

.field public h0:Lqk0;

.field public i0:Laf;

.field public final j0:Lwz4;

.field public k0:Z

.field public l0:Lo95;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll76;

    .line 2
    .line 3
    invoke-direct {v0}, Ll76;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxz4;->m0:Ll76;

    .line 7
    .line 8
    new-instance v0, Lay3;

    .line 9
    .line 10
    invoke-direct {v0}, Lay3;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lxz4;->n0:Lay3;

    .line 14
    .line 15
    invoke-static {}, Leh4;->a()[F

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lxz4;->o0:[F

    .line 20
    .line 21
    new-instance v0, Luz4;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lxz4;->p0:Luz4;

    .line 27
    .line 28
    new-instance v0, Lhr2;

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    invoke-direct {v0, v1}, Lhr2;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lxz4;->q0:Lhr2;

    .line 35
    .line 36
    return-void
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

.method public constructor <init>(Luy3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldd4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxz4;->O:Luy3;

    .line 5
    .line 6
    iget-object v0, p1, Luy3;->T:Ltp1;

    .line 7
    .line 8
    iput-object v0, p0, Lxz4;->U:Ltp1;

    .line 9
    .line 10
    iget-object p1, p1, Luy3;->U:Ley3;

    .line 11
    .line 12
    iput-object p1, p0, Lxz4;->V:Ley3;

    .line 13
    .line 14
    const p1, 0x3f4ccccd    # 0.8f

    .line 15
    .line 16
    .line 17
    iput p1, p0, Lxz4;->W:F

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    iput-wide v0, p0, Lxz4;->Z:J

    .line 22
    .line 23
    sget-object p1, Lgr8;->h:Lm23;

    .line 24
    .line 25
    iput-object p1, p0, Lxz4;->d0:Lpq6;

    .line 26
    .line 27
    new-instance p1, Lwz4;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-direct {p1, p0, v0}, Lwz4;-><init>(Lxz4;I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lxz4;->j0:Lwz4;

    .line 34
    .line 35
    return-void
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
.end method

.method public static x1(Ldy3;)Lxz4;
    .locals 1

    .line 1
    instance-of v0, p0, Lgd4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lgd4;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, Lgd4;->w:Lfd4;

    .line 13
    .line 14
    iget-object v0, v0, Lfd4;->O:Lxz4;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return-object v0

    .line 20
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, Lxz4;

    .line 24
    .line 25
    return-object p0
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final A(J)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lll4;->J:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p0}, Lt49;->I(Ldy3;)Ldy3;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lxz4;->O:Luy3;

    .line 19
    .line 20
    invoke-static {v1}, Lxy3;->a(Luy3;)Lp95;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lje;

    .line 25
    .line 26
    invoke-virtual {v1}, Lje;->A()V

    .line 27
    .line 28
    .line 29
    iget-object v1, v1, Lje;->s0:[F

    .line 30
    .line 31
    invoke-static {p1, p2, v1}, Leh4;->b(J[F)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    const-wide/16 v1, 0x0

    .line 36
    .line 37
    invoke-interface {v0, v1, v2}, Ldy3;->R(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-static {p1, p2, v1, v2}, Ll35;->d(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    invoke-virtual {p0, v0, p1, p2}, Lxz4;->O(Ldy3;J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p0

    .line 49
    return-wide p0
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

.method public final A1(Lxz4;[F)V
    .locals 6

    .line 1
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lxz4;->l0:Lo95;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v0, Lfx2;

    .line 12
    .line 13
    invoke-virtual {v0}, Lfx2;->b()[F

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p2, v0}, Leh4;->g([F[F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-wide v0, p0, Lxz4;->Z:J

    .line 21
    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, Loe3;->a(JJ)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    sget-object v2, Lxz4;->o0:[F

    .line 31
    .line 32
    invoke-static {v2}, Leh4;->d([F)V

    .line 33
    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    shr-long v3, v0, v3

    .line 38
    .line 39
    long-to-int v3, v3

    .line 40
    int-to-float v3, v3

    .line 41
    const-wide v4, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v0, v4

    .line 47
    long-to-int v0, v0

    .line 48
    int-to-float v0, v0

    .line 49
    invoke-static {v2, v3, v0}, Leh4;->h([FFF)V

    .line 50
    .line 51
    .line 52
    invoke-static {p2, v2}, Leh4;->g([F[F)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object p0, p0, Lxz4;->Q:Lxz4;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void
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

.method public final B()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    iget-object v1, v0, Luy3;->a0:Lo00;

    .line 4
    .line 5
    const/16 v2, 0x40

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lo00;->f(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_9

    .line 13
    .line 14
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 15
    .line 16
    .line 17
    iget-object p0, v0, Luy3;->a0:Lo00;

    .line 18
    .line 19
    iget-object p0, p0, Lo00;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lib7;

    .line 22
    .line 23
    move-object v1, v3

    .line 24
    :goto_0
    if-eqz p0, :cond_8

    .line 25
    .line 26
    iget v4, p0, Lll4;->y:I

    .line 27
    .line 28
    and-int/2addr v4, v2

    .line 29
    if-eqz v4, :cond_7

    .line 30
    .line 31
    move-object v4, p0

    .line 32
    move-object v5, v3

    .line 33
    :goto_1
    if-eqz v4, :cond_7

    .line 34
    .line 35
    instance-of v6, v4, Lgd5;

    .line 36
    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    check-cast v4, Lgd5;

    .line 40
    .line 41
    iget-object v6, v0, Luy3;->T:Ltp1;

    .line 42
    .line 43
    invoke-interface {v4, v6, v1}, Lgd5;->v(Ltp1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_4

    .line 48
    :cond_0
    iget v6, v4, Lll4;->y:I

    .line 49
    .line 50
    and-int/2addr v6, v2

    .line 51
    if-eqz v6, :cond_6

    .line 52
    .line 53
    instance-of v6, v4, Lwo1;

    .line 54
    .line 55
    if-eqz v6, :cond_6

    .line 56
    .line 57
    move-object v6, v4

    .line 58
    check-cast v6, Lwo1;

    .line 59
    .line 60
    iget-object v6, v6, Lwo1;->L:Lll4;

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    :goto_2
    const/4 v8, 0x1

    .line 64
    if-eqz v6, :cond_5

    .line 65
    .line 66
    iget v9, v6, Lll4;->y:I

    .line 67
    .line 68
    and-int/2addr v9, v2

    .line 69
    if-eqz v9, :cond_4

    .line 70
    .line 71
    add-int/lit8 v7, v7, 0x1

    .line 72
    .line 73
    if-ne v7, v8, :cond_1

    .line 74
    .line 75
    move-object v4, v6

    .line 76
    goto :goto_3

    .line 77
    :cond_1
    if-nez v5, :cond_2

    .line 78
    .line 79
    new-instance v5, Leq4;

    .line 80
    .line 81
    const/16 v8, 0x10

    .line 82
    .line 83
    new-array v8, v8, [Lll4;

    .line 84
    .line 85
    invoke-direct {v5, v8}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    if-eqz v4, :cond_3

    .line 89
    .line 90
    invoke-virtual {v5, v4}, Leq4;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move-object v4, v3

    .line 94
    :cond_3
    invoke-virtual {v5, v6}, Leq4;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    :goto_3
    iget-object v6, v6, Lll4;->B:Lll4;

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    if-ne v7, v8, :cond_6

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_6
    :goto_4
    invoke-static {v5}, Lrc9;->j(Leq4;)Lll4;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    goto :goto_1

    .line 108
    :cond_7
    iget-object p0, p0, Lll4;->A:Lll4;

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_8
    return-object v1

    .line 112
    :cond_9
    return-object v3
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final B0()Ldy3;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
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

.method public final B1(Lvr2;Z)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lxz4;->O:Luy3;

    .line 4
    .line 5
    if-nez p2, :cond_1

    .line 6
    .line 7
    iget-object p2, p0, Lxz4;->T:Lvr2;

    .line 8
    .line 9
    if-ne p2, p1, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lxz4;->U:Ltp1;

    .line 12
    .line 13
    iget-object v3, v2, Luy3;->T:Ltp1;

    .line 14
    .line 15
    invoke-static {p2, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, Lxz4;->V:Ley3;

    .line 22
    .line 23
    iget-object v3, v2, Luy3;->U:Ley3;

    .line 24
    .line 25
    if-eq p2, v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move p2, v0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move p2, v1

    .line 31
    :goto_1
    iget-object v3, v2, Luy3;->T:Ltp1;

    .line 32
    .line 33
    iput-object v3, p0, Lxz4;->U:Ltp1;

    .line 34
    .line 35
    iget-object v3, v2, Luy3;->U:Ley3;

    .line 36
    .line 37
    iput-object v3, p0, Lxz4;->V:Ley3;

    .line 38
    .line 39
    invoke-virtual {v2}, Luy3;->J()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object v9, p0, Lxz4;->j0:Lwz4;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    if-eqz v3, :cond_d

    .line 47
    .line 48
    if-eqz p1, :cond_d

    .line 49
    .line 50
    iput-object p1, p0, Lxz4;->T:Lvr2;

    .line 51
    .line 52
    iget-object p1, p0, Lxz4;->l0:Lo95;

    .line 53
    .line 54
    if-nez p1, :cond_b

    .line 55
    .line 56
    invoke-static {v2}, Lxy3;->a(Luy3;)Lp95;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object p2, p0, Lxz4;->i0:Laf;

    .line 61
    .line 62
    if-nez p2, :cond_2

    .line 63
    .line 64
    new-instance p2, Lwz4;

    .line 65
    .line 66
    invoke-direct {p2, p0, v0}, Lwz4;-><init>(Lxz4;I)V

    .line 67
    .line 68
    .line 69
    new-instance v3, Laf;

    .line 70
    .line 71
    const/4 v5, 0x3

    .line 72
    invoke-direct {v3, v5, p0, p2}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object v3, p0, Lxz4;->i0:Laf;

    .line 76
    .line 77
    move-object v8, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move-object v8, p2

    .line 80
    :goto_2
    move-object v7, p1

    .line 81
    check-cast v7, Lje;

    .line 82
    .line 83
    iget-object p1, v7, Lje;->I0:Lk68;

    .line 84
    .line 85
    :cond_3
    iget-object p2, p1, Lk68;->y:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/ref/ReferenceQueue;

    .line 88
    .line 89
    iget-object v3, p1, Lk68;->x:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Leq4;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    if-eqz p2, :cond_4

    .line 98
    .line 99
    invoke-virtual {v3, p2}, Leq4;->k(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_4
    if-nez p2, :cond_3

    .line 103
    .line 104
    :cond_5
    iget p1, v3, Leq4;->y:I

    .line 105
    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    add-int/lit8 p1, p1, -0x1

    .line 109
    .line 110
    invoke-virtual {v3, p1}, Leq4;->l(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Ljava/lang/ref/Reference;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    move-object p1, v4

    .line 124
    :goto_3
    check-cast p1, Lo95;

    .line 125
    .line 126
    if-eqz p1, :cond_a

    .line 127
    .line 128
    move-object p2, p1

    .line 129
    check-cast p2, Lfx2;

    .line 130
    .line 131
    iget-object v3, p2, Lfx2;->x:Lbx2;

    .line 132
    .line 133
    if-eqz v3, :cond_9

    .line 134
    .line 135
    iget-object v5, p2, Lfx2;->w:Lcx2;

    .line 136
    .line 137
    iget-boolean v5, v5, Lcx2;->s:Z

    .line 138
    .line 139
    if-nez v5, :cond_7

    .line 140
    .line 141
    const-string v5, "layer should have been released before reuse"

    .line 142
    .line 143
    invoke-static {v5}, Lyb3;->a(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_7
    invoke-interface {v3}, Lbx2;->c()Lcx2;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iput-object v3, p2, Lfx2;->w:Lcx2;

    .line 151
    .line 152
    iput-boolean v0, p2, Lfx2;->C:Z

    .line 153
    .line 154
    iput-object v8, p2, Lfx2;->z:Lgs2;

    .line 155
    .line 156
    iput-object v9, p2, Lfx2;->A:Lsr2;

    .line 157
    .line 158
    iput-boolean v0, p2, Lfx2;->M:Z

    .line 159
    .line 160
    iput-boolean v0, p2, Lfx2;->N:Z

    .line 161
    .line 162
    iput-boolean v1, p2, Lfx2;->O:Z

    .line 163
    .line 164
    iget-object v3, p2, Lfx2;->D:[F

    .line 165
    .line 166
    invoke-static {v3}, Leh4;->d([F)V

    .line 167
    .line 168
    .line 169
    iget-object v3, p2, Lfx2;->E:[F

    .line 170
    .line 171
    if-eqz v3, :cond_8

    .line 172
    .line 173
    invoke-static {v3}, Leh4;->d([F)V

    .line 174
    .line 175
    .line 176
    :cond_8
    sget-wide v5, Lql7;->b:J

    .line 177
    .line 178
    iput-wide v5, p2, Lfx2;->K:J

    .line 179
    .line 180
    iput-boolean v0, p2, Lfx2;->P:Z

    .line 181
    .line 182
    const-wide v5, 0x7fffffff7fffffffL

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    iput-wide v5, p2, Lfx2;->B:J

    .line 188
    .line 189
    iput-object v4, p2, Lfx2;->L:Ln85;

    .line 190
    .line 191
    iput v0, p2, Lfx2;->J:I

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_9
    const-string p0, "currently reuse is only supported when we manage the layer lifecycle"

    .line 195
    .line 196
    invoke-static {p0}, Lb81;->t(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    throw p0

    .line 201
    :cond_a
    new-instance v4, Lfx2;

    .line 202
    .line 203
    invoke-virtual {v7}, Lje;->getGraphicsContext()Lbx2;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-interface {p1}, Lbx2;->c()Lcx2;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-virtual {v7}, Lje;->getGraphicsContext()Lbx2;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-direct/range {v4 .. v9}, Lfx2;-><init>(Lcx2;Lbx2;Lje;Lgs2;Lsr2;)V

    .line 216
    .line 217
    .line 218
    move-object p1, v4

    .line 219
    :goto_4
    iget-wide v3, p0, Leh5;->y:J

    .line 220
    .line 221
    move-object p2, p1

    .line 222
    check-cast p2, Lfx2;

    .line 223
    .line 224
    invoke-virtual {p2, v3, v4}, Lfx2;->e(J)V

    .line 225
    .line 226
    .line 227
    iget-wide v3, p0, Lxz4;->Z:J

    .line 228
    .line 229
    invoke-virtual {p2, v3, v4}, Lfx2;->d(J)V

    .line 230
    .line 231
    .line 232
    iput-object p1, p0, Lxz4;->l0:Lo95;

    .line 233
    .line 234
    invoke-virtual {p0, v1}, Lxz4;->C1(Z)V

    .line 235
    .line 236
    .line 237
    iput-boolean v1, v2, Luy3;->e0:Z

    .line 238
    .line 239
    invoke-virtual {v9}, Lwz4;->b()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_b
    if-eqz p2, :cond_c

    .line 244
    .line 245
    invoke-virtual {p0, v1}, Lxz4;->C1(Z)V

    .line 246
    .line 247
    .line 248
    :cond_c
    return-void

    .line 249
    :cond_d
    iput-object v4, p0, Lxz4;->T:Lvr2;

    .line 250
    .line 251
    iget-object p1, p0, Lxz4;->l0:Lo95;

    .line 252
    .line 253
    if-eqz p1, :cond_12

    .line 254
    .line 255
    check-cast p1, Lfx2;

    .line 256
    .line 257
    invoke-virtual {p1}, Lfx2;->b()[F

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-static {p2}, Lx91;->D([F)Z

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    if-nez p2, :cond_e

    .line 266
    .line 267
    invoke-virtual {v2, p0}, Luy3;->P(Lxz4;)V

    .line 268
    .line 269
    .line 270
    :cond_e
    iput-object v4, p1, Lfx2;->z:Lgs2;

    .line 271
    .line 272
    iput-object v4, p1, Lfx2;->A:Lsr2;

    .line 273
    .line 274
    iput-boolean v1, p1, Lfx2;->C:Z

    .line 275
    .line 276
    invoke-virtual {p1, v0}, Lfx2;->f(Z)V

    .line 277
    .line 278
    .line 279
    iget-object p2, p1, Lfx2;->x:Lbx2;

    .line 280
    .line 281
    if-eqz p2, :cond_11

    .line 282
    .line 283
    iget-object v3, p1, Lfx2;->w:Lcx2;

    .line 284
    .line 285
    invoke-interface {p2, v3}, Lbx2;->a(Lcx2;)V

    .line 286
    .line 287
    .line 288
    iget-object p2, p1, Lfx2;->y:Lje;

    .line 289
    .line 290
    iget-object v3, p2, Lje;->I0:Lk68;

    .line 291
    .line 292
    :cond_f
    iget-object v5, v3, Lk68;->y:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v5, Ljava/lang/ref/ReferenceQueue;

    .line 295
    .line 296
    iget-object v6, v3, Lk68;->x:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v6, Leq4;

    .line 299
    .line 300
    invoke-virtual {v5}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    if-eqz v5, :cond_10

    .line 305
    .line 306
    invoke-virtual {v6, v5}, Leq4;->k(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    :cond_10
    if-nez v5, :cond_f

    .line 310
    .line 311
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 312
    .line 313
    iget-object v3, v3, Lk68;->y:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v3, Ljava/lang/ref/ReferenceQueue;

    .line 316
    .line 317
    invoke-direct {v5, p1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v6, v5}, Leq4;->b(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iget-object p2, p2, Lje;->V:Llp4;

    .line 324
    .line 325
    invoke-virtual {p2, p1}, Llp4;->j(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    :cond_11
    iput-object v4, p0, Lxz4;->l0:Lo95;

    .line 329
    .line 330
    iput-boolean v1, v2, Luy3;->e0:Z

    .line 331
    .line 332
    invoke-virtual {v9}, Lwz4;->b()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    iget-boolean p1, p1, Lll4;->J:Z

    .line 340
    .line 341
    if-eqz p1, :cond_12

    .line 342
    .line 343
    invoke-virtual {v2}, Luy3;->K()Z

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    if-eqz p1, :cond_12

    .line 348
    .line 349
    iget-object p1, v2, Luy3;->J:Lp95;

    .line 350
    .line 351
    if-eqz p1, :cond_12

    .line 352
    .line 353
    check-cast p1, Lje;

    .line 354
    .line 355
    invoke-virtual {p1, v2}, Lje;->t(Luy3;)V

    .line 356
    .line 357
    .line 358
    :cond_12
    iput-boolean v0, p0, Lxz4;->k0:Z

    .line 359
    .line 360
    return-void
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final C1(Z)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lxz4;->l0:Lo95;

    .line 4
    .line 5
    iget-object v2, v0, Lxz4;->T:Lvr2;

    .line 6
    .line 7
    if-eqz v1, :cond_38

    .line 8
    .line 9
    if-eqz v2, :cond_37

    .line 10
    .line 11
    sget-object v3, Lxz4;->m0:Ll76;

    .line 12
    .line 13
    invoke-virtual {v3}, Ll76;->a()V

    .line 14
    .line 15
    .line 16
    iget-object v4, v0, Lxz4;->O:Luy3;

    .line 17
    .line 18
    iget-object v5, v4, Luy3;->T:Ltp1;

    .line 19
    .line 20
    iput-object v5, v3, Ll76;->P:Ltp1;

    .line 21
    .line 22
    iget-object v5, v4, Luy3;->U:Ley3;

    .line 23
    .line 24
    iput-object v5, v3, Ll76;->Q:Ley3;

    .line 25
    .line 26
    iget-wide v5, v0, Leh5;->y:J

    .line 27
    .line 28
    invoke-static {v5, v6}, Lpv8;->O(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    iput-wide v5, v3, Ll76;->N:J

    .line 33
    .line 34
    invoke-static {v4}, Lxy3;->a(Luy3;)Lp95;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Lje;

    .line 39
    .line 40
    invoke-virtual {v5}, Lje;->getSnapshotObserver()Lr95;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    sget-object v6, Lxc4;->B:Lxc4;

    .line 45
    .line 46
    new-instance v7, Lae;

    .line 47
    .line 48
    const/4 v8, 0x7

    .line 49
    invoke-direct {v7, v8, v2, v0}, Lae;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v5, Lr95;->a:Lcy6;

    .line 53
    .line 54
    invoke-virtual {v2, v0, v6, v7}, Lcy6;->e(Ljava/lang/Object;Lvr2;Lsr2;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v0, Lxz4;->c0:Lay3;

    .line 58
    .line 59
    if-nez v2, :cond_0

    .line 60
    .line 61
    new-instance v2, Lay3;

    .line 62
    .line 63
    invoke-direct {v2}, Lay3;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v2, v0, Lxz4;->c0:Lay3;

    .line 67
    .line 68
    :cond_0
    sget-object v5, Lxz4;->n0:Lay3;

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget v6, v2, Lay3;->a:F

    .line 74
    .line 75
    iput v6, v5, Lay3;->a:F

    .line 76
    .line 77
    iget v6, v2, Lay3;->b:F

    .line 78
    .line 79
    iput v6, v5, Lay3;->b:F

    .line 80
    .line 81
    iget v6, v2, Lay3;->c:F

    .line 82
    .line 83
    iput v6, v5, Lay3;->c:F

    .line 84
    .line 85
    iget v6, v2, Lay3;->d:F

    .line 86
    .line 87
    iput v6, v5, Lay3;->d:F

    .line 88
    .line 89
    iget v6, v2, Lay3;->e:F

    .line 90
    .line 91
    iput v6, v5, Lay3;->e:F

    .line 92
    .line 93
    iget v6, v2, Lay3;->f:F

    .line 94
    .line 95
    iput v6, v5, Lay3;->f:F

    .line 96
    .line 97
    iget v6, v2, Lay3;->g:F

    .line 98
    .line 99
    iput v6, v5, Lay3;->g:F

    .line 100
    .line 101
    iget v6, v2, Lay3;->h:F

    .line 102
    .line 103
    iput v6, v5, Lay3;->h:F

    .line 104
    .line 105
    iget-wide v6, v2, Lay3;->i:J

    .line 106
    .line 107
    iput-wide v6, v5, Lay3;->i:J

    .line 108
    .line 109
    iget v6, v3, Ll76;->x:F

    .line 110
    .line 111
    iput v6, v2, Lay3;->a:F

    .line 112
    .line 113
    iget v6, v3, Ll76;->y:F

    .line 114
    .line 115
    iput v6, v2, Lay3;->b:F

    .line 116
    .line 117
    iget v6, v3, Ll76;->A:F

    .line 118
    .line 119
    iput v6, v2, Lay3;->c:F

    .line 120
    .line 121
    iget v6, v3, Ll76;->B:F

    .line 122
    .line 123
    iput v6, v2, Lay3;->d:F

    .line 124
    .line 125
    iget v6, v3, Ll76;->F:F

    .line 126
    .line 127
    iput v6, v2, Lay3;->e:F

    .line 128
    .line 129
    iget v6, v3, Ll76;->G:F

    .line 130
    .line 131
    iput v6, v2, Lay3;->f:F

    .line 132
    .line 133
    iget v6, v3, Ll76;->H:F

    .line 134
    .line 135
    iput v6, v2, Lay3;->g:F

    .line 136
    .line 137
    iget v6, v3, Ll76;->I:F

    .line 138
    .line 139
    iput v6, v2, Lay3;->h:F

    .line 140
    .line 141
    iget-wide v6, v3, Ll76;->J:J

    .line 142
    .line 143
    iput-wide v6, v2, Lay3;->i:J

    .line 144
    .line 145
    check-cast v1, Lfx2;

    .line 146
    .line 147
    iget-object v6, v1, Lfx2;->y:Lje;

    .line 148
    .line 149
    iget v7, v3, Ll76;->w:I

    .line 150
    .line 151
    iget v8, v1, Lfx2;->J:I

    .line 152
    .line 153
    or-int/2addr v7, v8

    .line 154
    iget-object v8, v3, Ll76;->Q:Ley3;

    .line 155
    .line 156
    iput-object v8, v1, Lfx2;->H:Ley3;

    .line 157
    .line 158
    iget-object v8, v3, Ll76;->P:Ltp1;

    .line 159
    .line 160
    iput-object v8, v1, Lfx2;->G:Ltp1;

    .line 161
    .line 162
    const/high16 v9, 0x100000

    .line 163
    .line 164
    and-int/2addr v9, v7

    .line 165
    const/4 v10, 0x0

    .line 166
    if-eqz v9, :cond_1

    .line 167
    .line 168
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 169
    .line 170
    iget-object v11, v3, Ll76;->O:Lzx3;

    .line 171
    .line 172
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-interface {v8, v10}, Ltp1;->r0(F)I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    iget-object v12, v3, Ll76;->O:Lzx3;

    .line 180
    .line 181
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-interface {v8, v10}, Ltp1;->r0(F)I

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    iget-object v13, v3, Ll76;->O:Lzx3;

    .line 189
    .line 190
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-interface {v8, v10}, Ltp1;->r0(F)I

    .line 194
    .line 195
    .line 196
    move-result v13

    .line 197
    iget-object v14, v3, Ll76;->O:Lzx3;

    .line 198
    .line 199
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-interface {v8, v10}, Ltp1;->r0(F)I

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    iput v11, v9, Lcx2;->v:I

    .line 207
    .line 208
    iput v12, v9, Lcx2;->w:I

    .line 209
    .line 210
    iput v13, v9, Lcx2;->x:I

    .line 211
    .line 212
    iput v8, v9, Lcx2;->y:I

    .line 213
    .line 214
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 215
    .line 216
    invoke-interface {v9, v11, v12, v13, v8}, Lex2;->v(IIII)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Lfx2;->c()V

    .line 220
    .line 221
    .line 222
    :cond_1
    and-int/lit16 v8, v7, 0x1000

    .line 223
    .line 224
    if-eqz v8, :cond_2

    .line 225
    .line 226
    iget-wide v11, v3, Ll76;->J:J

    .line 227
    .line 228
    iput-wide v11, v1, Lfx2;->K:J

    .line 229
    .line 230
    :cond_2
    and-int/lit8 v9, v7, 0x1

    .line 231
    .line 232
    if-eqz v9, :cond_4

    .line 233
    .line 234
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 235
    .line 236
    iget v11, v3, Ll76;->x:F

    .line 237
    .line 238
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 239
    .line 240
    invoke-interface {v9}, Lex2;->c()F

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    cmpg-float v12, v12, v11

    .line 245
    .line 246
    if-nez v12, :cond_3

    .line 247
    .line 248
    goto :goto_0

    .line 249
    :cond_3
    invoke-interface {v9, v11}, Lex2;->z(F)V

    .line 250
    .line 251
    .line 252
    :cond_4
    :goto_0
    and-int/lit8 v9, v7, 0x2

    .line 253
    .line 254
    if-eqz v9, :cond_6

    .line 255
    .line 256
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 257
    .line 258
    iget v11, v3, Ll76;->y:F

    .line 259
    .line 260
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 261
    .line 262
    invoke-interface {v9}, Lex2;->L()F

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    cmpg-float v12, v12, v11

    .line 267
    .line 268
    if-nez v12, :cond_5

    .line 269
    .line 270
    goto :goto_1

    .line 271
    :cond_5
    invoke-interface {v9, v11}, Lex2;->m(F)V

    .line 272
    .line 273
    .line 274
    :cond_6
    :goto_1
    and-int/lit8 v9, v7, 0x4

    .line 275
    .line 276
    if-eqz v9, :cond_8

    .line 277
    .line 278
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 279
    .line 280
    iget v11, v3, Ll76;->z:F

    .line 281
    .line 282
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 283
    .line 284
    invoke-interface {v9}, Lex2;->a()F

    .line 285
    .line 286
    .line 287
    move-result v12

    .line 288
    cmpg-float v12, v12, v11

    .line 289
    .line 290
    if-nez v12, :cond_7

    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_7
    invoke-interface {v9, v11}, Lex2;->t(F)V

    .line 294
    .line 295
    .line 296
    :cond_8
    :goto_2
    and-int/lit8 v9, v7, 0x8

    .line 297
    .line 298
    if-eqz v9, :cond_a

    .line 299
    .line 300
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 301
    .line 302
    iget v11, v3, Ll76;->A:F

    .line 303
    .line 304
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 305
    .line 306
    invoke-interface {v9}, Lex2;->B()F

    .line 307
    .line 308
    .line 309
    move-result v12

    .line 310
    cmpg-float v12, v12, v11

    .line 311
    .line 312
    if-nez v12, :cond_9

    .line 313
    .line 314
    goto :goto_3

    .line 315
    :cond_9
    invoke-interface {v9, v11}, Lex2;->G(F)V

    .line 316
    .line 317
    .line 318
    :cond_a
    :goto_3
    and-int/lit8 v9, v7, 0x10

    .line 319
    .line 320
    if-eqz v9, :cond_c

    .line 321
    .line 322
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 323
    .line 324
    iget v11, v3, Ll76;->B:F

    .line 325
    .line 326
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 327
    .line 328
    invoke-interface {v9}, Lex2;->w()F

    .line 329
    .line 330
    .line 331
    move-result v12

    .line 332
    cmpg-float v12, v12, v11

    .line 333
    .line 334
    if-nez v12, :cond_b

    .line 335
    .line 336
    goto :goto_4

    .line 337
    :cond_b
    invoke-interface {v9, v11}, Lex2;->f(F)V

    .line 338
    .line 339
    .line 340
    :cond_c
    :goto_4
    and-int/lit8 v9, v7, 0x20

    .line 341
    .line 342
    const/4 v11, 0x1

    .line 343
    if-eqz v9, :cond_e

    .line 344
    .line 345
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 346
    .line 347
    iget v12, v3, Ll76;->C:F

    .line 348
    .line 349
    iget-object v13, v9, Lcx2;->a:Lex2;

    .line 350
    .line 351
    invoke-interface {v13}, Lex2;->K()F

    .line 352
    .line 353
    .line 354
    move-result v14

    .line 355
    cmpg-float v14, v14, v12

    .line 356
    .line 357
    if-nez v14, :cond_d

    .line 358
    .line 359
    goto :goto_5

    .line 360
    :cond_d
    invoke-interface {v13, v12}, Lex2;->d(F)V

    .line 361
    .line 362
    .line 363
    iput-boolean v11, v9, Lcx2;->g:Z

    .line 364
    .line 365
    invoke-virtual {v9}, Lcx2;->a()V

    .line 366
    .line 367
    .line 368
    :goto_5
    iget v9, v3, Ll76;->C:F

    .line 369
    .line 370
    cmpl-float v9, v9, v10

    .line 371
    .line 372
    if-lez v9, :cond_e

    .line 373
    .line 374
    iget-boolean v9, v1, Lfx2;->P:Z

    .line 375
    .line 376
    if-nez v9, :cond_e

    .line 377
    .line 378
    iget-object v9, v1, Lfx2;->A:Lsr2;

    .line 379
    .line 380
    if-eqz v9, :cond_e

    .line 381
    .line 382
    invoke-interface {v9}, Lsr2;->b()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    :cond_e
    and-int/lit8 v9, v7, 0x40

    .line 386
    .line 387
    if-eqz v9, :cond_f

    .line 388
    .line 389
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 390
    .line 391
    iget-wide v12, v3, Ll76;->D:J

    .line 392
    .line 393
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 394
    .line 395
    invoke-interface {v9}, Lex2;->s()J

    .line 396
    .line 397
    .line 398
    move-result-wide v14

    .line 399
    invoke-static {v12, v13, v14, v15}, Ljt0;->c(JJ)Z

    .line 400
    .line 401
    .line 402
    move-result v14

    .line 403
    if-nez v14, :cond_f

    .line 404
    .line 405
    invoke-interface {v9, v12, v13}, Lex2;->y(J)V

    .line 406
    .line 407
    .line 408
    :cond_f
    and-int/lit16 v9, v7, 0x80

    .line 409
    .line 410
    if-eqz v9, :cond_10

    .line 411
    .line 412
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 413
    .line 414
    iget-wide v12, v3, Ll76;->E:J

    .line 415
    .line 416
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 417
    .line 418
    invoke-interface {v9}, Lex2;->x()J

    .line 419
    .line 420
    .line 421
    move-result-wide v14

    .line 422
    invoke-static {v12, v13, v14, v15}, Ljt0;->c(JJ)Z

    .line 423
    .line 424
    .line 425
    move-result v14

    .line 426
    if-nez v14, :cond_10

    .line 427
    .line 428
    invoke-interface {v9, v12, v13}, Lex2;->H(J)V

    .line 429
    .line 430
    .line 431
    :cond_10
    and-int/lit16 v9, v7, 0x400

    .line 432
    .line 433
    if-eqz v9, :cond_12

    .line 434
    .line 435
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 436
    .line 437
    iget v12, v3, Ll76;->H:F

    .line 438
    .line 439
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 440
    .line 441
    invoke-interface {v9}, Lex2;->q()F

    .line 442
    .line 443
    .line 444
    move-result v13

    .line 445
    cmpg-float v13, v13, v12

    .line 446
    .line 447
    if-nez v13, :cond_11

    .line 448
    .line 449
    goto :goto_6

    .line 450
    :cond_11
    invoke-interface {v9, v12}, Lex2;->e(F)V

    .line 451
    .line 452
    .line 453
    :cond_12
    :goto_6
    and-int/lit16 v9, v7, 0x100

    .line 454
    .line 455
    if-eqz v9, :cond_14

    .line 456
    .line 457
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 458
    .line 459
    iget v12, v3, Ll76;->F:F

    .line 460
    .line 461
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 462
    .line 463
    invoke-interface {v9}, Lex2;->D()F

    .line 464
    .line 465
    .line 466
    move-result v13

    .line 467
    cmpg-float v13, v13, v12

    .line 468
    .line 469
    if-nez v13, :cond_13

    .line 470
    .line 471
    goto :goto_7

    .line 472
    :cond_13
    invoke-interface {v9, v12}, Lex2;->M(F)V

    .line 473
    .line 474
    .line 475
    :cond_14
    :goto_7
    and-int/lit16 v9, v7, 0x200

    .line 476
    .line 477
    if-eqz v9, :cond_16

    .line 478
    .line 479
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 480
    .line 481
    iget v12, v3, Ll76;->G:F

    .line 482
    .line 483
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 484
    .line 485
    invoke-interface {v9}, Lex2;->o()F

    .line 486
    .line 487
    .line 488
    move-result v13

    .line 489
    cmpg-float v13, v13, v12

    .line 490
    .line 491
    if-nez v13, :cond_15

    .line 492
    .line 493
    goto :goto_8

    .line 494
    :cond_15
    invoke-interface {v9, v12}, Lex2;->b(F)V

    .line 495
    .line 496
    .line 497
    :cond_16
    :goto_8
    and-int/lit16 v9, v7, 0x800

    .line 498
    .line 499
    if-eqz v9, :cond_18

    .line 500
    .line 501
    iget-object v9, v1, Lfx2;->w:Lcx2;

    .line 502
    .line 503
    iget v12, v3, Ll76;->I:F

    .line 504
    .line 505
    iget-object v9, v9, Lcx2;->a:Lex2;

    .line 506
    .line 507
    invoke-interface {v9}, Lex2;->A()F

    .line 508
    .line 509
    .line 510
    move-result v13

    .line 511
    cmpg-float v13, v13, v12

    .line 512
    .line 513
    if-nez v13, :cond_17

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_17
    invoke-interface {v9, v12}, Lex2;->J(F)V

    .line 517
    .line 518
    .line 519
    :cond_18
    :goto_9
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    const-wide v16, 0xffffffffL

    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    if-eqz v8, :cond_1a

    .line 530
    .line 531
    iget-wide v12, v1, Lfx2;->K:J

    .line 532
    .line 533
    const/16 v18, 0x20

    .line 534
    .line 535
    sget-wide v9, Lql7;->b:J

    .line 536
    .line 537
    invoke-static {v12, v13, v9, v10}, Lql7;->a(JJ)Z

    .line 538
    .line 539
    .line 540
    move-result v9

    .line 541
    iget-object v10, v1, Lfx2;->w:Lcx2;

    .line 542
    .line 543
    if-eqz v9, :cond_19

    .line 544
    .line 545
    iget-wide v12, v10, Lcx2;->z:J

    .line 546
    .line 547
    invoke-static {v12, v13, v14, v15}, Ll35;->b(JJ)Z

    .line 548
    .line 549
    .line 550
    move-result v9

    .line 551
    if-nez v9, :cond_1b

    .line 552
    .line 553
    iput-wide v14, v10, Lcx2;->z:J

    .line 554
    .line 555
    iget-object v9, v10, Lcx2;->a:Lex2;

    .line 556
    .line 557
    invoke-interface {v9, v14, v15}, Lex2;->r(J)V

    .line 558
    .line 559
    .line 560
    goto :goto_a

    .line 561
    :cond_19
    iget-wide v12, v1, Lfx2;->K:J

    .line 562
    .line 563
    shr-long v12, v12, v18

    .line 564
    .line 565
    long-to-int v9, v12

    .line 566
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 567
    .line 568
    .line 569
    move-result v9

    .line 570
    iget-wide v12, v1, Lfx2;->B:J

    .line 571
    .line 572
    shr-long v12, v12, v18

    .line 573
    .line 574
    long-to-int v12, v12

    .line 575
    int-to-float v12, v12

    .line 576
    mul-float/2addr v9, v12

    .line 577
    iget-wide v12, v1, Lfx2;->K:J

    .line 578
    .line 579
    and-long v12, v12, v16

    .line 580
    .line 581
    long-to-int v12, v12

    .line 582
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 583
    .line 584
    .line 585
    move-result v12

    .line 586
    move/from16 v19, v9

    .line 587
    .line 588
    iget-wide v8, v1, Lfx2;->B:J

    .line 589
    .line 590
    and-long v8, v8, v16

    .line 591
    .line 592
    long-to-int v8, v8

    .line 593
    int-to-float v8, v8

    .line 594
    mul-float/2addr v12, v8

    .line 595
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 596
    .line 597
    .line 598
    move-result v8

    .line 599
    int-to-long v8, v8

    .line 600
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 601
    .line 602
    .line 603
    move-result v12

    .line 604
    int-to-long v13, v12

    .line 605
    shl-long v8, v8, v18

    .line 606
    .line 607
    and-long v12, v13, v16

    .line 608
    .line 609
    or-long/2addr v8, v12

    .line 610
    iget-wide v12, v10, Lcx2;->z:J

    .line 611
    .line 612
    invoke-static {v12, v13, v8, v9}, Ll35;->b(JJ)Z

    .line 613
    .line 614
    .line 615
    move-result v12

    .line 616
    if-nez v12, :cond_1b

    .line 617
    .line 618
    iput-wide v8, v10, Lcx2;->z:J

    .line 619
    .line 620
    iget-object v10, v10, Lcx2;->a:Lex2;

    .line 621
    .line 622
    invoke-interface {v10, v8, v9}, Lex2;->r(J)V

    .line 623
    .line 624
    .line 625
    goto :goto_a

    .line 626
    :cond_1a
    const/16 v18, 0x20

    .line 627
    .line 628
    :cond_1b
    :goto_a
    and-int/lit16 v8, v7, 0x4000

    .line 629
    .line 630
    if-eqz v8, :cond_1c

    .line 631
    .line 632
    iget-object v8, v1, Lfx2;->w:Lcx2;

    .line 633
    .line 634
    iget-boolean v9, v3, Ll76;->L:Z

    .line 635
    .line 636
    iget-boolean v10, v8, Lcx2;->A:Z

    .line 637
    .line 638
    if-eq v10, v9, :cond_1c

    .line 639
    .line 640
    iput-boolean v9, v8, Lcx2;->A:Z

    .line 641
    .line 642
    iput-boolean v11, v8, Lcx2;->g:Z

    .line 643
    .line 644
    invoke-virtual {v8}, Lcx2;->a()V

    .line 645
    .line 646
    .line 647
    :cond_1c
    const/high16 v8, 0x20000

    .line 648
    .line 649
    and-int/2addr v8, v7

    .line 650
    if-eqz v8, :cond_1d

    .line 651
    .line 652
    iget-object v8, v1, Lfx2;->w:Lcx2;

    .line 653
    .line 654
    iget-object v8, v8, Lcx2;->a:Lex2;

    .line 655
    .line 656
    :cond_1d
    const/high16 v8, 0x40000

    .line 657
    .line 658
    and-int/2addr v8, v7

    .line 659
    if-eqz v8, :cond_1e

    .line 660
    .line 661
    iget-object v8, v1, Lfx2;->w:Lcx2;

    .line 662
    .line 663
    iget-object v9, v3, Ll76;->R:Llt0;

    .line 664
    .line 665
    iget-object v8, v8, Lcx2;->a:Lex2;

    .line 666
    .line 667
    invoke-interface {v8}, Lex2;->l()Llt0;

    .line 668
    .line 669
    .line 670
    move-result-object v10

    .line 671
    invoke-static {v10, v9}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v10

    .line 675
    if-nez v10, :cond_1e

    .line 676
    .line 677
    invoke-interface {v8, v9}, Lex2;->u(Llt0;)V

    .line 678
    .line 679
    .line 680
    :cond_1e
    const/high16 v8, 0x80000

    .line 681
    .line 682
    and-int/2addr v8, v7

    .line 683
    if-eqz v8, :cond_20

    .line 684
    .line 685
    iget-object v8, v1, Lfx2;->w:Lcx2;

    .line 686
    .line 687
    iget v9, v3, Ll76;->S:I

    .line 688
    .line 689
    iget-object v8, v8, Lcx2;->a:Lex2;

    .line 690
    .line 691
    invoke-interface {v8}, Lex2;->N()I

    .line 692
    .line 693
    .line 694
    move-result v10

    .line 695
    if-ne v10, v9, :cond_1f

    .line 696
    .line 697
    goto :goto_b

    .line 698
    :cond_1f
    invoke-interface {v8, v9}, Lex2;->h(I)V

    .line 699
    .line 700
    .line 701
    :cond_20
    :goto_b
    const v8, 0x8000

    .line 702
    .line 703
    .line 704
    and-int/2addr v8, v7

    .line 705
    if-eqz v8, :cond_25

    .line 706
    .line 707
    iget-object v8, v1, Lfx2;->w:Lcx2;

    .line 708
    .line 709
    iget v10, v3, Ll76;->M:I

    .line 710
    .line 711
    if-nez v10, :cond_21

    .line 712
    .line 713
    const/4 v12, 0x0

    .line 714
    goto :goto_c

    .line 715
    :cond_21
    if-ne v10, v11, :cond_22

    .line 716
    .line 717
    move v12, v11

    .line 718
    goto :goto_c

    .line 719
    :cond_22
    const/4 v12, 0x2

    .line 720
    if-ne v10, v12, :cond_24

    .line 721
    .line 722
    :goto_c
    iget-object v8, v8, Lcx2;->a:Lex2;

    .line 723
    .line 724
    invoke-interface {v8}, Lex2;->k()I

    .line 725
    .line 726
    .line 727
    move-result v10

    .line 728
    if-ne v10, v12, :cond_23

    .line 729
    .line 730
    goto :goto_d

    .line 731
    :cond_23
    invoke-interface {v8, v12}, Lex2;->F(I)V

    .line 732
    .line 733
    .line 734
    goto :goto_d

    .line 735
    :cond_24
    const-string v0, "Not supported composition strategy"

    .line 736
    .line 737
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    return-void

    .line 741
    :cond_25
    :goto_d
    and-int/lit16 v8, v7, 0x1f1b

    .line 742
    .line 743
    if-eqz v8, :cond_26

    .line 744
    .line 745
    iput-boolean v11, v1, Lfx2;->M:Z

    .line 746
    .line 747
    iput-boolean v11, v1, Lfx2;->N:Z

    .line 748
    .line 749
    :cond_26
    iget-object v8, v1, Lfx2;->L:Ln85;

    .line 750
    .line 751
    iget-object v10, v3, Ll76;->T:Ln85;

    .line 752
    .line 753
    invoke-static {v8, v10}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v8

    .line 757
    if-nez v8, :cond_2e

    .line 758
    .line 759
    iget-object v12, v3, Ll76;->T:Ln85;

    .line 760
    .line 761
    iput-object v12, v1, Lfx2;->L:Ln85;

    .line 762
    .line 763
    if-nez v12, :cond_27

    .line 764
    .line 765
    move/from16 v26, v7

    .line 766
    .line 767
    goto/16 :goto_f

    .line 768
    .line 769
    :cond_27
    iget-object v8, v1, Lfx2;->w:Lcx2;

    .line 770
    .line 771
    instance-of v13, v12, Ll85;

    .line 772
    .line 773
    if-eqz v13, :cond_28

    .line 774
    .line 775
    move-object v13, v12

    .line 776
    check-cast v13, Ll85;

    .line 777
    .line 778
    iget-object v13, v13, Ll85;->l:Lly5;

    .line 779
    .line 780
    iget v14, v13, Lly5;->a:F

    .line 781
    .line 782
    iget v15, v13, Lly5;->b:F

    .line 783
    .line 784
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 785
    .line 786
    .line 787
    move-result v9

    .line 788
    int-to-long v10, v9

    .line 789
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 790
    .line 791
    .line 792
    move-result v9

    .line 793
    move/from16 v26, v7

    .line 794
    .line 795
    move-object/from16 v20, v8

    .line 796
    .line 797
    int-to-long v7, v9

    .line 798
    shl-long v9, v10, v18

    .line 799
    .line 800
    and-long v7, v7, v16

    .line 801
    .line 802
    or-long v21, v9, v7

    .line 803
    .line 804
    iget v7, v13, Lly5;->c:F

    .line 805
    .line 806
    sub-float/2addr v7, v14

    .line 807
    iget v8, v13, Lly5;->d:F

    .line 808
    .line 809
    sub-float/2addr v8, v15

    .line 810
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 811
    .line 812
    .line 813
    move-result v7

    .line 814
    int-to-long v9, v7

    .line 815
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 816
    .line 817
    .line 818
    move-result v7

    .line 819
    int-to-long v7, v7

    .line 820
    shl-long v9, v9, v18

    .line 821
    .line 822
    and-long v7, v7, v16

    .line 823
    .line 824
    or-long v23, v9, v7

    .line 825
    .line 826
    const/16 v25, 0x0

    .line 827
    .line 828
    invoke-virtual/range {v20 .. v25}, Lcx2;->f(JJF)V

    .line 829
    .line 830
    .line 831
    goto/16 :goto_e

    .line 832
    .line 833
    :cond_28
    move/from16 v26, v7

    .line 834
    .line 835
    move-object v7, v8

    .line 836
    instance-of v8, v12, Lk85;

    .line 837
    .line 838
    const-wide/16 v9, 0x0

    .line 839
    .line 840
    if-eqz v8, :cond_29

    .line 841
    .line 842
    move-object v8, v12

    .line 843
    check-cast v8, Lk85;

    .line 844
    .line 845
    iget-object v11, v8, Lk85;->l:Leh;

    .line 846
    .line 847
    const/4 v8, 0x0

    .line 848
    iput-object v8, v7, Lcx2;->k:Ln85;

    .line 849
    .line 850
    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    iput-wide v13, v7, Lcx2;->i:J

    .line 856
    .line 857
    iput-wide v9, v7, Lcx2;->h:J

    .line 858
    .line 859
    const/4 v8, 0x0

    .line 860
    iput v8, v7, Lcx2;->j:F

    .line 861
    .line 862
    const/4 v9, 0x1

    .line 863
    iput-boolean v9, v7, Lcx2;->g:Z

    .line 864
    .line 865
    const/4 v9, 0x0

    .line 866
    iput-boolean v9, v7, Lcx2;->n:Z

    .line 867
    .line 868
    iput-object v11, v7, Lcx2;->l:Leh;

    .line 869
    .line 870
    invoke-virtual {v7}, Lcx2;->a()V

    .line 871
    .line 872
    .line 873
    goto :goto_e

    .line 874
    :cond_29
    instance-of v11, v12, Lm85;

    .line 875
    .line 876
    if-eqz v11, :cond_2d

    .line 877
    .line 878
    move-object v11, v12

    .line 879
    check-cast v11, Lm85;

    .line 880
    .line 881
    iget-object v13, v11, Lm85;->m:Leh;

    .line 882
    .line 883
    if-eqz v13, :cond_2a

    .line 884
    .line 885
    const/4 v14, 0x0

    .line 886
    iput-object v14, v7, Lcx2;->k:Ln85;

    .line 887
    .line 888
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    iput-wide v14, v7, Lcx2;->i:J

    .line 894
    .line 895
    iput-wide v9, v7, Lcx2;->h:J

    .line 896
    .line 897
    const/4 v8, 0x0

    .line 898
    iput v8, v7, Lcx2;->j:F

    .line 899
    .line 900
    const/4 v9, 0x1

    .line 901
    iput-boolean v9, v7, Lcx2;->g:Z

    .line 902
    .line 903
    const/4 v9, 0x0

    .line 904
    iput-boolean v9, v7, Lcx2;->n:Z

    .line 905
    .line 906
    iput-object v13, v7, Lcx2;->l:Leh;

    .line 907
    .line 908
    invoke-virtual {v7}, Lcx2;->a()V

    .line 909
    .line 910
    .line 911
    goto :goto_e

    .line 912
    :cond_2a
    const/4 v9, 0x0

    .line 913
    iget-object v10, v11, Lm85;->l:Ll96;

    .line 914
    .line 915
    iget v11, v10, Ll96;->a:F

    .line 916
    .line 917
    iget v13, v10, Ll96;->b:F

    .line 918
    .line 919
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 920
    .line 921
    .line 922
    move-result v11

    .line 923
    int-to-long v14, v11

    .line 924
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 925
    .line 926
    .line 927
    move-result v11

    .line 928
    int-to-long v8, v11

    .line 929
    shl-long v14, v14, v18

    .line 930
    .line 931
    and-long v8, v8, v16

    .line 932
    .line 933
    or-long v21, v14, v8

    .line 934
    .line 935
    invoke-virtual {v10}, Ll96;->b()F

    .line 936
    .line 937
    .line 938
    move-result v8

    .line 939
    invoke-virtual {v10}, Ll96;->a()F

    .line 940
    .line 941
    .line 942
    move-result v9

    .line 943
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 944
    .line 945
    .line 946
    move-result v8

    .line 947
    int-to-long v14, v8

    .line 948
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 949
    .line 950
    .line 951
    move-result v8

    .line 952
    int-to-long v8, v8

    .line 953
    shl-long v14, v14, v18

    .line 954
    .line 955
    and-long v8, v8, v16

    .line 956
    .line 957
    or-long v23, v14, v8

    .line 958
    .line 959
    iget-wide v8, v10, Ll96;->h:J

    .line 960
    .line 961
    shr-long v8, v8, v18

    .line 962
    .line 963
    long-to-int v8, v8

    .line 964
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 965
    .line 966
    .line 967
    move-result v25

    .line 968
    move-object/from16 v20, v7

    .line 969
    .line 970
    invoke-virtual/range {v20 .. v25}, Lcx2;->f(JJF)V

    .line 971
    .line 972
    .line 973
    :goto_e
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 974
    .line 975
    const/16 v8, 0x21

    .line 976
    .line 977
    if-ge v7, v8, :cond_2c

    .line 978
    .line 979
    instance-of v7, v12, Lk85;

    .line 980
    .line 981
    if-nez v7, :cond_2b

    .line 982
    .line 983
    instance-of v7, v12, Lm85;

    .line 984
    .line 985
    if-eqz v7, :cond_2c

    .line 986
    .line 987
    check-cast v12, Lm85;

    .line 988
    .line 989
    iget-object v7, v12, Lm85;->l:Ll96;

    .line 990
    .line 991
    invoke-static {v7}, Lp25;->t(Ll96;)Z

    .line 992
    .line 993
    .line 994
    move-result v7

    .line 995
    if-nez v7, :cond_2c

    .line 996
    .line 997
    :cond_2b
    iget-object v7, v1, Lfx2;->A:Lsr2;

    .line 998
    .line 999
    if-eqz v7, :cond_2c

    .line 1000
    .line 1001
    invoke-interface {v7}, Lsr2;->b()Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    :cond_2c
    :goto_f
    const/4 v9, 0x1

    .line 1005
    goto :goto_10

    .line 1006
    :cond_2d
    invoke-static {}, Lh;->c()V

    .line 1007
    .line 1008
    .line 1009
    return-void

    .line 1010
    :cond_2e
    move/from16 v26, v7

    .line 1011
    .line 1012
    const/4 v9, 0x0

    .line 1013
    :goto_10
    iget v7, v3, Ll76;->w:I

    .line 1014
    .line 1015
    iput v7, v1, Lfx2;->J:I

    .line 1016
    .line 1017
    if-nez v26, :cond_2f

    .line 1018
    .line 1019
    if-eqz v9, :cond_32

    .line 1020
    .line 1021
    :cond_2f
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1022
    .line 1023
    const/16 v7, 0x1a

    .line 1024
    .line 1025
    if-lt v1, v7, :cond_30

    .line 1026
    .line 1027
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v1

    .line 1031
    if-eqz v1, :cond_31

    .line 1032
    .line 1033
    invoke-static {v1, v6, v6}, Lh08;->k(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;)V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_11

    .line 1037
    :cond_30
    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    .line 1038
    .line 1039
    .line 1040
    :cond_31
    :goto_11
    invoke-static {}, Lje;->j()Z

    .line 1041
    .line 1042
    .line 1043
    move-result v1

    .line 1044
    if-eqz v1, :cond_32

    .line 1045
    .line 1046
    const/4 v8, 0x0

    .line 1047
    invoke-virtual {v6, v8}, Lje;->M(F)V

    .line 1048
    .line 1049
    .line 1050
    :cond_32
    iget-boolean v1, v0, Lxz4;->S:Z

    .line 1051
    .line 1052
    iget-boolean v6, v3, Ll76;->L:Z

    .line 1053
    .line 1054
    iput-boolean v6, v0, Lxz4;->S:Z

    .line 1055
    .line 1056
    iget v3, v3, Ll76;->z:F

    .line 1057
    .line 1058
    iput v3, v0, Lxz4;->W:F

    .line 1059
    .line 1060
    iget v3, v5, Lay3;->a:F

    .line 1061
    .line 1062
    iget v6, v2, Lay3;->a:F

    .line 1063
    .line 1064
    cmpg-float v3, v3, v6

    .line 1065
    .line 1066
    if-nez v3, :cond_33

    .line 1067
    .line 1068
    iget v3, v5, Lay3;->b:F

    .line 1069
    .line 1070
    iget v6, v2, Lay3;->b:F

    .line 1071
    .line 1072
    cmpg-float v3, v3, v6

    .line 1073
    .line 1074
    if-nez v3, :cond_33

    .line 1075
    .line 1076
    iget v3, v5, Lay3;->c:F

    .line 1077
    .line 1078
    iget v6, v2, Lay3;->c:F

    .line 1079
    .line 1080
    cmpg-float v3, v3, v6

    .line 1081
    .line 1082
    if-nez v3, :cond_33

    .line 1083
    .line 1084
    iget v3, v5, Lay3;->d:F

    .line 1085
    .line 1086
    iget v6, v2, Lay3;->d:F

    .line 1087
    .line 1088
    cmpg-float v3, v3, v6

    .line 1089
    .line 1090
    if-nez v3, :cond_33

    .line 1091
    .line 1092
    iget v3, v5, Lay3;->e:F

    .line 1093
    .line 1094
    iget v6, v2, Lay3;->e:F

    .line 1095
    .line 1096
    cmpg-float v3, v3, v6

    .line 1097
    .line 1098
    if-nez v3, :cond_33

    .line 1099
    .line 1100
    iget v3, v5, Lay3;->f:F

    .line 1101
    .line 1102
    iget v6, v2, Lay3;->f:F

    .line 1103
    .line 1104
    cmpg-float v3, v3, v6

    .line 1105
    .line 1106
    if-nez v3, :cond_33

    .line 1107
    .line 1108
    iget v3, v5, Lay3;->g:F

    .line 1109
    .line 1110
    iget v6, v2, Lay3;->g:F

    .line 1111
    .line 1112
    cmpg-float v3, v3, v6

    .line 1113
    .line 1114
    if-nez v3, :cond_33

    .line 1115
    .line 1116
    iget v3, v5, Lay3;->h:F

    .line 1117
    .line 1118
    iget v6, v2, Lay3;->h:F

    .line 1119
    .line 1120
    cmpg-float v3, v3, v6

    .line 1121
    .line 1122
    if-nez v3, :cond_33

    .line 1123
    .line 1124
    iget-wide v5, v5, Lay3;->i:J

    .line 1125
    .line 1126
    iget-wide v2, v2, Lay3;->i:J

    .line 1127
    .line 1128
    invoke-static {v5, v6, v2, v3}, Lql7;->a(JJ)Z

    .line 1129
    .line 1130
    .line 1131
    move-result v2

    .line 1132
    if-eqz v2, :cond_33

    .line 1133
    .line 1134
    const/4 v9, 0x1

    .line 1135
    goto :goto_12

    .line 1136
    :cond_33
    const/4 v9, 0x0

    .line 1137
    :goto_12
    if-eqz p1, :cond_35

    .line 1138
    .line 1139
    if-eqz v9, :cond_34

    .line 1140
    .line 1141
    iget-boolean v2, v0, Lxz4;->S:Z

    .line 1142
    .line 1143
    if-eq v1, v2, :cond_35

    .line 1144
    .line 1145
    :cond_34
    iget-object v1, v4, Luy3;->J:Lp95;

    .line 1146
    .line 1147
    if-eqz v1, :cond_35

    .line 1148
    .line 1149
    check-cast v1, Lje;

    .line 1150
    .line 1151
    invoke-virtual {v1, v4}, Lje;->t(Luy3;)V

    .line 1152
    .line 1153
    .line 1154
    :cond_35
    if-nez v9, :cond_39

    .line 1155
    .line 1156
    invoke-virtual {v4, v0}, Luy3;->P(Lxz4;)V

    .line 1157
    .line 1158
    .line 1159
    iget v0, v4, Luy3;->i0:I

    .line 1160
    .line 1161
    if-lez v0, :cond_39

    .line 1162
    .line 1163
    invoke-static {v4}, Lxy3;->a(Luy3;)Lp95;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v0

    .line 1167
    check-cast v0, Lje;

    .line 1168
    .line 1169
    iget-object v1, v0, Lje;->m0:Lih4;

    .line 1170
    .line 1171
    iget-object v1, v1, Lih4;->e:Lhv2;

    .line 1172
    .line 1173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1174
    .line 1175
    .line 1176
    iget v2, v4, Luy3;->i0:I

    .line 1177
    .line 1178
    if-lez v2, :cond_36

    .line 1179
    .line 1180
    iget-object v1, v1, Lhv2;->y:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast v1, Leq4;

    .line 1183
    .line 1184
    invoke-virtual {v1, v4}, Leq4;->b(Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    const/4 v9, 0x1

    .line 1188
    iput-boolean v9, v4, Luy3;->h0:Z

    .line 1189
    .line 1190
    :cond_36
    const/4 v14, 0x0

    .line 1191
    invoke-virtual {v0, v14}, Lje;->F(Luy3;)V

    .line 1192
    .line 1193
    .line 1194
    return-void

    .line 1195
    :cond_37
    const-string v0, "updateLayerParameters requires a non-null layerBlock"

    .line 1196
    .line 1197
    invoke-static {v0}, Lb81;->t(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    throw v0

    .line 1202
    :cond_38
    if-nez v2, :cond_3a

    .line 1203
    .line 1204
    :cond_39
    return-void

    .line 1205
    :cond_3a
    const-string v0, "null layer with a non-null layerBlock"

    .line 1206
    .line 1207
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    return-void
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
.end method

.method public final D()Ldy3;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lll4;->J:Z

    .line 6
    .line 7
    iget-object v1, p0, Lxz4;->O:Luy3;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 14
    .line 15
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    move-object v2, v1

    .line 19
    :goto_0
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const-string v3, "\n|"

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v3, " isAttached="

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Luy3;->J()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, " modifier="

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v3, v2, Luy3;->f0:Lml4;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v3, " tail="

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Luy3;->v()Luy3;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {p0}, Lxz4;->l1()V

    .line 76
    .line 77
    .line 78
    iget-object p0, v1, Luy3;->a0:Lo00;

    .line 79
    .line 80
    iget-object p0, p0, Lo00;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Lxz4;

    .line 83
    .line 84
    iget-object p0, p0, Lxz4;->Q:Lxz4;

    .line 85
    .line 86
    return-object p0
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final D0()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->X:Lmh4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
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

.method public final D1(J)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide v1, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long v3, p1, v1

    .line 9
    .line 10
    xor-long/2addr v1, v3

    .line 11
    const-wide v3, 0x100000001L

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    sub-long/2addr v1, v3

    .line 17
    const-wide v3, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v1, v3

    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    cmp-long v1, v1, v3

    .line 26
    .line 27
    if-nez v1, :cond_d

    .line 28
    .line 29
    iget-object v1, v0, Lxz4;->l0:Lo95;

    .line 30
    .line 31
    if-eqz v1, :cond_c

    .line 32
    .line 33
    iget-boolean v0, v0, Lxz4;->S:Z

    .line 34
    .line 35
    if-eqz v0, :cond_c

    .line 36
    .line 37
    check-cast v1, Lfx2;

    .line 38
    .line 39
    const/16 v0, 0x20

    .line 40
    .line 41
    shr-long v4, p1, v0

    .line 42
    .line 43
    long-to-int v4, v4

    .line 44
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const-wide v6, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long v8, p1, v6

    .line 54
    .line 55
    long-to-int v4, v8

    .line 56
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget-object v1, v1, Lfx2;->w:Lcx2;

    .line 61
    .line 62
    iget-boolean v8, v1, Lcx2;->A:Z

    .line 63
    .line 64
    if-eqz v8, :cond_b

    .line 65
    .line 66
    invoke-virtual {v1}, Lcx2;->d()Ln85;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    instance-of v8, v1, Ll85;

    .line 71
    .line 72
    if-eqz v8, :cond_1

    .line 73
    .line 74
    check-cast v1, Ll85;

    .line 75
    .line 76
    iget-object v0, v1, Ll85;->l:Lly5;

    .line 77
    .line 78
    iget v1, v0, Lly5;->a:F

    .line 79
    .line 80
    cmpg-float v1, v1, v5

    .line 81
    .line 82
    if-gtz v1, :cond_0

    .line 83
    .line 84
    iget v1, v0, Lly5;->c:F

    .line 85
    .line 86
    cmpg-float v1, v5, v1

    .line 87
    .line 88
    if-gez v1, :cond_0

    .line 89
    .line 90
    iget v1, v0, Lly5;->b:F

    .line 91
    .line 92
    cmpg-float v1, v1, v4

    .line 93
    .line 94
    if-gtz v1, :cond_0

    .line 95
    .line 96
    iget v0, v0, Lly5;->d:F

    .line 97
    .line 98
    cmpg-float v0, v4, v0

    .line 99
    .line 100
    if-gez v0, :cond_0

    .line 101
    .line 102
    goto/16 :goto_2

    .line 103
    .line 104
    :cond_0
    const/16 v16, 0x0

    .line 105
    .line 106
    const/16 v17, 0x1

    .line 107
    .line 108
    goto/16 :goto_1

    .line 109
    .line 110
    :cond_1
    instance-of v8, v1, Lm85;

    .line 111
    .line 112
    if-eqz v8, :cond_9

    .line 113
    .line 114
    check-cast v1, Lm85;

    .line 115
    .line 116
    iget-object v1, v1, Lm85;->l:Ll96;

    .line 117
    .line 118
    iget v8, v1, Ll96;->a:F

    .line 119
    .line 120
    iget-wide v9, v1, Ll96;->f:J

    .line 121
    .line 122
    iget-wide v11, v1, Ll96;->h:J

    .line 123
    .line 124
    iget-wide v13, v1, Ll96;->g:J

    .line 125
    .line 126
    iget v15, v1, Ll96;->d:F

    .line 127
    .line 128
    move/from16 p0, v0

    .line 129
    .line 130
    iget v0, v1, Ll96;->b:F

    .line 131
    .line 132
    const/16 v16, 0x0

    .line 133
    .line 134
    iget v2, v1, Ll96;->c:F

    .line 135
    .line 136
    move/from16 p1, v4

    .line 137
    .line 138
    const/16 v17, 0x1

    .line 139
    .line 140
    iget-wide v3, v1, Ll96;->e:J

    .line 141
    .line 142
    cmpg-float v18, v5, v8

    .line 143
    .line 144
    if-ltz v18, :cond_8

    .line 145
    .line 146
    cmpl-float v18, v5, v2

    .line 147
    .line 148
    if-gez v18, :cond_8

    .line 149
    .line 150
    cmpg-float v18, p1, v0

    .line 151
    .line 152
    if-ltz v18, :cond_8

    .line 153
    .line 154
    cmpl-float v18, p1, v15

    .line 155
    .line 156
    if-ltz v18, :cond_2

    .line 157
    .line 158
    goto/16 :goto_1

    .line 159
    .line 160
    :cond_2
    move-wide/from16 v18, v6

    .line 161
    .line 162
    shr-long v6, v3, p0

    .line 163
    .line 164
    long-to-int v6, v6

    .line 165
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    move/from16 p2, v2

    .line 170
    .line 171
    move-wide/from16 v20, v3

    .line 172
    .line 173
    shr-long v2, v9, p0

    .line 174
    .line 175
    long-to-int v2, v2

    .line 176
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    add-float/2addr v3, v7

    .line 181
    invoke-virtual {v1}, Ll96;->b()F

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    cmpg-float v3, v3, v4

    .line 186
    .line 187
    if-gtz v3, :cond_7

    .line 188
    .line 189
    shr-long v3, v11, p0

    .line 190
    .line 191
    long-to-int v3, v3

    .line 192
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    move v7, v2

    .line 197
    move/from16 v22, v3

    .line 198
    .line 199
    shr-long v2, v13, p0

    .line 200
    .line 201
    long-to-int v2, v2

    .line 202
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    add-float/2addr v3, v4

    .line 207
    invoke-virtual {v1}, Ll96;->b()F

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    cmpg-float v3, v3, v4

    .line 212
    .line 213
    if-gtz v3, :cond_7

    .line 214
    .line 215
    and-long v3, v20, v18

    .line 216
    .line 217
    long-to-int v3, v3

    .line 218
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    and-long v11, v11, v18

    .line 223
    .line 224
    long-to-int v11, v11

    .line 225
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    add-float/2addr v12, v4

    .line 230
    invoke-virtual {v1}, Ll96;->a()F

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    cmpg-float v4, v12, v4

    .line 235
    .line 236
    if-gtz v4, :cond_7

    .line 237
    .line 238
    and-long v9, v9, v18

    .line 239
    .line 240
    long-to-int v4, v9

    .line 241
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    and-long v12, v13, v18

    .line 246
    .line 247
    long-to-int v10, v12

    .line 248
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 249
    .line 250
    .line 251
    move-result v12

    .line 252
    add-float/2addr v12, v9

    .line 253
    invoke-virtual {v1}, Ll96;->a()F

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    cmpg-float v9, v12, v9

    .line 258
    .line 259
    if-gtz v9, :cond_7

    .line 260
    .line 261
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    add-float/2addr v6, v8

    .line 266
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    add-float/2addr v3, v0

    .line 271
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    sub-float v7, p2, v7

    .line 276
    .line 277
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    add-float/2addr v4, v0

    .line 282
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    sub-float v2, p2, v0

    .line 287
    .line 288
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    sub-float v0, v15, v0

    .line 293
    .line 294
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    sub-float/2addr v15, v9

    .line 299
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 300
    .line 301
    .line 302
    move-result v9

    .line 303
    add-float/2addr v9, v8

    .line 304
    cmpg-float v8, v5, v6

    .line 305
    .line 306
    if-gez v8, :cond_3

    .line 307
    .line 308
    cmpg-float v8, p1, v3

    .line 309
    .line 310
    if-gez v8, :cond_3

    .line 311
    .line 312
    iget-wide v9, v1, Ll96;->e:J

    .line 313
    .line 314
    move v8, v3

    .line 315
    move v7, v6

    .line 316
    move/from16 v6, p1

    .line 317
    .line 318
    invoke-static/range {v5 .. v10}, Lt35;->w(FFFFJ)Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    goto/16 :goto_3

    .line 323
    .line 324
    :cond_3
    move/from16 v6, p1

    .line 325
    .line 326
    cmpg-float v3, v5, v9

    .line 327
    .line 328
    if-gez v3, :cond_4

    .line 329
    .line 330
    cmpl-float v3, v6, v15

    .line 331
    .line 332
    if-lez v3, :cond_4

    .line 333
    .line 334
    move v7, v9

    .line 335
    iget-wide v9, v1, Ll96;->h:J

    .line 336
    .line 337
    move v8, v15

    .line 338
    invoke-static/range {v5 .. v10}, Lt35;->w(FFFFJ)Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    goto :goto_3

    .line 343
    :cond_4
    move v3, v7

    .line 344
    cmpl-float v7, v5, v3

    .line 345
    .line 346
    if-lez v7, :cond_5

    .line 347
    .line 348
    cmpg-float v7, v6, v4

    .line 349
    .line 350
    if-gez v7, :cond_5

    .line 351
    .line 352
    iget-wide v9, v1, Ll96;->f:J

    .line 353
    .line 354
    move v7, v3

    .line 355
    move v8, v4

    .line 356
    invoke-static/range {v5 .. v10}, Lt35;->w(FFFFJ)Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    goto :goto_3

    .line 361
    :cond_5
    cmpl-float v3, v5, v2

    .line 362
    .line 363
    if-lez v3, :cond_6

    .line 364
    .line 365
    cmpl-float v3, v6, v0

    .line 366
    .line 367
    if-lez v3, :cond_6

    .line 368
    .line 369
    iget-wide v9, v1, Ll96;->g:J

    .line 370
    .line 371
    move v8, v0

    .line 372
    move v7, v2

    .line 373
    invoke-static/range {v5 .. v10}, Lt35;->w(FFFFJ)Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    goto :goto_3

    .line 378
    :cond_6
    :goto_0
    move/from16 v0, v17

    .line 379
    .line 380
    goto :goto_3

    .line 381
    :cond_7
    move/from16 v6, p1

    .line 382
    .line 383
    invoke-static {}, Lgh;->a()Leh;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-static {v0, v1}, Leh;->c(Leh;Ll96;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v5, v6, v0}, Lt35;->v(FFLeh;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    goto :goto_3

    .line 395
    :cond_8
    :goto_1
    move/from16 v0, v16

    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_9
    move v6, v4

    .line 399
    const/16 v16, 0x0

    .line 400
    .line 401
    const/16 v17, 0x1

    .line 402
    .line 403
    instance-of v0, v1, Lk85;

    .line 404
    .line 405
    if-eqz v0, :cond_a

    .line 406
    .line 407
    check-cast v1, Lk85;

    .line 408
    .line 409
    iget-object v0, v1, Lk85;->l:Leh;

    .line 410
    .line 411
    invoke-static {v5, v6, v0}, Lt35;->v(FFLeh;)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    goto :goto_3

    .line 416
    :cond_a
    invoke-static {}, Lh;->c()V

    .line 417
    .line 418
    .line 419
    return v16

    .line 420
    :cond_b
    :goto_2
    const/16 v16, 0x0

    .line 421
    .line 422
    const/16 v17, 0x1

    .line 423
    .line 424
    goto :goto_0

    .line 425
    :goto_3
    if-eqz v0, :cond_e

    .line 426
    .line 427
    goto :goto_4

    .line 428
    :cond_c
    const/16 v17, 0x1

    .line 429
    .line 430
    :goto_4
    return v17

    .line 431
    :cond_d
    const/16 v16, 0x0

    .line 432
    .line 433
    :cond_e
    return v16
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final G0()Luy3;
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->O:Luy3;

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

.method public final J0()Lmh4;
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->X:Lmh4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Asking for measurement result of unmeasured layout modifier"

    .line 7
    .line 8
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
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

.method public final K0()Ldd4;
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->Q:Lxz4;

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

.method public final L0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lxz4;->Z:J

    .line 2
    .line 3
    return-wide v0
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

.method public final M(Ldy3;J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lxz4;->O(Ldy3;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
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
.end method

.method public final N(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lll4;->J:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lxz4;->O:Luy3;

    .line 15
    .line 16
    invoke-static {v0}, Lxy3;->a(Luy3;)Lp95;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lje;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Lje;->G(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-static {p0}, Lt49;->I(Ldy3;)Ldy3;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0, p1, p2}, Lxz4;->O(Ldy3;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    return-wide p0
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
.end method

.method public final O(Ldy3;J)J
    .locals 3

    .line 1
    instance-of v0, p1, Lgd4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lgd4;

    .line 6
    .line 7
    iget-object v0, p1, Lgd4;->w:Lfd4;

    .line 8
    .line 9
    iget-object v0, v0, Lfd4;->O:Lxz4;

    .line 10
    .line 11
    invoke-virtual {v0}, Lxz4;->l1()V

    .line 12
    .line 13
    .line 14
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    xor-long/2addr p2, v0

    .line 20
    invoke-virtual {p1, p0, p2, p3}, Lgd4;->O(Ldy3;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    xor-long/2addr p0, v0

    .line 25
    return-wide p0

    .line 26
    :cond_0
    invoke-static {p1}, Lxz4;->x1(Ldy3;)Lxz4;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lxz4;->l1()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lxz4;->Y0(Lxz4;)Lxz4;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    if-eq p1, v0, :cond_3

    .line 38
    .line 39
    iget-object v1, p1, Lxz4;->l0:Lo95;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    check-cast v1, Lfx2;

    .line 44
    .line 45
    invoke-virtual {v1}, Lfx2;->b()[F

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-boolean v1, v1, Lfx2;->O:Z

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {p2, p3, v2}, Leh4;->b(J[F)J

    .line 55
    .line 56
    .line 57
    move-result-wide p2

    .line 58
    :cond_2
    :goto_1
    iget-wide v1, p1, Lxz4;->Z:J

    .line 59
    .line 60
    invoke-static {p2, p3, v1, v2}, Lgr8;->T(JJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide p2

    .line 64
    iget-object p1, p1, Lxz4;->Q:Lxz4;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {p0, v0, p2, p3}, Lxz4;->S0(Lxz4;J)J

    .line 71
    .line 72
    .line 73
    move-result-wide p0

    .line 74
    return-wide p0
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

.method public final P0()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lxz4;->Z:J

    .line 2
    .line 3
    iget v2, p0, Lxz4;->a0:F

    .line 4
    .line 5
    iget-object v3, p0, Lxz4;->T:Lvr2;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, v3}, Leh5;->h0(JFLvr2;)V

    .line 8
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
.end method

.method public final Q(Ldy3;Z)Lly5;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lll4;->J:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {p1}, Ldy3;->n()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "LayoutCoordinates "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, " is not attached!"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-static {p1}, Lxz4;->x1(Ldy3;)Lxz4;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lxz4;->l1()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lxz4;->Y0(Lxz4;)Lxz4;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, p0, Lxz4;->b0:Lsp4;

    .line 54
    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    new-instance v2, Lsp4;

    .line 58
    .line 59
    invoke-direct {v2}, Lsp4;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v2, p0, Lxz4;->b0:Lsp4;

    .line 63
    .line 64
    :cond_2
    const/4 v3, 0x0

    .line 65
    iput v3, v2, Lsp4;->b:F

    .line 66
    .line 67
    iput v3, v2, Lsp4;->c:F

    .line 68
    .line 69
    invoke-interface {p1}, Ldy3;->k()J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    const/16 v5, 0x20

    .line 74
    .line 75
    shr-long/2addr v3, v5

    .line 76
    long-to-int v3, v3

    .line 77
    int-to-float v3, v3

    .line 78
    iput v3, v2, Lsp4;->d:F

    .line 79
    .line 80
    invoke-interface {p1}, Ldy3;->k()J

    .line 81
    .line 82
    .line 83
    move-result-wide v3

    .line 84
    const-wide v5, 0xffffffffL

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr v3, v5

    .line 90
    long-to-int p1, v3

    .line 91
    int-to-float p1, p1

    .line 92
    iput p1, v2, Lsp4;->e:F

    .line 93
    .line 94
    :goto_0
    if-eq v0, v1, :cond_4

    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    invoke-virtual {v0, v2, p2, p1}, Lxz4;->t1(Lsp4;ZZ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Lsp4;->b()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    sget-object p0, Lly5;->e:Lly5;

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_3
    iget-object v0, v0, Lxz4;->Q:Lxz4;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    invoke-virtual {p0, v1, v2, p2}, Lxz4;->R0(Lxz4;Lsp4;Z)V

    .line 116
    .line 117
    .line 118
    new-instance p0, Lly5;

    .line 119
    .line 120
    iget p1, v2, Lsp4;->b:F

    .line 121
    .line 122
    iget p2, v2, Lsp4;->c:F

    .line 123
    .line 124
    iget v0, v2, Lsp4;->d:F

    .line 125
    .line 126
    iget v1, v2, Lsp4;->e:F

    .line 127
    .line 128
    invoke-direct {p0, p1, p2, v0, v1}, Lly5;-><init>(FFFF)V

    .line 129
    .line 130
    .line 131
    return-object p0
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

.method public final R(J)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lll4;->J:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lxz4;->l1()V

    .line 15
    .line 16
    .line 17
    :goto_0
    if-eqz p0, :cond_4

    .line 18
    .line 19
    iget-object v0, p0, Lxz4;->O:Luy3;

    .line 20
    .line 21
    iget-object v1, v0, Luy3;->a0:Lo00;

    .line 22
    .line 23
    iget-object v1, v1, Lo00;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lxz4;

    .line 26
    .line 27
    if-ne p0, v1, :cond_1

    .line 28
    .line 29
    iget-boolean v1, v0, Luy3;->y:Z

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, Lxy3;->a(Luy3;)Lp95;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lje;

    .line 38
    .line 39
    invoke-virtual {v1}, Lje;->getRectManager()Lny5;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, v0}, Lny5;->b(Luy3;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    const-wide v2, 0x7fffffff7fffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, Loe3;->a(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    invoke-static {p1, p2, v0, v1}, Lgr8;->T(JJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide p0

    .line 62
    return-wide p0

    .line 63
    :cond_1
    iget-object v0, p0, Lxz4;->l0:Lo95;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    check-cast v0, Lfx2;

    .line 68
    .line 69
    invoke-virtual {v0}, Lfx2;->b()[F

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-boolean v0, v0, Lfx2;->O:Z

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-static {p1, p2, v1}, Leh4;->b(J[F)J

    .line 79
    .line 80
    .line 81
    move-result-wide p1

    .line 82
    :cond_3
    :goto_1
    iget-wide v0, p0, Lxz4;->Z:J

    .line 83
    .line 84
    invoke-static {p1, p2, v0, v1}, Lgr8;->T(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide p1

    .line 88
    iget-object p0, p0, Lxz4;->Q:Lxz4;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    return-wide p1
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final R0(Lxz4;Lsp4;Z)V
    .locals 5

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lxz4;->Q:Lxz4;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lxz4;->R0(Lxz4;Lsp4;Z)V

    .line 9
    .line 10
    .line 11
    :cond_1
    iget-wide v0, p0, Lxz4;->Z:J

    .line 12
    .line 13
    const/16 p1, 0x20

    .line 14
    .line 15
    shr-long v2, v0, p1

    .line 16
    .line 17
    long-to-int v2, v2

    .line 18
    iget v3, p2, Lsp4;->b:F

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    sub-float/2addr v3, v2

    .line 22
    iput v3, p2, Lsp4;->b:F

    .line 23
    .line 24
    iget v3, p2, Lsp4;->d:F

    .line 25
    .line 26
    sub-float/2addr v3, v2

    .line 27
    iput v3, p2, Lsp4;->d:F

    .line 28
    .line 29
    const-wide v2, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v0, v2

    .line 35
    long-to-int v0, v0

    .line 36
    iget v1, p2, Lsp4;->c:F

    .line 37
    .line 38
    int-to-float v0, v0

    .line 39
    sub-float/2addr v1, v0

    .line 40
    iput v1, p2, Lsp4;->c:F

    .line 41
    .line 42
    iget v1, p2, Lsp4;->e:F

    .line 43
    .line 44
    sub-float/2addr v1, v0

    .line 45
    iput v1, p2, Lsp4;->e:F

    .line 46
    .line 47
    iget-object v0, p0, Lxz4;->l0:Lo95;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    check-cast v0, Lfx2;

    .line 52
    .line 53
    invoke-virtual {v0}, Lfx2;->a()[F

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-boolean v0, v0, Lfx2;->O:Z

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    iput v4, p2, Lsp4;->b:F

    .line 65
    .line 66
    iput v4, p2, Lsp4;->c:F

    .line 67
    .line 68
    iput v4, p2, Lsp4;->d:F

    .line 69
    .line 70
    iput v4, p2, Lsp4;->e:F

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-static {v1, p2}, Leh4;->c([FLsp4;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lxz4;->S:Z

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    if-eqz p3, :cond_4

    .line 81
    .line 82
    iget-wide v0, p0, Leh5;->y:J

    .line 83
    .line 84
    shr-long p0, v0, p1

    .line 85
    .line 86
    long-to-int p0, p0

    .line 87
    int-to-float p0, p0

    .line 88
    and-long/2addr v0, v2

    .line 89
    long-to-int p1, v0

    .line 90
    int-to-float p1, p1

    .line 91
    invoke-virtual {p2, v4, v4, p0, p1}, Lsp4;->a(FFFF)V

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_1
    return-void
.end method

.method public final S0(Lxz4;J)J
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-wide p2

    .line 4
    :cond_0
    iget-object v0, p0, Lxz4;->Q:Lxz4;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Lxz4;->S0(Lxz4;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2}, Lxz4;->Z0(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, Lxz4;->Z0(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
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
.end method

.method public final T0(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0}, Leh5;->b0()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    int-to-float v2, v2

    .line 15
    sub-float/2addr v1, v2

    .line 16
    const-wide v2, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p1, v2

    .line 22
    long-to-int p1, p1

    .line 23
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0}, Leh5;->Z()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    int-to-float p0, p0

    .line 32
    sub-float/2addr p1, p0

    .line 33
    const/high16 p0, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr v1, p0

    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-static {p2, v1}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    div-float/2addr p1, p0

    .line 42
    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    int-to-long p1, p1

    .line 51
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    int-to-long v4, p0

    .line 56
    shl-long p0, p1, v0

    .line 57
    .line 58
    and-long v0, v4, v2

    .line 59
    .line 60
    or-long/2addr p0, v0

    .line 61
    return-wide p0
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

.method public final U0(JJ)F
    .locals 8

    .line 1
    invoke-virtual {p0}, Leh5;->b0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    shr-long v2, p3, v1

    .line 9
    .line 10
    long-to-int v2, v2

    .line 11
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    cmpl-float v0, v0, v2

    .line 16
    .line 17
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 18
    .line 19
    const-wide v3, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    if-ltz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Leh5;->Z()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    and-long v5, p3, v3

    .line 32
    .line 33
    long-to-int v5, v5

    .line 34
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    cmpl-float v0, v0, v5

    .line 39
    .line 40
    if-ltz v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    invoke-virtual {p0, p3, p4}, Lxz4;->T0(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p3

    .line 47
    shr-long v5, p3, v1

    .line 48
    .line 49
    long-to-int v0, v5

    .line 50
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    and-long/2addr p3, v3

    .line 55
    long-to-int p3, p3

    .line 56
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    shr-long v5, p1, v1

    .line 61
    .line 62
    long-to-int p4, v5

    .line 63
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    const/4 v5, 0x0

    .line 68
    cmpg-float v6, p4, v5

    .line 69
    .line 70
    if-gez v6, :cond_1

    .line 71
    .line 72
    neg-float p4, p4

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p0}, Leh5;->b0()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    int-to-float v6, v6

    .line 79
    sub-float/2addr p4, v6

    .line 80
    :goto_0
    invoke-static {v5, p4}, Ljava/lang/Math;->max(FF)F

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    and-long/2addr p1, v3

    .line 85
    long-to-int p1, p1

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    cmpg-float p2, p1, v5

    .line 91
    .line 92
    if-gez p2, :cond_2

    .line 93
    .line 94
    neg-float p0, p1

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {p0}, Leh5;->Z()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    int-to-float p0, p0

    .line 101
    sub-float p0, p1, p0

    .line 102
    .line 103
    :goto_1
    invoke-static {v5, p0}, Ljava/lang/Math;->max(FF)F

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    int-to-long p1, p1

    .line 112
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    int-to-long v6, p0

    .line 117
    shl-long p0, p1, v1

    .line 118
    .line 119
    and-long/2addr v6, v3

    .line 120
    or-long/2addr p0, v6

    .line 121
    cmpl-float p2, v0, v5

    .line 122
    .line 123
    if-gtz p2, :cond_3

    .line 124
    .line 125
    cmpl-float p2, p3, v5

    .line 126
    .line 127
    if-lez p2, :cond_4

    .line 128
    .line 129
    :cond_3
    shr-long v5, p0, v1

    .line 130
    .line 131
    long-to-int p2, v5

    .line 132
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    cmpg-float p4, p4, v0

    .line 137
    .line 138
    if-gtz p4, :cond_4

    .line 139
    .line 140
    and-long/2addr p0, v3

    .line 141
    long-to-int p0, p0

    .line 142
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    cmpg-float p1, p1, p3

    .line 147
    .line 148
    if-gtz p1, :cond_4

    .line 149
    .line 150
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    mul-float/2addr p1, p1

    .line 159
    mul-float/2addr p0, p0

    .line 160
    add-float/2addr p0, p1

    .line 161
    return p0

    .line 162
    :cond_4
    return v2
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final V0(Lqk0;Lcx2;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lxz4;->l0:Lo95;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast v0, Lfx2;

    .line 6
    .line 7
    iget-object p0, v0, Lfx2;->I:Ltk0;

    .line 8
    .line 9
    invoke-virtual {v0}, Lfx2;->g()V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lfx2;->w:Lcx2;

    .line 13
    .line 14
    iget-object v1, v1, Lcx2;->a:Lex2;

    .line 15
    .line 16
    invoke-interface {v1}, Lex2;->K()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    cmpl-float v1, v1, v2

    .line 22
    .line 23
    if-lez v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    :goto_0
    iput-boolean v1, v0, Lfx2;->P:Z

    .line 29
    .line 30
    iget-object v1, p0, Ltk0;->x:Lwr0;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lwr0;->b0(Lqk0;)V

    .line 33
    .line 34
    .line 35
    iput-object p2, v1, Lwr0;->y:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object p1, v0, Lfx2;->w:Lcx2;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lt49;->H(Lhz1;Lcx2;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-wide v0, p0, Lxz4;->Z:J

    .line 44
    .line 45
    const/16 v2, 0x20

    .line 46
    .line 47
    shr-long v2, v0, v2

    .line 48
    .line 49
    long-to-int v2, v2

    .line 50
    int-to-float v2, v2

    .line 51
    const-wide v3, 0xffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v0, v3

    .line 57
    long-to-int v0, v0

    .line 58
    int-to-float v0, v0

    .line 59
    invoke-interface {p1, v2, v0}, Lqk0;->o(FF)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, p2}, Lxz4;->W0(Lqk0;Lcx2;)V

    .line 63
    .line 64
    .line 65
    neg-float p0, v2

    .line 66
    neg-float p2, v0

    .line 67
    invoke-interface {p1, p0, p2}, Lqk0;->o(FF)V

    .line 68
    .line 69
    .line 70
    return-void
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

.method public final W0(Lqk0;Lcx2;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lxz4;->d1(I)Lll4;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lxz4;->r1(Lqk0;Lcx2;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, p0, Lxz4;->O:Luy3;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Lxy3;->a(Luy3;)Lp95;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lje;

    .line 22
    .line 23
    invoke-virtual {v2}, Lje;->getSharedDrawScope()Lwy3;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-wide v4, p0, Leh5;->y:J

    .line 28
    .line 29
    invoke-static {v4, v5}, Lpv8;->O(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    move-object v10, v2

    .line 38
    :goto_0
    if-eqz v1, :cond_8

    .line 39
    .line 40
    instance-of v4, v1, Lgz1;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    move-object v8, v1

    .line 45
    check-cast v8, Lgz1;

    .line 46
    .line 47
    move-object v7, p0

    .line 48
    move-object v4, p1

    .line 49
    move-object v9, p2

    .line 50
    invoke-virtual/range {v3 .. v9}, Lwy3;->c(Lqk0;JLxz4;Lgz1;Lcx2;)V

    .line 51
    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_1
    move-object v7, p0

    .line 55
    move-object v4, p1

    .line 56
    move-object v9, p2

    .line 57
    iget p0, v1, Lll4;->y:I

    .line 58
    .line 59
    and-int/2addr p0, v0

    .line 60
    if-eqz p0, :cond_7

    .line 61
    .line 62
    instance-of p0, v1, Lwo1;

    .line 63
    .line 64
    if-eqz p0, :cond_7

    .line 65
    .line 66
    move-object p0, v1

    .line 67
    check-cast p0, Lwo1;

    .line 68
    .line 69
    iget-object p0, p0, Lwo1;->L:Lll4;

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    :goto_1
    const/4 p2, 0x1

    .line 73
    if-eqz p0, :cond_6

    .line 74
    .line 75
    iget v8, p0, Lll4;->y:I

    .line 76
    .line 77
    and-int/2addr v8, v0

    .line 78
    if-eqz v8, :cond_5

    .line 79
    .line 80
    add-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    if-ne p1, p2, :cond_2

    .line 83
    .line 84
    move-object v1, p0

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    if-nez v10, :cond_3

    .line 87
    .line 88
    new-instance v10, Leq4;

    .line 89
    .line 90
    const/16 p2, 0x10

    .line 91
    .line 92
    new-array p2, p2, [Lll4;

    .line 93
    .line 94
    invoke-direct {v10, p2}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    if-eqz v1, :cond_4

    .line 98
    .line 99
    invoke-virtual {v10, v1}, Leq4;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object v1, v2

    .line 103
    :cond_4
    invoke-virtual {v10, p0}, Leq4;->b(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    :goto_2
    iget-object p0, p0, Lll4;->B:Lll4;

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_6
    if-ne p1, p2, :cond_7

    .line 110
    .line 111
    :goto_3
    move-object p1, v4

    .line 112
    move-object p0, v7

    .line 113
    move-object p2, v9

    .line 114
    goto :goto_0

    .line 115
    :cond_7
    :goto_4
    invoke-static {v10}, Lrc9;->j(Leq4;)Lll4;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    goto :goto_3

    .line 120
    :cond_8
    return-void
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

.method public abstract X0()V
.end method

.method public final Y()F
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    iget-object p0, p0, Luy3;->T:Ltp1;

    .line 4
    .line 5
    invoke-interface {p0}, Ltp1;->Y()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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

.method public final Y0(Lxz4;)Lxz4;
    .locals 5

    .line 1
    iget-object v0, p1, Lxz4;->O:Luy3;

    .line 2
    .line 3
    iget-object v1, p0, Lxz4;->O:Luy3;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Lxz4;->c1()Lll4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, Lll4;->w:Lll4;

    .line 16
    .line 17
    iget-boolean v2, v2, Lll4;->J:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const-string v2, "visitLocalAncestors called on an unattached node"

    .line 22
    .line 23
    invoke-static {v2}, Lyb3;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v1, v1, Lll4;->w:Lll4;

    .line 27
    .line 28
    iget-object v1, v1, Lll4;->A:Lll4;

    .line 29
    .line 30
    :goto_0
    if-eqz v1, :cond_7

    .line 31
    .line 32
    iget v2, v1, Lll4;->y:I

    .line 33
    .line 34
    and-int/lit8 v2, v2, 0x2

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    if-ne v1, v0, :cond_1

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_1
    iget-object v1, v1, Lll4;->A:Lll4;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    iget v2, v0, Luy3;->K:I

    .line 45
    .line 46
    iget v3, v1, Luy3;->K:I

    .line 47
    .line 48
    if-le v2, v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, Luy3;->v()Luy3;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move-object v2, v1

    .line 59
    :goto_2
    iget v3, v2, Luy3;->K:I

    .line 60
    .line 61
    iget v4, v0, Luy3;->K:I

    .line 62
    .line 63
    if-le v3, v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2}, Luy3;->v()Luy3;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    :goto_3
    if-eq v0, v2, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0}, Luy3;->v()Luy3;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v2}, Luy3;->v()Luy3;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    const-string p0, "layouts are not part of the same hierarchy"

    .line 89
    .line 90
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    return-object p0

    .line 95
    :cond_6
    if-ne v2, v1, :cond_8

    .line 96
    .line 97
    :cond_7
    return-object p0

    .line 98
    :cond_8
    iget-object p0, p1, Lxz4;->O:Luy3;

    .line 99
    .line 100
    if-ne v0, p0, :cond_9

    .line 101
    .line 102
    :goto_4
    return-object p1

    .line 103
    :cond_9
    iget-object p0, v0, Luy3;->a0:Lo00;

    .line 104
    .line 105
    iget-object p0, p0, Lo00;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lhc3;

    .line 108
    .line 109
    return-object p0
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final Z0(J)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lxz4;->Z:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    shr-long v3, p1, v2

    .line 6
    .line 7
    long-to-int v3, v3

    .line 8
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    shr-long v4, v0, v2

    .line 13
    .line 14
    long-to-int v4, v4

    .line 15
    int-to-float v4, v4

    .line 16
    sub-float/2addr v3, v4

    .line 17
    const-wide v4, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p1, v4

    .line 23
    long-to-int p1, p1

    .line 24
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-long/2addr v0, v4

    .line 29
    long-to-int p2, v0

    .line 30
    int-to-float p2, p2

    .line 31
    sub-float/2addr p1, p2

    .line 32
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    int-to-long v0, p2

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    int-to-long p1, p1

    .line 42
    shl-long/2addr v0, v2

    .line 43
    and-long/2addr p1, v4

    .line 44
    or-long/2addr p1, v0

    .line 45
    iget-object p0, p0, Lxz4;->l0:Lo95;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    check-cast p0, Lfx2;

    .line 50
    .line 51
    invoke-virtual {p0}, Lfx2;->a()[F

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    const-wide p0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    return-wide p0

    .line 63
    :cond_0
    iget-boolean p0, p0, Lfx2;->O:Z

    .line 64
    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {p1, p2, v0}, Leh4;->b(J[F)J

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    return-wide p0

    .line 73
    :cond_2
    :goto_0
    return-wide p1
    .line 74
    .line 75
    .line 76
.end method

.method public abstract a1()Lfd4;
.end method

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    iget-object p0, p0, Luy3;->T:Ltp1;

    .line 4
    .line 5
    invoke-interface {p0}, Ltp1;->b()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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

.method public final b1()J
    .locals 3

    .line 1
    iget-object v0, p0, Lxz4;->U:Ltp1;

    .line 2
    .line 3
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 4
    .line 5
    iget-object p0, p0, Luy3;->V:Lg58;

    .line 6
    .line 7
    invoke-interface {p0}, Lg58;->d()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-interface {v0, v1, v2}, Ltp1;->A0(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public abstract c1()Lll4;
.end method

.method public final d(J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lxz4;->R(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 6
    .line 7
    invoke-static {p0}, Lxy3;->a(Luy3;)Lp95;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lje;

    .line 12
    .line 13
    invoke-virtual {p0}, Lje;->A()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lje;->r0:[F

    .line 17
    .line 18
    invoke-static {p1, p2, p0}, Leh4;->b(J[F)J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final d1(I)Lll4;
    .locals 2

    .line 1
    invoke-static {p1}, Lyz4;->g(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v1, Lll4;->A:Lll4;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lxz4;->e1(Z)Lll4;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_1
    if-eqz p0, :cond_3

    .line 22
    .line 23
    iget v0, p0, Lll4;->z:I

    .line 24
    .line 25
    and-int/2addr v0, p1

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget v0, p0, Lll4;->y:I

    .line 29
    .line 30
    and-int/2addr v0, p1

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    if-eq p0, v1, :cond_3

    .line 35
    .line 36
    iget-object p0, p0, Lll4;->B:Lll4;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 40
    return-object p0
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

.method public final e1(Z)Lll4;
    .locals 2

    .line 1
    iget-object v0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    iget-object v0, v0, Luy3;->a0:Lo00;

    .line 4
    .line 5
    iget-object v1, v0, Lo00;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lxz4;

    .line 8
    .line 9
    if-ne v1, p0, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lo00;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lll4;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, Lxz4;->Q:Lxz4;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    iget-object p0, p0, Lll4;->B:Lll4;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return-object p0
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

.method public final f1(Lll4;Lvz4;JLf03;IZ)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object v4, p5

    .line 7
    move v5, p6

    .line 8
    move v6, p7

    .line 9
    invoke-virtual/range {v0 .. v6}, Lxz4;->i1(Lvz4;JLf03;IZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-interface {p2, p1}, Lvz4;->d(Lll4;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p2}, Lvz4;->c()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1, v0}, Lh49;->n(Lvo1;I)Lll4;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual/range {p0 .. p7}, Lxz4;->f1(Lll4;Lvz4;JLf03;IZ)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget v0, p5, Lf03;->y:I

    .line 32
    .line 33
    iget-object v1, p5, Lf03;->w:Llp4;

    .line 34
    .line 35
    add-int/lit8 v2, v0, 0x1

    .line 36
    .line 37
    iget v3, v1, Llp4;->b:I

    .line 38
    .line 39
    invoke-virtual {p5, v2, v3}, Lf03;->g(II)V

    .line 40
    .line 41
    .line 42
    iget v2, p5, Lf03;->y:I

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    iput v2, p5, Lf03;->y:I

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Llp4;->a(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p5, Lf03;->x:Lcp4;

    .line 52
    .line 53
    const/high16 v2, -0x40800000    # -1.0f

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-static {v2, p7, v3}, Lmp7;->q(FZZ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-virtual {v1, v2, v3}, Lcp4;->a(J)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, Lvz4;->c()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {p1, v1}, Lh49;->n(Lvo1;I)Lll4;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual/range {p0 .. p7}, Lxz4;->f1(Lll4;Lvz4;JLf03;IZ)V

    .line 72
    .line 73
    .line 74
    iput v0, p5, Lf03;->y:I

    .line 75
    .line 76
    return-void
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
.end method

.method public final g1(Lll4;Lvz4;JLf03;IZF)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object/from16 v4, p5

    .line 7
    .line 8
    move/from16 v5, p6

    .line 9
    .line 10
    move/from16 v6, p7

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, Lxz4;->i1(Lvz4;JLf03;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-interface {p2, p1}, Lvz4;->d(Lll4;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Lvz4;->c()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p1, v0}, Lh49;->n(Lvo1;I)Lll4;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v0, p0

    .line 31
    move-object v2, p2

    .line 32
    move-wide v3, p3

    .line 33
    move-object/from16 v5, p5

    .line 34
    .line 35
    move/from16 v6, p6

    .line 36
    .line 37
    move/from16 v7, p7

    .line 38
    .line 39
    move/from16 v8, p8

    .line 40
    .line 41
    invoke-virtual/range {v0 .. v8}, Lxz4;->g1(Lll4;Lvz4;JLf03;IZF)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    move-object/from16 v5, p5

    .line 46
    .line 47
    iget v10, v5, Lf03;->y:I

    .line 48
    .line 49
    iget-object v0, v5, Lf03;->w:Llp4;

    .line 50
    .line 51
    add-int/lit8 v1, v10, 0x1

    .line 52
    .line 53
    iget v2, v0, Llp4;->b:I

    .line 54
    .line 55
    invoke-virtual {v5, v1, v2}, Lf03;->g(II)V

    .line 56
    .line 57
    .line 58
    iget v1, v5, Lf03;->y:I

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    iput v1, v5, Lf03;->y:I

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Llp4;->a(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v5, Lf03;->x:Lcp4;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    move/from16 v7, p7

    .line 71
    .line 72
    move/from16 v8, p8

    .line 73
    .line 74
    invoke-static {v8, v7, v1}, Lmp7;->q(FZZ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v1

    .line 78
    invoke-virtual {v0, v1, v2}, Lcp4;->a(J)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p2}, Lvz4;->c()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {p1, v0}, Lh49;->n(Lvo1;I)Lll4;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const/4 v9, 0x1

    .line 90
    move-object v0, p0

    .line 91
    move-object v2, p2

    .line 92
    move-wide v3, p3

    .line 93
    move/from16 v6, p6

    .line 94
    .line 95
    invoke-virtual/range {v0 .. v9}, Lxz4;->q1(Lll4;Lvz4;JLf03;IZFZ)V

    .line 96
    .line 97
    .line 98
    iput v10, v5, Lf03;->y:I

    .line 99
    .line 100
    return-void
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
.end method

.method public final getLayoutDirection()Ley3;
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    iget-object p0, p0, Luy3;->U:Ley3;

    .line 4
    .line 5
    return-object p0
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

.method public final h([F)V
    .locals 6

    .line 1
    iget-object v0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    invoke-static {v0}, Lxy3;->a(Luy3;)Lp95;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Lt49;->I(Ldy3;)Ldy3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lxz4;->x1(Ldy3;)Lxz4;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v1, p1}, Lxz4;->A1(Lxz4;[F)V

    .line 16
    .line 17
    .line 18
    instance-of p0, v0, Lfh4;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    check-cast v0, Lfh4;

    .line 23
    .line 24
    check-cast v0, Lje;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lje;->p([F)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    invoke-virtual {v1, v2, v3}, Lxz4;->w(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    const-wide v2, 0x7fffffff7fffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr v2, v0

    .line 42
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long p0, v2, v4

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    const/16 p0, 0x20

    .line 52
    .line 53
    shr-long v2, v0, p0

    .line 54
    .line 55
    long-to-int p0, v2

    .line 56
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    const-wide v2, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    and-long/2addr v0, v2

    .line 66
    long-to-int v0, v0

    .line 67
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {p1, p0, v0}, Leh4;->h([FFF)V

    .line 72
    .line 73
    .line 74
    :cond_1
    return-void
    .line 75
    .line 76
.end method

.method public final h1(Lvz4;JLf03;IZ)V
    .locals 14

    .line 1
    move-wide/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move/from16 v6, p5

    .line 6
    .line 7
    invoke-interface {p1}, Lvz4;->c()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, v0}, Lxz4;->d1(I)Lll4;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v3, v4}, Lxz4;->D1(J)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/high16 v9, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 21
    .line 22
    const v10, 0x7fffffff

    .line 23
    .line 24
    .line 25
    const/4 v11, 0x1

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    if-ne v6, v11, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lxz4;->b1()J

    .line 31
    .line 32
    .line 33
    move-result-wide v12

    .line 34
    invoke-virtual {p0, v3, v4, v12, v13}, Lxz4;->U0(JJ)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    and-int/2addr v2, v10

    .line 43
    if-ge v2, v9, :cond_1

    .line 44
    .line 45
    iget v2, v5, Lf03;->y:I

    .line 46
    .line 47
    iget-object v7, v5, Lf03;->w:Llp4;

    .line 48
    .line 49
    iget v7, v7, Llp4;->b:I

    .line 50
    .line 51
    sub-int/2addr v7, v11

    .line 52
    if-ne v2, v7, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v0, v8, v8}, Lmp7;->q(FZZ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    invoke-virtual {v5}, Lf03;->f()J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    invoke-static {v9, v10, v7, v8}, Lhj8;->p(JJ)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-lez v2, :cond_1

    .line 68
    .line 69
    :goto_0
    const/4 v7, 0x0

    .line 70
    move-object v2, p1

    .line 71
    move v8, v0

    .line 72
    move-object v0, p0

    .line 73
    invoke-virtual/range {v0 .. v8}, Lxz4;->g1(Lll4;Lvz4;JLf03;IZF)V

    .line 74
    .line 75
    .line 76
    :cond_1
    return-void

    .line 77
    :cond_2
    if-nez v1, :cond_3

    .line 78
    .line 79
    invoke-virtual/range {p0 .. p6}, Lxz4;->i1(Lvz4;JLf03;IZ)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    const/16 v0, 0x20

    .line 84
    .line 85
    shr-long v2, p2, v0

    .line 86
    .line 87
    long-to-int v0, v2

    .line 88
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    const-wide v2, 0xffffffffL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    and-long v2, p2, v2

    .line 98
    .line 99
    long-to-int v2, v2

    .line 100
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v3, 0x0

    .line 105
    cmpl-float v4, v0, v3

    .line 106
    .line 107
    if-ltz v4, :cond_4

    .line 108
    .line 109
    cmpl-float v3, v2, v3

    .line 110
    .line 111
    if-ltz v3, :cond_4

    .line 112
    .line 113
    invoke-virtual {p0}, Leh5;->b0()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    int-to-float v3, v3

    .line 118
    cmpg-float v0, v0, v3

    .line 119
    .line 120
    if-gez v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {p0}, Leh5;->Z()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    int-to-float v0, v0

    .line 127
    cmpg-float v0, v2, v0

    .line 128
    .line 129
    if-gez v0, :cond_4

    .line 130
    .line 131
    move-object v0, p0

    .line 132
    move-object v2, p1

    .line 133
    move-wide/from16 v3, p2

    .line 134
    .line 135
    move-object/from16 v5, p4

    .line 136
    .line 137
    move/from16 v6, p5

    .line 138
    .line 139
    move/from16 v7, p6

    .line 140
    .line 141
    invoke-virtual/range {v0 .. v7}, Lxz4;->f1(Lll4;Lvz4;JLf03;IZ)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    move-wide/from16 v3, p2

    .line 146
    .line 147
    move-object/from16 v5, p4

    .line 148
    .line 149
    move/from16 v6, p5

    .line 150
    .line 151
    if-ne v6, v11, :cond_5

    .line 152
    .line 153
    invoke-virtual {p0}, Lxz4;->b1()J

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    invoke-virtual {p0, v3, v4, v12, v13}, Lxz4;->U0(JJ)F

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    goto :goto_1

    .line 162
    :cond_5
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 163
    .line 164
    :goto_1
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    and-int/2addr v7, v10

    .line 169
    if-ge v7, v9, :cond_7

    .line 170
    .line 171
    iget v7, v5, Lf03;->y:I

    .line 172
    .line 173
    iget-object v9, v5, Lf03;->w:Llp4;

    .line 174
    .line 175
    iget v9, v9, Llp4;->b:I

    .line 176
    .line 177
    sub-int/2addr v9, v11

    .line 178
    if-ne v7, v9, :cond_6

    .line 179
    .line 180
    move/from16 v7, p6

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    move/from16 v7, p6

    .line 184
    .line 185
    invoke-static {v2, v7, v8}, Lmp7;->q(FZZ)J

    .line 186
    .line 187
    .line 188
    move-result-wide v9

    .line 189
    invoke-virtual {v5}, Lf03;->f()J

    .line 190
    .line 191
    .line 192
    move-result-wide v12

    .line 193
    invoke-static {v12, v13, v9, v10}, Lhj8;->p(JJ)I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-lez v9, :cond_8

    .line 198
    .line 199
    :goto_2
    move v9, v11

    .line 200
    :goto_3
    move-object v0, p0

    .line 201
    move v8, v2

    .line 202
    move-object v2, p1

    .line 203
    goto :goto_4

    .line 204
    :cond_7
    move/from16 v7, p6

    .line 205
    .line 206
    :cond_8
    move v9, v8

    .line 207
    goto :goto_3

    .line 208
    :goto_4
    invoke-virtual/range {v0 .. v9}, Lxz4;->q1(Lll4;Lvz4;JLf03;IZFZ)V

    .line 209
    .line 210
    .line 211
    return-void
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
.end method

.method public i1(Lvz4;JLf03;IZ)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->P:Lxz4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, Lxz4;->Z0(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    invoke-virtual/range {p0 .. p6}, Lxz4;->h1(Lvz4;JLf03;IZ)V

    .line 10
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
.end method

.method public final j(Ldy3;[F)V
    .locals 1

    .line 1
    invoke-static {p1}, Lxz4;->x1(Ldy3;)Lxz4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lxz4;->l1()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lxz4;->Y0(Lxz4;)Lxz4;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p2}, Leh4;->d([F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0, p2}, Lxz4;->A1(Lxz4;[F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, p2}, Lxz4;->z1(Lxz4;[F)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final j1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxz4;->l0:Lo95;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lfx2;

    .line 6
    .line 7
    invoke-virtual {v0}, Lfx2;->c()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p0, p0, Lxz4;->Q:Lxz4;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lxz4;->j1()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public final k()J
    .locals 2

    .line 1
    iget-wide v0, p0, Leh5;->y:J

    .line 2
    .line 3
    return-wide v0
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

.method public final k1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lxz4;->l0:Lo95;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lxz4;->W:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    iget-object p0, p0, Lxz4;->Q:Lxz4;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lxz4;->k1()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
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

.method public final l1()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    iget-object p0, p0, Luy3;->b0:Lyy3;

    .line 4
    .line 5
    invoke-virtual {p0}, Lyy3;->b()V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public final m1()V
    .locals 13

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, Lyz4;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lxz4;->e1(Z)Lll4;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_c

    .line 12
    .line 13
    iget-object v2, v2, Lll4;->w:Lll4;

    .line 14
    .line 15
    iget v2, v2, Lll4;->z:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_c

    .line 19
    .line 20
    invoke-static {}, Lj45;->h()Lix6;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, Lix6;->e()Lvr2;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v4, v3

    .line 33
    :goto_0
    invoke-static {v2}, Lj45;->j(Lix6;)Lix6;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v6, v6, Lll4;->A:Lll4;

    .line 52
    .line 53
    if-nez v6, :cond_2

    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_2
    :goto_1
    invoke-virtual {p0, v1}, Lxz4;->e1(Z)Lll4;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_2
    if-eqz v1, :cond_b

    .line 62
    .line 63
    iget v7, v1, Lll4;->z:I

    .line 64
    .line 65
    and-int/2addr v7, v0

    .line 66
    if-eqz v7, :cond_b

    .line 67
    .line 68
    iget v7, v1, Lll4;->y:I

    .line 69
    .line 70
    and-int/2addr v7, v0

    .line 71
    if-eqz v7, :cond_a

    .line 72
    .line 73
    move-object v7, v1

    .line 74
    move-object v8, v3

    .line 75
    :goto_3
    if-eqz v7, :cond_a

    .line 76
    .line 77
    instance-of v9, v7, Lsh4;

    .line 78
    .line 79
    if-eqz v9, :cond_3

    .line 80
    .line 81
    check-cast v7, Lsh4;

    .line 82
    .line 83
    iget-wide v9, p0, Leh5;->y:J

    .line 84
    .line 85
    invoke-interface {v7, v9, v10}, Lsh4;->a(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_3
    iget v9, v7, Lll4;->y:I

    .line 90
    .line 91
    and-int/2addr v9, v0

    .line 92
    if-eqz v9, :cond_9

    .line 93
    .line 94
    instance-of v9, v7, Lwo1;

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    move-object v9, v7

    .line 99
    check-cast v9, Lwo1;

    .line 100
    .line 101
    iget-object v9, v9, Lwo1;->L:Lll4;

    .line 102
    .line 103
    const/4 v10, 0x0

    .line 104
    :goto_4
    const/4 v11, 0x1

    .line 105
    if-eqz v9, :cond_8

    .line 106
    .line 107
    iget v12, v9, Lll4;->y:I

    .line 108
    .line 109
    and-int/2addr v12, v0

    .line 110
    if-eqz v12, :cond_7

    .line 111
    .line 112
    add-int/lit8 v10, v10, 0x1

    .line 113
    .line 114
    if-ne v10, v11, :cond_4

    .line 115
    .line 116
    move-object v7, v9

    .line 117
    goto :goto_5

    .line 118
    :cond_4
    if-nez v8, :cond_5

    .line 119
    .line 120
    new-instance v8, Leq4;

    .line 121
    .line 122
    const/16 v11, 0x10

    .line 123
    .line 124
    new-array v11, v11, [Lll4;

    .line 125
    .line 126
    invoke-direct {v8, v11}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    if-eqz v7, :cond_6

    .line 130
    .line 131
    invoke-virtual {v8, v7}, Leq4;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v7, v3

    .line 135
    :cond_6
    invoke-virtual {v8, v9}, Leq4;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    :goto_5
    iget-object v9, v9, Lll4;->B:Lll4;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    if-ne v10, v11, :cond_9

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_9
    :goto_6
    invoke-static {v8}, Lrc9;->j(Leq4;)Lll4;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    goto :goto_3

    .line 149
    :cond_a
    if-eq v1, v6, :cond_b

    .line 150
    .line 151
    iget-object v1, v1, Lll4;->B:Lll4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_b
    :goto_7
    invoke-static {v2, v5, v4}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_8
    invoke-static {v2, v5, v4}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 159
    .line 160
    .line 161
    throw p0

    .line 162
    :cond_c
    return-void
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final n()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean p0, p0, Lll4;->J:Z

    .line 6
    .line 7
    return p0
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

.method public final n1()V
    .locals 10

    .line 1
    const/high16 v0, 0x400000

    .line 2
    .line 3
    invoke-static {v0}, Lyz4;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v2, v2, Lll4;->A:Lll4;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lxz4;->e1(Z)Lll4;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_1
    if-eqz v1, :cond_a

    .line 25
    .line 26
    iget v3, v1, Lll4;->z:I

    .line 27
    .line 28
    and-int/2addr v3, v0

    .line 29
    if-eqz v3, :cond_a

    .line 30
    .line 31
    iget v3, v1, Lll4;->y:I

    .line 32
    .line 33
    and-int/2addr v3, v0

    .line 34
    if-eqz v3, :cond_9

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    move-object v4, v1

    .line 38
    move-object v5, v3

    .line 39
    :goto_2
    if-eqz v4, :cond_9

    .line 40
    .line 41
    instance-of v6, v4, Lby3;

    .line 42
    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    check-cast v4, Lby3;

    .line 46
    .line 47
    invoke-interface {v4, p0}, Lby3;->l(Ldy3;)V

    .line 48
    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_2
    iget v6, v4, Lll4;->y:I

    .line 52
    .line 53
    and-int/2addr v6, v0

    .line 54
    if-eqz v6, :cond_8

    .line 55
    .line 56
    instance-of v6, v4, Lwo1;

    .line 57
    .line 58
    if-eqz v6, :cond_8

    .line 59
    .line 60
    move-object v6, v4

    .line 61
    check-cast v6, Lwo1;

    .line 62
    .line 63
    iget-object v6, v6, Lwo1;->L:Lll4;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    :goto_3
    const/4 v8, 0x1

    .line 67
    if-eqz v6, :cond_7

    .line 68
    .line 69
    iget v9, v6, Lll4;->y:I

    .line 70
    .line 71
    and-int/2addr v9, v0

    .line 72
    if-eqz v9, :cond_6

    .line 73
    .line 74
    add-int/lit8 v7, v7, 0x1

    .line 75
    .line 76
    if-ne v7, v8, :cond_3

    .line 77
    .line 78
    move-object v4, v6

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    if-nez v5, :cond_4

    .line 81
    .line 82
    new-instance v5, Leq4;

    .line 83
    .line 84
    const/16 v8, 0x10

    .line 85
    .line 86
    new-array v8, v8, [Lll4;

    .line 87
    .line 88
    invoke-direct {v5, v8}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    if-eqz v4, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5, v4}, Leq4;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-object v4, v3

    .line 97
    :cond_5
    invoke-virtual {v5, v6}, Leq4;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_6
    :goto_4
    iget-object v6, v6, Lll4;->B:Lll4;

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    if-ne v7, v8, :cond_8

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_8
    :goto_5
    invoke-static {v5}, Lrc9;->j(Leq4;)Lll4;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    goto :goto_2

    .line 111
    :cond_9
    if-eq v1, v2, :cond_a

    .line 112
    .line 113
    iget-object v1, v1, Lll4;->B:Lll4;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_a
    :goto_6
    return-void
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final o1()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxz4;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lxz4;->j0:Lwz4;

    .line 5
    .line 6
    invoke-virtual {v0}, Lwz4;->b()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lxz4;->u1()V

    .line 10
    .line 11
    .line 12
    iget-wide v0, p0, Lxz4;->Z:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Loe3;->a(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lxz4;->O:Luy3;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Luy3;->P(Lxz4;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
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

.method public final p1()V
    .locals 9

    .line 1
    const/high16 v0, 0x100000

    .line 2
    .line 3
    invoke-static {v0}, Lyz4;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lxz4;->e1(Z)Lll4;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_a

    .line 12
    .line 13
    iget-object v2, v2, Lll4;->w:Lll4;

    .line 14
    .line 15
    iget v2, v2, Lll4;->z:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_a

    .line 19
    .line 20
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v2, v2, Lll4;->A:Lll4;

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lxz4;->e1(Z)Lll4;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_1
    if-eqz p0, :cond_a

    .line 38
    .line 39
    iget v1, p0, Lll4;->z:I

    .line 40
    .line 41
    and-int/2addr v1, v0

    .line 42
    if-eqz v1, :cond_a

    .line 43
    .line 44
    iget v1, p0, Lll4;->y:I

    .line 45
    .line 46
    and-int/2addr v1, v0

    .line 47
    if-eqz v1, :cond_9

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    move-object v3, p0

    .line 51
    move-object v4, v1

    .line 52
    :goto_2
    if-eqz v3, :cond_9

    .line 53
    .line 54
    instance-of v5, v3, Lvk2;

    .line 55
    .line 56
    if-eqz v5, :cond_2

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_2
    iget v5, v3, Lll4;->y:I

    .line 60
    .line 61
    and-int/2addr v5, v0

    .line 62
    if-eqz v5, :cond_8

    .line 63
    .line 64
    instance-of v5, v3, Lwo1;

    .line 65
    .line 66
    if-eqz v5, :cond_8

    .line 67
    .line 68
    move-object v5, v3

    .line 69
    check-cast v5, Lwo1;

    .line 70
    .line 71
    iget-object v5, v5, Lwo1;->L:Lll4;

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    :goto_3
    const/4 v7, 0x1

    .line 75
    if-eqz v5, :cond_7

    .line 76
    .line 77
    iget v8, v5, Lll4;->y:I

    .line 78
    .line 79
    and-int/2addr v8, v0

    .line 80
    if-eqz v8, :cond_6

    .line 81
    .line 82
    add-int/lit8 v6, v6, 0x1

    .line 83
    .line 84
    if-ne v6, v7, :cond_3

    .line 85
    .line 86
    move-object v3, v5

    .line 87
    goto :goto_4

    .line 88
    :cond_3
    if-nez v4, :cond_4

    .line 89
    .line 90
    new-instance v4, Leq4;

    .line 91
    .line 92
    const/16 v7, 0x10

    .line 93
    .line 94
    new-array v7, v7, [Lll4;

    .line 95
    .line 96
    invoke-direct {v4, v7}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    if-eqz v3, :cond_5

    .line 100
    .line 101
    invoke-virtual {v4, v3}, Leq4;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    move-object v3, v1

    .line 105
    :cond_5
    invoke-virtual {v4, v5}, Leq4;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_6
    :goto_4
    iget-object v5, v5, Lll4;->B:Lll4;

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_7
    if-ne v6, v7, :cond_8

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_8
    :goto_5
    invoke-static {v4}, Lrc9;->j(Leq4;)Lll4;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    goto :goto_2

    .line 119
    :cond_9
    if-eq p0, v2, :cond_a

    .line 120
    .line 121
    iget-object p0, p0, Lll4;->B:Lll4;

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_a
    :goto_6
    return-void
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final q1(Lll4;Lvz4;JLf03;IZFZ)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    move-wide/from16 v3, p3

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move/from16 v6, p6

    .line 14
    .line 15
    move/from16 v7, p7

    .line 16
    .line 17
    invoke-virtual/range {v1 .. v7}, Lxz4;->i1(Lvz4;JLf03;IZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object/from16 v2, p2

    .line 22
    .line 23
    invoke-interface {v2, v0}, Lvz4;->d(Lll4;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Lvz4;->c()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v1}, Lh49;->n(Lvo1;I)Lll4;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object/from16 v0, p0

    .line 38
    .line 39
    move-wide/from16 v3, p3

    .line 40
    .line 41
    move-object/from16 v5, p5

    .line 42
    .line 43
    move/from16 v6, p6

    .line 44
    .line 45
    move/from16 v7, p7

    .line 46
    .line 47
    move/from16 v8, p8

    .line 48
    .line 49
    move/from16 v9, p9

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v9}, Lxz4;->q1(Lll4;Lvz4;JLf03;IZFZ)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    move-object/from16 v5, p5

    .line 56
    .line 57
    move/from16 v6, p6

    .line 58
    .line 59
    move/from16 v7, p7

    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    if-ne v6, v1, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 v2, 0x4

    .line 66
    if-ne v6, v2, :cond_12

    .line 67
    .line 68
    :goto_0
    const/4 v2, 0x0

    .line 69
    move-object v3, v0

    .line 70
    move-object v4, v2

    .line 71
    :goto_1
    if-eqz v3, :cond_12

    .line 72
    .line 73
    instance-of v8, v3, Ltk5;

    .line 74
    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v10, 0x1

    .line 77
    if-eqz v8, :cond_b

    .line 78
    .line 79
    check-cast v3, Ltk5;

    .line 80
    .line 81
    invoke-interface {v3}, Ltk5;->n()J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    const/16 v4, 0x20

    .line 86
    .line 87
    shr-long v11, p3, v4

    .line 88
    .line 89
    long-to-int v4, v11

    .line 90
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    move-object/from16 v11, p0

    .line 95
    .line 96
    iget-object v12, v11, Lxz4;->O:Luy3;

    .line 97
    .line 98
    iget-object v13, v12, Luy3;->U:Ley3;

    .line 99
    .line 100
    sget v14, Lsk7;->b:I

    .line 101
    .line 102
    const-wide/high16 v14, -0x8000000000000000L

    .line 103
    .line 104
    and-long/2addr v14, v2

    .line 105
    const-wide/16 v16, 0x0

    .line 106
    .line 107
    cmp-long v14, v14, v16

    .line 108
    .line 109
    sget-object v15, Ley3;->w:Ley3;

    .line 110
    .line 111
    const/4 v1, 0x2

    .line 112
    if-eqz v14, :cond_4

    .line 113
    .line 114
    if-ne v13, v15, :cond_3

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    invoke-static {v2, v3, v1}, Lts2;->j(JI)I

    .line 118
    .line 119
    .line 120
    move-result v13

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    :goto_2
    invoke-static {v2, v3, v9}, Lts2;->j(JI)I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    :goto_3
    neg-int v13, v13

    .line 127
    int-to-float v13, v13

    .line 128
    cmpl-float v8, v8, v13

    .line 129
    .line 130
    if-ltz v8, :cond_12

    .line 131
    .line 132
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-virtual {v11}, Leh5;->b0()I

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    iget-object v12, v12, Luy3;->U:Ley3;

    .line 141
    .line 142
    if-eqz v14, :cond_6

    .line 143
    .line 144
    if-ne v12, v15, :cond_5

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_5
    invoke-static {v2, v3, v9}, Lts2;->j(JI)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    goto :goto_5

    .line 152
    :cond_6
    :goto_4
    invoke-static {v2, v3, v1}, Lts2;->j(JI)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    :goto_5
    add-int/2addr v8, v1

    .line 157
    int-to-float v1, v8

    .line 158
    cmpg-float v1, v4, v1

    .line 159
    .line 160
    if-gez v1, :cond_12

    .line 161
    .line 162
    const-wide v8, 0xffffffffL

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    and-long v8, p3, v8

    .line 168
    .line 169
    long-to-int v1, v8

    .line 170
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    sget v8, Lsk7;->b:I

    .line 175
    .line 176
    invoke-static {v2, v3, v10}, Lts2;->j(JI)I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    neg-int v8, v8

    .line 181
    int-to-float v8, v8

    .line 182
    cmpl-float v4, v4, v8

    .line 183
    .line 184
    if-ltz v4, :cond_12

    .line 185
    .line 186
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {v11}, Leh5;->Z()I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    const/4 v8, 0x3

    .line 195
    invoke-static {v2, v3, v8}, Lts2;->j(JI)I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    add-int/2addr v2, v4

    .line 200
    int-to-float v2, v2

    .line 201
    cmpg-float v1, v1, v2

    .line 202
    .line 203
    if-gez v1, :cond_12

    .line 204
    .line 205
    iget-object v1, v5, Lf03;->x:Lcp4;

    .line 206
    .line 207
    iget-object v2, v5, Lf03;->w:Llp4;

    .line 208
    .line 209
    iget v12, v5, Lf03;->y:I

    .line 210
    .line 211
    iget v3, v2, Llp4;->b:I

    .line 212
    .line 213
    add-int/lit8 v4, v3, -0x1

    .line 214
    .line 215
    const/4 v13, 0x0

    .line 216
    if-ne v12, v4, :cond_7

    .line 217
    .line 218
    add-int/lit8 v4, v12, 0x1

    .line 219
    .line 220
    invoke-virtual {v5, v4, v3}, Lf03;->g(II)V

    .line 221
    .line 222
    .line 223
    iget v3, v5, Lf03;->y:I

    .line 224
    .line 225
    add-int/2addr v3, v10

    .line 226
    iput v3, v5, Lf03;->y:I

    .line 227
    .line 228
    invoke-virtual {v2, v0}, Llp4;->a(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v13, v7, v10}, Lmp7;->q(FZZ)J

    .line 232
    .line 233
    .line 234
    move-result-wide v2

    .line 235
    invoke-virtual {v1, v2, v3}, Lcp4;->a(J)V

    .line 236
    .line 237
    .line 238
    invoke-interface/range {p2 .. p2}, Lvz4;->c()I

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    invoke-static {v0, v1}, Lh49;->n(Lvo1;I)Lll4;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    move-object/from16 v2, p2

    .line 247
    .line 248
    move-wide/from16 v3, p3

    .line 249
    .line 250
    move/from16 v8, p8

    .line 251
    .line 252
    move/from16 v9, p9

    .line 253
    .line 254
    move-object v0, v11

    .line 255
    invoke-virtual/range {v0 .. v9}, Lxz4;->q1(Lll4;Lvz4;JLf03;IZFZ)V

    .line 256
    .line 257
    .line 258
    iput v12, v5, Lf03;->y:I

    .line 259
    .line 260
    return-void

    .line 261
    :cond_7
    invoke-virtual {v5}, Lf03;->f()J

    .line 262
    .line 263
    .line 264
    move-result-wide v3

    .line 265
    iget v11, v5, Lf03;->y:I

    .line 266
    .line 267
    invoke-static {v3, v4}, Lhj8;->B(J)Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-eqz v6, :cond_9

    .line 272
    .line 273
    iget v3, v2, Llp4;->b:I

    .line 274
    .line 275
    add-int/lit8 v12, v3, -0x1

    .line 276
    .line 277
    iput v12, v5, Lf03;->y:I

    .line 278
    .line 279
    iget v4, v2, Llp4;->b:I

    .line 280
    .line 281
    invoke-virtual {v5, v3, v4}, Lf03;->g(II)V

    .line 282
    .line 283
    .line 284
    iget v3, v5, Lf03;->y:I

    .line 285
    .line 286
    add-int/2addr v3, v10

    .line 287
    iput v3, v5, Lf03;->y:I

    .line 288
    .line 289
    invoke-virtual {v2, v0}, Llp4;->a(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v13, v7, v10}, Lmp7;->q(FZZ)J

    .line 293
    .line 294
    .line 295
    move-result-wide v2

    .line 296
    invoke-virtual {v1, v2, v3}, Lcp4;->a(J)V

    .line 297
    .line 298
    .line 299
    invoke-interface/range {p2 .. p2}, Lvz4;->c()I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    invoke-static {v0, v1}, Lh49;->n(Lvo1;I)Lll4;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    move-object/from16 v0, p0

    .line 308
    .line 309
    move-object/from16 v2, p2

    .line 310
    .line 311
    move-wide/from16 v3, p3

    .line 312
    .line 313
    move/from16 v6, p6

    .line 314
    .line 315
    move/from16 v8, p8

    .line 316
    .line 317
    move/from16 v9, p9

    .line 318
    .line 319
    invoke-virtual/range {v0 .. v9}, Lxz4;->q1(Lll4;Lvz4;JLf03;IZFZ)V

    .line 320
    .line 321
    .line 322
    iput v12, v5, Lf03;->y:I

    .line 323
    .line 324
    invoke-virtual {v5}, Lf03;->f()J

    .line 325
    .line 326
    .line 327
    move-result-wide v0

    .line 328
    invoke-static {v0, v1}, Lhj8;->v(J)F

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    cmpg-float v0, v0, v13

    .line 333
    .line 334
    if-gez v0, :cond_8

    .line 335
    .line 336
    add-int/lit8 v0, v11, 0x1

    .line 337
    .line 338
    iget v1, v5, Lf03;->y:I

    .line 339
    .line 340
    add-int/2addr v1, v10

    .line 341
    invoke-virtual {v5, v0, v1}, Lf03;->g(II)V

    .line 342
    .line 343
    .line 344
    :cond_8
    iput v11, v5, Lf03;->y:I

    .line 345
    .line 346
    return-void

    .line 347
    :cond_9
    invoke-static {v3, v4}, Lhj8;->v(J)F

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    cmpl-float v3, v3, v13

    .line 352
    .line 353
    if-lez v3, :cond_a

    .line 354
    .line 355
    iget v11, v5, Lf03;->y:I

    .line 356
    .line 357
    add-int/lit8 v3, v11, 0x1

    .line 358
    .line 359
    iget v4, v2, Llp4;->b:I

    .line 360
    .line 361
    invoke-virtual {v5, v3, v4}, Lf03;->g(II)V

    .line 362
    .line 363
    .line 364
    iget v3, v5, Lf03;->y:I

    .line 365
    .line 366
    add-int/2addr v3, v10

    .line 367
    iput v3, v5, Lf03;->y:I

    .line 368
    .line 369
    invoke-virtual {v2, v0}, Llp4;->a(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v13, v7, v10}, Lmp7;->q(FZZ)J

    .line 373
    .line 374
    .line 375
    move-result-wide v2

    .line 376
    invoke-virtual {v1, v2, v3}, Lcp4;->a(J)V

    .line 377
    .line 378
    .line 379
    invoke-interface/range {p2 .. p2}, Lvz4;->c()I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    invoke-static {v0, v1}, Lh49;->n(Lvo1;I)Lll4;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    move-object/from16 v0, p0

    .line 388
    .line 389
    move-object/from16 v2, p2

    .line 390
    .line 391
    move-wide/from16 v3, p3

    .line 392
    .line 393
    move/from16 v6, p6

    .line 394
    .line 395
    move/from16 v8, p8

    .line 396
    .line 397
    move/from16 v9, p9

    .line 398
    .line 399
    invoke-virtual/range {v0 .. v9}, Lxz4;->q1(Lll4;Lvz4;JLf03;IZFZ)V

    .line 400
    .line 401
    .line 402
    iput v11, v5, Lf03;->y:I

    .line 403
    .line 404
    :cond_a
    return-void

    .line 405
    :cond_b
    move v8, v1

    .line 406
    iget v1, v3, Lll4;->y:I

    .line 407
    .line 408
    const/16 v6, 0x10

    .line 409
    .line 410
    and-int/2addr v1, v6

    .line 411
    if-eqz v1, :cond_11

    .line 412
    .line 413
    instance-of v1, v3, Lwo1;

    .line 414
    .line 415
    if-eqz v1, :cond_11

    .line 416
    .line 417
    move-object v1, v3

    .line 418
    check-cast v1, Lwo1;

    .line 419
    .line 420
    iget-object v1, v1, Lwo1;->L:Lll4;

    .line 421
    .line 422
    :goto_6
    if-eqz v1, :cond_10

    .line 423
    .line 424
    iget v7, v1, Lll4;->y:I

    .line 425
    .line 426
    and-int/2addr v7, v6

    .line 427
    if-eqz v7, :cond_f

    .line 428
    .line 429
    add-int/lit8 v9, v9, 0x1

    .line 430
    .line 431
    if-ne v9, v10, :cond_c

    .line 432
    .line 433
    move-object v3, v1

    .line 434
    goto :goto_7

    .line 435
    :cond_c
    if-nez v4, :cond_d

    .line 436
    .line 437
    new-instance v4, Leq4;

    .line 438
    .line 439
    new-array v7, v6, [Lll4;

    .line 440
    .line 441
    invoke-direct {v4, v7}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    :cond_d
    if-eqz v3, :cond_e

    .line 445
    .line 446
    invoke-virtual {v4, v3}, Leq4;->b(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    move-object v3, v2

    .line 450
    :cond_e
    invoke-virtual {v4, v1}, Leq4;->b(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :cond_f
    :goto_7
    iget-object v1, v1, Lll4;->B:Lll4;

    .line 454
    .line 455
    goto :goto_6

    .line 456
    :cond_10
    if-ne v9, v10, :cond_11

    .line 457
    .line 458
    :goto_8
    move/from16 v6, p6

    .line 459
    .line 460
    move/from16 v7, p7

    .line 461
    .line 462
    move v1, v8

    .line 463
    goto/16 :goto_1

    .line 464
    .line 465
    :cond_11
    invoke-static {v4}, Lrc9;->j(Leq4;)Lll4;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    goto :goto_8

    .line 470
    :cond_12
    if-eqz p9, :cond_13

    .line 471
    .line 472
    invoke-virtual/range {p0 .. p8}, Lxz4;->g1(Lll4;Lvz4;JLf03;IZF)V

    .line 473
    .line 474
    .line 475
    return-void

    .line 476
    :cond_13
    invoke-virtual/range {p0 .. p8}, Lxz4;->w1(Lll4;Lvz4;JLf03;IZF)V

    .line 477
    .line 478
    .line 479
    return-void
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lxz4;->l0:Lo95;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lxz4;->R:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 10
    .line 11
    invoke-virtual {p0}, Luy3;->J()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
    .line 21
.end method

.method public abstract r1(Lqk0;Lcx2;)V
.end method

.method public final s1(JFLvr2;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p4, v0}, Lxz4;->B1(Lvr2;Z)V

    .line 3
    .line 4
    .line 5
    iget-wide v0, p0, Lxz4;->Z:J

    .line 6
    .line 7
    invoke-static {v0, v1, p1, p2}, Loe3;->a(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    iget-object v0, p0, Lxz4;->O:Luy3;

    .line 12
    .line 13
    if-nez p4, :cond_2

    .line 14
    .line 15
    invoke-static {v0}, Lxy3;->a(Luy3;)Lp95;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    const/high16 v1, -0x3f800000    # -4.0f

    .line 20
    .line 21
    check-cast p4, Lje;

    .line 22
    .line 23
    invoke-virtual {p4, v1}, Lje;->M(F)V

    .line 24
    .line 25
    .line 26
    iput-wide p1, p0, Lxz4;->Z:J

    .line 27
    .line 28
    iget-object p4, p0, Lxz4;->l0:Lo95;

    .line 29
    .line 30
    if-eqz p4, :cond_0

    .line 31
    .line 32
    check-cast p4, Lfx2;

    .line 33
    .line 34
    invoke-virtual {p4, p1, p2}, Lfx2;->d(J)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Lxz4;->Q:Lxz4;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Lxz4;->j1()V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    invoke-virtual {v0, p0}, Luy3;->P(Lxz4;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Ldd4;->N0(Lxz4;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, v0, Luy3;->J:Lp95;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    check-cast p1, Lje;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lje;->t(Luy3;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iput p3, p0, Lxz4;->a0:F

    .line 61
    .line 62
    iget-object p1, v0, Luy3;->a0:Lo00;

    .line 63
    .line 64
    iget-object p1, p1, Lo00;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lxz4;

    .line 67
    .line 68
    if-ne p0, p1, :cond_3

    .line 69
    .line 70
    invoke-static {v0}, Lxy3;->a(Luy3;)Lp95;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lje;

    .line 75
    .line 76
    invoke-virtual {p1}, Lje;->getRectManager()Lny5;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1, v0}, Lny5;->h(Luy3;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    iget-boolean p1, p0, Ldd4;->K:Z

    .line 84
    .line 85
    if-nez p1, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0}, Lxz4;->J0()Lmh4;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p1}, Ldd4;->u0(Lmh4;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    return-void
.end method

.method public final t1(Lsp4;ZZ)V
    .locals 12

    .line 1
    iget-object v0, p0, Lxz4;->l0:Lo95;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_a

    .line 11
    .line 12
    iget-boolean v4, p0, Lxz4;->S:Z

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v4, :cond_8

    .line 16
    .line 17
    if-eqz p3, :cond_6

    .line 18
    .line 19
    invoke-virtual {p0}, Lxz4;->b1()J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    iget v4, p1, Lsp4;->b:F

    .line 24
    .line 25
    iget v6, p1, Lsp4;->c:F

    .line 26
    .line 27
    iget v7, p1, Lsp4;->d:F

    .line 28
    .line 29
    cmpg-float v7, v7, v5

    .line 30
    .line 31
    if-ltz v7, :cond_5

    .line 32
    .line 33
    iget-wide v7, p0, Leh5;->y:J

    .line 34
    .line 35
    shr-long v9, v7, v1

    .line 36
    .line 37
    long-to-int v9, v9

    .line 38
    int-to-float v9, v9

    .line 39
    cmpl-float v9, v4, v9

    .line 40
    .line 41
    if-gtz v9, :cond_5

    .line 42
    .line 43
    iget v9, p1, Lsp4;->e:F

    .line 44
    .line 45
    cmpg-float v9, v9, v5

    .line 46
    .line 47
    if-ltz v9, :cond_5

    .line 48
    .line 49
    and-long/2addr v7, v2

    .line 50
    long-to-int v7, v7

    .line 51
    int-to-float v7, v7

    .line 52
    cmpl-float v7, v6, v7

    .line 53
    .line 54
    if-lez v7, :cond_0

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_0
    shr-long v7, p2, v1

    .line 58
    .line 59
    long-to-int v7, v7

    .line 60
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    and-long v8, p2, v2

    .line 65
    .line 66
    long-to-int v8, v8

    .line 67
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    iget v9, p1, Lsp4;->d:F

    .line 72
    .line 73
    iget v10, p1, Lsp4;->b:F

    .line 74
    .line 75
    sub-float/2addr v9, v10

    .line 76
    sub-float v9, v7, v9

    .line 77
    .line 78
    const/high16 v10, 0x40000000    # 2.0f

    .line 79
    .line 80
    div-float/2addr v9, v10

    .line 81
    cmpl-float v11, v9, v5

    .line 82
    .line 83
    if-lez v11, :cond_1

    .line 84
    .line 85
    sub-float/2addr v4, v9

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    neg-float v7, v7

    .line 88
    div-float/2addr v7, v10

    .line 89
    cmpg-float v9, v4, v7

    .line 90
    .line 91
    if-gez v9, :cond_2

    .line 92
    .line 93
    move v4, v7

    .line 94
    :cond_2
    :goto_0
    iget v7, p1, Lsp4;->e:F

    .line 95
    .line 96
    iget v9, p1, Lsp4;->c:F

    .line 97
    .line 98
    sub-float/2addr v7, v9

    .line 99
    sub-float v7, v8, v7

    .line 100
    .line 101
    div-float/2addr v7, v10

    .line 102
    cmpl-float v9, v7, v5

    .line 103
    .line 104
    if-lez v9, :cond_3

    .line 105
    .line 106
    sub-float/2addr v6, v7

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    neg-float v7, v8

    .line 109
    div-float/2addr v7, v10

    .line 110
    cmpg-float v8, v6, v7

    .line 111
    .line 112
    if-gez v8, :cond_4

    .line 113
    .line 114
    move v6, v7

    .line 115
    :cond_4
    :goto_1
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    int-to-long v7, v4

    .line 120
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    int-to-long v9, v4

    .line 125
    shl-long v6, v7, v1

    .line 126
    .line 127
    and-long v8, v9, v2

    .line 128
    .line 129
    or-long/2addr v6, v8

    .line 130
    goto :goto_3

    .line 131
    :cond_5
    :goto_2
    const-wide/16 v6, 0x0

    .line 132
    .line 133
    :goto_3
    shr-long v8, v6, v1

    .line 134
    .line 135
    long-to-int v4, v8

    .line 136
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    and-long/2addr v6, v2

    .line 141
    long-to-int v6, v6

    .line 142
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    iget-wide v7, p0, Leh5;->y:J

    .line 147
    .line 148
    shr-long v9, v7, v1

    .line 149
    .line 150
    long-to-int v9, v9

    .line 151
    and-long/2addr v7, v2

    .line 152
    long-to-int v7, v7

    .line 153
    int-to-float v8, v9

    .line 154
    shr-long v9, p2, v1

    .line 155
    .line 156
    long-to-int v9, v9

    .line 157
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    add-float/2addr v10, v8

    .line 162
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    add-float/2addr v9, v4

    .line 167
    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    invoke-static {v10, v8}, Ljava/lang/Math;->min(FF)F

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    int-to-float v7, v7

    .line 176
    and-long/2addr p2, v2

    .line 177
    long-to-int p2, p2

    .line 178
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 179
    .line 180
    .line 181
    move-result p3

    .line 182
    add-float/2addr p3, v7

    .line 183
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    add-float/2addr p2, v6

    .line 188
    invoke-static {v7, p2}, Ljava/lang/Math;->max(FF)F

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    invoke-static {p3, p2}, Ljava/lang/Math;->min(FF)F

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    invoke-virtual {p1, v4, v6, v8, p2}, Lsp4;->a(FFFF)V

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_6
    if-eqz p2, :cond_7

    .line 201
    .line 202
    iget-wide p2, p0, Leh5;->y:J

    .line 203
    .line 204
    shr-long v6, p2, v1

    .line 205
    .line 206
    long-to-int v4, v6

    .line 207
    int-to-float v4, v4

    .line 208
    and-long/2addr p2, v2

    .line 209
    long-to-int p2, p2

    .line 210
    int-to-float p2, p2

    .line 211
    invoke-virtual {p1, v5, v5, v4, p2}, Lsp4;->a(FFFF)V

    .line 212
    .line 213
    .line 214
    :cond_7
    :goto_4
    invoke-virtual {p1}, Lsp4;->b()Z

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    if-eqz p2, :cond_8

    .line 219
    .line 220
    return-void

    .line 221
    :cond_8
    check-cast v0, Lfx2;

    .line 222
    .line 223
    invoke-virtual {v0}, Lfx2;->b()[F

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    iget-boolean p3, v0, Lfx2;->O:Z

    .line 228
    .line 229
    if-nez p3, :cond_a

    .line 230
    .line 231
    if-nez p2, :cond_9

    .line 232
    .line 233
    iput v5, p1, Lsp4;->b:F

    .line 234
    .line 235
    iput v5, p1, Lsp4;->c:F

    .line 236
    .line 237
    iput v5, p1, Lsp4;->d:F

    .line 238
    .line 239
    iput v5, p1, Lsp4;->e:F

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_9
    invoke-static {p2, p1}, Leh4;->c([FLsp4;)V

    .line 243
    .line 244
    .line 245
    :cond_a
    :goto_5
    iget-wide p2, p0, Lxz4;->Z:J

    .line 246
    .line 247
    shr-long v0, p2, v1

    .line 248
    .line 249
    long-to-int p0, v0

    .line 250
    iget v0, p1, Lsp4;->b:F

    .line 251
    .line 252
    int-to-float p0, p0

    .line 253
    add-float/2addr v0, p0

    .line 254
    iput v0, p1, Lsp4;->b:F

    .line 255
    .line 256
    iget v0, p1, Lsp4;->d:F

    .line 257
    .line 258
    add-float/2addr v0, p0

    .line 259
    iput v0, p1, Lsp4;->d:F

    .line 260
    .line 261
    and-long/2addr p2, v2

    .line 262
    long-to-int p0, p2

    .line 263
    iget p2, p1, Lsp4;->c:F

    .line 264
    .line 265
    int-to-float p0, p0

    .line 266
    add-float/2addr p2, p0

    .line 267
    iput p2, p1, Lsp4;->c:F

    .line 268
    .line 269
    iget p2, p1, Lsp4;->e:F

    .line 270
    .line 271
    add-float/2addr p2, p0

    .line 272
    iput p2, p1, Lsp4;->e:F

    .line 273
    .line 274
    return-void
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
.end method

.method public final u1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxz4;->l0:Lo95;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1}, Lxz4;->B1(Lvr2;Z)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Luy3;->Y(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final v1(Lmh4;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lxz4;->X:Lmh4;

    .line 6
    .line 7
    if-eq v1, v2, :cond_19

    .line 8
    .line 9
    iput-object v1, v0, Lxz4;->X:Lmh4;

    .line 10
    .line 11
    iget-object v3, v0, Lxz4;->O:Luy3;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Lmh4;->e()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    invoke-interface {v2}, Lmh4;->e()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-ne v5, v6, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Lmh4;->c()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-interface {v2}, Lmh4;->c()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v5, v2, :cond_10

    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lmh4;->e()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-interface {v1}, Lmh4;->c()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    iget-object v6, v0, Lxz4;->l0:Lo95;

    .line 45
    .line 46
    const-wide v7, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    const/16 v9, 0x20

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    int-to-long v10, v2

    .line 56
    shl-long/2addr v10, v9

    .line 57
    int-to-long v12, v5

    .line 58
    and-long/2addr v12, v7

    .line 59
    or-long/2addr v10, v12

    .line 60
    check-cast v6, Lfx2;

    .line 61
    .line 62
    invoke-virtual {v6, v10, v11}, Lfx2;->e(J)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v3}, Luy3;->K()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    iget-object v6, v0, Lxz4;->Q:Lxz4;

    .line 73
    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    invoke-virtual {v6}, Lxz4;->j1()V

    .line 77
    .line 78
    .line 79
    :cond_2
    :goto_0
    int-to-long v10, v2

    .line 80
    shl-long v9, v10, v9

    .line 81
    .line 82
    int-to-long v5, v5

    .line 83
    and-long/2addr v5, v7

    .line 84
    or-long/2addr v5, v9

    .line 85
    invoke-virtual {v0, v5, v6}, Leh5;->i0(J)V

    .line 86
    .line 87
    .line 88
    iget-object v2, v0, Lxz4;->T:Lvr2;

    .line 89
    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    invoke-virtual {v0, v4}, Lxz4;->C1(Z)V

    .line 93
    .line 94
    .line 95
    :cond_3
    const/4 v2, 0x4

    .line 96
    invoke-static {v2}, Lyz4;->g(I)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-virtual {v0}, Lxz4;->c1()Lll4;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    if-eqz v5, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    iget-object v6, v6, Lll4;->A:Lll4;

    .line 108
    .line 109
    if-nez v6, :cond_5

    .line 110
    .line 111
    goto/16 :goto_7

    .line 112
    .line 113
    :cond_5
    :goto_1
    invoke-virtual {v0, v5}, Lxz4;->e1(Z)Lll4;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    :goto_2
    if-eqz v5, :cond_e

    .line 118
    .line 119
    iget v7, v5, Lll4;->z:I

    .line 120
    .line 121
    and-int/2addr v7, v2

    .line 122
    if-eqz v7, :cond_e

    .line 123
    .line 124
    iget v7, v5, Lll4;->y:I

    .line 125
    .line 126
    and-int/2addr v7, v2

    .line 127
    if-eqz v7, :cond_d

    .line 128
    .line 129
    const/4 v7, 0x0

    .line 130
    move-object v8, v5

    .line 131
    move-object v9, v7

    .line 132
    :goto_3
    if-eqz v8, :cond_d

    .line 133
    .line 134
    instance-of v10, v8, Lgz1;

    .line 135
    .line 136
    if-eqz v10, :cond_6

    .line 137
    .line 138
    check-cast v8, Lgz1;

    .line 139
    .line 140
    invoke-interface {v8}, Lgz1;->M()V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_6
    iget v10, v8, Lll4;->y:I

    .line 145
    .line 146
    and-int/2addr v10, v2

    .line 147
    if-eqz v10, :cond_c

    .line 148
    .line 149
    instance-of v10, v8, Lwo1;

    .line 150
    .line 151
    if-eqz v10, :cond_c

    .line 152
    .line 153
    move-object v10, v8

    .line 154
    check-cast v10, Lwo1;

    .line 155
    .line 156
    iget-object v10, v10, Lwo1;->L:Lll4;

    .line 157
    .line 158
    move v11, v4

    .line 159
    :goto_4
    const/4 v12, 0x1

    .line 160
    if-eqz v10, :cond_b

    .line 161
    .line 162
    iget v13, v10, Lll4;->y:I

    .line 163
    .line 164
    and-int/2addr v13, v2

    .line 165
    if-eqz v13, :cond_a

    .line 166
    .line 167
    add-int/lit8 v11, v11, 0x1

    .line 168
    .line 169
    if-ne v11, v12, :cond_7

    .line 170
    .line 171
    move-object v8, v10

    .line 172
    goto :goto_5

    .line 173
    :cond_7
    if-nez v9, :cond_8

    .line 174
    .line 175
    new-instance v9, Leq4;

    .line 176
    .line 177
    const/16 v12, 0x10

    .line 178
    .line 179
    new-array v12, v12, [Lll4;

    .line 180
    .line 181
    invoke-direct {v9, v12}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    if-eqz v8, :cond_9

    .line 185
    .line 186
    invoke-virtual {v9, v8}, Leq4;->b(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object v8, v7

    .line 190
    :cond_9
    invoke-virtual {v9, v10}, Leq4;->b(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_a
    :goto_5
    iget-object v10, v10, Lll4;->B:Lll4;

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_b
    if-ne v11, v12, :cond_c

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_c
    :goto_6
    invoke-static {v9}, Lrc9;->j(Leq4;)Lll4;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    goto :goto_3

    .line 204
    :cond_d
    if-eq v5, v6, :cond_e

    .line 205
    .line 206
    iget-object v5, v5, Lll4;->B:Lll4;

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_e
    :goto_7
    iget-object v2, v3, Luy3;->J:Lp95;

    .line 210
    .line 211
    if-eqz v2, :cond_f

    .line 212
    .line 213
    check-cast v2, Lje;

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Lje;->t(Luy3;)V

    .line 216
    .line 217
    .line 218
    :cond_f
    invoke-virtual {v3, v0}, Luy3;->P(Lxz4;)V

    .line 219
    .line 220
    .line 221
    :cond_10
    iget-object v2, v0, Lxz4;->Y:Lhp4;

    .line 222
    .line 223
    if-eqz v2, :cond_11

    .line 224
    .line 225
    iget v2, v2, Lhp4;->e:I

    .line 226
    .line 227
    if-eqz v2, :cond_11

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_11
    invoke-interface {v1}, Lmh4;->a()Ljava/util/Map;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-nez v2, :cond_19

    .line 239
    .line 240
    :goto_8
    iget-object v2, v0, Lxz4;->Y:Lhp4;

    .line 241
    .line 242
    invoke-interface {v1}, Lmh4;->a()Ljava/util/Map;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    if-nez v2, :cond_12

    .line 247
    .line 248
    goto :goto_b

    .line 249
    :cond_12
    iget v6, v2, Lhp4;->e:I

    .line 250
    .line 251
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-eq v6, v7, :cond_13

    .line 256
    .line 257
    goto :goto_b

    .line 258
    :cond_13
    iget-object v6, v2, Lhp4;->b:[Ljava/lang/Object;

    .line 259
    .line 260
    iget-object v7, v2, Lhp4;->c:[I

    .line 261
    .line 262
    iget-object v2, v2, Lhp4;->a:[J

    .line 263
    .line 264
    array-length v8, v2

    .line 265
    add-int/lit8 v8, v8, -0x2

    .line 266
    .line 267
    if-ltz v8, :cond_19

    .line 268
    .line 269
    move v9, v4

    .line 270
    :goto_9
    aget-wide v10, v2, v9

    .line 271
    .line 272
    not-long v12, v10

    .line 273
    const/4 v14, 0x7

    .line 274
    shl-long/2addr v12, v14

    .line 275
    and-long/2addr v12, v10

    .line 276
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    and-long/2addr v12, v14

    .line 282
    cmp-long v12, v12, v14

    .line 283
    .line 284
    if-eqz v12, :cond_18

    .line 285
    .line 286
    sub-int v12, v9, v8

    .line 287
    .line 288
    not-int v12, v12

    .line 289
    ushr-int/lit8 v12, v12, 0x1f

    .line 290
    .line 291
    const/16 v13, 0x8

    .line 292
    .line 293
    rsub-int/lit8 v12, v12, 0x8

    .line 294
    .line 295
    move v14, v4

    .line 296
    :goto_a
    if-ge v14, v12, :cond_17

    .line 297
    .line 298
    const-wide/16 v15, 0xff

    .line 299
    .line 300
    and-long/2addr v15, v10

    .line 301
    const-wide/16 v17, 0x80

    .line 302
    .line 303
    cmp-long v15, v15, v17

    .line 304
    .line 305
    if-gez v15, :cond_16

    .line 306
    .line 307
    shl-int/lit8 v15, v9, 0x3

    .line 308
    .line 309
    add-int/2addr v15, v14

    .line 310
    aget-object v16, v6, v15

    .line 311
    .line 312
    aget v15, v7, v15

    .line 313
    .line 314
    move-object/from16 v4, v16

    .line 315
    .line 316
    check-cast v4, Lkb;

    .line 317
    .line 318
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    check-cast v4, Ljava/lang/Integer;

    .line 323
    .line 324
    if-nez v4, :cond_14

    .line 325
    .line 326
    goto :goto_b

    .line 327
    :cond_14
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    if-eq v4, v15, :cond_16

    .line 332
    .line 333
    :goto_b
    iget-object v2, v3, Luy3;->b0:Lyy3;

    .line 334
    .line 335
    iget-object v2, v2, Lyy3;->p:Lkh4;

    .line 336
    .line 337
    iget-object v2, v2, Lkh4;->T:Lvy3;

    .line 338
    .line 339
    invoke-virtual {v2}, Lvy3;->f()V

    .line 340
    .line 341
    .line 342
    iget-object v2, v0, Lxz4;->Y:Lhp4;

    .line 343
    .line 344
    if-nez v2, :cond_15

    .line 345
    .line 346
    sget-object v2, Lv25;->a:Lhp4;

    .line 347
    .line 348
    new-instance v2, Lhp4;

    .line 349
    .line 350
    invoke-direct {v2}, Lhp4;-><init>()V

    .line 351
    .line 352
    .line 353
    iput-object v2, v0, Lxz4;->Y:Lhp4;

    .line 354
    .line 355
    :cond_15
    invoke-virtual {v2}, Lhp4;->a()V

    .line 356
    .line 357
    .line 358
    invoke-interface {v1}, Lmh4;->a()Ljava/util/Map;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_19

    .line 375
    .line 376
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, Ljava/util/Map$Entry;

    .line 381
    .line 382
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    check-cast v1, Ljava/lang/Number;

    .line 391
    .line 392
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    invoke-virtual {v2, v1, v3}, Lhp4;->g(ILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    goto :goto_c

    .line 400
    :cond_16
    shr-long/2addr v10, v13

    .line 401
    add-int/lit8 v14, v14, 0x1

    .line 402
    .line 403
    const/4 v4, 0x0

    .line 404
    goto :goto_a

    .line 405
    :cond_17
    if-ne v12, v13, :cond_19

    .line 406
    .line 407
    :cond_18
    if-eq v9, v8, :cond_19

    .line 408
    .line 409
    add-int/lit8 v9, v9, 0x1

    .line 410
    .line 411
    const/4 v4, 0x0

    .line 412
    goto/16 :goto_9

    .line 413
    .line 414
    :cond_19
    return-void
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final w(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lll4;->J:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lxz4;->R(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 19
    .line 20
    invoke-static {p0}, Lxy3;->a(Luy3;)Lp95;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lje;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Lje;->q(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    return-wide p0
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
.end method

.method public final w1(Lll4;Lvz4;JLf03;IZF)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    move-wide/from16 v3, p3

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move/from16 v6, p6

    .line 14
    .line 15
    move/from16 v7, p7

    .line 16
    .line 17
    invoke-virtual/range {v1 .. v7}, Lxz4;->i1(Lvz4;JLf03;IZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object/from16 v2, p2

    .line 22
    .line 23
    invoke-interface {v2, v0}, Lvz4;->d(Lll4;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Lvz4;->c()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v1}, Lh49;->n(Lvo1;I)Lll4;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object/from16 v0, p0

    .line 38
    .line 39
    move-wide/from16 v3, p3

    .line 40
    .line 41
    move-object/from16 v5, p5

    .line 42
    .line 43
    move/from16 v6, p6

    .line 44
    .line 45
    move/from16 v7, p7

    .line 46
    .line 47
    move/from16 v8, p8

    .line 48
    .line 49
    invoke-virtual/range {v0 .. v8}, Lxz4;->w1(Lll4;Lvz4;JLf03;IZF)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    move-object/from16 v5, p5

    .line 54
    .line 55
    move/from16 v7, p7

    .line 56
    .line 57
    move/from16 v8, p8

    .line 58
    .line 59
    invoke-interface {v2, v0}, Lvz4;->b(Lll4;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_9

    .line 64
    .line 65
    iget-object v10, v5, Lf03;->x:Lcp4;

    .line 66
    .line 67
    iget-object v11, v5, Lf03;->w:Llp4;

    .line 68
    .line 69
    iget v12, v5, Lf03;->y:I

    .line 70
    .line 71
    iget v1, v11, Llp4;->b:I

    .line 72
    .line 73
    add-int/lit8 v3, v1, -0x1

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    if-ne v12, v3, :cond_6

    .line 77
    .line 78
    add-int/lit8 v13, v12, 0x1

    .line 79
    .line 80
    invoke-virtual {v5, v13, v1}, Lf03;->g(II)V

    .line 81
    .line 82
    .line 83
    iget v1, v5, Lf03;->y:I

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    iput v1, v5, Lf03;->y:I

    .line 88
    .line 89
    invoke-virtual {v11, v0}, Llp4;->a(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v8, v7, v4}, Lmp7;->q(FZZ)J

    .line 93
    .line 94
    .line 95
    move-result-wide v3

    .line 96
    invoke-virtual {v10, v3, v4}, Lcp4;->a(J)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v2}, Lvz4;->c()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-static {v0, v1}, Lh49;->n(Lvo1;I)Lll4;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const/4 v9, 0x0

    .line 108
    move-object/from16 v0, p0

    .line 109
    .line 110
    move-wide/from16 v3, p3

    .line 111
    .line 112
    move/from16 v6, p6

    .line 113
    .line 114
    invoke-virtual/range {v0 .. v9}, Lxz4;->q1(Lll4;Lvz4;JLf03;IZFZ)V

    .line 115
    .line 116
    .line 117
    iput v12, v5, Lf03;->y:I

    .line 118
    .line 119
    iget v0, v11, Llp4;->b:I

    .line 120
    .line 121
    add-int/lit8 v0, v0, -0x1

    .line 122
    .line 123
    if-eq v13, v0, :cond_3

    .line 124
    .line 125
    invoke-virtual {v5}, Lf03;->f()J

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    invoke-static {v0, v1}, Lhj8;->B(J)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_2
    return-void

    .line 137
    :cond_3
    :goto_0
    iget v0, v5, Lf03;->y:I

    .line 138
    .line 139
    add-int/lit8 v1, v0, 0x1

    .line 140
    .line 141
    invoke-virtual {v11, v1}, Llp4;->k(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    if-ltz v1, :cond_5

    .line 145
    .line 146
    iget v2, v10, Lcp4;->b:I

    .line 147
    .line 148
    if-ge v1, v2, :cond_5

    .line 149
    .line 150
    iget-object v3, v10, Lcp4;->a:[J

    .line 151
    .line 152
    aget-wide v4, v3, v1

    .line 153
    .line 154
    add-int/lit8 v4, v2, -0x1

    .line 155
    .line 156
    if-eq v1, v4, :cond_4

    .line 157
    .line 158
    add-int/lit8 v0, v0, 0x2

    .line 159
    .line 160
    invoke-static {v3, v3, v1, v0, v2}, Lqs;->L0([J[JIII)V

    .line 161
    .line 162
    .line 163
    :cond_4
    iget v0, v10, Lcp4;->b:I

    .line 164
    .line 165
    add-int/lit8 v0, v0, -0x1

    .line 166
    .line 167
    iput v0, v10, Lcp4;->b:I

    .line 168
    .line 169
    return-void

    .line 170
    :cond_5
    const-string v0, "Index must be between 0 and size"

    .line 171
    .line 172
    invoke-static {v0}, Lh;->l(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_6
    invoke-virtual {v5}, Lf03;->f()J

    .line 177
    .line 178
    .line 179
    move-result-wide v12

    .line 180
    iget v14, v5, Lf03;->y:I

    .line 181
    .line 182
    iget v1, v11, Llp4;->b:I

    .line 183
    .line 184
    add-int/lit8 v15, v1, -0x1

    .line 185
    .line 186
    iput v15, v5, Lf03;->y:I

    .line 187
    .line 188
    iget v2, v11, Llp4;->b:I

    .line 189
    .line 190
    invoke-virtual {v5, v1, v2}, Lf03;->g(II)V

    .line 191
    .line 192
    .line 193
    iget v1, v5, Lf03;->y:I

    .line 194
    .line 195
    add-int/lit8 v1, v1, 0x1

    .line 196
    .line 197
    iput v1, v5, Lf03;->y:I

    .line 198
    .line 199
    invoke-virtual {v11, v0}, Llp4;->a(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v8, v7, v4}, Lmp7;->q(FZZ)J

    .line 203
    .line 204
    .line 205
    move-result-wide v1

    .line 206
    invoke-virtual {v10, v1, v2}, Lcp4;->a(J)V

    .line 207
    .line 208
    .line 209
    invoke-interface/range {p2 .. p2}, Lvz4;->c()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    invoke-static {v0, v1}, Lh49;->n(Lvo1;I)Lll4;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const/4 v9, 0x0

    .line 218
    move-object/from16 v0, p0

    .line 219
    .line 220
    move-object/from16 v2, p2

    .line 221
    .line 222
    move-wide/from16 v3, p3

    .line 223
    .line 224
    move/from16 v6, p6

    .line 225
    .line 226
    invoke-virtual/range {v0 .. v9}, Lxz4;->q1(Lll4;Lvz4;JLf03;IZFZ)V

    .line 227
    .line 228
    .line 229
    iput v15, v5, Lf03;->y:I

    .line 230
    .line 231
    invoke-virtual {v5}, Lf03;->f()J

    .line 232
    .line 233
    .line 234
    move-result-wide v0

    .line 235
    iget v2, v5, Lf03;->y:I

    .line 236
    .line 237
    add-int/lit8 v2, v2, 0x1

    .line 238
    .line 239
    iget v3, v11, Llp4;->b:I

    .line 240
    .line 241
    add-int/lit8 v3, v3, -0x1

    .line 242
    .line 243
    if-ge v2, v3, :cond_8

    .line 244
    .line 245
    invoke-static {v12, v13, v0, v1}, Lhj8;->p(JJ)I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-lez v2, :cond_8

    .line 250
    .line 251
    add-int/lit8 v2, v14, 0x1

    .line 252
    .line 253
    invoke-static {v0, v1}, Lhj8;->B(J)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    iget v1, v5, Lf03;->y:I

    .line 258
    .line 259
    if-eqz v0, :cond_7

    .line 260
    .line 261
    add-int/lit8 v1, v1, 0x2

    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 265
    .line 266
    :goto_1
    invoke-virtual {v5, v2, v1}, Lf03;->g(II)V

    .line 267
    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_8
    iget v0, v5, Lf03;->y:I

    .line 271
    .line 272
    add-int/lit8 v0, v0, 0x1

    .line 273
    .line 274
    iget v1, v11, Llp4;->b:I

    .line 275
    .line 276
    invoke-virtual {v5, v0, v1}, Lf03;->g(II)V

    .line 277
    .line 278
    .line 279
    :goto_2
    iput v14, v5, Lf03;->y:I

    .line 280
    .line 281
    return-void

    .line 282
    :cond_9
    invoke-interface/range {p2 .. p2}, Lvz4;->c()I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-static {v0, v1}, Lh49;->n(Lvo1;I)Lll4;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    const/4 v9, 0x0

    .line 291
    move-object/from16 v0, p0

    .line 292
    .line 293
    move-object/from16 v2, p2

    .line 294
    .line 295
    move-wide/from16 v3, p3

    .line 296
    .line 297
    move/from16 v6, p6

    .line 298
    .line 299
    move/from16 v7, p7

    .line 300
    .line 301
    move/from16 v8, p8

    .line 302
    .line 303
    invoke-virtual/range {v0 .. v9}, Lxz4;->q1(Lll4;Lvz4;JLf03;IZFZ)V

    .line 304
    .line 305
    .line 306
    return-void
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
.end method

.method public final x0()Ldd4;
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->P:Lxz4;

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

.method public final y1()Lly5;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lxz4;->c1()Lll4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lll4;->J:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-static {p0}, Lt49;->I(Ldy3;)Ldy3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lxz4;->b0:Lsp4;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    new-instance v1, Lsp4;

    .line 19
    .line 20
    invoke-direct {v1}, Lsp4;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lxz4;->b0:Lsp4;

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Lxz4;->b1()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {p0, v2, v3}, Lxz4;->T0(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const/16 v4, 0x20

    .line 34
    .line 35
    shr-long v4, v2, v4

    .line 36
    .line 37
    long-to-int v4, v4

    .line 38
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    neg-float v5, v5

    .line 43
    iput v5, v1, Lsp4;->b:F

    .line 44
    .line 45
    const-wide v5, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr v2, v5

    .line 51
    long-to-int v2, v2

    .line 52
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    neg-float v3, v3

    .line 57
    iput v3, v1, Lsp4;->c:F

    .line 58
    .line 59
    invoke-virtual {p0}, Leh5;->b0()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    int-to-float v3, v3

    .line 64
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    add-float/2addr v4, v3

    .line 69
    iput v4, v1, Lsp4;->d:F

    .line 70
    .line 71
    invoke-virtual {p0}, Leh5;->Z()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    int-to-float v3, v3

    .line 76
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    add-float/2addr v2, v3

    .line 81
    iput v2, v1, Lsp4;->e:F

    .line 82
    .line 83
    :goto_0
    if-eq p0, v0, :cond_3

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    const/4 v3, 0x1

    .line 87
    invoke-virtual {p0, v1, v2, v3}, Lxz4;->t1(Lsp4;ZZ)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lsp4;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_2

    .line 95
    .line 96
    :goto_1
    sget-object p0, Lly5;->e:Lly5;

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_2
    iget-object p0, p0, Lxz4;->Q:Lxz4;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    new-instance p0, Lly5;

    .line 106
    .line 107
    iget v0, v1, Lsp4;->b:F

    .line 108
    .line 109
    iget v2, v1, Lsp4;->c:F

    .line 110
    .line 111
    iget v3, v1, Lsp4;->d:F

    .line 112
    .line 113
    iget v1, v1, Lsp4;->e:F

    .line 114
    .line 115
    invoke-direct {p0, v0, v2, v3, v1}, Lly5;-><init>(FFFF)V

    .line 116
    .line 117
    .line 118
    return-object p0
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final z1(Lxz4;[F)V
    .locals 5

    .line 1
    invoke-static {p1, p0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lxz4;->Q:Lxz4;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lxz4;->z1(Lxz4;[F)V

    .line 13
    .line 14
    .line 15
    iget-wide v0, p0, Lxz4;->Z:J

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    invoke-static {v0, v1, v2, v3}, Loe3;->a(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    sget-object p1, Lxz4;->o0:[F

    .line 26
    .line 27
    invoke-static {p1}, Leh4;->d([F)V

    .line 28
    .line 29
    .line 30
    iget-wide v0, p0, Lxz4;->Z:J

    .line 31
    .line 32
    const/16 v2, 0x20

    .line 33
    .line 34
    shr-long v2, v0, v2

    .line 35
    .line 36
    long-to-int v2, v2

    .line 37
    int-to-float v2, v2

    .line 38
    neg-float v2, v2

    .line 39
    const-wide v3, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v0, v3

    .line 45
    long-to-int v0, v0

    .line 46
    int-to-float v0, v0

    .line 47
    neg-float v0, v0

    .line 48
    invoke-static {p1, v2, v0}, Leh4;->h([FFF)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2, p1}, Leh4;->g([F[F)V

    .line 52
    .line 53
    .line 54
    :cond_0
    iget-object p0, p0, Lxz4;->l0:Lo95;

    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    check-cast p0, Lfx2;

    .line 59
    .line 60
    invoke-virtual {p0}, Lfx2;->a()[F

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    invoke-static {p2, p0}, Leh4;->g([F[F)V

    .line 67
    .line 68
    .line 69
    :cond_1
    return-void
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
