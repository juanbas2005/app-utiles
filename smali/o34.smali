.class public final Lo34;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Leh6;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Leh6;

.field public final synthetic c:Luh6;


# direct methods
.method public synthetic constructor <init>(Leh6;Luh6;I)V
    .locals 0

    .line 1
    iput p3, p0, Lo34;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lo34;->c:Luh6;

    .line 4
    .line 5
    iput-object p1, p0, Lo34;->b:Leh6;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final a(F)F
    .locals 1

    .line 1
    iget v0, p0, Lo34;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lo34;->b:Leh6;

    .line 7
    .line 8
    invoke-interface {p0, p1}, Leh6;->a(F)F

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lo34;->b:Leh6;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Leh6;->a(F)F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final b(I)I
    .locals 10

    .line 1
    iget v0, p0, Lo34;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lo34;->c:Luh6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lob5;

    .line 9
    .line 10
    invoke-virtual {v1}, Lob5;->k()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    sub-int/2addr p1, p0

    .line 15
    invoke-virtual {v1}, Lob5;->p()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    mul-int/2addr p0, p1

    .line 20
    int-to-float p0, p0

    .line 21
    invoke-virtual {v1}, Lob5;->l()F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {v1}, Lob5;->p()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-float v0, v0

    .line 30
    mul-float/2addr p1, v0

    .line 31
    sub-float/2addr p0, p1

    .line 32
    const/4 p1, 0x0

    .line 33
    add-float/2addr p0, p1

    .line 34
    invoke-static {p0}, Ldh4;->C(F)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {v1}, Lfb5;->f(Lob5;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    int-to-long p0, p0

    .line 43
    add-long v4, v2, p0

    .line 44
    .line 45
    iget-wide v6, v1, Lob5;->h:J

    .line 46
    .line 47
    iget-wide v8, v1, Lob5;->g:J

    .line 48
    .line 49
    invoke-static/range {v4 .. v9}, Lz65;->q(JJJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide p0

    .line 53
    invoke-static {v1}, Lfb5;->f(Lob5;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    sub-long/2addr p0, v0

    .line 58
    long-to-int p0, p0

    .line 59
    return p0

    .line 60
    :pswitch_0
    check-cast v1, Ls34;

    .line 61
    .line 62
    invoke-virtual {v1}, Ls34;->j()Lm34;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v2, v0, Lm34;->k:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    const/4 v3, 0x0

    .line 73
    if-eqz v2, :cond_0

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_0
    invoke-virtual {v1}, Ls34;->h()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {p0}, Lo34;->e()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-gt p1, p0, :cond_3

    .line 85
    .line 86
    if-gt v2, p1, :cond_3

    .line 87
    .line 88
    iget-object p0, v0, Lm34;->k:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    move v1, v3

    .line 95
    :goto_0
    if-ge v1, v0, :cond_2

    .line 96
    .line 97
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    move-object v4, v2

    .line 102
    check-cast v4, Ln34;

    .line 103
    .line 104
    iget v4, v4, Ln34;->a:I

    .line 105
    .line 106
    if-ne v4, p1, :cond_1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    const/4 v2, 0x0

    .line 113
    :goto_1
    check-cast v2, Ln34;

    .line 114
    .line 115
    if-eqz v2, :cond_4

    .line 116
    .line 117
    iget v3, v2, Ln34;->l:I

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    invoke-static {v0}, Lkl8;->P(Lm34;)I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    invoke-virtual {v1}, Ls34;->h()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    sub-int/2addr p1, v0

    .line 129
    mul-int/2addr p1, p0

    .line 130
    invoke-virtual {v1}, Ls34;->i()I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    sub-int v3, p1, p0

    .line 135
    .line 136
    :cond_4
    :goto_2
    return v3

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lo34;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lo34;->c:Luh6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lob5;

    .line 9
    .line 10
    iget p0, p0, Lob5;->e:I

    .line 11
    .line 12
    return p0

    .line 13
    :pswitch_0
    check-cast p0, Ls34;

    .line 14
    .line 15
    invoke-virtual {p0}, Ls34;->h()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lo34;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lo34;->c:Luh6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lob5;

    .line 9
    .line 10
    iget p0, p0, Lob5;->f:I

    .line 11
    .line 12
    return p0

    .line 13
    :pswitch_0
    check-cast p0, Ls34;

    .line 14
    .line 15
    invoke-virtual {p0}, Ls34;->i()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lo34;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lo34;->c:Luh6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lob5;

    .line 9
    .line 10
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, Ldb5;->a:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {p0}, Ldt0;->G0(Ljava/util/List;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lph4;

    .line 21
    .line 22
    iget p0, p0, Lph4;->a:I

    .line 23
    .line 24
    return p0

    .line 25
    :pswitch_0
    check-cast p0, Ls34;

    .line 26
    .line 27
    invoke-virtual {p0}, Ls34;->j()Lm34;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p0, p0, Lm34;->k:Ljava/util/List;

    .line 32
    .line 33
    invoke-static {p0}, Ldt0;->H0(Ljava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ln34;

    .line 38
    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    iget p0, p0, Ln34;->a:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p0, 0x0

    .line 45
    :goto_0
    return p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final f(I)V
    .locals 3

    .line 1
    iget v0, p0, Lo34;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lo34;->c:Luh6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lob5;

    .line 9
    .line 10
    invoke-virtual {p0}, Lob5;->p()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    int-to-float v0, v0

    .line 15
    const/4 v1, 0x0

    .line 16
    cmpg-float v2, v0, v1

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    div-float/2addr v1, v0

    .line 22
    :goto_0
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, p1, v1, v0}, Lob5;->t(IFZ)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    check-cast p0, Ls34;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ls34;->m(I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
