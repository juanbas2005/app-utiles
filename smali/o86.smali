.class public final Lo86;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Loa3;


# instance fields
.field public final a:Z

.field public final b:F

.field public final c:J

.field public final d:Lpq6;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z


# direct methods
.method public constructor <init>(ZFJLpq6;Z)V
    .locals 2

    .line 1
    if-nez p5, :cond_3

    .line 2
    .line 3
    new-instance p5, Llx1;

    .line 4
    .line 5
    invoke-direct {p5, p2}, Llx1;-><init>(F)V

    .line 6
    .line 7
    .line 8
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 9
    .line 10
    invoke-static {p2, v0}, Llx1;->b(FF)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p5, v1

    .line 19
    :goto_0
    if-eqz p5, :cond_1

    .line 20
    .line 21
    iget p5, p5, Llx1;->w:F

    .line 22
    .line 23
    invoke-static {p5}, Lq96;->a(F)Lo96;

    .line 24
    .line 25
    .line 26
    move-result-object p5

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object p5, v1

    .line 29
    :goto_1
    if-eqz p5, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    sget-object p5, Lgr8;->h:Lm23;

    .line 33
    .line 34
    :cond_3
    :goto_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-boolean p1, p0, Lo86;->a:Z

    .line 38
    .line 39
    iput p2, p0, Lo86;->b:F

    .line 40
    .line 41
    iput-wide p3, p0, Lo86;->c:J

    .line 42
    .line 43
    iput-object p5, p0, Lo86;->d:Lpq6;

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    iput-boolean p1, p0, Lo86;->e:Z

    .line 47
    .line 48
    iput-boolean p6, p0, Lo86;->f:Z

    .line 49
    .line 50
    iput-boolean p1, p0, Lo86;->g:Z

    .line 51
    .line 52
    iput-boolean p1, p0, Lo86;->h:Z

    .line 53
    .line 54
    return-void
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


# virtual methods
.method public final a(Lef3;)Lvo1;
    .locals 10

    .line 1
    new-instance v4, Luy5;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {v4, v0, p0}, Luy5;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lkp1;

    .line 8
    .line 9
    iget-boolean v8, p0, Lo86;->g:Z

    .line 10
    .line 11
    iget-boolean v9, p0, Lo86;->h:Z

    .line 12
    .line 13
    iget-boolean v2, p0, Lo86;->a:Z

    .line 14
    .line 15
    iget v3, p0, Lo86;->b:F

    .line 16
    .line 17
    iget-object v5, p0, Lo86;->d:Lpq6;

    .line 18
    .line 19
    iget-boolean v6, p0, Lo86;->e:Z

    .line 20
    .line 21
    iget-boolean v7, p0, Lo86;->f:Z

    .line 22
    .line 23
    move-object v1, p1

    .line 24
    invoke-direct/range {v0 .. v9}, Lkp1;-><init>(Lef3;ZFLot0;Lpq6;ZZZZ)V

    .line 25
    .line 26
    .line 27
    return-object v0
    .line 28
    .line 29
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lo86;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lo86;

    .line 10
    .line 11
    iget-boolean v0, p1, Lo86;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p0, Lo86;->a:Z

    .line 14
    .line 15
    if-eq v1, v0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, Lo86;->b:F

    .line 19
    .line 20
    iget v1, p1, Lo86;->b:F

    .line 21
    .line 22
    invoke-static {v0, v1}, Llx1;->b(FF)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-wide v0, p0, Lo86;->c:J

    .line 30
    .line 31
    iget-wide v2, p1, Lo86;->c:J

    .line 32
    .line 33
    invoke-static {v0, v1, v2, v3}, Ljt0;->c(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-object v0, p0, Lo86;->d:Lpq6;

    .line 41
    .line 42
    iget-object v1, p1, Lo86;->d:Lpq6;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-boolean v0, p0, Lo86;->e:Z

    .line 52
    .line 53
    iget-boolean v1, p1, Lo86;->e:Z

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-boolean v0, p0, Lo86;->f:Z

    .line 59
    .line 60
    iget-boolean v1, p1, Lo86;->f:Z

    .line 61
    .line 62
    if-eq v0, v1, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-boolean v0, p0, Lo86;->g:Z

    .line 66
    .line 67
    iget-boolean v1, p1, Lo86;->g:Z

    .line 68
    .line 69
    if-eq v0, v1, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-boolean p0, p0, Lo86;->h:Z

    .line 73
    .line 74
    iget-boolean p1, p1, Lo86;->h:Z

    .line 75
    .line 76
    if-eq p0, p1, :cond_9

    .line 77
    .line 78
    :goto_0
    const/4 p0, 0x0

    .line 79
    return p0

    .line 80
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 81
    return p0
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
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lo86;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget v2, p0, Lo86;->b:F

    .line 11
    .line 12
    const/16 v3, 0x3c1

    .line 13
    .line 14
    invoke-static {v2, v0, v3}, Lf21;->d(FII)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    sget v2, Ljt0;->h:I

    .line 19
    .line 20
    iget-wide v2, p0, Lo86;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lpb4;->b(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, Lo86;->d:Lpq6;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget-boolean v0, p0, Lo86;->e:Z

    .line 35
    .line 36
    invoke-static {v2, v1, v0}, Lhl6;->i(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lo86;->f:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Lhl6;->i(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lo86;->g:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Lhl6;->i(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean p0, p0, Lo86;->h:Z

    .line 53
    .line 54
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    add-int/2addr p0, v0

    .line 59
    return p0
    .line 60
    .line 61
    .line 62
    .line 63
.end method
