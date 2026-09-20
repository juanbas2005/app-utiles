.class public abstract Lxr7;
.super Lm55;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final d:[I

.field public static final e:[I

.field public static final f:[[I

.field public static final g:[[I


# instance fields
.field public final a:Ljava/lang/StringBuilder;

.field public final b:Lqc3;

.field public final c:Lh12;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    filled-new-array {v0, v0, v0}, [I

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sput-object v1, Lxr7;->d:[I

    .line 7
    .line 8
    filled-new-array {v0, v0, v0, v0, v0}, [I

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sput-object v1, Lxr7;->e:[I

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    const/4 v2, 0x2

    .line 16
    filled-new-array {v1, v2, v0, v0}, [I

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    filled-new-array {v2, v2, v2, v0}, [I

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    filled-new-array {v2, v0, v2, v2}, [I

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const/4 v6, 0x4

    .line 29
    move v7, v6

    .line 30
    filled-new-array {v0, v7, v0, v0}, [I

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    move v8, v7

    .line 35
    filled-new-array {v0, v0, v1, v2}, [I

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    move v9, v8

    .line 40
    filled-new-array {v0, v2, v1, v0}, [I

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    filled-new-array {v0, v0, v0, v9}, [I

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    filled-new-array {v0, v1, v0, v2}, [I

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    filled-new-array {v0, v2, v0, v1}, [I

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    filled-new-array {v1, v0, v0, v2}, [I

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    filled-new-array/range {v3 .. v12}, [[I

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sput-object v1, Lxr7;->f:[[I

    .line 65
    .line 66
    const/16 v2, 0x14

    .line 67
    .line 68
    new-array v3, v2, [[I

    .line 69
    .line 70
    sput-object v3, Lxr7;->g:[[I

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    const/16 v5, 0xa

    .line 74
    .line 75
    invoke-static {v1, v4, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    .line 77
    .line 78
    :goto_0
    if-ge v5, v2, :cond_1

    .line 79
    .line 80
    sget-object v1, Lxr7;->f:[[I

    .line 81
    .line 82
    add-int/lit8 v3, v5, -0xa

    .line 83
    .line 84
    aget-object v1, v1, v3

    .line 85
    .line 86
    array-length v3, v1

    .line 87
    new-array v3, v3, [I

    .line 88
    .line 89
    move v6, v4

    .line 90
    :goto_1
    array-length v7, v1

    .line 91
    if-ge v6, v7, :cond_0

    .line 92
    .line 93
    array-length v7, v1

    .line 94
    sub-int/2addr v7, v6

    .line 95
    sub-int/2addr v7, v0

    .line 96
    aget v7, v1, v7

    .line 97
    .line 98
    aput v7, v3, v6

    .line 99
    .line 100
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_0
    sget-object v1, Lxr7;->g:[[I

    .line 104
    .line 105
    aput-object v3, v1, v5

    .line 106
    .line 107
    add-int/lit8 v5, v5, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    return-void
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

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lxr7;->a:Ljava/lang/StringBuilder;

    .line 12
    .line 13
    new-instance v0, Lqc3;

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-direct {v0, v1}, Lqc3;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lxr7;->b:Lqc3;

    .line 20
    .line 21
    new-instance v0, Lh12;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, v1}, Lh12;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lxr7;->c:Lh12;

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

.method public static h(Li90;[II[[I)I
    .locals 4

    .line 1
    invoke-static {p2, p0, p1}, Lm55;->e(ILi90;[I)V

    .line 2
    .line 3
    .line 4
    array-length p0, p3

    .line 5
    const p2, 0x3ef5c28f    # 0.48f

    .line 6
    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p0, :cond_1

    .line 11
    .line 12
    aget-object v2, p3, v1

    .line 13
    .line 14
    const v3, 0x3f333333    # 0.7f

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v2, v3}, Lm55;->d([I[IF)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    cmpg-float v3, v2, p2

    .line 22
    .line 23
    if-gez v3, :cond_0

    .line 24
    .line 25
    move v0, v1

    .line 26
    move p2, v2

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-ltz v0, :cond_2

    .line 31
    .line 32
    return v0

    .line 33
    :cond_2
    sget-object p0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 34
    .line 35
    throw p0
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
.end method

.method public static l(Li90;IZ[I[I)[I
    .locals 8

    .line 1
    iget v0, p0, Li90;->x:I

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Li90;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Li90;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    :goto_0
    array-length v1, p3

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, p2

    .line 17
    move v4, v2

    .line 18
    move p2, p1

    .line 19
    :goto_1
    if-ge p1, v0, :cond_4

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Li90;->a(I)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v6, 0x1

    .line 26
    if-eq v5, v3, :cond_1

    .line 27
    .line 28
    aget v5, p4, v4

    .line 29
    .line 30
    add-int/2addr v5, v6

    .line 31
    aput v5, p4, v4

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_1
    add-int/lit8 v5, v1, -0x1

    .line 35
    .line 36
    if-ne v4, v5, :cond_3

    .line 37
    .line 38
    const v5, 0x3f333333    # 0.7f

    .line 39
    .line 40
    .line 41
    invoke-static {p4, p3, v5}, Lm55;->d([I[IF)F

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    const v7, 0x3ef5c28f    # 0.48f

    .line 46
    .line 47
    .line 48
    cmpg-float v5, v5, v7

    .line 49
    .line 50
    if-gez v5, :cond_2

    .line 51
    .line 52
    filled-new-array {p2, p1}, [I

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_2
    aget v5, p4, v2

    .line 58
    .line 59
    aget v7, p4, v6

    .line 60
    .line 61
    add-int/2addr v5, v7

    .line 62
    add-int/2addr p2, v5

    .line 63
    add-int/lit8 v5, v4, -0x1

    .line 64
    .line 65
    const/4 v7, 0x2

    .line 66
    invoke-static {p4, v7, p4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    .line 68
    .line 69
    aput v2, p4, v5

    .line 70
    .line 71
    aput v2, p4, v4

    .line 72
    .line 73
    add-int/lit8 v4, v4, -0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    :goto_2
    aput v6, p4, v4

    .line 79
    .line 80
    xor-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    :goto_3
    add-int/lit8 p1, p1, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    sget-object p0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 86
    .line 87
    throw p0
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

.method public static m(Li90;)[I
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move v4, v2

    .line 7
    move v5, v4

    .line 8
    :goto_0
    if-nez v4, :cond_1

    .line 9
    .line 10
    invoke-static {v1, v2, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 11
    .line 12
    .line 13
    sget-object v3, Lxr7;->d:[I

    .line 14
    .line 15
    invoke-static {p0, v5, v2, v3, v1}, Lxr7;->l(Li90;IZ[I[I)[I

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    aget v5, v3, v2

    .line 20
    .line 21
    const/4 v6, 0x1

    .line 22
    aget v6, v3, v6

    .line 23
    .line 24
    sub-int v7, v6, v5

    .line 25
    .line 26
    sub-int v7, v5, v7

    .line 27
    .line 28
    if-ltz v7, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0, v7, v5}, Li90;->d(II)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    :cond_0
    move v5, v6

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v3
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


# virtual methods
.method public b(ILi90;Ljava/util/Map;)Ln66;
    .locals 1

    .line 1
    invoke-static {p2}, Lxr7;->m(Li90;)[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p2, v0, p3}, Lxr7;->k(ILi90;[ILjava/util/Map;)Ln66;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public g(Ljava/lang/String;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    const/4 v1, 0x1

    .line 10
    sub-int/2addr p0, v1

    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    invoke-static {v2, v3}, Ljava/lang/Character;->digit(CI)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    add-int/lit8 v4, p1, -0x1

    .line 30
    .line 31
    move v5, v0

    .line 32
    :goto_0
    const/16 v6, 0x9

    .line 33
    .line 34
    if-ltz v4, :cond_2

    .line 35
    .line 36
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    add-int/lit8 v7, v7, -0x30

    .line 41
    .line 42
    if-ltz v7, :cond_1

    .line 43
    .line 44
    if-gt v7, v6, :cond_1

    .line 45
    .line 46
    add-int/2addr v5, v7

    .line 47
    add-int/lit8 v4, v4, -0x2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    throw p0

    .line 55
    :cond_2
    mul-int/lit8 v5, v5, 0x3

    .line 56
    .line 57
    add-int/lit8 p1, p1, -0x2

    .line 58
    .line 59
    :goto_1
    if-ltz p1, :cond_4

    .line 60
    .line 61
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    add-int/lit8 v4, v4, -0x30

    .line 66
    .line 67
    if-ltz v4, :cond_3

    .line 68
    .line 69
    if-gt v4, v6, :cond_3

    .line 70
    .line 71
    add-int/2addr v5, v4

    .line 72
    add-int/lit8 p1, p1, -0x2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    throw p0

    .line 80
    :cond_4
    rsub-int p0, v5, 0x3e8

    .line 81
    .line 82
    rem-int/2addr p0, v3

    .line 83
    if-ne p0, v2, :cond_5

    .line 84
    .line 85
    return v1

    .line 86
    :cond_5
    :goto_2
    return v0
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

.method public i(Li90;I)[I
    .locals 2

    .line 1
    const/4 p0, 0x3

    .line 2
    new-array p0, p0, [I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    sget-object v1, Lxr7;->d:[I

    .line 6
    .line 7
    invoke-static {p1, p2, v0, v1, p0}, Lxr7;->l(Li90;IZ[I[I)[I

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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

.method public abstract j(Li90;[ILjava/lang/StringBuilder;)I
.end method

.method public k(ILi90;[ILjava/util/Map;)Ln66;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p4, :cond_0

    .line 3
    .line 4
    move-object v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v1, Lfk1;->F:Lfk1;

    .line 7
    .line 8
    invoke-interface {p4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ls66;

    .line 13
    .line 14
    :goto_0
    const/high16 v2, 0x40000000    # 2.0f

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    new-instance v5, Lr66;

    .line 21
    .line 22
    aget v6, p3, v4

    .line 23
    .line 24
    aget v7, p3, v3

    .line 25
    .line 26
    add-int/2addr v6, v7

    .line 27
    int-to-float v6, v6

    .line 28
    div-float/2addr v6, v2

    .line 29
    int-to-float v7, p1

    .line 30
    invoke-direct {v5, v6, v7}, Lr66;-><init>(FF)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, v5}, Ls66;->a(Lr66;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v5, p0, Lxr7;->a:Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p2, p3, v5}, Lxr7;->j(Li90;[ILjava/lang/StringBuilder;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    new-instance v7, Lr66;

    .line 48
    .line 49
    int-to-float v8, v6

    .line 50
    int-to-float v9, p1

    .line 51
    invoke-direct {v7, v8, v9}, Lr66;-><init>(FF)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v7}, Ls66;->a(Lr66;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual {p0, p2, v6}, Lxr7;->i(Li90;I)[I

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    new-instance v7, Lr66;

    .line 64
    .line 65
    aget v8, v6, v4

    .line 66
    .line 67
    aget v9, v6, v3

    .line 68
    .line 69
    add-int/2addr v8, v9

    .line 70
    int-to-float v8, v8

    .line 71
    div-float/2addr v8, v2

    .line 72
    int-to-float v9, p1

    .line 73
    invoke-direct {v7, v8, v9}, Lr66;-><init>(FF)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v7}, Ls66;->a(Lr66;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    aget v1, v6, v3

    .line 80
    .line 81
    aget v7, v6, v4

    .line 82
    .line 83
    sub-int v7, v1, v7

    .line 84
    .line 85
    add-int/2addr v7, v1

    .line 86
    iget v8, p2, Li90;->x:I

    .line 87
    .line 88
    if-ge v7, v8, :cond_13

    .line 89
    .line 90
    invoke-virtual {p2, v1, v7}, Li90;->d(II)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_13

    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const/16 v7, 0x8

    .line 105
    .line 106
    if-lt v5, v7, :cond_12

    .line 107
    .line 108
    invoke-virtual {p0, v1}, Lxr7;->g(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_11

    .line 113
    .line 114
    aget v5, p3, v3

    .line 115
    .line 116
    aget p3, p3, v4

    .line 117
    .line 118
    add-int/2addr v5, p3

    .line 119
    int-to-float p3, v5

    .line 120
    div-float/2addr p3, v2

    .line 121
    aget v5, v6, v3

    .line 122
    .line 123
    aget v7, v6, v4

    .line 124
    .line 125
    add-int/2addr v5, v7

    .line 126
    int-to-float v5, v5

    .line 127
    div-float/2addr v5, v2

    .line 128
    invoke-virtual {p0}, Lxr7;->n()Ld50;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    new-instance v7, Ln66;

    .line 133
    .line 134
    new-instance v8, Lr66;

    .line 135
    .line 136
    int-to-float v9, p1

    .line 137
    invoke-direct {v8, p3, v9}, Lr66;-><init>(FF)V

    .line 138
    .line 139
    .line 140
    new-instance p3, Lr66;

    .line 141
    .line 142
    invoke-direct {p3, v5, v9}, Lr66;-><init>(FF)V

    .line 143
    .line 144
    .line 145
    filled-new-array {v8, p3}, [Lr66;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    invoke-direct {v7, v1, v0, p3, v2}, Ln66;-><init>(Ljava/lang/String;[B[Lr66;Ld50;)V

    .line 150
    .line 151
    .line 152
    :try_start_0
    iget-object p3, p0, Lxr7;->b:Lqc3;

    .line 153
    .line 154
    aget v5, v6, v3

    .line 155
    .line 156
    invoke-virtual {p3, p1, v5, p2}, Lqc3;->u(IILi90;)Ln66;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    sget-object p2, Lq66;->C:Lq66;

    .line 161
    .line 162
    iget-object p3, p1, Ln66;->a:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v7, p2, p3}, Ln66;->b(Lq66;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    iget-object p2, p1, Ln66;->e:Ljava/util/Map;

    .line 168
    .line 169
    invoke-virtual {v7, p2}, Ln66;->a(Ljava/util/Map;)V

    .line 170
    .line 171
    .line 172
    iget-object p2, p1, Ln66;->c:[Lr66;

    .line 173
    .line 174
    iget-object p3, v7, Ln66;->c:[Lr66;

    .line 175
    .line 176
    if-nez p3, :cond_4

    .line 177
    .line 178
    iput-object p2, v7, Ln66;->c:[Lr66;

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_4
    if-eqz p2, :cond_5

    .line 182
    .line 183
    array-length v5, p2

    .line 184
    if-lez v5, :cond_5

    .line 185
    .line 186
    array-length v5, p3

    .line 187
    array-length v6, p2

    .line 188
    add-int/2addr v5, v6

    .line 189
    new-array v5, v5, [Lr66;

    .line 190
    .line 191
    array-length v6, p3

    .line 192
    invoke-static {p3, v4, v5, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 193
    .line 194
    .line 195
    array-length p3, p3

    .line 196
    array-length v6, p2

    .line 197
    invoke-static {p2, v4, v5, p3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 198
    .line 199
    .line 200
    iput-object v5, v7, Ln66;->c:[Lr66;

    .line 201
    .line 202
    :cond_5
    :goto_1
    iget-object p1, p1, Ln66;->a:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result p1
    :try_end_0
    .catch Lcom/google/zxing/ReaderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 208
    goto :goto_2

    .line 209
    :catch_0
    move p1, v4

    .line 210
    :goto_2
    if-nez p4, :cond_6

    .line 211
    .line 212
    move-object p2, v0

    .line 213
    goto :goto_3

    .line 214
    :cond_6
    sget-object p2, Lfk1;->G:Lfk1;

    .line 215
    .line 216
    invoke-interface {p4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    check-cast p2, [I

    .line 221
    .line 222
    :goto_3
    if-eqz p2, :cond_9

    .line 223
    .line 224
    array-length p3, p2

    .line 225
    move p4, v4

    .line 226
    :goto_4
    if-ge p4, p3, :cond_8

    .line 227
    .line 228
    aget v5, p2, p4

    .line 229
    .line 230
    if-ne p1, v5, :cond_7

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_7
    add-int/lit8 p4, p4, 0x1

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_8
    sget-object p0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 237
    .line 238
    throw p0

    .line 239
    :cond_9
    :goto_5
    sget-object p1, Ld50;->D:Ld50;

    .line 240
    .line 241
    if-eq v2, p1, :cond_a

    .line 242
    .line 243
    sget-object p1, Ld50;->K:Ld50;

    .line 244
    .line 245
    if-ne v2, p1, :cond_10

    .line 246
    .line 247
    :cond_a
    iget-object p0, p0, Lxr7;->c:Lh12;

    .line 248
    .line 249
    monitor-enter p0

    .line 250
    :try_start_1
    iget-object p1, p0, Lh12;->a:Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 256
    if-nez p1, :cond_b

    .line 257
    .line 258
    monitor-exit p0

    .line 259
    goto/16 :goto_6

    .line 260
    .line 261
    :cond_b
    const/16 p1, 0x13

    .line 262
    .line 263
    :try_start_2
    filled-new-array {v4, p1}, [I

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    const-string p2, "US/CA"

    .line 268
    .line 269
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 270
    .line 271
    .line 272
    const/16 p1, 0x1e

    .line 273
    .line 274
    const/16 p2, 0x27

    .line 275
    .line 276
    filled-new-array {p1, p2}, [I

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    const-string p2, "US"

    .line 281
    .line 282
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const/16 p1, 0x3c

    .line 286
    .line 287
    const/16 p2, 0x8b

    .line 288
    .line 289
    filled-new-array {p1, p2}, [I

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    const-string p2, "US/CA"

    .line 294
    .line 295
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 296
    .line 297
    .line 298
    const/16 p1, 0x12c

    .line 299
    .line 300
    const/16 p2, 0x17b

    .line 301
    .line 302
    filled-new-array {p1, p2}, [I

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    const-string p2, "FR"

    .line 307
    .line 308
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 309
    .line 310
    .line 311
    const/16 p1, 0x17c

    .line 312
    .line 313
    filled-new-array {p1}, [I

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    const-string p2, "BG"

    .line 318
    .line 319
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 320
    .line 321
    .line 322
    const/16 p1, 0x17f

    .line 323
    .line 324
    filled-new-array {p1}, [I

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    const-string p2, "SI"

    .line 329
    .line 330
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 331
    .line 332
    .line 333
    const/16 p1, 0x181

    .line 334
    .line 335
    filled-new-array {p1}, [I

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    const-string p2, "HR"

    .line 340
    .line 341
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 342
    .line 343
    .line 344
    const/16 p1, 0x183

    .line 345
    .line 346
    filled-new-array {p1}, [I

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    const-string p2, "BA"

    .line 351
    .line 352
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 353
    .line 354
    .line 355
    const/16 p1, 0x190

    .line 356
    .line 357
    const/16 p2, 0x1b8

    .line 358
    .line 359
    filled-new-array {p1, p2}, [I

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    const-string p2, "DE"

    .line 364
    .line 365
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 366
    .line 367
    .line 368
    const/16 p1, 0x1c2

    .line 369
    .line 370
    const/16 p2, 0x1cb

    .line 371
    .line 372
    filled-new-array {p1, p2}, [I

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    const-string p2, "JP"

    .line 377
    .line 378
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 379
    .line 380
    .line 381
    const/16 p1, 0x1cc

    .line 382
    .line 383
    const/16 p2, 0x1d5

    .line 384
    .line 385
    filled-new-array {p1, p2}, [I

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    const-string p2, "RU"

    .line 390
    .line 391
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 392
    .line 393
    .line 394
    const/16 p1, 0x1d7

    .line 395
    .line 396
    filled-new-array {p1}, [I

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    const-string p2, "TW"

    .line 401
    .line 402
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 403
    .line 404
    .line 405
    const/16 p1, 0x1da

    .line 406
    .line 407
    filled-new-array {p1}, [I

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    const-string p2, "EE"

    .line 412
    .line 413
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 414
    .line 415
    .line 416
    const/16 p1, 0x1db

    .line 417
    .line 418
    filled-new-array {p1}, [I

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    const-string p2, "LV"

    .line 423
    .line 424
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 425
    .line 426
    .line 427
    const/16 p1, 0x1dc

    .line 428
    .line 429
    filled-new-array {p1}, [I

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    const-string p2, "AZ"

    .line 434
    .line 435
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 436
    .line 437
    .line 438
    const/16 p1, 0x1dd

    .line 439
    .line 440
    filled-new-array {p1}, [I

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    const-string p2, "LT"

    .line 445
    .line 446
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 447
    .line 448
    .line 449
    const/16 p1, 0x1de

    .line 450
    .line 451
    filled-new-array {p1}, [I

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    const-string p2, "UZ"

    .line 456
    .line 457
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 458
    .line 459
    .line 460
    const/16 p1, 0x1df

    .line 461
    .line 462
    filled-new-array {p1}, [I

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    const-string p2, "LK"

    .line 467
    .line 468
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 469
    .line 470
    .line 471
    const/16 p1, 0x1e0

    .line 472
    .line 473
    filled-new-array {p1}, [I

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    const-string p2, "PH"

    .line 478
    .line 479
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 480
    .line 481
    .line 482
    const/16 p1, 0x1e1

    .line 483
    .line 484
    filled-new-array {p1}, [I

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    const-string p2, "BY"

    .line 489
    .line 490
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 491
    .line 492
    .line 493
    const/16 p1, 0x1e2

    .line 494
    .line 495
    filled-new-array {p1}, [I

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    const-string p2, "UA"

    .line 500
    .line 501
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 502
    .line 503
    .line 504
    const/16 p1, 0x1e4

    .line 505
    .line 506
    filled-new-array {p1}, [I

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    const-string p2, "MD"

    .line 511
    .line 512
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 513
    .line 514
    .line 515
    const/16 p1, 0x1e5

    .line 516
    .line 517
    filled-new-array {p1}, [I

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    const-string p2, "AM"

    .line 522
    .line 523
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 524
    .line 525
    .line 526
    const/16 p1, 0x1e6

    .line 527
    .line 528
    filled-new-array {p1}, [I

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    const-string p2, "GE"

    .line 533
    .line 534
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 535
    .line 536
    .line 537
    const/16 p1, 0x1e7

    .line 538
    .line 539
    filled-new-array {p1}, [I

    .line 540
    .line 541
    .line 542
    move-result-object p1

    .line 543
    const-string p2, "KZ"

    .line 544
    .line 545
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 546
    .line 547
    .line 548
    const/16 p1, 0x1e9

    .line 549
    .line 550
    filled-new-array {p1}, [I

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    const-string p2, "HK"

    .line 555
    .line 556
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 557
    .line 558
    .line 559
    const/16 p1, 0x1ea

    .line 560
    .line 561
    const/16 p2, 0x1f3

    .line 562
    .line 563
    filled-new-array {p1, p2}, [I

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    const-string p2, "JP"

    .line 568
    .line 569
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 570
    .line 571
    .line 572
    const/16 p1, 0x1f4

    .line 573
    .line 574
    const/16 p2, 0x1fd

    .line 575
    .line 576
    filled-new-array {p1, p2}, [I

    .line 577
    .line 578
    .line 579
    move-result-object p1

    .line 580
    const-string p2, "GB"

    .line 581
    .line 582
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 583
    .line 584
    .line 585
    const/16 p1, 0x208

    .line 586
    .line 587
    filled-new-array {p1}, [I

    .line 588
    .line 589
    .line 590
    move-result-object p1

    .line 591
    const-string p2, "GR"

    .line 592
    .line 593
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 594
    .line 595
    .line 596
    const/16 p1, 0x210

    .line 597
    .line 598
    filled-new-array {p1}, [I

    .line 599
    .line 600
    .line 601
    move-result-object p1

    .line 602
    const-string p2, "LB"

    .line 603
    .line 604
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 605
    .line 606
    .line 607
    const/16 p1, 0x211

    .line 608
    .line 609
    filled-new-array {p1}, [I

    .line 610
    .line 611
    .line 612
    move-result-object p1

    .line 613
    const-string p2, "CY"

    .line 614
    .line 615
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 616
    .line 617
    .line 618
    const/16 p1, 0x213

    .line 619
    .line 620
    filled-new-array {p1}, [I

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    const-string p2, "MK"

    .line 625
    .line 626
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 627
    .line 628
    .line 629
    const/16 p1, 0x217

    .line 630
    .line 631
    filled-new-array {p1}, [I

    .line 632
    .line 633
    .line 634
    move-result-object p1

    .line 635
    const-string p2, "MT"

    .line 636
    .line 637
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 638
    .line 639
    .line 640
    const/16 p1, 0x21b

    .line 641
    .line 642
    filled-new-array {p1}, [I

    .line 643
    .line 644
    .line 645
    move-result-object p1

    .line 646
    const-string p2, "IE"

    .line 647
    .line 648
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 649
    .line 650
    .line 651
    const/16 p1, 0x21c

    .line 652
    .line 653
    const/16 p2, 0x225

    .line 654
    .line 655
    filled-new-array {p1, p2}, [I

    .line 656
    .line 657
    .line 658
    move-result-object p1

    .line 659
    const-string p2, "BE/LU"

    .line 660
    .line 661
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 662
    .line 663
    .line 664
    const/16 p1, 0x230

    .line 665
    .line 666
    filled-new-array {p1}, [I

    .line 667
    .line 668
    .line 669
    move-result-object p1

    .line 670
    const-string p2, "PT"

    .line 671
    .line 672
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 673
    .line 674
    .line 675
    const/16 p1, 0x239

    .line 676
    .line 677
    filled-new-array {p1}, [I

    .line 678
    .line 679
    .line 680
    move-result-object p1

    .line 681
    const-string p2, "IS"

    .line 682
    .line 683
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 684
    .line 685
    .line 686
    const/16 p1, 0x23a

    .line 687
    .line 688
    const/16 p2, 0x243

    .line 689
    .line 690
    filled-new-array {p1, p2}, [I

    .line 691
    .line 692
    .line 693
    move-result-object p1

    .line 694
    const-string p2, "DK"

    .line 695
    .line 696
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 697
    .line 698
    .line 699
    const/16 p1, 0x24e

    .line 700
    .line 701
    filled-new-array {p1}, [I

    .line 702
    .line 703
    .line 704
    move-result-object p1

    .line 705
    const-string p2, "PL"

    .line 706
    .line 707
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 708
    .line 709
    .line 710
    const/16 p1, 0x252

    .line 711
    .line 712
    filled-new-array {p1}, [I

    .line 713
    .line 714
    .line 715
    move-result-object p1

    .line 716
    const-string p2, "RO"

    .line 717
    .line 718
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 719
    .line 720
    .line 721
    const/16 p1, 0x257

    .line 722
    .line 723
    filled-new-array {p1}, [I

    .line 724
    .line 725
    .line 726
    move-result-object p1

    .line 727
    const-string p2, "HU"

    .line 728
    .line 729
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 730
    .line 731
    .line 732
    const/16 p1, 0x258

    .line 733
    .line 734
    const/16 p2, 0x259

    .line 735
    .line 736
    filled-new-array {p1, p2}, [I

    .line 737
    .line 738
    .line 739
    move-result-object p1

    .line 740
    const-string p2, "ZA"

    .line 741
    .line 742
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 743
    .line 744
    .line 745
    const/16 p1, 0x25b

    .line 746
    .line 747
    filled-new-array {p1}, [I

    .line 748
    .line 749
    .line 750
    move-result-object p1

    .line 751
    const-string p2, "GH"

    .line 752
    .line 753
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 754
    .line 755
    .line 756
    const/16 p1, 0x260

    .line 757
    .line 758
    filled-new-array {p1}, [I

    .line 759
    .line 760
    .line 761
    move-result-object p1

    .line 762
    const-string p2, "BH"

    .line 763
    .line 764
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 765
    .line 766
    .line 767
    const/16 p1, 0x261

    .line 768
    .line 769
    filled-new-array {p1}, [I

    .line 770
    .line 771
    .line 772
    move-result-object p1

    .line 773
    const-string p2, "MU"

    .line 774
    .line 775
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 776
    .line 777
    .line 778
    const/16 p1, 0x263

    .line 779
    .line 780
    filled-new-array {p1}, [I

    .line 781
    .line 782
    .line 783
    move-result-object p1

    .line 784
    const-string p2, "MA"

    .line 785
    .line 786
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 787
    .line 788
    .line 789
    const/16 p1, 0x265

    .line 790
    .line 791
    filled-new-array {p1}, [I

    .line 792
    .line 793
    .line 794
    move-result-object p1

    .line 795
    const-string p2, "DZ"

    .line 796
    .line 797
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 798
    .line 799
    .line 800
    const/16 p1, 0x268

    .line 801
    .line 802
    filled-new-array {p1}, [I

    .line 803
    .line 804
    .line 805
    move-result-object p1

    .line 806
    const-string p2, "KE"

    .line 807
    .line 808
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 809
    .line 810
    .line 811
    const/16 p1, 0x26a

    .line 812
    .line 813
    filled-new-array {p1}, [I

    .line 814
    .line 815
    .line 816
    move-result-object p1

    .line 817
    const-string p2, "CI"

    .line 818
    .line 819
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 820
    .line 821
    .line 822
    const/16 p1, 0x26b

    .line 823
    .line 824
    filled-new-array {p1}, [I

    .line 825
    .line 826
    .line 827
    move-result-object p1

    .line 828
    const-string p2, "TN"

    .line 829
    .line 830
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 831
    .line 832
    .line 833
    const/16 p1, 0x26d

    .line 834
    .line 835
    filled-new-array {p1}, [I

    .line 836
    .line 837
    .line 838
    move-result-object p1

    .line 839
    const-string p2, "SY"

    .line 840
    .line 841
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 842
    .line 843
    .line 844
    const/16 p1, 0x26e

    .line 845
    .line 846
    filled-new-array {p1}, [I

    .line 847
    .line 848
    .line 849
    move-result-object p1

    .line 850
    const-string p2, "EG"

    .line 851
    .line 852
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 853
    .line 854
    .line 855
    const/16 p1, 0x270

    .line 856
    .line 857
    filled-new-array {p1}, [I

    .line 858
    .line 859
    .line 860
    move-result-object p1

    .line 861
    const-string p2, "LY"

    .line 862
    .line 863
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 864
    .line 865
    .line 866
    const/16 p1, 0x271

    .line 867
    .line 868
    filled-new-array {p1}, [I

    .line 869
    .line 870
    .line 871
    move-result-object p1

    .line 872
    const-string p2, "JO"

    .line 873
    .line 874
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 875
    .line 876
    .line 877
    const/16 p1, 0x272

    .line 878
    .line 879
    filled-new-array {p1}, [I

    .line 880
    .line 881
    .line 882
    move-result-object p1

    .line 883
    const-string p2, "IR"

    .line 884
    .line 885
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 886
    .line 887
    .line 888
    const/16 p1, 0x273

    .line 889
    .line 890
    filled-new-array {p1}, [I

    .line 891
    .line 892
    .line 893
    move-result-object p1

    .line 894
    const-string p2, "KW"

    .line 895
    .line 896
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 897
    .line 898
    .line 899
    const/16 p1, 0x274

    .line 900
    .line 901
    filled-new-array {p1}, [I

    .line 902
    .line 903
    .line 904
    move-result-object p1

    .line 905
    const-string p2, "SA"

    .line 906
    .line 907
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 908
    .line 909
    .line 910
    const/16 p1, 0x275

    .line 911
    .line 912
    filled-new-array {p1}, [I

    .line 913
    .line 914
    .line 915
    move-result-object p1

    .line 916
    const-string p2, "AE"

    .line 917
    .line 918
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 919
    .line 920
    .line 921
    const/16 p1, 0x280

    .line 922
    .line 923
    const/16 p2, 0x289

    .line 924
    .line 925
    filled-new-array {p1, p2}, [I

    .line 926
    .line 927
    .line 928
    move-result-object p1

    .line 929
    const-string p2, "FI"

    .line 930
    .line 931
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 932
    .line 933
    .line 934
    const/16 p1, 0x2b2

    .line 935
    .line 936
    const/16 p2, 0x2b7

    .line 937
    .line 938
    filled-new-array {p1, p2}, [I

    .line 939
    .line 940
    .line 941
    move-result-object p1

    .line 942
    const-string p2, "CN"

    .line 943
    .line 944
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 945
    .line 946
    .line 947
    const/16 p1, 0x2bc

    .line 948
    .line 949
    const/16 p2, 0x2c5

    .line 950
    .line 951
    filled-new-array {p1, p2}, [I

    .line 952
    .line 953
    .line 954
    move-result-object p1

    .line 955
    const-string p2, "NO"

    .line 956
    .line 957
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 958
    .line 959
    .line 960
    const/16 p1, 0x2d9

    .line 961
    .line 962
    filled-new-array {p1}, [I

    .line 963
    .line 964
    .line 965
    move-result-object p1

    .line 966
    const-string p2, "IL"

    .line 967
    .line 968
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 969
    .line 970
    .line 971
    const/16 p1, 0x2da

    .line 972
    .line 973
    const/16 p2, 0x2e3

    .line 974
    .line 975
    filled-new-array {p1, p2}, [I

    .line 976
    .line 977
    .line 978
    move-result-object p1

    .line 979
    const-string p2, "SE"

    .line 980
    .line 981
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 982
    .line 983
    .line 984
    const/16 p1, 0x2e4

    .line 985
    .line 986
    filled-new-array {p1}, [I

    .line 987
    .line 988
    .line 989
    move-result-object p1

    .line 990
    const-string p2, "GT"

    .line 991
    .line 992
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 993
    .line 994
    .line 995
    const/16 p1, 0x2e5

    .line 996
    .line 997
    filled-new-array {p1}, [I

    .line 998
    .line 999
    .line 1000
    move-result-object p1

    .line 1001
    const-string p2, "SV"

    .line 1002
    .line 1003
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1004
    .line 1005
    .line 1006
    const/16 p1, 0x2e6

    .line 1007
    .line 1008
    filled-new-array {p1}, [I

    .line 1009
    .line 1010
    .line 1011
    move-result-object p1

    .line 1012
    const-string p2, "HN"

    .line 1013
    .line 1014
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    const/16 p1, 0x2e7

    .line 1018
    .line 1019
    filled-new-array {p1}, [I

    .line 1020
    .line 1021
    .line 1022
    move-result-object p1

    .line 1023
    const-string p2, "NI"

    .line 1024
    .line 1025
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1026
    .line 1027
    .line 1028
    const/16 p1, 0x2e8

    .line 1029
    .line 1030
    filled-new-array {p1}, [I

    .line 1031
    .line 1032
    .line 1033
    move-result-object p1

    .line 1034
    const-string p2, "CR"

    .line 1035
    .line 1036
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    const/16 p1, 0x2e9

    .line 1040
    .line 1041
    filled-new-array {p1}, [I

    .line 1042
    .line 1043
    .line 1044
    move-result-object p1

    .line 1045
    const-string p2, "PA"

    .line 1046
    .line 1047
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1048
    .line 1049
    .line 1050
    const/16 p1, 0x2ea

    .line 1051
    .line 1052
    filled-new-array {p1}, [I

    .line 1053
    .line 1054
    .line 1055
    move-result-object p1

    .line 1056
    const-string p2, "DO"

    .line 1057
    .line 1058
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    const/16 p1, 0x2ee

    .line 1062
    .line 1063
    filled-new-array {p1}, [I

    .line 1064
    .line 1065
    .line 1066
    move-result-object p1

    .line 1067
    const-string p2, "MX"

    .line 1068
    .line 1069
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1070
    .line 1071
    .line 1072
    const/16 p1, 0x2f2

    .line 1073
    .line 1074
    const/16 p2, 0x2f3

    .line 1075
    .line 1076
    filled-new-array {p1, p2}, [I

    .line 1077
    .line 1078
    .line 1079
    move-result-object p1

    .line 1080
    const-string p2, "CA"

    .line 1081
    .line 1082
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1083
    .line 1084
    .line 1085
    const/16 p1, 0x2f7

    .line 1086
    .line 1087
    filled-new-array {p1}, [I

    .line 1088
    .line 1089
    .line 1090
    move-result-object p1

    .line 1091
    const-string p2, "VE"

    .line 1092
    .line 1093
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1094
    .line 1095
    .line 1096
    const/16 p1, 0x2f8

    .line 1097
    .line 1098
    const/16 p2, 0x301

    .line 1099
    .line 1100
    filled-new-array {p1, p2}, [I

    .line 1101
    .line 1102
    .line 1103
    move-result-object p1

    .line 1104
    const-string p2, "CH"

    .line 1105
    .line 1106
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1107
    .line 1108
    .line 1109
    const/16 p1, 0x302

    .line 1110
    .line 1111
    filled-new-array {p1}, [I

    .line 1112
    .line 1113
    .line 1114
    move-result-object p1

    .line 1115
    const-string p2, "CO"

    .line 1116
    .line 1117
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1118
    .line 1119
    .line 1120
    const/16 p1, 0x305

    .line 1121
    .line 1122
    filled-new-array {p1}, [I

    .line 1123
    .line 1124
    .line 1125
    move-result-object p1

    .line 1126
    const-string p2, "UY"

    .line 1127
    .line 1128
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1129
    .line 1130
    .line 1131
    const/16 p1, 0x307

    .line 1132
    .line 1133
    filled-new-array {p1}, [I

    .line 1134
    .line 1135
    .line 1136
    move-result-object p1

    .line 1137
    const-string p2, "PE"

    .line 1138
    .line 1139
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1140
    .line 1141
    .line 1142
    const/16 p1, 0x309

    .line 1143
    .line 1144
    filled-new-array {p1}, [I

    .line 1145
    .line 1146
    .line 1147
    move-result-object p1

    .line 1148
    const-string p2, "BO"

    .line 1149
    .line 1150
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1151
    .line 1152
    .line 1153
    const/16 p1, 0x30b

    .line 1154
    .line 1155
    filled-new-array {p1}, [I

    .line 1156
    .line 1157
    .line 1158
    move-result-object p1

    .line 1159
    const-string p2, "AR"

    .line 1160
    .line 1161
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1162
    .line 1163
    .line 1164
    const/16 p1, 0x30c

    .line 1165
    .line 1166
    filled-new-array {p1}, [I

    .line 1167
    .line 1168
    .line 1169
    move-result-object p1

    .line 1170
    const-string p2, "CL"

    .line 1171
    .line 1172
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1173
    .line 1174
    .line 1175
    const/16 p1, 0x310

    .line 1176
    .line 1177
    filled-new-array {p1}, [I

    .line 1178
    .line 1179
    .line 1180
    move-result-object p1

    .line 1181
    const-string p2, "PY"

    .line 1182
    .line 1183
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1184
    .line 1185
    .line 1186
    const/16 p1, 0x311

    .line 1187
    .line 1188
    filled-new-array {p1}, [I

    .line 1189
    .line 1190
    .line 1191
    move-result-object p1

    .line 1192
    const-string p2, "PE"

    .line 1193
    .line 1194
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1195
    .line 1196
    .line 1197
    const/16 p1, 0x312

    .line 1198
    .line 1199
    filled-new-array {p1}, [I

    .line 1200
    .line 1201
    .line 1202
    move-result-object p1

    .line 1203
    const-string p2, "EC"

    .line 1204
    .line 1205
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1206
    .line 1207
    .line 1208
    const/16 p1, 0x315

    .line 1209
    .line 1210
    const/16 p2, 0x316

    .line 1211
    .line 1212
    filled-new-array {p1, p2}, [I

    .line 1213
    .line 1214
    .line 1215
    move-result-object p1

    .line 1216
    const-string p2, "BR"

    .line 1217
    .line 1218
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1219
    .line 1220
    .line 1221
    const/16 p1, 0x320

    .line 1222
    .line 1223
    const/16 p2, 0x347

    .line 1224
    .line 1225
    filled-new-array {p1, p2}, [I

    .line 1226
    .line 1227
    .line 1228
    move-result-object p1

    .line 1229
    const-string p2, "IT"

    .line 1230
    .line 1231
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1232
    .line 1233
    .line 1234
    const/16 p1, 0x348

    .line 1235
    .line 1236
    const/16 p2, 0x351

    .line 1237
    .line 1238
    filled-new-array {p1, p2}, [I

    .line 1239
    .line 1240
    .line 1241
    move-result-object p1

    .line 1242
    const-string p2, "ES"

    .line 1243
    .line 1244
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    const/16 p1, 0x352

    .line 1248
    .line 1249
    filled-new-array {p1}, [I

    .line 1250
    .line 1251
    .line 1252
    move-result-object p1

    .line 1253
    const-string p2, "CU"

    .line 1254
    .line 1255
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    const/16 p1, 0x35a

    .line 1259
    .line 1260
    filled-new-array {p1}, [I

    .line 1261
    .line 1262
    .line 1263
    move-result-object p1

    .line 1264
    const-string p2, "SK"

    .line 1265
    .line 1266
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1267
    .line 1268
    .line 1269
    const/16 p1, 0x35b

    .line 1270
    .line 1271
    filled-new-array {p1}, [I

    .line 1272
    .line 1273
    .line 1274
    move-result-object p1

    .line 1275
    const-string p2, "CZ"

    .line 1276
    .line 1277
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    const/16 p1, 0x35c

    .line 1281
    .line 1282
    filled-new-array {p1}, [I

    .line 1283
    .line 1284
    .line 1285
    move-result-object p1

    .line 1286
    const-string p2, "YU"

    .line 1287
    .line 1288
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    const/16 p1, 0x361

    .line 1292
    .line 1293
    filled-new-array {p1}, [I

    .line 1294
    .line 1295
    .line 1296
    move-result-object p1

    .line 1297
    const-string p2, "MN"

    .line 1298
    .line 1299
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1300
    .line 1301
    .line 1302
    const/16 p1, 0x363

    .line 1303
    .line 1304
    filled-new-array {p1}, [I

    .line 1305
    .line 1306
    .line 1307
    move-result-object p1

    .line 1308
    const-string p2, "KP"

    .line 1309
    .line 1310
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1311
    .line 1312
    .line 1313
    const/16 p1, 0x364

    .line 1314
    .line 1315
    const/16 p2, 0x365

    .line 1316
    .line 1317
    filled-new-array {p1, p2}, [I

    .line 1318
    .line 1319
    .line 1320
    move-result-object p1

    .line 1321
    const-string p2, "TR"

    .line 1322
    .line 1323
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    const/16 p1, 0x366

    .line 1327
    .line 1328
    const/16 p2, 0x36f

    .line 1329
    .line 1330
    filled-new-array {p1, p2}, [I

    .line 1331
    .line 1332
    .line 1333
    move-result-object p1

    .line 1334
    const-string p2, "NL"

    .line 1335
    .line 1336
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1337
    .line 1338
    .line 1339
    const/16 p1, 0x370

    .line 1340
    .line 1341
    filled-new-array {p1}, [I

    .line 1342
    .line 1343
    .line 1344
    move-result-object p1

    .line 1345
    const-string p2, "KR"

    .line 1346
    .line 1347
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1348
    .line 1349
    .line 1350
    const/16 p1, 0x375

    .line 1351
    .line 1352
    filled-new-array {p1}, [I

    .line 1353
    .line 1354
    .line 1355
    move-result-object p1

    .line 1356
    const-string p2, "TH"

    .line 1357
    .line 1358
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1359
    .line 1360
    .line 1361
    const/16 p1, 0x378

    .line 1362
    .line 1363
    filled-new-array {p1}, [I

    .line 1364
    .line 1365
    .line 1366
    move-result-object p1

    .line 1367
    const-string p2, "SG"

    .line 1368
    .line 1369
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1370
    .line 1371
    .line 1372
    const/16 p1, 0x37a

    .line 1373
    .line 1374
    filled-new-array {p1}, [I

    .line 1375
    .line 1376
    .line 1377
    move-result-object p1

    .line 1378
    const-string p2, "IN"

    .line 1379
    .line 1380
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1381
    .line 1382
    .line 1383
    const/16 p1, 0x37d

    .line 1384
    .line 1385
    filled-new-array {p1}, [I

    .line 1386
    .line 1387
    .line 1388
    move-result-object p1

    .line 1389
    const-string p2, "VN"

    .line 1390
    .line 1391
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1392
    .line 1393
    .line 1394
    const/16 p1, 0x380

    .line 1395
    .line 1396
    filled-new-array {p1}, [I

    .line 1397
    .line 1398
    .line 1399
    move-result-object p1

    .line 1400
    const-string p2, "PK"

    .line 1401
    .line 1402
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1403
    .line 1404
    .line 1405
    const/16 p1, 0x383

    .line 1406
    .line 1407
    filled-new-array {p1}, [I

    .line 1408
    .line 1409
    .line 1410
    move-result-object p1

    .line 1411
    const-string p2, "ID"

    .line 1412
    .line 1413
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1414
    .line 1415
    .line 1416
    const/16 p1, 0x384

    .line 1417
    .line 1418
    const/16 p2, 0x397

    .line 1419
    .line 1420
    filled-new-array {p1, p2}, [I

    .line 1421
    .line 1422
    .line 1423
    move-result-object p1

    .line 1424
    const-string p2, "AT"

    .line 1425
    .line 1426
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1427
    .line 1428
    .line 1429
    const/16 p1, 0x3a2

    .line 1430
    .line 1431
    const/16 p2, 0x3ab

    .line 1432
    .line 1433
    filled-new-array {p1, p2}, [I

    .line 1434
    .line 1435
    .line 1436
    move-result-object p1

    .line 1437
    const-string p2, "AU"

    .line 1438
    .line 1439
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1440
    .line 1441
    .line 1442
    const/16 p1, 0x3ac

    .line 1443
    .line 1444
    const/16 p2, 0x3b5

    .line 1445
    .line 1446
    filled-new-array {p1, p2}, [I

    .line 1447
    .line 1448
    .line 1449
    move-result-object p1

    .line 1450
    const-string p2, "AZ"

    .line 1451
    .line 1452
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1453
    .line 1454
    .line 1455
    const/16 p1, 0x3bb

    .line 1456
    .line 1457
    filled-new-array {p1}, [I

    .line 1458
    .line 1459
    .line 1460
    move-result-object p1

    .line 1461
    const-string p2, "MY"

    .line 1462
    .line 1463
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V

    .line 1464
    .line 1465
    .line 1466
    const/16 p1, 0x3be

    .line 1467
    .line 1468
    filled-new-array {p1}, [I

    .line 1469
    .line 1470
    .line 1471
    move-result-object p1

    .line 1472
    const-string p2, "MO"

    .line 1473
    .line 1474
    invoke-virtual {p0, p1, p2}, Lh12;->b([ILjava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1475
    .line 1476
    .line 1477
    monitor-exit p0

    .line 1478
    :goto_6
    const/4 p1, 0x3

    .line 1479
    invoke-virtual {v1, v4, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1480
    .line 1481
    .line 1482
    move-result-object p1

    .line 1483
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1484
    .line 1485
    .line 1486
    move-result p1

    .line 1487
    iget-object p2, p0, Lh12;->a:Ljava/util/ArrayList;

    .line 1488
    .line 1489
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 1490
    .line 1491
    .line 1492
    move-result p2

    .line 1493
    move p3, v4

    .line 1494
    :goto_7
    if-ge p3, p2, :cond_f

    .line 1495
    .line 1496
    iget-object p4, p0, Lh12;->a:Ljava/util/ArrayList;

    .line 1497
    .line 1498
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1499
    .line 1500
    .line 1501
    move-result-object p4

    .line 1502
    check-cast p4, [I

    .line 1503
    .line 1504
    aget v1, p4, v4

    .line 1505
    .line 1506
    if-ge p1, v1, :cond_c

    .line 1507
    .line 1508
    goto :goto_9

    .line 1509
    :cond_c
    array-length v2, p4

    .line 1510
    if-ne v2, v3, :cond_d

    .line 1511
    .line 1512
    goto :goto_8

    .line 1513
    :cond_d
    aget v1, p4, v3

    .line 1514
    .line 1515
    :goto_8
    if-gt p1, v1, :cond_e

    .line 1516
    .line 1517
    iget-object p0, p0, Lh12;->b:Ljava/util/ArrayList;

    .line 1518
    .line 1519
    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    move-result-object p0

    .line 1523
    move-object v0, p0

    .line 1524
    check-cast v0, Ljava/lang/String;

    .line 1525
    .line 1526
    goto :goto_9

    .line 1527
    :cond_e
    add-int/lit8 p3, p3, 0x1

    .line 1528
    .line 1529
    goto :goto_7

    .line 1530
    :cond_f
    :goto_9
    if-eqz v0, :cond_10

    .line 1531
    .line 1532
    sget-object p0, Lq66;->B:Lq66;

    .line 1533
    .line 1534
    invoke-virtual {v7, p0, v0}, Ln66;->b(Lq66;Ljava/lang/Object;)V

    .line 1535
    .line 1536
    .line 1537
    :cond_10
    return-object v7

    .line 1538
    :catchall_0
    move-exception p1

    .line 1539
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1540
    throw p1

    .line 1541
    :cond_11
    invoke-static {}, Lcom/google/zxing/ChecksumException;->a()Lcom/google/zxing/ChecksumException;

    .line 1542
    .line 1543
    .line 1544
    move-result-object p0

    .line 1545
    throw p0

    .line 1546
    :cond_12
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    .line 1547
    .line 1548
    .line 1549
    move-result-object p0

    .line 1550
    throw p0

    .line 1551
    :cond_13
    sget-object p0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 1552
    .line 1553
    throw p0
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
.end method

.method public abstract n()Ld50;
.end method
