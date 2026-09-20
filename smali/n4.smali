.class public final Ln4;
.super Lf1;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static e:Ln4;

.field public static final f:Lp56;

.field public static final g:Lp56;


# instance fields
.field public c:Lbg7;

.field public d:Lfk6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lp56;->x:Lp56;

    .line 2
    .line 3
    sput-object v0, Ln4;->f:Lp56;

    .line 4
    .line 5
    sget-object v0, Lp56;->w:Lp56;

    .line 6
    .line 7
    sput-object v0, Ln4;->g:Lp56;

    .line 8
    .line 9
    return-void
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


# virtual methods
.method public final e(I)[I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lf1;->i()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_3

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lf1;->i()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-lt p1, v0, :cond_1

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_1
    :try_start_0
    iget-object v0, p0, Ln4;->d:Lfk6;

    .line 27
    .line 28
    if-eqz v0, :cond_9

    .line 29
    .line 30
    invoke-virtual {v0}, Lfk6;->g()Lly5;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget v2, v0, Lly5;->d:F

    .line 35
    .line 36
    iget v0, v0, Lly5;->b:F

    .line 37
    .line 38
    sub-float/2addr v2, v0

    .line 39
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 40
    .line 41
    .line 42
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    if-lez p1, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    :goto_0
    iget-object v2, p0, Ln4;->c:Lbg7;

    .line 48
    .line 49
    const-string v3, "layoutResult"

    .line 50
    .line 51
    if-eqz v2, :cond_8

    .line 52
    .line 53
    iget-object v2, v2, Lbg7;->b:Lpn4;

    .line 54
    .line 55
    invoke-virtual {v2, p1}, Lpn4;->d(I)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object v4, p0, Ln4;->c:Lbg7;

    .line 60
    .line 61
    if-eqz v4, :cond_7

    .line 62
    .line 63
    iget-object v4, v4, Lbg7;->b:Lpn4;

    .line 64
    .line 65
    invoke-virtual {v4, v2}, Lpn4;->f(I)F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    int-to-float v0, v0

    .line 70
    add-float/2addr v2, v0

    .line 71
    iget-object v0, p0, Ln4;->c:Lbg7;

    .line 72
    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    iget-object v0, v0, Lbg7;->b:Lpn4;

    .line 76
    .line 77
    iget v4, v0, Lpn4;->f:I

    .line 78
    .line 79
    add-int/lit8 v4, v4, -0x1

    .line 80
    .line 81
    invoke-virtual {v0, v4}, Lpn4;->f(I)F

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    cmpg-float v0, v2, v0

    .line 86
    .line 87
    iget-object v4, p0, Ln4;->c:Lbg7;

    .line 88
    .line 89
    if-gez v0, :cond_4

    .line 90
    .line 91
    if-eqz v4, :cond_3

    .line 92
    .line 93
    iget-object v0, v4, Lbg7;->b:Lpn4;

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Lpn4;->e(F)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    invoke-static {v3}, Lsg3;->a0(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :cond_4
    if-eqz v4, :cond_5

    .line 107
    .line 108
    iget-object v0, v4, Lbg7;->b:Lpn4;

    .line 109
    .line 110
    iget v0, v0, Lpn4;->f:I

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :goto_2
    sget-object v1, Ln4;->g:Lp56;

    .line 114
    .line 115
    invoke-virtual {p0, v0, v1}, Ln4;->s(ILp56;)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    add-int/lit8 v0, v0, 0x1

    .line 120
    .line 121
    invoke-virtual {p0, p1, v0}, Lf1;->h(II)[I

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_5
    invoke-static {v3}, Lsg3;->a0(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v1

    .line 130
    :cond_6
    invoke-static {v3}, Lsg3;->a0(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v1

    .line 134
    :cond_7
    invoke-static {v3}, Lsg3;->a0(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v1

    .line 138
    :cond_8
    invoke-static {v3}, Lsg3;->a0(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v1

    .line 142
    :cond_9
    :try_start_1
    const-string p0, "node"

    .line 143
    .line 144
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 148
    :catch_0
    :goto_3
    return-object v1
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

.method public final q(I)[I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lf1;->i()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_0
    if-gtz p1, :cond_1

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_1
    :try_start_0
    iget-object v0, p0, Ln4;->d:Lfk6;

    .line 19
    .line 20
    if-eqz v0, :cond_8

    .line 21
    .line 22
    invoke-virtual {v0}, Lfk6;->g()Lly5;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget v2, v0, Lly5;->d:F

    .line 27
    .line 28
    iget v0, v0, Lly5;->b:F

    .line 29
    .line 30
    sub-float/2addr v2, v0

    .line 31
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 32
    .line 33
    .line 34
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    invoke-virtual {p0}, Lf1;->i()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-le v2, p1, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move p1, v2

    .line 47
    :goto_0
    iget-object v2, p0, Ln4;->c:Lbg7;

    .line 48
    .line 49
    const-string v3, "layoutResult"

    .line 50
    .line 51
    if-eqz v2, :cond_7

    .line 52
    .line 53
    iget-object v2, v2, Lbg7;->b:Lpn4;

    .line 54
    .line 55
    invoke-virtual {v2, p1}, Lpn4;->d(I)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object v4, p0, Ln4;->c:Lbg7;

    .line 60
    .line 61
    if-eqz v4, :cond_6

    .line 62
    .line 63
    iget-object v4, v4, Lbg7;->b:Lpn4;

    .line 64
    .line 65
    invoke-virtual {v4, v2}, Lpn4;->f(I)F

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    int-to-float v0, v0

    .line 70
    sub-float/2addr v4, v0

    .line 71
    const/4 v0, 0x0

    .line 72
    cmpl-float v0, v4, v0

    .line 73
    .line 74
    if-lez v0, :cond_4

    .line 75
    .line 76
    iget-object v0, p0, Ln4;->c:Lbg7;

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    iget-object v0, v0, Lbg7;->b:Lpn4;

    .line 81
    .line 82
    invoke-virtual {v0, v4}, Lpn4;->e(F)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-static {v3}, Lsg3;->a0(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v1

    .line 91
    :cond_4
    const/4 v0, 0x0

    .line 92
    :goto_1
    invoke-virtual {p0}, Lf1;->i()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-ne p1, v1, :cond_5

    .line 101
    .line 102
    if-ge v0, v2, :cond_5

    .line 103
    .line 104
    add-int/lit8 v0, v0, 0x1

    .line 105
    .line 106
    :cond_5
    sget-object v1, Ln4;->f:Lp56;

    .line 107
    .line 108
    invoke-virtual {p0, v0, v1}, Ln4;->s(ILp56;)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-virtual {p0, v0, p1}, Lf1;->h(II)[I

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :cond_6
    invoke-static {v3}, Lsg3;->a0(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v1

    .line 121
    :cond_7
    invoke-static {v3}, Lsg3;->a0(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_8
    :try_start_1
    const-string p0, "node"

    .line 126
    .line 127
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 131
    :catch_0
    :goto_2
    return-object v1
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

.method public final s(ILp56;)I
    .locals 4

    .line 1
    iget-object v0, p0, Ln4;->c:Lbg7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "layoutResult"

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lbg7;->g(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v3, p0, Ln4;->c:Lbg7;

    .line 13
    .line 14
    if-eqz v3, :cond_3

    .line 15
    .line 16
    invoke-virtual {v3, v0}, Lbg7;->h(I)Lp56;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object p0, p0, Ln4;->c:Lbg7;

    .line 21
    .line 22
    if-eq p2, v0, :cond_1

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lbg7;->g(I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    invoke-static {v2}, Lsg3;->a0(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :cond_1
    if-eqz p0, :cond_2

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    iget-object p0, p0, Lbg7;->b:Lpn4;

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lpn4;->c(IZ)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/lit8 p0, p0, -0x1

    .line 45
    .line 46
    return p0

    .line 47
    :cond_2
    invoke-static {v2}, Lsg3;->a0(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :cond_3
    invoke-static {v2}, Lsg3;->a0(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_4
    invoke-static {v2}, Lsg3;->a0(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1
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
.end method
