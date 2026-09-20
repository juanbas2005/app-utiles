.class public final Le69;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final b:Le69;


# instance fields
.field public final a:Lv93;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le69;

    .line 2
    .line 3
    sget v1, Lv93;->B:I

    .line 4
    .line 5
    sget-object v1, Lp36;->D:Lp36;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Le69;-><init>(Lv93;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Le69;->b:Le69;

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
.end method

.method public constructor <init>(Lv93;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le69;->a:Lv93;

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

.method public static a(Lyk8;)Le69;
    .locals 21

    .line 1
    invoke-virtual/range {p0 .. p0}, Lyk8;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-ltz v0, :cond_9

    .line 7
    .line 8
    sget v2, Lv93;->B:I

    .line 9
    .line 10
    new-instance v2, Lu93;

    .line 11
    .line 12
    invoke-direct {v2}, Lu93;-><init>()V

    .line 13
    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    move-wide v6, v3

    .line 19
    :goto_0
    if-ge v5, v0, :cond_8

    .line 20
    .line 21
    invoke-virtual/range {p0 .. p0}, Lyk8;->H()J

    .line 22
    .line 23
    .line 24
    move-result-wide v8

    .line 25
    long-to-int v10, v8

    .line 26
    const/4 v11, 0x3

    .line 27
    ushr-long/2addr v8, v11

    .line 28
    cmp-long v12, v8, v3

    .line 29
    .line 30
    if-nez v12, :cond_0

    .line 31
    .line 32
    invoke-virtual/range {p0 .. p0}, Lyk8;->w()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    move-wide v14, v3

    .line 37
    move-object/from16 v16, v8

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    add-long/2addr v8, v6

    .line 41
    const-wide v12, 0x1fffffffffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmp-long v12, v8, v12

    .line 47
    .line 48
    if-gtz v12, :cond_7

    .line 49
    .line 50
    move-object/from16 v16, v1

    .line 51
    .line 52
    move-wide v14, v8

    .line 53
    :goto_1
    and-int/lit8 v8, v10, 0x7

    .line 54
    .line 55
    if-eqz v8, :cond_5

    .line 56
    .line 57
    const/4 v9, 0x1

    .line 58
    if-eq v8, v9, :cond_5

    .line 59
    .line 60
    const/4 v9, 0x2

    .line 61
    if-eq v8, v9, :cond_4

    .line 62
    .line 63
    if-eq v8, v11, :cond_3

    .line 64
    .line 65
    const/4 v9, 0x4

    .line 66
    if-eq v8, v9, :cond_2

    .line 67
    .line 68
    const/4 v9, 0x5

    .line 69
    if-ne v8, v9, :cond_1

    .line 70
    .line 71
    new-instance v13, Ld69;

    .line 72
    .line 73
    const-wide/16 v18, 0x0

    .line 74
    .line 75
    invoke-virtual/range {p0 .. p0}, Lyk8;->z()[B

    .line 76
    .line 77
    .line 78
    move-result-object v20

    .line 79
    move/from16 v17, v8

    .line 80
    .line 81
    invoke-direct/range {v13 .. v20}, Ld69;-><init>(JLjava/lang/String;IJLjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_1
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x17

    .line 96
    .line 97
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 98
    .line 99
    .line 100
    const-string v0, "Unrecognized flag type "

    .line 101
    .line 102
    invoke-static {v2, v0, v8}, Lhl6;->p(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Lzz8;->b(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_2
    new-instance v13, Ld69;

    .line 111
    .line 112
    const-wide/16 v18, 0x0

    .line 113
    .line 114
    invoke-virtual/range {p0 .. p0}, Lyk8;->w()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v20

    .line 118
    move/from16 v17, v8

    .line 119
    .line 120
    invoke-direct/range {v13 .. v20}, Ld69;-><init>(JLjava/lang/String;IJLjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    move/from16 v17, v8

    .line 125
    .line 126
    new-instance v13, Ld69;

    .line 127
    .line 128
    invoke-virtual/range {p0 .. p0}, Lyk8;->o()D

    .line 129
    .line 130
    .line 131
    move-result-wide v8

    .line 132
    invoke-static {v8, v9}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 133
    .line 134
    .line 135
    move-result-wide v18

    .line 136
    const/16 v20, 0x0

    .line 137
    .line 138
    invoke-direct/range {v13 .. v20}, Ld69;-><init>(JLjava/lang/String;IJLjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    move/from16 v17, v8

    .line 143
    .line 144
    new-instance v13, Ld69;

    .line 145
    .line 146
    invoke-virtual/range {p0 .. p0}, Lyk8;->H()J

    .line 147
    .line 148
    .line 149
    move-result-wide v18

    .line 150
    const/16 v20, 0x0

    .line 151
    .line 152
    invoke-direct/range {v13 .. v20}, Ld69;-><init>(JLjava/lang/String;IJLjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    move/from16 v17, v8

    .line 157
    .line 158
    new-instance v13, Ld69;

    .line 159
    .line 160
    const-wide/16 v18, 0x0

    .line 161
    .line 162
    const/16 v20, 0x0

    .line 163
    .line 164
    invoke-direct/range {v13 .. v20}, Ld69;-><init>(JLjava/lang/String;IJLjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :goto_2
    iget-wide v8, v13, Ld69;->w:J

    .line 168
    .line 169
    cmp-long v10, v8, v3

    .line 170
    .line 171
    if-eqz v10, :cond_6

    .line 172
    .line 173
    move-wide v6, v8

    .line 174
    :cond_6
    invoke-virtual {v2, v13}, Li93;->a(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    add-int/lit8 v5, v5, 0x1

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_7
    const-string v0, "Flag name larger than max size"

    .line 182
    .line 183
    invoke-static {v0}, Lzz8;->b(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    return-object v1

    .line 187
    :cond_8
    new-instance v0, Le69;

    .line 188
    .line 189
    invoke-virtual {v2}, Lu93;->e()Lp36;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-direct {v0, v1}, Le69;-><init>(Lv93;)V

    .line 194
    .line 195
    .line 196
    return-object v0

    .line 197
    :cond_9
    const-string v0, "Negative number of flags"

    .line 198
    .line 199
    invoke-static {v0}, Lzz8;->b(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    return-object v1
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
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Le69;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Le69;

    .line 6
    .line 7
    iget-object p1, p1, Le69;->a:Lv93;

    .line 8
    .line 9
    iget-object p0, p0, Le69;->a:Lv93;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ls93;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
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

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Le69;->a:Lv93;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lza5;->t(Ljava/util/Set;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
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
