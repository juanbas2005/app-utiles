.class public final Lw28;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final p:Landroid/graphics/Matrix;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Matrix;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/PathMeasure;

.field public final g:Lt28;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/Boolean;

.field public final o:Ljs;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw28;->p:Landroid/graphics/Matrix;

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

.method public constructor <init>()V
    .locals 2

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lw28;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 102
    iput v0, p0, Lw28;->h:F

    .line 103
    iput v0, p0, Lw28;->i:F

    .line 104
    iput v0, p0, Lw28;->j:F

    .line 105
    iput v0, p0, Lw28;->k:F

    const/16 v0, 0xff

    .line 106
    iput v0, p0, Lw28;->l:I

    const/4 v0, 0x0

    .line 107
    iput-object v0, p0, Lw28;->m:Ljava/lang/String;

    .line 108
    iput-object v0, p0, Lw28;->n:Ljava/lang/Boolean;

    .line 109
    new-instance v0, Ljs;

    const/4 v1, 0x0

    .line 110
    invoke-direct {v0, v1}, Lzt6;-><init>(I)V

    .line 111
    iput-object v0, p0, Lw28;->o:Ljs;

    .line 112
    new-instance v0, Lt28;

    invoke-direct {v0}, Lt28;-><init>()V

    iput-object v0, p0, Lw28;->g:Lt28;

    .line 113
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lw28;->a:Landroid/graphics/Path;

    .line 114
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lw28;->b:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Lw28;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Matrix;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lw28;->c:Landroid/graphics/Matrix;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lw28;->h:F

    .line 13
    .line 14
    iput v0, p0, Lw28;->i:F

    .line 15
    .line 16
    iput v0, p0, Lw28;->j:F

    .line 17
    .line 18
    iput v0, p0, Lw28;->k:F

    .line 19
    .line 20
    const/16 v0, 0xff

    .line 21
    .line 22
    iput v0, p0, Lw28;->l:I

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lw28;->m:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v0, p0, Lw28;->n:Ljava/lang/Boolean;

    .line 28
    .line 29
    new-instance v0, Ljs;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, Lzt6;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lw28;->o:Ljs;

    .line 36
    .line 37
    new-instance v1, Lt28;

    .line 38
    .line 39
    iget-object v2, p1, Lw28;->g:Lt28;

    .line 40
    .line 41
    invoke-direct {v1, v2, v0}, Lt28;-><init>(Lt28;Ljs;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lw28;->g:Lt28;

    .line 45
    .line 46
    new-instance v1, Landroid/graphics/Path;

    .line 47
    .line 48
    iget-object v2, p1, Lw28;->a:Landroid/graphics/Path;

    .line 49
    .line 50
    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lw28;->a:Landroid/graphics/Path;

    .line 54
    .line 55
    new-instance v1, Landroid/graphics/Path;

    .line 56
    .line 57
    iget-object v2, p1, Lw28;->b:Landroid/graphics/Path;

    .line 58
    .line 59
    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, Lw28;->b:Landroid/graphics/Path;

    .line 63
    .line 64
    iget v1, p1, Lw28;->h:F

    .line 65
    .line 66
    iput v1, p0, Lw28;->h:F

    .line 67
    .line 68
    iget v1, p1, Lw28;->i:F

    .line 69
    .line 70
    iput v1, p0, Lw28;->i:F

    .line 71
    .line 72
    iget v1, p1, Lw28;->j:F

    .line 73
    .line 74
    iput v1, p0, Lw28;->j:F

    .line 75
    .line 76
    iget v1, p1, Lw28;->k:F

    .line 77
    .line 78
    iput v1, p0, Lw28;->k:F

    .line 79
    .line 80
    iget v1, p1, Lw28;->l:I

    .line 81
    .line 82
    iput v1, p0, Lw28;->l:I

    .line 83
    .line 84
    iget-object v1, p1, Lw28;->m:Ljava/lang/String;

    .line 85
    .line 86
    iput-object v1, p0, Lw28;->m:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v1, p1, Lw28;->m:Ljava/lang/String;

    .line 89
    .line 90
    if-eqz v1, :cond_0

    .line 91
    .line 92
    invoke-virtual {v0, v1, p0}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_0
    iget-object p1, p1, Lw28;->n:Ljava/lang/Boolean;

    .line 96
    .line 97
    iput-object p1, p0, Lw28;->n:Ljava/lang/Boolean;

    .line 98
    .line 99
    return-void
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


# virtual methods
.method public final a(Lt28;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Lt28;->a:Landroid/graphics/Matrix;

    .line 4
    .line 5
    iget-object v6, v0, Lt28;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Lt28;->a:Landroid/graphics/Matrix;

    .line 13
    .line 14
    iget-object v0, v0, Lt28;->j:Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    .line 20
    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move v8, v7

    .line 24
    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ge v8, v0, :cond_16

    .line 29
    .line 30
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lu28;

    .line 35
    .line 36
    instance-of v1, v0, Lt28;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    move-object v1, v0

    .line 41
    check-cast v1, Lt28;

    .line 42
    .line 43
    move-object/from16 v0, p0

    .line 44
    .line 45
    move-object/from16 v3, p3

    .line 46
    .line 47
    move/from16 v4, p4

    .line 48
    .line 49
    move/from16 v5, p5

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v5}, Lw28;->a(Lt28;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    .line 52
    .line 53
    .line 54
    move-object v1, v0

    .line 55
    :goto_1
    move/from16 v9, p5

    .line 56
    .line 57
    move/from16 v18, v8

    .line 58
    .line 59
    goto/16 :goto_c

    .line 60
    .line 61
    :cond_0
    move-object/from16 v1, p0

    .line 62
    .line 63
    move-object/from16 v3, p3

    .line 64
    .line 65
    instance-of v4, v0, Lv28;

    .line 66
    .line 67
    if-eqz v4, :cond_14

    .line 68
    .line 69
    check-cast v0, Lv28;

    .line 70
    .line 71
    move/from16 v4, p4

    .line 72
    .line 73
    int-to-float v5, v4

    .line 74
    iget v9, v1, Lw28;->j:F

    .line 75
    .line 76
    div-float/2addr v5, v9

    .line 77
    move/from16 v9, p5

    .line 78
    .line 79
    int-to-float v10, v9

    .line 80
    iget v11, v1, Lw28;->k:F

    .line 81
    .line 82
    div-float/2addr v10, v11

    .line 83
    invoke-static {v5, v10}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    iget-object v12, v1, Lw28;->c:Landroid/graphics/Matrix;

    .line 88
    .line 89
    invoke-virtual {v12, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12, v5, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 93
    .line 94
    .line 95
    const/4 v5, 0x4

    .line 96
    new-array v5, v5, [F

    .line 97
    .line 98
    fill-array-data v5, :array_0

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v5}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 102
    .line 103
    .line 104
    aget v10, v5, v7

    .line 105
    .line 106
    float-to-double v13, v10

    .line 107
    const/4 v10, 0x1

    .line 108
    aget v15, v5, v10

    .line 109
    .line 110
    move/from16 p2, v10

    .line 111
    .line 112
    move/from16 p1, v11

    .line 113
    .line 114
    float-to-double v10, v15

    .line 115
    invoke-static {v13, v14, v10, v11}, Ljava/lang/Math;->hypot(DD)D

    .line 116
    .line 117
    .line 118
    move-result-wide v10

    .line 119
    double-to-float v10, v10

    .line 120
    const/4 v11, 0x2

    .line 121
    aget v13, v5, v11

    .line 122
    .line 123
    float-to-double v13, v13

    .line 124
    const/4 v15, 0x3

    .line 125
    move/from16 v16, v11

    .line 126
    .line 127
    aget v11, v5, v15

    .line 128
    .line 129
    move/from16 v17, v7

    .line 130
    .line 131
    move/from16 v18, v8

    .line 132
    .line 133
    float-to-double v7, v11

    .line 134
    invoke-static {v13, v14, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    .line 135
    .line 136
    .line 137
    move-result-wide v7

    .line 138
    double-to-float v7, v7

    .line 139
    aget v8, v5, v17

    .line 140
    .line 141
    aget v11, v5, p2

    .line 142
    .line 143
    aget v13, v5, v16

    .line 144
    .line 145
    aget v5, v5, v15

    .line 146
    .line 147
    mul-float/2addr v8, v5

    .line 148
    mul-float/2addr v11, v13

    .line 149
    sub-float/2addr v8, v11

    .line 150
    invoke-static {v10, v7}, Ljava/lang/Math;->max(FF)F

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    const/4 v7, 0x0

    .line 155
    cmpl-float v10, v5, v7

    .line 156
    .line 157
    if-lez v10, :cond_1

    .line 158
    .line 159
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    div-float/2addr v8, v5

    .line 164
    goto :goto_2

    .line 165
    :cond_1
    move v8, v7

    .line 166
    :goto_2
    cmpl-float v5, v8, v7

    .line 167
    .line 168
    if-nez v5, :cond_2

    .line 169
    .line 170
    goto/16 :goto_c

    .line 171
    .line 172
    :cond_2
    iget-object v5, v1, Lw28;->a:Landroid/graphics/Path;

    .line 173
    .line 174
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 175
    .line 176
    .line 177
    iget-object v10, v0, Lv28;->a:[Lxe5;

    .line 178
    .line 179
    if-eqz v10, :cond_3

    .line 180
    .line 181
    invoke-static {v10, v5}, Lxe5;->b([Lxe5;Landroid/graphics/Path;)V

    .line 182
    .line 183
    .line 184
    :cond_3
    iget-object v10, v1, Lw28;->b:Landroid/graphics/Path;

    .line 185
    .line 186
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 187
    .line 188
    .line 189
    instance-of v11, v0, Lr28;

    .line 190
    .line 191
    if-eqz v11, :cond_5

    .line 192
    .line 193
    iget v0, v0, Lv28;->c:I

    .line 194
    .line 195
    if-nez v0, :cond_4

    .line 196
    .line 197
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_4
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 201
    .line 202
    :goto_3
    invoke-virtual {v10, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v10, v5, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, v10}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 209
    .line 210
    .line 211
    goto/16 :goto_c

    .line 212
    .line 213
    :cond_5
    check-cast v0, Ls28;

    .line 214
    .line 215
    iget v11, v0, Ls28;->i:F

    .line 216
    .line 217
    cmpl-float v13, v11, v7

    .line 218
    .line 219
    const/high16 v14, 0x3f800000    # 1.0f

    .line 220
    .line 221
    if-nez v13, :cond_6

    .line 222
    .line 223
    iget v13, v0, Ls28;->j:F

    .line 224
    .line 225
    cmpl-float v13, v13, v14

    .line 226
    .line 227
    if-eqz v13, :cond_9

    .line 228
    .line 229
    :cond_6
    iget v13, v0, Ls28;->k:F

    .line 230
    .line 231
    add-float/2addr v11, v13

    .line 232
    rem-float/2addr v11, v14

    .line 233
    iget v15, v0, Ls28;->j:F

    .line 234
    .line 235
    add-float/2addr v15, v13

    .line 236
    rem-float/2addr v15, v14

    .line 237
    iget-object v13, v1, Lw28;->f:Landroid/graphics/PathMeasure;

    .line 238
    .line 239
    if-nez v13, :cond_7

    .line 240
    .line 241
    new-instance v13, Landroid/graphics/PathMeasure;

    .line 242
    .line 243
    invoke-direct {v13}, Landroid/graphics/PathMeasure;-><init>()V

    .line 244
    .line 245
    .line 246
    iput-object v13, v1, Lw28;->f:Landroid/graphics/PathMeasure;

    .line 247
    .line 248
    :cond_7
    iget-object v13, v1, Lw28;->f:Landroid/graphics/PathMeasure;

    .line 249
    .line 250
    move/from16 v14, v17

    .line 251
    .line 252
    invoke-virtual {v13, v5, v14}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 253
    .line 254
    .line 255
    iget-object v13, v1, Lw28;->f:Landroid/graphics/PathMeasure;

    .line 256
    .line 257
    invoke-virtual {v13}, Landroid/graphics/PathMeasure;->getLength()F

    .line 258
    .line 259
    .line 260
    move-result v13

    .line 261
    mul-float/2addr v11, v13

    .line 262
    mul-float/2addr v15, v13

    .line 263
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 264
    .line 265
    .line 266
    cmpl-float v16, v11, v15

    .line 267
    .line 268
    iget-object v14, v1, Lw28;->f:Landroid/graphics/PathMeasure;

    .line 269
    .line 270
    if-lez v16, :cond_8

    .line 271
    .line 272
    move/from16 v7, p2

    .line 273
    .line 274
    invoke-virtual {v14, v11, v13, v5, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 275
    .line 276
    .line 277
    iget-object v11, v1, Lw28;->f:Landroid/graphics/PathMeasure;

    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    invoke-virtual {v11, v13, v15, v5, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 281
    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_8
    move v13, v7

    .line 285
    move/from16 v7, p2

    .line 286
    .line 287
    invoke-virtual {v14, v11, v15, v5, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 288
    .line 289
    .line 290
    :goto_4
    invoke-virtual {v5, v13, v13}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 291
    .line 292
    .line 293
    :cond_9
    invoke-virtual {v10, v5, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 294
    .line 295
    .line 296
    iget-object v5, v0, Ls28;->f:Lig;

    .line 297
    .line 298
    iget-object v7, v5, Lig;->c:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v7, Landroid/graphics/Shader;

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const/16 v14, 0xff

    .line 304
    .line 305
    const/high16 v15, 0x437f0000    # 255.0f

    .line 306
    .line 307
    if-eqz v7, :cond_a

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_a
    iget v7, v5, Lig;->b:I

    .line 311
    .line 312
    if-eqz v7, :cond_e

    .line 313
    .line 314
    :goto_5
    iget-object v7, v1, Lw28;->e:Landroid/graphics/Paint;

    .line 315
    .line 316
    if-nez v7, :cond_b

    .line 317
    .line 318
    new-instance v7, Landroid/graphics/Paint;

    .line 319
    .line 320
    const/4 v11, 0x1

    .line 321
    const v16, 0xffffff

    .line 322
    .line 323
    .line 324
    invoke-direct {v7, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 325
    .line 326
    .line 327
    iput-object v7, v1, Lw28;->e:Landroid/graphics/Paint;

    .line 328
    .line 329
    sget-object v11, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 330
    .line 331
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 332
    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_b
    const v16, 0xffffff

    .line 336
    .line 337
    .line 338
    :goto_6
    iget-object v7, v1, Lw28;->e:Landroid/graphics/Paint;

    .line 339
    .line 340
    iget-object v11, v5, Lig;->c:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v11, Landroid/graphics/Shader;

    .line 343
    .line 344
    if-eqz v11, :cond_c

    .line 345
    .line 346
    invoke-virtual {v11, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 350
    .line 351
    .line 352
    iget v5, v0, Ls28;->h:F

    .line 353
    .line 354
    mul-float/2addr v5, v15

    .line 355
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 360
    .line 361
    .line 362
    move/from16 v19, v15

    .line 363
    .line 364
    goto :goto_7

    .line 365
    :cond_c
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v7, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 369
    .line 370
    .line 371
    iget v5, v5, Lig;->b:I

    .line 372
    .line 373
    iget v11, v0, Ls28;->h:F

    .line 374
    .line 375
    sget-object v19, Lz28;->F:Landroid/graphics/PorterDuff$Mode;

    .line 376
    .line 377
    move/from16 v19, v15

    .line 378
    .line 379
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 380
    .line 381
    .line 382
    move-result v15

    .line 383
    and-int v5, v5, v16

    .line 384
    .line 385
    int-to-float v15, v15

    .line 386
    mul-float/2addr v15, v11

    .line 387
    float-to-int v11, v15

    .line 388
    shl-int/lit8 v11, v11, 0x18

    .line 389
    .line 390
    or-int/2addr v5, v11

    .line 391
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 392
    .line 393
    .line 394
    :goto_7
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 395
    .line 396
    .line 397
    iget v5, v0, Lv28;->c:I

    .line 398
    .line 399
    if-nez v5, :cond_d

    .line 400
    .line 401
    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_d
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 405
    .line 406
    :goto_8
    invoke-virtual {v10, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v3, v10, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 410
    .line 411
    .line 412
    goto :goto_9

    .line 413
    :cond_e
    move/from16 v19, v15

    .line 414
    .line 415
    const v16, 0xffffff

    .line 416
    .line 417
    .line 418
    :goto_9
    iget-object v5, v0, Ls28;->d:Lig;

    .line 419
    .line 420
    iget-object v7, v5, Lig;->c:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v7, Landroid/graphics/Shader;

    .line 423
    .line 424
    if-eqz v7, :cond_f

    .line 425
    .line 426
    goto :goto_a

    .line 427
    :cond_f
    iget v7, v5, Lig;->b:I

    .line 428
    .line 429
    if-eqz v7, :cond_15

    .line 430
    .line 431
    :goto_a
    iget-object v7, v1, Lw28;->d:Landroid/graphics/Paint;

    .line 432
    .line 433
    if-nez v7, :cond_10

    .line 434
    .line 435
    new-instance v7, Landroid/graphics/Paint;

    .line 436
    .line 437
    const/4 v11, 0x1

    .line 438
    invoke-direct {v7, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 439
    .line 440
    .line 441
    iput-object v7, v1, Lw28;->d:Landroid/graphics/Paint;

    .line 442
    .line 443
    sget-object v11, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 444
    .line 445
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 446
    .line 447
    .line 448
    :cond_10
    iget-object v7, v1, Lw28;->d:Landroid/graphics/Paint;

    .line 449
    .line 450
    iget-object v11, v0, Ls28;->m:Landroid/graphics/Paint$Join;

    .line 451
    .line 452
    if-eqz v11, :cond_11

    .line 453
    .line 454
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 455
    .line 456
    .line 457
    :cond_11
    iget-object v11, v0, Ls28;->l:Landroid/graphics/Paint$Cap;

    .line 458
    .line 459
    if-eqz v11, :cond_12

    .line 460
    .line 461
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 462
    .line 463
    .line 464
    :cond_12
    iget v11, v0, Ls28;->n:F

    .line 465
    .line 466
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 467
    .line 468
    .line 469
    iget-object v11, v5, Lig;->c:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v11, Landroid/graphics/Shader;

    .line 472
    .line 473
    if-eqz v11, :cond_13

    .line 474
    .line 475
    invoke-virtual {v11, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 479
    .line 480
    .line 481
    iget v5, v0, Ls28;->g:F

    .line 482
    .line 483
    mul-float v5, v5, v19

    .line 484
    .line 485
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 490
    .line 491
    .line 492
    goto :goto_b

    .line 493
    :cond_13
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v7, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 497
    .line 498
    .line 499
    iget v5, v5, Lig;->b:I

    .line 500
    .line 501
    iget v11, v0, Ls28;->g:F

    .line 502
    .line 503
    sget-object v12, Lz28;->F:Landroid/graphics/PorterDuff$Mode;

    .line 504
    .line 505
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 506
    .line 507
    .line 508
    move-result v12

    .line 509
    and-int v5, v5, v16

    .line 510
    .line 511
    int-to-float v12, v12

    .line 512
    mul-float/2addr v12, v11

    .line 513
    float-to-int v11, v12

    .line 514
    shl-int/lit8 v11, v11, 0x18

    .line 515
    .line 516
    or-int/2addr v5, v11

    .line 517
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 518
    .line 519
    .line 520
    :goto_b
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 521
    .line 522
    .line 523
    mul-float v11, p1, v8

    .line 524
    .line 525
    iget v0, v0, Ls28;->e:F

    .line 526
    .line 527
    mul-float/2addr v0, v11

    .line 528
    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3, v10, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 532
    .line 533
    .line 534
    goto :goto_c

    .line 535
    :cond_14
    move/from16 v4, p4

    .line 536
    .line 537
    goto/16 :goto_1

    .line 538
    .line 539
    :cond_15
    :goto_c
    add-int/lit8 v8, v18, 0x1

    .line 540
    .line 541
    const/4 v7, 0x0

    .line 542
    goto/16 :goto_0

    .line 543
    .line 544
    :cond_16
    move-object/from16 v3, p3

    .line 545
    .line 546
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    .line 547
    .line 548
    .line 549
    return-void

    .line 550
    nop

    .line 551
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
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
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
.end method

.method public getAlpha()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw28;->getRootAlpha()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-float p0, p0

    .line 6
    const/high16 v0, 0x437f0000    # 255.0f

    .line 7
    .line 8
    div-float/2addr p0, v0

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

.method public getRootAlpha()I
    .locals 0

    .line 1
    iget p0, p0, Lw28;->l:I

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

.method public setAlpha(F)V
    .locals 1

    .line 1
    const/high16 v0, 0x437f0000    # 255.0f

    .line 2
    .line 3
    mul-float/2addr p1, v0

    .line 4
    float-to-int p1, p1

    .line 5
    invoke-virtual {p0, p1}, Lw28;->setRootAlpha(I)V

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

.method public setRootAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw28;->l:I

    .line 2
    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
