.class public final Lfu7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final f:Lkl;


# instance fields
.field public final a:Lm38;

.field public b:J

.field public c:Lkl;

.field public d:Z

.field public e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkl;-><init>(F)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lfu7;->f:Lkl;

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

.method public constructor <init>(Lhl;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lwe;->v:Llo7;

    .line 5
    .line 6
    invoke-interface {p1, v0}, Lhl;->a(Llo7;)Lm38;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lfu7;->a:Lm38;

    .line 11
    .line 12
    const-wide/high16 v0, -0x8000000000000000L

    .line 13
    .line 14
    iput-wide v0, p0, Lfu7;->b:J

    .line 15
    .line 16
    sget-object p1, Lfu7;->f:Lkl;

    .line 17
    .line 18
    iput-object p1, p0, Lfu7;->c:Lkl;

    .line 19
    .line 20
    return-void
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


# virtual methods
.method public final a(Lg5;Lg20;Lh61;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, Leu7;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Leu7;

    .line 11
    .line 12
    iget v3, v2, Leu7;->E:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Leu7;->E:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Leu7;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Leu7;-><init>(Lfu7;Lh61;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Leu7;->C:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Leu7;->E:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    sget-object v5, Lfu7;->f:Lkl;

    .line 35
    .line 36
    const-wide/high16 v6, -0x8000000000000000L

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x2

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v11, 0x1

    .line 42
    sget-object v12, Lp81;->w:Lp81;

    .line 43
    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    if-eq v3, v11, :cond_2

    .line 47
    .line 48
    if-ne v3, v9, :cond_1

    .line 49
    .line 50
    iget-object v2, v2, Leu7;->z:Lds2;

    .line 51
    .line 52
    check-cast v2, Lsr2;

    .line 53
    .line 54
    :try_start_0
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_2
    iget v3, v2, Leu7;->B:F

    .line 69
    .line 70
    iget-object v13, v2, Leu7;->A:Lsr2;

    .line 71
    .line 72
    iget-object v14, v2, Leu7;->z:Lds2;

    .line 73
    .line 74
    check-cast v14, Lvr2;

    .line 75
    .line 76
    :try_start_1
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    .line 79
    move v0, v3

    .line 80
    move-object v3, v2

    .line 81
    move-object v2, v13

    .line 82
    move v13, v0

    .line 83
    move-object v0, v14

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-boolean v0, v1, Lfu7;->d:Z

    .line 89
    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    const-string v0, "animateToZero called while previous animation is running"

    .line 93
    .line 94
    invoke-static {v0}, Lbc3;->c(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    iget-object v0, v2, Lh61;->x:Le81;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    sget-object v3, Lxb4;->U:Lxb4;

    .line 103
    .line 104
    invoke-interface {v0, v3}, Le81;->a0(Ld81;)Lc81;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Llm4;

    .line 109
    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    invoke-interface {v0}, Llm4;->M()F

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    goto :goto_1

    .line 117
    :cond_5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 118
    .line 119
    :goto_1
    iput-boolean v11, v1, Lfu7;->d:Z

    .line 120
    .line 121
    move v13, v0

    .line 122
    move-object v3, v2

    .line 123
    move-object/from16 v0, p1

    .line 124
    .line 125
    move-object/from16 v2, p2

    .line 126
    .line 127
    :cond_6
    :try_start_2
    iget v14, v1, Lfu7;->e:F

    .line 128
    .line 129
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    const v15, 0x3c23d70a    # 0.01f

    .line 134
    .line 135
    .line 136
    cmpg-float v14, v14, v15

    .line 137
    .line 138
    if-gez v14, :cond_7

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_7
    new-instance v14, Ljf;

    .line 142
    .line 143
    invoke-direct {v14, v1, v13, v0}, Ljf;-><init>(Lfu7;FLvr2;)V

    .line 144
    .line 145
    .line 146
    iput-object v0, v3, Leu7;->z:Lds2;

    .line 147
    .line 148
    iput-object v2, v3, Leu7;->A:Lsr2;

    .line 149
    .line 150
    iput v13, v3, Leu7;->B:F

    .line 151
    .line 152
    iput v11, v3, Leu7;->E:I

    .line 153
    .line 154
    iget-object v15, v3, Lh61;->x:Le81;

    .line 155
    .line 156
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v15}, Lpd8;->s(Le81;)Lgj;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    invoke-virtual {v15, v14, v3}, Lgj;->a(Lvr2;Lf61;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    if-ne v14, v12, :cond_8

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_8
    :goto_2
    invoke-interface {v2}, Lsr2;->b()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    cmpg-float v14, v13, v8

    .line 174
    .line 175
    if-nez v14, :cond_6

    .line 176
    .line 177
    :goto_3
    iget v11, v1, Lfu7;->e:F

    .line 178
    .line 179
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    cmpg-float v8, v11, v8

    .line 184
    .line 185
    if-nez v8, :cond_9

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_9
    new-instance v8, Lk77;

    .line 189
    .line 190
    const/16 v11, 0xf

    .line 191
    .line 192
    invoke-direct {v8, v11, v1, v0}, Lk77;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    iput-object v2, v3, Leu7;->z:Lds2;

    .line 196
    .line 197
    iput-object v4, v3, Leu7;->A:Lsr2;

    .line 198
    .line 199
    iput v9, v3, Leu7;->E:I

    .line 200
    .line 201
    iget-object v0, v3, Lh61;->x:Le81;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-static {v0}, Lpd8;->s(Le81;)Lgj;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0, v8, v3}, Lgj;->a(Lvr2;Lf61;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne v0, v12, :cond_a

    .line 215
    .line 216
    :goto_4
    return-object v12

    .line 217
    :cond_a
    :goto_5
    invoke-interface {v2}, Lsr2;->b()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 218
    .line 219
    .line 220
    :goto_6
    iput-wide v6, v1, Lfu7;->b:J

    .line 221
    .line 222
    iput-object v5, v1, Lfu7;->c:Lkl;

    .line 223
    .line 224
    iput-boolean v10, v1, Lfu7;->d:Z

    .line 225
    .line 226
    sget-object v0, Lvs7;->a:Lvs7;

    .line 227
    .line 228
    return-object v0

    .line 229
    :goto_7
    iput-wide v6, v1, Lfu7;->b:J

    .line 230
    .line 231
    iput-object v5, v1, Lfu7;->c:Lkl;

    .line 232
    .line 233
    iput-boolean v10, v1, Lfu7;->d:Z

    .line 234
    .line 235
    throw v0
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
.end method
