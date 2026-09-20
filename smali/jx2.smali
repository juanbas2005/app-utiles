.class public final Ljx2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lex2;


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:Z

.field public E:I

.field public F:I

.field public G:I

.field public final b:Luk0;

.field public final c:Ltk0;

.field public final d:Landroid/graphics/RenderNode;

.field public e:J

.field public f:Landroid/graphics/Paint;

.field public g:Landroid/graphics/Matrix;

.field public h:Z

.field public i:F

.field public j:I

.field public k:Llt0;

.field public l:J

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:J

.field public s:J

.field public t:F

.field public u:F

.field public v:F

.field public w:F

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    new-instance v0, Luk0;

    .line 2
    .line 3
    invoke-direct {v0}, Luk0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ltk0;

    .line 7
    .line 8
    invoke-direct {v1}, Ltk0;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ljx2;->b:Luk0;

    .line 15
    .line 16
    iput-object v1, p0, Ljx2;->c:Ltk0;

    .line 17
    .line 18
    invoke-static {}, Lvw2;->e()Landroid/graphics/RenderNode;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 23
    .line 24
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    iput-wide v1, p0, Ljx2;->e:J

    .line 27
    .line 28
    invoke-static {v0}, Lvw2;->y(Landroid/graphics/RenderNode;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {p0, v0, v1}, Ljx2;->P(Landroid/graphics/RenderNode;I)V

    .line 33
    .line 34
    .line 35
    const/high16 v0, 0x3f800000    # 1.0f

    .line 36
    .line 37
    iput v0, p0, Ljx2;->i:F

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    iput v2, p0, Ljx2;->j:I

    .line 41
    .line 42
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    iput-wide v2, p0, Ljx2;->l:J

    .line 48
    .line 49
    iput v0, p0, Ljx2;->m:F

    .line 50
    .line 51
    iput v0, p0, Ljx2;->n:F

    .line 52
    .line 53
    sget-wide v2, Ljt0;->b:J

    .line 54
    .line 55
    iput-wide v2, p0, Ljx2;->r:J

    .line 56
    .line 57
    iput-wide v2, p0, Ljx2;->s:J

    .line 58
    .line 59
    const/high16 v0, 0x41000000    # 8.0f

    .line 60
    .line 61
    iput v0, p0, Ljx2;->w:F

    .line 62
    .line 63
    iput v1, p0, Ljx2;->G:I

    .line 64
    .line 65
    return-void
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
.end method


# virtual methods
.method public final A()F
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->w:F

    .line 2
    .line 3
    return p0
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

.method public final B()F
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->o:F

    .line 2
    .line 3
    return p0
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

.method public final C(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ljx2;->x:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Ljx2;->O()V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method public final D()F
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->t:F

    .line 2
    .line 3
    return p0
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

.method public final E(Ltp1;Ley3;Lcx2;Lpb;)V
    .locals 10

    .line 1
    iget-object v0, p0, Ljx2;->c:Ltk0;

    .line 2
    .line 3
    iget-object v1, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {v1}, Lvw2;->d(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Ljx2;->y:I

    .line 10
    .line 11
    int-to-float v2, v2

    .line 12
    iget v3, p0, Ljx2;->z:I

    .line 13
    .line 14
    int-to-float v3, v3

    .line 15
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    int-to-long v4, v2

    .line 20
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    int-to-long v2, v2

    .line 25
    const/16 v6, 0x20

    .line 26
    .line 27
    shl-long/2addr v4, v6

    .line 28
    const-wide v7, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v2, v7

    .line 34
    or-long/2addr v2, v4

    .line 35
    :try_start_0
    iget-object v4, p0, Ljx2;->b:Luk0;

    .line 36
    .line 37
    iget-object v5, v4, Luk0;->a:Lod;

    .line 38
    .line 39
    iget-object v9, v5, Lod;->a:Landroid/graphics/Canvas;

    .line 40
    .line 41
    iput-object v1, v5, Lod;->a:Landroid/graphics/Canvas;

    .line 42
    .line 43
    iget-object v1, v0, Ltk0;->x:Lwr0;

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Lwr0;->c0(Ltp1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p2}, Lwr0;->d0(Ley3;)V

    .line 49
    .line 50
    .line 51
    iput-object p3, v1, Lwr0;->y:Ljava/lang/Object;

    .line 52
    .line 53
    iget-wide p1, p0, Ljx2;->e:J

    .line 54
    .line 55
    invoke-virtual {v1, p1, p2}, Lwr0;->e0(J)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v5}, Lwr0;->b0(Lqk0;)V

    .line 59
    .line 60
    .line 61
    iget p1, p0, Ljx2;->y:I

    .line 62
    .line 63
    int-to-float p1, p1

    .line 64
    const/4 p2, 0x0

    .line 65
    cmpl-float p1, p1, p2

    .line 66
    .line 67
    if-gtz p1, :cond_1

    .line 68
    .line 69
    iget p1, p0, Ljx2;->z:I

    .line 70
    .line 71
    int-to-float p1, p1

    .line 72
    cmpl-float p1, p1, p2

    .line 73
    .line 74
    if-lez p1, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {p4, v0}, Lpb;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    goto :goto_2

    .line 83
    :cond_1
    :goto_0
    shr-long p1, v2, v6

    .line 84
    .line 85
    long-to-int p1, p1

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    and-long v1, v2, v7

    .line 91
    .line 92
    long-to-int p3, v1

    .line 93
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {v5, p2, v1}, Lod;->o(FF)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p4, v0}, Lpb;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    neg-float p1, p1

    .line 108
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    neg-float p2, p2

    .line 113
    invoke-virtual {v5, p1, p2}, Lod;->o(FF)V

    .line 114
    .line 115
    .line 116
    :goto_1
    iget-object p1, v4, Luk0;->a:Lod;

    .line 117
    .line 118
    iput-object v9, p1, Lod;->a:Landroid/graphics/Canvas;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 121
    .line 122
    invoke-static {p0}, Lvw2;->A(Landroid/graphics/RenderNode;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :goto_2
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 127
    .line 128
    invoke-static {p0}, Lvw2;->A(Landroid/graphics/RenderNode;)V

    .line 129
    .line 130
    .line 131
    throw p1
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
.end method

.method public final F(I)V
    .locals 0

    .line 1
    iput p1, p0, Ljx2;->G:I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljx2;->Q()V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method public final G(F)V
    .locals 0

    .line 1
    iput p1, p0, Ljx2;->o:F

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lix2;->m(Landroid/graphics/RenderNode;F)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final H(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ljx2;->s:J

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p1, p2}, Luq3;->M(J)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p0, p1}, Lvw2;->j(Landroid/graphics/RenderNode;I)V

    .line 10
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final I()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Ljx2;->g:Landroid/graphics/Matrix;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ljx2;->g:Landroid/graphics/Matrix;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 13
    .line 14
    invoke-static {p0, v0}, Lvw2;->l(Landroid/graphics/RenderNode;Landroid/graphics/Matrix;)V

    .line 15
    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final J(F)V
    .locals 0

    .line 1
    iput p1, p0, Ljx2;->w:F

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lvw2;->C(Landroid/graphics/RenderNode;F)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final K()F
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->q:F

    .line 2
    .line 3
    return p0
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

.method public final L()F
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->n:F

    .line 2
    .line 3
    return p0
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

.method public final M(F)V
    .locals 0

    .line 1
    iput p1, p0, Ljx2;->t:F

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lvw2;->B(Landroid/graphics/RenderNode;F)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final N()I
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->j:I

    .line 2
    .line 3
    return p0
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

.method public final O()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ljx2;->x:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v3, p0, Ljx2;->h:Z

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    move v3, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, p0, Ljx2;->h:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move v1, v2

    .line 21
    :cond_1
    iget-boolean v0, p0, Ljx2;->C:Z

    .line 22
    .line 23
    if-eq v3, v0, :cond_2

    .line 24
    .line 25
    iput-boolean v3, p0, Ljx2;->C:Z

    .line 26
    .line 27
    iget-object v0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 28
    .line 29
    invoke-static {v0, v3}, Lvw2;->o(Landroid/graphics/RenderNode;Z)V

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-boolean v0, p0, Ljx2;->D:Z

    .line 33
    .line 34
    if-eq v1, v0, :cond_3

    .line 35
    .line 36
    iput-boolean v1, p0, Ljx2;->D:Z

    .line 37
    .line 38
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 39
    .line 40
    invoke-static {p0, v1}, Lvw2;->v(Landroid/graphics/RenderNode;Z)V

    .line 41
    .line 42
    .line 43
    :cond_3
    return-void
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

.method public final P(Landroid/graphics/RenderNode;I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ljx2;->f:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    invoke-static {p1, p0}, Lvw2;->n(Landroid/graphics/RenderNode;Landroid/graphics/Paint;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lvw2;->r(Landroid/graphics/RenderNode;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x2

    .line 14
    if-ne p2, v0, :cond_1

    .line 15
    .line 16
    invoke-static {p1, p0}, Lvw2;->u(Landroid/graphics/RenderNode;Landroid/graphics/Paint;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lvw2;->w(Landroid/graphics/RenderNode;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-static {p1, p0}, Lvw2;->u(Landroid/graphics/RenderNode;Landroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lvw2;->r(Landroid/graphics/RenderNode;)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public final Q()V
    .locals 4

    .line 1
    iget v0, p0, Ljx2;->G:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget v2, p0, Ljx2;->j:I

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    if-ne v2, v3, :cond_2

    .line 11
    .line 12
    iget-object v2, p0, Ljx2;->k:Llt0;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v1, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 18
    .line 19
    invoke-virtual {p0, v1, v0}, Ljx2;->P(Landroid/graphics/RenderNode;I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    :goto_0
    iget-object v0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, Ljx2;->P(Landroid/graphics/RenderNode;I)V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public final R()V
    .locals 7

    .line 1
    iget-wide v0, p0, Ljx2;->l:J

    .line 2
    .line 3
    const-wide v2, 0x7fffffff7fffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long/2addr v2, v0

    .line 9
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    iget-object v3, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 17
    .line 18
    const-wide v4, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const/16 v6, 0x20

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    iget-wide v0, p0, Ljx2;->e:J

    .line 28
    .line 29
    shr-long/2addr v0, v6

    .line 30
    long-to-int v0, v0

    .line 31
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/high16 v1, 0x40000000    # 2.0f

    .line 36
    .line 37
    div-float/2addr v0, v1

    .line 38
    iget v2, p0, Ljx2;->y:I

    .line 39
    .line 40
    int-to-float v2, v2

    .line 41
    add-float/2addr v0, v2

    .line 42
    invoke-static {v3, v0}, Lix2;->w(Landroid/graphics/RenderNode;F)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 46
    .line 47
    iget-wide v2, p0, Ljx2;->e:J

    .line 48
    .line 49
    and-long/2addr v2, v4

    .line 50
    long-to-int v2, v2

    .line 51
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    div-float/2addr v2, v1

    .line 56
    iget p0, p0, Ljx2;->z:I

    .line 57
    .line 58
    int-to-float p0, p0

    .line 59
    add-float/2addr v2, p0

    .line 60
    invoke-static {v0, v2}, Lix2;->A(Landroid/graphics/RenderNode;F)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    shr-long/2addr v0, v6

    .line 65
    long-to-int v0, v0

    .line 66
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget v1, p0, Ljx2;->y:I

    .line 71
    .line 72
    int-to-float v1, v1

    .line 73
    add-float/2addr v0, v1

    .line 74
    invoke-static {v3, v0}, Lix2;->w(Landroid/graphics/RenderNode;F)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 78
    .line 79
    iget-wide v1, p0, Ljx2;->l:J

    .line 80
    .line 81
    and-long/2addr v1, v4

    .line 82
    long-to-int v1, v1

    .line 83
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iget p0, p0, Ljx2;->z:I

    .line 88
    .line 89
    int-to-float p0, p0

    .line 90
    add-float/2addr v1, p0

    .line 91
    invoke-static {v0, v1}, Lix2;->A(Landroid/graphics/RenderNode;F)V

    .line 92
    .line 93
    .line 94
    return-void
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

.method public final S()V
    .locals 9

    .line 1
    iget-object v0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    iget v1, p0, Ljx2;->E:I

    .line 4
    .line 5
    iget v2, p0, Ljx2;->y:I

    .line 6
    .line 7
    sub-int v2, v1, v2

    .line 8
    .line 9
    iget v3, p0, Ljx2;->F:I

    .line 10
    .line 11
    iget v4, p0, Ljx2;->z:I

    .line 12
    .line 13
    sub-int/2addr v3, v4

    .line 14
    iget-wide v4, p0, Ljx2;->e:J

    .line 15
    .line 16
    const/16 v6, 0x20

    .line 17
    .line 18
    shr-long/2addr v4, v6

    .line 19
    long-to-int v4, v4

    .line 20
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    float-to-int v4, v4

    .line 25
    add-int/2addr v1, v4

    .line 26
    iget v4, p0, Ljx2;->A:I

    .line 27
    .line 28
    add-int/2addr v1, v4

    .line 29
    iget v4, p0, Ljx2;->F:I

    .line 30
    .line 31
    iget-wide v5, p0, Ljx2;->e:J

    .line 32
    .line 33
    const-wide v7, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v5, v7

    .line 39
    long-to-int v5, v5

    .line 40
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    float-to-int v5, v5

    .line 45
    add-int/2addr v4, v5

    .line 46
    iget p0, p0, Ljx2;->B:I

    .line 47
    .line 48
    add-int/2addr v4, p0

    .line 49
    invoke-static {v0, v2, v3, v1, v4}, Lvw2;->k(Landroid/graphics/RenderNode;IIII)V

    .line 50
    .line 51
    .line 52
    return-void
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

.method public final a()F
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->i:F

    .line 2
    .line 3
    return p0
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

.method public final b(F)V
    .locals 0

    .line 1
    iput p1, p0, Ljx2;->u:F

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lix2;->C(Landroid/graphics/RenderNode;F)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final c()F
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->m:F

    .line 2
    .line 3
    return p0
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

.method public final d(F)V
    .locals 0

    .line 1
    iput p1, p0, Ljx2;->q:F

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lvw2;->D(Landroid/graphics/RenderNode;F)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final e(F)V
    .locals 0

    .line 1
    iput p1, p0, Ljx2;->v:F

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lix2;->D(Landroid/graphics/RenderNode;F)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final f(F)V
    .locals 0

    .line 1
    iput p1, p0, Ljx2;->p:F

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lvw2;->s(Landroid/graphics/RenderNode;F)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final g(Landroid/graphics/Outline;J)V
    .locals 0

    .line 1
    iget-object p2, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    invoke-static {p2, p1}, Lvw2;->m(Landroid/graphics/RenderNode;Landroid/graphics/Outline;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    iput-boolean p1, p0, Ljx2;->h:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Ljx2;->O()V

    .line 14
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
.end method

.method public final h(I)V
    .locals 1

    .line 1
    iput p1, p0, Ljx2;->j:I

    .line 2
    .line 3
    iget-object v0, p0, Ljx2;->f:Landroid/graphics/Paint;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ljx2;->f:Landroid/graphics/Paint;

    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Lbb0;->A0(I)Landroid/graphics/BlendMode;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, Lvw2;->g(Landroid/graphics/Paint;Landroid/graphics/BlendMode;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljx2;->Q()V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final i()V
    .locals 0

    .line 1
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    invoke-static {p0}, Lvw2;->h(Landroid/graphics/RenderNode;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final j(Lqk0;)V
    .locals 1

    .line 1
    sget-object v0, Lpd;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    check-cast p1, Lod;

    .line 4
    .line 5
    iget-object p1, p1, Lod;->a:Landroid/graphics/Canvas;

    .line 6
    .line 7
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 8
    .line 9
    invoke-static {p1, p0}, Lvw2;->f(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    .line 10
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final k()I
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->G:I

    .line 2
    .line 3
    return p0
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

.method public final l()Llt0;
    .locals 0

    .line 1
    iget-object p0, p0, Ljx2;->k:Llt0;

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

.method public final m(F)V
    .locals 0

    .line 1
    iput p1, p0, Ljx2;->n:F

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lvw2;->i(Landroid/graphics/RenderNode;F)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final n(IIJ)V
    .locals 3

    .line 1
    iput p1, p0, Ljx2;->E:I

    .line 2
    .line 3
    iput p2, p0, Ljx2;->F:I

    .line 4
    .line 5
    iget-wide p1, p0, Ljx2;->e:J

    .line 6
    .line 7
    invoke-static {p3, p4}, Lpv8;->O(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {p1, p2, v0, v1}, Lwu6;->a(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p3, p4}, Lpv8;->O(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, Ljx2;->e:J

    .line 20
    .line 21
    invoke-virtual {p0}, Ljx2;->S()V

    .line 22
    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    iget-wide p1, p0, Ljx2;->l:J

    .line 27
    .line 28
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2, v0, v1}, Ll35;->b(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    iget-object p1, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 40
    .line 41
    const/16 p2, 0x20

    .line 42
    .line 43
    shr-long v0, p3, p2

    .line 44
    .line 45
    long-to-int p2, v0

    .line 46
    int-to-float p2, p2

    .line 47
    const/high16 v0, 0x40000000    # 2.0f

    .line 48
    .line 49
    div-float/2addr p2, v0

    .line 50
    iget v1, p0, Ljx2;->y:I

    .line 51
    .line 52
    int-to-float v1, v1

    .line 53
    add-float/2addr p2, v1

    .line 54
    invoke-static {p1, p2}, Lix2;->w(Landroid/graphics/RenderNode;F)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 58
    .line 59
    const-wide v1, 0xffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long p2, p3, v1

    .line 65
    .line 66
    long-to-int p2, p2

    .line 67
    int-to-float p2, p2

    .line 68
    div-float/2addr p2, v0

    .line 69
    iget p0, p0, Ljx2;->z:I

    .line 70
    .line 71
    int-to-float p0, p0

    .line 72
    add-float/2addr p2, p0

    .line 73
    invoke-static {p1, p2}, Lix2;->A(Landroid/graphics/RenderNode;F)V

    .line 74
    .line 75
    .line 76
    :cond_0
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
.end method

.method public final o()F
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->u:F

    .line 2
    .line 3
    return p0
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

.method public final p()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    invoke-static {p0}, Lvw2;->p(Landroid/graphics/RenderNode;)Z

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

.method public final q()F
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->v:F

    .line 2
    .line 3
    return p0
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

.method public final r(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ljx2;->l:J

    .line 2
    .line 3
    invoke-virtual {p0}, Ljx2;->R()V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method public final s()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ljx2;->r:J

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

.method public final t(F)V
    .locals 0

    .line 1
    iput p1, p0, Ljx2;->i:F

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lvw2;->x(Landroid/graphics/RenderNode;F)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final u(Llt0;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ljx2;->k:Llt0;

    .line 2
    .line 3
    iget-object v0, p0, Ljx2;->f:Landroid/graphics/Paint;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ljx2;->f:Landroid/graphics/Paint;

    .line 13
    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p1, Llt0;->a:Landroid/graphics/ColorFilter;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljx2;->Q()V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public final v(IIII)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-ltz p2, :cond_0

    .line 6
    .line 7
    if-ltz p3, :cond_0

    .line 8
    .line 9
    if-ltz p4, :cond_0

    .line 10
    .line 11
    move v2, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v0

    .line 14
    :goto_0
    if-nez v2, :cond_1

    .line 15
    .line 16
    const-string v2, ", Top: "

    .line 17
    .line 18
    const-string v3, ", Right: "

    .line 19
    .line 20
    const-string v4, "Outsets cannot be negative! Left: "

    .line 21
    .line 22
    invoke-static {v4, p1, v2, p2, v3}, Lpb4;->p(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v3, ", Bottom: "

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Lxb3;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget v2, p0, Ljx2;->y:I

    .line 45
    .line 46
    if-ne p1, v2, :cond_2

    .line 47
    .line 48
    iget v3, p0, Ljx2;->z:I

    .line 49
    .line 50
    if-ne p2, v3, :cond_2

    .line 51
    .line 52
    iget v3, p0, Ljx2;->A:I

    .line 53
    .line 54
    if-ne p3, v3, :cond_2

    .line 55
    .line 56
    iget v3, p0, Ljx2;->B:I

    .line 57
    .line 58
    if-eq p4, v3, :cond_5

    .line 59
    .line 60
    :cond_2
    if-ne p1, v2, :cond_3

    .line 61
    .line 62
    iget v2, p0, Ljx2;->z:I

    .line 63
    .line 64
    if-eq p2, v2, :cond_4

    .line 65
    .line 66
    :cond_3
    move v0, v1

    .line 67
    :cond_4
    iput p1, p0, Ljx2;->y:I

    .line 68
    .line 69
    iput p2, p0, Ljx2;->z:I

    .line 70
    .line 71
    iput p3, p0, Ljx2;->A:I

    .line 72
    .line 73
    iput p4, p0, Ljx2;->B:I

    .line 74
    .line 75
    invoke-virtual {p0}, Ljx2;->S()V

    .line 76
    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-virtual {p0}, Ljx2;->R()V

    .line 81
    .line 82
    .line 83
    :cond_5
    return-void
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
.end method

.method public final w()F
    .locals 0

    .line 1
    iget p0, p0, Ljx2;->p:F

    .line 2
    .line 3
    return p0
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

.method public final x()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ljx2;->s:J

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

.method public final y(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ljx2;->r:J

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p1, p2}, Luq3;->M(J)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p0, p1}, Lvw2;->t(Landroid/graphics/RenderNode;I)V

    .line 10
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final z(F)V
    .locals 0

    .line 1
    iput p1, p0, Ljx2;->m:F

    .line 2
    .line 3
    iget-object p0, p0, Ljx2;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lvw2;->z(Landroid/graphics/RenderNode;F)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
