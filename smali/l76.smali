.class public final Ll76;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ltp1;


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:J

.field public E:J

.field public F:F

.field public G:F

.field public H:F

.field public I:F

.field public J:J

.field public K:Lpq6;

.field public L:Z

.field public M:I

.field public N:J

.field public O:Lzx3;

.field public P:Ltp1;

.field public Q:Ley3;

.field public R:Llt0;

.field public S:I

.field public T:Ln85;

.field public w:I

.field public x:F

.field public y:F

.field public z:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Ll76;->x:F

    .line 7
    .line 8
    iput v0, p0, Ll76;->y:F

    .line 9
    .line 10
    iput v0, p0, Ll76;->z:F

    .line 11
    .line 12
    sget-wide v0, Lgx2;->a:J

    .line 13
    .line 14
    iput-wide v0, p0, Ll76;->D:J

    .line 15
    .line 16
    iput-wide v0, p0, Ll76;->E:J

    .line 17
    .line 18
    const/high16 v0, 0x41000000    # 8.0f

    .line 19
    .line 20
    iput v0, p0, Ll76;->I:F

    .line 21
    .line 22
    sget-wide v0, Lql7;->b:J

    .line 23
    .line 24
    iput-wide v0, p0, Ll76;->J:J

    .line 25
    .line 26
    sget-object v0, Lgr8;->h:Lm23;

    .line 27
    .line 28
    iput-object v0, p0, Ll76;->K:Lpq6;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput v0, p0, Ll76;->M:I

    .line 32
    .line 33
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iput-wide v0, p0, Ll76;->N:J

    .line 39
    .line 40
    sget-object v0, Lzx3;->a:Lzx3;

    .line 41
    .line 42
    iput-object v0, p0, Ll76;->O:Lzx3;

    .line 43
    .line 44
    invoke-static {}, Lgl0;->F()Lwp1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Ll76;->P:Ltp1;

    .line 49
    .line 50
    sget-object v0, Ley3;->w:Ley3;

    .line 51
    .line 52
    iput-object v0, p0, Ll76;->Q:Ley3;

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    iput v0, p0, Ll76;->S:I

    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method


# virtual methods
.method public final A(F)V
    .locals 1

    .line 1
    iget v0, p0, Ll76;->B:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Ll76;->w:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x10

    .line 11
    .line 12
    iput v0, p0, Ll76;->w:I

    .line 13
    .line 14
    iput p1, p0, Ll76;->B:F

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
.end method

.method public final Y()F
    .locals 0

    .line 1
    iget-object p0, p0, Ll76;->P:Ltp1;

    .line 2
    .line 3
    invoke-interface {p0}, Ltp1;->Y()F

    .line 4
    .line 5
    .line 6
    move-result p0

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

.method public final a()V
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ll76;->l(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ll76;->m(F)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ll76;->c(F)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Ll76;->y(F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ll76;->A(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ll76;->n(F)V

    .line 20
    .line 21
    .line 22
    sget-wide v1, Lgx2;->a:J

    .line 23
    .line 24
    invoke-virtual {p0, v1, v2}, Ll76;->d(J)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1, v2}, Ll76;->v(J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ll76;->h(F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ll76;->j(F)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ll76;->k(F)V

    .line 37
    .line 38
    .line 39
    iget v0, p0, Ll76;->I:F

    .line 40
    .line 41
    const/high16 v1, 0x41000000    # 8.0f

    .line 42
    .line 43
    cmpg-float v0, v0, v1

    .line 44
    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget v0, p0, Ll76;->w:I

    .line 49
    .line 50
    or-int/lit16 v0, v0, 0x800

    .line 51
    .line 52
    iput v0, p0, Ll76;->w:I

    .line 53
    .line 54
    iput v1, p0, Ll76;->I:F

    .line 55
    .line 56
    :goto_0
    sget-wide v0, Lql7;->b:J

    .line 57
    .line 58
    invoke-virtual {p0, v0, v1}, Ll76;->w(J)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lgr8;->h:Lm23;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ll76;->r(Lpq6;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    invoke-virtual {p0, v0}, Ll76;->f(Z)V

    .line 68
    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-virtual {p0, v1}, Ll76;->g(Llt0;)V

    .line 72
    .line 73
    .line 74
    iget v2, p0, Ll76;->S:I

    .line 75
    .line 76
    const/4 v3, 0x3

    .line 77
    if-ne v2, v3, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    iget v2, p0, Ll76;->w:I

    .line 81
    .line 82
    const/high16 v4, 0x80000

    .line 83
    .line 84
    or-int/2addr v2, v4

    .line 85
    iput v2, p0, Ll76;->w:I

    .line 86
    .line 87
    iput v3, p0, Ll76;->S:I

    .line 88
    .line 89
    :goto_1
    iget v2, p0, Ll76;->M:I

    .line 90
    .line 91
    if-nez v2, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    iget v2, p0, Ll76;->w:I

    .line 95
    .line 96
    const v3, 0x8000

    .line 97
    .line 98
    .line 99
    or-int/2addr v2, v3

    .line 100
    iput v2, p0, Ll76;->w:I

    .line 101
    .line 102
    iput v0, p0, Ll76;->M:I

    .line 103
    .line 104
    :goto_2
    sget-object v2, Lzx3;->a:Lzx3;

    .line 105
    .line 106
    iget-object v3, p0, Ll76;->O:Lzx3;

    .line 107
    .line 108
    invoke-static {v3, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-nez v3, :cond_3

    .line 113
    .line 114
    iget v3, p0, Ll76;->w:I

    .line 115
    .line 116
    const/high16 v4, 0x100000

    .line 117
    .line 118
    or-int/2addr v3, v4

    .line 119
    iput v3, p0, Ll76;->w:I

    .line 120
    .line 121
    iput-object v2, p0, Ll76;->O:Lzx3;

    .line 122
    .line 123
    :cond_3
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    iput-wide v2, p0, Ll76;->N:J

    .line 129
    .line 130
    iput-object v1, p0, Ll76;->T:Ln85;

    .line 131
    .line 132
    iput v0, p0, Ll76;->w:I

    .line 133
    .line 134
    return-void
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

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Ll76;->P:Ltp1;

    .line 2
    .line 3
    invoke-interface {p0}, Ltp1;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

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

.method public final c(F)V
    .locals 1

    .line 1
    iget v0, p0, Ll76;->z:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Ll76;->w:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    iput v0, p0, Ll76;->w:I

    .line 13
    .line 14
    iput p1, p0, Ll76;->z:F

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
.end method

.method public final d(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Ll76;->D:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Ljt0;->c(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Ll76;->w:I

    .line 10
    .line 11
    or-int/lit8 v0, v0, 0x40

    .line 12
    .line 13
    iput v0, p0, Ll76;->w:I

    .line 14
    .line 15
    iput-wide p1, p0, Ll76;->D:J

    .line 16
    .line 17
    :cond_0
    return-void
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

.method public final f(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll76;->L:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ll76;->w:I

    .line 6
    .line 7
    or-int/lit16 v0, v0, 0x4000

    .line 8
    .line 9
    iput v0, p0, Ll76;->w:I

    .line 10
    .line 11
    iput-boolean p1, p0, Ll76;->L:Z

    .line 12
    .line 13
    :cond_0
    return-void
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

.method public final g(Llt0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll76;->R:Llt0;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Ll76;->w:I

    .line 10
    .line 11
    const/high16 v1, 0x40000

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    iput v0, p0, Ll76;->w:I

    .line 15
    .line 16
    iput-object p1, p0, Ll76;->R:Llt0;

    .line 17
    .line 18
    :cond_0
    return-void
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

.method public final h(F)V
    .locals 1

    .line 1
    iget v0, p0, Ll76;->F:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Ll76;->w:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x100

    .line 11
    .line 12
    iput v0, p0, Ll76;->w:I

    .line 13
    .line 14
    iput p1, p0, Ll76;->F:F

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
.end method

.method public final j(F)V
    .locals 1

    .line 1
    iget v0, p0, Ll76;->G:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Ll76;->w:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x200

    .line 11
    .line 12
    iput v0, p0, Ll76;->w:I

    .line 13
    .line 14
    iput p1, p0, Ll76;->G:F

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
.end method

.method public final k(F)V
    .locals 1

    .line 1
    iget v0, p0, Ll76;->H:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Ll76;->w:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x400

    .line 11
    .line 12
    iput v0, p0, Ll76;->w:I

    .line 13
    .line 14
    iput p1, p0, Ll76;->H:F

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
.end method

.method public final l(F)V
    .locals 1

    .line 1
    iget v0, p0, Ll76;->x:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Ll76;->w:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Ll76;->w:I

    .line 13
    .line 14
    iput p1, p0, Ll76;->x:F

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
.end method

.method public final m(F)V
    .locals 1

    .line 1
    iget v0, p0, Ll76;->y:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Ll76;->w:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    iput v0, p0, Ll76;->w:I

    .line 13
    .line 14
    iput p1, p0, Ll76;->y:F

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
.end method

.method public final n(F)V
    .locals 1

    .line 1
    iget v0, p0, Ll76;->C:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Ll76;->w:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x20

    .line 11
    .line 12
    iput v0, p0, Ll76;->w:I

    .line 13
    .line 14
    iput p1, p0, Ll76;->C:F

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
.end method

.method public final r(Lpq6;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll76;->K:Lpq6;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Ll76;->w:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x2000

    .line 12
    .line 13
    iput v0, p0, Ll76;->w:I

    .line 14
    .line 15
    iput-object p1, p0, Ll76;->K:Lpq6;

    .line 16
    .line 17
    :cond_0
    return-void
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

.method public final v(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Ll76;->E:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Ljt0;->c(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Ll76;->w:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    iput v0, p0, Ll76;->w:I

    .line 14
    .line 15
    iput-wide p1, p0, Ll76;->E:J

    .line 16
    .line 17
    :cond_0
    return-void
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

.method public final w(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Ll76;->J:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lql7;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Ll76;->w:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x1000

    .line 12
    .line 13
    iput v0, p0, Ll76;->w:I

    .line 14
    .line 15
    iput-wide p1, p0, Ll76;->J:J

    .line 16
    .line 17
    :cond_0
    return-void
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

.method public final y(F)V
    .locals 1

    .line 1
    iget v0, p0, Ll76;->A:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Ll76;->w:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    iput v0, p0, Ll76;->w:I

    .line 13
    .line 14
    iput p1, p0, Ll76;->A:F

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
.end method
