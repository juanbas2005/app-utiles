.class public final Lwr7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final c:[I


# instance fields
.field public final a:[I

.field public final b:Ljava/lang/StringBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lwr7;->c:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x18
        0x14
        0x12
        0x11
        0xc
        0x6
        0x3
        0xa
        0x9
        0x5
    .end array-data
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

.method public constructor <init>(I)V
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x4

    .line 8
    new-array p1, p1, [I

    .line 9
    .line 10
    iput-object p1, p0, Lwr7;->a:[I

    .line 11
    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lwr7;->b:Ljava/lang/StringBuilder;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x4

    .line 24
    new-array p1, p1, [I

    .line 25
    .line 26
    iput-object p1, p0, Lwr7;->a:[I

    .line 27
    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lwr7;->b:Ljava/lang/StringBuilder;

    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
.method public a(ILi90;[I)Ln66;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lwr7;->b:Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lwr7;->a:[I

    .line 12
    .line 13
    aput v3, v0, v3

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aput v3, v0, v4

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    aput v3, v0, v5

    .line 20
    .line 21
    const/4 v6, 0x3

    .line 22
    aput v3, v0, v6

    .line 23
    .line 24
    iget v7, v1, Li90;->x:I

    .line 25
    .line 26
    aget v8, p3, v4

    .line 27
    .line 28
    move v9, v3

    .line 29
    move v10, v9

    .line 30
    :goto_0
    const/16 v11, 0x30

    .line 31
    .line 32
    const/4 v12, 0x5

    .line 33
    const/16 v13, 0xa

    .line 34
    .line 35
    if-ge v9, v12, :cond_3

    .line 36
    .line 37
    if-ge v8, v7, :cond_3

    .line 38
    .line 39
    sget-object v12, Lxr7;->g:[[I

    .line 40
    .line 41
    invoke-static {v1, v0, v8, v12}, Lxr7;->h(Li90;[II[[I)I

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    rem-int/lit8 v14, v12, 0xa

    .line 46
    .line 47
    add-int/2addr v14, v11

    .line 48
    int-to-char v11, v14

    .line 49
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    array-length v11, v0

    .line 53
    move v14, v3

    .line 54
    :goto_1
    if-ge v14, v11, :cond_0

    .line 55
    .line 56
    aget v15, v0, v14

    .line 57
    .line 58
    add-int/2addr v8, v15

    .line 59
    add-int/lit8 v14, v14, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    if-lt v12, v13, :cond_1

    .line 63
    .line 64
    rsub-int/lit8 v11, v9, 0x4

    .line 65
    .line 66
    shl-int v11, v4, v11

    .line 67
    .line 68
    or-int/2addr v10, v11

    .line 69
    :cond_1
    const/4 v11, 0x4

    .line 70
    if-eq v9, v11, :cond_2

    .line 71
    .line 72
    invoke-virtual {v1, v8}, Li90;->b(I)I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    invoke-virtual {v1, v8}, Li90;->c(I)I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-ne v0, v12, :cond_13

    .line 88
    .line 89
    move v0, v3

    .line 90
    :goto_2
    if-ge v0, v13, :cond_12

    .line 91
    .line 92
    sget-object v1, Lwr7;->c:[I

    .line 93
    .line 94
    aget v1, v1, v0

    .line 95
    .line 96
    if-ne v10, v1, :cond_11

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    add-int/lit8 v9, v7, -0x2

    .line 107
    .line 108
    move v10, v3

    .line 109
    :goto_3
    if-ltz v9, :cond_4

    .line 110
    .line 111
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    sub-int/2addr v14, v11

    .line 116
    add-int/2addr v10, v14

    .line 117
    add-int/lit8 v9, v9, -0x2

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    mul-int/2addr v10, v6

    .line 121
    sub-int/2addr v7, v4

    .line 122
    :goto_4
    if-ltz v7, :cond_5

    .line 123
    .line 124
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    sub-int/2addr v9, v11

    .line 129
    add-int/2addr v10, v9

    .line 130
    add-int/lit8 v7, v7, -0x2

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    mul-int/2addr v10, v6

    .line 134
    rem-int/2addr v10, v13

    .line 135
    if-ne v10, v0, :cond_10

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    const/4 v2, 0x0

    .line 146
    if-eq v1, v12, :cond_6

    .line 147
    .line 148
    :goto_5
    move-object v5, v2

    .line 149
    goto/16 :goto_b

    .line 150
    .line 151
    :cond_6
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eq v1, v11, :cond_c

    .line 156
    .line 157
    const/16 v6, 0x35

    .line 158
    .line 159
    if-eq v1, v6, :cond_b

    .line 160
    .line 161
    const/16 v6, 0x39

    .line 162
    .line 163
    const-string v7, ""

    .line 164
    .line 165
    if-eq v1, v6, :cond_7

    .line 166
    .line 167
    goto :goto_8

    .line 168
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    const/4 v6, -0x1

    .line 173
    sparse-switch v1, :sswitch_data_0

    .line 174
    .line 175
    .line 176
    :goto_6
    move v5, v6

    .line 177
    goto :goto_7

    .line 178
    :sswitch_0
    const-string v1, "99991"

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-nez v1, :cond_a

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :sswitch_1
    const-string v1, "99990"

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_8

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_8
    move v5, v4

    .line 197
    goto :goto_7

    .line 198
    :sswitch_2
    const-string v1, "90000"

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-nez v1, :cond_9

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_9
    move v5, v3

    .line 208
    :cond_a
    :goto_7
    packed-switch v5, :pswitch_data_0

    .line 209
    .line 210
    .line 211
    goto :goto_8

    .line 212
    :pswitch_0
    const-string v1, "0.00"

    .line 213
    .line 214
    goto :goto_a

    .line 215
    :pswitch_1
    const-string v1, "Used"

    .line 216
    .line 217
    goto :goto_a

    .line 218
    :pswitch_2
    move-object v1, v2

    .line 219
    goto :goto_a

    .line 220
    :cond_b
    const-string v7, "$"

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_c
    const-string v7, "\u00a3"

    .line 224
    .line 225
    :goto_8
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    div-int/lit8 v5, v1, 0x64

    .line 234
    .line 235
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    rem-int/lit8 v1, v1, 0x64

    .line 240
    .line 241
    if-ge v1, v13, :cond_d

    .line 242
    .line 243
    const-string v6, "0"

    .line 244
    .line 245
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    goto :goto_9

    .line 254
    :cond_d
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    :goto_9
    new-instance v6, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    const/16 v5, 0x2e

    .line 270
    .line 271
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    :goto_a
    if-nez v1, :cond_e

    .line 282
    .line 283
    goto/16 :goto_5

    .line 284
    .line 285
    :cond_e
    new-instance v5, Ljava/util/EnumMap;

    .line 286
    .line 287
    const-class v6, Lq66;

    .line 288
    .line 289
    invoke-direct {v5, v6}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 290
    .line 291
    .line 292
    sget-object v6, Lq66;->A:Lq66;

    .line 293
    .line 294
    invoke-virtual {v5, v6, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    :goto_b
    new-instance v1, Ln66;

    .line 298
    .line 299
    new-instance v6, Lr66;

    .line 300
    .line 301
    aget v3, p3, v3

    .line 302
    .line 303
    aget v4, p3, v4

    .line 304
    .line 305
    add-int/2addr v3, v4

    .line 306
    int-to-float v3, v3

    .line 307
    const/high16 v4, 0x40000000    # 2.0f

    .line 308
    .line 309
    div-float/2addr v3, v4

    .line 310
    move/from16 v7, p1

    .line 311
    .line 312
    int-to-float v4, v7

    .line 313
    invoke-direct {v6, v3, v4}, Lr66;-><init>(FF)V

    .line 314
    .line 315
    .line 316
    new-instance v3, Lr66;

    .line 317
    .line 318
    int-to-float v7, v8

    .line 319
    invoke-direct {v3, v7, v4}, Lr66;-><init>(FF)V

    .line 320
    .line 321
    .line 322
    filled-new-array {v6, v3}, [Lr66;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    sget-object v4, Ld50;->M:Ld50;

    .line 327
    .line 328
    invoke-direct {v1, v0, v2, v3, v4}, Ln66;-><init>(Ljava/lang/String;[B[Lr66;Ld50;)V

    .line 329
    .line 330
    .line 331
    if-eqz v5, :cond_f

    .line 332
    .line 333
    invoke-virtual {v1, v5}, Ln66;->a(Ljava/util/Map;)V

    .line 334
    .line 335
    .line 336
    :cond_f
    return-object v1

    .line 337
    :cond_10
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 338
    .line 339
    throw v0

    .line 340
    :cond_11
    move/from16 v7, p1

    .line 341
    .line 342
    add-int/lit8 v0, v0, 0x1

    .line 343
    .line 344
    goto/16 :goto_2

    .line 345
    .line 346
    :cond_12
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 347
    .line 348
    throw v0

    .line 349
    :cond_13
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 350
    .line 351
    throw v0

    .line 352
    nop

    .line 353
    :sswitch_data_0
    .sparse-switch
        0x339c7b9 -> :sswitch_2
        0x33e01f0 -> :sswitch_1
        0x33e01f1 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
