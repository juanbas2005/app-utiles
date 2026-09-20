.class public final Lfb0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lk90;

.field public final b:Lr66;

.field public final c:Lr66;

.field public final d:Lr66;

.field public final e:Lr66;

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(Lfb0;)V
    .locals 1

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    iget-object v0, p1, Lfb0;->a:Lk90;

    iput-object v0, p0, Lfb0;->a:Lk90;

    .line 126
    iget-object v0, p1, Lfb0;->b:Lr66;

    iput-object v0, p0, Lfb0;->b:Lr66;

    .line 127
    iget-object v0, p1, Lfb0;->c:Lr66;

    iput-object v0, p0, Lfb0;->c:Lr66;

    .line 128
    iget-object v0, p1, Lfb0;->d:Lr66;

    iput-object v0, p0, Lfb0;->d:Lr66;

    .line 129
    iget-object v0, p1, Lfb0;->e:Lr66;

    iput-object v0, p0, Lfb0;->e:Lr66;

    .line 130
    iget v0, p1, Lfb0;->f:I

    iput v0, p0, Lfb0;->f:I

    .line 131
    iget v0, p1, Lfb0;->g:I

    iput v0, p0, Lfb0;->g:I

    .line 132
    iget v0, p1, Lfb0;->h:I

    iput v0, p0, Lfb0;->h:I

    .line 133
    iget p1, p1, Lfb0;->i:I

    iput p1, p0, Lfb0;->i:I

    return-void
.end method

.method public constructor <init>(Lk90;Lr66;Lr66;Lr66;Lr66;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v2, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    move v2, v1

    .line 14
    :goto_1
    if-eqz p4, :cond_2

    .line 15
    .line 16
    if-nez p5, :cond_3

    .line 17
    .line 18
    :cond_2
    move v0, v1

    .line 19
    :cond_3
    if-eqz v2, :cond_5

    .line 20
    .line 21
    if-nez v0, :cond_4

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_4
    sget-object p0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 25
    .line 26
    throw p0

    .line 27
    :cond_5
    :goto_2
    if-eqz v2, :cond_6

    .line 28
    .line 29
    new-instance p2, Lr66;

    .line 30
    .line 31
    iget p3, p4, Lr66;->b:F

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-direct {p2, v0, p3}, Lr66;-><init>(FF)V

    .line 35
    .line 36
    .line 37
    new-instance p3, Lr66;

    .line 38
    .line 39
    iget v1, p5, Lr66;->b:F

    .line 40
    .line 41
    invoke-direct {p3, v0, v1}, Lr66;-><init>(FF)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_6
    if-eqz v0, :cond_7

    .line 46
    .line 47
    new-instance p4, Lr66;

    .line 48
    .line 49
    iget p5, p1, Lk90;->w:I

    .line 50
    .line 51
    add-int/lit8 v0, p5, -0x1

    .line 52
    .line 53
    int-to-float v0, v0

    .line 54
    iget v2, p2, Lr66;->b:F

    .line 55
    .line 56
    invoke-direct {p4, v0, v2}, Lr66;-><init>(FF)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lr66;

    .line 60
    .line 61
    sub-int/2addr p5, v1

    .line 62
    int-to-float p5, p5

    .line 63
    iget v1, p3, Lr66;->b:F

    .line 64
    .line 65
    invoke-direct {v0, p5, v1}, Lr66;-><init>(FF)V

    .line 66
    .line 67
    .line 68
    move-object p5, v0

    .line 69
    :cond_7
    :goto_3
    iput-object p1, p0, Lfb0;->a:Lk90;

    .line 70
    .line 71
    iput-object p2, p0, Lfb0;->b:Lr66;

    .line 72
    .line 73
    iput-object p3, p0, Lfb0;->c:Lr66;

    .line 74
    .line 75
    iput-object p4, p0, Lfb0;->d:Lr66;

    .line 76
    .line 77
    iput-object p5, p0, Lfb0;->e:Lr66;

    .line 78
    .line 79
    iget p1, p2, Lr66;->a:F

    .line 80
    .line 81
    iget v0, p3, Lr66;->a:F

    .line 82
    .line 83
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    float-to-int p1, p1

    .line 88
    iput p1, p0, Lfb0;->f:I

    .line 89
    .line 90
    iget p1, p4, Lr66;->a:F

    .line 91
    .line 92
    iget v0, p5, Lr66;->a:F

    .line 93
    .line 94
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    float-to-int p1, p1

    .line 99
    iput p1, p0, Lfb0;->g:I

    .line 100
    .line 101
    iget p1, p2, Lr66;->b:F

    .line 102
    .line 103
    iget p2, p4, Lr66;->b:F

    .line 104
    .line 105
    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    float-to-int p1, p1

    .line 110
    iput p1, p0, Lfb0;->h:I

    .line 111
    .line 112
    iget p1, p3, Lr66;->b:F

    .line 113
    .line 114
    iget p2, p5, Lr66;->b:F

    .line 115
    .line 116
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    float-to-int p1, p1

    .line 121
    iput p1, p0, Lfb0;->i:I

    .line 122
    .line 123
    return-void
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
